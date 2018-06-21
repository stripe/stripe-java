package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuerFraudRecord extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  String fraudType;
  Boolean livemode;
  Long postDate;

  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String chargeId) {
    this.charge = setExpandableFieldId(chargeId, this.charge);
  }

  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge c) {
    this.charge = new ExpandableField<Charge>(c.getId(), c);
  }

  // <editor-fold desc="list">
  public static IssuerFraudRecordCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
                      ApiConnectionException, CardException, ApiException {
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
                      ApiConnectionException, CardException, ApiException {
    return requestCollection(
        classUrl(IssuerFraudRecord.class), params, IssuerFraudRecordCollection.class, options
    );
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  public static IssuerFraudRecord retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
                      ApiConnectionException, CardException, ApiException {
    return retrieve(id, null);
  }

  public static IssuerFraudRecord retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
                      ApiConnectionException, CardException, ApiException {
    String url = instanceUrl(IssuerFraudRecord.class, id);
    return request(RequestMethod.GET, url, null, IssuerFraudRecord.class, null);
  }
  // </editor-fold>
}
