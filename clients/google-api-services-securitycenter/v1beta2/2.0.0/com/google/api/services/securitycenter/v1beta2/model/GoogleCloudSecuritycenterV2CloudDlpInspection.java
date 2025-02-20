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

package com.google.api.services.securitycenter.v1beta2.model;

/**
 * Details about the Cloud Data Loss Prevention (Cloud DLP) [inspection
 * job](https://cloud.google.com/dlp/docs/concepts-job-triggers) that produced the finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV2CloudDlpInspection extends com.google.api.client.json.GenericJson {

  /**
   * Whether Cloud DLP scanned the complete resource or a sampled subset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean fullScan;

  /**
   * The type of information (or *[infoType](https://cloud.google.com/dlp/docs/infotypes-
   * reference)*) found, for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String infoType;

  /**
   * The number of times Cloud DLP found this infoType within this job and resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long infoTypeCount;

  /**
   * Name of the inspection job, for example, `projects/123/locations/europe/dlpJobs/i-8383929`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inspectJob;

  /**
   * Whether Cloud DLP scanned the complete resource or a sampled subset.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFullScan() {
    return fullScan;
  }

  /**
   * Whether Cloud DLP scanned the complete resource or a sampled subset.
   * @param fullScan fullScan or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2CloudDlpInspection setFullScan(java.lang.Boolean fullScan) {
    this.fullScan = fullScan;
    return this;
  }

  /**
   * The type of information (or *[infoType](https://cloud.google.com/dlp/docs/infotypes-
   * reference)*) found, for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getInfoType() {
    return infoType;
  }

  /**
   * The type of information (or *[infoType](https://cloud.google.com/dlp/docs/infotypes-
   * reference)*) found, for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
   * @param infoType infoType or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2CloudDlpInspection setInfoType(java.lang.String infoType) {
    this.infoType = infoType;
    return this;
  }

  /**
   * The number of times Cloud DLP found this infoType within this job and resource.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInfoTypeCount() {
    return infoTypeCount;
  }

  /**
   * The number of times Cloud DLP found this infoType within this job and resource.
   * @param infoTypeCount infoTypeCount or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2CloudDlpInspection setInfoTypeCount(java.lang.Long infoTypeCount) {
    this.infoTypeCount = infoTypeCount;
    return this;
  }

  /**
   * Name of the inspection job, for example, `projects/123/locations/europe/dlpJobs/i-8383929`.
   * @return value or {@code null} for none
   */
  public java.lang.String getInspectJob() {
    return inspectJob;
  }

  /**
   * Name of the inspection job, for example, `projects/123/locations/europe/dlpJobs/i-8383929`.
   * @param inspectJob inspectJob or {@code null} for none
   */
  public GoogleCloudSecuritycenterV2CloudDlpInspection setInspectJob(java.lang.String inspectJob) {
    this.inspectJob = inspectJob;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV2CloudDlpInspection set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV2CloudDlpInspection) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV2CloudDlpInspection clone() {
    return (GoogleCloudSecuritycenterV2CloudDlpInspection) super.clone();
  }

}
