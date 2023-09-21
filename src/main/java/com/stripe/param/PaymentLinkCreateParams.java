// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentLinkCreateParams extends ApiRequestParams {
  /** Behavior after the purchase is complete. */
  @SerializedName("after_completion")
  AfterCompletion afterCompletion;

  /** Enables user redeemable promotion codes. */
  @SerializedName("allow_promotion_codes")
  Boolean allowPromotionCodes;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. Can only be applied when there are
   * no line items with recurring prices.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the
   * percentage of the subscription invoice total that will be transferred to the application
   * owner's Stripe account. There must be at least 1 line item with a recurring price to use this
   * field.
   */
  @SerializedName("application_fee_percent")
  BigDecimal applicationFeePercent;

  /** Configuration for automatic tax collection. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /** Configuration for collecting the customer's billing address. */
  @SerializedName("billing_address_collection")
  BillingAddressCollection billingAddressCollection;

  /** Configure fields to gather active consent from customers. */
  @SerializedName("consent_collection")
  ConsentCollection consentCollection;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a> and
   * supported by each line item's price.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Collect additional information from your customer using custom fields. Up to 2 fields are
   * supported.
   */
  @SerializedName("custom_fields")
  List<PaymentLinkCreateParams.CustomField> customFields;

  /** Display additional text for your customers using custom text. */
  @SerializedName("custom_text")
  CustomText customText;

  /**
   * Configures whether <a href="https://stripe.com/docs/api/checkout/sessions">checkout
   * sessions</a> created by this payment link create a <a
   * href="https://stripe.com/docs/api/customers">Customer</a>.
   */
  @SerializedName("customer_creation")
  CustomerCreation customerCreation;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Generate a post-purchase Invoice for one-time payments. */
  @SerializedName("invoice_creation")
  InvoiceCreation invoiceCreation;

  /**
   * <strong>Required.</strong> The line items representing what is being sold. Each line item
   * represents an item being sold. Up to 20 line items are supported.
   */
  @SerializedName("line_items")
  List<PaymentLinkCreateParams.LineItem> lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}. Metadata associated with this Payment
   * Link will automatically be copied to <a
   * href="https://stripe.com/docs/api/checkout/sessions">checkout sessions</a> created by this
   * payment link.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The account on behalf of which to charge. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in {@code
   * payment} mode.
   */
  @SerializedName("payment_intent_data")
  PaymentIntentData paymentIntentData;

  /**
   * Specify whether Checkout should collect a payment method. When set to {@code if_required},
   * Checkout will not collect a payment method when the total due for the session is 0.This may
   * occur if the Checkout Session includes a free trial or a discount.
   *
   * <p>Can only be set in {@code subscription} mode.
   *
   * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
   * guide on <a href="https://stripe.com/docs/payments/checkout/free-trials">configuring
   * subscriptions with a free trial</a>.
   */
  @SerializedName("payment_method_collection")
  PaymentMethodCollection paymentMethodCollection;

  /**
   * The list of payment method types that customers can use. If no value is passed, Stripe will
   * dynamically show relevant payment methods from your <a
   * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a> (20+
   * payment methods <a
   * href="https://stripe.com/docs/payments/payment-methods/integration-options#payment-method-product-support">supported</a>).
   */
  @SerializedName("payment_method_types")
  List<PaymentLinkCreateParams.PaymentMethodType> paymentMethodTypes;

  /**
   * Controls phone number collection settings during checkout.
   *
   * <p>We recommend that you review your privacy policy and check with your legal contacts.
   */
  @SerializedName("phone_number_collection")
  PhoneNumberCollection phoneNumberCollection;

  /** Configuration for collecting the customer's shipping address. */
  @SerializedName("shipping_address_collection")
  ShippingAddressCollection shippingAddressCollection;

  /**
   * The shipping rate options to apply to <a
   * href="https://stripe.com/docs/api/checkout/sessions">checkout sessions</a> created by this
   * payment link.
   */
  @SerializedName("shipping_options")
  List<PaymentLinkCreateParams.ShippingOption> shippingOptions;

  /**
   * Describes the type of transaction being performed in order to customize relevant text on the
   * page, such as the submit button. Changing this value will also affect the hostname in the <a
   * href="https://stripe.com/docs/api/payment_links/payment_links/object#url">url</a> property
   * (example: {@code donate.stripe.com}).
   */
  @SerializedName("submit_type")
  SubmitType submitType;

  /**
   * When creating a subscription, the specified configuration data will be used. There must be at
   * least one line item with a recurring price to use {@code subscription_data}.
   */
  @SerializedName("subscription_data")
  SubscriptionData subscriptionData;

  /** Controls tax ID collection during checkout. */
  @SerializedName("tax_id_collection")
  TaxIdCollection taxIdCollection;

  /**
   * The account (if any) the payments will be attributed to for tax reporting, and where funds from
   * each payment will be transferred to.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private PaymentLinkCreateParams(
      AfterCompletion afterCompletion,
      Boolean allowPromotionCodes,
      Long applicationFeeAmount,
      BigDecimal applicationFeePercent,
      AutomaticTax automaticTax,
      BillingAddressCollection billingAddressCollection,
      ConsentCollection consentCollection,
      String currency,
      List<PaymentLinkCreateParams.CustomField> customFields,
      CustomText customText,
      CustomerCreation customerCreation,
      List<String> expand,
      Map<String, Object> extraParams,
      InvoiceCreation invoiceCreation,
      List<PaymentLinkCreateParams.LineItem> lineItems,
      Map<String, String> metadata,
      String onBehalfOf,
      PaymentIntentData paymentIntentData,
      PaymentMethodCollection paymentMethodCollection,
      List<PaymentLinkCreateParams.PaymentMethodType> paymentMethodTypes,
      PhoneNumberCollection phoneNumberCollection,
      ShippingAddressCollection shippingAddressCollection,
      List<PaymentLinkCreateParams.ShippingOption> shippingOptions,
      SubmitType submitType,
      SubscriptionData subscriptionData,
      TaxIdCollection taxIdCollection,
      TransferData transferData) {
    this.afterCompletion = afterCompletion;
    this.allowPromotionCodes = allowPromotionCodes;
    this.applicationFeeAmount = applicationFeeAmount;
    this.applicationFeePercent = applicationFeePercent;
    this.automaticTax = automaticTax;
    this.billingAddressCollection = billingAddressCollection;
    this.consentCollection = consentCollection;
    this.currency = currency;
    this.customFields = customFields;
    this.customText = customText;
    this.customerCreation = customerCreation;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceCreation = invoiceCreation;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentIntentData = paymentIntentData;
    this.paymentMethodCollection = paymentMethodCollection;
    this.paymentMethodTypes = paymentMethodTypes;
    this.phoneNumberCollection = phoneNumberCollection;
    this.shippingAddressCollection = shippingAddressCollection;
    this.shippingOptions = shippingOptions;
    this.submitType = submitType;
    this.subscriptionData = subscriptionData;
    this.taxIdCollection = taxIdCollection;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AfterCompletion afterCompletion;

    private Boolean allowPromotionCodes;

    private Long applicationFeeAmount;

    private BigDecimal applicationFeePercent;

    private AutomaticTax automaticTax;

    private BillingAddressCollection billingAddressCollection;

    private ConsentCollection consentCollection;

    private String currency;

    private List<PaymentLinkCreateParams.CustomField> customFields;

    private CustomText customText;

    private CustomerCreation customerCreation;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private InvoiceCreation invoiceCreation;

    private List<PaymentLinkCreateParams.LineItem> lineItems;

    private Map<String, String> metadata;

    private String onBehalfOf;

    private PaymentIntentData paymentIntentData;

    private PaymentMethodCollection paymentMethodCollection;

    private List<PaymentLinkCreateParams.PaymentMethodType> paymentMethodTypes;

    private PhoneNumberCollection phoneNumberCollection;

    private ShippingAddressCollection shippingAddressCollection;

    private List<PaymentLinkCreateParams.ShippingOption> shippingOptions;

    private SubmitType submitType;

    private SubscriptionData subscriptionData;

    private TaxIdCollection taxIdCollection;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentLinkCreateParams build() {
      return new PaymentLinkCreateParams(
          this.afterCompletion,
          this.allowPromotionCodes,
          this.applicationFeeAmount,
          this.applicationFeePercent,
          this.automaticTax,
          this.billingAddressCollection,
          this.consentCollection,
          this.currency,
          this.customFields,
          this.customText,
          this.customerCreation,
          this.expand,
          this.extraParams,
          this.invoiceCreation,
          this.lineItems,
          this.metadata,
          this.onBehalfOf,
          this.paymentIntentData,
          this.paymentMethodCollection,
          this.paymentMethodTypes,
          this.phoneNumberCollection,
          this.shippingAddressCollection,
          this.shippingOptions,
          this.submitType,
          this.subscriptionData,
          this.taxIdCollection,
          this.transferData);
    }

    /** Behavior after the purchase is complete. */
    public Builder setAfterCompletion(PaymentLinkCreateParams.AfterCompletion afterCompletion) {
      this.afterCompletion = afterCompletion;
      return this;
    }

    /** Enables user redeemable promotion codes. */
    public Builder setAllowPromotionCodes(Boolean allowPromotionCodes) {
      this.allowPromotionCodes = allowPromotionCodes;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. Can only be applied when
     * there are no line items with recurring prices.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents
     * the percentage of the subscription invoice total that will be transferred to the application
     * owner's Stripe account. There must be at least 1 line item with a recurring price to use this
     * field.
     */
    public Builder setApplicationFeePercent(BigDecimal applicationFeePercent) {
      this.applicationFeePercent = applicationFeePercent;
      return this;
    }

    /** Configuration for automatic tax collection. */
    public Builder setAutomaticTax(PaymentLinkCreateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /** Configuration for collecting the customer's billing address. */
    public Builder setBillingAddressCollection(
        PaymentLinkCreateParams.BillingAddressCollection billingAddressCollection) {
      this.billingAddressCollection = billingAddressCollection;
      return this;
    }

    /** Configure fields to gather active consent from customers. */
    public Builder setConsentCollection(
        PaymentLinkCreateParams.ConsentCollection consentCollection) {
      this.consentCollection = consentCollection;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a> and supported by each line item's price.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `customFields` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#customFields} for the field documentation.
     */
    public Builder addCustomField(PaymentLinkCreateParams.CustomField element) {
      if (this.customFields == null) {
        this.customFields = new ArrayList<>();
      }
      this.customFields.add(element);
      return this;
    }

    /**
     * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#customFields} for the field documentation.
     */
    public Builder addAllCustomField(List<PaymentLinkCreateParams.CustomField> elements) {
      if (this.customFields == null) {
        this.customFields = new ArrayList<>();
      }
      this.customFields.addAll(elements);
      return this;
    }

    /** Display additional text for your customers using custom text. */
    public Builder setCustomText(PaymentLinkCreateParams.CustomText customText) {
      this.customText = customText;
      return this;
    }

    /**
     * Configures whether <a href="https://stripe.com/docs/api/checkout/sessions">checkout
     * sessions</a> created by this payment link create a <a
     * href="https://stripe.com/docs/api/customers">Customer</a>.
     */
    public Builder setCustomerCreation(PaymentLinkCreateParams.CustomerCreation customerCreation) {
      this.customerCreation = customerCreation;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentLinkCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentLinkCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Generate a post-purchase Invoice for one-time payments. */
    public Builder setInvoiceCreation(PaymentLinkCreateParams.InvoiceCreation invoiceCreation) {
      this.invoiceCreation = invoiceCreation;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(PaymentLinkCreateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<PaymentLinkCreateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentLinkCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentLinkCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The account on behalf of which to charge. */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in {@code
     * payment} mode.
     */
    public Builder setPaymentIntentData(
        PaymentLinkCreateParams.PaymentIntentData paymentIntentData) {
      this.paymentIntentData = paymentIntentData;
      return this;
    }

    /**
     * Specify whether Checkout should collect a payment method. When set to {@code if_required},
     * Checkout will not collect a payment method when the total due for the session is 0.This may
     * occur if the Checkout Session includes a free trial or a discount.
     *
     * <p>Can only be set in {@code subscription} mode.
     *
     * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
     * guide on <a href="https://stripe.com/docs/payments/checkout/free-trials">configuring
     * subscriptions with a free trial</a>.
     */
    public Builder setPaymentMethodCollection(
        PaymentLinkCreateParams.PaymentMethodCollection paymentMethodCollection) {
      this.paymentMethodCollection = paymentMethodCollection;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addPaymentMethodType(PaymentLinkCreateParams.PaymentMethodType element) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PaymentLinkCreateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addAllPaymentMethodType(
        List<PaymentLinkCreateParams.PaymentMethodType> elements) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(elements);
      return this;
    }

    /**
     * Controls phone number collection settings during checkout.
     *
     * <p>We recommend that you review your privacy policy and check with your legal contacts.
     */
    public Builder setPhoneNumberCollection(
        PaymentLinkCreateParams.PhoneNumberCollection phoneNumberCollection) {
      this.phoneNumberCollection = phoneNumberCollection;
      return this;
    }

    /** Configuration for collecting the customer's shipping address. */
    public Builder setShippingAddressCollection(
        PaymentLinkCreateParams.ShippingAddressCollection shippingAddressCollection) {
      this.shippingAddressCollection = shippingAddressCollection;
      return this;
    }

    /**
     * Add an element to `shippingOptions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#shippingOptions} for the field documentation.
     */
    public Builder addShippingOption(PaymentLinkCreateParams.ShippingOption element) {
      if (this.shippingOptions == null) {
        this.shippingOptions = new ArrayList<>();
      }
      this.shippingOptions.add(element);
      return this;
    }

    /**
     * Add all elements to `shippingOptions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkCreateParams#shippingOptions} for the field documentation.
     */
    public Builder addAllShippingOption(List<PaymentLinkCreateParams.ShippingOption> elements) {
      if (this.shippingOptions == null) {
        this.shippingOptions = new ArrayList<>();
      }
      this.shippingOptions.addAll(elements);
      return this;
    }

    /**
     * Describes the type of transaction being performed in order to customize relevant text on the
     * page, such as the submit button. Changing this value will also affect the hostname in the <a
     * href="https://stripe.com/docs/api/payment_links/payment_links/object#url">url</a> property
     * (example: {@code donate.stripe.com}).
     */
    public Builder setSubmitType(PaymentLinkCreateParams.SubmitType submitType) {
      this.submitType = submitType;
      return this;
    }

    /**
     * When creating a subscription, the specified configuration data will be used. There must be at
     * least one line item with a recurring price to use {@code subscription_data}.
     */
    public Builder setSubscriptionData(PaymentLinkCreateParams.SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    /** Controls tax ID collection during checkout. */
    public Builder setTaxIdCollection(PaymentLinkCreateParams.TaxIdCollection taxIdCollection) {
      this.taxIdCollection = taxIdCollection;
      return this;
    }

    /**
     * The account (if any) the payments will be attributed to for tax reporting, and where funds
     * from each payment will be transferred to.
     */
    public Builder setTransferData(PaymentLinkCreateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  public static class AfterCompletion {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Configuration when {@code type=hosted_confirmation}. */
    @SerializedName("hosted_confirmation")
    HostedConfirmation hostedConfirmation;

    /** Configuration when {@code type=redirect}. */
    @SerializedName("redirect")
    Redirect redirect;

    /**
     * <strong>Required.</strong> The specified behavior after the purchase is complete. Either
     * {@code redirect} or {@code hosted_confirmation}.
     */
    @SerializedName("type")
    Type type;

    private AfterCompletion(
        Map<String, Object> extraParams,
        HostedConfirmation hostedConfirmation,
        Redirect redirect,
        Type type) {
      this.extraParams = extraParams;
      this.hostedConfirmation = hostedConfirmation;
      this.redirect = redirect;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private HostedConfirmation hostedConfirmation;

      private Redirect redirect;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.AfterCompletion build() {
        return new PaymentLinkCreateParams.AfterCompletion(
            this.extraParams, this.hostedConfirmation, this.redirect, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.AfterCompletion#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.AfterCompletion#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Configuration when {@code type=hosted_confirmation}. */
      public Builder setHostedConfirmation(
          PaymentLinkCreateParams.AfterCompletion.HostedConfirmation hostedConfirmation) {
        this.hostedConfirmation = hostedConfirmation;
        return this;
      }

      /** Configuration when {@code type=redirect}. */
      public Builder setRedirect(PaymentLinkCreateParams.AfterCompletion.Redirect redirect) {
        this.redirect = redirect;
        return this;
      }

      /**
       * <strong>Required.</strong> The specified behavior after the purchase is complete. Either
       * {@code redirect} or {@code hosted_confirmation}.
       */
      public Builder setType(PaymentLinkCreateParams.AfterCompletion.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class HostedConfirmation {
      /** A custom message to display to the customer after the purchase is complete. */
      @SerializedName("custom_message")
      String customMessage;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private HostedConfirmation(String customMessage, Map<String, Object> extraParams) {
        this.customMessage = customMessage;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String customMessage;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.AfterCompletion.HostedConfirmation build() {
          return new PaymentLinkCreateParams.AfterCompletion.HostedConfirmation(
              this.customMessage, this.extraParams);
        }

        /** A custom message to display to the customer after the purchase is complete. */
        public Builder setCustomMessage(String customMessage) {
          this.customMessage = customMessage;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.AfterCompletion.HostedConfirmation#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.AfterCompletion.HostedConfirmation#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }
    }

    @Getter
    public static class Redirect {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The URL the customer will be redirected to after the purchase is
       * complete. You can embed {@code {CHECKOUT_SESSION_ID}} into the URL to have the {@code id}
       * of the completed <a
       * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-id">checkout
       * session</a> included.
       */
      @SerializedName("url")
      String url;

      private Redirect(Map<String, Object> extraParams, String url) {
        this.extraParams = extraParams;
        this.url = url;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String url;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.AfterCompletion.Redirect build() {
          return new PaymentLinkCreateParams.AfterCompletion.Redirect(this.extraParams, this.url);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.AfterCompletion.Redirect#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.AfterCompletion.Redirect#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The URL the customer will be redirected to after the purchase
         * is complete. You can embed {@code {CHECKOUT_SESSION_ID}} into the URL to have the {@code
         * id} of the completed <a
         * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-id">checkout
         * session</a> included.
         */
        public Builder setUrl(String url) {
          this.url = url;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("hosted_confirmation")
      HOSTED_CONFIRMATION("hosted_confirmation"),

      @SerializedName("redirect")
      REDIRECT("redirect");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class AutomaticTax {
    /**
     * <strong>Required.</strong> If {@code true}, tax will be calculated automatically using the
     * customer's location.
     */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.AutomaticTax build() {
        return new PaymentLinkCreateParams.AutomaticTax(this.enabled, this.extraParams);
      }

      /**
       * <strong>Required.</strong> If {@code true}, tax will be calculated automatically using the
       * customer's location.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.AutomaticTax#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.AutomaticTax#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class ConsentCollection {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If set to {@code auto}, enables the collection of customer consent for promotional
     * communications. The Checkout Session will determine whether to display an option to opt into
     * promotional communication from the merchant depending on the customer's locale. Only
     * available to US merchants.
     */
    @SerializedName("promotions")
    Promotions promotions;

    /**
     * If set to {@code required}, it requires customers to check a terms of service checkbox before
     * being able to pay. There must be a valid terms of service URL set in your <a
     * href="https://dashboard.stripe.com/settings/public">Dashboard settings</a>.
     */
    @SerializedName("terms_of_service")
    TermsOfService termsOfService;

    private ConsentCollection(
        Map<String, Object> extraParams, Promotions promotions, TermsOfService termsOfService) {
      this.extraParams = extraParams;
      this.promotions = promotions;
      this.termsOfService = termsOfService;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Promotions promotions;

      private TermsOfService termsOfService;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.ConsentCollection build() {
        return new PaymentLinkCreateParams.ConsentCollection(
            this.extraParams, this.promotions, this.termsOfService);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.ConsentCollection#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.ConsentCollection#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * If set to {@code auto}, enables the collection of customer consent for promotional
       * communications. The Checkout Session will determine whether to display an option to opt
       * into promotional communication from the merchant depending on the customer's locale. Only
       * available to US merchants.
       */
      public Builder setPromotions(
          PaymentLinkCreateParams.ConsentCollection.Promotions promotions) {
        this.promotions = promotions;
        return this;
      }

      /**
       * If set to {@code required}, it requires customers to check a terms of service checkbox
       * before being able to pay. There must be a valid terms of service URL set in your <a
       * href="https://dashboard.stripe.com/settings/public">Dashboard settings</a>.
       */
      public Builder setTermsOfService(
          PaymentLinkCreateParams.ConsentCollection.TermsOfService termsOfService) {
        this.termsOfService = termsOfService;
        return this;
      }
    }

    public enum Promotions implements ApiRequestParams.EnumParam {
      @SerializedName("auto")
      AUTO("auto"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Promotions(String value) {
        this.value = value;
      }
    }

    public enum TermsOfService implements ApiRequestParams.EnumParam {
      @SerializedName("none")
      NONE("none"),

      @SerializedName("required")
      REQUIRED("required");

      @Getter(onMethod_ = {@Override})
      private final String value;

      TermsOfService(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class CustomField {
    /** Configuration for {@code type=dropdown} fields. */
    @SerializedName("dropdown")
    Dropdown dropdown;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> String of your choice that your integration can use to reconcile
     * this field. Must be unique to this field, alphanumeric, and up to 200 characters.
     */
    @SerializedName("key")
    String key;

    /** <strong>Required.</strong> The label for the field, displayed to the customer. */
    @SerializedName("label")
    Label label;

    /** Configuration for {@code type=numeric} fields. */
    @SerializedName("numeric")
    Numeric numeric;

    /**
     * Whether the customer is required to complete the field before completing the Checkout
     * Session. Defaults to {@code false}.
     */
    @SerializedName("optional")
    Boolean optional;

    /** Configuration for {@code type=text} fields. */
    @SerializedName("text")
    Text text;

    /** <strong>Required.</strong> The type of the field. */
    @SerializedName("type")
    Type type;

    private CustomField(
        Dropdown dropdown,
        Map<String, Object> extraParams,
        String key,
        Label label,
        Numeric numeric,
        Boolean optional,
        Text text,
        Type type) {
      this.dropdown = dropdown;
      this.extraParams = extraParams;
      this.key = key;
      this.label = label;
      this.numeric = numeric;
      this.optional = optional;
      this.text = text;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Dropdown dropdown;

      private Map<String, Object> extraParams;

      private String key;

      private Label label;

      private Numeric numeric;

      private Boolean optional;

      private Text text;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.CustomField build() {
        return new PaymentLinkCreateParams.CustomField(
            this.dropdown,
            this.extraParams,
            this.key,
            this.label,
            this.numeric,
            this.optional,
            this.text,
            this.type);
      }

      /** Configuration for {@code type=dropdown} fields. */
      public Builder setDropdown(PaymentLinkCreateParams.CustomField.Dropdown dropdown) {
        this.dropdown = dropdown;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.CustomField#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.CustomField#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> String of your choice that your integration can use to reconcile
       * this field. Must be unique to this field, alphanumeric, and up to 200 characters.
       */
      public Builder setKey(String key) {
        this.key = key;
        return this;
      }

      /** <strong>Required.</strong> The label for the field, displayed to the customer. */
      public Builder setLabel(PaymentLinkCreateParams.CustomField.Label label) {
        this.label = label;
        return this;
      }

      /** Configuration for {@code type=numeric} fields. */
      public Builder setNumeric(PaymentLinkCreateParams.CustomField.Numeric numeric) {
        this.numeric = numeric;
        return this;
      }

      /**
       * Whether the customer is required to complete the field before completing the Checkout
       * Session. Defaults to {@code false}.
       */
      public Builder setOptional(Boolean optional) {
        this.optional = optional;
        return this;
      }

      /** Configuration for {@code type=text} fields. */
      public Builder setText(PaymentLinkCreateParams.CustomField.Text text) {
        this.text = text;
        return this;
      }

      /** <strong>Required.</strong> The type of the field. */
      public Builder setType(PaymentLinkCreateParams.CustomField.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class Dropdown {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The options available for the customer to select. Up to 200
       * options allowed.
       */
      @SerializedName("options")
      List<PaymentLinkCreateParams.CustomField.Dropdown.Option> options;

      private Dropdown(
          Map<String, Object> extraParams,
          List<PaymentLinkCreateParams.CustomField.Dropdown.Option> options) {
        this.extraParams = extraParams;
        this.options = options;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<PaymentLinkCreateParams.CustomField.Dropdown.Option> options;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.CustomField.Dropdown build() {
          return new PaymentLinkCreateParams.CustomField.Dropdown(this.extraParams, this.options);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Dropdown#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Dropdown#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Add an element to `options` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkCreateParams.CustomField.Dropdown#options} for the field documentation.
         */
        public Builder addOption(PaymentLinkCreateParams.CustomField.Dropdown.Option element) {
          if (this.options == null) {
            this.options = new ArrayList<>();
          }
          this.options.add(element);
          return this;
        }

        /**
         * Add all elements to `options` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkCreateParams.CustomField.Dropdown#options} for the field documentation.
         */
        public Builder addAllOption(
            List<PaymentLinkCreateParams.CustomField.Dropdown.Option> elements) {
          if (this.options == null) {
            this.options = new ArrayList<>();
          }
          this.options.addAll(elements);
          return this;
        }
      }

      @Getter
      public static class Option {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> The label for the option, displayed to the customer. Up to 100
         * characters.
         */
        @SerializedName("label")
        String label;

        /**
         * <strong>Required.</strong> The value for this option, not displayed to the customer, used
         * by your integration to reconcile the option selected by the customer. Must be unique to
         * this option, alphanumeric, and up to 100 characters.
         */
        @SerializedName("value")
        String value;

        private Option(Map<String, Object> extraParams, String label, String value) {
          this.extraParams = extraParams;
          this.label = label;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String label;

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkCreateParams.CustomField.Dropdown.Option build() {
            return new PaymentLinkCreateParams.CustomField.Dropdown.Option(
                this.extraParams, this.label, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentLinkCreateParams.CustomField.Dropdown.Option#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentLinkCreateParams.CustomField.Dropdown.Option#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> The label for the option, displayed to the customer. Up to
           * 100 characters.
           */
          public Builder setLabel(String label) {
            this.label = label;
            return this;
          }

          /**
           * <strong>Required.</strong> The value for this option, not displayed to the customer,
           * used by your integration to reconcile the option selected by the customer. Must be
           * unique to this option, alphanumeric, and up to 100 characters.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }
      }
    }

    @Getter
    public static class Label {
      /**
       * <strong>Required.</strong> Custom text for the label, displayed to the customer. Up to 50
       * characters.
       */
      @SerializedName("custom")
      String custom;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The type of the label. */
      @SerializedName("type")
      Type type;

      private Label(String custom, Map<String, Object> extraParams, Type type) {
        this.custom = custom;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String custom;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.CustomField.Label build() {
          return new PaymentLinkCreateParams.CustomField.Label(
              this.custom, this.extraParams, this.type);
        }

        /**
         * <strong>Required.</strong> Custom text for the label, displayed to the customer. Up to 50
         * characters.
         */
        public Builder setCustom(String custom) {
          this.custom = custom;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Label#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Label#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The type of the label. */
        public Builder setType(PaymentLinkCreateParams.CustomField.Label.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("custom")
        CUSTOM("custom");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Numeric {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;

      private Numeric(Map<String, Object> extraParams, Long maximumLength, Long minimumLength) {
        this.extraParams = extraParams;
        this.maximumLength = maximumLength;
        this.minimumLength = minimumLength;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long maximumLength;

        private Long minimumLength;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.CustomField.Numeric build() {
          return new PaymentLinkCreateParams.CustomField.Numeric(
              this.extraParams, this.maximumLength, this.minimumLength);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Numeric#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Numeric#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The maximum character length constraint for the customer's input. */
        public Builder setMaximumLength(Long maximumLength) {
          this.maximumLength = maximumLength;
          return this;
        }

        /** The minimum character length requirement for the customer's input. */
        public Builder setMinimumLength(Long minimumLength) {
          this.minimumLength = minimumLength;
          return this;
        }
      }
    }

    @Getter
    public static class Text {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The maximum character length constraint for the customer's input. */
      @SerializedName("maximum_length")
      Long maximumLength;

      /** The minimum character length requirement for the customer's input. */
      @SerializedName("minimum_length")
      Long minimumLength;

      private Text(Map<String, Object> extraParams, Long maximumLength, Long minimumLength) {
        this.extraParams = extraParams;
        this.maximumLength = maximumLength;
        this.minimumLength = minimumLength;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long maximumLength;

        private Long minimumLength;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.CustomField.Text build() {
          return new PaymentLinkCreateParams.CustomField.Text(
              this.extraParams, this.maximumLength, this.minimumLength);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Text#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomField.Text#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The maximum character length constraint for the customer's input. */
        public Builder setMaximumLength(Long maximumLength) {
          this.maximumLength = maximumLength;
          return this;
        }

        /** The minimum character length requirement for the customer's input. */
        public Builder setMinimumLength(Long minimumLength) {
          this.minimumLength = minimumLength;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("dropdown")
      DROPDOWN("dropdown"),

      @SerializedName("numeric")
      NUMERIC("numeric"),

      @SerializedName("text")
      TEXT("text");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class CustomText {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Custom text that should be displayed alongside shipping address collection. */
    @SerializedName("shipping_address")
    Object shippingAddress;

    /** Custom text that should be displayed alongside the payment confirmation button. */
    @SerializedName("submit")
    Object submit;

    /**
     * Custom text that should be displayed in place of the default terms of service agreement text.
     */
    @SerializedName("terms_of_service_acceptance")
    Object termsOfServiceAcceptance;

    private CustomText(
        Map<String, Object> extraParams,
        Object shippingAddress,
        Object submit,
        Object termsOfServiceAcceptance) {
      this.extraParams = extraParams;
      this.shippingAddress = shippingAddress;
      this.submit = submit;
      this.termsOfServiceAcceptance = termsOfServiceAcceptance;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object shippingAddress;

      private Object submit;

      private Object termsOfServiceAcceptance;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.CustomText build() {
        return new PaymentLinkCreateParams.CustomText(
            this.extraParams, this.shippingAddress, this.submit, this.termsOfServiceAcceptance);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.CustomText#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.CustomText#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Custom text that should be displayed alongside shipping address collection. */
      public Builder setShippingAddress(
          PaymentLinkCreateParams.CustomText.ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside shipping address collection. */
      public Builder setShippingAddress(EmptyParam shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside the payment confirmation button. */
      public Builder setSubmit(PaymentLinkCreateParams.CustomText.Submit submit) {
        this.submit = submit;
        return this;
      }

      /** Custom text that should be displayed alongside the payment confirmation button. */
      public Builder setSubmit(EmptyParam submit) {
        this.submit = submit;
        return this;
      }

      /**
       * Custom text that should be displayed in place of the default terms of service agreement
       * text.
       */
      public Builder setTermsOfServiceAcceptance(
          PaymentLinkCreateParams.CustomText.TermsOfServiceAcceptance termsOfServiceAcceptance) {
        this.termsOfServiceAcceptance = termsOfServiceAcceptance;
        return this;
      }

      /**
       * Custom text that should be displayed in place of the default terms of service agreement
       * text.
       */
      public Builder setTermsOfServiceAcceptance(EmptyParam termsOfServiceAcceptance) {
        this.termsOfServiceAcceptance = termsOfServiceAcceptance;
        return this;
      }
    }

    @Getter
    public static class ShippingAddress {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;

      private ShippingAddress(Map<String, Object> extraParams, String message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.CustomText.ShippingAddress build() {
          return new PaymentLinkCreateParams.CustomText.ShippingAddress(
              this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomText.ShippingAddress#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomText.ShippingAddress#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }
      }
    }

    @Getter
    public static class Submit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;

      private Submit(Map<String, Object> extraParams, String message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.CustomText.Submit build() {
          return new PaymentLinkCreateParams.CustomText.Submit(this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomText.Submit#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomText.Submit#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }
      }
    }

    @Getter
    public static class TermsOfServiceAcceptance {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
      @SerializedName("message")
      String message;

      private TermsOfServiceAcceptance(Map<String, Object> extraParams, String message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.CustomText.TermsOfServiceAcceptance build() {
          return new PaymentLinkCreateParams.CustomText.TermsOfServiceAcceptance(
              this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomText.TermsOfServiceAcceptance#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.CustomText.TermsOfServiceAcceptance#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }
      }
    }
  }

  @Getter
  public static class InvoiceCreation {
    /** <strong>Required.</strong> Whether the feature is enabled */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Invoice PDF configuration. */
    @SerializedName("invoice_data")
    InvoiceData invoiceData;

    private InvoiceCreation(
        Boolean enabled, Map<String, Object> extraParams, InvoiceData invoiceData) {
      this.enabled = enabled;
      this.extraParams = extraParams;
      this.invoiceData = invoiceData;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      private InvoiceData invoiceData;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.InvoiceCreation build() {
        return new PaymentLinkCreateParams.InvoiceCreation(
            this.enabled, this.extraParams, this.invoiceData);
      }

      /** <strong>Required.</strong> Whether the feature is enabled */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.InvoiceCreation#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.InvoiceCreation#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Invoice PDF configuration. */
      public Builder setInvoiceData(
          PaymentLinkCreateParams.InvoiceCreation.InvoiceData invoiceData) {
        this.invoiceData = invoiceData;
        return this;
      }
    }

    @Getter
    public static class InvoiceData {
      /** The account tax IDs associated with the invoice. */
      @SerializedName("account_tax_ids")
      Object accountTaxIds;

      /** Default custom fields to be displayed on invoices for this customer. */
      @SerializedName("custom_fields")
      Object customFields;

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Default footer to be displayed on invoices for this customer. */
      @SerializedName("footer")
      String footer;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format. Individual keys can be unset by posting an empty value to them. All
       * keys can be unset by posting an empty value to {@code metadata}.
       */
      @SerializedName("metadata")
      Object metadata;

      /** Default options for invoice PDF rendering for this customer. */
      @SerializedName("rendering_options")
      Object renderingOptions;

      private InvoiceData(
          Object accountTaxIds,
          Object customFields,
          String description,
          Map<String, Object> extraParams,
          String footer,
          Object metadata,
          Object renderingOptions) {
        this.accountTaxIds = accountTaxIds;
        this.customFields = customFields;
        this.description = description;
        this.extraParams = extraParams;
        this.footer = footer;
        this.metadata = metadata;
        this.renderingOptions = renderingOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountTaxIds;

        private Object customFields;

        private String description;

        private Map<String, Object> extraParams;

        private String footer;

        private Object metadata;

        private Object renderingOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.InvoiceCreation.InvoiceData build() {
          return new PaymentLinkCreateParams.InvoiceCreation.InvoiceData(
              this.accountTaxIds,
              this.customFields,
              this.description,
              this.extraParams,
              this.footer,
              this.metadata,
              this.renderingOptions);
        }

        /**
         * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkCreateParams.InvoiceCreation.InvoiceData#accountTaxIds} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAccountTaxId(String element) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).add(element);
          return this;
        }

        /**
         * Add all elements to `accountTaxIds` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link PaymentLinkCreateParams.InvoiceCreation.InvoiceData#accountTaxIds} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllAccountTaxId(List<String> elements) {
          if (this.accountTaxIds == null || this.accountTaxIds instanceof EmptyParam) {
            this.accountTaxIds = new ArrayList<String>();
          }
          ((List<String>) this.accountTaxIds).addAll(elements);
          return this;
        }

        /** The account tax IDs associated with the invoice. */
        public Builder setAccountTaxIds(EmptyParam accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /** The account tax IDs associated with the invoice. */
        public Builder setAccountTaxIds(List<String> accountTaxIds) {
          this.accountTaxIds = accountTaxIds;
          return this;
        }

        /**
         * Add an element to `customFields` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkCreateParams.InvoiceCreation.InvoiceData#customFields} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addCustomField(
            PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField element) {
          if (this.customFields == null || this.customFields instanceof EmptyParam) {
            this.customFields =
                new ArrayList<PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField>();
          }
          ((List<PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField>)
                  this.customFields)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkCreateParams.InvoiceCreation.InvoiceData#customFields} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllCustomField(
            List<PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField> elements) {
          if (this.customFields == null || this.customFields instanceof EmptyParam) {
            this.customFields =
                new ArrayList<PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField>();
          }
          ((List<PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField>)
                  this.customFields)
              .addAll(elements);
          return this;
        }

        /** Default custom fields to be displayed on invoices for this customer. */
        public Builder setCustomFields(EmptyParam customFields) {
          this.customFields = customFields;
          return this;
        }

        /** Default custom fields to be displayed on invoices for this customer. */
        public Builder setCustomFields(
            List<PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField> customFields) {
          this.customFields = customFields;
          return this;
        }

        /** An arbitrary string attached to the object. Often useful for displaying to users. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.InvoiceCreation.InvoiceData#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.InvoiceCreation.InvoiceData#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Default footer to be displayed on invoices for this customer. */
        public Builder setFooter(String footer) {
          this.footer = footer;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * PaymentLinkCreateParams.InvoiceCreation.InvoiceData#metadata} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null || this.metadata instanceof EmptyParam) {
            this.metadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.metadata).put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.InvoiceCreation.InvoiceData#metadata} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null || this.metadata instanceof EmptyParam) {
            this.metadata = new HashMap<String, String>();
          }
          ((Map<String, String>) this.metadata).putAll(map);
          return this;
        }

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(EmptyParam metadata) {
          this.metadata = metadata;
          return this;
        }

        /**
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format. Individual keys can be unset by posting an empty value to
         * them. All keys can be unset by posting an empty value to {@code metadata}.
         */
        public Builder setMetadata(Map<String, String> metadata) {
          this.metadata = metadata;
          return this;
        }

        /** Default options for invoice PDF rendering for this customer. */
        public Builder setRenderingOptions(
            PaymentLinkCreateParams.InvoiceCreation.InvoiceData.RenderingOptions renderingOptions) {
          this.renderingOptions = renderingOptions;
          return this;
        }

        /** Default options for invoice PDF rendering for this customer. */
        public Builder setRenderingOptions(EmptyParam renderingOptions) {
          this.renderingOptions = renderingOptions;
          return this;
        }
      }

      @Getter
      public static class CustomField {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> The name of the custom field. This may be up to 30 characters.
         */
        @SerializedName("name")
        String name;

        /**
         * <strong>Required.</strong> The value of the custom field. This may be up to 30
         * characters.
         */
        @SerializedName("value")
        String value;

        private CustomField(Map<String, Object> extraParams, String name, String value) {
          this.extraParams = extraParams;
          this.name = name;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          private String value;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField build() {
            return new PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField(
                this.extraParams, this.name, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField#extraParams} for the
           * field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentLinkCreateParams.InvoiceCreation.InvoiceData.CustomField#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> The name of the custom field. This may be up to 30
           * characters.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> The value of the custom field. This may be up to 30
           * characters.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }
        }
      }

      @Getter
      public static class RenderingOptions {
        /**
         * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
         * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
         * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in invoice
         * PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive alike)
         * from invoice PDF amounts.
         */
        @SerializedName("amount_tax_display")
        ApiRequestParams.EnumParam amountTaxDisplay;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private RenderingOptions(
            ApiRequestParams.EnumParam amountTaxDisplay, Map<String, Object> extraParams) {
          this.amountTaxDisplay = amountTaxDisplay;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private ApiRequestParams.EnumParam amountTaxDisplay;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkCreateParams.InvoiceCreation.InvoiceData.RenderingOptions build() {
            return new PaymentLinkCreateParams.InvoiceCreation.InvoiceData.RenderingOptions(
                this.amountTaxDisplay, this.extraParams);
          }

          /**
           * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
           * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
           * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in
           * invoice PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive
           * alike) from invoice PDF amounts.
           */
          public Builder setAmountTaxDisplay(
              PaymentLinkCreateParams.InvoiceCreation.InvoiceData.RenderingOptions.AmountTaxDisplay
                  amountTaxDisplay) {
            this.amountTaxDisplay = amountTaxDisplay;
            return this;
          }

          /**
           * How line-item prices and amounts will be displayed with respect to tax on invoice PDFs.
           * One of {@code exclude_tax} or {@code include_inclusive_tax}. {@code
           * include_inclusive_tax} will include inclusive tax (and exclude exclusive tax) in
           * invoice PDF amounts. {@code exclude_tax} will exclude all tax (inclusive and exclusive
           * alike) from invoice PDF amounts.
           */
          public Builder setAmountTaxDisplay(EmptyParam amountTaxDisplay) {
            this.amountTaxDisplay = amountTaxDisplay;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentLinkCreateParams.InvoiceCreation.InvoiceData.RenderingOptions#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentLinkCreateParams.InvoiceCreation.InvoiceData.RenderingOptions#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }

        public enum AmountTaxDisplay implements ApiRequestParams.EnumParam {
          @SerializedName("exclude_tax")
          EXCLUDE_TAX("exclude_tax"),

          @SerializedName("include_inclusive_tax")
          INCLUDE_INCLUSIVE_TAX("include_inclusive_tax");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AmountTaxDisplay(String value) {
            this.value = value;
          }
        }
      }
    }
  }

  @Getter
  public static class LineItem {
    /**
     * When set, provides configuration for this item’s quantity to be adjusted by the customer
     * during checkout.
     */
    @SerializedName("adjustable_quantity")
    AdjustableQuantity adjustableQuantity;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The ID of the <a
     * href="https://stripe.com/docs/api/prices">Price</a> or <a
     * href="https://stripe.com/docs/api/plans">Plan</a> object.
     */
    @SerializedName("price")
    String price;

    /** <strong>Required.</strong> The quantity of the line item being purchased. */
    @SerializedName("quantity")
    Long quantity;

    private LineItem(
        AdjustableQuantity adjustableQuantity,
        Map<String, Object> extraParams,
        String price,
        Long quantity) {
      this.adjustableQuantity = adjustableQuantity;
      this.extraParams = extraParams;
      this.price = price;
      this.quantity = quantity;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AdjustableQuantity adjustableQuantity;

      private Map<String, Object> extraParams;

      private String price;

      private Long quantity;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.LineItem build() {
        return new PaymentLinkCreateParams.LineItem(
            this.adjustableQuantity, this.extraParams, this.price, this.quantity);
      }

      /**
       * When set, provides configuration for this item’s quantity to be adjusted by the customer
       * during checkout.
       */
      public Builder setAdjustableQuantity(
          PaymentLinkCreateParams.LineItem.AdjustableQuantity adjustableQuantity) {
        this.adjustableQuantity = adjustableQuantity;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The ID of the <a
       * href="https://stripe.com/docs/api/prices">Price</a> or <a
       * href="https://stripe.com/docs/api/plans">Plan</a> object.
       */
      public Builder setPrice(String price) {
        this.price = price;
        return this;
      }

      /** <strong>Required.</strong> The quantity of the line item being purchased. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }
    }

    @Getter
    public static class AdjustableQuantity {
      /**
       * <strong>Required.</strong> Set to true if the quantity can be adjusted to any non-negative
       * Integer.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The maximum quantity the customer can purchase. By default this value is 99. You can
       * specify a value up to 999.
       */
      @SerializedName("maximum")
      Long maximum;

      /**
       * The minimum quantity the customer can purchase. By default this value is 0. If there is
       * only one item in the cart then that item's quantity cannot go down to 0.
       */
      @SerializedName("minimum")
      Long minimum;

      private AdjustableQuantity(
          Boolean enabled, Map<String, Object> extraParams, Long maximum, Long minimum) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.maximum = maximum;
        this.minimum = minimum;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Long maximum;

        private Long minimum;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkCreateParams.LineItem.AdjustableQuantity build() {
          return new PaymentLinkCreateParams.LineItem.AdjustableQuantity(
              this.enabled, this.extraParams, this.maximum, this.minimum);
        }

        /**
         * <strong>Required.</strong> Set to true if the quantity can be adjusted to any
         * non-negative Integer.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.LineItem.AdjustableQuantity#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkCreateParams.LineItem.AdjustableQuantity#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The maximum quantity the customer can purchase. By default this value is 99. You can
         * specify a value up to 999.
         */
        public Builder setMaximum(Long maximum) {
          this.maximum = maximum;
          return this;
        }

        /**
         * The minimum quantity the customer can purchase. By default this value is 0. If there is
         * only one item in the cart then that item's quantity cannot go down to 0.
         */
        public Builder setMinimum(Long minimum) {
          this.minimum = minimum;
          return this;
        }
      }
    }
  }

  @Getter
  public static class PaymentIntentData {
    /** Controls when the funds will be captured from the customer's account. */
    @SerializedName("capture_method")
    CaptureMethod captureMethod;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Indicates that you intend to <a
     * href="https://stripe.com/docs/payments/payment-intents#future-usage">make future payments</a>
     * with the payment method collected by this Checkout Session.
     *
     * <p>When setting this to {@code on_session}, Checkout will show a notice to the customer that
     * their payment details will be saved.
     *
     * <p>When setting this to {@code off_session}, Checkout will show a notice to the customer that
     * their payment details will be saved and used for future payments.
     *
     * <p>If a Customer has been provided or Checkout creates a new Customer,Checkout will attach
     * the payment method to the Customer.
     *
     * <p>If Checkout does not create a Customer, the payment method is not attached to a Customer.
     * To reuse the payment method, you can retrieve it from the Checkout Session's PaymentIntent.
     *
     * <p>When processing card payments, Checkout also uses {@code setup_future_usage} to
     * dynamically optimize your payment flow and comply with regional legislation and network
     * rules, such as SCA.
     */
    @SerializedName("setup_future_usage")
    SetupFutureUsage setupFutureUsage;

    private PaymentIntentData(
        CaptureMethod captureMethod,
        Map<String, Object> extraParams,
        SetupFutureUsage setupFutureUsage) {
      this.captureMethod = captureMethod;
      this.extraParams = extraParams;
      this.setupFutureUsage = setupFutureUsage;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CaptureMethod captureMethod;

      private Map<String, Object> extraParams;

      private SetupFutureUsage setupFutureUsage;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.PaymentIntentData build() {
        return new PaymentLinkCreateParams.PaymentIntentData(
            this.captureMethod, this.extraParams, this.setupFutureUsage);
      }

      /** Controls when the funds will be captured from the customer's account. */
      public Builder setCaptureMethod(
          PaymentLinkCreateParams.PaymentIntentData.CaptureMethod captureMethod) {
        this.captureMethod = captureMethod;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.PaymentIntentData#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.PaymentIntentData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Indicates that you intend to <a
       * href="https://stripe.com/docs/payments/payment-intents#future-usage">make future
       * payments</a> with the payment method collected by this Checkout Session.
       *
       * <p>When setting this to {@code on_session}, Checkout will show a notice to the customer
       * that their payment details will be saved.
       *
       * <p>When setting this to {@code off_session}, Checkout will show a notice to the customer
       * that their payment details will be saved and used for future payments.
       *
       * <p>If a Customer has been provided or Checkout creates a new Customer,Checkout will attach
       * the payment method to the Customer.
       *
       * <p>If Checkout does not create a Customer, the payment method is not attached to a
       * Customer. To reuse the payment method, you can retrieve it from the Checkout Session's
       * PaymentIntent.
       *
       * <p>When processing card payments, Checkout also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as SCA.
       */
      public Builder setSetupFutureUsage(
          PaymentLinkCreateParams.PaymentIntentData.SetupFutureUsage setupFutureUsage) {
        this.setupFutureUsage = setupFutureUsage;
        return this;
      }
    }

    public enum CaptureMethod implements ApiRequestParams.EnumParam {
      @SerializedName("automatic")
      AUTOMATIC("automatic"),

      @SerializedName("automatic_async")
      AUTOMATIC_ASYNC("automatic_async"),

      @SerializedName("manual")
      MANUAL("manual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CaptureMethod(String value) {
        this.value = value;
      }
    }

    public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
      @SerializedName("off_session")
      OFF_SESSION("off_session"),

      @SerializedName("on_session")
      ON_SESSION("on_session");

      @Getter(onMethod_ = {@Override})
      private final String value;

      SetupFutureUsage(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class PhoneNumberCollection {
    /** <strong>Required.</strong> Set to {@code true} to enable phone number collection. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PhoneNumberCollection(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.PhoneNumberCollection build() {
        return new PaymentLinkCreateParams.PhoneNumberCollection(this.enabled, this.extraParams);
      }

      /** <strong>Required.</strong> Set to {@code true} to enable phone number collection. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.PhoneNumberCollection#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.PhoneNumberCollection#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class ShippingAddressCollection {
    /**
     * <strong>Required.</strong> An array of two-letter ISO country codes representing which
     * countries Checkout should provide as options for shipping locations. Unsupported country
     * codes: {@code AS, CX, CC, CU, HM, IR, KP, MH, FM, NF, MP, PW, SD, SY, UM, VI}.
     */
    @SerializedName("allowed_countries")
    List<PaymentLinkCreateParams.ShippingAddressCollection.AllowedCountry> allowedCountries;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ShippingAddressCollection(
        List<PaymentLinkCreateParams.ShippingAddressCollection.AllowedCountry> allowedCountries,
        Map<String, Object> extraParams) {
      this.allowedCountries = allowedCountries;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<PaymentLinkCreateParams.ShippingAddressCollection.AllowedCountry>
          allowedCountries;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.ShippingAddressCollection build() {
        return new PaymentLinkCreateParams.ShippingAddressCollection(
            this.allowedCountries, this.extraParams);
      }

      /**
       * Add an element to `allowedCountries` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentLinkCreateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllowedCountry(
          PaymentLinkCreateParams.ShippingAddressCollection.AllowedCountry element) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link PaymentLinkCreateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllAllowedCountry(
          List<PaymentLinkCreateParams.ShippingAddressCollection.AllowedCountry> elements) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.ShippingAddressCollection#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.ShippingAddressCollection#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum AllowedCountry implements ApiRequestParams.EnumParam {
      @SerializedName("AC")
      AC("AC"),

      @SerializedName("AD")
      AD("AD"),

      @SerializedName("AE")
      AE("AE"),

      @SerializedName("AF")
      AF("AF"),

      @SerializedName("AG")
      AG("AG"),

      @SerializedName("AI")
      AI("AI"),

      @SerializedName("AL")
      AL("AL"),

      @SerializedName("AM")
      AM("AM"),

      @SerializedName("AO")
      AO("AO"),

      @SerializedName("AQ")
      AQ("AQ"),

      @SerializedName("AR")
      AR("AR"),

      @SerializedName("AT")
      AT("AT"),

      @SerializedName("AU")
      AU("AU"),

      @SerializedName("AW")
      AW("AW"),

      @SerializedName("AX")
      AX("AX"),

      @SerializedName("AZ")
      AZ("AZ"),

      @SerializedName("BA")
      BA("BA"),

      @SerializedName("BB")
      BB("BB"),

      @SerializedName("BD")
      BD("BD"),

      @SerializedName("BE")
      BE("BE"),

      @SerializedName("BF")
      BF("BF"),

      @SerializedName("BG")
      BG("BG"),

      @SerializedName("BH")
      BH("BH"),

      @SerializedName("BI")
      BI("BI"),

      @SerializedName("BJ")
      BJ("BJ"),

      @SerializedName("BL")
      BL("BL"),

      @SerializedName("BM")
      BM("BM"),

      @SerializedName("BN")
      BN("BN"),

      @SerializedName("BO")
      BO("BO"),

      @SerializedName("BQ")
      BQ("BQ"),

      @SerializedName("BR")
      BR("BR"),

      @SerializedName("BS")
      BS("BS"),

      @SerializedName("BT")
      BT("BT"),

      @SerializedName("BV")
      BV("BV"),

      @SerializedName("BW")
      BW("BW"),

      @SerializedName("BY")
      BY("BY"),

      @SerializedName("BZ")
      BZ("BZ"),

      @SerializedName("CA")
      CA("CA"),

      @SerializedName("CD")
      CD("CD"),

      @SerializedName("CF")
      CF("CF"),

      @SerializedName("CG")
      CG("CG"),

      @SerializedName("CH")
      CH("CH"),

      @SerializedName("CI")
      CI("CI"),

      @SerializedName("CK")
      CK("CK"),

      @SerializedName("CL")
      CL("CL"),

      @SerializedName("CM")
      CM("CM"),

      @SerializedName("CN")
      CN("CN"),

      @SerializedName("CO")
      CO("CO"),

      @SerializedName("CR")
      CR("CR"),

      @SerializedName("CV")
      CV("CV"),

      @SerializedName("CW")
      CW("CW"),

      @SerializedName("CY")
      CY("CY"),

      @SerializedName("CZ")
      CZ("CZ"),

      @SerializedName("DE")
      DE("DE"),

      @SerializedName("DJ")
      DJ("DJ"),

      @SerializedName("DK")
      DK("DK"),

      @SerializedName("DM")
      DM("DM"),

      @SerializedName("DO")
      DO("DO"),

      @SerializedName("DZ")
      DZ("DZ"),

      @SerializedName("EC")
      EC("EC"),

      @SerializedName("EE")
      EE("EE"),

      @SerializedName("EG")
      EG("EG"),

      @SerializedName("EH")
      EH("EH"),

      @SerializedName("ER")
      ER("ER"),

      @SerializedName("ES")
      ES("ES"),

      @SerializedName("ET")
      ET("ET"),

      @SerializedName("FI")
      FI("FI"),

      @SerializedName("FJ")
      FJ("FJ"),

      @SerializedName("FK")
      FK("FK"),

      @SerializedName("FO")
      FO("FO"),

      @SerializedName("FR")
      FR("FR"),

      @SerializedName("GA")
      GA("GA"),

      @SerializedName("GB")
      GB("GB"),

      @SerializedName("GD")
      GD("GD"),

      @SerializedName("GE")
      GE("GE"),

      @SerializedName("GF")
      GF("GF"),

      @SerializedName("GG")
      GG("GG"),

      @SerializedName("GH")
      GH("GH"),

      @SerializedName("GI")
      GI("GI"),

      @SerializedName("GL")
      GL("GL"),

      @SerializedName("GM")
      GM("GM"),

      @SerializedName("GN")
      GN("GN"),

      @SerializedName("GP")
      GP("GP"),

      @SerializedName("GQ")
      GQ("GQ"),

      @SerializedName("GR")
      GR("GR"),

      @SerializedName("GS")
      GS("GS"),

      @SerializedName("GT")
      GT("GT"),

      @SerializedName("GU")
      GU("GU"),

      @SerializedName("GW")
      GW("GW"),

      @SerializedName("GY")
      GY("GY"),

      @SerializedName("HK")
      HK("HK"),

      @SerializedName("HN")
      HN("HN"),

      @SerializedName("HR")
      HR("HR"),

      @SerializedName("HT")
      HT("HT"),

      @SerializedName("HU")
      HU("HU"),

      @SerializedName("ID")
      ID("ID"),

      @SerializedName("IE")
      IE("IE"),

      @SerializedName("IL")
      IL("IL"),

      @SerializedName("IM")
      IM("IM"),

      @SerializedName("IN")
      IN("IN"),

      @SerializedName("IO")
      IO("IO"),

      @SerializedName("IQ")
      IQ("IQ"),

      @SerializedName("IS")
      IS("IS"),

      @SerializedName("IT")
      IT("IT"),

      @SerializedName("JE")
      JE("JE"),

      @SerializedName("JM")
      JM("JM"),

      @SerializedName("JO")
      JO("JO"),

      @SerializedName("JP")
      JP("JP"),

      @SerializedName("KE")
      KE("KE"),

      @SerializedName("KG")
      KG("KG"),

      @SerializedName("KH")
      KH("KH"),

      @SerializedName("KI")
      KI("KI"),

      @SerializedName("KM")
      KM("KM"),

      @SerializedName("KN")
      KN("KN"),

      @SerializedName("KR")
      KR("KR"),

      @SerializedName("KW")
      KW("KW"),

      @SerializedName("KY")
      KY("KY"),

      @SerializedName("KZ")
      KZ("KZ"),

      @SerializedName("LA")
      LA("LA"),

      @SerializedName("LB")
      LB("LB"),

      @SerializedName("LC")
      LC("LC"),

      @SerializedName("LI")
      LI("LI"),

      @SerializedName("LK")
      LK("LK"),

      @SerializedName("LR")
      LR("LR"),

      @SerializedName("LS")
      LS("LS"),

      @SerializedName("LT")
      LT("LT"),

      @SerializedName("LU")
      LU("LU"),

      @SerializedName("LV")
      LV("LV"),

      @SerializedName("LY")
      LY("LY"),

      @SerializedName("MA")
      MA("MA"),

      @SerializedName("MC")
      MC("MC"),

      @SerializedName("MD")
      MD("MD"),

      @SerializedName("ME")
      ME("ME"),

      @SerializedName("MF")
      MF("MF"),

      @SerializedName("MG")
      MG("MG"),

      @SerializedName("MK")
      MK("MK"),

      @SerializedName("ML")
      ML("ML"),

      @SerializedName("MM")
      MM("MM"),

      @SerializedName("MN")
      MN("MN"),

      @SerializedName("MO")
      MO("MO"),

      @SerializedName("MQ")
      MQ("MQ"),

      @SerializedName("MR")
      MR("MR"),

      @SerializedName("MS")
      MS("MS"),

      @SerializedName("MT")
      MT("MT"),

      @SerializedName("MU")
      MU("MU"),

      @SerializedName("MV")
      MV("MV"),

      @SerializedName("MW")
      MW("MW"),

      @SerializedName("MX")
      MX("MX"),

      @SerializedName("MY")
      MY("MY"),

      @SerializedName("MZ")
      MZ("MZ"),

      @SerializedName("NA")
      NA("NA"),

      @SerializedName("NC")
      NC("NC"),

      @SerializedName("NE")
      NE("NE"),

      @SerializedName("NG")
      NG("NG"),

      @SerializedName("NI")
      NI("NI"),

      @SerializedName("NL")
      NL("NL"),

      @SerializedName("NO")
      NO("NO"),

      @SerializedName("NP")
      NP("NP"),

      @SerializedName("NR")
      NR("NR"),

      @SerializedName("NU")
      NU("NU"),

      @SerializedName("NZ")
      NZ("NZ"),

      @SerializedName("OM")
      OM("OM"),

      @SerializedName("PA")
      PA("PA"),

      @SerializedName("PE")
      PE("PE"),

      @SerializedName("PF")
      PF("PF"),

      @SerializedName("PG")
      PG("PG"),

      @SerializedName("PH")
      PH("PH"),

      @SerializedName("PK")
      PK("PK"),

      @SerializedName("PL")
      PL("PL"),

      @SerializedName("PM")
      PM("PM"),

      @SerializedName("PN")
      PN("PN"),

      @SerializedName("PR")
      PR("PR"),

      @SerializedName("PS")
      PS("PS"),

      @SerializedName("PT")
      PT("PT"),

      @SerializedName("PY")
      PY("PY"),

      @SerializedName("QA")
      QA("QA"),

      @SerializedName("RE")
      RE("RE"),

      @SerializedName("RO")
      RO("RO"),

      @SerializedName("RS")
      RS("RS"),

      @SerializedName("RU")
      RU("RU"),

      @SerializedName("RW")
      RW("RW"),

      @SerializedName("SA")
      SA("SA"),

      @SerializedName("SB")
      SB("SB"),

      @SerializedName("SC")
      SC("SC"),

      @SerializedName("SE")
      SE("SE"),

      @SerializedName("SG")
      SG("SG"),

      @SerializedName("SH")
      SH("SH"),

      @SerializedName("SI")
      SI("SI"),

      @SerializedName("SJ")
      SJ("SJ"),

      @SerializedName("SK")
      SK("SK"),

      @SerializedName("SL")
      SL("SL"),

      @SerializedName("SM")
      SM("SM"),

      @SerializedName("SN")
      SN("SN"),

      @SerializedName("SO")
      SO("SO"),

      @SerializedName("SR")
      SR("SR"),

      @SerializedName("SS")
      SS("SS"),

      @SerializedName("ST")
      ST("ST"),

      @SerializedName("SV")
      SV("SV"),

      @SerializedName("SX")
      SX("SX"),

      @SerializedName("SZ")
      SZ("SZ"),

      @SerializedName("TA")
      TA("TA"),

      @SerializedName("TC")
      TC("TC"),

      @SerializedName("TD")
      TD("TD"),

      @SerializedName("TF")
      TF("TF"),

      @SerializedName("TG")
      TG("TG"),

      @SerializedName("TH")
      TH("TH"),

      @SerializedName("TJ")
      TJ("TJ"),

      @SerializedName("TK")
      TK("TK"),

      @SerializedName("TL")
      TL("TL"),

      @SerializedName("TM")
      TM("TM"),

      @SerializedName("TN")
      TN("TN"),

      @SerializedName("TO")
      TO("TO"),

      @SerializedName("TR")
      TR("TR"),

      @SerializedName("TT")
      TT("TT"),

      @SerializedName("TV")
      TV("TV"),

      @SerializedName("TW")
      TW("TW"),

      @SerializedName("TZ")
      TZ("TZ"),

      @SerializedName("UA")
      UA("UA"),

      @SerializedName("UG")
      UG("UG"),

      @SerializedName("US")
      US("US"),

      @SerializedName("UY")
      UY("UY"),

      @SerializedName("UZ")
      UZ("UZ"),

      @SerializedName("VA")
      VA("VA"),

      @SerializedName("VC")
      VC("VC"),

      @SerializedName("VE")
      VE("VE"),

      @SerializedName("VG")
      VG("VG"),

      @SerializedName("VN")
      VN("VN"),

      @SerializedName("VU")
      VU("VU"),

      @SerializedName("WF")
      WF("WF"),

      @SerializedName("WS")
      WS("WS"),

      @SerializedName("XK")
      XK("XK"),

      @SerializedName("YE")
      YE("YE"),

      @SerializedName("YT")
      YT("YT"),

      @SerializedName("ZA")
      ZA("ZA"),

      @SerializedName("ZM")
      ZM("ZM"),

      @SerializedName("ZW")
      ZW("ZW"),

      @SerializedName("ZZ")
      ZZ("ZZ");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AllowedCountry(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class ShippingOption {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of the Shipping Rate to use for this shipping option. */
    @SerializedName("shipping_rate")
    String shippingRate;

    private ShippingOption(Map<String, Object> extraParams, String shippingRate) {
      this.extraParams = extraParams;
      this.shippingRate = shippingRate;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String shippingRate;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.ShippingOption build() {
        return new PaymentLinkCreateParams.ShippingOption(this.extraParams, this.shippingRate);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.ShippingOption#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.ShippingOption#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of the Shipping Rate to use for this shipping option. */
      public Builder setShippingRate(String shippingRate) {
        this.shippingRate = shippingRate;
        return this;
      }
    }
  }

  @Getter
  public static class SubscriptionData {
    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to
     * optionally store an explanation of the subscription.
     */
    @SerializedName("description")
    String description;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time. Has to be at least 1.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    private SubscriptionData(
        String description, Map<String, Object> extraParams, Long trialPeriodDays) {
      this.description = description;
      this.extraParams = extraParams;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String description;

      private Map<String, Object> extraParams;

      private Long trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.SubscriptionData build() {
        return new PaymentLinkCreateParams.SubscriptionData(
            this.description, this.extraParams, this.trialPeriodDays);
      }

      /**
       * The subscription's description, meant to be displayable to the customer. Use this field to
       * optionally store an explanation of the subscription.
       */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.SubscriptionData#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.SubscriptionData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time. Has to be at least 1.
       */
      public Builder setTrialPeriodDays(Long trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }
    }
  }

  @Getter
  public static class TaxIdCollection {
    /** <strong>Required.</strong> Set to {@code true} to enable tax ID collection. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TaxIdCollection(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.TaxIdCollection build() {
        return new PaymentLinkCreateParams.TaxIdCollection(this.enabled, this.extraParams);
      }

      /** <strong>Required.</strong> Set to {@code true} to enable tax ID collection. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.TaxIdCollection#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.TaxIdCollection#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class TransferData {
    /** The amount that will be transferred automatically when a charge succeeds. */
    @SerializedName("amount")
    Long amount;

    /**
     * <strong>Required.</strong> If specified, successful charges will be attributed to the
     * destination account for tax reporting, and the funds from charges will be transferred to the
     * destination account. The ID of the resulting transfer will be returned on the successful
     * charge's {@code transfer} field.
     */
    @SerializedName("destination")
    String destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Long amount, String destination, Map<String, Object> extraParams) {
      this.amount = amount;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkCreateParams.TransferData build() {
        return new PaymentLinkCreateParams.TransferData(
            this.amount, this.destination, this.extraParams);
      }

      /** The amount that will be transferred automatically when a charge succeeds. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * <strong>Required.</strong> If specified, successful charges will be attributed to the
       * destination account for tax reporting, and the funds from charges will be transferred to
       * the destination account. The ID of the resulting transfer will be returned on the
       * successful charge's {@code transfer} field.
       */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkCreateParams.TransferData#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkCreateParams.TransferData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum BillingAddressCollection implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),

    @SerializedName("required")
    REQUIRED("required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BillingAddressCollection(String value) {
      this.value = value;
    }
  }

  public enum CustomerCreation implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("if_required")
    IF_REQUIRED("if_required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CustomerCreation(String value) {
      this.value = value;
    }
  }

  public enum PaymentMethodCollection implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("if_required")
    IF_REQUIRED("if_required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentMethodCollection(String value) {
      this.value = value;
    }
  }

  public enum PaymentMethodType implements ApiRequestParams.EnumParam {
    @SerializedName("affirm")
    AFFIRM("affirm"),

    @SerializedName("afterpay_clearpay")
    AFTERPAY_CLEARPAY("afterpay_clearpay"),

    @SerializedName("alipay")
    ALIPAY("alipay"),

    @SerializedName("au_becs_debit")
    AU_BECS_DEBIT("au_becs_debit"),

    @SerializedName("bacs_debit")
    BACS_DEBIT("bacs_debit"),

    @SerializedName("bancontact")
    BANCONTACT("bancontact"),

    @SerializedName("blik")
    BLIK("blik"),

    @SerializedName("boleto")
    BOLETO("boleto"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("cashapp")
    CASHAPP("cashapp"),

    @SerializedName("eps")
    EPS("eps"),

    @SerializedName("fpx")
    FPX("fpx"),

    @SerializedName("giropay")
    GIROPAY("giropay"),

    @SerializedName("grabpay")
    GRABPAY("grabpay"),

    @SerializedName("ideal")
    IDEAL("ideal"),

    @SerializedName("klarna")
    KLARNA("klarna"),

    @SerializedName("konbini")
    KONBINI("konbini"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("oxxo")
    OXXO("oxxo"),

    @SerializedName("p24")
    P24("p24"),

    @SerializedName("paynow")
    PAYNOW("paynow"),

    @SerializedName("paypal")
    PAYPAL("paypal"),

    @SerializedName("pix")
    PIX("pix"),

    @SerializedName("promptpay")
    PROMPTPAY("promptpay"),

    @SerializedName("sepa_debit")
    SEPA_DEBIT("sepa_debit"),

    @SerializedName("sofort")
    SOFORT("sofort"),

    @SerializedName("us_bank_account")
    US_BANK_ACCOUNT("us_bank_account"),

    @SerializedName("wechat_pay")
    WECHAT_PAY("wechat_pay");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentMethodType(String value) {
      this.value = value;
    }
  }

  public enum SubmitType implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),

    @SerializedName("book")
    BOOK("book"),

    @SerializedName("donate")
    DONATE("donate"),

    @SerializedName("pay")
    PAY("pay");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SubmitType(String value) {
      this.value = value;
    }
  }
}
