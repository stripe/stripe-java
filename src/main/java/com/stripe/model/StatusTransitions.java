package com.stripe.model;

import com.stripe.net.APIResource;

public class StatusTransitions extends APIResource {
  Long canceled;
  Long fulfilled;
  Long paid;
  Long returned;

  public Long getCanceled() {
    return canceled;
  }

  public void setCanceled(Long canceled) {
    this.canceled = canceled;
  }

  public Long getFulfiled() {
    return fulfilled;
  }

  public void setFulfiled(Long fulfilled) {
    this.fulfilled = fulfilled;
  }

  public Long getPaid() {
    return paid;
  }

  public void setPaid(Long paid) {
    this.paid = paid;
  }

  public Long getReturned() {
    return returned;
  }

  public void setReturned(Long returned) {
    this.returned = returned;
  }
}
