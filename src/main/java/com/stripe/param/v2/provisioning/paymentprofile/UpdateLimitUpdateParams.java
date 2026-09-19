// File generated from our OpenAPI spec
package com.stripe.param.v2.provisioning.paymentprofile;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class UpdateLimitUpdateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Whether the billing operation should use Stripe live-mode objects. When omitted, this resolves
   * from the authenticated request context.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Provider to update the usage limit for. */
  @SerializedName("provider")
  Object provider;

  /** <strong>Required.</strong> New usage limit to apply. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  private UpdateLimitUpdateParams(
      Map<String, Object> extraParams, Boolean livemode, Object provider, UsageLimits usageLimits) {
    this.extraParams = extraParams;
    this.livemode = livemode;
    this.provider = provider;
    this.usageLimits = usageLimits;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Boolean livemode;

    private Object provider;

    private UsageLimits usageLimits;

    /** Finalize and obtain parameter instance from this builder. */
    public UpdateLimitUpdateParams build() {
      return new UpdateLimitUpdateParams(
          this.extraParams, this.livemode, this.provider, this.usageLimits);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * UpdateLimitUpdateParams#extraParams} for the field documentation.
     */
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
     * See {@link UpdateLimitUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Whether the billing operation should use Stripe live-mode objects. When omitted, this
     * resolves from the authenticated request context.
     */
    public Builder setLivemode(Boolean livemode) {
      this.livemode = livemode;
      return this;
    }

    /** Provider to update the usage limit for. */
    public Builder setProvider(String provider) {
      this.provider = provider;
      return this;
    }

    /** Provider to update the usage limit for. */
    public Builder setProvider(EmptyParam provider) {
      this.provider = provider;
      return this;
    }

    /** <strong>Required.</strong> New usage limit to apply. */
    public Builder setUsageLimits(UpdateLimitUpdateParams.UsageLimits usageLimits) {
      this.usageLimits = usageLimits;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageLimits {
    /** <strong>Required.</strong> Three-letter ISO currency code for {@code max_amount}. */
    @SerializedName("currency")
    Object currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Maximum amount that can be charged per recurring interval. */
    @SerializedName("max_amount")
    @JsonAdapter(StringInt64TypeAdapter.class)
    Long maxAmount;

    /** <strong>Required.</strong> Interval over which {@code max_amount} applies. */
    @SerializedName("recurring_interval")
    RecurringInterval recurringInterval;

    private UsageLimits(
        Object currency,
        Map<String, Object> extraParams,
        Long maxAmount,
        RecurringInterval recurringInterval) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.maxAmount = maxAmount;
      this.recurringInterval = recurringInterval;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object currency;

      private Map<String, Object> extraParams;

      private Long maxAmount;

      private RecurringInterval recurringInterval;

      /** Finalize and obtain parameter instance from this builder. */
      public UpdateLimitUpdateParams.UsageLimits build() {
        return new UpdateLimitUpdateParams.UsageLimits(
            this.currency, this.extraParams, this.maxAmount, this.recurringInterval);
      }

      /** <strong>Required.</strong> Three-letter ISO currency code for {@code max_amount}. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /** <strong>Required.</strong> Three-letter ISO currency code for {@code max_amount}. */
      public Builder setCurrency(EmptyParam currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * UpdateLimitUpdateParams.UsageLimits#extraParams} for the field documentation.
       */
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
       * See {@link UpdateLimitUpdateParams.UsageLimits#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Maximum amount that can be charged per recurring interval. */
      public Builder setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
        return this;
      }

      /** <strong>Required.</strong> Interval over which {@code max_amount} applies. */
      public Builder setRecurringInterval(
          UpdateLimitUpdateParams.UsageLimits.RecurringInterval recurringInterval) {
        this.recurringInterval = recurringInterval;
        return this;
      }
    }

    public enum RecurringInterval implements ApiRequestParams.EnumParam {
      @SerializedName("month")
      MONTH("month"),

      @SerializedName("week")
      WEEK("week"),

      @SerializedName("year")
      YEAR("year");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RecurringInterval(String value) {
        this.value = value;
      }
    }
  }
}
