// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PaymentLinkListLineItemsParams;
import com.stripe.param.PaymentLinkListParams;
import com.stripe.param.PaymentLinkRetrieveParams;
import com.stripe.param.PaymentLinkUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A payment link is a shareable URL that will take your customers to a hosted payment page. A
 * payment link can be shared and used multiple times.
 *
 * <p>When a customer opens a payment link it will open a new <a
 * href="https://stripe.com/docs/api/checkout/sessions">checkout session</a> to render the payment
 * page. You can use <a
 * href="https://stripe.com/docs/api/events/types#event_types-checkout.session.completed">checkout
 * session events</a> to track payments through payment links.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/payment-links">Payment Links API</a>
 */
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

  /** The ID of the Connect application that created the Payment Link. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * This represents the percentage of the subscription invoice total that will be transferred to
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

  /** When set, provides configuration to gather active consent from customers. */
  @SerializedName("consent_collection")
  ConsentCollection consentCollection;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Collect additional information from your customer using custom fields. Up to 2 fields are
   * supported.
   */
  @SerializedName("custom_fields")
  List<PaymentLink.CustomField> customFields;

  @SerializedName("custom_text")
  CustomText customText;

  /**
   * Configuration for Customer creation during checkout.
   *
   * <p>One of {@code always}, or {@code if_required}.
   */
  @SerializedName("customer_creation")
  String customerCreation;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The custom message to be displayed to a customer when a payment link is no longer active. */
  @SerializedName("inactive_message")
  String inactiveMessage;

  /** Configuration for creating invoice for payment mode payment links. */
  @SerializedName("invoice_creation")
  InvoiceCreation invoiceCreation;

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

  /** Indicates the parameters to be passed to PaymentIntent creation during checkout. */
  @SerializedName("payment_intent_data")
  PaymentIntentData paymentIntentData;

  /**
   * Configuration for collecting a payment method during checkout.
   *
   * <p>One of {@code always}, or {@code if_required}.
   */
  @SerializedName("payment_method_collection")
  String paymentMethodCollection;

  /**
   * The list of payment method types that customers can use. When {@code null}, Stripe will
   * dynamically show relevant payment methods you've enabled in your <a
   * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  @SerializedName("phone_number_collection")
  PhoneNumberCollection phoneNumberCollection;

  /** Settings that restrict the usage of a payment link. */
  @SerializedName("restrictions")
  Restrictions restrictions;

  /** Configuration for collecting the customer's shipping address. */
  @SerializedName("shipping_address_collection")
  ShippingAddressCollection shippingAddressCollection;

  /** The shipping rate options applied to the session. */
  @SerializedName("shipping_options")
  List<PaymentLink.ShippingOption> shippingOptions;

  /**
   * Indicates the type of transaction being performed which customizes relevant text on the page,
   * such as the submit button.
   *
   * <p>One of {@code auto}, {@code book}, {@code donate}, or {@code pay}.
   */
  @SerializedName("submit_type")
  String submitType;

  /**
   * When creating a subscription, the specified configuration data will be used. There must be at
   * least one line item with a recurring price to use {@code subscription_data}.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  @SerializedName("tax_id_collection")
  TaxIdCollection taxIdCollection;

  /**
   * The account (if any) the payments will be attributed to for tax reporting, and where funds from
   * each payment will be transferred to.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /** The public URL that can be shared with customers. */
  @SerializedName("url")
  String url;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

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

  /** Creates a payment link. */
  public static PaymentLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment link. */
  public static PaymentLink create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            PaymentLink.class,
            options,
            ApiMode.V1);
  }

  /** Creates a payment link. */
  public static PaymentLink create(PaymentLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment link. */
  public static PaymentLink create(PaymentLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentLink.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            PaymentLinkCollection.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(PaymentLinkListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your payment links. */
  public static PaymentLinkCollection list(PaymentLinkListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentLinkCollection.class,
            options,
            ApiMode.V1);
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
    String path =
        String.format("/v1/payment_links/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            LineItemCollection.class,
            options,
            ApiMode.V1);
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
    String path =
        String.format("/v1/payment_links/%s/line_items", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            LineItemCollection.class,
            options,
            ApiMode.V1);
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
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(paymentLink));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            PaymentLink.class,
            options,
            ApiMode.V1);
  }

  /** Retrieve a payment link. */
  public static PaymentLink retrieve(
      String paymentLink, PaymentLinkRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(paymentLink));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentLink.class,
            options,
            ApiMode.V1);
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
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            PaymentLink.class,
            options,
            ApiMode.V1);
  }

  /** Updates a payment link. */
  public PaymentLink update(PaymentLinkUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a payment link. */
  public PaymentLink update(PaymentLinkUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentLink.class,
            options,
            ApiMode.V1);
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

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Liability extends StripeObject {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Account> account;

      /**
       * Type of the account referenced.
       *
       * <p>One of {@code account}, or {@code self}.
       */
      @SerializedName("type")
      String type;

      /** Get ID of expandable {@code account} object. */
      public String getAccount() {
        return (this.account != null) ? this.account.getId() : null;
      }

      public void setAccount(String id) {
        this.account = ApiResource.setExpandableFieldId(id, this.account);
      }

      /** Get expanded {@code account}. */
      public Account getAccountObject() {
        return (this.account != null) ? this.account.getExpanded() : null;
      }

      public void setAccountObject(Account expandableObject) {
        this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ConsentCollection extends StripeObject {
    /**
     * If set to {@code auto}, enables the collection of customer consent for promotional
     * communications.
     *
     * <p>One of {@code auto}, or {@code none}.
     */
    @SerializedName("promotions")
    String promotions;

    /**
     * If set to {@code required}, it requires cutomers to accept the terms of service before being
     * able to pay. If set to {@code none}, customers won't be shown a checkbox to accept the terms
     * of service.
     *
     * <p>One of {@code none}, or {@code required}.
     */
    @SerializedName("terms_of_service")
    String termsOfService;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomField extends StripeObject {
    @SerializedName("dropdown")
    Dropdown dropdown;

    /**
     * String of your choice that your integration can use to reconcile this field. Must be unique
     * to this field, alphanumeric, and up to 200 characters.
     */
    @SerializedName("key")
    String key;

    @SerializedName("label")
    Label label;

    @SerializedName("numeric")
    Numeric numeric;

    /**
     * Whether the customer is required to complete the field before completing the Checkout
     * Session. Defaults to {@code false}.
     */
    @SerializedName("optional")
    Boolean optional;

    @SerializedName("text")
    Text text;

    /**
     * The type of the field.
     *
     * <p>One of {@code dropdown}, {@code numeric}, or {@code text}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dropdown extends StripeObject {
      /** The options available for the customer to select. Up to 200 options allowed. */
      @SerializedName("options")
      List<PaymentLink.CustomField.Dropdown.Option> options;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Option extends StripeObject {
        /** The label for the option, displayed to the customer. Up to 100 characters. */
        @SerializedName("label")
        String label;

        /**
         * The value for this option, not displayed to the customer, used by your integration to
         * reconcile the option selected by the customer. Must be unique to this option,
         * alphanumeric, and up to 100 characters.
         */
        @SerializedName("value")
        String value;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Label extends StripeObject {
      /** Custom text for the label, displayed to the customer. Up to 50 characters. */
      @SerializedName("custom")
      String custom;

      /**
       * The type of the label.
       *
       * <p>Equal to {@code custom}.
       */
      @SerializedName("type")
      String type;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Numeric extends StripeObject {
      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Text extends StripeObject {
      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomText extends StripeObject {
    /** Custom text that should be displayed alongside shipping address collection. */
    @SerializedName("shipping_address")
    ShippingAddress shippingAddress;

    /** Custom text that should be displayed alongside the payment confirmation button. */
    @SerializedName("submit")
    Submit submit;

    /**
     * Custom text that should be displayed in place of the default terms of service agreement text.
     */
    @SerializedName("terms_of_service_acceptance")
    TermsOfServiceAcceptance termsOfServiceAcceptance;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingAddress extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Submit extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TermsOfServiceAcceptance extends StripeObject {
      /** Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InvoiceCreation extends StripeObject {
    /** Enable creating an invoice on successful payment. */
    @SerializedName("enabled")
    Boolean enabled;

    /** Configuration for the invoice. Default invoice values will be used if unspecified. */
    @SerializedName("invoice_data")
    InvoiceData invoiceData;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceData extends StripeObject {
      /** The account tax IDs associated with the invoice. */
      @SerializedName("account_tax_ids")
      List<ExpandableField<TaxId>> accountTaxIds;

      /** A list of up to 4 custom fields to be displayed on the invoice. */
      @SerializedName("custom_fields")
      List<PaymentLink.InvoiceCreation.InvoiceData.CustomField> customFields;

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      @SerializedName("description")
      String description;

      /** Footer to be displayed on the invoice. */
      @SerializedName("footer")
      String footer;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** Options for invoice PDF rendering. */
      @SerializedName("rendering_options")
      RenderingOptions renderingOptions;

      /** Get IDs of expandable {@code accountTaxIds} object list. */
      public List<String> getAccountTaxIds() {
        return (this.accountTaxIds != null)
            ? this.accountTaxIds.stream().map(x -> x.getId()).collect(Collectors.toList())
            : null;
      }

      public void setAccountTaxIds(List<String> ids) {
        if (ids == null) {
          this.accountTaxIds = null;
          return;
        }
        if (this.accountTaxIds != null
            && this.accountTaxIds.stream()
                .map(x -> x.getId())
                .collect(Collectors.toList())
                .equals(ids)) {
          // noop if the ids are equal to what are already present
          return;
        }
        this.accountTaxIds =
            (ids != null)
                ? ids.stream()
                    .map(id -> new ExpandableField<TaxId>(id, null))
                    .collect(Collectors.toList())
                : null;
      }

      /** Get expanded {@code accountTaxIds}. */
      public List<TaxId> getAccountTaxIdObjects() {
        return (this.accountTaxIds != null)
            ? this.accountTaxIds.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
            : null;
      }

      public void setAccountTaxIdObjects(List<TaxId> objs) {
        this.accountTaxIds =
            objs != null
                ? objs.stream()
                    .map(x -> new ExpandableField<TaxId>(x.getId(), x))
                    .collect(Collectors.toList())
                : null;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomField extends StripeObject {
        /** The name of the custom field. */
        @SerializedName("name")
        String name;

        /** The value of the custom field. */
        @SerializedName("value")
        String value;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer extends StripeObject {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<Account> account;

        /**
         * Type of the account referenced.
         *
         * <p>One of {@code account}, or {@code self}.
         */
        @SerializedName("type")
        String type;

        /** Get ID of expandable {@code account} object. */
        public String getAccount() {
          return (this.account != null) ? this.account.getId() : null;
        }

        public void setAccount(String id) {
          this.account = ApiResource.setExpandableFieldId(id, this.account);
        }

        /** Get expanded {@code account}. */
        public Account getAccountObject() {
          return (this.account != null) ? this.account.getExpanded() : null;
        }

        public void setAccountObject(Account expandableObject) {
          this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
        }
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class RenderingOptions extends StripeObject {
        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         */
        @SerializedName("amount_tax_display")
        String amountTaxDisplay;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentIntentData extends StripeObject {
    /**
     * Indicates when the funds will be captured from the customer's account.
     *
     * <p>One of {@code automatic}, {@code automatic_async}, or {@code manual}.
     */
    @SerializedName("capture_method")
    String captureMethod;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    @SerializedName("description")
    String description;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will set
     * metadata on <a href="https://stripe.com/docs/api/payment_intents">Payment Intents</a>
     * generated from this payment link.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * Indicates that you intend to make future payments with the payment method collected during
     * checkout.
     *
     * <p>One of {@code off_session}, or {@code on_session}.
     */
    @SerializedName("setup_future_usage")
    String setupFutureUsage;

    /**
     * Extra information about the payment. This will appear on your customer's statement when this
     * payment succeeds in creating a charge.
     */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /**
     * Provides information about the charge that customers see on their statements. Concatenated
     * with the prefix (shortened descriptor) or statement descriptor that's set on the account to
     * form the complete statement descriptor. Maximum 22 characters for the concatenated
     * descriptor.
     */
    @SerializedName("statement_descriptor_suffix")
    String statementDescriptorSuffix;
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
  public static class Restrictions extends StripeObject {
    @SerializedName("completed_sessions")
    CompletedSessions completedSessions;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CompletedSessions extends StripeObject {
      /**
       * The current number of checkout sessions that have been completed on the payment link which
       * count towards the {@code completed_sessions} restriction to be met.
       */
      @SerializedName("count")
      Long count;

      /**
       * The maximum number of checkout sessions that can be completed for the {@code
       * completed_sessions} restriction to be met.
       */
      @SerializedName("limit")
      Long limit;
    }
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
  public static class ShippingOption extends StripeObject {
    /** A non-negative integer in cents representing how much to charge. */
    @SerializedName("shipping_amount")
    Long shippingAmount;

    /** The ID of the Shipping Rate to use for this shipping option. */
    @SerializedName("shipping_rate")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<ShippingRate> shippingRate;

    /** Get ID of expandable {@code shippingRate} object. */
    public String getShippingRate() {
      return (this.shippingRate != null) ? this.shippingRate.getId() : null;
    }

    public void setShippingRate(String id) {
      this.shippingRate = ApiResource.setExpandableFieldId(id, this.shippingRate);
    }

    /** Get expanded {@code shippingRate}. */
    public ShippingRate getShippingRateObject() {
      return (this.shippingRate != null) ? this.shippingRate.getExpanded() : null;
    }

    public void setShippingRateObject(ShippingRate expandableObject) {
      this.shippingRate =
          new ExpandableField<ShippingRate>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SubscriptionData extends StripeObject {
    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription for rendering in Stripe surfaces and
     * certain local payment methods UIs.
     */
    @SerializedName("description")
    String description;

    /** All invoices will be billed using the specified settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will set
     * metadata on <a href="https://stripe.com/docs/api/subscriptions">Subscriptions</a> generated
     * from this payment link.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    /** Settings related to subscription trials. */
    @SerializedName("trial_settings")
    TrialSettings trialSettings;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings extends StripeObject {
      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Issuer extends StripeObject {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        @Getter(lombok.AccessLevel.NONE)
        @Setter(lombok.AccessLevel.NONE)
        ExpandableField<Account> account;

        /**
         * Type of the account referenced.
         *
         * <p>One of {@code account}, or {@code self}.
         */
        @SerializedName("type")
        String type;

        /** Get ID of expandable {@code account} object. */
        public String getAccount() {
          return (this.account != null) ? this.account.getId() : null;
        }

        public void setAccount(String id) {
          this.account = ApiResource.setExpandableFieldId(id, this.account);
        }

        /** Get expanded {@code account}. */
        public Account getAccountObject() {
          return (this.account != null) ? this.account.getExpanded() : null;
        }

        public void setAccountObject(Account expandableObject) {
          this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
        }
      }
    }

    /** Configures how this subscription behaves during the trial period. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TrialSettings extends StripeObject {
      /** Defines how a subscription behaves when a free trial ends. */
      @SerializedName("end_behavior")
      EndBehavior endBehavior;

      /** Defines how a subscription behaves when a free trial ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EndBehavior extends StripeObject {
        /**
         * Indicates how the subscription should change when the trial ends if the user did not
         * provide a payment method.
         *
         * <p>One of {@code cancel}, {@code create_invoice}, or {@code pause}.
         */
        @SerializedName("missing_payment_method")
        String missingPaymentMethod;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxIdCollection extends StripeObject {
    /** Indicates whether tax ID collection is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The amount in cents (or local equivalent) that will be transferred to the destination
     * account. By default, the entire amount is transferred to the destination.
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(afterCompletion, responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(automaticTax, responseGetter);
    trySetResponseGetter(consentCollection, responseGetter);
    trySetResponseGetter(customText, responseGetter);
    trySetResponseGetter(invoiceCreation, responseGetter);
    trySetResponseGetter(lineItems, responseGetter);
    trySetResponseGetter(onBehalfOf, responseGetter);
    trySetResponseGetter(paymentIntentData, responseGetter);
    trySetResponseGetter(phoneNumberCollection, responseGetter);
    trySetResponseGetter(restrictions, responseGetter);
    trySetResponseGetter(shippingAddressCollection, responseGetter);
    trySetResponseGetter(subscriptionData, responseGetter);
    trySetResponseGetter(taxIdCollection, responseGetter);
    trySetResponseGetter(transferData, responseGetter);
  }
}
