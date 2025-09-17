// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class RateCardSubscriptionListParams extends ApiRequestParams {
  /**
   * Optionally filter by a BillingCadence. Mutually exclusive with {@code payers}, {@code
   * rate_card}, and {@code rate_card_version}.
   */
  @SerializedName("billing_cadence")
  String billingCadence;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The page size limit, if not provided the default is 20. */
  @SerializedName("limit")
  Long limit;

  /**
   * Optionally filter by the payer associated with Billing Cadences which the Rate Card
   * Subscriptions are subscribed to. Mutually exclusive with {@code billing_cadence}, {@code
   * rate_card}, and {@code rate_card_version}.
   */
  @SerializedName("payer")
  Payer payer;

  /**
   * Optionally filter by a RateCard. Mutually exclusive with {@code billing_cadence}, {@code
   * payers}, and {@code rate_card_version}.
   */
  @SerializedName("rate_card")
  String rateCard;

  /**
   * Optionally filter by a RateCard version. Mutually exclusive with {@code billing_cadence},
   * {@code payers}, and {@code rate_card}.
   */
  @SerializedName("rate_card_version")
  String rateCardVersion;

  /** Optionally filter by servicing status. */
  @SerializedName("servicing_status")
  ServicingStatus servicingStatus;

  private RateCardSubscriptionListParams(
      String billingCadence,
      Map<String, Object> extraParams,
      Long limit,
      Payer payer,
      String rateCard,
      String rateCardVersion,
      ServicingStatus servicingStatus) {
    this.billingCadence = billingCadence;
    this.extraParams = extraParams;
    this.limit = limit;
    this.payer = payer;
    this.rateCard = rateCard;
    this.rateCardVersion = rateCardVersion;
    this.servicingStatus = servicingStatus;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String billingCadence;

    private Map<String, Object> extraParams;

    private Long limit;

    private Payer payer;

    private String rateCard;

    private String rateCardVersion;

    private ServicingStatus servicingStatus;

    /** Finalize and obtain parameter instance from this builder. */
    public RateCardSubscriptionListParams build() {
      return new RateCardSubscriptionListParams(
          this.billingCadence,
          this.extraParams,
          this.limit,
          this.payer,
          this.rateCard,
          this.rateCardVersion,
          this.servicingStatus);
    }

    /**
     * Optionally filter by a BillingCadence. Mutually exclusive with {@code payers}, {@code
     * rate_card}, and {@code rate_card_version}.
     */
    public Builder setBillingCadence(String billingCadence) {
      this.billingCadence = billingCadence;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RateCardSubscriptionListParams#extraParams} for the field documentation.
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
     * See {@link RateCardSubscriptionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The page size limit, if not provided the default is 20. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Optionally filter by the payer associated with Billing Cadences which the Rate Card
     * Subscriptions are subscribed to. Mutually exclusive with {@code billing_cadence}, {@code
     * rate_card}, and {@code rate_card_version}.
     */
    public Builder setPayer(RateCardSubscriptionListParams.Payer payer) {
      this.payer = payer;
      return this;
    }

    /**
     * Optionally filter by a RateCard. Mutually exclusive with {@code billing_cadence}, {@code
     * payers}, and {@code rate_card_version}.
     */
    public Builder setRateCard(String rateCard) {
      this.rateCard = rateCard;
      return this;
    }

    /**
     * Optionally filter by a RateCard version. Mutually exclusive with {@code billing_cadence},
     * {@code payers}, and {@code rate_card}.
     */
    public Builder setRateCardVersion(String rateCardVersion) {
      this.rateCardVersion = rateCardVersion;
      return this;
    }

    /** Optionally filter by servicing status. */
    public Builder setServicingStatus(
        RateCardSubscriptionListParams.ServicingStatus servicingStatus) {
      this.servicingStatus = servicingStatus;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payer {
    /**
     * The ID of the Customer object. If provided, only the Rate Card Subscriptions that are
     * subscribed on the Billing Cadences with the specified payer will be returned.
     */
    @SerializedName("customer")
    String customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> A string identifying the type of the payer. Currently the only
     * supported value is {@code customer}.
     */
    @SerializedName("type")
    Type type;

    private Payer(String customer, Map<String, Object> extraParams, Type type) {
      this.customer = customer;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String customer;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public RateCardSubscriptionListParams.Payer build() {
        return new RateCardSubscriptionListParams.Payer(this.customer, this.extraParams, this.type);
      }

      /**
       * The ID of the Customer object. If provided, only the Rate Card Subscriptions that are
       * subscribed on the Billing Cadences with the specified payer will be returned.
       */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RateCardSubscriptionListParams.Payer#extraParams} for the field documentation.
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
       * See {@link RateCardSubscriptionListParams.Payer#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> A string identifying the type of the payer. Currently the only
       * supported value is {@code customer}.
       */
      public Builder setType(RateCardSubscriptionListParams.Payer.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("customer")
      CUSTOMER("customer");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum ServicingStatus implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("paused")
    PAUSED("paused"),

    @SerializedName("pending")
    PENDING("pending");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ServicingStatus(String value) {
      this.value = value;
    }
  }
}
