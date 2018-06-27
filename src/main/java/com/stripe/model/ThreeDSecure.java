package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ThreeDSecure extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Boolean authenticated;
  Card card;
  Long created;
  String currency;
  Boolean livemode;
  String redirectUrl;
  String status;

  // <editor-fold desc="create">
  public static ThreeDSecure create(Map<String, Object> params)  throws StripeException {
    return create(params, null);
  }

  public static ThreeDSecure create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, getClassUrl(), params, ThreeDSecure.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  public static ThreeDSecure retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  public static ThreeDSecure retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, getInstanceUrl(id), null, ThreeDSecure.class, options);
  }
  // </editor-fold>

  private static String getClassUrl() {
    return String.format("%s/v1/%s", Stripe.getApiBase(), "3d_secure");
  }

  private static String getInstanceUrl(String id) {
    if (id != null && !id.isEmpty()) {
      return String.format("%s/%s", getClassUrl(), id);
    }
    return null;
  }
}
