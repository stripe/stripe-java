package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
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
public class Dispute extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  List<BalanceTransaction> balanceTransactions;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  String currency;
  EvidenceSubObject evidenceSubObject; // `evidence`
  EvidenceDetails evidenceDetails;
  @Getter(AccessLevel.NONE) Boolean isChargeRefundable;
  Boolean livemode;
  Map<String, String> metadata;
  String reason;
  String status;
  String networkReasonCode; // Not part of the public API.

  /**
   * The {@code balance_transaction} attribute.
   *
   * @return the {@code balance_transaction} attribute
   * @deprecated Prefer using the {@link #balanceTransactions} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-08-20">API version 2014-08-20</a>
   */
  @Deprecated
  String balanceTransaction;

  /**
   * The {@code evidence} String attribute.
   *
   * @return the {@code evidence} String attribute
   * @deprecated Prefer using the {@link #getEvidenceSubObject} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-08">API version 2014-12-08</a>
   */
  @Deprecated
  String evidence;

  /**
   * The {@code evidence_due_by} attribute.
   *
   * @return the {@code evidence_due_by} attribute
   * @deprecated Prefer using the {@code getEvidenceDetails().getDueBy()} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-08">API version 2014-12-08</a>
   */
  @Deprecated
  Long evidenceDueBy;

  // <editor-fold desc="charge">
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String chargeID) {
    this.charge = setExpandableFieldID(chargeID, this.charge);
  }

  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge charge) {
    this.charge = new ExpandableField<Charge>(charge.getId(), charge);
  }
  // </editor-fold>

  // TODO: change return type to Boolean in next major version
  public boolean getIsChargeRefundable() {
    return isChargeRefundable;
  }

  // <editor-fold desc="close">
  /**
   * Close a dispute.
   */
  public Dispute close()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return close(null);
  }

  /**
   * Close a dispute.
   */
  public Dispute close(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/close",
        instanceURL(Dispute.class, this.getId())), null, Dispute.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all disputes.
   */
  public static DisputeCollection list(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, null);
  }

  /**
   * List all disputes.
   */
  public static DisputeCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return requestCollection(classURL(Dispute.class), params, DisputeCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a dispute.
   */
  public static Dispute retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null, null);
  }

  /**
   * Retrieve a dispute.
   */
  public static Dispute retrieve(String id, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a dispute.
   */
  public static Dispute retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Dispute.class, id), params, Dispute.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a dispute.
   */
  public Dispute update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update a dispute.
   */
  public Dispute update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Dispute.class, this.getId()),
        params, Dispute.class, options);
  }
  // </editor-fold>
}
