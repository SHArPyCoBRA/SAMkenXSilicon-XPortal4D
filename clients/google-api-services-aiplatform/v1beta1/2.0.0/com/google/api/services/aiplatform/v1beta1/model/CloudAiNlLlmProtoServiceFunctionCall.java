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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Function call details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudAiNlLlmProtoServiceFunctionCall extends com.google.api.client.json.GenericJson {

  /**
   * The function parameters and values in JSON format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> args;

  /**
   * Required. The name of the function to call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The function parameters and values in JSON format.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getArgs() {
    return args;
  }

  /**
   * The function parameters and values in JSON format.
   * @param args args or {@code null} for none
   */
  public CloudAiNlLlmProtoServiceFunctionCall setArgs(java.util.Map<String, java.lang.Object> args) {
    this.args = args;
    return this;
  }

  /**
   * Required. The name of the function to call.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the function to call.
   * @param name name or {@code null} for none
   */
  public CloudAiNlLlmProtoServiceFunctionCall setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public CloudAiNlLlmProtoServiceFunctionCall set(String fieldName, Object value) {
    return (CloudAiNlLlmProtoServiceFunctionCall) super.set(fieldName, value);
  }

  @Override
  public CloudAiNlLlmProtoServiceFunctionCall clone() {
    return (CloudAiNlLlmProtoServiceFunctionCall) super.clone();
  }

}
