package com.stripe.model.checkout;

import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.math.BigDecimal;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Session extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Boolean livemode;

  // <editor-fold desc="create">
  /**
   * Create a Session.
   */
  public static Session create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a Session.
   */
  public static Session create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Session.class), params,
        Session.class, options);
  }
  // </editor-fold>
}
