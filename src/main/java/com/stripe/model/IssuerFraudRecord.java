package com.stripe.model;

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
public class IssuerFraudRecord extends APIResource implements HasId {
  String id;
  String object;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  String fraudType;
  Boolean livemode;
  Long postDate;

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

  public static IssuerFraudRecord retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
                      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  public static IssuerFraudRecord retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
                      APIConnectionException, CardException, APIException {
    String url = instanceURL(IssuerFraudRecord.class, id);
    return request(RequestMethod.GET, url, null, IssuerFraudRecord.class, null);
  }

  public static IssuerFraudRecordCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
                      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * Returns the IssuerFraudRecordCollection listing.
   *
   * @param params  The standard parameters for the listing.
   * @param options The standard request options for the listing.
   * @return the listing of params at /v1/issuer_fraud_records.
   */
  public static IssuerFraudRecordCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
                      APIConnectionException, CardException, APIException {
    return requestCollection(
        classURL(IssuerFraudRecord.class), params, IssuerFraudRecordCollection.class, options
    );
  }
}
