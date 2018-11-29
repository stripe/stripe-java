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
public class Review extends ApiResource implements HasId {
  /** The charge associated with this review. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** If `true`, the review needs action. */
  Boolean open;

  /** The PaymentIntent ID associated with this review, if one exists. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  /**
   * The reason the review is currently open or closed. One of `rule`, `manual`, `approved`,
   * `refunded`, `refunded_as_fraud`, or `disputed`.
   */
  String reason;

  /** Get id of expandable `charge` object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded `charge`. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `paymentIntent` object. */
  public String getPaymentIntent() {
    return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
  }

  public void setPaymentIntent(String id) {
    this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
  }

  /** Get expanded `paymentIntent`. */
  public PaymentIntent getPaymentIntentObject() {
    return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
  }

  public void setPaymentIntentObject(PaymentIntent expandableObject) {
    this.paymentIntent =
        new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of <code>Review</code> objects that have <code>open</code> set to <code>true
   * </code>. The objects are sorted in descending order by creation date, with the most recently
   * created object appearing first.
   */
  public static ReviewCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>Review</code> objects that have <code>open</code> set to <code>true
   * </code>. The objects are sorted in descending order by creation date, with the most recently
   * created object appearing first.
   */
  public static ReviewCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reviews");
    return requestCollection(url, params, ReviewCollection.class, options);
  }

  /** Retrieves a <code>Review</code> object. */
  public static Review retrieve(String review) throws StripeException {
    return retrieve(review, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a <code>Review</code> object. */
  public static Review retrieve(String review, RequestOptions options) throws StripeException {
    return retrieve(review, (Map<String, Object>) null, options);
  }

  /** Retrieves a <code>Review</code> object. */
  public static Review retrieve(String review, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/reviews/%s", review));
    return request(ApiResource.RequestMethod.GET, url, params, Review.class, options);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve() throws StripeException {
    return approve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(Map<String, Object> params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/reviews/%s/approve", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Review.class, options);
  }
}
