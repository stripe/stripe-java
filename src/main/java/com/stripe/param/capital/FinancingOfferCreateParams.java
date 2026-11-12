// File generated from our OpenAPI spec
package com.stripe.param.capital;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancingOfferCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Amount of financing offered, in minor units. For example, 1,000 USD
   * is represented as 100000.
   */
  @SerializedName("advance_amount")
  Long advanceAmount;

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
   * <strong>Required.</strong> Fixed fee amount, in minor units. For example, 100 USD is
   * represented as 10000.
   */
  @SerializedName("fee_amount")
  Long feeAmount;

  /** <strong>Required.</strong> The type of financing offer. */
  @SerializedName("financing_type")
  FinancingType financingType;

  /** The status of the financing offer. */
  @SerializedName("status")
  Status status;

  /**
   * <strong>Required.</strong> Per-transaction rate at which Stripe withholds funds to repay the
   * financing.
   */
  @SerializedName("withhold_rate")
  BigDecimal withholdRate;

  private FinancingOfferCreateParams(
      Long advanceAmount,
      List<String> expand,
      Map<String, Object> extraParams,
      Long feeAmount,
      FinancingType financingType,
      Status status,
      BigDecimal withholdRate) {
    this.advanceAmount = advanceAmount;
    this.expand = expand;
    this.extraParams = extraParams;
    this.feeAmount = feeAmount;
    this.financingType = financingType;
    this.status = status;
    this.withholdRate = withholdRate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long advanceAmount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long feeAmount;

    private FinancingType financingType;

    private Status status;

    private BigDecimal withholdRate;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancingOfferCreateParams build() {
      return new FinancingOfferCreateParams(
          this.advanceAmount,
          this.expand,
          this.extraParams,
          this.feeAmount,
          this.financingType,
          this.status,
          this.withholdRate);
    }

    /**
     * <strong>Required.</strong> Amount of financing offered, in minor units. For example, 1,000
     * USD is represented as 100000.
     */
    public Builder setAdvanceAmount(Long advanceAmount) {
      this.advanceAmount = advanceAmount;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FinancingOfferCreateParams#expand} for the field documentation.
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
     * FinancingOfferCreateParams#expand} for the field documentation.
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
     * FinancingOfferCreateParams#extraParams} for the field documentation.
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
     * See {@link FinancingOfferCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Fixed fee amount, in minor units. For example, 100 USD is
     * represented as 10000.
     */
    public Builder setFeeAmount(Long feeAmount) {
      this.feeAmount = feeAmount;
      return this;
    }

    /** <strong>Required.</strong> The type of financing offer. */
    public Builder setFinancingType(FinancingOfferCreateParams.FinancingType financingType) {
      this.financingType = financingType;
      return this;
    }

    /** The status of the financing offer. */
    public Builder setStatus(FinancingOfferCreateParams.Status status) {
      this.status = status;
      return this;
    }

    /**
     * <strong>Required.</strong> Per-transaction rate at which Stripe withholds funds to repay the
     * financing.
     */
    public Builder setWithholdRate(BigDecimal withholdRate) {
      this.withholdRate = withholdRate;
      return this;
    }
  }

  public enum FinancingType implements ApiRequestParams.EnumParam {
    @SerializedName("cash_advance")
    CASH_ADVANCE("cash_advance"),

    @SerializedName("fixed_term_loan")
    FIXED_TERM_LOAN("fixed_term_loan"),

    @SerializedName("flex_loan")
    FLEX_LOAN("flex_loan");

    @Getter(onMethod_ = {@Override})
    private final String value;

    FinancingType(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("accepted")
    ACCEPTED("accepted"),

    @SerializedName("accepted_other_offer")
    ACCEPTED_OTHER_OFFER("accepted_other_offer"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("completed")
    COMPLETED("completed"),

    @SerializedName("delivered")
    DELIVERED("delivered"),

    @SerializedName("expired")
    EXPIRED("expired"),

    @SerializedName("fully_repaid")
    FULLY_REPAID("fully_repaid"),

    @SerializedName("paid_out")
    PAID_OUT("paid_out"),

    @SerializedName("rejected")
    REJECTED("rejected"),

    @SerializedName("replaced")
    REPLACED("replaced"),

    @SerializedName("undelivered")
    UNDELIVERED("undelivered");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
