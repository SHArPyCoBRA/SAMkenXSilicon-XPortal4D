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
 * Request for lift Suspension
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
public final class GoogleCloudIntegrationsV1alphaLiftSuspensionRequest extends com.google.api.client.json.GenericJson {

  /**
   * User passed in suspension result and will be used to control workflow execution branching
   * behavior by setting up corresponnding edge condition with suspension result. For example, if
   * you want to lift the suspension, you can pass "Approved", or if you want to reject the
   * suspension and terminate workfloe execution, you can pass "Rejected" and terminate the workflow
   * execution with configuring the edge condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suspensionResult;

  /**
   * User passed in suspension result and will be used to control workflow execution branching
   * behavior by setting up corresponnding edge condition with suspension result. For example, if
   * you want to lift the suspension, you can pass "Approved", or if you want to reject the
   * suspension and terminate workfloe execution, you can pass "Rejected" and terminate the workflow
   * execution with configuring the edge condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuspensionResult() {
    return suspensionResult;
  }

  /**
   * User passed in suspension result and will be used to control workflow execution branching
   * behavior by setting up corresponnding edge condition with suspension result. For example, if
   * you want to lift the suspension, you can pass "Approved", or if you want to reject the
   * suspension and terminate workfloe execution, you can pass "Rejected" and terminate the workflow
   * execution with configuring the edge condition.
   * @param suspensionResult suspensionResult or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaLiftSuspensionRequest setSuspensionResult(java.lang.String suspensionResult) {
    this.suspensionResult = suspensionResult;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaLiftSuspensionRequest set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaLiftSuspensionRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaLiftSuspensionRequest clone() {
    return (GoogleCloudIntegrationsV1alphaLiftSuspensionRequest) super.clone();
  }

}