package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class EphemeralKey extends APIResource implements HasId {
  String id;
  String object;
  Long created;
  Long expires;
  Boolean livemode;
  String secret;
  List<EphemeralKeyAssociatedObject> associatedObjects;
  transient String rawJson;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public Long getExpires() {
    return expires;
  }

  public void setExpires(Long expires) {
    this.expires = expires;
  }

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public List<EphemeralKeyAssociatedObject> getAssociatedObjects() {
    return associatedObjects;
  }

  public void setAssociatedObjects(List<EphemeralKeyAssociatedObject> associatedObjects) {
    this.associatedObjects = associatedObjects;
  }

  public String getRawJson() {
    return rawJson;
  }

  public void setRawJson(String rawJson) {
    this.rawJson = rawJson;
  }

  public static EphemeralKey create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    if (options.getStripeVersion() == null) {
      throw new IllegalArgumentException("stripeVersion must be specified in RequestOptions");
    }

    return request(RequestMethod.POST, classURL(EphemeralKey.class), params, EphemeralKey.class, options);
  }

  public EphemeralKey delete()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(null);
  }

  public EphemeralKey delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(EphemeralKey.class, this.id), null, EphemeralKey.class, options);
  }
}
