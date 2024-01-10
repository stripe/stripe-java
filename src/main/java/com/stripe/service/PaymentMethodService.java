// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentMethod;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentMethodAttachParams;
import com.stripe.param.PaymentMethodCreateParams;
import com.stripe.param.PaymentMethodDetachParams;
import com.stripe.param.PaymentMethodListParams;
import com.stripe.param.PaymentMethodRetrieveParams;
import com.stripe.param.PaymentMethodUpdateParams;

public final class PaymentMethodService extends ApiService {
  public PaymentMethodService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
   */
  public PaymentMethod create(PaymentMethodCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
   */
  public PaymentMethod create(RequestOptions options) throws StripeException {
    return create((PaymentMethodCreateParams) null, options);
  }
  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
   */
  public PaymentMethod create() throws StripeException {
    return create((PaymentMethodCreateParams) null, (RequestOptions) null);
  }
  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
   */
  public PaymentMethod create(PaymentMethodCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_methods";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentMethod.class);
  }
  /**
   * Returns a list of PaymentMethods for Treasury flows. If you want to list the PaymentMethods
   * attached to a Customer for payments, you should use the <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a> API instead.
   */
  public StripeCollection<PaymentMethod> list(PaymentMethodListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of PaymentMethods for Treasury flows. If you want to list the PaymentMethods
   * attached to a Customer for payments, you should use the <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a> API instead.
   */
  public StripeCollection<PaymentMethod> list(RequestOptions options) throws StripeException {
    return list((PaymentMethodListParams) null, options);
  }
  /**
   * Returns a list of PaymentMethods for Treasury flows. If you want to list the PaymentMethods
   * attached to a Customer for payments, you should use the <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a> API instead.
   */
  public StripeCollection<PaymentMethod> list() throws StripeException {
    return list((PaymentMethodListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of PaymentMethods for Treasury flows. If you want to list the PaymentMethods
   * attached to a Customer for payments, you should use the <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a> API instead.
   */
  public StripeCollection<PaymentMethod> list(
      PaymentMethodListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_methods";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<PaymentMethod>>() {}.getType());
  }
  /**
   * Retrieves a PaymentMethod object attached to the StripeAccount. To retrieve a payment method
   * attached to a Customer, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer">Retrieve a Customer’s
   * PaymentMethods</a>
   */
  public PaymentMethod retrieve(String paymentMethod, PaymentMethodRetrieveParams params)
      throws StripeException {
    return retrieve(paymentMethod, params, (RequestOptions) null);
  }
  /**
   * Retrieves a PaymentMethod object attached to the StripeAccount. To retrieve a payment method
   * attached to a Customer, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer">Retrieve a Customer’s
   * PaymentMethods</a>
   */
  public PaymentMethod retrieve(String paymentMethod, RequestOptions options)
      throws StripeException {
    return retrieve(paymentMethod, (PaymentMethodRetrieveParams) null, options);
  }
  /**
   * Retrieves a PaymentMethod object attached to the StripeAccount. To retrieve a payment method
   * attached to a Customer, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer">Retrieve a Customer’s
   * PaymentMethods</a>
   */
  public PaymentMethod retrieve(String paymentMethod) throws StripeException {
    return retrieve(paymentMethod, (PaymentMethodRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a PaymentMethod object attached to the StripeAccount. To retrieve a payment method
   * attached to a Customer, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer">Retrieve a Customer’s
   * PaymentMethods</a>
   */
  public PaymentMethod retrieve(
      String paymentMethod, PaymentMethodRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_methods/%s", ApiResource.urlEncodeId(paymentMethod));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentMethod.class);
  }
  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(String paymentMethod, PaymentMethodUpdateParams params)
      throws StripeException {
    return update(paymentMethod, params, (RequestOptions) null);
  }
  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(String paymentMethod, RequestOptions options) throws StripeException {
    return update(paymentMethod, (PaymentMethodUpdateParams) null, options);
  }
  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(String paymentMethod) throws StripeException {
    return update(paymentMethod, (PaymentMethodUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(
      String paymentMethod, PaymentMethodUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_methods/%s", ApiResource.urlEncodeId(paymentMethod));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentMethod.class);
  }
  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To attach a new PaymentMethod to a customer for future payments, we recommend you use a <a
   * href="https://stripe.com/docs/api/setup_intents">SetupIntent</a> or a PaymentIntent with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-setup_future_usage">setup_future_usage</a>.
   * These approaches will perform any necessary steps to set up the PaymentMethod for future
   * payments. Using the {@code /v1/payment_methods/:id/attach} endpoint without first using a
   * SetupIntent or PaymentIntent with {@code setup_future_usage} does not optimize the
   * PaymentMethod for future use, which makes later declines and payment friction more likely. See
   * <a href="https://stripe.com/docs/payments/payment-intents#future-usage">Optimizing cards for
   * future payments</a> for more information about setting up future payments.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">{@code
   * invoice_settings.default_payment_method}</a>, on the Customer to the PaymentMethod’s ID.
   */
  public PaymentMethod attach(String paymentMethod, PaymentMethodAttachParams params)
      throws StripeException {
    return attach(paymentMethod, params, (RequestOptions) null);
  }
  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To attach a new PaymentMethod to a customer for future payments, we recommend you use a <a
   * href="https://stripe.com/docs/api/setup_intents">SetupIntent</a> or a PaymentIntent with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-setup_future_usage">setup_future_usage</a>.
   * These approaches will perform any necessary steps to set up the PaymentMethod for future
   * payments. Using the {@code /v1/payment_methods/:id/attach} endpoint without first using a
   * SetupIntent or PaymentIntent with {@code setup_future_usage} does not optimize the
   * PaymentMethod for future use, which makes later declines and payment friction more likely. See
   * <a href="https://stripe.com/docs/payments/payment-intents#future-usage">Optimizing cards for
   * future payments</a> for more information about setting up future payments.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">{@code
   * invoice_settings.default_payment_method}</a>, on the Customer to the PaymentMethod’s ID.
   */
  public PaymentMethod attach(
      String paymentMethod, PaymentMethodAttachParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_methods/%s/attach", ApiResource.urlEncodeId(paymentMethod));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentMethod.class);
  }
  /**
   * Detaches a PaymentMethod object from a Customer. After a PaymentMethod is detached, it can no
   * longer be used for a payment or re-attached to a Customer.
   */
  public PaymentMethod detach(String paymentMethod, PaymentMethodDetachParams params)
      throws StripeException {
    return detach(paymentMethod, params, (RequestOptions) null);
  }
  /**
   * Detaches a PaymentMethod object from a Customer. After a PaymentMethod is detached, it can no
   * longer be used for a payment or re-attached to a Customer.
   */
  public PaymentMethod detach(String paymentMethod, RequestOptions options) throws StripeException {
    return detach(paymentMethod, (PaymentMethodDetachParams) null, options);
  }
  /**
   * Detaches a PaymentMethod object from a Customer. After a PaymentMethod is detached, it can no
   * longer be used for a payment or re-attached to a Customer.
   */
  public PaymentMethod detach(String paymentMethod) throws StripeException {
    return detach(paymentMethod, (PaymentMethodDetachParams) null, (RequestOptions) null);
  }
  /**
   * Detaches a PaymentMethod object from a Customer. After a PaymentMethod is detached, it can no
   * longer be used for a payment or re-attached to a Customer.
   */
  public PaymentMethod detach(
      String paymentMethod, PaymentMethodDetachParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_methods/%s/detach", ApiResource.urlEncodeId(paymentMethod));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, PaymentMethod.class);
  }
}
