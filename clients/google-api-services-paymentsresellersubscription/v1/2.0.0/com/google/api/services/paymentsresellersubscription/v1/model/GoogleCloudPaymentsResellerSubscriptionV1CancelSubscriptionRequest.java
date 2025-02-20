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

package com.google.api.services.paymentsresellersubscription.v1.model;

/**
 * Request to cancel a subscription.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Payments Reseller Subscription API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If true, Google will cancel the subscription immediately, and may or may not (based
   * on the contract) issue a prorated refund for the remainder of the billing cycle. Otherwise,
   * Google defers the cancelation at renewal_time, and will not issue a refund.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cancelImmediately;

  /**
   * Specifies the reason for the cancellation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cancellationReason;

  /**
   * Optional. If true, Google will cancel the subscription immediately, and may or may not (based
   * on the contract) issue a prorated refund for the remainder of the billing cycle. Otherwise,
   * Google defers the cancelation at renewal_time, and will not issue a refund.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCancelImmediately() {
    return cancelImmediately;
  }

  /**
   * Optional. If true, Google will cancel the subscription immediately, and may or may not (based
   * on the contract) issue a prorated refund for the remainder of the billing cycle. Otherwise,
   * Google defers the cancelation at renewal_time, and will not issue a refund.
   * @param cancelImmediately cancelImmediately or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest setCancelImmediately(java.lang.Boolean cancelImmediately) {
    this.cancelImmediately = cancelImmediately;
    return this;
  }

  /**
   * Specifies the reason for the cancellation.
   * @return value or {@code null} for none
   */
  public java.lang.String getCancellationReason() {
    return cancellationReason;
  }

  /**
   * Specifies the reason for the cancellation.
   * @param cancellationReason cancellationReason or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest setCancellationReason(java.lang.String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest set(String fieldName, Object value) {
    return (GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest clone() {
    return (GoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest) super.clone();
  }

}
