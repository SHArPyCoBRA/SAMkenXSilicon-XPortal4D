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

package com.google.api.services.walletobjects.model;

/**
 * Indicates that the issuer would like Google Wallet to send an upcoming card validity notification
 * 1 day before card becomes valid/usable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Wallet API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpcomingNotification extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if the object needs to have upcoming notification enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableNotification;

  /**
   * Indicates if the object needs to have upcoming notification enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableNotification() {
    return enableNotification;
  }

  /**
   * Indicates if the object needs to have upcoming notification enabled.
   * @param enableNotification enableNotification or {@code null} for none
   */
  public UpcomingNotification setEnableNotification(java.lang.Boolean enableNotification) {
    this.enableNotification = enableNotification;
    return this;
  }

  @Override
  public UpcomingNotification set(String fieldName, Object value) {
    return (UpcomingNotification) super.set(fieldName, value);
  }

  @Override
  public UpcomingNotification clone() {
    return (UpcomingNotification) super.clone();
  }

}
