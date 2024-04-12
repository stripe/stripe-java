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
public class PaymentMethodConfigurationUpdateParams extends ApiRequestParams {
  /**
   * Canadian pre-authorized debit payments, check this <a
   * href="https://stripe.com/docs/payments/acss-debit">page</a> for more details like country
   * availability.
   */
  @SerializedName("acss_debit")
  AcssDebit acssDebit;

  /** Whether the configuration can be used for new payments. */
  @SerializedName("active")
  Boolean active;

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
   * Amazon Pay is a wallet payment method that lets your customers check out the same way as on
   * Amazon.
   */
  @SerializedName("amazon_pay")
  AmazonPay amazonPay;

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
   * Uses a customer’s <a href="https://stripe.com/docs/payments/customer-balance">cash balance</a>
   * for the payment. The cash balance can be funded via a bank transfer. Check this <a
   * href="https://stripe.com/docs/payments/bank-transfers">page</a> for more details.
   */
  @SerializedName("customer_balance")
  CustomerBalance customerBalance;

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
   * approved by JCB, and available to all businesses in Australia, Canada, Hong Kong, Japan, New
   * Zealand, Singapore, Switzerland, United Kingdom, United States, and all countries in the
   * European Economic Area except Iceland. Check this <a
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

  /**
   * Stripe users in Europe and the United States can accept Multibanco payments from customers in
   * Portugal using <a href="https://stripe.com/docs/sources">Sources</a>—a single integration path
   * for creating payments using any supported method.
   */
  @SerializedName("multibanco")
  Multibanco multibanco;

  /** Configuration name. */
  @SerializedName("name")
  Object name;

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
   * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method.
   * Revolut Pay uses the customer’s stored balance or cards to fund the payment, and offers the
   * option for non-Revolut customers to save their details after their first purchase.
   */
  @SerializedName("revolut_pay")
  RevolutPay revolutPay;

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

  /**
   * Zip gives your customers a way to split purchases over a series of payments. Check this <a
   * href="https://stripe.com/docs/payments/zip">page</a> for more details like country
   * availability.
   */
  @SerializedName("zip")
  Zip zip;

  private PaymentMethodConfigurationUpdateParams(
      AcssDebit acssDebit,
      Boolean active,
      Affirm affirm,
      AfterpayClearpay afterpayClearpay,
      Alipay alipay,
      AmazonPay amazonPay,
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
      CustomerBalance customerBalance,
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
      Multibanco multibanco,
      Object name,
      Oxxo oxxo,
      P24 p24,
      Paynow paynow,
      Paypal paypal,
      Promptpay promptpay,
      RevolutPay revolutPay,
      SepaDebit sepaDebit,
      Sofort sofort,
      UsBankAccount usBankAccount,
      WechatPay wechatPay,
      Zip zip) {
    this.acssDebit = acssDebit;
    this.active = active;
    this.affirm = affirm;
    this.afterpayClearpay = afterpayClearpay;
    this.alipay = alipay;
    this.amazonPay = amazonPay;
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
    this.customerBalance = customerBalance;
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
    this.multibanco = multibanco;
    this.name = name;
    this.oxxo = oxxo;
    this.p24 = p24;
    this.paynow = paynow;
    this.paypal = paypal;
    this.promptpay = promptpay;
    this.revolutPay = revolutPay;
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
    private AcssDebit acssDebit;

    private Boolean active;

    private Affirm affirm;

    private AfterpayClearpay afterpayClearpay;

    private Alipay alipay;

    private AmazonPay amazonPay;

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

    private CustomerBalance customerBalance;

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

    private Multibanco multibanco;

    private Object name;

    private Oxxo oxxo;

    private P24 p24;

    private Paynow paynow;

    private Paypal paypal;

    private Promptpay promptpay;

    private RevolutPay revolutPay;

    private SepaDebit sepaDebit;

    private Sofort sofort;

    private UsBankAccount usBankAccount;

    private WechatPay wechatPay;

    private Zip zip;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodConfigurationUpdateParams build() {
      return new PaymentMethodConfigurationUpdateParams(
          this.acssDebit,
          this.active,
          this.affirm,
          this.afterpayClearpay,
          this.alipay,
          this.amazonPay,
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
          this.customerBalance,
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
          this.multibanco,
          this.name,
          this.oxxo,
          this.p24,
          this.paynow,
          this.paypal,
          this.promptpay,
          this.revolutPay,
          this.sepaDebit,
          this.sofort,
          this.usBankAccount,
          this.wechatPay,
          this.zip);
    }

    /**
     * Canadian pre-authorized debit payments, check this <a
     * href="https://stripe.com/docs/payments/acss-debit">page</a> for more details like country
     * availability.
     */
    public Builder setAcssDebit(PaymentMethodConfigurationUpdateParams.AcssDebit acssDebit) {
      this.acssDebit = acssDebit;
      return this;
    }

    /** Whether the configuration can be used for new payments. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * <a href="https://www.affirm.com/">Affirm</a> gives your customers a way to split purchases
     * over a series of payments. Depending on the purchase, they can pay with four interest-free
     * payments (Split Pay) or pay over a longer term (Installments), which might include interest.
     * Check this <a href="https://stripe.com/docs/payments/affirm">page</a> for more details like
     * country availability.
     */
    public Builder setAffirm(PaymentMethodConfigurationUpdateParams.Affirm affirm) {
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
        PaymentMethodConfigurationUpdateParams.AfterpayClearpay afterpayClearpay) {
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
    public Builder setAlipay(PaymentMethodConfigurationUpdateParams.Alipay alipay) {
      this.alipay = alipay;
      return this;
    }

    /**
     * Amazon Pay is a wallet payment method that lets your customers check out the same way as on
     * Amazon.
     */
    public Builder setAmazonPay(PaymentMethodConfigurationUpdateParams.AmazonPay amazonPay) {
      this.amazonPay = amazonPay;
      return this;
    }

    /**
     * Stripe users can accept <a href="https://stripe.com/payments/apple-pay">Apple Pay</a> in iOS
     * applications in iOS 9 and later, and on the web in Safari starting with iOS 10 or macOS
     * Sierra. There are no additional fees to process Apple Pay payments, and the <a
     * href="https://stripe.com/pricing">pricing</a> is the same as other card transactions. Check
     * this <a href="https://stripe.com/docs/apple-pay">page</a> for more details.
     */
    public Builder setApplePay(PaymentMethodConfigurationUpdateParams.ApplePay applePay) {
      this.applePay = applePay;
      return this;
    }

    /**
     * Apple Pay Later, a payment method for customers to buy now and pay later, gives your
     * customers a way to split purchases into four installments across six weeks.
     */
    public Builder setApplePayLater(
        PaymentMethodConfigurationUpdateParams.ApplePayLater applePayLater) {
      this.applePayLater = applePayLater;
      return this;
    }

    /**
     * Stripe users in Australia can accept Bulk Electronic Clearing System (BECS) direct debit
     * payments from customers with an Australian bank account. Check this <a
     * href="https://stripe.com/docs/payments/au-becs-debit">page</a> for more details.
     */
    public Builder setAuBecsDebit(PaymentMethodConfigurationUpdateParams.AuBecsDebit auBecsDebit) {
      this.auBecsDebit = auBecsDebit;
      return this;
    }

    /**
     * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank
     * account, check this <a
     * href="https://stripe.com/docs/payments/payment-methods/bacs-debit">page</a> for more details.
     */
    public Builder setBacsDebit(PaymentMethodConfigurationUpdateParams.BacsDebit bacsDebit) {
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
    public Builder setBancontact(PaymentMethodConfigurationUpdateParams.Bancontact bancontact) {
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
    public Builder setBlik(PaymentMethodConfigurationUpdateParams.Blik blik) {
      this.blik = blik;
      return this;
    }

    /**
     * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil.
     * Check this <a href="https://stripe.com/docs/payments/boleto">page</a> for more details.
     */
    public Builder setBoleto(PaymentMethodConfigurationUpdateParams.Boleto boleto) {
      this.boleto = boleto;
      return this;
    }

    /**
     * Cards are a popular way for consumers and businesses to pay online or in person. Stripe
     * supports global and local card networks.
     */
    public Builder setCard(PaymentMethodConfigurationUpdateParams.Card card) {
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
        PaymentMethodConfigurationUpdateParams.CartesBancaires cartesBancaires) {
      this.cartesBancaires = cartesBancaires;
      return this;
    }

    /**
     * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and
     * receive money using their digital wallet. Check this <a
     * href="https://stripe.com/docs/payments/cash-app-pay">page</a> for more details.
     */
    public Builder setCashapp(PaymentMethodConfigurationUpdateParams.Cashapp cashapp) {
      this.cashapp = cashapp;
      return this;
    }

    /**
     * Uses a customer’s <a href="https://stripe.com/docs/payments/customer-balance">cash
     * balance</a> for the payment. The cash balance can be funded via a bank transfer. Check this
     * <a href="https://stripe.com/docs/payments/bank-transfers">page</a> for more details.
     */
    public Builder setCustomerBalance(
        PaymentMethodConfigurationUpdateParams.CustomerBalance customerBalance) {
      this.customerBalance = customerBalance;
      return this;
    }

    /**
     * EPS is an Austria-based payment method that allows customers to complete transactions online
     * using their bank credentials. EPS is supported by all Austrian banks and is accepted by over
     * 80% of Austrian online retailers. Check this <a
     * href="https://stripe.com/docs/payments/eps">page</a> for more details.
     */
    public Builder setEps(PaymentMethodConfigurationUpdateParams.Eps eps) {
      this.eps = eps;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodConfigurationUpdateParams#expand} for the field documentation.
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
     * PaymentMethodConfigurationUpdateParams#expand} for the field documentation.
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
     * PaymentMethodConfigurationUpdateParams#extraParams} for the field documentation.
     */
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
     * See {@link PaymentMethodConfigurationUpdateParams#extraParams} for the field documentation.
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
    public Builder setFpx(PaymentMethodConfigurationUpdateParams.Fpx fpx) {
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
    public Builder setGiropay(PaymentMethodConfigurationUpdateParams.Giropay giropay) {
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
    public Builder setGooglePay(PaymentMethodConfigurationUpdateParams.GooglePay googlePay) {
      this.googlePay = googlePay;
      return this;
    }

    /**
     * GrabPay is a payment method developed by <a
     * href="https://www.grab.com/sg/consumer/finance/pay/">Grab</a>. GrabPay is a digital wallet -
     * customers maintain a balance in their wallets that they pay out with. Check this <a
     * href="https://stripe.com/docs/payments/grabpay">page</a> for more details.
     */
    public Builder setGrabpay(PaymentMethodConfigurationUpdateParams.Grabpay grabpay) {
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
    public Builder setIdeal(PaymentMethodConfigurationUpdateParams.Ideal ideal) {
      this.ideal = ideal;
      return this;
    }

    /**
     * JCB is a credit card company based in Japan. JCB is currently available in Japan to
     * businesses approved by JCB, and available to all businesses in Australia, Canada, Hong Kong,
     * Japan, New Zealand, Singapore, Switzerland, United Kingdom, United States, and all countries
     * in the European Economic Area except Iceland. Check this <a
     * href="https://support.stripe.com/questions/accepting-japan-credit-bureau-%28jcb%29-payments">page</a>
     * for more details.
     */
    public Builder setJcb(PaymentMethodConfigurationUpdateParams.Jcb jcb) {
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
    public Builder setKlarna(PaymentMethodConfigurationUpdateParams.Klarna klarna) {
      this.klarna = klarna;
      return this;
    }

    /**
     * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores
     * with cash. Check this <a href="https://stripe.com/docs/payments/konbini">page</a> for more
     * details.
     */
    public Builder setKonbini(PaymentMethodConfigurationUpdateParams.Konbini konbini) {
      this.konbini = konbini;
      return this;
    }

    /**
     * <a href="https://stripe.com/docs/payments/link">Link</a> is a payment method network. With
     * Link, users save their payment details once, then reuse that information to pay with one
     * click for any business on the network.
     */
    public Builder setLink(PaymentMethodConfigurationUpdateParams.Link link) {
      this.link = link;
      return this;
    }

    /**
     * Stripe users in Europe and the United States can accept Multibanco payments from customers in
     * Portugal using <a href="https://stripe.com/docs/sources">Sources</a>—a single integration
     * path for creating payments using any supported method.
     */
    public Builder setMultibanco(PaymentMethodConfigurationUpdateParams.Multibanco multibanco) {
      this.multibanco = multibanco;
      return this;
    }

    /** Configuration name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Configuration name. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    /**
     * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin
     * America and represents nearly 20% of online transactions in Mexico. OXXO allows customers to
     * pay bills and online purchases in-store with cash. Check this <a
     * href="https://stripe.com/docs/payments/oxxo">page</a> for more details.
     */
    public Builder setOxxo(PaymentMethodConfigurationUpdateParams.Oxxo oxxo) {
      this.oxxo = oxxo;
      return this;
    }

    /**
     * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete
     * transactions online using bank transfers and other methods. Bank transfers account for 30% of
     * online payments in Poland and Przelewy24 provides a way for customers to pay with over 165
     * banks. Check this <a href="https://stripe.com/docs/payments/p24">page</a> for more details.
     */
    public Builder setP24(PaymentMethodConfigurationUpdateParams.P24 p24) {
      this.p24 = p24;
      return this;
    }

    /**
     * PayNow is a Singapore-based payment method that allows customers to make a payment using
     * their preferred app from participating banks and participating non-bank financial
     * institutions. Check this <a href="https://stripe.com/docs/payments/paynow">page</a> for more
     * details.
     */
    public Builder setPaynow(PaymentMethodConfigurationUpdateParams.Paynow paynow) {
      this.paynow = paynow;
      return this;
    }

    /**
     * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to
     * pay using their PayPal account. Check this <a
     * href="https://stripe.com/docs/payments/paypal">page</a> for more details.
     */
    public Builder setPaypal(PaymentMethodConfigurationUpdateParams.Paypal paypal) {
      this.paypal = paypal;
      return this;
    }

    /**
     * PromptPay is a Thailand-based payment method that allows customers to make a payment using
     * their preferred app from participating banks. Check this <a
     * href="https://stripe.com/docs/payments/promptpay">page</a> for more details.
     */
    public Builder setPromptpay(PaymentMethodConfigurationUpdateParams.Promptpay promptpay) {
      this.promptpay = promptpay;
      return this;
    }

    /**
     * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method.
     * Revolut Pay uses the customer’s stored balance or cards to fund the payment, and offers the
     * option for non-Revolut customers to save their details after their first purchase.
     */
    public Builder setRevolutPay(PaymentMethodConfigurationUpdateParams.RevolutPay revolutPay) {
      this.revolutPay = revolutPay;
      return this;
    }

    /**
     * The <a href="https://en.wikipedia.org/wiki/Single_Euro_Payments_Area">Single Euro Payments
     * Area (SEPA)</a> is an initiative of the European Union to simplify payments within and across
     * member countries. SEPA established and enforced banking standards to allow for the direct
     * debiting of every EUR-denominated bank account within the SEPA region, check this <a
     * href="https://stripe.com/docs/payments/sepa-debit">page</a> for more details.
     */
    public Builder setSepaDebit(PaymentMethodConfigurationUpdateParams.SepaDebit sepaDebit) {
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
    public Builder setSofort(PaymentMethodConfigurationUpdateParams.Sofort sofort) {
      this.sofort = sofort;
      return this;
    }

    /**
     * Stripe users in the United States can accept ACH direct debit payments from customers with a
     * US bank account using the Automated Clearing House (ACH) payments system operated by Nacha.
     * Check this <a href="https://stripe.com/docs/payments/ach-debit">page</a> for more details.
     */
    public Builder setUsBankAccount(
        PaymentMethodConfigurationUpdateParams.UsBankAccount usBankAccount) {
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
    public Builder setWechatPay(PaymentMethodConfigurationUpdateParams.WechatPay wechatPay) {
      this.wechatPay = wechatPay;
      return this;
    }

    /**
     * Zip gives your customers a way to split purchases over a series of payments. Check this <a
     * href="https://stripe.com/docs/payments/zip">page</a> for more details like country
     * availability.
     */
    public Builder setZip(PaymentMethodConfigurationUpdateParams.Zip zip) {
      this.zip = zip;
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
      public PaymentMethodConfigurationUpdateParams.AcssDebit build() {
        return new PaymentMethodConfigurationUpdateParams.AcssDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.AcssDebit#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.AcssDebit#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Affirm build() {
        return new PaymentMethodConfigurationUpdateParams.Affirm(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Affirm.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Affirm#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Affirm#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Affirm.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Affirm.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Affirm.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Affirm.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Affirm.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.AfterpayClearpay build() {
        return new PaymentMethodConfigurationUpdateParams.AfterpayClearpay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.AfterpayClearpay.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.AfterpayClearpay#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationUpdateParams.AfterpayClearpay#extraParams} for the
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
        public PaymentMethodConfigurationUpdateParams.AfterpayClearpay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.AfterpayClearpay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.AfterpayClearpay.DisplayPreference#extraParams}
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
         * PaymentMethodConfigurationUpdateParams.AfterpayClearpay.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationUpdateParams.AfterpayClearpay.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Alipay build() {
        return new PaymentMethodConfigurationUpdateParams.Alipay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Alipay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Alipay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Alipay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Alipay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Alipay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Alipay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Alipay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Alipay.DisplayPreference.Preference preference) {
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
  public static class AmazonPay {
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

    private AmazonPay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationUpdateParams.AmazonPay build() {
        return new PaymentMethodConfigurationUpdateParams.AmazonPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.AmazonPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.AmazonPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.AmazonPay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.AmazonPay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.AmazonPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.AmazonPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.AmazonPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.AmazonPay.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.ApplePay build() {
        return new PaymentMethodConfigurationUpdateParams.ApplePay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.ApplePay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.ApplePay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.ApplePay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.ApplePay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.ApplePay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.ApplePay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.ApplePay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.ApplePay.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.ApplePayLater build() {
        return new PaymentMethodConfigurationUpdateParams.ApplePayLater(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.ApplePayLater.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.ApplePayLater#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationUpdateParams.ApplePayLater#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.ApplePayLater.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.ApplePayLater.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.ApplePayLater.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationUpdateParams.ApplePayLater.DisplayPreference#extraParams} for
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
            PaymentMethodConfigurationUpdateParams.ApplePayLater.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.AuBecsDebit build() {
        return new PaymentMethodConfigurationUpdateParams.AuBecsDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.AuBecsDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.AuBecsDebit#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationUpdateParams.AuBecsDebit#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.AuBecsDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.AuBecsDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.AuBecsDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.AuBecsDebit.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.AuBecsDebit.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.BacsDebit build() {
        return new PaymentMethodConfigurationUpdateParams.BacsDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.BacsDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.BacsDebit#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.BacsDebit#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.BacsDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.BacsDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.BacsDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.BacsDebit.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.BacsDebit.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Bancontact build() {
        return new PaymentMethodConfigurationUpdateParams.Bancontact(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Bancontact.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Bancontact#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Bancontact#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Bancontact.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Bancontact.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Bancontact.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Bancontact.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Bancontact.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Blik build() {
        return new PaymentMethodConfigurationUpdateParams.Blik(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Blik.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Blik#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Blik#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Blik.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Blik.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Blik.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationUpdateParams.Blik.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationUpdateParams.Blik.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Boleto build() {
        return new PaymentMethodConfigurationUpdateParams.Boleto(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Boleto.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Boleto#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Boleto#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Boleto.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Boleto.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Boleto.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Boleto.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Boleto.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Card build() {
        return new PaymentMethodConfigurationUpdateParams.Card(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Card.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Card#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Card#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Card.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Card.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Card.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationUpdateParams.Card.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationUpdateParams.Card.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.CartesBancaires build() {
        return new PaymentMethodConfigurationUpdateParams.CartesBancaires(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.CartesBancaires.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.CartesBancaires#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationUpdateParams.CartesBancaires#extraParams} for the
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
        public PaymentMethodConfigurationUpdateParams.CartesBancaires.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.CartesBancaires.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.CartesBancaires.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationUpdateParams.CartesBancaires.DisplayPreference#extraParams} for
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
            PaymentMethodConfigurationUpdateParams.CartesBancaires.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Cashapp build() {
        return new PaymentMethodConfigurationUpdateParams.Cashapp(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Cashapp.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Cashapp#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Cashapp#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Cashapp.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Cashapp.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Cashapp.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Cashapp.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Cashapp.DisplayPreference.Preference
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
  public static class CustomerBalance {
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

    private CustomerBalance(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationUpdateParams.CustomerBalance build() {
        return new PaymentMethodConfigurationUpdateParams.CustomerBalance(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.CustomerBalance.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.CustomerBalance#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationUpdateParams.CustomerBalance#extraParams} for the
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
        public PaymentMethodConfigurationUpdateParams.CustomerBalance.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.CustomerBalance.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.CustomerBalance.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationUpdateParams.CustomerBalance.DisplayPreference#extraParams} for
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
            PaymentMethodConfigurationUpdateParams.CustomerBalance.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Eps build() {
        return new PaymentMethodConfigurationUpdateParams.Eps(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Eps.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Eps#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Eps#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Eps.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Eps.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationUpdateParams.Eps.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationUpdateParams.Eps.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationUpdateParams.Eps.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Fpx build() {
        return new PaymentMethodConfigurationUpdateParams.Fpx(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Fpx.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Fpx#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Fpx#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Fpx.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Fpx.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationUpdateParams.Fpx.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationUpdateParams.Fpx.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationUpdateParams.Fpx.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Giropay build() {
        return new PaymentMethodConfigurationUpdateParams.Giropay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Giropay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Giropay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Giropay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Giropay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Giropay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Giropay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Giropay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Giropay.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.GooglePay build() {
        return new PaymentMethodConfigurationUpdateParams.GooglePay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.GooglePay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.GooglePay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.GooglePay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.GooglePay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.GooglePay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.GooglePay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.GooglePay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.GooglePay.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Grabpay build() {
        return new PaymentMethodConfigurationUpdateParams.Grabpay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Grabpay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Grabpay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Grabpay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Grabpay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Grabpay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Grabpay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Grabpay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Grabpay.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Ideal build() {
        return new PaymentMethodConfigurationUpdateParams.Ideal(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Ideal.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Ideal#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Ideal#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Ideal.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Ideal.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Ideal.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationUpdateParams.Ideal.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationUpdateParams.Ideal.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Jcb build() {
        return new PaymentMethodConfigurationUpdateParams.Jcb(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Jcb.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Jcb#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Jcb#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Jcb.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Jcb.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationUpdateParams.Jcb.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationUpdateParams.Jcb.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationUpdateParams.Jcb.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Klarna build() {
        return new PaymentMethodConfigurationUpdateParams.Klarna(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Klarna.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Klarna#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Klarna#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Klarna.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Klarna.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Klarna.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Klarna.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Klarna.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Konbini build() {
        return new PaymentMethodConfigurationUpdateParams.Konbini(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Konbini.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Konbini#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Konbini#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Konbini.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Konbini.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Konbini.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Konbini.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Konbini.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Link build() {
        return new PaymentMethodConfigurationUpdateParams.Link(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Link.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Link#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Link#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Link.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Link.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Link.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationUpdateParams.Link.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationUpdateParams.Link.DisplayPreference.Preference preference) {
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
  public static class Multibanco {
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

    private Multibanco(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationUpdateParams.Multibanco build() {
        return new PaymentMethodConfigurationUpdateParams.Multibanco(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Multibanco.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Multibanco#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Multibanco#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Multibanco.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Multibanco.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Multibanco.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Multibanco.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Multibanco.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Oxxo build() {
        return new PaymentMethodConfigurationUpdateParams.Oxxo(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Oxxo.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Oxxo#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Oxxo#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Oxxo.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Oxxo.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Oxxo.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationUpdateParams.Oxxo.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationUpdateParams.Oxxo.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.P24 build() {
        return new PaymentMethodConfigurationUpdateParams.P24(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.P24.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.P24#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.P24#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.P24.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.P24.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationUpdateParams.P24.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationUpdateParams.P24.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationUpdateParams.P24.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Paynow build() {
        return new PaymentMethodConfigurationUpdateParams.Paynow(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Paynow.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Paynow#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Paynow#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Paynow.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Paynow.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Paynow.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Paynow.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Paynow.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Paypal build() {
        return new PaymentMethodConfigurationUpdateParams.Paypal(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Paypal.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Paypal#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Paypal#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Paypal.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Paypal.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Paypal.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Paypal.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Paypal.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.Promptpay build() {
        return new PaymentMethodConfigurationUpdateParams.Promptpay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Promptpay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Promptpay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Promptpay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Promptpay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Promptpay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Promptpay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Promptpay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Promptpay.DisplayPreference.Preference
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
  public static class RevolutPay {
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

    private RevolutPay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationUpdateParams.RevolutPay build() {
        return new PaymentMethodConfigurationUpdateParams.RevolutPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.RevolutPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.RevolutPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.RevolutPay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.RevolutPay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.RevolutPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.RevolutPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.RevolutPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.RevolutPay.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.SepaDebit build() {
        return new PaymentMethodConfigurationUpdateParams.SepaDebit(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.SepaDebit.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.SepaDebit#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.SepaDebit#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.SepaDebit.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.SepaDebit.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.SepaDebit.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.SepaDebit.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.SepaDebit.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.Sofort build() {
        return new PaymentMethodConfigurationUpdateParams.Sofort(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Sofort.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Sofort#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Sofort#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Sofort.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Sofort.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.Sofort.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.Sofort.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.Sofort.DisplayPreference.Preference preference) {
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
      public PaymentMethodConfigurationUpdateParams.UsBankAccount build() {
        return new PaymentMethodConfigurationUpdateParams.UsBankAccount(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.UsBankAccount.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.UsBankAccount#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationUpdateParams.UsBankAccount#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.UsBankAccount.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.UsBankAccount.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.UsBankAccount.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationUpdateParams.UsBankAccount.DisplayPreference#extraParams} for
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
            PaymentMethodConfigurationUpdateParams.UsBankAccount.DisplayPreference.Preference
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
      public PaymentMethodConfigurationUpdateParams.WechatPay build() {
        return new PaymentMethodConfigurationUpdateParams.WechatPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.WechatPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.WechatPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.WechatPay#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.WechatPay.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.WechatPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationUpdateParams.WechatPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationUpdateParams.WechatPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationUpdateParams.WechatPay.DisplayPreference.Preference
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
  public static class Zip {
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

    private Zip(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationUpdateParams.Zip build() {
        return new PaymentMethodConfigurationUpdateParams.Zip(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationUpdateParams.Zip.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationUpdateParams.Zip#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationUpdateParams.Zip#extraParams} for the field
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
        public PaymentMethodConfigurationUpdateParams.Zip.DisplayPreference build() {
          return new PaymentMethodConfigurationUpdateParams.Zip.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationUpdateParams.Zip.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationUpdateParams.Zip.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationUpdateParams.Zip.DisplayPreference.Preference preference) {
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
