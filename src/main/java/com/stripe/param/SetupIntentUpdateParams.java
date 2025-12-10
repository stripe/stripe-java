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
public class SetupIntentUpdateParams extends ApiRequestParams {
  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * <p>It can only be used for this Stripe Account’s own money movement flows like InboundTransfer
   * and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer,
   * and defaults to false when attaching a PaymentMethod to a Customer.
   */
  @SerializedName("attach_to_self")
  Boolean attachToSelf;

  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * <p>If present, the SetupIntent's payment method will be attached to the Customer on successful
   * setup. Payment methods attached to other Customers cannot be used with this SetupIntent.
   */
  @SerializedName("customer")
  Object customer;

  /**
   * ID of the Account this SetupIntent belongs to, if one exists.
   *
   * <p>If present, the SetupIntent's payment method will be attached to the Account on successful
   * setup. Payment methods attached to other Accounts cannot be used with this SetupIntent.
   */
  @SerializedName("customer_account")
  Object customerAccount;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  Object description;

  /** The list of payment method types to exclude from use with this SetupIntent. */
  @SerializedName("excluded_payment_method_types")
  Object excludedPaymentMethodTypes;

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
   * Indicates the directions of money movement for which this payment method is intended to be
   * used.
   *
   * <p>Include {@code inbound} if you intend to use the payment method as the origin to pull funds
   * from. Include {@code outbound} if you intend to use the payment method as the destination to
   * send funds to. You can include both if you intend to use the payment method for both purposes.
   */
  @SerializedName("flow_directions")
  List<SetupIntentUpdateParams.FlowDirection> flowDirections;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this
   * SetupIntent. To unset this field to null, pass in an empty string.
   */
  @SerializedName("payment_method")
  Object paymentMethod;

  /**
   * The ID of the <a href="https://docs.stripe.com/api/payment_method_configurations">payment
   * method configuration</a> to use with this SetupIntent.
   */
  @SerializedName("payment_method_configuration")
  Object paymentMethodConfiguration;

  /**
   * When included, this hash creates a PaymentMethod that is set as the <a
   * href="https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method">{@code
   * payment_method}</a> value in the SetupIntent.
   */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** Payment method-specific configuration for this SetupIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * The list of payment method types (for example, card) that this SetupIntent can set up. If you
   * don't provide this, Stripe will dynamically show relevant payment methods from your <a
   * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>. A
   * list of valid payment method types can be found <a
   * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-type">here</a>.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  private SetupIntentUpdateParams(
      Boolean attachToSelf,
      Object customer,
      Object customerAccount,
      Object description,
      Object excludedPaymentMethodTypes,
      List<String> expand,
      Map<String, Object> extraParams,
      List<SetupIntentUpdateParams.FlowDirection> flowDirections,
      Object metadata,
      Object paymentMethod,
      Object paymentMethodConfiguration,
      PaymentMethodData paymentMethodData,
      PaymentMethodOptions paymentMethodOptions,
      List<String> paymentMethodTypes) {
    this.attachToSelf = attachToSelf;
    this.customer = customer;
    this.customerAccount = customerAccount;
    this.description = description;
    this.excludedPaymentMethodTypes = excludedPaymentMethodTypes;
    this.expand = expand;
    this.extraParams = extraParams;
    this.flowDirections = flowDirections;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodConfiguration = paymentMethodConfiguration;
    this.paymentMethodData = paymentMethodData;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentMethodTypes = paymentMethodTypes;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean attachToSelf;

    private Object customer;

    private Object customerAccount;

    private Object description;

    private Object excludedPaymentMethodTypes;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<SetupIntentUpdateParams.FlowDirection> flowDirections;

    private Object metadata;

    private Object paymentMethod;

    private Object paymentMethodConfiguration;

    private PaymentMethodData paymentMethodData;

    private PaymentMethodOptions paymentMethodOptions;

    private List<String> paymentMethodTypes;

    /** Finalize and obtain parameter instance from this builder. */
    public SetupIntentUpdateParams build() {
      return new SetupIntentUpdateParams(
          this.attachToSelf,
          this.customer,
          this.customerAccount,
          this.description,
          this.excludedPaymentMethodTypes,
          this.expand,
          this.extraParams,
          this.flowDirections,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodConfiguration,
          this.paymentMethodData,
          this.paymentMethodOptions,
          this.paymentMethodTypes);
    }

    /**
     * If present, the SetupIntent's payment method will be attached to the in-context Stripe
     * Account.
     *
     * <p>It can only be used for this Stripe Account’s own money movement flows like
     * InboundTransfer and OutboundTransfers. It cannot be set to true when setting up a
     * PaymentMethod for a Customer, and defaults to false when attaching a PaymentMethod to a
     * Customer.
     */
    public Builder setAttachToSelf(Boolean attachToSelf) {
      this.attachToSelf = attachToSelf;
      return this;
    }

    /**
     * ID of the Customer this SetupIntent belongs to, if one exists.
     *
     * <p>If present, the SetupIntent's payment method will be attached to the Customer on
     * successful setup. Payment methods attached to other Customers cannot be used with this
     * SetupIntent.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * ID of the Customer this SetupIntent belongs to, if one exists.
     *
     * <p>If present, the SetupIntent's payment method will be attached to the Customer on
     * successful setup. Payment methods attached to other Customers cannot be used with this
     * SetupIntent.
     */
    public Builder setCustomer(EmptyParam customer) {
      this.customer = customer;
      return this;
    }

    /**
     * ID of the Account this SetupIntent belongs to, if one exists.
     *
     * <p>If present, the SetupIntent's payment method will be attached to the Account on successful
     * setup. Payment methods attached to other Accounts cannot be used with this SetupIntent.
     */
    public Builder setCustomerAccount(String customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }

    /**
     * ID of the Account this SetupIntent belongs to, if one exists.
     *
     * <p>If present, the SetupIntent's payment method will be attached to the Account on successful
     * setup. Payment methods attached to other Accounts cannot be used with this SetupIntent.
     */
    public Builder setCustomerAccount(EmptyParam customerAccount) {
      this.customerAccount = customerAccount;
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
     * Add an element to `excludedPaymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link SetupIntentUpdateParams#excludedPaymentMethodTypes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addExcludedPaymentMethodType(
        SetupIntentUpdateParams.ExcludedPaymentMethodType element) {
      if (this.excludedPaymentMethodTypes == null
          || this.excludedPaymentMethodTypes instanceof EmptyParam) {
        this.excludedPaymentMethodTypes =
            new ArrayList<SetupIntentUpdateParams.ExcludedPaymentMethodType>();
      }
      ((List<SetupIntentUpdateParams.ExcludedPaymentMethodType>) this.excludedPaymentMethodTypes)
          .add(element);
      return this;
    }

    /**
     * Add all elements to `excludedPaymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link SetupIntentUpdateParams#excludedPaymentMethodTypes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllExcludedPaymentMethodType(
        List<SetupIntentUpdateParams.ExcludedPaymentMethodType> elements) {
      if (this.excludedPaymentMethodTypes == null
          || this.excludedPaymentMethodTypes instanceof EmptyParam) {
        this.excludedPaymentMethodTypes =
            new ArrayList<SetupIntentUpdateParams.ExcludedPaymentMethodType>();
      }
      ((List<SetupIntentUpdateParams.ExcludedPaymentMethodType>) this.excludedPaymentMethodTypes)
          .addAll(elements);
      return this;
    }

    /** The list of payment method types to exclude from use with this SetupIntent. */
    public Builder setExcludedPaymentMethodTypes(EmptyParam excludedPaymentMethodTypes) {
      this.excludedPaymentMethodTypes = excludedPaymentMethodTypes;
      return this;
    }

    /** The list of payment method types to exclude from use with this SetupIntent. */
    public Builder setExcludedPaymentMethodTypes(
        List<SetupIntentUpdateParams.ExcludedPaymentMethodType> excludedPaymentMethodTypes) {
      this.excludedPaymentMethodTypes = excludedPaymentMethodTypes;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentUpdateParams#expand} for the field documentation.
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
     * SetupIntentUpdateParams#expand} for the field documentation.
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
     * SetupIntentUpdateParams#extraParams} for the field documentation.
     */
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
     * See {@link SetupIntentUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `flowDirections` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentUpdateParams#flowDirections} for the field documentation.
     */
    public Builder addFlowDirection(SetupIntentUpdateParams.FlowDirection element) {
      if (this.flowDirections == null) {
        this.flowDirections = new ArrayList<>();
      }
      this.flowDirections.add(element);
      return this;
    }

    /**
     * Add all elements to `flowDirections` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentUpdateParams#flowDirections} for the field documentation.
     */
    public Builder addAllFlowDirection(List<SetupIntentUpdateParams.FlowDirection> elements) {
      if (this.flowDirections == null) {
        this.flowDirections = new ArrayList<>();
      }
      this.flowDirections.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SetupIntentUpdateParams#metadata} for the field documentation.
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
     * See {@link SetupIntentUpdateParams#metadata} for the field documentation.
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
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this
     * SetupIntent. To unset this field to null, pass in an empty string.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this
     * SetupIntent. To unset this field to null, pass in an empty string.
     */
    public Builder setPaymentMethod(EmptyParam paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * The ID of the <a href="https://docs.stripe.com/api/payment_method_configurations">payment
     * method configuration</a> to use with this SetupIntent.
     */
    public Builder setPaymentMethodConfiguration(String paymentMethodConfiguration) {
      this.paymentMethodConfiguration = paymentMethodConfiguration;
      return this;
    }

    /**
     * The ID of the <a href="https://docs.stripe.com/api/payment_method_configurations">payment
     * method configuration</a> to use with this SetupIntent.
     */
    public Builder setPaymentMethodConfiguration(EmptyParam paymentMethodConfiguration) {
      this.paymentMethodConfiguration = paymentMethodConfiguration;
      return this;
    }

    /**
     * When included, this hash creates a PaymentMethod that is set as the <a
     * href="https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method">{@code
     * payment_method}</a> value in the SetupIntent.
     */
    public Builder setPaymentMethodData(
        SetupIntentUpdateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** Payment method-specific configuration for this SetupIntent. */
    public Builder setPaymentMethodOptions(
        SetupIntentUpdateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentUpdateParams#paymentMethodTypes} for the field documentation.
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
     * {@link SetupIntentUpdateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addAllPaymentMethodType(List<String> elements) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(elements);
      return this;
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
     * If this is a Gopay PaymentMethod, this hash contains details about the Gopay payment method.
     */
    @SerializedName("gopay")
    Gopay gopay;

    /**
     * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
     * payment method.
     */
    @SerializedName("grabpay")
    Grabpay grabpay;

    /**
     * If this is an {@code IdBankTransfer} PaymentMethod, this hash contains details about the
     * IdBankTransfer payment method.
     */
    @SerializedName("id_bank_transfer")
    IdBankTransfer idBankTransfer;

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
     * If this is a MB WAY PaymentMethod, this hash contains details about the MB WAY payment
     * method.
     */
    @SerializedName("mb_way")
    MbWay mbWay;

    /**
     * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
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
     * If this is a {@code paypay} PaymentMethod, this hash contains details about the PayPay
     * payment method.
     */
    @SerializedName("paypay")
    Paypay paypay;

    /**
     * If this is a {@code payto} PaymentMethod, this hash contains details about the PayTo payment
     * method.
     */
    @SerializedName("payto")
    Payto payto;

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
     * If this is a {@code qris} PaymentMethod, this hash contains details about the QRIS payment
     * method.
     */
    @SerializedName("qris")
    Qris qris;

    /**
     * Options to configure Radar. See <a href="https://docs.stripe.com/radar/radar-session">Radar
     * Session</a> for more information.
     */
    @SerializedName("radar_options")
    RadarOptions radarOptions;

    /**
     * If this is a {@code rechnung} PaymentMethod, this hash contains details about the Rechnung
     * payment method.
     */
    @SerializedName("rechnung")
    Rechnung rechnung;

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
     * If this is a Shopeepay PaymentMethod, this hash contains details about the Shopeepay payment
     * method.
     */
    @SerializedName("shopeepay")
    Shopeepay shopeepay;

    /**
     * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT
     * payment method.
     */
    @SerializedName("sofort")
    Sofort sofort;

    /** This hash contains details about the Stripe balance payment method. */
    @SerializedName("stripe_balance")
    StripeBalance stripeBalance;

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
        Gopay gopay,
        Grabpay grabpay,
        IdBankTransfer idBankTransfer,
        Ideal ideal,
        InteracPresent interacPresent,
        KakaoPay kakaoPay,
        Klarna klarna,
        Konbini konbini,
        KrCard krCard,
        Link link,
        MbWay mbWay,
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
        Paypay paypay,
        Payto payto,
        Pix pix,
        Promptpay promptpay,
        Qris qris,
        RadarOptions radarOptions,
        Rechnung rechnung,
        RevolutPay revolutPay,
        SamsungPay samsungPay,
        Satispay satispay,
        SepaDebit sepaDebit,
        Shopeepay shopeepay,
        Sofort sofort,
        StripeBalance stripeBalance,
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
      this.gopay = gopay;
      this.grabpay = grabpay;
      this.idBankTransfer = idBankTransfer;
      this.ideal = ideal;
      this.interacPresent = interacPresent;
      this.kakaoPay = kakaoPay;
      this.klarna = klarna;
      this.konbini = konbini;
      this.krCard = krCard;
      this.link = link;
      this.mbWay = mbWay;
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
      this.paypay = paypay;
      this.payto = payto;
      this.pix = pix;
      this.promptpay = promptpay;
      this.qris = qris;
      this.radarOptions = radarOptions;
      this.rechnung = rechnung;
      this.revolutPay = revolutPay;
      this.samsungPay = samsungPay;
      this.satispay = satispay;
      this.sepaDebit = sepaDebit;
      this.shopeepay = shopeepay;
      this.sofort = sofort;
      this.stripeBalance = stripeBalance;
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

      private Gopay gopay;

      private Grabpay grabpay;

      private IdBankTransfer idBankTransfer;

      private Ideal ideal;

      private InteracPresent interacPresent;

      private KakaoPay kakaoPay;

      private Klarna klarna;

      private Konbini konbini;

      private KrCard krCard;

      private Link link;

      private MbWay mbWay;

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

      private Paypay paypay;

      private Payto payto;

      private Pix pix;

      private Promptpay promptpay;

      private Qris qris;

      private RadarOptions radarOptions;

      private Rechnung rechnung;

      private RevolutPay revolutPay;

      private SamsungPay samsungPay;

      private Satispay satispay;

      private SepaDebit sepaDebit;

      private Shopeepay shopeepay;

      private Sofort sofort;

      private StripeBalance stripeBalance;

      private Swish swish;

      private Twint twint;

      private Type type;

      private UsBankAccount usBankAccount;

      private WechatPay wechatPay;

      private Zip zip;

      /** Finalize and obtain parameter instance from this builder. */
      public SetupIntentUpdateParams.PaymentMethodData build() {
        return new SetupIntentUpdateParams.PaymentMethodData(
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
            this.gopay,
            this.grabpay,
            this.idBankTransfer,
            this.ideal,
            this.interacPresent,
            this.kakaoPay,
            this.klarna,
            this.konbini,
            this.krCard,
            this.link,
            this.mbWay,
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
            this.paypay,
            this.payto,
            this.pix,
            this.promptpay,
            this.qris,
            this.radarOptions,
            this.rechnung,
            this.revolutPay,
            this.samsungPay,
            this.satispay,
            this.sepaDebit,
            this.shopeepay,
            this.sofort,
            this.stripeBalance,
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
      public Builder setAcssDebit(SetupIntentUpdateParams.PaymentMethodData.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /**
       * If this is an {@code affirm} PaymentMethod, this hash contains details about the Affirm
       * payment method.
       */
      public Builder setAffirm(SetupIntentUpdateParams.PaymentMethodData.Affirm affirm) {
        this.affirm = affirm;
        return this;
      }

      /**
       * If this is an {@code AfterpayClearpay} PaymentMethod, this hash contains details about the
       * AfterpayClearpay payment method.
       */
      public Builder setAfterpayClearpay(
          SetupIntentUpdateParams.PaymentMethodData.AfterpayClearpay afterpayClearpay) {
        this.afterpayClearpay = afterpayClearpay;
        return this;
      }

      /**
       * If this is an {@code Alipay} PaymentMethod, this hash contains details about the Alipay
       * payment method.
       */
      public Builder setAlipay(SetupIntentUpdateParams.PaymentMethodData.Alipay alipay) {
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
          SetupIntentUpdateParams.PaymentMethodData.AllowRedisplay allowRedisplay) {
        this.allowRedisplay = allowRedisplay;
        return this;
      }

      /**
       * If this is a Alma PaymentMethod, this hash contains details about the Alma payment method.
       */
      public Builder setAlma(SetupIntentUpdateParams.PaymentMethodData.Alma alma) {
        this.alma = alma;
        return this;
      }

      /**
       * If this is a AmazonPay PaymentMethod, this hash contains details about the AmazonPay
       * payment method.
       */
      public Builder setAmazonPay(SetupIntentUpdateParams.PaymentMethodData.AmazonPay amazonPay) {
        this.amazonPay = amazonPay;
        return this;
      }

      /**
       * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the
       * bank account.
       */
      public Builder setAuBecsDebit(
          SetupIntentUpdateParams.PaymentMethodData.AuBecsDebit auBecsDebit) {
        this.auBecsDebit = auBecsDebit;
        return this;
      }

      /**
       * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs
       * Direct Debit bank account.
       */
      public Builder setBacsDebit(SetupIntentUpdateParams.PaymentMethodData.BacsDebit bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /**
       * If this is a {@code bancontact} PaymentMethod, this hash contains details about the
       * Bancontact payment method.
       */
      public Builder setBancontact(
          SetupIntentUpdateParams.PaymentMethodData.Bancontact bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /**
       * If this is a {@code billie} PaymentMethod, this hash contains details about the Billie
       * payment method.
       */
      public Builder setBillie(SetupIntentUpdateParams.PaymentMethodData.Billie billie) {
        this.billie = billie;
        return this;
      }

      /**
       * Billing information associated with the PaymentMethod that may be used or required by
       * particular types of payment methods.
       */
      public Builder setBillingDetails(
          SetupIntentUpdateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /**
       * If this is a {@code blik} PaymentMethod, this hash contains details about the BLIK payment
       * method.
       */
      public Builder setBlik(SetupIntentUpdateParams.PaymentMethodData.Blik blik) {
        this.blik = blik;
        return this;
      }

      /**
       * If this is a {@code boleto} PaymentMethod, this hash contains details about the Boleto
       * payment method.
       */
      public Builder setBoleto(SetupIntentUpdateParams.PaymentMethodData.Boleto boleto) {
        this.boleto = boleto;
        return this;
      }

      /**
       * If this is a {@code cashapp} PaymentMethod, this hash contains details about the Cash App
       * Pay payment method.
       */
      public Builder setCashapp(SetupIntentUpdateParams.PaymentMethodData.Cashapp cashapp) {
        this.cashapp = cashapp;
        return this;
      }

      /**
       * If this is a Crypto PaymentMethod, this hash contains details about the Crypto payment
       * method.
       */
      public Builder setCrypto(SetupIntentUpdateParams.PaymentMethodData.Crypto crypto) {
        this.crypto = crypto;
        return this;
      }

      /**
       * If this is a {@code customer_balance} PaymentMethod, this hash contains details about the
       * CustomerBalance payment method.
       */
      public Builder setCustomerBalance(
          SetupIntentUpdateParams.PaymentMethodData.CustomerBalance customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /**
       * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
       * method.
       */
      public Builder setEps(SetupIntentUpdateParams.PaymentMethodData.Eps eps) {
        this.eps = eps;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SetupIntentUpdateParams.PaymentMethodData#extraParams} for the field documentation.
       */
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
       * See {@link SetupIntentUpdateParams.PaymentMethodData#extraParams} for the field
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
      public Builder setFpx(SetupIntentUpdateParams.PaymentMethodData.Fpx fpx) {
        this.fpx = fpx;
        return this;
      }

      /**
       * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
       * payment method.
       */
      public Builder setGiropay(SetupIntentUpdateParams.PaymentMethodData.Giropay giropay) {
        this.giropay = giropay;
        return this;
      }

      /**
       * If this is a Gopay PaymentMethod, this hash contains details about the Gopay payment
       * method.
       */
      public Builder setGopay(SetupIntentUpdateParams.PaymentMethodData.Gopay gopay) {
        this.gopay = gopay;
        return this;
      }

      /**
       * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
       * payment method.
       */
      public Builder setGrabpay(SetupIntentUpdateParams.PaymentMethodData.Grabpay grabpay) {
        this.grabpay = grabpay;
        return this;
      }

      /**
       * If this is an {@code IdBankTransfer} PaymentMethod, this hash contains details about the
       * IdBankTransfer payment method.
       */
      public Builder setIdBankTransfer(
          SetupIntentUpdateParams.PaymentMethodData.IdBankTransfer idBankTransfer) {
        this.idBankTransfer = idBankTransfer;
        return this;
      }

      /**
       * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL
       * payment method.
       */
      public Builder setIdeal(SetupIntentUpdateParams.PaymentMethodData.Ideal ideal) {
        this.ideal = ideal;
        return this;
      }

      /**
       * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
       * Interac Present payment method.
       */
      public Builder setInteracPresent(
          SetupIntentUpdateParams.PaymentMethodData.InteracPresent interacPresent) {
        this.interacPresent = interacPresent;
        return this;
      }

      /**
       * If this is a {@code kakao_pay} PaymentMethod, this hash contains details about the Kakao
       * Pay payment method.
       */
      public Builder setKakaoPay(SetupIntentUpdateParams.PaymentMethodData.KakaoPay kakaoPay) {
        this.kakaoPay = kakaoPay;
        return this;
      }

      /**
       * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
       * payment method.
       */
      public Builder setKlarna(SetupIntentUpdateParams.PaymentMethodData.Klarna klarna) {
        this.klarna = klarna;
        return this;
      }

      /**
       * If this is a {@code konbini} PaymentMethod, this hash contains details about the Konbini
       * payment method.
       */
      public Builder setKonbini(SetupIntentUpdateParams.PaymentMethodData.Konbini konbini) {
        this.konbini = konbini;
        return this;
      }

      /**
       * If this is a {@code kr_card} PaymentMethod, this hash contains details about the Korean
       * Card payment method.
       */
      public Builder setKrCard(SetupIntentUpdateParams.PaymentMethodData.KrCard krCard) {
        this.krCard = krCard;
        return this;
      }

      /**
       * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
       * method.
       */
      public Builder setLink(SetupIntentUpdateParams.PaymentMethodData.Link link) {
        this.link = link;
        return this;
      }

      /**
       * If this is a MB WAY PaymentMethod, this hash contains details about the MB WAY payment
       * method.
       */
      public Builder setMbWay(SetupIntentUpdateParams.PaymentMethodData.MbWay mbWay) {
        this.mbWay = mbWay;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SetupIntentUpdateParams.PaymentMethodData#metadata} for the field documentation.
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
       * See {@link SetupIntentUpdateParams.PaymentMethodData#metadata} for the field documentation.
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
      public Builder setMobilepay(SetupIntentUpdateParams.PaymentMethodData.Mobilepay mobilepay) {
        this.mobilepay = mobilepay;
        return this;
      }

      /**
       * If this is a {@code multibanco} PaymentMethod, this hash contains details about the
       * Multibanco payment method.
       */
      public Builder setMultibanco(
          SetupIntentUpdateParams.PaymentMethodData.Multibanco multibanco) {
        this.multibanco = multibanco;
        return this;
      }

      /**
       * If this is a {@code naver_pay} PaymentMethod, this hash contains details about the Naver
       * Pay payment method.
       */
      public Builder setNaverPay(SetupIntentUpdateParams.PaymentMethodData.NaverPay naverPay) {
        this.naverPay = naverPay;
        return this;
      }

      /**
       * If this is an nz_bank_account PaymentMethod, this hash contains details about the
       * nz_bank_account payment method.
       */
      public Builder setNzBankAccount(
          SetupIntentUpdateParams.PaymentMethodData.NzBankAccount nzBankAccount) {
        this.nzBankAccount = nzBankAccount;
        return this;
      }

      /**
       * If this is an {@code oxxo} PaymentMethod, this hash contains details about the OXXO payment
       * method.
       */
      public Builder setOxxo(SetupIntentUpdateParams.PaymentMethodData.Oxxo oxxo) {
        this.oxxo = oxxo;
        return this;
      }

      /**
       * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
       * method.
       */
      public Builder setP24(SetupIntentUpdateParams.PaymentMethodData.P24 p24) {
        this.p24 = p24;
        return this;
      }

      /**
       * If this is a {@code pay_by_bank} PaymentMethod, this hash contains details about the
       * PayByBank payment method.
       */
      public Builder setPayByBank(SetupIntentUpdateParams.PaymentMethodData.PayByBank payByBank) {
        this.payByBank = payByBank;
        return this;
      }

      /**
       * If this is a {@code payco} PaymentMethod, this hash contains details about the PAYCO
       * payment method.
       */
      public Builder setPayco(SetupIntentUpdateParams.PaymentMethodData.Payco payco) {
        this.payco = payco;
        return this;
      }

      /**
       * If this is a {@code paynow} PaymentMethod, this hash contains details about the PayNow
       * payment method.
       */
      public Builder setPaynow(SetupIntentUpdateParams.PaymentMethodData.Paynow paynow) {
        this.paynow = paynow;
        return this;
      }

      /**
       * If this is a {@code paypal} PaymentMethod, this hash contains details about the PayPal
       * payment method.
       */
      public Builder setPaypal(SetupIntentUpdateParams.PaymentMethodData.Paypal paypal) {
        this.paypal = paypal;
        return this;
      }

      /**
       * If this is a {@code paypay} PaymentMethod, this hash contains details about the PayPay
       * payment method.
       */
      public Builder setPaypay(SetupIntentUpdateParams.PaymentMethodData.Paypay paypay) {
        this.paypay = paypay;
        return this;
      }

      /**
       * If this is a {@code payto} PaymentMethod, this hash contains details about the PayTo
       * payment method.
       */
      public Builder setPayto(SetupIntentUpdateParams.PaymentMethodData.Payto payto) {
        this.payto = payto;
        return this;
      }

      /**
       * If this is a {@code pix} PaymentMethod, this hash contains details about the Pix payment
       * method.
       */
      public Builder setPix(SetupIntentUpdateParams.PaymentMethodData.Pix pix) {
        this.pix = pix;
        return this;
      }

      /**
       * If this is a {@code promptpay} PaymentMethod, this hash contains details about the
       * PromptPay payment method.
       */
      public Builder setPromptpay(SetupIntentUpdateParams.PaymentMethodData.Promptpay promptpay) {
        this.promptpay = promptpay;
        return this;
      }

      /**
       * If this is a {@code qris} PaymentMethod, this hash contains details about the QRIS payment
       * method.
       */
      public Builder setQris(SetupIntentUpdateParams.PaymentMethodData.Qris qris) {
        this.qris = qris;
        return this;
      }

      /**
       * Options to configure Radar. See <a href="https://docs.stripe.com/radar/radar-session">Radar
       * Session</a> for more information.
       */
      public Builder setRadarOptions(
          SetupIntentUpdateParams.PaymentMethodData.RadarOptions radarOptions) {
        this.radarOptions = radarOptions;
        return this;
      }

      /**
       * If this is a {@code rechnung} PaymentMethod, this hash contains details about the Rechnung
       * payment method.
       */
      public Builder setRechnung(SetupIntentUpdateParams.PaymentMethodData.Rechnung rechnung) {
        this.rechnung = rechnung;
        return this;
      }

      /**
       * If this is a {@code revolut_pay} PaymentMethod, this hash contains details about the
       * Revolut Pay payment method.
       */
      public Builder setRevolutPay(
          SetupIntentUpdateParams.PaymentMethodData.RevolutPay revolutPay) {
        this.revolutPay = revolutPay;
        return this;
      }

      /**
       * If this is a {@code samsung_pay} PaymentMethod, this hash contains details about the
       * SamsungPay payment method.
       */
      public Builder setSamsungPay(
          SetupIntentUpdateParams.PaymentMethodData.SamsungPay samsungPay) {
        this.samsungPay = samsungPay;
        return this;
      }

      /**
       * If this is a {@code satispay} PaymentMethod, this hash contains details about the Satispay
       * payment method.
       */
      public Builder setSatispay(SetupIntentUpdateParams.PaymentMethodData.Satispay satispay) {
        this.satispay = satispay;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA
       * debit bank account.
       */
      public Builder setSepaDebit(SetupIntentUpdateParams.PaymentMethodData.SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /**
       * If this is a Shopeepay PaymentMethod, this hash contains details about the Shopeepay
       * payment method.
       */
      public Builder setShopeepay(SetupIntentUpdateParams.PaymentMethodData.Shopeepay shopeepay) {
        this.shopeepay = shopeepay;
        return this;
      }

      /**
       * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT
       * payment method.
       */
      public Builder setSofort(SetupIntentUpdateParams.PaymentMethodData.Sofort sofort) {
        this.sofort = sofort;
        return this;
      }

      /** This hash contains details about the Stripe balance payment method. */
      public Builder setStripeBalance(
          SetupIntentUpdateParams.PaymentMethodData.StripeBalance stripeBalance) {
        this.stripeBalance = stripeBalance;
        return this;
      }

      /**
       * If this is a {@code swish} PaymentMethod, this hash contains details about the Swish
       * payment method.
       */
      public Builder setSwish(SetupIntentUpdateParams.PaymentMethodData.Swish swish) {
        this.swish = swish;
        return this;
      }

      /**
       * If this is a TWINT PaymentMethod, this hash contains details about the TWINT payment
       * method.
       */
      public Builder setTwint(SetupIntentUpdateParams.PaymentMethodData.Twint twint) {
        this.twint = twint;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(SetupIntentUpdateParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }

      /**
       * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the
       * US bank account payment method.
       */
      public Builder setUsBankAccount(
          SetupIntentUpdateParams.PaymentMethodData.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /**
       * If this is an {@code wechat_pay} PaymentMethod, this hash contains details about the
       * wechat_pay payment method.
       */
      public Builder setWechatPay(SetupIntentUpdateParams.PaymentMethodData.WechatPay wechatPay) {
        this.wechatPay = wechatPay;
        return this;
      }

      /**
       * If this is a {@code zip} PaymentMethod, this hash contains details about the Zip payment
       * method.
       */
      public Builder setZip(SetupIntentUpdateParams.PaymentMethodData.Zip zip) {
        this.zip = zip;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
        public SetupIntentUpdateParams.PaymentMethodData.AcssDebit build() {
          return new SetupIntentUpdateParams.PaymentMethodData.AcssDebit(
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AcssDebit#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AcssDebit#extraParams} for the
         * field documentation.
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
        public SetupIntentUpdateParams.PaymentMethodData.Affirm build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Affirm(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Affirm#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Affirm#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.AfterpayClearpay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.AfterpayClearpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AfterpayClearpay#extraParams}
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AfterpayClearpay#extraParams}
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
        public SetupIntentUpdateParams.PaymentMethodData.Alipay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Alipay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Alipay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Alipay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Alma build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Alma(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Alma#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Alma#extraParams} for the field
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
        public SetupIntentUpdateParams.PaymentMethodData.AmazonPay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.AmazonPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AmazonPay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AmazonPay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.AuBecsDebit build() {
          return new SetupIntentUpdateParams.PaymentMethodData.AuBecsDebit(
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AuBecsDebit#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.AuBecsDebit#extraParams} for
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
        public SetupIntentUpdateParams.PaymentMethodData.BacsDebit build() {
          return new SetupIntentUpdateParams.PaymentMethodData.BacsDebit(
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.BacsDebit#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.BacsDebit#extraParams} for the
         * field documentation.
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
        public SetupIntentUpdateParams.PaymentMethodData.Bancontact build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Bancontact(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Bancontact#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Bancontact#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Billie build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Billie(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Billie#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Billie#extraParams} for the
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
      Object taxId;

      private BillingDetails(
          Object address,
          Object email,
          Map<String, Object> extraParams,
          Object name,
          Object phone,
          Object taxId) {
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

        private Object taxId;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.BillingDetails build() {
          return new SetupIntentUpdateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone, this.taxId);
        }

        /** Billing address. */
        public Builder setAddress(
            SetupIntentUpdateParams.PaymentMethodData.BillingDetails.Address address) {
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.BillingDetails#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.BillingDetails#extraParams} for
         * the field documentation.
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

        /**
         * Taxpayer identification number. Used only for transactions between LATAM buyers and
         * non-LATAM sellers.
         */
        public Builder setTaxId(EmptyParam taxId) {
          this.taxId = taxId;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        Object line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /**
         * State, county, province, or region (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
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
          public SetupIntentUpdateParams.PaymentMethodData.BillingDetails.Address build() {
            return new SetupIntentUpdateParams.PaymentMethodData.BillingDetails.Address(
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
           * SetupIntentUpdateParams.PaymentMethodData.BillingDetails.Address#extraParams} for the
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
           * SetupIntentUpdateParams.PaymentMethodData.BillingDetails.Address#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
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

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          public Builder setState(EmptyParam state) {
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
        public SetupIntentUpdateParams.PaymentMethodData.Blik build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Blik(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Blik#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Blik#extraParams} for the field
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
        public SetupIntentUpdateParams.PaymentMethodData.Boleto build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Boleto(this.extraParams, this.taxId);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Boleto#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Boleto#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Cashapp build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Cashapp(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Cashapp#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Cashapp#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Crypto build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Crypto(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Crypto#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Crypto#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.CustomerBalance build() {
          return new SetupIntentUpdateParams.PaymentMethodData.CustomerBalance(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.CustomerBalance#extraParams}
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.CustomerBalance#extraParams}
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
        public SetupIntentUpdateParams.PaymentMethodData.Eps build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Eps(this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(SetupIntentUpdateParams.PaymentMethodData.Eps.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Eps#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Eps#extraParams} for the field
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
        public SetupIntentUpdateParams.PaymentMethodData.Fpx build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Fpx(
              this.accountHolderType, this.bank, this.extraParams);
        }

        /** Account holder type for FPX transaction. */
        public Builder setAccountHolderType(
            SetupIntentUpdateParams.PaymentMethodData.Fpx.AccountHolderType accountHolderType) {
          this.accountHolderType = accountHolderType;
          return this;
        }

        /** <strong>Required.</strong> The customer's bank. */
        public Builder setBank(SetupIntentUpdateParams.PaymentMethodData.Fpx.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Fpx#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Fpx#extraParams} for the field
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
        public SetupIntentUpdateParams.PaymentMethodData.Giropay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Giropay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Giropay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Giropay#extraParams} for the
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
    public static class Gopay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Gopay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.Gopay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Gopay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Gopay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Gopay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Grabpay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Grabpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Grabpay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Grabpay#extraParams} for the
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
    public static class IdBankTransfer {
      /** Bank where the account is held. */
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

      private IdBankTransfer(Bank bank, Map<String, Object> extraParams) {
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
        public SetupIntentUpdateParams.PaymentMethodData.IdBankTransfer build() {
          return new SetupIntentUpdateParams.PaymentMethodData.IdBankTransfer(
              this.bank, this.extraParams);
        }

        /** Bank where the account is held. */
        public Builder setBank(SetupIntentUpdateParams.PaymentMethodData.IdBankTransfer.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.IdBankTransfer#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.IdBankTransfer#extraParams} for
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

      public enum Bank implements ApiRequestParams.EnumParam {
        @SerializedName("bca")
        BCA("bca"),

        @SerializedName("bni")
        BNI("bni"),

        @SerializedName("bri")
        BRI("bri"),

        @SerializedName("cimb")
        CIMB("cimb"),

        @SerializedName("permata")
        PERMATA("permata");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Bank(String value) {
          this.value = value;
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
        public SetupIntentUpdateParams.PaymentMethodData.Ideal build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Ideal(this.bank, this.extraParams);
        }

        /**
         * The customer's bank. Only use this parameter for existing customers. Don't use it for new
         * customers.
         */
        public Builder setBank(SetupIntentUpdateParams.PaymentMethodData.Ideal.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Ideal#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Ideal#extraParams} for the
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

        @SerializedName("finom")
        FINOM("finom"),

        @SerializedName("handelsbanken")
        HANDELSBANKEN("handelsbanken"),

        @SerializedName("ing")
        ING("ing"),

        @SerializedName("knab")
        KNAB("knab"),

        @SerializedName("mollie")
        MOLLIE("mollie"),

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
        public SetupIntentUpdateParams.PaymentMethodData.InteracPresent build() {
          return new SetupIntentUpdateParams.PaymentMethodData.InteracPresent(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.InteracPresent#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.InteracPresent#extraParams} for
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
        public SetupIntentUpdateParams.PaymentMethodData.KakaoPay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.KakaoPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.KakaoPay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.KakaoPay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Klarna build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Klarna(this.dob, this.extraParams);
        }

        /** Customer's date of birth. */
        public Builder setDob(SetupIntentUpdateParams.PaymentMethodData.Klarna.Dob dob) {
          this.dob = dob;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Klarna#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Klarna#extraParams} for the
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
          public SetupIntentUpdateParams.PaymentMethodData.Klarna.Dob build() {
            return new SetupIntentUpdateParams.PaymentMethodData.Klarna.Dob(
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
           * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Klarna.Dob#extraParams} for
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
           * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Klarna.Dob#extraParams} for
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
        public SetupIntentUpdateParams.PaymentMethodData.Konbini build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Konbini(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Konbini#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Konbini#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.KrCard build() {
          return new SetupIntentUpdateParams.PaymentMethodData.KrCard(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.KrCard#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.KrCard#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Link build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Link(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Link#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Link#extraParams} for the field
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
    public static class MbWay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private MbWay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.MbWay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.MbWay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.MbWay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.MbWay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Mobilepay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Mobilepay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Mobilepay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Mobilepay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Multibanco build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Multibanco(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Multibanco#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Multibanco#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.NaverPay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.NaverPay(
              this.extraParams, this.funding);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.NaverPay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.NaverPay#extraParams} for the
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
            SetupIntentUpdateParams.PaymentMethodData.NaverPay.Funding funding) {
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
      Object accountHolderName;

      /** <strong>Required.</strong> The account number for the bank account. */
      @SerializedName("account_number")
      Object accountNumber;

      /** <strong>Required.</strong> The numeric code for the bank account's bank. */
      @SerializedName("bank_code")
      Object bankCode;

      /** <strong>Required.</strong> The numeric code for the bank account's bank branch. */
      @SerializedName("branch_code")
      Object branchCode;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("reference")
      Object reference;

      /** <strong>Required.</strong> The suffix of the bank account number. */
      @SerializedName("suffix")
      Object suffix;

      private NzBankAccount(
          Object accountHolderName,
          Object accountNumber,
          Object bankCode,
          Object branchCode,
          Map<String, Object> extraParams,
          Object reference,
          Object suffix) {
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
        private Object accountHolderName;

        private Object accountNumber;

        private Object bankCode;

        private Object branchCode;

        private Map<String, Object> extraParams;

        private Object reference;

        private Object suffix;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.NzBankAccount build() {
          return new SetupIntentUpdateParams.PaymentMethodData.NzBankAccount(
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

        /**
         * The name on the bank account. Only required if the account holder name is different from
         * the name of the authorized signatory collected in the PaymentMethod’s billing details.
         */
        public Builder setAccountHolderName(EmptyParam accountHolderName) {
          this.accountHolderName = accountHolderName;
          return this;
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

        /** <strong>Required.</strong> The numeric code for the bank account's bank. */
        public Builder setBankCode(String bankCode) {
          this.bankCode = bankCode;
          return this;
        }

        /** <strong>Required.</strong> The numeric code for the bank account's bank. */
        public Builder setBankCode(EmptyParam bankCode) {
          this.bankCode = bankCode;
          return this;
        }

        /** <strong>Required.</strong> The numeric code for the bank account's bank branch. */
        public Builder setBranchCode(String branchCode) {
          this.branchCode = branchCode;
          return this;
        }

        /** <strong>Required.</strong> The numeric code for the bank account's bank branch. */
        public Builder setBranchCode(EmptyParam branchCode) {
          this.branchCode = branchCode;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.NzBankAccount#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.NzBankAccount#extraParams} for
         * the field documentation.
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

        public Builder setReference(EmptyParam reference) {
          this.reference = reference;
          return this;
        }

        /** <strong>Required.</strong> The suffix of the bank account number. */
        public Builder setSuffix(String suffix) {
          this.suffix = suffix;
          return this;
        }

        /** <strong>Required.</strong> The suffix of the bank account number. */
        public Builder setSuffix(EmptyParam suffix) {
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
        public SetupIntentUpdateParams.PaymentMethodData.Oxxo build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Oxxo(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Oxxo#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Oxxo#extraParams} for the field
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
        public SetupIntentUpdateParams.PaymentMethodData.P24 build() {
          return new SetupIntentUpdateParams.PaymentMethodData.P24(this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(SetupIntentUpdateParams.PaymentMethodData.P24.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.P24#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.P24#extraParams} for the field
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
        public SetupIntentUpdateParams.PaymentMethodData.PayByBank build() {
          return new SetupIntentUpdateParams.PaymentMethodData.PayByBank(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.PayByBank#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.PayByBank#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Payco build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Payco(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Payco#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Payco#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Paynow build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Paynow(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Paynow#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Paynow#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Paypal build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Paypal(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Paypal#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Paypal#extraParams} for the
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
    public static class Paypay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Paypay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.Paypay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Paypay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Paypay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Paypay#extraParams} for the
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
    public static class Payto {
      /** The account number for the bank account. */
      @SerializedName("account_number")
      Object accountNumber;

      /** Bank-State-Branch number of the bank account. */
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

      /** The PayID alias for the bank account. */
      @SerializedName("pay_id")
      Object payId;

      private Payto(
          Object accountNumber, Object bsbNumber, Map<String, Object> extraParams, Object payId) {
        this.accountNumber = accountNumber;
        this.bsbNumber = bsbNumber;
        this.extraParams = extraParams;
        this.payId = payId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object accountNumber;

        private Object bsbNumber;

        private Map<String, Object> extraParams;

        private Object payId;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.Payto build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Payto(
              this.accountNumber, this.bsbNumber, this.extraParams, this.payId);
        }

        /** The account number for the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** The account number for the bank account. */
        public Builder setAccountNumber(EmptyParam accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Bank-State-Branch number of the bank account. */
        public Builder setBsbNumber(String bsbNumber) {
          this.bsbNumber = bsbNumber;
          return this;
        }

        /** Bank-State-Branch number of the bank account. */
        public Builder setBsbNumber(EmptyParam bsbNumber) {
          this.bsbNumber = bsbNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Payto#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Payto#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The PayID alias for the bank account. */
        public Builder setPayId(String payId) {
          this.payId = payId;
          return this;
        }

        /** The PayID alias for the bank account. */
        public Builder setPayId(EmptyParam payId) {
          this.payId = payId;
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
        public SetupIntentUpdateParams.PaymentMethodData.Pix build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Pix(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Pix#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Pix#extraParams} for the field
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
        public SetupIntentUpdateParams.PaymentMethodData.Promptpay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Promptpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Promptpay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Promptpay#extraParams} for the
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
    public static class Qris {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Qris(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.Qris build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Qris(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Qris#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Qris#extraParams} for the field
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
       * A <a href="https://docs.stripe.com/radar/radar-session">Radar Session</a> is a snapshot of
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
        public SetupIntentUpdateParams.PaymentMethodData.RadarOptions build() {
          return new SetupIntentUpdateParams.PaymentMethodData.RadarOptions(
              this.extraParams, this.session);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.RadarOptions#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.RadarOptions#extraParams} for
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
         * A <a href="https://docs.stripe.com/radar/radar-session">Radar Session</a> is a snapshot
         * of the browser metadata and device details that help Radar make more accurate predictions
         * on your payments.
         */
        public Builder setSession(String session) {
          this.session = session;
          return this;
        }

        /**
         * A <a href="https://docs.stripe.com/radar/radar-session">Radar Session</a> is a snapshot
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
    @EqualsAndHashCode(callSuper = false)
    public static class Rechnung {
      /** <strong>Required.</strong> Customer's date of birth */
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

      private Rechnung(Dob dob, Map<String, Object> extraParams) {
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
        public SetupIntentUpdateParams.PaymentMethodData.Rechnung build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Rechnung(this.dob, this.extraParams);
        }

        /** <strong>Required.</strong> Customer's date of birth */
        public Builder setDob(SetupIntentUpdateParams.PaymentMethodData.Rechnung.Dob dob) {
          this.dob = dob;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Rechnung#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Rechnung#extraParams} for the
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
          public SetupIntentUpdateParams.PaymentMethodData.Rechnung.Dob build() {
            return new SetupIntentUpdateParams.PaymentMethodData.Rechnung.Dob(
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
           * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Rechnung.Dob#extraParams} for
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
           * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Rechnung.Dob#extraParams} for
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
        public SetupIntentUpdateParams.PaymentMethodData.RevolutPay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.RevolutPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.RevolutPay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.RevolutPay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.SamsungPay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.SamsungPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.SamsungPay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.SamsungPay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Satispay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Satispay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Satispay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Satispay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.SepaDebit build() {
          return new SetupIntentUpdateParams.PaymentMethodData.SepaDebit(
              this.extraParams, this.iban);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.SepaDebit#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.SepaDebit#extraParams} for the
         * field documentation.
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
    @EqualsAndHashCode(callSuper = false)
    public static class Shopeepay {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private Shopeepay(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.Shopeepay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Shopeepay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Shopeepay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Shopeepay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Sofort build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Sofort(
              this.country, this.extraParams);
        }

        /**
         * <strong>Required.</strong> Two-letter ISO code representing the country the bank account
         * is located in.
         */
        public Builder setCountry(
            SetupIntentUpdateParams.PaymentMethodData.Sofort.Country country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Sofort#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Sofort#extraParams} for the
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
    public static class StripeBalance {
      /** The connected account ID whose Stripe balance to use as the source of payment. */
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

      /**
       * The <a
       * href="https://docs.stripe.com/api/balance/balance_object#balance_object-available-source_types">source_type</a>
       * of the balance
       */
      @SerializedName("source_type")
      SourceType sourceType;

      private StripeBalance(
          Object account, Map<String, Object> extraParams, SourceType sourceType) {
        this.account = account;
        this.extraParams = extraParams;
        this.sourceType = sourceType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object account;

        private Map<String, Object> extraParams;

        private SourceType sourceType;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodData.StripeBalance build() {
          return new SetupIntentUpdateParams.PaymentMethodData.StripeBalance(
              this.account, this.extraParams, this.sourceType);
        }

        /** The connected account ID whose Stripe balance to use as the source of payment. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /** The connected account ID whose Stripe balance to use as the source of payment. */
        public Builder setAccount(EmptyParam account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.StripeBalance#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.StripeBalance#extraParams} for
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
         * The <a
         * href="https://docs.stripe.com/api/balance/balance_object#balance_object-available-source_types">source_type</a>
         * of the balance
         */
        public Builder setSourceType(
            SetupIntentUpdateParams.PaymentMethodData.StripeBalance.SourceType sourceType) {
          this.sourceType = sourceType;
          return this;
        }
      }

      public enum SourceType implements ApiRequestParams.EnumParam {
        @SerializedName("bank_account")
        BANK_ACCOUNT("bank_account"),

        @SerializedName("card")
        CARD("card"),

        @SerializedName("fpx")
        FPX("fpx");

        @Getter(onMethod_ = {@Override})
        private final String value;

        SourceType(String value) {
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
        public SetupIntentUpdateParams.PaymentMethodData.Swish build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Swish(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Swish#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Swish#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Twint build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Twint(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Twint#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Twint#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.UsBankAccount build() {
          return new SetupIntentUpdateParams.PaymentMethodData.UsBankAccount(
              this.accountHolderType,
              this.accountNumber,
              this.accountType,
              this.extraParams,
              this.financialConnectionsAccount,
              this.routingNumber);
        }

        /** Account holder type: individual or company. */
        public Builder setAccountHolderType(
            SetupIntentUpdateParams.PaymentMethodData.UsBankAccount.AccountHolderType
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
            SetupIntentUpdateParams.PaymentMethodData.UsBankAccount.AccountType accountType) {
          this.accountType = accountType;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.UsBankAccount#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.UsBankAccount#extraParams} for
         * the field documentation.
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
        public SetupIntentUpdateParams.PaymentMethodData.WechatPay build() {
          return new SetupIntentUpdateParams.PaymentMethodData.WechatPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.WechatPay#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.WechatPay#extraParams} for the
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
        public SetupIntentUpdateParams.PaymentMethodData.Zip build() {
          return new SetupIntentUpdateParams.PaymentMethodData.Zip(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Zip#extraParams} for the field
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodData.Zip#extraParams} for the field
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

      @SerializedName("gopay")
      GOPAY("gopay"),

      @SerializedName("grabpay")
      GRABPAY("grabpay"),

      @SerializedName("id_bank_transfer")
      ID_BANK_TRANSFER("id_bank_transfer"),

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

      @SerializedName("mb_way")
      MB_WAY("mb_way"),

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

      @SerializedName("paypay")
      PAYPAY("paypay"),

      @SerializedName("payto")
      PAYTO("payto"),

      @SerializedName("pix")
      PIX("pix"),

      @SerializedName("promptpay")
      PROMPTPAY("promptpay"),

      @SerializedName("qris")
      QRIS("qris"),

      @SerializedName("rechnung")
      RECHNUNG("rechnung"),

      @SerializedName("revolut_pay")
      REVOLUT_PAY("revolut_pay"),

      @SerializedName("samsung_pay")
      SAMSUNG_PAY("samsung_pay"),

      @SerializedName("satispay")
      SATISPAY("satispay"),

      @SerializedName("sepa_debit")
      SEPA_DEBIT("sepa_debit"),

      @SerializedName("shopeepay")
      SHOPEEPAY("shopeepay"),

      @SerializedName("sofort")
      SOFORT("sofort"),

      @SerializedName("stripe_balance")
      STRIPE_BALANCE("stripe_balance"),

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
     * If this is a {@code acss_debit} SetupIntent, this sub-hash contains details about the ACSS
     * Debit payment method options.
     */
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    /**
     * If this is a {@code amazon_pay} SetupIntent, this sub-hash contains details about the
     * AmazonPay payment method options.
     */
    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

    /**
     * If this is a {@code bacs_debit} SetupIntent, this sub-hash contains details about the Bacs
     * Debit payment method options.
     */
    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    /** Configuration for any card setup attempted on this SetupIntent. */
    @SerializedName("card")
    Card card;

    /**
     * If this is a {@code card_present} PaymentMethod, this sub-hash contains details about the
     * card-present payment method options.
     */
    @SerializedName("card_present")
    CardPresent cardPresent;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
     * payment method options.
     */
    @SerializedName("klarna")
    Klarna klarna;

    /**
     * If this is a {@code link} PaymentMethod, this sub-hash contains details about the Link
     * payment method options.
     */
    @SerializedName("link")
    Link link;

    /**
     * If this is a {@code paypal} PaymentMethod, this sub-hash contains details about the PayPal
     * payment method options.
     */
    @SerializedName("paypal")
    Paypal paypal;

    /**
     * If this is a {@code payto} SetupIntent, this sub-hash contains details about the PayTo
     * payment method options.
     */
    @SerializedName("payto")
    Payto payto;

    /**
     * If this is a {@code pix} SetupIntent, this sub-hash contains details about the Pix payment
     * method options.
     */
    @SerializedName("pix")
    Pix pix;

    /**
     * If this is a {@code sepa_debit} SetupIntent, this sub-hash contains details about the SEPA
     * Debit payment method options.
     */
    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    /**
     * If this is a {@code us_bank_account} SetupIntent, this sub-hash contains details about the US
     * bank account payment method options.
     */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    private PaymentMethodOptions(
        AcssDebit acssDebit,
        AmazonPay amazonPay,
        BacsDebit bacsDebit,
        Card card,
        CardPresent cardPresent,
        Map<String, Object> extraParams,
        Klarna klarna,
        Link link,
        Paypal paypal,
        Payto payto,
        Pix pix,
        SepaDebit sepaDebit,
        UsBankAccount usBankAccount) {
      this.acssDebit = acssDebit;
      this.amazonPay = amazonPay;
      this.bacsDebit = bacsDebit;
      this.card = card;
      this.cardPresent = cardPresent;
      this.extraParams = extraParams;
      this.klarna = klarna;
      this.link = link;
      this.paypal = paypal;
      this.payto = payto;
      this.pix = pix;
      this.sepaDebit = sepaDebit;
      this.usBankAccount = usBankAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AcssDebit acssDebit;

      private AmazonPay amazonPay;

      private BacsDebit bacsDebit;

      private Card card;

      private CardPresent cardPresent;

      private Map<String, Object> extraParams;

      private Klarna klarna;

      private Link link;

      private Paypal paypal;

      private Payto payto;

      private Pix pix;

      private SepaDebit sepaDebit;

      private UsBankAccount usBankAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public SetupIntentUpdateParams.PaymentMethodOptions build() {
        return new SetupIntentUpdateParams.PaymentMethodOptions(
            this.acssDebit,
            this.amazonPay,
            this.bacsDebit,
            this.card,
            this.cardPresent,
            this.extraParams,
            this.klarna,
            this.link,
            this.paypal,
            this.payto,
            this.pix,
            this.sepaDebit,
            this.usBankAccount);
      }

      /**
       * If this is a {@code acss_debit} SetupIntent, this sub-hash contains details about the ACSS
       * Debit payment method options.
       */
      public Builder setAcssDebit(
          SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /**
       * If this is a {@code amazon_pay} SetupIntent, this sub-hash contains details about the
       * AmazonPay payment method options.
       */
      public Builder setAmazonPay(
          SetupIntentUpdateParams.PaymentMethodOptions.AmazonPay amazonPay) {
        this.amazonPay = amazonPay;
        return this;
      }

      /**
       * If this is a {@code bacs_debit} SetupIntent, this sub-hash contains details about the Bacs
       * Debit payment method options.
       */
      public Builder setBacsDebit(
          SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /** Configuration for any card setup attempted on this SetupIntent. */
      public Builder setCard(SetupIntentUpdateParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /**
       * If this is a {@code card_present} PaymentMethod, this sub-hash contains details about the
       * card-present payment method options.
       */
      public Builder setCardPresent(
          SetupIntentUpdateParams.PaymentMethodOptions.CardPresent cardPresent) {
        this.cardPresent = cardPresent;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SetupIntentUpdateParams.PaymentMethodOptions#extraParams} for the field documentation.
       */
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
       * See {@link SetupIntentUpdateParams.PaymentMethodOptions#extraParams} for the field
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
       * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
       * payment method options.
       */
      public Builder setKlarna(SetupIntentUpdateParams.PaymentMethodOptions.Klarna klarna) {
        this.klarna = klarna;
        return this;
      }

      /**
       * If this is a {@code link} PaymentMethod, this sub-hash contains details about the Link
       * payment method options.
       */
      public Builder setLink(SetupIntentUpdateParams.PaymentMethodOptions.Link link) {
        this.link = link;
        return this;
      }

      /**
       * If this is a {@code paypal} PaymentMethod, this sub-hash contains details about the PayPal
       * payment method options.
       */
      public Builder setPaypal(SetupIntentUpdateParams.PaymentMethodOptions.Paypal paypal) {
        this.paypal = paypal;
        return this;
      }

      /**
       * If this is a {@code payto} SetupIntent, this sub-hash contains details about the PayTo
       * payment method options.
       */
      public Builder setPayto(SetupIntentUpdateParams.PaymentMethodOptions.Payto payto) {
        this.payto = payto;
        return this;
      }

      /**
       * If this is a {@code pix} SetupIntent, this sub-hash contains details about the Pix payment
       * method options.
       */
      public Builder setPix(SetupIntentUpdateParams.PaymentMethodOptions.Pix pix) {
        this.pix = pix;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} SetupIntent, this sub-hash contains details about the SEPA
       * Debit payment method options.
       */
      public Builder setSepaDebit(
          SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /**
       * If this is a {@code us_bank_account} SetupIntent, this sub-hash contains details about the
       * US bank account payment method options.
       */
      public Builder setUsBankAccount(
          SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      Currency currency;

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

      /** Bank account verification method. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private AcssDebit(
          Currency currency,
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          VerificationMethod verificationMethod) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Currency currency;

        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit(
              this.currency, this.extraParams, this.mandateOptions, this.verificationMethod);
        }

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        public Builder setCurrency(
            SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.Currency currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit#extraParams} for
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
            SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /** Bank account verification method. */
        public Builder setVerificationMethod(
            SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.VerificationMethod
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

        /** List of Stripe products where this mandate can be selected automatically. */
        @SerializedName("default_for")
        List<SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
            defaultFor;

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
            List<SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
                defaultFor,
            Map<String, Object> extraParams,
            Object intervalDescription,
            PaymentSchedule paymentSchedule,
            TransactionType transactionType) {
          this.customMandateUrl = customMandateUrl;
          this.defaultFor = defaultFor;
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

          private List<
                  SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
              defaultFor;

          private Map<String, Object> extraParams;

          private Object intervalDescription;

          private PaymentSchedule paymentSchedule;

          private TransactionType transactionType;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions(
                this.customMandateUrl,
                this.defaultFor,
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
           * Add an element to `defaultFor` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#defaultFor} for
           * the field documentation.
           */
          public Builder addDefaultFor(
              SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor
                  element) {
            if (this.defaultFor == null) {
              this.defaultFor = new ArrayList<>();
            }
            this.defaultFor.add(element);
            return this;
          }

          /**
           * Add all elements to `defaultFor` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#defaultFor} for
           * the field documentation.
           */
          public Builder addAllDefaultFor(
              List<SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions.DefaultFor>
                  elements) {
            if (this.defaultFor == null) {
              this.defaultFor = new ArrayList<>();
            }
            this.defaultFor.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams} for
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
           * SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams} for
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
              SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions.PaymentSchedule
                  paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /** Transaction type of the mandate. */
          public Builder setTransactionType(
              SetupIntentUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions.TransactionType
                  transactionType) {
            this.transactionType = transactionType;
            return this;
          }
        }

        public enum DefaultFor implements ApiRequestParams.EnumParam {
          @SerializedName("invoice")
          INVOICE("invoice"),

          @SerializedName("subscription")
          SUBSCRIPTION("subscription");

          @Getter(onMethod_ = {@Override})
          private final String value;

          DefaultFor(String value) {
            this.value = value;
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

      public enum Currency implements ApiRequestParams.EnumParam {
        @SerializedName("cad")
        CAD("cad"),

        @SerializedName("usd")
        USD("usd");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Currency(String value) {
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
        public SetupIntentUpdateParams.PaymentMethodOptions.AmazonPay build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.AmazonPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.AmazonPay#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.AmazonPay#extraParams} for
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

      private BacsDebit(Map<String, Object> extraParams, MandateOptions mandateOptions) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit(
              this.extraParams, this.mandateOptions);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit#extraParams} for
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
            SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
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
          public SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit.MandateOptions build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit.MandateOptions(
                this.extraParams, this.referencePrefix);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit.MandateOptions#extraParams} for
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
           * SetupIntentUpdateParams.PaymentMethodOptions.BacsDebit.MandateOptions#extraParams} for
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Configuration options for setting up an eMandate for cards issued in India. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * When specified, this parameter signals that a card has been collected as MOTO (Mail Order
       * Telephone Order) and thus out of scope for SCA. This parameter can only be provided during
       * confirmation.
       */
      @SerializedName("moto")
      Boolean moto;

      /**
       * Selected network to process this SetupIntent on. Depends on the available networks of the
       * card attached to the SetupIntent. Can be only set confirm-time.
       */
      @SerializedName("network")
      Network network;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and <a
       * href="https://docs.stripe.com/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. If not provided, this value defaults to {@code automatic}. Read our
       * guide on <a
       * href="https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
       * requesting 3D Secure</a> for more information on how this configuration interacts with
       * Radar and our SCA Engine.
       */
      @SerializedName("request_three_d_secure")
      RequestThreeDSecure requestThreeDSecure;

      /**
       * If 3D Secure authentication was performed with a third-party provider, the authentication
       * details to use for this setup.
       */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      private Card(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          Boolean moto,
          Network network,
          RequestThreeDSecure requestThreeDSecure,
          ThreeDSecure threeDSecure) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.moto = moto;
        this.network = network;
        this.requestThreeDSecure = requestThreeDSecure;
        this.threeDSecure = threeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private Boolean moto;

        private Network network;

        private RequestThreeDSecure requestThreeDSecure;

        private ThreeDSecure threeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.Card build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.Card(
              this.extraParams,
              this.mandateOptions,
              this.moto,
              this.network,
              this.requestThreeDSecure,
              this.threeDSecure);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Card#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Card#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Configuration options for setting up an eMandate for cards issued in India. */
        public Builder setMandateOptions(
            SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * When specified, this parameter signals that a card has been collected as MOTO (Mail Order
         * Telephone Order) and thus out of scope for SCA. This parameter can only be provided
         * during confirmation.
         */
        public Builder setMoto(Boolean moto) {
          this.moto = moto;
          return this;
        }

        /**
         * Selected network to process this SetupIntent on. Depends on the available networks of the
         * card attached to the SetupIntent. Can be only set confirm-time.
         */
        public Builder setNetwork(
            SetupIntentUpdateParams.PaymentMethodOptions.Card.Network network) {
          this.network = network;
          return this;
        }

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and <a
         * href="https://docs.stripe.com/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. If not provided, this value defaults to {@code automatic}. Read our
         * guide on <a
         * href="https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
         * requesting 3D Secure</a> for more information on how this configuration interacts with
         * Radar and our SCA Engine.
         */
        public Builder setRequestThreeDSecure(
            SetupIntentUpdateParams.PaymentMethodOptions.Card.RequestThreeDSecure
                requestThreeDSecure) {
          this.requestThreeDSecure = requestThreeDSecure;
          return this;
        }

        /**
         * If 3D Secure authentication was performed with a third-party provider, the authentication
         * details to use for this setup.
         */
        public Builder setThreeDSecure(
            SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure threeDSecure) {
          this.threeDSecure = threeDSecure;
          return this;
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
         * <strong>Required.</strong> Currency in which future payments will be charged.
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        Object currency;

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
        List<SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
            supportedTypes;

        private MandateOptions(
            Long amount,
            AmountType amountType,
            Object currency,
            Object description,
            Long endDate,
            Map<String, Object> extraParams,
            Interval interval,
            Long intervalCount,
            Object reference,
            Long startDate,
            List<SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
                supportedTypes) {
          this.amount = amount;
          this.amountType = amountType;
          this.currency = currency;
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

          private Object currency;

          private Object description;

          private Long endDate;

          private Map<String, Object> extraParams;

          private Interval interval;

          private Long intervalCount;

          private Object reference;

          private Long startDate;

          private List<
                  SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
              supportedTypes;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions(
                this.amount,
                this.amountType,
                this.currency,
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
              SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.AmountType
                  amountType) {
            this.amountType = amountType;
            return this;
          }

          /**
           * <strong>Required.</strong> Currency in which future payments will be charged.
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * <strong>Required.</strong> Currency in which future payments will be charged.
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Must be a <a
           * href="https://stripe.com/docs/currencies">supported currency</a>.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for the
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for the
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
              SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.Interval interval) {
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#supportedTypes} for
           * the field documentation.
           */
          public Builder addSupportedType(
              SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions#supportedTypes} for
           * the field documentation.
           */
          public Builder addAllSupportedType(
              List<SetupIntentUpdateParams.PaymentMethodOptions.Card.MandateOptions.SupportedType>
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
         * The cryptogram, also known as the &quot;authentication value&quot; (AAV, CAVV or AEVV).
         * This value is 20 bytes, base64-encoded into a 28-character string. (Most 3D Secure
         * providers will return the base64-encoded version, which is what you should specify here.)
         */
        @SerializedName("cryptogram")
        Object cryptogram;

        /**
         * The Electronic Commerce Indicator (ECI) is returned by your 3D Secure provider and
         * indicates what degree of authentication was performed.
         */
        @SerializedName("electronic_commerce_indicator")
        ElectronicCommerceIndicator electronicCommerceIndicator;

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
        Object requestorChallengeIndicator;

        /**
         * For 3D Secure 1, the XID. For 3D Secure 2, the Directory Server Transaction ID
         * (dsTransID).
         */
        @SerializedName("transaction_id")
        Object transactionId;

        /** The version of 3D Secure that was performed. */
        @SerializedName("version")
        Version version;

        private ThreeDSecure(
            AresTransStatus aresTransStatus,
            Object cryptogram,
            ElectronicCommerceIndicator electronicCommerceIndicator,
            Map<String, Object> extraParams,
            NetworkOptions networkOptions,
            Object requestorChallengeIndicator,
            Object transactionId,
            Version version) {
          this.aresTransStatus = aresTransStatus;
          this.cryptogram = cryptogram;
          this.electronicCommerceIndicator = electronicCommerceIndicator;
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

          private Object cryptogram;

          private ElectronicCommerceIndicator electronicCommerceIndicator;

          private Map<String, Object> extraParams;

          private NetworkOptions networkOptions;

          private Object requestorChallengeIndicator;

          private Object transactionId;

          private Version version;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure(
                this.aresTransStatus,
                this.cryptogram,
                this.electronicCommerceIndicator,
                this.extraParams,
                this.networkOptions,
                this.requestorChallengeIndicator,
                this.transactionId,
                this.version);
          }

          /** The {@code transStatus} returned from the card Issuer’s ACS in the ARes. */
          public Builder setAresTransStatus(
              SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.AresTransStatus
                  aresTransStatus) {
            this.aresTransStatus = aresTransStatus;
            return this;
          }

          /**
           * The cryptogram, also known as the &quot;authentication value&quot; (AAV, CAVV or AEVV).
           * This value is 20 bytes, base64-encoded into a 28-character string. (Most 3D Secure
           * providers will return the base64-encoded version, which is what you should specify
           * here.)
           */
          public Builder setCryptogram(String cryptogram) {
            this.cryptogram = cryptogram;
            return this;
          }

          /**
           * The cryptogram, also known as the &quot;authentication value&quot; (AAV, CAVV or AEVV).
           * This value is 20 bytes, base64-encoded into a 28-character string. (Most 3D Secure
           * providers will return the base64-encoded version, which is what you should specify
           * here.)
           */
          public Builder setCryptogram(EmptyParam cryptogram) {
            this.cryptogram = cryptogram;
            return this;
          }

          /**
           * The Electronic Commerce Indicator (ECI) is returned by your 3D Secure provider and
           * indicates what degree of authentication was performed.
           */
          public Builder setElectronicCommerceIndicator(
              SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure
                      .ElectronicCommerceIndicator
                  electronicCommerceIndicator) {
            this.electronicCommerceIndicator = electronicCommerceIndicator;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure#extraParams} for the
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure#extraParams} for the
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
              SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
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
           * The challenge indicator ({@code threeDSRequestorChallengeInd}) which was requested in
           * the AReq sent to the card Issuer's ACS. A string containing 2 digits from 01-99.
           */
          public Builder setRequestorChallengeIndicator(EmptyParam requestorChallengeIndicator) {
            this.requestorChallengeIndicator = requestorChallengeIndicator;
            return this;
          }

          /**
           * For 3D Secure 1, the XID. For 3D Secure 2, the Directory Server Transaction ID
           * (dsTransID).
           */
          public Builder setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
          }

          /**
           * For 3D Secure 1, the XID. For 3D Secure 2, the Directory Server Transaction ID
           * (dsTransID).
           */
          public Builder setTransactionId(EmptyParam transactionId) {
            this.transactionId = transactionId;
            return this;
          }

          /** The version of 3D Secure that was performed. */
          public Builder setVersion(
              SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.Version version) {
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
            public SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                build() {
              return new SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure
                  .NetworkOptions(this.cartesBancaires, this.extraParams);
            }

            /** Cartes Bancaires-specific 3DS fields. */
            public Builder setCartesBancaires(
                SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                        .CartesBancaires
                    cartesBancaires) {
              this.cartesBancaires = cartesBancaires;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions#extraParams}
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
             * SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions#extraParams}
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
            Object cbExemption;

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
                Object cbExemption,
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

              private Object cbExemption;

              private Long cbScore;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
                      .CartesBancaires
                  build() {
                return new SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure
                    .NetworkOptions.CartesBancaires(
                    this.cbAvalgo, this.cbExemption, this.cbScore, this.extraParams);
              }

              /**
               * <strong>Required.</strong> The cryptogram calculation algorithm used by the card
               * Issuer's ACS to calculate the Authentication cryptogram. Also known as {@code
               * cavvAlgorithm}. messageExtension: CB-AVALGO
               */
              public Builder setCbAvalgo(
                  SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions
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
               * The exemption indicator returned from Cartes Bancaires in the ARes. message
               * extension: CB-EXEMPTION; string (4 characters) This is a 3 byte bitmap (low
               * significant byte first and most significant bit first) that has been Base64 encoded
               */
              public Builder setCbExemption(EmptyParam cbExemption) {
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
               * SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions.CartesBancaires#extraParams}
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
               * SetupIntentUpdateParams.PaymentMethodOptions.Card.ThreeDSecure.NetworkOptions.CartesBancaires#extraParams}
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

      private CardPresent(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.CardPresent build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.CardPresent(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.CardPresent#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.CardPresent#extraParams} for
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
    public static class Klarna {
      /** The currency of the SetupIntent. Three letter ISO currency code. */
      @SerializedName("currency")
      Object currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** On-demand details if setting up a payment method for on-demand payments. */
      @SerializedName("on_demand")
      OnDemand onDemand;

      /** Preferred language of the Klarna authorization page that the customer is redirected to. */
      @SerializedName("preferred_locale")
      PreferredLocale preferredLocale;

      /** Subscription details if setting up or charging a subscription. */
      @SerializedName("subscriptions")
      Object subscriptions;

      private Klarna(
          Object currency,
          Map<String, Object> extraParams,
          OnDemand onDemand,
          PreferredLocale preferredLocale,
          Object subscriptions) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.onDemand = onDemand;
        this.preferredLocale = preferredLocale;
        this.subscriptions = subscriptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object currency;

        private Map<String, Object> extraParams;

        private OnDemand onDemand;

        private PreferredLocale preferredLocale;

        private Object subscriptions;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.Klarna build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.Klarna(
              this.currency,
              this.extraParams,
              this.onDemand,
              this.preferredLocale,
              this.subscriptions);
        }

        /** The currency of the SetupIntent. Three letter ISO currency code. */
        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        /** The currency of the SetupIntent. Three letter ISO currency code. */
        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Klarna#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Klarna#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** On-demand details if setting up a payment method for on-demand payments. */
        public Builder setOnDemand(
            SetupIntentUpdateParams.PaymentMethodOptions.Klarna.OnDemand onDemand) {
          this.onDemand = onDemand;
          return this;
        }

        /**
         * Preferred language of the Klarna authorization page that the customer is redirected to.
         */
        public Builder setPreferredLocale(
            SetupIntentUpdateParams.PaymentMethodOptions.Klarna.PreferredLocale preferredLocale) {
          this.preferredLocale = preferredLocale;
          return this;
        }

        /**
         * Add an element to `subscriptions` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SetupIntentUpdateParams.PaymentMethodOptions.Klarna#subscriptions} for the field
         * documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addSubscription(
            SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription element) {
          if (this.subscriptions == null || this.subscriptions instanceof EmptyParam) {
            this.subscriptions =
                new ArrayList<SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription>();
          }
          ((List<SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription>)
                  this.subscriptions)
              .add(element);
          return this;
        }

        /**
         * Add all elements to `subscriptions` list. A list is initialized for the first
         * `add/addAll` call, and subsequent calls adds additional elements to the original list.
         * See {@link SetupIntentUpdateParams.PaymentMethodOptions.Klarna#subscriptions} for the
         * field documentation.
         */
        @SuppressWarnings("unchecked")
        public Builder addAllSubscription(
            List<SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription> elements) {
          if (this.subscriptions == null || this.subscriptions instanceof EmptyParam) {
            this.subscriptions =
                new ArrayList<SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription>();
          }
          ((List<SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription>)
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
            List<SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription> subscriptions) {
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
          public SetupIntentUpdateParams.PaymentMethodOptions.Klarna.OnDemand build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.Klarna.OnDemand(
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Klarna.OnDemand#extraParams} for the field
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Klarna.OnDemand#extraParams} for the field
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
              SetupIntentUpdateParams.PaymentMethodOptions.Klarna.OnDemand.PurchaseInterval
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
        Object name;

        /** <strong>Required.</strong> Describes the upcoming charge for this subscription. */
        @SerializedName("next_billing")
        NextBilling nextBilling;

        /**
         * <strong>Required.</strong> A non-customer-facing reference to correlate subscription
         * charges in the Klarna app. Use a value that persists across subscription charges.
         */
        @SerializedName("reference")
        Object reference;

        private Subscription(
            Map<String, Object> extraParams,
            Interval interval,
            Long intervalCount,
            Object name,
            NextBilling nextBilling,
            Object reference) {
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

          private Object name;

          private NextBilling nextBilling;

          private Object reference;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription(
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription#extraParams} for the
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription#extraParams} for the
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
              SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription.Interval interval) {
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

          /** Name for subscription. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }

          /** <strong>Required.</strong> Describes the upcoming charge for this subscription. */
          public Builder setNextBilling(
              SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling
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

          /**
           * <strong>Required.</strong> A non-customer-facing reference to correlate subscription
           * charges in the Klarna app. Use a value that persists across subscription charges.
           */
          public Builder setReference(EmptyParam reference) {
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
          Object date;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private NextBilling(Long amount, Object date, Map<String, Object> extraParams) {
            this.amount = amount;
            this.date = date;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Object date;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling
                build() {
              return new SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription
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
             * <strong>Required.</strong> The date of the next charge for the subscription in
             * YYYY-MM-DD format.
             */
            public Builder setDate(EmptyParam date) {
              this.date = date;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling#extraParams}
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
             * SetupIntentUpdateParams.PaymentMethodOptions.Klarna.Subscription.NextBilling#extraParams}
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

      /** [Deprecated] This is a legacy parameter that no longer has any function. */
      @SerializedName("persistent_token")
      @Deprecated
      Object persistentToken;

      private Link(Map<String, Object> extraParams, Object persistentToken) {
        this.extraParams = extraParams;
        this.persistentToken = persistentToken;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object persistentToken;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.Link build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.Link(
              this.extraParams, this.persistentToken);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Link#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Link#extraParams} for the
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

        /** [Deprecated] This is a legacy parameter that no longer has any function. */
        @Deprecated
        public Builder setPersistentToken(EmptyParam persistentToken) {
          this.persistentToken = persistentToken;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal {
      /**
       * The PayPal Billing Agreement ID (BAID). This is an ID generated by PayPal which represents
       * the mandate between the merchant and the customer.
       */
      @SerializedName("billing_agreement_id")
      Object billingAgreementId;

      @SerializedName("currency")
      Object currency;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The Stripe connected account IDs of the sellers on the platform for this transaction
       * (optional). Only allowed when <a
       * href="https://stripe.com/docs/connect/separate-charges-and-transfers">separate charges and
       * transfers</a> are used.
       */
      @SerializedName("subsellers")
      List<String> subsellers;

      private Paypal(
          Object billingAgreementId,
          Object currency,
          Map<String, Object> extraParams,
          List<String> subsellers) {
        this.billingAgreementId = billingAgreementId;
        this.currency = currency;
        this.extraParams = extraParams;
        this.subsellers = subsellers;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object billingAgreementId;

        private Object currency;

        private Map<String, Object> extraParams;

        private List<String> subsellers;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.Paypal build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.Paypal(
              this.billingAgreementId, this.currency, this.extraParams, this.subsellers);
        }

        /**
         * The PayPal Billing Agreement ID (BAID). This is an ID generated by PayPal which
         * represents the mandate between the merchant and the customer.
         */
        public Builder setBillingAgreementId(String billingAgreementId) {
          this.billingAgreementId = billingAgreementId;
          return this;
        }

        /**
         * The PayPal Billing Agreement ID (BAID). This is an ID generated by PayPal which
         * represents the mandate between the merchant and the customer.
         */
        public Builder setBillingAgreementId(EmptyParam billingAgreementId) {
          this.billingAgreementId = billingAgreementId;
          return this;
        }

        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        public Builder setCurrency(EmptyParam currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Paypal#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Paypal#extraParams} for the
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
         * Add an element to `subsellers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SetupIntentUpdateParams.PaymentMethodOptions.Paypal#subsellers} for the field
         * documentation.
         */
        public Builder addSubseller(String element) {
          if (this.subsellers == null) {
            this.subsellers = new ArrayList<>();
          }
          this.subsellers.add(element);
          return this;
        }

        /**
         * Add all elements to `subsellers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * SetupIntentUpdateParams.PaymentMethodOptions.Paypal#subsellers} for the field
         * documentation.
         */
        public Builder addAllSubseller(List<String> elements) {
          if (this.subsellers == null) {
            this.subsellers = new ArrayList<>();
          }
          this.subsellers.addAll(elements);
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Payto {
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

      private Payto(Map<String, Object> extraParams, MandateOptions mandateOptions) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.Payto build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.Payto(
              this.extraParams, this.mandateOptions);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Payto#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Payto#extraParams} for the
         * field documentation.
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
            SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions {
        /**
         * Amount that will be collected. It is required when {@code amount_type} is {@code fixed}.
         */
        @SerializedName("amount")
        Object amount;

        /**
         * The type of amount that will be collected. The amount charged must be exact or up to the
         * value of {@code amount} param for {@code fixed} or {@code maximum} type respectively.
         * Defaults to {@code maximum}.
         */
        @SerializedName("amount_type")
        ApiRequestParams.EnumParam amountType;

        /**
         * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no
         * end date.
         */
        @SerializedName("end_date")
        Object endDate;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The periodicity at which payments will be collected. Defaults to {@code adhoc}. */
        @SerializedName("payment_schedule")
        ApiRequestParams.EnumParam paymentSchedule;

        /**
         * The number of payments that will be made during a payment period. Defaults to 1 except
         * for when {@code payment_schedule} is {@code adhoc}. In that case, it defaults to no
         * limit.
         */
        @SerializedName("payments_per_period")
        Object paymentsPerPeriod;

        /**
         * The purpose for which payments are made. Has a default value based on your merchant
         * category code.
         */
        @SerializedName("purpose")
        ApiRequestParams.EnumParam purpose;

        /**
         * Date, in YYYY-MM-DD format, from which payments will be collected. Defaults to
         * confirmation time.
         */
        @SerializedName("start_date")
        Object startDate;

        private MandateOptions(
            Object amount,
            ApiRequestParams.EnumParam amountType,
            Object endDate,
            Map<String, Object> extraParams,
            ApiRequestParams.EnumParam paymentSchedule,
            Object paymentsPerPeriod,
            ApiRequestParams.EnumParam purpose,
            Object startDate) {
          this.amount = amount;
          this.amountType = amountType;
          this.endDate = endDate;
          this.extraParams = extraParams;
          this.paymentSchedule = paymentSchedule;
          this.paymentsPerPeriod = paymentsPerPeriod;
          this.purpose = purpose;
          this.startDate = startDate;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object amount;

          private ApiRequestParams.EnumParam amountType;

          private Object endDate;

          private Map<String, Object> extraParams;

          private ApiRequestParams.EnumParam paymentSchedule;

          private Object paymentsPerPeriod;

          private ApiRequestParams.EnumParam purpose;

          private Object startDate;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions(
                this.amount,
                this.amountType,
                this.endDate,
                this.extraParams,
                this.paymentSchedule,
                this.paymentsPerPeriod,
                this.purpose,
                this.startDate);
          }

          /**
           * Amount that will be collected. It is required when {@code amount_type} is {@code
           * fixed}.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Amount that will be collected. It is required when {@code amount_type} is {@code
           * fixed}.
           */
          public Builder setAmount(EmptyParam amount) {
            this.amount = amount;
            return this;
          }

          /**
           * The type of amount that will be collected. The amount charged must be exact or up to
           * the value of {@code amount} param for {@code fixed} or {@code maximum} type
           * respectively. Defaults to {@code maximum}.
           */
          public Builder setAmountType(
              SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions.AmountType
                  amountType) {
            this.amountType = amountType;
            return this;
          }

          /**
           * The type of amount that will be collected. The amount charged must be exact or up to
           * the value of {@code amount} param for {@code fixed} or {@code maximum} type
           * respectively. Defaults to {@code maximum}.
           */
          public Builder setAmountType(EmptyParam amountType) {
            this.amountType = amountType;
            return this;
          }

          /**
           * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no
           * end date.
           */
          public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
          }

          /**
           * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no
           * end date.
           */
          public Builder setEndDate(EmptyParam endDate) {
            this.endDate = endDate;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions#extraParams} for the
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The periodicity at which payments will be collected. Defaults to {@code adhoc}. */
          public Builder setPaymentSchedule(
              SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions.PaymentSchedule
                  paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /** The periodicity at which payments will be collected. Defaults to {@code adhoc}. */
          public Builder setPaymentSchedule(EmptyParam paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /**
           * The number of payments that will be made during a payment period. Defaults to 1 except
           * for when {@code payment_schedule} is {@code adhoc}. In that case, it defaults to no
           * limit.
           */
          public Builder setPaymentsPerPeriod(Long paymentsPerPeriod) {
            this.paymentsPerPeriod = paymentsPerPeriod;
            return this;
          }

          /**
           * The number of payments that will be made during a payment period. Defaults to 1 except
           * for when {@code payment_schedule} is {@code adhoc}. In that case, it defaults to no
           * limit.
           */
          public Builder setPaymentsPerPeriod(EmptyParam paymentsPerPeriod) {
            this.paymentsPerPeriod = paymentsPerPeriod;
            return this;
          }

          /**
           * The purpose for which payments are made. Has a default value based on your merchant
           * category code.
           */
          public Builder setPurpose(
              SetupIntentUpdateParams.PaymentMethodOptions.Payto.MandateOptions.Purpose purpose) {
            this.purpose = purpose;
            return this;
          }

          /**
           * The purpose for which payments are made. Has a default value based on your merchant
           * category code.
           */
          public Builder setPurpose(EmptyParam purpose) {
            this.purpose = purpose;
            return this;
          }

          /**
           * Date, in YYYY-MM-DD format, from which payments will be collected. Defaults to
           * confirmation time.
           */
          public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
          }

          /**
           * Date, in YYYY-MM-DD format, from which payments will be collected. Defaults to
           * confirmation time.
           */
          public Builder setStartDate(EmptyParam startDate) {
            this.startDate = startDate;
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

        public enum PaymentSchedule implements ApiRequestParams.EnumParam {
          @SerializedName("adhoc")
          ADHOC("adhoc"),

          @SerializedName("annual")
          ANNUAL("annual"),

          @SerializedName("daily")
          DAILY("daily"),

          @SerializedName("fortnightly")
          FORTNIGHTLY("fortnightly"),

          @SerializedName("monthly")
          MONTHLY("monthly"),

          @SerializedName("quarterly")
          QUARTERLY("quarterly"),

          @SerializedName("semi_annual")
          SEMI_ANNUAL("semi_annual"),

          @SerializedName("weekly")
          WEEKLY("weekly");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentSchedule(String value) {
            this.value = value;
          }
        }

        public enum Purpose implements ApiRequestParams.EnumParam {
          @SerializedName("dependant_support")
          DEPENDANT_SUPPORT("dependant_support"),

          @SerializedName("government")
          GOVERNMENT("government"),

          @SerializedName("loan")
          LOAN("loan"),

          @SerializedName("mortgage")
          MORTGAGE("mortgage"),

          @SerializedName("other")
          OTHER("other"),

          @SerializedName("pension")
          PENSION("pension"),

          @SerializedName("personal")
          PERSONAL("personal"),

          @SerializedName("retail")
          RETAIL("retail"),

          @SerializedName("salary")
          SALARY("salary"),

          @SerializedName("tax")
          TAX("tax"),

          @SerializedName("utility")
          UTILITY("utility");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Purpose(String value) {
            this.value = value;
          }
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

      /** Additional fields for mandate creation. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      private Pix(Map<String, Object> extraParams, MandateOptions mandateOptions) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.Pix build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.Pix(
              this.extraParams, this.mandateOptions);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Pix#extraParams} for the
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.Pix#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for mandate creation. */
        public Builder setMandateOptions(
            SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions {
        /**
         * Amount to be charged for future payments. Required when {@code amount_type=fixed}. If not
         * provided for {@code amount_type=maximum}, defaults to 40000.
         */
        @SerializedName("amount")
        Long amount;

        /** Determines if the amount includes the IOF tax. Defaults to {@code never}. */
        @SerializedName("amount_includes_iof")
        AmountIncludesIof amountIncludesIof;

        /** Type of amount. Defaults to {@code maximum}. */
        @SerializedName("amount_type")
        AmountType amountType;

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Only {@code brl} is supported currently.
         */
        @SerializedName("currency")
        Object currency;

        /**
         * Date when the mandate expires and no further payments will be charged, in {@code
         * YYYY-MM-DD}. If not provided, the mandate will be active until canceled. If provided, end
         * date should be after start date.
         */
        @SerializedName("end_date")
        Object endDate;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Schedule at which the future payments will be charged. Defaults to {@code weekly}. */
        @SerializedName("payment_schedule")
        PaymentSchedule paymentSchedule;

        /**
         * Subscription name displayed to buyers in their bank app. Defaults to the displayable
         * business name.
         */
        @SerializedName("reference")
        Object reference;

        /**
         * Start date of the mandate, in {@code YYYY-MM-DD}. Start date should be at least 3 days in
         * the future. Defaults to 3 days after the current date.
         */
        @SerializedName("start_date")
        Object startDate;

        private MandateOptions(
            Long amount,
            AmountIncludesIof amountIncludesIof,
            AmountType amountType,
            Object currency,
            Object endDate,
            Map<String, Object> extraParams,
            PaymentSchedule paymentSchedule,
            Object reference,
            Object startDate) {
          this.amount = amount;
          this.amountIncludesIof = amountIncludesIof;
          this.amountType = amountType;
          this.currency = currency;
          this.endDate = endDate;
          this.extraParams = extraParams;
          this.paymentSchedule = paymentSchedule;
          this.reference = reference;
          this.startDate = startDate;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private AmountIncludesIof amountIncludesIof;

          private AmountType amountType;

          private Object currency;

          private Object endDate;

          private Map<String, Object> extraParams;

          private PaymentSchedule paymentSchedule;

          private Object reference;

          private Object startDate;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions(
                this.amount,
                this.amountIncludesIof,
                this.amountType,
                this.currency,
                this.endDate,
                this.extraParams,
                this.paymentSchedule,
                this.reference,
                this.startDate);
          }

          /**
           * Amount to be charged for future payments. Required when {@code amount_type=fixed}. If
           * not provided for {@code amount_type=maximum}, defaults to 40000.
           */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Determines if the amount includes the IOF tax. Defaults to {@code never}. */
          public Builder setAmountIncludesIof(
              SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions.AmountIncludesIof
                  amountIncludesIof) {
            this.amountIncludesIof = amountIncludesIof;
            return this;
          }

          /** Type of amount. Defaults to {@code maximum}. */
          public Builder setAmountType(
              SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions.AmountType
                  amountType) {
            this.amountType = amountType;
            return this;
          }

          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Only {@code brl} is supported currently.
           */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
           * code</a>, in lowercase. Only {@code brl} is supported currently.
           */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Date when the mandate expires and no further payments will be charged, in {@code
           * YYYY-MM-DD}. If not provided, the mandate will be active until canceled. If provided,
           * end date should be after start date.
           */
          public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
          }

          /**
           * Date when the mandate expires and no further payments will be charged, in {@code
           * YYYY-MM-DD}. If not provided, the mandate will be active until canceled. If provided,
           * end date should be after start date.
           */
          public Builder setEndDate(EmptyParam endDate) {
            this.endDate = endDate;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions#extraParams} for the
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
           * SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Schedule at which the future payments will be charged. Defaults to {@code weekly}. */
          public Builder setPaymentSchedule(
              SetupIntentUpdateParams.PaymentMethodOptions.Pix.MandateOptions.PaymentSchedule
                  paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /**
           * Subscription name displayed to buyers in their bank app. Defaults to the displayable
           * business name.
           */
          public Builder setReference(String reference) {
            this.reference = reference;
            return this;
          }

          /**
           * Subscription name displayed to buyers in their bank app. Defaults to the displayable
           * business name.
           */
          public Builder setReference(EmptyParam reference) {
            this.reference = reference;
            return this;
          }

          /**
           * Start date of the mandate, in {@code YYYY-MM-DD}. Start date should be at least 3 days
           * in the future. Defaults to 3 days after the current date.
           */
          public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
          }

          /**
           * Start date of the mandate, in {@code YYYY-MM-DD}. Start date should be at least 3 days
           * in the future. Defaults to 3 days after the current date.
           */
          public Builder setStartDate(EmptyParam startDate) {
            this.startDate = startDate;
            return this;
          }
        }

        public enum AmountIncludesIof implements ApiRequestParams.EnumParam {
          @SerializedName("always")
          ALWAYS("always"),

          @SerializedName("never")
          NEVER("never");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AmountIncludesIof(String value) {
            this.value = value;
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

        public enum PaymentSchedule implements ApiRequestParams.EnumParam {
          @SerializedName("halfyearly")
          HALFYEARLY("halfyearly"),

          @SerializedName("monthly")
          MONTHLY("monthly"),

          @SerializedName("quarterly")
          QUARTERLY("quarterly"),

          @SerializedName("weekly")
          WEEKLY("weekly"),

          @SerializedName("yearly")
          YEARLY("yearly");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentSchedule(String value) {
            this.value = value;
          }
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

      private SepaDebit(Map<String, Object> extraParams, MandateOptions mandateOptions) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit(
              this.extraParams, this.mandateOptions);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit#extraParams} for
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit#extraParams} for
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
            SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
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
          public SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions(
                this.extraParams, this.referencePrefix);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams} for
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
           * SetupIntentUpdateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams} for
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

      /** Bank account verification method. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private UsBankAccount(
          Map<String, Object> extraParams,
          FinancialConnections financialConnections,
          MandateOptions mandateOptions,
          Networks networks,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.financialConnections = financialConnections;
        this.mandateOptions = mandateOptions;
        this.networks = networks;
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

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount build() {
          return new SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount(
              this.extraParams,
              this.financialConnections,
              this.mandateOptions,
              this.networks,
              this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount#extraParams}
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
         * map. See {@link SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount#extraParams}
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
            SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                financialConnections) {
          this.financialConnections = financialConnections;
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(
            SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /** Additional fields for network related functions. */
        public Builder setNetworks(
            SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks networks) {
          this.networks = networks;
          return this;
        }

        /** Bank account verification method. */
        public Builder setVerificationMethod(
            SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.VerificationMethod
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
                SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .Permission>
            permissions;

        /** List of data features that you would like to retrieve upon account creation. */
        @SerializedName("prefetch")
        List<
                SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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
            Filters filters,
            ManualEntry manualEntry,
            List<
                    SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                        .Permission>
                permissions,
            List<
                    SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                        .Prefetch>
                prefetch,
            Object returnUrl) {
          this.extraParams = extraParams;
          this.filters = filters;
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

          private Filters filters;

          private ManualEntry manualEntry;

          private List<
                  SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Permission>
              permissions;

          private List<
                  SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Prefetch>
              prefetch;

          private Object returnUrl;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
              build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                .FinancialConnections(
                this.extraParams,
                this.filters,
                this.manualEntry,
                this.permissions,
                this.prefetch,
                this.returnUrl);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
              SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Filters
                  filters) {
            this.filters = filters;
            return this;
          }

          /** Customize manual entry behavior. */
          public Builder setManualEntry(
              SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .ManualEntry
                  manualEntry) {
            this.manualEntry = manualEntry;
            return this;
          }

          /**
           * Add an element to `permissions` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addPermission(
              SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addAllPermission(
              List<
                      SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addPrefetch(
              SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addAllPrefetch(
              List<
                      SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount
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
        @EqualsAndHashCode(callSuper = false)
        public static class Filters {
          /**
           * The account subcategories to use to filter for selectable accounts. Valid subcategories
           * are {@code checking} and {@code savings}.
           */
          @SerializedName("account_subcategories")
          List<
                  SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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

          /** ID of the institution to use to filter for selectable accounts. */
          @SerializedName("institution")
          Object institution;

          private Filters(
              List<
                      SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Filters.AccountSubcategory>
                  accountSubcategories,
              Map<String, Object> extraParams,
              Object institution) {
            this.accountSubcategories = accountSubcategories;
            this.extraParams = extraParams;
            this.institution = institution;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<
                    SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                        .Filters.AccountSubcategory>
                accountSubcategories;

            private Map<String, Object> extraParams;

            private Object institution;

            /** Finalize and obtain parameter instance from this builder. */
            public SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .Filters
                build() {
              return new SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections.Filters(
                  this.accountSubcategories, this.extraParams, this.institution);
            }

            /**
             * Add an element to `accountSubcategories` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
             * for the field documentation.
             */
            public Builder addAccountSubcategory(
                SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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
             * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
             * for the field documentation.
             */
            public Builder addAllAccountSubcategory(
                List<
                        SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount
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
             * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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
             * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** ID of the institution to use to filter for selectable accounts. */
            public Builder setInstitution(String institution) {
              this.institution = institution;
              return this;
            }

            /** ID of the institution to use to filter for selectable accounts. */
            public Builder setInstitution(EmptyParam institution) {
              this.institution = institution;
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

        @Getter
        @EqualsAndHashCode(callSuper = false)
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
            public SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                    .ManualEntry
                build() {
              return new SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections.ManualEntry(this.extraParams, this.mode);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.ManualEntry#extraParams}
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
             * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.ManualEntry#extraParams}
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
                SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
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
          public SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.MandateOptions build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.MandateOptions(
                this.collectionMethod, this.extraParams);
          }

          /** The method used to collect offline mandate customer acceptance. */
          public Builder setCollectionMethod(
              SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.MandateOptions
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.MandateOptions#extraParams}
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.MandateOptions#extraParams}
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
        List<SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
            requested;

        private Networks(
            Map<String, Object> extraParams,
            List<SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
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
                  SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
              requested;

          /** Finalize and obtain parameter instance from this builder. */
          public SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks build() {
            return new SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks(
                this.extraParams, this.requested);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#extraParams} for
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#extraParams} for
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#requested} for the
           * field documentation.
           */
          public Builder addRequested(
              SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested
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
           * SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks#requested} for the
           * field documentation.
           */
          public Builder addAllRequested(
              List<SetupIntentUpdateParams.PaymentMethodOptions.UsBankAccount.Networks.Requested>
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
  }

  public enum ExcludedPaymentMethodType implements ApiRequestParams.EnumParam {
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

    @SerializedName("card")
    CARD("card"),

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

    @SerializedName("gopay")
    GOPAY("gopay"),

    @SerializedName("grabpay")
    GRABPAY("grabpay"),

    @SerializedName("id_bank_transfer")
    ID_BANK_TRANSFER("id_bank_transfer"),

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

    @SerializedName("mb_way")
    MB_WAY("mb_way"),

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

    @SerializedName("paypay")
    PAYPAY("paypay"),

    @SerializedName("payto")
    PAYTO("payto"),

    @SerializedName("pix")
    PIX("pix"),

    @SerializedName("promptpay")
    PROMPTPAY("promptpay"),

    @SerializedName("qris")
    QRIS("qris"),

    @SerializedName("rechnung")
    RECHNUNG("rechnung"),

    @SerializedName("revolut_pay")
    REVOLUT_PAY("revolut_pay"),

    @SerializedName("samsung_pay")
    SAMSUNG_PAY("samsung_pay"),

    @SerializedName("satispay")
    SATISPAY("satispay"),

    @SerializedName("sepa_debit")
    SEPA_DEBIT("sepa_debit"),

    @SerializedName("shopeepay")
    SHOPEEPAY("shopeepay"),

    @SerializedName("sofort")
    SOFORT("sofort"),

    @SerializedName("stripe_balance")
    STRIPE_BALANCE("stripe_balance"),

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

    ExcludedPaymentMethodType(String value) {
      this.value = value;
    }
  }

  public enum FlowDirection implements ApiRequestParams.EnumParam {
    @SerializedName("inbound")
    INBOUND("inbound"),

    @SerializedName("outbound")
    OUTBOUND("outbound");

    @Getter(onMethod_ = {@Override})
    private final String value;

    FlowDirection(String value) {
      this.value = value;
    }
  }
}
