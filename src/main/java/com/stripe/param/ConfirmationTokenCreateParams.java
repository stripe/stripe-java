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
public class ConfirmationTokenCreateParams extends ApiRequestParams {
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

  /** ID of an existing PaymentMethod. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** If provided, this hash will be used to create a PaymentMethod. */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /** Payment-method-specific configuration for this ConfirmationToken. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** Return URL used to confirm the Intent. */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * Indicates that you intend to make future payments with this ConfirmationToken's payment method.
   *
   * <p>The presence of this property will <a
   * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a> to
   * the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any required
   * actions from the user are complete.
   */
  @SerializedName("setup_future_usage")
  SetupFutureUsage setupFutureUsage;

  /** Shipping information for this ConfirmationToken. */
  @SerializedName("shipping")
  Shipping shipping;

  private ConfirmationTokenCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentMethod,
      PaymentMethodData paymentMethodData,
      PaymentMethodOptions paymentMethodOptions,
      String returnUrl,
      SetupFutureUsage setupFutureUsage,
      Shipping shipping) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentMethod = paymentMethod;
    this.paymentMethodData = paymentMethodData;
    this.paymentMethodOptions = paymentMethodOptions;
    this.returnUrl = returnUrl;
    this.setupFutureUsage = setupFutureUsage;
    this.shipping = shipping;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentMethod;

    private PaymentMethodData paymentMethodData;

    private PaymentMethodOptions paymentMethodOptions;

    private String returnUrl;

    private SetupFutureUsage setupFutureUsage;

    private Shipping shipping;

    /** Finalize and obtain parameter instance from this builder. */
    public ConfirmationTokenCreateParams build() {
      return new ConfirmationTokenCreateParams(
          this.expand,
          this.extraParams,
          this.paymentMethod,
          this.paymentMethodData,
          this.paymentMethodOptions,
          this.returnUrl,
          this.setupFutureUsage,
          this.shipping);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ConfirmationTokenCreateParams#expand} for the field documentation.
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
     * ConfirmationTokenCreateParams#expand} for the field documentation.
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
     * ConfirmationTokenCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link ConfirmationTokenCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** ID of an existing PaymentMethod. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** If provided, this hash will be used to create a PaymentMethod. */
    public Builder setPaymentMethodData(
        ConfirmationTokenCreateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /** Payment-method-specific configuration for this ConfirmationToken. */
    public Builder setPaymentMethodOptions(
        ConfirmationTokenCreateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /** Return URL used to confirm the Intent. */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * Indicates that you intend to make future payments with this ConfirmationToken's payment
     * method.
     *
     * <p>The presence of this property will <a
     * href="https://stripe.com/docs/payments/save-during-payment">attach the payment method</a> to
     * the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any
     * required actions from the user are complete.
     */
    public Builder setSetupFutureUsage(
        ConfirmationTokenCreateParams.SetupFutureUsage setupFutureUsage) {
      this.setupFutureUsage = setupFutureUsage;
      return this;
    }

    /** Shipping information for this ConfirmationToken. */
    public Builder setShipping(ConfirmationTokenCreateParams.Shipping shipping) {
      this.shipping = shipping;
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
     * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
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
      public ConfirmationTokenCreateParams.PaymentMethodData build() {
        return new ConfirmationTokenCreateParams.PaymentMethodData(
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
      public Builder setAcssDebit(
          ConfirmationTokenCreateParams.PaymentMethodData.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /**
       * If this is an {@code affirm} PaymentMethod, this hash contains details about the Affirm
       * payment method.
       */
      public Builder setAffirm(ConfirmationTokenCreateParams.PaymentMethodData.Affirm affirm) {
        this.affirm = affirm;
        return this;
      }

      /**
       * If this is an {@code AfterpayClearpay} PaymentMethod, this hash contains details about the
       * AfterpayClearpay payment method.
       */
      public Builder setAfterpayClearpay(
          ConfirmationTokenCreateParams.PaymentMethodData.AfterpayClearpay afterpayClearpay) {
        this.afterpayClearpay = afterpayClearpay;
        return this;
      }

      /**
       * If this is an {@code Alipay} PaymentMethod, this hash contains details about the Alipay
       * payment method.
       */
      public Builder setAlipay(ConfirmationTokenCreateParams.PaymentMethodData.Alipay alipay) {
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
          ConfirmationTokenCreateParams.PaymentMethodData.AllowRedisplay allowRedisplay) {
        this.allowRedisplay = allowRedisplay;
        return this;
      }

      /**
       * If this is a Alma PaymentMethod, this hash contains details about the Alma payment method.
       */
      public Builder setAlma(ConfirmationTokenCreateParams.PaymentMethodData.Alma alma) {
        this.alma = alma;
        return this;
      }

      /**
       * If this is a AmazonPay PaymentMethod, this hash contains details about the AmazonPay
       * payment method.
       */
      public Builder setAmazonPay(
          ConfirmationTokenCreateParams.PaymentMethodData.AmazonPay amazonPay) {
        this.amazonPay = amazonPay;
        return this;
      }

      /**
       * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the
       * bank account.
       */
      public Builder setAuBecsDebit(
          ConfirmationTokenCreateParams.PaymentMethodData.AuBecsDebit auBecsDebit) {
        this.auBecsDebit = auBecsDebit;
        return this;
      }

      /**
       * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs
       * Direct Debit bank account.
       */
      public Builder setBacsDebit(
          ConfirmationTokenCreateParams.PaymentMethodData.BacsDebit bacsDebit) {
        this.bacsDebit = bacsDebit;
        return this;
      }

      /**
       * If this is a {@code bancontact} PaymentMethod, this hash contains details about the
       * Bancontact payment method.
       */
      public Builder setBancontact(
          ConfirmationTokenCreateParams.PaymentMethodData.Bancontact bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /**
       * If this is a {@code billie} PaymentMethod, this hash contains details about the Billie
       * payment method.
       */
      public Builder setBillie(ConfirmationTokenCreateParams.PaymentMethodData.Billie billie) {
        this.billie = billie;
        return this;
      }

      /**
       * Billing information associated with the PaymentMethod that may be used or required by
       * particular types of payment methods.
       */
      public Builder setBillingDetails(
          ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /**
       * If this is a {@code blik} PaymentMethod, this hash contains details about the BLIK payment
       * method.
       */
      public Builder setBlik(ConfirmationTokenCreateParams.PaymentMethodData.Blik blik) {
        this.blik = blik;
        return this;
      }

      /**
       * If this is a {@code boleto} PaymentMethod, this hash contains details about the Boleto
       * payment method.
       */
      public Builder setBoleto(ConfirmationTokenCreateParams.PaymentMethodData.Boleto boleto) {
        this.boleto = boleto;
        return this;
      }

      /**
       * If this is a {@code cashapp} PaymentMethod, this hash contains details about the Cash App
       * Pay payment method.
       */
      public Builder setCashapp(ConfirmationTokenCreateParams.PaymentMethodData.Cashapp cashapp) {
        this.cashapp = cashapp;
        return this;
      }

      /**
       * If this is a {@code customer_balance} PaymentMethod, this hash contains details about the
       * CustomerBalance payment method.
       */
      public Builder setCustomerBalance(
          ConfirmationTokenCreateParams.PaymentMethodData.CustomerBalance customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /**
       * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
       * method.
       */
      public Builder setEps(ConfirmationTokenCreateParams.PaymentMethodData.Eps eps) {
        this.eps = eps;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfirmationTokenCreateParams.PaymentMethodData#extraParams} for the field documentation.
       */
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
       * See {@link ConfirmationTokenCreateParams.PaymentMethodData#extraParams} for the field
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
      public Builder setFpx(ConfirmationTokenCreateParams.PaymentMethodData.Fpx fpx) {
        this.fpx = fpx;
        return this;
      }

      /**
       * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
       * payment method.
       */
      public Builder setGiropay(ConfirmationTokenCreateParams.PaymentMethodData.Giropay giropay) {
        this.giropay = giropay;
        return this;
      }

      /**
       * If this is a Gopay PaymentMethod, this hash contains details about the Gopay payment
       * method.
       */
      public Builder setGopay(ConfirmationTokenCreateParams.PaymentMethodData.Gopay gopay) {
        this.gopay = gopay;
        return this;
      }

      /**
       * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
       * payment method.
       */
      public Builder setGrabpay(ConfirmationTokenCreateParams.PaymentMethodData.Grabpay grabpay) {
        this.grabpay = grabpay;
        return this;
      }

      /**
       * If this is an {@code IdBankTransfer} PaymentMethod, this hash contains details about the
       * IdBankTransfer payment method.
       */
      public Builder setIdBankTransfer(
          ConfirmationTokenCreateParams.PaymentMethodData.IdBankTransfer idBankTransfer) {
        this.idBankTransfer = idBankTransfer;
        return this;
      }

      /**
       * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL
       * payment method.
       */
      public Builder setIdeal(ConfirmationTokenCreateParams.PaymentMethodData.Ideal ideal) {
        this.ideal = ideal;
        return this;
      }

      /**
       * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
       * Interac Present payment method.
       */
      public Builder setInteracPresent(
          ConfirmationTokenCreateParams.PaymentMethodData.InteracPresent interacPresent) {
        this.interacPresent = interacPresent;
        return this;
      }

      /**
       * If this is a {@code kakao_pay} PaymentMethod, this hash contains details about the Kakao
       * Pay payment method.
       */
      public Builder setKakaoPay(
          ConfirmationTokenCreateParams.PaymentMethodData.KakaoPay kakaoPay) {
        this.kakaoPay = kakaoPay;
        return this;
      }

      /**
       * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
       * payment method.
       */
      public Builder setKlarna(ConfirmationTokenCreateParams.PaymentMethodData.Klarna klarna) {
        this.klarna = klarna;
        return this;
      }

      /**
       * If this is a {@code konbini} PaymentMethod, this hash contains details about the Konbini
       * payment method.
       */
      public Builder setKonbini(ConfirmationTokenCreateParams.PaymentMethodData.Konbini konbini) {
        this.konbini = konbini;
        return this;
      }

      /**
       * If this is a {@code kr_card} PaymentMethod, this hash contains details about the Korean
       * Card payment method.
       */
      public Builder setKrCard(ConfirmationTokenCreateParams.PaymentMethodData.KrCard krCard) {
        this.krCard = krCard;
        return this;
      }

      /**
       * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
       * method.
       */
      public Builder setLink(ConfirmationTokenCreateParams.PaymentMethodData.Link link) {
        this.link = link;
        return this;
      }

      /**
       * If this is a MB WAY PaymentMethod, this hash contains details about the MB WAY payment
       * method.
       */
      public Builder setMbWay(ConfirmationTokenCreateParams.PaymentMethodData.MbWay mbWay) {
        this.mbWay = mbWay;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfirmationTokenCreateParams.PaymentMethodData#metadata} for the field documentation.
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
       * See {@link ConfirmationTokenCreateParams.PaymentMethodData#metadata} for the field
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
      public Builder setMobilepay(
          ConfirmationTokenCreateParams.PaymentMethodData.Mobilepay mobilepay) {
        this.mobilepay = mobilepay;
        return this;
      }

      /**
       * If this is a {@code multibanco} PaymentMethod, this hash contains details about the
       * Multibanco payment method.
       */
      public Builder setMultibanco(
          ConfirmationTokenCreateParams.PaymentMethodData.Multibanco multibanco) {
        this.multibanco = multibanco;
        return this;
      }

      /**
       * If this is a {@code naver_pay} PaymentMethod, this hash contains details about the Naver
       * Pay payment method.
       */
      public Builder setNaverPay(
          ConfirmationTokenCreateParams.PaymentMethodData.NaverPay naverPay) {
        this.naverPay = naverPay;
        return this;
      }

      /**
       * If this is an nz_bank_account PaymentMethod, this hash contains details about the
       * nz_bank_account payment method.
       */
      public Builder setNzBankAccount(
          ConfirmationTokenCreateParams.PaymentMethodData.NzBankAccount nzBankAccount) {
        this.nzBankAccount = nzBankAccount;
        return this;
      }

      /**
       * If this is an {@code oxxo} PaymentMethod, this hash contains details about the OXXO payment
       * method.
       */
      public Builder setOxxo(ConfirmationTokenCreateParams.PaymentMethodData.Oxxo oxxo) {
        this.oxxo = oxxo;
        return this;
      }

      /**
       * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
       * method.
       */
      public Builder setP24(ConfirmationTokenCreateParams.PaymentMethodData.P24 p24) {
        this.p24 = p24;
        return this;
      }

      /**
       * If this is a {@code pay_by_bank} PaymentMethod, this hash contains details about the
       * PayByBank payment method.
       */
      public Builder setPayByBank(
          ConfirmationTokenCreateParams.PaymentMethodData.PayByBank payByBank) {
        this.payByBank = payByBank;
        return this;
      }

      /**
       * If this is a {@code payco} PaymentMethod, this hash contains details about the PAYCO
       * payment method.
       */
      public Builder setPayco(ConfirmationTokenCreateParams.PaymentMethodData.Payco payco) {
        this.payco = payco;
        return this;
      }

      /**
       * If this is a {@code paynow} PaymentMethod, this hash contains details about the PayNow
       * payment method.
       */
      public Builder setPaynow(ConfirmationTokenCreateParams.PaymentMethodData.Paynow paynow) {
        this.paynow = paynow;
        return this;
      }

      /**
       * If this is a {@code paypal} PaymentMethod, this hash contains details about the PayPal
       * payment method.
       */
      public Builder setPaypal(ConfirmationTokenCreateParams.PaymentMethodData.Paypal paypal) {
        this.paypal = paypal;
        return this;
      }

      /**
       * If this is a {@code payto} PaymentMethod, this hash contains details about the PayTo
       * payment method.
       */
      public Builder setPayto(ConfirmationTokenCreateParams.PaymentMethodData.Payto payto) {
        this.payto = payto;
        return this;
      }

      /**
       * If this is a {@code pix} PaymentMethod, this hash contains details about the Pix payment
       * method.
       */
      public Builder setPix(ConfirmationTokenCreateParams.PaymentMethodData.Pix pix) {
        this.pix = pix;
        return this;
      }

      /**
       * If this is a {@code promptpay} PaymentMethod, this hash contains details about the
       * PromptPay payment method.
       */
      public Builder setPromptpay(
          ConfirmationTokenCreateParams.PaymentMethodData.Promptpay promptpay) {
        this.promptpay = promptpay;
        return this;
      }

      /**
       * If this is a {@code qris} PaymentMethod, this hash contains details about the QRIS payment
       * method.
       */
      public Builder setQris(ConfirmationTokenCreateParams.PaymentMethodData.Qris qris) {
        this.qris = qris;
        return this;
      }

      /**
       * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
       * Session</a> for more information.
       */
      public Builder setRadarOptions(
          ConfirmationTokenCreateParams.PaymentMethodData.RadarOptions radarOptions) {
        this.radarOptions = radarOptions;
        return this;
      }

      /**
       * If this is a {@code rechnung} PaymentMethod, this hash contains details about the Rechnung
       * payment method.
       */
      public Builder setRechnung(
          ConfirmationTokenCreateParams.PaymentMethodData.Rechnung rechnung) {
        this.rechnung = rechnung;
        return this;
      }

      /**
       * If this is a {@code revolut_pay} PaymentMethod, this hash contains details about the
       * Revolut Pay payment method.
       */
      public Builder setRevolutPay(
          ConfirmationTokenCreateParams.PaymentMethodData.RevolutPay revolutPay) {
        this.revolutPay = revolutPay;
        return this;
      }

      /**
       * If this is a {@code samsung_pay} PaymentMethod, this hash contains details about the
       * SamsungPay payment method.
       */
      public Builder setSamsungPay(
          ConfirmationTokenCreateParams.PaymentMethodData.SamsungPay samsungPay) {
        this.samsungPay = samsungPay;
        return this;
      }

      /**
       * If this is a {@code satispay} PaymentMethod, this hash contains details about the Satispay
       * payment method.
       */
      public Builder setSatispay(
          ConfirmationTokenCreateParams.PaymentMethodData.Satispay satispay) {
        this.satispay = satispay;
        return this;
      }

      /**
       * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA
       * debit bank account.
       */
      public Builder setSepaDebit(
          ConfirmationTokenCreateParams.PaymentMethodData.SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }

      /**
       * If this is a Shopeepay PaymentMethod, this hash contains details about the Shopeepay
       * payment method.
       */
      public Builder setShopeepay(
          ConfirmationTokenCreateParams.PaymentMethodData.Shopeepay shopeepay) {
        this.shopeepay = shopeepay;
        return this;
      }

      /**
       * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT
       * payment method.
       */
      public Builder setSofort(ConfirmationTokenCreateParams.PaymentMethodData.Sofort sofort) {
        this.sofort = sofort;
        return this;
      }

      /** This hash contains details about the Stripe balance payment method. */
      public Builder setStripeBalance(
          ConfirmationTokenCreateParams.PaymentMethodData.StripeBalance stripeBalance) {
        this.stripeBalance = stripeBalance;
        return this;
      }

      /**
       * If this is a {@code swish} PaymentMethod, this hash contains details about the Swish
       * payment method.
       */
      public Builder setSwish(ConfirmationTokenCreateParams.PaymentMethodData.Swish swish) {
        this.swish = swish;
        return this;
      }

      /**
       * If this is a TWINT PaymentMethod, this hash contains details about the TWINT payment
       * method.
       */
      public Builder setTwint(ConfirmationTokenCreateParams.PaymentMethodData.Twint twint) {
        this.twint = twint;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(ConfirmationTokenCreateParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }

      /**
       * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the
       * US bank account payment method.
       */
      public Builder setUsBankAccount(
          ConfirmationTokenCreateParams.PaymentMethodData.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }

      /**
       * If this is an {@code wechat_pay} PaymentMethod, this hash contains details about the
       * wechat_pay payment method.
       */
      public Builder setWechatPay(
          ConfirmationTokenCreateParams.PaymentMethodData.WechatPay wechatPay) {
        this.wechatPay = wechatPay;
        return this;
      }

      /**
       * If this is a {@code zip} PaymentMethod, this hash contains details about the Zip payment
       * method.
       */
      public Builder setZip(ConfirmationTokenCreateParams.PaymentMethodData.Zip zip) {
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
        public ConfirmationTokenCreateParams.PaymentMethodData.AcssDebit build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.AcssDebit(
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.AcssDebit#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.AcssDebit#extraParams}
         * for the field documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Affirm build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Affirm(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Affirm#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Affirm#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.AfterpayClearpay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.AfterpayClearpay(
              this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.AfterpayClearpay#extraParams} for the
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
         * ConfirmationTokenCreateParams.PaymentMethodData.AfterpayClearpay#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Alipay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Alipay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Alipay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Alipay#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Alma build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Alma(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Alma#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Alma#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.AmazonPay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.AmazonPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.AmazonPay#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.AmazonPay#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.AuBecsDebit build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.AuBecsDebit(
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.AuBecsDebit#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.AuBecsDebit#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.BacsDebit build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.BacsDebit(
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.BacsDebit#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.BacsDebit#extraParams}
         * for the field documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Bancontact build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Bancontact(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Bancontact#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Bancontact#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Billie build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Billie(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Billie#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Billie#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone, this.taxId);
        }

        /** Billing address. */
        public Builder setAddress(
            ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails.Address address) {
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
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails#extraParams} for the field
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
         * ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails#extraParams} for the field
         * documentation.
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
          public ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails.Address build() {
            return new ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails.Address(
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
           * ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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
           * ConfirmationTokenCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
           * the field documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Blik build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Blik(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Blik#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Blik#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Boleto build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Boleto(
              this.extraParams, this.taxId);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Boleto#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Boleto#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Cashapp build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Cashapp(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Cashapp#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Cashapp#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.CustomerBalance build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.CustomerBalance(
              this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.CustomerBalance#extraParams} for the
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
         * ConfirmationTokenCreateParams.PaymentMethodData.CustomerBalance#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Eps build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Eps(
              this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(ConfirmationTokenCreateParams.PaymentMethodData.Eps.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Eps#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Eps#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Fpx build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Fpx(
              this.accountHolderType, this.bank, this.extraParams);
        }

        /** Account holder type for FPX transaction. */
        public Builder setAccountHolderType(
            ConfirmationTokenCreateParams.PaymentMethodData.Fpx.AccountHolderType
                accountHolderType) {
          this.accountHolderType = accountHolderType;
          return this;
        }

        /** <strong>Required.</strong> The customer's bank. */
        public Builder setBank(ConfirmationTokenCreateParams.PaymentMethodData.Fpx.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Fpx#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Fpx#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Giropay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Giropay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Giropay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Giropay#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Gopay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Gopay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Gopay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Gopay#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Grabpay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Grabpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Grabpay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Grabpay#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.IdBankTransfer build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.IdBankTransfer(
              this.bank, this.extraParams);
        }

        /** Bank where the account is held. */
        public Builder setBank(
            ConfirmationTokenCreateParams.PaymentMethodData.IdBankTransfer.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.IdBankTransfer#extraParams} for the field
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
         * ConfirmationTokenCreateParams.PaymentMethodData.IdBankTransfer#extraParams} for the field
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Ideal build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Ideal(
              this.bank, this.extraParams);
        }

        /**
         * The customer's bank. Only use this parameter for existing customers. Don't use it for new
         * customers.
         */
        public Builder setBank(ConfirmationTokenCreateParams.PaymentMethodData.Ideal.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Ideal#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Ideal#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.InteracPresent build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.InteracPresent(
              this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.InteracPresent#extraParams} for the field
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
         * ConfirmationTokenCreateParams.PaymentMethodData.InteracPresent#extraParams} for the field
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
        public ConfirmationTokenCreateParams.PaymentMethodData.KakaoPay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.KakaoPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.KakaoPay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.KakaoPay#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Klarna build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Klarna(
              this.dob, this.extraParams);
        }

        /** Customer's date of birth. */
        public Builder setDob(ConfirmationTokenCreateParams.PaymentMethodData.Klarna.Dob dob) {
          this.dob = dob;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Klarna#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Klarna#extraParams} for
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
          public ConfirmationTokenCreateParams.PaymentMethodData.Klarna.Dob build() {
            return new ConfirmationTokenCreateParams.PaymentMethodData.Klarna.Dob(
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
           * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Klarna.Dob#extraParams}
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
           * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Klarna.Dob#extraParams}
           * for the field documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Konbini build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Konbini(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Konbini#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Konbini#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.KrCard build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.KrCard(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.KrCard#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.KrCard#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Link build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Link(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Link#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Link#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.MbWay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.MbWay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.MbWay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.MbWay#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Mobilepay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Mobilepay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Mobilepay#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Mobilepay#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Multibanco build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Multibanco(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Multibanco#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Multibanco#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.NaverPay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.NaverPay(
              this.extraParams, this.funding);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.NaverPay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.NaverPay#extraParams} for
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
         * Whether to use Naver Pay points or a card to fund this transaction. If not provided, this
         * defaults to {@code card}.
         */
        public Builder setFunding(
            ConfirmationTokenCreateParams.PaymentMethodData.NaverPay.Funding funding) {
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
        public ConfirmationTokenCreateParams.PaymentMethodData.NzBankAccount build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.NzBankAccount(
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
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.NzBankAccount#extraParams} for the field
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
         * ConfirmationTokenCreateParams.PaymentMethodData.NzBankAccount#extraParams} for the field
         * documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Oxxo build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Oxxo(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Oxxo#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Oxxo#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.P24 build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.P24(
              this.bank, this.extraParams);
        }

        /** The customer's bank. */
        public Builder setBank(ConfirmationTokenCreateParams.PaymentMethodData.P24.Bank bank) {
          this.bank = bank;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.P24#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.P24#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.PayByBank build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.PayByBank(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.PayByBank#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.PayByBank#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Payco build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Payco(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Payco#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Payco#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Paynow build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Paynow(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Paynow#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Paynow#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Paypal build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Paypal(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Paypal#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Paypal#extraParams} for
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
    public static class Payto {
      /** The account number for the bank account. */
      @SerializedName("account_number")
      String accountNumber;

      /** Bank-State-Branch number of the bank account. */
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

      /** The PayID alias for the bank account. */
      @SerializedName("pay_id")
      String payId;

      private Payto(
          String accountNumber, String bsbNumber, Map<String, Object> extraParams, String payId) {
        this.accountNumber = accountNumber;
        this.bsbNumber = bsbNumber;
        this.extraParams = extraParams;
        this.payId = payId;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String accountNumber;

        private String bsbNumber;

        private Map<String, Object> extraParams;

        private String payId;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfirmationTokenCreateParams.PaymentMethodData.Payto build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Payto(
              this.accountNumber, this.bsbNumber, this.extraParams, this.payId);
        }

        /** The account number for the bank account. */
        public Builder setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
          return this;
        }

        /** Bank-State-Branch number of the bank account. */
        public Builder setBsbNumber(String bsbNumber) {
          this.bsbNumber = bsbNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Payto#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Payto#extraParams} for
         * the field documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Pix build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Pix(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Pix#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Pix#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Promptpay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Promptpay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Promptpay#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Promptpay#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Qris build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Qris(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Qris#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Qris#extraParams} for the
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
        public ConfirmationTokenCreateParams.PaymentMethodData.RadarOptions build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.RadarOptions(
              this.extraParams, this.session);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.RadarOptions#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.RadarOptions#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Rechnung build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Rechnung(
              this.dob, this.extraParams);
        }

        /** <strong>Required.</strong> Customer's date of birth */
        public Builder setDob(ConfirmationTokenCreateParams.PaymentMethodData.Rechnung.Dob dob) {
          this.dob = dob;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Rechnung#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Rechnung#extraParams} for
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
          public ConfirmationTokenCreateParams.PaymentMethodData.Rechnung.Dob build() {
            return new ConfirmationTokenCreateParams.PaymentMethodData.Rechnung.Dob(
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
           * map. See {@link
           * ConfirmationTokenCreateParams.PaymentMethodData.Rechnung.Dob#extraParams} for the field
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
           * ConfirmationTokenCreateParams.PaymentMethodData.Rechnung.Dob#extraParams} for the field
           * documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.RevolutPay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.RevolutPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.RevolutPay#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.RevolutPay#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.SamsungPay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.SamsungPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.SamsungPay#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.SamsungPay#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Satispay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Satispay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Satispay#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Satispay#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.SepaDebit build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.SepaDebit(
              this.extraParams, this.iban);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.SepaDebit#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.SepaDebit#extraParams}
         * for the field documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Shopeepay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Shopeepay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Shopeepay#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Shopeepay#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Sofort build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Sofort(
              this.country, this.extraParams);
        }

        /**
         * <strong>Required.</strong> Two-letter ISO code representing the country the bank account
         * is located in.
         */
        public Builder setCountry(
            ConfirmationTokenCreateParams.PaymentMethodData.Sofort.Country country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Sofort#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Sofort#extraParams} for
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
      String account;

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
          String account, Map<String, Object> extraParams, SourceType sourceType) {
        this.account = account;
        this.extraParams = extraParams;
        this.sourceType = sourceType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String account;

        private Map<String, Object> extraParams;

        private SourceType sourceType;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfirmationTokenCreateParams.PaymentMethodData.StripeBalance build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.StripeBalance(
              this.account, this.extraParams, this.sourceType);
        }

        /** The connected account ID whose Stripe balance to use as the source of payment. */
        public Builder setAccount(String account) {
          this.account = account;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.StripeBalance#extraParams} for the field
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
         * ConfirmationTokenCreateParams.PaymentMethodData.StripeBalance#extraParams} for the field
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
         * The <a
         * href="https://docs.stripe.com/api/balance/balance_object#balance_object-available-source_types">source_type</a>
         * of the balance
         */
        public Builder setSourceType(
            ConfirmationTokenCreateParams.PaymentMethodData.StripeBalance.SourceType sourceType) {
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Swish build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Swish(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Swish#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Swish#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Twint build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Twint(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Twint#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Twint#extraParams} for
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
        public ConfirmationTokenCreateParams.PaymentMethodData.UsBankAccount build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.UsBankAccount(
              this.accountHolderType,
              this.accountNumber,
              this.accountType,
              this.extraParams,
              this.financialConnectionsAccount,
              this.routingNumber);
        }

        /** Account holder type: individual or company. */
        public Builder setAccountHolderType(
            ConfirmationTokenCreateParams.PaymentMethodData.UsBankAccount.AccountHolderType
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
            ConfirmationTokenCreateParams.PaymentMethodData.UsBankAccount.AccountType accountType) {
          this.accountType = accountType;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ConfirmationTokenCreateParams.PaymentMethodData.UsBankAccount#extraParams} for the field
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
         * ConfirmationTokenCreateParams.PaymentMethodData.UsBankAccount#extraParams} for the field
         * documentation.
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
        public ConfirmationTokenCreateParams.PaymentMethodData.WechatPay build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.WechatPay(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.WechatPay#extraParams}
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.WechatPay#extraParams}
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
        public ConfirmationTokenCreateParams.PaymentMethodData.Zip build() {
          return new ConfirmationTokenCreateParams.PaymentMethodData.Zip(this.extraParams);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Zip#extraParams} for the
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodData.Zip#extraParams} for the
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
    /** Configuration for any card payments confirmed using this ConfirmationToken. */
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
      public ConfirmationTokenCreateParams.PaymentMethodOptions build() {
        return new ConfirmationTokenCreateParams.PaymentMethodOptions(this.card, this.extraParams);
      }

      /** Configuration for any card payments confirmed using this ConfirmationToken. */
      public Builder setCard(ConfirmationTokenCreateParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfirmationTokenCreateParams.PaymentMethodOptions#extraParams} for the field
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
       * See {@link ConfirmationTokenCreateParams.PaymentMethodOptions#extraParams} for the field
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

      /** Installment configuration for payments confirmed using this ConfirmationToken. */
      @SerializedName("installments")
      Installments installments;

      private Card(Map<String, Object> extraParams, Installments installments) {
        this.extraParams = extraParams;
        this.installments = installments;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Installments installments;

        /** Finalize and obtain parameter instance from this builder. */
        public ConfirmationTokenCreateParams.PaymentMethodOptions.Card build() {
          return new ConfirmationTokenCreateParams.PaymentMethodOptions.Card(
              this.extraParams, this.installments);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodOptions.Card#extraParams} for
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
         * map. See {@link ConfirmationTokenCreateParams.PaymentMethodOptions.Card#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Installment configuration for payments confirmed using this ConfirmationToken. */
        public Builder setInstallments(
            ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments installments) {
          this.installments = installments;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Installments {
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
         * <strong>Required.</strong> The selected installment plan to use for this payment attempt.
         * This parameter can only be provided during confirmation.
         */
        @SerializedName("plan")
        Plan plan;

        private Installments(Map<String, Object> extraParams, Plan plan) {
          this.extraParams = extraParams;
          this.plan = plan;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Plan plan;

          /** Finalize and obtain parameter instance from this builder. */
          public ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments build() {
            return new ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments(
                this.extraParams, this.plan);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments#extraParams} for
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
           * ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments#extraParams} for
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
           * <strong>Required.</strong> The selected installment plan to use for this payment
           * attempt. This parameter can only be provided during confirmation.
           */
          public Builder setPlan(
              ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments.Plan plan) {
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
            public ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments.Plan
                build() {
              return new ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments.Plan(
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
             * ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
             * ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments.Plan#extraParams}
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
                ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments.Plan.Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /** <strong>Required.</strong> Type of installment plan, one of {@code fixed_count}. */
            public Builder setType(
                ConfirmationTokenCreateParams.PaymentMethodOptions.Card.Installments.Plan.Type
                    type) {
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
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Shipping {
    /** <strong>Required.</strong> Shipping address */
    @SerializedName("address")
    Address address;

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
    Object phone;

    private Shipping(Address address, Map<String, Object> extraParams, String name, Object phone) {
      this.address = address;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      private String name;

      private Object phone;

      /** Finalize and obtain parameter instance from this builder. */
      public ConfirmationTokenCreateParams.Shipping build() {
        return new ConfirmationTokenCreateParams.Shipping(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** <strong>Required.</strong> Shipping address */
      public Builder setAddress(ConfirmationTokenCreateParams.Shipping.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ConfirmationTokenCreateParams.Shipping#extraParams} for the field documentation.
       */
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
       * See {@link ConfirmationTokenCreateParams.Shipping#extraParams} for the field documentation.
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

      /** Recipient phone (including extension). */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
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
        public ConfirmationTokenCreateParams.Shipping.Address build() {
          return new ConfirmationTokenCreateParams.Shipping.Address(
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
         * map. See {@link ConfirmationTokenCreateParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link ConfirmationTokenCreateParams.Shipping.Address#extraParams} for the field
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
