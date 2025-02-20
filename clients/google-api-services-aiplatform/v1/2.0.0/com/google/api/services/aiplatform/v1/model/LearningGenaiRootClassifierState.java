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
 * DataProviderOutput and MetricOutput can be saved between calls to the Classifier framework. For
 * instance, you can run the query classifier, get outputs from those metrics, then use them in a
 * result classifier as well. Example rule based on this idea: and_rules { rule { metric_name:
 * 'query_safesearch_v2' ... } rule { metric_name: 'response_safesearch_v2' ... } }
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LearningGenaiRootClassifierState extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LearningGenaiRootDataProviderOutput> dataProviderOutput;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LearningGenaiRootMetricOutput> metricOutput;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LearningGenaiRootDataProviderOutput> getDataProviderOutput() {
    return dataProviderOutput;
  }

  /**
   * @param dataProviderOutput dataProviderOutput or {@code null} for none
   */
  public LearningGenaiRootClassifierState setDataProviderOutput(java.util.List<LearningGenaiRootDataProviderOutput> dataProviderOutput) {
    this.dataProviderOutput = dataProviderOutput;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LearningGenaiRootMetricOutput> getMetricOutput() {
    return metricOutput;
  }

  /**
   * @param metricOutput metricOutput or {@code null} for none
   */
  public LearningGenaiRootClassifierState setMetricOutput(java.util.List<LearningGenaiRootMetricOutput> metricOutput) {
    this.metricOutput = metricOutput;
    return this;
  }

  @Override
  public LearningGenaiRootClassifierState set(String fieldName, Object value) {
    return (LearningGenaiRootClassifierState) super.set(fieldName, value);
  }

  @Override
  public LearningGenaiRootClassifierState clone() {
    return (LearningGenaiRootClassifierState) super.clone();
  }

}
