// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentMethodConfigurationCreateParams extends ApiRequestParams {
  /**
   * Canadian pre-authorized debit payments, check this <a
   * href="https://stripe.com/docs/payments/acss-debit">page</a> for more details like country
   * availability.
   */
  @SerializedName("acss_debit")
  AcssDebit acssDebit;

  /**
   * <a href="https://www.affirm.com/">Affirm</a> gives your customers a way to split purchases over
   * a series of payments. Depending on the purchase, they can pay with four interest-free payments
   * (Split Pay) or pay over a longer term (Installments), which might include interest. Check this
   * <a href="https://stripe.com/docs/payments/affirm">page</a> for more details like country
   * availability.
   */
  @SerializedName("affirm")
  Affirm affirm;

  /**
   * Afterpay gives your customers a way to pay for purchases in installments, check this <a
   * href="https://stripe.com/docs/payments/afterpay-clearpay">page</a> for more details like
   * country availability. Afterpay is particularly popular among businesses selling fashion,
   * beauty, and sports products.
   */
  @SerializedName("afterpay_clearpay")
  AfterpayClearpay afterpayClearpay;

  /**
   * Alipay is a digital wallet in China that has more than a billion active users worldwide. Alipay
   * users can pay on the web or on a mobile device using login credentials or their Alipay app.
   * Alipay has a low dispute rate and reduces fraud by authenticating payments using the customer's
   * login credentials. Check this <a href="https://stripe.com/docs/payments/alipay">page</a> for
   * more details.
   */
  @SerializedName("alipay")
  Alipay alipay;

  /**
   * Stripe users can accept <a href="https://stripe.com/payments/apple-pay">Apple Pay</a> in iOS
   * applications in iOS 9 and later, and on the web in Safari starting with iOS 10 or macOS Sierra.
   * There are no additional fees to process Apple Pay payments, and the <a
   * href="https://stripe.com/pricing">pricing</a> is the same as other card transactions. Check
   * this <a href="https://stripe.com/docs/apple-pay">page</a> for more details.
   */
  @SerializedName("apple_pay")
  ApplePay applePay;

  /**
   * Apple Pay Later, a payment method for customers to buy now and pay later, gives your customers
   * a way to split purchases into four installments across six weeks.
   */
  @SerializedName("apple_pay_later")
  ApplePayLater applePayLater;

  /**
   * Stripe users in Australia can accept Bulk Electronic Clearing System (BECS) direct debit
   * payments from customers with an Australian bank account. Check this <a
   * href="https://stripe.com/docs/payments/au-becs-debit">page</a> for more details.
   */
  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  /**
   * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank
   * account, check this <a
   * href="https://stripe.com/docs/payments/payment-methods/bacs-debit">page</a> for more details.
   */
  @SerializedName("bacs_debit")
  BacsDebit bacsDebit;

  /**
   * Bancontact is the most popular online payment method in Belgium, with over 15 million cards in
   * circulation. <a href="https://stripe.com/docs/api/customers">Customers</a> use a Bancontact
   * card or mobile app linked to a Belgian bank account to make online payments that are secure,
   * guaranteed, and confirmed immediately. Check this <a
   * href="https://stripe.com/docs/payments/bancontact">page</a> for more details.
   */
  @SerializedName("bancontact")
  Bancontact bancontact;

  /**
   * BLIK is a <a href="https://stripe.com/docs/payments/payment-methods#usage">single use</a>
   * payment method that requires customers to authenticate their payments. When customers want to
   * pay online using BLIK, they request a six-digit code from their banking application and enter
   * it into the payment collection form. Check this <a
   * href="https://stripe.com/docs/payments/blik">page</a> for more details.
   */
  @SerializedName("blik")
  Blik blik;

  /**
   * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil. Check
   * this <a href="https://stripe.com/docs/payments/boleto">page</a> for more details.
   */
  @SerializedName("boleto")
  Boleto boleto;

  /**
   * Cards are a popular way for consumers and businesses to pay online or in person. Stripe
   * supports global and local card networks.
   */
  @SerializedName("card")
  Card card;

  /**
   * Cartes Bancaires is France's local card network. More than 95% of these cards are co-branded
   * with either Visa or Mastercard, meaning you can process these cards over either Cartes
   * Bancaires or the Visa or Mastercard networks. Check this <a
   * href="https://stripe.com/docs/payments/cartes-bancaires">page</a> for more details.
   */
  @SerializedName("cartes_bancaires")
  CartesBancaires cartesBancaires;

  /**
   * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and
   * receive money using their digital wallet. Check this <a
   * href="https://stripe.com/docs/payments/cash-app-pay">page</a> for more details.
   */
  @SerializedName("cashapp")
  Cashapp cashapp;

  /**
   * EPS is an Austria-based payment method that allows customers to complete transactions online
   * using their bank credentials. EPS is supported by all Austrian banks and is accepted by over
   * 80% of Austrian online retailers. Check this <a
   * href="https://stripe.com/docs/payments/eps">page</a> for more details.
   */
  @SerializedName("eps")
  Eps eps;

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
   * Financial Process Exchange (FPX) is a Malaysia-based payment method that allows customers to
   * complete transactions online using their bank credentials. Bank Negara Malaysia (BNM), the
   * Central Bank of Malaysia, and eleven other major Malaysian financial institutions are members
   * of the PayNet Group, which owns and operates FPX. It is one of the most popular online payment
   * methods in Malaysia, with nearly 90 million transactions in 2018 according to BNM. Check this
   * <a href="https://stripe.com/docs/payments/fpx">page</a> for more details.
   */
  @SerializedName("fpx")
  Fpx fpx;

  /**
   * giropay is a German payment method based on online banking, introduced in 2006. It allows
   * customers to complete transactions online using their online banking environment, with funds
   * debited from their bank account. Depending on their bank, customers confirm payments on giropay
   * using a second factor of authentication or a PIN. giropay accounts for 10% of online checkouts
   * in Germany. Check this <a href="https://stripe.com/docs/payments/giropay">page</a> for more
   * details.
   */
  @SerializedName("giropay")
  Giropay giropay;

  /**
   * Google Pay allows customers to make payments in your app or website using any credit or debit
   * card saved to their Google Account, including those from Google Play, YouTube, Chrome, or an
   * Android device. Use the Google Pay API to request any credit or debit card stored in your
   * customer's Google account. Check this <a href="https://stripe.com/docs/google-pay">page</a> for
   * more details.
   */
  @SerializedName("google_pay")
  GooglePay googlePay;

  /**
   * GrabPay is a payment method developed by <a
   * href="https://www.grab.com/sg/consumer/finance/pay/">Grab</a>. GrabPay is a digital wallet -
   * customers maintain a balance in their wallets that they pay out with. Check this <a
   * href="https://stripe.com/docs/payments/grabpay">page</a> for more details.
   */
  @SerializedName("grabpay")
  Grabpay grabpay;

  /**
   * iDEAL is a Netherlands-based payment method that allows customers to complete transactions
   * online using their bank credentials. All major Dutch banks are members of Currence, the scheme
   * that operates iDEAL, making it the most popular online payment method in the Netherlands with a
   * share of online transactions close to 55%. Check this <a
   * href="https://stripe.com/docs/payments/ideal">page</a> for more details.
   */
  @SerializedName("ideal")
  Ideal ideal;

  /**
   * JCB is a credit card company based in Japan. JCB is currently available in Japan to businesses
   * approved by JCB, and available to all businesses in the US, Canada, Australia, New Zealand, UK,
   * and Ireland. Check this <a
   * href="https://support.stripe.com/questions/accepting-japan-credit-bureau-%28jcb%29-payments">page</a>
   * for more details.
   */
  @SerializedName("jcb")
  Jcb jcb;

  /**
   * Klarna gives customers a range of <a
   * href="https://stripe.com/docs/payments/klarna#payment-options">payment options</a> during
   * checkout. Available payment options vary depending on the customer's billing address and the
   * transaction amount. These payment options make it convenient for customers to purchase items in
   * all price ranges. Check this <a href="https://stripe.com/docs/payments/klarna">page</a> for
   * more details.
   */
  @SerializedName("klarna")
  Klarna klarna;

  /**
   * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores
   * with cash. Check this <a href="https://stripe.com/docs/payments/konbini">page</a> for more
   * details.
   */
  @SerializedName("konbini")
  Konbini konbini;

  /**
   * <a href="https://stripe.com/docs/payments/link">Link</a> is a payment method network. With
   * Link, users save their payment details once, then reuse that information to pay with one click
   * for any business on the network.
   */
  @SerializedName("link")
  Link link;

  /** Configuration name. */
  @SerializedName("name")
  String name;

  /**
   * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin America
   * and represents nearly 20% of online transactions in Mexico. OXXO allows customers to pay bills
   * and online purchases in-store with cash. Check this <a
   * href="https://stripe.com/docs/payments/oxxo">page</a> for more details.
   */
  @SerializedName("oxxo")
  Oxxo oxxo;

  /**
   * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete
   * transactions online using bank transfers and other methods. Bank transfers account for 30% of
   * online payments in Poland and Przelewy24 provides a way for customers to pay with over 165
   * banks. Check this <a href="https://stripe.com/docs/payments/p24">page</a> for more details.
   */
  @SerializedName("p24")
  P24 p24;

  /** Configuration's parent configuration. Specify to create a child configuration. */
  @SerializedName("parent")
  String parent;

  /**
   * PayNow is a Singapore-based payment method that allows customers to make a payment using their
   * preferred app from participating banks and participating non-bank financial institutions. Check
   * this <a href="https://stripe.com/docs/payments/paynow">page</a> for more details.
   */
  @SerializedName("paynow")
  Paynow paynow;

  /**
   * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to
   * pay using their PayPal account. Check this <a
   * href="https://stripe.com/docs/payments/paypal">page</a> for more details.
   */
  @SerializedName("paypal")
  Paypal paypal;

  /**
   * PromptPay is a Thailand-based payment method that allows customers to make a payment using
   * their preferred app from participating banks. Check this <a
   * href="https://stripe.com/docs/payments/promptpay">page</a> for more details.
   */
  @SerializedName("promptpay")
  Promptpay promptpay;

  /**
   * The <a href="https://en.wikipedia.org/wiki/Single_Euro_Payments_Area">Single Euro Payments Area
   * (SEPA)</a> is an initiative of the European Union to simplify payments within and across member
   * countries. SEPA established and enforced banking standards to allow for the direct debiting of
   * every EUR-denominated bank account within the SEPA region, check this <a
   * href="https://stripe.com/docs/payments/sepa-debit">page</a> for more details.
   */
  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  /**
   * Stripe users in Europe and the United States can use the <a
   * href="https://stripe.com/docs/payments/payment-intents">Payment Intents API</a>—a single
   * integration path for creating payments using any supported method—to accept <a
   * href="https://www.sofort.com/">Sofort</a> payments from customers. Check this <a
   * href="https://stripe.com/docs/payments/sofort">page</a> for more details.
   */
  @SerializedName("sofort")
  Sofort sofort;

  /**
   * Stripe users in the United States can accept ACH direct debit payments from customers with a US
   * bank account using the Automated Clearing House (ACH) payments system operated by Nacha. Check
   * this <a href="https://stripe.com/docs/payments/ach-debit">page</a> for more details.
   */
  @SerializedName("us_bank_account")
  UsBankAccount usBankAccount;

  /**
   * WeChat, owned by Tencent, is China's leading mobile app with over 1 billion monthly active
   * users. Chinese consumers can use WeChat Pay to pay for goods and services inside of businesses'
   * apps and websites. WeChat Pay users buy most frequently in gaming, e-commerce, travel, online
   * education, and food/nutrition. Check this <a
   * href="https://stripe.com/docs/payments/wechat-pay">page</a> for more details.
   */
  @SerializedName("wechat_pay")
  WechatPay wechatPay;

  private PaymentMethodConfigurationCreateParams(
      AcssDebit acssDebit,
      Affirm affirm,
      AfterpayClearpay afterpayClearpay,
      Alipay alipay,
      ApplePay applePay,
      ApplePayLater applePayLater,
      AuBecsDebit auBecsDebit,
      BacsDebit bacsDebit,
      Bancontact bancontact,
      Blik blik,
      Boleto boleto,
      Card card,
      CartesBancaires cartesBancaires,
      Cashapp cashapp,
      Eps eps,
      List<String> expand,
      Map<String, Object> extraParams,
      Fpx fpx,
      Giropay giropay,
      GooglePay googlePay,
      Grabpay grabpay,
      Ideal ideal,
      Jcb jcb,
      Klarna klarna,
      Konbini konbini,
      Link link,
      String name,
      Oxxo oxxo,
      P24 p24,
      String parent,
      Paynow paynow,
      Paypal paypal,
      Promptpay promptpay,
      SepaDebit sepaDebit,
      Sofort sofort,
      UsBankAccount usBankAccount,
      WechatPay wechatPay) {
    this.acssDebit = acssDebit;
    this.affirm = affirm;
    this.afterpayClearpay = afterpayClearpay;
    this.alipay = alipay;
    this.applePay = applePay;
    this.applePayLater = applePayLater;
    this.auBecsDebit = auBecsDebit;
    this.bacsDebit = bacsDebit;
    this.bancontact = bancontact;
    this.blik = blik;
    this.boleto = boleto;
    this.card = card;
    this.cartesBancaires = cartesBancaires;
    this.cashapp = cashapp;
    this.eps = eps;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fpx = fpx;
    this.giropay = giropay;
    this.googlePay = googlePay;
    this.grabpay = grabpay;
    this.ideal = ideal;
    this.jcb = jcb;
    this.klarna = klarna;
    this.konbini = konbini;
    this.link = link;
    this.name = name;
    this.oxxo = oxxo;
    this.p24 = p24;
    this.parent = parent;
    this.paynow = paynow;
    this.paypal = paypal;
    this.promptpay = promptpay;
    this.sepaDebit = sepaDebit;
    this.sofort = sofort;
    this.usBankAccount = usBankAccount;
    this.wechatPay = wechatPay;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AcssDebit acssDebit;

    private Affirm affirm;

    private AfterpayClearpay afterpayClearpay;

    private Alipay alipay;

    private ApplePay applePay;

    private ApplePayLater applePayLater;

    private AuBecsDebit auBecsDebit;

    private BacsDebit bacsDebit;

    private Bancontact bancontact;

    private Blik blik;

    private Boleto boleto;

    private Card card;

    private CartesBancaires cartesBancaires;

    private Cashapp cashapp;

    private Eps eps;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Fpx fpx;

    private Giropay giropay;

    private GooglePay googlePay;

    private Grabpay grabpay;

    private Ideal ideal;

    private Jcb jcb;

    private Klarna klarna;

    private Konbini konbini;

    private Link link;

    private String name;

    private Oxxo oxxo;

    private P24 p24;

    private String parent;

    private Paynow paynow;

    private Paypal paypal;

    private Promptpay promptpay;

    private SepaDebit sepaDebit;

    private Sofort sofort;

    private UsBankAccount usBankAccount;

    private WechatPay wechatPay;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodConfigurationCreateParams build() {
      return new PaymentMethodConfigurationCreateParams(
          this.acssDebit,
          this.affirm,
          this.afterpayClearpay,
          this.alipay,
          this.applePay,
          this.applePayLater,
          this.auBecsDebit,
          this.bacsDebit,
          this.bancontact,
          this.blik,
          this.boleto,
          this.card,
          this.cartesBancaires,
          this.cashapp,
          this.eps,
          this.expand,
          this.extraParams,
          this.fpx,
          this.giropay,
          this.googlePay,
          this.grabpay,
          this.ideal,
          this.jcb,
          this.klarna,
          this.konbini,
          this.link,
          this.name,
          this.oxxo,
          this.p24,
          this.parent,
          this.paynow,
          this.paypal,
          this.promptpay,
          this.sepaDebit,
          this.sofort,
          this.usBankAccount,
          this.wechatPay);
    }

    /**
     * Canadian pre-authorized debit payments, check this <a
     * href="https://stripe.com/docs/payments/acss-debit">page</a> for more details like country
     * availability.
     */
    public Builder setAcssDebit(PaymentMethodConfigurationCreateParams.AcssDebit acssDebit) {
      this.acssDebit = acssDebit;
      return this;
    }

    /**
     * <a href="https://www.affirm.com/">Affirm</a> gives your customers a way to split purchases
     * over a series of payments. Depending on the purchase, they can pay with four interest-free
     * payments (Split Pay) or pay over a longer term (Installments), which might include interest.
     * Check this <a href="https://stripe.com/docs/payments/affirm">page</a> for more details like
     * country availability.
     */
    public Builder setAffirm(PaymentMethodConfigurationCreateParams.Affirm affirm) {
      this.affirm = affirm;
      return this;
    }

    /**
     * Afterpay gives your customers a way to pay for purchases in installments, check this <a
     * href="https://stripe.com/docs/payments/afterpay-clearpay">page</a> for more details like
     * country availability. Afterpay is particularly popular among businesses selling fashion,
     * beauty, and sports products.
     */
    public Builder setAfterpayClearpay(
        PaymentMethodConfigurationCreateParams.AfterpayClearpay afterpayClearpay) {
      this.afterpayClearpay = afterpayClearpay;
      return this;
    }

    /**
     * Alipay is a digital wallet in China that has more than a billion active users worldwide.
     * Alipay users can pay on the web or on a mobile device using login credentials or their Alipay
     * app. Alipay has a low dispute rate and reduces fraud by authenticating payments using the
     * customer's login credentials. Check this <a
     * href="https://stripe.com/docs/payments/alipay">page</a> for more details.
     */
    public Builder setAlipay(PaymentMethodConfigurationCreateParams.Alipay alipay) {
      this.alipay = alipay;
      return this;
    }

    /**
     * Stripe users can accept <a href="https://stripe.com/payments/apple-pay">Apple Pay</a> in iOS
     * applications in iOS 9 and later, and on the web in Safari starting with iOS 10 or macOS
     * Sierra. There are no additional fees to process Apple Pay payments, and the <a
     * href="https://stripe.com/pricing">pricing</a> is the same as other card transactions. Check
     * this <a href="https://stripe.com/docs/apple-pay">page</a> for more details.
     */
    public Builder setApplePay(PaymentMethodConfigurationCreateParams.ApplePay applePay) {
      this.applePay = applePay;
      return this;
    }

    /**
     * Apple Pay Later, a payment method for customers to buy now and pay later, gives your
     * customers a way to split purchases into four installments across six weeks.
     */
    public Builder setApplePayLater(
        PaymentMethodConfigurationCreateParams.ApplePayLater applePayLater) {
      this.applePayLater = applePayLater;
      return this;
    }

    /**
     * Stripe users in Australia can accept Bulk Electronic Clearing System (BECS) direct debit
     * payments from customers with an Australian bank account. Check this <a
     * href="https://stripe.com/docs/payments/au-becs-debit">page</a> for more details.
     */
    public Builder setAuBecsDebit(PaymentMethodConfigurationCreateParams.AuBecsDebit auBecsDebit) {
      this.auBecsDebit = auBecsDebit;
      return this;
    }

    /**
     * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank
     * account, check this <a
     * href="https://stripe.com/docs/payments/payment-methods/bacs-debit">page</a> for more details.
     */
    public Builder setBacsDebit(PaymentMethodConfigurationCreateParams.BacsDebit bacsDebit) {
      this.bacsDebit = bacsDebit;
      return this;
    }

    /**
     * Bancontact is the most popular online payment method in Belgium, with over 15 million cards
     * in circulation. <a href="https://stripe.com/docs/api/customers">Customers</a> use a
     * Bancontact card or mobile app linked to a Belgian bank account to make online payments that
     * are secure, guaranteed, and confirmed immediately. Check this <a
     * href="https://stripe.com/docs/payments/bancontact">page</a> for more details.
     */
    public Builder setBancontact(PaymentMethodConfigurationCreateParams.Bancontact bancontact) {
      this.bancontact = bancontact;
      return this;
    }

    /**
     * BLIK is a <a href="https://stripe.com/docs/payments/payment-methods#usage">single use</a>
     * payment method that requires customers to authenticate their payments. When customers want to
     * pay online using BLIK, they request a six-digit code from their banking application and enter
     * it into the payment collection form. Check this <a
     * href="https://stripe.com/docs/payments/blik">page</a> for more details.
     */
    public Builder setBlik(PaymentMethodConfigurationCreateParams.Blik blik) {
      this.blik = blik;
      return this;
    }

    /**
     * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil.
     * Check this <a href="https://stripe.com/docs/payments/boleto">page</a> for more details.
     */
    public Builder setBoleto(PaymentMethodConfigurationCreateParams.Boleto boleto) {
      this.boleto = boleto;
      return this;
    }

    /**
     * Cards are a popular way for consumers and businesses to pay online or in person. Stripe
     * supports global and local card networks.
     */
    public Builder setCard(PaymentMethodConfigurationCreateParams.Card card) {
      this.card = card;
      return this;
    }

    /**
     * Cartes Bancaires is France's local card network. More than 95% of these cards are co-branded
     * with either Visa or Mastercard, meaning you can process these cards over either Cartes
     * Bancaires or the Visa or Mastercard networks. Check this <a
     * href="https://stripe.com/docs/payments/cartes-bancaires">page</a> for more details.
     */
    public Builder setCartesBancaires(
        PaymentMethodConfigurationCreateParams.CartesBancaires cartesBancaires) {
      this.cartesBancaires = cartesBancaires;
      return this;
    }

    /**
     * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and
     * receive money using their digital wallet. Check this <a
     * href="https://stripe.com/docs/payments/cash-app-pay">page</a> for more details.
     */
    public Builder setCashapp(PaymentMethodConfigurationCreateParams.Cashapp cashapp) {
      this.cashapp = cashapp;
      return this;
    }

    /**
     * EPS is an Austria-based payment method that allows customers to complete transactions online
     * using their bank credentials. EPS is supported by all Austrian banks and is accepted by over
     * 80% of Austrian online retailers. Check this <a
     * href="https://stripe.com/docs/payments/eps">page</a> for more details.
     */
    public Builder setEps(PaymentMethodConfigurationCreateParams.Eps eps) {
      this.eps = eps;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodConfigurationCreateParams#expand} for the field documentation.
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
     * PaymentMethodConfigurationCreateParams#expand} for the field documentation.
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
     * PaymentMethodConfigurationCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link PaymentMethodConfigurationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Financial Process Exchange (FPX) is a Malaysia-based payment method that allows customers to
     * complete transactions online using their bank credentials. Bank Negara Malaysia (BNM), the
     * Central Bank of Malaysia, and eleven other major Malaysian financial institutions are members
     * of the PayNet Group, which owns and operates FPX. It is one of the most popular online
     * payment methods in Malaysia, with nearly 90 million transactions in 2018 according to BNM.
     * Check this <a href="https://stripe.com/docs/payments/fpx">page</a> for more details.
     */
    public Builder setFpx(PaymentMethodConfigurationCreateParams.Fpx fpx) {
      this.fpx = fpx;
      return this;
    }

    /**
     * giropay is a German payment method based on online banking, introduced in 2006. It allows
     * customers to complete transactions online using their online banking environment, with funds
     * debited from their bank account. Depending on their bank, customers confirm payments on
     * giropay using a second factor of authentication or a PIN. giropay accounts for 10% of online
     * checkouts in Germany. Check this <a href="https://stripe.com/docs/payments/giropay">page</a>
     * for more details.
     */
    public Builder setGiropay(PaymentMethodConfigurationCreateParams.Giropay giropay) {
      this.giropay = giropay;
      return this;
    }

    /**
     * Google Pay allows customers to make payments in your app or website using any credit or debit
     * card saved to their Google Account, including those from Google Play, YouTube, Chrome, or an
     * Android device. Use the Google Pay API to request any credit or debit card stored in your
     * customer's Google account. Check this <a href="https://stripe.com/docs/google-pay">page</a>
     * for more details.
     */
    public Builder setGooglePay(PaymentMethodConfigurationCreateParams.GooglePay googlePay) {
      this.googlePay = googlePay;
      return this;
    }

    /**
     * GrabPay is a payment method developed by <a
     * href="https://www.grab.com/sg/consumer/finance/pay/">Grab</a>. GrabPay is a digital wallet -
     * customers maintain a balance in their wallets that they pay out with. Check this <a
     * href="https://stripe.com/docs/payments/grabpay">page</a> for more details.
     */
    public Builder setGrabpay(PaymentMethodConfigurationCreateParams.Grabpay grabpay) {
      this.grabpay = grabpay;
      return this;
    }

    /**
     * iDEAL is a Netherlands-based payment method that allows customers to complete transactions
     * online using their bank credentials. All major Dutch banks are members of Currence, the
     * scheme that operates iDEAL, making it the most popular online payment method in the
     * Netherlands with a share of online transactions close to 55%. Check this <a
     * href="https://stripe.com/docs/payments/ideal">page</a> for more details.
     */
    public Builder setIdeal(PaymentMethodConfigurationCreateParams.Ideal ideal) {
      this.ideal = ideal;
      return this;
    }

    /**
     * JCB is a credit card company based in Japan. JCB is currently available in Japan to
     * businesses approved by JCB, and available to all businesses in the US, Canada, Australia, New
     * Zealand, UK, and Ireland. Check this <a
     * href="https://support.stripe.com/questions/accepting-japan-credit-bureau-%28jcb%29-payments">page</a>
     * for more details.
     */
    public Builder setJcb(PaymentMethodConfigurationCreateParams.Jcb jcb) {
      this.jcb = jcb;
      return this;
    }

    /**
     * Klarna gives customers a range of <a
     * href="https://stripe.com/docs/payments/klarna#payment-options">payment options</a> during
     * checkout. Available payment options vary depending on the customer's billing address and the
     * transaction amount. These payment options make it convenient for customers to purchase items
     * in all price ranges. Check this <a href="https://stripe.com/docs/payments/klarna">page</a>
     * for more details.
     */
    public Builder setKlarna(PaymentMethodConfigurationCreateParams.Klarna klarna) {
      this.klarna = klarna;
      return this;
    }

    /**
     * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores
     * with cash. Check this <a href="https://stripe.com/docs/payments/konbini">page</a> for more
     * details.
     */
    public Builder setKonbini(PaymentMethodConfigurationCreateParams.Konbini konbini) {
      this.konbini = konbini;
      return this;
    }

    /**
     * <a href="https://stripe.com/docs/payments/link">Link</a> is a payment method network. With
     * Link, users save their payment details once, then reuse that information to pay with one
     * click for any business on the network.
     */
    public Builder setLink(PaymentMethodConfigurationCreateParams.Link link) {
      this.link = link;
      return this;
    }

    /** Configuration name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin
     * America and represents nearly 20% of online transactions in Mexico. OXXO allows customers to
     * pay bills and online purchases in-store with cash. Check this <a
     * href="https://stripe.com/docs/payments/oxxo">page</a> for more details.
     */
    public Builder setOxxo(PaymentMethodConfigurationCreateParams.Oxxo oxxo) {
      this.oxxo = oxxo;
      return this;
    }

    /**
     * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete
     * transactions online using bank transfers and other methods. Bank transfers account for 30% of
     * online payments in Poland and Przelewy24 provides a way for customers to pay with over 165
     * banks. Check this <a href="https://stripe.com/docs/payments/p24">page</a> for more details.
     */
    public Builder setP24(PaymentMethodConfigurationCreateParams.P24 p24) {
      this.p24 = p24;
      return this;
    }

    /** Configuration's parent configuration. Specify to create a child configuration. */
    public Builder setParent(String parent) {
      this.parent = parent;
      return this;
    }

    /**
     * PayNow is a Singapore-based payment method that allows customers to make a payment using
     * their preferred app from participating banks and participating non-bank financial
     * institutions. Check this <a href="https://stripe.com/docs/payments/paynow">page</a> for more
     * details.
     */
    public Builder setPaynow(PaymentMethodConfigurationCreateParams.Paynow paynow) {
      this.paynow = paynow;
      return this;
    }

    /**
     * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to
     * pay using their PayPal account. Check this <a
     * href="https://stripe.com/docs/payments/paypal">page</a> for more details.
     */
    public Builder setPaypal(PaymentMethodConfigurationCreateParams.Paypal paypal) {
      this.paypal = paypal;
      return this;
    }

    /**
     * PromptPay is a Thailand-based payment method that allows customers to make a payment using
     * their preferred app from participating banks. Check this <a
     * href="https://stripe.com/docs/payments/promptpay">page</a> for more details.
     */
    public Builder setPromptpay(PaymentMethodConfigurationCreateParams.Promptpay promptpay) {
      this.promptpay = promptpay;
      return this;
    }

    /**
     * The <a href="https://en.wikipedia.org/wiki/Single_Euro_Payments_Area">Single Euro Payments
     * Area (SEPA)</a> is an initiative of the European Union to simplify payments within and across
     * member countries. SEPA established and enforced banking standards to allow for the direct
     * debiting of every EUR-denominated bank account within the SEPA region, check this <a
     * href="https://stripe.com/docs/payments/sepa-debit">page</a> for more details.
     */
    public Builder setSepaDebit(PaymentMethodConfigurationCreateParams.SepaDebit sepaDebit) {
      this.sepaDebit = sepaDebit;
      return this;
    }

    /**
     * Stripe users in Europe and the United States can use the <a
     * href="https://stripe.com/docs/payments/payment-intents">Payment Intents API</a>—a single
     * integration path for creating payments using any supported method—to accept <a
     * href="https://www.sofort.com/">Sofort</a> payments from customers. Check this <a
     * href="https://stripe.com/docs/payments/sofort">page</a> for more details.
     */
    public Builder setSofort(PaymentMethodConfigurationCreateParams.Sofort sofort) {
      this.sofort = sofort;
      return this;
    }

    /**
     * Stripe users in the United States can accept ACH direct debit payments from customers with a
     * US bank account using the Automated Clearing House (ACH) payments system operated by Nacha.
     * Check this <a href="https://stripe.com/docs/payments/ach-debit">page</a> for more details.
     */
    public Builder setUsBankAccount(
        PaymentMethodConfigurationCreateParams.UsBankAccount usBankAccount) {
      this.usBankAccount = usBankAccount;
      return this;
    }

    /**
     * WeChat, owned by Tencent, is China's leading mobile app with over 1 billion monthly active
     * users. Chinese consumers can use WeChat Pay to pay for goods and services inside of
     * businesses' apps and websites. WeChat Pay users buy most frequently in gaming, e-commerce,
     * travel, online education, and food/nutrition. Check this <a
     * href="https://stripe.com/docs/payments/wechat-pay">page</a> for more details.
     */
    public Builder setWechatPay(PaymentMethodConfigurationCreateParams.WechatPay wechatPay) {
      this.wechatPay = wechatPay;
      return this;
    }
  }

  @Getter
  public static class AcssDebit {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AcssDebit(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.AcssDebit build() {
        return new PaymentMethodConfigurationCreateParams.AcssDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.AcssDebit#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.AcssDebit#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Affirm {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Affirm(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Affirm build() {
        return new PaymentMethodConfigurationCreateParams.Affirm(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Affirm#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Affirm#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class AfterpayClearpay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AfterpayClearpay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.AfterpayClearpay build() {
        return new PaymentMethodConfigurationCreateParams.AfterpayClearpay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.AfterpayClearpay.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.AfterpayClearpay#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.AfterpayClearpay#extraParams} for the
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.AfterpayClearpay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.AfterpayClearpay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.AfterpayClearpay.DisplayPreference#extraParams}
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
         * PaymentMethodConfigurationCreateParams.AfterpayClearpay.DisplayPreference#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.AfterpayClearpay.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Alipay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Alipay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Alipay build() {
        return new PaymentMethodConfigurationCreateParams.Alipay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Alipay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Alipay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Alipay#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Alipay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Alipay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Alipay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Alipay.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Alipay.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class ApplePay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ApplePay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.ApplePay build() {
        return new PaymentMethodConfigurationCreateParams.ApplePay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.ApplePay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.ApplePay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.ApplePay#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.ApplePay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.ApplePay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.ApplePay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.ApplePay.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.ApplePay.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class ApplePayLater {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ApplePayLater(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.ApplePayLater build() {
        return new PaymentMethodConfigurationCreateParams.ApplePayLater(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.ApplePayLater.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.ApplePayLater#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.ApplePayLater#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.ApplePayLater.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.ApplePayLater.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.ApplePayLater.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationCreateParams.ApplePayLater.DisplayPreference#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.ApplePayLater.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class AuBecsDebit {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AuBecsDebit(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.AuBecsDebit build() {
        return new PaymentMethodConfigurationCreateParams.AuBecsDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.AuBecsDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.AuBecsDebit#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.AuBecsDebit#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.AuBecsDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.AuBecsDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.AuBecsDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.AuBecsDebit.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.AuBecsDebit.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class BacsDebit {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private BacsDebit(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.BacsDebit build() {
        return new PaymentMethodConfigurationCreateParams.BacsDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.BacsDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.BacsDebit#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.BacsDebit#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.BacsDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.BacsDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.BacsDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.BacsDebit.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.BacsDebit.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Bancontact {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Bancontact(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Bancontact build() {
        return new PaymentMethodConfigurationCreateParams.Bancontact(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Bancontact.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Bancontact#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Bancontact#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Bancontact.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Bancontact.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Bancontact.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Bancontact.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Bancontact.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Blik {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Blik(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Blik build() {
        return new PaymentMethodConfigurationCreateParams.Blik(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Blik.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Blik#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Blik#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Blik.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Blik.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Blik.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Blik.DisplayPreference#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Blik.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Boleto {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Boleto(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Boleto build() {
        return new PaymentMethodConfigurationCreateParams.Boleto(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Boleto.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Boleto#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Boleto#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Boleto.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Boleto.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Boleto.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Boleto.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Boleto.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Card {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Card(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Card build() {
        return new PaymentMethodConfigurationCreateParams.Card(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Card.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Card#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Card#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Card.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Card.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Card.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Card.DisplayPreference#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Card.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class CartesBancaires {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private CartesBancaires(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.CartesBancaires build() {
        return new PaymentMethodConfigurationCreateParams.CartesBancaires(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.CartesBancaires.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.CartesBancaires#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.CartesBancaires#extraParams} for the
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.CartesBancaires.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.CartesBancaires.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.CartesBancaires.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationCreateParams.CartesBancaires.DisplayPreference#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.CartesBancaires.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Cashapp {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Cashapp(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Cashapp build() {
        return new PaymentMethodConfigurationCreateParams.Cashapp(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Cashapp.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Cashapp#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Cashapp#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Cashapp.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Cashapp.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Cashapp.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Cashapp.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Cashapp.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Eps {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Eps(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Eps build() {
        return new PaymentMethodConfigurationCreateParams.Eps(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Eps.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Eps#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Eps#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Eps.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Eps.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationCreateParams.Eps.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationCreateParams.Eps.DisplayPreference#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Eps.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Fpx {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Fpx(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Fpx build() {
        return new PaymentMethodConfigurationCreateParams.Fpx(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Fpx.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Fpx#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Fpx#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Fpx.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Fpx.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationCreateParams.Fpx.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationCreateParams.Fpx.DisplayPreference#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Fpx.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Giropay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Giropay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Giropay build() {
        return new PaymentMethodConfigurationCreateParams.Giropay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Giropay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Giropay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Giropay#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Giropay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Giropay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Giropay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Giropay.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Giropay.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class GooglePay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private GooglePay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.GooglePay build() {
        return new PaymentMethodConfigurationCreateParams.GooglePay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.GooglePay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.GooglePay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.GooglePay#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.GooglePay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.GooglePay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.GooglePay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.GooglePay.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.GooglePay.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Grabpay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Grabpay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Grabpay build() {
        return new PaymentMethodConfigurationCreateParams.Grabpay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Grabpay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Grabpay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Grabpay#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Grabpay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Grabpay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Grabpay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Grabpay.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Grabpay.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Ideal {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Ideal(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Ideal build() {
        return new PaymentMethodConfigurationCreateParams.Ideal(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Ideal.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Ideal#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Ideal#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Ideal.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Ideal.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Ideal.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Ideal.DisplayPreference#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Ideal.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Jcb {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Jcb(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Jcb build() {
        return new PaymentMethodConfigurationCreateParams.Jcb(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Jcb.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Jcb#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Jcb#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Jcb.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Jcb.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationCreateParams.Jcb.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationCreateParams.Jcb.DisplayPreference#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Jcb.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Klarna {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Klarna(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Klarna build() {
        return new PaymentMethodConfigurationCreateParams.Klarna(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Klarna.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Klarna#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Klarna#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Klarna.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Klarna.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Klarna.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Klarna.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Klarna.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Konbini {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Konbini(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Konbini build() {
        return new PaymentMethodConfigurationCreateParams.Konbini(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Konbini.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Konbini#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Konbini#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Konbini.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Konbini.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Konbini.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Konbini.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Konbini.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Link {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Link(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Link build() {
        return new PaymentMethodConfigurationCreateParams.Link(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Link.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Link#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Link#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Link.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Link.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Link.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Link.DisplayPreference#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Link.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Oxxo {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Oxxo(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Oxxo build() {
        return new PaymentMethodConfigurationCreateParams.Oxxo(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Oxxo.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Oxxo#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Oxxo#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Oxxo.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Oxxo.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Oxxo.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Oxxo.DisplayPreference#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Oxxo.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class P24 {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private P24(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.P24 build() {
        return new PaymentMethodConfigurationCreateParams.P24(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.P24.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.P24#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.P24#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.P24.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.P24.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationCreateParams.P24.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationCreateParams.P24.DisplayPreference#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.P24.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Paynow {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Paynow(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Paynow build() {
        return new PaymentMethodConfigurationCreateParams.Paynow(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Paynow.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Paynow#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Paynow#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Paynow.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Paynow.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Paynow.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Paynow.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Paynow.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Paypal {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Paypal(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Paypal build() {
        return new PaymentMethodConfigurationCreateParams.Paypal(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Paypal.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Paypal#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Paypal#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Paypal.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Paypal.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Paypal.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Paypal.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Paypal.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Promptpay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Promptpay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Promptpay build() {
        return new PaymentMethodConfigurationCreateParams.Promptpay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Promptpay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Promptpay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Promptpay#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Promptpay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Promptpay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Promptpay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Promptpay.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Promptpay.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class SepaDebit {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private SepaDebit(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.SepaDebit build() {
        return new PaymentMethodConfigurationCreateParams.SepaDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.SepaDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.SepaDebit#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.SepaDebit#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.SepaDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.SepaDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.SepaDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.SepaDebit.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.SepaDebit.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class Sofort {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Sofort(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.Sofort build() {
        return new PaymentMethodConfigurationCreateParams.Sofort(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Sofort.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Sofort#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Sofort#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.Sofort.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Sofort.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Sofort.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Sofort.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.Sofort.DisplayPreference.Preference preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class UsBankAccount {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private UsBankAccount(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.UsBankAccount build() {
        return new PaymentMethodConfigurationCreateParams.UsBankAccount(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.UsBankAccount.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.UsBankAccount#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.UsBankAccount#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.UsBankAccount.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.UsBankAccount.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.UsBankAccount.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationCreateParams.UsBankAccount.DisplayPreference#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.UsBankAccount.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class WechatPay {
    /** Whether or not the payment method should be displayed. */
    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private WechatPay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
      this.displayPreference = displayPreference;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private DisplayPreference displayPreference;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodConfigurationCreateParams.WechatPay build() {
        return new PaymentMethodConfigurationCreateParams.WechatPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.WechatPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.WechatPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.WechatPay#extraParams} for the field
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
    public static class DisplayPreference {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The account's preference for whether or not to display this payment method. */
      @SerializedName("preference")
      Preference preference;

      private DisplayPreference(Map<String, Object> extraParams, Preference preference) {
        this.extraParams = extraParams;
        this.preference = preference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Preference preference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodConfigurationCreateParams.WechatPay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.WechatPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.WechatPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.WechatPay.DisplayPreference#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The account's preference for whether or not to display this payment method. */
        public Builder setPreference(
            PaymentMethodConfigurationCreateParams.WechatPay.DisplayPreference.Preference
                preference) {
          this.preference = preference;
          return this;
        }
      }

      public enum Preference implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("off")
        OFF("off"),

        @SerializedName("on")
        ON("on");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Preference(String value) {
          this.value = value;
        }
      }
    }
  }
}
