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

package com.google.api.services.compute.model;

/**
 * Message defining compute perspective of the result of integration with Backup and DR. FAILED
 * status indicates that the operation specified did not complete correctly and should be retried
 * with the same value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceStatusServiceIntegrationStatusBackupDRStatus extends com.google.api.client.json.GenericJson {

  /**
   * The PlanReference object created by Backup and DR to maintain the actual status of backups. May
   * still be present if removing the backup plan fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String integrationDetails;

  /**
   * Enum representing the registration state of a Backup and DR backup plan for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The PlanReference object created by Backup and DR to maintain the actual status of backups. May
   * still be present if removing the backup plan fails.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntegrationDetails() {
    return integrationDetails;
  }

  /**
   * The PlanReference object created by Backup and DR to maintain the actual status of backups. May
   * still be present if removing the backup plan fails.
   * @param integrationDetails integrationDetails or {@code null} for none
   */
  public ResourceStatusServiceIntegrationStatusBackupDRStatus setIntegrationDetails(java.lang.String integrationDetails) {
    this.integrationDetails = integrationDetails;
    return this;
  }

  /**
   * Enum representing the registration state of a Backup and DR backup plan for the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Enum representing the registration state of a Backup and DR backup plan for the instance.
   * @param state state or {@code null} for none
   */
  public ResourceStatusServiceIntegrationStatusBackupDRStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public ResourceStatusServiceIntegrationStatusBackupDRStatus set(String fieldName, Object value) {
    return (ResourceStatusServiceIntegrationStatusBackupDRStatus) super.set(fieldName, value);
  }

  @Override
  public ResourceStatusServiceIntegrationStatusBackupDRStatus clone() {
    return (ResourceStatusServiceIntegrationStatusBackupDRStatus) super.clone();
  }

}