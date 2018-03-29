package com.stripe.model;

import com.stripe.net.APIResource;

public class BitcoinTransaction extends APIResource implements HasId {
  String id;
  Long amount;
  Long bitcoinAmount;
  Long created;
  String currency;
  String customer;
  String receiver;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getBitcoinAmount() {
    return bitcoinAmount;
  }

  public void setBitcoinAmount(Long bitcoinAmount) {
    this.bitcoinAmount = bitcoinAmount;
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

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }
}
