// File generated from our OpenAPI spec
package com.stripe.service.terminal;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.terminal.Reader;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ReaderActivateGiftCardParams;
import com.stripe.param.terminal.ReaderCancelActionParams;
import com.stripe.param.terminal.ReaderCashoutGiftCardParams;
import com.stripe.param.terminal.ReaderCheckGiftCardBalanceParams;
import com.stripe.param.terminal.ReaderCollectInputsParams;
import com.stripe.param.terminal.ReaderCollectPaymentMethodParams;
import com.stripe.param.terminal.ReaderConfirmPaymentIntentParams;
import com.stripe.param.terminal.ReaderCreateParams;
import com.stripe.param.terminal.ReaderListParams;
import com.stripe.param.terminal.ReaderProcessPaymentIntentParams;
import com.stripe.param.terminal.ReaderProcessSetupIntentParams;
import com.stripe.param.terminal.ReaderRefundPaymentParams;
import com.stripe.param.terminal.ReaderReloadGiftCardParams;
import com.stripe.param.terminal.ReaderRetrieveParams;
import com.stripe.param.terminal.ReaderSetReaderDisplayParams;
import com.stripe.param.terminal.ReaderUpdateParams;

public final class ReaderService extends ApiService {
  public ReaderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Deletes a {@code Reader} object. */
  public Reader delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /** Deletes a {@code Reader} object. */
  public Reader delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, Reader.class);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String id, ReaderRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ReaderRetrieveParams) null, options);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String id) throws StripeException {
    return retrieve(id, (ReaderRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a {@code Reader} object. */
  public Reader retrieve(String id, ReaderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String id, ReaderUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String id, RequestOptions options) throws StripeException {
    return update(id, (ReaderUpdateParams) null, options);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String id) throws StripeException {
    return update(id, (ReaderUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(String id, ReaderUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list(ReaderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list(RequestOptions options) throws StripeException {
    return list((ReaderListParams) null, options);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list() throws StripeException {
    return list((ReaderListParams) null, (RequestOptions) null);
  }
  /** Returns a list of {@code Reader} objects. */
  public StripeCollection<Reader> list(ReaderListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/terminal/readers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Reader>>() {}.getType());
  }
  /** Creates a new {@code Reader} object. */
  public Reader create(ReaderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new {@code Reader} object. */
  public Reader create(ReaderCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/terminal/readers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /** Initiates a gift card activation flow on a Reader and optionally sets its balance. */
  public Reader activateGiftCard(String id, ReaderActivateGiftCardParams params)
      throws StripeException {
    return activateGiftCard(id, params, (RequestOptions) null);
  }
  /** Initiates a gift card activation flow on a Reader and optionally sets its balance. */
  public Reader activateGiftCard(
      String id, ReaderActivateGiftCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/activate_gift_card", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Cancels the current reader action. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven#programmatic-cancellation">Programmatic
   * Cancellation</a> for more details.
   */
  public Reader cancelAction(String id, ReaderCancelActionParams params) throws StripeException {
    return cancelAction(id, params, (RequestOptions) null);
  }
  /**
   * Cancels the current reader action. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven#programmatic-cancellation">Programmatic
   * Cancellation</a> for more details.
   */
  public Reader cancelAction(String id, RequestOptions options) throws StripeException {
    return cancelAction(id, (ReaderCancelActionParams) null, options);
  }
  /**
   * Cancels the current reader action. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven#programmatic-cancellation">Programmatic
   * Cancellation</a> for more details.
   */
  public Reader cancelAction(String id) throws StripeException {
    return cancelAction(id, (ReaderCancelActionParams) null, (RequestOptions) null);
  }
  /**
   * Cancels the current reader action. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven#programmatic-cancellation">Programmatic
   * Cancellation</a> for more details.
   */
  public Reader cancelAction(String id, ReaderCancelActionParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/cancel_action", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /** Initiates a gift card cashout flow on a Reader. A cashout sets the gift card balance to 0. */
  public Reader cashoutGiftCard(String id, ReaderCashoutGiftCardParams params)
      throws StripeException {
    return cashoutGiftCard(id, params, (RequestOptions) null);
  }
  /** Initiates a gift card cashout flow on a Reader. A cashout sets the gift card balance to 0. */
  public Reader cashoutGiftCard(
      String id, ReaderCashoutGiftCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/cashout_gift_card", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /** Initiates a gift card balance check flow on a Reader. */
  public Reader checkGiftCardBalance(String id, ReaderCheckGiftCardBalanceParams params)
      throws StripeException {
    return checkGiftCardBalance(id, params, (RequestOptions) null);
  }
  /** Initiates a gift card balance check flow on a Reader. */
  public Reader checkGiftCardBalance(
      String id, ReaderCheckGiftCardBalanceParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/readers/%s/check_gift_card_balance", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Initiates an <a href="https://stripe.com/docs/terminal/features/collect-inputs">input
   * collection flow</a> on a Reader to display input forms and collect information from your
   * customers.
   */
  public Reader collectInputs(String id, ReaderCollectInputsParams params) throws StripeException {
    return collectInputs(id, params, (RequestOptions) null);
  }
  /**
   * Initiates an <a href="https://stripe.com/docs/terminal/features/collect-inputs">input
   * collection flow</a> on a Reader to display input forms and collect information from your
   * customers.
   */
  public Reader collectInputs(String id, ReaderCollectInputsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/collect_inputs", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Initiates a payment flow on a Reader and updates the PaymentIntent with card details before
   * manual confirmation. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=inspect#collect-a-paymentmethod">Collecting
   * a Payment method</a> for more details.
   */
  public Reader collectPaymentMethod(String id, ReaderCollectPaymentMethodParams params)
      throws StripeException {
    return collectPaymentMethod(id, params, (RequestOptions) null);
  }
  /**
   * Initiates a payment flow on a Reader and updates the PaymentIntent with card details before
   * manual confirmation. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=inspect#collect-a-paymentmethod">Collecting
   * a Payment method</a> for more details.
   */
  public Reader collectPaymentMethod(
      String id, ReaderCollectPaymentMethodParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/readers/%s/collect_payment_method", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Finalizes a payment on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=inspect#confirm-the-paymentintent">Confirming
   * a Payment</a> for more details.
   */
  public Reader confirmPaymentIntent(String id, ReaderConfirmPaymentIntentParams params)
      throws StripeException {
    return confirmPaymentIntent(id, params, (RequestOptions) null);
  }
  /**
   * Finalizes a payment on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=inspect#confirm-the-paymentintent">Confirming
   * a Payment</a> for more details.
   */
  public Reader confirmPaymentIntent(
      String id, ReaderConfirmPaymentIntentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/readers/%s/confirm_payment_intent", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Initiates a payment flow on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=immediately#process-payment">process
   * the payment</a> for more details.
   */
  public Reader processPaymentIntent(String id, ReaderProcessPaymentIntentParams params)
      throws StripeException {
    return processPaymentIntent(id, params, (RequestOptions) null);
  }
  /**
   * Initiates a payment flow on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=immediately#process-payment">process
   * the payment</a> for more details.
   */
  public Reader processPaymentIntent(
      String id, ReaderProcessPaymentIntentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/readers/%s/process_payment_intent", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Initiates a SetupIntent flow on a Reader. See <a
   * href="https://stripe.com/docs/terminal/features/saving-payment-details/save-directly">Save
   * directly without charging</a> for more details.
   */
  public Reader processSetupIntent(String id, ReaderProcessSetupIntentParams params)
      throws StripeException {
    return processSetupIntent(id, params, (RequestOptions) null);
  }
  /**
   * Initiates a SetupIntent flow on a Reader. See <a
   * href="https://stripe.com/docs/terminal/features/saving-payment-details/save-directly">Save
   * directly without charging</a> for more details.
   */
  public Reader processSetupIntent(
      String id, ReaderProcessSetupIntentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/process_setup_intent", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Initiates an in-person refund on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/regional?integration-country=CA#refund-an-interac-payment">Refund
   * an Interac Payment</a> for more details.
   */
  public Reader refundPayment(String id, ReaderRefundPaymentParams params) throws StripeException {
    return refundPayment(id, params, (RequestOptions) null);
  }
  /**
   * Initiates an in-person refund on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/regional?integration-country=CA#refund-an-interac-payment">Refund
   * an Interac Payment</a> for more details.
   */
  public Reader refundPayment(String id, RequestOptions options) throws StripeException {
    return refundPayment(id, (ReaderRefundPaymentParams) null, options);
  }
  /**
   * Initiates an in-person refund on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/regional?integration-country=CA#refund-an-interac-payment">Refund
   * an Interac Payment</a> for more details.
   */
  public Reader refundPayment(String id) throws StripeException {
    return refundPayment(id, (ReaderRefundPaymentParams) null, (RequestOptions) null);
  }
  /**
   * Initiates an in-person refund on a Reader. See <a
   * href="https://stripe.com/docs/terminal/payments/regional?integration-country=CA#refund-an-interac-payment">Refund
   * an Interac Payment</a> for more details.
   */
  public Reader refundPayment(String id, ReaderRefundPaymentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/refund_payment", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Initiates a gift card reload flow on a Reader by adding the specified amount to its balance.
   */
  public Reader reloadGiftCard(String id, ReaderReloadGiftCardParams params)
      throws StripeException {
    return reloadGiftCard(id, params, (RequestOptions) null);
  }
  /**
   * Initiates a gift card reload flow on a Reader by adding the specified amount to its balance.
   */
  public Reader reloadGiftCard(String id, ReaderReloadGiftCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/reload_gift_card", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
  /**
   * Sets the reader display to show <a
   * href="https://stripe.com/docs/terminal/features/display">cart details</a>.
   */
  public Reader setReaderDisplay(String id, ReaderSetReaderDisplayParams params)
      throws StripeException {
    return setReaderDisplay(id, params, (RequestOptions) null);
  }
  /**
   * Sets the reader display to show <a
   * href="https://stripe.com/docs/terminal/features/display">cart details</a>.
   */
  public Reader setReaderDisplay(
      String id, ReaderSetReaderDisplayParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/terminal/readers/%s/set_reader_display", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Reader.class);
  }
}
