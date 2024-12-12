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
import com.stripe.param.PaymentRecordReportPaymentAttemptParams;
import com.stripe.param.PaymentRecordReportPaymentParams;
import com.stripe.param.PaymentRecordRetrieveParams;
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
  @SerializedName("amount_canceled")
  AmountCanceled amountCanceled;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_failed")
  AmountFailed amountFailed;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_guaranteed")
  AmountGuaranteed amountGuaranteed;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_requested")
  AmountRequested amountRequested;

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

  /**
   * An opaque string for manual reconciliation of this payment, for example a check number or a
   * payment processor ID.
   */
  @SerializedName("payment_reference")
  String paymentReference;

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
  public static class AmountCanceled extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
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
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
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
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
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
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
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
    /** The billing details associated with the method of payment. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /** Information about the custom (user-defined) payment method used to make this payment. */
    @SerializedName("custom")
    Custom custom;

    /** ID of the Stripe PaymentMethod used to make this payment. */
    @SerializedName("payment_method")
    String paymentMethod;

    /**
     * The type of Payment Method used for this payment attempt.
     *
     * <p>Equal to {@code custom}.
     */
    @SerializedName("type")
    String type;

    /** Billing details used by the customer for this payment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      /** A representation of a physical address. */
      @SerializedName("address")
      Address address;

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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
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
  }

  /** The customer's shipping information associated with this payment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingDetails extends StripeObject {
    /** A representation of a physical address. */
    @SerializedName("address")
    Address address;

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

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
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
    trySetResponseGetter(amountCanceled, responseGetter);
    trySetResponseGetter(amountFailed, responseGetter);
    trySetResponseGetter(amountGuaranteed, responseGetter);
    trySetResponseGetter(amountRequested, responseGetter);
    trySetResponseGetter(customerDetails, responseGetter);
    trySetResponseGetter(paymentMethodDetails, responseGetter);
    trySetResponseGetter(shippingDetails, responseGetter);
  }
}
