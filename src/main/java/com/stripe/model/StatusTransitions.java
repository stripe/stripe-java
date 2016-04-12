package com.stripe.model;

import com.stripe.net.APIResource;

public class StatusTransitions extends APIResource {
  Long canceled;
  Long fulfiled;
  Long paid;
  Long returned;

  public Long getCanceled() {
    return canceled;
  }

  public void setCanceled(Long canceled) {
    this.canceled = canceled;
  }

  public Long getFulfiled() {
    return fulfiled;
  }

  public void setFulfiled(Long fulfiled) {
    this.fulfiled = fulfiled;
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
