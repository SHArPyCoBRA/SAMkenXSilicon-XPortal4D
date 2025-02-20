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

package com.google.api.services.aiplatform.v1.model;

/**
 * The recitation result for one input
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LearningGenaiRecitationRecitationResult extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LearningGenaiRecitationSegmentResult> dynamicSegmentResults;

  /**
   * The recitation action for one given input. When its segments contain different actions, the
   * overall action will be returned in the precedence of BLOCK > CITE > NO_ACTION. When the given
   * input is not found in any source, the recitation action will be NO_ACTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recitationAction;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LearningGenaiRecitationSegmentResult> trainingSegmentResults;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LearningGenaiRecitationSegmentResult> getDynamicSegmentResults() {
    return dynamicSegmentResults;
  }

  /**
   * @param dynamicSegmentResults dynamicSegmentResults or {@code null} for none
   */
  public LearningGenaiRecitationRecitationResult setDynamicSegmentResults(java.util.List<LearningGenaiRecitationSegmentResult> dynamicSegmentResults) {
    this.dynamicSegmentResults = dynamicSegmentResults;
    return this;
  }

  /**
   * The recitation action for one given input. When its segments contain different actions, the
   * overall action will be returned in the precedence of BLOCK > CITE > NO_ACTION. When the given
   * input is not found in any source, the recitation action will be NO_ACTION.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecitationAction() {
    return recitationAction;
  }

  /**
   * The recitation action for one given input. When its segments contain different actions, the
   * overall action will be returned in the precedence of BLOCK > CITE > NO_ACTION. When the given
   * input is not found in any source, the recitation action will be NO_ACTION.
   * @param recitationAction recitationAction or {@code null} for none
   */
  public LearningGenaiRecitationRecitationResult setRecitationAction(java.lang.String recitationAction) {
    this.recitationAction = recitationAction;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LearningGenaiRecitationSegmentResult> getTrainingSegmentResults() {
    return trainingSegmentResults;
  }

  /**
   * @param trainingSegmentResults trainingSegmentResults or {@code null} for none
   */
  public LearningGenaiRecitationRecitationResult setTrainingSegmentResults(java.util.List<LearningGenaiRecitationSegmentResult> trainingSegmentResults) {
    this.trainingSegmentResults = trainingSegmentResults;
    return this;
  }

  @Override
  public LearningGenaiRecitationRecitationResult set(String fieldName, Object value) {
    return (LearningGenaiRecitationRecitationResult) super.set(fieldName, value);
  }

  @Override
  public LearningGenaiRecitationRecitationResult clone() {
    return (LearningGenaiRecitationRecitationResult) super.clone();
  }

}
