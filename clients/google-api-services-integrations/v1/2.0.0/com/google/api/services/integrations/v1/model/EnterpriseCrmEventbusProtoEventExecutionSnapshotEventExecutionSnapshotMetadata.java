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
 * Model definition for
 * EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata.
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
public final class EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata extends com.google.api.client.json.GenericJson {

  /**
   * the event attempt number this snapshot belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer eventAttemptNum;

  /**
   * the task attempt number this snapshot belongs to. Could be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer taskAttemptNum;

  /**
   * the task name associated with this snapshot. Could be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskName;

  /**
   * The task number associated with this snapshot. Could be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String taskNumber;

  /**
   * the event attempt number this snapshot belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEventAttemptNum() {
    return eventAttemptNum;
  }

  /**
   * the event attempt number this snapshot belongs to.
   * @param eventAttemptNum eventAttemptNum or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata setEventAttemptNum(java.lang.Integer eventAttemptNum) {
    this.eventAttemptNum = eventAttemptNum;
    return this;
  }

  /**
   * the task attempt number this snapshot belongs to. Could be empty.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTaskAttemptNum() {
    return taskAttemptNum;
  }

  /**
   * the task attempt number this snapshot belongs to. Could be empty.
   * @param taskAttemptNum taskAttemptNum or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata setTaskAttemptNum(java.lang.Integer taskAttemptNum) {
    this.taskAttemptNum = taskAttemptNum;
    return this;
  }

  /**
   * the task name associated with this snapshot. Could be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskName() {
    return taskName;
  }

  /**
   * the task name associated with this snapshot. Could be empty.
   * @param taskName taskName or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata setTaskName(java.lang.String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * The task number associated with this snapshot. Could be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getTaskNumber() {
    return taskNumber;
  }

  /**
   * The task number associated with this snapshot. Could be empty.
   * @param taskNumber taskNumber or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata setTaskNumber(java.lang.String taskNumber) {
    this.taskNumber = taskNumber;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata clone() {
    return (EnterpriseCrmEventbusProtoEventExecutionSnapshotEventExecutionSnapshotMetadata) super.clone();
  }

}