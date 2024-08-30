// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentIntentApplyCustomerBalanceParams;
import com.stripe.param.PaymentIntentCancelParams;
import com.stripe.param.PaymentIntentCaptureParams;
import com.stripe.param.PaymentIntentConfirmParams;
import com.stripe.param.PaymentIntentCreateParams;
import com.stripe.param.PaymentIntentDecrementAuthorizationParams;
import com.stripe.param.PaymentIntentIncrementAuthorizationParams;
import com.stripe.param.PaymentIntentListParams;
import com.stripe.param.PaymentIntentRetrieveParams;
import com.stripe.param.PaymentIntentSearchParams;
import com.stripe.param.PaymentIntentUpdateParams;
import com.stripe.param.PaymentIntentVerifyMicrodepositsParams;

public final class PaymentIntentService extends ApiService {
  public PaymentIntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of PaymentIntents. */
  public StripeCollection<PaymentIntent> list(PaymentIntentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of PaymentIntents. */
  public StripeCollection<PaymentIntent> list(RequestOptions options) throws StripeException {
    return list((PaymentIntentListParams) null, options);
  }
  /** Returns a list of PaymentIntents. */
  public StripeCollection<PaymentIntent> list() throws StripeException {
    return list((PaymentIntentListParams) null, (RequestOptions) null);
  }
  /** Returns a list of PaymentIntents. */
  public StripeCollection<PaymentIntent> list(
      PaymentIntentListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PaymentIntent>>() {}.getType());
  }
  /**
   * Creates a PaymentIntent object.
   *
   * <p>After the PaymentIntent is created, attach a payment method and <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm</a> to continue the payment.
   * Learn more about <a href="https://stripe.com/docs/payments/payment-intents">the available
   * payment flows with the Payment Intents API</a>.
   *
   * <p>When you use {@code confirm=true} during creation, it’s equivalent to creating and
   * confirming the PaymentIntent in the same call. You can use any parameters available in the <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm API</a> when you supply
   * {@code confirm=true}.
   */
  public PaymentIntent create(PaymentIntentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a PaymentIntent object.
   *
   * <p>After the PaymentIntent is created, attach a payment method and <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm</a> to continue the payment.
   * Learn more about <a href="https://stripe.com/docs/payments/payment-intents">the available
   * payment flows with the Payment Intents API</a>.
   *
   * <p>When you use {@code confirm=true} during creation, it’s equivalent to creating and
   * confirming the PaymentIntent in the same call. You can use any parameters available in the <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm API</a> when you supply
   * {@code confirm=true}.
   */
  public PaymentIntent create(PaymentIntentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>You can retrieve a PaymentIntent client-side using a publishable key when the {@code
   * client_secret} is in the query string.
   *
   * <p>If you retrieve a PaymentIntent with a publishable key, it only returns a subset of
   * properties. Refer to the <a href="https://stripe.com/docs/api#payment_intent_object">payment
   * intent</a> object reference for more details.
   */
  public PaymentIntent retrieve(String intent, PaymentIntentRetrieveParams params)
      throws StripeException {
    return retrieve(intent, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>You can retrieve a PaymentIntent client-side using a publishable key when the {@code
   * client_secret} is in the query string.
   *
   * <p>If you retrieve a PaymentIntent with a publishable key, it only returns a subset of
   * properties. Refer to the <a href="https://stripe.com/docs/api#payment_intent_object">payment
   * intent</a> object reference for more details.
   */
  public PaymentIntent retrieve(String intent, RequestOptions options) throws StripeException {
    return retrieve(intent, (PaymentIntentRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>You can retrieve a PaymentIntent client-side using a publishable key when the {@code
   * client_secret} is in the query string.
   *
   * <p>If you retrieve a PaymentIntent with a publishable key, it only returns a subset of
   * properties. Refer to the <a href="https://stripe.com/docs/api#payment_intent_object">payment
   * intent</a> object reference for more details.
   */
  public PaymentIntent retrieve(String intent) throws StripeException {
    return retrieve(intent, (PaymentIntentRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a PaymentIntent that has previously been created.
   *
   * <p>You can retrieve a PaymentIntent client-side using a publishable key when the {@code
   * client_secret} is in the query string.
   *
   * <p>If you retrieve a PaymentIntent with a publishable key, it only returns a subset of
   * properties. Refer to the <a href="https://stripe.com/docs/api#payment_intent_object">payment
   * intent</a> object reference for more details.
   */
  public PaymentIntent retrieve(
      String intent, PaymentIntentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_intents/%s", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * Updates properties on a PaymentIntent object without confirming.
   *
   * <p>Depending on which properties you update, you might need to confirm the PaymentIntent again.
   * For example, updating the {@code payment_method} always requires you to confirm the
   * PaymentIntent again. If you prefer to update and confirm at the same time, we recommend
   * updating properties through the <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm API</a> instead.
   */
  public PaymentIntent update(String intent, PaymentIntentUpdateParams params)
      throws StripeException {
    return update(intent, params, (RequestOptions) null);
  }
  /**
   * Updates properties on a PaymentIntent object without confirming.
   *
   * <p>Depending on which properties you update, you might need to confirm the PaymentIntent again.
   * For example, updating the {@code payment_method} always requires you to confirm the
   * PaymentIntent again. If you prefer to update and confirm at the same time, we recommend
   * updating properties through the <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm API</a> instead.
   */
  public PaymentIntent update(String intent, RequestOptions options) throws StripeException {
    return update(intent, (PaymentIntentUpdateParams) null, options);
  }
  /**
   * Updates properties on a PaymentIntent object without confirming.
   *
   * <p>Depending on which properties you update, you might need to confirm the PaymentIntent again.
   * For example, updating the {@code payment_method} always requires you to confirm the
   * PaymentIntent again. If you prefer to update and confirm at the same time, we recommend
   * updating properties through the <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm API</a> instead.
   */
  public PaymentIntent update(String intent) throws StripeException {
    return update(intent, (PaymentIntentUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates properties on a PaymentIntent object without confirming.
   *
   * <p>Depending on which properties you update, you might need to confirm the PaymentIntent again.
   * For example, updating the {@code payment_method} always requires you to confirm the
   * PaymentIntent again. If you prefer to update and confirm at the same time, we recommend
   * updating properties through the <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm API</a> instead.
   */
  public PaymentIntent update(
      String intent, PaymentIntentUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_intents/%s", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * Search for PaymentIntents you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<PaymentIntent> search(PaymentIntentSearchParams params)
      throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Search for PaymentIntents you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<PaymentIntent> search(
      PaymentIntentSearchParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_intents/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeSearchResult<PaymentIntent>>() {}.getType());
  }
  /** Manually reconcile the remaining amount for a {@code customer_balance} PaymentIntent. */
  public PaymentIntent applyCustomerBalance(
      String intent, PaymentIntentApplyCustomerBalanceParams params) throws StripeException {
    return applyCustomerBalance(intent, params, (RequestOptions) null);
  }
  /** Manually reconcile the remaining amount for a {@code customer_balance} PaymentIntent. */
  public PaymentIntent applyCustomerBalance(String intent, RequestOptions options)
      throws StripeException {
    return applyCustomerBalance(intent, (PaymentIntentApplyCustomerBalanceParams) null, options);
  }
  /** Manually reconcile the remaining amount for a {@code customer_balance} PaymentIntent. */
  public PaymentIntent applyCustomerBalance(String intent) throws StripeException {
    return applyCustomerBalance(
        intent, (PaymentIntentApplyCustomerBalanceParams) null, (RequestOptions) null);
  }
  /** Manually reconcile the remaining amount for a {@code customer_balance} PaymentIntent. */
  public PaymentIntent applyCustomerBalance(
      String intent, PaymentIntentApplyCustomerBalanceParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_intents/%s/apply_customer_balance", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * You can cancel a PaymentIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_capture}, {@code requires_confirmation}, {@code
   * requires_action} or, <a href="https://stripe.com/docs/payments/intents">in rare cases</a>,
   * {@code processing}.
   *
   * <p>After it’s canceled, no additional charges are made by the PaymentIntent and any operations
   * on the PaymentIntent fail with an error. For PaymentIntents with a {@code status} of {@code
   * requires_capture}, the remaining {@code amount_capturable} is automatically refunded.
   *
   * <p>You can’t cancel the PaymentIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public PaymentIntent cancel(String intent, PaymentIntentCancelParams params)
      throws StripeException {
    return cancel(intent, params, (RequestOptions) null);
  }
  /**
   * You can cancel a PaymentIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_capture}, {@code requires_confirmation}, {@code
   * requires_action} or, <a href="https://stripe.com/docs/payments/intents">in rare cases</a>,
   * {@code processing}.
   *
   * <p>After it’s canceled, no additional charges are made by the PaymentIntent and any operations
   * on the PaymentIntent fail with an error. For PaymentIntents with a {@code status} of {@code
   * requires_capture}, the remaining {@code amount_capturable} is automatically refunded.
   *
   * <p>You can’t cancel the PaymentIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public PaymentIntent cancel(String intent, RequestOptions options) throws StripeException {
    return cancel(intent, (PaymentIntentCancelParams) null, options);
  }
  /**
   * You can cancel a PaymentIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_capture}, {@code requires_confirmation}, {@code
   * requires_action} or, <a href="https://stripe.com/docs/payments/intents">in rare cases</a>,
   * {@code processing}.
   *
   * <p>After it’s canceled, no additional charges are made by the PaymentIntent and any operations
   * on the PaymentIntent fail with an error. For PaymentIntents with a {@code status} of {@code
   * requires_capture}, the remaining {@code amount_capturable} is automatically refunded.
   *
   * <p>You can’t cancel the PaymentIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public PaymentIntent cancel(String intent) throws StripeException {
    return cancel(intent, (PaymentIntentCancelParams) null, (RequestOptions) null);
  }
  /**
   * You can cancel a PaymentIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_capture}, {@code requires_confirmation}, {@code
   * requires_action} or, <a href="https://stripe.com/docs/payments/intents">in rare cases</a>,
   * {@code processing}.
   *
   * <p>After it’s canceled, no additional charges are made by the PaymentIntent and any operations
   * on the PaymentIntent fail with an error. For PaymentIntents with a {@code status} of {@code
   * requires_capture}, the remaining {@code amount_capturable} is automatically refunded.
   *
   * <p>You can’t cancel the PaymentIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public PaymentIntent cancel(
      String intent, PaymentIntentCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_intents/%s/cancel", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is {@code
   * requires_capture}.
   *
   * <p>Uncaptured PaymentIntents are cancelled a set number of days (7 by default) after their
   * creation.
   *
   * <p>Learn more about <a href="https://stripe.com/docs/payments/capture-later">separate
   * authorization and capture</a>.
   */
  public PaymentIntent capture(String intent, PaymentIntentCaptureParams params)
      throws StripeException {
    return capture(intent, params, (RequestOptions) null);
  }
  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is {@code
   * requires_capture}.
   *
   * <p>Uncaptured PaymentIntents are cancelled a set number of days (7 by default) after their
   * creation.
   *
   * <p>Learn more about <a href="https://stripe.com/docs/payments/capture-later">separate
   * authorization and capture</a>.
   */
  public PaymentIntent capture(String intent, RequestOptions options) throws StripeException {
    return capture(intent, (PaymentIntentCaptureParams) null, options);
  }
  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is {@code
   * requires_capture}.
   *
   * <p>Uncaptured PaymentIntents are cancelled a set number of days (7 by default) after their
   * creation.
   *
   * <p>Learn more about <a href="https://stripe.com/docs/payments/capture-later">separate
   * authorization and capture</a>.
   */
  public PaymentIntent capture(String intent) throws StripeException {
    return capture(intent, (PaymentIntentCaptureParams) null, (RequestOptions) null);
  }
  /**
   * Capture the funds of an existing uncaptured PaymentIntent when its status is {@code
   * requires_capture}.
   *
   * <p>Uncaptured PaymentIntents are cancelled a set number of days (7 by default) after their
   * creation.
   *
   * <p>Learn more about <a href="https://stripe.com/docs/payments/capture-later">separate
   * authorization and capture</a>.
   */
  public PaymentIntent capture(
      String intent, PaymentIntentCaptureParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_intents/%s/capture", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment. If the selected payment
   * method requires additional authentication steps, the PaymentIntent will transition to the
   * {@code requires_action} status and suggest additional actions via {@code next_action}. If
   * payment fails, the PaymentIntent transitions to the {@code requires_payment_method} status or
   * the {@code canceled} status if the confirmation limit is reached. If payment succeeds, the
   * PaymentIntent will transition to the {@code succeeded} status (or {@code requires_capture}, if
   * {@code capture_method} is set to {@code manual}). If the {@code confirmation_method} is {@code
   * automatic}, payment may be attempted using our <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a>
   * and the PaymentIntent’s <a
   * href="https://stripe.com/docs/api#payment_intent_object-client_secret">client_secret</a>. After
   * {@code next_action}s are handled by the client, no additional confirmation is required to
   * complete the payment. If the {@code confirmation_method} is {@code manual}, all payment
   * attempts must be initiated using a secret key. If any actions are required for the payment, the
   * PaymentIntent will return to the {@code requires_confirmation} state after those actions are
   * completed. Your server needs to then explicitly re-confirm the PaymentIntent to initiate the
   * next payment attempt.
   */
  public PaymentIntent confirm(String intent, PaymentIntentConfirmParams params)
      throws StripeException {
    return confirm(intent, params, (RequestOptions) null);
  }
  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment. If the selected payment
   * method requires additional authentication steps, the PaymentIntent will transition to the
   * {@code requires_action} status and suggest additional actions via {@code next_action}. If
   * payment fails, the PaymentIntent transitions to the {@code requires_payment_method} status or
   * the {@code canceled} status if the confirmation limit is reached. If payment succeeds, the
   * PaymentIntent will transition to the {@code succeeded} status (or {@code requires_capture}, if
   * {@code capture_method} is set to {@code manual}). If the {@code confirmation_method} is {@code
   * automatic}, payment may be attempted using our <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a>
   * and the PaymentIntent’s <a
   * href="https://stripe.com/docs/api#payment_intent_object-client_secret">client_secret</a>. After
   * {@code next_action}s are handled by the client, no additional confirmation is required to
   * complete the payment. If the {@code confirmation_method} is {@code manual}, all payment
   * attempts must be initiated using a secret key. If any actions are required for the payment, the
   * PaymentIntent will return to the {@code requires_confirmation} state after those actions are
   * completed. Your server needs to then explicitly re-confirm the PaymentIntent to initiate the
   * next payment attempt.
   */
  public PaymentIntent confirm(String intent, RequestOptions options) throws StripeException {
    return confirm(intent, (PaymentIntentConfirmParams) null, options);
  }
  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment. If the selected payment
   * method requires additional authentication steps, the PaymentIntent will transition to the
   * {@code requires_action} status and suggest additional actions via {@code next_action}. If
   * payment fails, the PaymentIntent transitions to the {@code requires_payment_method} status or
   * the {@code canceled} status if the confirmation limit is reached. If payment succeeds, the
   * PaymentIntent will transition to the {@code succeeded} status (or {@code requires_capture}, if
   * {@code capture_method} is set to {@code manual}). If the {@code confirmation_method} is {@code
   * automatic}, payment may be attempted using our <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a>
   * and the PaymentIntent’s <a
   * href="https://stripe.com/docs/api#payment_intent_object-client_secret">client_secret</a>. After
   * {@code next_action}s are handled by the client, no additional confirmation is required to
   * complete the payment. If the {@code confirmation_method} is {@code manual}, all payment
   * attempts must be initiated using a secret key. If any actions are required for the payment, the
   * PaymentIntent will return to the {@code requires_confirmation} state after those actions are
   * completed. Your server needs to then explicitly re-confirm the PaymentIntent to initiate the
   * next payment attempt.
   */
  public PaymentIntent confirm(String intent) throws StripeException {
    return confirm(intent, (PaymentIntentConfirmParams) null, (RequestOptions) null);
  }
  /**
   * Confirm that your customer intends to pay with current or provided payment method. Upon
   * confirmation, the PaymentIntent will attempt to initiate a payment. If the selected payment
   * method requires additional authentication steps, the PaymentIntent will transition to the
   * {@code requires_action} status and suggest additional actions via {@code next_action}. If
   * payment fails, the PaymentIntent transitions to the {@code requires_payment_method} status or
   * the {@code canceled} status if the confirmation limit is reached. If payment succeeds, the
   * PaymentIntent will transition to the {@code succeeded} status (or {@code requires_capture}, if
   * {@code capture_method} is set to {@code manual}). If the {@code confirmation_method} is {@code
   * automatic}, payment may be attempted using our <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-handle-card-payment">client SDKs</a>
   * and the PaymentIntent’s <a
   * href="https://stripe.com/docs/api#payment_intent_object-client_secret">client_secret</a>. After
   * {@code next_action}s are handled by the client, no additional confirmation is required to
   * complete the payment. If the {@code confirmation_method} is {@code manual}, all payment
   * attempts must be initiated using a secret key. If any actions are required for the payment, the
   * PaymentIntent will return to the {@code requires_confirmation} state after those actions are
   * completed. Your server needs to then explicitly re-confirm the PaymentIntent to initiate the
   * next payment attempt.
   */
  public PaymentIntent confirm(
      String intent, PaymentIntentConfirmParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_intents/%s/confirm", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * Perform a decremental authorization on an eligible <a
   * href="https://stripe.com/docs/api/payment_intents/object">PaymentIntent</a>. To be eligible,
   * the PaymentIntent’s status must be {@code requires_capture} and <a
   * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-card-decremental_authorization">decremental_authorization.status</a>
   * must be {@code available}.
   *
   * <p>Decremental authorizations decrease the authorized amount on your customer’s card to the
   * new, lower {@code amount} provided. A single PaymentIntent can call this endpoint multiple
   * times to further decrease the authorized amount.
   *
   * <p>After decrement, the PaymentIntent object returns with the updated <a
   * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-amount">amount</a>.
   * The PaymentIntent will now be capturable up to the new authorized amount.
   *
   * <p>Each PaymentIntent can have a maximum of 10 decremental or incremental authorization
   * attempts, including declines. After it’s fully captured, a PaymentIntent can no longer be
   * decremented.
   */
  public PaymentIntent decrementAuthorization(
      String intent, PaymentIntentDecrementAuthorizationParams params) throws StripeException {
    return decrementAuthorization(intent, params, (RequestOptions) null);
  }
  /**
   * Perform a decremental authorization on an eligible <a
   * href="https://stripe.com/docs/api/payment_intents/object">PaymentIntent</a>. To be eligible,
   * the PaymentIntent’s status must be {@code requires_capture} and <a
   * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-card-decremental_authorization">decremental_authorization.status</a>
   * must be {@code available}.
   *
   * <p>Decremental authorizations decrease the authorized amount on your customer’s card to the
   * new, lower {@code amount} provided. A single PaymentIntent can call this endpoint multiple
   * times to further decrease the authorized amount.
   *
   * <p>After decrement, the PaymentIntent object returns with the updated <a
   * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-amount">amount</a>.
   * The PaymentIntent will now be capturable up to the new authorized amount.
   *
   * <p>Each PaymentIntent can have a maximum of 10 decremental or incremental authorization
   * attempts, including declines. After it’s fully captured, a PaymentIntent can no longer be
   * decremented.
   */
  public PaymentIntent decrementAuthorization(
      String intent, PaymentIntentDecrementAuthorizationParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_intents/%s/decrement_authorization", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, PaymentIntent.class);
  }
  /**
   * Perform an incremental authorization on an eligible <a
   * href="https://stripe.com/docs/api/payment_intents/object">PaymentIntent</a>. To be eligible,
   * the PaymentIntent’s status must be {@code requires_capture} and <a
   * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-card_present-incremental_authorization_supported">incremental_authorization_supported</a>
   * must be {@code true}.
   *
   * <p>Incremental authorizations attempt to increase the authorized amount on your customer’s card
   * to the new, higher {@code amount} provided. Similar to the initial authorization, incremental
   * authorizations can be declined. A single PaymentIntent can call this endpoint multiple times to
   * further increase the authorized amount.
   *
   * <p>If the incremental authorization succeeds, the PaymentIntent object returns with the updated
   * <a
   * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-amount">amount</a>.
   * If the incremental authorization fails, a <a
   * href="https://stripe.com/docs/error-codes#card-declined">card_declined</a> error returns, and
   * no other fields on the PaymentIntent or Charge update. The PaymentIntent object remains
   * capturable for the previously authorized amount.
   *
   * <p>Each PaymentIntent can have a maximum of 10 incremental authorization attempts, including
   * declines. After it’s captured, a PaymentIntent can no longer be incremented.
   *
   * <p>Learn more about <a
   * href="https://stripe.com/docs/terminal/features/incremental-authorizations">incremental
   * authorizations</a>.
   */
  public PaymentIntent incrementAuthorization(
      String intent, PaymentIntentIncrementAuthorizationParams params) throws StripeException {
    return incrementAuthorization(intent, params, (RequestOptions) null);
  }
  /**
   * Perform an incremental authorization on an eligible <a
   * href="https://stripe.com/docs/api/payment_intents/object">PaymentIntent</a>. To be eligible,
   * the PaymentIntent’s status must be {@code requires_capture} and <a
   * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-card_present-incremental_authorization_supported">incremental_authorization_supported</a>
   * must be {@code true}.
   *
   * <p>Incremental authorizations attempt to increase the authorized amount on your customer’s card
   * to the new, higher {@code amount} provided. Similar to the initial authorization, incremental
   * authorizations can be declined. A single PaymentIntent can call this endpoint multiple times to
   * further increase the authorized amount.
   *
   * <p>If the incremental authorization succeeds, the PaymentIntent object returns with the updated
   * <a
   * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-amount">amount</a>.
   * If the incremental authorization fails, a <a
   * href="https://stripe.com/docs/error-codes#card-declined">card_declined</a> error returns, and
   * no other fields on the PaymentIntent or Charge update. The PaymentIntent object remains
   * capturable for the previously authorized amount.
   *
   * <p>Each PaymentIntent can have a maximum of 10 incremental authorization attempts, including
   * declines. After it’s captured, a PaymentIntent can no longer be incremented.
   *
   * <p>Learn more about <a
   * href="https://stripe.com/docs/terminal/features/incremental-authorizations">incremental
   * authorizations</a>.
   */
  public PaymentIntent incrementAuthorization(
      String intent, PaymentIntentIncrementAuthorizationParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_intents/%s/increment_authorization", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
  /** Verifies microdeposits on a PaymentIntent object. */
  public PaymentIntent verifyMicrodeposits(
      String intent, PaymentIntentVerifyMicrodepositsParams params) throws StripeException {
    return verifyMicrodeposits(intent, params, (RequestOptions) null);
  }
  /** Verifies microdeposits on a PaymentIntent object. */
  public PaymentIntent verifyMicrodeposits(String intent, RequestOptions options)
      throws StripeException {
    return verifyMicrodeposits(intent, (PaymentIntentVerifyMicrodepositsParams) null, options);
  }
  /** Verifies microdeposits on a PaymentIntent object. */
  public PaymentIntent verifyMicrodeposits(String intent) throws StripeException {
    return verifyMicrodeposits(
        intent, (PaymentIntentVerifyMicrodepositsParams) null, (RequestOptions) null);
  }
  /** Verifies microdeposits on a PaymentIntent object. */
  public PaymentIntent verifyMicrodeposits(
      String intent, PaymentIntentVerifyMicrodepositsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_intents/%s/verify_microdeposits", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentIntent.class);
  }
}
