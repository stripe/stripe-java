package com.stripe.model;

import com.stripe.net.ApiResource;

public class PlanTier extends ApiResource {
  Long amount;
  Long upTo;

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getUpTo() {
    return upTo;
  }

  public void setUpTo(Long upTo) {
    this.upTo = upTo;
  }
}
