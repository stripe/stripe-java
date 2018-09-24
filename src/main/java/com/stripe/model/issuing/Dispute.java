package com.stripe.model.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
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
public class Dispute extends ApiResource implements MetadataStore<Dispute>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long created;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<Transaction> disputedTransaction;
  Evidence evidence;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String reason;
  String status;

  // <editor-fold desc="transaction">
  public String getDisputedTransaction() {
    return (this.disputedTransaction != null) ? this.disputedTransaction.getId() : null;
  }

  public void setDisputedTransaction(String disputedTransactionId) {
    this.disputedTransaction = setExpandableFieldId(disputedTransactionId,
        this.disputedTransaction);
  }

  public Transaction getDisputedTransactionObject() {
    return (this.disputedTransaction != null) ? this.disputedTransaction.getExpanded() : null;
  }

  public void setDisputedTransactionObject(Transaction c) {
    this.disputedTransaction = new ExpandableField<Transaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create an issuing dispute.
   */
  public static Dispute create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create an issuing dispute.
   */
  public static Dispute create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Dispute.class), params,
      Dispute.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all issuing disputes.
   */
  public static DisputeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all issuing disputes.
   */
  public static DisputeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Dispute.class), params,
      DisputeCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an issuing dispute.
   */
  public static Dispute retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an issuing dispute.
   */
  public static Dispute retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve an issuing dispute.
   */
  public static Dispute retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Dispute.class, id), params,
      Dispute.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an issuing dispute.
   */
  @Override
  public Dispute update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update an issuing dispute.
   */
  @Override
  public Dispute update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Dispute.class, this.id), params,
      Dispute.class, options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public final class EvidenceFraudulent extends StripeObject {
    String disputeExplanation;
    String uncategorizedFile;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public final class EvidenceOther extends StripeObject {
    String disputeExplanation;
    String uncategorizedFile;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public final class Evidence extends StripeObject {
    EvidenceFraudulent fraudulent;
    EvidenceOther other;
  }
}
