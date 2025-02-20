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

package com.google.api.services.playintegrity.v1.model;

/**
 * Contains signals about others apps on the device which could be used to access or control the
 * requesting app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Integrity API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppAccessRiskVerdict extends com.google.api.client.json.GenericJson {

  /**
   * Required. App access risk verdict related to apps that are not installed by Google Play, and
   * are not preloaded on the system image by the device manufacturer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String otherApps;

  /**
   * Required. App access risk verdict related to apps that are not installed by the Google Play
   * Store, and are not preloaded on the system image by the device manufacturer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String playOrSystemApps;

  /**
   * Required. App access risk verdict related to apps that are not installed by Google Play, and
   * are not preloaded on the system image by the device manufacturer.
   * @return value or {@code null} for none
   */
  public java.lang.String getOtherApps() {
    return otherApps;
  }

  /**
   * Required. App access risk verdict related to apps that are not installed by Google Play, and
   * are not preloaded on the system image by the device manufacturer.
   * @param otherApps otherApps or {@code null} for none
   */
  public AppAccessRiskVerdict setOtherApps(java.lang.String otherApps) {
    this.otherApps = otherApps;
    return this;
  }

  /**
   * Required. App access risk verdict related to apps that are not installed by the Google Play
   * Store, and are not preloaded on the system image by the device manufacturer.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlayOrSystemApps() {
    return playOrSystemApps;
  }

  /**
   * Required. App access risk verdict related to apps that are not installed by the Google Play
   * Store, and are not preloaded on the system image by the device manufacturer.
   * @param playOrSystemApps playOrSystemApps or {@code null} for none
   */
  public AppAccessRiskVerdict setPlayOrSystemApps(java.lang.String playOrSystemApps) {
    this.playOrSystemApps = playOrSystemApps;
    return this;
  }

  @Override
  public AppAccessRiskVerdict set(String fieldName, Object value) {
    return (AppAccessRiskVerdict) super.set(fieldName, value);
  }

  @Override
  public AppAccessRiskVerdict clone() {
    return (AppAccessRiskVerdict) super.clone();
  }

}
