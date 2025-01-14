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
 * Features to be passed from Media GP to HGR. Next ID: 21
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
public final class AssistantGroundingRankerMediaGroundingProviderFeatures extends com.google.api.client.json.GenericJson {

  /**
   * Release type for an album container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String albumReleaseType;

  /**
   * Temporary ambiguity classifier signals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ambiguityClassifier;

  /**
   * Mid of the media item. This is currently only used in manual rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityMid;

  /**
   * True if the candidate has a CAST_VIDEO deeplink regardless of which provider was chosen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasCastVideoDeeplink;

  /**
   * True if the argument's type was explicitly mentioned in the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasTypeSemanticEdge;

  /**
   * Whether the candidate is YouTube CAST_VIDEO candidate. CAST_VIDEO is a deeplink platform. This
   * signal will be used to promote YouTube Music screenful candidates with CAST_VIDEO platform for
   * free users because free users cannot get exact entities in screenless response and can get
   * exact entities with ads in screenful response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isCastVideo;

  /**
   * True if the media item in Binding Set is exclusively available on the provider in Binding set.
   * Example: "Stranger things" is exclusive to "Netflix".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isExclusiveOriginalProvider;

  /**
   * True if the media search query is included in the entity name and artists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isMediaSearchQuerySubsetOfEntityNameAndArtist;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isMostRecentSongAlbumAmbiguous;

  /**
   * True if the media deeplink has tag SEED_RADIO.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSeedRadio;

  /**
   * True if the user requests seed radio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSeedRadioRequest;

  /**
   * Provider is a self(user) reported subscripted provider
   * https://g3doc.corp.google.com/knowledge/g3doc/ump/development/GetProviderAffinity.md?cl=head
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSelfReportedSvodProvider;

  /**
   * Indicates whether this is youtube content seeking music.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isYoutubeMusicSeeking;

  /**
   * Account Type of the user for the provider
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaAccountType;

  /**
   * MediaAquaAction::media_content_type from interpretation. It can be used for cross-content type
   * ranking, for example, if a candidate's content type does not match this content type from
   * interpretation, this candidate will be slightly demoted. Also, we might avoid fetching some
   * signals when the content type is generic music, since some content types do not need ranking.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaContentType;

  /**
   * MSC(Media Short Click) rate. MSC rate = total number of MSC events / total number of MSC
   * candidates The event is considered as MSC candidate if the event is a media seeking
   * query(excluding follow-ons) and the media result is successfully fulfilled. The event is MSC
   * event if any of the following is in the following queries within 30 secs: FOLLOWED_BY_DUPLICATE
   * FOLLOWED_BY_ADD_OR_DELETE_MANUAL_REFINEMENT FOLLOWED_BY_SAME_VERTICAL (MEDIA) FOLLOWED_BY_STOP
   * More details: go/media-ranking, go/billboard-navboost, go/magma-music-actions-efrac
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float mscRate;

  /**
   * Scubed predicted SAI value (pSAI - SCUBED_MUSIC_ACTIONS) for music populated by a regression
   * model that incorporates a BERT model signal as well as other Scubed signals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double scubedPSaiMusic;

  /**
   * Scubed predicted SAI value (pSAI - SCUBED_TVM_ACTIONS) for music populated by a regression
   * model that incorporates a BERT model signal as well as other Scubed signals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double scubedPSaiTvm;

  /**
   * Type of the media item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double youtubeConfidenceScore;

  /**
   * Release type for an album container.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlbumReleaseType() {
    return albumReleaseType;
  }

  /**
   * Release type for an album container.
   * @param albumReleaseType albumReleaseType or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setAlbumReleaseType(java.lang.String albumReleaseType) {
    this.albumReleaseType = albumReleaseType;
    return this;
  }

  /**
   * Temporary ambiguity classifier signals.
   * @return value or {@code null} for none
   */
  public java.lang.String getAmbiguityClassifier() {
    return ambiguityClassifier;
  }

  /**
   * Temporary ambiguity classifier signals.
   * @param ambiguityClassifier ambiguityClassifier or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setAmbiguityClassifier(java.lang.String ambiguityClassifier) {
    this.ambiguityClassifier = ambiguityClassifier;
    return this;
  }

  /**
   * Mid of the media item. This is currently only used in manual rules.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityMid() {
    return entityMid;
  }

  /**
   * Mid of the media item. This is currently only used in manual rules.
   * @param entityMid entityMid or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setEntityMid(java.lang.String entityMid) {
    this.entityMid = entityMid;
    return this;
  }

  /**
   * True if the candidate has a CAST_VIDEO deeplink regardless of which provider was chosen.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasCastVideoDeeplink() {
    return hasCastVideoDeeplink;
  }

  /**
   * True if the candidate has a CAST_VIDEO deeplink regardless of which provider was chosen.
   * @param hasCastVideoDeeplink hasCastVideoDeeplink or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setHasCastVideoDeeplink(java.lang.Boolean hasCastVideoDeeplink) {
    this.hasCastVideoDeeplink = hasCastVideoDeeplink;
    return this;
  }

  /**
   * True if the argument's type was explicitly mentioned in the query.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasTypeSemanticEdge() {
    return hasTypeSemanticEdge;
  }

  /**
   * True if the argument's type was explicitly mentioned in the query.
   * @param hasTypeSemanticEdge hasTypeSemanticEdge or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setHasTypeSemanticEdge(java.lang.Boolean hasTypeSemanticEdge) {
    this.hasTypeSemanticEdge = hasTypeSemanticEdge;
    return this;
  }

  /**
   * Whether the candidate is YouTube CAST_VIDEO candidate. CAST_VIDEO is a deeplink platform. This
   * signal will be used to promote YouTube Music screenful candidates with CAST_VIDEO platform for
   * free users because free users cannot get exact entities in screenless response and can get
   * exact entities with ads in screenful response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCastVideo() {
    return isCastVideo;
  }

  /**
   * Whether the candidate is YouTube CAST_VIDEO candidate. CAST_VIDEO is a deeplink platform. This
   * signal will be used to promote YouTube Music screenful candidates with CAST_VIDEO platform for
   * free users because free users cannot get exact entities in screenless response and can get
   * exact entities with ads in screenful response.
   * @param isCastVideo isCastVideo or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsCastVideo(java.lang.Boolean isCastVideo) {
    this.isCastVideo = isCastVideo;
    return this;
  }

  /**
   * True if the media item in Binding Set is exclusively available on the provider in Binding set.
   * Example: "Stranger things" is exclusive to "Netflix".
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsExclusiveOriginalProvider() {
    return isExclusiveOriginalProvider;
  }

  /**
   * True if the media item in Binding Set is exclusively available on the provider in Binding set.
   * Example: "Stranger things" is exclusive to "Netflix".
   * @param isExclusiveOriginalProvider isExclusiveOriginalProvider or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsExclusiveOriginalProvider(java.lang.Boolean isExclusiveOriginalProvider) {
    this.isExclusiveOriginalProvider = isExclusiveOriginalProvider;
    return this;
  }

  /**
   * True if the media search query is included in the entity name and artists.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsMediaSearchQuerySubsetOfEntityNameAndArtist() {
    return isMediaSearchQuerySubsetOfEntityNameAndArtist;
  }

  /**
   * True if the media search query is included in the entity name and artists.
   * @param isMediaSearchQuerySubsetOfEntityNameAndArtist isMediaSearchQuerySubsetOfEntityNameAndArtist or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsMediaSearchQuerySubsetOfEntityNameAndArtist(java.lang.Boolean isMediaSearchQuerySubsetOfEntityNameAndArtist) {
    this.isMediaSearchQuerySubsetOfEntityNameAndArtist = isMediaSearchQuerySubsetOfEntityNameAndArtist;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsMostRecentSongAlbumAmbiguous() {
    return isMostRecentSongAlbumAmbiguous;
  }

  /**
   * @param isMostRecentSongAlbumAmbiguous isMostRecentSongAlbumAmbiguous or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsMostRecentSongAlbumAmbiguous(java.lang.Boolean isMostRecentSongAlbumAmbiguous) {
    this.isMostRecentSongAlbumAmbiguous = isMostRecentSongAlbumAmbiguous;
    return this;
  }

  /**
   * True if the media deeplink has tag SEED_RADIO.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSeedRadio() {
    return isSeedRadio;
  }

  /**
   * True if the media deeplink has tag SEED_RADIO.
   * @param isSeedRadio isSeedRadio or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsSeedRadio(java.lang.Boolean isSeedRadio) {
    this.isSeedRadio = isSeedRadio;
    return this;
  }

  /**
   * True if the user requests seed radio.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSeedRadioRequest() {
    return isSeedRadioRequest;
  }

  /**
   * True if the user requests seed radio.
   * @param isSeedRadioRequest isSeedRadioRequest or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsSeedRadioRequest(java.lang.Boolean isSeedRadioRequest) {
    this.isSeedRadioRequest = isSeedRadioRequest;
    return this;
  }

  /**
   * Provider is a self(user) reported subscripted provider
   * https://g3doc.corp.google.com/knowledge/g3doc/ump/development/GetProviderAffinity.md?cl=head
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSelfReportedSvodProvider() {
    return isSelfReportedSvodProvider;
  }

  /**
   * Provider is a self(user) reported subscripted provider
   * https://g3doc.corp.google.com/knowledge/g3doc/ump/development/GetProviderAffinity.md?cl=head
   * @param isSelfReportedSvodProvider isSelfReportedSvodProvider or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsSelfReportedSvodProvider(java.lang.Boolean isSelfReportedSvodProvider) {
    this.isSelfReportedSvodProvider = isSelfReportedSvodProvider;
    return this;
  }

  /**
   * Indicates whether this is youtube content seeking music.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsYoutubeMusicSeeking() {
    return isYoutubeMusicSeeking;
  }

  /**
   * Indicates whether this is youtube content seeking music.
   * @param isYoutubeMusicSeeking isYoutubeMusicSeeking or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setIsYoutubeMusicSeeking(java.lang.Boolean isYoutubeMusicSeeking) {
    this.isYoutubeMusicSeeking = isYoutubeMusicSeeking;
    return this;
  }

  /**
   * Account Type of the user for the provider
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaAccountType() {
    return mediaAccountType;
  }

  /**
   * Account Type of the user for the provider
   * @param mediaAccountType mediaAccountType or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setMediaAccountType(java.lang.String mediaAccountType) {
    this.mediaAccountType = mediaAccountType;
    return this;
  }

  /**
   * MediaAquaAction::media_content_type from interpretation. It can be used for cross-content type
   * ranking, for example, if a candidate's content type does not match this content type from
   * interpretation, this candidate will be slightly demoted. Also, we might avoid fetching some
   * signals when the content type is generic music, since some content types do not need ranking.
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaContentType() {
    return mediaContentType;
  }

  /**
   * MediaAquaAction::media_content_type from interpretation. It can be used for cross-content type
   * ranking, for example, if a candidate's content type does not match this content type from
   * interpretation, this candidate will be slightly demoted. Also, we might avoid fetching some
   * signals when the content type is generic music, since some content types do not need ranking.
   * @param mediaContentType mediaContentType or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setMediaContentType(java.lang.String mediaContentType) {
    this.mediaContentType = mediaContentType;
    return this;
  }

  /**
   * MSC(Media Short Click) rate. MSC rate = total number of MSC events / total number of MSC
   * candidates The event is considered as MSC candidate if the event is a media seeking
   * query(excluding follow-ons) and the media result is successfully fulfilled. The event is MSC
   * event if any of the following is in the following queries within 30 secs: FOLLOWED_BY_DUPLICATE
   * FOLLOWED_BY_ADD_OR_DELETE_MANUAL_REFINEMENT FOLLOWED_BY_SAME_VERTICAL (MEDIA) FOLLOWED_BY_STOP
   * More details: go/media-ranking, go/billboard-navboost, go/magma-music-actions-efrac
   * @return value or {@code null} for none
   */
  public java.lang.Float getMscRate() {
    return mscRate;
  }

  /**
   * MSC(Media Short Click) rate. MSC rate = total number of MSC events / total number of MSC
   * candidates The event is considered as MSC candidate if the event is a media seeking
   * query(excluding follow-ons) and the media result is successfully fulfilled. The event is MSC
   * event if any of the following is in the following queries within 30 secs: FOLLOWED_BY_DUPLICATE
   * FOLLOWED_BY_ADD_OR_DELETE_MANUAL_REFINEMENT FOLLOWED_BY_SAME_VERTICAL (MEDIA) FOLLOWED_BY_STOP
   * More details: go/media-ranking, go/billboard-navboost, go/magma-music-actions-efrac
   * @param mscRate mscRate or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setMscRate(java.lang.Float mscRate) {
    this.mscRate = mscRate;
    return this;
  }

  /**
   * Scubed predicted SAI value (pSAI - SCUBED_MUSIC_ACTIONS) for music populated by a regression
   * model that incorporates a BERT model signal as well as other Scubed signals.
   * @return value or {@code null} for none
   */
  public java.lang.Double getScubedPSaiMusic() {
    return scubedPSaiMusic;
  }

  /**
   * Scubed predicted SAI value (pSAI - SCUBED_MUSIC_ACTIONS) for music populated by a regression
   * model that incorporates a BERT model signal as well as other Scubed signals.
   * @param scubedPSaiMusic scubedPSaiMusic or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setScubedPSaiMusic(java.lang.Double scubedPSaiMusic) {
    this.scubedPSaiMusic = scubedPSaiMusic;
    return this;
  }

  /**
   * Scubed predicted SAI value (pSAI - SCUBED_TVM_ACTIONS) for music populated by a regression
   * model that incorporates a BERT model signal as well as other Scubed signals.
   * @return value or {@code null} for none
   */
  public java.lang.Double getScubedPSaiTvm() {
    return scubedPSaiTvm;
  }

  /**
   * Scubed predicted SAI value (pSAI - SCUBED_TVM_ACTIONS) for music populated by a regression
   * model that incorporates a BERT model signal as well as other Scubed signals.
   * @param scubedPSaiTvm scubedPSaiTvm or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setScubedPSaiTvm(java.lang.Double scubedPSaiTvm) {
    this.scubedPSaiTvm = scubedPSaiTvm;
    return this;
  }

  /**
   * Type of the media item.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the media item.
   * @param type type or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getYoutubeConfidenceScore() {
    return youtubeConfidenceScore;
  }

  /**
   * @param youtubeConfidenceScore youtubeConfidenceScore or {@code null} for none
   */
  public AssistantGroundingRankerMediaGroundingProviderFeatures setYoutubeConfidenceScore(java.lang.Double youtubeConfidenceScore) {
    this.youtubeConfidenceScore = youtubeConfidenceScore;
    return this;
  }

  @Override
  public AssistantGroundingRankerMediaGroundingProviderFeatures set(String fieldName, Object value) {
    return (AssistantGroundingRankerMediaGroundingProviderFeatures) super.set(fieldName, value);
  }

  @Override
  public AssistantGroundingRankerMediaGroundingProviderFeatures clone() {
    return (AssistantGroundingRankerMediaGroundingProviderFeatures) super.clone();
  }

}
