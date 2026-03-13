// File generated from our OpenAPI spec
package com.stripe.param.radar;

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
public class IssuingAuthorizationEvaluationCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Details about the authorization. */
  @SerializedName("authorization_details")
  AuthorizationDetails authorizationDetails;

  /** <strong>Required.</strong> Details about the card used in the authorization. */
  @SerializedName("card_details")
  CardDetails cardDetails;

  /** Details about the cardholder. */
  @SerializedName("cardholder_details")
  CardholderDetails cardholderDetails;

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
   * <strong>Required.</strong> Details about the seller (grocery store, e-commerce website, etc.)
   * where the card authorization happened.
   */
  @SerializedName("merchant_details")
  MerchantDetails merchantDetails;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Details about the authorization, such as identifiers, set by the card network. */
  @SerializedName("network_details")
  NetworkDetails networkDetails;

  /** Details about the token, if a tokenized payment method was used for the authorization. */
  @SerializedName("token_details")
  TokenDetails tokenDetails;

  /** Details about verification data for the authorization. */
  @SerializedName("verification_details")
  VerificationDetails verificationDetails;

  private IssuingAuthorizationEvaluationCreateParams(
      AuthorizationDetails authorizationDetails,
      CardDetails cardDetails,
      CardholderDetails cardholderDetails,
      List<String> expand,
      Map<String, Object> extraParams,
      MerchantDetails merchantDetails,
      Map<String, String> metadata,
      NetworkDetails networkDetails,
      TokenDetails tokenDetails,
      VerificationDetails verificationDetails) {
    this.authorizationDetails = authorizationDetails;
    this.cardDetails = cardDetails;
    this.cardholderDetails = cardholderDetails;
    this.expand = expand;
    this.extraParams = extraParams;
    this.merchantDetails = merchantDetails;
    this.metadata = metadata;
    this.networkDetails = networkDetails;
    this.tokenDetails = tokenDetails;
    this.verificationDetails = verificationDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AuthorizationDetails authorizationDetails;

    private CardDetails cardDetails;

    private CardholderDetails cardholderDetails;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private MerchantDetails merchantDetails;

    private Map<String, String> metadata;

    private NetworkDetails networkDetails;

    private TokenDetails tokenDetails;

    private VerificationDetails verificationDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public IssuingAuthorizationEvaluationCreateParams build() {
      return new IssuingAuthorizationEvaluationCreateParams(
          this.authorizationDetails,
          this.cardDetails,
          this.cardholderDetails,
          this.expand,
          this.extraParams,
          this.merchantDetails,
          this.metadata,
          this.networkDetails,
          this.tokenDetails,
          this.verificationDetails);
    }

    /** <strong>Required.</strong> Details about the authorization. */
    public Builder setAuthorizationDetails(
        IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails authorizationDetails) {
      this.authorizationDetails = authorizationDetails;
      return this;
    }

    /** <strong>Required.</strong> Details about the card used in the authorization. */
    public Builder setCardDetails(
        IssuingAuthorizationEvaluationCreateParams.CardDetails cardDetails) {
      this.cardDetails = cardDetails;
      return this;
    }

    /** Details about the cardholder. */
    public Builder setCardholderDetails(
        IssuingAuthorizationEvaluationCreateParams.CardholderDetails cardholderDetails) {
      this.cardholderDetails = cardholderDetails;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * IssuingAuthorizationEvaluationCreateParams#expand} for the field documentation.
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
     * IssuingAuthorizationEvaluationCreateParams#expand} for the field documentation.
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
     * IssuingAuthorizationEvaluationCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link IssuingAuthorizationEvaluationCreateParams#extraParams} for the field
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
     * <strong>Required.</strong> Details about the seller (grocery store, e-commerce website, etc.)
     * where the card authorization happened.
     */
    public Builder setMerchantDetails(
        IssuingAuthorizationEvaluationCreateParams.MerchantDetails merchantDetails) {
      this.merchantDetails = merchantDetails;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * IssuingAuthorizationEvaluationCreateParams#metadata} for the field documentation.
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
     * See {@link IssuingAuthorizationEvaluationCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Details about the authorization, such as identifiers, set by the card network. */
    public Builder setNetworkDetails(
        IssuingAuthorizationEvaluationCreateParams.NetworkDetails networkDetails) {
      this.networkDetails = networkDetails;
      return this;
    }

    /** Details about the token, if a tokenized payment method was used for the authorization. */
    public Builder setTokenDetails(
        IssuingAuthorizationEvaluationCreateParams.TokenDetails tokenDetails) {
      this.tokenDetails = tokenDetails;
      return this;
    }

    /** Details about verification data for the authorization. */
    public Builder setVerificationDetails(
        IssuingAuthorizationEvaluationCreateParams.VerificationDetails verificationDetails) {
      this.verificationDetails = verificationDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationDetails {
    /**
     * <strong>Required.</strong> The total amount of the authorization in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
     */
    @SerializedName("amount")
    Long amount;

    /** How the card details were provided. */
    @SerializedName("authorization_method")
    AuthorizationMethod authorizationMethod;

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /** Defines how the card's information was entered for the authorization. */
    @SerializedName("entry_mode")
    EntryMode entryMode;

    /** Raw code indicating the entry mode from the network message. */
    @SerializedName("entry_mode_raw_code")
    String entryModeRawCode;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The timestamp of the authorization initiated in seconds. */
    @SerializedName("initiated_at")
    Long initiatedAt;

    /** Defines how the card was read at the point of sale. */
    @SerializedName("point_of_sale_condition")
    PointOfSaleCondition pointOfSaleCondition;

    /** Raw code indicating the point of sale condition from the network message. */
    @SerializedName("point_of_sale_condition_raw_code")
    String pointOfSaleConditionRawCode;

    /**
     * <strong>Required.</strong> User's specified unique ID for this authorization attempt (e.g.,
     * RRN or internal reference).
     */
    @SerializedName("reference")
    String reference;

    private AuthorizationDetails(
        Long amount,
        AuthorizationMethod authorizationMethod,
        String currency,
        EntryMode entryMode,
        String entryModeRawCode,
        Map<String, Object> extraParams,
        Long initiatedAt,
        PointOfSaleCondition pointOfSaleCondition,
        String pointOfSaleConditionRawCode,
        String reference) {
      this.amount = amount;
      this.authorizationMethod = authorizationMethod;
      this.currency = currency;
      this.entryMode = entryMode;
      this.entryModeRawCode = entryModeRawCode;
      this.extraParams = extraParams;
      this.initiatedAt = initiatedAt;
      this.pointOfSaleCondition = pointOfSaleCondition;
      this.pointOfSaleConditionRawCode = pointOfSaleConditionRawCode;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private AuthorizationMethod authorizationMethod;

      private String currency;

      private EntryMode entryMode;

      private String entryModeRawCode;

      private Map<String, Object> extraParams;

      private Long initiatedAt;

      private PointOfSaleCondition pointOfSaleCondition;

      private String pointOfSaleConditionRawCode;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails build() {
        return new IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails(
            this.amount,
            this.authorizationMethod,
            this.currency,
            this.entryMode,
            this.entryModeRawCode,
            this.extraParams,
            this.initiatedAt,
            this.pointOfSaleCondition,
            this.pointOfSaleConditionRawCode,
            this.reference);
      }

      /**
       * <strong>Required.</strong> The total amount of the authorization in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** How the card details were provided. */
      public Builder setAuthorizationMethod(
          IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails.AuthorizationMethod
              authorizationMethod) {
        this.authorizationMethod = authorizationMethod;
        return this;
      }

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /** Defines how the card's information was entered for the authorization. */
      public Builder setEntryMode(
          IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails.EntryMode entryMode) {
        this.entryMode = entryMode;
        return this;
      }

      /** Raw code indicating the entry mode from the network message. */
      public Builder setEntryModeRawCode(String entryModeRawCode) {
        this.entryModeRawCode = entryModeRawCode;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails#extraParams} for the field
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
       * See {@link IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The timestamp of the authorization initiated in seconds. */
      public Builder setInitiatedAt(Long initiatedAt) {
        this.initiatedAt = initiatedAt;
        return this;
      }

      /** Defines how the card was read at the point of sale. */
      public Builder setPointOfSaleCondition(
          IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails.PointOfSaleCondition
              pointOfSaleCondition) {
        this.pointOfSaleCondition = pointOfSaleCondition;
        return this;
      }

      /** Raw code indicating the point of sale condition from the network message. */
      public Builder setPointOfSaleConditionRawCode(String pointOfSaleConditionRawCode) {
        this.pointOfSaleConditionRawCode = pointOfSaleConditionRawCode;
        return this;
      }

      /**
       * <strong>Required.</strong> User's specified unique ID for this authorization attempt (e.g.,
       * RRN or internal reference).
       */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }

    public enum AuthorizationMethod implements ApiRequestParams.EnumParam {
      @SerializedName("chip")
      CHIP("chip"),

      @SerializedName("contactless")
      CONTACTLESS("contactless"),

      @SerializedName("keyed_in")
      KEYED_IN("keyed_in"),

      @SerializedName("online")
      ONLINE("online"),

      @SerializedName("swipe")
      SWIPE("swipe");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AuthorizationMethod(String value) {
        this.value = value;
      }
    }

    public enum EntryMode implements ApiRequestParams.EnumParam {
      @SerializedName("contactless")
      CONTACTLESS("contactless"),

      @SerializedName("contactless_magstripe")
      CONTACTLESS_MAGSTRIPE("contactless_magstripe"),

      @SerializedName("credential_on_file")
      CREDENTIAL_ON_FILE("credential_on_file"),

      @SerializedName("integrated_circuit_card")
      INTEGRATED_CIRCUIT_CARD("integrated_circuit_card"),

      @SerializedName("magstripe")
      MAGSTRIPE("magstripe"),

      @SerializedName("magstripe_no_cvv")
      MAGSTRIPE_NO_CVV("magstripe_no_cvv"),

      @SerializedName("manual")
      MANUAL("manual"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("unknown")
      UNKNOWN("unknown");

      @Getter(onMethod_ = {@Override})
      private final String value;

      EntryMode(String value) {
        this.value = value;
      }
    }

    public enum PointOfSaleCondition implements ApiRequestParams.EnumParam {
      @SerializedName("account_verification")
      ACCOUNT_VERIFICATION("account_verification"),

      @SerializedName("card_not_present")
      CARD_NOT_PRESENT("card_not_present"),

      @SerializedName("card_present")
      CARD_PRESENT("card_present"),

      @SerializedName("e_commerce")
      E_COMMERCE("e_commerce"),

      @SerializedName("key_entered_pos")
      KEY_ENTERED_POS("key_entered_pos"),

      @SerializedName("missing")
      MISSING("missing"),

      @SerializedName("moto")
      MOTO("moto"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("pin_entered")
      PIN_ENTERED("pin_entered"),

      @SerializedName("recurring")
      RECURRING("recurring");

      @Getter(onMethod_ = {@Override})
      private final String value;

      PointOfSaleCondition(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CardDetails {
    /** <strong>Required.</strong> The Bank Identification Number (BIN) of the card. */
    @SerializedName("bin")
    String bin;

    /** <strong>Required.</strong> The two-letter country code of the BIN issuer. */
    @SerializedName("bin_country")
    String binCountry;

    /** <strong>Required.</strong> The type of the card. */
    @SerializedName("card_type")
    CardType cardType;

    /** <strong>Required.</strong> The timestamp when the card was created. */
    @SerializedName("created_at")
    Long createdAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The last 4 digits of the card number. */
    @SerializedName("last4")
    String last4;

    /**
     * <strong>Required.</strong> User's specified unique ID of the card for this authorization
     * attempt (e.g., RRN or internal reference).
     */
    @SerializedName("reference")
    String reference;

    private CardDetails(
        String bin,
        String binCountry,
        CardType cardType,
        Long createdAt,
        Map<String, Object> extraParams,
        String last4,
        String reference) {
      this.bin = bin;
      this.binCountry = binCountry;
      this.cardType = cardType;
      this.createdAt = createdAt;
      this.extraParams = extraParams;
      this.last4 = last4;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String bin;

      private String binCountry;

      private CardType cardType;

      private Long createdAt;

      private Map<String, Object> extraParams;

      private String last4;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuingAuthorizationEvaluationCreateParams.CardDetails build() {
        return new IssuingAuthorizationEvaluationCreateParams.CardDetails(
            this.bin,
            this.binCountry,
            this.cardType,
            this.createdAt,
            this.extraParams,
            this.last4,
            this.reference);
      }

      /** <strong>Required.</strong> The Bank Identification Number (BIN) of the card. */
      public Builder setBin(String bin) {
        this.bin = bin;
        return this;
      }

      /** <strong>Required.</strong> The two-letter country code of the BIN issuer. */
      public Builder setBinCountry(String binCountry) {
        this.binCountry = binCountry;
        return this;
      }

      /** <strong>Required.</strong> The type of the card. */
      public Builder setCardType(
          IssuingAuthorizationEvaluationCreateParams.CardDetails.CardType cardType) {
        this.cardType = cardType;
        return this;
      }

      /** <strong>Required.</strong> The timestamp when the card was created. */
      public Builder setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuingAuthorizationEvaluationCreateParams.CardDetails#extraParams} for the field
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
       * See {@link IssuingAuthorizationEvaluationCreateParams.CardDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The last 4 digits of the card number. */
      public Builder setLast4(String last4) {
        this.last4 = last4;
        return this;
      }

      /**
       * <strong>Required.</strong> User's specified unique ID of the card for this authorization
       * attempt (e.g., RRN or internal reference).
       */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }

    public enum CardType implements ApiRequestParams.EnumParam {
      @SerializedName("physical")
      PHYSICAL("physical"),

      @SerializedName("virtual")
      VIRTUAL("virtual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      CardType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CardholderDetails {
    /** The timestamp when the cardholder was created. */
    @SerializedName("created_at")
    Long createdAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * User's specified unique ID of the cardholder for this authorization attempt (e.g., RRN or
     * internal reference).
     */
    @SerializedName("reference")
    String reference;

    private CardholderDetails(Long createdAt, Map<String, Object> extraParams, String reference) {
      this.createdAt = createdAt;
      this.extraParams = extraParams;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long createdAt;

      private Map<String, Object> extraParams;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuingAuthorizationEvaluationCreateParams.CardholderDetails build() {
        return new IssuingAuthorizationEvaluationCreateParams.CardholderDetails(
            this.createdAt, this.extraParams, this.reference);
      }

      /** The timestamp when the cardholder was created. */
      public Builder setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuingAuthorizationEvaluationCreateParams.CardholderDetails#extraParams} for the field
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
       * See {@link IssuingAuthorizationEvaluationCreateParams.CardholderDetails#extraParams} for
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
       * User's specified unique ID of the cardholder for this authorization attempt (e.g., RRN or
       * internal reference).
       */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantDetails {
    /** <strong>Required.</strong> The merchant category code for the seller's business. */
    @SerializedName("category_code")
    String categoryCode;

    /** Country where the seller is located. */
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

    /** <strong>Required.</strong> Name of the seller. */
    @SerializedName("name")
    String name;

    /**
     * <strong>Required.</strong> Identifier assigned to the seller by the card network. Different
     * card networks may assign different network_id fields to the same merchant.
     */
    @SerializedName("network_id")
    String networkId;

    /** An ID assigned by the seller to the location of the sale. */
    @SerializedName("terminal_id")
    String terminalId;

    private MerchantDetails(
        String categoryCode,
        String country,
        Map<String, Object> extraParams,
        String name,
        String networkId,
        String terminalId) {
      this.categoryCode = categoryCode;
      this.country = country;
      this.extraParams = extraParams;
      this.name = name;
      this.networkId = networkId;
      this.terminalId = terminalId;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String categoryCode;

      private String country;

      private Map<String, Object> extraParams;

      private String name;

      private String networkId;

      private String terminalId;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuingAuthorizationEvaluationCreateParams.MerchantDetails build() {
        return new IssuingAuthorizationEvaluationCreateParams.MerchantDetails(
            this.categoryCode,
            this.country,
            this.extraParams,
            this.name,
            this.networkId,
            this.terminalId);
      }

      /** <strong>Required.</strong> The merchant category code for the seller's business. */
      public Builder setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
      }

      /** Country where the seller is located. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuingAuthorizationEvaluationCreateParams.MerchantDetails#extraParams} for the field
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
       * See {@link IssuingAuthorizationEvaluationCreateParams.MerchantDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Name of the seller. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /**
       * <strong>Required.</strong> Identifier assigned to the seller by the card network. Different
       * card networks may assign different network_id fields to the same merchant.
       */
      public Builder setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
      }

      /** An ID assigned by the seller to the location of the sale. */
      public Builder setTerminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkDetails {
    /**
     * Identifier assigned to the acquirer by the card network. Sometimes this value is not provided
     * by the network; in this case, the value will be null.
     */
    @SerializedName("acquiring_institution_id")
    String acquiringInstitutionId;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The card network over which Stripe received the authorization. */
    @SerializedName("routed_network")
    RoutedNetwork routedNetwork;

    private NetworkDetails(
        String acquiringInstitutionId,
        Map<String, Object> extraParams,
        RoutedNetwork routedNetwork) {
      this.acquiringInstitutionId = acquiringInstitutionId;
      this.extraParams = extraParams;
      this.routedNetwork = routedNetwork;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String acquiringInstitutionId;

      private Map<String, Object> extraParams;

      private RoutedNetwork routedNetwork;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuingAuthorizationEvaluationCreateParams.NetworkDetails build() {
        return new IssuingAuthorizationEvaluationCreateParams.NetworkDetails(
            this.acquiringInstitutionId, this.extraParams, this.routedNetwork);
      }

      /**
       * Identifier assigned to the acquirer by the card network. Sometimes this value is not
       * provided by the network; in this case, the value will be null.
       */
      public Builder setAcquiringInstitutionId(String acquiringInstitutionId) {
        this.acquiringInstitutionId = acquiringInstitutionId;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuingAuthorizationEvaluationCreateParams.NetworkDetails#extraParams} for the field
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
       * See {@link IssuingAuthorizationEvaluationCreateParams.NetworkDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The card network over which Stripe received the authorization. */
      public Builder setRoutedNetwork(
          IssuingAuthorizationEvaluationCreateParams.NetworkDetails.RoutedNetwork routedNetwork) {
        this.routedNetwork = routedNetwork;
        return this;
      }
    }

    public enum RoutedNetwork implements ApiRequestParams.EnumParam {
      @SerializedName("cirrus")
      CIRRUS("cirrus"),

      @SerializedName("interlink")
      INTERLINK("interlink"),

      @SerializedName("maestro")
      MAESTRO("maestro"),

      @SerializedName("mastercard")
      MASTERCARD("mastercard"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("plus")
      PLUS("plus"),

      @SerializedName("visa")
      VISA("visa");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RoutedNetwork(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TokenDetails {
    /** The timestamp when the network token was created. */
    @SerializedName("created_at")
    Long createdAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * User's specified unique ID of the card token for this authorization attempt (e.g., RRN or
     * internal reference).
     */
    @SerializedName("reference")
    String reference;

    /**
     * The digital wallet used for this transaction. One of {@code apple_pay}, {@code google_pay},
     * or {@code samsung_pay}.
     */
    @SerializedName("wallet")
    Wallet wallet;

    private TokenDetails(
        Long createdAt, Map<String, Object> extraParams, String reference, Wallet wallet) {
      this.createdAt = createdAt;
      this.extraParams = extraParams;
      this.reference = reference;
      this.wallet = wallet;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long createdAt;

      private Map<String, Object> extraParams;

      private String reference;

      private Wallet wallet;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuingAuthorizationEvaluationCreateParams.TokenDetails build() {
        return new IssuingAuthorizationEvaluationCreateParams.TokenDetails(
            this.createdAt, this.extraParams, this.reference, this.wallet);
      }

      /** The timestamp when the network token was created. */
      public Builder setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuingAuthorizationEvaluationCreateParams.TokenDetails#extraParams} for the field
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
       * See {@link IssuingAuthorizationEvaluationCreateParams.TokenDetails#extraParams} for the
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
       * User's specified unique ID of the card token for this authorization attempt (e.g., RRN or
       * internal reference).
       */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }

      /**
       * The digital wallet used for this transaction. One of {@code apple_pay}, {@code google_pay},
       * or {@code samsung_pay}.
       */
      public Builder setWallet(
          IssuingAuthorizationEvaluationCreateParams.TokenDetails.Wallet wallet) {
        this.wallet = wallet;
        return this;
      }
    }

    public enum Wallet implements ApiRequestParams.EnumParam {
      @SerializedName("apple_pay")
      APPLE_PAY("apple_pay"),

      @SerializedName("google_pay")
      GOOGLE_PAY("google_pay"),

      @SerializedName("samsung_pay")
      SAMSUNG_PAY("samsung_pay");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Wallet(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The outcome of the 3D Secure authentication request. */
    @SerializedName("three_d_secure_result")
    ThreeDSecureResult threeDSecureResult;

    private VerificationDetails(
        Map<String, Object> extraParams, ThreeDSecureResult threeDSecureResult) {
      this.extraParams = extraParams;
      this.threeDSecureResult = threeDSecureResult;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private ThreeDSecureResult threeDSecureResult;

      /** Finalize and obtain parameter instance from this builder. */
      public IssuingAuthorizationEvaluationCreateParams.VerificationDetails build() {
        return new IssuingAuthorizationEvaluationCreateParams.VerificationDetails(
            this.extraParams, this.threeDSecureResult);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IssuingAuthorizationEvaluationCreateParams.VerificationDetails#extraParams} for the field
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
       * See {@link IssuingAuthorizationEvaluationCreateParams.VerificationDetails#extraParams} for
       * the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The outcome of the 3D Secure authentication request. */
      public Builder setThreeDSecureResult(
          IssuingAuthorizationEvaluationCreateParams.VerificationDetails.ThreeDSecureResult
              threeDSecureResult) {
        this.threeDSecureResult = threeDSecureResult;
        return this;
      }
    }

    public enum ThreeDSecureResult implements ApiRequestParams.EnumParam {
      @SerializedName("attempt_acknowledged")
      ATTEMPT_ACKNOWLEDGED("attempt_acknowledged"),

      @SerializedName("authenticated")
      AUTHENTICATED("authenticated"),

      @SerializedName("exempted")
      EXEMPTED("exempted"),

      @SerializedName("failed")
      FAILED("failed"),

      @SerializedName("required")
      REQUIRED("required");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ThreeDSecureResult(String value) {
        this.value = value;
      }
    }
  }
}
