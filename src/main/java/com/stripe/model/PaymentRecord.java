// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentRecordReportPaymentAttemptCanceledParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptFailedParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptGuaranteedParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptInformationalParams;
import com.stripe.param.PaymentRecordReportPaymentAttemptParams;
import com.stripe.param.PaymentRecordReportPaymentParams;
import com.stripe.param.PaymentRecordReportRefundParams;
import com.stripe.param.PaymentRecordRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Payment Record is a resource that allows you to represent payments that occur on- or
 * off-Stripe. For example, you can create a Payment Record to model a payment made on a different
 * payment processor, in order to mark an Invoice as paid and a Subscription as active. Payment
 * Records consist of one or more Payment Attempt Records, which represent individual attempts made
 * on a payment network.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentRecord extends ApiResource implements HasId {
  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount")
  Amount amount;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_authorized")
  AmountAuthorized amountAuthorized;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_canceled")
  AmountCanceled amountCanceled;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_failed")
  AmountFailed amountFailed;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_guaranteed")
  AmountGuaranteed amountGuaranteed;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_refunded")
  AmountRefunded amountRefunded;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_requested")
  AmountRequested amountRequested;

  /** ID of the Connect application that created the PaymentRecord. */
  @SerializedName("application")
  String application;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Customer information for this payment. */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /**
   * Indicates whether the customer was present in your checkout flow during this payment.
   *
   * <p>One of {@code off_session}, or {@code on_session}.
   */
  @SerializedName("customer_presence")
  String customerPresence;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** ID of the latest Payment Attempt Record attached to this Payment Record. */
  @SerializedName("latest_payment_attempt_record")
  String latestPaymentAttemptRecord;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_record}.
   */
  @SerializedName("object")
  String object;

  /** Information about the Payment Method debited for this payment. */
  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** Processor information associated with this payment. */
  @SerializedName("processor_details")
  ProcessorDetails processorDetails;

  /** Shipping information for this payment. */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

  /**
   * Report a new Payment Record. You may report a Payment Record as it is initialized and later
   * report updates through the other report_* methods, or report Payment Records in a terminal
   * state directly, through this method.
   */
  public static PaymentRecord reportPayment(Map<String, Object> params) throws StripeException {
    return reportPayment(params, (RequestOptions) null);
  }

  /**
   * Report a new Payment Record. You may report a Payment Record as it is initialized and later
   * report updates through the other report_* methods, or report Payment Records in a terminal
   * state directly, through this method.
   */
  public static PaymentRecord reportPayment(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_records/report_payment";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentRecord.class);
  }

  /**
   * Report a new Payment Record. You may report a Payment Record as it is initialized and later
   * report updates through the other report_* methods, or report Payment Records in a terminal
   * state directly, through this method.
   */
  public static PaymentRecord reportPayment(PaymentRecordReportPaymentParams params)
      throws StripeException {
    return reportPayment(params, (RequestOptions) null);
  }

  /**
   * Report a new Payment Record. You may report a Payment Record as it is initialized and later
   * report updates through the other report_* methods, or report Payment Records in a terminal
   * state directly, through this method.
   */
  public static PaymentRecord reportPayment(
      PaymentRecordReportPaymentParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_records/report_payment";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentRecord.class);
  }

  /**
   * Report a new payment attempt on the specified Payment Record. A new payment attempt can only be
   * specified if all other payment attempts are canceled or failed.
   */
  public PaymentRecord reportPaymentAttempt(Map<String, Object> params) throws StripeException {
    return reportPaymentAttempt(params, (RequestOptions) null);
  }

  /**
   * Report a new payment attempt on the specified Payment Record. A new payment attempt can only be
   * specified if all other payment attempts are canceled or failed.
   */
  public PaymentRecord reportPaymentAttempt(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /**
   * Report a new payment attempt on the specified Payment Record. A new payment attempt can only be
   * specified if all other payment attempts are canceled or failed.
   */
  public PaymentRecord reportPaymentAttempt(PaymentRecordReportPaymentAttemptParams params)
      throws StripeException {
    return reportPaymentAttempt(params, (RequestOptions) null);
  }

  /**
   * Report a new payment attempt on the specified Payment Record. A new payment attempt can only be
   * specified if all other payment attempts are canceled or failed.
   */
  public PaymentRecord reportPaymentAttempt(
      PaymentRecordReportPaymentAttemptParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was canceled. */
  public PaymentRecord reportPaymentAttemptCanceled(Map<String, Object> params)
      throws StripeException {
    return reportPaymentAttemptCanceled(params, (RequestOptions) null);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was canceled. */
  public PaymentRecord reportPaymentAttemptCanceled(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_canceled",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was canceled. */
  public PaymentRecord reportPaymentAttemptCanceled(
      PaymentRecordReportPaymentAttemptCanceledParams params) throws StripeException {
    return reportPaymentAttemptCanceled(params, (RequestOptions) null);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was canceled. */
  public PaymentRecord reportPaymentAttemptCanceled(
      PaymentRecordReportPaymentAttemptCanceledParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_canceled",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /**
   * Report that the most recent payment attempt on the specified Payment Record failed or errored.
   */
  public PaymentRecord reportPaymentAttemptFailed(Map<String, Object> params)
      throws StripeException {
    return reportPaymentAttemptFailed(params, (RequestOptions) null);
  }

  /**
   * Report that the most recent payment attempt on the specified Payment Record failed or errored.
   */
  public PaymentRecord reportPaymentAttemptFailed(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_failed",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /**
   * Report that the most recent payment attempt on the specified Payment Record failed or errored.
   */
  public PaymentRecord reportPaymentAttemptFailed(
      PaymentRecordReportPaymentAttemptFailedParams params) throws StripeException {
    return reportPaymentAttemptFailed(params, (RequestOptions) null);
  }

  /**
   * Report that the most recent payment attempt on the specified Payment Record failed or errored.
   */
  public PaymentRecord reportPaymentAttemptFailed(
      PaymentRecordReportPaymentAttemptFailedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_failed",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was guaranteed. */
  public PaymentRecord reportPaymentAttemptGuaranteed(Map<String, Object> params)
      throws StripeException {
    return reportPaymentAttemptGuaranteed(params, (RequestOptions) null);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was guaranteed. */
  public PaymentRecord reportPaymentAttemptGuaranteed(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_guaranteed",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was guaranteed. */
  public PaymentRecord reportPaymentAttemptGuaranteed(
      PaymentRecordReportPaymentAttemptGuaranteedParams params) throws StripeException {
    return reportPaymentAttemptGuaranteed(params, (RequestOptions) null);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was guaranteed. */
  public PaymentRecord reportPaymentAttemptGuaranteed(
      PaymentRecordReportPaymentAttemptGuaranteedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_guaranteed",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational() throws StripeException {
    return reportPaymentAttemptInformational((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(RequestOptions options)
      throws StripeException {
    return reportPaymentAttemptInformational((Map<String, Object>) null, options);
  }

  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(Map<String, Object> params)
      throws StripeException {
    return reportPaymentAttemptInformational(params, (RequestOptions) null);
  }

  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_informational",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(
      PaymentRecordReportPaymentAttemptInformationalParams params) throws StripeException {
    return reportPaymentAttemptInformational(params, (RequestOptions) null);
  }

  /** Report informational updates on the specified Payment Record. */
  public PaymentRecord reportPaymentAttemptInformational(
      PaymentRecordReportPaymentAttemptInformationalParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_payment_attempt_informational",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was refunded. */
  public PaymentRecord reportRefund(Map<String, Object> params) throws StripeException {
    return reportRefund(params, (RequestOptions) null);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was refunded. */
  public PaymentRecord reportRefund(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_refund", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was refunded. */
  public PaymentRecord reportRefund(PaymentRecordReportRefundParams params) throws StripeException {
    return reportRefund(params, (RequestOptions) null);
  }

  /** Report that the most recent payment attempt on the specified Payment Record was refunded. */
  public PaymentRecord reportRefund(PaymentRecordReportRefundParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_records/%s/report_refund", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentRecord.class);
  }

  /** Retrieves a Payment Record with the given ID. */
  public static PaymentRecord retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Payment Record with the given ID. */
  public static PaymentRecord retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a Payment Record with the given ID. */
  public static PaymentRecord retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payment_records/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentRecord.class);
  }

  /** Retrieves a Payment Record with the given ID. */
  public static PaymentRecord retrieve(
      String id, PaymentRecordRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_records/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentRecord.class);
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountAuthorized extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountCanceled extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountFailed extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountGuaranteed extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountRefunded extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountRequested extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;
  }

  /** Information about the customer for this payment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** ID of the Stripe Customer associated with this payment. */
    @SerializedName("customer")
    String customer;

    /** The customer's email address. */
    @SerializedName("email")
    String email;

    /** The customer's name. */
    @SerializedName("name")
    String name;

    /** The customer's phone number. */
    @SerializedName("phone")
    String phone;
  }

  /** Details about the Payment Method used in this payment attempt. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("ach_credit_transfer")
    AchCreditTransfer achCreditTransfer;

    @SerializedName("ach_debit")
    AchDebit achDebit;

    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    @SerializedName("affirm")
    Affirm affirm;

    @SerializedName("afterpay_clearpay")
    AfterpayClearpay afterpayClearpay;

    @SerializedName("alipay")
    Alipay alipay;

    @SerializedName("alma")
    Alma alma;

    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    @SerializedName("bancontact")
    Bancontact bancontact;

    @SerializedName("billie")
    Billie billie;

    /** The billing details associated with the method of payment. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    @SerializedName("blik")
    Blik blik;

    @SerializedName("boleto")
    Boleto boleto;

    /** Details of the card used for this payment attempt. */
    @SerializedName("card")
    Card card;

    @SerializedName("card_present")
    CardPresent cardPresent;

    @SerializedName("cashapp")
    Cashapp cashapp;

    @SerializedName("crypto")
    Crypto crypto;

    /**
     * Custom Payment Methods represent Payment Method types not modeled directly in the Stripe API.
     * This resource consists of details about the custom payment method used for this payment
     * attempt.
     */
    @SerializedName("custom")
    Custom custom;

    @SerializedName("customer_balance")
    CustomerBalance customerBalance;

    @SerializedName("eps")
    Eps eps;

    @SerializedName("fpx")
    Fpx fpx;

    @SerializedName("giropay")
    Giropay giropay;

    @SerializedName("gopay")
    Gopay gopay;

    @SerializedName("grabpay")
    Grabpay grabpay;

    @SerializedName("id_bank_transfer")
    IdBankTransfer idBankTransfer;

    @SerializedName("ideal")
    Ideal ideal;

    @SerializedName("interac_present")
    InteracPresent interacPresent;

    @SerializedName("kakao_pay")
    KakaoPay kakaoPay;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("konbini")
    Konbini konbini;

    @SerializedName("kr_card")
    KrCard krCard;

    @SerializedName("link")
    Link link;

    @SerializedName("mb_way")
    MbWay mbWay;

    @SerializedName("mobilepay")
    Mobilepay mobilepay;

    @SerializedName("multibanco")
    Multibanco multibanco;

    @SerializedName("naver_pay")
    NaverPay naverPay;

    @SerializedName("nz_bank_account")
    NzBankAccount nzBankAccount;

    @SerializedName("oxxo")
    Oxxo oxxo;

    @SerializedName("p24")
    P24 p24;

    @SerializedName("pay_by_bank")
    PayByBank payByBank;

    @SerializedName("payco")
    Payco payco;

    /** ID of the Stripe PaymentMethod used to make this payment. */
    @SerializedName("payment_method")
    String paymentMethod;

    @SerializedName("paynow")
    Paynow paynow;

    @SerializedName("paypal")
    Paypal paypal;

    @SerializedName("paypay")
    Paypay paypay;

    @SerializedName("payto")
    Payto payto;

    @SerializedName("pix")
    Pix pix;

    @SerializedName("promptpay")
    Promptpay promptpay;

    @SerializedName("qris")
    Qris qris;

    @SerializedName("rechnung")
    Rechnung rechnung;

    @SerializedName("revolut_pay")
    RevolutPay revolutPay;

    @SerializedName("samsung_pay")
    SamsungPay samsungPay;

    @SerializedName("satispay")
    Satispay satispay;

    @SerializedName("sepa_credit_transfer")
    SepaCreditTransfer sepaCreditTransfer;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("shopeepay")
    Shopeepay shopeepay;

    @SerializedName("sofort")
    Sofort sofort;

    @SerializedName("stripe_account")
    StripeAccount stripeAccount;

    @SerializedName("stripe_balance")
    StripeBalance stripeBalance;

    @SerializedName("swish")
    Swish swish;

    @SerializedName("twint")
    Twint twint;

    /**
     * The type of transaction-specific details of the payment method used in the payment. See <a
     * href="https://stripe.com/docs/api/payment_methods/object#payment_method_object-type">PaymentMethod.type</a>
     * for the full list of possible types. An additional hash is included on {@code
     * payment_method_details} with a name matching this value. It contains information specific to
     * the payment method.
     */
    @SerializedName("type")
    String type;

    /** Details of the US Bank Account used for this payment attempt. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    @SerializedName("wechat")
    Wechat wechat;

    @SerializedName("wechat_pay")
    WechatPay wechatPay;

    @SerializedName("zip")
    Zip zip;

    /**
     * For more details about AchCreditTransfer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AchCreditTransfer extends StripeObject {
      /** Account number to transfer funds to. */
      @SerializedName("account_number")
      String accountNumber;

      /** Name of the bank associated with the routing number. */
      @SerializedName("bank_name")
      String bankName;

      /** Routing transit number for the bank account to transfer funds to. */
      @SerializedName("routing_number")
      String routingNumber;

      /** SWIFT code of the bank associated with the routing number. */
      @SerializedName("swift_code")
      String swiftCode;
    }

    /**
     * For more details about AchDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AchDebit extends StripeObject {
      /**
       * Type of entity that holds the account. This can be either {@code individual} or {@code
       * company}.
       *
       * <p>One of {@code company}, or {@code individual}.
       */
      @SerializedName("account_holder_type")
      String accountHolderType;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Two-letter ISO code representing the country the bank account is located in. */
      @SerializedName("country")
      String country;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** Routing transit number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;
    }

    /**
     * For more details about AcssDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {
      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Institution number of the bank account. */
      @SerializedName("institution_number")
      String institutionNumber;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;

      /** Transit number of the bank account. */
      @SerializedName("transit_number")
      String transitNumber;
    }

    /**
     * For more details about Affirm, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Affirm extends StripeObject {
      /**
       * ID of the <a href="https://stripe.com/docs/api/terminal/locations">location</a> that this
       * transaction's reader is assigned to.
       */
      @SerializedName("location")
      String location;

      /**
       * ID of the <a href="https://stripe.com/docs/api/terminal/readers">reader</a> this
       * transaction was made on.
       */
      @SerializedName("reader")
      String reader;

      /** The Affirm transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about AfterpayClearpay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterpayClearpay extends StripeObject {
      /** The Afterpay order ID associated with this payment intent. */
      @SerializedName("order_id")
      String orderId;

      /** Order identifier shown to the merchant in Afterpay’s online portal. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about Alipay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alipay extends StripeObject {
      /**
       * Uniquely identifies this particular Alipay account. You can use this attribute to check
       * whether two Alipay accounts are the same.
       */
      @SerializedName("buyer_id")
      String buyerId;

      /**
       * Uniquely identifies this particular Alipay account. You can use this attribute to check
       * whether two Alipay accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Transaction ID of this particular Alipay transaction. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Alma, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alma extends StripeObject {
      @SerializedName("installments")
      Installments installments;

      /** The Alma transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;

      /**
       * For more details about Installments, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Installments extends StripeObject {
        /** The number of installments. */
        @SerializedName("count")
        Long count;
      }
    }

    /**
     * For more details about AmazonPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay extends StripeObject {
      @SerializedName("funding")
      Funding funding;

      /** The Amazon Pay transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;

      /**
       * For more details about Funding, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Funding extends StripeObject {
        @SerializedName("card")
        Card card;

        /**
         * funding type of the underlying payment method.
         *
         * <p>Equal to {@code card}.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about Card, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Card extends StripeObject {
          /**
           * Card brand. Can be {@code amex}, {@code cartes_bancaires}, {@code diners}, {@code
           * discover}, {@code eftpos_au}, {@code jcb}, {@code link}, {@code mastercard}, {@code
           * unionpay}, {@code visa} or {@code unknown}.
           */
          @SerializedName("brand")
          String brand;

          /**
           * The <a href="https://stripe.com/docs/card-product-codes">product code</a> that
           * identifies the specific program or product associated with a card. (For internal use
           * only and not typically available in standard API requests.)
           */
          @SerializedName("brand_product")
          String brandProduct;

          /**
           * Two-letter ISO code representing the country of the card. You could use this attribute
           * to get a sense of the international breakdown of cards you've collected.
           */
          @SerializedName("country")
          String country;

          /** Two-digit number representing the card's expiration month. */
          @SerializedName("exp_month")
          Long expMonth;

          /** Four-digit number representing the card's expiration year. */
          @SerializedName("exp_year")
          Long expYear;

          /**
           * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
           * unknown}.
           */
          @SerializedName("funding")
          String funding;

          /** The last four digits of the card. */
          @SerializedName("last4")
          String last4;
        }
      }
    }

    /**
     * For more details about AuBecsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit extends StripeObject {
      /** Bank-State-Branch number of the bank account. */
      @SerializedName("bsb_number")
      String bsbNumber;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;
    }

    /**
     * For more details about BacsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {
      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;

      /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
      @SerializedName("sort_code")
      String sortCode;
    }

    /**
     * For more details about Bancontact, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /** The mandate for the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       * Can be one of {@code en}, {@code de}, {@code fr}, or {@code nl}
       */
      @SerializedName("preferred_language")
      String preferredLanguage;

      /**
       * Owner's verified full name. Values are verified or provided by Bancontact directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about Billie, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Billie extends StripeObject {
      /** The Billie transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /** Billing details used by the customer for this payment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      /** A representation of a physical address. */
      @SerializedName("address")
      com.stripe.model.PaymentRecord.PaymentMethodDetails.BillingDetails.Address address;

      /** The billing email associated with the method of payment. */
      @SerializedName("email")
      String email;

      /** The billing name associated with the method of payment. */
      @SerializedName("name")
      String name;

      /** The billing phone number associated with the method of payment. */
      @SerializedName("phone")
      String phone;

      /** A representation of a physical address. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Address extends StripeObject {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        String line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;
      }
    }

    /**
     * For more details about Blik, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Blik extends StripeObject {
      /** A unique and immutable identifier assigned by BLIK to every buyer. */
      @SerializedName("buyer_id")
      String buyerId;
    }

    /**
     * For more details about Boleto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Boleto extends StripeObject {
      /**
       * The tax ID of the customer (CPF for individuals consumers or CNPJ for businesses
       * consumers).
       */
      @SerializedName("tax_id")
      String taxId;
    }

    /** Details of the card used for this payment attempt. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /**
       * Card brand. Can be {@code amex}, {@code cartes_bancaires}, {@code diners}, {@code
       * discover}, {@code eftpos_au}, {@code jcb}, {@code link}, {@code mastercard}, {@code
       * unionpay}, {@code visa} or {@code unknown}.
       */
      @SerializedName("brand")
      String brand;

      /**
       * When using manual capture, a future timestamp at which the charge will be automatically
       * refunded if uncaptured.
       */
      @SerializedName("capture_before")
      Long captureBefore;

      /** Check results by Card networks on Card address and CVC at time of payment. */
      @SerializedName("checks")
      Checks checks;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

      /** Two-digit number representing the card's expiration month. */
      @SerializedName("exp_month")
      Long expMonth;

      /** Four-digit number representing the card's expiration year. */
      @SerializedName("exp_year")
      Long expYear;

      /**
       * Uniquely identifies this particular card number. You can use this attribute to check
       * whether two customers who’ve signed up with you are using the same card number, for
       * example. For payment methods that tokenize card information (Apple Pay, Google Pay), the
       * tokenized number might be provided instead of the underlying card number.
       *
       * <p><em>As of May 1, 2021, card fingerprint in India for Connect changed to allow two
       * fingerprints for the same card---one for India and one for the rest of the world.</em>
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /**
       * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
       * unknown}.
       */
      @SerializedName("funding")
      String funding;

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /** True if this payment was marked as MOTO and out of scope for SCA. */
      @SerializedName("moto")
      Boolean moto;

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code eftpos_au}, {@code interac},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("network")
      String network;

      /**
       * If this card has network token credentials, this contains the details of the network token
       * credentials.
       */
      @SerializedName("network_token")
      NetworkToken networkToken;

      /**
       * This is used by the financial networks to identify a transaction. Visa calls this the
       * Transaction ID, Mastercard calls this the Trace ID, and American Express calls this the
       * Acquirer Reference Data. This value will be present if it is returned by the financial
       * network in the authorization response, and null otherwise.
       */
      @SerializedName("network_transaction_id")
      String networkTransactionId;

      /** Populated if this transaction used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      /** If this Card is part of a card wallet, this contains the details of the card wallet. */
      @SerializedName("wallet")
      Wallet wallet;

      /**
       * For more details about Checks, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Checks extends StripeObject {
        @SerializedName("address_line1_check")
        String addressLine1Check;

        @SerializedName("address_postal_code_check")
        String addressPostalCodeCheck;

        @SerializedName("cvc_check")
        String cvcCheck;
      }

      /**
       * For more details about NetworkToken, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NetworkToken extends StripeObject {
        /**
         * Indicates if Stripe used a network token, either user provided or Stripe managed when
         * processing the transaction.
         */
        @SerializedName("used")
        Boolean used;
      }

      /**
       * For more details about ThreeDSecure, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ThreeDSecure extends StripeObject {
        @SerializedName("authentication_flow")
        String authenticationFlow;

        @SerializedName("result")
        String result;

        @SerializedName("result_reason")
        String resultReason;

        @SerializedName("version")
        String version;
      }

      /**
       * For more details about Wallet, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Wallet extends StripeObject {
        @SerializedName("apple_pay")
        ApplePay applePay;

        /** (For tokenized numbers only.) The last four digits of the device account number. */
        @SerializedName("dynamic_last4")
        String dynamicLast4;

        @SerializedName("google_pay")
        GooglePay googlePay;

        /**
         * The type of the card wallet, one of {@code apple_pay} or {@code google_pay}. An
         * additional hash is included on the Wallet subhash with a name matching this value. It
         * contains additional information specific to the card wallet type.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about ApplePay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ApplePay extends StripeObject {
          /**
           * Type of the apple_pay transaction, one of {@code apple_pay} or {@code apple_pay_later}.
           */
          @SerializedName("type")
          String type;
        }

        /**
         * For more details about GooglePay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class GooglePay extends StripeObject {}
      }
    }

    /**
     * For more details about CardPresent, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {
      /** The authorized amount. */
      @SerializedName("amount_authorized")
      Long amountAuthorized;

      /**
       * Card brand. Can be {@code amex}, {@code cartes_bancaires}, {@code diners}, {@code
       * discover}, {@code eftpos_au}, {@code jcb}, {@code link}, {@code mastercard}, {@code
       * unionpay}, {@code visa} or {@code unknown}.
       */
      @SerializedName("brand")
      String brand;

      /**
       * The <a href="https://stripe.com/docs/card-product-codes">product code</a> that identifies
       * the specific program or product associated with a card.
       */
      @SerializedName("brand_product")
      String brandProduct;

      /**
       * When using manual capture, a future timestamp after which the charge will be automatically
       * refunded if uncaptured.
       */
      @SerializedName("capture_before")
      Long captureBefore;

      /**
       * The cardholder name as read from the card, in <a
       * href="https://en.wikipedia.org/wiki/ISO/IEC_7813">ISO 7813</a> format. May include
       * alphanumeric characters, special characters and first/last name separator ({@code /}). In
       * some cases, the cardholder name may not be available depending on how the issuer has
       * configured the card. Cardholder name is typically not available on swipe or contactless
       * payments, such as those made with Apple Pay and Google Pay.
       */
      @SerializedName("cardholder_name")
      String cardholderName;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

      /**
       * A high-level description of the type of cards issued in this range. (For internal use only
       * and not typically available in standard API requests.)
       */
      @SerializedName("description")
      String description;

      /** Authorization response cryptogram. */
      @SerializedName("emv_auth_data")
      String emvAuthData;

      /** Two-digit number representing the card's expiration month. */
      @SerializedName("exp_month")
      Long expMonth;

      /** Four-digit number representing the card's expiration year. */
      @SerializedName("exp_year")
      Long expYear;

      /**
       * Uniquely identifies this particular card number. You can use this attribute to check
       * whether two customers who’ve signed up with you are using the same card number, for
       * example. For payment methods that tokenize card information (Apple Pay, Google Pay), the
       * tokenized number might be provided instead of the underlying card number.
       *
       * <p><em>As of May 1, 2021, card fingerprint in India for Connect changed to allow two
       * fingerprints for the same card---one for India and one for the rest of the world.</em>
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /**
       * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
       * unknown}.
       */
      @SerializedName("funding")
      String funding;

      /**
       * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be
       * attached to a Customer for future transactions. Only present if it was possible to generate
       * a card PaymentMethod.
       */
      @SerializedName("generated_card")
      String generatedCard;

      /**
       * Issuer identification number of the card. (For internal use only and not typically
       * available in standard API requests.)
       */
      @SerializedName("iin")
      String iin;

      /**
       * Whether this <a href="https://stripe.com/docs/api/payment_intents">PaymentIntent</a> is
       * eligible for incremental authorizations. Request support using <a
       * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-payment_method_options-card_present-request_incremental_authorization_support">request_incremental_authorization_support</a>.
       */
      @SerializedName("incremental_authorization_supported")
      Boolean incrementalAuthorizationSupported;

      /**
       * The name of the card's issuing bank. (For internal use only and not typically available in
       * standard API requests.)
       */
      @SerializedName("issuer")
      String issuer;

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code eftpos_au}, {@code interac},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("network")
      String network;

      /**
       * This is used by the financial networks to identify a transaction. Visa calls this the
       * Transaction ID, Mastercard calls this the Trace ID, and American Express calls this the
       * Acquirer Reference Data. This value will be present if it is returned by the financial
       * network in the authorization response, and null otherwise.
       */
      @SerializedName("network_transaction_id")
      String networkTransactionId;

      /** Details about payments collected offline. */
      @SerializedName("offline")
      Offline offline;

      /** Defines whether the authorized amount can be over-captured or not. */
      @SerializedName("overcapture_supported")
      Boolean overcaptureSupported;

      /**
       * The languages that the issuing bank recommends using for localizing any customer-facing
       * text, as read from the card. Referenced from EMV tag 5F2D, data encoded on the card's chip.
       */
      @SerializedName("preferred_locales")
      List<String> preferredLocales;

      /**
       * How card details were read in this transaction.
       *
       * <p>One of {@code contact_emv}, {@code contactless_emv}, {@code contactless_magstripe_mode},
       * {@code magnetic_stripe_fallback}, or {@code magnetic_stripe_track2}.
       */
      @SerializedName("read_method")
      String readMethod;

      /**
       * A collection of fields required to be displayed on receipts. Only required for EMV
       * transactions.
       */
      @SerializedName("receipt")
      Receipt receipt;

      @SerializedName("wallet")
      Wallet wallet;

      /**
       * For more details about Offline, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Offline extends StripeObject {
        /** Time at which the payment was collected while offline. */
        @SerializedName("stored_at")
        Long storedAt;

        /**
         * The method used to process this payment method offline. Only deferred is allowed.
         *
         * <p>Equal to {@code deferred}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about Receipt, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Receipt extends StripeObject {
        /**
         * The type of account being debited or credited
         *
         * <p>One of {@code checking}, {@code credit}, {@code prepaid}, or {@code unknown}.
         */
        @SerializedName("account_type")
        String accountType;

        /**
         * The Application Cryptogram, a unique value generated by the card to authenticate the
         * transaction with issuers.
         */
        @SerializedName("application_cryptogram")
        String applicationCryptogram;

        /**
         * The Application Identifier (AID) on the card used to determine which networks are
         * eligible to process the transaction. Referenced from EMV tag 9F12, data encoded on the
         * card's chip.
         */
        @SerializedName("application_preferred_name")
        String applicationPreferredName;

        /** Identifier for this transaction. */
        @SerializedName("authorization_code")
        String authorizationCode;

        /** EMV tag 8A. A code returned by the card issuer. */
        @SerializedName("authorization_response_code")
        String authorizationResponseCode;

        /**
         * Describes the method used by the cardholder to verify ownership of the card. One of the
         * following: {@code approval}, {@code failure}, {@code none}, {@code offline_pin}, {@code
         * offline_pin_and_signature}, {@code online_pin}, or {@code signature}.
         */
        @SerializedName("cardholder_verification_method")
        String cardholderVerificationMethod;

        /**
         * Similar to the application_preferred_name, identifying the applications (AIDs) available
         * on the card. Referenced from EMV tag 84.
         */
        @SerializedName("dedicated_file_name")
        String dedicatedFileName;

        /**
         * A 5-byte string that records the checks and validations that occur between the card and
         * the terminal. These checks determine how the terminal processes the transaction and what
         * risk tolerance is acceptable. Referenced from EMV Tag 95.
         */
        @SerializedName("terminal_verification_results")
        String terminalVerificationResults;

        /**
         * An indication of which steps were completed during the card read process. Referenced from
         * EMV Tag 9B.
         */
        @SerializedName("transaction_status_information")
        String transactionStatusInformation;
      }

      /**
       * For more details about Wallet, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Wallet extends StripeObject {
        /**
         * The type of mobile wallet, one of {@code apple_pay}, {@code google_pay}, {@code
         * samsung_pay}, or {@code unknown}.
         */
        @SerializedName("type")
        String type;
      }
    }

    /**
     * For more details about Cashapp, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashapp extends StripeObject {
      /** A unique and immutable identifier assigned by Cash App to every buyer. */
      @SerializedName("buyer_id")
      String buyerId;

      /** A public identifier for buyers using Cash App. */
      @SerializedName("cashtag")
      String cashtag;

      /** A unique and immutable identifier of payments assigned by Cash App. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Crypto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Crypto extends StripeObject {
      /** The wallet address of the customer. */
      @SerializedName("buyer_address")
      String buyerAddress;

      /**
       * The blockchain network that the transaction was sent on.
       *
       * <p>One of {@code base}, {@code ethereum}, {@code polygon}, or {@code solana}.
       */
      @SerializedName("network")
      String network;

      /**
       * The token currency that the transaction was sent with.
       *
       * <p>One of {@code usdc}, {@code usdg}, or {@code usdp}.
       */
      @SerializedName("token_currency")
      String tokenCurrency;

      /** The blockchain transaction hash of the crypto payment. */
      @SerializedName("transaction_hash")
      String transactionHash;
    }

    /**
     * Custom Payment Methods represent Payment Method types not modeled directly in the Stripe API.
     * This resource consists of details about the custom payment method used for this payment
     * attempt.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom extends StripeObject {
      /**
       * Display name for the custom (user-defined) payment method type used to make this payment.
       */
      @SerializedName("display_name")
      String displayName;

      /** The custom payment method type associated with this payment. */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about CustomerBalance, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerBalance extends StripeObject {}

    /**
     * For more details about Eps, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eps extends StripeObject {
      /**
       * The customer's bank. Should be one of {@code arzte_und_apotheker_bank}, {@code
       * austrian_anadi_bank_ag}, {@code bank_austria}, {@code bankhaus_carl_spangler}, {@code
       * bankhaus_schelhammer_und_schattera_ag}, {@code bawag_psk_ag}, {@code bks_bank_ag}, {@code
       * brull_kallmus_bank_ag}, {@code btv_vier_lander_bank}, {@code capital_bank_grawe_gruppe_ag},
       * {@code deutsche_bank_ag}, {@code dolomitenbank}, {@code easybank_ag}, {@code
       * erste_bank_und_sparkassen}, {@code hypo_alpeadriabank_international_ag}, {@code
       * hypo_noe_lb_fur_niederosterreich_u_wien}, {@code hypo_oberosterreich_salzburg_steiermark},
       * {@code hypo_tirol_bank_ag}, {@code hypo_vorarlberg_bank_ag}, {@code
       * hypo_bank_burgenland_aktiengesellschaft}, {@code marchfelder_bank}, {@code oberbank_ag},
       * {@code raiffeisen_bankengruppe_osterreich}, {@code schoellerbank_ag}, {@code
       * sparda_bank_wien}, {@code volksbank_gruppe}, {@code volkskreditbank_ag}, or {@code
       * vr_bank_braunau}.
       */
      @SerializedName("bank")
      String bank;

      /**
       * Owner's verified full name. Values are verified or provided by EPS directly (if supported)
       * at the time of authorization or settlement. They cannot be set or mutated. EPS rarely
       * provides this information so the attribute is usually empty.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    /**
     * For more details about Fpx, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fpx extends StripeObject {
      /** Account holder type, if provided. Can be one of {@code individual} or {@code company}. */
      @SerializedName("account_holder_type")
      String accountHolderType;

      /**
       * The customer's bank. Can be one of {@code affin_bank}, {@code agrobank}, {@code
       * alliance_bank}, {@code ambank}, {@code bank_islam}, {@code bank_muamalat}, {@code
       * bank_rakyat}, {@code bsn}, {@code cimb}, {@code hong_leong_bank}, {@code hsbc}, {@code
       * kfh}, {@code maybank2u}, {@code ocbc}, {@code public_bank}, {@code rhb}, {@code
       * standard_chartered}, {@code uob}, {@code deutsche_bank}, {@code maybank2e}, {@code
       * pb_enterprise}, or {@code bank_of_china}.
       */
      @SerializedName("bank")
      String bank;

      /** Unique transaction id generated by FPX for every request from the merchant. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Giropay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Giropay extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /**
       * Owner's verified full name. Values are verified or provided by Giropay directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       * Giropay rarely provides this information so the attribute is usually empty.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    /**
     * For more details about Gopay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Gopay extends StripeObject {}

    /**
     * For more details about Grabpay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Grabpay extends StripeObject {
      /** Unique transaction id generated by GrabPay. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about IdBankTransfer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IdBankTransfer extends StripeObject {
      /** Account number of the bank account to transfer funds to. */
      @SerializedName("account_number")
      String accountNumber;

      /**
       * Bank where the account is located.
       *
       * <p>One of {@code bca}, {@code bni}, {@code bri}, {@code cimb}, or {@code permata}.
       */
      @SerializedName("bank")
      String bank;

      /** Local bank code of the bank. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Merchant name and billing details name, for the customer to check for the correct merchant
       * when performing the bank transfer.
       */
      @SerializedName("display_name")
      String displayName;
    }

    /**
     * For more details about Ideal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code abn_amro}, {@code asn_bank}, {@code bunq}, {@code
       * buut}, {@code handelsbanken}, {@code ing}, {@code knab}, {@code moneyou}, {@code n26},
       * {@code nn}, {@code rabobank}, {@code regiobank}, {@code revolut}, {@code sns_bank}, {@code
       * triodos_bank}, {@code van_lanschot}, or {@code yoursafe}.
       */
      @SerializedName("bank")
      String bank;

      /**
       * The Bank Identifier Code of the customer's bank.
       *
       * <p>One of {@code ABNANL2A}, {@code ASNBNL21}, {@code BITSNL2A}, {@code BUNQNL2A}, {@code
       * BUUTNL2A}, {@code FVLBNL22}, {@code HANDNL2A}, {@code INGBNL2A}, {@code KNABNL2H}, {@code
       * MOYONL21}, {@code NNBANL2G}, {@code NTSBDEB1}, {@code RABONL2U}, {@code RBRBNL21}, {@code
       * REVOIE23}, {@code REVOLT21}, {@code SNSBNL2A}, or {@code TRIONL2U}.
       */
      @SerializedName("bic")
      String bic;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /** The mandate for the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Owner's verified full name. Values are verified or provided by iDEAL directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about InteracPresent, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InteracPresent extends StripeObject {
      /** Card brand. Can be {@code interac}, {@code mastercard} or {@code visa}. */
      @SerializedName("brand")
      String brand;

      /**
       * The cardholder name as read from the card, in <a
       * href="https://en.wikipedia.org/wiki/ISO/IEC_7813">ISO 7813</a> format. May include
       * alphanumeric characters, special characters and first/last name separator ({@code /}). In
       * some cases, the cardholder name may not be available depending on how the issuer has
       * configured the card. Cardholder name is typically not available on swipe or contactless
       * payments, such as those made with Apple Pay and Google Pay.
       */
      @SerializedName("cardholder_name")
      String cardholderName;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

      /**
       * A high-level description of the type of cards issued in this range. (For internal use only
       * and not typically available in standard API requests.)
       */
      @SerializedName("description")
      String description;

      /** Authorization response cryptogram. */
      @SerializedName("emv_auth_data")
      String emvAuthData;

      /** Two-digit number representing the card's expiration month. */
      @SerializedName("exp_month")
      Long expMonth;

      /** Four-digit number representing the card's expiration year. */
      @SerializedName("exp_year")
      Long expYear;

      /**
       * Uniquely identifies this particular card number. You can use this attribute to check
       * whether two customers who’ve signed up with you are using the same card number, for
       * example. For payment methods that tokenize card information (Apple Pay, Google Pay), the
       * tokenized number might be provided instead of the underlying card number.
       *
       * <p><em>As of May 1, 2021, card fingerprint in India for Connect changed to allow two
       * fingerprints for the same card---one for India and one for the rest of the world.</em>
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /**
       * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
       * unknown}.
       */
      @SerializedName("funding")
      String funding;

      /**
       * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be
       * attached to a Customer for future transactions. Only present if it was possible to generate
       * a card PaymentMethod.
       */
      @SerializedName("generated_card")
      String generatedCard;

      /**
       * Issuer identification number of the card. (For internal use only and not typically
       * available in standard API requests.)
       */
      @SerializedName("iin")
      String iin;

      /**
       * The name of the card's issuing bank. (For internal use only and not typically available in
       * standard API requests.)
       */
      @SerializedName("issuer")
      String issuer;

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code eftpos_au}, {@code interac},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("network")
      String network;

      /**
       * This is used by the financial networks to identify a transaction. Visa calls this the
       * Transaction ID, Mastercard calls this the Trace ID, and American Express calls this the
       * Acquirer Reference Data. This value will be present if it is returned by the financial
       * network in the authorization response, and null otherwise.
       */
      @SerializedName("network_transaction_id")
      String networkTransactionId;

      /**
       * The languages that the issuing bank recommends using for localizing any customer-facing
       * text, as read from the card. Referenced from EMV tag 5F2D, data encoded on the card's chip.
       */
      @SerializedName("preferred_locales")
      List<String> preferredLocales;

      /**
       * How card details were read in this transaction.
       *
       * <p>One of {@code contact_emv}, {@code contactless_emv}, {@code contactless_magstripe_mode},
       * {@code magnetic_stripe_fallback}, or {@code magnetic_stripe_track2}.
       */
      @SerializedName("read_method")
      String readMethod;

      /**
       * A collection of fields required to be displayed on receipts. Only required for EMV
       * transactions.
       */
      @SerializedName("receipt")
      Receipt receipt;

      /**
       * For more details about Receipt, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Receipt extends StripeObject {
        /**
         * The type of account being debited or credited
         *
         * <p>One of {@code checking}, {@code savings}, or {@code unknown}.
         */
        @SerializedName("account_type")
        String accountType;

        /**
         * The Application Cryptogram, a unique value generated by the card to authenticate the
         * transaction with issuers.
         */
        @SerializedName("application_cryptogram")
        String applicationCryptogram;

        /**
         * The Application Identifier (AID) on the card used to determine which networks are
         * eligible to process the transaction. Referenced from EMV tag 9F12, data encoded on the
         * card's chip.
         */
        @SerializedName("application_preferred_name")
        String applicationPreferredName;

        /** Identifier for this transaction. */
        @SerializedName("authorization_code")
        String authorizationCode;

        /** EMV tag 8A. A code returned by the card issuer. */
        @SerializedName("authorization_response_code")
        String authorizationResponseCode;

        /**
         * Describes the method used by the cardholder to verify ownership of the card. One of the
         * following: {@code approval}, {@code failure}, {@code none}, {@code offline_pin}, {@code
         * offline_pin_and_signature}, {@code online_pin}, or {@code signature}.
         */
        @SerializedName("cardholder_verification_method")
        String cardholderVerificationMethod;

        /**
         * Similar to the application_preferred_name, identifying the applications (AIDs) available
         * on the card. Referenced from EMV tag 84.
         */
        @SerializedName("dedicated_file_name")
        String dedicatedFileName;

        /**
         * A 5-byte string that records the checks and validations that occur between the card and
         * the terminal. These checks determine how the terminal processes the transaction and what
         * risk tolerance is acceptable. Referenced from EMV Tag 95.
         */
        @SerializedName("terminal_verification_results")
        String terminalVerificationResults;

        /**
         * An indication of which steps were completed during the card read process. Referenced from
         * EMV Tag 9B.
         */
        @SerializedName("transaction_status_information")
        String transactionStatusInformation;
      }
    }

    /**
     * For more details about KakaoPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KakaoPay extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;

      /** The Kakao Pay transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {
      /** The payer details for this transaction. */
      @SerializedName("payer_details")
      PayerDetails payerDetails;

      /**
       * The Klarna payment method used for this transaction. Can be one of {@code pay_later},
       * {@code pay_now}, {@code pay_with_financing}, or {@code pay_in_installments}
       */
      @SerializedName("payment_method_category")
      String paymentMethodCategory;

      /**
       * Preferred language of the Klarna authorization page that the customer is redirected to. Can
       * be one of {@code de-AT}, {@code en-AT}, {@code nl-BE}, {@code fr-BE}, {@code en-BE}, {@code
       * de-DE}, {@code en-DE}, {@code da-DK}, {@code en-DK}, {@code es-ES}, {@code en-ES}, {@code
       * fi-FI}, {@code sv-FI}, {@code en-FI}, {@code en-GB}, {@code en-IE}, {@code it-IT}, {@code
       * en-IT}, {@code nl-NL}, {@code en-NL}, {@code nb-NO}, {@code en-NO}, {@code sv-SE}, {@code
       * en-SE}, {@code en-US}, {@code es-US}, {@code fr-FR}, {@code en-FR}, {@code cs-CZ}, {@code
       * en-CZ}, {@code ro-RO}, {@code en-RO}, {@code el-GR}, {@code en-GR}, {@code en-AU}, {@code
       * en-NZ}, {@code en-CA}, {@code fr-CA}, {@code pl-PL}, {@code en-PL}, {@code pt-PT}, {@code
       * en-PT}, {@code de-CH}, {@code fr-CH}, {@code it-CH}, or {@code en-CH}
       */
      @SerializedName("preferred_locale")
      String preferredLocale;

      /**
       * For more details about PayerDetails, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class PayerDetails extends StripeObject {
        /** The payer's address. */
        @SerializedName("address")
        com.stripe.model.PaymentRecord.PaymentMethodDetails.Klarna.PayerDetails.Address address;

        /**
         * For more details about Address, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Address extends StripeObject {
          /** The payer address country. */
          @SerializedName("country")
          String country;
        }
      }
    }

    /**
     * For more details about Konbini, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Konbini extends StripeObject {
      /**
       * If the payment succeeded, this contains the details of the convenience store where the
       * payment was completed.
       */
      @SerializedName("store")
      Store store;

      /**
       * For more details about Store, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Store extends StripeObject {
        /**
         * The name of the convenience store chain where the payment was completed.
         *
         * <p>One of {@code familymart}, {@code lawson}, {@code ministop}, or {@code seicomart}.
         */
        @SerializedName("chain")
        String chain;
      }
    }

    /**
     * For more details about KrCard, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KrCard extends StripeObject {
      /**
       * The local credit or debit card brand.
       *
       * <p>One of {@code bc}, {@code citi}, {@code hana}, {@code hyundai}, {@code jeju}, {@code
       * jeonbuk}, {@code kakaobank}, {@code kbank}, {@code kdbbank}, {@code kookmin}, {@code
       * kwangju}, {@code lotte}, {@code mg}, {@code nh}, {@code post}, {@code samsung}, {@code
       * savingsbank}, {@code shinhan}, {@code shinhyup}, {@code suhyup}, {@code tossbank}, or
       * {@code woori}.
       */
      @SerializedName("brand")
      String brand;

      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;

      /** The last four digits of the card. This may not be present for American Express cards. */
      @SerializedName("last4")
      String last4;

      /** The Korean Card transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {
      /**
       * Two-letter ISO code representing the funding source country beneath the Link payment. You
       * could use this attribute to get a sense of international fees.
       */
      @SerializedName("country")
      String country;
    }

    /**
     * For more details about MbWay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MbWay extends StripeObject {}

    /**
     * For more details about Mobilepay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mobilepay extends StripeObject {
      /** Internal card details. */
      @SerializedName("card")
      Card card;

      /**
       * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Card extends StripeObject {
        /** Brand of the card used in the transaction. */
        @SerializedName("brand")
        String brand;

        /** Two-letter ISO code representing the country of the card. */
        @SerializedName("country")
        String country;

        /** Two digit number representing the card's expiration month. */
        @SerializedName("exp_month")
        Long expMonth;

        /** Two digit number representing the card's expiration year. */
        @SerializedName("exp_year")
        Long expYear;

        /** The last 4 digits of the card. */
        @SerializedName("last4")
        String last4;
      }
    }

    /**
     * For more details about Multibanco, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Multibanco extends StripeObject {
      /** Entity number associated with this Multibanco payment. */
      @SerializedName("entity")
      String entity;

      /** Reference number associated with this Multibanco payment. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about NaverPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NaverPay extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;

      /** The Naver Pay transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about NzBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NzBankAccount extends StripeObject {
      /**
       * The name on the bank account. Only present if the account holder name is different from the
       * name of the authorized signatory collected in the PaymentMethod’s billing details.
       */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The numeric code for the bank account's bank. */
      @SerializedName("bank_code")
      String bankCode;

      /** The name of the bank. */
      @SerializedName("bank_name")
      String bankName;

      /** The numeric code for the bank account's bank branch. */
      @SerializedName("branch_code")
      String branchCode;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** The suffix of the bank account number. */
      @SerializedName("suffix")
      String suffix;
    }

    /**
     * For more details about Oxxo, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Oxxo extends StripeObject {
      /** OXXO reference number. */
      @SerializedName("number")
      String number;
    }

    /**
     * For more details about P24, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class P24 extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code ing}, {@code citi_handlowy}, {@code
       * tmobile_usbugi_bankowe}, {@code plus_bank}, {@code etransfer_pocztowy24}, {@code
       * banki_spbdzielcze}, {@code bank_nowy_bfg_sa}, {@code getin_bank}, {@code velobank}, {@code
       * blik}, {@code noble_pay}, {@code ideabank}, {@code envelobank}, {@code
       * santander_przelew24}, {@code nest_przelew}, {@code mbank_mtransfer}, {@code inteligo},
       * {@code pbac_z_ipko}, {@code bnp_paribas}, {@code credit_agricole}, {@code toyota_bank},
       * {@code bank_pekao_sa}, {@code volkswagen_bank}, {@code bank_millennium}, {@code
       * alior_bank}, or {@code boz}.
       */
      @SerializedName("bank")
      String bank;

      /** Unique reference for this Przelewy24 payment. */
      @SerializedName("reference")
      String reference;

      /**
       * Owner's verified full name. Values are verified or provided by Przelewy24 directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       * Przelewy24 rarely provides this information so the attribute is usually empty.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    /**
     * For more details about PayByBank, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PayByBank extends StripeObject {}

    /**
     * For more details about Payco, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payco extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;

      /** The Payco transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Paynow, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paynow extends StripeObject {
      /**
       * ID of the <a href="https://stripe.com/docs/api/terminal/locations">location</a> that this
       * transaction's reader is assigned to.
       */
      @SerializedName("location")
      String location;

      /**
       * ID of the <a href="https://stripe.com/docs/api/terminal/readers">reader</a> this
       * transaction was made on.
       */
      @SerializedName("reader")
      String reader;

      /** Reference number associated with this PayNow payment. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal extends StripeObject {
      /**
       * Two-letter ISO code representing the buyer's country. Values are provided by PayPal
       * directly (if supported) at the time of authorization or settlement. They cannot be set or
       * mutated.
       */
      @SerializedName("country")
      String country;

      /**
       * Owner's email. Values are provided by PayPal directly (if supported) at the time of
       * authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("payer_email")
      String payerEmail;

      /** PayPal account PayerID. This identifier uniquely identifies the PayPal customer. */
      @SerializedName("payer_id")
      String payerId;

      /**
       * Owner's full name. Values provided by PayPal directly (if supported) at the time of
       * authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("payer_name")
      String payerName;

      /**
       * The level of protection offered as defined by PayPal Seller Protection for Merchants, for
       * this transaction.
       */
      @SerializedName("seller_protection")
      SellerProtection sellerProtection;

      /**
       * The shipping address for the customer, as supplied by the merchant at the point of payment
       * execution. This shipping address will not be updated if the merchant updates the shipping
       * address on the PaymentIntent after the PaymentIntent was successfully confirmed.
       */
      @SerializedName("shipping")
      com.stripe.model.Address shipping;

      /** A unique ID generated by PayPal for this transaction. */
      @SerializedName("transaction_id")
      String transactionId;

      /**
       * The shipping address for the customer, as supplied by the merchant at the point of payment
       * execution. This shipping address will not be updated if the merchant updates the shipping
       * address on the PaymentIntent after the PaymentIntent was successfully confirmed.
       */
      @SerializedName("verified_address")
      com.stripe.model.Address verifiedAddress;

      /**
       * Owner's verified email. Values are verified or provided by PayPal directly (if supported)
       * at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_email")
      String verifiedEmail;

      /**
       * Owner's verified full name. Values are verified or provided by PayPal directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /**
       * For more details about SellerProtection, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SellerProtection extends StripeObject {
        /** An array of conditions that are covered for the transaction, if applicable. */
        @SerializedName("dispute_categories")
        List<String> disputeCategories;

        /**
         * Indicates whether the transaction is eligible for PayPal's seller protection.
         *
         * <p>One of {@code eligible}, {@code not_eligible}, or {@code partially_eligible}.
         */
        @SerializedName("status")
        String status;
      }
    }

    /**
     * For more details about Paypay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypay extends StripeObject {}

    /**
     * For more details about Payto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payto extends StripeObject {
      /** Bank-State-Branch number of the bank account. */
      @SerializedName("bsb_number")
      String bsbNumber;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;

      /** The PayID alias for the bank account. */
      @SerializedName("pay_id")
      String payId;
    }

    /**
     * For more details about Pix, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pix extends StripeObject {
      /** Unique transaction id generated by BCB. */
      @SerializedName("bank_transaction_id")
      String bankTransactionId;

      /** ID of the multi use Mandate generated by the PaymentIntent. */
      @SerializedName("mandate")
      String mandate;
    }

    /**
     * For more details about Promptpay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Promptpay extends StripeObject {
      /** Bill reference generated by PromptPay. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about Qris, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Qris extends StripeObject {}

    /**
     * For more details about Rechnung, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rechnung extends StripeObject {
      /** Payment portal URL. */
      @SerializedName("payment_portal_url")
      String paymentPortalUrl;
    }

    /**
     * For more details about RevolutPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay extends StripeObject {
      @SerializedName("funding")
      Funding funding;

      /** The Revolut Pay transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;

      /**
       * For more details about Funding, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Funding extends StripeObject {
        @SerializedName("card")
        Card card;

        /**
         * funding type of the underlying payment method.
         *
         * <p>Equal to {@code card}.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about Card, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Card extends StripeObject {
          /**
           * Card brand. Can be {@code amex}, {@code cartes_bancaires}, {@code diners}, {@code
           * discover}, {@code eftpos_au}, {@code jcb}, {@code link}, {@code mastercard}, {@code
           * unionpay}, {@code visa} or {@code unknown}.
           */
          @SerializedName("brand")
          String brand;

          /**
           * The <a href="https://stripe.com/docs/card-product-codes">product code</a> that
           * identifies the specific program or product associated with a card. (For internal use
           * only and not typically available in standard API requests.)
           */
          @SerializedName("brand_product")
          String brandProduct;

          /**
           * Two-letter ISO code representing the country of the card. You could use this attribute
           * to get a sense of the international breakdown of cards you've collected.
           */
          @SerializedName("country")
          String country;

          /** Two-digit number representing the card's expiration month. */
          @SerializedName("exp_month")
          Long expMonth;

          /** Four-digit number representing the card's expiration year. */
          @SerializedName("exp_year")
          Long expYear;

          /**
           * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
           * unknown}.
           */
          @SerializedName("funding")
          String funding;

          /** The last four digits of the card. */
          @SerializedName("last4")
          String last4;
        }
      }
    }

    /**
     * For more details about SamsungPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SamsungPay extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;

      /** The Samsung Pay transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Satispay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Satispay extends StripeObject {
      /** The Satispay transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about SepaCreditTransfer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaCreditTransfer extends StripeObject {
      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** IBAN of the bank account to transfer funds to. */
      @SerializedName("iban")
      String iban;
    }

    /**
     * For more details about SepaDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Branch code of bank associated with the bank account. */
      @SerializedName("branch_code")
      String branchCode;

      /** Two-letter ISO code representing the country the bank account is located in. */
      @SerializedName("country")
      String country;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four characters of the IBAN. */
      @SerializedName("last4")
      String last4;

      /**
       * Find the ID of the mandate used for this payment under the <a
       * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-sepa_debit-mandate">payment_method_details.sepa_debit.mandate</a>
       * property on the Charge. Use this mandate ID to <a
       * href="https://stripe.com/docs/api/mandates/retrieve">retrieve the Mandate</a>.
       */
      @SerializedName("mandate")
      String mandate;
    }

    /**
     * For more details about Shopeepay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Shopeepay extends StripeObject {}

    /**
     * For more details about Sofort, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sofort extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** Two-letter ISO code representing the country the bank account is located in. */
      @SerializedName("country")
      String country;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /** The mandate for the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Preferred language of the SOFORT authorization page that the customer is redirected to. Can
       * be one of {@code de}, {@code en}, {@code es}, {@code fr}, {@code it}, {@code nl}, or {@code
       * pl}
       */
      @SerializedName("preferred_language")
      String preferredLanguage;

      /**
       * Owner's verified full name. Values are verified or provided by SOFORT directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about StripeAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeAccount extends StripeObject {}

    /**
     * For more details about StripeBalance, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeBalance extends StripeObject {
      /** The connected account ID whose Stripe balance to use as the source of payment. */
      @SerializedName("account")
      String account;

      /**
       * The <a
       * href="https://docs.stripe.com/api/balance/balance_object#balance_object-available-source_types">source_type</a>
       * of the balance
       *
       * <p>One of {@code bank_account}, {@code card}, or {@code fpx}.
       */
      @SerializedName("source_type")
      String sourceType;
    }

    /**
     * For more details about Swish, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Swish extends StripeObject {
      /**
       * Uniquely identifies the payer's Swish account. You can use this attribute to check whether
       * two Swish transactions were paid for by the same payer
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Payer bank reference number for the payment. */
      @SerializedName("payment_reference")
      String paymentReference;

      /** The last four digits of the Swish account phone number. */
      @SerializedName("verified_phone_last4")
      String verifiedPhoneLast4;
    }

    /**
     * For more details about Twint, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Twint extends StripeObject {}

    /** Details of the US Bank Account used for this payment attempt. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      @SerializedName("account_holder_type")
      String accountHolderType;

      @SerializedName("account_type")
      String accountType;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> mandate;

      /** Reference number to locate ACH payments with customer’s bank. */
      @SerializedName("payment_reference")
      String paymentReference;

      /** Routing number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;

      /** Get ID of expandable {@code mandate} object. */
      public String getMandate() {
        return (this.mandate != null) ? this.mandate.getId() : null;
      }

      public void setMandate(String id) {
        this.mandate = ApiResource.setExpandableFieldId(id, this.mandate);
      }

      /** Get expanded {@code mandate}. */
      public Mandate getMandateObject() {
        return (this.mandate != null) ? this.mandate.getExpanded() : null;
      }

      public void setMandateObject(Mandate expandableObject) {
        this.mandate = new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about Wechat, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Wechat extends StripeObject {}

    /**
     * For more details about WechatPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class WechatPay extends StripeObject {
      /**
       * Uniquely identifies this particular WeChat Pay account. You can use this attribute to check
       * whether two WeChat accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /**
       * ID of the <a href="https://stripe.com/docs/api/terminal/locations">location</a> that this
       * transaction's reader is assigned to.
       */
      @SerializedName("location")
      String location;

      /**
       * ID of the <a href="https://stripe.com/docs/api/terminal/readers">reader</a> this
       * transaction was made on.
       */
      @SerializedName("reader")
      String reader;

      /** Transaction ID of this particular WeChat Pay transaction. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Zip, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Zip extends StripeObject {}
  }

  /** Processor information associated with this payment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ProcessorDetails extends StripeObject {
    /**
     * Custom processors represent payment processors not modeled directly in the Stripe API. This
     * resource consists of details about the custom processor used for this payment attempt.
     */
    @SerializedName("custom")
    Custom custom;

    /**
     * The processor used for this payment attempt.
     *
     * <p>Equal to {@code custom}.
     */
    @SerializedName("type")
    String type;

    /**
     * Custom processors represent payment processors not modeled directly in the Stripe API. This
     * resource consists of details about the custom processor used for this payment attempt.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom extends StripeObject {
      /**
       * An opaque string for manual reconciliation of this payment, for example a check number or a
       * payment processor ID.
       */
      @SerializedName("payment_reference")
      String paymentReference;
    }
  }

  /** The customer's shipping information associated with this payment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingDetails extends StripeObject {
    /** A representation of a physical address. */
    @SerializedName("address")
    com.stripe.model.PaymentRecord.ShippingDetails.Address address;

    /** The shipping recipient's name. */
    @SerializedName("name")
    String name;

    /** The shipping recipient's phone number. */
    @SerializedName("phone")
    String phone;

    /** A representation of a physical address. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Address extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      String line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(amount, responseGetter);
    trySetResponseGetter(amountAuthorized, responseGetter);
    trySetResponseGetter(amountCanceled, responseGetter);
    trySetResponseGetter(amountFailed, responseGetter);
    trySetResponseGetter(amountGuaranteed, responseGetter);
    trySetResponseGetter(amountRefunded, responseGetter);
    trySetResponseGetter(amountRequested, responseGetter);
    trySetResponseGetter(customerDetails, responseGetter);
    trySetResponseGetter(paymentMethodDetails, responseGetter);
    trySetResponseGetter(processorDetails, responseGetter);
    trySetResponseGetter(shippingDetails, responseGetter);
  }
}
