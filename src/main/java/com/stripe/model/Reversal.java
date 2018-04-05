package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Reversal extends APIResource implements MetadataStore<Transfer>, HasId {
  String id;
  String object;
  Long amount;
  ExpandableField<BalanceTransaction> balanceTransaction;
  Long created;
  String currency;
  Map<String, String> metadata;
  ExpandableField<Transfer> transfer;

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

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

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

  @Override
  public Reversal update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public Reversal update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Override
  public Reversal update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, Reversal.class, options);
  }

  protected String getInstanceURL() {
    if (this.transfer != null) {
      return String.format("%s/%s/reversals/%s", classURL(Transfer.class), this.transfer,
          this.getId());
    }
    return null;
  }
}
