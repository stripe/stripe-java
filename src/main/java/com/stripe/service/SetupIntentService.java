// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.SetupIntent;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SetupIntentCancelParams;
import com.stripe.param.SetupIntentConfirmParams;
import com.stripe.param.SetupIntentCreateParams;
import com.stripe.param.SetupIntentListParams;
import com.stripe.param.SetupIntentRetrieveParams;
import com.stripe.param.SetupIntentUpdateParams;
import com.stripe.param.SetupIntentVerifyMicrodepositsParams;

public final class SetupIntentService extends ApiService {
  public SetupIntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of SetupIntents. */
  public StripeCollection<SetupIntent> list(SetupIntentListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of SetupIntents. */
  public StripeCollection<SetupIntent> list(RequestOptions options) throws StripeException {
    return list((SetupIntentListParams) null, options);
  }
  /** Returns a list of SetupIntents. */
  public StripeCollection<SetupIntent> list() throws StripeException {
    return list((SetupIntentListParams) null, (RequestOptions) null);
  }
  /** Returns a list of SetupIntents. */
  public StripeCollection<SetupIntent> list(SetupIntentListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<SetupIntent>>() {}.getType());
  }
  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public SetupIntent create(SetupIntentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public SetupIntent create(RequestOptions options) throws StripeException {
    return create((SetupIntentCreateParams) null, options);
  }
  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public SetupIntent create() throws StripeException {
    return create((SetupIntentCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public SetupIntent create(SetupIntentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, SetupIntent.class);
  }
  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public SetupIntent retrieve(String intent, SetupIntentRetrieveParams params)
      throws StripeException {
    return retrieve(intent, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public SetupIntent retrieve(String intent, RequestOptions options) throws StripeException {
    return retrieve(intent, (SetupIntentRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public SetupIntent retrieve(String intent) throws StripeException {
    return retrieve(intent, (SetupIntentRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public SetupIntent retrieve(
      String intent, SetupIntentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, SetupIntent.class);
  }
  /** Updates a SetupIntent object. */
  public SetupIntent update(String intent, SetupIntentUpdateParams params) throws StripeException {
    return update(intent, params, (RequestOptions) null);
  }
  /** Updates a SetupIntent object. */
  public SetupIntent update(String intent, RequestOptions options) throws StripeException {
    return update(intent, (SetupIntentUpdateParams) null, options);
  }
  /** Updates a SetupIntent object. */
  public SetupIntent update(String intent) throws StripeException {
    return update(intent, (SetupIntentUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a SetupIntent object. */
  public SetupIntent update(String intent, SetupIntentUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, SetupIntent.class);
  }
  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error.
   */
  public SetupIntent cancel(String intent, SetupIntentCancelParams params) throws StripeException {
    return cancel(intent, params, (RequestOptions) null);
  }
  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error.
   */
  public SetupIntent cancel(String intent, RequestOptions options) throws StripeException {
    return cancel(intent, (SetupIntentCancelParams) null, options);
  }
  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error.
   */
  public SetupIntent cancel(String intent) throws StripeException {
    return cancel(intent, (SetupIntentCancelParams) null, (RequestOptions) null);
  }
  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error.
   */
  public SetupIntent cancel(String intent, SetupIntentCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/setup_intents/%s/cancel", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, SetupIntent.class);
  }
  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(String intent, SetupIntentConfirmParams params)
      throws StripeException {
    return confirm(intent, params, (RequestOptions) null);
  }
  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(String intent, RequestOptions options) throws StripeException {
    return confirm(intent, (SetupIntentConfirmParams) null, options);
  }
  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(String intent) throws StripeException {
    return confirm(intent, (SetupIntentConfirmParams) null, (RequestOptions) null);
  }
  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(String intent, SetupIntentConfirmParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/setup_intents/%s/confirm", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, SetupIntent.class);
  }
  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(String intent, SetupIntentVerifyMicrodepositsParams params)
      throws StripeException {
    return verifyMicrodeposits(intent, params, (RequestOptions) null);
  }
  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(String intent, RequestOptions options)
      throws StripeException {
    return verifyMicrodeposits(intent, (SetupIntentVerifyMicrodepositsParams) null, options);
  }
  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(String intent) throws StripeException {
    return verifyMicrodeposits(
        intent, (SetupIntentVerifyMicrodepositsParams) null, (RequestOptions) null);
  }
  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(
      String intent, SetupIntentVerifyMicrodepositsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/setup_intents/%s/verify_microdeposits", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, SetupIntent.class);
  }
}
