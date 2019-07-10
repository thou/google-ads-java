// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v2.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v2.enums.AdCustomizerPlaceholderFieldEnum.AdCustomizerPlaceholderField;
import com.google.ads.googleads.v2.enums.FeedAttributeTypeEnum.FeedAttributeType;
import com.google.ads.googleads.v2.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.resources.Ad;
import com.google.ads.googleads.v2.resources.AdGroupAd;
import com.google.ads.googleads.v2.resources.AttributeFieldMapping;
import com.google.ads.googleads.v2.resources.Feed;
import com.google.ads.googleads.v2.resources.FeedAttribute;
import com.google.ads.googleads.v2.resources.FeedItem;
import com.google.ads.googleads.v2.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v2.resources.FeedItemTarget;
import com.google.ads.googleads.v2.resources.FeedMapping;
import com.google.ads.googleads.v2.services.AdGroupAdOperation;
import com.google.ads.googleads.v2.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v2.services.FeedItemOperation;
import com.google.ads.googleads.v2.services.FeedItemServiceClient;
import com.google.ads.googleads.v2.services.FeedItemTargetOperation;
import com.google.ads.googleads.v2.services.FeedItemTargetServiceClient;
import com.google.ads.googleads.v2.services.FeedMappingOperation;
import com.google.ads.googleads.v2.services.FeedMappingServiceClient;
import com.google.ads.googleads.v2.services.FeedOperation;
import com.google.ads.googleads.v2.services.FeedServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v2.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v2.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v2.services.MutateFeedItemResult;
import com.google.ads.googleads.v2.services.MutateFeedItemTargetsResponse;
import com.google.ads.googleads.v2.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v2.services.MutateFeedMappingsResponse;
import com.google.ads.googleads.v2.services.MutateFeedsResponse;
import com.google.ads.googleads.v2.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v2.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/** Adds an ad customizer feed and associates it with the customer. Then it adds an ad
 * that uses the feed to populate dynamic data. */
public class AddAdCustomizer {

  /** We're doing only searches by resource_name in this example, we can set page size = 1. */
  private static final int PAGE_SIZE = 1;

  private static class AddAdCustomizerParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private List<Long> adGroupIds;

    @Parameter(names = ArgumentNames.FEED_NAME, required = true)
    private String feedName;
  }

  public static void main(String[] args) throws IOException {
    AddAdCustomizerParams params = new AddAdCustomizerParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupIds = Arrays.asList(
          Long.parseLong("INSERT_AD_GROUP_ID_HERE"),
          Long.parseLong("INSERT_AD_GROUP_ID_HERE"));
      params.feedName = "INSERT_FEED_NAME_HERE";
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddAdCustomizer().runExample(
          googleAdsClient, params.customerId, params.adGroupIds, params.feedName);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupIds the ad group IDs.
   * @param feedName the name of the feed to create.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, List<Long> adGroupIds, String feedName) {

    // Makes sure the feed name is not duplicated.
    feedName = feedName + System.currentTimeMillis();

    String adCustomizerFeedResourceName =
        createAdCustomizerFeed(googleAdsClient, customerId, feedName);

    Map<String, FeedAttribute> adCustomizerFeedAttributes = getFeedAttributes(
        googleAdsClient, customerId, adCustomizerFeedResourceName);

    createAdCustomizerMapping(
        googleAdsClient, customerId, adCustomizerFeedResourceName, adCustomizerFeedAttributes);

    List<String> feedItemResourceNames = createFeedItems(
        googleAdsClient, customerId, adCustomizerFeedResourceName, adCustomizerFeedAttributes);

    createFeedItemTargets(googleAdsClient, customerId, adGroupIds, feedItemResourceNames);

    createAdsWithCustomizations(googleAdsClient, customerId, adGroupIds, feedName);
  }

  /**
   * Creates a feed to be used for ad customization.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedName the name of the feed to create.
   * @return the resource name of the newly created feed.
   */
  private String createAdCustomizerFeed(GoogleAdsClient googleAdsClient, long customerId,
      String feedName) {

    // Creates three feed attributes: a name, a price and a date.
    FeedAttribute nameAttribute =
        FeedAttribute.newBuilder()
            .setName(StringValue.of("Name"))
            .setType(FeedAttributeType.STRING)
        .build();

    FeedAttribute priceAttribute =
        FeedAttribute.newBuilder()
            .setName(StringValue.of("Price"))
            .setType(FeedAttributeType.STRING)
        .build();

    FeedAttribute dateAttribute =
        FeedAttribute.newBuilder()
            .setName(StringValue.of("Date"))
            .setType(FeedAttributeType.DATE_TIME)
        .build();

    Feed adCustomizerFeed =
        Feed.newBuilder()
            .setName(StringValue.of(feedName))
            .addAttributes(nameAttribute)
            .addAttributes(priceAttribute)
            .addAttributes(dateAttribute)
        .build();

    FeedOperation feedOperation =
        FeedOperation.newBuilder()
            .setCreate(adCustomizerFeed)
        .build();

    try (FeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {

      MutateFeedsResponse response =
          feedServiceClient.mutateFeeds(Long.toString(customerId), ImmutableList.of(feedOperation));

      String feedResourceName = response.getResults(0).getResourceName();
      System.out.printf("Added feed with resource name %s.%n", feedResourceName);
      return feedResourceName;
    }
  }

  /**
   * Retrieves all the attributes for a feed and returns them in a map using the attribute names as
   * keys.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedResourceName the resource name of the feed.
   * @return the attributes of the feed.
   */
  private Map<String, FeedAttribute> getFeedAttributes(
      GoogleAdsClient googleAdsClient, long customerId, String feedResourceName) {
    String query = String.format(
        "SELECT feed.attributes, feed.name from feed where feed.resource_name = '%s'",
        feedResourceName);

    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(Long.toString(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(query)
            .build();

    Map<String, FeedAttribute> feedAttributes = new HashMap<>();
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);

      Feed feed = searchPagedResponse.iterateAll().iterator().next().getFeed();

      System.out.printf(
          "Found the following attributes for feed with name %s:%n",
          feed.getName().getValue());
      for(FeedAttribute feedAttribute : feed.getAttributesList()) {
        System.out.printf(
            "\t\"%s\" with id %d and type %s%n",
            feedAttribute.getName().getValue(),
            feedAttribute.getId().getValue(),
            feedAttribute.getType());
        feedAttributes.put(feedAttribute.getName().getValue(), feedAttribute);
      }
    }
    return feedAttributes;
  }

  /**
   * Creates a feed mapping to set the feed as an ad customizer feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedResourceName the resource name of the feed.
   * @param feedAttributes the attributes of the feed.
   */
  private void createAdCustomizerMapping(
      GoogleAdsClient googleAdsClient, long customerId, String feedResourceName,
      Map<String, FeedAttribute> feedAttributes) {

    // Map the feed attributes to ad customizer placeholder fields.
    AttributeFieldMapping nameFieldMapping = AttributeFieldMapping.newBuilder()
        .setFeedAttributeId(feedAttributes.get("Name").getId())
        .setAdCustomizerField(AdCustomizerPlaceholderField.STRING)
        .build();

    AttributeFieldMapping priceFieldMapping = AttributeFieldMapping.newBuilder()
        .setFeedAttributeId(feedAttributes.get("Price").getId())
        .setAdCustomizerField(AdCustomizerPlaceholderField.PRICE)
        .build();

    AttributeFieldMapping dateFieldMapping = AttributeFieldMapping.newBuilder()
        .setFeedAttributeId(feedAttributes.get("Date").getId())
        .setAdCustomizerField(AdCustomizerPlaceholderField.DATE)
        .build();

    FeedMapping feedMapping = FeedMapping.newBuilder()
        .setFeed(StringValue.of(feedResourceName))
        // Map the feed to the AD_CUSTOMIZER placeholder type
        .setPlaceholderType(PlaceholderType.AD_CUSTOMIZER)
        .addAttributeFieldMappings(nameFieldMapping)
        .addAttributeFieldMappings(priceFieldMapping)
        .addAttributeFieldMappings(dateFieldMapping)
        .build();

    FeedMappingOperation feedMappingOperation = FeedMappingOperation.newBuilder()
        .setCreate(feedMapping)
        .build();

    try (FeedMappingServiceClient feedMappingServiceClient =
        googleAdsClient.getLatestVersion().createFeedMappingServiceClient()) {

      MutateFeedMappingsResponse response = feedMappingServiceClient.mutateFeedMappings(
          Long.toString(customerId), ImmutableList.of(feedMappingOperation));

      String feedMappingResourceName = response.getResults(0).getResourceName();

      System.out.printf("Added feed mapping with resource name %s.%n", feedMappingResourceName);
    }
  }

  /**
   * Creates two different feed items to enable two different ad customizations.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedResourceName the resource name of the feed.
   * @param feedAttributes the attributes of the feed.
   * @return the resource names of the feed items.
   */
  private List<String> createFeedItems(
      GoogleAdsClient googleAdsClient, long customerId, String feedResourceName,
      Map<String, FeedAttribute> feedAttributes) {

    List<FeedItemOperation> feedItemOperations = new ArrayList<>();

    DateTime marsDate = DateTime.now().withDayOfMonth(1).withHourOfDay(0).withMinuteOfHour(0);
    feedItemOperations.add(
        createFeedItemOperation(
            "Mars", "$1234.56", marsDate.toString("yyyyMMdd HHmmss"),
            feedResourceName, feedAttributes));

    DateTime venusDate = DateTime.now().withDayOfMonth(15).withHourOfDay(0).withMinuteOfHour(0);
    feedItemOperations.add(
        createFeedItemOperation(
            "Venus", "$1450.00", venusDate.toString("yyyyMMdd HHmmss"),
            feedResourceName, feedAttributes));

    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {

      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(
              Long.toString(customerId), feedItemOperations);

      List<String> feedItemResourceNames = new ArrayList<>();
      System.out.printf("Added %d feed items:%n", response.getResultsCount());

      for(MutateFeedItemResult result : response.getResultsList()) {
        String feedItemResourceName = result.getResourceName();
        feedItemResourceNames.add(feedItemResourceName);
        System.out.println(feedItemResourceName);
      }
      return feedItemResourceNames;
    }
  }

  /**
   * Helper function to create a FeedItemOperation.
   *
   * @param name the value of the Name attribute.
   * @param price the value of the Price attribute.
   * @param date the value of the Date attribute.
   * @param feedResourceName the resource name of the feed.
   * @param feedAttributes the attributes to be set on the feed.
   * @return a FeedItemOperation to create a feed item.
   */
  private FeedItemOperation createFeedItemOperation(
      String name, String price, String date, String feedResourceName,
      Map<String, FeedAttribute> feedAttributes) {
    FeedItemAttributeValue nameAttributeValue = FeedItemAttributeValue.newBuilder()
        .setFeedAttributeId(feedAttributes.get("Name").getId())
        .setStringValue(StringValue.of(name))
        .build();

    FeedItemAttributeValue priceAttributeValue = FeedItemAttributeValue.newBuilder()
        .setFeedAttributeId(feedAttributes.get("Price").getId())
        .setStringValue(StringValue.of(price))
        .build();


    FeedItemAttributeValue dateAttributeValue = FeedItemAttributeValue.newBuilder()
        .setFeedAttributeId(feedAttributes.get("Date").getId())
        .setStringValue(StringValue.of(date))
        .build();

    FeedItem feedItem = FeedItem.newBuilder()
        .setFeed(StringValue.of(feedResourceName))
        .addAttributeValues(nameAttributeValue)
        .addAttributeValues(priceAttributeValue)
        .addAttributeValues(dateAttributeValue)
        .build();

    return FeedItemOperation.newBuilder()
        .setCreate(feedItem)
        .build();
  }

  /**
   * Restricts the feed items to work only with a specific ad group; this prevents the feed items
   * from being used elsewhere and makes sure they are used only for customizing a specific
   * ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupIds the ad group IDs to bind the feed items to.
   * @param feedItemResourceNames the resource names of the feed items.
   */
  private void createFeedItemTargets(
      GoogleAdsClient googleAdsClient, long customerId, List<Long> adGroupIds,
      List<String> feedItemResourceNames) {

    for(int i = 0; i < adGroupIds.size(); i++) {
      Long adGroupId = adGroupIds.get(i);
      String feedItemResourceName = feedItemResourceNames.get(i);

      FeedItemTarget feedItemTarget = FeedItemTarget.newBuilder()
          .setAdGroup(StringValue.of(ResourceNames.adGroup(customerId, adGroupId)))
          .setFeedItem(StringValue.of(feedItemResourceName))
          .build();

      FeedItemTargetOperation feedItemTargetOperation = FeedItemTargetOperation.newBuilder()
          .setCreate(feedItemTarget)
          .build();

      try (FeedItemTargetServiceClient feedItemTargetServiceClient =
          googleAdsClient.getLatestVersion().createFeedItemTargetServiceClient()) {

        MutateFeedItemTargetsResponse response =
            feedItemTargetServiceClient.mutateFeedItemTargets(
                Long.toString(customerId), ImmutableList.of(feedItemTargetOperation));

        String feedItemTargetResourceName = response.getResults(0).getResourceName();
        System.out.printf(
            "Added feed item target with resource name %s.%n", feedItemTargetResourceName);
      }
    }
  }

  /**
   * Creates expanded text ads that use the ad customizer feed to populate the placeholders.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupIds the ad group IDs to bind the feed items to.
   * @param feedName the name of the feed.
   */
  private void createAdsWithCustomizations(
      GoogleAdsClient googleAdsClient, long customerId, List<Long> adGroupIds, String feedName) {

    // Creates an expanded text ad using the feed attribute names as placeholders.
    ExpandedTextAdInfo expandedTextAdInfo = ExpandedTextAdInfo.newBuilder()
        .setHeadlinePart1(StringValue.of(String.format("Luxury cruise to {=%s.Name}", feedName)))
        .setHeadlinePart2(StringValue.of(String.format("Only {=%s.Price}", feedName)))
        .setDescription(StringValue.of(String.format(
            "Offer ends in {=countdown(%s.Date)}!", feedName)))
        .build();

    Ad ad = Ad.newBuilder()
        .setExpandedTextAd(expandedTextAdInfo)
        .addFinalUrls(StringValue.of("http://www.example.com"))
        .build();

    List<AdGroupAdOperation> adGroupAdOperations = new ArrayList<>();

    // Creates the same ad in both ad groups. When they serve, they will show different values,
    // since they match different feed items.
    for(Long adGroupId : adGroupIds) {
      AdGroupAd adGroupAd = AdGroupAd.newBuilder()
          .setAd(ad)
          .setAdGroup(StringValue.of(ResourceNames.adGroup(customerId, adGroupId)))
          .build();

      AdGroupAdOperation adGroupAdOperation = AdGroupAdOperation.newBuilder()
          .setCreate(adGroupAd)
          .build();

      adGroupAdOperations.add(adGroupAdOperation);
    }

    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {

      MutateAdGroupAdsResponse response = adGroupAdServiceClient.mutateAdGroupAds(
          Long.toString(customerId), adGroupAdOperations);

      System.out.printf("Added %d ads:%n", response.getResultsCount());
      for(MutateAdGroupAdResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }



  }
}
