// File generated from our OpenAPI spec
package com.stripe.param.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SettlementAllocationIntentListParams extends ApiRequestParams {
  /**
   * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp; time
   * value, for example: 2025-10-17T13:22::00Z.
   */
  @SerializedName("created_gt")
  Instant createdGt;

  /**
   * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date &amp;
   * time value, for example: 2025-10-17T13:22::00Z.
   */
  @SerializedName("created_gte")
  Instant createdGte;

  /**
   * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp; time
   * value, for example: 2025-10-17T13:22::00Z.
   */
  @SerializedName("created_lt")
  Instant createdLt;

  /**
   * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date &amp;
   * time value, for example: 2025-10-17T13:22::00Z.
   */
  @SerializedName("created_lte")
  Instant createdLte;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Filter the SettlementAllocationIntents by FinancialAccount. */
  @SerializedName("financial_account")
  String financialAccount;

  /** The page size. */
  @SerializedName("limit")
  Long limit;

  /** Filter the SettlementAllocationIntents by status. */
  @SerializedName("status")
  Status status;

  private SettlementAllocationIntentListParams(
      Instant createdGt,
      Instant createdGte,
      Instant createdLt,
      Instant createdLte,
      Map<String, Object> extraParams,
      String financialAccount,
      Long limit,
      Status status) {
    this.createdGt = createdGt;
    this.createdGte = createdGte;
    this.createdLt = createdLt;
    this.createdLte = createdLte;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.limit = limit;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Instant createdGt;

    private Instant createdGte;

    private Instant createdLt;

    private Instant createdLte;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private Long limit;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public SettlementAllocationIntentListParams build() {
      return new SettlementAllocationIntentListParams(
          this.createdGt,
          this.createdGte,
          this.createdLt,
          this.createdLte,
          this.extraParams,
          this.financialAccount,
          this.limit,
          this.status);
    }

    /**
     * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp; time
     * value, for example: 2025-10-17T13:22::00Z.
     */
    public Builder setCreatedGt(Instant createdGt) {
      this.createdGt = createdGt;
      return this;
    }

    /**
     * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2025-10-17T13:22::00Z.
     */
    public Builder setCreatedGte(Instant createdGte) {
      this.createdGte = createdGte;
      return this;
    }

    /**
     * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp;
     * time value, for example: 2025-10-17T13:22::00Z.
     */
    public Builder setCreatedLt(Instant createdLt) {
      this.createdLt = createdLt;
      return this;
    }

    /**
     * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2025-10-17T13:22::00Z.
     */
    public Builder setCreatedLte(Instant createdLte) {
      this.createdLte = createdLte;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SettlementAllocationIntentListParams#extraParams} for the field documentation.
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
     * See {@link SettlementAllocationIntentListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Filter the SettlementAllocationIntents by FinancialAccount. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /** The page size. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Filter the SettlementAllocationIntents by status. */
    public Builder setStatus(SettlementAllocationIntentListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("errored")
    ERRORED("errored"),

    @SerializedName("matched")
    MATCHED("matched"),

    @SerializedName("pending")
    PENDING("pending"),

    @SerializedName("settled")
    SETTLED("settled"),

    @SerializedName("submitted")
    SUBMITTED("submitted");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
