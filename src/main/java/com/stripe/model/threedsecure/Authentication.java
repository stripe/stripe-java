// File generated from our OpenAPI spec
package com.stripe.model.threedsecure;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.PaymentMethod;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.threedsecure.AuthenticationCancelParams;
import com.stripe.param.threedsecure.AuthenticationCreateParams;
import com.stripe.param.threedsecure.AuthenticationListParams;
import com.stripe.param.threedsecure.AuthenticationRetrieveParams;
import com.stripe.param.threedsecure.AuthenticationSubmitParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The Standalone 3DS API allows you to run EMV 3D Secure (3DS) authentication using Stripe while
 * authorizing the payment with any PSP.
 *
 * <p>Related guide: <a href="https://stripe.com/payments/3d-secure/standalone-3d-secure">Standalone
 * 3DS</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Authentication extends ApiResource implements HasId {
  /** Contains additional details about the acquirer for a 3DS Authentication. */
  @SerializedName("acquirer_details")
  AcquirerDetails acquirerDetails;

  /** The amount for this 3DS Authentication. */
  @SerializedName("amount")
  Long amount;

  /**
   * The URL for presenting a challenge to your cardholder, present if status is requires_challenge.
   */
  @SerializedName("challenge_url")
  String challengeUrl;

  /** Contains details on the channel used (browser, 3RI) for a standalone 3DS Authentication. */
  @SerializedName("channel")
  Channel channel;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The 3DS directory server with which this 3DS Authentication was processed.
   *
   * <p>One of {@code american_express}, {@code cartes_bancaires}, {@code discover}, {@code
   * mastercard}, or {@code visa}.
   */
  @SerializedName("directory_server")
  String directoryServer;

  /**
   * The URL for performing issuer fingerprinting, present if fingerprinting is supported for the
   * given payment method.
   */
  @SerializedName("fingerprinting_url")
  String fingerprintingUrl;

  /** Contains details of the flow preference used for a standalone 3DS Authentication. */
  @SerializedName("flow_preference")
  FlowPreference flowPreference;

  /** Contains information about the future authorisations related to this authentication. */
  @SerializedName("future_usage")
  FutureUsage futureUsage;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Indicates whether this 3DS Authentication is being performed for a payment or non-payment use
   * case.
   *
   * <p>One of {@code non_payment_authentication}, or {@code payment_authentication}.
   */
  @SerializedName("message_category")
  String messageCategory;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code three_d_secure.authentication}.
   */
  @SerializedName("object")
  String object;

  /**
   * The outcome of this 3DS Authentication.
   *
   * <p>One of {@code abandoned}, {@code attempt_acknowledged}, {@code authenticated}, {@code
   * canceled}, {@code denied}, {@code informational}, {@code internal_error}, {@code
   * not_supported}, {@code not_triggered}, {@code processing_error}, or {@code rejected}.
   */
  @SerializedName("outcome")
  String outcome;

  /** Contains details on the result for a standalone 3DS Authentication. */
  @SerializedName("outcome_details")
  OutcomeDetails outcomeDetails;

  /** ID of the payment method (a PaymentMethod object) to attach to this 3DS Authentication. */
  @SerializedName("payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> paymentMethod;

  /**
   * The reason for invoking this 3DS Authentication.
   *
   * <p>One of {@code cardholder_authentication}, {@code issuer_requested}, {@code liability_shift},
   * {@code processing_costs}, or {@code regulatory_compliance}.
   */
  @SerializedName("reason")
  String reason;

  /** Contains details about the shipping address for a 3DS Authentication. */
  @SerializedName("shipping_address")
  ShippingAddress shippingAddress;

  /**
   * Status of this Authentication.
   *
   * <p>One of {@code canceled}, {@code error}, {@code failed}, {@code requires_challenge}, {@code
   * requires_submission}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Get ID of expandable {@code paymentMethod} object. */
  public String getPaymentMethod() {
    return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
  }

  public void setPaymentMethod(String id) {
    this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
  }

  /** Get expanded {@code paymentMethod}. */
  public PaymentMethod getPaymentMethodObject() {
    return (this.paymentMethod != null) ? this.paymentMethod.getExpanded() : null;
  }

  public void setPaymentMethodObject(PaymentMethod expandableObject) {
    this.paymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Authentication.class);
  }

  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(AuthenticationCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * This endpoint cancels a 3DS Authentication. You can cancel a 3DS Authentication object when
   * it’s in a non-final status: {@code requires_submission} or {@code requires_challenge}.
   */
  public Authentication cancel(AuthenticationCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Authentication.class);
  }

  /**
   * This endpoint creates a 3DS Authentication. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#create-a-3ds-authentication-object">Create
   * a 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   *
   * <p>You can pass the submit parameter to automatically submit the 3DS Authentication object when
   * you create it. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit at
   * creation section of the Standalone 3DS guide</a> for more information.
   */
  public static Authentication create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This endpoint creates a 3DS Authentication. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#create-a-3ds-authentication-object">Create
   * a 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   *
   * <p>You can pass the submit parameter to automatically submit the 3DS Authentication object when
   * you create it. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit at
   * creation section of the Standalone 3DS guide</a> for more information.
   */
  public static Authentication create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/three_d_secure/authentications";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Authentication.class);
  }

  /**
   * This endpoint creates a 3DS Authentication. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#create-a-3ds-authentication-object">Create
   * a 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   *
   * <p>You can pass the submit parameter to automatically submit the 3DS Authentication object when
   * you create it. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit at
   * creation section of the Standalone 3DS guide</a> for more information.
   */
  public static Authentication create(AuthenticationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This endpoint creates a 3DS Authentication. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#create-a-3ds-authentication-object">Create
   * a 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   *
   * <p>You can pass the submit parameter to automatically submit the 3DS Authentication object when
   * you create it. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit at
   * creation section of the Standalone 3DS guide</a> for more information.
   */
  public static Authentication create(AuthenticationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/three_d_secure/authentications";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Authentication.class);
  }

  /** Returns a list of 3D Secure Authentications. */
  public static AuthenticationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of 3D Secure Authentications. */
  public static AuthenticationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/three_d_secure/authentications";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AuthenticationCollection.class);
  }

  /** Returns a list of 3D Secure Authentications. */
  public static AuthenticationCollection list(AuthenticationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of 3D Secure Authentications. */
  public static AuthenticationCollection list(
      AuthenticationListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/three_d_secure/authentications";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AuthenticationCollection.class);
  }

  /** This endpoint retrieves a 3DS Authentication. */
  public static Authentication retrieve(String authentication) throws StripeException {
    return retrieve(authentication, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** This endpoint retrieves a 3DS Authentication. */
  public static Authentication retrieve(String authentication, RequestOptions options)
      throws StripeException {
    return retrieve(authentication, (Map<String, Object>) null, options);
  }

  /** This endpoint retrieves a 3DS Authentication. */
  public static Authentication retrieve(
      String authentication, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s", ApiResource.urlEncodeId(authentication));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Authentication.class);
  }

  /** This endpoint retrieves a 3DS Authentication. */
  public static Authentication retrieve(
      String authentication, AuthenticationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s", ApiResource.urlEncodeId(authentication));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Authentication.class);
  }

  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit() throws StripeException {
    return submit((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(RequestOptions options) throws StripeException {
    return submit((Map<String, Object>) null, options);
  }

  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(Map<String, Object> params) throws StripeException {
    return submit(params, (RequestOptions) null);
  }

  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s/submit", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Authentication.class);
  }

  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(AuthenticationSubmitParams params) throws StripeException {
    return submit(params, (RequestOptions) null);
  }

  /**
   * This endpoint submits a 3DS Authentication. You can submit a 3DS Authentication object when it
   * has status {@code requires_submission}. Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-the-3ds-authentication-object">Submit
   * the 3DS Authentication object section of the Standalone 3DS guide</a> for more information.
   */
  public Authentication submit(AuthenticationSubmitParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/three_d_secure/authentications/%s/submit", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Authentication.class);
  }

  /** Contains additional details about the acquirer for a 3DS Authentication. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AcquirerDetails extends StripeObject {
    /** The Acquirer BIN (specific to the directory_server). */
    @SerializedName("acquirer_bin")
    String acquirerBin;

    /**
     * The two-letter country code of the acquirer (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
    @SerializedName("acquirer_country")
    String acquirerCountry;

    /**
     * The Merchant ID (or Card Acceptor ID) that your acquirer assigned you (specific to the
     * directory_server).
     */
    @SerializedName("acquirer_merchant_id")
    String acquirerMerchantId;

    /**
     * The <a href="https://en.wikipedia.org/wiki/Merchant_category_code">merchant category code</a>
     * as defined by each payment system or directory server.
     */
    @SerializedName("mcc")
    String mcc;

    /**
     * The merchant name assigned by the acquirer or payment system. Same name used in the
     * authorization message as defined in <a href="https://en.wikipedia.org/wiki/ISO_8583">ISO
     * 8583</a>.
     */
    @SerializedName("merchant_name")
    String merchantName;

    /**
     * Requestor ID if you’re enrolled in the card network’s 3DS program. Otherwise, you can omit
     * this field because Stripe assigns a Requestor ID with the card networks.
     */
    @SerializedName("requestor_id")
    String requestorId;
  }

  /** Contains details on the channel used (browser, 3RI) for a standalone 3DS Authentication. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Channel extends StripeObject {
    /** Contains details on the browser for a standalone 3DS Authentication. */
    @SerializedName("browser")
    Browser browser;

    /** Contains details for a 3RI standalone 3DS Authentication. */
    @SerializedName("three_r_i")
    ThreeRI threeRI;

    /**
     * Type of channel you would prefer to use for this 3DS Authentication. Only browser.
     *
     * <p>One of {@code browser}, or {@code three_r_i}.
     */
    @SerializedName("type")
    String type;

    /** Contains details on the browser for a standalone 3DS Authentication. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Browser extends StripeObject {
      /** The HTTP accept headers from the cardholder's browser. */
      @SerializedName("accept_header")
      String acceptHeader;

      /** The color depth of the cardholder’s screen. */
      @SerializedName("color_depth")
      Long colorDepth;

      /** The IP address of the browser. */
      @SerializedName("ip_address")
      String ipAddress;

      /** The cardholder browser’s ability to execute Java. */
      @SerializedName("java_enabled")
      Boolean javaEnabled;

      /** The cardholder browser’s ability to execute JavaScript. */
      @SerializedName("javascript_enabled")
      Boolean javascriptEnabled;

      /** An IETF BCP 47 language tag representing the browser language. */
      @SerializedName("language")
      String language;

      /** The total height of the cardholder’s screen in pixels. */
      @SerializedName("screen_height")
      Long screenHeight;

      /** The total width of the cardholder’s screen in pixels. */
      @SerializedName("screen_width")
      Long screenWidth;

      /**
       * The time difference between UTC time and the local time of the cardholder’s browser, in
       * minutes.
       */
      @SerializedName("timezone_offset")
      Long timezoneOffset;

      /** The browser user agent. */
      @SerializedName("user_agent")
      String userAgent;
    }

    /** Contains details for a 3RI standalone 3DS Authentication. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ThreeRI extends StripeObject {
      /** ID of the previous initial authenticated 3DS Authentication object. */
      @SerializedName("previous_authentication")
      String previousAuthentication;

      /**
       * Type of the 3RI Authentication.
       *
       * <p>One of {@code delayed_shipment}, {@code other_payment}, {@code recurring}, or {@code
       * split_shipment}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /** Contains details of the flow preference used for a standalone 3DS Authentication. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FlowPreference extends StripeObject {
    @SerializedName("challenge")
    Challenge challenge;

    @SerializedName("data_share")
    DataShare dataShare;

    @SerializedName("frictionless")
    Frictionless frictionless;

    /**
     * Type of flow you requested for this 3DS Authentication.
     *
     * <p>One of {@code challenge}, {@code data_share}, or {@code frictionless}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Challenge, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Challenge extends StripeObject {
      /**
       * Type of challenge flow you requested for this 3DS Authentication.
       *
       * <p>One of {@code mandated}, or {@code preferred}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about DataShare, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DataShare extends StripeObject {
      /**
       * Type of data share flow you requested for this 3DS Authentication.
       *
       * <p>One of {@code ds_specific}, or {@code emv_standard}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about Frictionless, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Frictionless extends StripeObject {
      /**
       * Type of frictionless flow you requested for this 3DS Authentication.
       *
       * <p>One of {@code low_risk}, or {@code none}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /** Contains information about the future authorisations related to this authentication. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FutureUsage extends StripeObject {
    /** Details about installment payments. */
    @SerializedName("installment")
    Installment installment;

    /** Details about recurring payments. */
    @SerializedName("recurring")
    Recurring recurring;

    /**
     * The type of future usage declared for this 3DS Authentication.
     *
     * <p>One of {@code card_on_file}, {@code installment}, or {@code recurring}.
     */
    @SerializedName("type")
    String type;

    /** Details about installment payments. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Installment extends StripeObject {
      /**
       * A non-negative integer representing the amount in the <a
       * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /** Information about recurring payment expiry. */
      @SerializedName("expiry")
      Expiry expiry;

      /**
       * The unit of time for {@code interval_count}.
       *
       * <p>Equal to {@code day}.
       */
      @SerializedName("interval")
      String interval;

      /** The minimum number of time intervals between authorizations. */
      @SerializedName("interval_count")
      Long intervalCount;

      /** The maximum number of installments. */
      @SerializedName("number")
      Long number;

      /** Information about recurring payment expiry. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Expiry extends StripeObject {
        @SerializedName("date")
        String date;

        @SerializedName("type")
        String type;
      }
    }

    /** Details about recurring payments. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Recurring extends StripeObject {
      /**
       * A non-negative integer representing the amount in the <a
       * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /** Information about recurring payment expiry. */
      @SerializedName("expiry")
      Expiry expiry;

      /**
       * The unit of time for {@code interval_count}.
       *
       * <p>Equal to {@code day}.
       */
      @SerializedName("interval")
      String interval;

      /** The minimum number of time intervals between authorizations. */
      @SerializedName("interval_count")
      Long intervalCount;

      /** Information about recurring payment expiry. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Expiry extends StripeObject {
        @SerializedName("date")
        String date;

        @SerializedName("type")
        String type;
      }
    }
  }

  /** Contains details on the result for a standalone 3DS Authentication. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OutcomeDetails extends StripeObject {
    /**
     * Universally unique transaction identifier assigned by the issuer to identify the transaction.
     */
    @SerializedName("acs_transaction_id")
    String acsTransactionId;

    /** The Authentication Response Message (ARes) is the issuer's response to the AReq message. */
    @SerializedName("ares")
    String ares;

    /**
     * TransStatus field on the ARes
     *
     * <p>One of {@code A}, {@code C}, {@code D}, {@code I}, {@code N}, {@code R}, {@code S}, {@code
     * U}, or {@code Y}.
     */
    @SerializedName("ares_trans_status")
    String aresTransStatus;

    /**
     * A 28-character Base64 string proving that 3DS was completed. Store this value securely, and
     * don’t reuse it for multiple authorizations.
     */
    @SerializedName("cryptogram")
    String cryptogram;

    /** The 3DS2 Directory Server Transaction ID. */
    @SerializedName("ds_transaction_id")
    String dsTransactionId;

    /**
     * Electronic Commerce Indicator provided by the issuer to indicate the result of this 3DS
     * Authentication.
     */
    @SerializedName("eci")
    String eci;

    /** Contains details specific to the individual network. */
    @SerializedName("network_details")
    NetworkDetails networkDetails;

    /**
     * The 3DS protocol version used for this 3DS Authentication.
     *
     * <p>One of {@code 2.1.0}, {@code 2.2.0}, or {@code 2.3.1}.
     */
    @SerializedName("protocol_version")
    String protocolVersion;

    /**
     * The indicator provided to the issuer by Stripe in the AReq that indicates whether a challenge
     * is requested for this Authentication. This indicator should match the flow_preference you
     * specified but may be overridden (for compliance reasons for example).
     *
     * <p>One of {@code 01}, {@code 02}, {@code 03}, {@code 04}, {@code 05}, or {@code 06}.
     */
    @SerializedName("requestor_challenge_indicator")
    String requestorChallengeIndicator;

    /**
     * The Results Request Message (RReq) communicates the results of the authentication or
     * verification.
     */
    @SerializedName("rreq")
    String rreq;

    /**
     * TransStatus field on the RReq
     *
     * <p>One of {@code A}, {@code C}, {@code D}, {@code I}, {@code N}, {@code R}, {@code S}, {@code
     * U}, or {@code Y}.
     */
    @SerializedName("rreq_trans_status")
    String rreqTransStatus;

    /** Universally unique transaction identifier assigned by Stripe to identify the transaction. */
    @SerializedName("three_ds_server_transaction_id")
    String threeDsServerTransactionId;

    /** Contains details specific to the individual network. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NetworkDetails extends StripeObject {
      /** Contains details for Cartes Bancaires specific fields in the authentication outcomes. */
      @SerializedName("cartes_bancaires")
      CartesBancaires cartesBancaires;

      /** Contains details for Cartes Bancaires specific fields in the authentication outcomes. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CartesBancaires extends StripeObject {
        /**
         * The cryptogram calculation algorithm used by the card Issuer's ACS to calculate the
         * Authentication cryptogram. Also known as cavvAlgorithm. ARes/RReq messageExtension:
         * {@code CB-AVALGO}
         */
        @SerializedName("avalgo")
        String avalgo;

        /**
         * The exemption indicator returned from Cartes Bancaires in the ARes. This is a 3 byte
         * bitmap (lowest significant byte first and most significant bit first) that has been
         * Base64 encoded. String (4 characters). ARes message extension: {@code CB-EXEMPTION}
         */
        @SerializedName("cb_exemption")
        String cbExemption;

        /**
         * The risk score returned from Cartes Bancaires in the ARes. Numeric value 0-99. ARes/RReq
         * message extension: {@code CB-SCORE}
         */
        @SerializedName("cb_score")
        String cbScore;
      }
    }
  }

  /** Contains details about the shipping address for a 3DS Authentication. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingAddress extends StripeObject {
    /** City, district, suburb, town, or village. */
    @SerializedName("city")
    String city;

    /**
     * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a>).
     */
    @SerializedName("country")
    String country;

    /** Address line 1, such as the street, PO Box, or company name. */
    @SerializedName("line1")
    String line1;

    /** Address line 2, such as the apartment, suite, unit, or building. */
    @SerializedName("line2")
    String line2;

    /** ZIP or postal code. */
    @SerializedName("postal_code")
    String postalCode;

    /**
     * State, county, province, or region (<a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO
     * 3166-2</a>).
     */
    @SerializedName("state")
    String state;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(acquirerDetails, responseGetter);
    trySetResponseGetter(channel, responseGetter);
    trySetResponseGetter(flowPreference, responseGetter);
    trySetResponseGetter(futureUsage, responseGetter);
    trySetResponseGetter(outcomeDetails, responseGetter);
    trySetResponseGetter(paymentMethod, responseGetter);
    trySetResponseGetter(shippingAddress, responseGetter);
  }
}
