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
public class PaymentIntentCreateParams extends ApiRequestParams {
  /**
   * Amount intended to be collected by this PaymentIntent. A positive integer representing how much
   * to charge in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal)
   * (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum
   * amount is $0.50 US or [equivalent in charge
   * currency](https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts). The amount
   * value supports up to eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of the application fee (if any) that will be applied to the payment and transferred
   * to the application owner's Stripe account. For more information, see the PaymentIntents [use
   * case for connected accounts](https://stripe.com/docs/payments/connected-accounts).
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /** Controls when the funds will be captured from the customer's account. */
  @SerializedName("capture_method")
  CaptureMethod captureMethod;

  /**
   * Set to `true` to attempt to [confirm](https://stripe.com/docs/api/payment_intents/confirm) this
   * PaymentIntent immediately. This parameter defaults to `false`. When creating and confirming a
   * PaymentIntent at the same time, parameters available in the
   * [confirm](https://stripe.com/docs/api/payment_intents/confirm) API may also be provided.
   */
  @SerializedName("confirm")
  Boolean confirm;

  @SerializedName("confirmation_method")
  ConfirmationMethod confirmationMethod;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /**
   * ID of the Customer this PaymentIntent belongs to, if one exists.
   *
   * <p>If present, payment methods used with this PaymentIntent can only be attached to this
   * Customer, and payment methods attached to other Customers cannot be used with this
   * PaymentIntent.
   */
  @SerializedName("customer")
  String customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

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

  /**
   * ID of the mandate to be used for this payment. This parameter can only be used with
   * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
   */
  @SerializedName("mandate")
  String mandate;

  /**
   * This hash contains details about the Mandate to create. This parameter can only be used with
   * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
   */
  @SerializedName("mandate_data")
  MandateData mandateData;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Set to `true` to indicate that the customer is not in your checkout flow during this payment
   * attempt, and therefore is unable to authenticate. This parameter is intended for scenarios
   * where you collect card details and [charge them
   * later](https://stripe.com/docs/payments/cards/charging-saved-cards). This parameter can only be
   * used with
   * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
   */
  @SerializedName("off_session")
  Object offSession;

  /**
   * The Stripe account ID for which these funds are intended. For details, see the PaymentIntents
   * [use case for connected accounts](https://stripe.com/docs/payments/connected-accounts).
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * ID of the payment method (a PaymentMethod, Card, or [compatible
   * Source](https://stripe.com/docs/payments/payment-methods#compatibility) object) to attach to
   * this PaymentIntent.
   *
   * <p>If neither the `payment_method` parameter nor the `source` parameter are provided with
   * `confirm=true`, `source` will be automatically populated with `customer.default_source` to
   * improve the migration experience for users of the Charges API. We recommend that you explicitly
   * provide the `payment_method` going forward.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment-method-specific configuration for this PaymentIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. If this
   * is not provided, defaults to ["card"].
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /** Email address that the receipt for the resulting payment will be sent to. */
  @SerializedName("receipt_email")
  String receiptEmail;

  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on
   * the payment method's app or site. If you'd prefer to redirect to a mobile application, you can
   * alternatively supply an application URI scheme. This parameter can only be used with
   * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * If the PaymentIntent has a `payment_method` and a `customer` or if you're attaching a payment
   * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
   * the payment method to the customer. Defaults to `false`.
   *
   * <p>If the payment method is already saved to a customer, this does nothing. If this type of
   * payment method cannot be saved to a customer, the request will error.
   *
   * <p>_Note that saving a payment method using this parameter does not guarantee that the payment
   * method can be charged._ To ensure that only payment methods which can be charged are saved to a
   * customer, you can [manually
   * save](https://stripe.com/docs/api/customers/create#create_customer-source) the payment method
   * in response to the [`payment_intent.succeeded`
   * webhook](https://stripe.com/docs/api/events/types#event_types-payment_intent.succeeded).
   */
  @SerializedName("save_payment_method")
  Boolean savePaymentMethod;

  /**
   * Indicates that you intend to make future payments with this PaymentIntent's payment method.
   *
   * <p>If present, the payment method used with this PaymentIntent can be
   * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after the
   * transaction completes.
   *
   * <p>For more, learn to [save card details after a
   * payment](https://stripe.com/docs/payments/save-after-payment).
   *
   * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
   * regional legislation and network rules. For example, if your customer is impacted by
   * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will ensure
   * that they are authenticated while processing this PaymentIntent. You will then be able to
   * collect [off-session
   * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
   * for this customer.
   */
  @SerializedName("setup_future_usage")
  SetupFutureUsage setupFutureUsage;

  /** Shipping information for this PaymentIntent. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * This is a legacy field that will be removed in the future. It is the ID of the Source object to
   * attach to this PaymentIntent. Please use the `payment_method` field instead, which also
   * supports Cards and [compatible
   * Source](https://stripe.com/docs/payments/payment-methods#compatibility) objects.If neither the
   * `payment_method` parameter nor the `source` parameter are provided with `confirm=true`, this
   * field will be automatically populated with `customer.default_source` to improve the migration
   * experience for users of the Charges API. We recommend that you explicitly provide the `source`
   * or `payment_method` parameter going forward.
   */
  @SerializedName("source")
  String source;

  /**
   * For non-card charges, you can use this value as the complete description that appears on your
   * customers’ statements. Must contain at least one letter, maximum 22 characters.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card payment that customers see on their statements. Concatenated
   * with the prefix (shortened descriptor) or statement descriptor that’s set on the account to
   * form the complete statement descriptor. Maximum 22 characters for the concatenated descriptor.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * The parameters used to automatically create a Transfer when the payment succeeds. For more
   * information, see the PaymentIntents [use case for connected
   * accounts](https://stripe.com/docs/payments/connected-accounts).
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies the resulting payment as part of a group. See the PaymentIntents [use
   * case for connected accounts](https://stripe.com/docs/payments/connected-accounts) for details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  /**
   * Set to `true` only when using manual confirmation and the iOS or Android SDKs to handle
   * additional authentication steps.
   */
  @SerializedName("use_stripe_sdk")
  Boolean useStripeSdk;

  private PaymentIntentCreateParams(
      Long amount,
      Long applicationFeeAmount,
      CaptureMethod captureMethod,
      Boolean confirm,
      ConfirmationMethod confirmationMethod,
      String currency,
      String customer,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      String mandate,
      MandateData mandateData,
      Map<String, String> metadata,
      Object offSession,
      String onBehalfOf,
      String paymentMethod,
      PaymentMethodOptions paymentMethodOptions,
      List<String> paymentMethodTypes,
      String receiptEmail,
      String returnUrl,
      Boolean savePaymentMethod,
      SetupFutureUsage setupFutureUsage,
      Shipping shipping,
      String source,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData,
      String transferGroup,
      Boolean useStripeSdk) {
    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.captureMethod = captureMethod;
    this.confirm = confirm;
    this.confirmationMethod = confirmationMethod;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.mandate = mandate;
    this.mandateData = mandateData;
    this.metadata = metadata;
    this.offSession = offSession;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentMethodTypes = paymentMethodTypes;
    this.receiptEmail = receiptEmail;
    this.returnUrl = returnUrl;
    this.savePaymentMethod = savePaymentMethod;
    this.setupFutureUsage = setupFutureUsage;
    this.shipping = shipping;
    this.source = source;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.transferData = transferData;
    this.transferGroup = transferGroup;
    this.useStripeSdk = useStripeSdk;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Long applicationFeeAmount;

    private CaptureMethod captureMethod;

    private Boolean confirm;

    private ConfirmationMethod confirmationMethod;

    private String currency;

    private String customer;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String mandate;

    private MandateData mandateData;

    private Map<String, String> metadata;

    private Object offSession;

    private String onBehalfOf;

    private String paymentMethod;

    private PaymentMethodOptions paymentMethodOptions;

    private List<String> paymentMethodTypes;

    private String receiptEmail;

    private String returnUrl;

    private Boolean savePaymentMethod;

    private SetupFutureUsage setupFutureUsage;

    private Shipping shipping;

    private String source;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private TransferData transferData;

    private String transferGroup;

    private Boolean useStripeSdk;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentCreateParams build() {
      return new PaymentIntentCreateParams(
          this.amount,
          this.applicationFeeAmount,
          this.captureMethod,
          this.confirm,
          this.confirmationMethod,
          this.currency,
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.mandate,
          this.mandateData,
          this.metadata,
          this.offSession,
          this.onBehalfOf,
          this.paymentMethod,
          this.paymentMethodOptions,
          this.paymentMethodTypes,
          this.receiptEmail,
          this.returnUrl,
          this.savePaymentMethod,
          this.setupFutureUsage,
          this.shipping,
          this.source,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData,
          this.transferGroup,
          this.useStripeSdk);
    }

    /**
     * Amount intended to be collected by this PaymentIntent. A positive integer representing how
     * much to charge in the [smallest currency
     * unit](https://stripe.com/docs/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or
     * 100 to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent
     * in charge currency](https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts).
     * The amount value supports up to eight digits (e.g., a value of 99999999 for a USD charge of
     * $999,999.99).
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be applied to the payment and
     * transferred to the application owner's Stripe account. For more information, see the
     * PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/connected-accounts).
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /** Controls when the funds will be captured from the customer's account. */
    public Builder setCaptureMethod(CaptureMethod captureMethod) {
      this.captureMethod = captureMethod;
      return this;
    }

    /**
     * Set to `true` to attempt to [confirm](https://stripe.com/docs/api/payment_intents/confirm)
     * this PaymentIntent immediately. This parameter defaults to `false`. When creating and
     * confirming a PaymentIntent at the same time, parameters available in the
     * [confirm](https://stripe.com/docs/api/payment_intents/confirm) API may also be provided.
     */
    public Builder setConfirm(Boolean confirm) {
      this.confirm = confirm;
      return this;
    }

    public Builder setConfirmationMethod(ConfirmationMethod confirmationMethod) {
      this.confirmationMethod = confirmationMethod;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * ID of the Customer this PaymentIntent belongs to, if one exists.
     *
     * <p>If present, payment methods used with this PaymentIntent can only be attached to this
     * Customer, and payment methods attached to other Customers cannot be used with this
     * PaymentIntent.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCreateParams#expand} for the field documentation.
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
     * PaymentIntentCreateParams#expand} for the field documentation.
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
     * PaymentIntentCreateParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * ID of the mandate to be used for this payment. This parameter can only be used with
     * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
     */
    public Builder setMandate(String mandate) {
      this.mandate = mandate;
      return this;
    }

    /**
     * This hash contains details about the Mandate to create. This parameter can only be used with
     * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
     */
    public Builder setMandateData(MandateData mandateData) {
      this.mandateData = mandateData;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentCreateParams#metadata} for the field documentation.
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
     * See {@link PaymentIntentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Set to `true` to indicate that the customer is not in your checkout flow during this payment
     * attempt, and therefore is unable to authenticate. This parameter is intended for scenarios
     * where you collect card details and [charge them
     * later](https://stripe.com/docs/payments/cards/charging-saved-cards). This parameter can only
     * be used with
     * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
     */
    public Builder setOffSession(Boolean offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * Set to `true` to indicate that the customer is not in your checkout flow during this payment
     * attempt, and therefore is unable to authenticate. This parameter is intended for scenarios
     * where you collect card details and [charge them
     * later](https://stripe.com/docs/payments/cards/charging-saved-cards). This parameter can only
     * be used with
     * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
     */
    public Builder setOffSession(OffSession offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * The Stripe account ID for which these funds are intended. For details, see the PaymentIntents
     * [use case for connected accounts](https://stripe.com/docs/payments/connected-accounts).
     */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or [compatible
     * Source](https://stripe.com/docs/payments/payment-methods#compatibility) object) to attach to
     * this PaymentIntent.
     *
     * <p>If neither the `payment_method` parameter nor the `source` parameter are provided with
     * `confirm=true`, `source` will be automatically populated with `customer.default_source` to
     * improve the migration experience for users of the Charges API. We recommend that you
     * explicitly provide the `payment_method` going forward.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** Payment-method-specific configuration for this PaymentIntent. */
    public Builder setPaymentMethodOptions(PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCreateParams#paymentMethodTypes} for the field documentation.
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
     * {@link PaymentIntentCreateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addAllPaymentMethodType(List<String> elements) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(elements);
      return this;
    }

    /** Email address that the receipt for the resulting payment will be sent to. */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. If you'd prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter can only be used with
     * [`confirm=true`](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm).
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * If the PaymentIntent has a `payment_method` and a `customer` or if you're attaching a payment
     * method to the PaymentIntent in this request, you can pass `save_payment_method=true` to save
     * the payment method to the customer. Defaults to `false`.
     *
     * <p>If the payment method is already saved to a customer, this does nothing. If this type of
     * payment method cannot be saved to a customer, the request will error.
     *
     * <p>_Note that saving a payment method using this parameter does not guarantee that the
     * payment method can be charged._ To ensure that only payment methods which can be charged are
     * saved to a customer, you can [manually
     * save](https://stripe.com/docs/api/customers/create#create_customer-source) the payment method
     * in response to the [`payment_intent.succeeded`
     * webhook](https://stripe.com/docs/api/events/types#event_types-payment_intent.succeeded).
     */
    public Builder setSavePaymentMethod(Boolean savePaymentMethod) {
      this.savePaymentMethod = savePaymentMethod;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>If present, the payment method used with this PaymentIntent can be
     * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after the
     * transaction completes.
     *
     * <p>For more, learn to [save card details after a
     * payment](https://stripe.com/docs/payments/save-after-payment).
     *
     * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
     * regional legislation and network rules. For example, if your customer is impacted by
     * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will
     * ensure that they are authenticated while processing this PaymentIntent. You will then be able
     * to collect [off-session
     * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
     * for this customer.
     */
    public Builder setSetupFutureUsage(SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * This is a legacy field that will be removed in the future. It is the ID of the Source object
     * to attach to this PaymentIntent. Please use the `payment_method` field instead, which also
     * supports Cards and [compatible
     * Source](https://stripe.com/docs/payments/payment-methods#compatibility) objects.If neither
     * the `payment_method` parameter nor the `source` parameter are provided with `confirm=true`,
     * this field will be automatically populated with `customer.default_source` to improve the
     * migration experience for users of the Charges API. We recommend that you explicitly provide
     * the `source` or `payment_method` parameter going forward.
     */
    public Builder setSource(String source) {
      this.source = source;
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
     * The parameters used to automatically create a Transfer when the payment succeeds. For more
     * information, see the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/connected-accounts).
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. See the PaymentIntents
     * [use case for connected accounts](https://stripe.com/docs/payments/connected-accounts) for
     * details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }

    /**
     * Set to `true` only when using manual confirmation and the iOS or Android SDKs to handle
     * additional authentication steps.
     */
    public Builder setUseStripeSdk(Boolean useStripeSdk) {
      this.useStripeSdk = useStripeSdk;
      return this;
    }
  }

  @Getter
  public static class MandateData {
    /** This hash contains details about the customer acceptance of the Mandate. */
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

    private MandateData(CustomerAcceptance customerAcceptance, Map<String, Object> extraParams) {
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
      public MandateData build() {
        return new MandateData(this.customerAcceptance, this.extraParams);
      }

      /** This hash contains details about the customer acceptance of the Mandate. */
      public Builder setCustomerAcceptance(CustomerAcceptance customerAcceptance) {
        this.customerAcceptance = customerAcceptance;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.MandateData#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.MandateData#extraParams} for the field documentation.
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
      /** The time at which the customer accepted the Mandate. */
      @SerializedName("accepted_at")
      Long acceptedAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * If this is a Mandate accepted offline, this hash contains details about the offline
       * acceptance.
       */
      @SerializedName("offline")
      Offline offline;

      /**
       * If this is a Mandate accepted online, this hash contains details about the online
       * acceptance.
       */
      @SerializedName("online")
      Online online;

      /**
       * The type of customer acceptance information included with the Mandate. One of `online` or
       * `offline`.
       */
      @SerializedName("type")
      Type type;

      private CustomerAcceptance(
          Long acceptedAt,
          Map<String, Object> extraParams,
          Offline offline,
          Online online,
          Type type) {
        this.acceptedAt = acceptedAt;
        this.extraParams = extraParams;
        this.offline = offline;
        this.online = online;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long acceptedAt;

        private Map<String, Object> extraParams;

        private Offline offline;

        private Online online;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerAcceptance build() {
          return new CustomerAcceptance(
              this.acceptedAt, this.extraParams, this.offline, this.online, this.type);
        }

        /** The time at which the customer accepted the Mandate. */
        public Builder setAcceptedAt(Long acceptedAt) {
          this.acceptedAt = acceptedAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.MandateData.CustomerAcceptance#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.MandateData.CustomerAcceptance#extraParams} for
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
         * If this is a Mandate accepted offline, this hash contains details about the offline
         * acceptance.
         */
        public Builder setOffline(Offline offline) {
          this.offline = offline;
          return this;
        }

        /**
         * If this is a Mandate accepted online, this hash contains details about the online
         * acceptance.
         */
        public Builder setOnline(Online online) {
          this.online = online;
          return this;
        }

        /**
         * The type of customer acceptance information included with the Mandate. One of `online` or
         * `offline`.
         */
        public Builder setType(Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Offline {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Offline(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public Offline build() {
            return new Offline(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.MandateData.CustomerAcceptance.Offline#extraParams} for the
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
           * PaymentIntentCreateParams.MandateData.CustomerAcceptance.Offline#extraParams} for the
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
        String ipAddress;

        /** The user agent of the browser from which the Mandate was accepted by the customer. */
        @SerializedName("user_agent")
        String userAgent;

        private Online(Map<String, Object> extraParams, String ipAddress, String userAgent) {
          this.extraParams = extraParams;
          this.ipAddress = ipAddress;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String ipAddress;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public Online build() {
            return new Online(this.extraParams, this.ipAddress, this.userAgent);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.MandateData.CustomerAcceptance.Online#extraParams} for the
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
           * PaymentIntentCreateParams.MandateData.CustomerAcceptance.Online#extraParams} for the
           * field documentation.
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

          /** The user agent of the browser from which the Mandate was accepted by the customer. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("offline")
        OFFLINE("offline"),

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
  public static class PaymentMethodOptions {
    /** Configuration for any card payments attempted on this PaymentIntent. */
    @SerializedName("card")
    Card card;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private PaymentMethodOptions(Card card, Map<String, Object> extraParams) {
      this.card = card;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Card card;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodOptions build() {
        return new PaymentMethodOptions(this.card, this.extraParams);
      }

      /** Configuration for any card payments attempted on this PaymentIntent. */
      public Builder setCard(Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.PaymentMethodOptions#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.PaymentMethodOptions#extraParams} for the field
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
    public static class Card {
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
       * <p>For more information, see the [installments integration
       * guide](https://stripe.com/docs/payments/installments).
       */
      @SerializedName("installments")
      Installments installments;

      /**
       * When specified, this parameter indicates that a transaction will be marked as MOTO (Mail
       * Order Telephone Order) and thus out of scope for SCA. This parameter can only be provided
       * during confirmation.
       */
      @SerializedName("moto")
      Boolean moto;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and [other
       * requirements](https://stripe.com/docs/strong-customer-authentication). However, if you wish
       * to request 3D Secure based on logic from your own fraud engine, provide this option.
       * Permitted values include: `automatic` or `any`. If not provided, defaults to `automatic`.
       * Read our guide on [manually requesting 3D
       * Secure](https://stripe.com/docs/payments/3d-secure#manual-three-ds) for more information on
       * how this configuration interacts with Radar and our SCA Engine.
       */
      @SerializedName("request_three_d_secure")
      RequestThreeDSecure requestThreeDSecure;

      private Card(
          Map<String, Object> extraParams,
          Installments installments,
          Boolean moto,
          RequestThreeDSecure requestThreeDSecure) {
        this.extraParams = extraParams;
        this.installments = installments;
        this.moto = moto;
        this.requestThreeDSecure = requestThreeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Installments installments;

        private Boolean moto;

        private RequestThreeDSecure requestThreeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public Card build() {
          return new Card(this.extraParams, this.installments, this.moto, this.requestThreeDSecure);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Card#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Card#extraParams} for the
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
         * <p>For more information, see the [installments integration
         * guide](https://stripe.com/docs/payments/installments).
         */
        public Builder setInstallments(Installments installments) {
          this.installments = installments;
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
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and [other
         * requirements](https://stripe.com/docs/strong-customer-authentication). However, if you
         * wish to request 3D Secure based on logic from your own fraud engine, provide this option.
         * Permitted values include: `automatic` or `any`. If not provided, defaults to `automatic`.
         * Read our guide on [manually requesting 3D
         * Secure](https://stripe.com/docs/payments/3d-secure#manual-three-ds) for more information
         * on how this configuration interacts with Radar and our SCA Engine.
         */
        public Builder setRequestThreeDSecure(RequestThreeDSecure requestThreeDSecure) {
          this.requestThreeDSecure = requestThreeDSecure;
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
          public Installments build() {
            return new Installments(this.enabled, this.extraParams, this.plan);
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments#extraParams} for the
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments#extraParams} for the
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
          public Builder setPlan(Plan plan) {
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
           * For `fixed_count` installment plans, this is the number of installment payments your
           * customer will make to their credit card.
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
           * For `fixed_count` installment plans, this is the interval between installment payments
           * your customer will make to their credit card. One of `month`.
           */
          @SerializedName("interval")
          Interval interval;

          /** Type of installment plan, one of `fixed_count`. */
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
            public Plan build() {
              return new Plan(this.count, this.extraParams, this.interval, this.type);
            }

            /**
             * For `fixed_count` installment plans, this is the number of installment payments your
             * customer will make to their credit card.
             */
            public Builder setCount(Long count) {
              this.count = count;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
             * PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
             * For `fixed_count` installment plans, this is the interval between installment
             * payments your customer will make to their credit card. One of `month`.
             */
            public Builder setInterval(Interval interval) {
              this.interval = interval;
              return this;
            }

            /** Type of installment plan, one of `fixed_count`. */
            public Builder setType(Type type) {
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
    }
  }

  @Getter
  public static class Shipping {
    /** Shipping address. */
    @SerializedName("address")
    Address address;

    /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
    @SerializedName("carrier")
    String carrier;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Recipient name. */
    @SerializedName("name")
    String name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    String phone;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("tracking_number")
    String trackingNumber;

    private Shipping(
        Address address,
        String carrier,
        Map<String, Object> extraParams,
        String name,
        String phone,
        String trackingNumber) {
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

      private String carrier;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      private String trackingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(String phone) {
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
    }

    @Getter
    public static class Address {
      @SerializedName("city")
      String city;

      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
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
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public Address build() {
          return new Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link PaymentIntentCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  public static class TransferData {
    /**
     * The amount that will be transferred automatically when a charge succeeds. The amount is
     * capped at the total transaction amount and if no amount is set, the full amount is
     * transferred.
     *
     * <p>If you intend to collect a fee and you need a more robust reporting experience, using
     * [application_fee_amount](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-application_fee_amount)
     * might be a better fit for your integration.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * If specified, successful charges will be attributed to the destination account for tax
     * reporting, and the funds from charges will be transferred to the destination account. The ID
     * of the resulting transfer will be returned on the successful charge's `transfer` field.
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
      public TransferData build() {
        return new TransferData(this.amount, this.destination, this.extraParams);
      }

      /**
       * The amount that will be transferred automatically when a charge succeeds. The amount is
       * capped at the total transaction amount and if no amount is set, the full amount is
       * transferred.
       *
       * <p>If you intend to collect a fee and you need a more robust reporting experience, using
       * [application_fee_amount](https://stripe.com/docs/api/payment_intents/create#create_payment_intent-application_fee_amount)
       * might be a better fit for your integration.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * If specified, successful charges will be attributed to the destination account for tax
       * reporting, and the funds from charges will be transferred to the destination account. The
       * ID of the resulting transfer will be returned on the successful charge's `transfer` field.
       */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.TransferData#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.TransferData#extraParams} for the field documentation.
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

    @SerializedName("manual")
    MANUAL("manual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CaptureMethod(String value) {
      this.value = value;
    }
  }

  public enum ConfirmationMethod implements ApiRequestParams.EnumParam {
    @SerializedName("automatic")
    AUTOMATIC("automatic"),

    @SerializedName("manual")
    MANUAL("manual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ConfirmationMethod(String value) {
      this.value = value;
    }
  }

  public enum OffSession implements ApiRequestParams.EnumParam {
    @SerializedName("one_off")
    ONE_OFF("one_off"),

    @SerializedName("recurring")
    RECURRING("recurring");

    @Getter(onMethod_ = {@Override})
    private final String value;

    OffSession(String value) {
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
