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
 * Information related to a Bigtable column family.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BigtableColumnFamily extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Lists of columns that should be exposed as individual fields as opposed to a list of
   * (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be
   * accessed as .. Other columns can be accessed as a list through .Column field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BigtableColumn> columns;

  static {
    // hack to force ProGuard to consider BigtableColumn used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BigtableColumn.class);
  }

  /**
   * Optional. The encoding of the values when the type is not STRING. Acceptable encoding values
   * are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are
   * encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific
   * column by listing that column in 'columns' and specifying an encoding for it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encoding;

  /**
   * Identifier of the column family.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String familyId;

  /**
   * Optional. If this is set only the latest version of value are exposed for all columns in this
   * column family. This can be overridden for a specific column by listing that column in 'columns'
   * and specifying a different setting for that column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean onlyReadLatest;

  /**
   * Optional. The type to convert the value in cells of this column family. The values are expected
   * to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value.
   * Following BigQuery types are allowed (case-sensitive): * BYTES * STRING * INTEGER * FLOAT *
   * BOOLEAN * JSON Default type is BYTES. This can be overridden for a specific column by listing
   * that column in 'columns' and specifying a type for it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional. Lists of columns that should be exposed as individual fields as opposed to a list of
   * (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be
   * accessed as .. Other columns can be accessed as a list through .Column field.
   * @return value or {@code null} for none
   */
  public java.util.List<BigtableColumn> getColumns() {
    return columns;
  }

  /**
   * Optional. Lists of columns that should be exposed as individual fields as opposed to a list of
   * (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be
   * accessed as .. Other columns can be accessed as a list through .Column field.
   * @param columns columns or {@code null} for none
   */
  public BigtableColumnFamily setColumns(java.util.List<BigtableColumn> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Optional. The encoding of the values when the type is not STRING. Acceptable encoding values
   * are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are
   * encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific
   * column by listing that column in 'columns' and specifying an encoding for it.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncoding() {
    return encoding;
  }

  /**
   * Optional. The encoding of the values when the type is not STRING. Acceptable encoding values
   * are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are
   * encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific
   * column by listing that column in 'columns' and specifying an encoding for it.
   * @param encoding encoding or {@code null} for none
   */
  public BigtableColumnFamily setEncoding(java.lang.String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Identifier of the column family.
   * @return value or {@code null} for none
   */
  public java.lang.String getFamilyId() {
    return familyId;
  }

  /**
   * Identifier of the column family.
   * @param familyId familyId or {@code null} for none
   */
  public BigtableColumnFamily setFamilyId(java.lang.String familyId) {
    this.familyId = familyId;
    return this;
  }

  /**
   * Optional. If this is set only the latest version of value are exposed for all columns in this
   * column family. This can be overridden for a specific column by listing that column in 'columns'
   * and specifying a different setting for that column.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOnlyReadLatest() {
    return onlyReadLatest;
  }

  /**
   * Optional. If this is set only the latest version of value are exposed for all columns in this
   * column family. This can be overridden for a specific column by listing that column in 'columns'
   * and specifying a different setting for that column.
   * @param onlyReadLatest onlyReadLatest or {@code null} for none
   */
  public BigtableColumnFamily setOnlyReadLatest(java.lang.Boolean onlyReadLatest) {
    this.onlyReadLatest = onlyReadLatest;
    return this;
  }

  /**
   * Optional. The type to convert the value in cells of this column family. The values are expected
   * to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value.
   * Following BigQuery types are allowed (case-sensitive): * BYTES * STRING * INTEGER * FLOAT *
   * BOOLEAN * JSON Default type is BYTES. This can be overridden for a specific column by listing
   * that column in 'columns' and specifying a type for it.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Optional. The type to convert the value in cells of this column family. The values are expected
   * to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value.
   * Following BigQuery types are allowed (case-sensitive): * BYTES * STRING * INTEGER * FLOAT *
   * BOOLEAN * JSON Default type is BYTES. This can be overridden for a specific column by listing
   * that column in 'columns' and specifying a type for it.
   * @param type type or {@code null} for none
   */
  public BigtableColumnFamily setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public BigtableColumnFamily set(String fieldName, Object value) {
    return (BigtableColumnFamily) super.set(fieldName, value);
  }

  @Override
  public BigtableColumnFamily clone() {
    return (BigtableColumnFamily) super.clone();
  }

}
