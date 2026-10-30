// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FundingIntentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The amount to add to the destination. */
  @SerializedName("amount")
  Amount amount;

  /** Details for a check FundingIntent. */
  @SerializedName("check")
  Check check;

  /** How to confirm the FundingIntent after validation. */
  @SerializedName("confirmation_method")
  ConfirmationMethod confirmationMethod;

  /** An arbitrary string to attach to the FundingIntent. */
  @SerializedName("description")
  String description;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Set of key-value pairs to attach to the FundingIntent. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Controls when the funds become available after processing. */
  @SerializedName("settlement_timing")
  SettlementTiming settlementTiming;

  /** <strong>Required.</strong> The destination for the funds. */
  @SerializedName("to")
  To to;

  /** <strong>Required.</strong> The type of FundingIntent to create. */
  @SerializedName("type")
  Type type;

  private FundingIntentCreateParams(
      Amount amount,
      Check check,
      ConfirmationMethod confirmationMethod,
      String description,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      SettlementTiming settlementTiming,
      To to,
      Type type) {
    this.amount = amount;
    this.check = check;
    this.confirmationMethod = confirmationMethod;
    this.description = description;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.settlementTiming = settlementTiming;
    this.to = to;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Check check;

    private ConfirmationMethod confirmationMethod;

    private String description;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private SettlementTiming settlementTiming;

    private To to;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public FundingIntentCreateParams build() {
      return new FundingIntentCreateParams(
          this.amount,
          this.check,
          this.confirmationMethod,
          this.description,
          this.extraParams,
          this.metadata,
          this.settlementTiming,
          this.to,
          this.type);
    }

    /** <strong>Required.</strong> The amount to add to the destination. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /** Details for a check FundingIntent. */
    public Builder setCheck(FundingIntentCreateParams.Check check) {
      this.check = check;
      return this;
    }

    /** How to confirm the FundingIntent after validation. */
    public Builder setConfirmationMethod(
        FundingIntentCreateParams.ConfirmationMethod confirmationMethod) {
      this.confirmationMethod = confirmationMethod;
      return this;
    }

    /** An arbitrary string to attach to the FundingIntent. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FundingIntentCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link FundingIntentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * FundingIntentCreateParams#metadata} for the field documentation.
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
     * See {@link FundingIntentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Controls when the funds become available after processing. */
    public Builder setSettlementTiming(
        FundingIntentCreateParams.SettlementTiming settlementTiming) {
      this.settlementTiming = settlementTiming;
      return this;
    }

    /** <strong>Required.</strong> The destination for the funds. */
    public Builder setTo(FundingIntentCreateParams.To to) {
      this.to = to;
      return this;
    }

    /** <strong>Required.</strong> The type of FundingIntent to create. */
    public Builder setType(FundingIntentCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Check {
    /** The ID of a File containing the back image of the check. */
    @SerializedName("back_image")
    String backImage;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of a File containing the front image of the check. */
    @SerializedName("front_image")
    String frontImage;

    private Check(String backImage, Map<String, Object> extraParams, String frontImage) {
      this.backImage = backImage;
      this.extraParams = extraParams;
      this.frontImage = frontImage;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String backImage;

      private Map<String, Object> extraParams;

      private String frontImage;

      /** Finalize and obtain parameter instance from this builder. */
      public FundingIntentCreateParams.Check build() {
        return new FundingIntentCreateParams.Check(
            this.backImage, this.extraParams, this.frontImage);
      }

      /** The ID of a File containing the back image of the check. */
      public Builder setBackImage(String backImage) {
        this.backImage = backImage;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FundingIntentCreateParams.Check#extraParams} for the field documentation.
       */
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
       * See {@link FundingIntentCreateParams.Check#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of a File containing the front image of the check. */
      public Builder setFrontImage(String frontImage) {
        this.frontImage = frontImage;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class SettlementTiming {
    /** The number of days to delay the availability of funds after processing completes. */
    @SerializedName("delay_days_override")
    Long delayDaysOverride;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private SettlementTiming(Long delayDaysOverride, Map<String, Object> extraParams) {
      this.delayDaysOverride = delayDaysOverride;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long delayDaysOverride;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public FundingIntentCreateParams.SettlementTiming build() {
        return new FundingIntentCreateParams.SettlementTiming(
            this.delayDaysOverride, this.extraParams);
      }

      /** The number of days to delay the availability of funds after processing completes. */
      public Builder setDelayDaysOverride(Long delayDaysOverride) {
        this.delayDaysOverride = delayDaysOverride;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FundingIntentCreateParams.SettlementTiming#extraParams} for the field documentation.
       */
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
       * See {@link FundingIntentCreateParams.SettlementTiming#extraParams} for the field
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
  public static class To {
    /** <strong>Required.</strong> The currency of the destination FinancialAccount balance. */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The ID of the FinancialAccount that receives the funds. */
    @SerializedName("financial_account")
    String financialAccount;

    private To(String currency, Map<String, Object> extraParams, String financialAccount) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.financialAccount = financialAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private String financialAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public FundingIntentCreateParams.To build() {
        return new FundingIntentCreateParams.To(
            this.currency, this.extraParams, this.financialAccount);
      }

      /** <strong>Required.</strong> The currency of the destination FinancialAccount balance. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FundingIntentCreateParams.To#extraParams} for the field documentation.
       */
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
       * See {@link FundingIntentCreateParams.To#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The ID of the FinancialAccount that receives the funds. */
      public Builder setFinancialAccount(String financialAccount) {
        this.financialAccount = financialAccount;
        return this;
      }
    }
  }

  public enum ConfirmationMethod implements ApiRequestParams.EnumParam {
    @SerializedName("automatic")
    AUTOMATIC("automatic"),

    @SerializedName("manual")
    MANUAL("manual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ConfirmationMethod(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("check")
    CHECK("check");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
