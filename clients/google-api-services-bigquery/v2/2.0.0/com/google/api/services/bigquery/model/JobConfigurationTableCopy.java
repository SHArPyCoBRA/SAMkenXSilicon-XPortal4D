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

package com.google.api.services.bigquery.model;

/**
 * JobConfigurationTableCopy configures a job that copies data from one table to another. For more
 * information on copying tables, see [Copy a table](https://cloud.google.com/bigquery/docs
 * /managing-tables#copy-table).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobConfigurationTableCopy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Specifies whether the job is allowed to create new tables. The following values are
   * supported: * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. *
   * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in
   * the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createDisposition;

  /**
   * Custom encryption configuration (e.g., Cloud KMS keys).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionConfiguration destinationEncryptionConfiguration;

  /**
   * Optional. The time when the destination table expires. Expired tables will be deleted and their
   * storage reclaimed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String destinationExpirationTime;

  /**
   * [Required] The destination table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableReference destinationTable;

  /**
   * Optional. Supported operation types in table copy job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * [Pick one] Source table to copy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableReference sourceTable;

  /**
   * [Pick one] Source tables to copy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableReference> sourceTables;

  /**
   * Optional. Specifies the action that occurs if the destination table already exists. The
   * following values are supported: * WRITE_TRUNCATE: If the table already exists, BigQuery
   * overwrites the table data and uses the schema and table constraints from the source table. *
   * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. *
   * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in
   * the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if
   * BigQuery is able to complete the job successfully. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String writeDisposition;

  /**
   * Optional. Specifies whether the job is allowed to create new tables. The following values are
   * supported: * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. *
   * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in
   * the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreateDisposition() {
    return createDisposition;
  }

  /**
   * Optional. Specifies whether the job is allowed to create new tables. The following values are
   * supported: * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. *
   * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in
   * the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * @param createDisposition createDisposition or {@code null} for none
   */
  public JobConfigurationTableCopy setCreateDisposition(java.lang.String createDisposition) {
    this.createDisposition = createDisposition;
    return this;
  }

  /**
   * Custom encryption configuration (e.g., Cloud KMS keys).
   * @return value or {@code null} for none
   */
  public EncryptionConfiguration getDestinationEncryptionConfiguration() {
    return destinationEncryptionConfiguration;
  }

  /**
   * Custom encryption configuration (e.g., Cloud KMS keys).
   * @param destinationEncryptionConfiguration destinationEncryptionConfiguration or {@code null} for none
   */
  public JobConfigurationTableCopy setDestinationEncryptionConfiguration(EncryptionConfiguration destinationEncryptionConfiguration) {
    this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
    return this;
  }

  /**
   * Optional. The time when the destination table expires. Expired tables will be deleted and their
   * storage reclaimed.
   * @return value or {@code null} for none
   */
  public String getDestinationExpirationTime() {
    return destinationExpirationTime;
  }

  /**
   * Optional. The time when the destination table expires. Expired tables will be deleted and their
   * storage reclaimed.
   * @param destinationExpirationTime destinationExpirationTime or {@code null} for none
   */
  public JobConfigurationTableCopy setDestinationExpirationTime(String destinationExpirationTime) {
    this.destinationExpirationTime = destinationExpirationTime;
    return this;
  }

  /**
   * [Required] The destination table.
   * @return value or {@code null} for none
   */
  public TableReference getDestinationTable() {
    return destinationTable;
  }

  /**
   * [Required] The destination table.
   * @param destinationTable destinationTable or {@code null} for none
   */
  public JobConfigurationTableCopy setDestinationTable(TableReference destinationTable) {
    this.destinationTable = destinationTable;
    return this;
  }

  /**
   * Optional. Supported operation types in table copy job.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * Optional. Supported operation types in table copy job.
   * @param operationType operationType or {@code null} for none
   */
  public JobConfigurationTableCopy setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * [Pick one] Source table to copy.
   * @return value or {@code null} for none
   */
  public TableReference getSourceTable() {
    return sourceTable;
  }

  /**
   * [Pick one] Source table to copy.
   * @param sourceTable sourceTable or {@code null} for none
   */
  public JobConfigurationTableCopy setSourceTable(TableReference sourceTable) {
    this.sourceTable = sourceTable;
    return this;
  }

  /**
   * [Pick one] Source tables to copy.
   * @return value or {@code null} for none
   */
  public java.util.List<TableReference> getSourceTables() {
    return sourceTables;
  }

  /**
   * [Pick one] Source tables to copy.
   * @param sourceTables sourceTables or {@code null} for none
   */
  public JobConfigurationTableCopy setSourceTables(java.util.List<TableReference> sourceTables) {
    this.sourceTables = sourceTables;
    return this;
  }

  /**
   * Optional. Specifies the action that occurs if the destination table already exists. The
   * following values are supported: * WRITE_TRUNCATE: If the table already exists, BigQuery
   * overwrites the table data and uses the schema and table constraints from the source table. *
   * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. *
   * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in
   * the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if
   * BigQuery is able to complete the job successfully. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * @return value or {@code null} for none
   */
  public java.lang.String getWriteDisposition() {
    return writeDisposition;
  }

  /**
   * Optional. Specifies the action that occurs if the destination table already exists. The
   * following values are supported: * WRITE_TRUNCATE: If the table already exists, BigQuery
   * overwrites the table data and uses the schema and table constraints from the source table. *
   * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. *
   * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in
   * the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if
   * BigQuery is able to complete the job successfully. Creation, truncation and append actions
   * occur as one atomic update upon job completion.
   * @param writeDisposition writeDisposition or {@code null} for none
   */
  public JobConfigurationTableCopy setWriteDisposition(java.lang.String writeDisposition) {
    this.writeDisposition = writeDisposition;
    return this;
  }

  @Override
  public JobConfigurationTableCopy set(String fieldName, Object value) {
    return (JobConfigurationTableCopy) super.set(fieldName, value);
  }

  @Override
  public JobConfigurationTableCopy clone() {
    return (JobConfigurationTableCopy) super.clone();
  }

}
