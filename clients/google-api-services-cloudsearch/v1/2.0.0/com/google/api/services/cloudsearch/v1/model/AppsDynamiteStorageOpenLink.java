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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Model definition for AppsDynamiteStorageOpenLink.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteStorageOpenLink extends com.google.api.client.json.GenericJson {

  /**
   * Represents the platform specific uri/intent to open on each client. For example: A
   * companion_url will open in a companion window on the web. An iOS URL and android intent will
   * open in the corresponding hosting apps. If these platform specific URLs can't be handled
   * correctly, i.e. if the companion isn't supported on web and the hosting apps aren't available
   * on the mobile platforms then the `uri` will open in a new browser window on all the platforms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteStorageOpenLinkAppUri appUri;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onClose;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String openAs;

  /**
   * The URL to open.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Represents the platform specific uri/intent to open on each client. For example: A
   * companion_url will open in a companion window on the web. An iOS URL and android intent will
   * open in the corresponding hosting apps. If these platform specific URLs can't be handled
   * correctly, i.e. if the companion isn't supported on web and the hosting apps aren't available
   * on the mobile platforms then the `uri` will open in a new browser window on all the platforms.
   * @return value or {@code null} for none
   */
  public AppsDynamiteStorageOpenLinkAppUri getAppUri() {
    return appUri;
  }

  /**
   * Represents the platform specific uri/intent to open on each client. For example: A
   * companion_url will open in a companion window on the web. An iOS URL and android intent will
   * open in the corresponding hosting apps. If these platform specific URLs can't be handled
   * correctly, i.e. if the companion isn't supported on web and the hosting apps aren't available
   * on the mobile platforms then the `uri` will open in a new browser window on all the platforms.
   * @param appUri appUri or {@code null} for none
   */
  public AppsDynamiteStorageOpenLink setAppUri(AppsDynamiteStorageOpenLinkAppUri appUri) {
    this.appUri = appUri;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOnClose() {
    return onClose;
  }

  /**
   * @param onClose onClose or {@code null} for none
   */
  public AppsDynamiteStorageOpenLink setOnClose(java.lang.String onClose) {
    this.onClose = onClose;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOpenAs() {
    return openAs;
  }

  /**
   * @param openAs openAs or {@code null} for none
   */
  public AppsDynamiteStorageOpenLink setOpenAs(java.lang.String openAs) {
    this.openAs = openAs;
    return this;
  }

  /**
   * The URL to open.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL to open.
   * @param url url or {@code null} for none
   */
  public AppsDynamiteStorageOpenLink setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public AppsDynamiteStorageOpenLink set(String fieldName, Object value) {
    return (AppsDynamiteStorageOpenLink) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteStorageOpenLink clone() {
    return (AppsDynamiteStorageOpenLink) super.clone();
  }

}