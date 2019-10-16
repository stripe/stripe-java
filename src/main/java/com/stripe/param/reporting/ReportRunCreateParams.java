package com.stripe.param.reporting;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ReportRunCreateParams extends ApiRequestParams {
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

  /**
   * Parameters specifying how the report should be run. Different Report Types have different
   * required and optional parameters, listed in the [API Access to
   * Reports](https://stripe.com/docs/reporting/statements/api) documentation.
   */
  @SerializedName("parameters")
  Parameters parameters;

  /**
   * The ID of the [report type](https://stripe.com/docs/reporting/statements/api#report-types) to
   * run, such as `"balance.summary.1"`.
   */
  @SerializedName("report_type")
  String reportType;

  private ReportRunCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Parameters parameters,
      String reportType) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.parameters = parameters;
    this.reportType = reportType;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Parameters parameters;

    private String reportType;

    /** Finalize and obtain parameter instance from this builder. */
    public ReportRunCreateParams build() {
      return new ReportRunCreateParams(
          this.expand, this.extraParams, this.parameters, this.reportType);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReportRunCreateParams#expand} for the field documentation.
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
     * ReportRunCreateParams#expand} for the field documentation.
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
     * ReportRunCreateParams#extraParams} for the field documentation.
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
     * See {@link ReportRunCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Parameters specifying how the report should be run. Different Report Types have different
     * required and optional parameters, listed in the [API Access to
     * Reports](https://stripe.com/docs/reporting/statements/api) documentation.
     */
    public Builder setParameters(Parameters parameters) {
      this.parameters = parameters;
      return this;
    }

    /**
     * The ID of the [report type](https://stripe.com/docs/reporting/statements/api#report-types) to
     * run, such as `"balance.summary.1"`.
     */
    public Builder setReportType(String reportType) {
      this.reportType = reportType;
      return this;
    }
  }

  @Getter
  public static class Parameters {
    /**
     * The set of report columns to include in the report output. If omitted, the Report Type is run
     * with its default column set.
     */
    @SerializedName("columns")
    List<String> columns;

    /** Connected account ID to filter for in the report run. */
    @SerializedName("connected_account")
    String connectedAccount;

    /** Currency of objects to be included in the report run. */
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

    /** Ending timestamp of data to be included in the report run (exclusive). */
    @SerializedName("interval_end")
    Long intervalEnd;

    /** Starting timestamp of data to be included in the report run. */
    @SerializedName("interval_start")
    Long intervalStart;

    /** Payout ID by which to filter the report run. */
    @SerializedName("payout")
    String payout;

    /** Category of balance transactions to be included in the report run. */
    @SerializedName("reporting_category")
    ReportingCategory reportingCategory;

    private Parameters(
        List<String> columns,
        String connectedAccount,
        String currency,
        Map<String, Object> extraParams,
        Long intervalEnd,
        Long intervalStart,
        String payout,
        ReportingCategory reportingCategory) {
      this.columns = columns;
      this.connectedAccount = connectedAccount;
      this.currency = currency;
      this.extraParams = extraParams;
      this.intervalEnd = intervalEnd;
      this.intervalStart = intervalStart;
      this.payout = payout;
      this.reportingCategory = reportingCategory;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<String> columns;

      private String connectedAccount;

      private String currency;

      private Map<String, Object> extraParams;

      private Long intervalEnd;

      private Long intervalStart;

      private String payout;

      private ReportingCategory reportingCategory;

      /** Finalize and obtain parameter instance from this builder. */
      public Parameters build() {
        return new Parameters(
            this.columns,
            this.connectedAccount,
            this.currency,
            this.extraParams,
            this.intervalEnd,
            this.intervalStart,
            this.payout,
            this.reportingCategory);
      }

      /**
       * Add an element to `columns` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ReportRunCreateParams.Parameters#columns} for the field documentation.
       */
      public Builder addColumn(String element) {
        if (this.columns == null) {
          this.columns = new ArrayList<>();
        }
        this.columns.add(element);
        return this;
      }

      /**
       * Add all elements to `columns` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ReportRunCreateParams.Parameters#columns} for the field documentation.
       */
      public Builder addAllColumn(List<String> elements) {
        if (this.columns == null) {
          this.columns = new ArrayList<>();
        }
        this.columns.addAll(elements);
        return this;
      }

      /** Connected account ID to filter for in the report run. */
      public Builder setConnectedAccount(String connectedAccount) {
        this.connectedAccount = connectedAccount;
        return this;
      }

      /** Currency of objects to be included in the report run. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReportRunCreateParams.Parameters#extraParams} for the field documentation.
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
       * See {@link ReportRunCreateParams.Parameters#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Ending timestamp of data to be included in the report run (exclusive). */
      public Builder setIntervalEnd(Long intervalEnd) {
        this.intervalEnd = intervalEnd;
        return this;
      }

      /** Starting timestamp of data to be included in the report run. */
      public Builder setIntervalStart(Long intervalStart) {
        this.intervalStart = intervalStart;
        return this;
      }

      /** Payout ID by which to filter the report run. */
      public Builder setPayout(String payout) {
        this.payout = payout;
        return this;
      }

      /** Category of balance transactions to be included in the report run. */
      public Builder setReportingCategory(ReportingCategory reportingCategory) {
        this.reportingCategory = reportingCategory;
        return this;
      }
    }

    public enum ReportingCategory implements ApiRequestParams.EnumParam {
      @SerializedName("advance")
      ADVANCE("advance"),

      @SerializedName("advance_funding")
      ADVANCE_FUNDING("advance_funding"),

      @SerializedName("charge")
      CHARGE("charge"),

      @SerializedName("charge_failure")
      CHARGE_FAILURE("charge_failure"),

      @SerializedName("connect_collection_transfer")
      CONNECT_COLLECTION_TRANSFER("connect_collection_transfer"),

      @SerializedName("connect_reserved_funds")
      CONNECT_RESERVED_FUNDS("connect_reserved_funds"),

      @SerializedName("dispute")
      DISPUTE("dispute"),

      @SerializedName("dispute_reversal")
      DISPUTE_REVERSAL("dispute_reversal"),

      @SerializedName("fee")
      FEE("fee"),

      @SerializedName("financing_paydown")
      FINANCING_PAYDOWN("financing_paydown"),

      @SerializedName("financing_paydown_reversal")
      FINANCING_PAYDOWN_REVERSAL("financing_paydown_reversal"),

      @SerializedName("financing_payout")
      FINANCING_PAYOUT("financing_payout"),

      @SerializedName("financing_payout_reversal")
      FINANCING_PAYOUT_REVERSAL("financing_payout_reversal"),

      @SerializedName("issuing_authorization_hold")
      ISSUING_AUTHORIZATION_HOLD("issuing_authorization_hold"),

      @SerializedName("issuing_authorization_release")
      ISSUING_AUTHORIZATION_RELEASE("issuing_authorization_release"),

      @SerializedName("issuing_transaction")
      ISSUING_TRANSACTION("issuing_transaction"),

      @SerializedName("network_cost")
      NETWORK_COST("network_cost"),

      @SerializedName("other_adjustment")
      OTHER_ADJUSTMENT("other_adjustment"),

      @SerializedName("partial_capture_reversal")
      PARTIAL_CAPTURE_REVERSAL("partial_capture_reversal"),

      @SerializedName("payout")
      PAYOUT("payout"),

      @SerializedName("payout_reversal")
      PAYOUT_REVERSAL("payout_reversal"),

      @SerializedName("platform_earning")
      PLATFORM_EARNING("platform_earning"),

      @SerializedName("platform_earning_refund")
      PLATFORM_EARNING_REFUND("platform_earning_refund"),

      @SerializedName("refund")
      REFUND("refund"),

      @SerializedName("refund_failure")
      REFUND_FAILURE("refund_failure"),

      @SerializedName("risk_reserved_funds")
      RISK_RESERVED_FUNDS("risk_reserved_funds"),

      @SerializedName("tax")
      TAX("tax"),

      @SerializedName("topup")
      TOPUP("topup"),

      @SerializedName("topup_reversal")
      TOPUP_REVERSAL("topup_reversal"),

      @SerializedName("transfer")
      TRANSFER("transfer"),

      @SerializedName("transfer_reversal")
      TRANSFER_REVERSAL("transfer_reversal");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ReportingCategory(String value) {
        this.value = value;
      }
    }
  }
}
