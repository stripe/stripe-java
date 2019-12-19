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
  @SerializedName("authorization_controls")
  AuthorizationControls authorizationControls;

  /** The brand of the card. */
  @SerializedName("brand")
  String brand;

  /**
   * The [Cardholder](https://stripe.com/docs/api#issuing_cardholder_object) object to which the
   * card belongs.
   */
  @SerializedName("cardholder")
  Cardholder cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
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
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
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

  /** The name of the cardholder, printed on the card. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `issuing.card`.
   */
  @SerializedName("object")
  String object;

  /** Metadata about the PIN on the card. */
  @SerializedName("pin")
  Pin pin;

  /** The card this card replaces, if any. */
  @SerializedName("replacement_for")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Card> replacementFor;

  /**
   * The reason why the previous card needed to be replaced.
   *
   * <p>One of `damage`, `expiration`, `loss`, or `theft`.
   */
  @SerializedName("replacement_reason")
  String replacementReason;

  /** Where and how the card will be shipped. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * Whether authorizations can be approved on this card.
   *
   * <p>One of `active`, `canceled`, `inactive`, `lost`, or `stolen`.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of the card.
   *
   * <p>One of `physical`, or `virtual`.
   */
  @SerializedName("type")
  String type;

  /** Get id of expandable `replacementFor` object. */
  public String getReplacementFor() {
    return (this.replacementFor != null) ? this.replacementFor.getId() : null;
  }

  public void setReplacementFor(String id) {
    this.replacementFor = ApiResource.setExpandableFieldId(id, this.replacementFor);
  }

  /** Get expanded `replacementFor`. */
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
   * href="/docs/issuing/cards/management#virtual-card-info">the sensitive details</a> of a virtual
   * card.
   */
  public CardDetails details() throws StripeException {
    return details((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="/docs/issuing/cards/management#virtual-card-info">the sensitive details</a> of a virtual
   * card.
   */
  public CardDetails details(Map<String, Object> params) throws StripeException {
    return details(params, (RequestOptions) null);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="/docs/issuing/cards/management#virtual-card-info">the sensitive details</a> of a virtual
   * card.
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
   * href="/docs/issuing/cards/management#virtual-card-info">the sensitive details</a> of a virtual
   * card.
   */
  public CardDetails details(CardDetailsParams params) throws StripeException {
    return details(params, (RequestOptions) null);
  }

  /**
   * For virtual cards only. Retrieves an Issuing <code>card_details</code> object that contains <a
   * href="/docs/issuing/cards/management#virtual-card-info">the sensitive details</a> of a virtual
   * card.
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
  public static class AuthorizationControls extends StripeObject {
    /**
     * Array of strings containing
     * [categories](https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category)
     * of authorizations permitted on this card.
     */
    @SerializedName("allowed_categories")
    List<String> allowedCategories;

    /**
     * Array of strings containing
     * [categories](https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category)
     * of authorizations to always decline on this card.
     */
    @SerializedName("blocked_categories")
    List<String> blockedCategories;

    /**
     * The currency of the card. See
     * [max_amount](https://stripe.com/docs/api#issuing_card_object-authorization_controls-max_amount)
     */
    @SerializedName("currency")
    String currency;

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
  public static class Pin extends StripeObject {
    /**
     * Wether the PIN will be accepted or not.
     *
     * <p>One of `active`, or `blocked`.
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
     * <p>One of `fedex`, or `usps`.
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
     * Deprecated field. It always return null and will be removed in the next client library major
     * version
     */
    @SerializedName("phone")
    String phone;

    /**
     * The delivery status of the card.
     *
     * <p>One of `canceled`, `delivered`, `failure`, `pending`, `returned`, or `shipped`.
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
     * <p>One of `bulk`, or `individual`.
     */
    @SerializedName("type")
    String type;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SpendingLimit extends StripeObject {
    /** Maximum amount allowed to spend per time interval. */
    @SerializedName("amount")
    Long amount;

    /**
     * Array of strings containing
     * [categories](https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category)
     * on which to apply the spending limit. Leave this blank to limit all charges.
     */
    @SerializedName("categories")
    List<String> categories;

    /**
     * The time interval or event with which to apply this spending limit towards.
     *
     * <p>One of `all_time`, `daily`, `monthly`, `per_authorization`, `weekly`, or `yearly`.
     */
    @SerializedName("interval")
    String interval;
  }
}
