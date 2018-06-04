package com.stripe.model;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class SourceRedirectFlow extends StripeObject {
  String failureReason;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) String returnUrl;
  String status;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) String url;

  // <editor-fold desc="returnUrl">
  public String getReturnURL() {
    return returnUrl;
  }

  public void setReturnURL(String returnUrl) {
    this.returnUrl = returnUrl;
  }
  // </editor-fold>

  // <editor-fold desc="url">
  public String getURL() {
    return url;
  }

  public void setURL(String url) {
    this.url = url;
  }
  // </editor-fold>
}
