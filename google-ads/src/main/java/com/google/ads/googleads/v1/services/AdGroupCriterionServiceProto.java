// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/ad_group_criterion_service.proto

package com.google.ads.googleads.v1.services;

public final class AdGroupCriterionServiceProto {
  private AdGroupCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_AdGroupCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_AdGroupCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v1/services/ad_gr" +
      "oup_criterion_service.proto\022 google.ads." +
      "googleads.v1.services\032+google/ads/google" +
      "ads/v1/common/policy.proto\032:google/ads/g" +
      "oogleads/v1/resources/ad_group_criterion" +
      ".proto\032\034google/api/annotations.proto\032 go" +
      "ogle/protobuf/field_mask.proto\032\036google/p" +
      "rotobuf/wrappers.proto\032\027google/rpc/statu" +
      "s.proto\032\027google/api/client.proto\"3\n\032GetA" +
      "dGroupCriterionRequest\022\025\n\rresource_name\030" +
      "\001 \001(\t\"\264\001\n\034MutateAdGroupCriteriaRequest\022\023" +
      "\n\013customer_id\030\001 \001(\t\022O\n\noperations\030\002 \003(\0132" +
      ";.google.ads.googleads.v1.services.AdGro" +
      "upCriterionOperation\022\027\n\017partial_failure\030" +
      "\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\323\002\n\031AdGroup" +
      "CriterionOperation\022/\n\013update_mask\030\004 \001(\0132" +
      "\032.google.protobuf.FieldMask\022X\n\034exempt_po" +
      "licy_violation_keys\030\005 \003(\01322.google.ads.g" +
      "oogleads.v1.common.PolicyViolationKey\022E\n" +
      "\006create\030\001 \001(\01323.google.ads.googleads.v1." +
      "resources.AdGroupCriterionH\000\022E\n\006update\030\002" +
      " \001(\01323.google.ads.googleads.v1.resources" +
      ".AdGroupCriterionH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n" +
      "\toperation\"\243\001\n\035MutateAdGroupCriteriaResp" +
      "onse\0221\n\025partial_failure_error\030\003 \001(\0132\022.go" +
      "ogle.rpc.Status\022O\n\007results\030\002 \003(\0132>.googl" +
      "e.ads.googleads.v1.services.MutateAdGrou" +
      "pCriterionResult\"5\n\034MutateAdGroupCriteri" +
      "onResult\022\025\n\rresource_name\030\001 \001(\t2\330\003\n\027AdGr" +
      "oupCriterionService\022\303\001\n\023GetAdGroupCriter" +
      "ion\022<.google.ads.googleads.v1.services.G" +
      "etAdGroupCriterionRequest\0323.google.ads.g" +
      "oogleads.v1.resources.AdGroupCriterion\"9" +
      "\202\323\344\223\0023\0221/v1/{resource_name=customers/*/a" +
      "dGroupCriteria/*}\022\331\001\n\025MutateAdGroupCrite" +
      "ria\022>.google.ads.googleads.v1.services.M" +
      "utateAdGroupCriteriaRequest\032?.google.ads" +
      ".googleads.v1.services.MutateAdGroupCrit" +
      "eriaResponse\"?\202\323\344\223\0029\"4/v1/customers/{cus" +
      "tomer_id=*}/adGroupCriteria:mutate:\001*\032\033\312" +
      "A\030googleads.googleapis.comB\203\002\n$com.googl" +
      "e.ads.googleads.v1.servicesB\034AdGroupCrit" +
      "erionServiceProtoP\001ZHgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v1/serv" +
      "ices;services\242\002\003GAA\252\002 Google.Ads.GoogleA" +
      "ds.V1.Services\312\002 Google\\Ads\\GoogleAds\\V1" +
      "\\Services\352\002$Google::Ads::GoogleAds::V1::" +
      "Servicesb\006proto3"
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
          com.google.ads.googleads.v1.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v1.resources.AdGroupCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_AdGroupCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_AdGroupCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_AdGroupCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "ExemptPolicyViolationKeys", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAdGroupCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v1.resources.AdGroupCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
