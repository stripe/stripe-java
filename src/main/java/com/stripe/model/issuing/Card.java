// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardCreateParams;
import com.stripe.param.issuing.CardDeliverCardParams;
import com.stripe.param.issuing.CardFailCardParams;
import com.stripe.param.issuing.CardListParams;
import com.stripe.param.issuing.CardRetrieveParams;
import com.stripe.param.issuing.CardReturnCardParams;
import com.stripe.param.issuing.CardShipCardParams;
import com.stripe.param.issuing.CardSubmitCardParams;
import com.stripe.param.issuing.CardUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * You can <a href="https://stripe.com/docs/issuing">create physical or virtual cards</a> that are
 * issued to cardholders.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Card extends ApiResource implements HasId, MetadataStore<Card> {
  /** The brand of the card. */
  @SerializedName("brand")
  String brand;

  /**
   * The reason why the card was canceled.
   *
   * <p>One of {@code design_rejected}, {@code lost}, or {@code stolen}.
   */
  @SerializedName("cancellation_reason")
  String cancellationReason;

  /**
   * An Issuing {@code Cardholder} object represents an individual or business entity who is <a
   * href="https://stripe.com/docs/issuing">issued</a> cards.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/issuing/cards/virtual/issue-cards#create-cardholder">How to
   * create a cardholder</a>
   */
  @SerializedName("cardholder")
  Cardholder cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Supported currencies are {@code usd} in the US, {@code eur} in the EU, and {@code
   * gbp} in the UK.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The card's CVC. For security reasons, this is only available for virtual cards, and will be
   * omitted unless you explicitly request it with <a
   * href="https://stripe.com/docs/api/expanding_objects">the {@code expand} parameter</a>.
   * Additionally, it's only available via the <a
   * href="https://stripe.com/docs/api/issuing/cards/retrieve">&quot;Retrieve a card&quot;
   * endpoint</a>, not via &quot;List all cards&quot; or any other endpoint.
   */
  @SerializedName("cvc")
  String cvc;

  /** The expiration month of the card. */
  @SerializedName("exp_month")
  Long expMonth;

  /** The expiration year of the card. */
  @SerializedName("exp_year")
  Long expYear;

  /** The financial account this card is attached to. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The last 4 digits of the card number. */
  @SerializedName("last4")
  String last4;

  /**
   * Stripe’s assessment of whether this card’s details have been compromised. If this property
   * isn't null, cancel and reissue the card to prevent fraudulent activity risk.
   */
  @SerializedName("latest_fraud_warning")
  LatestFraudWarning latestFraudWarning;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The full unredacted card number. For security reasons, this is only available for virtual
   * cards, and will be omitted unless you explicitly request it with <a
   * href="https://stripe.com/docs/api/expanding_objects">the {@code expand} parameter</a>.
   * Additionally, it's only available via the <a
   * href="https://stripe.com/docs/api/issuing/cards/retrieve">&quot;Retrieve a card&quot;
   * endpoint</a>, not via &quot;List all cards&quot; or any other endpoint.
   */
  @SerializedName("number")
  String number;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.card}.
   */
  @SerializedName("object")
  String object;

  /** The personalization design object belonging to this card. */
  @SerializedName("personalization_design")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PersonalizationDesign> personalizationDesign;

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
   * <p>One of {@code damaged}, {@code expired}, {@code lost}, or {@code stolen}.
   */
  @SerializedName("replacement_reason")
  String replacementReason;

  /** Text separate from cardholder name, printed on the card. */
  @SerializedName("second_line")
  String secondLine;

  /** Where and how the card will be shipped. */
  @SerializedName("shipping")
  Shipping shipping;

  @SerializedName("spending_controls")
  SpendingControls spendingControls;

  /**
   * Whether authorizations can be approved on this card. May be blocked from activating cards
   * depending on past-due Cardholder requirements. Defaults to {@code inactive}.
   *
   * <p>One of {@code active}, {@code canceled}, or {@code inactive}.
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

  /** Information relating to digital wallets (like Apple Pay and Google Pay). */
  @SerializedName("wallets")
  Wallets wallets;

  /** Get ID of expandable {@code personalizationDesign} object. */
  public String getPersonalizationDesign() {
    return (this.personalizationDesign != null) ? this.personalizationDesign.getId() : null;
  }

  public void setPersonalizationDesign(String id) {
    this.personalizationDesign = ApiResource.setExpandableFieldId(id, this.personalizationDesign);
  }

  /** Get expanded {@code personalizationDesign}. */
  public PersonalizationDesign getPersonalizationDesignObject() {
    return (this.personalizationDesign != null) ? this.personalizationDesign.getExpanded() : null;
  }

  public void setPersonalizationDesignObject(PersonalizationDesign expandableObject) {
    this.personalizationDesign =
        new ExpandableField<PersonalizationDesign>(expandableObject.getId(), expandableObject);
  }

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

  /** Creates an Issuing {@code Card} object. */
  public static Card create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing {@code Card} object. */
  public static Card create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cards";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Card.class);
  }

  /** Creates an Issuing {@code Card} object. */
  public static Card create(CardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing {@code Card} object. */
  public static Card create(CardCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cards";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Card.class);
  }

  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cards";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CardCollection.class);
  }

  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(CardListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Card} objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static CardCollection list(CardListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/cards";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CardCollection.class);
  }

  /** Retrieves an Issuing {@code Card} object. */
  public static Card retrieve(String card) throws StripeException {
    return retrieve(card, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing {@code Card} object. */
  public static Card retrieve(String card, RequestOptions options) throws StripeException {
    return retrieve(card, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing {@code Card} object. */
  public static Card retrieve(String card, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(card));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Card.class);
  }

  /** Retrieves an Issuing {@code Card} object. */
  public static Card retrieve(String card, CardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(card));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Card.class);
  }

  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Card update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Card update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Card.class);
  }

  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(CardUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Card} object by setting the values of the parameters
   * passed. Any parameters not provided will be left unchanged.
   */
  public Card update(CardUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/issuing/cards/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Card.class);
  }

  /**
   * For more details about LatestFraudWarning, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LatestFraudWarning extends StripeObject {
    /** Timestamp of the most recent fraud warning. */
    @SerializedName("started_at")
    Long startedAt;

    /**
     * The type of fraud warning that most recently took place on this card. This field updates with
     * every new fraud warning, so the value changes over time. If populated, cancel and reissue the
     * card.
     *
     * <p>One of {@code card_testing_exposure}, {@code fraud_dispute_filed}, {@code
     * third_party_reported}, or {@code user_indicated_fraud}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * For more details about Shipping, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Shipping extends StripeObject {
    @SerializedName("address")
    Address address;

    /** Address validation details for the shipment. */
    @SerializedName("address_validation")
    AddressValidation addressValidation;

    /**
     * The delivery company that shipped a card.
     *
     * <p>One of {@code dhl}, {@code fedex}, {@code royal_mail}, or {@code usps}.
     */
    @SerializedName("carrier")
    String carrier;

    /** Additional information that may be required for clearing customs. */
    @SerializedName("customs")
    Customs customs;

    /** A unix timestamp representing a best estimate of when the card will be delivered. */
    @SerializedName("eta")
    Long eta;

    /** Recipient name. */
    @SerializedName("name")
    String name;

    /**
     * The phone number of the receiver of the shipment. Our courier partners will use this number
     * to contact you in the event of card delivery issues. For individual shipments to the EU/UK,
     * if this field is empty, we will provide them with the phone number provided when the
     * cardholder was initially created.
     */
    @SerializedName("phone_number")
    String phoneNumber;

    /**
     * Whether a signature is required for card delivery. This feature is only supported for US
     * users. Standard shipping service does not support signature on delivery. The default value
     * for standard shipping service is false and for express and priority services is true.
     */
    @SerializedName("require_signature")
    Boolean requireSignature;

    /**
     * Shipment service, such as {@code standard} or {@code express}.
     *
     * <p>One of {@code express}, {@code priority}, or {@code standard}.
     */
    @SerializedName("service")
    String service;

    /**
     * The delivery status of the card.
     *
     * <p>One of {@code canceled}, {@code delivered}, {@code failure}, {@code pending}, {@code
     * returned}, {@code shipped}, or {@code submitted}.
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

    /**
     * For more details about AddressValidation, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AddressValidation extends StripeObject {
      /**
       * The address validation capabilities to use.
       *
       * <p>One of {@code disabled}, {@code normalization_only}, or {@code
       * validation_and_normalization}.
       */
      @SerializedName("mode")
      String mode;

      /** The normalized shipping address. */
      @SerializedName("normalized_address")
      Address normalizedAddress;

      /**
       * The validation result for the shipping address.
       *
       * <p>One of {@code indeterminate}, {@code likely_deliverable}, or {@code
       * likely_undeliverable}.
       */
      @SerializedName("result")
      String result;
    }

    /**
     * For more details about Customs, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Customs extends StripeObject {
      /**
       * A registration number used for customs in Europe. See <a
       * href="https://www.gov.uk/eori">https://www.gov.uk/eori</a> for the UK and <a
       * href="https://ec.europa.eu/taxation_customs/business/customs-procedures-import-and-export/customs-procedures/economic-operators-registration-and-identification-number-eori_en">https://ec.europa.eu/taxation_customs/business/customs-procedures-import-and-export/customs-procedures/economic-operators-registration-and-identification-number-eori_en</a>
       * for the EU.
       */
      @SerializedName("eori_number")
      String eoriNumber;
    }
  }

  /**
   * For more details about SpendingControls, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SpendingControls extends StripeObject {
    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to allow. All other categories will be blocked. Cannot be set with {@code
     * blocked_categories}.
     */
    @SerializedName("allowed_categories")
    List<String> allowedCategories;

    /**
     * Array of strings containing representing countries from which authorizations will be allowed.
     * Authorizations from merchants in all other countries will be declined. Country codes should
     * be ISO 3166 alpha-2 country codes (e.g. {@code US}). Cannot be set with {@code
     * blocked_merchant_countries}. Provide an empty value to unset this control.
     */
    @SerializedName("allowed_merchant_countries")
    List<String> allowedMerchantCountries;

    /**
     * Array of strings containing <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
     * of authorizations to decline. All other categories will be allowed. Cannot be set with {@code
     * allowed_categories}.
     */
    @SerializedName("blocked_categories")
    List<String> blockedCategories;

    /**
     * Array of strings containing representing countries from which authorizations will be
     * declined. Country codes should be ISO 3166 alpha-2 country codes (e.g. {@code US}). Cannot be
     * set with {@code allowed_merchant_countries}. Provide an empty value to unset this control.
     */
    @SerializedName("blocked_merchant_countries")
    List<String> blockedMerchantCountries;

    /**
     * Limit spending with amount-based rules that apply across any cards this card replaced (i.e.,
     * its {@code replacement_for} card and <em>that</em> card's {@code replacement_for} card, up
     * the chain).
     */
    @SerializedName("spending_limits")
    List<Card.SpendingControls.SpendingLimit> spendingLimits;

    /**
     * Currency of the amounts within {@code spending_limits}. Always the same as the currency of
     * the card.
     */
    @SerializedName("spending_limits_currency")
    String spendingLimitsCurrency;

    /**
     * For more details about SpendingLimit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SpendingLimit extends StripeObject {
      /**
       * Maximum amount allowed to spend per interval. This amount is in the card's currency and in
       * the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * Array of strings containing <a
       * href="https://stripe.com/docs/api#issuing_authorization_object-merchant_data-category">categories</a>
       * this limit applies to. Omitting this field will apply the limit to all categories.
       */
      @SerializedName("categories")
      List<String> categories;

      /**
       * Interval (or event) to which the amount applies.
       *
       * <p>One of {@code all_time}, {@code daily}, {@code monthly}, {@code per_authorization},
       * {@code weekly}, or {@code yearly}.
       */
      @SerializedName("interval")
      String interval;
    }
  }

  /**
   * For more details about Wallets, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Wallets extends StripeObject {
    @SerializedName("apple_pay")
    ApplePay applePay;

    @SerializedName("google_pay")
    GooglePay googlePay;

    /** Unique identifier for a card used with digital wallets. */
    @SerializedName("primary_account_identifier")
    String primaryAccountIdentifier;

    /**
     * For more details about ApplePay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplePay extends StripeObject {
      /** Apple Pay Eligibility. */
      @SerializedName("eligible")
      Boolean eligible;

      /**
       * Reason the card is ineligible for Apple Pay
       *
       * <p>One of {@code missing_agreement}, {@code missing_cardholder_contact}, or {@code
       * unsupported_region}.
       */
      @SerializedName("ineligible_reason")
      String ineligibleReason;
    }

    /**
     * For more details about GooglePay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class GooglePay extends StripeObject {
      /** Google Pay Eligibility. */
      @SerializedName("eligible")
      Boolean eligible;

      /**
       * Reason the card is ineligible for Google Pay
       *
       * <p>One of {@code missing_agreement}, {@code missing_cardholder_contact}, or {@code
       * unsupported_region}.
       */
      @SerializedName("ineligible_reason")
      String ineligibleReason;
    }
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final Card resource;

    private TestHelpers(Card resource) {
      this.resource = resource;
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * delivered}.
     */
    public Card deliverCard() throws StripeException {
      return deliverCard((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * delivered}.
     */
    public Card deliverCard(RequestOptions options) throws StripeException {
      return deliverCard((Map<String, Object>) null, options);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * delivered}.
     */
    public Card deliverCard(Map<String, Object> params) throws StripeException {
      return deliverCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * delivered}.
     */
    public Card deliverCard(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/deliver",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * delivered}.
     */
    public Card deliverCard(CardDeliverCardParams params) throws StripeException {
      return deliverCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * delivered}.
     */
    public Card deliverCard(CardDeliverCardParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/deliver",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
     */
    public Card failCard() throws StripeException {
      return failCard((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
     */
    public Card failCard(RequestOptions options) throws StripeException {
      return failCard((Map<String, Object>) null, options);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
     */
    public Card failCard(Map<String, Object> params) throws StripeException {
      return failCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
     */
    public Card failCard(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/fail",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
     */
    public Card failCard(CardFailCardParams params) throws StripeException {
      return failCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
     */
    public Card failCard(CardFailCardParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/fail",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
     */
    public Card returnCard() throws StripeException {
      return returnCard((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
     */
    public Card returnCard(RequestOptions options) throws StripeException {
      return returnCard((Map<String, Object>) null, options);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
     */
    public Card returnCard(Map<String, Object> params) throws StripeException {
      return returnCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
     */
    public Card returnCard(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/return",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
     */
    public Card returnCard(CardReturnCardParams params) throws StripeException {
      return returnCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
     */
    public Card returnCard(CardReturnCardParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/return",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
     */
    public Card shipCard() throws StripeException {
      return shipCard((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
     */
    public Card shipCard(RequestOptions options) throws StripeException {
      return shipCard((Map<String, Object>) null, options);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
     */
    public Card shipCard(Map<String, Object> params) throws StripeException {
      return shipCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
     */
    public Card shipCard(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/ship",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
     */
    public Card shipCard(CardShipCardParams params) throws StripeException {
      return shipCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
     */
    public Card shipCard(CardShipCardParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/ship",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * submitted}. This method requires Stripe Version ‘2024-09-30.acacia’ or later.
     */
    public Card submitCard() throws StripeException {
      return submitCard((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * submitted}. This method requires Stripe Version ‘2024-09-30.acacia’ or later.
     */
    public Card submitCard(RequestOptions options) throws StripeException {
      return submitCard((Map<String, Object>) null, options);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * submitted}. This method requires Stripe Version ‘2024-09-30.acacia’ or later.
     */
    public Card submitCard(Map<String, Object> params) throws StripeException {
      return submitCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * submitted}. This method requires Stripe Version ‘2024-09-30.acacia’ or later.
     */
    public Card submitCard(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/submit",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Card.class);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * submitted}. This method requires Stripe Version ‘2024-09-30.acacia’ or later.
     */
    public Card submitCard(CardSubmitCardParams params) throws StripeException {
      return submitCard(params, (RequestOptions) null);
    }

    /**
     * Updates the shipping status of the specified Issuing {@code Card} object to {@code
     * submitted}. This method requires Stripe Version ‘2024-09-30.acacia’ or later.
     */
    public Card submitCard(CardSubmitCardParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/cards/%s/shipping/submit",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Card.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(cardholder, responseGetter);
    trySetResponseGetter(latestFraudWarning, responseGetter);
    trySetResponseGetter(personalizationDesign, responseGetter);
    trySetResponseGetter(replacedBy, responseGetter);
    trySetResponseGetter(replacementFor, responseGetter);
    trySetResponseGetter(shipping, responseGetter);
    trySetResponseGetter(spendingControls, responseGetter);
    trySetResponseGetter(wallets, responseGetter);
  }
}
