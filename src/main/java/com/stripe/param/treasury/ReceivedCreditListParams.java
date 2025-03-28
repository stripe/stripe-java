// File generated from our OpenAPI spec
package com.stripe.param.treasury;

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
public class ReceivedCreditListParams extends ApiRequestParams {
  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The FinancialAccount that received the funds. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Only return ReceivedCredits described by the flow. */
  @SerializedName("linked_flows")
  LinkedFlows linkedFlows;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Only return ReceivedCredits that have the given status: {@code succeeded} or {@code failed}.
   */
  @SerializedName("status")
  Status status;

  private ReceivedCreditListParams(
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      String financialAccount,
      Long limit,
      LinkedFlows linkedFlows,
      String startingAfter,
      Status status) {
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financialAccount = financialAccount;
    this.limit = limit;
    this.linkedFlows = linkedFlows;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String financialAccount;

    private Long limit;

    private LinkedFlows linkedFlows;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public ReceivedCreditListParams build() {
      return new ReceivedCreditListParams(
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.financialAccount,
          this.limit,
          this.linkedFlows,
          this.startingAfter,
          this.status);
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReceivedCreditListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReceivedCreditListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ReceivedCreditListParams#extraParams} for the field documentation.
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
     * See {@link ReceivedCreditListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The FinancialAccount that received the funds. */
    public Builder setFinancialAccount(String financialAccount) {
      this.financialAccount = financialAccount;
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Only return ReceivedCredits described by the flow. */
    public Builder setLinkedFlows(ReceivedCreditListParams.LinkedFlows linkedFlows) {
      this.linkedFlows = linkedFlows;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Only return ReceivedCredits that have the given status: {@code succeeded} or {@code failed}.
     */
    public Builder setStatus(ReceivedCreditListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkedFlows {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The source flow type. */
    @SerializedName("source_flow_type")
    SourceFlowType sourceFlowType;

    private LinkedFlows(Map<String, Object> extraParams, SourceFlowType sourceFlowType) {
      this.extraParams = extraParams;
      this.sourceFlowType = sourceFlowType;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private SourceFlowType sourceFlowType;

      /** Finalize and obtain parameter instance from this builder. */
      public ReceivedCreditListParams.LinkedFlows build() {
        return new ReceivedCreditListParams.LinkedFlows(this.extraParams, this.sourceFlowType);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReceivedCreditListParams.LinkedFlows#extraParams} for the field documentation.
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
       * See {@link ReceivedCreditListParams.LinkedFlows#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The source flow type. */
      public Builder setSourceFlowType(
          ReceivedCreditListParams.LinkedFlows.SourceFlowType sourceFlowType) {
        this.sourceFlowType = sourceFlowType;
        return this;
      }
    }

    public enum SourceFlowType implements ApiRequestParams.EnumParam {
      @SerializedName("credit_reversal")
      CREDIT_REVERSAL("credit_reversal"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("outbound_payment")
      OUTBOUND_PAYMENT("outbound_payment"),

      @SerializedName("outbound_transfer")
      OUTBOUND_TRANSFER("outbound_transfer"),

      @SerializedName("payout")
      PAYOUT("payout");

      @Getter(onMethod_ = {@Override})
      private final String value;

      SourceFlowType(String value) {
        this.value = value;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("succeeded")
    SUCCEEDED("succeeded");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
