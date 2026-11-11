// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ReceivedDebitListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The page limit. */
  @SerializedName("limit")
  Long limit;

  /** Filter by the received debit mandate ID. Deprecated: use {@code spending_mandate} instead. */
  @SerializedName("received_debit_mandate")
  String receivedDebitMandate;

  /** Filter by the SpendingMandate ID. */
  @SerializedName("spending_mandate")
  String spendingMandate;

  private ReceivedDebitListParams(
      Map<String, Object> extraParams,
      Long limit,
      String receivedDebitMandate,
      String spendingMandate) {
    this.extraParams = extraParams;
    this.limit = limit;
    this.receivedDebitMandate = receivedDebitMandate;
    this.spendingMandate = spendingMandate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Long limit;

    private String receivedDebitMandate;

    private String spendingMandate;

    /** Finalize and obtain parameter instance from this builder. */
    public ReceivedDebitListParams build() {
      return new ReceivedDebitListParams(
          this.extraParams, this.limit, this.receivedDebitMandate, this.spendingMandate);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ReceivedDebitListParams#extraParams} for the field documentation.
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
     * See {@link ReceivedDebitListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The page limit. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Filter by the received debit mandate ID. Deprecated: use {@code spending_mandate} instead.
     */
    public Builder setReceivedDebitMandate(String receivedDebitMandate) {
      this.receivedDebitMandate = receivedDebitMandate;
      return this;
    }

    /** Filter by the SpendingMandate ID. */
    public Builder setSpendingMandate(String spendingMandate) {
      this.spendingMandate = spendingMandate;
      return this;
    }
  }
}
