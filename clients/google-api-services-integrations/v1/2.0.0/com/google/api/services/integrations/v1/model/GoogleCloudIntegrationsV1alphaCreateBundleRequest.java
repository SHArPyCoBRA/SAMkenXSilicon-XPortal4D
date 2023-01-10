/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.integrations.v1.model;

/**
 * PROTECT WITH A VISIBILITY LABEL. THIS METHOD WILL BE MOVED TO A SEPARATE SERVICE. Request to
 * create a new Bundle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaCreateBundleRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. name of the bundle that will be created
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bundleId;

  /**
   * A list of integrations that can be executed by the bundle
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> integrations;

  /**
   * Optional. The prefix for the SA, it should be in the format "o". This is an optional field, and
   * if empty service account will be created per project, where we are creating bundle. This should
   * only be used as the org ID for which we want to run the integrations in the bundle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryCustomerOrgId;

  /**
   * Required. name of the bundle that will be created
   * @return value or {@code null} for none
   */
  public java.lang.String getBundleId() {
    return bundleId;
  }

  /**
   * Required. name of the bundle that will be created
   * @param bundleId bundleId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaCreateBundleRequest setBundleId(java.lang.String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * A list of integrations that can be executed by the bundle
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIntegrations() {
    return integrations;
  }

  /**
   * A list of integrations that can be executed by the bundle
   * @param integrations integrations or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaCreateBundleRequest setIntegrations(java.util.List<java.lang.String> integrations) {
    this.integrations = integrations;
    return this;
  }

  /**
   * Optional. The prefix for the SA, it should be in the format "o". This is an optional field, and
   * if empty service account will be created per project, where we are creating bundle. This should
   * only be used as the org ID for which we want to run the integrations in the bundle.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryCustomerOrgId() {
    return secondaryCustomerOrgId;
  }

  /**
   * Optional. The prefix for the SA, it should be in the format "o". This is an optional field, and
   * if empty service account will be created per project, where we are creating bundle. This should
   * only be used as the org ID for which we want to run the integrations in the bundle.
   * @param secondaryCustomerOrgId secondaryCustomerOrgId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaCreateBundleRequest setSecondaryCustomerOrgId(java.lang.String secondaryCustomerOrgId) {
    this.secondaryCustomerOrgId = secondaryCustomerOrgId;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaCreateBundleRequest set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaCreateBundleRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaCreateBundleRequest clone() {
    return (GoogleCloudIntegrationsV1alphaCreateBundleRequest) super.clone();
  }

}