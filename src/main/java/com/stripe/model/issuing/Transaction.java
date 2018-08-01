package com.stripe.model.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends ApiResource implements MetadataStore<Transaction>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<Authorization> authorization;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<BalanceTransaction> balanceTransaction;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<Card> card;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<Cardholder> cardholder;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<Dispute> dispute;
  Boolean livemode;
  MerchantData merchantData;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String type;

  // <editor-fold desc="authorization">
  public String getAuthorization() {
    return (this.authorization != null) ? this.authorization.getId() : null;
  }

  public void setAuthorization(String authorizationId) {
    this.authorization = setExpandableFieldId(authorizationId, this.authorization);
  }

  public Authorization getAuthorizationObject() {
    return (this.authorization != null) ? this.authorization.getExpanded() : null;
  }

  public void setAuthorizationObject(Authorization c) {
    this.authorization = new ExpandableField<Authorization>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionId) {
    this.balanceTransaction = setExpandableFieldId(balanceTransactionId, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="card">
  public String getCard() {
    return (this.card != null) ? this.card.getId() : null;
  }

  public void setCard(String cardId) {
    this.card = setExpandableFieldId(cardId, this.card);
  }

  public Card getCardObject() {
    return (this.card != null) ? this.card.getExpanded() : null;
  }

  public void setCardObject(Card c) {
    this.card = new ExpandableField<Card>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="cardholder">
  public String getCardholder() {
    return (this.cardholder != null) ? this.cardholder.getId() : null;
  }

  public void setCardholder(String cardholderId) {
    this.cardholder = setExpandableFieldId(cardholderId, this.cardholder);
  }

  public Cardholder getCardholderObject() {
    return (this.cardholder != null) ? this.cardholder.getExpanded() : null;
  }

  public void setCardholderObject(Cardholder c) {
    this.cardholder = new ExpandableField<Cardholder>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="dispute">
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String disputeId) {
    this.dispute = setExpandableFieldId(disputeId, this.dispute);
  }

  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute c) {
    this.dispute = new ExpandableField<Dispute>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all issuing transactions.
   */
  public static TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all issuing transactions.
   */
  public static TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Transaction.class), params,
      TransactionCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an issuing transaction.
   */
  public static Transaction retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an issuing transaction.
   */
  public static Transaction retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve an issuing transaction.
   */
  public static Transaction retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Transaction.class, id), params,
      Transaction.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an issuing transaction.
   */
  @Override
  public Transaction update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update an issuing transaction.
   */
  @Override
  public Transaction update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Transaction.class, this.id), params,
      Transaction.class, options);
  }
  // </editor-fold>
}
