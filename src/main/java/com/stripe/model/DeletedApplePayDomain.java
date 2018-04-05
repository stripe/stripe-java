package com.stripe.model;

public class DeletedApplePayDomain extends StripeObject implements DeletedStripeObject {
  String id;
  Boolean deleted;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public Boolean getDeleted() {
    return deleted;
  }

  @Override
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
}
