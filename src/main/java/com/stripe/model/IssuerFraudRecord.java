// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.IssuerFraudRecordListParams;
import com.stripe.param.IssuerFraudRecordRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class IssuerFraudRecord extends ApiResource implements HasId {
  /**
   * An IFR is actionable if it has not received a dispute and has not been fully refunded. You may
   * wish to proactively refund a charge that receives an IFR, in order to avoid receiving a dispute
   * later.
   */
  @SerializedName("actionable")
  Boolean actionable;

  /** ID of the charge this issuer fraud record is for, optionally expanded. */
  @SerializedName("charge")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The type of fraud labelled by the issuer. One of {@code card_never_received}, {@code
   * fraudulent_card_application}, {@code made_with_counterfeit_card}, {@code made_with_lost_card},
   * {@code made_with_stolen_card}, {@code misc}, {@code unauthorized_use_of_card}.
   */
  @SerializedName("fraud_type")
  String fraudType;

  /**
   * If true, the associated charge is subject to <a
   * href="https://stripe.com/docs/payments/3d-secure#disputed-payments">liability shift</a>.
   */
  @SerializedName("has_liability_shift")
  Boolean hasLiabilityShift;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuer_fraud_record}.
   */
  @SerializedName("object")
  String object;

  /** The timestamp at which the card issuer posted the issuer fraud record. */
  @SerializedName("post_date")
  Long postDate;

  /** Get ID of expandable {@code charge} object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded {@code charge}. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Returns a list of issuer fraud records. */
  public static IssuerFraudRecordCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of issuer fraud records. */
  public static IssuerFraudRecordCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuer_fraud_records");
    return ApiResource.requestCollection(url, params, IssuerFraudRecordCollection.class, options);
  }

  /** Returns a list of issuer fraud records. */
  public static IssuerFraudRecordCollection list(IssuerFraudRecordListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of issuer fraud records. */
  public static IssuerFraudRecordCollection list(
      IssuerFraudRecordListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuer_fraud_records");
    return ApiResource.requestCollection(url, params, IssuerFraudRecordCollection.class, options);
  }

  /**
   * Retrieves the details of an issuer fraud record that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#issuer_fraud_record_object">issuer
   * fraud record</a> object reference for more details.
   */
  public static IssuerFraudRecord retrieve(String issuerFraudRecord) throws StripeException {
    return retrieve(issuerFraudRecord, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an issuer fraud record that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#issuer_fraud_record_object">issuer
   * fraud record</a> object reference for more details.
   */
  public static IssuerFraudRecord retrieve(String issuerFraudRecord, RequestOptions options)
      throws StripeException {
    return retrieve(issuerFraudRecord, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an issuer fraud record that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#issuer_fraud_record_object">issuer
   * fraud record</a> object reference for more details.
   */
  public static IssuerFraudRecord retrieve(
      String issuerFraudRecord, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/issuer_fraud_records/%s", ApiResource.urlEncodeId(issuerFraudRecord)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, IssuerFraudRecord.class, options);
  }

  /**
   * Retrieves the details of an issuer fraud record that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#issuer_fraud_record_object">issuer
   * fraud record</a> object reference for more details.
   */
  public static IssuerFraudRecord retrieve(
      String issuerFraudRecord, IssuerFraudRecordRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/issuer_fraud_records/%s", ApiResource.urlEncodeId(issuerFraudRecord)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, IssuerFraudRecord.class, options);
  }
}
