// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/customer_feed_error.proto

package com.google.ads.googleads.v0.errors;

public final class CustomerFeedErrorProto {
  private CustomerFeedErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_CustomerFeedErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_CustomerFeedErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v0/errors/custome" +
      "r_feed_error.proto\022\036google.ads.googleads" +
      ".v0.errors\"\367\002\n\025CustomerFeedErrorEnum\"\335\002\n" +
      "\021CustomerFeedError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007U" +
      "NKNOWN\020\001\022,\n(FEED_ALREADY_EXISTS_FOR_PLAC" +
      "EHOLDER_TYPE\020\002\022\"\n\036CANNOT_CREATE_FOR_REMO" +
      "VED_FEED\020\003\0220\n,CANNOT_CREATE_ALREADY_EXIS" +
      "TING_CUSTOMER_FEED\020\004\022\'\n#CANNOT_MODIFY_RE" +
      "MOVED_CUSTOMER_FEED\020\005\022\034\n\030INVALID_PLACEHO" +
      "LDER_TYPE\020\006\022,\n(MISSING_FEEDMAPPING_FOR_P" +
      "LACEHOLDER_TYPE\020\007\0221\n-PLACEHOLDER_TYPE_NO" +
      "T_ALLOWED_ON_CUSTOMER_FEED\020\010B\314\001\n\"com.goo" +
      "gle.ads.googleads.v0.errorsB\026CustomerFee" +
      "dErrorProtoP\001ZDgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v0/errors;err" +
      "ors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V0.Erro" +
      "rs\312\002\036Google\\Ads\\GoogleAds\\V0\\Errorsb\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_CustomerFeedErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_CustomerFeedErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_CustomerFeedErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}