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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Next Tag: 10
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageRepositoryAmarnaCloudSpeechSignals extends com.google.api.client.json.GenericJson {

  /**
   * If this field is set to true, it means that Youtube already processed the ASR from S3 for the
   * langID. Please find the ASR result from transcript_asr in
   * google3/image/repository/proto/video_search.proto instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean duplicateOfYtS3Asr;

  /**
   * DEPRECATED: Please switch to `langid_input`. The language id input for creating this ASR
   * without regional info. Same format as in go/ytlangid. This field is populated in Kronos Amarna
   * Cloud Speech operator and passed to Amarna, but it is cleared before stored in Amarna's
   * metadata table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String langWithoutLocale;

  /**
   * The language identification input used to generate this ASR. This field is populated in Kronos
   * Amarna Cloud Speech operator and passed to Amarna, but cleared before stored in Amarna's
   * metadata table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageRepositoryLanguageIdentificationResult langidInput;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelIdentifier;

  /**
   * Raw results from Cloud Speech API
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImageRepositorySpeechRecognitionResult> results;

  /**
   * The metadata about the S3 recognizer used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageRepositoryS3RecognizerMetadataResponse s3RecognizerMetadataResponse;

  /**
   * This field contains full (stitched) transcription, word-level time offset , and word-level byte
   * offset. The value of this field is derived from the SpeechRecognitionResult field above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PseudoVideoData transcriptAsr;

  /**
   * If this field is set to true, it means that Youtube already processed the ASR from S3 for the
   * langID. Please find the ASR result from transcript_asr in
   * google3/image/repository/proto/video_search.proto instead.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDuplicateOfYtS3Asr() {
    return duplicateOfYtS3Asr;
  }

  /**
   * If this field is set to true, it means that Youtube already processed the ASR from S3 for the
   * langID. Please find the ASR result from transcript_asr in
   * google3/image/repository/proto/video_search.proto instead.
   * @param duplicateOfYtS3Asr duplicateOfYtS3Asr or {@code null} for none
   */
  public ImageRepositoryAmarnaCloudSpeechSignals setDuplicateOfYtS3Asr(java.lang.Boolean duplicateOfYtS3Asr) {
    this.duplicateOfYtS3Asr = duplicateOfYtS3Asr;
    return this;
  }

  /**
   * DEPRECATED: Please switch to `langid_input`. The language id input for creating this ASR
   * without regional info. Same format as in go/ytlangid. This field is populated in Kronos Amarna
   * Cloud Speech operator and passed to Amarna, but it is cleared before stored in Amarna's
   * metadata table.
   * @return value or {@code null} for none
   */
  public java.lang.String getLangWithoutLocale() {
    return langWithoutLocale;
  }

  /**
   * DEPRECATED: Please switch to `langid_input`. The language id input for creating this ASR
   * without regional info. Same format as in go/ytlangid. This field is populated in Kronos Amarna
   * Cloud Speech operator and passed to Amarna, but it is cleared before stored in Amarna's
   * metadata table.
   * @param langWithoutLocale langWithoutLocale or {@code null} for none
   */
  public ImageRepositoryAmarnaCloudSpeechSignals setLangWithoutLocale(java.lang.String langWithoutLocale) {
    this.langWithoutLocale = langWithoutLocale;
    return this;
  }

  /**
   * The language identification input used to generate this ASR. This field is populated in Kronos
   * Amarna Cloud Speech operator and passed to Amarna, but cleared before stored in Amarna's
   * metadata table.
   * @return value or {@code null} for none
   */
  public ImageRepositoryLanguageIdentificationResult getLangidInput() {
    return langidInput;
  }

  /**
   * The language identification input used to generate this ASR. This field is populated in Kronos
   * Amarna Cloud Speech operator and passed to Amarna, but cleared before stored in Amarna's
   * metadata table.
   * @param langidInput langidInput or {@code null} for none
   */
  public ImageRepositoryAmarnaCloudSpeechSignals setLangidInput(ImageRepositoryLanguageIdentificationResult langidInput) {
    this.langidInput = langidInput;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getModelIdentifier() {
    return modelIdentifier;
  }

  /**
   * @param modelIdentifier modelIdentifier or {@code null} for none
   */
  public ImageRepositoryAmarnaCloudSpeechSignals setModelIdentifier(java.lang.String modelIdentifier) {
    this.modelIdentifier = modelIdentifier;
    return this;
  }

  /**
   * Raw results from Cloud Speech API
   * @return value or {@code null} for none
   */
  public java.util.List<ImageRepositorySpeechRecognitionResult> getResults() {
    return results;
  }

  /**
   * Raw results from Cloud Speech API
   * @param results results or {@code null} for none
   */
  public ImageRepositoryAmarnaCloudSpeechSignals setResults(java.util.List<ImageRepositorySpeechRecognitionResult> results) {
    this.results = results;
    return this;
  }

  /**
   * The metadata about the S3 recognizer used.
   * @return value or {@code null} for none
   */
  public ImageRepositoryS3RecognizerMetadataResponse getS3RecognizerMetadataResponse() {
    return s3RecognizerMetadataResponse;
  }

  /**
   * The metadata about the S3 recognizer used.
   * @param s3RecognizerMetadataResponse s3RecognizerMetadataResponse or {@code null} for none
   */
  public ImageRepositoryAmarnaCloudSpeechSignals setS3RecognizerMetadataResponse(ImageRepositoryS3RecognizerMetadataResponse s3RecognizerMetadataResponse) {
    this.s3RecognizerMetadataResponse = s3RecognizerMetadataResponse;
    return this;
  }

  /**
   * This field contains full (stitched) transcription, word-level time offset , and word-level byte
   * offset. The value of this field is derived from the SpeechRecognitionResult field above.
   * @return value or {@code null} for none
   */
  public PseudoVideoData getTranscriptAsr() {
    return transcriptAsr;
  }

  /**
   * This field contains full (stitched) transcription, word-level time offset , and word-level byte
   * offset. The value of this field is derived from the SpeechRecognitionResult field above.
   * @param transcriptAsr transcriptAsr or {@code null} for none
   */
  public ImageRepositoryAmarnaCloudSpeechSignals setTranscriptAsr(PseudoVideoData transcriptAsr) {
    this.transcriptAsr = transcriptAsr;
    return this;
  }

  @Override
  public ImageRepositoryAmarnaCloudSpeechSignals set(String fieldName, Object value) {
    return (ImageRepositoryAmarnaCloudSpeechSignals) super.set(fieldName, value);
  }

  @Override
  public ImageRepositoryAmarnaCloudSpeechSignals clone() {
    return (ImageRepositoryAmarnaCloudSpeechSignals) super.clone();
  }

}
