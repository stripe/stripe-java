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
public class ReceivedDebitMandateListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The ID of the FinancialAccount to filter by. */
  @SerializedName("financial_account")
  String financialAccount;

  /** The page limit. */
  @SerializedName("limit")
  Long limit;

  /** Filter by mandate status. */
  @SerializedName("statuses")
  List<ReceivedDebitMandateListParams.Status> statuses;

  /** The type of ReceivedDebitMandate to filter by. */
  @SerializedName("type")
  Type type;

  private ReceivedDebitMandateListParams(
      Map<String, Object> extraParams,
      String financialAccount,
      Long limit,
      List<ReceivedDebitMandateListParams.Status> statuses,
      Type type) {
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.limit = limit;
    this.statuses = statuses;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String financialAccount;

    private Long limit;

    private List<ReceivedDebitMandateListParams.Status> statuses;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public ReceivedDebitMandateListParams build() {
      return new ReceivedDebitMandateListParams(
          this.extraParams, this.financialAccount, this.limit, this.statuses, this.type);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ReceivedDebitMandateListParams#extraParams} for the field documentation.
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
     * See {@link ReceivedDebitMandateListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The ID of the FinancialAccount to filter by. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /** The page limit. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `statuses` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReceivedDebitMandateListParams#statuses} for the field documentation.
     */
    public Builder addStatus(ReceivedDebitMandateListParams.Status element) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.add(element);
      return this;
    }

    /**
     * Add all elements to `statuses` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ReceivedDebitMandateListParams#statuses} for the field documentation.
     */
    public Builder addAllStatus(List<ReceivedDebitMandateListParams.Status> elements) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.addAll(elements);
      return this;
    }

    /** The type of ReceivedDebitMandate to filter by. */
    public Builder setType(ReceivedDebitMandateListParams.Type type) {
      this.type = type;
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("expired")
    EXPIRED("expired"),

    @SerializedName("pending_cancellation")
    PENDING_CANCELLATION("pending_cancellation");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("bank_transfer")
    BANK_TRANSFER("bank_transfer");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
