// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.FraudLiabilityDebitListParams;
import com.stripe.param.issuing.FraudLiabilityDebitRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A fraud liability debit occurs when Stripe debits a platform's account for fraud losses on
 * Issuing transactions.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FraudLiabilityDebit extends ApiResource implements HasId {
  /**
   * Debited amount. This is equal to the disputed amount and is given in the card’s currency and in
   * the smallest currency unit.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * ID of the <a href="https://docs.stripe.com/api/balance_transactions">balance transaction</a>
   * associated with this debit.
   */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The currency of the debit. Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the linked dispute. */
  @SerializedName("dispute")
  String dispute;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.fraud_liability_debit}.
   */
  @SerializedName("object")
  String object;

  /** Get ID of expandable {@code balanceTransaction} object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded {@code balanceTransaction}. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static FraudLiabilityDebitCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static FraudLiabilityDebitCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/fraud_liability_debits";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FraudLiabilityDebitCollection.class);
  }

  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static FraudLiabilityDebitCollection list(FraudLiabilityDebitListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code FraudLiabilityDebit} objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static FraudLiabilityDebitCollection list(
      FraudLiabilityDebitListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/fraud_liability_debits";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FraudLiabilityDebitCollection.class);
  }

  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public static FraudLiabilityDebit retrieve(String fraudLiabilityDebit) throws StripeException {
    return retrieve(fraudLiabilityDebit, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public static FraudLiabilityDebit retrieve(String fraudLiabilityDebit, RequestOptions options)
      throws StripeException {
    return retrieve(fraudLiabilityDebit, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public static FraudLiabilityDebit retrieve(
      String fraudLiabilityDebit, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/fraud_liability_debits/%s", ApiResource.urlEncodeId(fraudLiabilityDebit));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FraudLiabilityDebit.class);
  }

  /** Retrieves an Issuing {@code FraudLiabilityDebit} object. */
  public static FraudLiabilityDebit retrieve(
      String fraudLiabilityDebit, FraudLiabilityDebitRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/fraud_liability_debits/%s", ApiResource.urlEncodeId(fraudLiabilityDebit));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FraudLiabilityDebit.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(balanceTransaction, responseGetter);
  }
}
