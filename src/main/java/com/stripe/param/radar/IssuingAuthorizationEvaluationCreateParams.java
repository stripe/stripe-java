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

  /** <strong>Required.</strong> Details about the merchant where the authorization occurred. */
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

  /** Details about the card network processing. */
  @SerializedName("network_details")
  NetworkDetails networkDetails;

  /** Details about the token, if a tokenized payment method was used. */
  @SerializedName("token_details")
  TokenDetails tokenDetails;

  /** Details about verification checks performed. */
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

    /** <strong>Required.</strong> Details about the merchant where the authorization occurred. */
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

    /** Details about the card network processing. */
    public Builder setNetworkDetails(
        IssuingAuthorizationEvaluationCreateParams.NetworkDetails networkDetails) {
      this.networkDetails = networkDetails;
      return this;
    }

    /** Details about the token, if a tokenized payment method was used. */
    public Builder setTokenDetails(
        IssuingAuthorizationEvaluationCreateParams.TokenDetails tokenDetails) {
      this.tokenDetails = tokenDetails;
      return this;
    }

    /** Details about verification checks performed. */
    public Builder setVerificationDetails(
        IssuingAuthorizationEvaluationCreateParams.VerificationDetails verificationDetails) {
      this.verificationDetails = verificationDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationDetails {
    /** <strong>Required.</strong> The authorization amount in the smallest currency unit. */
    @SerializedName("amount")
    Long amount;

    /** The method used for authorization. */
    @SerializedName("authorization_method")
    AuthorizationMethod authorizationMethod;

    /** <strong>Required.</strong> Three-letter ISO currency code in lowercase. */
    @SerializedName("currency")
    String currency;

    /** The card entry mode. */
    @SerializedName("entry_mode")
    EntryMode entryMode;

    /** The raw code for the card entry mode. */
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

    /**
     * <strong>Required.</strong> The time when the authorization was initiated (Unix timestamp).
     */
    @SerializedName("initiated_at")
    Long initiatedAt;

    /** The point of sale condition. */
    @SerializedName("point_of_sale_condition")
    PointOfSaleCondition pointOfSaleCondition;

    /** The raw code for the point of sale condition. */
    @SerializedName("point_of_sale_condition_raw_code")
    String pointOfSaleConditionRawCode;

    /** <strong>Required.</strong> External reference for the authorization. */
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

      /** <strong>Required.</strong> The authorization amount in the smallest currency unit. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** The method used for authorization. */
      public Builder setAuthorizationMethod(
          IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails.AuthorizationMethod
              authorizationMethod) {
        this.authorizationMethod = authorizationMethod;
        return this;
      }

      /** <strong>Required.</strong> Three-letter ISO currency code in lowercase. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /** The card entry mode. */
      public Builder setEntryMode(
          IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails.EntryMode entryMode) {
        this.entryMode = entryMode;
        return this;
      }

      /** The raw code for the card entry mode. */
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

      /**
       * <strong>Required.</strong> The time when the authorization was initiated (Unix timestamp).
       */
      public Builder setInitiatedAt(Long initiatedAt) {
        this.initiatedAt = initiatedAt;
        return this;
      }

      /** The point of sale condition. */
      public Builder setPointOfSaleCondition(
          IssuingAuthorizationEvaluationCreateParams.AuthorizationDetails.PointOfSaleCondition
              pointOfSaleCondition) {
        this.pointOfSaleCondition = pointOfSaleCondition;
        return this;
      }

      /** The raw code for the point of sale condition. */
      public Builder setPointOfSaleConditionRawCode(String pointOfSaleConditionRawCode) {
        this.pointOfSaleConditionRawCode = pointOfSaleConditionRawCode;
        return this;
      }

      /** <strong>Required.</strong> External reference for the authorization. */
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
    /** <strong>Required.</strong> Bank Identification Number (BIN) of the card. */
    @SerializedName("bin")
    String bin;

    /** Two-letter ISO country code of the card's issuing bank. */
    @SerializedName("bin_country")
    String binCountry;

    /** <strong>Required.</strong> The type of card (physical or virtual). */
    @SerializedName("card_type")
    CardType cardType;

    /** <strong>Required.</strong> The time when the card was created (Unix timestamp). */
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

    /** Last 4 digits of the card number. */
    @SerializedName("last4")
    String last4;

    /** <strong>Required.</strong> External reference for the card. */
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

      /** <strong>Required.</strong> Bank Identification Number (BIN) of the card. */
      public Builder setBin(String bin) {
        this.bin = bin;
        return this;
      }

      /** Two-letter ISO country code of the card's issuing bank. */
      public Builder setBinCountry(String binCountry) {
        this.binCountry = binCountry;
        return this;
      }

      /** <strong>Required.</strong> The type of card (physical or virtual). */
      public Builder setCardType(
          IssuingAuthorizationEvaluationCreateParams.CardDetails.CardType cardType) {
        this.cardType = cardType;
        return this;
      }

      /** <strong>Required.</strong> The time when the card was created (Unix timestamp). */
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

      /** Last 4 digits of the card number. */
      public Builder setLast4(String last4) {
        this.last4 = last4;
        return this;
      }

      /** <strong>Required.</strong> External reference for the card. */
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
    /** The time when the cardholder was created (Unix timestamp). */
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

    /** External reference for the cardholder. */
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

      /** The time when the cardholder was created (Unix timestamp). */
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

      /** External reference for the cardholder. */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantDetails {
    /** <strong>Required.</strong> Merchant Category Code (MCC). */
    @SerializedName("category_code")
    String categoryCode;

    /** Two-letter ISO country code of the merchant. */
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

    /** <strong>Required.</strong> Name of the merchant. */
    @SerializedName("name")
    String name;

    /** <strong>Required.</strong> Network merchant identifier. */
    @SerializedName("network_id")
    String networkId;

    /** Terminal identifier. */
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

      /** <strong>Required.</strong> Merchant Category Code (MCC). */
      public Builder setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
      }

      /** Two-letter ISO country code of the merchant. */
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

      /** <strong>Required.</strong> Name of the merchant. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** <strong>Required.</strong> Network merchant identifier. */
      public Builder setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
      }

      /** Terminal identifier. */
      public Builder setTerminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkDetails {
    /** The acquiring institution identifier. */
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

    /** The card network that routed the authorization. */
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

      /** The acquiring institution identifier. */
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

      /** The card network that routed the authorization. */
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
    /** The time when the token was created (Unix timestamp). */
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

    /** External reference for the token. */
    @SerializedName("reference")
    String reference;

    /** The wallet provider for the tokenized payment method. */
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

      /** The time when the token was created (Unix timestamp). */
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

      /** External reference for the token. */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }

      /** The wallet provider for the tokenized payment method. */
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

    /** The result of 3D Secure verification. */
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

      /** The result of 3D Secure verification. */
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
