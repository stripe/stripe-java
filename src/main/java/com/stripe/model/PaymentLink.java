// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PaymentLinkListLineItemsParams;
import com.stripe.param.PaymentLinkListParams;
import com.stripe.param.PaymentLinkRetrieveParams;
import com.stripe.param.PaymentLinkUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentLink extends ApiResource implements HasId, MetadataStore<PaymentLink> {
  /**
   * Whether the payment link's {@code url} is active. If {@code false}, customers visiting the URL
   * will be shown a page saying that the link has been deactivated.
   */
  @SerializedName("active")
  Boolean active;

  @SerializedName("after_completion")
  AfterCompletion afterCompletion;

  /** Whether user redeemable promotion codes are enabled. */
  @SerializedName("allow_promotion_codes")
  Boolean allowPromotionCodes;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * This represents the percentage of the subscription invoice subtotal that will be transferred to
   * the application owner's Stripe account.
   */
  @SerializedName("application_fee_percent")
  BigDecimal applicationFeePercent;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Configuration for collecting the customer's billing address.
   *
   * <p>One of {@code auto}, or {@code required}.
   */
  @SerializedName("billing_address_collection")
  String billingAddressCollection;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The line items representing what is being sold. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

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
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_link}.
   */
  @SerializedName("object")
  String object;

  /**
   * The account on behalf of which to charge. See the <a
   * href="https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts">Connect
   * documentation</a> for details.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /**
   * The list of payment method types that customers can use. When {@code null}, Stripe will
   * dynamically show relevant payment methods you've enabled in your <a
   * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  @SerializedName("phone_number_collection")
  PhoneNumberCollection phoneNumberCollection;

  /** Configuration for collecting the customer's shipping address. */
  @SerializedName("shipping_address_collection")
  ShippingAddressCollection shippingAddressCollection;

  /**
   * When creating a subscription, the specified configuration data will be used. There must be at
   * least one line item with a recurring price to use {@code subscription_data}.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  /**
   * The account (if any) the payments will be attributed to for tax reporting, and where funds from
   * each payment will be transferred to.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /** The public URL that can be shared with customers. */
  @SerializedName("url")
  String url;

  /** Get ID of expandable {@code onBehalfOf} object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded {@code onBehalfOf}. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_links");
    return ApiResource.requestCollection(url, params, PaymentLinkCollection.class, options);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(PaymentLinkListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(PaymentLinkListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_links");
    return ApiResource.requestCollection(url, params, PaymentLinkCollection.class, options);
  }

  /** Retrieve a payment link. */
  public static PaymentLink retrieve(String paymentLink) throws StripeException {
    return retrieve(paymentLink, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a payment link. */
  public static PaymentLink retrieve(String paymentLink, RequestOptions options)
      throws StripeException {
    return retrieve(paymentLink, (Map<String, Object>) null, options);
  }

  /** Retrieve a payment link. */
  public static PaymentLink retrieve(
      String paymentLink, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(paymentLink)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentLink.class, options);
  }

  /** Retrieve a payment link. */
  public static PaymentLink retrieve(
      String paymentLink, PaymentLinkRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(paymentLink)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentLink.class, options);
  }

  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems() throws StripeException {
    return listLineItems((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/payment_links/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(PaymentLinkListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public LineItemCollection listLineItems(
      PaymentLinkListLineItemsParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/payment_links/%s/line_items", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  /** Creates a payment link. */
  public static PaymentLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment link. */
  public static PaymentLink create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_links");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentLink.class, options);
  }

  /** Creates a payment link. */
  public static PaymentLink create(PaymentLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment link. */
  public static PaymentLink create(PaymentLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_links");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentLink.class, options);
  }

  /** Updates a payment link. */
  @Override
  public PaymentLink update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a payment link. */
  @Override
  public PaymentLink update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentLink.class, options);
  }

  /** Updates a payment link. */
  public PaymentLink update(PaymentLinkUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a payment link. */
  public PaymentLink update(PaymentLinkUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentLink.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AfterCompletion extends StripeObject {
    @SerializedName("hosted_confirmation")
    HostedConfirmation hostedConfirmation;

    @SerializedName("redirect")
    Redirect redirect;

    /**
     * The specified behavior after the purchase is complete.
     *
     * <p>One of {@code hosted_confirmation}, or {@code redirect}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class HostedConfirmation extends StripeObject {
      /** The custom message that is displayed to the customer after the purchase is complete. */
      @SerializedName("custom_message")
      String customMessage;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Redirect extends StripeObject {
      /** The URL the customer will be redirected to after the purchase is complete. */
      @SerializedName("url")
      String url;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** If {@code true}, tax will be calculated automatically using the customer's location. */
    @SerializedName("enabled")
    Boolean enabled;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PhoneNumberCollection extends StripeObject {
    /** If {@code true}, a phone number will be collected during checkout. */
    @SerializedName("enabled")
    Boolean enabled;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingAddressCollection extends StripeObject {
    /**
     * An array of two-letter ISO country codes representing which countries Checkout should provide
     * as options for shipping locations. Unsupported country codes: {@code AS, CX, CC, CU, HM, IR,
     * KP, MH, FM, NF, MP, PW, SD, SY, UM, VI}.
     */
    @SerializedName("allowed_countries")
    List<String> allowedCountries;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionData extends StripeObject {
    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The amount in %s that will be transferred to the destination account. By default, the entire
     * amount is transferred to the destination.
     */
    @SerializedName("amount")
    Long amount;

    /** The connected account receiving the transfer. */
    @SerializedName("destination")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> destination;

    /** Get ID of expandable {@code destination} object. */
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String id) {
      this.destination = ApiResource.setExpandableFieldId(id, this.destination);
    }

    /** Get expanded {@code destination}. */
    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account expandableObject) {
      this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }
}
