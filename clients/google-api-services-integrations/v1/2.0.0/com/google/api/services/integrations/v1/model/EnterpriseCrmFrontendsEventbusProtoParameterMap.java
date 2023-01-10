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
 * A generic multi-map that holds key value pairs. They keys and values can be of any type, unless
 * specified.
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
public final class EnterpriseCrmFrontendsEventbusProtoParameterMap extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterMapEntry> entries;

  /**
   * Option to specify key value type for all entries of the map. If provided then field types for
   * all entries must conform to this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterMapEntry> getEntries() {
    return entries;
  }

  /**
   * @param entries entries or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoParameterMap setEntries(java.util.List<EnterpriseCrmFrontendsEventbusProtoParameterMapEntry> entries) {
    this.entries = entries;
    return this;
  }

  /**
   * Option to specify key value type for all entries of the map. If provided then field types for
   * all entries must conform to this.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyType() {
    return keyType;
  }

  /**
   * Option to specify key value type for all entries of the map. If provided then field types for
   * all entries must conform to this.
   * @param keyType keyType or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoParameterMap setKeyType(java.lang.String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * @param valueType valueType or {@code null} for none
   */
  public EnterpriseCrmFrontendsEventbusProtoParameterMap setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public EnterpriseCrmFrontendsEventbusProtoParameterMap set(String fieldName, Object value) {
    return (EnterpriseCrmFrontendsEventbusProtoParameterMap) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmFrontendsEventbusProtoParameterMap clone() {
    return (EnterpriseCrmFrontendsEventbusProtoParameterMap) super.clone();
  }

}