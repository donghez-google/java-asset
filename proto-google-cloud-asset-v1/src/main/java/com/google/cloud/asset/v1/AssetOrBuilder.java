/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public interface AssetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The last update timestamp of an asset. update_time is updated when
   * create/update/delete operation is performed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update timestamp of an asset. update_time is updated when
   * create/update/delete operation is performed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update timestamp of an asset. update_time is updated when
   * create/update/delete operation is performed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`
   * See [Resource
   * names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full name of the asset. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`
   * See [Resource
   * names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Disk`
   * See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types)
   * for more information.
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   *
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Disk`
   * See [Supported asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types)
   * for more information.
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   *
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString getAssetTypeBytes();

  /**
   *
   *
   * <pre>
   * A representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.Resource resource = 3;</code>
   *
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   *
   *
   * <pre>
   * A representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.Resource resource = 3;</code>
   *
   * @return The resource.
   */
  com.google.cloud.asset.v1.Resource getResource();
  /**
   *
   *
   * <pre>
   * A representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.Resource resource = 3;</code>
   */
  com.google.cloud.asset.v1.ResourceOrBuilder getResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * A representation of the Cloud IAM policy set on a Google Cloud resource.
   * There can be a maximum of one Cloud IAM policy set on any given resource.
   * In addition, Cloud IAM policies inherit their granted access scope from any
   * policies set on parent resources in the resource hierarchy. Therefore, the
   * effectively policy is the union of both the policy set on this resource
   * and each policy set on all of the resource's ancestry resource levels in
   * the hierarchy. See
   * [this topic](https://cloud.google.com/iam/docs/policies#inheritance) for
   * more information.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   *
   * @return Whether the iamPolicy field is set.
   */
  boolean hasIamPolicy();
  /**
   *
   *
   * <pre>
   * A representation of the Cloud IAM policy set on a Google Cloud resource.
   * There can be a maximum of one Cloud IAM policy set on any given resource.
   * In addition, Cloud IAM policies inherit their granted access scope from any
   * policies set on parent resources in the resource hierarchy. Therefore, the
   * effectively policy is the union of both the policy set on this resource
   * and each policy set on all of the resource's ancestry resource levels in
   * the hierarchy. See
   * [this topic](https://cloud.google.com/iam/docs/policies#inheritance) for
   * more information.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   *
   * @return The iamPolicy.
   */
  com.google.iam.v1.Policy getIamPolicy();
  /**
   *
   *
   * <pre>
   * A representation of the Cloud IAM policy set on a Google Cloud resource.
   * There can be a maximum of one Cloud IAM policy set on any given resource.
   * In addition, Cloud IAM policies inherit their granted access scope from any
   * policies set on parent resources in the resource hierarchy. Therefore, the
   * effectively policy is the union of both the policy set on this resource
   * and each policy set on all of the resource's ancestry resource levels in
   * the hierarchy. See
   * [this topic](https://cloud.google.com/iam/docs/policies#inheritance) for
   * more information.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getIamPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * A representation of an [organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/overview#organization_policy).
   * There can be more than one organization policy with different constraints
   * set on a given resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v1.Policy org_policy = 6;</code>
   */
  java.util.List<com.google.cloud.orgpolicy.v1.Policy> getOrgPolicyList();
  /**
   *
   *
   * <pre>
   * A representation of an [organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/overview#organization_policy).
   * There can be more than one organization policy with different constraints
   * set on a given resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v1.Policy org_policy = 6;</code>
   */
  com.google.cloud.orgpolicy.v1.Policy getOrgPolicy(int index);
  /**
   *
   *
   * <pre>
   * A representation of an [organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/overview#organization_policy).
   * There can be more than one organization policy with different constraints
   * set on a given resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v1.Policy org_policy = 6;</code>
   */
  int getOrgPolicyCount();
  /**
   *
   *
   * <pre>
   * A representation of an [organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/overview#organization_policy).
   * There can be more than one organization policy with different constraints
   * set on a given resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v1.Policy org_policy = 6;</code>
   */
  java.util.List<? extends com.google.cloud.orgpolicy.v1.PolicyOrBuilder>
      getOrgPolicyOrBuilderList();
  /**
   *
   *
   * <pre>
   * A representation of an [organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/overview#organization_policy).
   * There can be more than one organization policy with different constraints
   * set on a given resource.
   * </pre>
   *
   * <code>repeated .google.cloud.orgpolicy.v1.Policy org_policy = 6;</code>
   */
  com.google.cloud.orgpolicy.v1.PolicyOrBuilder getOrgPolicyOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Please also refer to the [access policy user
   * guide](https://cloud.google.com/access-context-manager/docs/overview#access-policies).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.AccessPolicy access_policy = 7;</code>
   *
   * @return Whether the accessPolicy field is set.
   */
  boolean hasAccessPolicy();
  /**
   *
   *
   * <pre>
   * Please also refer to the [access policy user
   * guide](https://cloud.google.com/access-context-manager/docs/overview#access-policies).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.AccessPolicy access_policy = 7;</code>
   *
   * @return The accessPolicy.
   */
  com.google.identity.accesscontextmanager.v1.AccessPolicy getAccessPolicy();
  /**
   *
   *
   * <pre>
   * Please also refer to the [access policy user
   * guide](https://cloud.google.com/access-context-manager/docs/overview#access-policies).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.AccessPolicy access_policy = 7;</code>
   */
  com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder getAccessPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Please also refer to the [access level user
   * guide](https://cloud.google.com/access-context-manager/docs/overview#access-levels).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.AccessLevel access_level = 8;</code>
   *
   * @return Whether the accessLevel field is set.
   */
  boolean hasAccessLevel();
  /**
   *
   *
   * <pre>
   * Please also refer to the [access level user
   * guide](https://cloud.google.com/access-context-manager/docs/overview#access-levels).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.AccessLevel access_level = 8;</code>
   *
   * @return The accessLevel.
   */
  com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevel();
  /**
   *
   *
   * <pre>
   * Please also refer to the [access level user
   * guide](https://cloud.google.com/access-context-manager/docs/overview#access-levels).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.AccessLevel access_level = 8;</code>
   */
  com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder getAccessLevelOrBuilder();

  /**
   *
   *
   * <pre>
   * Please also refer to the [service perimeter user
   * guide](https://cloud.google.com/vpc-service-controls/docs/overview).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 9;</code>
   *
   * @return Whether the servicePerimeter field is set.
   */
  boolean hasServicePerimeter();
  /**
   *
   *
   * <pre>
   * Please also refer to the [service perimeter user
   * guide](https://cloud.google.com/vpc-service-controls/docs/overview).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 9;</code>
   *
   * @return The servicePerimeter.
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeter getServicePerimeter();
  /**
   *
   *
   * <pre>
   * Please also refer to the [service perimeter user
   * guide](https://cloud.google.com/vpc-service-controls/docs/overview).
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.ServicePerimeter service_perimeter = 9;</code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterOrBuilder
      getServicePerimeterOrBuilder();

  /**
   *
   *
   * <pre>
   * The ancestry path of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root. If the asset
   * is a project, folder, or organization, the ancestry path starts from the
   * asset itself.
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 10;</code>
   *
   * @return A list containing the ancestors.
   */
  java.util.List<java.lang.String> getAncestorsList();
  /**
   *
   *
   * <pre>
   * The ancestry path of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root. If the asset
   * is a project, folder, or organization, the ancestry path starts from the
   * asset itself.
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 10;</code>
   *
   * @return The count of ancestors.
   */
  int getAncestorsCount();
  /**
   *
   *
   * <pre>
   * The ancestry path of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root. If the asset
   * is a project, folder, or organization, the ancestry path starts from the
   * asset itself.
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 10;</code>
   *
   * @param index The index of the element to return.
   * @return The ancestors at the given index.
   */
  java.lang.String getAncestors(int index);
  /**
   *
   *
   * <pre>
   * The ancestry path of an asset in Google Cloud [resource
   * hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy),
   * represented as a list of relative resource names. An ancestry path starts
   * with the closest ancestor in the hierarchy and ends at root. If the asset
   * is a project, folder, or organization, the ancestry path starts from the
   * asset itself.
   * Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
   * </pre>
   *
   * <code>repeated string ancestors = 10;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ancestors at the given index.
   */
  com.google.protobuf.ByteString getAncestorsBytes(int index);

  public com.google.cloud.asset.v1.Asset.AccessContextPolicyCase getAccessContextPolicyCase();
}
