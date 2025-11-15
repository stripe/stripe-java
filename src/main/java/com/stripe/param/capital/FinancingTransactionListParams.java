// File generated from our OpenAPI spec
package com.stripe.param.capital;

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
public class FinancingTransactionListParams extends ApiRequestParams {
  /**
   * For transactions of type {@code paydown} and reason {@code automatic_withholding} only, only
   * returns transactions that were created as a result of this charge.
   */
  @SerializedName("charge")
  String charge;

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

  /** Returns transactions that were created that apply to this financing offer ID. */
  @SerializedName("financing_offer")
  String financingOffer;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Only returns transactions that are responsible for reversing this financing transaction ID. */
  @SerializedName("reversed_transaction")
  String reversedTransaction;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * For transactions of type {@code paydown} and reason {@code automatic_withholding} only, only
   * returns transactions that were created as a result of this Treasury Transaction.
   */
  @SerializedName("treasury_transaction")
  String treasuryTransaction;

  private FinancingTransactionListParams(
      String charge,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      String financingOffer,
      Long limit,
      String reversedTransaction,
      String startingAfter,
      String treasuryTransaction) {
    this.charge = charge;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.financingOffer = financingOffer;
    this.limit = limit;
    this.reversedTransaction = reversedTransaction;
    this.startingAfter = startingAfter;
    this.treasuryTransaction = treasuryTransaction;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String charge;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String financingOffer;

    private Long limit;

    private String reversedTransaction;

    private String startingAfter;

    private String treasuryTransaction;

    /** Finalize and obtain parameter instance from this builder. */
    public FinancingTransactionListParams build() {
      return new FinancingTransactionListParams(
          this.charge,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.financingOffer,
          this.limit,
          this.reversedTransaction,
          this.startingAfter,
          this.treasuryTransaction);
    }

    /**
     * For transactions of type {@code paydown} and reason {@code automatic_withholding} only, only
     * returns transactions that were created as a result of this charge.
     */
    public Builder setCharge(String charge) {
      this.charge = charge;
      return this;
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
     * FinancingTransactionListParams#expand} for the field documentation.
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
     * FinancingTransactionListParams#expand} for the field documentation.
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
     * FinancingTransactionListParams#extraParams} for the field documentation.
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
     * See {@link FinancingTransactionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Returns transactions that were created that apply to this financing offer ID. */
    public Builder setFinancingOffer(String financingOffer) {
      this.financingOffer = financingOffer;
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

    /**
     * Only returns transactions that are responsible for reversing this financing transaction ID.
     */
    public Builder setReversedTransaction(String reversedTransaction) {
      this.reversedTransaction = reversedTransaction;
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
     * For transactions of type {@code paydown} and reason {@code automatic_withholding} only, only
     * returns transactions that were created as a result of this Treasury Transaction.
     */
    public Builder setTreasuryTransaction(String treasuryTransaction) {
      this.treasuryTransaction = treasuryTransaction;
      return this;
    }
  }
}
