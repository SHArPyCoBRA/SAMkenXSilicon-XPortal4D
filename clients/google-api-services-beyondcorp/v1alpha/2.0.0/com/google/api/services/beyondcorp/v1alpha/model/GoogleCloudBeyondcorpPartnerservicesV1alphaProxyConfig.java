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

package com.google.api.services.beyondcorp.v1alpha.model;

/**
 * Proxy Configuration of a PartnerTenant.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. An arbitrary caller-provided name for the ProxyConfig. Cannot exceed 64 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Information to encrypt JWT for the proxy server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBeyondcorpPartnerservicesV1alphaEncryptionInfo encryptionInfo;

  /**
   * Output only. ProxyConfig resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The URI of the proxy server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proxyUri;

  /**
   * Required. Routing info to direct traffic to the proxy server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBeyondcorpPartnerservicesV1alphaRoutingInfo routingInfo;

  /**
   * Required. Transport layer information to verify for the proxy server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBeyondcorpPartnerservicesV1alphaTransportInfo transportInfo;

  /**
   * Output only. Timestamp when the resource was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. An arbitrary caller-provided name for the ProxyConfig. Cannot exceed 64 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. An arbitrary caller-provided name for the ProxyConfig. Cannot exceed 64 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Information to encrypt JWT for the proxy server.
   * @return value or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaEncryptionInfo getEncryptionInfo() {
    return encryptionInfo;
  }

  /**
   * Optional. Information to encrypt JWT for the proxy server.
   * @param encryptionInfo encryptionInfo or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setEncryptionInfo(GoogleCloudBeyondcorpPartnerservicesV1alphaEncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
    return this;
  }

  /**
   * Output only. ProxyConfig resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. ProxyConfig resource name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The URI of the proxy server.
   * @return value or {@code null} for none
   */
  public java.lang.String getProxyUri() {
    return proxyUri;
  }

  /**
   * Required. The URI of the proxy server.
   * @param proxyUri proxyUri or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setProxyUri(java.lang.String proxyUri) {
    this.proxyUri = proxyUri;
    return this;
  }

  /**
   * Required. Routing info to direct traffic to the proxy server.
   * @return value or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaRoutingInfo getRoutingInfo() {
    return routingInfo;
  }

  /**
   * Required. Routing info to direct traffic to the proxy server.
   * @param routingInfo routingInfo or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setRoutingInfo(GoogleCloudBeyondcorpPartnerservicesV1alphaRoutingInfo routingInfo) {
    this.routingInfo = routingInfo;
    return this;
  }

  /**
   * Required. Transport layer information to verify for the proxy server.
   * @return value or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaTransportInfo getTransportInfo() {
    return transportInfo;
  }

  /**
   * Required. Transport layer information to verify for the proxy server.
   * @param transportInfo transportInfo or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setTransportInfo(GoogleCloudBeyondcorpPartnerservicesV1alphaTransportInfo transportInfo) {
    this.transportInfo = transportInfo;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig set(String fieldName, Object value) {
    return (GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig clone() {
    return (GoogleCloudBeyondcorpPartnerservicesV1alphaProxyConfig) super.clone();
  }

}
