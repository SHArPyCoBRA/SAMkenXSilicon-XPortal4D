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

package com.google.api.services.firestore.v1.model;

/**
 * A field in an index. The field_path describes which field is indexed, the value_mode describes
 * how the field value is indexed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1IndexField extends com.google.api.client.json.GenericJson {

  /**
   * Indicates that this field supports operations on `array_value`s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String arrayConfig;

  /**
   * Can be __name__. For single field indexes, this must match the name of the field or may be
   * omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldPath;

  /**
   * Indicates that this field supports ordering by the specified order or comparing using =, !=, <,
   * <=, >, >=.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String order;

  /**
   * Indicates that this field supports nearest neighbors and distance operations on vector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirestoreAdminV1VectorConfig vectorConfig;

  /**
   * Indicates that this field supports operations on `array_value`s.
   * @return value or {@code null} for none
   */
  public java.lang.String getArrayConfig() {
    return arrayConfig;
  }

  /**
   * Indicates that this field supports operations on `array_value`s.
   * @param arrayConfig arrayConfig or {@code null} for none
   */
  public GoogleFirestoreAdminV1IndexField setArrayConfig(java.lang.String arrayConfig) {
    this.arrayConfig = arrayConfig;
    return this;
  }

  /**
   * Can be __name__. For single field indexes, this must match the name of the field or may be
   * omitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldPath() {
    return fieldPath;
  }

  /**
   * Can be __name__. For single field indexes, this must match the name of the field or may be
   * omitted.
   * @param fieldPath fieldPath or {@code null} for none
   */
  public GoogleFirestoreAdminV1IndexField setFieldPath(java.lang.String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Indicates that this field supports ordering by the specified order or comparing using =, !=, <,
   * <=, >, >=.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrder() {
    return order;
  }

  /**
   * Indicates that this field supports ordering by the specified order or comparing using =, !=, <,
   * <=, >, >=.
   * @param order order or {@code null} for none
   */
  public GoogleFirestoreAdminV1IndexField setOrder(java.lang.String order) {
    this.order = order;
    return this;
  }

  /**
   * Indicates that this field supports nearest neighbors and distance operations on vector.
   * @return value or {@code null} for none
   */
  public GoogleFirestoreAdminV1VectorConfig getVectorConfig() {
    return vectorConfig;
  }

  /**
   * Indicates that this field supports nearest neighbors and distance operations on vector.
   * @param vectorConfig vectorConfig or {@code null} for none
   */
  public GoogleFirestoreAdminV1IndexField setVectorConfig(GoogleFirestoreAdminV1VectorConfig vectorConfig) {
    this.vectorConfig = vectorConfig;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1IndexField set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1IndexField) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1IndexField clone() {
    return (GoogleFirestoreAdminV1IndexField) super.clone();
  }

}
