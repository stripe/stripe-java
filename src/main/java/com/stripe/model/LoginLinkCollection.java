package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

public class LoginLinkCollection extends StripeCollection<LoginLink> {
  // <editor-fold desc="create">
  /**
   * Create a login link.
   */
  public LoginLink create() throws StripeException {
    return create(null);
  }

  /**
   * Create a login link.
   */
  public LoginLink create(RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(ApiResource.RequestMethod.POST, url, null, LoginLink.class, options);
  }
  // </editor-fold>
}
