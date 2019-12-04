package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
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
   * to charge in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal)
   * (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum
   * amount is $0.50 US or [equivalent in charge
   * currency](https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts). The amount
   * value supports up to eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of the application fee (if any) for the resulting payment. See the PaymentIntents
   * [use case for connected accounts](https://stripe.com/docs/payments/connected-accounts) for
   * details.
   */
  @SerializedName("application_fee_amount")
  Object applicationFeeAmount;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  Object currency;

  /**
   * ID of the Customer this PaymentIntent belongs to, if one exists.
   *
   * <p>If present, payment methods used with this PaymentIntent can only be attached to this
   * Customer, and payment methods attached to other Customers cannot be used with this
   * PaymentIntent.
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

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * ID of the payment method (a PaymentMethod, Card, or [compatible
   * Source](https://stripe.com/docs/payments/payment-methods#compatibility) object) to attach to
   * this PaymentIntent.
   */
  @SerializedName("payment_method")
  Object paymentMethod;

  /** The list of payment method types (e.g. card) that this PaymentIntent is allowed to use. */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /** Email address that the receipt for the resulting payment will be sent to. */
  @SerializedName("receipt_email")
  Object receiptEmail;

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
   * <p>Use `on_session` if you intend to only reuse the payment method when your customer is
   * present in your checkout flow. Use `off_session` if your customer may or may not be in your
   * checkout flow.
   *
   * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
   * regional legislation and network rules. For example, if your customer is impacted by
   * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will ensure
   * that they are authenticated while processing this PaymentIntent. You will then be able to
   * collect [off-session
   * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
   * for this customer.
   *
   * <p>If `setup_future_usage` is already set and you are performing a request using a publishable
   * key, you may only update the value from `on_session` to `off_session`.
   */
  @SerializedName("setup_future_usage")
  EnumParam setupFutureUsage;

  /** Shipping information for this PaymentIntent. */
  @SerializedName("shipping")
  Object shipping;

  /**
   * This is a legacy field that will be removed in the future. It is the ID of the Source object to
   * attach to this PaymentIntent. Please use the `payment_method` field instead, which also
   * supports Cards and [compatible
   * Source](https://stripe.com/docs/payments/payment-methods#compatibility) objects.
   */
  @SerializedName("source")
  Object source;

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
   * information, see the PaymentIntents [use case for connected
   * accounts](https://stripe.com/docs/payments/connected-accounts).
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies the resulting payment as part of a group. `transfer_group` may only be
   * provided if it has not been set. See the PaymentIntents [use case for connected
   * accounts](https://stripe.com/docs/payments/connected-accounts) for details.
   */
  @SerializedName("transfer_group")
  Object transferGroup;

  private PaymentIntentUpdateParams(
      Long amount,
      Object applicationFeeAmount,
      Object currency,
      Object customer,
      Object description,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Object paymentMethod,
      List<String> paymentMethodTypes,
      Object receiptEmail,
      Boolean savePaymentMethod,
      EnumParam setupFutureUsage,
      Object shipping,
      Object source,
      Object statementDescriptor,
      Object statementDescriptorSuffix,
      TransferData transferData,
      Object transferGroup) {
    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodTypes = paymentMethodTypes;
    this.receiptEmail = receiptEmail;
    this.savePaymentMethod = savePaymentMethod;
    this.setupFutureUsage = setupFutureUsage;
    this.shipping = shipping;
    this.source = source;
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

    private Object currency;

    private Object customer;

    private Object description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Object paymentMethod;

    private List<String> paymentMethodTypes;

    private Object receiptEmail;

    private Boolean savePaymentMethod;

    private EnumParam setupFutureUsage;

    private Object shipping;

    private Object source;

    private Object statementDescriptor;

    private Object statementDescriptorSuffix;

    private TransferData transferData;

    private Object transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentUpdateParams build() {
      return new PaymentIntentUpdateParams(
          this.amount,
          this.applicationFeeAmount,
          this.currency,
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodTypes,
          this.receiptEmail,
          this.savePaymentMethod,
          this.setupFutureUsage,
          this.shipping,
          this.source,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData,
          this.transferGroup);
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
     * The amount of the application fee (if any) for the resulting payment. See the PaymentIntents
     * [use case for connected accounts](https://stripe.com/docs/payments/connected-accounts) for
     * details.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * The amount of the application fee (if any) for the resulting payment. See the PaymentIntents
     * [use case for connected accounts](https://stripe.com/docs/payments/connected-accounts) for
     * details.
     */
    public Builder setApplicationFeeAmount(EmptyParam applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
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
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(EmptyParam currency) {
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

    /**
     * ID of the Customer this PaymentIntent belongs to, if one exists.
     *
     * <p>If present, payment methods used with this PaymentIntent can only be attached to this
     * Customer, and payment methods attached to other Customers cannot be used with this
     * PaymentIntent.
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

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentUpdateParams#metadata} for the field documentation.
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
     * See {@link PaymentIntentUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or [compatible
     * Source](https://stripe.com/docs/payments/payment-methods#compatibility) object) to attach to
     * this PaymentIntent.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or [compatible
     * Source](https://stripe.com/docs/payments/payment-methods#compatibility) object) to attach to
     * this PaymentIntent.
     */
    public Builder setPaymentMethod(EmptyParam paymentMethod) {
      this.paymentMethod = paymentMethod;
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

    /** Email address that the receipt for the resulting payment will be sent to. */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /** Email address that the receipt for the resulting payment will be sent to. */
    public Builder setReceiptEmail(EmptyParam receiptEmail) {
      this.receiptEmail = receiptEmail;
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
     * <p>Use `on_session` if you intend to only reuse the payment method when your customer is
     * present in your checkout flow. Use `off_session` if your customer may or may not be in your
     * checkout flow.
     *
     * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
     * regional legislation and network rules. For example, if your customer is impacted by
     * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will
     * ensure that they are authenticated while processing this PaymentIntent. You will then be able
     * to collect [off-session
     * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
     * for this customer.
     *
     * <p>If `setup_future_usage` is already set and you are performing a request using a
     * publishable key, you may only update the value from `on_session` to `off_session`.
     */
    public Builder setSetupFutureUsage(SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * <p>If present, the payment method used with this PaymentIntent can be
     * [attached](https://stripe.com/docs/api/payment_methods/attach) to a Customer, even after the
     * transaction completes.
     *
     * <p>Use `on_session` if you intend to only reuse the payment method when your customer is
     * present in your checkout flow. Use `off_session` if your customer may or may not be in your
     * checkout flow.
     *
     * <p>Stripe uses `setup_future_usage` to dynamically optimize your payment flow and comply with
     * regional legislation and network rules. For example, if your customer is impacted by
     * [SCA](https://stripe.com/docs/strong-customer-authentication), using `off_session` will
     * ensure that they are authenticated while processing this PaymentIntent. You will then be able
     * to collect [off-session
     * payments](https://stripe.com/docs/payments/cards/charging-saved-cards#off-session-payments-with-saved-cards)
     * for this customer.
     *
     * <p>If `setup_future_usage` is already set and you are performing a request using a
     * publishable key, you may only update the value from `on_session` to `off_session`.
     */
    public Builder setSetupFutureUsage(EmptyParam setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /** Shipping information for this PaymentIntent. */
    public Builder setShipping(EmptyParam shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * This is a legacy field that will be removed in the future. It is the ID of the Source object
     * to attach to this PaymentIntent. Please use the `payment_method` field instead, which also
     * supports Cards and [compatible
     * Source](https://stripe.com/docs/payments/payment-methods#compatibility) objects.
     */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /**
     * This is a legacy field that will be removed in the future. It is the ID of the Source object
     * to attach to this PaymentIntent. Please use the `payment_method` field instead, which also
     * supports Cards and [compatible
     * Source](https://stripe.com/docs/payments/payment-methods#compatibility) objects.
     */
    public Builder setSource(EmptyParam source) {
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
     * information, see the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/connected-accounts).
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. `transfer_group` may only
     * be provided if it has not been set. See the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/connected-accounts) for details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }

    /**
     * A string that identifies the resulting payment as part of a group. `transfer_group` may only
     * be provided if it has not been set. See the PaymentIntents [use case for connected
     * accounts](https://stripe.com/docs/payments/connected-accounts) for details.
     */
    public Builder setTransferGroup(EmptyParam transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  @Getter
  public static class Shipping {
    /** Shipping address. */
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

    /** Recipient name. */
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

      /** Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Recipient name. */
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
      @SerializedName("city")
      Object city;

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

      @SerializedName("line1")
      Object line1;

      @SerializedName("line2")
      Object line2;

      @SerializedName("postal_code")
      Object postalCode;

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

        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

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

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }

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
      public TransferData build() {
        return new TransferData(this.amount, this.extraParams);
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
