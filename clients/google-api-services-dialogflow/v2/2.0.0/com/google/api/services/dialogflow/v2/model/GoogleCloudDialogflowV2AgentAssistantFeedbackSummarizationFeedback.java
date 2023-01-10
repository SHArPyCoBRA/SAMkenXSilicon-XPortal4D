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

package com.google.api.services.dialogflow.v2.model;

/**
 * Feedback for conversation summarization.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp when composing of the summary starts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Timestamp when the summary was submitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String submitTime;

  /**
   * Text of actual submitted summary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summaryText;

  /**
   * Timestamp when composing of the summary starts.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Timestamp when composing of the summary starts.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Timestamp when the summary was submitted.
   * @return value or {@code null} for none
   */
  public String getSubmitTime() {
    return submitTime;
  }

  /**
   * Timestamp when the summary was submitted.
   * @param submitTime submitTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback setSubmitTime(String submitTime) {
    this.submitTime = submitTime;
    return this;
  }

  /**
   * Text of actual submitted summary.
   * @return value or {@code null} for none
   */
  public java.lang.String getSummaryText() {
    return summaryText;
  }

  /**
   * Text of actual submitted summary.
   * @param summaryText summaryText or {@code null} for none
   */
  public GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback setSummaryText(java.lang.String summaryText) {
    this.summaryText = summaryText;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback clone() {
    return (GoogleCloudDialogflowV2AgentAssistantFeedbackSummarizationFeedback) super.clone();
  }

}