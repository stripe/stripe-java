package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Balance extends ApiResource {
  String object;
  List<Money> available;
  Boolean livemode;
  List<Money> pending;

  // <editor-fold desc="retrieve">
  /**
   * Retrieve balance.
   */
  public static Balance retrieve() throws StripeException {
    return retrieve((RequestOptions) null);
  }

  /**
   * Retrieve balance.
   */
  public static Balance retrieve(RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, singleClassUrl(Balance.class), null, Balance.class, options);
  }
  // </editor-fold>
}
