package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class IssuerFraudRecord extends APIResource implements HasId {
  String id;
  String object;
  ExpandableField<Charge> charge;
  Long created;
  String fraudType;
  Boolean livemode;
  Long postDate;

  @Override
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

  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String chargeID) {
    this.charge = setExpandableFieldID(chargeID, this.charge);
  }

  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge c) {
    this.charge = new ExpandableField<Charge>(c.getId(), c);
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public String getFraudType() {
    return fraudType;
  }

  public void setFraudType(String fraudType) {
    this.fraudType = fraudType;
  }

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public Long getPostDate() {
    return postDate;
  }

  public void setPostDate(Long postDate) {
    this.postDate = postDate;
  }

  public static IssuerFraudRecord retrieve(String id)
      throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
    String url = instanceURL(IssuerFraudRecord.class, id);
    return request(RequestMethod.GET, url, null, IssuerFraudRecord.class, null);
  }

  public static IssuerFraudRecordCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static IssuerFraudRecordCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
    return requestCollection(classURL(IssuerFraudRecord.class), params, IssuerFraudRecordCollection.class, options);
  }

}
