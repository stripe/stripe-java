package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.TransactionListParams;
import com.stripe.param.issuing.TransactionRetrieveParams;
import com.stripe.param.issuing.TransactionUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends ApiResource
    implements MetadataStore<Transaction>, BalanceTransactionSource {
  /**
   * The amount of this transaction in your currency. This is the amount that your balance will be
   * updated by.
   */
  @SerializedName("amount")
  Long amount;

  /** The `Authorization` object that led to this transaction. */
  @SerializedName("authorization")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Authorization> authorization;

  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** The card used to make this transaction. */
  @SerializedName("card")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Card> card;

  /** The cardholder to whom this transaction belongs. */
  @SerializedName("cardholder")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Cardholder> cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  @SerializedName("dispute")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Dispute> dispute;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The amount that the merchant will receive, denominated in `merchant_currency`. It will be
   * different from `amount` if the merchant is taking payment in a different currency.
   */
  @SerializedName("merchant_amount")
  Long merchantAmount;

  /** The currency with which the merchant is taking payment. */
  @SerializedName("merchant_currency")
  String merchantCurrency;

  @SerializedName("merchant_data")
  MerchantData merchantData;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `issuing.transaction`.
   */
  @SerializedName("object")
  String object;

  /**
   * The nature of the transaction.
   *
   * <p>One of `capture`, `cash_withdrawal`, `dispute`, `dispute_loss`, `refund`, or
   * `refund_reversal`.
   */
  @SerializedName("type")
  String type;

  /** Get id of expandable `authorization` object. */
  public String getAuthorization() {
    return (this.authorization != null) ? this.authorization.getId() : null;
  }

  public void setAuthorization(String id) {
    this.authorization = ApiResource.setExpandableFieldId(id, this.authorization);
  }

  /** Get expanded `authorization`. */
  public Authorization getAuthorizationObject() {
    return (this.authorization != null) ? this.authorization.getExpanded() : null;
  }

  public void setAuthorizationObject(Authorization expandableObject) {
    this.authorization =
        new ExpandableField<Authorization>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `balanceTransaction` object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded `balanceTransaction`. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `card` object. */
  public String getCard() {
    return (this.card != null) ? this.card.getId() : null;
  }

  public void setCard(String id) {
    this.card = ApiResource.setExpandableFieldId(id, this.card);
  }

  /** Get expanded `card`. */
  public Card getCardObject() {
    return (this.card != null) ? this.card.getExpanded() : null;
  }

  public void setCardObject(Card expandableObject) {
    this.card = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `cardholder` object. */
  public String getCardholder() {
    return (this.cardholder != null) ? this.cardholder.getId() : null;
  }

  public void setCardholder(String id) {
    this.cardholder = ApiResource.setExpandableFieldId(id, this.cardholder);
  }

  /** Get expanded `cardholder`. */
  public Cardholder getCardholderObject() {
    return (this.cardholder != null) ? this.cardholder.getExpanded() : null;
  }

  public void setCardholderObject(Cardholder expandableObject) {
    this.cardholder = new ExpandableField<Cardholder>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `dispute` object. */
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String id) {
    this.dispute = ApiResource.setExpandableFieldId(id, this.dispute);
  }

  /** Get expanded `dispute`. */
  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute expandableObject) {
    this.dispute = new ExpandableField<Dispute>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/transactions");
    return ApiResource.requestCollection(url, params, TransactionCollection.class, options);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/transactions");
    return ApiResource.requestCollection(url, params, TransactionCollection.class, options);
  }

  /** Retrieves an Issuing <code>Transaction</code> object. */
  public static Transaction retrieve(String transaction) throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Transaction</code> object. */
  public static Transaction retrieve(String transaction, RequestOptions options)
      throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Transaction</code> object. */
  public static Transaction retrieve(
      String transaction, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(transaction)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  /** Retrieves an Issuing <code>Transaction</code> object. */
  public static Transaction retrieve(
      String transaction, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(transaction)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Transaction update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Transaction update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(TransactionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(TransactionUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }
}
