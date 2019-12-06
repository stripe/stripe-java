package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.MandateRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("multi_use")
  MultiUse multiUse;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `mandate`.
   */
  @SerializedName("object")
  String object;

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
   * The status of the Mandate, one of `active`, `inactive`, or `pending`. The Mandate can be used
   * to initiate a payment only if status=active.
   */
  @SerializedName("status")
  String status;

  /** The type of the mandate, one of `multi_use` or `single_use`. */
  @SerializedName("type")
  String type;

  /** Get id of expandable `paymentMethod` object. */
  public String getPaymentMethod() {
    return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
  }

  public void setPaymentMethod(String id) {
    this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
  }

  /** Get expanded `paymentMethod`. */
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/mandates/%s", ApiResource.urlEncodeId(mandate)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Mandate.class, options);
  }

  /** Retrieves a Mandate object. */
  public static Mandate retrieve(
      String mandate, MandateRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/mandates/%s", ApiResource.urlEncodeId(mandate)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Mandate.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecsDebit extends StripeObject {
    @SerializedName("url")
    String url;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerAcceptance extends StripeObject {
    /** The time at which the customer accepted the Mandate. */
    @SerializedName("accepted_at")
    Long acceptedAt;

    @SerializedName("offline")
    Offline offline;

    @SerializedName("online")
    Online online;

    /**
     * The type of customer acceptance information included with the Mandate. One of `online` or
     * `offline`.
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
      /** The IP address from which the Mandate was accepted by the customer. */
      @SerializedName("ip_address")
      String ipAddress;

      /** The user agent of the browser from which the Mandate was accepted by the customer. */
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
    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("card")
    Card card;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    /**
     * The type of the payment method associated with this mandate. An additional hash is included
     * on `payment_method_details` with a name matching this value. It contains mandate information
     * specific to the payment method.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {}

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
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SingleUse extends StripeObject {
    /** On a single use mandate, the amount of the payment. */
    @SerializedName("amount")
    Long amount;

    /** On a single use mandate, the currency of the payment. */
    @SerializedName("currency")
    String currency;
  }
}
