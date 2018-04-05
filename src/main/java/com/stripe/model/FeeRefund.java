package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class FeeRefund extends APIResource implements MetadataStore<ApplicationFee>, HasId {
  String id;
  String object;
  Long amount;
  ExpandableField<BalanceTransaction> balanceTransaction;
  String currency;
  Long created;
  ExpandableField<ApplicationFee> fee;
  Map<String, String> metadata;

  @Override
  public String getId() {
    return id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

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

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

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

  @Override
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  @Override
  public FeeRefund update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public FeeRefund update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Override
  public FeeRefund update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, FeeRefund.class, options);
  }

  protected String getInstanceURL() {
    if (this.fee != null) {
      return String.format("%s/%s/refunds/%s", classURL(ApplicationFee.class), this.fee,
          this.getId());
    }
    return null;
  }
}
