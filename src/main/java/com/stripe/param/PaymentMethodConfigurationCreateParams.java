// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethodConfigurationCreateParams extends ApiRequestParams {
  /**
   * Canadian pre-authorized debit payments, check this <a
   * href="https://docs.stripe.com/payments/acss-debit">page</a> for more details like country
   * availability.
   */
  @SerializedName("acss_debit")
  AcssDebit acssDebit;

  /**
   * <a href="https://www.affirm.com/">Affirm</a> gives your customers a way to split purchases over
   * a series of payments. Depending on the purchase, they can pay with four interest-free payments
   * (Split Pay) or pay over a longer term (Installments), which might include interest. Check this
   * <a href="https://docs.stripe.com/payments/affirm">page</a> for more details like country
   * availability.
   */
  @SerializedName("affirm")
  Affirm affirm;

  /**
   * Afterpay gives your customers a way to pay for purchases in installments, check this <a
   * href="https://docs.stripe.com/payments/afterpay-clearpay">page</a> for more details like
   * country availability. Afterpay is particularly popular among businesses selling fashion,
   * beauty, and sports products.
   */
  @SerializedName("afterpay_clearpay")
  AfterpayClearpay afterpayClearpay;

  /**
   * Alipay is a digital wallet in China that has more than a billion active users worldwide. Alipay
   * users can pay on the web or on a mobile device using login credentials or their Alipay app.
   * Alipay has a low dispute rate and reduces fraud by authenticating payments using the customer's
   * login credentials. Check this <a href="https://docs.stripe.com/payments/alipay">page</a> for
   * more details.
   */
  @SerializedName("alipay")
  Alipay alipay;

  /**
   * Alma is a Buy Now, Pay Later payment method that offers customers the ability to pay in 2, 3,
   * or 4 installments.
   */
  @SerializedName("alma")
  Alma alma;

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
   * this <a href="https://docs.stripe.com/apple-pay">page</a> for more details.
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
   * href="https://docs.stripe.com/payments/au-becs-debit">page</a> for more details.
   */
  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  /**
   * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank
   * account, check this <a
   * href="https://docs.stripe.com/payments/payment-methods/bacs-debit">page</a> for more details.
   */
  @SerializedName("bacs_debit")
  BacsDebit bacsDebit;

  /**
   * Bancontact is the most popular online payment method in Belgium, with over 15 million cards in
   * circulation. <a href="https://docs.stripe.com/api/customers">Customers</a> use a Bancontact
   * card or mobile app linked to a Belgian bank account to make online payments that are secure,
   * guaranteed, and confirmed immediately. Check this <a
   * href="https://docs.stripe.com/payments/bancontact">page</a> for more details.
   */
  @SerializedName("bancontact")
  Bancontact bancontact;

  /**
   * Billie is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single-use</a>
   * payment method that offers businesses Pay by Invoice where they offer payment terms ranging
   * from 7-120 days. Customers are redirected from your website or app, authorize the payment with
   * Billie, then return to your website or app. You get <a
   * href="https://stripe.com/payments/payment-methods#payment-notification">immediate
   * notification</a> of whether the payment succeeded or failed.
   */
  @SerializedName("billie")
  Billie billie;

  /**
   * BLIK is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single use</a>
   * payment method that requires customers to authenticate their payments. When customers want to
   * pay online using BLIK, they request a six-digit code from their banking application and enter
   * it into the payment collection form. Check this <a
   * href="https://docs.stripe.com/payments/blik">page</a> for more details.
   */
  @SerializedName("blik")
  Blik blik;

  /**
   * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil. Check
   * this <a href="https://docs.stripe.com/payments/boleto">page</a> for more details.
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
   * href="https://docs.stripe.com/payments/cartes-bancaires">page</a> for more details.
   */
  @SerializedName("cartes_bancaires")
  CartesBancaires cartesBancaires;

  /**
   * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and
   * receive money using their digital wallet. Check this <a
   * href="https://docs.stripe.com/payments/cash-app-pay">page</a> for more details.
   */
  @SerializedName("cashapp")
  Cashapp cashapp;

  /**
   * <a href="https://docs.stripe.com/payments/stablecoin-payments">Stablecoin payments</a> enable
   * customers to pay in stablecoins like USDC from 100s of wallets including Phantom and Metamask.
   */
  @SerializedName("crypto")
  Crypto crypto;

  /**
   * Uses a customer’s <a href="https://docs.stripe.com/payments/customer-balance">cash balance</a>
   * for the payment. The cash balance can be funded via a bank transfer. Check this <a
   * href="https://docs.stripe.com/payments/bank-transfers">page</a> for more details.
   */
  @SerializedName("customer_balance")
  CustomerBalance customerBalance;

  /**
   * EPS is an Austria-based payment method that allows customers to complete transactions online
   * using their bank credentials. EPS is supported by all Austrian banks and is accepted by over
   * 80% of Austrian online retailers. Check this <a
   * href="https://docs.stripe.com/payments/eps">page</a> for more details.
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
   * <a href="https://docs.stripe.com/payments/fpx">page</a> for more details.
   */
  @SerializedName("fpx")
  Fpx fpx;

  /**
   * Meal vouchers in France, or “titres-restaurant”, is a local benefits program commonly offered
   * by employers for their employees to purchase prepared food and beverages on working days. Check
   * this <a href="https://docs.stripe.com/payments/benefits/fr-meal-vouchers">page</a> for more
   * details.
   */
  @SerializedName("fr_meal_voucher_conecs")
  FrMealVoucherConecs frMealVoucherConecs;

  /**
   * giropay is a German payment method based on online banking, introduced in 2006. It allows
   * customers to complete transactions online using their online banking environment, with funds
   * debited from their bank account. Depending on their bank, customers confirm payments on giropay
   * using a second factor of authentication or a PIN. giropay accounts for 10% of online checkouts
   * in Germany. Check this <a href="https://docs.stripe.com/payments/giropay">page</a> for more
   * details.
   */
  @SerializedName("giropay")
  Giropay giropay;

  /**
   * Google Pay allows customers to make payments in your app or website using any credit or debit
   * card saved to their Google Account, including those from Google Play, YouTube, Chrome, or an
   * Android device. Use the Google Pay API to request any credit or debit card stored in your
   * customer's Google account. Check this <a href="https://docs.stripe.com/google-pay">page</a> for
   * more details.
   */
  @SerializedName("google_pay")
  GooglePay googlePay;

  /**
   * GoPay is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single use</a>
   * digital wallet payment method popular in Indonesia. When paying with GoPay, customers
   * authenticate and approve payments using the Gojek app. Desktop checkout is performed by
   * scanning a QR code. When checking out on mobile, customers are redirected to the Gojek app to
   * confirm payment.
   */
  @SerializedName("gopay")
  Gopay gopay;

  /**
   * GrabPay is a payment method developed by <a
   * href="https://www.grab.com/sg/consumer/finance/pay/">Grab</a>. GrabPay is a digital wallet -
   * customers maintain a balance in their wallets that they pay out with. Check this <a
   * href="https://docs.stripe.com/payments/grabpay">page</a> for more details.
   */
  @SerializedName("grabpay")
  Grabpay grabpay;

  /**
   * Stripe users in Indonesia can receive bank transfers from customers in Indonesia. Bank
   * transfers are a popular B2C and B2B payment method in Indonesia.
   */
  @SerializedName("id_bank_transfer")
  IdBankTransfer idBankTransfer;

  /**
   * iDEAL is a Netherlands-based payment method that allows customers to complete transactions
   * online using their bank credentials. All major Dutch banks are members of Currence, the scheme
   * that operates iDEAL, making it the most popular online payment method in the Netherlands with a
   * share of online transactions close to 55%. Check this <a
   * href="https://docs.stripe.com/payments/ideal">page</a> for more details.
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

  /** Kakao Pay is a popular local wallet available in South Korea. */
  @SerializedName("kakao_pay")
  KakaoPay kakaoPay;

  /**
   * Klarna gives customers a range of <a
   * href="https://docs.stripe.com/payments/klarna#payment-options">payment options</a> during
   * checkout. Available payment options vary depending on the customer's billing address and the
   * transaction amount. These payment options make it convenient for customers to purchase items in
   * all price ranges. Check this <a href="https://docs.stripe.com/payments/klarna">page</a> for
   * more details.
   */
  @SerializedName("klarna")
  Klarna klarna;

  /**
   * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores
   * with cash. Check this <a href="https://docs.stripe.com/payments/konbini">page</a> for more
   * details.
   */
  @SerializedName("konbini")
  Konbini konbini;

  /** Korean cards let users pay using locally issued cards from South Korea. */
  @SerializedName("kr_card")
  KrCard krCard;

  /**
   * <a href="https://docs.stripe.com/payments/link">Link</a> is a payment method network. With
   * Link, users save their payment details once, then reuse that information to pay with one click
   * for any business on the network.
   */
  @SerializedName("link")
  Link link;

  /**
   * MB WAY is the most popular wallet in Portugal. After entering their phone number in your
   * checkout, customers approve the payment directly in their MB WAY app. Check this <a
   * href="https://docs.stripe.com/payments/mb-way">page</a> for more details.
   */
  @SerializedName("mb_way")
  MbWay mbWay;

  /**
   * MobilePay is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single-use</a>
   * card wallet payment method used in Denmark and Finland. It allows customers to <a
   * href="https://docs.stripe.com/payments/payment-methods#customer-actions">authenticate and
   * approve</a> payments using the MobilePay app. Check this <a
   * href="https://docs.stripe.com/payments/mobilepay">page</a> for more details.
   */
  @SerializedName("mobilepay")
  Mobilepay mobilepay;

  /**
   * Stripe users in Europe and the United States can accept Multibanco payments from customers in
   * Portugal using <a href="https://stripe.com/docs/sources">Sources</a>—a single integration path
   * for creating payments using any supported method.
   */
  @SerializedName("multibanco")
  Multibanco multibanco;

  /** Configuration name. */
  @SerializedName("name")
  String name;

  /** Naver Pay is a popular local wallet available in South Korea. */
  @SerializedName("naver_pay")
  NaverPay naverPay;

  /**
   * Stripe users in New Zealand can accept Bulk Electronic Clearing System (BECS) direct debit
   * payments from customers with a New Zeland bank account. Check this <a
   * href="https://docs.stripe.com/payments/nz-bank-account">page</a> for more details.
   */
  @SerializedName("nz_bank_account")
  NzBankAccount nzBankAccount;

  /**
   * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin America
   * and represents nearly 20% of online transactions in Mexico. OXXO allows customers to pay bills
   * and online purchases in-store with cash. Check this <a
   * href="https://docs.stripe.com/payments/oxxo">page</a> for more details.
   */
  @SerializedName("oxxo")
  Oxxo oxxo;

  /**
   * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete
   * transactions online using bank transfers and other methods. Bank transfers account for 30% of
   * online payments in Poland and Przelewy24 provides a way for customers to pay with over 165
   * banks. Check this <a href="https://docs.stripe.com/payments/p24">page</a> for more details.
   */
  @SerializedName("p24")
  P24 p24;

  /** Configuration's parent configuration. Specify to create a child configuration. */
  @SerializedName("parent")
  String parent;

  /**
   * Pay by bank is a redirect payment method backed by bank transfers. A customer is redirected to
   * their bank to authorize a bank transfer for a given amount. This removes a lot of the error
   * risks inherent in waiting for the customer to initiate a transfer themselves, and is less
   * expensive than card payments.
   */
  @SerializedName("pay_by_bank")
  PayByBank payByBank;

  /**
   * PAYCO is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet
   * available in South Korea.
   */
  @SerializedName("payco")
  Payco payco;

  /**
   * PayNow is a Singapore-based payment method that allows customers to make a payment using their
   * preferred app from participating banks and participating non-bank financial institutions. Check
   * this <a href="https://docs.stripe.com/payments/paynow">page</a> for more details.
   */
  @SerializedName("paynow")
  Paynow paynow;

  /**
   * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to
   * pay using their PayPal account. Check this <a
   * href="https://docs.stripe.com/payments/paypal">page</a> for more details.
   */
  @SerializedName("paypal")
  Paypal paypal;

  /** Customers can pay with PayPay online or using the PayPay app. */
  @SerializedName("paypay")
  Paypay paypay;

  /**
   * PayTo is a <a href="https://docs.stripe.com/payments/real-time">real-time</a> payment method
   * that enables customers in Australia to pay by providing their bank account details. Customers
   * must accept a mandate authorizing you to debit their account. Check this <a
   * href="https://docs.stripe.com/payments/payto">page</a> for more details.
   */
  @SerializedName("payto")
  Payto payto;

  /**
   * Pix is a payment method popular in Brazil. When paying with Pix, customers authenticate and
   * approve payments by scanning a QR code in their preferred banking app. Check this <a
   * href="https://docs.stripe.com/payments/pix">page</a> for more details.
   */
  @SerializedName("pix")
  Pix pix;

  /**
   * PromptPay is a Thailand-based payment method that allows customers to make a payment using
   * their preferred app from participating banks. Check this <a
   * href="https://docs.stripe.com/payments/promptpay">page</a> for more details.
   */
  @SerializedName("promptpay")
  Promptpay promptpay;

  /**
   * QRIS is a <a href="https://docs.stripe.com/payments/real-time">real-time</a> payment method
   * popular in Indonesia. When paying with QRIS, customers authenticate and approve payments by
   * scanning a QR code in their preferred digital wallet app.
   */
  @SerializedName("qris")
  Qris qris;

  /**
   * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method.
   * Revolut Pay uses the customer’s stored balance or cards to fund the payment, and offers the
   * option for non-Revolut customers to save their details after their first purchase.
   */
  @SerializedName("revolut_pay")
  RevolutPay revolutPay;

  /**
   * Samsung Pay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local
   * wallet available in South Korea.
   */
  @SerializedName("samsung_pay")
  SamsungPay samsungPay;

  /**
   * Satispay is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single-use</a>
   * payment method where customers are required to <a
   * href="https://stripe.com/payments/payment-methods#customer-actions">authenticate</a> their
   * payment. Customers pay by being redirected from your website or app, authorizing the payment
   * with Satispay, then returning to your website or app. You get <a
   * href="https://stripe.com/payments/payment-methods#payment-notification">immediate
   * notification</a> of whether the payment succeeded or failed.
   */
  @SerializedName("satispay")
  Satispay satispay;

  /**
   * The <a href="https://en.wikipedia.org/wiki/Single_Euro_Payments_Area">Single Euro Payments Area
   * (SEPA)</a> is an initiative of the European Union to simplify payments within and across member
   * countries. SEPA established and enforced banking standards to allow for the direct debiting of
   * every EUR-denominated bank account within the SEPA region, check this <a
   * href="https://docs.stripe.com/payments/sepa-debit">page</a> for more details.
   */
  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  /**
   * ShopeePay is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single use</a>
   * digital wallet payment method popular in Indonesia. When paying with GoPay, customers
   * authenticate and approve payments using the Shopee app. Desktop checkout is performed by
   * scanning a QR code. When checking out on mobile, customers are redirected to the Shopee app to
   * confirm payment.
   */
  @SerializedName("shopeepay")
  Shopeepay shopeepay;

  /**
   * Stripe users in Europe and the United States can use the <a
   * href="https://stripe.com/docs/payments/payment-intents">Payment Intents API</a>—a single
   * integration path for creating payments using any supported method—to accept <a
   * href="https://www.sofort.com/">Sofort</a> payments from customers. Check this <a
   * href="https://docs.stripe.com/payments/sofort">page</a> for more details.
   */
  @SerializedName("sofort")
  Sofort sofort;

  /**
   * Swish is a <a href="https://docs.stripe.com/payments/real-time">real-time</a> payment method
   * popular in Sweden. It allows customers to <a
   * href="https://docs.stripe.com/payments/payment-methods#customer-actions">authenticate and
   * approve</a> payments using the Swish mobile app and the Swedish BankID mobile app. Check this
   * <a href="https://docs.stripe.com/payments/swish">page</a> for more details.
   */
  @SerializedName("swish")
  Swish swish;

  /**
   * Twint is a payment method popular in Switzerland. It allows customers to pay using their mobile
   * phone. Check this <a href="https://docs.stripe.com/payments/twint">page</a> for more details.
   */
  @SerializedName("twint")
  Twint twint;

  /**
   * Stripe users in the United States can accept ACH direct debit payments from customers with a US
   * bank account using the Automated Clearing House (ACH) payments system operated by Nacha. Check
   * this <a href="https://docs.stripe.com/payments/ach-direct-debit">page</a> for more details.
   */
  @SerializedName("us_bank_account")
  UsBankAccount usBankAccount;

  /**
   * WeChat, owned by Tencent, is China's leading mobile app with over 1 billion monthly active
   * users. Chinese consumers can use WeChat Pay to pay for goods and services inside of businesses'
   * apps and websites. WeChat Pay users buy most frequently in gaming, e-commerce, travel, online
   * education, and food/nutrition. Check this <a
   * href="https://docs.stripe.com/payments/wechat-pay">page</a> for more details.
   */
  @SerializedName("wechat_pay")
  WechatPay wechatPay;

  /**
   * Zip gives your customers a way to split purchases over a series of payments. Check this <a
   * href="https://docs.stripe.com/payments/zip">page</a> for more details like country
   * availability.
   */
  @SerializedName("zip")
  Zip zip;

  private PaymentMethodConfigurationCreateParams(
      AcssDebit acssDebit,
      Affirm affirm,
      AfterpayClearpay afterpayClearpay,
      Alipay alipay,
      Alma alma,
      AmazonPay amazonPay,
      ApplePay applePay,
      ApplePayLater applePayLater,
      AuBecsDebit auBecsDebit,
      BacsDebit bacsDebit,
      Bancontact bancontact,
      Billie billie,
      Blik blik,
      Boleto boleto,
      Card card,
      CartesBancaires cartesBancaires,
      Cashapp cashapp,
      Crypto crypto,
      CustomerBalance customerBalance,
      Eps eps,
      List<String> expand,
      Map<String, Object> extraParams,
      Fpx fpx,
      FrMealVoucherConecs frMealVoucherConecs,
      Giropay giropay,
      GooglePay googlePay,
      Gopay gopay,
      Grabpay grabpay,
      IdBankTransfer idBankTransfer,
      Ideal ideal,
      Jcb jcb,
      KakaoPay kakaoPay,
      Klarna klarna,
      Konbini konbini,
      KrCard krCard,
      Link link,
      MbWay mbWay,
      Mobilepay mobilepay,
      Multibanco multibanco,
      String name,
      NaverPay naverPay,
      NzBankAccount nzBankAccount,
      Oxxo oxxo,
      P24 p24,
      String parent,
      PayByBank payByBank,
      Payco payco,
      Paynow paynow,
      Paypal paypal,
      Paypay paypay,
      Payto payto,
      Pix pix,
      Promptpay promptpay,
      Qris qris,
      RevolutPay revolutPay,
      SamsungPay samsungPay,
      Satispay satispay,
      SepaDebit sepaDebit,
      Shopeepay shopeepay,
      Sofort sofort,
      Swish swish,
      Twint twint,
      UsBankAccount usBankAccount,
      WechatPay wechatPay,
      Zip zip) {
    this.acssDebit = acssDebit;
    this.affirm = affirm;
    this.afterpayClearpay = afterpayClearpay;
    this.alipay = alipay;
    this.alma = alma;
    this.amazonPay = amazonPay;
    this.applePay = applePay;
    this.applePayLater = applePayLater;
    this.auBecsDebit = auBecsDebit;
    this.bacsDebit = bacsDebit;
    this.bancontact = bancontact;
    this.billie = billie;
    this.blik = blik;
    this.boleto = boleto;
    this.card = card;
    this.cartesBancaires = cartesBancaires;
    this.cashapp = cashapp;
    this.crypto = crypto;
    this.customerBalance = customerBalance;
    this.eps = eps;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fpx = fpx;
    this.frMealVoucherConecs = frMealVoucherConecs;
    this.giropay = giropay;
    this.googlePay = googlePay;
    this.gopay = gopay;
    this.grabpay = grabpay;
    this.idBankTransfer = idBankTransfer;
    this.ideal = ideal;
    this.jcb = jcb;
    this.kakaoPay = kakaoPay;
    this.klarna = klarna;
    this.konbini = konbini;
    this.krCard = krCard;
    this.link = link;
    this.mbWay = mbWay;
    this.mobilepay = mobilepay;
    this.multibanco = multibanco;
    this.name = name;
    this.naverPay = naverPay;
    this.nzBankAccount = nzBankAccount;
    this.oxxo = oxxo;
    this.p24 = p24;
    this.parent = parent;
    this.payByBank = payByBank;
    this.payco = payco;
    this.paynow = paynow;
    this.paypal = paypal;
    this.paypay = paypay;
    this.payto = payto;
    this.pix = pix;
    this.promptpay = promptpay;
    this.qris = qris;
    this.revolutPay = revolutPay;
    this.samsungPay = samsungPay;
    this.satispay = satispay;
    this.sepaDebit = sepaDebit;
    this.shopeepay = shopeepay;
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
    private AcssDebit acssDebit;

    private Affirm affirm;

    private AfterpayClearpay afterpayClearpay;

    private Alipay alipay;

    private Alma alma;

    private AmazonPay amazonPay;

    private ApplePay applePay;

    private ApplePayLater applePayLater;

    private AuBecsDebit auBecsDebit;

    private BacsDebit bacsDebit;

    private Bancontact bancontact;

    private Billie billie;

    private Blik blik;

    private Boleto boleto;

    private Card card;

    private CartesBancaires cartesBancaires;

    private Cashapp cashapp;

    private Crypto crypto;

    private CustomerBalance customerBalance;

    private Eps eps;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Fpx fpx;

    private FrMealVoucherConecs frMealVoucherConecs;

    private Giropay giropay;

    private GooglePay googlePay;

    private Gopay gopay;

    private Grabpay grabpay;

    private IdBankTransfer idBankTransfer;

    private Ideal ideal;

    private Jcb jcb;

    private KakaoPay kakaoPay;

    private Klarna klarna;

    private Konbini konbini;

    private KrCard krCard;

    private Link link;

    private MbWay mbWay;

    private Mobilepay mobilepay;

    private Multibanco multibanco;

    private String name;

    private NaverPay naverPay;

    private NzBankAccount nzBankAccount;

    private Oxxo oxxo;

    private P24 p24;

    private String parent;

    private PayByBank payByBank;

    private Payco payco;

    private Paynow paynow;

    private Paypal paypal;

    private Paypay paypay;

    private Payto payto;

    private Pix pix;

    private Promptpay promptpay;

    private Qris qris;

    private RevolutPay revolutPay;

    private SamsungPay samsungPay;

    private Satispay satispay;

    private SepaDebit sepaDebit;

    private Shopeepay shopeepay;

    private Sofort sofort;

    private Swish swish;

    private Twint twint;

    private UsBankAccount usBankAccount;

    private WechatPay wechatPay;

    private Zip zip;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodConfigurationCreateParams build() {
      return new PaymentMethodConfigurationCreateParams(
          this.acssDebit,
          this.affirm,
          this.afterpayClearpay,
          this.alipay,
          this.alma,
          this.amazonPay,
          this.applePay,
          this.applePayLater,
          this.auBecsDebit,
          this.bacsDebit,
          this.bancontact,
          this.billie,
          this.blik,
          this.boleto,
          this.card,
          this.cartesBancaires,
          this.cashapp,
          this.crypto,
          this.customerBalance,
          this.eps,
          this.expand,
          this.extraParams,
          this.fpx,
          this.frMealVoucherConecs,
          this.giropay,
          this.googlePay,
          this.gopay,
          this.grabpay,
          this.idBankTransfer,
          this.ideal,
          this.jcb,
          this.kakaoPay,
          this.klarna,
          this.konbini,
          this.krCard,
          this.link,
          this.mbWay,
          this.mobilepay,
          this.multibanco,
          this.name,
          this.naverPay,
          this.nzBankAccount,
          this.oxxo,
          this.p24,
          this.parent,
          this.payByBank,
          this.payco,
          this.paynow,
          this.paypal,
          this.paypay,
          this.payto,
          this.pix,
          this.promptpay,
          this.qris,
          this.revolutPay,
          this.samsungPay,
          this.satispay,
          this.sepaDebit,
          this.shopeepay,
          this.sofort,
          this.swish,
          this.twint,
          this.usBankAccount,
          this.wechatPay,
          this.zip);
    }

    /**
     * Canadian pre-authorized debit payments, check this <a
     * href="https://docs.stripe.com/payments/acss-debit">page</a> for more details like country
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
     * Check this <a href="https://docs.stripe.com/payments/affirm">page</a> for more details like
     * country availability.
     */
    public Builder setAffirm(PaymentMethodConfigurationCreateParams.Affirm affirm) {
      this.affirm = affirm;
      return this;
    }

    /**
     * Afterpay gives your customers a way to pay for purchases in installments, check this <a
     * href="https://docs.stripe.com/payments/afterpay-clearpay">page</a> for more details like
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
     * href="https://docs.stripe.com/payments/alipay">page</a> for more details.
     */
    public Builder setAlipay(PaymentMethodConfigurationCreateParams.Alipay alipay) {
      this.alipay = alipay;
      return this;
    }

    /**
     * Alma is a Buy Now, Pay Later payment method that offers customers the ability to pay in 2, 3,
     * or 4 installments.
     */
    public Builder setAlma(PaymentMethodConfigurationCreateParams.Alma alma) {
      this.alma = alma;
      return this;
    }

    /**
     * Amazon Pay is a wallet payment method that lets your customers check out the same way as on
     * Amazon.
     */
    public Builder setAmazonPay(PaymentMethodConfigurationCreateParams.AmazonPay amazonPay) {
      this.amazonPay = amazonPay;
      return this;
    }

    /**
     * Stripe users can accept <a href="https://stripe.com/payments/apple-pay">Apple Pay</a> in iOS
     * applications in iOS 9 and later, and on the web in Safari starting with iOS 10 or macOS
     * Sierra. There are no additional fees to process Apple Pay payments, and the <a
     * href="https://stripe.com/pricing">pricing</a> is the same as other card transactions. Check
     * this <a href="https://docs.stripe.com/apple-pay">page</a> for more details.
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
     * href="https://docs.stripe.com/payments/au-becs-debit">page</a> for more details.
     */
    public Builder setAuBecsDebit(PaymentMethodConfigurationCreateParams.AuBecsDebit auBecsDebit) {
      this.auBecsDebit = auBecsDebit;
      return this;
    }

    /**
     * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank
     * account, check this <a
     * href="https://docs.stripe.com/payments/payment-methods/bacs-debit">page</a> for more details.
     */
    public Builder setBacsDebit(PaymentMethodConfigurationCreateParams.BacsDebit bacsDebit) {
      this.bacsDebit = bacsDebit;
      return this;
    }

    /**
     * Bancontact is the most popular online payment method in Belgium, with over 15 million cards
     * in circulation. <a href="https://docs.stripe.com/api/customers">Customers</a> use a
     * Bancontact card or mobile app linked to a Belgian bank account to make online payments that
     * are secure, guaranteed, and confirmed immediately. Check this <a
     * href="https://docs.stripe.com/payments/bancontact">page</a> for more details.
     */
    public Builder setBancontact(PaymentMethodConfigurationCreateParams.Bancontact bancontact) {
      this.bancontact = bancontact;
      return this;
    }

    /**
     * Billie is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single-use</a>
     * payment method that offers businesses Pay by Invoice where they offer payment terms ranging
     * from 7-120 days. Customers are redirected from your website or app, authorize the payment
     * with Billie, then return to your website or app. You get <a
     * href="https://stripe.com/payments/payment-methods#payment-notification">immediate
     * notification</a> of whether the payment succeeded or failed.
     */
    public Builder setBillie(PaymentMethodConfigurationCreateParams.Billie billie) {
      this.billie = billie;
      return this;
    }

    /**
     * BLIK is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single use</a>
     * payment method that requires customers to authenticate their payments. When customers want to
     * pay online using BLIK, they request a six-digit code from their banking application and enter
     * it into the payment collection form. Check this <a
     * href="https://docs.stripe.com/payments/blik">page</a> for more details.
     */
    public Builder setBlik(PaymentMethodConfigurationCreateParams.Blik blik) {
      this.blik = blik;
      return this;
    }

    /**
     * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil.
     * Check this <a href="https://docs.stripe.com/payments/boleto">page</a> for more details.
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
     * href="https://docs.stripe.com/payments/cartes-bancaires">page</a> for more details.
     */
    public Builder setCartesBancaires(
        PaymentMethodConfigurationCreateParams.CartesBancaires cartesBancaires) {
      this.cartesBancaires = cartesBancaires;
      return this;
    }

    /**
     * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and
     * receive money using their digital wallet. Check this <a
     * href="https://docs.stripe.com/payments/cash-app-pay">page</a> for more details.
     */
    public Builder setCashapp(PaymentMethodConfigurationCreateParams.Cashapp cashapp) {
      this.cashapp = cashapp;
      return this;
    }

    /**
     * <a href="https://docs.stripe.com/payments/stablecoin-payments">Stablecoin payments</a> enable
     * customers to pay in stablecoins like USDC from 100s of wallets including Phantom and
     * Metamask.
     */
    public Builder setCrypto(PaymentMethodConfigurationCreateParams.Crypto crypto) {
      this.crypto = crypto;
      return this;
    }

    /**
     * Uses a customer’s <a href="https://docs.stripe.com/payments/customer-balance">cash
     * balance</a> for the payment. The cash balance can be funded via a bank transfer. Check this
     * <a href="https://docs.stripe.com/payments/bank-transfers">page</a> for more details.
     */
    public Builder setCustomerBalance(
        PaymentMethodConfigurationCreateParams.CustomerBalance customerBalance) {
      this.customerBalance = customerBalance;
      return this;
    }

    /**
     * EPS is an Austria-based payment method that allows customers to complete transactions online
     * using their bank credentials. EPS is supported by all Austrian banks and is accepted by over
     * 80% of Austrian online retailers. Check this <a
     * href="https://docs.stripe.com/payments/eps">page</a> for more details.
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
     * Check this <a href="https://docs.stripe.com/payments/fpx">page</a> for more details.
     */
    public Builder setFpx(PaymentMethodConfigurationCreateParams.Fpx fpx) {
      this.fpx = fpx;
      return this;
    }

    /**
     * Meal vouchers in France, or “titres-restaurant”, is a local benefits program commonly offered
     * by employers for their employees to purchase prepared food and beverages on working days.
     * Check this <a href="https://docs.stripe.com/payments/benefits/fr-meal-vouchers">page</a> for
     * more details.
     */
    public Builder setFrMealVoucherConecs(
        PaymentMethodConfigurationCreateParams.FrMealVoucherConecs frMealVoucherConecs) {
      this.frMealVoucherConecs = frMealVoucherConecs;
      return this;
    }

    /**
     * giropay is a German payment method based on online banking, introduced in 2006. It allows
     * customers to complete transactions online using their online banking environment, with funds
     * debited from their bank account. Depending on their bank, customers confirm payments on
     * giropay using a second factor of authentication or a PIN. giropay accounts for 10% of online
     * checkouts in Germany. Check this <a href="https://docs.stripe.com/payments/giropay">page</a>
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
     * customer's Google account. Check this <a href="https://docs.stripe.com/google-pay">page</a>
     * for more details.
     */
    public Builder setGooglePay(PaymentMethodConfigurationCreateParams.GooglePay googlePay) {
      this.googlePay = googlePay;
      return this;
    }

    /**
     * GoPay is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single use</a>
     * digital wallet payment method popular in Indonesia. When paying with GoPay, customers
     * authenticate and approve payments using the Gojek app. Desktop checkout is performed by
     * scanning a QR code. When checking out on mobile, customers are redirected to the Gojek app to
     * confirm payment.
     */
    public Builder setGopay(PaymentMethodConfigurationCreateParams.Gopay gopay) {
      this.gopay = gopay;
      return this;
    }

    /**
     * GrabPay is a payment method developed by <a
     * href="https://www.grab.com/sg/consumer/finance/pay/">Grab</a>. GrabPay is a digital wallet -
     * customers maintain a balance in their wallets that they pay out with. Check this <a
     * href="https://docs.stripe.com/payments/grabpay">page</a> for more details.
     */
    public Builder setGrabpay(PaymentMethodConfigurationCreateParams.Grabpay grabpay) {
      this.grabpay = grabpay;
      return this;
    }

    /**
     * Stripe users in Indonesia can receive bank transfers from customers in Indonesia. Bank
     * transfers are a popular B2C and B2B payment method in Indonesia.
     */
    public Builder setIdBankTransfer(
        PaymentMethodConfigurationCreateParams.IdBankTransfer idBankTransfer) {
      this.idBankTransfer = idBankTransfer;
      return this;
    }

    /**
     * iDEAL is a Netherlands-based payment method that allows customers to complete transactions
     * online using their bank credentials. All major Dutch banks are members of Currence, the
     * scheme that operates iDEAL, making it the most popular online payment method in the
     * Netherlands with a share of online transactions close to 55%. Check this <a
     * href="https://docs.stripe.com/payments/ideal">page</a> for more details.
     */
    public Builder setIdeal(PaymentMethodConfigurationCreateParams.Ideal ideal) {
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
    public Builder setJcb(PaymentMethodConfigurationCreateParams.Jcb jcb) {
      this.jcb = jcb;
      return this;
    }

    /** Kakao Pay is a popular local wallet available in South Korea. */
    public Builder setKakaoPay(PaymentMethodConfigurationCreateParams.KakaoPay kakaoPay) {
      this.kakaoPay = kakaoPay;
      return this;
    }

    /**
     * Klarna gives customers a range of <a
     * href="https://docs.stripe.com/payments/klarna#payment-options">payment options</a> during
     * checkout. Available payment options vary depending on the customer's billing address and the
     * transaction amount. These payment options make it convenient for customers to purchase items
     * in all price ranges. Check this <a href="https://docs.stripe.com/payments/klarna">page</a>
     * for more details.
     */
    public Builder setKlarna(PaymentMethodConfigurationCreateParams.Klarna klarna) {
      this.klarna = klarna;
      return this;
    }

    /**
     * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores
     * with cash. Check this <a href="https://docs.stripe.com/payments/konbini">page</a> for more
     * details.
     */
    public Builder setKonbini(PaymentMethodConfigurationCreateParams.Konbini konbini) {
      this.konbini = konbini;
      return this;
    }

    /** Korean cards let users pay using locally issued cards from South Korea. */
    public Builder setKrCard(PaymentMethodConfigurationCreateParams.KrCard krCard) {
      this.krCard = krCard;
      return this;
    }

    /**
     * <a href="https://docs.stripe.com/payments/link">Link</a> is a payment method network. With
     * Link, users save their payment details once, then reuse that information to pay with one
     * click for any business on the network.
     */
    public Builder setLink(PaymentMethodConfigurationCreateParams.Link link) {
      this.link = link;
      return this;
    }

    /**
     * MB WAY is the most popular wallet in Portugal. After entering their phone number in your
     * checkout, customers approve the payment directly in their MB WAY app. Check this <a
     * href="https://docs.stripe.com/payments/mb-way">page</a> for more details.
     */
    public Builder setMbWay(PaymentMethodConfigurationCreateParams.MbWay mbWay) {
      this.mbWay = mbWay;
      return this;
    }

    /**
     * MobilePay is a <a
     * href="https://docs.stripe.com/payments/payment-methods#usage">single-use</a> card wallet
     * payment method used in Denmark and Finland. It allows customers to <a
     * href="https://docs.stripe.com/payments/payment-methods#customer-actions">authenticate and
     * approve</a> payments using the MobilePay app. Check this <a
     * href="https://docs.stripe.com/payments/mobilepay">page</a> for more details.
     */
    public Builder setMobilepay(PaymentMethodConfigurationCreateParams.Mobilepay mobilepay) {
      this.mobilepay = mobilepay;
      return this;
    }

    /**
     * Stripe users in Europe and the United States can accept Multibanco payments from customers in
     * Portugal using <a href="https://stripe.com/docs/sources">Sources</a>—a single integration
     * path for creating payments using any supported method.
     */
    public Builder setMultibanco(PaymentMethodConfigurationCreateParams.Multibanco multibanco) {
      this.multibanco = multibanco;
      return this;
    }

    /** Configuration name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Naver Pay is a popular local wallet available in South Korea. */
    public Builder setNaverPay(PaymentMethodConfigurationCreateParams.NaverPay naverPay) {
      this.naverPay = naverPay;
      return this;
    }

    /**
     * Stripe users in New Zealand can accept Bulk Electronic Clearing System (BECS) direct debit
     * payments from customers with a New Zeland bank account. Check this <a
     * href="https://docs.stripe.com/payments/nz-bank-account">page</a> for more details.
     */
    public Builder setNzBankAccount(
        PaymentMethodConfigurationCreateParams.NzBankAccount nzBankAccount) {
      this.nzBankAccount = nzBankAccount;
      return this;
    }

    /**
     * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin
     * America and represents nearly 20% of online transactions in Mexico. OXXO allows customers to
     * pay bills and online purchases in-store with cash. Check this <a
     * href="https://docs.stripe.com/payments/oxxo">page</a> for more details.
     */
    public Builder setOxxo(PaymentMethodConfigurationCreateParams.Oxxo oxxo) {
      this.oxxo = oxxo;
      return this;
    }

    /**
     * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete
     * transactions online using bank transfers and other methods. Bank transfers account for 30% of
     * online payments in Poland and Przelewy24 provides a way for customers to pay with over 165
     * banks. Check this <a href="https://docs.stripe.com/payments/p24">page</a> for more details.
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
     * Pay by bank is a redirect payment method backed by bank transfers. A customer is redirected
     * to their bank to authorize a bank transfer for a given amount. This removes a lot of the
     * error risks inherent in waiting for the customer to initiate a transfer themselves, and is
     * less expensive than card payments.
     */
    public Builder setPayByBank(PaymentMethodConfigurationCreateParams.PayByBank payByBank) {
      this.payByBank = payByBank;
      return this;
    }

    /**
     * PAYCO is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet
     * available in South Korea.
     */
    public Builder setPayco(PaymentMethodConfigurationCreateParams.Payco payco) {
      this.payco = payco;
      return this;
    }

    /**
     * PayNow is a Singapore-based payment method that allows customers to make a payment using
     * their preferred app from participating banks and participating non-bank financial
     * institutions. Check this <a href="https://docs.stripe.com/payments/paynow">page</a> for more
     * details.
     */
    public Builder setPaynow(PaymentMethodConfigurationCreateParams.Paynow paynow) {
      this.paynow = paynow;
      return this;
    }

    /**
     * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to
     * pay using their PayPal account. Check this <a
     * href="https://docs.stripe.com/payments/paypal">page</a> for more details.
     */
    public Builder setPaypal(PaymentMethodConfigurationCreateParams.Paypal paypal) {
      this.paypal = paypal;
      return this;
    }

    /** Customers can pay with PayPay online or using the PayPay app. */
    public Builder setPaypay(PaymentMethodConfigurationCreateParams.Paypay paypay) {
      this.paypay = paypay;
      return this;
    }

    /**
     * PayTo is a <a href="https://docs.stripe.com/payments/real-time">real-time</a> payment method
     * that enables customers in Australia to pay by providing their bank account details. Customers
     * must accept a mandate authorizing you to debit their account. Check this <a
     * href="https://docs.stripe.com/payments/payto">page</a> for more details.
     */
    public Builder setPayto(PaymentMethodConfigurationCreateParams.Payto payto) {
      this.payto = payto;
      return this;
    }

    /**
     * Pix is a payment method popular in Brazil. When paying with Pix, customers authenticate and
     * approve payments by scanning a QR code in their preferred banking app. Check this <a
     * href="https://docs.stripe.com/payments/pix">page</a> for more details.
     */
    public Builder setPix(PaymentMethodConfigurationCreateParams.Pix pix) {
      this.pix = pix;
      return this;
    }

    /**
     * PromptPay is a Thailand-based payment method that allows customers to make a payment using
     * their preferred app from participating banks. Check this <a
     * href="https://docs.stripe.com/payments/promptpay">page</a> for more details.
     */
    public Builder setPromptpay(PaymentMethodConfigurationCreateParams.Promptpay promptpay) {
      this.promptpay = promptpay;
      return this;
    }

    /**
     * QRIS is a <a href="https://docs.stripe.com/payments/real-time">real-time</a> payment method
     * popular in Indonesia. When paying with QRIS, customers authenticate and approve payments by
     * scanning a QR code in their preferred digital wallet app.
     */
    public Builder setQris(PaymentMethodConfigurationCreateParams.Qris qris) {
      this.qris = qris;
      return this;
    }

    /**
     * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method.
     * Revolut Pay uses the customer’s stored balance or cards to fund the payment, and offers the
     * option for non-Revolut customers to save their details after their first purchase.
     */
    public Builder setRevolutPay(PaymentMethodConfigurationCreateParams.RevolutPay revolutPay) {
      this.revolutPay = revolutPay;
      return this;
    }

    /**
     * Samsung Pay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local
     * wallet available in South Korea.
     */
    public Builder setSamsungPay(PaymentMethodConfigurationCreateParams.SamsungPay samsungPay) {
      this.samsungPay = samsungPay;
      return this;
    }

    /**
     * Satispay is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single-use</a>
     * payment method where customers are required to <a
     * href="https://stripe.com/payments/payment-methods#customer-actions">authenticate</a> their
     * payment. Customers pay by being redirected from your website or app, authorizing the payment
     * with Satispay, then returning to your website or app. You get <a
     * href="https://stripe.com/payments/payment-methods#payment-notification">immediate
     * notification</a> of whether the payment succeeded or failed.
     */
    public Builder setSatispay(PaymentMethodConfigurationCreateParams.Satispay satispay) {
      this.satispay = satispay;
      return this;
    }

    /**
     * The <a href="https://en.wikipedia.org/wiki/Single_Euro_Payments_Area">Single Euro Payments
     * Area (SEPA)</a> is an initiative of the European Union to simplify payments within and across
     * member countries. SEPA established and enforced banking standards to allow for the direct
     * debiting of every EUR-denominated bank account within the SEPA region, check this <a
     * href="https://docs.stripe.com/payments/sepa-debit">page</a> for more details.
     */
    public Builder setSepaDebit(PaymentMethodConfigurationCreateParams.SepaDebit sepaDebit) {
      this.sepaDebit = sepaDebit;
      return this;
    }

    /**
     * ShopeePay is a <a href="https://docs.stripe.com/payments/payment-methods#usage">single
     * use</a> digital wallet payment method popular in Indonesia. When paying with GoPay, customers
     * authenticate and approve payments using the Shopee app. Desktop checkout is performed by
     * scanning a QR code. When checking out on mobile, customers are redirected to the Shopee app
     * to confirm payment.
     */
    public Builder setShopeepay(PaymentMethodConfigurationCreateParams.Shopeepay shopeepay) {
      this.shopeepay = shopeepay;
      return this;
    }

    /**
     * Stripe users in Europe and the United States can use the <a
     * href="https://stripe.com/docs/payments/payment-intents">Payment Intents API</a>—a single
     * integration path for creating payments using any supported method—to accept <a
     * href="https://www.sofort.com/">Sofort</a> payments from customers. Check this <a
     * href="https://docs.stripe.com/payments/sofort">page</a> for more details.
     */
    public Builder setSofort(PaymentMethodConfigurationCreateParams.Sofort sofort) {
      this.sofort = sofort;
      return this;
    }

    /**
     * Swish is a <a href="https://docs.stripe.com/payments/real-time">real-time</a> payment method
     * popular in Sweden. It allows customers to <a
     * href="https://docs.stripe.com/payments/payment-methods#customer-actions">authenticate and
     * approve</a> payments using the Swish mobile app and the Swedish BankID mobile app. Check this
     * <a href="https://docs.stripe.com/payments/swish">page</a> for more details.
     */
    public Builder setSwish(PaymentMethodConfigurationCreateParams.Swish swish) {
      this.swish = swish;
      return this;
    }

    /**
     * Twint is a payment method popular in Switzerland. It allows customers to pay using their
     * mobile phone. Check this <a href="https://docs.stripe.com/payments/twint">page</a> for more
     * details.
     */
    public Builder setTwint(PaymentMethodConfigurationCreateParams.Twint twint) {
      this.twint = twint;
      return this;
    }

    /**
     * Stripe users in the United States can accept ACH direct debit payments from customers with a
     * US bank account using the Automated Clearing House (ACH) payments system operated by Nacha.
     * Check this <a href="https://docs.stripe.com/payments/ach-direct-debit">page</a> for more
     * details.
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
     * href="https://docs.stripe.com/payments/wechat-pay">page</a> for more details.
     */
    public Builder setWechatPay(PaymentMethodConfigurationCreateParams.WechatPay wechatPay) {
      this.wechatPay = wechatPay;
      return this;
    }

    /**
     * Zip gives your customers a way to split purchases over a series of payments. Check this <a
     * href="https://docs.stripe.com/payments/zip">page</a> for more details like country
     * availability.
     */
    public Builder setZip(PaymentMethodConfigurationCreateParams.Zip zip) {
      this.zip = zip;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Alma {
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

    private Alma(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Alma build() {
        return new PaymentMethodConfigurationCreateParams.Alma(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Alma.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Alma#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Alma#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Alma.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Alma.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Alma.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Alma.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.Alma.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
      public PaymentMethodConfigurationCreateParams.AmazonPay build() {
        return new PaymentMethodConfigurationCreateParams.AmazonPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.AmazonPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.AmazonPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.AmazonPay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.AmazonPay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.AmazonPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.AmazonPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.AmazonPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.AmazonPay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Billie {
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

    private Billie(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Billie build() {
        return new PaymentMethodConfigurationCreateParams.Billie(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Billie.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Billie#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Billie#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Billie.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Billie.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Billie.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Billie.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.Billie.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Crypto {
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

    private Crypto(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Crypto build() {
        return new PaymentMethodConfigurationCreateParams.Crypto(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Crypto.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Crypto#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Crypto#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Crypto.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Crypto.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Crypto.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Crypto.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.Crypto.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
      public PaymentMethodConfigurationCreateParams.CustomerBalance build() {
        return new PaymentMethodConfigurationCreateParams.CustomerBalance(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.CustomerBalance.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.CustomerBalance#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.CustomerBalance#extraParams} for the
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
        public PaymentMethodConfigurationCreateParams.CustomerBalance.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.CustomerBalance.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.CustomerBalance.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationCreateParams.CustomerBalance.DisplayPreference#extraParams} for
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
            PaymentMethodConfigurationCreateParams.CustomerBalance.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class FrMealVoucherConecs {
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

    private FrMealVoucherConecs(
        DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.FrMealVoucherConecs build() {
        return new PaymentMethodConfigurationCreateParams.FrMealVoucherConecs(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.FrMealVoucherConecs.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.FrMealVoucherConecs#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.FrMealVoucherConecs#extraParams} for the
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
        public PaymentMethodConfigurationCreateParams.FrMealVoucherConecs.DisplayPreference
            build() {
          return new PaymentMethodConfigurationCreateParams.FrMealVoucherConecs.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.FrMealVoucherConecs.DisplayPreference#extraParams}
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
         * PaymentMethodConfigurationCreateParams.FrMealVoucherConecs.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationCreateParams.FrMealVoucherConecs.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Gopay {
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

    private Gopay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Gopay build() {
        return new PaymentMethodConfigurationCreateParams.Gopay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Gopay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Gopay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Gopay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Gopay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Gopay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Gopay.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Gopay.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.Gopay.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class IdBankTransfer {
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

    private IdBankTransfer(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.IdBankTransfer build() {
        return new PaymentMethodConfigurationCreateParams.IdBankTransfer(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.IdBankTransfer.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.IdBankTransfer#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.IdBankTransfer#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.IdBankTransfer.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.IdBankTransfer.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.IdBankTransfer.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationCreateParams.IdBankTransfer.DisplayPreference#extraParams} for
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
            PaymentMethodConfigurationCreateParams.IdBankTransfer.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class KakaoPay {
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

    private KakaoPay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.KakaoPay build() {
        return new PaymentMethodConfigurationCreateParams.KakaoPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.KakaoPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.KakaoPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.KakaoPay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.KakaoPay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.KakaoPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.KakaoPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.KakaoPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.KakaoPay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class KrCard {
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

    private KrCard(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.KrCard build() {
        return new PaymentMethodConfigurationCreateParams.KrCard(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.KrCard.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.KrCard#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.KrCard#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.KrCard.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.KrCard.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.KrCard.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.KrCard.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.KrCard.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class MbWay {
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

    private MbWay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.MbWay build() {
        return new PaymentMethodConfigurationCreateParams.MbWay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.MbWay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.MbWay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.MbWay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.MbWay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.MbWay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.MbWay.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.MbWay.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.MbWay.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Mobilepay {
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

    private Mobilepay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Mobilepay build() {
        return new PaymentMethodConfigurationCreateParams.Mobilepay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Mobilepay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Mobilepay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Mobilepay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Mobilepay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Mobilepay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Mobilepay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Mobilepay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.Mobilepay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
      public PaymentMethodConfigurationCreateParams.Multibanco build() {
        return new PaymentMethodConfigurationCreateParams.Multibanco(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Multibanco.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Multibanco#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Multibanco#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Multibanco.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Multibanco.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Multibanco.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Multibanco.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.Multibanco.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
  public static class NaverPay {
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

    private NaverPay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.NaverPay build() {
        return new PaymentMethodConfigurationCreateParams.NaverPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.NaverPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.NaverPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.NaverPay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.NaverPay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.NaverPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.NaverPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.NaverPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.NaverPay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
  public static class NzBankAccount {
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

    private NzBankAccount(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.NzBankAccount build() {
        return new PaymentMethodConfigurationCreateParams.NzBankAccount(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.NzBankAccount.DisplayPreference
              displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.NzBankAccount#extraParams} for the field
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
       * See {@link PaymentMethodConfigurationCreateParams.NzBankAccount#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.NzBankAccount.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.NzBankAccount.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.NzBankAccount.DisplayPreference#extraParams} for
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
         * PaymentMethodConfigurationCreateParams.NzBankAccount.DisplayPreference#extraParams} for
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
            PaymentMethodConfigurationCreateParams.NzBankAccount.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class PayByBank {
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

    private PayByBank(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.PayByBank build() {
        return new PaymentMethodConfigurationCreateParams.PayByBank(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.PayByBank.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.PayByBank#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.PayByBank#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.PayByBank.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.PayByBank.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.PayByBank.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.PayByBank.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.PayByBank.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
  public static class Payco {
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

    private Payco(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Payco build() {
        return new PaymentMethodConfigurationCreateParams.Payco(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Payco.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Payco#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Payco#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Payco.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Payco.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Payco.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Payco.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.Payco.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Paypay {
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

    private Paypay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Paypay build() {
        return new PaymentMethodConfigurationCreateParams.Paypay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Paypay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Paypay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Paypay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Paypay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Paypay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Paypay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Paypay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.Paypay.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Payto {
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

    private Payto(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Payto build() {
        return new PaymentMethodConfigurationCreateParams.Payto(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Payto.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Payto#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Payto#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Payto.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Payto.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Payto.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Payto.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.Payto.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Pix {
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

    private Pix(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Pix build() {
        return new PaymentMethodConfigurationCreateParams.Pix(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Pix.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Pix#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Pix#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Pix.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Pix.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationCreateParams.Pix.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationCreateParams.Pix.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationCreateParams.Pix.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Qris {
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

    private Qris(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Qris build() {
        return new PaymentMethodConfigurationCreateParams.Qris(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Qris.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Qris#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Qris#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Qris.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Qris.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Qris.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Qris.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.Qris.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
      public PaymentMethodConfigurationCreateParams.RevolutPay build() {
        return new PaymentMethodConfigurationCreateParams.RevolutPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.RevolutPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.RevolutPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.RevolutPay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.RevolutPay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.RevolutPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.RevolutPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.RevolutPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.RevolutPay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
  public static class SamsungPay {
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

    private SamsungPay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.SamsungPay build() {
        return new PaymentMethodConfigurationCreateParams.SamsungPay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.SamsungPay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.SamsungPay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.SamsungPay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.SamsungPay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.SamsungPay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.SamsungPay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.SamsungPay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.SamsungPay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
  public static class Satispay {
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

    private Satispay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Satispay build() {
        return new PaymentMethodConfigurationCreateParams.Satispay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Satispay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Satispay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Satispay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Satispay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Satispay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Satispay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Satispay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.Satispay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Shopeepay {
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

    private Shopeepay(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Shopeepay build() {
        return new PaymentMethodConfigurationCreateParams.Shopeepay(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Shopeepay.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Shopeepay#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Shopeepay#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Shopeepay.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Shopeepay.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Shopeepay.DisplayPreference#extraParams} for the
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
         * PaymentMethodConfigurationCreateParams.Shopeepay.DisplayPreference#extraParams} for the
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
            PaymentMethodConfigurationCreateParams.Shopeepay.DisplayPreference.Preference
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
  public static class Swish {
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

    private Swish(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Swish build() {
        return new PaymentMethodConfigurationCreateParams.Swish(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Swish.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Swish#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Swish#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Swish.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Swish.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Swish.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Swish.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.Swish.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Twint {
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

    private Twint(DisplayPreference displayPreference, Map<String, Object> extraParams) {
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
      public PaymentMethodConfigurationCreateParams.Twint build() {
        return new PaymentMethodConfigurationCreateParams.Twint(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Twint.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Twint#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Twint#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Twint.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Twint.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentMethodConfigurationCreateParams.Twint.DisplayPreference#extraParams} for the field
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
         * PaymentMethodConfigurationCreateParams.Twint.DisplayPreference#extraParams} for the field
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
            PaymentMethodConfigurationCreateParams.Twint.DisplayPreference.Preference preference) {
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
  @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
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
      public PaymentMethodConfigurationCreateParams.Zip build() {
        return new PaymentMethodConfigurationCreateParams.Zip(
            this.displayPreference, this.extraParams);
      }

      /** Whether or not the payment method should be displayed. */
      public Builder setDisplayPreference(
          PaymentMethodConfigurationCreateParams.Zip.DisplayPreference displayPreference) {
        this.displayPreference = displayPreference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodConfigurationCreateParams.Zip#extraParams} for the field documentation.
       */
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
       * See {@link PaymentMethodConfigurationCreateParams.Zip#extraParams} for the field
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
        public PaymentMethodConfigurationCreateParams.Zip.DisplayPreference build() {
          return new PaymentMethodConfigurationCreateParams.Zip.DisplayPreference(
              this.extraParams, this.preference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodConfigurationCreateParams.Zip.DisplayPreference#extraParams}
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
         * map. See {@link PaymentMethodConfigurationCreateParams.Zip.DisplayPreference#extraParams}
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
            PaymentMethodConfigurationCreateParams.Zip.DisplayPreference.Preference preference) {
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
