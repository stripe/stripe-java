// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentIntentCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Amount intended to be collected by this PaymentIntent. A positive
   * integer representing how much to charge in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> (e.g., 100
   * cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum amount is
   * $0.50 US or <a
   * href="https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts">equivalent in
   * charge currency</a>. The amount value supports up to eight digits (e.g., a value of 99999999
   * for a USD charge of $999,999.99).
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. The amount of the application fee
   * collected will be capped at the total amount captured. For more information, see the
   * PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case for
   * connected accounts</a>.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * When you enable this parameter, this PaymentIntent accepts payment methods that you enable in
   * the Dashboard and that are compatible with this PaymentIntent's other parameters.
   */
  @SerializedName("automatic_payment_methods")
  AutomaticPaymentMethods automaticPaymentMethods;

  /** Controls when the funds will be captured from the customer's account. */
  @SerializedName("capture_method")
  CaptureMethod captureMethod;

  /**
   * Set to {@code true} to attempt to <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">confirm this PaymentIntent</a>
   * immediately. This parameter defaults to {@code false}. When creating and confirming a
   * PaymentIntent at the same time, you can also provide the parameters available in the <a
   * href="https://stripe.com/docs/api/payment_intents/confirm">Confirm API</a>.
   */
  @SerializedName("confirm")
  Boolean confirm;

  /**
   * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer
   * action to confirm the payment.
   */
  @SerializedName("confirmation_method")
  ConfirmationMethod confirmationMethod;

  /**
   * ID of the ConfirmationToken used to confirm this PaymentIntent.
   *
   * <p>If the provided ConfirmationToken contains properties that are also being provided in this
   * request, such as {@code payment_method}, then the values in this request will take precedence.
   */
  @SerializedName("confirmation_token")
  String confirmationToken;

  /**
   * <strong>Required.</strong> Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * ID of the Customer this PaymentIntent belongs to, if one exists.
   *
   * <p>Payment methods attached to other Customers cannot be used with this PaymentIntent.
   *
   * <p>If <a
   * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>
   * is set and this PaymentIntent's payment method is not {@code card_present}, then the payment
   * method attaches to the Customer after the PaymentIntent has been confirmed and any required
   * actions from the user are complete. If the payment method is {@code card_present} and isn't a
   * digital wallet, then a <a
   * href="https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
   * payment method representing the card is created and attached to the Customer instead.
   */
  @SerializedName("customer")
  String customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * Set to {@code true} to fail the payment attempt if the PaymentIntent transitions into {@code
   * requires_action}. Use this parameter for simpler integrations that don't handle customer
   * actions, such as <a
   * href="https://stripe.com/docs/payments/save-card-without-authentication">saving cards without
   * authentication</a>. This parameter can only be used with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
   * confirm=true}</a>.
   */
  @SerializedName("error_on_requires_action")
  Boolean errorOnRequiresAction;

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
   * ID of the mandate that's used for this payment. This parameter can only be used with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
   * confirm=true}</a>.
   */
  @SerializedName("mandate")
  String mandate;

  /**
   * This hash contains details about the Mandate to create. This parameter can only be used with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
   * confirm=true}</a>.
   */
  @SerializedName("mandate_data")
  Object mandateData;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Set to {@code true} to indicate that the customer isn't in your checkout flow during this
   * payment attempt and can't authenticate. Use this parameter in scenarios where you collect card
   * details and <a href="https://stripe.com/docs/payments/cards/charging-saved-cards">charge them
   * later</a>. This parameter can only be used with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
   * confirm=true}</a>.
   */
  @SerializedName("off_session")
  Object offSession;

  /**
   * The Stripe account ID that these funds are intended for. Learn more about the <a
   * href="https://stripe.com/docs/payments/connected-accounts">use case for connected accounts</a>.
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * ID of the payment method (a PaymentMethod, Card, or <a
   * href="https://stripe.com/docs/payments/payment-methods#compatibility">compatible Source</a>
   * object) to attach to this PaymentIntent.
   *
   * <p>If you don't provide the {@code payment_method} parameter or the {@code source} parameter
   * with {@code confirm=true}, {@code source} automatically populates with {@code
   * customer.default_source} to improve migration for users of the Charges API. We recommend that
   * you explicitly provide the {@code payment_method} moving forward. If the payment method is
   * attached to a Customer, you must also provide the ID of that Customer as the <a
   * href="https://stripe.com/docs/api#create_payment_intent-customer">customer</a> parameter of
   * this PaymentIntent. end
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * The ID of the <a href="https://stripe.com/docs/api/payment_method_configurations">payment
   * method configuration</a> to use with this PaymentIntent.
   */
  @SerializedName("payment_method_configuration")
  String paymentMethodConfiguration;

  /**
   * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will
   * appear in the <a
   * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-payment_method">payment_method</a>
   * property on the PaymentIntent.
   */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** Payment method-specific configuration for this PaymentIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * The list of payment method types (for example, a card) that this PaymentIntent can use. If you
   * don't provide this, Stripe will dynamically show relevant payment methods from your <a
   * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>. A
   * list of valid payment method types can be found <a
   * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-type">here</a>.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /**
   * Options to configure Radar. Learn more about <a
   * href="https://stripe.com/docs/radar/radar-session">Radar Sessions</a>.
   */
  @SerializedName("radar_options")
  RadarOptions radarOptions;

  /**
   * Email address to send the receipt to. If you specify {@code receipt_email} for a payment in
   * live mode, you send a receipt regardless of your <a
   * href="https://dashboard.stripe.com/account/emails">email settings</a>.
   */
  @SerializedName("receipt_email")
  String receiptEmail;

  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on
   * the payment method's app or site. If you'd prefer to redirect to a mobile application, you can
   * alternatively supply an application URI scheme. This parameter can only be used with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
   * confirm=true}</a>.
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * Indicates that you intend to make future payments with this PaymentIntent's payment method.
   *
   * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
   * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
   * Customer after the PaymentIntent is confirmed and the customer completes any required actions.
   * If you don't provide a Customer, you can still <a
   * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
   * Customer after the transaction completes.
   *
   * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates and
   * attaches a <a
   * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
   * payment method representing the card to the Customer instead.
   *
   * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
   * with regional legislation and network rules, such as <a
   * href="https://stripe.com/strong-customer-authentication">SCA</a>.
   */
  @SerializedName("setup_future_usage")
  SetupFutureUsage setupFutureUsage;

  /** Shipping information for this PaymentIntent. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card
   * charge. This value overrides the account's default statement descriptor. For information about
   * requirements, including the 22-character limit, see <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
   * Descriptor docs</a>.
   *
   * <p>Setting this value for a card charge returns an error. For card charges, set the <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
   * instead.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card charge. Concatenated to the account's <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer's
   * statement.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * The parameters that you can use to automatically create a Transfer. Learn more about the <a
   * href="https://stripe.com/docs/payments/connected-accounts">use case for connected accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies the resulting payment as part of a group. Learn more about the <a
   * href="https://stripe.com/docs/connect/separate-charges-and-transfers">use case for connected
   * accounts</a>.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  /**
   * Set to {@code true} when confirming server-side and using Stripe.js, iOS, or Android
   * client-side SDKs to handle the next actions.
   */
  @SerializedName("use_stripe_sdk")
  Boolean useStripeSdk;

  private PaymentIntentCreateParams(
      Long amount,
      Long applicationFeeAmount,
      AutomaticPaymentMethods automaticPaymentMethods,
      CaptureMethod captureMethod,
      Boolean confirm,
      ConfirmationMethod confirmationMethod,
      String confirmationToken,
      String currency,
      String customer,
      String description,
      Boolean errorOnRequiresAction,
      List<String> expand,
      Map<String, Object> extraParams,
      String mandate,
      Object mandateData,
      Map<String, String> metadata,
      Object offSession,
      String onBehalfOf,
      String paymentMethod,
      String paymentMethodConfiguration,
      PaymentMethodData paymentMethodData,
      PaymentMethodOptions paymentMethodOptions,
      List<String> paymentMethodTypes,
      RadarOptions radarOptions,
      String receiptEmail,
      String returnUrl,
      SetupFutureUsage setupFutureUsage,
      Shipping shipping,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData,
      String transferGroup,
      Boolean useStripeSdk) {
    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.automaticPaymentMethods = automaticPaymentMethods;
    this.captureMethod = captureMethod;
    this.confirm = confirm;
    this.confirmationMethod = confirmationMethod;
    this.confirmationToken = confirmationToken;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.errorOnRequiresAction = errorOnRequiresAction;
    this.expand = expand;
    this.extraParams = extraParams;
    this.mandate = mandate;
    this.mandateData = mandateData;
    this.metadata = metadata;
    this.offSession = offSession;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.paymentMethodConfiguration = paymentMethodConfiguration;
    this.paymentMethodData = paymentMethodData;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentMethodTypes = paymentMethodTypes;
    this.radarOptions = radarOptions;
    this.receiptEmail = receiptEmail;
    this.returnUrl = returnUrl;
    this.setupFutureUsage = setupFutureUsage;
    this.shipping = shipping;
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

    private AutomaticPaymentMethods automaticPaymentMethods;

    private CaptureMethod captureMethod;

    private Boolean confirm;

    private ConfirmationMethod confirmationMethod;

    private String confirmationToken;

    private String currency;

    private String customer;

    private String description;

    private Boolean errorOnRequiresAction;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String mandate;

    private Object mandateData;

    private Map<String, String> metadata;

    private Object offSession;

    private String onBehalfOf;

    private String paymentMethod;

    private String paymentMethodConfiguration;

    private PaymentMethodData paymentMethodData;

    private PaymentMethodOptions paymentMethodOptions;

    private List<String> paymentMethodTypes;

    private RadarOptions radarOptions;

    private String receiptEmail;

    private String returnUrl;

    private SetupFutureUsage setupFutureUsage;

    private Shipping shipping;

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
          this.automaticPaymentMethods,
          this.captureMethod,
          this.confirm,
          this.confirmationMethod,
          this.confirmationToken,
          this.currency,
          this.customer,
          this.description,
          this.errorOnRequiresAction,
          this.expand,
          this.extraParams,
          this.mandate,
          this.mandateData,
          this.metadata,
          this.offSession,
          this.onBehalfOf,
          this.paymentMethod,
          this.paymentMethodConfiguration,
          this.paymentMethodData,
          this.paymentMethodOptions,
          this.paymentMethodTypes,
          this.radarOptions,
          this.receiptEmail,
          this.returnUrl,
          this.setupFutureUsage,
          this.shipping,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData,
          this.transferGroup,
          this.useStripeSdk);
    }

    /**
     * <strong>Required.</strong> Amount intended to be collected by this PaymentIntent. A positive
     * integer representing how much to charge in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> (e.g., 100
     * cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum amount is
     * $0.50 US or <a
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
     * application fee collected will be capped at the total amount captured. For more information,
     * see the PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case
     * for connected accounts</a>.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * When you enable this parameter, this PaymentIntent accepts payment methods that you enable in
     * the Dashboard and that are compatible with this PaymentIntent's other parameters.
     */
    public Builder setAutomaticPaymentMethods(
        PaymentIntentCreateParams.AutomaticPaymentMethods automaticPaymentMethods) {
      this.automaticPaymentMethods = automaticPaymentMethods;
      return this;
    }

    /** Controls when the funds will be captured from the customer's account. */
    public Builder setCaptureMethod(PaymentIntentCreateParams.CaptureMethod captureMethod) {
      this.captureMethod = captureMethod;
      return this;
    }

    /**
     * Set to {@code true} to attempt to <a
     * href="https://stripe.com/docs/api/payment_intents/confirm">confirm this PaymentIntent</a>
     * immediately. This parameter defaults to {@code false}. When creating and confirming a
     * PaymentIntent at the same time, you can also provide the parameters available in the <a
     * href="https://stripe.com/docs/api/payment_intents/confirm">Confirm API</a>.
     */
    public Builder setConfirm(Boolean confirm) {
      this.confirm = confirm;
      return this;
    }

    /**
     * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer
     * action to confirm the payment.
     */
    public Builder setConfirmationMethod(
        PaymentIntentCreateParams.ConfirmationMethod confirmationMethod) {
      this.confirmationMethod = confirmationMethod;
      return this;
    }

    /**
     * ID of the ConfirmationToken used to confirm this PaymentIntent.
     *
     * <p>If the provided ConfirmationToken contains properties that are also being provided in this
     * request, such as {@code payment_method}, then the values in this request will take
     * precedence.
     */
    public Builder setConfirmationToken(String confirmationToken) {
      this.confirmationToken = confirmationToken;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * ID of the Customer this PaymentIntent belongs to, if one exists.
     *
     * <p>Payment methods attached to other Customers cannot be used with this PaymentIntent.
     *
     * <p>If <a
     * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>
     * is set and this PaymentIntent's payment method is not {@code card_present}, then the payment
     * method attaches to the Customer after the PaymentIntent has been confirmed and any required
     * actions from the user are complete. If the payment method is {@code card_present} and isn't a
     * digital wallet, then a <a
     * href="https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
     * payment method representing the card is created and attached to the Customer instead.
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
     * Set to {@code true} to fail the payment attempt if the PaymentIntent transitions into {@code
     * requires_action}. Use this parameter for simpler integrations that don't handle customer
     * actions, such as <a
     * href="https://stripe.com/docs/payments/save-card-without-authentication">saving cards without
     * authentication</a>. This parameter can only be used with <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setErrorOnRequiresAction(Boolean errorOnRequiresAction) {
      this.errorOnRequiresAction = errorOnRequiresAction;
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
     * ID of the mandate that's used for this payment. This parameter can only be used with <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setMandate(String mandate) {
      this.mandate = mandate;
      return this;
    }

    /**
     * This hash contains details about the Mandate to create. This parameter can only be used with
     * <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setMandateData(PaymentIntentCreateParams.MandateData mandateData) {
      this.mandateData = mandateData;
      return this;
    }

    /**
     * This hash contains details about the Mandate to create. This parameter can only be used with
     * <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setMandateData(EmptyParam mandateData) {
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
     * Set to {@code true} to indicate that the customer isn't in your checkout flow during this
     * payment attempt and can't authenticate. Use this parameter in scenarios where you collect
     * card details and <a href="https://stripe.com/docs/payments/cards/charging-saved-cards">charge
     * them later</a>. This parameter can only be used with <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setOffSession(Boolean offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * Set to {@code true} to indicate that the customer isn't in your checkout flow during this
     * payment attempt and can't authenticate. Use this parameter in scenarios where you collect
     * card details and <a href="https://stripe.com/docs/payments/cards/charging-saved-cards">charge
     * them later</a>. This parameter can only be used with <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setOffSession(PaymentIntentCreateParams.OffSession offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * The Stripe account ID that these funds are intended for. Learn more about the <a
     * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a>.
     */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or <a
     * href="https://stripe.com/docs/payments/payment-methods#compatibility">compatible Source</a>
     * object) to attach to this PaymentIntent.
     *
     * <p>If you don't provide the {@code payment_method} parameter or the {@code source} parameter
     * with {@code confirm=true}, {@code source} automatically populates with {@code
     * customer.default_source} to improve migration for users of the Charges API. We recommend that
     * you explicitly provide the {@code payment_method} moving forward. If the payment method is
     * attached to a Customer, you must also provide the ID of that Customer as the <a
     * href="https://stripe.com/docs/api#create_payment_intent-customer">customer</a> parameter of
     * this PaymentIntent. end
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * The ID of the <a href="https://stripe.com/docs/api/payment_method_configurations">payment
     * method configuration</a> to use with this PaymentIntent.
     */
    public Builder setPaymentMethodConfiguration(String paymentMethodConfiguration) {
      this.paymentMethodConfiguration = paymentMethodConfiguration;
      return this;
    }

    /**
     * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will
     * appear in the <a
     * href="https://stripe.com/docs/api/payment_intents/object#payment_intent_object-payment_method">payment_method</a>
     * property on the PaymentIntent.
     */
    public Builder setPaymentMethodData(
        PaymentIntentCreateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** Payment method-specific configuration for this PaymentIntent. */
    public Builder setPaymentMethodOptions(
        PaymentIntentCreateParams.PaymentMethodOptions paymentMethodOptions) {
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

    /**
     * Options to configure Radar. Learn more about <a
     * href="https://stripe.com/docs/radar/radar-session">Radar Sessions</a>.
     */
    public Builder setRadarOptions(PaymentIntentCreateParams.RadarOptions radarOptions) {
      this.radarOptions = radarOptions;
      return this;
    }

    /**
     * Email address to send the receipt to. If you specify {@code receipt_email} for a payment in
     * live mode, you send a receipt regardless of your <a
     * href="https://dashboard.stripe.com/account/emails">email settings</a>.
     */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. If you'd prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter can only be used with <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
     * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
     * Customer after the PaymentIntent is confirmed and the customer completes any required
     * actions. If you don't provide a Customer, you can still <a
     * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
     * Customer after the transaction completes.
     *
     * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
     * and attaches a <a
     * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
     * payment method representing the card to the Customer instead.
     *
     * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
     * with regional legislation and network rules, such as <a
     * href="https://stripe.com/strong-customer-authentication">SCA</a>.
     */
    public Builder setSetupFutureUsage(
        PaymentIntentCreateParams.SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(PaymentIntentCreateParams.Shipping shipping) {
      this.shipping = shipping;
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
     * The parameters that you can use to automatically create a Transfer. Learn more about the <a
     * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a>.
     */
    public Builder setTransferData(PaymentIntentCreateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. Learn more about the <a
     * href="https://stripe.com/docs/connect/separate-charges-and-transfers">use case for connected
     * accounts</a>.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }

    /**
     * Set to {@code true} when confirming server-side and using Stripe.js, iOS, or Android
     * client-side SDKs to handle the next actions.
     */
    public Builder setUseStripeSdk(Boolean useStripeSdk) {
      this.useStripeSdk = useStripeSdk;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticPaymentMethods {
    /**
     * Controls whether this PaymentIntent will accept redirect-based payment methods.
     *
     * <p>Redirect-based payment methods may require your customer to be redirected to a payment
     * method's app or site for authentication or additional steps. To <a
     * href="https://stripe.com/docs/api/payment_intents/confirm">confirm</a> this PaymentIntent,
     * you may be required to provide a {@code return_url} to redirect customers back to your site
     * after they authenticate or complete the payment.
     */
    @SerializedName("allow_redirects")
    AllowRedirects allowRedirects;

    /** <strong>Required.</strong> Whether this feature is enabled. */
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

    private AutomaticPaymentMethods(
        AllowRedirects allowRedirects, Boolean enabled, Map<String, Object> extraParams) {
      this.allowRedirects = allowRedirects;
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AllowRedirects allowRedirects;

      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentCreateParams.AutomaticPaymentMethods build() {
        return new PaymentIntentCreateParams.AutomaticPaymentMethods(
            this.allowRedirects, this.enabled, this.extraParams);
      }

      /**
       * Controls whether this PaymentIntent will accept redirect-based payment methods.
       *
       * <p>Redirect-based payment methods may require your customer to be redirected to a payment
       * method's app or site for authentication or additional steps. To <a
       * href="https://stripe.com/docs/api/payment_intents/confirm">confirm</a> this PaymentIntent,
       * you may be required to provide a {@code return_url} to redirect customers back to your site
       * after they authenticate or complete the payment.
       */
      public Builder setAllowRedirects(
          PaymentIntentCreateParams.AutomaticPaymentMethods.AllowRedirects allowRedirects) {
        this.allowRedirects = allowRedirects;
        return this;
      }

      /** <strong>Required.</strong> Whether this feature is enabled. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.AutomaticPaymentMethods#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.AutomaticPaymentMethods#extraParams} for the field
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

    public enum AllowRedirects implements ApiRequestParams.EnumParam {
      @SerializedName("always")
      ALWAYS("always"),

      @SerializedName("never")
      NEVER("never");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AllowRedirects(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class MandateData {
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
      public PaymentIntentCreateParams.MandateData build() {
        return new PaymentIntentCreateParams.MandateData(this.customerAcceptance, this.extraParams);
      }

      /**
       * <strong>Required.</strong> This hash contains details about the customer acceptance of the
       * Mandate.
       */
      public Builder setCustomerAcceptance(
          PaymentIntentCreateParams.MandateData.CustomerAcceptance customerAcceptance) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * <strong>Required.</strong> The type of customer acceptance information included with the
       * Mandate. One of {@code online} or {@code offline}.
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
        public PaymentIntentCreateParams.MandateData.CustomerAcceptance build() {
          return new PaymentIntentCreateParams.MandateData.CustomerAcceptance(
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
        public Builder setOffline(
            PaymentIntentCreateParams.MandateData.CustomerAcceptance.Offline offline) {
          this.offline = offline;
          return this;
        }

        /**
         * If this is a Mandate accepted online, this hash contains details about the online
         * acceptance.
         */
        public Builder setOnline(
            PaymentIntentCreateParams.MandateData.CustomerAcceptance.Online online) {
          this.online = online;
          return this;
        }

        /**
         * <strong>Required.</strong> The type of customer acceptance information included with the
         * Mandate. One of {@code online} or {@code offline}.
         */
        public Builder setType(PaymentIntentCreateParams.MandateData.CustomerAcceptance.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public PaymentIntentCreateParams.MandateData.CustomerAcceptance.Offline build() {
            return new PaymentIntentCreateParams.MandateData.CustomerAcceptance.Offline(
                this.extraParams);
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
      @EqualsAndHashCode(callSuper = false)
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

        /**
         * <strong>Required.</strong> The IP address from which the Mandate was accepted by the
         * customer.
         */
        @SerializedName("ip_address")
        String ipAddress;

        /**
         * <strong>Required.</strong> The user agent of the browser from which the Mandate was
         * accepted by the customer.
         */
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
          public PaymentIntentCreateParams.MandateData.CustomerAcceptance.Online build() {
            return new PaymentIntentCreateParams.MandateData.CustomerAcceptance.Online(
                this.extraParams, this.ipAddress, this.userAgent);
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

          /**
           * <strong>Required.</strong> The IP address from which the Mandate was accepted by the
           * customer.
           */
          public Builder setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
          }

          /**
           * <strong>Required.</strong> The user agent of the browser from which the Mandate was
           * accepted by the customer.
           */
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
  @EqualsAndHashCode(callSuper = false)
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
     * This field indicates whether this payment method can be shown again to its customer in a
     * checkout flow. Stripe products such as Checkout and Elements use this field to determine
     * whether a payment method can be shown as a saved payment method in a checkout flow. The field
     * defaults to {@code unspecified}.
     */
    @SerializedName("allow_redisplay")
    AllowRedisplay allowRedisplay;

    /**
     * If this is a Alma PaymentMethod, this hash contains details about the Alma payment method.
     */
    @SerializedName("alma")
    Alma alma;

    /**
     * If this is a AmazonPay PaymentMethod, this hash contains details about the AmazonPay payment
     * method.
     */
    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

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
     * If this is a {@code billie} PaymentMethod, this hash contains details about the Billie
     * payment method.
     */
    @SerializedName("billie")
    Billie billie;

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
     * If this is a Crypto PaymentMethod, this hash contains details about the Crypto payment
     * method.
     */
    @SerializedName("crypto")
    Crypto crypto;

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
     * If this is a {@code kakao_pay} PaymentMethod, this hash contains details about the Kakao Pay
     * payment method.
     */
    @SerializedName("kakao_pay")
    KakaoPay kakaoPay;

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
     * If this is a {@code kr_card} PaymentMethod, this hash contains details about the Korean Card
     * payment method.
     */
    @SerializedName("kr_card")
    KrCard krCard;

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
     * If this is a {@code mobilepay} PaymentMethod, this hash contains details about the MobilePay
     * payment method.
     */
    @SerializedName("mobilepay")
    Mobilepay mobilepay;

    /**
     * If this is a {@code multibanco} PaymentMethod, this hash contains details about the
     * Multibanco payment method.
     */
    @SerializedName("multibanco")
    Multibanco multibanco;

    /**
     * If this is a {@code naver_pay} PaymentMethod, this hash contains details about the Naver Pay
     * payment method.
     */
    @SerializedName("naver_pay")
    NaverPay naverPay;

    /**
     * If this is an nz_bank_account PaymentMethod, this hash contains details about the
     * nz_bank_account payment method.
     */
    @SerializedName("nz_bank_account")
    NzBankAccount nzBankAccount;

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
     * If this is a {@code pay_by_bank} PaymentMethod, this hash contains details about the
     * PayByBank payment method.
     */
    @SerializedName("pay_by_bank")
    PayByBank payByBank;

    /**
     * If this is a {@code payco} PaymentMethod, this hash contains details about the PAYCO payment
     * method.
     */
    @SerializedName("payco")
    Payco payco;

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
     * If this is a {@code revolut_pay} PaymentMethod, this hash contains details about the Revolut
     * Pay payment method.
     */
    @SerializedName("revolut_pay")
    RevolutPay revolutPay;

    /**
     * If this is a {@code samsung_pay} PaymentMethod, this hash contains details about the
     * SamsungPay payment method.
     */
    @SerializedName("samsung_pay")
    SamsungPay samsungPay;

    /**
     * If this is a {@code satispay} PaymentMethod, this hash contains details about the Satispay
     * payment method.
     */
    @SerializedName("satispay")
    Satispay satispay;

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
     * If this is a {@code swish} PaymentMethod, this hash contains details about the Swish payment
     * method.
     */
    @SerializedName("swish")
    Swish swish;

    /**
     * If this is a TWINT PaymentMethod, this hash contains details about the TWINT payment method.
     */
    @SerializedName("twint")
    Twint twint;

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
        AllowRedisplay allowRedisplay,
        Alma alma,
        AmazonPay amazonPay,
        AuBecsDebit auBecsDebit,
        BacsDebit bacsDebit,
        Bancontact bancontact,
        Billie billie,
        BillingDetails billingDetails,
        Blik blik,
        Boleto boleto,
        Cashapp cashapp,
        Crypto crypto,
        CustomerBalance customerBalance,
        Eps eps,
        Map<String, Object> extraParams,
        Fpx fpx,
        Giropay giropay,
        Grabpay grabpay,
        Ideal ideal,
        InteracPresent interacPresent,
        KakaoPay kakaoPay,
        Klarna klarna,
        Konbini konbini,
        KrCard krCard,
        Link link,
        Map<String, String> metadata,
        Mobilepay mobilepay,
        Multibanco multibanco,
        NaverPay naverPay,
        NzBankAccount nzBankAccount,
        Oxxo oxxo,
        P24 p24,
        PayByBank payByBank,
        Payco payco,
        Paynow paynow,
        Paypal paypal,
        Pix pix,
        Promptpay promptpay,
        RadarOptions radarOptions,
        RevolutPay revolutPay,
        SamsungPay samsungPay,
        Satispay satispay,
        SepaDebit sepaDebit,
        Sofort sofort,
        Swish swish,
        Twint twint,
        Type type,
        UsBankAccount usBankAccount,
        WechatPay wechatPay,
        Zip zip) {
      this.acssDebit = acssDebit;
      this.affirm = affirm;
      this.afterpayClearpay = afterpayClearpay;
      this.alipay = alipay;
      this.allowRedisplay = allowRedisplay;
      this.alma = alma;
      this.amazonPay = amazonPay;
      this.auBecsDebit = auBecsDebit;
      this.bacsDebit = bacsDebit;
      this.bancontact = bancontact;
      this.billie = billie;
      this.billingDetails = billingDetails;
      this.blik = blik;
      this.boleto = boleto;
      this.cashapp = cashapp;
      this.crypto = crypto;
      this.customerBalance = customerBalance;
      this.eps = eps;
      this.extraParams = extraParams;
      this.fpx = fpx;
      this.giropay = giropay;
      this.grabpay = grabpay;
      this.ideal = ideal;
      this.interacPresent = interacPresent;
      this.kakaoPay = kakaoPay;
      this.klarna = klarna;
      this.konbini = konbini;
      this.krCard = krCard;
      this.link = link;
      this.metadata = metadata;
      this.mobilepay = mobilepay;
      this.multibanco = multibanco;
      this.naverPay = naverPay;
      this.nzBankAccount = nzBankAccount;
      this.oxxo = oxxo;
      this.p24 = p24;
      this.payByBank = payByBank;
      this.payco = payco;
      this.paynow = paynow;
      this.paypal = paypal;
      this.pix = pix;
      this.promptpay = promptpay;
      this.radarOptions = radarOptions;
      this.revolutPay = revolutPay;
      this.samsungPay = samsungPay;
      this.satispay = satispay;
      this.sepaDebit = sepaDebit;
      this.sofort = sofort;
      this.swish = swish;
      this.twint = twint;
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

      private AllowRedisplay allowRedisplay;

      private Alma alma;

      private AmazonPay amazonPay;

      private AuBecsDebit auBecsDebit;

      private BacsDebit bacsDebit;

      private Bancontact bancontact;

      private Billie billie;

      private BillingDetails billingDetails;

      private Blik blik;

      private Boleto boleto;

      private Cashapp cashapp;

      private Crypto crypto;

      private CustomerBalance customerBalance;

      private Eps eps;

      private Map<String, Object> extraParams;

      private Fpx fpx;

      private Giropay giropay;

      private Grabpay grabpay;

      private Ideal ideal;

      private InteracPresent interacPresent;

      private KakaoPay kakaoPay;

      private Klarna klarna;

      private Konbini konbini;

      private KrCard krCard;

      private Link link;

      private Map<String, String> metadata;

      private Mobilepay mobilepay;

      private Multibanco multibanco;

      private NaverPay naverPay;

      private NzBankAccount nzBankAccount;

      private Oxxo oxxo;

      private P24 p24;

      private PayByBank payByBank;

      private Payco payco;

      private Paynow paynow;

      private Paypal paypal;

      private Pix pix;

      private Promptpay promptpay;

      private RadarOptions radarOptions;

      private RevolutPay revolutPay;

      private SamsungPay samsungPay;

      private Satispay satispay;

      private SepaDebit sepaDebit;

      private Sofort sofort;

      private Swish swish;

      private Twint twint;

      private Type type;

      private UsBankAccount usBankAccount;

      private WechatPay wechatPay;

      private Zip zip;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentCreateParams.PaymentMethodData build() {
        return new PaymentIntentCreateParams.PaymentMethodData(
            this.acssDebit,
            this.affirm,
            this.afterpayClearpay,
            this.alipay,
            this.allowRedisplay,
            this.alma,
            this.amazonPay,
            this.auBecsDebit,
            this.bacsDebit,
            this.bancontact,
            this.billie,
            this.billingDetails,
            this.blik,
            this.boleto,
            this.cashapp,
            this.crypto,
            this.customerBalance,
            this.eps,
            this.extraParams,
            this.fpx,
            this.giropay,
            this.grabpay,
            this.ideal,
            this.interacPresent,
            this.kakaoPay,
            this.klarna,
            this.konbini,
            this.krCard,
            this.link,
            this.metadata,
            this.mobilepay,
            this.multibanco,
            this.naverPay,
            this.nzBankAccount,
            this.oxxo,
            this.p24,
            this.payByBank,
            this.payco,
            this.paynow,
            this.paypal,
            this.pix,
            this.promptpay,
            this.radarOptions,
            this.revolutPay,
            this.samsungPay,
            this.satispay,
            this.sepaDebit,
            this.sofort,
            this.swish,
            this.twint,
            this.type,
            this.usBankAccount,
            this.wechatPay,
            this.zip);
      }

      /**
       * If this is an {@code acss_debit} PaymentMethod, this hash contains details about the ACSS
       * Debit payment method.
       */
      public Builder setAcssDebit(PaymentIntentCreateParams.PaymentMethodData.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /**
       * If this is an {@code affirm} PaymentMethod, this hash contains details about the Affirm
       * payment method.
       */
      public Builder setAffirm(PaymentIntentCreateParams.PaymentMethodData.Affirm affirm) {
        this.affirm = affirm;
        return this;
      }

      /**
       * If this is an {@code AfterpayClearpay} PaymentMethod, this hash contains details about the
       * AfterpayClearpay payment method.
       */
      public Builder setAfterpayClearpay(
          PaymentIntentCreateParams.PaymentMethodData.AfterpayClearpay afterpayClearpay) {
        this.afterpayClearpay = afterpayClearpay;
        return this;
      }

      /**
       * If this is an {@code Alipay} PaymentMethod, this hash contains details about the Alipay
       * payment method.
       */
      public Builder setAlipay(PaymentIntentCreateParams.PaymentMethodData.Alipay alipay) {
        this.alipay = alipay;
        return this;
      }

      /**
       * This field indicates whether this payment method can be shown again to its customer in a
       * checkout flow. Stripe products such as Checkout and Elements use this field to determine
       * whether a payment method can be shown as a saved payment method in a checkout flow. The
       * field defaults to {@code unspecified}.
       */
      public Builder setAllowRedisplay(
          PaymentIntentCreateParams.PaymentMethodData.AllowRedisplay allowRedisplay) {
        this.allowRedisplay = allowRedisplay;
        return this;
      }

      /**
       * If this is a Alma PaymentMethod, this hash contains details about the Alma payment method.
       */
      public Builder setAlma(PaymentIntentCreateParams.PaymentMethodData.Alma alma) {
        this.alma = alma;
        return this;
      }

      /**
       * If this is a AmazonPay PaymentMethod, this hash contains details about the AmazonPay
       * payment method.
       */
      public Builder setAmazonPay(PaymentIntentCreateParams.PaymentMethodData.AmazonPay amazonPay) {
        this.amazonPay = amazonPay;
        return this;
      }

      /**
       * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the
       * bank account.
       */
      public Builder setAuBecsDebit(
          PaymentIntentCreateParams.PaymentMethodData.AuBecsDebit auBecsDebit) {
        this.auBecsDebit = auBecsDebit;
        return this;
      }

      /**
       * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs
       * Direct Debit bank account.
       */
      public Builder setBacsDebit(PaymentIntentCreateParams.PaymentMethodData.BacsDebit bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /**
       * If this is a {@code bancontact} PaymentMethod, this hash contains details about the
       * Bancontact payment method.
       */
      public Builder setBancontact(
          PaymentIntentCreateParams.PaymentMethodData.Bancontact bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /**
       * If this is a {@code billie} PaymentMethod, this hash contains details about the Billie
       * payment method.
       */
      public Builder setBillie(PaymentIntentCreateParams.PaymentMethodData.Billie billie) {
        this.billie = billie;
        return this;
      }

      /**
       * Billing information associated with the PaymentMethod that may be used or required by
       * particular types of payment methods.
       */
      public Builder setBillingDetails(
          PaymentIntentCreateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /**
       * If this is a {@code blik} PaymentMethod, this hash contains details about the BLIK payment
       * method.
       */
      public Builder setBlik(PaymentIntentCreateParams.PaymentMethodData.Blik blik) {
        this.blik = blik;
        return this;
      }

      /**
       * If this is a {@code boleto} PaymentMethod, this hash contains details about the Boleto
       * payment method.
       */
      public Builder setBoleto(PaymentIntentCreateParams.PaymentMethodData.Boleto boleto) {
        this.boleto = boleto;
        return this;
      }

      /**
       * If this is a {@code cashapp} PaymentMethod, this hash contains details about the Cash App
       * Pay payment method.
       */
      public Builder setCashapp(PaymentIntentCreateParams.PaymentMethodData.Cashapp cashapp) {
        this.cashapp = cashapp;
        return this;
      }

      /**
       * If this is a Crypto PaymentMethod, this hash contains details about the Crypto payment
       * method.
       */
      public Builder setCrypto(PaymentIntentCreateParams.PaymentMethodData.Crypto crypto) {
        this.crypto = crypto;
        return this;
      }

      /**
       * If this is a {@code customer_balance} PaymentMethod, this hash contains details about the
       * CustomerBalance payment method.
       */
      public Builder setCustomerBalance(
          PaymentIntentCreateParams.PaymentMethodData.CustomerBalance customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /**
       * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
       * method.
       */
      public Builder setEps(PaymentIntentCreateParams.PaymentMethodData.Eps eps) {
        this.eps = eps;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.PaymentMethodData#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.PaymentMethodData#extraParams} for the field
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
      public Builder setFpx(PaymentIntentCreateParams.PaymentMethodData.Fpx fpx) {
        this.fpx = fpx;
        return this;
      }

      /**
       * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
       * payment method.
       */
      public Builder setGiropay(PaymentIntentCreateParams.PaymentMethodData.Giropay giropay) {
        this.giropay = giropay;
        return this;
      }

      /**
       * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
       * payment method.
       */
      public Builder setGrabpay(PaymentIntentCreateParams.PaymentMethodData.Grabpay grabpay) {
        this.grabpay = grabpay;
        return this;
      }

      /**
       * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL
       * payment method.
       */
      public Builder setIdeal(PaymentIntentCreateParams.PaymentMethodData.Ideal ideal) {
        this.ideal = ideal;
        return this;
      }

      /**
       * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
       * Interac Present payment method.
       */
      public Builder setInteracPresent(
          PaymentIntentCreateParams.PaymentMethodData.InteracPresent interacPresent) {
        this.interacPresent = interacPresent;
        return this;
      }

      /**
       * If this is a {@code kakao_pay} PaymentMethod, this hash contains details about the Kakao
       * Pay payment method.
       */
      public Builder setKakaoPay(PaymentIntentCreateParams.PaymentMethodData.KakaoPay kakaoPay) {
        this.kakaoPay = kakaoPay;
        return this;
      }

      /**
       * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
       * payment method.
       */
      public Builder setKlarna(PaymentIntentCreateParams.PaymentMethodData.Klarna klarna) {
        this.klarna = klarna;
        return this;
      }

      /**
       * If this is a {@code konbini} PaymentMethod, this hash contains details about the Konbini
       * payment method.
       */
      public Builder setKonbini(PaymentIntentCreateParams.PaymentMethodData.Konbini konbini) {
        this.konbini = konbini;
        return this;
      }

      /**
       * If this is a {@code kr_card} PaymentMethod, this hash contains details about the Korean
       * Card payment method.
       */
      public Builder setKrCard(PaymentIntentCreateParams.PaymentMethodData.KrCard krCard) {
        this.krCard = krCard;
        return this;
      }

      /**
       * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
       * method.
       */
      public Builder setLink(PaymentIntentCreateParams.PaymentMethodData.Link link) {
        this.link = link;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.PaymentMethodData#metadata} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.PaymentMethodData#metadata} for the field
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
       * If this is a {@code mobilepay} PaymentMethod, this hash contains details about the
       * MobilePay payment method.
       */
      public Builder setMobilepay(PaymentIntentCreateParams.PaymentMethodData.Mobilepay mobilepay) {
        this.mobilepay = mobilepay;
        return this;
      }

      /**
       * If this is a {@code multibanco} PaymentMethod, this hash contains details about the
       * Multibanco payment method.
       */
      public Builder setMultibanco(
          PaymentIntentCreateParams.PaymentMethodData.Multibanco multibanco) {
        this.multibanco = multibanco;
        return this;
      }

      /**
       * If this is a {@code naver_pay} PaymentMethod, this hash contains details about the Naver
       * Pay payment method.
       */
      public Builder setNaverPay(PaymentIntentCreateParams.PaymentMethodData.NaverPay naverPay) {
        this.naverPay = naverPay;
        return this;
      }

      /**
       * If this is an nz_bank_account PaymentMethod, this hash contains details about the
       * nz_bank_account payment method.
       */
      public Builder setNzBankAccount(
          PaymentIntentCreateParams.PaymentMethodData.NzBankAccount nzBankAccount) {
        this.nzBankAccount = nzBankAccount;
        return this;
      }

      /**
       * If this is an {@code oxxo} PaymentMethod, this hash contains details about the OXXO payment
       * method.
       */
      public Builder setOxxo(PaymentIntentCreateParams.PaymentMethodData.Oxxo oxxo) {
        this.oxxo = oxxo;
        return this;
      }

      /**
       * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
       * method.
       */
      public Builder setP24(PaymentIntentCreateParams.PaymentMethodData.P24 p24) {
        this.p24 = p24;
        return this;
      }

      /**
       * If this is a {@code pay_by_bank} PaymentMethod, this hash contains details about the
       * PayByBank payment method.
       */
      public Builder setPayByBank(PaymentIntentCreateParams.PaymentMethodData.PayByBank payByBank) {
        this.payByBank = payByBank;
        return this;
      }

      /**
       * If this is a {@code payco} PaymentMethod, this hash contains details about the PAYCO
       * payment method.
       */
      public Builder setPayco(PaymentIntentCreateParams.PaymentMethodData.Payco payco) {
        this.payco = payco;
        return this;
      }

      /**
       * If this is a {@code paynow} PaymentMethod, this hash contains details about the PayNow
       * payment method.
       */
      public Builder setPaynow(PaymentIntentCreateParams.PaymentMethodData.Paynow paynow) {
        this.paynow = paynow;
        return this;
      }

      /**
       * If this is a {@code paypal} PaymentMethod, this hash contains details about the PayPal
       * payment method.
       */
      public Builder setPaypal(PaymentIntentCreateParams.PaymentMethodData.Paypal paypal) {
        this.paypal = paypal;
        return this;
      }

      /**
       * If this is a {@code pix} PaymentMethod, this hash contains details about the Pix payment
       * method.
       */
      public Builder setPix(PaymentIntentCreateParams.PaymentMethodData.Pix pix) {
        this.pix = pix;
        return this;
      }

      /**
       * If this is a {@code promptpay} PaymentMethod, this hash contains details about the
       * PromptPay payment method.
       */
      public Builder setPromptpay(PaymentIntentCreateParams.PaymentMethodData.Promptpay promptpay) {
        this.promptpay = promptpay;
        return this;
      }

      /**
       * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
       * Session</a> for more information.
       */
      public Builder setRadarOptions(
          PaymentIntentCreateParams.PaymentMethodData.RadarOptions radarOptions) {
        this.radarOptions = radarOptions;
        return this;
      }

      /**
       * If this is a {@code revolut_pay} PaymentMethod, this hash contains details about the
       * Revolut Pay payment method.
       */
      public Builder setRevolutPay(
          PaymentIntentCreateParams.PaymentMethodData.RevolutPay revolutPay) {
        this.revolutPay = revolutPay;
        return this;
      }

      /**
       * If this is a {@code samsung_pay} PaymentMethod, this hash contains details about the
       * SamsungPay payment method.
       */
      public Builder setSamsungPay(
          PaymentIntentCreateParams.PaymentMethodData.SamsungPay samsungPay) {
        this.samsungPay = samsungPay;
        return this;
      }

      /**
       * If this is a {@code satispay} PaymentMethod, this hash contains details about the Satispay
       * payment method.
       */
      public Builder setSatispay(PaymentIntentCreateParams.PaymentMethodData.Satispay satispay) {
        this.satispay = satispay;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA
       * debit bank account.
       */
      public Builder setSepaDebit(PaymentIntentCreateParams.PaymentMethodData.SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /**
       * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT
       * payment method.
       */
      public Builder setSofort(PaymentIntentCreateParams.PaymentMethodData.Sofort sofort) {
        this.sofort = sofort;
        return this;
      }

      /**
       * If this is a {@code swish} PaymentMethod, this hash contains details about the Swish
       * payment method.
       */
      public Builder setSwish(PaymentIntentCreateParams.PaymentMethodData.Swish swish) {
        this.swish = swish;
        return this;
      }

      /**
       * If this is a TWINT PaymentMethod, this hash contains details about the TWINT payment
       * method.
       */
      public Builder setTwint(PaymentIntentCreateParams.PaymentMethodData.Twint twint) {
        this.twint = twint;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(PaymentIntentCreateParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }

      /**
       * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the
       * US bank account payment method.
       */
      public Builder setUsBankAccount(
          PaymentIntentCreateParams.PaymentMethodData.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /**
       * If this is an {@code wechat_pay} PaymentMethod, this hash contains details about the
       * wechat_pay payment method.
       */
      public Builder setWechatPay(PaymentIntentCreateParams.PaymentMethodData.WechatPay wechatPay) {
        this.wechatPay = wechatPay;
        return this;
      }

      /**
       * If this is a {@code zip} PaymentMethod, this hash contains details about the Zip payment
       * method.
       */
      public Builder setZip(PaymentIntentCreateParams.PaymentMethodData.Zip zip) {
        this.zip = zip;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit {
      /** <strong>Required.</strong> Customer's bank account number. */
      @SerializedName("account_number")
      String accountNumber;

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
      String institutionNumber;

      /** <strong>Required.</strong> Transit number of the customer's bank. */
      @SerializedName("transit_number")
      String transitNumber;

      private AcssDebit(
          String accountNumber,
          Map<String, Object> extraParams,
          String institutionNumber,
          String transitNumber) {
        this.accountNumber = accountNumber;
        this.extraParams = extraParams;
        this.institutionNumber = institutionNumber;
        this.transitNumber = transitNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountNumber;

        private Map<String, Object> extraParams;

        private String institutionNumber;

        private String transitNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.AcssDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodData.AcssDebit(
              this.accountNumber, this.extraParams, this.institutionNumber, this.transitNumber);
        }

        /** <strong>Required.</strong> Customer's bank account number. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AcssDebit#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AcssDebit#extraParams} for
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

        /** <strong>Required.</strong> Transit number of the customer's bank. */
        public Builder setTransitNumber(String transitNumber) {
          this.transitNumber = transitNumber;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Affirm build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Affirm(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Affirm#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Affirm#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.AfterpayClearpay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.AfterpayClearpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AfterpayClearpay#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AfterpayClearpay#extraParams}
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Alipay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Alipay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Alipay#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Alipay#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class Alma {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Alma(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Alma build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Alma(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Alma#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Alma#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AmazonPay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.AmazonPay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.AmazonPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AmazonPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AmazonPay#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit {
      /** <strong>Required.</strong> The account number for the bank account. */
      @SerializedName("account_number")
      String accountNumber;

      /** <strong>Required.</strong> Bank-State-Branch number of the bank account. */
      @SerializedName("bsb_number")
      String bsbNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AuBecsDebit(String accountNumber, String bsbNumber, Map<String, Object> extraParams) {
        this.accountNumber = accountNumber;
        this.bsbNumber = bsbNumber;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountNumber;

        private String bsbNumber;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.AuBecsDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodData.AuBecsDebit(
              this.accountNumber, this.bsbNumber, this.extraParams);
        }

        /** <strong>Required.</strong> The account number for the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** <strong>Required.</strong> Bank-State-Branch number of the bank account. */
        public Builder setBsbNumber(String bsbNumber) {
          this.bsbNumber = bsbNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AuBecsDebit#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.AuBecsDebit#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit {
      /** Account number of the bank account that the funds will be debited from. */
      @SerializedName("account_number")
      String accountNumber;

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
      String sortCode;

      private BacsDebit(String accountNumber, Map<String, Object> extraParams, String sortCode) {
        this.accountNumber = accountNumber;
        this.extraParams = extraParams;
        this.sortCode = sortCode;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountNumber;

        private Map<String, Object> extraParams;

        private String sortCode;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.BacsDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodData.BacsDebit(
              this.accountNumber, this.extraParams, this.sortCode);
        }

        /** Account number of the bank account that the funds will be debited from. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.BacsDebit#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.BacsDebit#extraParams} for
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
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Bancontact build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Bancontact(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Bancontact#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Bancontact#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class Billie {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Billie(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Billie build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Billie(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Billie#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Billie#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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

      /**
       * Taxpayer identification number. Used only for transactions between LATAM buyers and
       * non-LATAM sellers.
       */
      @SerializedName("tax_id")
      String taxId;

      private BillingDetails(
          Object address,
          Object email,
          Map<String, Object> extraParams,
          Object name,
          Object phone,
          String taxId) {
        this.address = address;
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
        this.taxId = taxId;
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

        private String taxId;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.BillingDetails build() {
          return new PaymentIntentCreateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone, this.taxId);
        }

        /** Billing address. */
        public Builder setAddress(
            PaymentIntentCreateParams.PaymentMethodData.BillingDetails.Address address) {
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.BillingDetails#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.BillingDetails#extraParams}
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

        /**
         * Taxpayer identification number. Used only for transactions between LATAM buyers and
         * non-LATAM sellers.
         */
        public Builder setTaxId(String taxId) {
          this.taxId = taxId;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

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
          public PaymentIntentCreateParams.PaymentMethodData.BillingDetails.Address build() {
            return new PaymentIntentCreateParams.PaymentMethodData.BillingDetails.Address(
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

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for the
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
           * PaymentIntentCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for the
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

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Blik build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Blik(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Blik#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Blik#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
      String taxId;

      private Boleto(Map<String, Object> extraParams, String taxId) {
        this.extraParams = extraParams;
        this.taxId = taxId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String taxId;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Boleto build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Boleto(
              this.extraParams, this.taxId);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Boleto#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Boleto#extraParams} for the
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
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Cashapp build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Cashapp(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Cashapp#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Cashapp#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class Crypto {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Crypto(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Crypto build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Crypto(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Crypto#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Crypto#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.CustomerBalance build() {
          return new PaymentIntentCreateParams.PaymentMethodData.CustomerBalance(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.CustomerBalance#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.CustomerBalance#extraParams}
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Eps build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Eps(this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(PaymentIntentCreateParams.PaymentMethodData.Eps.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Eps#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Eps#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Fpx build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Fpx(
              this.accountHolderType, this.bank, this.extraParams);
        }

        /** Account holder type for FPX transaction. */
        public Builder setAccountHolderType(
            PaymentIntentCreateParams.PaymentMethodData.Fpx.AccountHolderType accountHolderType) {
          this.accountHolderType = accountHolderType;
          return this;
        }

        /** <strong>Required.</strong> The customer's bank. */
        public Builder setBank(PaymentIntentCreateParams.PaymentMethodData.Fpx.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Fpx#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Fpx#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Giropay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Giropay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Giropay#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Giropay#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Grabpay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Grabpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Grabpay#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Grabpay#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal {
      /**
       * The customer's bank. Only use this parameter for existing customers. Don't use it for new
       * customers.
       */
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
        public PaymentIntentCreateParams.PaymentMethodData.Ideal build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Ideal(this.bank, this.extraParams);
        }

        /**
         * The customer's bank. Only use this parameter for existing customers. Don't use it for new
         * customers.
         */
        public Builder setBank(PaymentIntentCreateParams.PaymentMethodData.Ideal.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Ideal#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Ideal#extraParams} for the
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

        @SerializedName("buut")
        BUUT("buut"),

        @SerializedName("handelsbanken")
        HANDELSBANKEN("handelsbanken"),

        @SerializedName("ing")
        ING("ing"),

        @SerializedName("knab")
        KNAB("knab"),

        @SerializedName("moneyou")
        MONEYOU("moneyou"),

        @SerializedName("n26")
        N26("n26"),

        @SerializedName("nn")
        NN("nn"),

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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.InteracPresent build() {
          return new PaymentIntentCreateParams.PaymentMethodData.InteracPresent(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.InteracPresent#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.InteracPresent#extraParams}
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
    @EqualsAndHashCode(callSuper = false)
    public static class KakaoPay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private KakaoPay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.KakaoPay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.KakaoPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.KakaoPay#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.KakaoPay#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Klarna build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Klarna(this.dob, this.extraParams);
        }

        /** Customer's date of birth. */
        public Builder setDob(PaymentIntentCreateParams.PaymentMethodData.Klarna.Dob dob) {
          this.dob = dob;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Klarna#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Klarna#extraParams} for the
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
      @EqualsAndHashCode(callSuper = false)
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
          public PaymentIntentCreateParams.PaymentMethodData.Klarna.Dob build() {
            return new PaymentIntentCreateParams.PaymentMethodData.Klarna.Dob(
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
           * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Klarna.Dob#extraParams} for
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
           * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Klarna.Dob#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Konbini build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Konbini(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Konbini#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Konbini#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class KrCard {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private KrCard(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.KrCard build() {
          return new PaymentIntentCreateParams.PaymentMethodData.KrCard(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.KrCard#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.KrCard#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Link build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Link(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Link#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Link#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class Mobilepay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Mobilepay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Mobilepay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Mobilepay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Mobilepay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Mobilepay#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class Multibanco {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Multibanco(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Multibanco build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Multibanco(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Multibanco#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Multibanco#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class NaverPay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Whether to use Naver Pay points or a card to fund this transaction. If not provided, this
       * defaults to {@code card}.
       */
      @SerializedName("funding")
      Funding funding;

      private NaverPay(Map<String, Object> extraParams, Funding funding) {
        this.extraParams = extraParams;
        this.funding = funding;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Funding funding;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.NaverPay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.NaverPay(
              this.extraParams, this.funding);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.NaverPay#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.NaverPay#extraParams} for the
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
         * Whether to use Naver Pay points or a card to fund this transaction. If not provided, this
         * defaults to {@code card}.
         */
        public Builder setFunding(
            PaymentIntentCreateParams.PaymentMethodData.NaverPay.Funding funding) {
          this.funding = funding;
          return this;
        }
      }

      public enum Funding implements ApiRequestParams.EnumParam {
        @SerializedName("card")
        CARD("card"),

        @SerializedName("points")
        POINTS("points");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Funding(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class NzBankAccount {
      /**
       * The name on the bank account. Only required if the account holder name is different from
       * the name of the authorized signatory collected in the PaymentMethod’s billing details.
       */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** <strong>Required.</strong> The account number for the bank account. */
      @SerializedName("account_number")
      String accountNumber;

      /** <strong>Required.</strong> The numeric code for the bank account's bank. */
      @SerializedName("bank_code")
      String bankCode;

      /** <strong>Required.</strong> The numeric code for the bank account's bank branch. */
      @SerializedName("branch_code")
      String branchCode;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("reference")
      String reference;

      /** <strong>Required.</strong> The suffix of the bank account number. */
      @SerializedName("suffix")
      String suffix;

      private NzBankAccount(
          String accountHolderName,
          String accountNumber,
          String bankCode,
          String branchCode,
          Map<String, Object> extraParams,
          String reference,
          String suffix) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.extraParams = extraParams;
        this.reference = reference;
        this.suffix = suffix;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountHolderName;

        private String accountNumber;

        private String bankCode;

        private String branchCode;

        private Map<String, Object> extraParams;

        private String reference;

        private String suffix;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.NzBankAccount build() {
          return new PaymentIntentCreateParams.PaymentMethodData.NzBankAccount(
              this.accountHolderName,
              this.accountNumber,
              this.bankCode,
              this.branchCode,
              this.extraParams,
              this.reference,
              this.suffix);
        }

        /**
         * The name on the bank account. Only required if the account holder name is different from
         * the name of the authorized signatory collected in the PaymentMethod’s billing details.
         */
        public Builder setAccountHolderName(String accountHolderName) {
          this.accountHolderName = accountHolderName;
          return this;
        }

        /** <strong>Required.</strong> The account number for the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** <strong>Required.</strong> The numeric code for the bank account's bank. */
        public Builder setBankCode(String bankCode) {
          this.bankCode = bankCode;
          return this;
        }

        /** <strong>Required.</strong> The numeric code for the bank account's bank branch. */
        public Builder setBranchCode(String branchCode) {
          this.branchCode = branchCode;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.NzBankAccount#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.NzBankAccount#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setReference(String reference) {
          this.reference = reference;
          return this;
        }

        /** <strong>Required.</strong> The suffix of the bank account number. */
        public Builder setSuffix(String suffix) {
          this.suffix = suffix;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Oxxo build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Oxxo(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Oxxo#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Oxxo#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.P24 build() {
          return new PaymentIntentCreateParams.PaymentMethodData.P24(this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(PaymentIntentCreateParams.PaymentMethodData.P24.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.P24#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.P24#extraParams} for the
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

        @SerializedName("velobank")
        VELOBANK("velobank"),

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
    @EqualsAndHashCode(callSuper = false)
    public static class PayByBank {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PayByBank(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.PayByBank build() {
          return new PaymentIntentCreateParams.PaymentMethodData.PayByBank(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.PayByBank#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.PayByBank#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class Payco {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Payco(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Payco build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Payco(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Payco#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Payco#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Paynow build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Paynow(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Paynow#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Paynow#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Paypal build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Paypal(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Paypal#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Paypal#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Pix build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Pix(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Pix#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Pix#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Promptpay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Promptpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Promptpay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Promptpay#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
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
      String session;

      private RadarOptions(Map<String, Object> extraParams, String session) {
        this.extraParams = extraParams;
        this.session = session;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String session;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.RadarOptions build() {
          return new PaymentIntentCreateParams.PaymentMethodData.RadarOptions(
              this.extraParams, this.session);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.RadarOptions#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.RadarOptions#extraParams} for
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
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private RevolutPay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.RevolutPay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.RevolutPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.RevolutPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.RevolutPay#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class SamsungPay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private SamsungPay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.SamsungPay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.SamsungPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.SamsungPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.SamsungPay#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class Satispay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Satispay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Satispay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Satispay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Satispay#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Satispay#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
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
      String iban;

      private SepaDebit(Map<String, Object> extraParams, String iban) {
        this.extraParams = extraParams;
        this.iban = iban;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String iban;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.SepaDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodData.SepaDebit(
              this.extraParams, this.iban);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.SepaDebit#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.SepaDebit#extraParams} for
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
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Sofort build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Sofort(
              this.country, this.extraParams);
        }

        /**
         * <strong>Required.</strong> Two-letter ISO code representing the country the bank account
         * is located in.
         */
        public Builder setCountry(
            PaymentIntentCreateParams.PaymentMethodData.Sofort.Country country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Sofort#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Sofort#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class Swish {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Swish(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Swish build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Swish(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Swish#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Swish#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class Twint {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Twint(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.Twint build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Twint(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Twint#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Twint#extraParams} for the
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
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount {
      /** Account holder type: individual or company. */
      @SerializedName("account_holder_type")
      AccountHolderType accountHolderType;

      /** Account number of the bank account. */
      @SerializedName("account_number")
      String accountNumber;

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
      String financialConnectionsAccount;

      /** Routing number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;

      private UsBankAccount(
          AccountHolderType accountHolderType,
          String accountNumber,
          AccountType accountType,
          Map<String, Object> extraParams,
          String financialConnectionsAccount,
          String routingNumber) {
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

        private String accountNumber;

        private AccountType accountType;

        private Map<String, Object> extraParams;

        private String financialConnectionsAccount;

        private String routingNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodData.UsBankAccount build() {
          return new PaymentIntentCreateParams.PaymentMethodData.UsBankAccount(
              this.accountHolderType,
              this.accountNumber,
              this.accountType,
              this.extraParams,
              this.financialConnectionsAccount,
              this.routingNumber);
        }

        /** Account holder type: individual or company. */
        public Builder setAccountHolderType(
            PaymentIntentCreateParams.PaymentMethodData.UsBankAccount.AccountHolderType
                accountHolderType) {
          this.accountHolderType = accountHolderType;
          return this;
        }

        /** Account number of the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Account type: checkings or savings. Defaults to checking if omitted. */
        public Builder setAccountType(
            PaymentIntentCreateParams.PaymentMethodData.UsBankAccount.AccountType accountType) {
          this.accountType = accountType;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.UsBankAccount#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.UsBankAccount#extraParams}
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

        /** Routing number of the bank account. */
        public Builder setRoutingNumber(String routingNumber) {
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.WechatPay build() {
          return new PaymentIntentCreateParams.PaymentMethodData.WechatPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.WechatPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.WechatPay#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodData.Zip build() {
          return new PaymentIntentCreateParams.PaymentMethodData.Zip(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Zip#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodData.Zip#extraParams} for the
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

    public enum AllowRedisplay implements ApiRequestParams.EnumParam {
      @SerializedName("always")
      ALWAYS("always"),

      @SerializedName("limited")
      LIMITED("limited"),

      @SerializedName("unspecified")
      UNSPECIFIED("unspecified");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AllowRedisplay(String value) {
        this.value = value;
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

      @SerializedName("alma")
      ALMA("alma"),

      @SerializedName("amazon_pay")
      AMAZON_PAY("amazon_pay"),

      @SerializedName("au_becs_debit")
      AU_BECS_DEBIT("au_becs_debit"),

      @SerializedName("bacs_debit")
      BACS_DEBIT("bacs_debit"),

      @SerializedName("bancontact")
      BANCONTACT("bancontact"),

      @SerializedName("billie")
      BILLIE("billie"),

      @SerializedName("blik")
      BLIK("blik"),

      @SerializedName("boleto")
      BOLETO("boleto"),

      @SerializedName("cashapp")
      CASHAPP("cashapp"),

      @SerializedName("crypto")
      CRYPTO("crypto"),

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

      @SerializedName("kakao_pay")
      KAKAO_PAY("kakao_pay"),

      @SerializedName("klarna")
      KLARNA("klarna"),

      @SerializedName("konbini")
      KONBINI("konbini"),

      @SerializedName("kr_card")
      KR_CARD("kr_card"),

      @SerializedName("link")
      LINK("link"),

      @SerializedName("mobilepay")
      MOBILEPAY("mobilepay"),

      @SerializedName("multibanco")
      MULTIBANCO("multibanco"),

      @SerializedName("naver_pay")
      NAVER_PAY("naver_pay"),

      @SerializedName("nz_bank_account")
      NZ_BANK_ACCOUNT("nz_bank_account"),

      @SerializedName("oxxo")
      OXXO("oxxo"),

      @SerializedName("p24")
      P24("p24"),

      @SerializedName("pay_by_bank")
      PAY_BY_BANK("pay_by_bank"),

      @SerializedName("payco")
      PAYCO("payco"),

      @SerializedName("paynow")
      PAYNOW("paynow"),

      @SerializedName("paypal")
      PAYPAL("paypal"),

      @SerializedName("pix")
      PIX("pix"),

      @SerializedName("promptpay")
      PROMPTPAY("promptpay"),

      @SerializedName("revolut_pay")
      REVOLUT_PAY("revolut_pay"),

      @SerializedName("samsung_pay")
      SAMSUNG_PAY("samsung_pay"),

      @SerializedName("satispay")
      SATISPAY("satispay"),

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

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
     * If this is a {@code alma} PaymentMethod, this sub-hash contains details about the Alma
     * payment method options.
     */
    @SerializedName("alma")
    Object alma;

    /**
     * If this is a {@code amazon_pay} PaymentMethod, this sub-hash contains details about the
     * Amazon Pay payment method options.
     */
    @SerializedName("amazon_pay")
    Object amazonPay;

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
     * If this is a {@code billie} PaymentMethod, this sub-hash contains details about the Billie
     * payment method options.
     */
    @SerializedName("billie")
    Object billie;

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
     * If this is a {@code crypto} PaymentMethod, this sub-hash contains details about the Crypto
     * payment method options.
     */
    @SerializedName("crypto")
    Object crypto;

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
     * If this is a {@code kakao_pay} PaymentMethod, this sub-hash contains details about the Kakao
     * Pay payment method options.
     */
    @SerializedName("kakao_pay")
    Object kakaoPay;

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
     * If this is a {@code kr_card} PaymentMethod, this sub-hash contains details about the KR Card
     * payment method options.
     */
    @SerializedName("kr_card")
    Object krCard;

    /**
     * If this is a {@code link} PaymentMethod, this sub-hash contains details about the Link
     * payment method options.
     */
    @SerializedName("link")
    Object link;

    /**
     * If this is a {@code MobilePay} PaymentMethod, this sub-hash contains details about the
     * MobilePay payment method options.
     */
    @SerializedName("mobilepay")
    Object mobilepay;

    /**
     * If this is a {@code multibanco} PaymentMethod, this sub-hash contains details about the
     * Multibanco payment method options.
     */
    @SerializedName("multibanco")
    Object multibanco;

    /**
     * If this is a {@code naver_pay} PaymentMethod, this sub-hash contains details about the Naver
     * Pay payment method options.
     */
    @SerializedName("naver_pay")
    Object naverPay;

    /**
     * If this is a {@code nz_bank_account} PaymentMethod, this sub-hash contains details about the
     * NZ BECS Direct Debit payment method options.
     */
    @SerializedName("nz_bank_account")
    Object nzBankAccount;

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
     * If this is a {@code pay_by_bank} PaymentMethod, this sub-hash contains details about the
     * PayByBank payment method options.
     */
    @SerializedName("pay_by_bank")
    Object payByBank;

    /**
     * If this is a {@code payco} PaymentMethod, this sub-hash contains details about the PAYCO
     * payment method options.
     */
    @SerializedName("payco")
    Object payco;

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
     * If this is a {@code revolut_pay} PaymentMethod, this sub-hash contains details about the
     * Revolut Pay payment method options.
     */
    @SerializedName("revolut_pay")
    Object revolutPay;

    /**
     * If this is a {@code samsung_pay} PaymentMethod, this sub-hash contains details about the
     * Samsung Pay payment method options.
     */
    @SerializedName("samsung_pay")
    Object samsungPay;

    /**
     * If this is a {@code satispay} PaymentMethod, this sub-hash contains details about the
     * Satispay payment method options.
     */
    @SerializedName("satispay")
    Object satispay;

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
     * If this is a {@code Swish} PaymentMethod, this sub-hash contains details about the Swish
     * payment method options.
     */
    @SerializedName("swish")
    Object swish;

    /**
     * If this is a {@code twint} PaymentMethod, this sub-hash contains details about the TWINT
     * payment method options.
     */
    @SerializedName("twint")
    Object twint;

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
        Object alma,
        Object amazonPay,
        Object auBecsDebit,
        Object bacsDebit,
        Object bancontact,
        Object billie,
        Object blik,
        Object boleto,
        Object card,
        Object cardPresent,
        Object cashapp,
        Object crypto,
        Object customerBalance,
        Object eps,
        Map<String, Object> extraParams,
        Object fpx,
        Object giropay,
        Object grabpay,
        Object ideal,
        Object interacPresent,
        Object kakaoPay,
        Object klarna,
        Object konbini,
        Object krCard,
        Object link,
        Object mobilepay,
        Object multibanco,
        Object naverPay,
        Object nzBankAccount,
        Object oxxo,
        Object p24,
        Object payByBank,
        Object payco,
        Object paynow,
        Object paypal,
        Object pix,
        Object promptpay,
        Object revolutPay,
        Object samsungPay,
        Object satispay,
        Object sepaDebit,
        Object sofort,
        Object swish,
        Object twint,
        Object usBankAccount,
        Object wechatPay,
        Object zip) {
      this.acssDebit = acssDebit;
      this.affirm = affirm;
      this.afterpayClearpay = afterpayClearpay;
      this.alipay = alipay;
      this.alma = alma;
      this.amazonPay = amazonPay;
      this.auBecsDebit = auBecsDebit;
      this.bacsDebit = bacsDebit;
      this.bancontact = bancontact;
      this.billie = billie;
      this.blik = blik;
      this.boleto = boleto;
      this.card = card;
      this.cardPresent = cardPresent;
      this.cashapp = cashapp;
      this.crypto = crypto;
      this.customerBalance = customerBalance;
      this.eps = eps;
      this.extraParams = extraParams;
      this.fpx = fpx;
      this.giropay = giropay;
      this.grabpay = grabpay;
      this.ideal = ideal;
      this.interacPresent = interacPresent;
      this.kakaoPay = kakaoPay;
      this.klarna = klarna;
      this.konbini = konbini;
      this.krCard = krCard;
      this.link = link;
      this.mobilepay = mobilepay;
      this.multibanco = multibanco;
      this.naverPay = naverPay;
      this.nzBankAccount = nzBankAccount;
      this.oxxo = oxxo;
      this.p24 = p24;
      this.payByBank = payByBank;
      this.payco = payco;
      this.paynow = paynow;
      this.paypal = paypal;
      this.pix = pix;
      this.promptpay = promptpay;
      this.revolutPay = revolutPay;
      this.samsungPay = samsungPay;
      this.satispay = satispay;
      this.sepaDebit = sepaDebit;
      this.sofort = sofort;
      this.swish = swish;
      this.twint = twint;
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

      private Object alma;

      private Object amazonPay;

      private Object auBecsDebit;

      private Object bacsDebit;

      private Object bancontact;

      private Object billie;

      private Object blik;

      private Object boleto;

      private Object card;

      private Object cardPresent;

      private Object cashapp;

      private Object crypto;

      private Object customerBalance;

      private Object eps;

      private Map<String, Object> extraParams;

      private Object fpx;

      private Object giropay;

      private Object grabpay;

      private Object ideal;

      private Object interacPresent;

      private Object kakaoPay;

      private Object klarna;

      private Object konbini;

      private Object krCard;

      private Object link;

      private Object mobilepay;

      private Object multibanco;

      private Object naverPay;

      private Object nzBankAccount;

      private Object oxxo;

      private Object p24;

      private Object payByBank;

      private Object payco;

      private Object paynow;

      private Object paypal;

      private Object pix;

      private Object promptpay;

      private Object revolutPay;

      private Object samsungPay;

      private Object satispay;

      private Object sepaDebit;

      private Object sofort;

      private Object swish;

      private Object twint;

      private Object usBankAccount;

      private Object wechatPay;

      private Object zip;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentCreateParams.PaymentMethodOptions build() {
        return new PaymentIntentCreateParams.PaymentMethodOptions(
            this.acssDebit,
            this.affirm,
            this.afterpayClearpay,
            this.alipay,
            this.alma,
            this.amazonPay,
            this.auBecsDebit,
            this.bacsDebit,
            this.bancontact,
            this.billie,
            this.blik,
            this.boleto,
            this.card,
            this.cardPresent,
            this.cashapp,
            this.crypto,
            this.customerBalance,
            this.eps,
            this.extraParams,
            this.fpx,
            this.giropay,
            this.grabpay,
            this.ideal,
            this.interacPresent,
            this.kakaoPay,
            this.klarna,
            this.konbini,
            this.krCard,
            this.link,
            this.mobilepay,
            this.multibanco,
            this.naverPay,
            this.nzBankAccount,
            this.oxxo,
            this.p24,
            this.payByBank,
            this.payco,
            this.paynow,
            this.paypal,
            this.pix,
            this.promptpay,
            this.revolutPay,
            this.samsungPay,
            this.satispay,
            this.sepaDebit,
            this.sofort,
            this.swish,
            this.twint,
            this.usBankAccount,
            this.wechatPay,
            this.zip);
      }

      /**
       * If this is a {@code acss_debit} PaymentMethod, this sub-hash contains details about the
       * ACSS Debit payment method options.
       */
      public Builder setAcssDebit(
          PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit acssDebit) {
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
      public Builder setAffirm(PaymentIntentCreateParams.PaymentMethodOptions.Affirm affirm) {
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
          PaymentIntentCreateParams.PaymentMethodOptions.AfterpayClearpay afterpayClearpay) {
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
      public Builder setAlipay(PaymentIntentCreateParams.PaymentMethodOptions.Alipay alipay) {
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
       * If this is a {@code alma} PaymentMethod, this sub-hash contains details about the Alma
       * payment method options.
       */
      public Builder setAlma(PaymentIntentCreateParams.PaymentMethodOptions.Alma alma) {
        this.alma = alma;
        return this;
      }

      /**
       * If this is a {@code alma} PaymentMethod, this sub-hash contains details about the Alma
       * payment method options.
       */
      public Builder setAlma(EmptyParam alma) {
        this.alma = alma;
        return this;
      }

      /**
       * If this is a {@code amazon_pay} PaymentMethod, this sub-hash contains details about the
       * Amazon Pay payment method options.
       */
      public Builder setAmazonPay(
          PaymentIntentCreateParams.PaymentMethodOptions.AmazonPay amazonPay) {
        this.amazonPay = amazonPay;
        return this;
      }

      /**
       * If this is a {@code amazon_pay} PaymentMethod, this sub-hash contains details about the
       * Amazon Pay payment method options.
       */
      public Builder setAmazonPay(EmptyParam amazonPay) {
        this.amazonPay = amazonPay;
        return this;
      }

      /**
       * If this is a {@code au_becs_debit} PaymentMethod, this sub-hash contains details about the
       * AU BECS Direct Debit payment method options.
       */
      public Builder setAuBecsDebit(
          PaymentIntentCreateParams.PaymentMethodOptions.AuBecsDebit auBecsDebit) {
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
          PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit bacsDebit) {
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
          PaymentIntentCreateParams.PaymentMethodOptions.Bancontact bancontact) {
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
       * If this is a {@code billie} PaymentMethod, this sub-hash contains details about the Billie
       * payment method options.
       */
      public Builder setBillie(PaymentIntentCreateParams.PaymentMethodOptions.Billie billie) {
        this.billie = billie;
        return this;
      }

      /**
       * If this is a {@code billie} PaymentMethod, this sub-hash contains details about the Billie
       * payment method options.
       */
      public Builder setBillie(EmptyParam billie) {
        this.billie = billie;
        return this;
      }

      /**
       * If this is a {@code blik} PaymentMethod, this sub-hash contains details about the BLIK
       * payment method options.
       */
      public Builder setBlik(PaymentIntentCreateParams.PaymentMethodOptions.Blik blik) {
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
      public Builder setBoleto(PaymentIntentCreateParams.PaymentMethodOptions.Boleto boleto) {
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
      public Builder setCard(PaymentIntentCreateParams.PaymentMethodOptions.Card card) {
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
          PaymentIntentCreateParams.PaymentMethodOptions.CardPresent cardPresent) {
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
      public Builder setCashapp(PaymentIntentCreateParams.PaymentMethodOptions.Cashapp cashapp) {
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
       * If this is a {@code crypto} PaymentMethod, this sub-hash contains details about the Crypto
       * payment method options.
       */
      public Builder setCrypto(PaymentIntentCreateParams.PaymentMethodOptions.Crypto crypto) {
        this.crypto = crypto;
        return this;
      }

      /**
       * If this is a {@code crypto} PaymentMethod, this sub-hash contains details about the Crypto
       * payment method options.
       */
      public Builder setCrypto(EmptyParam crypto) {
        this.crypto = crypto;
        return this;
      }

      /**
       * If this is a {@code customer balance} PaymentMethod, this sub-hash contains details about
       * the customer balance payment method options.
       */
      public Builder setCustomerBalance(
          PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance customerBalance) {
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
      public Builder setEps(PaymentIntentCreateParams.PaymentMethodOptions.Eps eps) {
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

      /**
       * If this is a {@code fpx} PaymentMethod, this sub-hash contains details about the FPX
       * payment method options.
       */
      public Builder setFpx(PaymentIntentCreateParams.PaymentMethodOptions.Fpx fpx) {
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
      public Builder setGiropay(PaymentIntentCreateParams.PaymentMethodOptions.Giropay giropay) {
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
      public Builder setGrabpay(PaymentIntentCreateParams.PaymentMethodOptions.Grabpay grabpay) {
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
      public Builder setIdeal(PaymentIntentCreateParams.PaymentMethodOptions.Ideal ideal) {
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
          PaymentIntentCreateParams.PaymentMethodOptions.InteracPresent interacPresent) {
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
       * If this is a {@code kakao_pay} PaymentMethod, this sub-hash contains details about the
       * Kakao Pay payment method options.
       */
      public Builder setKakaoPay(PaymentIntentCreateParams.PaymentMethodOptions.KakaoPay kakaoPay) {
        this.kakaoPay = kakaoPay;
        return this;
      }

      /**
       * If this is a {@code kakao_pay} PaymentMethod, this sub-hash contains details about the
       * Kakao Pay payment method options.
       */
      public Builder setKakaoPay(EmptyParam kakaoPay) {
        this.kakaoPay = kakaoPay;
        return this;
      }

      /**
       * If this is a {@code klarna} PaymentMethod, this sub-hash contains details about the Klarna
       * payment method options.
       */
      public Builder setKlarna(PaymentIntentCreateParams.PaymentMethodOptions.Klarna klarna) {
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
      public Builder setKonbini(PaymentIntentCreateParams.PaymentMethodOptions.Konbini konbini) {
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
       * If this is a {@code kr_card} PaymentMethod, this sub-hash contains details about the KR
       * Card payment method options.
       */
      public Builder setKrCard(PaymentIntentCreateParams.PaymentMethodOptions.KrCard krCard) {
        this.krCard = krCard;
        return this;
      }

      /**
       * If this is a {@code kr_card} PaymentMethod, this sub-hash contains details about the KR
       * Card payment method options.
       */
      public Builder setKrCard(EmptyParam krCard) {
        this.krCard = krCard;
        return this;
      }

      /**
       * If this is a {@code link} PaymentMethod, this sub-hash contains details about the Link
       * payment method options.
       */
      public Builder setLink(PaymentIntentCreateParams.PaymentMethodOptions.Link link) {
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
       * If this is a {@code MobilePay} PaymentMethod, this sub-hash contains details about the
       * MobilePay payment method options.
       */
      public Builder setMobilepay(
          PaymentIntentCreateParams.PaymentMethodOptions.Mobilepay mobilepay) {
        this.mobilepay = mobilepay;
        return this;
      }

      /**
       * If this is a {@code MobilePay} PaymentMethod, this sub-hash contains details about the
       * MobilePay payment method options.
       */
      public Builder setMobilepay(EmptyParam mobilepay) {
        this.mobilepay = mobilepay;
        return this;
      }

      /**
       * If this is a {@code multibanco} PaymentMethod, this sub-hash contains details about the
       * Multibanco payment method options.
       */
      public Builder setMultibanco(
          PaymentIntentCreateParams.PaymentMethodOptions.Multibanco multibanco) {
        this.multibanco = multibanco;
        return this;
      }

      /**
       * If this is a {@code multibanco} PaymentMethod, this sub-hash contains details about the
       * Multibanco payment method options.
       */
      public Builder setMultibanco(EmptyParam multibanco) {
        this.multibanco = multibanco;
        return this;
      }

      /**
       * If this is a {@code naver_pay} PaymentMethod, this sub-hash contains details about the
       * Naver Pay payment method options.
       */
      public Builder setNaverPay(PaymentIntentCreateParams.PaymentMethodOptions.NaverPay naverPay) {
        this.naverPay = naverPay;
        return this;
      }

      /**
       * If this is a {@code naver_pay} PaymentMethod, this sub-hash contains details about the
       * Naver Pay payment method options.
       */
      public Builder setNaverPay(EmptyParam naverPay) {
        this.naverPay = naverPay;
        return this;
      }

      /**
       * If this is a {@code nz_bank_account} PaymentMethod, this sub-hash contains details about
       * the NZ BECS Direct Debit payment method options.
       */
      public Builder setNzBankAccount(
          PaymentIntentCreateParams.PaymentMethodOptions.NzBankAccount nzBankAccount) {
        this.nzBankAccount = nzBankAccount;
        return this;
      }

      /**
       * If this is a {@code nz_bank_account} PaymentMethod, this sub-hash contains details about
       * the NZ BECS Direct Debit payment method options.
       */
      public Builder setNzBankAccount(EmptyParam nzBankAccount) {
        this.nzBankAccount = nzBankAccount;
        return this;
      }

      /**
       * If this is a {@code oxxo} PaymentMethod, this sub-hash contains details about the OXXO
       * payment method options.
       */
      public Builder setOxxo(PaymentIntentCreateParams.PaymentMethodOptions.Oxxo oxxo) {
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
      public Builder setP24(PaymentIntentCreateParams.PaymentMethodOptions.P24 p24) {
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
       * If this is a {@code pay_by_bank} PaymentMethod, this sub-hash contains details about the
       * PayByBank payment method options.
       */
      public Builder setPayByBank(
          PaymentIntentCreateParams.PaymentMethodOptions.PayByBank payByBank) {
        this.payByBank = payByBank;
        return this;
      }

      /**
       * If this is a {@code pay_by_bank} PaymentMethod, this sub-hash contains details about the
       * PayByBank payment method options.
       */
      public Builder setPayByBank(EmptyParam payByBank) {
        this.payByBank = payByBank;
        return this;
      }

      /**
       * If this is a {@code payco} PaymentMethod, this sub-hash contains details about the PAYCO
       * payment method options.
       */
      public Builder setPayco(PaymentIntentCreateParams.PaymentMethodOptions.Payco payco) {
        this.payco = payco;
        return this;
      }

      /**
       * If this is a {@code payco} PaymentMethod, this sub-hash contains details about the PAYCO
       * payment method options.
       */
      public Builder setPayco(EmptyParam payco) {
        this.payco = payco;
        return this;
      }

      /**
       * If this is a {@code paynow} PaymentMethod, this sub-hash contains details about the PayNow
       * payment method options.
       */
      public Builder setPaynow(PaymentIntentCreateParams.PaymentMethodOptions.Paynow paynow) {
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
      public Builder setPaypal(PaymentIntentCreateParams.PaymentMethodOptions.Paypal paypal) {
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
      public Builder setPix(PaymentIntentCreateParams.PaymentMethodOptions.Pix pix) {
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
          PaymentIntentCreateParams.PaymentMethodOptions.Promptpay promptpay) {
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
       * If this is a {@code revolut_pay} PaymentMethod, this sub-hash contains details about the
       * Revolut Pay payment method options.
       */
      public Builder setRevolutPay(
          PaymentIntentCreateParams.PaymentMethodOptions.RevolutPay revolutPay) {
        this.revolutPay = revolutPay;
        return this;
      }

      /**
       * If this is a {@code revolut_pay} PaymentMethod, this sub-hash contains details about the
       * Revolut Pay payment method options.
       */
      public Builder setRevolutPay(EmptyParam revolutPay) {
        this.revolutPay = revolutPay;
        return this;
      }

      /**
       * If this is a {@code samsung_pay} PaymentMethod, this sub-hash contains details about the
       * Samsung Pay payment method options.
       */
      public Builder setSamsungPay(
          PaymentIntentCreateParams.PaymentMethodOptions.SamsungPay samsungPay) {
        this.samsungPay = samsungPay;
        return this;
      }

      /**
       * If this is a {@code samsung_pay} PaymentMethod, this sub-hash contains details about the
       * Samsung Pay payment method options.
       */
      public Builder setSamsungPay(EmptyParam samsungPay) {
        this.samsungPay = samsungPay;
        return this;
      }

      /**
       * If this is a {@code satispay} PaymentMethod, this sub-hash contains details about the
       * Satispay payment method options.
       */
      public Builder setSatispay(PaymentIntentCreateParams.PaymentMethodOptions.Satispay satispay) {
        this.satispay = satispay;
        return this;
      }

      /**
       * If this is a {@code satispay} PaymentMethod, this sub-hash contains details about the
       * Satispay payment method options.
       */
      public Builder setSatispay(EmptyParam satispay) {
        this.satispay = satispay;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} PaymentIntent, this sub-hash contains details about the
       * SEPA Debit payment method options.
       */
      public Builder setSepaDebit(
          PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit sepaDebit) {
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
      public Builder setSofort(PaymentIntentCreateParams.PaymentMethodOptions.Sofort sofort) {
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
       * If this is a {@code Swish} PaymentMethod, this sub-hash contains details about the Swish
       * payment method options.
       */
      public Builder setSwish(PaymentIntentCreateParams.PaymentMethodOptions.Swish swish) {
        this.swish = swish;
        return this;
      }

      /**
       * If this is a {@code Swish} PaymentMethod, this sub-hash contains details about the Swish
       * payment method options.
       */
      public Builder setSwish(EmptyParam swish) {
        this.swish = swish;
        return this;
      }

      /**
       * If this is a {@code twint} PaymentMethod, this sub-hash contains details about the TWINT
       * payment method options.
       */
      public Builder setTwint(PaymentIntentCreateParams.PaymentMethodOptions.Twint twint) {
        this.twint = twint;
        return this;
      }

      /**
       * If this is a {@code twint} PaymentMethod, this sub-hash contains details about the TWINT
       * payment method options.
       */
      public Builder setTwint(EmptyParam twint) {
        this.twint = twint;
        return this;
      }

      /**
       * If this is a {@code us_bank_account} PaymentMethod, this sub-hash contains details about
       * the US bank account payment method options.
       */
      public Builder setUsBankAccount(
          PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount usBankAccount) {
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
          PaymentIntentCreateParams.PaymentMethodOptions.WechatPay wechatPay) {
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
      public Builder setZip(PaymentIntentCreateParams.PaymentMethodOptions.Zip zip) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      /** Bank account verification method. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private AcssDebit(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          ApiRequestParams.EnumParam setupFutureUsage,
          String targetDate,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.setupFutureUsage = setupFutureUsage;
        this.targetDate = targetDate;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private String targetDate;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit(
              this.extraParams,
              this.mandateOptions,
              this.setupFutureUsage,
              this.targetDate,
              this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit#extraParams} for
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
            PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Controls when Stripe will attempt to debit the funds from the customer's account. The
         * date must be a string in YYYY-MM-DD format. The date must be in the future and between 3
         * and 15 calendar days from now.
         */
        public Builder setTargetDate(String targetDate) {
          this.targetDate = targetDate;
          return this;
        }

        /** Bank account verification method. */
        public Builder setVerificationMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
        String intervalDescription;

        /** Payment schedule for the mandate. */
        @SerializedName("payment_schedule")
        PaymentSchedule paymentSchedule;

        /** Transaction type of the mandate. */
        @SerializedName("transaction_type")
        TransactionType transactionType;

        private MandateOptions(
            Object customMandateUrl,
            Map<String, Object> extraParams,
            String intervalDescription,
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

          private String intervalDescription;

          private PaymentSchedule paymentSchedule;

          private TransactionType transactionType;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions(
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
           * PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
           * PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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

          /** Payment schedule for the mandate. */
          public Builder setPaymentSchedule(
              PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions
                      .PaymentSchedule
                  paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /** Transaction type of the mandate. */
          public Builder setTransactionType(
              PaymentIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions
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
    @EqualsAndHashCode(callSuper = false)
    public static class Affirm {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
      String preferredLocale;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Affirm(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          String preferredLocale,
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

        private String preferredLocale;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Affirm build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Affirm(
              this.captureMethod, this.extraParams, this.preferredLocale, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Affirm.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Affirm#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Affirm#extraParams} for
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
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Affirm.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
    public static class AfterpayClearpay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * An internal identifier or reference that this payment corresponds to. You must limit the
       * identifier to 128 characters, and it can only contain letters, numbers, underscores,
       * backslashes, and dashes. This field differs from the statement descriptor and item name.
       */
      @SerializedName("reference")
      String reference;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private AfterpayClearpay(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          String reference,
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

        private String reference;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.AfterpayClearpay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.AfterpayClearpay(
              this.captureMethod, this.extraParams, this.reference, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.AfterpayClearpay.CaptureMethod
                captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentCreateParams.PaymentMethodOptions.AfterpayClearpay#extraParams} for the
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
         * PaymentIntentCreateParams.PaymentMethodOptions.AfterpayClearpay#extraParams} for the
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
         * An internal identifier or reference that this payment corresponds to. You must limit the
         * identifier to 128 characters, and it can only contain letters, numbers, underscores,
         * backslashes, and dashes. This field differs from the statement descriptor and item name.
         */
        public Builder setReference(String reference) {
          this.reference = reference;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.AfterpayClearpay.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Alipay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Alipay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Alipay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Alipay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Alipay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
    public static class Alma {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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

      private Alma(ApiRequestParams.EnumParam captureMethod, Map<String, Object> extraParams) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Alma build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Alma(
              this.captureMethod, this.extraParams);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Alma.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Alma#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Alma#extraParams} for the
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

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private AmazonPay(
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
        public PaymentIntentCreateParams.PaymentMethodOptions.AmazonPay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.AmazonPay(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.AmazonPay.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.AmazonPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.AmazonPay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.AmazonPay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      private AuBecsDebit(
          Map<String, Object> extraParams,
          ApiRequestParams.EnumParam setupFutureUsage,
          String targetDate) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
        this.targetDate = targetDate;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private String targetDate;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.AuBecsDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.AuBecsDebit(
              this.extraParams, this.setupFutureUsage, this.targetDate);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.AuBecsDebit#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.AuBecsDebit#extraParams}
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.AuBecsDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Controls when Stripe will attempt to debit the funds from the customer's account. The
         * date must be a string in YYYY-MM-DD format. The date must be in the future and between 3
         * and 15 calendar days from now.
         */
        public Builder setTargetDate(String targetDate) {
          this.targetDate = targetDate;
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
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit {
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      private BacsDebit(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          ApiRequestParams.EnumParam setupFutureUsage,
          String targetDate) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.setupFutureUsage = setupFutureUsage;
        this.targetDate = targetDate;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private String targetDate;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit(
              this.extraParams, this.mandateOptions, this.setupFutureUsage, this.targetDate);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit#extraParams} for
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
            PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Controls when Stripe will attempt to debit the funds from the customer's account. The
         * date must be a string in YYYY-MM-DD format. The date must be in the future and between 3
         * and 15 calendar days from now.
         */
        public Builder setTargetDate(String targetDate) {
          this.targetDate = targetDate;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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

        /**
         * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
         * consist of only uppercase letters, numbers, spaces, or the following special characters:
         * '/', '_', '-', '&amp;', '.'. Cannot begin with 'DDIC' or 'STRIPE'.
         */
        @SerializedName("reference_prefix")
        Object referencePrefix;

        private MandateOptions(Map<String, Object> extraParams, Object referencePrefix) {
          this.extraParams = extraParams;
          this.referencePrefix = referencePrefix;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object referencePrefix;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit.MandateOptions build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit.MandateOptions(
                this.extraParams, this.referencePrefix);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit.MandateOptions#extraParams}
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
           * PaymentIntentCreateParams.PaymentMethodOptions.BacsDebit.MandateOptions#extraParams}
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
           * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
           * consist of only uppercase letters, numbers, spaces, or the following special
           * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'DDIC' or 'STRIPE'.
           */
          public Builder setReferencePrefix(String referencePrefix) {
            this.referencePrefix = referencePrefix;
            return this;
          }

          /**
           * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
           * consist of only uppercase letters, numbers, spaces, or the following special
           * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'DDIC' or 'STRIPE'.
           */
          public Builder setReferencePrefix(EmptyParam referencePrefix) {
            this.referencePrefix = referencePrefix;
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Bancontact build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Bancontact(
              this.extraParams, this.preferredLanguage, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Bancontact#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Bancontact#extraParams}
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
            PaymentIntentCreateParams.PaymentMethodOptions.Bancontact.PreferredLanguage
                preferredLanguage) {
          this.preferredLanguage = preferredLanguage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Bancontact.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
    public static class Billie {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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

      private Billie(ApiRequestParams.EnumParam captureMethod, Map<String, Object> extraParams) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Billie build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Billie(
              this.captureMethod, this.extraParams);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Billie.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Billie#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Billie#extraParams} for
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

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Blik {
      /**
       * The 6-digit BLIK code that a customer has generated using their banking application. Can
       * only be set on confirmation.
       */
      @SerializedName("code")
      String code;

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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Blik(
          String code,
          Map<String, Object> extraParams,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.code = code;
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String code;

        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Blik build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Blik(
              this.code, this.extraParams, this.setupFutureUsage);
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
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Blik#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Blik#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Blik.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Boleto build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Boleto(
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Boleto#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Boleto#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Boleto.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
       */
      @SerializedName("capture_method")
      ApiRequestParams.EnumParam captureMethod;

      /**
       * A single-use {@code cvc_update} Token that represents a card CVC value. When provided, the
       * CVC value will be verified during the card payment attempt. This parameter can only be
       * provided during confirmation.
       */
      @SerializedName("cvc_token")
      String cvcToken;

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
       * Request ability to <a
       * href="https://stripe.com/docs/payments/extended-authorization">capture beyond the standard
       * authorization validity window</a> for this PaymentIntent.
       */
      @SerializedName("request_extended_authorization")
      RequestExtendedAuthorization requestExtendedAuthorization;

      /**
       * Request ability to <a
       * href="https://stripe.com/docs/payments/incremental-authorization">increment the
       * authorization</a> for this PaymentIntent.
       */
      @SerializedName("request_incremental_authorization")
      RequestIncrementalAuthorization requestIncrementalAuthorization;

      /**
       * Request ability to make <a href="https://stripe.com/docs/payments/multicapture">multiple
       * captures</a> for this PaymentIntent.
       */
      @SerializedName("request_multicapture")
      RequestMulticapture requestMulticapture;

      /**
       * Request ability to <a href="https://stripe.com/docs/payments/overcapture">overcapture</a>
       * for this PaymentIntent.
       */
      @SerializedName("request_overcapture")
      RequestOvercapture requestOvercapture;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and <a
       * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. If not provided, this value defaults to {@code automatic}. Read our
       * guide on <a
       * href="https://stripe.com/docs/payments/3d-secure/authentication-flow#manual-three-ds">manually
       * requesting 3D Secure</a> for more information on how this configuration interacts with
       * Radar and our SCA Engine.
       */
      @SerializedName("request_three_d_secure")
      RequestThreeDSecure requestThreeDSecure;

      /**
       * When enabled, using a card that is attached to a customer will require the CVC to be
       * provided again (i.e. using the cvc_token parameter).
       */
      @SerializedName("require_cvc_recollection")
      Boolean requireCvcRecollection;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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

      /**
       * If 3D Secure authentication was performed with a third-party provider, the authentication
       * details to use for this payment.
       */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      private Card(
          ApiRequestParams.EnumParam captureMethod,
          String cvcToken,
          Map<String, Object> extraParams,
          Installments installments,
          MandateOptions mandateOptions,
          Boolean moto,
          Network network,
          RequestExtendedAuthorization requestExtendedAuthorization,
          RequestIncrementalAuthorization requestIncrementalAuthorization,
          RequestMulticapture requestMulticapture,
          RequestOvercapture requestOvercapture,
          RequestThreeDSecure requestThreeDSecure,
          Boolean requireCvcRecollection,
          ApiRequestParams.EnumParam setupFutureUsage,
          Object statementDescriptorSuffixKana,
          Object statementDescriptorSuffixKanji,
          ThreeDSecure threeDSecure) {
        this.captureMethod = captureMethod;
        this.cvcToken = cvcToken;
        this.extraParams = extraParams;
        this.installments = installments;
        this.mandateOptions = mandateOptions;
        this.moto = moto;
        this.network = network;
        this.requestExtendedAuthorization = requestExtendedAuthorization;
        this.requestIncrementalAuthorization = requestIncrementalAuthorization;
        this.requestMulticapture = requestMulticapture;
        this.requestOvercapture = requestOvercapture;
        this.requestThreeDSecure = requestThreeDSecure;
        this.requireCvcRecollection = requireCvcRecollection;
        this.setupFutureUsage = setupFutureUsage;
        this.statementDescriptorSuffixKana = statementDescriptorSuffixKana;
        this.statementDescriptorSuffixKanji = statementDescriptorSuffixKanji;
        this.threeDSecure = threeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private String cvcToken;

        private Map<String, Object> extraParams;

        private Installments installments;

        private MandateOptions mandateOptions;

        private Boolean moto;

        private Network network;

        private RequestExtendedAuthorization requestExtendedAuthorization;

        private RequestIncrementalAuthorization requestIncrementalAuthorization;

        private RequestMulticapture requestMulticapture;

        private RequestOvercapture requestOvercapture;

        private RequestThreeDSecure requestThreeDSecure;

        private Boolean requireCvcRecollection;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private Object statementDescriptorSuffixKana;

        private Object statementDescriptorSuffixKanji;

        private ThreeDSecure threeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Card build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Card(
              this.captureMethod,
              this.cvcToken,
              this.extraParams,
              this.installments,
              this.mandateOptions,
              this.moto,
              this.network,
              this.requestExtendedAuthorization,
              this.requestIncrementalAuthorization,
              this.requestMulticapture,
              this.requestOvercapture,
              this.requestThreeDSecure,
              this.requireCvcRecollection,
              this.setupFutureUsage,
              this.statementDescriptorSuffixKana,
              this.statementDescriptorSuffixKanji,
              this.threeDSecure);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
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
         * <p>For more information, see the <a
         * href="https://stripe.com/docs/payments/installments">installments integration guide</a>.
         */
        public Builder setInstallments(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments installments) {
          this.installments = installments;
          return this;
        }

        /** Configuration options for setting up an eMandate for cards issued in India. */
        public Builder setMandateOptions(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions mandateOptions) {
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
            PaymentIntentCreateParams.PaymentMethodOptions.Card.Network network) {
          this.network = network;
          return this;
        }

        /**
         * Request ability to <a
         * href="https://stripe.com/docs/payments/extended-authorization">capture beyond the
         * standard authorization validity window</a> for this PaymentIntent.
         */
        public Builder setRequestExtendedAuthorization(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.RequestExtendedAuthorization
                requestExtendedAuthorization) {
          this.requestExtendedAuthorization = requestExtendedAuthorization;
          return this;
        }

        /**
         * Request ability to <a
         * href="https://stripe.com/docs/payments/incremental-authorization">increment the
         * authorization</a> for this PaymentIntent.
         */
        public Builder setRequestIncrementalAuthorization(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.RequestIncrementalAuthorization
                requestIncrementalAuthorization) {
          this.requestIncrementalAuthorization = requestIncrementalAuthorization;
          return this;
        }

        /**
         * Request ability to make <a href="https://stripe.com/docs/payments/multicapture">multiple
         * captures</a> for this PaymentIntent.
         */
        public Builder setRequestMulticapture(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.RequestMulticapture
                requestMulticapture) {
          this.requestMulticapture = requestMulticapture;
          return this;
        }

        /**
         * Request ability to <a href="https://stripe.com/docs/payments/overcapture">overcapture</a>
         * for this PaymentIntent.
         */
        public Builder setRequestOvercapture(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.RequestOvercapture
                requestOvercapture) {
          this.requestOvercapture = requestOvercapture;
          return this;
        }

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and <a
         * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. If not provided, this value defaults to {@code automatic}. Read our
         * guide on <a
         * href="https://stripe.com/docs/payments/3d-secure/authentication-flow#manual-three-ds">manually
         * requesting 3D Secure</a> for more information on how this configuration interacts with
         * Radar and our SCA Engine.
         */
        public Builder setRequestThreeDSecure(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.RequestThreeDSecure
                requestThreeDSecure) {
          this.requestThreeDSecure = requestThreeDSecure;
          return this;
        }

        /**
         * When enabled, using a card that is attached to a customer will require the CVC to be
         * provided again (i.e. using the cvc_token parameter).
         */
        public Builder setRequireCvcRecollection(Boolean requireCvcRecollection) {
          this.requireCvcRecollection = requireCvcRecollection;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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

        /**
         * If 3D Secure authentication was performed with a third-party provider, the authentication
         * details to use for this payment.
         */
        public Builder setThreeDSecure(
            PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure threeDSecure) {
          this.threeDSecure = threeDSecure;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments(
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
          public Builder setPlan(
              PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments.Plan plan) {
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
        @EqualsAndHashCode(callSuper = false)
        public static class Plan {
          /**
           * For {@code fixed_count} installment plans, this is required. It represents the number
           * of installment payments your customer will make to their credit card.
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
           * For {@code fixed_count} installment plans, this is required. It represents the interval
           * between installment payments your customer will make to their credit card. One of
           * {@code month}.
           */
          @SerializedName("interval")
          Interval interval;

          /**
           * <strong>Required.</strong> Type of installment plan, one of {@code fixed_count}, {@code
           * bonus}, or {@code revolving}.
           */
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
            public PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments.Plan build() {
              return new PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments.Plan(
                  this.count, this.extraParams, this.interval, this.type);
            }

            /**
             * For {@code fixed_count} installment plans, this is required. It represents the number
             * of installment payments your customer will make to their credit card.
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
             * For {@code fixed_count} installment plans, this is required. It represents the
             * interval between installment payments your customer will make to their credit card.
             * One of {@code month}.
             */
            public Builder setInterval(
                PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments.Plan.Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /**
             * <strong>Required.</strong> Type of installment plan, one of {@code fixed_count},
             * {@code bonus}, or {@code revolving}.
             */
            public Builder setType(
                PaymentIntentCreateParams.PaymentMethodOptions.Card.Installments.Plan.Type type) {
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
            @SerializedName("bonus")
            BONUS("bonus"),

            @SerializedName("fixed_count")
            FIXED_COUNT("fixed_count"),

            @SerializedName("revolving")
            REVOLVING("revolving");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
        String description;

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
        String reference;

        /**
         * <strong>Required.</strong> Start date of the mandate or subscription. Start date should
         * not be lesser than yesterday.
         */
        @SerializedName("start_date")
        Long startDate;

        /** Specifies the type of mandates supported. Possible values are {@code india}. */
        @SerializedName("supported_types")
        List<PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
            supportedTypes;

        private MandateOptions(
            Long amount,
            AmountType amountType,
            String description,
            Long endDate,
            Map<String, Object> extraParams,
            Interval interval,
            Long intervalCount,
            String reference,
            Long startDate,
            List<PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
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

          private String description;

          private Long endDate;

          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          private String reference;

          private Long startDate;

          private List<
                  PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
              supportedTypes;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions(
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
              PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions.AmountType
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for the
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for the
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
              PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions.Interval
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions#supportedTypes} for
           * the field documentation.
           */
          public Builder addSupportedType(
              PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions#supportedTypes} for
           * the field documentation.
           */
          public Builder addAllSupportedType(
              List<PaymentIntentCreateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ThreeDSecure {
        /** The {@code transStatus} returned from the card Issuer’s ACS in the ARes. */
        @SerializedName("ares_trans_status")
        AresTransStatus aresTransStatus;

        /**
         * <strong>Required.</strong> The cryptogram, also known as the &quot;authentication
         * value&quot; (AAV, CAVV or AEVV). This value is 20 bytes, base64-encoded into a
         * 28-character string. (Most 3D Secure providers will return the base64-encoded version,
         * which is what you should specify here.)
         */
        @SerializedName("cryptogram")
        String cryptogram;

        /**
         * The Electronic Commerce Indicator (ECI) is returned by your 3D Secure provider and
         * indicates what degree of authentication was performed.
         */
        @SerializedName("electronic_commerce_indicator")
        ElectronicCommerceIndicator electronicCommerceIndicator;

        /** The exemption requested via 3DS and accepted by the issuer at authentication time. */
        @SerializedName("exemption_indicator")
        ExemptionIndicator exemptionIndicator;

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
         * Network specific 3DS fields. Network specific arguments require an explicit card brand
         * choice. The parameter `payment_method_options.card.network`` must be populated
         * accordingly
         */
        @SerializedName("network_options")
        NetworkOptions networkOptions;

        /**
         * The challenge indicator ({@code threeDSRequestorChallengeInd}) which was requested in the
         * AReq sent to the card Issuer's ACS. A string containing 2 digits from 01-99.
         */
        @SerializedName("requestor_challenge_indicator")
        String requestorChallengeIndicator;

        /**
         * <strong>Required.</strong> For 3D Secure 1, the XID. For 3D Secure 2, the Directory
         * Server Transaction ID (dsTransID).
         */
        @SerializedName("transaction_id")
        String transactionId;

        /** <strong>Required.</strong> The version of 3D Secure that was performed. */
        @SerializedName("version")
        Version version;

        private ThreeDSecure(
            AresTransStatus aresTransStatus,
            String cryptogram,
            ElectronicCommerceIndicator electronicCommerceIndicator,
            ExemptionIndicator exemptionIndicator,
            Map<String, Object> extraParams,
            NetworkOptions networkOptions,
            String requestorChallengeIndicator,
            String transactionId,
            Version version) {
          this.aresTransStatus = aresTransStatus;
          this.cryptogram = cryptogram;
          this.electronicCommerceIndicator = electronicCommerceIndicator;
          this.exemptionIndicator = exemptionIndicator;
          this.extraParams = extraParams;
          this.networkOptions = networkOptions;
          this.requestorChallengeIndicator = requestorChallengeIndicator;
          this.transactionId = transactionId;
          this.version = version;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AresTransStatus aresTransStatus;

          private String cryptogram;

          private ElectronicCommerceIndicator electronicCommerceIndicator;

          private ExemptionIndicator exemptionIndicator;

          private Map<String, Object> extraParams;

          private NetworkOptions networkOptions;

          private String requestorChallengeIndicator;

          private String transactionId;

          private Version version;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure(
                this.aresTransStatus,
                this.cryptogram,
                this.electronicCommerceIndicator,
                this.exemptionIndicator,
                this.extraParams,
                this.networkOptions,
                this.requestorChallengeIndicator,
                this.transactionId,
                this.version);
          }

          /** The {@code transStatus} returned from the card Issuer’s ACS in the ARes. */
          public Builder setAresTransStatus(
              PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.AresTransStatus
                  aresTransStatus) {
            this.aresTransStatus = aresTransStatus;
            return this;
          }

          /**
           * <strong>Required.</strong> The cryptogram, also known as the &quot;authentication
           * value&quot; (AAV, CAVV or AEVV). This value is 20 bytes, base64-encoded into a
           * 28-character string. (Most 3D Secure providers will return the base64-encoded version,
           * which is what you should specify here.)
           */
          public Builder setCryptogram(String cryptogram) {
            this.cryptogram = cryptogram;
            return this;
          }

          /**
           * The Electronic Commerce Indicator (ECI) is returned by your 3D Secure provider and
           * indicates what degree of authentication was performed.
           */
          public Builder setElectronicCommerceIndicator(
              PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure
                      .ElectronicCommerceIndicator
                  electronicCommerceIndicator) {
            this.electronicCommerceIndicator = electronicCommerceIndicator;
            return this;
          }

          /** The exemption requested via 3DS and accepted by the issuer at authentication time. */
          public Builder setExemptionIndicator(
              PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.ExemptionIndicator
                  exemptionIndicator) {
            this.exemptionIndicator = exemptionIndicator;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure#extraParams} for the
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure#extraParams} for the
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
           * Network specific 3DS fields. Network specific arguments require an explicit card brand
           * choice. The parameter `payment_method_options.card.network`` must be populated
           * accordingly
           */
          public Builder setNetworkOptions(
              PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                  networkOptions) {
            this.networkOptions = networkOptions;
            return this;
          }

          /**
           * The challenge indicator ({@code threeDSRequestorChallengeInd}) which was requested in
           * the AReq sent to the card Issuer's ACS. A string containing 2 digits from 01-99.
           */
          public Builder setRequestorChallengeIndicator(String requestorChallengeIndicator) {
            this.requestorChallengeIndicator = requestorChallengeIndicator;
            return this;
          }

          /**
           * <strong>Required.</strong> For 3D Secure 1, the XID. For 3D Secure 2, the Directory
           * Server Transaction ID (dsTransID).
           */
          public Builder setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
          }

          /** <strong>Required.</strong> The version of 3D Secure that was performed. */
          public Builder setVersion(
              PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.Version version) {
            this.version = version;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class NetworkOptions {
          /** Cartes Bancaires-specific 3DS fields. */
          @SerializedName("cartes_bancaires")
          CartesBancaires cartesBancaires;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private NetworkOptions(CartesBancaires cartesBancaires, Map<String, Object> extraParams) {
            this.cartesBancaires = cartesBancaires;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private CartesBancaires cartesBancaires;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                build() {
              return new PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure
                  .NetworkOptions(this.cartesBancaires, this.extraParams);
            }

            /** Cartes Bancaires-specific 3DS fields. */
            public Builder setCartesBancaires(
                PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                        .CartesBancaires
                    cartesBancaires) {
              this.cartesBancaires = cartesBancaires;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions#extraParams}
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
             * PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions#extraParams}
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

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class CartesBancaires {
            /**
             * <strong>Required.</strong> The cryptogram calculation algorithm used by the card
             * Issuer's ACS to calculate the Authentication cryptogram. Also known as {@code
             * cavvAlgorithm}. messageExtension: CB-AVALGO
             */
            @SerializedName("cb_avalgo")
            CbAvalgo cbAvalgo;

            /**
             * The exemption indicator returned from Cartes Bancaires in the ARes. message
             * extension: CB-EXEMPTION; string (4 characters) This is a 3 byte bitmap (low
             * significant byte first and most significant bit first) that has been Base64 encoded
             */
            @SerializedName("cb_exemption")
            String cbExemption;

            /**
             * The risk score returned from Cartes Bancaires in the ARes. message extension:
             * CB-SCORE; numeric value 0-99
             */
            @SerializedName("cb_score")
            Long cbScore;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private CartesBancaires(
                CbAvalgo cbAvalgo,
                String cbExemption,
                Long cbScore,
                Map<String, Object> extraParams) {
              this.cbAvalgo = cbAvalgo;
              this.cbExemption = cbExemption;
              this.cbScore = cbScore;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private CbAvalgo cbAvalgo;

              private String cbExemption;

              private Long cbScore;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                      .CartesBancaires
                  build() {
                return new PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure
                    .NetworkOptions.CartesBancaires(
                    this.cbAvalgo, this.cbExemption, this.cbScore, this.extraParams);
              }

              /**
               * <strong>Required.</strong> The cryptogram calculation algorithm used by the card
               * Issuer's ACS to calculate the Authentication cryptogram. Also known as {@code
               * cavvAlgorithm}. messageExtension: CB-AVALGO
               */
              public Builder setCbAvalgo(
                  PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                          .CartesBancaires.CbAvalgo
                      cbAvalgo) {
                this.cbAvalgo = cbAvalgo;
                return this;
              }

              /**
               * The exemption indicator returned from Cartes Bancaires in the ARes. message
               * extension: CB-EXEMPTION; string (4 characters) This is a 3 byte bitmap (low
               * significant byte first and most significant bit first) that has been Base64 encoded
               */
              public Builder setCbExemption(String cbExemption) {
                this.cbExemption = cbExemption;
                return this;
              }

              /**
               * The risk score returned from Cartes Bancaires in the ARes. message extension:
               * CB-SCORE; numeric value 0-99
               */
              public Builder setCbScore(Long cbScore) {
                this.cbScore = cbScore;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions.CartesBancaires#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PaymentIntentCreateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions.CartesBancaires#extraParams}
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

            public enum CbAvalgo implements ApiRequestParams.EnumParam {
              @SerializedName("0")
              N0("0"),

              @SerializedName("1")
              N1("1"),

              @SerializedName("2")
              N2("2"),

              @SerializedName("3")
              N3("3"),

              @SerializedName("4")
              N4("4"),

              @SerializedName("A")
              A("A");

              @Getter(onMethod_ = {@Override})
              private final String value;

              CbAvalgo(String value) {
                this.value = value;
              }
            }
          }
        }

        public enum AresTransStatus implements ApiRequestParams.EnumParam {
          @SerializedName("A")
          A("A"),

          @SerializedName("C")
          C("C"),

          @SerializedName("I")
          I("I"),

          @SerializedName("N")
          N("N"),

          @SerializedName("R")
          R("R"),

          @SerializedName("U")
          U("U"),

          @SerializedName("Y")
          Y("Y");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AresTransStatus(String value) {
            this.value = value;
          }
        }

        public enum ElectronicCommerceIndicator implements ApiRequestParams.EnumParam {
          @SerializedName("01")
          N01("01"),

          @SerializedName("02")
          N02("02"),

          @SerializedName("05")
          N05("05"),

          @SerializedName("06")
          N06("06"),

          @SerializedName("07")
          N07("07");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ElectronicCommerceIndicator(String value) {
            this.value = value;
          }
        }

        public enum ExemptionIndicator implements ApiRequestParams.EnumParam {
          @SerializedName("low_risk")
          LOW_RISK("low_risk"),

          @SerializedName("none")
          NONE("none");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ExemptionIndicator(String value) {
            this.value = value;
          }
        }

        public enum Version implements ApiRequestParams.EnumParam {
          @SerializedName("1.0.2")
          N1__0__2("1.0.2"),

          @SerializedName("2.1.0")
          N2__1__0("2.1.0"),

          @SerializedName("2.2.0")
          N2__2__0("2.2.0");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Version(String value) {
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

        @SerializedName("girocard")
        GIROCARD("girocard"),

        @SerializedName("interac")
        INTERAC("interac"),

        @SerializedName("jcb")
        JCB("jcb"),

        @SerializedName("link")
        LINK("link"),

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

      public enum RequestExtendedAuthorization implements ApiRequestParams.EnumParam {
        @SerializedName("if_available")
        IF_AVAILABLE("if_available"),

        @SerializedName("never")
        NEVER("never");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestExtendedAuthorization(String value) {
          this.value = value;
        }
      }

      public enum RequestIncrementalAuthorization implements ApiRequestParams.EnumParam {
        @SerializedName("if_available")
        IF_AVAILABLE("if_available"),

        @SerializedName("never")
        NEVER("never");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestIncrementalAuthorization(String value) {
          this.value = value;
        }
      }

      public enum RequestMulticapture implements ApiRequestParams.EnumParam {
        @SerializedName("if_available")
        IF_AVAILABLE("if_available"),

        @SerializedName("never")
        NEVER("never");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestMulticapture(String value) {
          this.value = value;
        }
      }

      public enum RequestOvercapture implements ApiRequestParams.EnumParam {
        @SerializedName("if_available")
        IF_AVAILABLE("if_available"),

        @SerializedName("never")
        NEVER("never");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestOvercapture(String value) {
          this.value = value;
        }
      }

      public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
        @SerializedName("any")
        ANY("any"),

        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("challenge")
        CHALLENGE("challenge");

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
    @EqualsAndHashCode(callSuper = false)
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

      /**
       * Network routing priority on co-branded EMV cards supporting domestic debit and
       * international card schemes.
       */
      @SerializedName("routing")
      Routing routing;

      private CardPresent(
          Map<String, Object> extraParams,
          Boolean requestExtendedAuthorization,
          Boolean requestIncrementalAuthorizationSupport,
          Routing routing) {
        this.extraParams = extraParams;
        this.requestExtendedAuthorization = requestExtendedAuthorization;
        this.requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport;
        this.routing = routing;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean requestExtendedAuthorization;

        private Boolean requestIncrementalAuthorizationSupport;

        private Routing routing;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.CardPresent build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.CardPresent(
              this.extraParams,
              this.requestExtendedAuthorization,
              this.requestIncrementalAuthorizationSupport,
              this.routing);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.CardPresent#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.CardPresent#extraParams}
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

        /**
         * Network routing priority on co-branded EMV cards supporting domestic debit and
         * international card schemes.
         */
        public Builder setRouting(
            PaymentIntentCreateParams.PaymentMethodOptions.CardPresent.Routing routing) {
          this.routing = routing;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Routing {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Routing requested priority. */
        @SerializedName("requested_priority")
        RequestedPriority requestedPriority;

        private Routing(Map<String, Object> extraParams, RequestedPriority requestedPriority) {
          this.extraParams = extraParams;
          this.requestedPriority = requestedPriority;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private RequestedPriority requestedPriority;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.CardPresent.Routing build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.CardPresent.Routing(
                this.extraParams, this.requestedPriority);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.CardPresent.Routing#extraParams} for the
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
           * PaymentIntentCreateParams.PaymentMethodOptions.CardPresent.Routing#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Routing requested priority. */
          public Builder setRequestedPriority(
              PaymentIntentCreateParams.PaymentMethodOptions.CardPresent.Routing.RequestedPriority
                  requestedPriority) {
            this.requestedPriority = requestedPriority;
            return this;
          }
        }

        public enum RequestedPriority implements ApiRequestParams.EnumParam {
          @SerializedName("domestic")
          DOMESTIC("domestic"),

          @SerializedName("international")
          INTERNATIONAL("international");

          @Getter(onMethod_ = {@Override})
          private final String value;

          RequestedPriority(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashapp {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Cashapp build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Cashapp(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Cashapp.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Cashapp#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Cashapp#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Cashapp.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
    public static class Crypto {
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Crypto(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Crypto build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Crypto(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Crypto#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Crypto#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Crypto.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance(
              this.bankTransfer, this.extraParams, this.fundingType, this.setupFutureUsage);
        }

        /**
         * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
         * {@code bank_transfer}.
         */
        public Builder setBankTransfer(
            PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                bankTransfer) {
          this.bankTransfer = bankTransfer;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance#extraParams} for the field
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
         * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance#extraParams} for the field
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
            PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.FundingType
                fundingType) {
          this.fundingType = fundingType;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
                PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
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
                    PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
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
                  PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .RequestedAddressType>
              requestedAddressTypes;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
              build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer(
                this.euBankTransfer, this.extraParams, this.requestedAddressTypes, this.type);
          }

          /** Configuration for the eu_bank_transfer funding type. */
          public Builder setEuBankTransfer(
              PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .EuBankTransfer
                  euBankTransfer) {
            this.euBankTransfer = euBankTransfer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
           * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
           * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
           * for the field documentation.
           */
          public Builder addRequestedAddressType(
              PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
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
           * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#requestedAddressTypes}
           * for the field documentation.
           */
          public Builder addAllRequestedAddressType(
              List<
                      PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
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
              PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.Type
                  type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class EuBankTransfer {
          /**
           * <strong>Required.</strong> The desired country code of the bank account information.
           * Permitted values include: {@code BE}, {@code DE}, {@code ES}, {@code FR}, {@code IE},
           * or {@code NL}.
           */
          @SerializedName("country")
          String country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private EuBankTransfer(String country, Map<String, Object> extraParams) {
            this.country = country;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String country;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                    .EuBankTransfer
                build() {
              return new PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
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
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
             * PaymentIntentCreateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Eps build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Eps(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Eps#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Eps#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Eps.SetupFutureUsage setupFutureUsage) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Fpx build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Fpx(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Fpx#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Fpx#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Fpx.SetupFutureUsage setupFutureUsage) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Giropay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Giropay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Giropay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Giropay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Giropay.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Grabpay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Grabpay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Grabpay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Grabpay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Grabpay.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Ideal build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Ideal(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Ideal#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Ideal#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Ideal.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
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
        public PaymentIntentCreateParams.PaymentMethodOptions.InteracPresent build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.InteracPresent(
              this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentCreateParams.PaymentMethodOptions.InteracPresent#extraParams} for the field
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
         * PaymentIntentCreateParams.PaymentMethodOptions.InteracPresent#extraParams} for the field
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
    @EqualsAndHashCode(callSuper = false)
    public static class KakaoPay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private KakaoPay(
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
        public PaymentIntentCreateParams.PaymentMethodOptions.KakaoPay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.KakaoPay(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.KakaoPay.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.KakaoPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.KakaoPay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.KakaoPay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
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
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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

      /** On-demand details if setting up or charging an on-demand payment. */
      @SerializedName("on_demand")
      OnDemand onDemand;

      /** Preferred language of the Klarna authorization page that the customer is redirected to. */
      @SerializedName("preferred_locale")
      PreferredLocale preferredLocale;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      /** Subscription details if setting up or charging a subscription. */
      @SerializedName("subscriptions")
      Object subscriptions;

      private Klarna(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          OnDemand onDemand,
          PreferredLocale preferredLocale,
          SetupFutureUsage setupFutureUsage,
          Object subscriptions) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.onDemand = onDemand;
        this.preferredLocale = preferredLocale;
        this.setupFutureUsage = setupFutureUsage;
        this.subscriptions = subscriptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private OnDemand onDemand;

        private PreferredLocale preferredLocale;

        private SetupFutureUsage setupFutureUsage;

        private Object subscriptions;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Klarna build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Klarna(
              this.captureMethod,
              this.extraParams,
              this.onDemand,
              this.preferredLocale,
              this.setupFutureUsage,
              this.subscriptions);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Klarna.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Klarna#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Klarna#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** On-demand details if setting up or charging an on-demand payment. */
        public Builder setOnDemand(
            PaymentIntentCreateParams.PaymentMethodOptions.Klarna.OnDemand onDemand) {
          this.onDemand = onDemand;
          return this;
        }

        /**
         * Preferred language of the Klarna authorization page that the customer is redirected to.
         */
        public Builder setPreferredLocale(
            PaymentIntentCreateParams.PaymentMethodOptions.Klarna.PreferredLocale preferredLocale) {
          this.preferredLocale = preferredLocale;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Klarna.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Add an element to `subscriptions` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCreateParams.PaymentMethodOptions.Klarna#subscriptions} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addSubscription(
            PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription element) {
          if (this.subscriptions == null || this.subscriptions instanceof EmptyParam) {
            this.subscriptions =
                new ArrayList<PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription>();
          }
          ((List<PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription>)
                  this.subscriptions)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `subscriptions` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link PaymentIntentCreateParams.PaymentMethodOptions.Klarna#subscriptions} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllSubscription(
            List<PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription> elements) {
          if (this.subscriptions == null || this.subscriptions instanceof EmptyParam) {
            this.subscriptions =
                new ArrayList<PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription>();
          }
          ((List<PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription>)
                  this.subscriptions)
              .addAll(elements);
          return this;
        }

        /** Subscription details if setting up or charging a subscription. */
        public Builder setSubscriptions(EmptyParam subscriptions) {
          this.subscriptions = subscriptions;
          return this;
        }

        /** Subscription details if setting up or charging a subscription. */
        public Builder setSubscriptions(
            List<PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription>
                subscriptions) {
          this.subscriptions = subscriptions;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class OnDemand {
        /**
         * Your average amount value. You can use a value across your customer base, or segment
         * based on customer type, country, etc.
         */
        @SerializedName("average_amount")
        Long averageAmount;

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
         * The maximum value you may charge a customer per purchase. You can use a value across your
         * customer base, or segment based on customer type, country, etc.
         */
        @SerializedName("maximum_amount")
        Long maximumAmount;

        /**
         * The lowest or minimum value you may charge a customer per purchase. You can use a value
         * across your customer base, or segment based on customer type, country, etc.
         */
        @SerializedName("minimum_amount")
        Long minimumAmount;

        /** Interval at which the customer is making purchases. */
        @SerializedName("purchase_interval")
        PurchaseInterval purchaseInterval;

        /** The number of {@code purchase_interval} between charges. */
        @SerializedName("purchase_interval_count")
        Long purchaseIntervalCount;

        private OnDemand(
            Long averageAmount,
            Map<String, Object> extraParams,
            Long maximumAmount,
            Long minimumAmount,
            PurchaseInterval purchaseInterval,
            Long purchaseIntervalCount) {
          this.averageAmount = averageAmount;
          this.extraParams = extraParams;
          this.maximumAmount = maximumAmount;
          this.minimumAmount = minimumAmount;
          this.purchaseInterval = purchaseInterval;
          this.purchaseIntervalCount = purchaseIntervalCount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long averageAmount;

          private Map<String, Object> extraParams;

          private Long maximumAmount;

          private Long minimumAmount;

          private PurchaseInterval purchaseInterval;

          private Long purchaseIntervalCount;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.Klarna.OnDemand build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.Klarna.OnDemand(
                this.averageAmount,
                this.extraParams,
                this.maximumAmount,
                this.minimumAmount,
                this.purchaseInterval,
                this.purchaseIntervalCount);
          }

          /**
           * Your average amount value. You can use a value across your customer base, or segment
           * based on customer type, country, etc.
           */
          public Builder setAverageAmount(Long averageAmount) {
            this.averageAmount = averageAmount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.Klarna.OnDemand#extraParams} for the
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Klarna.OnDemand#extraParams} for the
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
           * The maximum value you may charge a customer per purchase. You can use a value across
           * your customer base, or segment based on customer type, country, etc.
           */
          public Builder setMaximumAmount(Long maximumAmount) {
            this.maximumAmount = maximumAmount;
            return this;
          }

          /**
           * The lowest or minimum value you may charge a customer per purchase. You can use a value
           * across your customer base, or segment based on customer type, country, etc.
           */
          public Builder setMinimumAmount(Long minimumAmount) {
            this.minimumAmount = minimumAmount;
            return this;
          }

          /** Interval at which the customer is making purchases. */
          public Builder setPurchaseInterval(
              PaymentIntentCreateParams.PaymentMethodOptions.Klarna.OnDemand.PurchaseInterval
                  purchaseInterval) {
            this.purchaseInterval = purchaseInterval;
            return this;
          }

          /** The number of {@code purchase_interval} between charges. */
          public Builder setPurchaseIntervalCount(Long purchaseIntervalCount) {
            this.purchaseIntervalCount = purchaseIntervalCount;
            return this;
          }
        }

        public enum PurchaseInterval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PurchaseInterval(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Subscription {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Unit of time between subscription charges. */
        @SerializedName("interval")
        Interval interval;

        /**
         * The number of intervals (specified in the {@code interval} attribute) between
         * subscription charges. For example, {@code interval=month} and {@code interval_count=3}
         * charges every 3 months.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        /** Name for subscription. */
        @SerializedName("name")
        String name;

        /** Describes the upcoming charge for this subscription. */
        @SerializedName("next_billing")
        NextBilling nextBilling;

        /**
         * <strong>Required.</strong> A non-customer-facing reference to correlate subscription
         * charges in the Klarna app. Use a value that persists across subscription charges.
         */
        @SerializedName("reference")
        String reference;

        private Subscription(
            Map<String, Object> extraParams,
            Interval interval,
            Long intervalCount,
            String name,
            NextBilling nextBilling,
            String reference) {
          this.extraParams = extraParams;
          this.interval = interval;
          this.intervalCount = intervalCount;
          this.name = name;
          this.nextBilling = nextBilling;
          this.reference = reference;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          private String name;

          private NextBilling nextBilling;

          private String reference;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription(
                this.extraParams,
                this.interval,
                this.intervalCount,
                this.name,
                this.nextBilling,
                this.reference);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription#extraParams} for the
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
           * PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Unit of time between subscription charges. */
          public Builder setInterval(
              PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription.Interval
                  interval) {
            this.interval = interval;
            return this;
          }

          /**
           * The number of intervals (specified in the {@code interval} attribute) between
           * subscription charges. For example, {@code interval=month} and {@code interval_count=3}
           * charges every 3 months.
           */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }

          /** Name for subscription. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Describes the upcoming charge for this subscription. */
          public Builder setNextBilling(
              PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling
                  nextBilling) {
            this.nextBilling = nextBilling;
            return this;
          }

          /**
           * <strong>Required.</strong> A non-customer-facing reference to correlate subscription
           * charges in the Klarna app. Use a value that persists across subscription charges.
           */
          public Builder setReference(String reference) {
            this.reference = reference;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class NextBilling {
          /** <strong>Required.</strong> The amount of the next charge for the subscription. */
          @SerializedName("amount")
          Long amount;

          /**
           * <strong>Required.</strong> The date of the next charge for the subscription in
           * YYYY-MM-DD format.
           */
          @SerializedName("date")
          String date;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private NextBilling(Long amount, String date, Map<String, Object> extraParams) {
            this.amount = amount;
            this.date = date;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private String date;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling
                build() {
              return new PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription
                  .NextBilling(this.amount, this.date, this.extraParams);
            }

            /** <strong>Required.</strong> The amount of the next charge for the subscription. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * <strong>Required.</strong> The date of the next charge for the subscription in
             * YYYY-MM-DD format.
             */
            public Builder setDate(String date) {
              this.date = date;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling#extraParams}
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
             * PaymentIntentCreateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling#extraParams}
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

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

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

        @SerializedName("en-RO")
        EN_RO("en-RO"),

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

        @SerializedName("ro-RO")
        RO_RO("ro-RO"),

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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Konbini build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Konbini(
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Konbini#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Konbini#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Konbini.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
    public static class KrCard {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private KrCard(
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
        public PaymentIntentCreateParams.PaymentMethodOptions.KrCard build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.KrCard(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.KrCard.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.KrCard#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.KrCard#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.KrCard.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
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
    @EqualsAndHashCode(callSuper = false)
    public static class Link {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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

      /** [Deprecated] This is a legacy parameter that no longer has any function. */
      @SerializedName("persistent_token")
      @Deprecated
      String persistentToken;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Link(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          String persistentToken,
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

        private String persistentToken;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Link build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Link(
              this.captureMethod, this.extraParams, this.persistentToken, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Link.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Link#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Link#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** [Deprecated] This is a legacy parameter that no longer has any function. */
        @Deprecated
        public Builder setPersistentToken(String persistentToken) {
          this.persistentToken = persistentToken;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Link.SetupFutureUsage setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
    public static class Mobilepay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Mobilepay(
          ApiRequestParams.EnumParam captureMethod,
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
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Mobilepay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Mobilepay(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Mobilepay.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Mobilepay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Mobilepay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Mobilepay.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
    public static class Multibanco {
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Multibanco(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Multibanco build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Multibanco(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Multibanco#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Multibanco#extraParams}
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Multibanco.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
    public static class NaverPay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private NaverPay(
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
        public PaymentIntentCreateParams.PaymentMethodOptions.NaverPay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.NaverPay(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.NaverPay.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.NaverPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.NaverPay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.NaverPay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
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
    @EqualsAndHashCode(callSuper = false)
    public static class NzBankAccount {
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      private NzBankAccount(
          Map<String, Object> extraParams,
          ApiRequestParams.EnumParam setupFutureUsage,
          String targetDate) {
        this.extraParams = extraParams;
        this.setupFutureUsage = setupFutureUsage;
        this.targetDate = targetDate;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private String targetDate;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.NzBankAccount build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.NzBankAccount(
              this.extraParams, this.setupFutureUsage, this.targetDate);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.NzBankAccount#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.NzBankAccount#extraParams}
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.NzBankAccount.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Controls when Stripe will attempt to debit the funds from the customer's account. The
         * date must be a string in YYYY-MM-DD format. The date must be in the future and between 3
         * and 15 calendar days from now.
         */
        public Builder setTargetDate(String targetDate) {
          this.targetDate = targetDate;
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Oxxo build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Oxxo(
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Oxxo#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Oxxo#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Oxxo.SetupFutureUsage setupFutureUsage) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.P24 build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.P24(
              this.extraParams, this.setupFutureUsage, this.tosShownAndAccepted);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.P24#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.P24#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.P24.SetupFutureUsage setupFutureUsage) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class PayByBank {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PayByBank(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.PayByBank build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.PayByBank(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.PayByBank#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.PayByBank#extraParams} for
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
    @EqualsAndHashCode(callSuper = false)
    public static class Payco {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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

      private Payco(ApiRequestParams.EnumParam captureMethod, Map<String, Object> extraParams) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Payco build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Payco(
              this.captureMethod, this.extraParams);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Payco.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Payco#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Payco#extraParams} for the
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

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Paynow build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Paynow(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Paynow#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Paynow#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Paynow.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
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
      String reference;

      /** The risk correlation ID for an on-session payment using a saved PayPal payment method. */
      @SerializedName("risk_correlation_id")
      String riskCorrelationId;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private Paypal(
          ApiRequestParams.EnumParam captureMethod,
          Map<String, Object> extraParams,
          PreferredLocale preferredLocale,
          String reference,
          String riskCorrelationId,
          ApiRequestParams.EnumParam setupFutureUsage) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
        this.preferredLocale = preferredLocale;
        this.reference = reference;
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

        private String reference;

        private String riskCorrelationId;

        private ApiRequestParams.EnumParam setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Paypal build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Paypal(
              this.captureMethod,
              this.extraParams,
              this.preferredLocale,
              this.reference,
              this.riskCorrelationId,
              this.setupFutureUsage);
        }

        /** Controls when the funds will be captured from the customer's account. */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Paypal.CaptureMethod captureMethod) {
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Paypal#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Paypal#extraParams} for
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
            PaymentIntentCreateParams.PaymentMethodOptions.Paypal.PreferredLocale preferredLocale) {
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
         * The risk correlation ID for an on-session payment using a saved PayPal payment method.
         */
        public Builder setRiskCorrelationId(String riskCorrelationId) {
          this.riskCorrelationId = riskCorrelationId;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Paypal.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Pix build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Pix(
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Pix#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Pix#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Pix.SetupFutureUsage setupFutureUsage) {
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Promptpay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Promptpay(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Promptpay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Promptpay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Promptpay.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      private RevolutPay(
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
        public PaymentIntentCreateParams.PaymentMethodOptions.RevolutPay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.RevolutPay(
              this.captureMethod, this.extraParams, this.setupFutureUsage);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.RevolutPay.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.RevolutPay#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.RevolutPay#extraParams}
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.RevolutPay.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
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
    @EqualsAndHashCode(callSuper = false)
    public static class SamsungPay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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

      private SamsungPay(
          ApiRequestParams.EnumParam captureMethod, Map<String, Object> extraParams) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.SamsungPay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.SamsungPay(
              this.captureMethod, this.extraParams);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.SamsungPay.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.SamsungPay#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.SamsungPay#extraParams}
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

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Satispay {
      /**
       * Controls when the funds are captured from the customer's account.
       *
       * <p>If provided, this parameter overrides the behavior of the top-level <a
       * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
       * for this payment method type when finalizing the payment with this payment method type.
       *
       * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty value
       * for this parameter unsets the stored value for this payment method type.
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

      private Satispay(ApiRequestParams.EnumParam captureMethod, Map<String, Object> extraParams) {
        this.captureMethod = captureMethod;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ApiRequestParams.EnumParam captureMethod;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Satispay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Satispay(
              this.captureMethod, this.extraParams);
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.Satispay.CaptureMethod captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Controls when the funds are captured from the customer's account.
         *
         * <p>If provided, this parameter overrides the behavior of the top-level <a
         * href="https://stripe.com/api/payment_intents/update#update_payment_intent-capture_method">capture_method</a>
         * for this payment method type when finalizing the payment with this payment method type.
         *
         * <p>If {@code capture_method} is already set on the PaymentIntent, providing an empty
         * value for this parameter unsets the stored value for this payment method type.
         */
        public Builder setCaptureMethod(EmptyParam captureMethod) {
          this.captureMethod = captureMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Satispay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Satispay#extraParams} for
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

      public enum CaptureMethod implements ApiRequestParams.EnumParam {
        @SerializedName("manual")
        MANUAL("manual");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CaptureMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      private SepaDebit(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          ApiRequestParams.EnumParam setupFutureUsage,
          String targetDate) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.setupFutureUsage = setupFutureUsage;
        this.targetDate = targetDate;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private String targetDate;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit(
              this.extraParams, this.mandateOptions, this.setupFutureUsage, this.targetDate);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit#extraParams} for
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
            PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Controls when Stripe will attempt to debit the funds from the customer's account. The
         * date must be a string in YYYY-MM-DD format. The date must be in the future and between 3
         * and 15 calendar days from now.
         */
        public Builder setTargetDate(String targetDate) {
          this.targetDate = targetDate;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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

        /**
         * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
         * consist of only uppercase letters, numbers, spaces, or the following special characters:
         * '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
         */
        @SerializedName("reference_prefix")
        Object referencePrefix;

        private MandateOptions(Map<String, Object> extraParams, Object referencePrefix) {
          this.extraParams = extraParams;
          this.referencePrefix = referencePrefix;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object referencePrefix;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit.MandateOptions build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit.MandateOptions(
                this.extraParams, this.referencePrefix);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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
           * PaymentIntentCreateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams}
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
           * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
           * consist of only uppercase letters, numbers, spaces, or the following special
           * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
           */
          public Builder setReferencePrefix(String referencePrefix) {
            this.referencePrefix = referencePrefix;
            return this;
          }

          /**
           * Prefix used to generate the Mandate reference. Must be at most 12 characters long. Must
           * consist of only uppercase letters, numbers, spaces, or the following special
           * characters: '/', '_', '-', '&amp;', '.'. Cannot begin with 'STRIPE'.
           */
          public Builder setReferencePrefix(EmptyParam referencePrefix) {
            this.referencePrefix = referencePrefix;
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Sofort build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Sofort(
              this.extraParams, this.preferredLanguage, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Sofort#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Sofort#extraParams} for
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
            PaymentIntentCreateParams.PaymentMethodOptions.Sofort.PreferredLanguage
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Sofort.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
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
    @EqualsAndHashCode(callSuper = false)
    public static class Swish {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** A reference for this payment to be displayed in the Swish app. */
      @SerializedName("reference")
      Object reference;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Swish(
          Map<String, Object> extraParams, Object reference, SetupFutureUsage setupFutureUsage) {
        this.extraParams = extraParams;
        this.reference = reference;
        this.setupFutureUsage = setupFutureUsage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object reference;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.Swish build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Swish(
              this.extraParams, this.reference, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Swish#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Swish#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** A reference for this payment to be displayed in the Swish app. */
        public Builder setReference(String reference) {
          this.reference = reference;
          return this;
        }

        /** A reference for this payment to be displayed in the Swish app. */
        public Builder setReference(EmptyParam reference) {
          this.reference = reference;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Swish.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
    public static class Twint {
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private Twint(Map<String, Object> extraParams, SetupFutureUsage setupFutureUsage) {
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Twint build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Twint(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Twint#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Twint#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Twint.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
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

      /** Additional fields for Mandate creation. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /** Additional fields for network related functions. */
      @SerializedName("networks")
      Networks networks;

      /** Preferred transaction settlement speed. */
      @SerializedName("preferred_settlement_speed")
      ApiRequestParams.EnumParam preferredSettlementSpeed;

      /**
       * Indicates that you intend to make future payments with this PaymentIntent's payment method.
       *
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      ApiRequestParams.EnumParam setupFutureUsage;

      /**
       * Controls when Stripe will attempt to debit the funds from the customer's account. The date
       * must be a string in YYYY-MM-DD format. The date must be in the future and between 3 and 15
       * calendar days from now.
       */
      @SerializedName("target_date")
      String targetDate;

      /** Bank account verification method. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private UsBankAccount(
          Map<String, Object> extraParams,
          FinancialConnections financialConnections,
          MandateOptions mandateOptions,
          Networks networks,
          ApiRequestParams.EnumParam preferredSettlementSpeed,
          ApiRequestParams.EnumParam setupFutureUsage,
          String targetDate,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.financialConnections = financialConnections;
        this.mandateOptions = mandateOptions;
        this.networks = networks;
        this.preferredSettlementSpeed = preferredSettlementSpeed;
        this.setupFutureUsage = setupFutureUsage;
        this.targetDate = targetDate;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FinancialConnections financialConnections;

        private MandateOptions mandateOptions;

        private Networks networks;

        private ApiRequestParams.EnumParam preferredSettlementSpeed;

        private ApiRequestParams.EnumParam setupFutureUsage;

        private String targetDate;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount(
              this.extraParams,
              this.financialConnections,
              this.mandateOptions,
              this.networks,
              this.preferredSettlementSpeed,
              this.setupFutureUsage,
              this.targetDate,
              this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount#extraParams}
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount#extraParams}
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
            PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                financialConnections) {
          this.financialConnections = financialConnections;
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(
            PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /** Additional fields for network related functions. */
        public Builder setNetworks(
            PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks networks) {
          this.networks = networks;
          return this;
        }

        /** Preferred transaction settlement speed. */
        public Builder setPreferredSettlementSpeed(
            PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.PreferredSettlementSpeed
                preferredSettlementSpeed) {
          this.preferredSettlementSpeed = preferredSettlementSpeed;
          return this;
        }

        /** Preferred transaction settlement speed. */
        public Builder setPreferredSettlementSpeed(EmptyParam preferredSettlementSpeed) {
          this.preferredSettlementSpeed = preferredSettlementSpeed;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.SetupFutureUsage
                setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment
         * method.
         *
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
          this.setupFutureUsage = setupFutureUsage;
          return this;
        }

        /**
         * Controls when Stripe will attempt to debit the funds from the customer's account. The
         * date must be a string in YYYY-MM-DD format. The date must be in the future and between 3
         * and 15 calendar days from now.
         */
        public Builder setTargetDate(String targetDate) {
          this.targetDate = targetDate;
          return this;
        }

        /** Bank account verification method. */
        public Builder setVerificationMethod(
            PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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

        /**
         * Provide filters for the linked accounts that the customer can select for the payment
         * method.
         */
        @SerializedName("filters")
        Filters filters;

        /**
         * The list of permissions to request. If this parameter is passed, the {@code
         * payment_method} permission must be included. Valid permissions include: {@code balances},
         * {@code ownership}, {@code payment_method}, and {@code transactions}.
         */
        @SerializedName("permissions")
        List<
                PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .Permission>
            permissions;

        /** List of data features that you would like to retrieve upon account creation. */
        @SerializedName("prefetch")
        List<
                PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .Prefetch>
            prefetch;

        /**
         * For webview integrations only. Upon completing OAuth login in the native browser, the
         * user will be redirected to this URL to return to your app.
         */
        @SerializedName("return_url")
        String returnUrl;

        private FinancialConnections(
            Map<String, Object> extraParams,
            Filters filters,
            List<
                    PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Permission>
                permissions,
            List<
                    PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Prefetch>
                prefetch,
            String returnUrl) {
          this.extraParams = extraParams;
          this.filters = filters;
          this.permissions = permissions;
          this.prefetch = prefetch;
          this.returnUrl = returnUrl;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Filters filters;

          private List<
                  PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Permission>
              permissions;

          private List<
                  PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Prefetch>
              prefetch;

          private String returnUrl;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
              build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
                .FinancialConnections(
                this.extraParams, this.filters, this.permissions, this.prefetch, this.returnUrl);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
           * Provide filters for the linked accounts that the customer can select for the payment
           * method.
           */
          public Builder setFilters(
              PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Filters
                  filters) {
            this.filters = filters;
            return this;
          }

          /**
           * Add an element to `permissions` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addPermission(
              PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addAllPermission(
              List<
                      PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addPrefetch(
              PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addAllPrefetch(
              List<
                      PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
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
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Filters {
          /**
           * The account subcategories to use to filter for selectable accounts. Valid subcategories
           * are {@code checking} and {@code savings}.
           */
          @SerializedName("account_subcategories")
          List<
                  PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Filters.AccountSubcategory>
              accountSubcategories;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Filters(
              List<
                      PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Filters.AccountSubcategory>
                  accountSubcategories,
              Map<String, Object> extraParams) {
            this.accountSubcategories = accountSubcategories;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<
                    PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Filters.AccountSubcategory>
                accountSubcategories;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .Filters
                build() {
              return new PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections.Filters(this.accountSubcategories, this.extraParams);
            }

            /**
             * Add an element to `accountSubcategories` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
             * for the field documentation.
             */
            public Builder addAccountSubcategory(
                PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                        .Filters.AccountSubcategory
                    element) {
              if (this.accountSubcategories == null) {
                this.accountSubcategories = new ArrayList<>();
              }
              this.accountSubcategories.add(element);
              return this;
            }

            /**
             * Add all elements to `accountSubcategories` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
             * for the field documentation.
             */
            public Builder addAllAccountSubcategory(
                List<
                        PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount
                            .FinancialConnections.Filters.AccountSubcategory>
                    elements) {
              if (this.accountSubcategories == null) {
                this.accountSubcategories = new ArrayList<>();
              }
              this.accountSubcategories.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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
             * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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

          public enum AccountSubcategory implements ApiRequestParams.EnumParam {
            @SerializedName("checking")
            CHECKING("checking"),

            @SerializedName("savings")
            SAVINGS("savings");

            @Getter(onMethod_ = {@Override})
            private final String value;

            AccountSubcategory(String value) {
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
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions {
        /** The method used to collect offline mandate customer acceptance. */
        @SerializedName("collection_method")
        ApiRequestParams.EnumParam collectionMethod;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private MandateOptions(
            ApiRequestParams.EnumParam collectionMethod, Map<String, Object> extraParams) {
          this.collectionMethod = collectionMethod;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private ApiRequestParams.EnumParam collectionMethod;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.MandateOptions
              build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.MandateOptions(
                this.collectionMethod, this.extraParams);
          }

          /** The method used to collect offline mandate customer acceptance. */
          public Builder setCollectionMethod(
              PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.MandateOptions
                      .CollectionMethod
                  collectionMethod) {
            this.collectionMethod = collectionMethod;
            return this;
          }

          /** The method used to collect offline mandate customer acceptance. */
          public Builder setCollectionMethod(EmptyParam collectionMethod) {
            this.collectionMethod = collectionMethod;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.MandateOptions#extraParams}
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.MandateOptions#extraParams}
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

        public enum CollectionMethod implements ApiRequestParams.EnumParam {
          @SerializedName("paper")
          PAPER("paper");

          @Getter(onMethod_ = {@Override})
          private final String value;

          CollectionMethod(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
        List<PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
            requested;

        private Networks(
            Map<String, Object> extraParams,
            List<PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
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
                  PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
              requested;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks build() {
            return new PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks#extraParams} for
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks#extraParams} for
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks#requested} for
           * the field documentation.
           */
          public Builder addRequested(
              PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested
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
           * PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks#requested} for
           * the field documentation.
           */
          public Builder addAllRequested(
              List<PaymentIntentCreateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
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

      public enum PreferredSettlementSpeed implements ApiRequestParams.EnumParam {
        @SerializedName("fastest")
        FASTEST("fastest"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PreferredSettlementSpeed(String value) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class WechatPay {
      /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
      @SerializedName("app_id")
      String appId;

      /** The client type that the end customer will pay from. */
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
       * off_session}.
       */
      @SerializedName("setup_future_usage")
      SetupFutureUsage setupFutureUsage;

      private WechatPay(
          String appId,
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
        private String appId;

        private Client client;

        private Map<String, Object> extraParams;

        private SetupFutureUsage setupFutureUsage;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCreateParams.PaymentMethodOptions.WechatPay build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.WechatPay(
              this.appId, this.client, this.extraParams, this.setupFutureUsage);
        }

        /** The app ID registered with WeChat Pay. Only required when client is ios or android. */
        public Builder setAppId(String appId) {
          this.appId = appId;
          return this;
        }

        /** The client type that the end customer will pay from. */
        public Builder setClient(
            PaymentIntentCreateParams.PaymentMethodOptions.WechatPay.Client client) {
          this.client = client;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.WechatPay#extraParams} for
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.WechatPay#extraParams} for
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.WechatPay.SetupFutureUsage
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
    @EqualsAndHashCode(callSuper = false)
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
       * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
       * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to the
       * Customer after the PaymentIntent is confirmed and the customer completes any required
       * actions. If you don't provide a Customer, you can still <a
       * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
       * Customer after the transaction completes.
       *
       * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe creates
       * and attaches a <a
       * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
       * payment method representing the card to the Customer instead.
       *
       * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you comply
       * with regional legislation and network rules, such as <a
       * href="https://stripe.com/strong-customer-authentication">SCA</a>.
       *
       * <p>If you've already set {@code setup_future_usage} and you're performing a request using a
       * publishable key, you can only update the value from {@code on_session} to {@code
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
        public PaymentIntentCreateParams.PaymentMethodOptions.Zip build() {
          return new PaymentIntentCreateParams.PaymentMethodOptions.Zip(
              this.extraParams, this.setupFutureUsage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Zip#extraParams} for the
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
         * map. See {@link PaymentIntentCreateParams.PaymentMethodOptions.Zip#extraParams} for the
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
         * <p>If you provide a Customer with the PaymentIntent, you can use this parameter to <a
         * href="https://stripe.com/payments/save-during-payment">attach the payment method</a> to
         * the Customer after the PaymentIntent is confirmed and the customer completes any required
         * actions. If you don't provide a Customer, you can still <a
         * href="https://stripe.com/api/payment_methods/attach">attach</a> the payment method to a
         * Customer after the transaction completes.
         *
         * <p>If the payment method is {@code card_present} and isn't a digital wallet, Stripe
         * creates and attaches a <a
         * href="https://stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generated_card">generated_card</a>
         * payment method representing the card to the Customer instead.
         *
         * <p>When processing card payments, Stripe uses {@code setup_future_usage} to help you
         * comply with regional legislation and network rules, such as <a
         * href="https://stripe.com/strong-customer-authentication">SCA</a>.
         *
         * <p>If you've already set {@code setup_future_usage} and you're performing a request using
         * a publishable key, you can only update the value from {@code on_session} to {@code
         * off_session}.
         */
        public Builder setSetupFutureUsage(
            PaymentIntentCreateParams.PaymentMethodOptions.Zip.SetupFutureUsage setupFutureUsage) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class RadarOptions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot of
     * the browser metadata and device details that help Radar make more accurate predictions on
     * your payments.
     */
    @SerializedName("session")
    String session;

    private RadarOptions(Map<String, Object> extraParams, String session) {
      this.extraParams = extraParams;
      this.session = session;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String session;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentCreateParams.RadarOptions build() {
        return new PaymentIntentCreateParams.RadarOptions(this.extraParams, this.session);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCreateParams.RadarOptions#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCreateParams.RadarOptions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot of
       * the browser metadata and device details that help Radar make more accurate predictions on
       * your payments.
       */
      public Builder setSession(String session) {
        this.session = session;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Shipping {
    /** <strong>Required.</strong> Shipping address. */
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

    /** <strong>Required.</strong> Recipient name. */
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
      public PaymentIntentCreateParams.Shipping build() {
        return new PaymentIntentCreateParams.Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** <strong>Required.</strong> Shipping address. */
      public Builder setAddress(PaymentIntentCreateParams.Shipping.Address address) {
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

      /** <strong>Required.</strong> Recipient name. */
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
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
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
        public PaymentIntentCreateParams.Shipping.Address build() {
          return new PaymentIntentCreateParams.Shipping.Address(
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

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData {
    /**
     * The amount that will be transferred automatically when a charge succeeds. The amount is
     * capped at the total transaction amount and if no amount is set, the full amount is
     * transferred.
     *
     * <p>If you intend to collect a fee and you need a more robust reporting experience, using <a
     * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-application_fee_amount">application_fee_amount</a>
     * might be a better fit for your integration.
     */
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
      public PaymentIntentCreateParams.TransferData build() {
        return new PaymentIntentCreateParams.TransferData(
            this.amount, this.destination, this.extraParams);
      }

      /**
       * The amount that will be transferred automatically when a charge succeeds. The amount is
       * capped at the total transaction amount and if no amount is set, the full amount is
       * transferred.
       *
       * <p>If you intend to collect a fee and you need a more robust reporting experience, using <a
       * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-application_fee_amount">application_fee_amount</a>
       * might be a better fit for your integration.
       */
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
