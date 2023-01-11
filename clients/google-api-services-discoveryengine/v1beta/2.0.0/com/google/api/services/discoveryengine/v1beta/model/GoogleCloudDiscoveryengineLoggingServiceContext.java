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

package com.google.api.services.discoveryengine.v1beta.model;

/**
 * Describes a running service that sends errors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineLoggingServiceContext extends com.google.api.client.json.GenericJson {

  /**
   * An identifier of the service. For example, "discoveryengine.googleapis.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * An identifier of the service. For example, "discoveryengine.googleapis.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * An identifier of the service. For example, "discoveryengine.googleapis.com".
   * @param service service or {@code null} for none
   */
  public GoogleCloudDiscoveryengineLoggingServiceContext setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineLoggingServiceContext set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineLoggingServiceContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineLoggingServiceContext clone() {
    return (GoogleCloudDiscoveryengineLoggingServiceContext) super.clone();
  }

}