package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
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
public class Review extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  Boolean livemode;
  Boolean open;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<PaymentIntent> paymentIntent;
  String reason;

  // <editor-fold desc="charge">
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String chargeId) {
    this.charge = setExpandableFieldId(chargeId, this.charge);
  }

  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge charge) {
    this.charge = new ExpandableField<>(charge.getId(), charge);
  }
  // </editor-fold>

  // <editor-fold desc="paymentIntent">
  public String getPaymentIntent() {
    return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
  }

  public void setPaymentIntent(String paymentIntentId) {
    this.paymentIntent = setExpandableFieldId(paymentIntentId, this.paymentIntent);
  }

  public PaymentIntent getPaymentIntentObject() {
    return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
  }

  public void setPaymentIntentObject(PaymentIntent paymentIntent) {
    this.paymentIntent = new ExpandableField<>(paymentIntent.getId(), paymentIntent);
  }
  // </editor-fold>

  // <editor-fold desc="approve">
  /**
   * Approve a review.
   */
  public Review approve() throws StripeException {
    return approve(null, null);
  }

  /**
   * Approve a review.
   */
  public Review approve(Map<String, Object> params) throws StripeException {
    return approve(params, null);
  }

  /**
   * Approve a review.
   */
  public Review approve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, String.format("%s/approve",
        instanceUrl(Review.class, this.getId())), params, Review.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all reviews.
   */
  public static ReviewCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all reviews.
   */
  public static ReviewCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Review.class), params,
      ReviewCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a review.
   */
  public static Review retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a review.
   */
  public static Review retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a review.
   */
  public static Review retrieve(String id, Map<String, Object> params,
      RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Review.class, id), params,
      Review.class, options);
  }
  // </editor-fold>
}
