package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ThreeDSecure extends APIResource implements HasId {
  String id;
  String object;
  Long amount;
  Boolean authenticated;
  Card card;
  Long created;
  String currency;
  Boolean livemode;
  @SerializedName("redirect_url") String redirectURL;
  String status;

  public static ThreeDSecure create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  public static ThreeDSecure create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, getClassURL(), params, ThreeDSecure.class, options);
  }

  public static ThreeDSecure retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  public static ThreeDSecure retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, getInstanceURL(id), null, ThreeDSecure.class, options);
  }

  private static String getClassURL() {
    return String.format("%s/v1/%s", Stripe.getApiBase(), "3d_secure");
  }

  private static String getInstanceURL(String id) {
    if (id != null && !id.isEmpty()) {
      return String.format("%s/%s", getClassURL(), id);
    }
    return null;
  }
}
