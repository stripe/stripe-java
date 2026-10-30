// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FundingIntentUpdateParams extends ApiRequestParams {
  /** The updated amount to add to the destination. */
  @SerializedName("amount")
  Amount amount;

  /** Updated details for a check FundingIntent. */
  @SerializedName("check")
  Check check;

  /** The updated confirmation method. */
  @SerializedName("confirmation_method")
  ConfirmationMethod confirmationMethod;

  /** The updated description. */
  @SerializedName("description")
  Object description;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Updates to the key-value pairs attached to the FundingIntent. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  private FundingIntentUpdateParams(
      Amount amount,
      Check check,
      ConfirmationMethod confirmationMethod,
      Object description,
      Map<String, Object> extraParams,
      Map<String, Object> metadata) {
    this.amount = amount;
    this.check = check;
    this.confirmationMethod = confirmationMethod;
    this.description = description;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Check check;

    private ConfirmationMethod confirmationMethod;

    private Object description;

    private Map<String, Object> extraParams;

    private Map<String, Object> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public FundingIntentUpdateParams build() {
      return new FundingIntentUpdateParams(
          this.amount,
          this.check,
          this.confirmationMethod,
          this.description,
          this.extraParams,
          this.metadata);
    }

    /** The updated amount to add to the destination. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /** Updated details for a check FundingIntent. */
    public Builder setCheck(FundingIntentUpdateParams.Check check) {
      this.check = check;
      return this;
    }

    /** The updated confirmation method. */
    public Builder setConfirmationMethod(
        FundingIntentUpdateParams.ConfirmationMethod confirmationMethod) {
      this.confirmationMethod = confirmationMethod;
      return this;
    }

    /** The updated description. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** The updated description. */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FundingIntentUpdateParams#extraParams} for the field documentation.
     */
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
     * See {@link FundingIntentUpdateParams#extraParams} for the field documentation.
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
     * FundingIntentUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * FundingIntentUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * FundingIntentUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Check {
    /** The ID of a File containing the back image of the check. */
    @SerializedName("back_image")
    Object backImage;

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
    Object frontImage;

    private Check(Object backImage, Map<String, Object> extraParams, Object frontImage) {
      this.backImage = backImage;
      this.extraParams = extraParams;
      this.frontImage = frontImage;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object backImage;

      private Map<String, Object> extraParams;

      private Object frontImage;

      /** Finalize and obtain parameter instance from this builder. */
      public FundingIntentUpdateParams.Check build() {
        return new FundingIntentUpdateParams.Check(
            this.backImage, this.extraParams, this.frontImage);
      }

      /** The ID of a File containing the back image of the check. */
      public Builder setBackImage(String backImage) {
        this.backImage = backImage;
        return this;
      }

      /** The ID of a File containing the back image of the check. */
      public Builder setBackImage(EmptyParam backImage) {
        this.backImage = backImage;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FundingIntentUpdateParams.Check#extraParams} for the field documentation.
       */
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
       * See {@link FundingIntentUpdateParams.Check#extraParams} for the field documentation.
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

      /** The ID of a File containing the front image of the check. */
      public Builder setFrontImage(EmptyParam frontImage) {
        this.frontImage = frontImage;
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
}
