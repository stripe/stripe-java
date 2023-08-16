// File generated from our OpenAPI spec
package com.stripe.model.capital;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.capital.FinancingTransactionListParams;
import com.stripe.param.capital.FinancingTransactionRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** This is an object representing the details of a transaction on a Capital financing object. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancingTransaction extends ApiResource implements HasId {
  /** The ID of the merchant associated with this financing transaction. */
  @SerializedName("account")
  String account;

  /** Time at which the financing transaction was created. Given in seconds since unix epoch. */
  @SerializedName("created_at")
  Long createdAt;

  /** This is an object representing a transaction on a Capital financing offer. */
  @SerializedName("details")
  Details details;

  /** The Capital financing offer for this financing transaction. */
  @SerializedName("financing_offer")
  String financingOffer;

  /** A unique identifier for the financing transaction object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The Capital transaction object that predates the Financing Transactions API and corresponds
   * with the balance transaction that was created as a result of this financing transaction.
   */
  @SerializedName("legacy_balance_transaction_source")
  String legacyBalanceTransactionSource;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The object type: financing_transaction
   *
   * <p>Equal to {@code capital.financing_transaction}.
   */
  @SerializedName("object")
  String object;

  /**
   * The type of the financing transaction.
   *
   * <p>One of {@code payment}, {@code payout}, or {@code reversal}.
   */
  @SerializedName("type")
  String type;

  /** A human-friendly description of the financing transaction. */
  @SerializedName("user_facing_description")
  String userFacingDescription;

  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public static FinancingTransactionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public static FinancingTransactionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/capital/financing_transactions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            FinancingTransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public static FinancingTransactionCollection list(FinancingTransactionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of financing transactions. The transactions are returned in sorted order, with
   * the most recent transactions appearing first.
   */
  public static FinancingTransactionCollection list(
      FinancingTransactionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/capital/financing_transactions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            FinancingTransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a financing transaction for a financing offer. */
  public static FinancingTransaction retrieve(String financingTransaction) throws StripeException {
    return retrieve(financingTransaction, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a financing transaction for a financing offer. */
  public static FinancingTransaction retrieve(String financingTransaction, RequestOptions options)
      throws StripeException {
    return retrieve(financingTransaction, (Map<String, Object>) null, options);
  }

  /** Retrieves a financing transaction for a financing offer. */
  public static FinancingTransaction retrieve(
      String financingTransaction, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/capital/financing_transactions/%s", ApiResource.urlEncodeId(financingTransaction));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            FinancingTransaction.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a financing transaction for a financing offer. */
  public static FinancingTransaction retrieve(
      String financingTransaction,
      FinancingTransactionRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/capital/financing_transactions/%s", ApiResource.urlEncodeId(financingTransaction));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            FinancingTransaction.class,
            options,
            ApiMode.V1);
  }

  /** This is an object representing a transaction on a Capital financing offer. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Details extends StripeObject {
    /** The advance amount being repaid, paid out, or reversed in minor units. */
    @SerializedName("advance_amount")
    Long advanceAmount;

    /** The currency of the financing transaction. */
    @SerializedName("currency")
    String currency;

    /** The fee amount being repaid, paid out, or reversed in minor units. */
    @SerializedName("fee_amount")
    Long feeAmount;

    /**
     * The linked payment for the transaction. This field only applies to financing transactions of
     * type {@code paydown} and reason {@code automatic_withholding}.
     */
    @SerializedName("linked_payment")
    String linkedPayment;

    /**
     * The reason for the financing transaction (if applicable).
     *
     * <p>One of {@code automatic_withholding}, {@code automatic_withholding_refund}, {@code
     * collection}, {@code collection_failure}, {@code financing_cancellation}, {@code refill},
     * {@code requested_by_user}, or {@code user_initiated}.
     */
    @SerializedName("reason")
    String reason;

    /**
     * The reversed transaction. This field only applies to financing transactions of type {@code
     * reversal}.
     */
    @SerializedName("reversed_transaction")
    String reversedTransaction;

    /** The advance and fee amount being repaid, paid out, or reversed in minor units. */
    @SerializedName("total_amount")
    Long totalAmount;

    /** This is an object representing a linked transaction on a Capital Financing Transaction. */
    @SerializedName("transaction")
    Transaction transaction;

    /** This is an object representing a linked transaction on a Capital Financing Transaction. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Transaction extends StripeObject {
      /** The linked payment ID. */
      @SerializedName("charge")
      String charge;

      /** The linked Treasury Financing Transaction ID. */
      @SerializedName("treasury_transaction")
      String treasuryTransaction;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(details, responseGetter);
  }
}
