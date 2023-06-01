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
public class PaymentIntentUpdateParams extends ApiRequestParams {
  /**
   * Amount intended to be collected by this PaymentIntent. A positive integer representing how much
   * to charge in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
   * unit</a> (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The
   * minimum amount is $0.50 US or <a
   * href="https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts">equivalent in
   * charge currency</a>. The amount value supports up to eight digits (e.g., a value of 99999999
   * for a USD charge of $999,999.99).
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. The amount of the application fee
   * collected will be capped at the total payment amount. For more information, see the
   * PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case for
   * connected accounts</a>.
   */
  @SerializedName("application_fee_amount")
  Object applicationFeeAmount;

  /** Controls when the funds will be captured from the customer's account. */
  @SerializedName("capture_method")
  CaptureMethod captureMethod;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  Object currency;

  /**
   * ID of the Customer this PaymentIntent belongs to, if one exists.
   *
   * <p>Payment methods attached to other Customers cannot be used with this PaymentIntent.
   *
   * <p>If present in combination with <a
   * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>,
   * this PaymentIntent's payment method will be attached to the Customer after the PaymentIntent
   * has been confirmed and any required actions from the user are complete.
   */
  @SerializedName("customer")
  Object customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  Object description;

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

  /** This hash contains details about the Mandate to create. */
  @SerializedName("mandate_data")
  MandateDataPublishableKey mandateData;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * ID of the payment method (a PaymentMethod, Card, or <a
   * href="https://stripe.com/docs/payments/payment-methods/transitioning#compatibility">compatible
   * Source</a> object) to attach to this PaymentIntent.
   */
  @SerializedName("payment_method")
  Object paymentMethod;

  /**
   * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will
   * appear in the <a
   * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-payment_method">payment_method</a>
   * property on the PaymentIntent.
   */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** Payment-method-specific configuration for this PaymentIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. Use
   * automatic_payment_methods to manage payment methods from the <a
   * href="https://dashboard.stripe.com/settings/payment_methods">Stripe Dashboard</a>.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /**
   * Email address that the receipt for the resulting payment will be sent to. If {@code
   * receipt_email} is specified for a payment in live mode, a receipt will be sent regardless of
   * your <a href="https://dashboard.stripe.com/account/emails">email settings</a>.
   */
  @SerializedName("receipt_email")
  Object receiptEmail;

  /**
   * Indicates that you intend to make future payments with this PaymentIntent's payment method.
   *
   * <p>Providing this parameter will <a
   * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a> to
   * the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any required
   * actions from the user are complete. If no Customer was provided, the payment method can still
   * be <a href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
   * after the transaction completes.
   *
   * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to dynamically
   * optimize your payment flow and comply with regional legislation and network rules, such as <a
   * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
   *
   * <p>If {@code setup_future_usage} is already set and you are performing a request using a
   * publishable key, you may only update the value from {@code on_session} to {@code off_session}.
   */
  @SerializedName("setup_future_usage")
  ApiRequestParams.EnumParam setupFutureUsage;

  /** Shipping information for this PaymentIntent. */
  @SerializedName("shipping")
  Object shipping;

  /**
   * For non-card charges, you can use this value as the complete description that appears on your
   * customers’ statements. Must contain at least one letter, maximum 22 characters.
   */
  @SerializedName("statement_descriptor")
  Object statementDescriptor;

  /**
   * Provides information about a card payment that customers see on their statements. Concatenated
   * with the prefix (shortened descriptor) or statement descriptor that’s set on the account to
   * form the complete statement descriptor. Maximum 22 characters for the concatenated descriptor.
   */
  @SerializedName("statement_descriptor_suffix")
  Object statementDescriptorSuffix;

  /**
   * The parameters used to automatically create a Transfer when the payment succeeds. For more
   * information, see the PaymentIntents <a
   * href="https://stripe.com/docs/payments/connected-accounts">use case for connected accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies the resulting payment as part of a group. {@code transfer_group} may
   * only be provided if it has not been set. See the PaymentIntents <a
   * href="https://stripe.com/docs/payments/connected-accounts">use case for connected accounts</a>
   * for details.
   */
  @SerializedName("transfer_group")
  Object transferGroup;

  private PaymentIntentUpdateParams(
      Long amount,
      Object applicationFeeAmount,
      CaptureMethod captureMethod,
      Object currency,
      Object customer,
      Object description,
      List<String> expand,
      Map<String, Object> extraParams,
      MandateDataPublishableKey mandateData,
      Object metadata,
      Object paymentMethod,
      PaymentMethodData paymentMethodData,
      PaymentMethodOptions paymentMethodOptions,
      List<String> paymentMethodTypes,
      Object receiptEmail,
      ApiRequestParams.EnumParam setupFutureUsage,
      Object shipping,
      Object statementDescriptor,
      Object statementDescriptorSuffix,
      TransferData transferData,
      Object transferGroup) {
    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.captureMethod = captureMethod;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.mandateData = mandateData;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodData = paymentMethodData;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentMethodTypes = paymentMethodTypes;
    this.receiptEmail = receiptEmail;
    this.setupFutureUsage = setupFutureUsage;
    this.shipping = shipping;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.transferData = transferData;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Object applicationFeeAmount;

    private CaptureMethod captureMethod;

    private Object currency;

    private Object customer;

    private Object description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private MandateDataPublishableKey mandateData;

    private Object metadata;

    private Object paymentMethod;

    private PaymentMethodData paymentMethodData;

    private PaymentMethodOptions paymentMethodOptions;

    private List<String> paymentMethodTypes;

    private Object receiptEmail;

    private ApiRequestParams.EnumParam setupFutureUsage;

    private Object shipping;

    private Object statementDescriptor;

    private Object statementDescriptorSuffix;

    private TransferData transferData;

    private Object transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentUpdateParams build() {
      return new PaymentIntentUpdateParams(
          this.amount,
          this.applicationFeeAmount,
          this.captureMethod,
          this.currency,
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.mandateData,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodData,
          this.paymentMethodOptions,
          this.paymentMethodTypes,
          this.receiptEmail,
          this.setupFutureUsage,
          this.shipping,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData,
          this.transferGroup);
    }

    /**
     * Amount intended to be collected by this PaymentIntent. A positive integer representing how
     * much to charge in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
     * currency unit</a> (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal
     * currency). The minimum amount is $0.50 US or <a
     * href="https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts">equivalent in
     * charge currency</a>. The amount value supports up to eight digits (e.g., a value of 99999999
     * for a USD charge of $999,999.99).
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. The amount of the
     * application fee collected will be capped at the total payment amount. For more information,
     * see the PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case
     * for connected accounts</a>.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. The amount of the
     * application fee collected will be capped at the total payment amount. For more information,
     * see the PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case
     * for connected accounts</a>.
     */
    public Builder setApplicationFeeAmount(EmptyParam applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /** Controls when the funds will be captured from the customer's account. */
    public Builder setCaptureMethod(PaymentIntentUpdateParams.CaptureMethod captureMethod) {
      this.captureMethod = captureMethod;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(EmptyParam currency) {
      this.currency = currency;
      return this;
    }

    /**
     * ID of the Customer this PaymentIntent belongs to, if one exists.
     *
     * <p>Payment methods attached to other Customers cannot be used with this PaymentIntent.
     *
     * <p>If present in combination with <a
     * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>,
     * this PaymentIntent's payment method will be attached to the Customer after the PaymentIntent
     * has been confirmed and any required actions from the user are complete.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * ID of the Customer this PaymentIntent belongs to, if one exists.
     *
     * <p>Payment methods attached to other Customers cannot be used with this PaymentIntent.
     *
     * <p>If present in combination with <a
     * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>,
     * this PaymentIntent's payment method will be attached to the Customer after the PaymentIntent
     * has been confirmed and any required actions from the user are complete.
     */
    public Builder setCustomer(EmptyParam customer) {
      this.customer = customer;
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
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentUpdateParams#expand} for the field documentation.
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
     * PaymentIntentUpdateParams#expand} for the field documentation.
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
     * PaymentIntentUpdateParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** This hash contains details about the Mandate to create. */
    public Builder setMandateData(PaymentIntentUpdateParams.MandateDataPublishableKey mandateData) {
      this.mandateData = mandateData;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentUpdateParams#metadata} for the field documentation.
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
     * See {@link PaymentIntentUpdateParams#metadata} for the field documentation.
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
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or <a
     * href="https://stripe.com/docs/payments/payment-methods/transitioning#compatibility">compatible
     * Source</a> object) to attach to this PaymentIntent.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or <a
     * href="https://stripe.com/docs/payments/payment-methods/transitioning#compatibility">compatible
     * Source</a> object) to attach to this PaymentIntent.
     */
    public Builder setPaymentMethod(EmptyParam paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will
     * appear in the <a
     * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-payment_method">payment_method</a>
     * property on the PaymentIntent.
     */
    public Builder setPaymentMethodData(
        PaymentIntentUpdateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** Payment-method-specific configuration for this PaymentIntent. */
    public Builder setPaymentMethodOptions(
        PaymentIntentUpdateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentUpdateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addPaymentMethodType(String element) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PaymentIntentUpdateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addAllPaymentMethodType(List<String> elements) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(elements);
      return this;
    }

    /**
     * Email address that the receipt for the resulting payment will be sent to. If {@code
     * receipt_email} is specified for a payment in live mode, a receipt will be sent regardless of
     * your <a href="https://dashboard.stripe.com/account/emails">email settings</a>.
     */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * Email address that the receipt for the resulting payment will be sent to. If {@code
     * receipt_email} is specified for a payment in live mode, a receipt will be sent regardless of
     * your <a href="https://dashboard.stripe.com/account/emails">email settings</a>.
     */
    public Builder setReceiptEmail(EmptyParam receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>Providing this parameter will <a
     * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a> to
     * the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
     * required actions from the user are complete. If no Customer was provided, the payment method
     * can still be <a href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a
     * Customer after the transaction completes.
     *
     * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to dynamically
     * optimize your payment flow and comply with regional legislation and network rules, such as <a
     * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
     *
     * <p>If {@code setup_future_usage} is already set and you are performing a request using a
     * publishable key, you may only update the value from {@code on_session} to {@code
     * off_session}.
     */
    public Builder setSetupFutureUsage(
        PaymentIntentUpdateParams.SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>Providing this parameter will <a
     * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a> to
     * the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
     * required actions from the user are complete. If no Customer was provided, the payment method
     * can still be <a href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a
     * Customer after the transaction completes.
     *
     * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to dynamically
     * optimize your payment flow and comply with regional legislation and network rules, such as <a
     * href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
     *
     * <p>If {@code setup_future_usage} is already set and you are performing a request using a
     * publishable key, you may only update the value from {@code on_session} to {@code
     * off_session}.
     */
    public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(PaymentIntentUpdateParams.Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(EmptyParam shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * For non-card charges, you can use this value as the complete description that appears on your
     * customers’ statements. Must contain at least one letter, maximum 22 characters.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * For non-card charges, you can use this value as the complete description that appears on your
     * customers’ statements. Must contain at least one letter, maximum 22 characters.
     */
    public Builder setStatementDescriptor(EmptyParam statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Provides information about a card payment that customers see on their statements.
     * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on the
     * account to form the complete statement descriptor. Maximum 22 characters for the concatenated
     * descriptor.
     */
    public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /**
     * Provides information about a card payment that customers see on their statements.
     * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s set on the
     * account to form the complete statement descriptor. Maximum 22 characters for the concatenated
     * descriptor.
     */
    public Builder setStatementDescriptorSuffix(EmptyParam statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /**
     * The parameters used to automatically create a Transfer when the payment succeeds. For more
     * information, see the PaymentIntents <a
     * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a>.
     */
    public Builder setTransferData(PaymentIntentUpdateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. {@code transfer_group} may
     * only be provided if it has not been set. See the PaymentIntents <a
     * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a> for details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. {@code transfer_group} may
     * only be provided if it has not been set. See the PaymentIntents <a
     * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a> for details.
     */
    public Builder setTransferGroup(EmptyParam transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  @Getter
  public static class MandateDataPublishableKey {
    /**
     * <strong>Required.</strong> This hash contains details about the customer acceptance of the
     * Mandate.
     */
    @SerializedName("customer_acceptance")
    CustomerAcceptance customerAcceptance;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private MandateDataPublishableKey(
        CustomerAcceptance customerAcceptance, Map<String, Object> extraParams) {
      this.customerAcceptance = customerAcceptance;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CustomerAcceptance customerAcceptance;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentUpdateParams.MandateDataPublishableKey build() {
        return new PaymentIntentUpdateParams.MandateDataPublishableKey(
            this.customerAcceptance, this.extraParams);
      }

      /**
       * <strong>Required.</strong> This hash contains details about the customer acceptance of the
       * Mandate.
       */
      public Builder setCustomerAcceptance(
          PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance
              customerAcceptance) {
        this.customerAcceptance = customerAcceptance;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentUpdateParams.MandateDataPublishableKey#extraParams} for the field
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
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentIntentUpdateParams.MandateDataPublishableKey#extraParams} for the field
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

    @Getter
    public static class CustomerAcceptance {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> If this is a Mandate accepted online, this hash contains details
       * about the online acceptance.
       */
      @SerializedName("online")
      Online online;

      /**
       * <strong>Required.</strong> The type of customer acceptance information included with the
       * Mandate.
       */
      @SerializedName("type")
      Type type;

      private CustomerAcceptance(Map<String, Object> extraParams, Online online, Type type) {
        this.extraParams = extraParams;
        this.online = online;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Online online;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance build() {
          return new PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance(
              this.extraParams, this.online, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance#extraParams} for
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
         * PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance#extraParams} for
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
         * <strong>Required.</strong> If this is a Mandate accepted online, this hash contains
         * details about the online acceptance.
         */
        public Builder setOnline(
            PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance.Online online) {
          this.online = online;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of customer acceptance information included with the
         * Mandate.
         */
        public Builder setType(
            PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Online {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the Mandate was accepted by the customer. */
        @SerializedName("ip_address")
        Object ipAddress;

        /** The user agent of the browser from which the Mandate was accepted by the customer. */
        @SerializedName("user_agent")
        Object userAgent;

        private Online(Map<String, Object> extraParams, Object ipAddress, Object userAgent) {
          this.extraParams = extraParams;
          this.ipAddress = ipAddress;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object ipAddress;

          private Object userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance.Online
              build() {
            return new PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance
                .Online(this.extraParams, this.ipAddress, this.userAgent);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance.Online#extraParams}
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
           * map. See {@link
           * PaymentIntentUpdateParams.MandateDataPublishableKey.CustomerAcceptance.Online#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the Mandate was accepted by the customer. */
          public Builder setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
          }

          /** The IP address from which the Mandate was accepted by the customer. */
          public Builder setIpAddress(EmptyParam ipAddress) {
            this.ipAddress = ipAddress;
            return this;
          }

          /** The user agent of the browser from which the Mandate was accepted by the customer. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }

          /** The user agent of the browser from which the Mandate was accepted by the customer. */
          public Builder setUserAgent(EmptyParam userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("online")
        ONLINE("online");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class PaymentMethodData {
    /**
     * If this is an {@code acss_debit} PaymentMethod, this hash contains details about the ACSS
     * Debit payment method.
     */
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    /**
     * If this is an {@code affirm} PaymentMethod, this hash contains details about the Affirm
     * payment method.
     */
    @SerializedName("affirm")
    Affirm affirm;

    /**
     * If this is an {@code AfterpayClearpay} PaymentMethod, this hash contains details about the
     * AfterpayClearpay payment method.
     */
    @SerializedName("afterpay_clearpay")
    AfterpayClearpay afterpayClearpay;

    /**
     * If this is an {@code Alipay} PaymentMethod, this hash contains details about the Alipay
     * payment method.
     */
    @SerializedName("alipay")
    Alipay alipay;

    /**
     * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the bank
     * account.
     */
    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    /**
     * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs
     * Direct Debit bank account.
     */
    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    /**
     * If this is a {@code bancontact} PaymentMethod, this hash contains details about the
     * Bancontact payment method.
     */
    @SerializedName("bancontact")
    Bancontact bancontact;

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /**
     * If this is a {@code blik} PaymentMethod, this hash contains details about the BLIK payment
     * method.
     */
    @SerializedName("blik")
    Blik blik;

    /**
     * If this is a {@code boleto} PaymentMethod, this hash contains details about the Boleto
     * payment method.
     */
    @SerializedName("boleto")
    Boleto boleto;

    /**
     * If this is a {@code cashapp} PaymentMethod, this hash contains details about the Cash App Pay
     * payment method.
     */
    @SerializedName("cashapp")
    Cashapp cashapp;

    /**
     * If this is a {@code customer_balance} PaymentMethod, this hash contains details about the
     * CustomerBalance payment method.
     */
    @SerializedName("customer_balance")
    CustomerBalance customerBalance;

    /**
     * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
     * method.
     */
    @SerializedName("eps")
    Eps eps;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If this is an {@code fpx} PaymentMethod, this hash contains details about the FPX payment
     * method.
     */
    @SerializedName("fpx")
    Fpx fpx;

    /**
     * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
     * payment method.
     */
    @SerializedName("giropay")
    Giropay giropay;

    /**
     * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
     * payment method.
     */
    @SerializedName("grabpay")
    Grabpay grabpay;

    /**
     * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL payment
     * method.
     */
    @SerializedName("ideal")
    Ideal ideal;

    /**
     * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
     * Interac Present payment method.
     */
    @SerializedName("interac_present")
    InteracPresent interacPresent;

    /**
     * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
     * payment method.
     */
    @SerializedName("klarna")
    Klarna klarna;

    /**
     * If this is a {@code konbini} PaymentMethod, this hash contains details about the Konbini
     * payment method.
     */
    @SerializedName("konbini")
    Konbini konbini;

    /**
     * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
     * method.
     */
    @SerializedName("link")
    Link link;

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * If this is an {@code oxxo} PaymentMethod, this hash contains details about the OXXO payment
     * method.
     */
    @SerializedName("oxxo")
    Oxxo oxxo;

    /**
     * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
     * method.
     */
    @SerializedName("p24")
    P24 p24;

    /**
     * If this is a {@code paynow} PaymentMethod, this hash contains details about the PayNow
     * payment method.
     */
    @SerializedName("paynow")
    Paynow paynow;

    /**
     * If this is a {@code paypal} PaymentMethod, this hash contains details about the PayPal
     * payment method.
     */
    @SerializedName("paypal")
    Paypal paypal;

    /**
     * If this is a {@code pix} PaymentMethod, this hash contains details about the Pix payment
     * method.
     */
    @SerializedName("pix")
    Pix pix;

    /**
     * If this is a {@code promptpay} PaymentMethod, this hash contains details about the PromptPay
     * payment method.
     */
    @SerializedName("promptpay")
    Promptpay promptpay;

    /**
     * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
     * Session</a> for more information.
     */
    @SerializedName("radar_options")
    RadarOptions radarOptions;

    /**
     * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA
     * debit bank account.
     */
    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    /**
     * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT
     * payment method.
     */
    @SerializedName("sofort")
    Sofort sofort;

    /**
     * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
     * the PaymentMethod with a name matching this value. It contains additional information
     * specific to the PaymentMethod type.
     */
    @SerializedName("type")
    Type type;

    /**
     * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the US
     * bank account payment method.
     */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * If this is an {@code wechat_pay} PaymentMethod, this hash contains details about the
     * wechat_pay payment method.
     */
    @SerializedName("wechat_pay")
    WechatPay wechatPay;

    /**
     * If this is a {@code zip} PaymentMethod, this hash contains details about the Zip payment
     * method.
     */
    @SerializedName("zip")
    Zip zip;

    private PaymentMethodData(
        AcssDebit acssDebit,
        Affirm affirm,
        AfterpayClearpay afterpayClearpay,
        Alipay alipay,
        AuBecsDebit auBecsDebit,
        BacsDebit bacsDebit,
        Bancontact bancontact,
        BillingDetails billingDetails,
        Blik blik,
        Boleto boleto,
        Cashapp cashapp,
        CustomerBalance customerBalance,
        Eps eps,
        Map<String, Object> extraParams,
        Fpx fpx,
        Giropay giropay,
        Grabpay grabpay,
        Ideal ideal,
        InteracPresent interacPresent,
        Klarna klarna,
        Konbini konbini,
        Link link,
        Map<String, String> metadata,
        Oxxo oxxo,
        P24 p24,
        Paynow paynow,
        Paypal paypal,
        Pix pix,
        Promptpay promptpay,
        RadarOptions radarOptions,
        SepaDebit sepaDebit,
        Sofort sofort,
        Type type,
        UsBankAccount usBankAccount,
        WechatPay wechatPay,
        Zip zip) {
      this.acssDebit = acssDebit;
      this.affirm = affirm;
      this.afterpayClearpay = afterpayClearpay;
      this.alipay = alipay;
      this.auBecsDebit = auBecsDebit;
      this.bacsDebit = bacsDebit;
      this.bancontact = bancontact;
      this.billingDetails = billingDetails;
      this.blik = blik;
      this.boleto = boleto;
      this.cashapp = cashapp;
      this.customerBalance = customerBalance;
      this.eps = eps;
      this.extraParams = extraParams;
      this.fpx = fpx;
      this.giropay = giropay;
      this.grabpay = grabpay;
      this.ideal = ideal;
      this.interacPresent = interacPresent;
      this.klarna = klarna;
      this.konbini = konbini;
      this.link = link;
      this.metadata = metadata;
      this.oxxo = oxxo;
      this.p24 = p24;
      this.paynow = paynow;
      this.paypal = paypal;
      this.pix = pix;
      this.promptpay = promptpay;
      this.radarOptions = radarOptions;
      this.sepaDebit = sepaDebit;
      this.sofort = sofort;
      this.type = type;
      this.usBankAccount = usBankAccount;
      this.wechatPay = wechatPay;
      this.zip = zip;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AcssDebit acssDebit;

      private Affirm affirm;

      private AfterpayClearpay afterpayClearpay;

      private Alipay alipay;

      private AuBecsDebit auBecsDebit;

      private BacsDebit bacsDebit;

      private Bancontact bancontact;

      private BillingDetails billingDetails;

      private Blik blik;

      private Boleto boleto;

      private Cashapp cashapp;

      private CustomerBalance customerBalance;

      private Eps eps;

      private Map<String, Object> extraParams;

      private Fpx fpx;

      private Giropay giropay;

      private Grabpay grabpay;

      private Ideal ideal;

      private InteracPresent interacPresent;

      private Klarna klarna;

      private Konbini konbini;

      private Link link;

      private Map<String, String> metadata;

      private Oxxo oxxo;

      private P24 p24;

      private Paynow paynow;

      private Paypal paypal;

      private Pix pix;

      private Promptpay promptpay;

      private RadarOptions radarOptions;

      private SepaDebit sepaDebit;

      private Sofort sofort;

      private Type type;

      private UsBankAccount usBankAccount;

      private WechatPay wechatPay;

      private Zip zip;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentUpdateParams.PaymentMethodData build() {
        return new PaymentIntentUpdateParams.PaymentMethodData(
            this.acssDebit,
            this.affirm,
            this.afterpayClearpay,
            this.alipay,
            this.auBecsDebit,
            this.bacsDebit,
            this.bancontact,
            this.billingDetails,
            this.blik,
            this.boleto,
            this.cashapp,
            this.customerBalance,
            this.eps,
            this.extraParams,
            this.fpx,
            this.giropay,
            this.grabpay,
            this.ideal,
            this.interacPresent,
            this.klarna,
            this.konbini,
            this.link,
            this.metadata,
            this.oxxo,
            this.p24,
            this.paynow,
            this.paypal,
            this.pix,
            this.promptpay,
            this.radarOptions,
            this.sepaDebit,
            this.sofort,
            this.type,
            this.usBankAccount,
            this.wechatPay,
            this.zip);
      }

      /**
       * If this is an {@code acss_debit} PaymentMethod, this hash contains details about the ACSS
       * Debit payment method.
       */
      public Builder setAcssDebit(PaymentIntentUpdateParams.PaymentMethodData.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /**
       * If this is an {@code affirm} PaymentMethod, this hash contains details about the Affirm
       * payment method.
       */
      public Builder setAffirm(PaymentIntentUpdateParams.PaymentMethodData.Affirm affirm) {
        this.affirm = affirm;
        return this;
      }

      /**
       * If this is an {@code AfterpayClearpay} PaymentMethod, this hash contains details about the
       * AfterpayClearpay payment method.
       */
      public Builder setAfterpayClearpay(
          PaymentIntentUpdateParams.PaymentMethodData.AfterpayClearpay afterpayClearpay) {
        this.afterpayClearpay = afterpayClearpay;
        return this;
      }

      /**
       * If this is an {@code Alipay} PaymentMethod, this hash contains details about the Alipay
       * payment method.
       */
      public Builder setAlipay(PaymentIntentUpdateParams.PaymentMethodData.Alipay alipay) {
        this.alipay = alipay;
        return this;
      }

      /**
       * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the
       * bank account.
       */
      public Builder setAuBecsDebit(
          PaymentIntentUpdateParams.PaymentMethodData.AuBecsDebit auBecsDebit) {
        this.auBecsDebit = auBecsDebit;
        return this;
      }

      /**
       * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs
       * Direct Debit bank account.
       */
      public Builder setBacsDebit(PaymentIntentUpdateParams.PaymentMethodData.BacsDebit bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /**
       * If this is a {@code bancontact} PaymentMethod, this hash contains details about the
       * Bancontact payment method.
       */
      public Builder setBancontact(
          PaymentIntentUpdateParams.PaymentMethodData.Bancontact bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /**
       * Billing information associated with the PaymentMethod that may be used or required by
       * particular types of payment methods.
       */
      public Builder setBillingDetails(
          PaymentIntentUpdateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /**
       * If this is a {@code blik} PaymentMethod, this hash contains details about the BLIK payment
       * method.
       */
      public Builder setBlik(PaymentIntentUpdateParams.PaymentMethodData.Blik blik) {
        this.blik = blik;
        return this;
      }

      /**
       * If this is a {@code boleto} PaymentMethod, this hash contains details about the Boleto
       * payment method.
       */
      public Builder setBoleto(PaymentIntentUpdateParams.PaymentMethodData.Boleto boleto) {
        this.boleto = boleto;
        return this;
      }

      /**
       * If this is a {@code cashapp} PaymentMethod, this hash contains details about the Cash App
       * Pay payment method.
       */
      public Builder setCashapp(PaymentIntentUpdateParams.PaymentMethodData.Cashapp cashapp) {
        this.cashapp = cashapp;
        return this;
      }

      /**
       * If this is a {@code customer_balance} PaymentMethod, this hash contains details about the
       * CustomerBalance payment method.
       */
      public Builder setCustomerBalance(
          PaymentIntentUpdateParams.PaymentMethodData.CustomerBalance customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /**
       * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
       * method.
       */
      public Builder setEps(PaymentIntentUpdateParams.PaymentMethodData.Eps eps) {
        this.eps = eps;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentUpdateParams.PaymentMethodData#extraParams} for the field documentation.
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
       * See {@link PaymentIntentUpdateParams.PaymentMethodData#extraParams} for the field
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
       * If this is an {@code fpx} PaymentMethod, this hash contains details about the FPX payment
       * method.
       */
      public Builder setFpx(PaymentIntentUpdateParams.PaymentMethodData.Fpx fpx) {
        this.fpx = fpx;
        return this;
      }

      /**
       * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
       * payment method.
       */
      public Builder setGiropay(PaymentIntentUpdateParams.PaymentMethodData.Giropay giropay) {
        this.giropay = giropay;
        return this;
      }

      /**
       * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
       * payment method.
       */
      public Builder setGrabpay(PaymentIntentUpdateParams.PaymentMethodData.Grabpay grabpay) {
        this.grabpay = grabpay;
        return this;
      }

      /**
       * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL
       * payment method.
       */
      public Builder setIdeal(PaymentIntentUpdateParams.PaymentMethodData.Ideal ideal) {
        this.ideal = ideal;
        return this;
      }

      /**
       * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
       * Interac Present payment method.
       */
      public Builder setInteracPresent(
          PaymentIntentUpdateParams.PaymentMethodData.InteracPresent interacPresent) {
        this.interacPresent = interacPresent;
        return this;
      }

      /**
       * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
       * payment method.
       */
      public Builder setKlarna(PaymentIntentUpdateParams.PaymentMethodData.Klarna klarna) {
        this.klarna = klarna;
        return this;
      }

      /**
       * If this is a {@code konbini} PaymentMethod, this hash contains details about the Konbini
       * payment method.
       */
      public Builder setKonbini(PaymentIntentUpdateParams.PaymentMethodData.Konbini konbini) {
        this.konbini = konbini;
        return this;
      }

      /**
       * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
       * method.
       */
      public Builder setLink(PaymentIntentUpdateParams.PaymentMethodData.Link link) {
        this.link = link;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentUpdateParams.PaymentMethodData#metadata} for the field documentation.
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
       * See {@link PaymentIntentUpdateParams.PaymentMethodData#metadata} for the field
       * documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /**
       * If this is an {@code oxxo} PaymentMethod, this hash contains details about the OXXO payment
       * method.
       */
      public Builder setOxxo(PaymentIntentUpdateParams.PaymentMethodData.Oxxo oxxo) {
        this.oxxo = oxxo;
        return this;
      }

      /**
       * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
       * method.
       */
      public Builder setP24(PaymentIntentUpdateParams.PaymentMethodData.P24 p24) {
        this.p24 = p24;
        return this;
      }

      /**
       * If this is a {@code paynow} PaymentMethod, this hash contains details about the PayNow
       * payment method.
       */
      public Builder setPaynow(PaymentIntentUpdateParams.PaymentMethodData.Paynow paynow) {
        this.paynow = paynow;
        return this;
      }

      /**
       * If this is a {@code paypal} PaymentMethod, this hash contains details about the PayPal
       * payment method.
       */
      public Builder setPaypal(PaymentIntentUpdateParams.PaymentMethodData.Paypal paypal) {
        this.paypal = paypal;
        return this;
      }

      /**
       * If this is a {@code pix} PaymentMethod, this hash contains details about the Pix payment
       * method.
       */
      public Builder setPix(PaymentIntentUpdateParams.PaymentMethodData.Pix pix) {
        this.pix = pix;
        return this;
      }

      /**
       * If this is a {@code promptpay} PaymentMethod, this hash contains details about the
       * PromptPay payment method.
       */
      public Builder setPromptpay(PaymentIntentUpdateParams.PaymentMethodData.Promptpay promptpay) {
        this.promptpay = promptpay;
        return this;
      }

      /**
       * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
       * Session</a> for more information.
       */
      public Builder setRadarOptions(
          PaymentIntentUpdateParams.PaymentMethodData.RadarOptions radarOptions) {
        this.radarOptions = radarOptions;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA
       * debit bank account.
       */
      public Builder setSepaDebit(PaymentIntentUpdateParams.PaymentMethodData.SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /**
       * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT
       * payment method.
       */
      public Builder setSofort(PaymentIntentUpdateParams.PaymentMethodData.Sofort sofort) {
        this.sofort = sofort;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(PaymentIntentUpdateParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }

      /**
       * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the
       * US bank account payment method.
       */
      public Builder setUsBankAccount(
          PaymentIntentUpdateParams.PaymentMethodData.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /**
       * If this is an {@code wechat_pay} PaymentMethod, this hash contains details about the
       * wechat_pay payment method.
       */
      public Builder setWechatPay(PaymentIntentUpdateParams.PaymentMethodData.WechatPay wechatPay) {
        this.wechatPay = wechatPay;
        return this;
      }

      /**
       * If this is a {@code zip} PaymentMethod, this hash contains details about the Zip payment
       * method.
       */
      public Builder setZip(PaymentIntentUpdateParams.PaymentMethodData.Zip zip) {
        this.zip = zip;
        return this;
      }
    }

    @Getter
    public static class AcssDebit {
      /** <strong>Required.</strong> Customer's bank account number. */
      @SerializedName("account_number")
      Object accountNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Institution number of the customer's bank. */
      @SerializedName("institution_number")
      Object institutionNumber;

      /** <strong>Required.</strong> Transit number of the customer's bank. */
      @SerializedName("transit_number")
      Object transitNumber;

      private AcssDebit(
          Object accountNumber,
          Map<String, Object> extraParams,
          Object institutionNumber,
          Object transitNumber) {
        this.accountNumber = accountNumber;
        this.extraParams = extraParams;
        this.institutionNumber = institutionNumber;
        this.transitNumber = transitNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountNumber;

        private Map<String, Object> extraParams;

        private Object institutionNumber;

        private Object transitNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.AcssDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.AcssDebit(
              this.accountNumber, this.extraParams, this.institutionNumber, this.transitNumber);
        }

        /** <strong>Required.</strong> Customer's bank account number. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** <strong>Required.</strong> Customer's bank account number. */
        public Builder setAccountNumber(EmptyParam accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.AcssDebit#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.AcssDebit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Institution number of the customer's bank. */
        public Builder setInstitutionNumber(String institutionNumber) {
          this.institutionNumber = institutionNumber;
          return this;
        }

        /** <strong>Required.</strong> Institution number of the customer's bank. */
        public Builder setInstitutionNumber(EmptyParam institutionNumber) {
          this.institutionNumber = institutionNumber;
          return this;
        }

        /** <strong>Required.</strong> Transit number of the customer's bank. */
        public Builder setTransitNumber(String transitNumber) {
          this.transitNumber = transitNumber;
          return this;
        }

        /** <strong>Required.</strong> Transit number of the customer's bank. */
        public Builder setTransitNumber(EmptyParam transitNumber) {
          this.transitNumber = transitNumber;
          return this;
        }
      }
    }

    @Getter
    public static class Affirm {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Affirm(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Affirm build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Affirm(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Affirm#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Affirm#extraParams} for the
         * field documentation.
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
    public static class AfterpayClearpay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AfterpayClearpay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.AfterpayClearpay build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.AfterpayClearpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.AfterpayClearpay#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.AfterpayClearpay#extraParams}
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
    public static class Alipay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Alipay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Alipay build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Alipay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Alipay#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Alipay#extraParams} for the
         * field documentation.
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
    public static class AuBecsDebit {
      /** <strong>Required.</strong> The account number for the bank account. */
      @SerializedName("account_number")
      Object accountNumber;

      /** <strong>Required.</strong> Bank-State-Branch number of the bank account. */
      @SerializedName("bsb_number")
      Object bsbNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AuBecsDebit(Object accountNumber, Object bsbNumber, Map<String, Object> extraParams) {
        this.accountNumber = accountNumber;
        this.bsbNumber = bsbNumber;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountNumber;

        private Object bsbNumber;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.AuBecsDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.AuBecsDebit(
              this.accountNumber, this.bsbNumber, this.extraParams);
        }

        /** <strong>Required.</strong> The account number for the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** <strong>Required.</strong> The account number for the bank account. */
        public Builder setAccountNumber(EmptyParam accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** <strong>Required.</strong> Bank-State-Branch number of the bank account. */
        public Builder setBsbNumber(String bsbNumber) {
          this.bsbNumber = bsbNumber;
          return this;
        }

        /** <strong>Required.</strong> Bank-State-Branch number of the bank account. */
        public Builder setBsbNumber(EmptyParam bsbNumber) {
          this.bsbNumber = bsbNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.AuBecsDebit#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.AuBecsDebit#extraParams} for
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
    }

    @Getter
    public static class BacsDebit {
      /** Account number of the bank account that the funds will be debited from. */
      @SerializedName("account_number")
      Object accountNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
      @SerializedName("sort_code")
      Object sortCode;

      private BacsDebit(Object accountNumber, Map<String, Object> extraParams, Object sortCode) {
        this.accountNumber = accountNumber;
        this.extraParams = extraParams;
        this.sortCode = sortCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountNumber;

        private Map<String, Object> extraParams;

        private Object sortCode;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.BacsDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.BacsDebit(
              this.accountNumber, this.extraParams, this.sortCode);
        }

        /** Account number of the bank account that the funds will be debited from. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Account number of the bank account that the funds will be debited from. */
        public Builder setAccountNumber(EmptyParam accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.BacsDebit#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.BacsDebit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
        public Builder setSortCode(String sortCode) {
          this.sortCode = sortCode;
          return this;
        }

        /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
        public Builder setSortCode(EmptyParam sortCode) {
          this.sortCode = sortCode;
          return this;
        }
      }
    }

    @Getter
    public static class Bancontact {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Bancontact(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Bancontact build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Bancontact(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Bancontact#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Bancontact#extraParams} for
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
    }

    @Getter
    public static class BillingDetails {
      /** Billing address. */
      @SerializedName("address")
      Object address;

      /** Email address. */
      @SerializedName("email")
      Object email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Full name. */
      @SerializedName("name")
      Object name;

      /** Billing phone number (including extension). */
      @SerializedName("phone")
      Object phone;

      private BillingDetails(
          Object address,
          Object email,
          Map<String, Object> extraParams,
          Object name,
          Object phone) {
        this.address = address;
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object address;

        private Object email;

        private Map<String, Object> extraParams;

        private Object name;

        private Object phone;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.BillingDetails build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** Billing address. */
        public Builder setAddress(
            PaymentIntentUpdateParams.PaymentMethodData.BillingDetails.Address address) {
          this.address = address;
          return this;
        }

        /** Billing address. */
        public Builder setAddress(EmptyParam address) {
          this.address = address;
          return this;
        }

        /** Email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /** Email address. */
        public Builder setEmail(EmptyParam email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.BillingDetails#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.BillingDetails#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Full name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Full name. */
        public Builder setName(EmptyParam name) {
          this.name = name;
          return this;
        }

        /** Billing phone number (including extension). */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /** Billing phone number (including extension). */
        public Builder setPhone(EmptyParam phone) {
          this.phone = phone;
          return this;
        }
      }

      @Getter
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        Object city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        Object country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        Object line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        Object state;

        private Address(
            Object city,
            Object country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object city;

          private Object country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodData.BillingDetails.Address build() {
            return new PaymentIntentUpdateParams.PaymentMethodData.BillingDetails.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(EmptyParam city) {
            this.city = city;
            return this;
          }

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(EmptyParam country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodData.BillingDetails.Address#extraParams} for the
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
           * PaymentIntentUpdateParams.PaymentMethodData.BillingDetails.Address#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(EmptyParam line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(EmptyParam postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(EmptyParam state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    public static class Blik {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Blik(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Blik build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Blik(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Blik#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Blik#extraParams} for the
         * field documentation.
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
    public static class Boleto {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The tax ID of the customer (CPF for individual consumers or CNPJ
       * for businesses consumers)
       */
      @SerializedName("tax_id")
      Object taxId;

      private Boleto(Map<String, Object> extraParams, Object taxId) {
        this.extraParams = extraParams;
        this.taxId = taxId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object taxId;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Boleto build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Boleto(
              this.extraParams, this.taxId);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Boleto#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Boleto#extraParams} for the
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
         * <strong>Required.</strong> The tax ID of the customer (CPF for individual consumers or
         * CNPJ for businesses consumers)
         */
        public Builder setTaxId(String taxId) {
          this.taxId = taxId;
          return this;
        }

        /**
         * <strong>Required.</strong> The tax ID of the customer (CPF for individual consumers or
         * CNPJ for businesses consumers)
         */
        public Builder setTaxId(EmptyParam taxId) {
          this.taxId = taxId;
          return this;
        }
      }
    }

    @Getter
    public static class Cashapp {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Cashapp(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Cashapp build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Cashapp(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Cashapp#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Cashapp#extraParams} for the
         * field documentation.
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
    public static class CustomerBalance {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CustomerBalance(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.CustomerBalance build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.CustomerBalance(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.CustomerBalance#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.CustomerBalance#extraParams}
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
    public static class Eps {
      /** The customer's bank. */
      @SerializedName("bank")
      Bank bank;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Eps(Bank bank, Map<String, Object> extraParams) {
        this.bank = bank;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Bank bank;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Eps build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Eps(this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(PaymentIntentUpdateParams.PaymentMethodData.Eps.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Eps#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Eps#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public enum Bank implements ApiRequestParams.EnumParam {
        @SerializedName("arzte_und_apotheker_bank")
        ARZTE_UND_APOTHEKER_BANK("arzte_und_apotheker_bank"),

        @SerializedName("austrian_anadi_bank_ag")
        AUSTRIAN_ANADI_BANK_AG("austrian_anadi_bank_ag"),

        @SerializedName("bank_austria")
        BANK_AUSTRIA("bank_austria"),

        @SerializedName("bankhaus_carl_spangler")
        BANKHAUS_CARL_SPANGLER("bankhaus_carl_spangler"),

        @SerializedName("bankhaus_schelhammer_und_schattera_ag")
        BANKHAUS_SCHELHAMMER_UND_SCHATTERA_AG("bankhaus_schelhammer_und_schattera_ag"),

        @SerializedName("bawag_psk_ag")
        BAWAG_PSK_AG("bawag_psk_ag"),

        @SerializedName("bks_bank_ag")
        BKS_BANK_AG("bks_bank_ag"),

        @SerializedName("brull_kallmus_bank_ag")
        BRULL_KALLMUS_BANK_AG("brull_kallmus_bank_ag"),

        @SerializedName("btv_vier_lander_bank")
        BTV_VIER_LANDER_BANK("btv_vier_lander_bank"),

        @SerializedName("capital_bank_grawe_gruppe_ag")
        CAPITAL_BANK_GRAWE_GRUPPE_AG("capital_bank_grawe_gruppe_ag"),

        @SerializedName("deutsche_bank_ag")
        DEUTSCHE_BANK_AG("deutsche_bank_ag"),

        @SerializedName("dolomitenbank")
        DOLOMITENBANK("dolomitenbank"),

        @SerializedName("easybank_ag")
        EASYBANK_AG("easybank_ag"),

        @SerializedName("erste_bank_und_sparkassen")
        ERSTE_BANK_UND_SPARKASSEN("erste_bank_und_sparkassen"),

        @SerializedName("hypo_alpeadriabank_international_ag")
        HYPO_ALPEADRIABANK_INTERNATIONAL_AG("hypo_alpeadriabank_international_ag"),

        @SerializedName("hypo_bank_burgenland_aktiengesellschaft")
        HYPO_BANK_BURGENLAND_AKTIENGESELLSCHAFT("hypo_bank_burgenland_aktiengesellschaft"),

        @SerializedName("hypo_noe_lb_fur_niederosterreich_u_wien")
        HYPO_NOE_LB_FUR_NIEDEROSTERREICH_U_WIEN("hypo_noe_lb_fur_niederosterreich_u_wien"),

        @SerializedName("hypo_oberosterreich_salzburg_steiermark")
        HYPO_OBEROSTERREICH_SALZBURG_STEIERMARK("hypo_oberosterreich_salzburg_steiermark"),

        @SerializedName("hypo_tirol_bank_ag")
        HYPO_TIROL_BANK_AG("hypo_tirol_bank_ag"),

        @SerializedName("hypo_vorarlberg_bank_ag")
        HYPO_VORARLBERG_BANK_AG("hypo_vorarlberg_bank_ag"),

        @SerializedName("marchfelder_bank")
        MARCHFELDER_BANK("marchfelder_bank"),

        @SerializedName("oberbank_ag")
        OBERBANK_AG("oberbank_ag"),

        @SerializedName("raiffeisen_bankengruppe_osterreich")
        RAIFFEISEN_BANKENGRUPPE_OSTERREICH("raiffeisen_bankengruppe_osterreich"),

        @SerializedName("schoellerbank_ag")
        SCHOELLERBANK_AG("schoellerbank_ag"),

        @SerializedName("sparda_bank_wien")
        SPARDA_BANK_WIEN("sparda_bank_wien"),

        @SerializedName("volksbank_gruppe")
        VOLKSBANK_GRUPPE("volksbank_gruppe"),

        @SerializedName("volkskreditbank_ag")
        VOLKSKREDITBANK_AG("volkskreditbank_ag"),

        @SerializedName("vr_bank_braunau")
        VR_BANK_BRAUNAU("vr_bank_braunau");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Bank(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Fpx {
      /** Account holder type for FPX transaction. */
      @SerializedName("account_holder_type")
      AccountHolderType accountHolderType;

      /** <strong>Required.</strong> The customer's bank. */
      @SerializedName("bank")
      Bank bank;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Fpx(AccountHolderType accountHolderType, Bank bank, Map<String, Object> extraParams) {
        this.accountHolderType = accountHolderType;
        this.bank = bank;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AccountHolderType accountHolderType;

        private Bank bank;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Fpx build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Fpx(
              this.accountHolderType, this.bank, this.extraParams);
        }

        /** Account holder type for FPX transaction. */
        public Builder setAccountHolderType(
            PaymentIntentUpdateParams.PaymentMethodData.Fpx.AccountHolderType accountHolderType) {
          this.accountHolderType = accountHolderType;
          return this;
        }

        /** <strong>Required.</strong> The customer's bank. */
        public Builder setBank(PaymentIntentUpdateParams.PaymentMethodData.Fpx.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Fpx#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Fpx#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public enum AccountHolderType implements ApiRequestParams.EnumParam {
        @SerializedName("company")
        COMPANY("company"),

        @SerializedName("individual")
        INDIVIDUAL("individual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AccountHolderType(String value) {
          this.value = value;
        }
      }

      public enum Bank implements ApiRequestParams.EnumParam {
        @SerializedName("affin_bank")
        AFFIN_BANK("affin_bank"),

        @SerializedName("agrobank")
        AGROBANK("agrobank"),

        @SerializedName("alliance_bank")
        ALLIANCE_BANK("alliance_bank"),

        @SerializedName("ambank")
        AMBANK("ambank"),

        @SerializedName("bank_islam")
        BANK_ISLAM("bank_islam"),

        @SerializedName("bank_muamalat")
        BANK_MUAMALAT("bank_muamalat"),

        @SerializedName("bank_of_china")
        BANK_OF_CHINA("bank_of_china"),

        @SerializedName("bank_rakyat")
        BANK_RAKYAT("bank_rakyat"),

        @SerializedName("bsn")
        BSN("bsn"),

        @SerializedName("cimb")
        CIMB("cimb"),

        @SerializedName("deutsche_bank")
        DEUTSCHE_BANK("deutsche_bank"),

        @SerializedName("hong_leong_bank")
        HONG_LEONG_BANK("hong_leong_bank"),

        @SerializedName("hsbc")
        HSBC("hsbc"),

        @SerializedName("kfh")
        KFH("kfh"),

        @SerializedName("maybank2e")
        MAYBANK2E("maybank2e"),

        @SerializedName("maybank2u")
        MAYBANK2U("maybank2u"),

        @SerializedName("ocbc")
        OCBC("ocbc"),

        @SerializedName("pb_enterprise")
        PB_ENTERPRISE("pb_enterprise"),

        @SerializedName("public_bank")
        PUBLIC_BANK("public_bank"),

        @SerializedName("rhb")
        RHB("rhb"),

        @SerializedName("standard_chartered")
        STANDARD_CHARTERED("standard_chartered"),

        @SerializedName("uob")
        UOB("uob");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Bank(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Giropay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Giropay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Giropay build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Giropay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Giropay#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Giropay#extraParams} for the
         * field documentation.
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
    public static class Grabpay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Grabpay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Grabpay build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Grabpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Grabpay#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Grabpay#extraParams} for the
         * field documentation.
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
    public static class Ideal {
      /** The customer's bank. */
      @SerializedName("bank")
      Bank bank;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Ideal(Bank bank, Map<String, Object> extraParams) {
        this.bank = bank;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Bank bank;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Ideal build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Ideal(this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(PaymentIntentUpdateParams.PaymentMethodData.Ideal.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Ideal#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Ideal#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public enum Bank implements ApiRequestParams.EnumParam {
        @SerializedName("abn_amro")
        ABN_AMRO("abn_amro"),

        @SerializedName("asn_bank")
        ASN_BANK("asn_bank"),

        @SerializedName("bunq")
        BUNQ("bunq"),

        @SerializedName("handelsbanken")
        HANDELSBANKEN("handelsbanken"),

        @SerializedName("ing")
        ING("ing"),

        @SerializedName("knab")
        KNAB("knab"),

        @SerializedName("moneyou")
        MONEYOU("moneyou"),

        @SerializedName("rabobank")
        RABOBANK("rabobank"),

        @SerializedName("regiobank")
        REGIOBANK("regiobank"),

        @SerializedName("revolut")
        REVOLUT("revolut"),

        @SerializedName("sns_bank")
        SNS_BANK("sns_bank"),

        @SerializedName("triodos_bank")
        TRIODOS_BANK("triodos_bank"),

        @SerializedName("van_lanschot")
        VAN_LANSCHOT("van_lanschot"),

        @SerializedName("yoursafe")
        YOURSAFE("yoursafe");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Bank(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class InteracPresent {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InteracPresent(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.InteracPresent build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.InteracPresent(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.InteracPresent#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.InteracPresent#extraParams}
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
    public static class Klarna {
      /** Customer's date of birth. */
      @SerializedName("dob")
      Dob dob;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Klarna(Dob dob, Map<String, Object> extraParams) {
        this.dob = dob;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Dob dob;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Klarna build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Klarna(this.dob, this.extraParams);
        }

        /** Customer's date of birth. */
        public Builder setDob(PaymentIntentUpdateParams.PaymentMethodData.Klarna.Dob dob) {
          this.dob = dob;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Klarna#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Klarna#extraParams} for the
         * field documentation.
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
      public static class Dob {
        /** <strong>Required.</strong> The day of birth, between 1 and 31. */
        @SerializedName("day")
        Long day;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The month of birth, between 1 and 12. */
        @SerializedName("month")
        Long month;

        /** <strong>Required.</strong> The four-digit year of birth. */
        @SerializedName("year")
        Long year;

        private Dob(Long day, Map<String, Object> extraParams, Long month, Long year) {
          this.day = day;
          this.extraParams = extraParams;
          this.month = month;
          this.year = year;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long day;

          private Map<String, Object> extraParams;

          private Long month;

          private Long year;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodData.Klarna.Dob build() {
            return new PaymentIntentUpdateParams.PaymentMethodData.Klarna.Dob(
                this.day, this.extraParams, this.month, this.year);
          }

          /** <strong>Required.</strong> The day of birth, between 1 and 31. */
          public Builder setDay(Long day) {
            this.day = day;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Klarna.Dob#extraParams} for
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
           * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Klarna.Dob#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The month of birth, between 1 and 12. */
          public Builder setMonth(Long month) {
            this.month = month;
            return this;
          }

          /** <strong>Required.</strong> The four-digit year of birth. */
          public Builder setYear(Long year) {
            this.year = year;
            return this;
          }
        }
      }
    }

    @Getter
    public static class Konbini {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Konbini(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Konbini build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Konbini(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Konbini#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Konbini#extraParams} for the
         * field documentation.
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
    public static class Link {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Link(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Link build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Link(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Link#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Link#extraParams} for the
         * field documentation.
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
    public static class Oxxo {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Oxxo(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Oxxo build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Oxxo(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Oxxo#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Oxxo#extraParams} for the
         * field documentation.
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
    public static class P24 {
      /** The customer's bank. */
      @SerializedName("bank")
      Bank bank;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private P24(Bank bank, Map<String, Object> extraParams) {
        this.bank = bank;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Bank bank;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.P24 build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.P24(this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(PaymentIntentUpdateParams.PaymentMethodData.P24.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.P24#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.P24#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public enum Bank implements ApiRequestParams.EnumParam {
        @SerializedName("alior_bank")
        ALIOR_BANK("alior_bank"),

        @SerializedName("bank_millennium")
        BANK_MILLENNIUM("bank_millennium"),

        @SerializedName("bank_nowy_bfg_sa")
        BANK_NOWY_BFG_SA("bank_nowy_bfg_sa"),

        @SerializedName("bank_pekao_sa")
        BANK_PEKAO_SA("bank_pekao_sa"),

        @SerializedName("banki_spbdzielcze")
        BANKI_SPBDZIELCZE("banki_spbdzielcze"),

        @SerializedName("blik")
        BLIK("blik"),

        @SerializedName("bnp_paribas")
        BNP_PARIBAS("bnp_paribas"),

        @SerializedName("boz")
        BOZ("boz"),

        @SerializedName("citi_handlowy")
        CITI_HANDLOWY("citi_handlowy"),

        @SerializedName("credit_agricole")
        CREDIT_AGRICOLE("credit_agricole"),

        @SerializedName("envelobank")
        ENVELOBANK("envelobank"),

        @SerializedName("etransfer_pocztowy24")
        ETRANSFER_POCZTOWY24("etransfer_pocztowy24"),

        @SerializedName("getin_bank")
        GETIN_BANK("getin_bank"),

        @SerializedName("ideabank")
        IDEABANK("ideabank"),

        @SerializedName("ing")
        ING("ing"),

        @SerializedName("inteligo")
        INTELIGO("inteligo"),

        @SerializedName("mbank_mtransfer")
        MBANK_MTRANSFER("mbank_mtransfer"),

        @SerializedName("nest_przelew")
        NEST_PRZELEW("nest_przelew"),

        @SerializedName("noble_pay")
        NOBLE_PAY("noble_pay"),

        @SerializedName("pbac_z_ipko")
        PBAC_Z_IPKO("pbac_z_ipko"),

        @SerializedName("plus_bank")
        PLUS_BANK("plus_bank"),

        @SerializedName("santander_przelew24")
        SANTANDER_PRZELEW24("santander_przelew24"),

        @SerializedName("tmobile_usbugi_bankowe")
        TMOBILE_USBUGI_BANKOWE("tmobile_usbugi_bankowe"),

        @SerializedName("toyota_bank")
        TOYOTA_BANK("toyota_bank"),

        @SerializedName("volkswagen_bank")
        VOLKSWAGEN_BANK("volkswagen_bank");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Bank(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Paynow {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Paynow(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Paynow build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Paynow(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Paynow#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Paynow#extraParams} for the
         * field documentation.
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
    public static class Paypal {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Paypal(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Paypal build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Paypal(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Paypal#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Paypal#extraParams} for the
         * field documentation.
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
    public static class Pix {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Pix(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Pix build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Pix(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Pix#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Pix#extraParams} for the
         * field documentation.
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
    public static class Promptpay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Promptpay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Promptpay build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Promptpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Promptpay#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Promptpay#extraParams} for
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
    }

    @Getter
    public static class RadarOptions {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot of
       * the browser metadata and device details that help Radar make more accurate predictions on
       * your payments.
       */
      @SerializedName("session")
      Object session;

      private RadarOptions(Map<String, Object> extraParams, Object session) {
        this.extraParams = extraParams;
        this.session = session;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object session;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.RadarOptions build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.RadarOptions(
              this.extraParams, this.session);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.RadarOptions#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.RadarOptions#extraParams} for
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
         * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot
         * of the browser metadata and device details that help Radar make more accurate predictions
         * on your payments.
         */
        public Builder setSession(String session) {
          this.session = session;
          return this;
        }

        /**
         * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot
         * of the browser metadata and device details that help Radar make more accurate predictions
         * on your payments.
         */
        public Builder setSession(EmptyParam session) {
          this.session = session;
          return this;
        }
      }
    }

    @Getter
    public static class SepaDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> IBAN of the bank account. */
      @SerializedName("iban")
      Object iban;

      private SepaDebit(Map<String, Object> extraParams, Object iban) {
        this.extraParams = extraParams;
        this.iban = iban;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object iban;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.SepaDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.SepaDebit(
              this.extraParams, this.iban);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.SepaDebit#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.SepaDebit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> IBAN of the bank account. */
        public Builder setIban(String iban) {
          this.iban = iban;
          return this;
        }

        /** <strong>Required.</strong> IBAN of the bank account. */
        public Builder setIban(EmptyParam iban) {
          this.iban = iban;
          return this;
        }
      }
    }

    @Getter
    public static class Sofort {
      /**
       * <strong>Required.</strong> Two-letter ISO code representing the country the bank account is
       * located in.
       */
      @SerializedName("country")
      Country country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Sofort(Country country, Map<String, Object> extraParams) {
        this.country = country;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Country country;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Sofort build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Sofort(
              this.country, this.extraParams);
        }

        /**
         * <strong>Required.</strong> Two-letter ISO code representing the country the bank account
         * is located in.
         */
        public Builder setCountry(
            PaymentIntentUpdateParams.PaymentMethodData.Sofort.Country country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Sofort#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Sofort#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }
      }

      public enum Country implements ApiRequestParams.EnumParam {
        @SerializedName("AT")
        AT("AT"),

        @SerializedName("BE")
        BE("BE"),

        @SerializedName("DE")
        DE("DE"),

        @SerializedName("ES")
        ES("ES"),

        @SerializedName("IT")
        IT("IT"),

        @SerializedName("NL")
        NL("NL");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Country(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class UsBankAccount {
      /** Account holder type: individual or company. */
      @SerializedName("account_holder_type")
      AccountHolderType accountHolderType;

      /** Account number of the bank account. */
      @SerializedName("account_number")
      Object accountNumber;

      /** Account type: checkings or savings. Defaults to checking if omitted. */
      @SerializedName("account_type")
      AccountType accountType;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of a Financial Connections Account to use as a payment method. */
      @SerializedName("financial_connections_account")
      Object financialConnectionsAccount;

      /** Routing number of the bank account. */
      @SerializedName("routing_number")
      Object routingNumber;

      private UsBankAccount(
          AccountHolderType accountHolderType,
          Object accountNumber,
          AccountType accountType,
          Map<String, Object> extraParams,
          Object financialConnectionsAccount,
          Object routingNumber) {
        this.accountHolderType = accountHolderType;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.extraParams = extraParams;
        this.financialConnectionsAccount = financialConnectionsAccount;
        this.routingNumber = routingNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private AccountHolderType accountHolderType;

        private Object accountNumber;

        private AccountType accountType;

        private Map<String, Object> extraParams;

        private Object financialConnectionsAccount;

        private Object routingNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.UsBankAccount build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.UsBankAccount(
              this.accountHolderType,
              this.accountNumber,
              this.accountType,
              this.extraParams,
              this.financialConnectionsAccount,
              this.routingNumber);
        }

        /** Account holder type: individual or company. */
        public Builder setAccountHolderType(
            PaymentIntentUpdateParams.PaymentMethodData.UsBankAccount.AccountHolderType
                accountHolderType) {
          this.accountHolderType = accountHolderType;
          return this;
        }

        /** Account number of the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Account number of the bank account. */
        public Builder setAccountNumber(EmptyParam accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Account type: checkings or savings. Defaults to checking if omitted. */
        public Builder setAccountType(
            PaymentIntentUpdateParams.PaymentMethodData.UsBankAccount.AccountType accountType) {
          this.accountType = accountType;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.UsBankAccount#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.UsBankAccount#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of a Financial Connections Account to use as a payment method. */
        public Builder setFinancialConnectionsAccount(String financialConnectionsAccount) {
          this.financialConnectionsAccount = financialConnectionsAccount;
          return this;
        }

        /** The ID of a Financial Connections Account to use as a payment method. */
        public Builder setFinancialConnectionsAccount(EmptyParam financialConnectionsAccount) {
          this.financialConnectionsAccount = financialConnectionsAccount;
          return this;
        }

        /** Routing number of the bank account. */
        public Builder setRoutingNumber(String routingNumber) {
          this.routingNumber = routingNumber;
          return this;
        }

        /** Routing number of the bank account. */
        public Builder setRoutingNumber(EmptyParam routingNumber) {
          this.routingNumber = routingNumber;
          return this;
        }
      }

      public enum AccountHolderType implements ApiRequestParams.EnumParam {
        @SerializedName("company")
        COMPANY("company"),

        @SerializedName("individual")
        INDIVIDUAL("individual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AccountHolderType(String value) {
          this.value = value;
        }
      }

      public enum AccountType implements ApiRequestParams.EnumParam {
        @SerializedName("checking")
        CHECKING("checking"),

        @SerializedName("savings")
        SAVINGS("savings");

        @Getter(onMethod_ = {@Override})
        private final String value;

        AccountType(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class WechatPay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private WechatPay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.WechatPay build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.WechatPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.WechatPay#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.WechatPay#extraParams} for
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
    }

    @Getter
    public static class Zip {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Zip(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodData.Zip build() {
          return new PaymentIntentUpdateParams.PaymentMethodData.Zip(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Zip#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodData.Zip#extraParams} for the
         * field documentation.
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

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("acss_debit")
      ACSS_DEBIT("acss_debit"),

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

      @SerializedName("cashapp")
      CASHAPP("cashapp"),

      @SerializedName("customer_balance")
      CUSTOMER_BALANCE("customer_balance"),

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
      WECHAT_PAY("wechat_pay"),

      @SerializedName("zip")
      ZIP("zip");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class PaymentMethodOptions {
    /**
     * If this is a {@code acss_debit} PaymentMethod, this sub-hash contains details about the ACSS
     * Debit payment method options.
     */
    @SerializedName("acss_debit")
    Object acssDebit;

    /**
     * If this is an {@code affirm} PaymentMethod, this sub-hash contains details about the Affirm
     * payment method options.
     */
    @SerializedName("affirm")
    Object affirm;

    /**
     * If this is a {@code afterpay_clearpay} PaymentMethod, this sub-hash contains details about
     * the Afterpay Clearpay payment method options.
     */
    @SerializedName("afterpay_clearpay")
    Object afterpayClearpay;

    /**
     * If this is a {@code alipay} PaymentMethod, this sub-hash contains details about the Alipay
     * payment method options.
     */
    @SerializedName("alipay")
    Object alipay;

    /**
     * If this is a {@code au_becs_debit} PaymentMethod, this sub-hash contains details about the AU
     * BECS Direct Debit payment method options.
     */
    @SerializedName("au_becs_debit")
    Object auBecsDebit;

    /**
     * If this is a {@code bacs_debit} PaymentMethod, this sub-hash contains details about the BACS
     * Debit payment method options.
     */
    @SerializedName("bacs_debit")
    Object bacsDebit;

    /**
     * If this is a {@code bancontact} PaymentMethod, this sub-hash contains details about the
     * Bancontact payment method options.
     */
    @SerializedName("bancontact")
    Object bancontact;

    /**
     * If this is a {@code blik} PaymentMethod, this sub-hash contains details about the BLIK
     * payment method options.
     */
    @SerializedName("blik")
    Object blik;

    /**
     * If this is a {@code boleto} PaymentMethod, this sub-hash contains details about the Boleto
     * payment method options.
     */
    @SerializedName("boleto")
    Object boleto;

    /** Configuration for any card payments attempted on this PaymentIntent. */
    @SerializedName("card")
    Object card;

    /**
     * If this is a {@code card_present} PaymentMethod, this sub-hash contains details about the
     * Card Present payment method options.
     */
    @SerializedName("card_present")
    Object cardPresent;

    /**
     * If this is a {@code cashapp} PaymentMethod, this sub-hash contains details about the Cash App
     * Pay payment method options.
     */
    @SerializedName("cashapp")
    Object cashapp;

    /**
     * If this is a {@code customer balance} PaymentMethod, this sub-hash contains details about the
     * customer balance payment method options.
     */
    @SerializedName("customer_balance")
    Object customerBalance;

    /**
     * If this is a {@code eps} PaymentMethod, this sub-hash contains details about the EPS payment
     * method options.
     */
    @SerializedName("eps")
    Object eps;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If this is a {@code fpx} PaymentMethod, this sub-hash contains details about the FPX payment
     * method options.
     */
    @SerializedName("fpx")
    Object fpx;

    /**
     * If this is a {@code giropay} PaymentMethod, this sub-hash contains details about the Giropay
     * payment method options.
     */
    @SerializedName("giropay")
    Object giropay;

    /**
     * If this is a {@code grabpay} PaymentMethod, this sub-hash contains details about the Grabpay
     * payment method options.
     */
    @SerializedName("grabpay")
    Object grabpay;

    /**
     * If this is a {@code ideal} PaymentMethod, this sub-hash contains details about the Ideal
     * payment method options.
     */
    @SerializedName("ideal")
    Object ideal;

    /**
     * If this is a {@code interac_present} PaymentMethod, this sub-hash contains details about the
     * Card Present payment method options.
     */
    @SerializedName("interac_present")
    Object interacPresent;

    /**
     * If this is a {@code klarna} PaymentMethod, this sub-hash contains details about the Klarna
     * payment method options.
     */
    @SerializedName("klarna")
    Object klarna;

    /**
     * If this is a {@code konbini} PaymentMethod, this sub-hash contains details about the Konbini
     * payment method options.
     */
    @SerializedName("konbini")
    Object konbini;

    /**
     * If this is a {@code link} PaymentMethod, this sub-hash contains details about the Link
     * payment method options.
     */
    @SerializedName("link")
    Object link;

    /**
     * If this is a {@code oxxo} PaymentMethod, this sub-hash contains details about the OXXO
     * payment method options.
     */
    @SerializedName("oxxo")
    Object oxxo;

    /**
     * If this is a {@code p24} PaymentMethod, this sub-hash contains details about the Przelewy24
     * payment method options.
     */
    @SerializedName("p24")
    Object p24;

    /**
     * If this is a {@code paynow} PaymentMethod, this sub-hash contains details about the PayNow
     * payment method options.
     */
    @SerializedName("paynow")
    Object paynow;

    /**
     * If this is a {@code paypal} PaymentMethod, this sub-hash contains details about the PayPal
     * payment method options.
     */
    @SerializedName("paypal")
    Object paypal;

    /**
     * If this is a {@code pix} PaymentMethod, this sub-hash contains details about the Pix payment
     * method options.
     */
    @SerializedName("pix")
    Object pix;

    /**
     * If this is a {@code promptpay} PaymentMethod, this sub-hash contains details about the
     * PromptPay payment method options.
     */
    @SerializedName("promptpay")
    Object promptpay;

    /**
     * If this is a {@code sepa_debit} PaymentIntent, this sub-hash contains details about the SEPA
     * Debit payment method options.
     */
    @SerializedName("sepa_debit")
    Object sepaDebit;

    /**
     * If this is a {@code sofort} PaymentMethod, this sub-hash contains details about the SOFORT
     * payment method options.
     */
    @SerializedName("sofort")
    Object sofort;

    /**
     * If this is a {@code us_bank_account} PaymentMethod, this sub-hash contains details about the
     * US bank account payment method options.
     */
    @SerializedName("us_bank_account")
    Object usBankAccount;

    /**
     * If this is a {@code wechat_pay} PaymentMethod, this sub-hash contains details about the
     * WeChat Pay payment method options.
     */
    @SerializedName("wechat_pay")
    Object wechatPay;

    /**
     * If this is a {@code zip} PaymentMethod, this sub-hash contains details about the Zip payment
     * method options.
     */
    @SerializedName("zip")
    Object zip;

    private PaymentMethodOptions(
        Object acssDebit,
        Object affirm,
        Object afterpayClearpay,
        Object alipay,
        Object auBecsDebit,
        Object bacsDebit,
        Object bancontact,
        Object blik,
        Object boleto,
        Object card,
        Object cardPresent,
        Object cashapp,
        Object customerBalance,
        Object eps,
        Map<String, Object> extraParams,
        Object fpx,
        Object giropay,
        Object grabpay,
        Object ideal,
        Object interacPresent,
        Object klarna,
        Object konbini,
        Object link,
        Object oxxo,
        Object p24,
        Object paynow,
        Object paypal,
        Object pix,
        Object promptpay,
        Object sepaDebit,
        Object sofort,
        Object usBankAccount,
        Object wechatPay,
        Object zip) {
      this.acssDebit = acssDebit;
      this.affirm = affirm;
      this.afterpayClearpay = afterpayClearpay;
      this.alipay = alipay;
      this.auBecsDebit = auBecsDebit;
      this.bacsDebit = bacsDebit;
      this.bancontact = bancontact;
      this.blik = blik;
      this.boleto = boleto;
      this.card = card;
      this.cardPresent = cardPresent;
      this.cashapp = cashapp;
      this.customerBalance = customerBalance;
      this.eps = eps;
      this.extraParams = extraParams;
      this.fpx = fpx;
      this.giropay = giropay;
      this.grabpay = grabpay;
      this.ideal = ideal;
      this.interacPresent = interacPresent;
      this.klarna = klarna;
      this.konbini = konbini;
      this.link = link;
      this.oxxo = oxxo;
      this.p24 = p24;
      this.paynow = paynow;
      this.paypal = paypal;
      this.pix = pix;
      this.promptpay = promptpay;
      this.sepaDebit = sepaDebit;
      this.sofort = sofort;
      this.usBankAccount = usBankAccount;
      this.wechatPay = wechatPay;
      this.zip = zip;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object acssDebit;

      private Object affirm;

      private Object afterpayClearpay;

      private Object alipay;

      private Object auBecsDebit;

      private Object bacsDebit;

      private Object bancontact;

      private Object blik;

      private Object boleto;

      private Object card;

      private Object cardPresent;

      private Object cashapp;

      private Object customerBalance;

      private Object eps;

      private Map<String, Object> extraParams;

      private Object fpx;

      private Object giropay;

      private Object grabpay;

      private Object ideal;

      private Object interacPresent;

      private Object klarna;

      private Object konbini;

      private Object link;

      private Object oxxo;

      private Object p24;

      private Object paynow;

      private Object paypal;

      private Object pix;

      private Object promptpay;

      private Object sepaDebit;

      private Object sofort;

      private Object usBankAccount;

      private Object wechatPay;

      private Object zip;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentUpdateParams.PaymentMethodOptions build() {
        return new PaymentIntentUpdateParams.PaymentMethodOptions(
            this.acssDebit,
            this.affirm,
            this.afterpayClearpay,
            this.alipay,
            this.auBecsDebit,
            this.bacsDebit,
            this.bancontact,
            this.blik,
            this.boleto,
            this.card,
            this.cardPresent,
            this.cashapp,
            this.customerBalance,
            this.eps,
            this.extraParams,
            this.fpx,
            this.giropay,
            this.grabpay,
            this.ideal,
            this.interacPresent,
            this.klarna,
            this.konbini,
            this.link,
            this.oxxo,
            this.p24,
            this.paynow,
            this.paypal,
            this.pix,
            this.promptpay,
            this.sepaDebit,
            this.sofort,
            this.usBankAccount,
            this.wechatPay,
            this.zip);
      }

      /**
       * If this is a {@code acss_debit} PaymentMethod, this sub-hash contains details about the
       * ACSS Debit payment method options.
       */
      public Builder setAcssDebit(
          PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /**
       * If this is a {@code acss_debit} PaymentMethod, this sub-hash contains details about the
       * ACSS Debit payment method options.
       */
      public Builder setAcssDebit(EmptyParam acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /**
       * If this is an {@code affirm} PaymentMethod, this sub-hash contains details about the Affirm
       * payment method options.
       */
      public Builder setAffirm(PaymentIntentUpdateParams.PaymentMethodOptions.Affirm affirm) {
        this.affirm = affirm;
        return this;
      }

      /**
       * If this is an {@code affirm} PaymentMethod, this sub-hash contains details about the Affirm
       * payment method options.
       */
      public Builder setAffirm(EmptyParam affirm) {
        this.affirm = affirm;
        return this;
      }

      /**
       * If this is a {@code afterpay_clearpay} PaymentMethod, this sub-hash contains details about
       * the Afterpay Clearpay payment method options.
       */
      public Builder setAfterpayClearpay(
          PaymentIntentUpdateParams.PaymentMethodOptions.AfterpayClearpay afterpayClearpay) {
        this.afterpayClearpay = afterpayClearpay;
        return this;
      }

      /**
       * If this is a {@code afterpay_clearpay} PaymentMethod, this sub-hash contains details about
       * the Afterpay Clearpay payment method options.
       */
      public Builder setAfterpayClearpay(EmptyParam afterpayClearpay) {
        this.afterpayClearpay = afterpayClearpay;
        return this;
      }

      /**
       * If this is a {@code alipay} PaymentMethod, this sub-hash contains details about the Alipay
       * payment method options.
       */
      public Builder setAlipay(PaymentIntentUpdateParams.PaymentMethodOptions.Alipay alipay) {
        this.alipay = alipay;
        return this;
      }

      /**
       * If this is a {@code alipay} PaymentMethod, this sub-hash contains details about the Alipay
       * payment method options.
       */
      public Builder setAlipay(EmptyParam alipay) {
        this.alipay = alipay;
        return this;
      }

      /**
       * If this is a {@code au_becs_debit} PaymentMethod, this sub-hash contains details about the
       * AU BECS Direct Debit payment method options.
       */
      public Builder setAuBecsDebit(
          PaymentIntentUpdateParams.PaymentMethodOptions.AuBecsDebit auBecsDebit) {
        this.auBecsDebit = auBecsDebit;
        return this;
      }

      /**
       * If this is a {@code au_becs_debit} PaymentMethod, this sub-hash contains details about the
       * AU BECS Direct Debit payment method options.
       */
      public Builder setAuBecsDebit(EmptyParam auBecsDebit) {
        this.auBecsDebit = auBecsDebit;
        return this;
      }

      /**
       * If this is a {@code bacs_debit} PaymentMethod, this sub-hash contains details about the
       * BACS Debit payment method options.
       */
      public Builder setBacsDebit(
          PaymentIntentUpdateParams.PaymentMethodOptions.BacsDebit bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /**
       * If this is a {@code bacs_debit} PaymentMethod, this sub-hash contains details about the
       * BACS Debit payment method options.
       */
      public Builder setBacsDebit(EmptyParam bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /**
       * If this is a {@code bancontact} PaymentMethod, this sub-hash contains details about the
       * Bancontact payment method options.
       */
      public Builder setBancontact(
          PaymentIntentUpdateParams.PaymentMethodOptions.Bancontact bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /**
       * If this is a {@code bancontact} PaymentMethod, this sub-hash contains details about the
       * Bancontact payment method options.
       */
      public Builder setBancontact(EmptyParam bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /**
       * If this is a {@code blik} PaymentMethod, this sub-hash contains details about the BLIK
       * payment method options.
       */
      public Builder setBlik(PaymentIntentUpdateParams.PaymentMethodOptions.Blik blik) {
        this.blik = blik;
        return this;
      }

      /**
       * If this is a {@code blik} PaymentMethod, this sub-hash contains details about the BLIK
       * payment method options.
       */
      public Builder setBlik(EmptyParam blik) {
        this.blik = blik;
        return this;
      }

      /**
       * If this is a {@code boleto} PaymentMethod, this sub-hash contains details about the Boleto
       * payment method options.
       */
      public Builder setBoleto(PaymentIntentUpdateParams.PaymentMethodOptions.Boleto boleto) {
        this.boleto = boleto;
        return this;
      }

      /**
       * If this is a {@code boleto} PaymentMethod, this sub-hash contains details about the Boleto
       * payment method options.
       */
      public Builder setBoleto(EmptyParam boleto) {
        this.boleto = boleto;
        return this;
      }

      /** Configuration for any card payments attempted on this PaymentIntent. */
      public Builder setCard(PaymentIntentUpdateParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /** Configuration for any card payments attempted on this PaymentIntent. */
      public Builder setCard(EmptyParam card) {
        this.card = card;
        return this;
      }

      /**
       * If this is a {@code card_present} PaymentMethod, this sub-hash contains details about the
       * Card Present payment method options.
       */
      public Builder setCardPresent(
          PaymentIntentUpdateParams.PaymentMethodOptions.CardPresent cardPresent) {
        this.cardPresent = cardPresent;
        return this;
      }

      /**
       * If this is a {@code card_present} PaymentMethod, this sub-hash contains details about the
       * Card Present payment method options.
       */
      public Builder setCardPresent(EmptyParam cardPresent) {
        this.cardPresent = cardPresent;
        return this;
      }

      /**
       * If this is a {@code cashapp} PaymentMethod, this sub-hash contains details about the Cash
       * App Pay payment method options.
       */
      public Builder setCashapp(PaymentIntentUpdateParams.PaymentMethodOptions.Cashapp cashapp) {
        this.cashapp = cashapp;
        return this;
      }

      /**
       * If this is a {@code cashapp} PaymentMethod, this sub-hash contains details about the Cash
       * App Pay payment method options.
       */
      public Builder setCashapp(EmptyParam cashapp) {
        this.cashapp = cashapp;
        return this;
      }

      /**
       * If this is a {@code customer balance} PaymentMethod, this sub-hash contains details about
       * the customer balance payment method options.
       */
      public Builder setCustomerBalance(
          PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /**
       * If this is a {@code customer balance} PaymentMethod, this sub-hash contains details about
       * the customer balance payment method options.
       */
      public Builder setCustomerBalance(EmptyParam customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /**
       * If this is a {@code eps} PaymentMethod, this sub-hash contains details about the EPS
       * payment method options.
       */
      public Builder setEps(PaymentIntentUpdateParams.PaymentMethodOptions.Eps eps) {
        this.eps = eps;
        return this;
      }

      /**
       * If this is a {@code eps} PaymentMethod, this sub-hash contains details about the EPS
       * payment method options.
       */
      public Builder setEps(EmptyParam eps) {
        this.eps = eps;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentUpdateParams.PaymentMethodOptions#extraParams} for the field documentation.
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
       * See {@link PaymentIntentUpdateParams.PaymentMethodOptions#extraParams} for the field
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
       * If this is a {@code fpx} PaymentMethod, this sub-hash contains details about the FPX
       * payment method options.
       */
      public Builder setFpx(PaymentIntentUpdateParams.PaymentMethodOptions.Fpx fpx) {
        this.fpx = fpx;
        return this;
      }

      /**
       * If this is a {@code fpx} PaymentMethod, this sub-hash contains details about the FPX
       * payment method options.
       */
      public Builder setFpx(EmptyParam fpx) {
        this.fpx = fpx;
        return this;
      }

      /**
       * If this is a {@code giropay} PaymentMethod, this sub-hash contains details about the
       * Giropay payment method options.
       */
      public Builder setGiropay(PaymentIntentUpdateParams.PaymentMethodOptions.Giropay giropay) {
        this.giropay = giropay;
        return this;
      }

      /**
       * If this is a {@code giropay} PaymentMethod, this sub-hash contains details about the
       * Giropay payment method options.
       */
      public Builder setGiropay(EmptyParam giropay) {
        this.giropay = giropay;
        return this;
      }

      /**
       * If this is a {@code grabpay} PaymentMethod, this sub-hash contains details about the
       * Grabpay payment method options.
       */
      public Builder setGrabpay(PaymentIntentUpdateParams.PaymentMethodOptions.Grabpay grabpay) {
        this.grabpay = grabpay;
        return this;
      }

      /**
       * If this is a {@code grabpay} PaymentMethod, this sub-hash contains details about the
       * Grabpay payment method options.
       */
      public Builder setGrabpay(EmptyParam grabpay) {
        this.grabpay = grabpay;
        return this;
      }

      /**
       * If this is a {@code ideal} PaymentMethod, this sub-hash contains details about the Ideal
       * payment method options.
       */
      public Builder setIdeal(PaymentIntentUpdateParams.PaymentMethodOptions.Ideal ideal) {
        this.ideal = ideal;
        return this;
      }

      /**
       * If this is a {@code ideal} PaymentMethod, this sub-hash contains details about the Ideal
       * payment method options.
       */
      public Builder setIdeal(EmptyParam ideal) {
        this.ideal = ideal;
        return this;
      }

      /**
       * If this is a {@code interac_present} PaymentMethod, this sub-hash contains details about
       * the Card Present payment method options.
       */
      public Builder setInteracPresent(
          PaymentIntentUpdateParams.PaymentMethodOptions.InteracPresent interacPresent) {
        this.interacPresent = interacPresent;
        return this;
      }

      /**
       * If this is a {@code interac_present} PaymentMethod, this sub-hash contains details about
       * the Card Present payment method options.
       */
      public Builder setInteracPresent(EmptyParam interacPresent) {
        this.interacPresent = interacPresent;
        return this;
      }

      /**
       * If this is a {@code klarna} PaymentMethod, this sub-hash contains details about the Klarna
       * payment method options.
       */
      public Builder setKlarna(PaymentIntentUpdateParams.PaymentMethodOptions.Klarna klarna) {
        this.klarna = klarna;
        return this;
      }

      /**
       * If this is a {@code klarna} PaymentMethod, this sub-hash contains details about the Klarna
       * payment method options.
       */
      public Builder setKlarna(EmptyParam klarna) {
        this.klarna = klarna;
        return this;
      }

      /**
       * If this is a {@code konbini} PaymentMethod, this sub-hash contains details about the
       * Konbini payment method options.
       */
      public Builder setKonbini(PaymentIntentUpdateParams.PaymentMethodOptions.Konbini konbini) {
        this.konbini = konbini;
        return this;
      }

      /**
       * If this is a {@code konbini} PaymentMethod, this sub-hash contains details about the
       * Konbini payment method options.
       */
      public Builder setKonbini(EmptyParam konbini) {
        this.konbini = konbini;
        return this;
      }

      /**
       * If this is a {@code link} PaymentMethod, this sub-hash contains details about the Link
       * payment method options.
       */
      public Builder setLink(PaymentIntentUpdateParams.PaymentMethodOptions.Link link) {
        this.link = link;
        return this;
      }

      /**
       * If this is a {@code link} PaymentMethod, this sub-hash contains details about the Link
       * payment method options.
       */
      public Builder setLink(EmptyParam link) {
        this.link = link;
        return this;
      }

      /**
       * If this is a {@code oxxo} PaymentMethod, this sub-hash contains details about the OXXO
       * payment method options.
       */
      public Builder setOxxo(PaymentIntentUpdateParams.PaymentMethodOptions.Oxxo oxxo) {
        this.oxxo = oxxo;
        return this;
      }

      /**
       * If this is a {@code oxxo} PaymentMethod, this sub-hash contains details about the OXXO
       * payment method options.
       */
      public Builder setOxxo(EmptyParam oxxo) {
        this.oxxo = oxxo;
        return this;
      }

      /**
       * If this is a {@code p24} PaymentMethod, this sub-hash contains details about the Przelewy24
       * payment method options.
       */
      public Builder setP24(PaymentIntentUpdateParams.PaymentMethodOptions.P24 p24) {
        this.p24 = p24;
        return this;
      }

      /**
       * If this is a {@code p24} PaymentMethod, this sub-hash contains details about the Przelewy24
       * payment method options.
       */
      public Builder setP24(EmptyParam p24) {
        this.p24 = p24;
        return this;
      }

      /**
       * If this is a {@code paynow} PaymentMethod, this sub-hash contains details about the PayNow
       * payment method options.
       */
      public Builder setPaynow(PaymentIntentUpdateParams.PaymentMethodOptions.Paynow paynow) {
        this.paynow = paynow;
        return this;
      }

      /**
       * If this is a {@code paynow} PaymentMethod, this sub-hash contains details about the PayNow
       * payment method options.
       */
      public Builder setPaynow(EmptyParam paynow) {
        this.paynow = paynow;
        return this;
      }

      /**
       * If this is a {@code paypal} PaymentMethod, this sub-hash contains details about the PayPal
       * payment method options.
       */
      public Builder setPaypal(PaymentIntentUpdateParams.PaymentMethodOptions.Paypal paypal) {
        this.paypal = paypal;
        return this;
      }

      /**
       * If this is a {@code paypal} PaymentMethod, this sub-hash contains details about the PayPal
       * payment method options.
       */
      public Builder setPaypal(EmptyParam paypal) {
        this.paypal = paypal;
        return this;
      }

      /**
       * If this is a {@code pix} PaymentMethod, this sub-hash contains details about the Pix
       * payment method options.
       */
      public Builder setPix(PaymentIntentUpdateParams.PaymentMethodOptions.Pix pix) {
        this.pix = pix;
        return this;
      }

      /**
       * If this is a {@code pix} PaymentMethod, this sub-hash contains details about the Pix
       * payment method options.
       */
      public Builder setPix(EmptyParam pix) {
        this.pix = pix;
        return this;
      }

      /**
       * If this is a {@code promptpay} PaymentMethod, this sub-hash contains details about the
       * PromptPay payment method options.
       */
      public Builder setPromptpay(
          PaymentIntentUpdateParams.PaymentMethodOptions.Promptpay promptpay) {
        this.promptpay = promptpay;
        return this;
      }

      /**
       * If this is a {@code promptpay} PaymentMethod, this sub-hash contains details about the
       * PromptPay payment method options.
       */
      public Builder setPromptpay(EmptyParam promptpay) {
        this.promptpay = promptpay;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} PaymentIntent, this sub-hash contains details about the
       * SEPA Debit payment method options.
       */
      public Builder setSepaDebit(
          PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} PaymentIntent, this sub-hash contains details about the
       * SEPA Debit payment method options.
       */
      public Builder setSepaDebit(EmptyParam sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /**
       * If this is a {@code sofort} PaymentMethod, this sub-hash contains details about the SOFORT
       * payment method options.
       */
      public Builder setSofort(PaymentIntentUpdateParams.PaymentMethodOptions.Sofort sofort) {
        this.sofort = sofort;
        return this;
      }

      /**
       * If this is a {@code sofort} PaymentMethod, this sub-hash contains details about the SOFORT
       * payment method options.
       */
      public Builder setSofort(EmptyParam sofort) {
        this.sofort = sofort;
        return this;
      }

      /**
       * If this is a {@code us_bank_account} PaymentMethod, this sub-hash contains details about
       * the US bank account payment method options.
       */
      public Builder setUsBankAccount(
          PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /**
       * If this is a {@code us_bank_account} PaymentMethod, this sub-hash contains details about
       * the US bank account payment method options.
       */
      public Builder setUsBankAccount(EmptyParam usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /**
       * If this is a {@code wechat_pay} PaymentMethod, this sub-hash contains details about the
       * WeChat Pay payment method options.
       */
      public Builder setWechatPay(
          PaymentIntentUpdateParams.PaymentMethodOptions.WechatPay wechatPay) {
        this.wechatPay = wechatPay;
        return this;
      }

      /**
       * If this is a {@code wechat_pay} PaymentMethod, this sub-hash contains details about the
       * WeChat Pay payment method options.
       */
      public Builder setWechatPay(EmptyParam wechatPay) {
        this.wechatPay = wechatPay;
        return this;
      }

      /**
       * If this is a {@code zip} PaymentMethod, this sub-hash contains details about the Zip
       * payment method options.
       */
      public Builder setZip(PaymentIntentUpdateParams.PaymentMethodOptions.Zip zip) {
        this.zip = zip;
        return this;
      }

      /**
       * If this is a {@code zip} PaymentMethod, this sub-hash contains details about the Zip
       * payment method options.
       */
      public Builder setZip(EmptyParam zip) {
        this.zip = zip;
        return this;
      }
    }

    @Getter
    public static class AcssDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Additional fields for Mandate creation. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /** Verification method for the intent. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private AcssDebit(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          ApiRequestParams.EnumParam setupFutureUsage,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.setupFutureUsage = setupFutureUsage;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit(
              this.extraParams,
              this.mandateOptions,
              this.setupFutureUsage,
              this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(
            PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /** Verification method for the intent. */
        public Builder setVerificationMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      public static class MandateOptions {
        /**
         * A URL for custom mandate text to render during confirmation step. The URL will be
         * rendered with additional GET parameters {@code payment_intent} and {@code
         * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
         * and {@code setup_intent_client_secret} when confirming a Setup Intent.
         */
        @SerializedName("custom_mandate_url")
        Object customMandateUrl;

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
         * Description of the mandate interval. Only required if 'payment_schedule' parameter is
         * 'interval' or 'combined'.
         */
        @SerializedName("interval_description")
        Object intervalDescription;

        /** Payment schedule for the mandate. */
        @SerializedName("payment_schedule")
        PaymentSchedule paymentSchedule;

        /** Transaction type of the mandate. */
        @SerializedName("transaction_type")
        TransactionType transactionType;

        private MandateOptions(
            Object customMandateUrl,
            Map<String, Object> extraParams,
            Object intervalDescription,
            PaymentSchedule paymentSchedule,
            TransactionType transactionType) {
          this.customMandateUrl = customMandateUrl;
          this.extraParams = extraParams;
          this.intervalDescription = intervalDescription;
          this.paymentSchedule = paymentSchedule;
          this.transactionType = transactionType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object customMandateUrl;

          private Map<String, Object> extraParams;

          private Object intervalDescription;

          private PaymentSchedule paymentSchedule;

          private TransactionType transactionType;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions build() {
            return new PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions(
                this.customMandateUrl,
                this.extraParams,
                this.intervalDescription,
                this.paymentSchedule,
                this.transactionType);
          }

          /**
           * A URL for custom mandate text to render during confirmation step. The URL will be
           * rendered with additional GET parameters {@code payment_intent} and {@code
           * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
           * and {@code setup_intent_client_secret} when confirming a Setup Intent.
           */
          public Builder setCustomMandateUrl(String customMandateUrl) {
            this.customMandateUrl = customMandateUrl;
            return this;
          }

          /**
           * A URL for custom mandate text to render during confirmation step. The URL will be
           * rendered with additional GET parameters {@code payment_intent} and {@code
           * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
           * and {@code setup_intent_client_secret} when confirming a Setup Intent.
           */
          public Builder setCustomMandateUrl(EmptyParam customMandateUrl) {
            this.customMandateUrl = customMandateUrl;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Description of the mandate interval. Only required if 'payment_schedule' parameter is
           * 'interval' or 'combined'.
           */
          public Builder setIntervalDescription(String intervalDescription) {
            this.intervalDescription = intervalDescription;
            return this;
          }

          /**
           * Description of the mandate interval. Only required if 'payment_schedule' parameter is
           * 'interval' or 'combined'.
           */
          public Builder setIntervalDescription(EmptyParam intervalDescription) {
            this.intervalDescription = intervalDescription;
            return this;
          }

          /** Payment schedule for the mandate. */
          public Builder setPaymentSchedule(
              PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions
                      .PaymentSchedule
                  paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /** Transaction type of the mandate. */
          public Builder setTransactionType(
              PaymentIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions
                      .TransactionType
                  transactionType) {
            this.transactionType = transactionType;
            return this;
          }
        }

        public enum PaymentSchedule implements ApiRequestParams.EnumParam {
          @SerializedName("combined")
          COMBINED("combined"),

          @SerializedName("interval")
          INTERVAL("interval"),

          @SerializedName("sporadic")
          SPORADIC("sporadic");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentSchedule(String value) {
            this.value = value;
          }
        }

        public enum TransactionType implements ApiRequestParams.EnumParam {
          @SerializedName("business")
          BUSINESS("business"),

          @SerializedName("personal")
          PERSONAL("personal");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TransactionType(String value) {
            this.value = value;
          }
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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

      public enum VerificationMethod implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("instant")
        INSTANT("instant"),

        @SerializedName("microdeposits")
        MICRODEPOSITS("microdeposits");

        @Getter(onMethod_ = {@Override})
        private final String value;

        VerificationMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Affirm {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>If provided, this parameter will override the top-level {@code capture_method} when
       * finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter will unset the stored value for this payment method type.
       */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Preferred language of the Affirm authorization page that the customer is redirected to. */
      @SerializedName("preferred_locale")
      Object preferredLocale;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Affirm(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          Object preferredLocale,
          SetupFutureUsage setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.preferredLocale = preferredLocale;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private Object preferredLocale;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Affirm build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Affirm(
              this.captureMethod, this.extraParams, this.preferredLocale, this.setupFutureUsage);
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.Affirm.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Affirm#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Affirm#extraParams} for
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
         * Preferred language of the Affirm authorization page that the customer is redirected to.
         */
        public Builder setPreferredLocale(String preferredLocale) {
          this.preferredLocale = preferredLocale;
          return this;
        }

        /**
         * Preferred language of the Affirm authorization page that the customer is redirected to.
         */
        public Builder setPreferredLocale(EmptyParam preferredLocale) {
          this.preferredLocale = preferredLocale;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Affirm.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class AfterpayClearpay {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>If provided, this parameter will override the top-level {@code capture_method} when
       * finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter will unset the stored value for this payment method type.
       */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Order identifier shown to the customer in Afterpay’s online portal. We recommend using a
       * value that helps you answer any questions a customer might have about the payment. The
       * identifier is limited to 128 characters and may contain only letters, digits, underscores,
       * backslashes and dashes.
       */
      @SerializedName("reference")
      Object reference;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private AfterpayClearpay(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          Object reference,
          SetupFutureUsage setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.reference = reference;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private Object reference;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.AfterpayClearpay build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.AfterpayClearpay(
              this.captureMethod, this.extraParams, this.reference, this.setupFutureUsage);
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.AfterpayClearpay.CaptureMethod
                captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentUpdateParams.PaymentMethodOptions.AfterpayClearpay#extraParams} for the
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
         * PaymentIntentUpdateParams.PaymentMethodOptions.AfterpayClearpay#extraParams} for the
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
         * Order identifier shown to the customer in Afterpay’s online portal. We recommend using a
         * value that helps you answer any questions a customer might have about the payment. The
         * identifier is limited to 128 characters and may contain only letters, digits,
         * underscores, backslashes and dashes.
         */
        public Builder setReference(String reference) {
          this.reference = reference;
          return this;
        }

        /**
         * Order identifier shown to the customer in Afterpay’s online portal. We recommend using a
         * value that helps you answer any questions a customer might have about the payment. The
         * identifier is limited to 128 characters and may contain only letters, digits,
         * underscores, backslashes and dashes.
         */
        public Builder setReference(EmptyParam reference) {
          this.reference = reference;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.AfterpayClearpay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Alipay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Alipay(Map<String, Object> extraParams, ApiRequestParams.EnumParam setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Alipay build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Alipay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Alipay#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Alipay#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Alipay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class AuBecsDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private AuBecsDebit(
          Map<String, Object> extraParams, ApiRequestParams.EnumParam setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.AuBecsDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.AuBecsDebit(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.AuBecsDebit#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.AuBecsDebit#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.AuBecsDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class BacsDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private BacsDebit(
          Map<String, Object> extraParams, ApiRequestParams.EnumParam setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.BacsDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.BacsDebit(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.BacsDebit#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.BacsDebit#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.BacsDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class Bancontact {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       */
      @SerializedName("preferred_language")
      PreferredLanguage preferredLanguage;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Bancontact(
          Map<String, Object> extraParams,
          PreferredLanguage preferredLanguage,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.extraParams = extraParams;
        this.preferredLanguage = preferredLanguage;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private PreferredLanguage preferredLanguage;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Bancontact build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Bancontact(
              this.extraParams, this.preferredLanguage, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Bancontact#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Bancontact#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Preferred language of the Bancontact authorization page that the customer is redirected
         * to.
         */
        public Builder setPreferredLanguage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Bancontact.PreferredLanguage
                preferredLanguage) {
          this.preferredLanguage = preferredLanguage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Bancontact.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum PreferredLanguage implements ApiRequestParams.EnumParam {
        @SerializedName("de")
        DE("de"),

        @SerializedName("en")
        EN("en"),

        @SerializedName("fr")
        FR("fr"),

        @SerializedName("nl")
        NL("nl");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PreferredLanguage(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Blik {
      /**
       * The 6-digit BLIK code that a customer has generated using their banking application. Can
       * only be set on confirmation.
       */
      @SerializedName("code")
      Object code;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Blik(Object code, Map<String, Object> extraParams) {
        this.code = code;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object code;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Blik build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Blik(
              this.code, this.extraParams);
        }

        /**
         * The 6-digit BLIK code that a customer has generated using their banking application. Can
         * only be set on confirmation.
         */
        public Builder setCode(String code) {
          this.code = code;
          return this;
        }

        /**
         * The 6-digit BLIK code that a customer has generated using their banking application. Can
         * only be set on confirmation.
         */
        public Builder setCode(EmptyParam code) {
          this.code = code;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Blik#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Blik#extraParams} for the
         * field documentation.
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
    public static class Boleto {
      /**
       * The number of calendar days before a Boleto voucher expires. For example, if you create a
       * Boleto voucher on Monday and you set expires_after_days to 2, the Boleto invoice will
       * expire on Wednesday at 23:59 America/Sao_Paulo time.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Boleto(
          Long expiresAfterDays,
          Map<String, Object> extraParams,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.expiresAfterDays = expiresAfterDays;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long expiresAfterDays;

        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Boleto build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Boleto(
              this.expiresAfterDays, this.extraParams, this.setupFutureUsage);
        }

        /**
         * The number of calendar days before a Boleto voucher expires. For example, if you create a
         * Boleto voucher on Monday and you set expires_after_days to 2, the Boleto invoice will
         * expire on Wednesday at 23:59 America/Sao_Paulo time.
         */
        public Builder setExpiresAfterDays(Long expiresAfterDays) {
          this.expiresAfterDays = expiresAfterDays;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Boleto#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Boleto#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Boleto.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class Card {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>If provided, this parameter will override the top-level {@code capture_method} when
       * finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter will unset the stored value for this payment method type.
       */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * A single-use {@code cvc_update} Token that represents a card CVC value. When provided, the
       * CVC value will be verified during the card payment attempt. This parameter can only be
       * provided during confirmation.
       */
      @SerializedName("cvc_token")
      Object cvcToken;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Installment configuration for payments attempted on this PaymentIntent (Mexico Only).
       *
       * <p>For more information, see the <a
       * href="https://stripe.com/docs/payments/installments">installments integration guide</a>.
       */
      @SerializedName("installments")
      Installments installments;

      /** Configuration options for setting up an eMandate for cards issued in India. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * When specified, this parameter indicates that a transaction will be marked as MOTO (Mail
       * Order Telephone Order) and thus out of scope for SCA. This parameter can only be provided
       * during confirmation.
       */
      @SerializedName("moto")
      Boolean moto;

      /**
       * Selected network to process this PaymentIntent on. Depends on the available networks of the
       * card attached to the PaymentIntent. Can be only set confirm-time.
       */
      @SerializedName("network")
      Network network;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and <a
       * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. Permitted values include: {@code automatic} or {@code any}. If not
       * provided, defaults to {@code automatic}. Read our guide on <a
       * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting 3D
       * Secure</a> for more information on how this configuration interacts with Radar and our SCA
       * Engine.
       */
      @SerializedName("request_three_d_secure")
      RequestThreeDSecure requestThreeDSecure;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /**
       * Provides information about a card payment that customers see on their statements.
       * Concatenated with the Kana prefix (shortened Kana descriptor) or Kana statement descriptor
       * that’s set on the account to form the complete statement descriptor. Maximum 22 characters.
       * On card statements, the <em>concatenation</em> of both prefix and suffix (including
       * separators) will appear truncated to 22 characters.
       */
      @SerializedName("statement_descriptor_suffix_kana")
      Object statementDescriptorSuffixKana;

      /**
       * Provides information about a card payment that customers see on their statements.
       * Concatenated with the Kanji prefix (shortened Kanji descriptor) or Kanji statement
       * descriptor that’s set on the account to form the complete statement descriptor. Maximum 17
       * characters. On card statements, the <em>concatenation</em> of both prefix and suffix
       * (including separators) will appear truncated to 17 characters.
       */
      @SerializedName("statement_descriptor_suffix_kanji")
      Object statementDescriptorSuffixKanji;

      private Card(
          ApiRequestParams.EnumParam captureMethod,
          Object cvcToken,
          Map<String, Object> extraParams,
          Installments installments,
          MandateOptions mandateOptions,
          Boolean moto,
          Network network,
          RequestThreeDSecure requestThreeDSecure,
          ApiRequestParams.EnumParam setupFutureUsage,
          Object statementDescriptorSuffixKana,
          Object statementDescriptorSuffixKanji) {
        this.captureMethod = captureMethod;
        this.cvcToken = cvcToken;
        this.extraParams = extraParams;
        this.installments = installments;
        this.mandateOptions = mandateOptions;
        this.moto = moto;
        this.network = network;
        this.requestThreeDSecure = requestThreeDSecure;
        this.setupFutureUsage = setupFutureUsage;
        this.statementDescriptorSuffixKana = statementDescriptorSuffixKana;
        this.statementDescriptorSuffixKanji = statementDescriptorSuffixKanji;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Object cvcToken;

        private Map<String, Object> extraParams;

        private Installments installments;

        private MandateOptions mandateOptions;

        private Boolean moto;

        private Network network;

        private RequestThreeDSecure requestThreeDSecure;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private Object statementDescriptorSuffixKana;

        private Object statementDescriptorSuffixKanji;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Card build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Card(
              this.captureMethod,
              this.cvcToken,
              this.extraParams,
              this.installments,
              this.mandateOptions,
              this.moto,
              this.network,
              this.requestThreeDSecure,
              this.setupFutureUsage,
              this.statementDescriptorSuffixKana,
              this.statementDescriptorSuffixKanji);
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.Card.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * A single-use {@code cvc_update} Token that represents a card CVC value. When provided,
         * the CVC value will be verified during the card payment attempt. This parameter can only
         * be provided during confirmation.
         */
        public Builder setCvcToken(String cvcToken) {
          this.cvcToken = cvcToken;
          return this;
        }

        /**
         * A single-use {@code cvc_update} Token that represents a card CVC value. When provided,
         * the CVC value will be verified during the card payment attempt. This parameter can only
         * be provided during confirmation.
         */
        public Builder setCvcToken(EmptyParam cvcToken) {
          this.cvcToken = cvcToken;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Card#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Card#extraParams} for the
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
         * Installment configuration for payments attempted on this PaymentIntent (Mexico Only).
         *
         * <p>For more information, see the <a
         * href="https://stripe.com/docs/payments/installments">installments integration guide</a>.
         */
        public Builder setInstallments(
            PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments installments) {
          this.installments = installments;
          return this;
        }

        /** Configuration options for setting up an eMandate for cards issued in India. */
        public Builder setMandateOptions(
            PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * When specified, this parameter indicates that a transaction will be marked as MOTO (Mail
         * Order Telephone Order) and thus out of scope for SCA. This parameter can only be provided
         * during confirmation.
         */
        public Builder setMoto(Boolean moto) {
          this.moto = moto;
          return this;
        }

        /**
         * Selected network to process this PaymentIntent on. Depends on the available networks of
         * the card attached to the PaymentIntent. Can be only set confirm-time.
         */
        public Builder setNetwork(
            PaymentIntentUpdateParams.PaymentMethodOptions.Card.Network network) {
          this.network = network;
          return this;
        }

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and <a
         * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. Permitted values include: {@code automatic} or {@code any}. If not
         * provided, defaults to {@code automatic}. Read our guide on <a
         * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting 3D
         * Secure</a> for more information on how this configuration interacts with Radar and our
         * SCA Engine.
         */
        public Builder setRequestThreeDSecure(
            PaymentIntentUpdateParams.PaymentMethodOptions.Card.RequestThreeDSecure
                requestThreeDSecure) {
          this.requestThreeDSecure = requestThreeDSecure;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Card.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the Kana prefix (shortened Kana descriptor) or Kana statement
         * descriptor that’s set on the account to form the complete statement descriptor. Maximum
         * 22 characters. On card statements, the <em>concatenation</em> of both prefix and suffix
         * (including separators) will appear truncated to 22 characters.
         */
        public Builder setStatementDescriptorSuffixKana(String statementDescriptorSuffixKana) {
          this.statementDescriptorSuffixKana = statementDescriptorSuffixKana;
          return this;
        }

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the Kana prefix (shortened Kana descriptor) or Kana statement
         * descriptor that’s set on the account to form the complete statement descriptor. Maximum
         * 22 characters. On card statements, the <em>concatenation</em> of both prefix and suffix
         * (including separators) will appear truncated to 22 characters.
         */
        public Builder setStatementDescriptorSuffixKana(EmptyParam statementDescriptorSuffixKana) {
          this.statementDescriptorSuffixKana = statementDescriptorSuffixKana;
          return this;
        }

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the Kanji prefix (shortened Kanji descriptor) or Kanji statement
         * descriptor that’s set on the account to form the complete statement descriptor. Maximum
         * 17 characters. On card statements, the <em>concatenation</em> of both prefix and suffix
         * (including separators) will appear truncated to 17 characters.
         */
        public Builder setStatementDescriptorSuffixKanji(String statementDescriptorSuffixKanji) {
          this.statementDescriptorSuffixKanji = statementDescriptorSuffixKanji;
          return this;
        }

        /**
         * Provides information about a card payment that customers see on their statements.
         * Concatenated with the Kanji prefix (shortened Kanji descriptor) or Kanji statement
         * descriptor that’s set on the account to form the complete statement descriptor. Maximum
         * 17 characters. On card statements, the <em>concatenation</em> of both prefix and suffix
         * (including separators) will appear truncated to 17 characters.
         */
        public Builder setStatementDescriptorSuffixKanji(
            EmptyParam statementDescriptorSuffixKanji) {
          this.statementDescriptorSuffixKanji = statementDescriptorSuffixKanji;
          return this;
        }
      }

      @Getter
      public static class Installments {
        /**
         * Setting to true enables installments for this PaymentIntent. This will cause the response
         * to contain a list of available installment plans. Setting to false will prevent any
         * selected plan from applying to a charge.
         */
        @SerializedName("enabled")
        Boolean enabled;

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
         * The selected installment plan to use for this payment attempt. This parameter can only be
         * provided during confirmation.
         */
        @SerializedName("plan")
        Object plan;

        private Installments(Boolean enabled, Map<String, Object> extraParams, Object plan) {
          this.enabled = enabled;
          this.extraParams = extraParams;
          this.plan = plan;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Boolean enabled;

          private Map<String, Object> extraParams;

          private Object plan;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments build() {
            return new PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments(
                this.enabled, this.extraParams, this.plan);
          }

          /**
           * Setting to true enables installments for this PaymentIntent. This will cause the
           * response to contain a list of available installment plans. Setting to false will
           * prevent any selected plan from applying to a charge.
           */
          public Builder setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments#extraParams} for the
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
           * PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments#extraParams} for the
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
           * The selected installment plan to use for this payment attempt. This parameter can only
           * be provided during confirmation.
           */
          public Builder setPlan(
              PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments.Plan plan) {
            this.plan = plan;
            return this;
          }

          /**
           * The selected installment plan to use for this payment attempt. This parameter can only
           * be provided during confirmation.
           */
          public Builder setPlan(EmptyParam plan) {
            this.plan = plan;
            return this;
          }
        }

        @Getter
        public static class Plan {
          /**
           * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
           * number of installment payments your customer will make to their credit card.
           */
          @SerializedName("count")
          Long count;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
           * interval between installment payments your customer will make to their credit card. One
           * of {@code month}.
           */
          @SerializedName("interval")
          Interval interval;

          /** <strong>Required.</strong> Type of installment plan, one of {@code fixed_count}. */
          @SerializedName("type")
          Type type;

          private Plan(Long count, Map<String, Object> extraParams, Interval interval, Type type) {
            this.count = count;
            this.extraParams = extraParams;
            this.interval = interval;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long count;

            private Map<String, Object> extraParams;

            private Interval interval;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments.Plan build() {
              return new PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments.Plan(
                  this.count, this.extraParams, this.interval, this.type);
            }

            /**
             * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
             * number of installment payments your customer will make to their credit card.
             */
            public Builder setCount(Long count) {
              this.count = count;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments.Plan#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> For {@code fixed_count} installment plans, this is the
             * interval between installment payments your customer will make to their credit card.
             * One of {@code month}.
             */
            public Builder setInterval(
                PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments.Plan.Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /** <strong>Required.</strong> Type of installment plan, one of {@code fixed_count}. */
            public Builder setType(
                PaymentIntentUpdateParams.PaymentMethodOptions.Card.Installments.Plan.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Interval implements ApiRequestParams.EnumParam {
            @SerializedName("month")
            MONTH("month");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Interval(String value) {
              this.value = value;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("fixed_count")
            FIXED_COUNT("fixed_count");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      public static class MandateOptions {
        /** <strong>Required.</strong> Amount to be charged for future payments. */
        @SerializedName("amount")
        Long amount;

        /**
         * <strong>Required.</strong> One of {@code fixed} or {@code maximum}. If {@code fixed}, the
         * {@code amount} param refers to the exact amount to be charged in future payments. If
         * {@code maximum}, the amount charged can be up to the value passed for the {@code amount}
         * param.
         */
        @SerializedName("amount_type")
        AmountType amountType;

        /**
         * A description of the mandate or subscription that is meant to be displayed to the
         * customer.
         */
        @SerializedName("description")
        Object description;

        /**
         * End date of the mandate or subscription. If not provided, the mandate will be active
         * until canceled. If provided, end date should be after start date.
         */
        @SerializedName("end_date")
        Long endDate;

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
         * <strong>Required.</strong> Specifies payment frequency. One of {@code day}, {@code week},
         * {@code month}, {@code year}, or {@code sporadic}.
         */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals between payments. For example, {@code interval=month} and {@code
         * interval_count=3} indicates one payment every three months. Maximum of one year interval
         * allowed (1 year, 12 months, or 52 weeks). This parameter is optional when {@code
         * interval=sporadic}.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        /** <strong>Required.</strong> Unique identifier for the mandate or subscription. */
        @SerializedName("reference")
        Object reference;

        /**
         * <strong>Required.</strong> Start date of the mandate or subscription. Start date should
         * not be lesser than yesterday.
         */
        @SerializedName("start_date")
        Long startDate;

        /** Specifies the type of mandates supported. Possible values are {@code india}. */
        @SerializedName("supported_types")
        List<PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
            supportedTypes;

        private MandateOptions(
            Long amount,
            AmountType amountType,
            Object description,
            Long endDate,
            Map<String, Object> extraParams,
            Interval interval,
            Long intervalCount,
            Object reference,
            Long startDate,
            List<PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
                supportedTypes) {
          this.amount = amount;
          this.amountType = amountType;
          this.description = description;
          this.endDate = endDate;
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
          this.reference = reference;
          this.startDate = startDate;
          this.supportedTypes = supportedTypes;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private AmountType amountType;

          private Object description;

          private Long endDate;

          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          private Object reference;

          private Long startDate;

          private List<
                  PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
              supportedTypes;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions build() {
            return new PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions(
                this.amount,
                this.amountType,
                this.description,
                this.endDate,
                this.extraParams,
                this.interval,
                this.intervalCount,
                this.reference,
                this.startDate,
                this.supportedTypes);
          }

          /** <strong>Required.</strong> Amount to be charged for future payments. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * <strong>Required.</strong> One of {@code fixed} or {@code maximum}. If {@code fixed},
           * the {@code amount} param refers to the exact amount to be charged in future payments.
           * If {@code maximum}, the amount charged can be up to the value passed for the {@code
           * amount} param.
           */
          public Builder setAmountType(
              PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.AmountType
                  amountType) {
            this.amountType = amountType;
            return this;
          }

          /**
           * A description of the mandate or subscription that is meant to be displayed to the
           * customer.
           */
          public Builder setDescription(String description) {
            this.description = description;
            return this;
          }

          /**
           * A description of the mandate or subscription that is meant to be displayed to the
           * customer.
           */
          public Builder setDescription(EmptyParam description) {
            this.description = description;
            return this;
          }

          /**
           * End date of the mandate or subscription. If not provided, the mandate will be active
           * until canceled. If provided, end date should be after start date.
           */
          public Builder setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for the
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
           * PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for the
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
           * <strong>Required.</strong> Specifies payment frequency. One of {@code day}, {@code
           * week}, {@code month}, {@code year}, or {@code sporadic}.
           */
          public Builder setInterval(
              PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.Interval
                  interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals between payments. For example, {@code interval=month} and
           * {@code interval_count=3} indicates one payment every three months. Maximum of one year
           * interval allowed (1 year, 12 months, or 52 weeks). This parameter is optional when
           * {@code interval=sporadic}.
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }

          /** <strong>Required.</strong> Unique identifier for the mandate or subscription. */
          public Builder setReference(String reference) {
            this.reference = reference;
            return this;
          }

          /** <strong>Required.</strong> Unique identifier for the mandate or subscription. */
          public Builder setReference(EmptyParam reference) {
            this.reference = reference;
            return this;
          }

          /**
           * <strong>Required.</strong> Start date of the mandate or subscription. Start date should
           * not be lesser than yesterday.
           */
          public Builder setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
          }

          /**
           * Add an element to `supportedTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#supportedTypes} for
           * the field documentation.
           */
          public Builder addSupportedType(
              PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType
                  element) {
            if (this.supportedTypes == null) {
              this.supportedTypes = new ArrayList<>();
            }
            this.supportedTypes.add(element);
            return this;
          }

          /**
           * Add all elements to `supportedTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#supportedTypes} for
           * the field documentation.
           */
          public Builder addAllSupportedType(
              List<PaymentIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
                  elements) {
            if (this.supportedTypes == null) {
              this.supportedTypes = new ArrayList<>();
            }
            this.supportedTypes.addAll(elements);
            return this;
          }
        }

        public enum AmountType implements ApiRequestParams.EnumParam {
          @SerializedName("fixed")
          FIXED("fixed"),

          @SerializedName("maximum")
          MAXIMUM("maximum");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AmountType(String value) {
            this.value = value;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("sporadic")
          SPORADIC("sporadic"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
          }
        }

        public enum SupportedType implements ApiRequestParams.EnumParam {
          @SerializedName("india")
          INDIA("india");

          @Getter(onMethod_ = {@Override})
          private final String value;

          SupportedType(String value) {
            this.value = value;
          }
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum Network implements ApiRequestParams.EnumParam {
        @SerializedName("amex")
        AMEX("amex"),

        @SerializedName("cartes_bancaires")
        CARTES_BANCAIRES("cartes_bancaires"),

        @SerializedName("diners")
        DINERS("diners"),

        @SerializedName("discover")
        DISCOVER("discover"),

        @SerializedName("eftpos_au")
        EFTPOS_AU("eftpos_au"),

        @SerializedName("interac")
        INTERAC("interac"),

        @SerializedName("jcb")
        JCB("jcb"),

        @SerializedName("mastercard")
        MASTERCARD("mastercard"),

        @SerializedName("unionpay")
        UNIONPAY("unionpay"),

        @SerializedName("unknown")
        UNKNOWN("unknown"),

        @SerializedName("visa")
        VISA("visa");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Network(String value) {
          this.value = value;
        }
      }

      public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
        @SerializedName("any")
        ANY("any"),

        @SerializedName("automatic")
        AUTOMATIC("automatic");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestThreeDSecure(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class CardPresent {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Request ability to capture this payment beyond the standard <a
       * href="https://stripe.com/docs/terminal/features/extended-authorizations#authorization-validity">authorization
       * validity window.</a>
       */
      @SerializedName("request_extended_authorization")
      Boolean requestExtendedAuthorization;

      /**
       * Request ability to <a
       * href="https://stripe.com/docs/terminal/features/incremental-authorizations">increment</a>
       * this PaymentIntent if the combination of MCC and card brand is eligible. Check <a
       * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-card_present-incremental_authorization_supported">incremental_authorization_supported</a>
       * in the <a href="https://stripe.com/docs/api/payment_intents/confirm">Confirm</a> response
       * to verify support.
       */
      @SerializedName("request_incremental_authorization_support")
      Boolean requestIncrementalAuthorizationSupport;

      private CardPresent(
          Map<String, Object> extraParams,
          Boolean requestExtendedAuthorization,
          Boolean requestIncrementalAuthorizationSupport) {
        this.extraParams = extraParams;
        this.requestExtendedAuthorization = requestExtendedAuthorization;
        this.requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requestExtendedAuthorization;

        private Boolean requestIncrementalAuthorizationSupport;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.CardPresent build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.CardPresent(
              this.extraParams,
              this.requestExtendedAuthorization,
              this.requestIncrementalAuthorizationSupport);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.CardPresent#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.CardPresent#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Request ability to capture this payment beyond the standard <a
         * href="https://stripe.com/docs/terminal/features/extended-authorizations#authorization-validity">authorization
         * validity window.</a>
         */
        public Builder setRequestExtendedAuthorization(Boolean requestExtendedAuthorization) {
          this.requestExtendedAuthorization = requestExtendedAuthorization;
          return this;
        }

        /**
         * Request ability to <a
         * href="https://stripe.com/docs/terminal/features/incremental-authorizations">increment</a>
         * this PaymentIntent if the combination of MCC and card brand is eligible. Check <a
         * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-card_present-incremental_authorization_supported">incremental_authorization_supported</a>
         * in the <a href="https://stripe.com/docs/api/payment_intents/confirm">Confirm</a> response
         * to verify support.
         */
        public Builder setRequestIncrementalAuthorizationSupport(
            Boolean requestIncrementalAuthorizationSupport) {
          this.requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport;
          return this;
        }
      }
    }

    @Getter
    public static class Cashapp {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>If provided, this parameter will override the top-level {@code capture_method} when
       * finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter will unset the stored value for this payment method type.
       */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Cashapp(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Cashapp build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Cashapp(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.Cashapp.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Cashapp#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Cashapp#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Cashapp.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class CustomerBalance {
      /**
       * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
       * {@code bank_transfer}.
       */
      @SerializedName("bank_transfer")
      BankTransfer bankTransfer;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The funding method type to be used when there are not enough funds in the customer balance.
       * Permitted values include: {@code bank_transfer}.
       */
      @SerializedName("funding_type")
      FundingType fundingType;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private CustomerBalance(
          BankTransfer bankTransfer,
          Map<String, Object> extraParams,
          FundingType fundingType,
          SetupFutureUsage setupFutureUsage) {
        this.bankTransfer = bankTransfer;
        this.extraParams = extraParams;
        this.fundingType = fundingType;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BankTransfer bankTransfer;

        private Map<String, Object> extraParams;

        private FundingType fundingType;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance(
              this.bankTransfer, this.extraParams, this.fundingType, this.setupFutureUsage);
        }

        /**
         * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
         * {@code bank_transfer}.
         */
        public Builder setBankTransfer(
            PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                bankTransfer) {
          this.bankTransfer = bankTransfer;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance#extraParams} for the field
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
         * map. See {@link
         * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance#extraParams} for the field
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
         * The funding method type to be used when there are not enough funds in the customer
         * balance. Permitted values include: {@code bank_transfer}.
         */
        public Builder setFundingType(
            PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.FundingType
                fundingType) {
          this.fundingType = fundingType;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      @Getter
      public static class BankTransfer {
        /** Configuration for the eu_bank_transfer funding type. */
        @SerializedName("eu_bank_transfer")
        EuBankTransfer euBankTransfer;

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
         * List of address types that should be returned in the financial_addresses response. If not
         * specified, all valid types will be returned.
         *
         * <p>Permitted values include: {@code sort_code}, {@code zengin}, {@code iban}, or {@code
         * spei}.
         */
        @SerializedName("requested_address_types")
        List<
                PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                    .RequestedAddressType>
            requestedAddressTypes;

        /**
         * <strong>Required.</strong> The list of bank transfer types that this PaymentIntent is
         * allowed to use for funding Permitted values include: {@code eu_bank_transfer}, {@code
         * gb_bank_transfer}, {@code jp_bank_transfer}, {@code mx_bank_transfer}, or {@code
         * us_bank_transfer}.
         */
        @SerializedName("type")
        Type type;

        private BankTransfer(
            EuBankTransfer euBankTransfer,
            Map<String, Object> extraParams,
            List<
                    PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                        .RequestedAddressType>
                requestedAddressTypes,
            Type type) {
          this.euBankTransfer = euBankTransfer;
          this.extraParams = extraParams;
          this.requestedAddressTypes = requestedAddressTypes;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private EuBankTransfer euBankTransfer;

          private Map<String, Object> extraParams;

          private List<
                  PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .RequestedAddressType>
              requestedAddressTypes;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
              build() {
            return new PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer(
                this.euBankTransfer, this.extraParams, this.requestedAddressTypes, this.type);
          }

          /** Configuration for the eu_bank_transfer funding type. */
          public Builder setEuBankTransfer(
              PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .EuBankTransfer
                  euBankTransfer) {
            this.euBankTransfer = euBankTransfer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Add an element to `requestedAddressTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
           * for the field documentation.
           */
          public Builder addRequestedAddressType(
              PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .RequestedAddressType
                  element) {
            if (this.requestedAddressTypes == null) {
              this.requestedAddressTypes = new ArrayList<>();
            }
            this.requestedAddressTypes.add(element);
            return this;
          }

          /**
           * Add all elements to `requestedAddressTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
           * for the field documentation.
           */
          public Builder addAllRequestedAddressType(
              List<
                      PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                          .RequestedAddressType>
                  elements) {
            if (this.requestedAddressTypes == null) {
              this.requestedAddressTypes = new ArrayList<>();
            }
            this.requestedAddressTypes.addAll(elements);
            return this;
          }

          /**
           * <strong>Required.</strong> The list of bank transfer types that this PaymentIntent is
           * allowed to use for funding Permitted values include: {@code eu_bank_transfer}, {@code
           * gb_bank_transfer}, {@code jp_bank_transfer}, {@code mx_bank_transfer}, or {@code
           * us_bank_transfer}.
           */
          public Builder setType(
              PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.Type
                  type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        public static class EuBankTransfer {
          /**
           * <strong>Required.</strong> The desired country code of the bank account information.
           * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
           * or {@code NL}.
           */
          @SerializedName("country")
          Object country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private EuBankTransfer(Object country, Map<String, Object> extraParams) {
            this.country = country;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object country;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                    .EuBankTransfer
                build() {
              return new PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                  .EuBankTransfer(this.country, this.extraParams);
            }

            /**
             * <strong>Required.</strong> The desired country code of the bank account information.
             * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
             * or {@code NL}.
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * <strong>Required.</strong> The desired country code of the bank account information.
             * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
             * or {@code NL}.
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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

        public enum RequestedAddressType implements ApiRequestParams.EnumParam {
          @SerializedName("aba")
          ABA("aba"),

          @SerializedName("iban")
          IBAN("iban"),

          @SerializedName("sepa")
          SEPA("sepa"),

          @SerializedName("sort_code")
          SORT_CODE("sort_code"),

          @SerializedName("spei")
          SPEI("spei"),

          @SerializedName("swift")
          SWIFT("swift"),

          @SerializedName("zengin")
          ZENGIN("zengin");

          @Getter(onMethod_ = {@Override})
          private final String value;

          RequestedAddressType(String value) {
            this.value = value;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("eu_bank_transfer")
          EU_BANK_TRANSFER("eu_bank_transfer"),

          @SerializedName("gb_bank_transfer")
          GB_BANK_TRANSFER("gb_bank_transfer"),

          @SerializedName("jp_bank_transfer")
          JP_BANK_TRANSFER("jp_bank_transfer"),

          @SerializedName("mx_bank_transfer")
          MX_BANK_TRANSFER("mx_bank_transfer"),

          @SerializedName("us_bank_transfer")
          US_BANK_TRANSFER("us_bank_transfer");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum FundingType implements ApiRequestParams.EnumParam {
        @SerializedName("bank_transfer")
        BANK_TRANSFER("bank_transfer");

        @Getter(onMethod_ = {@Override})
        private final String value;

        FundingType(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Eps {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Eps(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Eps build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Eps(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Eps#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Eps#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Eps.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Fpx {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Fpx(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Fpx build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Fpx(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Fpx#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Fpx#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Fpx.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Giropay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Giropay(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Giropay build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Giropay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Giropay#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Giropay#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Giropay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Grabpay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Grabpay(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Grabpay build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Grabpay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Grabpay#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Grabpay#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Grabpay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Ideal {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Ideal(Map<String, Object> extraParams, ApiRequestParams.EnumParam setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Ideal build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Ideal(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Ideal#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Ideal#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Ideal.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class InteracPresent {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private InteracPresent(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.InteracPresent build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.InteracPresent(
              this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentUpdateParams.PaymentMethodOptions.InteracPresent#extraParams} for the field
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
         * map. See {@link
         * PaymentIntentUpdateParams.PaymentMethodOptions.InteracPresent#extraParams} for the field
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
    public static class Klarna {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>If provided, this parameter will override the top-level {@code capture_method} when
       * finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter will unset the stored value for this payment method type.
       */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Preferred language of the Klarna authorization page that the customer is redirected to. */
      @SerializedName("preferred_locale")
      PreferredLocale preferredLocale;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Klarna(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          PreferredLocale preferredLocale,
          SetupFutureUsage setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.preferredLocale = preferredLocale;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private PreferredLocale preferredLocale;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Klarna build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Klarna(
              this.captureMethod, this.extraParams, this.preferredLocale, this.setupFutureUsage);
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.Klarna.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Klarna#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Klarna#extraParams} for
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
         * Preferred language of the Klarna authorization page that the customer is redirected to.
         */
        public Builder setPreferredLocale(
            PaymentIntentUpdateParams.PaymentMethodOptions.Klarna.PreferredLocale preferredLocale) {
          this.preferredLocale = preferredLocale;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Klarna.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum PreferredLocale implements ApiRequestParams.EnumParam {
        @SerializedName("cs-CZ")
        CS_CZ("cs-CZ"),

        @SerializedName("da-DK")
        DA_DK("da-DK"),

        @SerializedName("de-AT")
        DE_AT("de-AT"),

        @SerializedName("de-CH")
        DE_CH("de-CH"),

        @SerializedName("de-DE")
        DE_DE("de-DE"),

        @SerializedName("el-GR")
        EL_GR("el-GR"),

        @SerializedName("en-AT")
        EN_AT("en-AT"),

        @SerializedName("en-AU")
        EN_AU("en-AU"),

        @SerializedName("en-BE")
        EN_BE("en-BE"),

        @SerializedName("en-CA")
        EN_CA("en-CA"),

        @SerializedName("en-CH")
        EN_CH("en-CH"),

        @SerializedName("en-CZ")
        EN_CZ("en-CZ"),

        @SerializedName("en-DE")
        EN_DE("en-DE"),

        @SerializedName("en-DK")
        EN_DK("en-DK"),

        @SerializedName("en-ES")
        EN_ES("en-ES"),

        @SerializedName("en-FI")
        EN_FI("en-FI"),

        @SerializedName("en-FR")
        EN_FR("en-FR"),

        @SerializedName("en-GB")
        EN_GB("en-GB"),

        @SerializedName("en-GR")
        EN_GR("en-GR"),

        @SerializedName("en-IE")
        EN_IE("en-IE"),

        @SerializedName("en-IT")
        EN_IT("en-IT"),

        @SerializedName("en-NL")
        EN_NL("en-NL"),

        @SerializedName("en-NO")
        EN_NO("en-NO"),

        @SerializedName("en-NZ")
        EN_NZ("en-NZ"),

        @SerializedName("en-PL")
        EN_PL("en-PL"),

        @SerializedName("en-PT")
        EN_PT("en-PT"),

        @SerializedName("en-SE")
        EN_SE("en-SE"),

        @SerializedName("en-US")
        EN_US("en-US"),

        @SerializedName("es-ES")
        ES_ES("es-ES"),

        @SerializedName("es-US")
        ES_US("es-US"),

        @SerializedName("fi-FI")
        FI_FI("fi-FI"),

        @SerializedName("fr-BE")
        FR_BE("fr-BE"),

        @SerializedName("fr-CA")
        FR_CA("fr-CA"),

        @SerializedName("fr-CH")
        FR_CH("fr-CH"),

        @SerializedName("fr-FR")
        FR_FR("fr-FR"),

        @SerializedName("it-CH")
        IT_CH("it-CH"),

        @SerializedName("it-IT")
        IT_IT("it-IT"),

        @SerializedName("nb-NO")
        NB_NO("nb-NO"),

        @SerializedName("nl-BE")
        NL_BE("nl-BE"),

        @SerializedName("nl-NL")
        NL_NL("nl-NL"),

        @SerializedName("pl-PL")
        PL_PL("pl-PL"),

        @SerializedName("pt-PT")
        PT_PT("pt-PT"),

        @SerializedName("sv-FI")
        SV_FI("sv-FI"),

        @SerializedName("sv-SE")
        SV_SE("sv-SE");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PreferredLocale(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Konbini {
      /**
       * An optional 10 to 11 digit numeric-only string determining the confirmation code at
       * applicable convenience stores. Must not consist of only zeroes and could be rejected in
       * case of insufficient uniqueness. We recommend to use the customer's phone number.
       */
      @SerializedName("confirmation_number")
      Object confirmationNumber;

      /**
       * The number of calendar days (between 1 and 60) after which Konbini payment instructions
       * will expire. For example, if a PaymentIntent is confirmed with Konbini and {@code
       * expires_after_days} set to 2 on Monday JST, the instructions will expire on Wednesday
       * 23:59:59 JST. Defaults to 3 days.
       */
      @SerializedName("expires_after_days")
      Object expiresAfterDays;

      /**
       * The timestamp at which the Konbini payment instructions will expire. Only one of {@code
       * expires_after_days} or {@code expires_at} may be set.
       */
      @SerializedName("expires_at")
      Object expiresAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * A product descriptor of up to 22 characters, which will appear to customers at the
       * convenience store.
       */
      @SerializedName("product_description")
      Object productDescription;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Konbini(
          Object confirmationNumber,
          Object expiresAfterDays,
          Object expiresAt,
          Map<String, Object> extraParams,
          Object productDescription,
          SetupFutureUsage setupFutureUsage) {
        this.confirmationNumber = confirmationNumber;
        this.expiresAfterDays = expiresAfterDays;
        this.expiresAt = expiresAt;
        this.extraParams = extraParams;
        this.productDescription = productDescription;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object confirmationNumber;

        private Object expiresAfterDays;

        private Object expiresAt;

        private Map<String, Object> extraParams;

        private Object productDescription;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Konbini build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Konbini(
              this.confirmationNumber,
              this.expiresAfterDays,
              this.expiresAt,
              this.extraParams,
              this.productDescription,
              this.setupFutureUsage);
        }

        /**
         * An optional 10 to 11 digit numeric-only string determining the confirmation code at
         * applicable convenience stores. Must not consist of only zeroes and could be rejected in
         * case of insufficient uniqueness. We recommend to use the customer's phone number.
         */
        public Builder setConfirmationNumber(String confirmationNumber) {
          this.confirmationNumber = confirmationNumber;
          return this;
        }

        /**
         * An optional 10 to 11 digit numeric-only string determining the confirmation code at
         * applicable convenience stores. Must not consist of only zeroes and could be rejected in
         * case of insufficient uniqueness. We recommend to use the customer's phone number.
         */
        public Builder setConfirmationNumber(EmptyParam confirmationNumber) {
          this.confirmationNumber = confirmationNumber;
          return this;
        }

        /**
         * The number of calendar days (between 1 and 60) after which Konbini payment instructions
         * will expire. For example, if a PaymentIntent is confirmed with Konbini and {@code
         * expires_after_days} set to 2 on Monday JST, the instructions will expire on Wednesday
         * 23:59:59 JST. Defaults to 3 days.
         */
        public Builder setExpiresAfterDays(Long expiresAfterDays) {
          this.expiresAfterDays = expiresAfterDays;
          return this;
        }

        /**
         * The number of calendar days (between 1 and 60) after which Konbini payment instructions
         * will expire. For example, if a PaymentIntent is confirmed with Konbini and {@code
         * expires_after_days} set to 2 on Monday JST, the instructions will expire on Wednesday
         * 23:59:59 JST. Defaults to 3 days.
         */
        public Builder setExpiresAfterDays(EmptyParam expiresAfterDays) {
          this.expiresAfterDays = expiresAfterDays;
          return this;
        }

        /**
         * The timestamp at which the Konbini payment instructions will expire. Only one of {@code
         * expires_after_days} or {@code expires_at} may be set.
         */
        public Builder setExpiresAt(Long expiresAt) {
          this.expiresAt = expiresAt;
          return this;
        }

        /**
         * The timestamp at which the Konbini payment instructions will expire. Only one of {@code
         * expires_after_days} or {@code expires_at} may be set.
         */
        public Builder setExpiresAt(EmptyParam expiresAt) {
          this.expiresAt = expiresAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Konbini#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Konbini#extraParams} for
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
         * A product descriptor of up to 22 characters, which will appear to customers at the
         * convenience store.
         */
        public Builder setProductDescription(String productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /**
         * A product descriptor of up to 22 characters, which will appear to customers at the
         * convenience store.
         */
        public Builder setProductDescription(EmptyParam productDescription) {
          this.productDescription = productDescription;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Konbini.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Link {
      /**
       * Controls when the funds will be captured from the customer's account.
       *
       * <p>If provided, this parameter will override the top-level {@code capture_method} when
       * finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter will unset the stored value for this payment method type.
       */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Token used for persistent Link logins. */
      @SerializedName("persistent_token")
      Object persistentToken;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Link(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          Object persistentToken,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.persistentToken = persistentToken;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private Object persistentToken;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Link build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Link(
              this.captureMethod, this.extraParams, this.persistentToken, this.setupFutureUsage);
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.Link.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds will be captured from the customer's account.
         *
         * <p>If provided, this parameter will override the top-level {@code capture_method} when
         * finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter will unset the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Link#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Link#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Token used for persistent Link logins. */
        public Builder setPersistentToken(String persistentToken) {
          this.persistentToken = persistentToken;
          return this;
        }

        /** Token used for persistent Link logins. */
        public Builder setPersistentToken(EmptyParam persistentToken) {
          this.persistentToken = persistentToken;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Link.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Oxxo {
      /**
       * The number of calendar days before an OXXO voucher expires. For example, if you create an
       * OXXO voucher on Monday and you set expires_after_days to 2, the OXXO invoice will expire on
       * Wednesday at 23:59 America/Mexico_City time.
       */
      @SerializedName("expires_after_days")
      Long expiresAfterDays;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Oxxo(
          Long expiresAfterDays,
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage) {
        this.expiresAfterDays = expiresAfterDays;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long expiresAfterDays;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Oxxo build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Oxxo(
              this.expiresAfterDays, this.extraParams, this.setupFutureUsage);
        }

        /**
         * The number of calendar days before an OXXO voucher expires. For example, if you create an
         * OXXO voucher on Monday and you set expires_after_days to 2, the OXXO invoice will expire
         * on Wednesday at 23:59 America/Mexico_City time.
         */
        public Builder setExpiresAfterDays(Long expiresAfterDays) {
          this.expiresAfterDays = expiresAfterDays;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Oxxo#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Oxxo#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Oxxo.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class P24 {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      /** Confirm that the payer has accepted the P24 terms and conditions. */
      @SerializedName("tos_shown_and_accepted")
      Boolean tosShownAndAccepted;

      private P24(
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage,
          Boolean tosShownAndAccepted) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
        this.tosShownAndAccepted = tosShownAndAccepted;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        private Boolean tosShownAndAccepted;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.P24 build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.P24(
              this.extraParams, this.setupFutureUsage, this.tosShownAndAccepted);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.P24#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.P24#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.P24.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /** Confirm that the payer has accepted the P24 terms and conditions. */
        public Builder setTosShownAndAccepted(Boolean tosShownAndAccepted) {
          this.tosShownAndAccepted = tosShownAndAccepted;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Paynow {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Paynow(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Paynow build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Paynow(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Paynow#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Paynow#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Paynow.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Paypal {
      /** Controls when the funds will be captured from the customer's account. */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <a href="https://stripe.com/docs/payments/paypal/supported-locales">Preferred locale</a> of
       * the PayPal checkout page that the customer is redirected to.
       */
      @SerializedName("preferred_locale")
      PreferredLocale preferredLocale;

      /**
       * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
       * invoice ID. This must be a globally unique ID if you have configured in your PayPal
       * settings to block multiple payments per invoice ID.
       */
      @SerializedName("reference")
      Object reference;

      /**
       * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
       * invoice ID. This must be a globally unique ID if you have configured in your PayPal
       * settings to block multiple payments per invoice ID.
       */
      @SerializedName("reference_id")
      Object referenceId;

      /** The risk correlation ID for an on-session payment using a saved PayPal payment method. */
      @SerializedName("risk_correlation_id")
      Object riskCorrelationId;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Paypal(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          PreferredLocale preferredLocale,
          Object reference,
          Object referenceId,
          Object riskCorrelationId,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.preferredLocale = preferredLocale;
        this.reference = reference;
        this.referenceId = referenceId;
        this.riskCorrelationId = riskCorrelationId;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private PreferredLocale preferredLocale;

        private Object reference;

        private Object referenceId;

        private Object riskCorrelationId;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Paypal build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Paypal(
              this.captureMethod,
              this.extraParams,
              this.preferredLocale,
              this.reference,
              this.referenceId,
              this.riskCorrelationId,
              this.setupFutureUsage);
        }

        /** Controls when the funds will be captured from the customer's account. */
        public Builder setCaptureMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.Paypal.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /** Controls when the funds will be captured from the customer's account. */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Paypal#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Paypal#extraParams} for
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
         * <a href="https://stripe.com/docs/payments/paypal/supported-locales">Preferred locale</a>
         * of the PayPal checkout page that the customer is redirected to.
         */
        public Builder setPreferredLocale(
            PaymentIntentUpdateParams.PaymentMethodOptions.Paypal.PreferredLocale preferredLocale) {
          this.preferredLocale = preferredLocale;
          return this;
        }

        /**
         * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
         * invoice ID. This must be a globally unique ID if you have configured in your PayPal
         * settings to block multiple payments per invoice ID.
         */
        public Builder setReference(String reference) {
          this.reference = reference;
          return this;
        }

        /**
         * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
         * invoice ID. This must be a globally unique ID if you have configured in your PayPal
         * settings to block multiple payments per invoice ID.
         */
        public Builder setReference(EmptyParam reference) {
          this.reference = reference;
          return this;
        }

        /**
         * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
         * invoice ID. This must be a globally unique ID if you have configured in your PayPal
         * settings to block multiple payments per invoice ID.
         */
        public Builder setReferenceId(String referenceId) {
          this.referenceId = referenceId;
          return this;
        }

        /**
         * A reference of the PayPal transaction visible to customer which is mapped to PayPal's
         * invoice ID. This must be a globally unique ID if you have configured in your PayPal
         * settings to block multiple payments per invoice ID.
         */
        public Builder setReferenceId(EmptyParam referenceId) {
          this.referenceId = referenceId;
          return this;
        }

        /**
         * The risk correlation ID for an on-session payment using a saved PayPal payment method.
         */
        public Builder setRiskCorrelationId(String riskCorrelationId) {
          this.riskCorrelationId = riskCorrelationId;
          return this;
        }

        /**
         * The risk correlation ID for an on-session payment using a saved PayPal payment method.
         */
        public Builder setRiskCorrelationId(EmptyParam riskCorrelationId) {
          this.riskCorrelationId = riskCorrelationId;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Paypal.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }

      public enum PreferredLocale implements ApiRequestParams.EnumParam {
        @SerializedName("cs-CZ")
        CS_CZ("cs-CZ"),

        @SerializedName("da-DK")
        DA_DK("da-DK"),

        @SerializedName("de-AT")
        DE_AT("de-AT"),

        @SerializedName("de-DE")
        DE_DE("de-DE"),

        @SerializedName("de-LU")
        DE_LU("de-LU"),

        @SerializedName("el-GR")
        EL_GR("el-GR"),

        @SerializedName("en-GB")
        EN_GB("en-GB"),

        @SerializedName("en-US")
        EN_US("en-US"),

        @SerializedName("es-ES")
        ES_ES("es-ES"),

        @SerializedName("fi-FI")
        FI_FI("fi-FI"),

        @SerializedName("fr-BE")
        FR_BE("fr-BE"),

        @SerializedName("fr-FR")
        FR_FR("fr-FR"),

        @SerializedName("fr-LU")
        FR_LU("fr-LU"),

        @SerializedName("hu-HU")
        HU_HU("hu-HU"),

        @SerializedName("it-IT")
        IT_IT("it-IT"),

        @SerializedName("nl-BE")
        NL_BE("nl-BE"),

        @SerializedName("nl-NL")
        NL_NL("nl-NL"),

        @SerializedName("pl-PL")
        PL_PL("pl-PL"),

        @SerializedName("pt-PT")
        PT_PT("pt-PT"),

        @SerializedName("sk-SK")
        SK_SK("sk-SK"),

        @SerializedName("sv-SE")
        SV_SE("sv-SE");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PreferredLocale(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Pix {
      /**
       * The number of seconds (between 10 and 1209600) after which Pix payment will expire.
       * Defaults to 86400 seconds.
       */
      @SerializedName("expires_after_seconds")
      Long expiresAfterSeconds;

      /**
       * The timestamp at which the Pix expires (between 10 and 1209600 seconds in the future).
       * Defaults to 1 day in the future.
       */
      @SerializedName("expires_at")
      Long expiresAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Pix(
          Long expiresAfterSeconds,
          Long expiresAt,
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage) {
        this.expiresAfterSeconds = expiresAfterSeconds;
        this.expiresAt = expiresAt;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long expiresAfterSeconds;

        private Long expiresAt;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Pix build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Pix(
              this.expiresAfterSeconds, this.expiresAt, this.extraParams, this.setupFutureUsage);
        }

        /**
         * The number of seconds (between 10 and 1209600) after which Pix payment will expire.
         * Defaults to 86400 seconds.
         */
        public Builder setExpiresAfterSeconds(Long expiresAfterSeconds) {
          this.expiresAfterSeconds = expiresAfterSeconds;
          return this;
        }

        /**
         * The timestamp at which the Pix expires (between 10 and 1209600 seconds in the future).
         * Defaults to 1 day in the future.
         */
        public Builder setExpiresAt(Long expiresAt) {
          this.expiresAt = expiresAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Pix#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Pix#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Pix.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Promptpay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Promptpay(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Promptpay build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Promptpay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Promptpay#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Promptpay#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Promptpay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class SepaDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Additional fields for Mandate creation. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private SepaDebit(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit(
              this.extraParams, this.mandateOptions, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(
            PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      @Getter
      public static class MandateOptions {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private MandateOptions(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions build() {
            return new PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions(
                this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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
    public static class Sofort {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Language shown to the payer on redirect. */
      @SerializedName("preferred_language")
      ApiRequestParams.EnumParam preferredLanguage;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Sofort(
          Map<String, Object> extraParams,
          ApiRequestParams.EnumParam preferredLanguage,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.extraParams = extraParams;
        this.preferredLanguage = preferredLanguage;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam preferredLanguage;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Sofort build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Sofort(
              this.extraParams, this.preferredLanguage, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Sofort#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Sofort#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Language shown to the payer on redirect. */
        public Builder setPreferredLanguage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Sofort.PreferredLanguage
                preferredLanguage) {
          this.preferredLanguage = preferredLanguage;
          return this;
        }

        /** Language shown to the payer on redirect. */
        public Builder setPreferredLanguage(EmptyParam preferredLanguage) {
          this.preferredLanguage = preferredLanguage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Sofort.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum PreferredLanguage implements ApiRequestParams.EnumParam {
        @SerializedName("de")
        DE("de"),

        @SerializedName("en")
        EN("en"),

        @SerializedName("es")
        ES("es"),

        @SerializedName("fr")
        FR("fr"),

        @SerializedName("it")
        IT("it"),

        @SerializedName("nl")
        NL("nl"),

        @SerializedName("pl")
        PL("pl");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PreferredLanguage(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off_session")
        OFF_SESSION("off_session");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class UsBankAccount {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Additional fields for Financial Connections Session creation. */
      @SerializedName("financial_connections")
      FinancialConnections financialConnections;

      /** Additional fields for network related functions. */
      @SerializedName("networks")
      Networks networks;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /** Verification method for the intent. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private UsBankAccount(
          Map<String, Object> extraParams,
          FinancialConnections financialConnections,
          Networks networks,
          ApiRequestParams.EnumParam setupFutureUsage,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.financialConnections = financialConnections;
        this.networks = networks;
        this.setupFutureUsage = setupFutureUsage;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FinancialConnections financialConnections;

        private Networks networks;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount(
              this.extraParams,
              this.financialConnections,
              this.networks,
              this.setupFutureUsage,
              this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount#extraParams}
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Financial Connections Session creation. */
        public Builder setFinancialConnections(
            PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                financialConnections) {
          this.financialConnections = financialConnections;
          return this;
        }

        /** Additional fields for network related functions. */
        public Builder setNetworks(
            PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks networks) {
          this.networks = networks;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /** Verification method for the intent. */
        public Builder setVerificationMethod(
            PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      public static class FinancialConnections {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Customize manual entry behavior. */
        @SerializedName("manual_entry")
        ManualEntry manualEntry;

        /**
         * The list of permissions to request. If this parameter is passed, the {@code
         * payment_method} permission must be included. Valid permissions include: {@code balances},
         * {@code ownership}, {@code payment_method}, and {@code transactions}.
         */
        @SerializedName("permissions")
        List<
                PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .Permission>
            permissions;

        /** List of data features that you would like to retrieve upon account creation. */
        @SerializedName("prefetch")
        List<
                PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .Prefetch>
            prefetch;

        /**
         * For webview integrations only. Upon completing OAuth login in the native browser, the
         * user will be redirected to this URL to return to your app.
         */
        @SerializedName("return_url")
        Object returnUrl;

        private FinancialConnections(
            Map<String, Object> extraParams,
            ManualEntry manualEntry,
            List<
                    PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Permission>
                permissions,
            List<
                    PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Prefetch>
                prefetch,
            Object returnUrl) {
          this.extraParams = extraParams;
          this.manualEntry = manualEntry;
          this.permissions = permissions;
          this.prefetch = prefetch;
          this.returnUrl = returnUrl;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private ManualEntry manualEntry;

          private List<
                  PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Permission>
              permissions;

          private List<
                  PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Prefetch>
              prefetch;

          private Object returnUrl;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
              build() {
            return new PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                .FinancialConnections(
                this.extraParams,
                this.manualEntry,
                this.permissions,
                this.prefetch,
                this.returnUrl);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Customize manual entry behavior. */
          public Builder setManualEntry(
              PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .ManualEntry
                  manualEntry) {
            this.manualEntry = manualEntry;
            return this;
          }

          /**
           * Add an element to `permissions` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addPermission(
              PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Permission
                  element) {
            if (this.permissions == null) {
              this.permissions = new ArrayList<>();
            }
            this.permissions.add(element);
            return this;
          }

          /**
           * Add all elements to `permissions` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addAllPermission(
              List<
                      PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Permission>
                  elements) {
            if (this.permissions == null) {
              this.permissions = new ArrayList<>();
            }
            this.permissions.addAll(elements);
            return this;
          }

          /**
           * Add an element to `prefetch` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addPrefetch(
              PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Prefetch
                  element) {
            if (this.prefetch == null) {
              this.prefetch = new ArrayList<>();
            }
            this.prefetch.add(element);
            return this;
          }

          /**
           * Add all elements to `prefetch` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addAllPrefetch(
              List<
                      PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Prefetch>
                  elements) {
            if (this.prefetch == null) {
              this.prefetch = new ArrayList<>();
            }
            this.prefetch.addAll(elements);
            return this;
          }

          /**
           * For webview integrations only. Upon completing OAuth login in the native browser, the
           * user will be redirected to this URL to return to your app.
           */
          public Builder setReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
          }

          /**
           * For webview integrations only. Upon completing OAuth login in the native browser, the
           * user will be redirected to this URL to return to your app.
           */
          public Builder setReturnUrl(EmptyParam returnUrl) {
            this.returnUrl = returnUrl;
            return this;
          }
        }

        @Getter
        public static class ManualEntry {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Settings for configuring manual entry of account details.
           */
          @SerializedName("mode")
          Mode mode;

          private ManualEntry(Map<String, Object> extraParams, Mode mode) {
            this.extraParams = extraParams;
            this.mode = mode;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Mode mode;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .ManualEntry
                build() {
              return new PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections.ManualEntry(this.extraParams, this.mode);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.ManualEntry#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.ManualEntry#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /**
             * <strong>Required.</strong> Settings for configuring manual entry of account details.
             */
            public Builder setMode(
                PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                        .ManualEntry.Mode
                    mode) {
              this.mode = mode;
              return this;
            }
          }

          public enum Mode implements ApiRequestParams.EnumParam {
            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("custom")
            CUSTOM("custom");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Mode(String value) {
              this.value = value;
            }
          }
        }

        public enum Permission implements ApiRequestParams.EnumParam {
          @SerializedName("balances")
          BALANCES("balances"),

          @SerializedName("ownership")
          OWNERSHIP("ownership"),

          @SerializedName("payment_method")
          PAYMENT_METHOD("payment_method"),

          @SerializedName("transactions")
          TRANSACTIONS("transactions");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Permission(String value) {
            this.value = value;
          }
        }

        public enum Prefetch implements ApiRequestParams.EnumParam {
          @SerializedName("balances")
          BALANCES("balances"),

          @SerializedName("inferred_balances")
          INFERRED_BALANCES("inferred_balances"),

          @SerializedName("ownership")
          OWNERSHIP("ownership"),

          @SerializedName("transactions")
          TRANSACTIONS("transactions");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Prefetch(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class Networks {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Triggers validations to run across the selected networks. */
        @SerializedName("requested")
        List<PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
            requested;

        private Networks(
            Map<String, Object> extraParams,
            List<PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
                requested) {
          this.extraParams = extraParams;
          this.requested = requested;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<
                  PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
              requested;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks build() {
            return new PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#extraParams} for
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
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#extraParams} for
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
           * Add an element to `requested` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#requested} for
           * the field documentation.
           */
          public Builder addRequested(
              PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested
                  element) {
            if (this.requested == null) {
              this.requested = new ArrayList<>();
            }
            this.requested.add(element);
            return this;
          }

          /**
           * Add all elements to `requested` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#requested} for
           * the field documentation.
           */
          public Builder addAllRequested(
              List<PaymentIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
                  elements) {
            if (this.requested == null) {
              this.requested = new ArrayList<>();
            }
            this.requested.addAll(elements);
            return this;
          }
        }

        public enum Requested implements ApiRequestParams.EnumParam {
          @SerializedName("ach")
          ACH("ach"),

          @SerializedName("us_domestic_wire")
          US_DOMESTIC_WIRE("us_domestic_wire");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Requested(String value) {
            this.value = value;
          }
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

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

      public enum VerificationMethod implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("instant")
        INSTANT("instant"),

        @SerializedName("microdeposits")
        MICRODEPOSITS("microdeposits");

        @Getter(onMethod_ = {@Override})
        private final String value;

        VerificationMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class WechatPay {
      /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
      @SerializedName("app_id")
      Object appId;

      /** <strong>Required.</strong> The client type that the end customer will pay from */
      @SerializedName("client")
      Client client;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private WechatPay(
          Object appId,
          Client client,
          Map<String, Object> extraParams,
          SetupFutureUsage setupFutureUsage) {
        this.appId = appId;
        this.client = client;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object appId;

        private Client client;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.WechatPay build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.WechatPay(
              this.appId, this.client, this.extraParams, this.setupFutureUsage);
        }

        /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
        public Builder setAppId(String appId) {
          this.appId = appId;
          return this;
        }

        /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
        public Builder setAppId(EmptyParam appId) {
          this.appId = appId;
          return this;
        }

        /** <strong>Required.</strong> The client type that the end customer will pay from */
        public Builder setClient(
            PaymentIntentUpdateParams.PaymentMethodOptions.WechatPay.Client client) {
          this.client = client;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.WechatPay#extraParams} for
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.WechatPay#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.WechatPay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum Client implements ApiRequestParams.EnumParam {
        @SerializedName("android")
        ANDROID("android"),

        @SerializedName("ios")
        IOS("ios"),

        @SerializedName("web")
        WEB("web");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Client(String value) {
          this.value = value;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Zip {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>Providing this parameter will <a
       * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
       * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
       * required actions from the user are complete. If no Customer was provided, the payment
       * method can still be <a
       * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer after
       * the transaction completes.
       *
       * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
       * dynamically optimize your payment flow and comply with regional legislation and network
       * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
       *
       * <p>If {@code setup_future_usage} is already set and you are performing a request using a
       * publishable key, you may only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Zip(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.PaymentMethodOptions.Zip build() {
          return new PaymentIntentUpdateParams.PaymentMethodOptions.Zip(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Zip#extraParams} for the
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
         * map. See {@link PaymentIntentUpdateParams.PaymentMethodOptions.Zip#extraParams} for the
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>Providing this parameter will <a
         * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a>
         * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
         * required actions from the user are complete. If no Customer was provided, the payment
         * method can still be <a
         * href="https://stripe.com/docs/api/payment_methods/attach">attached</a> to a Customer
         * after the transaction completes.
         *
         * <p>When processing card payments, Stripe also uses {@code setup_future_usage} to
         * dynamically optimize your payment flow and comply with regional legislation and network
         * rules, such as <a href="https://stripe.com/docs/strong-customer-authentication">SCA</a>.
         *
         * <p>If {@code setup_future_usage} is already set and you are performing a request using a
         * publishable key, you may only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentUpdateParams.PaymentMethodOptions.Zip.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      public enum SetupFutureUsage implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SetupFutureUsage(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Shipping {
    /** <strong>Required.</strong> Shipping address. */
    @SerializedName("address")
    Address address;

    /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
    @SerializedName("carrier")
    Object carrier;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Recipient name. */
    @SerializedName("name")
    Object name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    Object phone;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("tracking_number")
    Object trackingNumber;

    private Shipping(
        Address address,
        Object carrier,
        Map<String, Object> extraParams,
        Object name,
        Object phone,
        Object trackingNumber) {
      this.address = address;
      this.carrier = carrier;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.trackingNumber = trackingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Object carrier;

      private Map<String, Object> extraParams;

      private Object name;

      private Object phone;

      private Object trackingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentUpdateParams.Shipping build() {
        return new PaymentIntentUpdateParams.Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** <strong>Required.</strong> Shipping address. */
      public Builder setAddress(PaymentIntentUpdateParams.Shipping.Address address) {
        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(EmptyParam carrier) {
        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentUpdateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link PaymentIntentUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** <strong>Required.</strong> Recipient name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(EmptyParam trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentUpdateParams.Shipping.Address build() {
          return new PaymentIntentUpdateParams.Shipping.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentUpdateParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link PaymentIntentUpdateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  public static class TransferData {
    /** The amount that will be transferred automatically when a charge succeeds. */
    @SerializedName("amount")
    Long amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Long amount, Map<String, Object> extraParams) {
      this.amount = amount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentUpdateParams.TransferData build() {
        return new PaymentIntentUpdateParams.TransferData(this.amount, this.extraParams);
      }

      /** The amount that will be transferred automatically when a charge succeeds. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentUpdateParams.TransferData#extraParams} for the field documentation.
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
       * See {@link PaymentIntentUpdateParams.TransferData#extraParams} for the field documentation.
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
