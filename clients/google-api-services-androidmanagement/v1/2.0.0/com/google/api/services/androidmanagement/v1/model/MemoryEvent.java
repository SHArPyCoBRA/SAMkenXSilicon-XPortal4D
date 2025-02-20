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

package com.google.api.services.androidmanagement.v1.model;

/**
 * An event related to memory and storage measurements.To distinguish between new and old events, we
 * recommend using the createTime field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MemoryEvent extends com.google.api.client.json.GenericJson {

  /**
   * The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED, the total capacity in
   * bytes of the storage medium.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long byteCount;

  /**
   * The creation time of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Event type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED, the total capacity in
   * bytes of the storage medium.
   * @return value or {@code null} for none
   */
  public java.lang.Long getByteCount() {
    return byteCount;
  }

  /**
   * The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED, the total capacity in
   * bytes of the storage medium.
   * @param byteCount byteCount or {@code null} for none
   */
  public MemoryEvent setByteCount(java.lang.Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  /**
   * The creation time of the event.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The creation time of the event.
   * @param createTime createTime or {@code null} for none
   */
  public MemoryEvent setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Event type.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * Event type.
   * @param eventType eventType or {@code null} for none
   */
  public MemoryEvent setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  @Override
  public MemoryEvent set(String fieldName, Object value) {
    return (MemoryEvent) super.set(fieldName, value);
  }

  @Override
  public MemoryEvent clone() {
    return (MemoryEvent) super.clone();
  }

}
