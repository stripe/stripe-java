// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

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
public class PayoutMethodListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The page size. */
  @SerializedName("limit")
  Integer limit;

  /** Usage status filter. */
  @SerializedName("usage_status")
  UsageStatus usageStatus;

  private PayoutMethodListParams(
      Map<String, Object> extraParams, Integer limit, UsageStatus usageStatus) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.usageStatus = usageStatus;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Integer limit;

    private UsageStatus usageStatus;

    /** Finalize and obtain parameter instance from this builder. */
    public PayoutMethodListParams build() {
      return new PayoutMethodListParams(this.extraParams, this.limit, this.usageStatus);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PayoutMethodListParams#extraParams} for the field documentation.
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
     * See {@link PayoutMethodListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The page size. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /** Usage status filter. */
    public Builder setUsageStatus(PayoutMethodListParams.UsageStatus usageStatus) {
      this.usageStatus = usageStatus;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageStatus {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** List of payments status to filter by. */
    @SerializedName("payments")
    List<PayoutMethodListParams.UsageStatus.Payment> payments;

    /** List of transfers status to filter by. */
    @SerializedName("transfers")
    List<PayoutMethodListParams.UsageStatus.Transfer> transfers;

    private UsageStatus(
        Map<String, Object> extraParams,
        List<PayoutMethodListParams.UsageStatus.Payment> payments,
        List<PayoutMethodListParams.UsageStatus.Transfer> transfers) {
      this.extraParams = extraParams;
      this.payments = payments;
      this.transfers = transfers;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<PayoutMethodListParams.UsageStatus.Payment> payments;

      private List<PayoutMethodListParams.UsageStatus.Transfer> transfers;

      /** Finalize and obtain parameter instance from this builder. */
      public PayoutMethodListParams.UsageStatus build() {
        return new PayoutMethodListParams.UsageStatus(
            this.extraParams, this.payments, this.transfers);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PayoutMethodListParams.UsageStatus#extraParams} for the field documentation.
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
       * See {@link PayoutMethodListParams.UsageStatus#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `payments` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * PayoutMethodListParams.UsageStatus#payments} for the field documentation.
       */
      public Builder addPayment(PayoutMethodListParams.UsageStatus.Payment element) {
        if (this.payments == null) {
          this.payments = new ArrayList<>();
        }
        this.payments.add(element);
        return this;
      }

      /**
       * Add all elements to `payments` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * PayoutMethodListParams.UsageStatus#payments} for the field documentation.
       */
      public Builder addAllPayment(List<PayoutMethodListParams.UsageStatus.Payment> elements) {
        if (this.payments == null) {
          this.payments = new ArrayList<>();
        }
        this.payments.addAll(elements);
        return this;
      }

      /**
       * Add an element to `transfers` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * PayoutMethodListParams.UsageStatus#transfers} for the field documentation.
       */
      public Builder addTransfer(PayoutMethodListParams.UsageStatus.Transfer element) {
        if (this.transfers == null) {
          this.transfers = new ArrayList<>();
        }
        this.transfers.add(element);
        return this;
      }

      /**
       * Add all elements to `transfers` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PayoutMethodListParams.UsageStatus#transfers} for the field documentation.
       */
      public Builder addAllTransfer(List<PayoutMethodListParams.UsageStatus.Transfer> elements) {
        if (this.transfers == null) {
          this.transfers = new ArrayList<>();
        }
        this.transfers.addAll(elements);
        return this;
      }
    }

    public enum Payment implements ApiRequestParams.EnumParam {
      @SerializedName("eligible")
      ELIGIBLE("eligible"),

      @SerializedName("invalid")
      INVALID("invalid"),

      @SerializedName("requires_action")
      REQUIRES_ACTION("requires_action");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Payment(String value) {
        this.value = value;
      }
    }

    public enum Transfer implements ApiRequestParams.EnumParam {
      @SerializedName("eligible")
      ELIGIBLE("eligible"),

      @SerializedName("invalid")
      INVALID("invalid"),

      @SerializedName("requires_action")
      REQUIRES_ACTION("requires_action");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Transfer(String value) {
        this.value = value;
      }
    }
  }
}
