// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentLinkUpdateParams extends ApiRequestParams {
  /**
   * Whether the payment link's {@code url} is active. If {@code false}, customers visiting the URL
   * will be shown a page saying that the link has been deactivated.
   */
  @SerializedName("active")
  Boolean active;

  /** Behavior after the purchase is complete. */
  @SerializedName("after_completion")
  AfterCompletion afterCompletion;

  /** Enables user redeemable promotion codes. */
  @SerializedName("allow_promotion_codes")
  Boolean allowPromotionCodes;

  /** Configuration for automatic tax collection. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /** Configuration for collecting the customer's billing address. Defaults to {@code auto}. */
  @SerializedName("billing_address_collection")
  BillingAddressCollection billingAddressCollection;

  /**
   * Collect additional information from your customer using custom fields. Up to 3 fields are
   * supported.
   */
  @SerializedName("custom_fields")
  Object customFields;

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

  /** The custom message to be displayed to a customer when a payment link is no longer active. */
  @SerializedName("inactive_message")
  Object inactiveMessage;

  /** Generate a post-purchase Invoice for one-time payments. */
  @SerializedName("invoice_creation")
  InvoiceCreation invoiceCreation;

  /**
   * The line items representing what is being sold. Each line item represents an item being sold.
   * Up to 20 line items are supported.
   */
  @SerializedName("line_items")
  List<PaymentLinkUpdateParams.LineItem> lineItems;

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
   * <p>Can only be set in {@code subscription} mode. Defaults to {@code always}.
   *
   * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
   * guide on <a href="https://stripe.com/docs/payments/checkout/free-trials">configuring
   * subscriptions with a free trial</a>.
   */
  @SerializedName("payment_method_collection")
  PaymentMethodCollection paymentMethodCollection;

  /**
   * The list of payment method types that customers can use. Pass an empty string to enable dynamic
   * payment methods that use your <a
   * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
   */
  @SerializedName("payment_method_types")
  Object paymentMethodTypes;

  /**
   * Controls phone number collection settings during checkout.
   *
   * <p>We recommend that you review your privacy policy and check with your legal contacts.
   */
  @SerializedName("phone_number_collection")
  PhoneNumberCollection phoneNumberCollection;

  /** Settings that restrict the usage of a payment link. */
  @SerializedName("restrictions")
  Object restrictions;

  /** Configuration for collecting the customer's shipping address. */
  @SerializedName("shipping_address_collection")
  Object shippingAddressCollection;

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

  private PaymentLinkUpdateParams(
      Boolean active,
      AfterCompletion afterCompletion,
      Boolean allowPromotionCodes,
      AutomaticTax automaticTax,
      BillingAddressCollection billingAddressCollection,
      Object customFields,
      CustomText customText,
      CustomerCreation customerCreation,
      List<String> expand,
      Map<String, Object> extraParams,
      Object inactiveMessage,
      InvoiceCreation invoiceCreation,
      List<PaymentLinkUpdateParams.LineItem> lineItems,
      Map<String, String> metadata,
      PaymentIntentData paymentIntentData,
      PaymentMethodCollection paymentMethodCollection,
      Object paymentMethodTypes,
      PhoneNumberCollection phoneNumberCollection,
      Object restrictions,
      Object shippingAddressCollection,
      SubmitType submitType,
      SubscriptionData subscriptionData,
      TaxIdCollection taxIdCollection) {
    this.active = active;
    this.afterCompletion = afterCompletion;
    this.allowPromotionCodes = allowPromotionCodes;
    this.automaticTax = automaticTax;
    this.billingAddressCollection = billingAddressCollection;
    this.customFields = customFields;
    this.customText = customText;
    this.customerCreation = customerCreation;
    this.expand = expand;
    this.extraParams = extraParams;
    this.inactiveMessage = inactiveMessage;
    this.invoiceCreation = invoiceCreation;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.paymentIntentData = paymentIntentData;
    this.paymentMethodCollection = paymentMethodCollection;
    this.paymentMethodTypes = paymentMethodTypes;
    this.phoneNumberCollection = phoneNumberCollection;
    this.restrictions = restrictions;
    this.shippingAddressCollection = shippingAddressCollection;
    this.submitType = submitType;
    this.subscriptionData = subscriptionData;
    this.taxIdCollection = taxIdCollection;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private AfterCompletion afterCompletion;

    private Boolean allowPromotionCodes;

    private AutomaticTax automaticTax;

    private BillingAddressCollection billingAddressCollection;

    private Object customFields;

    private CustomText customText;

    private CustomerCreation customerCreation;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object inactiveMessage;

    private InvoiceCreation invoiceCreation;

    private List<PaymentLinkUpdateParams.LineItem> lineItems;

    private Map<String, String> metadata;

    private PaymentIntentData paymentIntentData;

    private PaymentMethodCollection paymentMethodCollection;

    private Object paymentMethodTypes;

    private PhoneNumberCollection phoneNumberCollection;

    private Object restrictions;

    private Object shippingAddressCollection;

    private SubmitType submitType;

    private SubscriptionData subscriptionData;

    private TaxIdCollection taxIdCollection;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentLinkUpdateParams build() {
      return new PaymentLinkUpdateParams(
          this.active,
          this.afterCompletion,
          this.allowPromotionCodes,
          this.automaticTax,
          this.billingAddressCollection,
          this.customFields,
          this.customText,
          this.customerCreation,
          this.expand,
          this.extraParams,
          this.inactiveMessage,
          this.invoiceCreation,
          this.lineItems,
          this.metadata,
          this.paymentIntentData,
          this.paymentMethodCollection,
          this.paymentMethodTypes,
          this.phoneNumberCollection,
          this.restrictions,
          this.shippingAddressCollection,
          this.submitType,
          this.subscriptionData,
          this.taxIdCollection);
    }

    /**
     * Whether the payment link's {@code url} is active. If {@code false}, customers visiting the
     * URL will be shown a page saying that the link has been deactivated.
     */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /** Behavior after the purchase is complete. */
    public Builder setAfterCompletion(PaymentLinkUpdateParams.AfterCompletion afterCompletion) {
      this.afterCompletion = afterCompletion;
      return this;
    }

    /** Enables user redeemable promotion codes. */
    public Builder setAllowPromotionCodes(Boolean allowPromotionCodes) {
      this.allowPromotionCodes = allowPromotionCodes;
      return this;
    }

    /** Configuration for automatic tax collection. */
    public Builder setAutomaticTax(PaymentLinkUpdateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /** Configuration for collecting the customer's billing address. Defaults to {@code auto}. */
    public Builder setBillingAddressCollection(
        PaymentLinkUpdateParams.BillingAddressCollection billingAddressCollection) {
      this.billingAddressCollection = billingAddressCollection;
      return this;
    }

    /**
     * Add an element to `customFields` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addCustomField(PaymentLinkUpdateParams.CustomField element) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<PaymentLinkUpdateParams.CustomField>();
      }
      ((List<PaymentLinkUpdateParams.CustomField>) this.customFields).add(element);
      return this;
    }

    /**
     * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#customFields} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllCustomField(List<PaymentLinkUpdateParams.CustomField> elements) {
      if (this.customFields == null || this.customFields instanceof EmptyParam) {
        this.customFields = new ArrayList<PaymentLinkUpdateParams.CustomField>();
      }
      ((List<PaymentLinkUpdateParams.CustomField>) this.customFields).addAll(elements);
      return this;
    }

    /**
     * Collect additional information from your customer using custom fields. Up to 3 fields are
     * supported.
     */
    public Builder setCustomFields(EmptyParam customFields) {
      this.customFields = customFields;
      return this;
    }

    /**
     * Collect additional information from your customer using custom fields. Up to 3 fields are
     * supported.
     */
    public Builder setCustomFields(List<PaymentLinkUpdateParams.CustomField> customFields) {
      this.customFields = customFields;
      return this;
    }

    /** Display additional text for your customers using custom text. */
    public Builder setCustomText(PaymentLinkUpdateParams.CustomText customText) {
      this.customText = customText;
      return this;
    }

    /**
     * Configures whether <a href="https://stripe.com/docs/api/checkout/sessions">checkout
     * sessions</a> created by this payment link create a <a
     * href="https://stripe.com/docs/api/customers">Customer</a>.
     */
    public Builder setCustomerCreation(PaymentLinkUpdateParams.CustomerCreation customerCreation) {
      this.customerCreation = customerCreation;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#expand} for the field documentation.
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
     * PaymentLinkUpdateParams#expand} for the field documentation.
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
     * PaymentLinkUpdateParams#extraParams} for the field documentation.
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
     * See {@link PaymentLinkUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The custom message to be displayed to a customer when a payment link is no longer active. */
    public Builder setInactiveMessage(String inactiveMessage) {
      this.inactiveMessage = inactiveMessage;
      return this;
    }

    /** The custom message to be displayed to a customer when a payment link is no longer active. */
    public Builder setInactiveMessage(EmptyParam inactiveMessage) {
      this.inactiveMessage = inactiveMessage;
      return this;
    }

    /** Generate a post-purchase Invoice for one-time payments. */
    public Builder setInvoiceCreation(PaymentLinkUpdateParams.InvoiceCreation invoiceCreation) {
      this.invoiceCreation = invoiceCreation;
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(PaymentLinkUpdateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<PaymentLinkUpdateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentLinkUpdateParams#metadata} for the field documentation.
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
     * See {@link PaymentLinkUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in {@code
     * payment} mode.
     */
    public Builder setPaymentIntentData(
        PaymentLinkUpdateParams.PaymentIntentData paymentIntentData) {
      this.paymentIntentData = paymentIntentData;
      return this;
    }

    /**
     * Specify whether Checkout should collect a payment method. When set to {@code if_required},
     * Checkout will not collect a payment method when the total due for the session is 0.This may
     * occur if the Checkout Session includes a free trial or a discount.
     *
     * <p>Can only be set in {@code subscription} mode. Defaults to {@code always}.
     *
     * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
     * guide on <a href="https://stripe.com/docs/payments/checkout/free-trials">configuring
     * subscriptions with a free trial</a>.
     */
    public Builder setPaymentMethodCollection(
        PaymentLinkUpdateParams.PaymentMethodCollection paymentMethodCollection) {
      this.paymentMethodCollection = paymentMethodCollection;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#paymentMethodTypes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addPaymentMethodType(PaymentLinkUpdateParams.PaymentMethodType element) {
      if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
        this.paymentMethodTypes = new ArrayList<PaymentLinkUpdateParams.PaymentMethodType>();
      }
      ((List<PaymentLinkUpdateParams.PaymentMethodType>) this.paymentMethodTypes).add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PaymentLinkUpdateParams#paymentMethodTypes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllPaymentMethodType(
        List<PaymentLinkUpdateParams.PaymentMethodType> elements) {
      if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
        this.paymentMethodTypes = new ArrayList<PaymentLinkUpdateParams.PaymentMethodType>();
      }
      ((List<PaymentLinkUpdateParams.PaymentMethodType>) this.paymentMethodTypes).addAll(elements);
      return this;
    }

    /**
     * The list of payment method types that customers can use. Pass an empty string to enable
     * dynamic payment methods that use your <a
     * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
     */
    public Builder setPaymentMethodTypes(EmptyParam paymentMethodTypes) {
      this.paymentMethodTypes = paymentMethodTypes;
      return this;
    }

    /**
     * The list of payment method types that customers can use. Pass an empty string to enable
     * dynamic payment methods that use your <a
     * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
     */
    public Builder setPaymentMethodTypes(
        List<PaymentLinkUpdateParams.PaymentMethodType> paymentMethodTypes) {
      this.paymentMethodTypes = paymentMethodTypes;
      return this;
    }

    /**
     * Controls phone number collection settings during checkout.
     *
     * <p>We recommend that you review your privacy policy and check with your legal contacts.
     */
    public Builder setPhoneNumberCollection(
        PaymentLinkUpdateParams.PhoneNumberCollection phoneNumberCollection) {
      this.phoneNumberCollection = phoneNumberCollection;
      return this;
    }

    /** Settings that restrict the usage of a payment link. */
    public Builder setRestrictions(PaymentLinkUpdateParams.Restrictions restrictions) {
      this.restrictions = restrictions;
      return this;
    }

    /** Settings that restrict the usage of a payment link. */
    public Builder setRestrictions(EmptyParam restrictions) {
      this.restrictions = restrictions;
      return this;
    }

    /** Configuration for collecting the customer's shipping address. */
    public Builder setShippingAddressCollection(
        PaymentLinkUpdateParams.ShippingAddressCollection shippingAddressCollection) {
      this.shippingAddressCollection = shippingAddressCollection;
      return this;
    }

    /** Configuration for collecting the customer's shipping address. */
    public Builder setShippingAddressCollection(EmptyParam shippingAddressCollection) {
      this.shippingAddressCollection = shippingAddressCollection;
      return this;
    }

    /**
     * Describes the type of transaction being performed in order to customize relevant text on the
     * page, such as the submit button. Changing this value will also affect the hostname in the <a
     * href="https://stripe.com/docs/api/payment_links/payment_links/object#url">url</a> property
     * (example: {@code donate.stripe.com}).
     */
    public Builder setSubmitType(PaymentLinkUpdateParams.SubmitType submitType) {
      this.submitType = submitType;
      return this;
    }

    /**
     * When creating a subscription, the specified configuration data will be used. There must be at
     * least one line item with a recurring price to use {@code subscription_data}.
     */
    public Builder setSubscriptionData(PaymentLinkUpdateParams.SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    /** Controls tax ID collection during checkout. */
    public Builder setTaxIdCollection(PaymentLinkUpdateParams.TaxIdCollection taxIdCollection) {
      this.taxIdCollection = taxIdCollection;
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
      public PaymentLinkUpdateParams.AfterCompletion build() {
        return new PaymentLinkUpdateParams.AfterCompletion(
            this.extraParams, this.hostedConfirmation, this.redirect, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.AfterCompletion#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.AfterCompletion#extraParams} for the field
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
          PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation hostedConfirmation) {
        this.hostedConfirmation = hostedConfirmation;
        return this;
      }

      /** Configuration when {@code type=redirect}. */
      public Builder setRedirect(PaymentLinkUpdateParams.AfterCompletion.Redirect redirect) {
        this.redirect = redirect;
        return this;
      }

      /**
       * <strong>Required.</strong> The specified behavior after the purchase is complete. Either
       * {@code redirect} or {@code hosted_confirmation}.
       */
      public Builder setType(PaymentLinkUpdateParams.AfterCompletion.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class HostedConfirmation {
      /** A custom message to display to the customer after the purchase is complete. */
      @SerializedName("custom_message")
      Object customMessage;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private HostedConfirmation(Object customMessage, Map<String, Object> extraParams) {
        this.customMessage = customMessage;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object customMessage;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation build() {
          return new PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation(
              this.customMessage, this.extraParams);
        }

        /** A custom message to display to the customer after the purchase is complete. */
        public Builder setCustomMessage(String customMessage) {
          this.customMessage = customMessage;
          return this;
        }

        /** A custom message to display to the customer after the purchase is complete. */
        public Builder setCustomMessage(EmptyParam customMessage) {
          this.customMessage = customMessage;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation#extraParams}
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
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation#extraParams}
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
      Object url;

      private Redirect(Map<String, Object> extraParams, Object url) {
        this.extraParams = extraParams;
        this.url = url;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object url;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.AfterCompletion.Redirect build() {
          return new PaymentLinkUpdateParams.AfterCompletion.Redirect(this.extraParams, this.url);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.Redirect#extraParams} for the
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
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.Redirect#extraParams} for the
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

        /**
         * <strong>Required.</strong> The URL the customer will be redirected to after the purchase
         * is complete. You can embed {@code {CHECKOUT_SESSION_ID}} into the URL to have the {@code
         * id} of the completed <a
         * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-id">checkout
         * session</a> included.
         */
        public Builder setUrl(EmptyParam url) {
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
     * <strong>Required.</strong> Set to {@code true} to <a
     * href="https://docs.stripe.com/tax">calculate tax automatically</a> using the customer's
     * location.
     *
     * <p>Enabling this parameter causes the payment link to collect any billing address information
     * necessary for tax calculation.
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

    /**
     * The account that's liable for tax. If set, the business address and tax registrations
     * required to perform the tax calculation are loaded from this account. The tax transaction is
     * returned in the report of the connected account.
     */
    @SerializedName("liability")
    Liability liability;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams, Liability liability) {
      this.enabled = enabled;
      this.extraParams = extraParams;
      this.liability = liability;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      private Liability liability;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.AutomaticTax build() {
        return new PaymentLinkUpdateParams.AutomaticTax(
            this.enabled, this.extraParams, this.liability);
      }

      /**
       * <strong>Required.</strong> Set to {@code true} to <a
       * href="https://docs.stripe.com/tax">calculate tax automatically</a> using the customer's
       * location.
       *
       * <p>Enabling this parameter causes the payment link to collect any billing address
       * information necessary for tax calculation.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.AutomaticTax#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The account that's liable for tax. If set, the business address and tax registrations
       * required to perform the tax calculation are loaded from this account. The tax transaction
       * is returned in the report of the connected account.
       */
      public Builder setLiability(PaymentLinkUpdateParams.AutomaticTax.Liability liability) {
        this.liability = liability;
        return this;
      }
    }

    @Getter
    public static class Liability {
      /** The connected account being referenced when {@code type} is {@code account}. */
      @SerializedName("account")
      Object account;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of the account referenced in the request. */
      @SerializedName("type")
      Type type;

      private Liability(Object account, Map<String, Object> extraParams, Type type) {
        this.account = account;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object account;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.AutomaticTax.Liability build() {
          return new PaymentLinkUpdateParams.AutomaticTax.Liability(
              this.account, this.extraParams, this.type);
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /** The connected account being referenced when {@code type} is {@code account}. */
        public Builder setAccount(EmptyParam account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.AutomaticTax.Liability#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.AutomaticTax.Liability#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        public Builder setType(PaymentLinkUpdateParams.AutomaticTax.Liability.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("account")
        ACCOUNT("account"),

        @SerializedName("self")
        SELF("self");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
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
    Object key;

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
        Object key,
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

      private Object key;

      private Label label;

      private Numeric numeric;

      private Boolean optional;

      private Text text;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.CustomField build() {
        return new PaymentLinkUpdateParams.CustomField(
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
      public Builder setDropdown(PaymentLinkUpdateParams.CustomField.Dropdown dropdown) {
        this.dropdown = dropdown;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.CustomField#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.CustomField#extraParams} for the field documentation.
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

      /**
       * <strong>Required.</strong> String of your choice that your integration can use to reconcile
       * this field. Must be unique to this field, alphanumeric, and up to 200 characters.
       */
      public Builder setKey(EmptyParam key) {
        this.key = key;
        return this;
      }

      /** <strong>Required.</strong> The label for the field, displayed to the customer. */
      public Builder setLabel(PaymentLinkUpdateParams.CustomField.Label label) {
        this.label = label;
        return this;
      }

      /** Configuration for {@code type=numeric} fields. */
      public Builder setNumeric(PaymentLinkUpdateParams.CustomField.Numeric numeric) {
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
      public Builder setText(PaymentLinkUpdateParams.CustomField.Text text) {
        this.text = text;
        return this;
      }

      /** <strong>Required.</strong> The type of the field. */
      public Builder setType(PaymentLinkUpdateParams.CustomField.Type type) {
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
      List<PaymentLinkUpdateParams.CustomField.Dropdown.Option> options;

      private Dropdown(
          Map<String, Object> extraParams,
          List<PaymentLinkUpdateParams.CustomField.Dropdown.Option> options) {
        this.extraParams = extraParams;
        this.options = options;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<PaymentLinkUpdateParams.CustomField.Dropdown.Option> options;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomField.Dropdown build() {
          return new PaymentLinkUpdateParams.CustomField.Dropdown(this.extraParams, this.options);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomField.Dropdown#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.CustomField.Dropdown#extraParams} for the field
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
         * PaymentLinkUpdateParams.CustomField.Dropdown#options} for the field documentation.
         */
        public Builder addOption(PaymentLinkUpdateParams.CustomField.Dropdown.Option element) {
          if (this.options == null) {
            this.options = new ArrayList<>();
          }
          this.options.add(element);
          return this;
        }

        /**
         * Add all elements to `options` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkUpdateParams.CustomField.Dropdown#options} for the field documentation.
         */
        public Builder addAllOption(
            List<PaymentLinkUpdateParams.CustomField.Dropdown.Option> elements) {
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
        Object label;

        /**
         * <strong>Required.</strong> The value for this option, not displayed to the customer, used
         * by your integration to reconcile the option selected by the customer. Must be unique to
         * this option, alphanumeric, and up to 100 characters.
         */
        @SerializedName("value")
        Object value;

        private Option(Map<String, Object> extraParams, Object label, Object value) {
          this.extraParams = extraParams;
          this.label = label;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object label;

          private Object value;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkUpdateParams.CustomField.Dropdown.Option build() {
            return new PaymentLinkUpdateParams.CustomField.Dropdown.Option(
                this.extraParams, this.label, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentLinkUpdateParams.CustomField.Dropdown.Option#extraParams} for
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
           * map. See {@link PaymentLinkUpdateParams.CustomField.Dropdown.Option#extraParams} for
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
           * <strong>Required.</strong> The label for the option, displayed to the customer. Up to
           * 100 characters.
           */
          public Builder setLabel(EmptyParam label) {
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

          /**
           * <strong>Required.</strong> The value for this option, not displayed to the customer,
           * used by your integration to reconcile the option selected by the customer. Must be
           * unique to this option, alphanumeric, and up to 100 characters.
           */
          public Builder setValue(EmptyParam value) {
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
      Object custom;

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

      private Label(Object custom, Map<String, Object> extraParams, Type type) {
        this.custom = custom;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object custom;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomField.Label build() {
          return new PaymentLinkUpdateParams.CustomField.Label(
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
         * <strong>Required.</strong> Custom text for the label, displayed to the customer. Up to 50
         * characters.
         */
        public Builder setCustom(EmptyParam custom) {
          this.custom = custom;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomField.Label#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.CustomField.Label#extraParams} for the field
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
        public Builder setType(PaymentLinkUpdateParams.CustomField.Label.Type type) {
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
        public PaymentLinkUpdateParams.CustomField.Numeric build() {
          return new PaymentLinkUpdateParams.CustomField.Numeric(
              this.extraParams, this.maximumLength, this.minimumLength);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomField.Numeric#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.CustomField.Numeric#extraParams} for the field
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
        public PaymentLinkUpdateParams.CustomField.Text build() {
          return new PaymentLinkUpdateParams.CustomField.Text(
              this.extraParams, this.maximumLength, this.minimumLength);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomField.Text#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.CustomField.Text#extraParams} for the field
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
    /** Custom text that should be displayed after the payment confirmation button. */
    @SerializedName("after_submit")
    Object afterSubmit;

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
        Object afterSubmit,
        Map<String, Object> extraParams,
        Object shippingAddress,
        Object submit,
        Object termsOfServiceAcceptance) {
      this.afterSubmit = afterSubmit;
      this.extraParams = extraParams;
      this.shippingAddress = shippingAddress;
      this.submit = submit;
      this.termsOfServiceAcceptance = termsOfServiceAcceptance;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object afterSubmit;

      private Map<String, Object> extraParams;

      private Object shippingAddress;

      private Object submit;

      private Object termsOfServiceAcceptance;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.CustomText build() {
        return new PaymentLinkUpdateParams.CustomText(
            this.afterSubmit,
            this.extraParams,
            this.shippingAddress,
            this.submit,
            this.termsOfServiceAcceptance);
      }

      /** Custom text that should be displayed after the payment confirmation button. */
      public Builder setAfterSubmit(PaymentLinkUpdateParams.CustomText.AfterSubmit afterSubmit) {
        this.afterSubmit = afterSubmit;
        return this;
      }

      /** Custom text that should be displayed after the payment confirmation button. */
      public Builder setAfterSubmit(EmptyParam afterSubmit) {
        this.afterSubmit = afterSubmit;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.CustomText#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.CustomText#extraParams} for the field documentation.
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
          PaymentLinkUpdateParams.CustomText.ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside shipping address collection. */
      public Builder setShippingAddress(EmptyParam shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside the payment confirmation button. */
      public Builder setSubmit(PaymentLinkUpdateParams.CustomText.Submit submit) {
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
          PaymentLinkUpdateParams.CustomText.TermsOfServiceAcceptance termsOfServiceAcceptance) {
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
    public static class AfterSubmit {
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
      Object message;

      private AfterSubmit(Map<String, Object> extraParams, Object message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomText.AfterSubmit build() {
          return new PaymentLinkUpdateParams.CustomText.AfterSubmit(this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomText.AfterSubmit#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.CustomText.AfterSubmit#extraParams} for the field
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

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(EmptyParam message) {
          this.message = message;
          return this;
        }
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
      Object message;

      private ShippingAddress(Map<String, Object> extraParams, Object message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomText.ShippingAddress build() {
          return new PaymentLinkUpdateParams.CustomText.ShippingAddress(
              this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomText.ShippingAddress#extraParams} for the
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
         * map. See {@link PaymentLinkUpdateParams.CustomText.ShippingAddress#extraParams} for the
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

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(EmptyParam message) {
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
      Object message;

      private Submit(Map<String, Object> extraParams, Object message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomText.Submit build() {
          return new PaymentLinkUpdateParams.CustomText.Submit(this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomText.Submit#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.CustomText.Submit#extraParams} for the field
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

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(EmptyParam message) {
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
      Object message;

      private TermsOfServiceAcceptance(Map<String, Object> extraParams, Object message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomText.TermsOfServiceAcceptance build() {
          return new PaymentLinkUpdateParams.CustomText.TermsOfServiceAcceptance(
              this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomText.TermsOfServiceAcceptance#extraParams}
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
         * map. See {@link PaymentLinkUpdateParams.CustomText.TermsOfServiceAcceptance#extraParams}
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

        /** <strong>Required.</strong> Text may be up to 1200 characters in length. */
        public Builder setMessage(EmptyParam message) {
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
      public PaymentLinkUpdateParams.InvoiceCreation build() {
        return new PaymentLinkUpdateParams.InvoiceCreation(
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
       * PaymentLinkUpdateParams.InvoiceCreation#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.InvoiceCreation#extraParams} for the field
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
          PaymentLinkUpdateParams.InvoiceCreation.InvoiceData invoiceData) {
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
      Object description;

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
      Object footer;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

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
          Object description,
          Map<String, Object> extraParams,
          Object footer,
          Issuer issuer,
          Object metadata,
          Object renderingOptions) {
        this.accountTaxIds = accountTaxIds;
        this.customFields = customFields;
        this.description = description;
        this.extraParams = extraParams;
        this.footer = footer;
        this.issuer = issuer;
        this.metadata = metadata;
        this.renderingOptions = renderingOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountTaxIds;

        private Object customFields;

        private Object description;

        private Map<String, Object> extraParams;

        private Object footer;

        private Issuer issuer;

        private Object metadata;

        private Object renderingOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.InvoiceCreation.InvoiceData build() {
          return new PaymentLinkUpdateParams.InvoiceCreation.InvoiceData(
              this.accountTaxIds,
              this.customFields,
              this.description,
              this.extraParams,
              this.footer,
              this.issuer,
              this.metadata,
              this.renderingOptions);
        }

        /**
         * Add an element to `accountTaxIds` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#accountTaxIds} for the field
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
         * See {@link PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#accountTaxIds} for the
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
         * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#customFields} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addCustomField(
            PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField element) {
          if (this.customFields == null || this.customFields instanceof EmptyParam) {
            this.customFields =
                new ArrayList<PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField>();
          }
          ((List<PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField>)
                  this.customFields)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `customFields` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#customFields} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllCustomField(
            List<PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField> elements) {
          if (this.customFields == null || this.customFields instanceof EmptyParam) {
            this.customFields =
                new ArrayList<PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField>();
          }
          ((List<PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField>)
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
            List<PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField> customFields) {
          this.customFields = customFields;
          return this;
        }

        /** An arbitrary string attached to the object. Often useful for displaying to users. */
        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /** An arbitrary string attached to the object. Often useful for displaying to users. */
        public Builder setDescription(EmptyParam description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#extraParams} for the
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
         * map. See {@link PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#extraParams} for the
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

        /** Default footer to be displayed on invoices for this customer. */
        public Builder setFooter(EmptyParam footer) {
          this.footer = footer;
          return this;
        }

        /**
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(
            PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#metadata} for the field
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
         * map. See {@link PaymentLinkUpdateParams.InvoiceCreation.InvoiceData#metadata} for the
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
            PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.RenderingOptions renderingOptions) {
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
         * <strong>Required.</strong> The name of the custom field. This may be up to 40 characters.
         */
        @SerializedName("name")
        Object name;

        /**
         * <strong>Required.</strong> The value of the custom field. This may be up to 140
         * characters.
         */
        @SerializedName("value")
        Object value;

        private CustomField(Map<String, Object> extraParams, Object name, Object value) {
          this.extraParams = extraParams;
          this.name = name;
          this.value = value;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          private Object value;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField build() {
            return new PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField(
                this.extraParams, this.name, this.value);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField#extraParams} for the
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
           * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.CustomField#extraParams} for the
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
           * <strong>Required.</strong> The name of the custom field. This may be up to 40
           * characters.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> The name of the custom field. This may be up to 40
           * characters.
           */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> The value of the custom field. This may be up to 140
           * characters.
           */
          public Builder setValue(String value) {
            this.value = value;
            return this;
          }

          /**
           * <strong>Required.</strong> The value of the custom field. This may be up to 140
           * characters.
           */
          public Builder setValue(EmptyParam value) {
            this.value = value;
            return this;
          }
        }
      }

      @Getter
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.Issuer build() {
            return new PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.Issuer#extraParams}
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
           * map. See {@link PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.Issuer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(
              PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.Issuer.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
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
          public PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.RenderingOptions build() {
            return new PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.RenderingOptions(
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
              PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.RenderingOptions.AmountTaxDisplay
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
           * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.RenderingOptions#extraParams} for
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
           * PaymentLinkUpdateParams.InvoiceCreation.InvoiceData.RenderingOptions#extraParams} for
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

    /** <strong>Required.</strong> The ID of an existing line item on the payment link. */
    @SerializedName("id")
    Object id;

    /** The quantity of the line item being purchased. */
    @SerializedName("quantity")
    Long quantity;

    private LineItem(
        AdjustableQuantity adjustableQuantity,
        Map<String, Object> extraParams,
        Object id,
        Long quantity) {
      this.adjustableQuantity = adjustableQuantity;
      this.extraParams = extraParams;
      this.id = id;
      this.quantity = quantity;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AdjustableQuantity adjustableQuantity;

      private Map<String, Object> extraParams;

      private Object id;

      private Long quantity;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.LineItem build() {
        return new PaymentLinkUpdateParams.LineItem(
            this.adjustableQuantity, this.extraParams, this.id, this.quantity);
      }

      /**
       * When set, provides configuration for this item’s quantity to be adjusted by the customer
       * during checkout.
       */
      public Builder setAdjustableQuantity(
          PaymentLinkUpdateParams.LineItem.AdjustableQuantity adjustableQuantity) {
        this.adjustableQuantity = adjustableQuantity;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID of an existing line item on the payment link. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** <strong>Required.</strong> The ID of an existing line item on the payment link. */
      public Builder setId(EmptyParam id) {
        this.id = id;
        return this;
      }

      /** The quantity of the line item being purchased. */
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
        public PaymentLinkUpdateParams.LineItem.AdjustableQuantity build() {
          return new PaymentLinkUpdateParams.LineItem.AdjustableQuantity(
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
         * map. See {@link PaymentLinkUpdateParams.LineItem.AdjustableQuantity#extraParams} for the
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
         * map. See {@link PaymentLinkUpdateParams.LineItem.AdjustableQuantity#extraParams} for the
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
    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    @SerializedName("description")
    Object description;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
     * declaratively set metadata on <a href="https://stripe.com/docs/api/payment_intents">Payment
     * Intents</a> generated from this payment link. Unlike object-level metadata, this field is
     * declarative. Updates will clear prior values.
     */
    @SerializedName("metadata")
    Object metadata;

    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card
     * charge. This value overrides the account's default statement descriptor. For information
     * about requirements, including the 22-character limit, see <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
     * Descriptor docs</a>.
     *
     * <p>Setting this value for a card charge returns an error. For card charges, set the <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
     * instead.
     */
    @SerializedName("statement_descriptor")
    Object statementDescriptor;

    /**
     * Provides information about a card charge. Concatenated to the account's <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
     * descriptor prefix</a> to form the complete statement descriptor that appears on the
     * customer's statement.
     */
    @SerializedName("statement_descriptor_suffix")
    Object statementDescriptorSuffix;

    /**
     * A string that identifies the resulting payment as part of a group. See the PaymentIntents <a
     * href="https://stripe.com/docs/connect/separate-charges-and-transfers">use case for connected
     * accounts</a> for details.
     */
    @SerializedName("transfer_group")
    Object transferGroup;

    private PaymentIntentData(
        Object description,
        Map<String, Object> extraParams,
        Object metadata,
        Object statementDescriptor,
        Object statementDescriptorSuffix,
        Object transferGroup) {
      this.description = description;
      this.extraParams = extraParams;
      this.metadata = metadata;
      this.statementDescriptor = statementDescriptor;
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      this.transferGroup = transferGroup;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object description;

      private Map<String, Object> extraParams;

      private Object metadata;

      private Object statementDescriptor;

      private Object statementDescriptorSuffix;

      private Object transferGroup;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.PaymentIntentData build() {
        return new PaymentLinkUpdateParams.PaymentIntentData(
            this.description,
            this.extraParams,
            this.metadata,
            this.statementDescriptor,
            this.statementDescriptorSuffix,
            this.transferGroup);
      }

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      public Builder setDescription(EmptyParam description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.PaymentIntentData#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.PaymentIntentData#extraParams} for the field
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
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.PaymentIntentData#metadata} for the field documentation.
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkUpdateParams.PaymentIntentData#metadata} for the field documentation.
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
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
       * declaratively set metadata on <a href="https://stripe.com/docs/api/payment_intents">Payment
       * Intents</a> generated from this payment link. Unlike object-level metadata, this field is
       * declarative. Updates will clear prior values.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
       * declaratively set metadata on <a href="https://stripe.com/docs/api/payment_intents">Payment
       * Intents</a> generated from this payment link. Unlike object-level metadata, this field is
       * declarative. Updates will clear prior values.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Text that appears on the customer's statement as the statement descriptor for a non-card
       * charge. This value overrides the account's default statement descriptor. For information
       * about requirements, including the 22-character limit, see <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
       * Descriptor docs</a>.
       *
       * <p>Setting this value for a card charge returns an error. For card charges, set the <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
       * instead.
       */
      public Builder setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }

      /**
       * Text that appears on the customer's statement as the statement descriptor for a non-card
       * charge. This value overrides the account's default statement descriptor. For information
       * about requirements, including the 22-character limit, see <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
       * Descriptor docs</a>.
       *
       * <p>Setting this value for a card charge returns an error. For card charges, set the <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
       * instead.
       */
      public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }

      /**
       * Provides information about a card charge. Concatenated to the account's <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
       * descriptor prefix</a> to form the complete statement descriptor that appears on the
       * customer's statement.
       */
      public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
        this.statementDescriptorSuffix = statementDescriptorSuffix;
        return this;
      }

      /**
       * Provides information about a card charge. Concatenated to the account's <a
       * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
       * descriptor prefix</a> to form the complete statement descriptor that appears on the
       * customer's statement.
       */
      public Builder setStatementDescriptorSuffix(EmptyParam statementDescriptorSuffix) {
        this.statementDescriptorSuffix = statementDescriptorSuffix;
        return this;
      }

      /**
       * A string that identifies the resulting payment as part of a group. See the PaymentIntents
       * <a href="https://stripe.com/docs/connect/separate-charges-and-transfers">use case for
       * connected accounts</a> for details.
       */
      public Builder setTransferGroup(String transferGroup) {
        this.transferGroup = transferGroup;
        return this;
      }

      /**
       * A string that identifies the resulting payment as part of a group. See the PaymentIntents
       * <a href="https://stripe.com/docs/connect/separate-charges-and-transfers">use case for
       * connected accounts</a> for details.
       */
      public Builder setTransferGroup(EmptyParam transferGroup) {
        this.transferGroup = transferGroup;
        return this;
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
      public PaymentLinkUpdateParams.PhoneNumberCollection build() {
        return new PaymentLinkUpdateParams.PhoneNumberCollection(this.enabled, this.extraParams);
      }

      /** <strong>Required.</strong> Set to {@code true} to enable phone number collection. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.PhoneNumberCollection#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.PhoneNumberCollection#extraParams} for the field
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
  public static class Restrictions {
    /**
     * <strong>Required.</strong> Configuration for the {@code completed_sessions} restriction type.
     */
    @SerializedName("completed_sessions")
    CompletedSessions completedSessions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Restrictions(CompletedSessions completedSessions, Map<String, Object> extraParams) {
      this.completedSessions = completedSessions;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CompletedSessions completedSessions;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.Restrictions build() {
        return new PaymentLinkUpdateParams.Restrictions(this.completedSessions, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Configuration for the {@code completed_sessions} restriction
       * type.
       */
      public Builder setCompletedSessions(
          PaymentLinkUpdateParams.Restrictions.CompletedSessions completedSessions) {
        this.completedSessions = completedSessions;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.Restrictions#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.Restrictions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    public static class CompletedSessions {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The maximum number of checkout sessions that can be completed
       * for the {@code completed_sessions} restriction to be met.
       */
      @SerializedName("limit")
      Long limit;

      private CompletedSessions(Map<String, Object> extraParams, Long limit) {
        this.extraParams = extraParams;
        this.limit = limit;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long limit;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.Restrictions.CompletedSessions build() {
          return new PaymentLinkUpdateParams.Restrictions.CompletedSessions(
              this.extraParams, this.limit);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.Restrictions.CompletedSessions#extraParams} for
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
         * map. See {@link PaymentLinkUpdateParams.Restrictions.CompletedSessions#extraParams} for
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
         * <strong>Required.</strong> The maximum number of checkout sessions that can be completed
         * for the {@code completed_sessions} restriction to be met.
         */
        public Builder setLimit(Long limit) {
          this.limit = limit;
          return this;
        }
      }
    }
  }

  @Getter
  public static class ShippingAddressCollection {
    /**
     * <strong>Required.</strong> An array of two-letter ISO country codes representing which
     * countries Checkout should provide as options for shipping locations.
     */
    @SerializedName("allowed_countries")
    List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry> allowedCountries;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ShippingAddressCollection(
        List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry> allowedCountries,
        Map<String, Object> extraParams) {
      this.allowedCountries = allowedCountries;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry>
          allowedCountries;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.ShippingAddressCollection build() {
        return new PaymentLinkUpdateParams.ShippingAddressCollection(
            this.allowedCountries, this.extraParams);
      }

      /**
       * Add an element to `allowedCountries` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentLinkUpdateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllowedCountry(
          PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry element) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link PaymentLinkUpdateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllAllowedCountry(
          List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry> elements) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.ShippingAddressCollection#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.ShippingAddressCollection#extraParams} for the field
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

      @SerializedName("SD")
      SD("SD"),

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
  public static class SubscriptionData {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** All invoices will be billed using the specified settings. */
    @SerializedName("invoice_settings")
    InvoiceSettings invoiceSettings;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
     * declaratively set metadata on <a
     * href="https://stripe.com/docs/api/subscriptions">Subscriptions</a> generated from this
     * payment link. Unlike object-level metadata, this field is declarative. Updates will clear
     * prior values.
     */
    @SerializedName("metadata")
    Object metadata;

    /**
     * Integer representing the number of trial period days before the customer is charged for the
     * first time. Has to be at least 1.
     */
    @SerializedName("trial_period_days")
    Object trialPeriodDays;

    /** Settings related to subscription trials. */
    @SerializedName("trial_settings")
    Object trialSettings;

    private SubscriptionData(
        Map<String, Object> extraParams,
        InvoiceSettings invoiceSettings,
        Object metadata,
        Object trialPeriodDays,
        Object trialSettings) {
      this.extraParams = extraParams;
      this.invoiceSettings = invoiceSettings;
      this.metadata = metadata;
      this.trialPeriodDays = trialPeriodDays;
      this.trialSettings = trialSettings;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private InvoiceSettings invoiceSettings;

      private Object metadata;

      private Object trialPeriodDays;

      private Object trialSettings;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.SubscriptionData build() {
        return new PaymentLinkUpdateParams.SubscriptionData(
            this.extraParams,
            this.invoiceSettings,
            this.metadata,
            this.trialPeriodDays,
            this.trialSettings);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.SubscriptionData#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.SubscriptionData#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** All invoices will be billed using the specified settings. */
      public Builder setInvoiceSettings(
          PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings invoiceSettings) {
        this.invoiceSettings = invoiceSettings;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.SubscriptionData#metadata} for the field documentation.
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentLinkUpdateParams.SubscriptionData#metadata} for the field documentation.
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
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
       * declaratively set metadata on <a
       * href="https://stripe.com/docs/api/subscriptions">Subscriptions</a> generated from this
       * payment link. Unlike object-level metadata, this field is declarative. Updates will clear
       * prior values.
       */
      public Builder setMetadata(EmptyParam metadata) {
        this.metadata = metadata;
        return this;
      }

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that will
       * declaratively set metadata on <a
       * href="https://stripe.com/docs/api/subscriptions">Subscriptions</a> generated from this
       * payment link. Unlike object-level metadata, this field is declarative. Updates will clear
       * prior values.
       */
      public Builder setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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

      /**
       * Integer representing the number of trial period days before the customer is charged for the
       * first time. Has to be at least 1.
       */
      public Builder setTrialPeriodDays(EmptyParam trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }

      /** Settings related to subscription trials. */
      public Builder setTrialSettings(
          PaymentLinkUpdateParams.SubscriptionData.TrialSettings trialSettings) {
        this.trialSettings = trialSettings;
        return this;
      }

      /** Settings related to subscription trials. */
      public Builder setTrialSettings(EmptyParam trialSettings) {
        this.trialSettings = trialSettings;
        return this;
      }
    }

    @Getter
    public static class InvoiceSettings {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The connected account that issues the invoice. The invoice is presented with the branding
       * and support information of the specified account.
       */
      @SerializedName("issuer")
      Issuer issuer;

      private InvoiceSettings(Map<String, Object> extraParams, Issuer issuer) {
        this.extraParams = extraParams;
        this.issuer = issuer;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Issuer issuer;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings build() {
          return new PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings(
              this.extraParams, this.issuer);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings#extraParams} for
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
         * map. See {@link PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings#extraParams} for
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
         * The connected account that issues the invoice. The invoice is presented with the branding
         * and support information of the specified account.
         */
        public Builder setIssuer(
            PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings.Issuer issuer) {
          this.issuer = issuer;
          return this;
        }
      }

      @Getter
      public static class Issuer {
        /** The connected account being referenced when {@code type} is {@code account}. */
        @SerializedName("account")
        Object account;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Type of the account referenced in the request. */
        @SerializedName("type")
        Type type;

        private Issuer(Object account, Map<String, Object> extraParams, Type type) {
          this.account = account;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object account;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings.Issuer build() {
            return new PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings.Issuer(
                this.account, this.extraParams, this.type);
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(String account) {
            this.account = account;
            return this;
          }

          /** The connected account being referenced when {@code type} is {@code account}. */
          public Builder setAccount(EmptyParam account) {
            this.account = account;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings.Issuer#extraParams} for the
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
           * PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings.Issuer#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Type of the account referenced in the request. */
          public Builder setType(
              PaymentLinkUpdateParams.SubscriptionData.InvoiceSettings.Issuer.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("account")
          ACCOUNT("account"),

          @SerializedName("self")
          SELF("self");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class TrialSettings {
      /**
       * <strong>Required.</strong> Defines how the subscription should behave when the user's free
       * trial ends.
       */
      @SerializedName("end_behavior")
      EndBehavior endBehavior;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private TrialSettings(EndBehavior endBehavior, Map<String, Object> extraParams) {
        this.endBehavior = endBehavior;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndBehavior endBehavior;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.SubscriptionData.TrialSettings build() {
          return new PaymentLinkUpdateParams.SubscriptionData.TrialSettings(
              this.endBehavior, this.extraParams);
        }

        /**
         * <strong>Required.</strong> Defines how the subscription should behave when the user's
         * free trial ends.
         */
        public Builder setEndBehavior(
            PaymentLinkUpdateParams.SubscriptionData.TrialSettings.EndBehavior endBehavior) {
          this.endBehavior = endBehavior;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.SubscriptionData.TrialSettings#extraParams} for
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
         * map. See {@link PaymentLinkUpdateParams.SubscriptionData.TrialSettings#extraParams} for
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

      @Getter
      public static class EndBehavior {
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
         * <strong>Required.</strong> Indicates how the subscription should change when the trial
         * ends if the user did not provide a payment method.
         */
        @SerializedName("missing_payment_method")
        MissingPaymentMethod missingPaymentMethod;

        private EndBehavior(
            Map<String, Object> extraParams, MissingPaymentMethod missingPaymentMethod) {
          this.extraParams = extraParams;
          this.missingPaymentMethod = missingPaymentMethod;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private MissingPaymentMethod missingPaymentMethod;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentLinkUpdateParams.SubscriptionData.TrialSettings.EndBehavior build() {
            return new PaymentLinkUpdateParams.SubscriptionData.TrialSettings.EndBehavior(
                this.extraParams, this.missingPaymentMethod);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentLinkUpdateParams.SubscriptionData.TrialSettings.EndBehavior#extraParams} for the
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
           * PaymentLinkUpdateParams.SubscriptionData.TrialSettings.EndBehavior#extraParams} for the
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
           * <strong>Required.</strong> Indicates how the subscription should change when the trial
           * ends if the user did not provide a payment method.
           */
          public Builder setMissingPaymentMethod(
              PaymentLinkUpdateParams.SubscriptionData.TrialSettings.EndBehavior
                      .MissingPaymentMethod
                  missingPaymentMethod) {
            this.missingPaymentMethod = missingPaymentMethod;
            return this;
          }
        }

        public enum MissingPaymentMethod implements ApiRequestParams.EnumParam {
          @SerializedName("cancel")
          CANCEL("cancel"),

          @SerializedName("create_invoice")
          CREATE_INVOICE("create_invoice"),

          @SerializedName("pause")
          PAUSE("pause");

          @Getter(onMethod_ = {@Override})
          private final String value;

          MissingPaymentMethod(String value) {
            this.value = value;
          }
        }
      }
    }
  }

  @Getter
  public static class TaxIdCollection {
    /**
     * <strong>Required.</strong> Enable tax ID collection during checkout. Defaults to {@code
     * false}.
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

    /** Describes whether a tax ID is required during checkout. Defaults to {@code never}. */
    @SerializedName("required")
    Required required;

    private TaxIdCollection(Boolean enabled, Map<String, Object> extraParams, Required required) {
      this.enabled = enabled;
      this.extraParams = extraParams;
      this.required = required;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      private Required required;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.TaxIdCollection build() {
        return new PaymentLinkUpdateParams.TaxIdCollection(
            this.enabled, this.extraParams, this.required);
      }

      /**
       * <strong>Required.</strong> Enable tax ID collection during checkout. Defaults to {@code
       * false}.
       */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.TaxIdCollection#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.TaxIdCollection#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Describes whether a tax ID is required during checkout. Defaults to {@code never}. */
      public Builder setRequired(PaymentLinkUpdateParams.TaxIdCollection.Required required) {
        this.required = required;
        return this;
      }
    }

    public enum Required implements ApiRequestParams.EnumParam {
      @SerializedName("if_supported")
      IF_SUPPORTED("if_supported"),

      @SerializedName("never")
      NEVER("never");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Required(String value) {
        this.value = value;
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

    @SerializedName("alma")
    ALMA("alma"),

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

    @SerializedName("mobilepay")
    MOBILEPAY("mobilepay"),

    @SerializedName("multibanco")
    MULTIBANCO("multibanco"),

    @SerializedName("oxxo")
    OXXO("oxxo"),

    @SerializedName("p24")
    P24("p24"),

    @SerializedName("pay_by_bank")
    PAY_BY_BANK("pay_by_bank"),

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

    @SerializedName("swish")
    SWISH("swish"),

    @SerializedName("twint")
    TWINT("twint"),

    @SerializedName("us_bank_account")
    US_BANK_ACCOUNT("us_bank_account"),

    @SerializedName("wechat_pay")
    WECHAT_PAY("wechat_pay"),

    @SerializedName("zip")
    ZIP("zip");

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
    PAY("pay"),

    @SerializedName("subscribe")
    SUBSCRIBE("subscribe");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SubmitType(String value) {
      this.value = value;
    }
  }
}
