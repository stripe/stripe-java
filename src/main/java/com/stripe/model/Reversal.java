package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Reversal extends APIResource implements MetadataStore<Transfer>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  Long created;
  String currency;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Transfer> transfer;

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionID) {
    this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="transfer">
  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String transferID) {
    this.transfer = setExpandableFieldID(transferID, this.transfer);
  }

  public Transfer getTransferObject() {
    return (this.transfer != null) ? this.transfer.getExpanded() : null;
  }

  public void setTransferObject(Transfer c) {
    this.transfer = new ExpandableField<Transfer>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a reversal.
   */
  @Override
  public Reversal update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a reversal.
   */
  @Override
  public Reversal update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, Reversal.class, options);
  }
  // </editor-fold>

  protected String getInstanceURL() {
    if (this.transfer != null) {
      return String.format("%s/%s/reversals/%s", classURL(Transfer.class), this.getTransfer(),
          this.getId());
    }
    return null;
  }
}
