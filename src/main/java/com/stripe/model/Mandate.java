// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.MandateRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Mandate is a record of the permission that your customer gives you to debit their payment
 * method.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Mandate extends ApiResource implements HasId {
  @SerializedName("customer_acceptance")
  CustomerAcceptance customerAcceptance;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("multi_use")
  MultiUse multiUse;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code mandate}.
   */
  @SerializedName("object")
  String object;

  /** The account (if any) that the mandate is intended for. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /** ID of the payment method associated with this mandate. */
  @SerializedName("payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> paymentMethod;

  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  @SerializedName("single_use")
  SingleUse singleUse;

  /**
   * The mandate status indicates whether or not you can use it to initiate a payment.
   *
   * <p>One of {@code active}, {@code inactive}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of the mandate.
   *
   * <p>One of {@code multi_use}, or {@code single_use}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code paymentMethod} object. */
  public String getPaymentMethod() {
    return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
  }

  public void setPaymentMethod(String id) {
    this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
  }

  /** Get expanded {@code paymentMethod}. */
  public PaymentMethod getPaymentMethodObject() {
    return (this.paymentMethod != null) ? this.paymentMethod.getExpanded() : null;
  }

  public void setPaymentMethodObject(PaymentMethod expandableObject) {
    this.paymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /** Retrieves a Mandate object. */
  public static Mandate retrieve(String mandate) throws StripeException {
    return retrieve(mandate, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Mandate object. */
  public static Mandate retrieve(String mandate, RequestOptions options) throws StripeException {
    return retrieve(mandate, (Map<String, Object>) null, options);
  }

  /** Retrieves a Mandate object. */
  public static Mandate retrieve(String mandate, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/mandates/%s", ApiResource.urlEncodeId(mandate));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Mandate.class);
  }

  /** Retrieves a Mandate object. */
  public static Mandate retrieve(
      String mandate, MandateRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/mandates/%s", ApiResource.urlEncodeId(mandate));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Mandate.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerAcceptance extends StripeObject {
    /** The time that the customer accepts the mandate. */
    @SerializedName("accepted_at")
    Long acceptedAt;

    @SerializedName("offline")
    Offline offline;

    @SerializedName("online")
    Online online;

    /**
     * The mandate includes the type of customer acceptance information, such as: {@code online} or
     * {@code offline}.
     *
     * <p>One of {@code offline}, or {@code online}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Offline extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Online extends StripeObject {
      /** The customer accepts the mandate from this IP address. */
      @SerializedName("ip_address")
      String ipAddress;

      /** The customer accepts the mandate using the user agent of the browser. */
      @SerializedName("user_agent")
      String userAgent;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MultiUse extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    @SerializedName("card")
    Card card;

    @SerializedName("cashapp")
    Cashapp cashapp;

    @SerializedName("link")
    Link link;

    @SerializedName("paypal")
    Paypal paypal;

    @SerializedName("revolut_pay")
    RevolutPay revolutPay;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    /**
     * This mandate corresponds with a specific payment method type. The {@code
     * payment_method_details} includes an additional hash with the same name and contains mandate
     * information that's specific to that payment method.
     */
    @SerializedName("type")
    String type;

    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {
      /** List of Stripe products where this mandate can be selected automatically. */
      @SerializedName("default_for")
      List<String> defaultFor;

      /**
       * Description of the interval. Only required if the 'payment_schedule' parameter is
       * 'interval' or 'combined'.
       */
      @SerializedName("interval_description")
      String intervalDescription;

      /**
       * Payment schedule for the mandate.
       *
       * <p>One of {@code combined}, {@code interval}, or {@code sporadic}.
       */
      @SerializedName("payment_schedule")
      String paymentSchedule;

      /**
       * Transaction type of the mandate.
       *
       * <p>One of {@code business}, or {@code personal}.
       */
      @SerializedName("transaction_type")
      String transactionType;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit extends StripeObject {
      /**
       * The URL of the mandate. This URL generally contains sensitive information about the
       * customer and should be shared with them exclusively.
       */
      @SerializedName("url")
      String url;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {
      /**
       * The status of the mandate on the Bacs network. Can be one of {@code pending}, {@code
       * revoked}, {@code refused}, or {@code accepted}.
       */
      @SerializedName("network_status")
      String networkStatus;

      /** The unique reference identifying the mandate on the Bacs network. */
      @SerializedName("reference")
      String reference;

      /**
       * When the mandate is revoked on the Bacs network this field displays the reason for the
       * revocation.
       *
       * <p>One of {@code account_closed}, {@code bank_account_restricted}, {@code
       * bank_ownership_changed}, {@code could_not_process}, or {@code debit_not_authorized}.
       */
      @SerializedName("revocation_reason")
      String revocationReason;

      /** The URL that will contain the mandate that the customer has signed. */
      @SerializedName("url")
      String url;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashapp extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal extends StripeObject {
      /**
       * The PayPal Billing Agreement ID (BAID). This is an ID generated by PayPal which represents
       * the mandate between the merchant and the customer.
       */
      @SerializedName("billing_agreement_id")
      String billingAgreementId;

      /** PayPal account PayerID. This identifier uniquely identifies the PayPal customer. */
      @SerializedName("payer_id")
      String payerId;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {
      /** The unique reference of the mandate. */
      @SerializedName("reference")
      String reference;

      /**
       * The URL of the mandate. This URL generally contains sensitive information about the
       * customer and should be shared with them exclusively.
       */
      @SerializedName("url")
      String url;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /**
       * Mandate collection method
       *
       * <p>Equal to {@code paper}.
       */
      @SerializedName("collection_method")
      String collectionMethod;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SingleUse extends StripeObject {
    /** The amount of the payment on a single use mandate. */
    @SerializedName("amount")
    Long amount;

    /** The currency of the payment on a single use mandate. */
    @SerializedName("currency")
    String currency;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(customerAcceptance, responseGetter);
    trySetResponseGetter(multiUse, responseGetter);
    trySetResponseGetter(paymentMethod, responseGetter);
    trySetResponseGetter(paymentMethodDetails, responseGetter);
    trySetResponseGetter(singleUse, responseGetter);
  }
}
