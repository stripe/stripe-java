// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class TransactionListParams extends ApiRequestParams {
  /** Set of filters to query Transactions within a range of {@code created} timestamps. */
  @SerializedName("created")
  Created created;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Filter for Transactions belonging to a FinancialAccount. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Filter for Transactions corresponding to a Flow. */
  @SerializedName("flow")
  String flow;

  /** The page limit. */
  @SerializedName("limit")
  Long limit;

  private TransactionListParams(
      Created created,
      Map<String, Object> extraParams,
      String financialAccount,
      String flow,
      Long limit) {
    this.created = created;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.flow = flow;
    this.limit = limit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Created created;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private String flow;

    private Long limit;

    /** Finalize and obtain parameter instance from this builder. */
    public TransactionListParams build() {
      return new TransactionListParams(
          this.created, this.extraParams, this.financialAccount, this.flow, this.limit);
    }

    /** Set of filters to query Transactions within a range of {@code created} timestamps. */
    public Builder setCreated(TransactionListParams.Created created) {
      this.created = created;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * TransactionListParams#extraParams} for the field documentation.
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
     * See {@link TransactionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Filter for Transactions belonging to a FinancialAccount. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /** Filter for Transactions corresponding to a Flow. */
    public Builder setFlow(String flow) {
      this.flow = flow;
      return this;
    }

    /** The page limit. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Filter for Transactions created after the specified timestamp. */
    @SerializedName("gt")
    Instant gt;

    /** Filter for Transactions created at or after the specified timestamp. */
    @SerializedName("gte")
    Instant gte;

    /** Filter for Transactions created before the specified timestamp. */
    @SerializedName("lt")
    Instant lt;

    /** Filter for Transactions created at or before the specified timestamp. */
    @SerializedName("lte")
    Instant lte;

    private Created(
        Map<String, Object> extraParams, Instant gt, Instant gte, Instant lt, Instant lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Instant gt;

      private Instant gte;

      private Instant lt;

      private Instant lte;

      /** Finalize and obtain parameter instance from this builder. */
      public TransactionListParams.Created build() {
        return new TransactionListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * TransactionListParams.Created#extraParams} for the field documentation.
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
       * See {@link TransactionListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Filter for Transactions created after the specified timestamp. */
      public Builder setGt(Instant gt) {
        this.gt = gt;
        return this;
      }

      /** Filter for Transactions created at or after the specified timestamp. */
      public Builder setGte(Instant gte) {
        this.gte = gte;
        return this;
      }

      /** Filter for Transactions created before the specified timestamp. */
      public Builder setLt(Instant lt) {
        this.lt = lt;
        return this;
      }

      /** Filter for Transactions created at or before the specified timestamp. */
      public Builder setLte(Instant lte) {
        this.lte = lte;
        return this;
      }
    }
  }
}
