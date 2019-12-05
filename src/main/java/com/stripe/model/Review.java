package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ReviewApproveParams;
import com.stripe.param.ReviewListParams;
import com.stripe.param.ReviewRetrieveParams;
import java.math.BigDecimal;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Review extends ApiResource implements HasId {
  /** The ZIP or postal code of the card used, if applicable. */
  @SerializedName("billing_zip")
  String billingZip;

  /** The charge associated with this review. */
  @SerializedName("charge")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /**
   * The reason the review was closed, or null if it has not yet been closed. One of `approved`,
   * `refunded`, `refunded_as_fraud`, or `disputed`.
   */
  @SerializedName("closed_reason")
  String closedReason;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The IP address where the payment originated. */
  @SerializedName("ip_address")
  String ipAddress;

  /**
   * Information related to the location of the payment. Note that this information is an
   * approximation and attempts to locate the nearest population center - it should not be used to
   * determine a specific address.
   */
  @SerializedName("ip_address_location")
  Location ipAddressLocation;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `review`.
   */
  @SerializedName("object")
  String object;

  /** If `true`, the review needs action. */
  @SerializedName("open")
  Boolean open;

  /** The reason the review was opened. One of `rule` or `manual`. */
  @SerializedName("opened_reason")
  String openedReason;

  /** The PaymentIntent ID associated with this review, if one exists. */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  /**
   * The reason the review is currently open or closed. One of `rule`, `manual`, `approved`,
   * `refunded`, `refunded_as_fraud`, or `disputed`.
   */
  @SerializedName("reason")
  String reason;

  /** Information related to the browsing session of the user who initiated the payment. */
  @SerializedName("session")
  Session session;

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
    return ApiResource.requestCollection(url, params, ReviewCollection.class, options);
  }

  /**
   * Returns a list of <code>Review</code> objects that have <code>open</code> set to <code>true
   * </code>. The objects are sorted in descending order by creation date, with the most recently
   * created object appearing first.
   */
  public static ReviewCollection list(ReviewListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>Review</code> objects that have <code>open</code> set to <code>true
   * </code>. The objects are sorted in descending order by creation date, with the most recently
   * created object appearing first.
   */
  public static ReviewCollection list(ReviewListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reviews");
    return ApiResource.requestCollection(url, params, ReviewCollection.class, options);
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
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/reviews/%s", ApiResource.urlEncodeId(review)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Review.class, options);
  }

  /** Retrieves a <code>Review</code> object. */
  public static Review retrieve(String review, ReviewRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/reviews/%s", ApiResource.urlEncodeId(review)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Review.class, options);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve() throws StripeException {
    return approve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(RequestOptions options) throws StripeException {
    return approve((Map<String, Object>) null, options);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(Map<String, Object> params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/reviews/%s/approve", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Review.class, options);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(ReviewApproveParams params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /** Approves a <code>Review</code> object, closing it and removing it from the list of reviews. */
  public Review approve(ReviewApproveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/reviews/%s/approve", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Review.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Location extends StripeObject {
    /** The city where the payment originated. */
    @SerializedName("city")
    String city;

    /** Two-letter ISO code representing the country where the payment originated. */
    @SerializedName("country")
    String country;

    /** The geographic latitude where the payment originated. */
    @SerializedName("latitude")
    BigDecimal latitude;

    /** The geographic longitude where the payment originated. */
    @SerializedName("longitude")
    BigDecimal longitude;

    /** The state/county/province/region where the payment originated. */
    @SerializedName("region")
    String region;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Session extends StripeObject {
    /** The browser used in this browser session (e.g., `Chrome`). */
    @SerializedName("browser")
    String browser;

    /** Information about the device used for the browser session (e.g., `Samsung SM-G930T`). */
    @SerializedName("device")
    String device;

    /** The platform for the browser session (e.g., `Macintosh`). */
    @SerializedName("platform")
    String platform;

    /** The version for the browser session (e.g., `61.0.3163.100`). */
    @SerializedName("version")
    String version;
  }
}
