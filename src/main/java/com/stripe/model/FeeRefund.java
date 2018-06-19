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
public class FeeRefund extends APIResource implements MetadataStore<ApplicationFee>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  String currency;
  Long created;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<ApplicationFee> fee;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;

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

  // <editor-fold desc="fee">
  public String getFee() {
    return (this.fee != null) ? this.fee.getId() : null;
  }

  public void setFee(String feeID) {
    this.fee = setExpandableFieldID(feeID, this.fee);
  }

  public ApplicationFee getFeeObject() {
    return (this.fee != null) ? this.fee.getExpanded() : null;
  }

  public void setFeeObject(ApplicationFee c) {
    this.fee = new ExpandableField<ApplicationFee>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an application fee refund.
   */
  @Override
  public FeeRefund update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update an application fee refund.
   */
  @Override
  public FeeRefund update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, FeeRefund.class, options);
  }
  // </editor-fold>

  protected String getInstanceURL() {
    if (this.fee != null) {
      return String.format("%s/%s/refunds/%s", classURL(ApplicationFee.class), this.getFee(),
          this.getId());
    }
    return null;
  }
}
