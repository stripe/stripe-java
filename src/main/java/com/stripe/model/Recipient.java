package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.RecipientCreateParams;
import com.stripe.param.RecipientListParams;
import com.stripe.param.RecipientRetrieveParams;
import com.stripe.param.RecipientUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Recipient extends ApiResource implements HasId, MetadataStore<Recipient> {
  /** Hash describing the current account on the recipient, if there is one. */
  @SerializedName("active_account")
  BankAccount activeAccount;

  @SerializedName("cards")
  CardCollection cards;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The default card to use for creating transfers to this recipient. */
  @SerializedName("default_card")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Card> defaultCard;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  @SerializedName("email")
  String email;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

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

  /**
   * The ID of the [Custom account](https://stripe.com/docs/connect/custom-accounts) this recipient
   * was migrated to. If set, the recipient can no longer be updated, nor can transfers be made to
   * it: use the Custom account instead.
   */
  @SerializedName("migrated_to")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> migratedTo;

  /** Full, legal name of the recipient. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `recipient`.
   */
  @SerializedName("object")
  String object;

  @SerializedName("rolled_back_from")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> rolledBackFrom;

  /** Type of the recipient, one of `individual` or `corporation`. */
  @SerializedName("type")
  String type;

  /**
   * Whether the recipient has been verified. This field is non-standard, and maybe removed in the
   * future
   */
  @SerializedName("verified")
  Boolean verified;

  /** Get id of expandable `defaultCard` object. */
  public String getDefaultCard() {
    return (this.defaultCard != null) ? this.defaultCard.getId() : null;
  }

  public void setDefaultCard(String id) {
    this.defaultCard = ApiResource.setExpandableFieldId(id, this.defaultCard);
  }

  /** Get expanded `defaultCard`. */
  public Card getDefaultCardObject() {
    return (this.defaultCard != null) ? this.defaultCard.getExpanded() : null;
  }

  public void setDefaultCardObject(Card expandableObject) {
    this.defaultCard = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `migratedTo` object. */
  public String getMigratedTo() {
    return (this.migratedTo != null) ? this.migratedTo.getId() : null;
  }

  public void setMigratedTo(String id) {
    this.migratedTo = ApiResource.setExpandableFieldId(id, this.migratedTo);
  }

  /** Get expanded `migratedTo`. */
  public Account getMigratedToObject() {
    return (this.migratedTo != null) ? this.migratedTo.getExpanded() : null;
  }

  public void setMigratedToObject(Account expandableObject) {
    this.migratedTo = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `rolledBackFrom` object. */
  public String getRolledBackFrom() {
    return (this.rolledBackFrom != null) ? this.rolledBackFrom.getId() : null;
  }

  public void setRolledBackFrom(String id) {
    this.rolledBackFrom = ApiResource.setExpandableFieldId(id, this.rolledBackFrom);
  }

  /** Get expanded `rolledBackFrom`. */
  public Account getRolledBackFromObject() {
    return (this.rolledBackFrom != null) ? this.rolledBackFrom.getExpanded() : null;
  }

  public void setRolledBackFromObject(Account expandableObject) {
    this.rolledBackFrom = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return ApiResource.requestCollection(url, params, RecipientCollection.class, options);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(RecipientListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(RecipientListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return ApiResource.requestCollection(url, params, RecipientCollection.class, options);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(RecipientCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(RecipientCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/recipients/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Recipient.class, options);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(
      String id, RecipientRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/recipients/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Recipient.class, options);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  @Override
  public Recipient update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  @Override
  public Recipient update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/recipients/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  public Recipient update(RecipientUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  public Recipient update(RecipientUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/recipients/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /** Permanently deletes a recipient. It cannot be undone. */
  public Recipient delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Permanently deletes a recipient. It cannot be undone. */
  public Recipient delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Permanently deletes a recipient. It cannot be undone. */
  public Recipient delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Permanently deletes a recipient. It cannot be undone. */
  public Recipient delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/recipients/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Recipient.class, options);
  }
}
