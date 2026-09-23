// File generated from our OpenAPI spec
package com.stripe.param.v2.provisioning;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethodRequestCreateParams extends ApiRequestParams {
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

  /** Owner of the requested payment method. */
  @SerializedName("payment_method_owner")
  PaymentMethodOwner paymentMethodOwner;

  /** Connected account to source the payment method from. */
  @SerializedName("source_account")
  String sourceAccount;

  /** Customer to source the payment method from. */
  @SerializedName("source_customer")
  String sourceCustomer;

  /** Existing payment method to reuse instead of collecting a new one. */
  @SerializedName("source_payment_method")
  String sourcePaymentMethod;

  /** Usage limit to apply to the requested payment method. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  private PaymentMethodRequestCreateParams(
      Map<String, Object> extraParams,
      Boolean livemode,
      PaymentMethodOwner paymentMethodOwner,
      String sourceAccount,
      String sourceCustomer,
      String sourcePaymentMethod,
      UsageLimits usageLimits) {
    this.extraParams = extraParams;
    this.livemode = livemode;
    this.paymentMethodOwner = paymentMethodOwner;
    this.sourceAccount = sourceAccount;
    this.sourceCustomer = sourceCustomer;
    this.sourcePaymentMethod = sourcePaymentMethod;
    this.usageLimits = usageLimits;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Boolean livemode;

    private PaymentMethodOwner paymentMethodOwner;

    private String sourceAccount;

    private String sourceCustomer;

    private String sourcePaymentMethod;

    private UsageLimits usageLimits;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodRequestCreateParams build() {
      return new PaymentMethodRequestCreateParams(
          this.extraParams,
          this.livemode,
          this.paymentMethodOwner,
          this.sourceAccount,
          this.sourceCustomer,
          this.sourcePaymentMethod,
          this.usageLimits);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodRequestCreateParams#extraParams} for the field documentation.
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
     * See {@link PaymentMethodRequestCreateParams#extraParams} for the field documentation.
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

    /** Owner of the requested payment method. */
    public Builder setPaymentMethodOwner(
        PaymentMethodRequestCreateParams.PaymentMethodOwner paymentMethodOwner) {
      this.paymentMethodOwner = paymentMethodOwner;
      return this;
    }

    /** Connected account to source the payment method from. */
    public Builder setSourceAccount(String sourceAccount) {
      this.sourceAccount = sourceAccount;
      return this;
    }

    /** Customer to source the payment method from. */
    public Builder setSourceCustomer(String sourceCustomer) {
      this.sourceCustomer = sourceCustomer;
      return this;
    }

    /** Existing payment method to reuse instead of collecting a new one. */
    public Builder setSourcePaymentMethod(String sourcePaymentMethod) {
      this.sourcePaymentMethod = sourcePaymentMethod;
      return this;
    }

    /** Usage limit to apply to the requested payment method. */
    public Builder setUsageLimits(PaymentMethodRequestCreateParams.UsageLimits usageLimits) {
      this.usageLimits = usageLimits;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageLimits {
    /** <strong>Required.</strong> Three-letter ISO currency code for {@code max_amount}. */
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

    /** <strong>Required.</strong> Maximum amount that can be charged per recurring interval. */
    @SerializedName("max_amount")
    @JsonAdapter(StringInt64TypeAdapter.class)
    Long maxAmount;

    /** <strong>Required.</strong> Interval over which {@code max_amount} applies. */
    @SerializedName("recurring_interval")
    RecurringInterval recurringInterval;

    private UsageLimits(
        String currency,
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
      private String currency;

      private Map<String, Object> extraParams;

      private Long maxAmount;

      private RecurringInterval recurringInterval;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodRequestCreateParams.UsageLimits build() {
        return new PaymentMethodRequestCreateParams.UsageLimits(
            this.currency, this.extraParams, this.maxAmount, this.recurringInterval);
      }

      /** <strong>Required.</strong> Three-letter ISO currency code for {@code max_amount}. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodRequestCreateParams.UsageLimits#extraParams} for the field documentation.
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
       * See {@link PaymentMethodRequestCreateParams.UsageLimits#extraParams} for the field
       * documentation.
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
          PaymentMethodRequestCreateParams.UsageLimits.RecurringInterval recurringInterval) {
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

  public enum PaymentMethodOwner implements ApiRequestParams.EnumParam {
    @SerializedName("platform")
    PLATFORM("platform");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentMethodOwner(String value) {
      this.value = value;
    }
  }
}
