// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/shared_criterion.proto

package com.google.ads.googleads.v0.resources;

public final class SharedCriterionProto {
  private SharedCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_SharedCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_SharedCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v0/resources/shar" +
      "ed_criterion.proto\022!google.ads.googleads" +
      ".v0.resources\032-google/ads/googleads/v0/c" +
      "ommon/criteria.proto\0322google/ads/googlea" +
      "ds/v0/enums/criterion_type.proto\032\036google" +
      "/protobuf/wrappers.proto\"\250\002\n\017SharedCrite" +
      "rion\022\025\n\rresource_name\030\001 \001(\t\0220\n\nshared_se" +
      "t\030\002 \001(\0132\034.google.protobuf.StringValue\0221\n" +
      "\014criterion_id\030\032 \001(\0132\033.google.protobuf.In" +
      "t64Value\022L\n\004type\030\004 \001(\0162>.google.ads.goog" +
      "leads.v0.enums.CriterionTypeEnum.Criteri" +
      "onType\022>\n\007keyword\030\003 \001(\0132+.google.ads.goo" +
      "gleads.v0.common.KeywordInfoH\000B\013\n\tcriter" +
      "ionB\331\001\n%com.google.ads.googleads.v0.reso" +
      "urcesB\024SharedCriterionProtoP\001ZJgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v0/resources;resources\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V0.Resources\312\002!Google\\Ads" +
      "\\GoogleAds\\V0\\Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_SharedCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_SharedCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_SharedCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "SharedSet", "CriterionId", "Type", "Keyword", "Criterion", });
    com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}