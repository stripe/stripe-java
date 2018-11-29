package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceRedirectFlow extends StripeObject {
  /**
   * The failure reason for the redirect, either `user_abort` (the customer aborted or dropped out
   * of the redirect flow), `declined` (the authentication failed or the transaction was declined),
   * or `processing_error` (the redirect failed due to a technical error). Present only if the
   * redirect status is `failed`.
   */
  String failureReason;

  /** The URL you provide to redirect the customer to after they authenticated their payment. */
  String returnUrl;

  /**
   * The status of the redirect, either `pending` (ready to be used by your customer to authenticate
   * the transaction), `succeeded` (succesful authentication, cannot be reused) or `not_required`
   * (redirect should not be used) or `failed` (failed authentication, cannot be reused).
   */
  String status;

  /**
   * The URL provided to you to redirect a customer to as part of a `redirect` authentication flow.
   */
  String url;
}
