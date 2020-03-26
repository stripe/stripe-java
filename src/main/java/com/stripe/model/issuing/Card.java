package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.CardCreateParams;
import com.stripe.param.issuing.CardDetailsParams;
import com.stripe.param.issuing.CardListParams;
import com.stripe.param.issuing.CardRetrieveParams;
import com.stripe.param.issuing.CardUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Card extends ApiResource implements HasId, MetadataStore<Card> {
  /** The brand of the card. */
  @SerializedName("brand")
  String brand;

  /**
   * An Issuing {@code Cardholder} object represents an individual or business entity who is <a
   * href="https://stripe.com/docs/issuing">issued</a> cards.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/issuing/cards#create-cardholder">How to
   * create a Cardholder</a>
   */
  @SerializedName("cardholder")
  Cardholder cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The expiration month of the card. */
  @SerializedName("exp_month")
  Long expMonth;

  /** The expiration year of the card. */
  @SerializedName("exp_year")
  Long expYear;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The last 4 digits of the card number. */
  @SerializedName("last4")
  String last4;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.card}.
   */
  @SerializedName("object")
  String object;

  /** Metadata about the PIN on the card. */
  @SerializedName("pin")
  Pin pin;

  /** The latest card that replaces this card, if any. */
  @SerializedName("replaced_by")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Card> replacedBy;

  /** The card this card replaces, if any. */
  @SerializedName("replacement_for")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Card> replacementFor;

  /**
   * The reason why the previous card needed to be replaced.
   *
   * <p>One of {@code damage}, {@code expiration}, {@code loss}, or {@code theft}.
   */
  @SerializedName("replacement_reason")
  String replacementReason;

  /** Where and how the card will be shipped. */
  @SerializedName("shipping")
  Shipping shipping;

  @SerializedName("spending_controls")
  SpendingControls spendingControls;

  /**
   * Whether authorizations can be approved on this card.
   *
   * <p>One of {@code active}, {@code canceled}, {@code inactive}, {@code lost}, or {@code stolen}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of the card.
   *
   * <p>One of {@code physical}, or {@code virtual}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code replacedBy} object. */
  public String getReplacedBy() {
    return (this.replacedBy != null) ? this.replacedBy.getId() : null;
  }

  public void setReplacedBy(String id) {
    this.replacedBy = ApiResource.setExpandableFieldId(id, this.replacedBy);
  }

  /** Get expanded {@code replacedBy}. */
  public Card getReplacedByObject() {
    return (this.replacedBy != null) ? this.replacedBy.getExpanded() : null;
  }

  public void setReplacedByObject(Card expandableObject) {
    this.replacedBy = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code replacementFor} object. */
  public String getReplacementFor() {
    return (this.replacementFor != null) ? this.replacementFor.getId() : null;
  }

  public void setReplacementFor(String id) {
    this.replacementFor = ApiResource.setExpandableFieldId(id, this.replacementFor);
  }

  /** Get expanded {@code replacementFor}. */
  public Card getReplacementForObject() {
    return (this.replacementFor != null) ? this.replacementFor.getExpanded() : null;
  }

  public void setReplacementForObject(Card expandableObject) {
    this.replacementFor = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cards");
    return ApiResource.requestCollection(url, params, CardCollection.class, options);
  }

  /**
   * Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(CardListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order
   * by creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(CardListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cards");
    return ApiResource.requestCollection(url, params, CardCollection.class, options);
  }

  /** Creates an Issuing <code>Card</code> object. */
  public static Card create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing <code>Card</code> object. */
  public static Card create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cards");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }

  /** Creates an Issuing <code>Card</code> object. */
  public static Card create(CardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing <code>Card</code> object. */
  public static Card create(CardCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cards");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }

  /** Retrieves an Issuing <code>Card</code> object. */
  public static Card retrieve(String card) throws StripeException {
    return retrieve(card, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Card</code> object. */
  public static Card retrieve(String card, RequestOptions options) throws StripeException {
    return retrieve(card, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Card</code> object. */
  public static Card retrieve(String card, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(card)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Card.class, options);
  }

  /** Retrieves an Issuing <code>Card</code> object. */
  public static Card retrieve(String card, CardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(card)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Card.class, options);
  }

  /**
   * Updates the specified Issuing <code>Card</code> object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Card update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Card</code> object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Card update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }

  /**
   * Updates the specified Issuing <code>Card</code> object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(CardUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Card</code> object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(CardUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Card.class, options);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="https://stripe.com/docs/issuing/cards/virtual#virtual-card-info">the sensitive
   * details</a> of a virtual card.
   */
  public CardDetails details() throws StripeException {
    return details((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="https://stripe.com/docs/issuing/cards/virtual#virtual-card-info">the sensitive
   * details</a> of a virtual card.
   */
  public CardDetails details(Map<String, Object> params) throws StripeException {
    return details(params, (RequestOptions) null);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="https://stripe.com/docs/issuing/cards/virtual#virtual-card-info">the sensitive
   * details</a> of a virtual card.
   */
  public CardDetails details(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cards/%s/details", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CardDetails.class, options);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="https://stripe.com/docs/issuing/cards/virtual#virtual-card-info">the sensitive
   * details</a> of a virtual card.
   */
  public CardDetails details(CardDetailsParams params) throws StripeException {
    return details(params, (RequestOptions) null);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="https://stripe.com/docs/issuing/cards/virtual#virtual-card-info">the sensitive
   * details</a> of a virtual card.
   */
  public CardDetails details(CardDetailsParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/cards/%s/details", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CardDetails.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Pin extends StripeObject {
    /**
     * Wether the PIN will be accepted or not.
     *
     * <p>One of {@code active}, or {@code blocked}.
     */
    @SerializedName("status")
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Shipping extends StripeObject {
    @SerializedName("address")
    Address address;

    /**
     * The delivery company that shipped a card.
     *
     * <p>One of {@code fedex}, or {@code usps}.
     */
    @SerializedName("carrier")
    String carrier;

    /** A unix timestamp representing a best estimate of when the card will be delivered. */
    @SerializedName("eta")
    Long eta;

    /** Recipient name. */
    @SerializedName("name")
    String name;

    /**
     * Shipment service, such as {@code standard} or {@code express}.
     *
     * <p>One of {@code express}, {@code overnight}, {@code priority}, or {@code standard}.
     */
    @SerializedName("service")
    String service;

    /**
     * The delivery status of the card.
     *
     * <p>One of {@code canceled}, {@code delivered}, {@code failure}, {@code pending}, {@code
     * returned}, or {@code shipped}.
     */
    @SerializedName("status")
    String status;

    /** A tracking number for a card shipment. */
    @SerializedName("tracking_number")
    String trackingNumber;

    /**
     * A link to the shipping carrier's site where you can view detailed information about a card
     * shipment.
     */
    @SerializedName("tracking_url")
    String trackingUrl;

    /**
     * Packaging options.
     *
     * <p>One of {@code bulk}, or {@code individual}.
     */
    @SerializedName("type")
    String type;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SpendingControls extends StripeObject {
    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations permitted on this card.
     */
    @SerializedName("allowed_categories")
    List<String> allowedCategories;

    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to always decline on this card.
     */
    @SerializedName("blocked_categories")
    List<String> blockedCategories;

    /**
     * Maximum count of approved authorizations on this card. Counts all authorizations
     * retroactively.
     */
    @SerializedName("max_approvals")
    Long maxApprovals;

    /** Limit the spending with rules based on time intervals and categories. */
    @SerializedName("spending_limits")
    List<Card.SpendingLimit> spendingLimits;

    /** Currency for the amounts within spending_limits. Locked to the currency of the card. */
    @SerializedName("spending_limits_currency")
    String spendingLimitsCurrency;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SpendingLimit extends StripeObject {
    /** Maximum amount allowed to spend per time interval. */
    @SerializedName("amount")
    Long amount;

    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * on which to apply the spending limit. Leave this blank to limit all charges.
     */
    @SerializedName("categories")
    List<String> categories;

    /**
     * The time interval or event with which to apply this spending limit towards.
     *
     * <p>One of {@code all_time}, {@code daily}, {@code monthly}, {@code per_authorization}, {@code
     * weekly}, or {@code yearly}.
     */
    @SerializedName("interval")
    String interval;
  }
}
