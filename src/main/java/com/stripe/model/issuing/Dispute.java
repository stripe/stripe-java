package com.stripe.model.issuing;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Dispute extends APIResource implements MetadataStore<Dispute>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long created;
  Evidence evidence;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String reason;
  String status;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    ExpandableField<Transaction> transaction;

  // <editor-fold desc="transaction">
  public String getTransaction() {
    return (this.transaction != null) ? this.transaction.getId() : null;
  }

  public void setTransaction(String transactionId) {
    this.transaction = setExpandableFieldID(transactionId, this.transaction);
  }

  public Transaction getTransactionObject() {
    return (this.transaction != null) ? this.transaction.getExpanded() : null;
  }

  public void setTransactionObject(Transaction c) {
    this.transaction = new ExpandableField<Transaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create an issuing dispute.
   */
  public static Dispute create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create an issuing dispute.
   */
  public static Dispute create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Dispute.class), params,
      Dispute.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all issuing disputes.
   */
  public static DisputeCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all issuing disputes.
   */
  public static DisputeCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return requestCollection(classURL(Dispute.class), params,
      DisputeCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an issuing dispute.
   */
  public static Dispute retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an issuing dispute.
   */
  public static Dispute retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Dispute.class, id), null,
      Dispute.class, options);
  }

  /**
   * Retrieve an issuing dispute.
   */
  public static Dispute retrieve(String id, Map<String, Object> params,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Dispute.class, id), params,
      Dispute.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an issuing dispute.
   */
  @Override
  public Dispute update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update an issuing dispute.
   */
  @Override
  public Dispute update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Dispute.class, this.id), params,
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
