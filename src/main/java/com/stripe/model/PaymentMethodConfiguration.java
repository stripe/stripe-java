// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentMethodConfigurationCreateParams;
import com.stripe.param.PaymentMethodConfigurationListParams;
import com.stripe.param.PaymentMethodConfigurationRetrieveParams;
import com.stripe.param.PaymentMethodConfigurationUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * PaymentMethodConfigurations control which payment methods are displayed to your customers when
 * you don't explicitly specify payment method types. You can have multiple configurations with
 * different sets of payment methods for different scenarios.
 *
 * <p>There are two types of PaymentMethodConfigurations. Which is used depends on the <a
 * href="https://stripe.com/docs/connect/charges">charge type</a>:
 *
 * <p><strong>Direct</strong> configurations apply to payments created on your account, including
 * Connect destination charges, Connect separate charges and transfers, and payments not involving
 * Connect.
 *
 * <p><strong>Child</strong> configurations apply to payments created on your connected accounts
 * using direct charges, and charges with the on_behalf_of parameter.
 *
 * <p>Child configurations have a {@code parent} that sets default values and controls which
 * settings connected accounts may override. You can specify a parent ID at payment time, and Stripe
 * will automatically resolve the connected account’s associated child configuration. Parent
 * configurations are <a
 * href="https://dashboard.stripe.com/settings/payment_methods/connected_accounts">managed in the
 * dashboard</a> and are not available in this API.
 *
 * <p>Related guides: - <a
 * href="https://stripe.com/docs/connect/payment-method-configurations">Payment Method
 * Configurations API</a> - <a
 * href="https://stripe.com/docs/payments/multiple-payment-method-configs">Multiple configurations
 * on dynamic payment methods</a> - <a
 * href="https://stripe.com/docs/connect/multiple-payment-method-configurations">Multiple
 * configurations for your Connect accounts</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethodConfiguration extends ApiResource implements HasId {
  @SerializedName("acss_debit")
  AcssDebit acssDebit;

  /** Whether the configuration can be used for new payments. */
  @SerializedName("active")
  Boolean active;

  @SerializedName("affirm")
  Affirm affirm;

  @SerializedName("afterpay_clearpay")
  AfterpayClearpay afterpayClearpay;

  @SerializedName("alipay")
  Alipay alipay;

  @SerializedName("alma")
  Alma alma;

  @SerializedName("amazon_pay")
  AmazonPay amazonPay;

  @SerializedName("apple_pay")
  ApplePay applePay;

  /** For child configs, the Connect application associated with the configuration. */
  @SerializedName("application")
  String application;

  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  @SerializedName("bacs_debit")
  BacsDebit bacsDebit;

  @SerializedName("bancontact")
  Bancontact bancontact;

  @SerializedName("billie")
  Billie billie;

  @SerializedName("blik")
  Blik blik;

  @SerializedName("boleto")
  Boleto boleto;

  @SerializedName("card")
  Card card;

  @SerializedName("cartes_bancaires")
  CartesBancaires cartesBancaires;

  @SerializedName("cashapp")
  Cashapp cashapp;

  @SerializedName("customer_balance")
  CustomerBalance customerBalance;

  @SerializedName("eps")
  Eps eps;

  @SerializedName("fpx")
  Fpx fpx;

  @SerializedName("giropay")
  Giropay giropay;

  @SerializedName("google_pay")
  GooglePay googlePay;

  @SerializedName("grabpay")
  Grabpay grabpay;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("ideal")
  Ideal ideal;

  /** The default configuration is used whenever a payment method configuration is not specified. */
  @SerializedName("is_default")
  Boolean isDefault;

  @SerializedName("jcb")
  Jcb jcb;

  @SerializedName("kakao_pay")
  KakaoPay kakaoPay;

  @SerializedName("klarna")
  Klarna klarna;

  @SerializedName("konbini")
  Konbini konbini;

  @SerializedName("kr_card")
  KrCard krCard;

  @SerializedName("link")
  Link link;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("mobilepay")
  Mobilepay mobilepay;

  @SerializedName("multibanco")
  Multibanco multibanco;

  /** The configuration's name. */
  @SerializedName("name")
  String name;

  @SerializedName("naver_pay")
  NaverPay naverPay;

  @SerializedName("nz_bank_account")
  NzBankAccount nzBankAccount;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_method_configuration}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("oxxo")
  Oxxo oxxo;

  @SerializedName("p24")
  P24 p24;

  /** For child configs, the configuration's parent configuration. */
  @SerializedName("parent")
  String parent;

  @SerializedName("pay_by_bank")
  PayByBank payByBank;

  @SerializedName("payco")
  Payco payco;

  @SerializedName("paynow")
  Paynow paynow;

  @SerializedName("paypal")
  Paypal paypal;

  @SerializedName("pix")
  Pix pix;

  @SerializedName("promptpay")
  Promptpay promptpay;

  @SerializedName("revolut_pay")
  RevolutPay revolutPay;

  @SerializedName("samsung_pay")
  SamsungPay samsungPay;

  @SerializedName("satispay")
  Satispay satispay;

  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  @SerializedName("sofort")
  Sofort sofort;

  @SerializedName("swish")
  Swish swish;

  @SerializedName("twint")
  Twint twint;

  @SerializedName("us_bank_account")
  UsBankAccount usBankAccount;

  @SerializedName("wechat_pay")
  WechatPay wechatPay;

  @SerializedName("zip")
  Zip zip;

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(Map<String, Object> params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_configurations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentMethodConfiguration.class);
  }

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(PaymentMethodConfigurationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(
      PaymentMethodConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_method_configurations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentMethodConfiguration.class);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_configurations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentMethodConfigurationCollection.class);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(
      PaymentMethodConfigurationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(
      PaymentMethodConfigurationListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_configurations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentMethodConfigurationCollection.class);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(String configuration) throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, options);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(
      String configuration, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentMethodConfiguration.class);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(
      String configuration, PaymentMethodConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(configuration));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentMethodConfiguration.class);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentMethodConfiguration.class);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(PaymentMethodConfigurationUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(
      PaymentMethodConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentMethodConfiguration.class);
  }

  /**
   * For more details about AcssDebit, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AcssDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Affirm, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Affirm extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about AfterpayClearpay, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AfterpayClearpay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Alipay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Alipay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Alma, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Alma extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about AmazonPay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmazonPay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about ApplePay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ApplePay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about AuBecsDebit, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecsDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about BacsDebit, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BacsDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Bancontact, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Bancontact extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Billie, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Billie extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Blik, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Blik extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Boleto, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Boleto extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Card extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about CartesBancaires, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CartesBancaires extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Cashapp, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Cashapp extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about CustomerBalance, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerBalance extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Eps, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Eps extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Fpx, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fpx extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Giropay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Giropay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about GooglePay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class GooglePay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Grabpay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Grabpay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Ideal, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Ideal extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Jcb, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Jcb extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about KakaoPay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class KakaoPay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Klarna extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Konbini, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Konbini extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about KrCard, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class KrCard extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Link extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Mobilepay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Mobilepay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Multibanco, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Multibanco extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about NaverPay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NaverPay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about NzBankAccount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NzBankAccount extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Oxxo, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Oxxo extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about P24, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class P24 extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about PayByBank, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PayByBank extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Payco, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payco extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Paynow, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Paynow extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Paypal extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Pix, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Pix extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Promptpay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Promptpay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about RevolutPay, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RevolutPay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about SamsungPay, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SamsungPay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Satispay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Satispay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about SepaDebit, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Sofort, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Sofort extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Swish, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Swish extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Twint, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Twint extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about UsBankAccount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsBankAccount extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about WechatPay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class WechatPay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  /**
   * For more details about Zip, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Zip extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    /**
     * For more details about DisplayPreference, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configs, whether or not the account's preference will be observed. If {@code
       * false}, the parent configuration's default is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(acssDebit, responseGetter);
    trySetResponseGetter(affirm, responseGetter);
    trySetResponseGetter(afterpayClearpay, responseGetter);
    trySetResponseGetter(alipay, responseGetter);
    trySetResponseGetter(alma, responseGetter);
    trySetResponseGetter(amazonPay, responseGetter);
    trySetResponseGetter(applePay, responseGetter);
    trySetResponseGetter(auBecsDebit, responseGetter);
    trySetResponseGetter(bacsDebit, responseGetter);
    trySetResponseGetter(bancontact, responseGetter);
    trySetResponseGetter(billie, responseGetter);
    trySetResponseGetter(blik, responseGetter);
    trySetResponseGetter(boleto, responseGetter);
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(cartesBancaires, responseGetter);
    trySetResponseGetter(cashapp, responseGetter);
    trySetResponseGetter(customerBalance, responseGetter);
    trySetResponseGetter(eps, responseGetter);
    trySetResponseGetter(fpx, responseGetter);
    trySetResponseGetter(giropay, responseGetter);
    trySetResponseGetter(googlePay, responseGetter);
    trySetResponseGetter(grabpay, responseGetter);
    trySetResponseGetter(ideal, responseGetter);
    trySetResponseGetter(jcb, responseGetter);
    trySetResponseGetter(kakaoPay, responseGetter);
    trySetResponseGetter(klarna, responseGetter);
    trySetResponseGetter(konbini, responseGetter);
    trySetResponseGetter(krCard, responseGetter);
    trySetResponseGetter(link, responseGetter);
    trySetResponseGetter(mobilepay, responseGetter);
    trySetResponseGetter(multibanco, responseGetter);
    trySetResponseGetter(naverPay, responseGetter);
    trySetResponseGetter(nzBankAccount, responseGetter);
    trySetResponseGetter(oxxo, responseGetter);
    trySetResponseGetter(p24, responseGetter);
    trySetResponseGetter(payByBank, responseGetter);
    trySetResponseGetter(payco, responseGetter);
    trySetResponseGetter(paynow, responseGetter);
    trySetResponseGetter(paypal, responseGetter);
    trySetResponseGetter(pix, responseGetter);
    trySetResponseGetter(promptpay, responseGetter);
    trySetResponseGetter(revolutPay, responseGetter);
    trySetResponseGetter(samsungPay, responseGetter);
    trySetResponseGetter(satispay, responseGetter);
    trySetResponseGetter(sepaDebit, responseGetter);
    trySetResponseGetter(sofort, responseGetter);
    trySetResponseGetter(swish, responseGetter);
    trySetResponseGetter(twint, responseGetter);
    trySetResponseGetter(usBankAccount, responseGetter);
    trySetResponseGetter(wechatPay, responseGetter);
    trySetResponseGetter(zip, responseGetter);
  }
}
