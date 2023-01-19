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

package com.google.api.services.kmsinventory.v1.model;

/**
 * Contains an HSM-generated attestation about a key operation. For more information, see [Verifying
 * attestations] (https://cloud.google.com/kms/docs/attest-key).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the KMS Inventory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudKmsV1KeyOperationAttestation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The certificate chains needed to validate the attestation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudKmsV1KeyOperationAttestationCertificateChains certChains;

  /**
   * Output only. The attestation data provided by the HSM when the key operation was performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Output only. The format of the attestation data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Output only. The certificate chains needed to validate the attestation
   * @return value or {@code null} for none
   */
  public GoogleCloudKmsV1KeyOperationAttestationCertificateChains getCertChains() {
    return certChains;
  }

  /**
   * Output only. The certificate chains needed to validate the attestation
   * @param certChains certChains or {@code null} for none
   */
  public GoogleCloudKmsV1KeyOperationAttestation setCertChains(GoogleCloudKmsV1KeyOperationAttestationCertificateChains certChains) {
    this.certChains = certChains;
    return this;
  }

  /**
   * Output only. The attestation data provided by the HSM when the key operation was performed.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Output only. The attestation data provided by the HSM when the key operation was performed.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Output only. The attestation data provided by the HSM when the key operation was performed.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudKmsV1KeyOperationAttestation setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Output only. The attestation data provided by the HSM when the key operation was performed.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudKmsV1KeyOperationAttestation encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * Output only. The format of the attestation data.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * Output only. The format of the attestation data.
   * @param format format or {@code null} for none
   */
  public GoogleCloudKmsV1KeyOperationAttestation setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  @Override
  public GoogleCloudKmsV1KeyOperationAttestation set(String fieldName, Object value) {
    return (GoogleCloudKmsV1KeyOperationAttestation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudKmsV1KeyOperationAttestation clone() {
    return (GoogleCloudKmsV1KeyOperationAttestation) super.clone();
  }

}