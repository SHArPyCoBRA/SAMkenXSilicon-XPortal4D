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
 * Integration Parameter is defined in the integration config and are used to provide information
 * about data types of the expected parameters and provide any default values if needed. They can
 * also be used to add custom attributes. These are static in nature and should not be used for
 * dynamic event definition.
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
public final class GoogleCloudIntegrationsV1alphaIntegrationParameter extends com.google.api.client.json.GenericJson {

  /**
   * Type of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataType;

  /**
   * Default values for the defined keys. Each value can either be string, int, double or any proto
   * message or a serialized object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaValueType defaultValue;

  /**
   * The name (without prefix) to be displayed in the UI for this parameter. E.g. if the key is
   * "foo.bar.myName", then the name would be "myName".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Specifies the input/output type for the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputOutputType;

  /**
   * Whether this parameter is a transient parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isTransient;

  /**
   * This schema will be used to validate runtime JSON-typed values of this parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jsonSchema;

  /**
   * Key is used to retrieve the corresponding parameter value. This should be unique for a given
   * fired event. These parameters must be predefined in the integration definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The identifier of the node (TaskConfig/TriggerConfig) this parameter was produced by, if it is
   * a transient param or a copy of an input param.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String producer;

  /**
   * Searchable in the execution log or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean searchable;

  /**
   * Type of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataType() {
    return dataType;
  }

  /**
   * Type of the parameter.
   * @param dataType dataType or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setDataType(java.lang.String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Default values for the defined keys. Each value can either be string, int, double or any proto
   * message or a serialized object.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaValueType getDefaultValue() {
    return defaultValue;
  }

  /**
   * Default values for the defined keys. Each value can either be string, int, double or any proto
   * message or a serialized object.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setDefaultValue(GoogleCloudIntegrationsV1alphaValueType defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The name (without prefix) to be displayed in the UI for this parameter. E.g. if the key is
   * "foo.bar.myName", then the name would be "myName".
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name (without prefix) to be displayed in the UI for this parameter. E.g. if the key is
   * "foo.bar.myName", then the name would be "myName".
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Specifies the input/output type for the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputOutputType() {
    return inputOutputType;
  }

  /**
   * Specifies the input/output type for the parameter.
   * @param inputOutputType inputOutputType or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setInputOutputType(java.lang.String inputOutputType) {
    this.inputOutputType = inputOutputType;
    return this;
  }

  /**
   * Whether this parameter is a transient parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsTransient() {
    return isTransient;
  }

  /**
   * Whether this parameter is a transient parameter.
   * @param isTransient isTransient or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setIsTransient(java.lang.Boolean isTransient) {
    this.isTransient = isTransient;
    return this;
  }

  /**
   * This schema will be used to validate runtime JSON-typed values of this parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getJsonSchema() {
    return jsonSchema;
  }

  /**
   * This schema will be used to validate runtime JSON-typed values of this parameter.
   * @param jsonSchema jsonSchema or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setJsonSchema(java.lang.String jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }

  /**
   * Key is used to retrieve the corresponding parameter value. This should be unique for a given
   * fired event. These parameters must be predefined in the integration definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Key is used to retrieve the corresponding parameter value. This should be unique for a given
   * fired event. These parameters must be predefined in the integration definition.
   * @param key key or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The identifier of the node (TaskConfig/TriggerConfig) this parameter was produced by, if it is
   * a transient param or a copy of an input param.
   * @return value or {@code null} for none
   */
  public java.lang.String getProducer() {
    return producer;
  }

  /**
   * The identifier of the node (TaskConfig/TriggerConfig) this parameter was produced by, if it is
   * a transient param or a copy of an input param.
   * @param producer producer or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setProducer(java.lang.String producer) {
    this.producer = producer;
    return this;
  }

  /**
   * Searchable in the execution log or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSearchable() {
    return searchable;
  }

  /**
   * Searchable in the execution log or not.
   * @param searchable searchable or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaIntegrationParameter setSearchable(java.lang.Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaIntegrationParameter set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaIntegrationParameter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaIntegrationParameter clone() {
    return (GoogleCloudIntegrationsV1alphaIntegrationParameter) super.clone();
  }

}