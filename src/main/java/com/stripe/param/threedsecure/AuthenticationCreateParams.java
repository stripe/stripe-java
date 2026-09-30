// File generated from our OpenAPI spec
package com.stripe.param.threedsecure;

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
public class AuthenticationCreateParams extends ApiRequestParams {
  /**
   * Contains additional details about the acquirer for this 3DS Authentication.
   *
   * <p>Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#pass-acquirer-details-and-directory-server">Pass
   * acquirer details and directory server section of the standalone 3DS guide</a> for more
   * information.
   */
  @SerializedName("acquirer_details")
  AcquirerDetails acquirerDetails;

  /**
   * A non-negative integer representing the amount in the <a
   * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>. You can't include
   * this parameter if {@code message_category} is {@code non_payment_authentication}
   */
  @SerializedName("amount")
  Long amount;

  /**
   * <strong>Required.</strong> Contains additional details on the channel used for this 3DS
   * Authentication.
   */
  @SerializedName("channel")
  Channel channel;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The 3DS directory server with which this 3DS Authentication was processed. */
  @SerializedName("directory_server")
  DirectoryServer directoryServer;

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
   * Contains additional details on your flow preference for this 3DS Authentication.
   *
   * <p>Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#specify-a-flow-preference">Specify
   * a flow preference section of the standalone 3DS guide</a> for more information.
   */
  @SerializedName("flow_preference")
  FlowPreference flowPreference;

  /** Contains information about future usage of this 3DS Authentication. */
  @SerializedName("future_usage")
  FutureUsage futureUsage;

  /**
   * <strong>Required.</strong> Indicates whether this 3DS Authentication is being performed for a
   * payment or non-payment use case.
   */
  @SerializedName("message_category")
  MessageCategory messageCategory;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** ID of the payment method (a PaymentMethod object) to attach to this 3DS Authentication. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * Hash used to generate the PaymentMethod to be used for this Authentication. This is mutually
   * exclusive with the {@code payment_method} parameter.
   */
  @SerializedName("payment_method_data")
  PaymentMethodData paymentMethodData;

  /**
   * The reason for invoking standalone 3DS. This is tailored specifically for cases when you want
   * Stripe to help determine the standalone 3DS flow to fit your use case instead of needing to
   * select a specific 3DS flow.
   *
   * <p>This parameter is exclusive with {@code flow_preference}. You can either use {@code reason}
   * for controlling 3DS according to your business requirements, or use {@code flow_preference} for
   * having fine-grained control over your 3DS flow preference.
   */
  @SerializedName("reason")
  Reason reason;

  /**
   * The shipping address requested by the cardholder. You should try to include as complete address
   * information as possible.
   */
  @SerializedName("shipping_address")
  ShippingAddress shippingAddress;

  /**
   * Set to {@code always} to skip the fingerprinting step and submit this Authentication
   * immediately or {@code if_fingerprinting_not_supported} to submit this Authentication only if
   * fingerprinting is not available. This parameter defaults to {@code never}.
   *
   * <p>Refer to the <a
   * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit at
   * creation section of the standalone 3DS guide</a> for more information.
   */
  @SerializedName("submit")
  Submit submit;

  private AuthenticationCreateParams(
      AcquirerDetails acquirerDetails,
      Long amount,
      Channel channel,
      String currency,
      DirectoryServer directoryServer,
      List<String> expand,
      Map<String, Object> extraParams,
      FlowPreference flowPreference,
      FutureUsage futureUsage,
      MessageCategory messageCategory,
      Object metadata,
      String paymentMethod,
      PaymentMethodData paymentMethodData,
      Reason reason,
      ShippingAddress shippingAddress,
      Submit submit) {
    this.acquirerDetails = acquirerDetails;
    this.amount = amount;
    this.channel = channel;
    this.currency = currency;
    this.directoryServer = directoryServer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.flowPreference = flowPreference;
    this.futureUsage = futureUsage;
    this.messageCategory = messageCategory;
    this.metadata = metadata;
    this.paymentMethod = paymentMethod;
    this.paymentMethodData = paymentMethodData;
    this.reason = reason;
    this.shippingAddress = shippingAddress;
    this.submit = submit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AcquirerDetails acquirerDetails;

    private Long amount;

    private Channel channel;

    private String currency;

    private DirectoryServer directoryServer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FlowPreference flowPreference;

    private FutureUsage futureUsage;

    private MessageCategory messageCategory;

    private Object metadata;

    private String paymentMethod;

    private PaymentMethodData paymentMethodData;

    private Reason reason;

    private ShippingAddress shippingAddress;

    private Submit submit;

    /** Finalize and obtain parameter instance from this builder. */
    public AuthenticationCreateParams build() {
      return new AuthenticationCreateParams(
          this.acquirerDetails,
          this.amount,
          this.channel,
          this.currency,
          this.directoryServer,
          this.expand,
          this.extraParams,
          this.flowPreference,
          this.futureUsage,
          this.messageCategory,
          this.metadata,
          this.paymentMethod,
          this.paymentMethodData,
          this.reason,
          this.shippingAddress,
          this.submit);
    }

    /**
     * Contains additional details about the acquirer for this 3DS Authentication.
     *
     * <p>Refer to the <a
     * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#pass-acquirer-details-and-directory-server">Pass
     * acquirer details and directory server section of the standalone 3DS guide</a> for more
     * information.
     */
    public Builder setAcquirerDetails(AuthenticationCreateParams.AcquirerDetails acquirerDetails) {
      this.acquirerDetails = acquirerDetails;
      return this;
    }

    /**
     * A non-negative integer representing the amount in the <a
     * href="https://stripe.com/currencies#zero-decimal">smallest currency unit</a>. You can't
     * include this parameter if {@code message_category} is {@code non_payment_authentication}
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <strong>Required.</strong> Contains additional details on the channel used for this 3DS
     * Authentication.
     */
    public Builder setChannel(AuthenticationCreateParams.Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** The 3DS directory server with which this 3DS Authentication was processed. */
    public Builder setDirectoryServer(AuthenticationCreateParams.DirectoryServer directoryServer) {
      this.directoryServer = directoryServer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthenticationCreateParams#expand} for the field documentation.
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
     * AuthenticationCreateParams#expand} for the field documentation.
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
     * AuthenticationCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link AuthenticationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Contains additional details on your flow preference for this 3DS Authentication.
     *
     * <p>Refer to the <a
     * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#specify-a-flow-preference">Specify
     * a flow preference section of the standalone 3DS guide</a> for more information.
     */
    public Builder setFlowPreference(AuthenticationCreateParams.FlowPreference flowPreference) {
      this.flowPreference = flowPreference;
      return this;
    }

    /** Contains information about future usage of this 3DS Authentication. */
    public Builder setFutureUsage(AuthenticationCreateParams.FutureUsage futureUsage) {
      this.futureUsage = futureUsage;
      return this;
    }

    /**
     * <strong>Required.</strong> Indicates whether this 3DS Authentication is being performed for a
     * payment or non-payment use case.
     */
    public Builder setMessageCategory(AuthenticationCreateParams.MessageCategory messageCategory) {
      this.messageCategory = messageCategory;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * AuthenticationCreateParams#metadata} for the field documentation.
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
     * See {@link AuthenticationCreateParams#metadata} for the field documentation.
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

    /** ID of the payment method (a PaymentMethod object) to attach to this 3DS Authentication. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Hash used to generate the PaymentMethod to be used for this Authentication. This is mutually
     * exclusive with the {@code payment_method} parameter.
     */
    public Builder setPaymentMethodData(
        AuthenticationCreateParams.PaymentMethodData paymentMethodData) {
      this.paymentMethodData = paymentMethodData;
      return this;
    }

    /**
     * The reason for invoking standalone 3DS. This is tailored specifically for cases when you want
     * Stripe to help determine the standalone 3DS flow to fit your use case instead of needing to
     * select a specific 3DS flow.
     *
     * <p>This parameter is exclusive with {@code flow_preference}. You can either use {@code
     * reason} for controlling 3DS according to your business requirements, or use {@code
     * flow_preference} for having fine-grained control over your 3DS flow preference.
     */
    public Builder setReason(AuthenticationCreateParams.Reason reason) {
      this.reason = reason;
      return this;
    }

    /**
     * The shipping address requested by the cardholder. You should try to include as complete
     * address information as possible.
     */
    public Builder setShippingAddress(AuthenticationCreateParams.ShippingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * Set to {@code always} to skip the fingerprinting step and submit this Authentication
     * immediately or {@code if_fingerprinting_not_supported} to submit this Authentication only if
     * fingerprinting is not available. This parameter defaults to {@code never}.
     *
     * <p>Refer to the <a
     * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#submit-at-creation">Submit
     * at creation section of the standalone 3DS guide</a> for more information.
     */
    public Builder setSubmit(AuthenticationCreateParams.Submit submit) {
      this.submit = submit;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AcquirerDetails {
    /** <strong>Required.</strong> The Acquirer BIN (specific to the directory_server). */
    @SerializedName("acquirer_bin")
    String acquirerBin;

    /**
     * <strong>Required.</strong> The two-letter country code of the acquirer (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
    @SerializedName("acquirer_country")
    String acquirerCountry;

    /**
     * <strong>Required.</strong> The Merchant ID (or Card Acceptor ID) that your acquirer assigned
     * you (specific to the directory_server).
     */
    @SerializedName("acquirer_merchant_id")
    String acquirerMerchantId;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

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

    private AcquirerDetails(
        String acquirerBin,
        String acquirerCountry,
        String acquirerMerchantId,
        Map<String, Object> extraParams,
        String mcc,
        String merchantName,
        String requestorId) {
      this.acquirerBin = acquirerBin;
      this.acquirerCountry = acquirerCountry;
      this.acquirerMerchantId = acquirerMerchantId;
      this.extraParams = extraParams;
      this.mcc = mcc;
      this.merchantName = merchantName;
      this.requestorId = requestorId;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String acquirerBin;

      private String acquirerCountry;

      private String acquirerMerchantId;

      private Map<String, Object> extraParams;

      private String mcc;

      private String merchantName;

      private String requestorId;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthenticationCreateParams.AcquirerDetails build() {
        return new AuthenticationCreateParams.AcquirerDetails(
            this.acquirerBin,
            this.acquirerCountry,
            this.acquirerMerchantId,
            this.extraParams,
            this.mcc,
            this.merchantName,
            this.requestorId);
      }

      /** <strong>Required.</strong> The Acquirer BIN (specific to the directory_server). */
      public Builder setAcquirerBin(String acquirerBin) {
        this.acquirerBin = acquirerBin;
        return this;
      }

      /**
       * <strong>Required.</strong> The two-letter country code of the acquirer (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setAcquirerCountry(String acquirerCountry) {
        this.acquirerCountry = acquirerCountry;
        return this;
      }

      /**
       * <strong>Required.</strong> The Merchant ID (or Card Acceptor ID) that your acquirer
       * assigned you (specific to the directory_server).
       */
      public Builder setAcquirerMerchantId(String acquirerMerchantId) {
        this.acquirerMerchantId = acquirerMerchantId;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthenticationCreateParams.AcquirerDetails#extraParams} for the field documentation.
       */
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
       * See {@link AuthenticationCreateParams.AcquirerDetails#extraParams} for the field
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
       * The <a href="https://en.wikipedia.org/wiki/Merchant_category_code">merchant category
       * code</a> as defined by each payment system or directory server.
       */
      public Builder setMcc(String mcc) {
        this.mcc = mcc;
        return this;
      }

      /**
       * The merchant name assigned by the acquirer or payment system. Same name used in the
       * authorization message as defined in <a href="https://en.wikipedia.org/wiki/ISO_8583">ISO
       * 8583</a>.
       */
      public Builder setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
      }

      /**
       * Requestor ID if you’re enrolled in the card network’s 3DS program. Otherwise, you can omit
       * this field because Stripe assigns a Requestor ID with the card networks.
       */
      public Builder setRequestorId(String requestorId) {
        this.requestorId = requestorId;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Channel {
    /** Contains additional details about the browser details you collected. */
    @SerializedName("browser")
    Browser browser;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Contains additional details about the 3DS Requestor Initiated (3RI) channel. */
    @SerializedName("three_r_i")
    ThreeRi threeRI;

    /**
     * <strong>Required.</strong> Type of channel you would prefer to use for this 3DS
     * Authentication.
     */
    @SerializedName("type")
    Type type;

    private Channel(Browser browser, Map<String, Object> extraParams, ThreeRi threeRI, Type type) {
      this.browser = browser;
      this.extraParams = extraParams;
      this.threeRI = threeRI;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Browser browser;

      private Map<String, Object> extraParams;

      private ThreeRi threeRI;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthenticationCreateParams.Channel build() {
        return new AuthenticationCreateParams.Channel(
            this.browser, this.extraParams, this.threeRI, this.type);
      }

      /** Contains additional details about the browser details you collected. */
      public Builder setBrowser(AuthenticationCreateParams.Channel.Browser browser) {
        this.browser = browser;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthenticationCreateParams.Channel#extraParams} for the field documentation.
       */
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
       * See {@link AuthenticationCreateParams.Channel#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Contains additional details about the 3DS Requestor Initiated (3RI) channel. */
      public Builder setThreeRi(AuthenticationCreateParams.Channel.ThreeRi threeRI) {
        this.threeRI = threeRI;
        return this;
      }

      /**
       * <strong>Required.</strong> Type of channel you would prefer to use for this 3DS
       * Authentication.
       */
      public Builder setType(AuthenticationCreateParams.Channel.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Browser {
      /**
       * <strong>Required.</strong> The HTTP accept headers from the cardholder's browser. Collected
       * server-side.
       */
      @SerializedName("accept_header")
      String acceptHeader;

      /**
       * The color depth of the cardholder’s screen.
       *
       * <p>Returned from the {@code screen.colorDepth} property.
       */
      @SerializedName("color_depth")
      Long colorDepth;

      /**
       * Unique and immutable identifier linked to a device that is consistent across 3DS
       * transactions for the specific user device. For example: hardware device ID or a
       * platform-calculated device fingerprint.
       */
      @SerializedName("device_id")
      String deviceId;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The IP address of the browser. Included in the HTTP request to
       * your server before you create the 3DS Authentication.
       *
       * <p>Collected server-side.
       */
      @SerializedName("ip_address")
      String ipAddress;

      /**
       * The cardholder browser’s ability to execute Java. Returned from the navigator.javaEnabled
       * property.
       */
      @SerializedName("java_enabled")
      Boolean javaEnabled;

      /** <strong>Required.</strong> The cardholder browser’s ability to execute JavaScript. */
      @SerializedName("javascript_enabled")
      Boolean javascriptEnabled;

      /**
       * <strong>Required.</strong> An IETF BCP 47 language tag representing the browser language.
       * Typically returned from the {@code navigator.language} property, but might also be returned
       * from {@code navigator.languages} or {@code navigator.browserLanguage}.
       *
       * <p>In some cases, this value might be an array. To cast it to a string or null value, you
       * can use the {@code getBrowserLanguage()} <a
       * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#pass-client-side-collected-channel-information">example
       * function</a>.
       */
      @SerializedName("language")
      String language;

      /**
       * The total height of the cardholder’s screen in pixels.
       *
       * <p>Returned from the {@code screen.height} property.
       */
      @SerializedName("screen_height")
      Long screenHeight;

      /**
       * The total width of the cardholder’s screen in pixels.
       *
       * <p>Returned from the {@code screen.width} property.
       */
      @SerializedName("screen_width")
      Long screenWidth;

      /**
       * The time difference between UTC time and the local time of the cardholder’s browser, in
       * minutes.
       *
       * <p>Returned by {@code new Date().getTimezoneOffset()}
       */
      @SerializedName("timezone_offset")
      Long timezoneOffset;

      /**
       * <strong>Required.</strong> The browser user agent. You can retrieve this value on the
       * client side using the {@code navigator.userAgent} property, or in the HTTP request to your
       * server before you create the 3DS Authentication.
       */
      @SerializedName("user_agent")
      String userAgent;

      private Browser(
          String acceptHeader,
          Long colorDepth,
          String deviceId,
          Map<String, Object> extraParams,
          String ipAddress,
          Boolean javaEnabled,
          Boolean javascriptEnabled,
          String language,
          Long screenHeight,
          Long screenWidth,
          Long timezoneOffset,
          String userAgent) {
        this.acceptHeader = acceptHeader;
        this.colorDepth = colorDepth;
        this.deviceId = deviceId;
        this.extraParams = extraParams;
        this.ipAddress = ipAddress;
        this.javaEnabled = javaEnabled;
        this.javascriptEnabled = javascriptEnabled;
        this.language = language;
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.timezoneOffset = timezoneOffset;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String acceptHeader;

        private Long colorDepth;

        private String deviceId;

        private Map<String, Object> extraParams;

        private String ipAddress;

        private Boolean javaEnabled;

        private Boolean javascriptEnabled;

        private String language;

        private Long screenHeight;

        private Long screenWidth;

        private Long timezoneOffset;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.Channel.Browser build() {
          return new AuthenticationCreateParams.Channel.Browser(
              this.acceptHeader,
              this.colorDepth,
              this.deviceId,
              this.extraParams,
              this.ipAddress,
              this.javaEnabled,
              this.javascriptEnabled,
              this.language,
              this.screenHeight,
              this.screenWidth,
              this.timezoneOffset,
              this.userAgent);
        }

        /**
         * <strong>Required.</strong> The HTTP accept headers from the cardholder's browser.
         * Collected server-side.
         */
        public Builder setAcceptHeader(String acceptHeader) {
          this.acceptHeader = acceptHeader;
          return this;
        }

        /**
         * The color depth of the cardholder’s screen.
         *
         * <p>Returned from the {@code screen.colorDepth} property.
         */
        public Builder setColorDepth(Long colorDepth) {
          this.colorDepth = colorDepth;
          return this;
        }

        /**
         * Unique and immutable identifier linked to a device that is consistent across 3DS
         * transactions for the specific user device. For example: hardware device ID or a
         * platform-calculated device fingerprint.
         */
        public Builder setDeviceId(String deviceId) {
          this.deviceId = deviceId;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.Channel.Browser#extraParams} for the field
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
         * map. See {@link AuthenticationCreateParams.Channel.Browser#extraParams} for the field
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
         * <strong>Required.</strong> The IP address of the browser. Included in the HTTP request to
         * your server before you create the 3DS Authentication.
         *
         * <p>Collected server-side.
         */
        public Builder setIpAddress(String ipAddress) {
          this.ipAddress = ipAddress;
          return this;
        }

        /**
         * The cardholder browser’s ability to execute Java. Returned from the navigator.javaEnabled
         * property.
         */
        public Builder setJavaEnabled(Boolean javaEnabled) {
          this.javaEnabled = javaEnabled;
          return this;
        }

        /** <strong>Required.</strong> The cardholder browser’s ability to execute JavaScript. */
        public Builder setJavascriptEnabled(Boolean javascriptEnabled) {
          this.javascriptEnabled = javascriptEnabled;
          return this;
        }

        /**
         * <strong>Required.</strong> An IETF BCP 47 language tag representing the browser language.
         * Typically returned from the {@code navigator.language} property, but might also be
         * returned from {@code navigator.languages} or {@code navigator.browserLanguage}.
         *
         * <p>In some cases, this value might be an array. To cast it to a string or null value, you
         * can use the {@code getBrowserLanguage()} <a
         * href="https://stripe.com/payments/3d-secure/standalone-3d-secure#pass-client-side-collected-channel-information">example
         * function</a>.
         */
        public Builder setLanguage(String language) {
          this.language = language;
          return this;
        }

        /**
         * The total height of the cardholder’s screen in pixels.
         *
         * <p>Returned from the {@code screen.height} property.
         */
        public Builder setScreenHeight(Long screenHeight) {
          this.screenHeight = screenHeight;
          return this;
        }

        /**
         * The total width of the cardholder’s screen in pixels.
         *
         * <p>Returned from the {@code screen.width} property.
         */
        public Builder setScreenWidth(Long screenWidth) {
          this.screenWidth = screenWidth;
          return this;
        }

        /**
         * The time difference between UTC time and the local time of the cardholder’s browser, in
         * minutes.
         *
         * <p>Returned by {@code new Date().getTimezoneOffset()}
         */
        public Builder setTimezoneOffset(Long timezoneOffset) {
          this.timezoneOffset = timezoneOffset;
          return this;
        }

        /**
         * <strong>Required.</strong> The browser user agent. You can retrieve this value on the
         * client side using the {@code navigator.userAgent} property, or in the HTTP request to
         * your server before you create the 3DS Authentication.
         */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ThreeRi {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> ID of a prior {@code Authentication}. For example, the first
       * recurring transaction that was authenticated by the cardholder.
       */
      @SerializedName("previous_authentication")
      String previousAuthentication;

      /**
       * <strong>Required.</strong> It provides additional information to the ACS to determine the
       * best approach for handling a 3RI request.
       */
      @SerializedName("type")
      Type type;

      private ThreeRi(Map<String, Object> extraParams, String previousAuthentication, Type type) {
        this.extraParams = extraParams;
        this.previousAuthentication = previousAuthentication;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String previousAuthentication;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.Channel.ThreeRi build() {
          return new AuthenticationCreateParams.Channel.ThreeRi(
              this.extraParams, this.previousAuthentication, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.Channel.ThreeRi#extraParams} for the field
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
         * map. See {@link AuthenticationCreateParams.Channel.ThreeRi#extraParams} for the field
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
         * <strong>Required.</strong> ID of a prior {@code Authentication}. For example, the first
         * recurring transaction that was authenticated by the cardholder.
         */
        public Builder setPreviousAuthentication(String previousAuthentication) {
          this.previousAuthentication = previousAuthentication;
          return this;
        }

        /**
         * <strong>Required.</strong> It provides additional information to the ACS to determine the
         * best approach for handling a 3RI request.
         */
        public Builder setType(AuthenticationCreateParams.Channel.ThreeRi.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("delayed_shipment")
        DELAYED_SHIPMENT("delayed_shipment"),

        @SerializedName("other_payment")
        OTHER_PAYMENT("other_payment"),

        @SerializedName("recurring")
        RECURRING("recurring"),

        @SerializedName("split_shipment")
        SPLIT_SHIPMENT("split_shipment");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("browser")
      BROWSER("browser"),

      @SerializedName("three_r_i")
      THREE_R_I("three_r_i");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class FlowPreference {
    /**
     * Contains additional details about your challenge flow preference for this 3DS Authentication.
     */
    @SerializedName("challenge")
    Challenge challenge;

    /**
     * Contains additional details about your data share only flow preference for this 3DS
     * Authentication.
     */
    @SerializedName("data_share")
    DataShare dataShare;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Contains additional details about your frictionless flow preference for this 3DS
     * Authentication.
     */
    @SerializedName("frictionless")
    Frictionless frictionless;

    /** <strong>Required.</strong> Type of flow you requested for this 3DS Authentication. */
    @SerializedName("type")
    Type type;

    private FlowPreference(
        Challenge challenge,
        DataShare dataShare,
        Map<String, Object> extraParams,
        Frictionless frictionless,
        Type type) {
      this.challenge = challenge;
      this.dataShare = dataShare;
      this.extraParams = extraParams;
      this.frictionless = frictionless;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Challenge challenge;

      private DataShare dataShare;

      private Map<String, Object> extraParams;

      private Frictionless frictionless;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthenticationCreateParams.FlowPreference build() {
        return new AuthenticationCreateParams.FlowPreference(
            this.challenge, this.dataShare, this.extraParams, this.frictionless, this.type);
      }

      /**
       * Contains additional details about your challenge flow preference for this 3DS
       * Authentication.
       */
      public Builder setChallenge(AuthenticationCreateParams.FlowPreference.Challenge challenge) {
        this.challenge = challenge;
        return this;
      }

      /**
       * Contains additional details about your data share only flow preference for this 3DS
       * Authentication.
       */
      public Builder setDataShare(AuthenticationCreateParams.FlowPreference.DataShare dataShare) {
        this.dataShare = dataShare;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthenticationCreateParams.FlowPreference#extraParams} for the field documentation.
       */
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
       * See {@link AuthenticationCreateParams.FlowPreference#extraParams} for the field
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
       * Contains additional details about your frictionless flow preference for this 3DS
       * Authentication.
       */
      public Builder setFrictionless(
          AuthenticationCreateParams.FlowPreference.Frictionless frictionless) {
        this.frictionless = frictionless;
        return this;
      }

      /** <strong>Required.</strong> Type of flow you requested for this 3DS Authentication. */
      public Builder setType(AuthenticationCreateParams.FlowPreference.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Challenge {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Type of challenge flow you requested for this 3DS
       * Authentication.
       */
      @SerializedName("type")
      Type type;

      private Challenge(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.FlowPreference.Challenge build() {
          return new AuthenticationCreateParams.FlowPreference.Challenge(
              this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.FlowPreference.Challenge#extraParams} for the
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
         * map. See {@link AuthenticationCreateParams.FlowPreference.Challenge#extraParams} for the
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
         * <strong>Required.</strong> Type of challenge flow you requested for this 3DS
         * Authentication.
         */
        public Builder setType(AuthenticationCreateParams.FlowPreference.Challenge.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("mandated")
        MANDATED("mandated"),

        @SerializedName("preferred")
        PREFERRED("preferred");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class DataShare {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Type of data share only flow you requested for this 3DS
       * Authentication.
       */
      @SerializedName("type")
      Type type;

      private DataShare(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.FlowPreference.DataShare build() {
          return new AuthenticationCreateParams.FlowPreference.DataShare(
              this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.FlowPreference.DataShare#extraParams} for the
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
         * map. See {@link AuthenticationCreateParams.FlowPreference.DataShare#extraParams} for the
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
         * <strong>Required.</strong> Type of data share only flow you requested for this 3DS
         * Authentication.
         */
        public Builder setType(AuthenticationCreateParams.FlowPreference.DataShare.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ds_specific")
        DS_SPECIFIC("ds_specific"),

        @SerializedName("emv_standard")
        EMV_STANDARD("emv_standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Frictionless {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Type of frictionless flow you requested for this 3DS
       * Authentication.
       */
      @SerializedName("type")
      Type type;

      private Frictionless(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.FlowPreference.Frictionless build() {
          return new AuthenticationCreateParams.FlowPreference.Frictionless(
              this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.FlowPreference.Frictionless#extraParams} for
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
         * map. See {@link AuthenticationCreateParams.FlowPreference.Frictionless#extraParams} for
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
         * <strong>Required.</strong> Type of frictionless flow you requested for this 3DS
         * Authentication.
         */
        public Builder setType(AuthenticationCreateParams.FlowPreference.Frictionless.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("low_risk")
        LOW_RISK("low_risk"),

        @SerializedName("none")
        NONE("none");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("challenge")
      CHALLENGE("challenge"),

      @SerializedName("data_share")
      DATA_SHARE("data_share"),

      @SerializedName("frictionless")
      FRICTIONLESS("frictionless");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class FutureUsage {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Parameters related to an installment payment. */
    @SerializedName("installment")
    Installment installment;

    /** Parameters related to a recurring payment. */
    @SerializedName("recurring")
    Recurring recurring;

    /** <strong>Required.</strong> The type of future usage declared for this 3DS Authentication */
    @SerializedName("type")
    Type type;

    private FutureUsage(
        Map<String, Object> extraParams, Installment installment, Recurring recurring, Type type) {
      this.extraParams = extraParams;
      this.installment = installment;
      this.recurring = recurring;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Installment installment;

      private Recurring recurring;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthenticationCreateParams.FutureUsage build() {
        return new AuthenticationCreateParams.FutureUsage(
            this.extraParams, this.installment, this.recurring, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthenticationCreateParams.FutureUsage#extraParams} for the field documentation.
       */
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
       * See {@link AuthenticationCreateParams.FutureUsage#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Parameters related to an installment payment. */
      public Builder setInstallment(
          AuthenticationCreateParams.FutureUsage.Installment installment) {
        this.installment = installment;
        return this;
      }

      /** Parameters related to a recurring payment. */
      public Builder setRecurring(AuthenticationCreateParams.FutureUsage.Recurring recurring) {
        this.recurring = recurring;
        return this;
      }

      /**
       * <strong>Required.</strong> The type of future usage declared for this 3DS Authentication
       */
      public Builder setType(AuthenticationCreateParams.FutureUsage.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Installment {
      /**
       * <strong>Required.</strong> A non-negative integer representing the future authorizations'
       * amount in the <a href="https://stripe.com/currencies#zero-decimal">smallest currency
       * unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * <strong>Required.</strong> Information about the expiry of the future usage of this
       * authentication.
       */
      @SerializedName("expiry")
      Expiry expiry;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The unit of time for {@code interval_count}. */
      @SerializedName("interval")
      Interval interval;

      /**
       * The minimum number of time intervals between authorizations. Must be greater than 0, and
       * defaults to 1.
       */
      @SerializedName("interval_count")
      Long intervalCount;

      /** <strong>Required.</strong> The maximum number of installments. Must be greater than 1. */
      @SerializedName("number")
      Long number;

      private Installment(
          Long amount,
          Expiry expiry,
          Map<String, Object> extraParams,
          Interval interval,
          Long intervalCount,
          Long number) {
        this.amount = amount;
        this.expiry = expiry;
        this.extraParams = extraParams;
        this.interval = interval;
        this.intervalCount = intervalCount;
        this.number = number;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private Expiry expiry;

        private Map<String, Object> extraParams;

        private Interval interval;

        private Long intervalCount;

        private Long number;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.FutureUsage.Installment build() {
          return new AuthenticationCreateParams.FutureUsage.Installment(
              this.amount,
              this.expiry,
              this.extraParams,
              this.interval,
              this.intervalCount,
              this.number);
        }

        /**
         * <strong>Required.</strong> A non-negative integer representing the future authorizations'
         * amount in the <a href="https://stripe.com/currencies#zero-decimal">smallest currency
         * unit</a>.
         */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * <strong>Required.</strong> Information about the expiry of the future usage of this
         * authentication.
         */
        public Builder setExpiry(AuthenticationCreateParams.FutureUsage.Installment.Expiry expiry) {
          this.expiry = expiry;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.FutureUsage.Installment#extraParams} for the
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
         * map. See {@link AuthenticationCreateParams.FutureUsage.Installment#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The unit of time for {@code interval_count}. */
        public Builder setInterval(
            AuthenticationCreateParams.FutureUsage.Installment.Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * The minimum number of time intervals between authorizations. Must be greater than 0, and
         * defaults to 1.
         */
        public Builder setIntervalCount(Long intervalCount) {
          this.intervalCount = intervalCount;
          return this;
        }

        /**
         * <strong>Required.</strong> The maximum number of installments. Must be greater than 1.
         */
        public Builder setNumber(Long number) {
          this.number = number;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Expiry {
        /**
         * The date before which the last authorization related to this authentication will occur.
         */
        @SerializedName("date")
        String date;

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
         * <strong>Required.</strong> The type of expiry for the future use of this authentication.
         */
        @SerializedName("type")
        Type type;

        private Expiry(String date, Map<String, Object> extraParams, Type type) {
          this.date = date;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String date;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public AuthenticationCreateParams.FutureUsage.Installment.Expiry build() {
            return new AuthenticationCreateParams.FutureUsage.Installment.Expiry(
                this.date, this.extraParams, this.type);
          }

          /**
           * The date before which the last authorization related to this authentication will occur.
           */
          public Builder setDate(String date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AuthenticationCreateParams.FutureUsage.Installment.Expiry#extraParams}
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
           * map. See {@link AuthenticationCreateParams.FutureUsage.Installment.Expiry#extraParams}
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
           * <strong>Required.</strong> The type of expiry for the future use of this
           * authentication.
           */
          public Builder setType(
              AuthenticationCreateParams.FutureUsage.Installment.Expiry.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("date")
          DATE("date"),

          @SerializedName("never")
          NEVER("never");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum Interval implements ApiRequestParams.EnumParam {
        @SerializedName("day")
        DAY("day");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Interval(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Recurring {
      /**
       * <strong>Required.</strong> A non-negative integer representing the future authorizations'
       * amount in the <a href="https://stripe.com/currencies#zero-decimal">smallest currency
       * unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * <strong>Required.</strong> Information about the expiry of the future usage of this
       * authentication.
       */
      @SerializedName("expiry")
      Expiry expiry;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The unit of time for {@code interval_count}. */
      @SerializedName("interval")
      Interval interval;

      /**
       * The minimum number of time intervals between authorizations. Must be greater than 0, and
       * defaults to 1.
       */
      @SerializedName("interval_count")
      Long intervalCount;

      private Recurring(
          Long amount,
          Expiry expiry,
          Map<String, Object> extraParams,
          Interval interval,
          Long intervalCount) {
        this.amount = amount;
        this.expiry = expiry;
        this.extraParams = extraParams;
        this.interval = interval;
        this.intervalCount = intervalCount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private Expiry expiry;

        private Map<String, Object> extraParams;

        private Interval interval;

        private Long intervalCount;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.FutureUsage.Recurring build() {
          return new AuthenticationCreateParams.FutureUsage.Recurring(
              this.amount, this.expiry, this.extraParams, this.interval, this.intervalCount);
        }

        /**
         * <strong>Required.</strong> A non-negative integer representing the future authorizations'
         * amount in the <a href="https://stripe.com/currencies#zero-decimal">smallest currency
         * unit</a>.
         */
        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        /**
         * <strong>Required.</strong> Information about the expiry of the future usage of this
         * authentication.
         */
        public Builder setExpiry(AuthenticationCreateParams.FutureUsage.Recurring.Expiry expiry) {
          this.expiry = expiry;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.FutureUsage.Recurring#extraParams} for the
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
         * map. See {@link AuthenticationCreateParams.FutureUsage.Recurring#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The unit of time for {@code interval_count}. */
        public Builder setInterval(
            AuthenticationCreateParams.FutureUsage.Recurring.Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * The minimum number of time intervals between authorizations. Must be greater than 0, and
         * defaults to 1.
         */
        public Builder setIntervalCount(Long intervalCount) {
          this.intervalCount = intervalCount;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Expiry {
        /**
         * The date before which the last authorization related to this authentication will occur.
         */
        @SerializedName("date")
        String date;

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
         * <strong>Required.</strong> The type of expiry for the future use of this authentication.
         */
        @SerializedName("type")
        Type type;

        private Expiry(String date, Map<String, Object> extraParams, Type type) {
          this.date = date;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String date;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public AuthenticationCreateParams.FutureUsage.Recurring.Expiry build() {
            return new AuthenticationCreateParams.FutureUsage.Recurring.Expiry(
                this.date, this.extraParams, this.type);
          }

          /**
           * The date before which the last authorization related to this authentication will occur.
           */
          public Builder setDate(String date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AuthenticationCreateParams.FutureUsage.Recurring.Expiry#extraParams}
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
           * map. See {@link AuthenticationCreateParams.FutureUsage.Recurring.Expiry#extraParams}
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
           * <strong>Required.</strong> The type of expiry for the future use of this
           * authentication.
           */
          public Builder setType(
              AuthenticationCreateParams.FutureUsage.Recurring.Expiry.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("date")
          DATE("date"),

          @SerializedName("never")
          NEVER("never");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum Interval implements ApiRequestParams.EnumParam {
        @SerializedName("day")
        DAY("day");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Interval(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("card_on_file")
      CARD_ON_FILE("card_on_file"),

      @SerializedName("installment")
      INSTALLMENT("installment"),

      @SerializedName("recurring")
      RECURRING("recurring");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodData {
    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /** <strong>Required.</strong> */
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

    /**
     * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
     * the PaymentMethod with a name matching this value. It contains additional information
     * specific to the PaymentMethod type.
     */
    @SerializedName("type")
    Type type;

    private PaymentMethodData(
        BillingDetails billingDetails, Card card, Map<String, Object> extraParams, Type type) {
      this.billingDetails = billingDetails;
      this.card = card;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingDetails billingDetails;

      private Card card;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthenticationCreateParams.PaymentMethodData build() {
        return new AuthenticationCreateParams.PaymentMethodData(
            this.billingDetails, this.card, this.extraParams, this.type);
      }

      /**
       * Billing information associated with the PaymentMethod that may be used or required by
       * particular types of payment methods.
       */
      public Builder setBillingDetails(
          AuthenticationCreateParams.PaymentMethodData.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /** <strong>Required.</strong> */
      public Builder setCard(AuthenticationCreateParams.PaymentMethodData.Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthenticationCreateParams.PaymentMethodData#extraParams} for the field documentation.
       */
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
       * See {@link AuthenticationCreateParams.PaymentMethodData#extraParams} for the field
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
       * <strong>Required.</strong> The type of the PaymentMethod. An additional hash is included on
       * the PaymentMethod with a name matching this value. It contains additional information
       * specific to the PaymentMethod type.
       */
      public Builder setType(AuthenticationCreateParams.PaymentMethodData.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails {
      /** Billing address. */
      @SerializedName("address")
      Address address;

      /** Email address. */
      @SerializedName("email")
      String email;

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
      String name;

      /** Billing phone number (including extension). */
      @SerializedName("phone")
      String phone;

      private BillingDetails(
          Address address,
          String email,
          Map<String, Object> extraParams,
          String name,
          String phone) {
        this.address = address;
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private String email;

        private Map<String, Object> extraParams;

        private String name;

        private String phone;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.PaymentMethodData.BillingDetails build() {
          return new AuthenticationCreateParams.PaymentMethodData.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** Billing address. */
        public Builder setAddress(
            AuthenticationCreateParams.PaymentMethodData.BillingDetails.Address address) {
          this.address = address;
          return this;
        }

        /** Email address. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.PaymentMethodData.BillingDetails#extraParams}
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
         * map. See {@link AuthenticationCreateParams.PaymentMethodData.BillingDetails#extraParams}
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

        /** Billing phone number (including extension). */
        public Builder setPhone(String phone) {
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        String line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** Country subdivision code defined in ISO 3166-2. */
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
          public AuthenticationCreateParams.PaymentMethodData.BillingDetails.Address build() {
            return new AuthenticationCreateParams.PaymentMethodData.BillingDetails.Address(
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
           * AuthenticationCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
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
           * AuthenticationCreateParams.PaymentMethodData.BillingDetails.Address#extraParams} for
           * the field documentation.
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

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** Country subdivision code defined in ISO 3166-2. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      @SerializedName("cvc")
      String cvc;

      @SerializedName("exp_month")
      Long expMonth;

      @SerializedName("exp_year")
      Long expYear;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("number")
      String number;

      @SerializedName("token")
      String token;

      private Card(
          String cvc,
          Long expMonth,
          Long expYear,
          Map<String, Object> extraParams,
          String number,
          String token) {
        this.cvc = cvc;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.extraParams = extraParams;
        this.number = number;
        this.token = token;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String cvc;

        private Long expMonth;

        private Long expYear;

        private Map<String, Object> extraParams;

        private String number;

        private String token;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthenticationCreateParams.PaymentMethodData.Card build() {
          return new AuthenticationCreateParams.PaymentMethodData.Card(
              this.cvc, this.expMonth, this.expYear, this.extraParams, this.number, this.token);
        }

        public Builder setCvc(String cvc) {
          this.cvc = cvc;
          return this;
        }

        public Builder setExpMonth(Long expMonth) {
          this.expMonth = expMonth;
          return this;
        }

        public Builder setExpYear(Long expYear) {
          this.expYear = expYear;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthenticationCreateParams.PaymentMethodData.Card#extraParams} for the
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
         * map. See {@link AuthenticationCreateParams.PaymentMethodData.Card#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setNumber(String number) {
          this.number = number;
          return this;
        }

        public Builder setToken(String token) {
          this.token = token;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("card")
      CARD("card");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingAddress {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Address line 1, such as the street, PO Box, or company name. */
    @SerializedName("line1")
    String line1;

    /** Address line 2, such as the apartment, suite, unit, or building. */
    @SerializedName("line2")
    String line2;

    /** ZIP or postal code. */
    @SerializedName("postal_code")
    String postalCode;

    /** Country subdivision code defined in ISO 3166-2. */
    @SerializedName("state")
    String state;

    private ShippingAddress(
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
      public AuthenticationCreateParams.ShippingAddress build() {
        return new AuthenticationCreateParams.ShippingAddress(
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
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthenticationCreateParams.ShippingAddress#extraParams} for the field documentation.
       */
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
       * See {@link AuthenticationCreateParams.ShippingAddress#extraParams} for the field
       * documentation.
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

      /** Address line 2, such as the apartment, suite, unit, or building. */
      public Builder setLine2(String line2) {
        this.line2 = line2;
        return this;
      }

      /** ZIP or postal code. */
      public Builder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
      }

      /** Country subdivision code defined in ISO 3166-2. */
      public Builder setState(String state) {
        this.state = state;
        return this;
      }
    }
  }

  public enum DirectoryServer implements ApiRequestParams.EnumParam {
    @SerializedName("american_express")
    AMERICAN_EXPRESS("american_express"),

    @SerializedName("cartes_bancaires")
    CARTES_BANCAIRES("cartes_bancaires"),

    @SerializedName("discover")
    DISCOVER("discover"),

    @SerializedName("mastercard")
    MASTERCARD("mastercard"),

    @SerializedName("visa")
    VISA("visa");

    @Getter(onMethod_ = {@Override})
    private final String value;

    DirectoryServer(String value) {
      this.value = value;
    }
  }

  public enum MessageCategory implements ApiRequestParams.EnumParam {
    @SerializedName("non_payment_authentication")
    NON_PAYMENT_AUTHENTICATION("non_payment_authentication"),

    @SerializedName("payment_authentication")
    PAYMENT_AUTHENTICATION("payment_authentication");

    @Getter(onMethod_ = {@Override})
    private final String value;

    MessageCategory(String value) {
      this.value = value;
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("cardholder_authentication")
    CARDHOLDER_AUTHENTICATION("cardholder_authentication"),

    @SerializedName("issuer_requested")
    ISSUER_REQUESTED("issuer_requested"),

    @SerializedName("liability_shift")
    LIABILITY_SHIFT("liability_shift"),

    @SerializedName("processing_costs")
    PROCESSING_COSTS("processing_costs"),

    @SerializedName("regulatory_compliance")
    REGULATORY_COMPLIANCE("regulatory_compliance");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }

  public enum Submit implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("if_fingerprinting_not_supported")
    IF_FINGERPRINTING_NOT_SUPPORTED("if_fingerprinting_not_supported"),

    @SerializedName("never")
    NEVER("never");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Submit(String value) {
      this.value = value;
    }
  }
}
