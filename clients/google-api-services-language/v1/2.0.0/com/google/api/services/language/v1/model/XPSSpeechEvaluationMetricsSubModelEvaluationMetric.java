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

package com.google.api.services.language.v1.model;

/**
 * Model definition for XPSSpeechEvaluationMetricsSubModelEvaluationMetric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSSpeechEvaluationMetricsSubModelEvaluationMetric extends com.google.api.client.json.GenericJson {

  /**
   * Type of the biasing model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String biasingModelType;

  /**
   * If true then it means we have an enhanced version of the biasing models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isEnhancedModel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numDeletions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numInsertions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numSubstitutions;

  /**
   * Number of utterances used in the wer computation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numUtterances;

  /**
   * Number of words over which the word error rate was computed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numWords;

  /**
   * Below fields are used for debugging purposes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double sentenceAccuracy;

  /**
   * Word error rate (standard error metric used for speech recognition).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double wer;

  /**
   * Type of the biasing model.
   * @return value or {@code null} for none
   */
  public java.lang.String getBiasingModelType() {
    return biasingModelType;
  }

  /**
   * Type of the biasing model.
   * @param biasingModelType biasingModelType or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setBiasingModelType(java.lang.String biasingModelType) {
    this.biasingModelType = biasingModelType;
    return this;
  }

  /**
   * If true then it means we have an enhanced version of the biasing models.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsEnhancedModel() {
    return isEnhancedModel;
  }

  /**
   * If true then it means we have an enhanced version of the biasing models.
   * @param isEnhancedModel isEnhancedModel or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setIsEnhancedModel(java.lang.Boolean isEnhancedModel) {
    this.isEnhancedModel = isEnhancedModel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumDeletions() {
    return numDeletions;
  }

  /**
   * @param numDeletions numDeletions or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setNumDeletions(java.lang.Integer numDeletions) {
    this.numDeletions = numDeletions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumInsertions() {
    return numInsertions;
  }

  /**
   * @param numInsertions numInsertions or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setNumInsertions(java.lang.Integer numInsertions) {
    this.numInsertions = numInsertions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumSubstitutions() {
    return numSubstitutions;
  }

  /**
   * @param numSubstitutions numSubstitutions or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setNumSubstitutions(java.lang.Integer numSubstitutions) {
    this.numSubstitutions = numSubstitutions;
    return this;
  }

  /**
   * Number of utterances used in the wer computation.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumUtterances() {
    return numUtterances;
  }

  /**
   * Number of utterances used in the wer computation.
   * @param numUtterances numUtterances or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setNumUtterances(java.lang.Integer numUtterances) {
    this.numUtterances = numUtterances;
    return this;
  }

  /**
   * Number of words over which the word error rate was computed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumWords() {
    return numWords;
  }

  /**
   * Number of words over which the word error rate was computed.
   * @param numWords numWords or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setNumWords(java.lang.Integer numWords) {
    this.numWords = numWords;
    return this;
  }

  /**
   * Below fields are used for debugging purposes
   * @return value or {@code null} for none
   */
  public java.lang.Double getSentenceAccuracy() {
    return sentenceAccuracy;
  }

  /**
   * Below fields are used for debugging purposes
   * @param sentenceAccuracy sentenceAccuracy or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setSentenceAccuracy(java.lang.Double sentenceAccuracy) {
    this.sentenceAccuracy = sentenceAccuracy;
    return this;
  }

  /**
   * Word error rate (standard error metric used for speech recognition).
   * @return value or {@code null} for none
   */
  public java.lang.Double getWer() {
    return wer;
  }

  /**
   * Word error rate (standard error metric used for speech recognition).
   * @param wer wer or {@code null} for none
   */
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric setWer(java.lang.Double wer) {
    this.wer = wer;
    return this;
  }

  @Override
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric set(String fieldName, Object value) {
    return (XPSSpeechEvaluationMetricsSubModelEvaluationMetric) super.set(fieldName, value);
  }

  @Override
  public XPSSpeechEvaluationMetricsSubModelEvaluationMetric clone() {
    return (XPSSpeechEvaluationMetricsSubModelEvaluationMetric) super.clone();
  }

}
