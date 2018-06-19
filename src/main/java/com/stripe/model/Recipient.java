package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Recipient extends APIResource implements MetadataStore<Recipient>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  BankAccount activeAccount;
  RecipientCardCollection cards;
  Long created;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Card> defaultCard;
  Boolean deleted;
  String description;
  String email;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> migratedTo;
  String name;
  String type;
  Boolean verified;

  // <editor-fold desc="defaultCard">
  public String getDefaultCard() {
    return (this.defaultCard != null) ? this.defaultCard.getId() : null;
  }

  public void setDefaultCard(String defaultCardID) {
    this.defaultCard = APIResource.setExpandableFieldID(defaultCardID, this.defaultCard);
  }

  public Card getDefaultCardObject() {
    return (this.defaultCard != null) ? this.defaultCard.getExpanded() : null;
  }

  public void setDefaultCardObject(Card c) {
    this.defaultCard = new ExpandableField<Card>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="migratedTo">
  public String getMigratedTo() {
    return (this.migratedTo != null) ? this.migratedTo.getId() : null;
  }

  public void setMigratedTo(String migratedToID) {
    this.migratedTo = APIResource.setExpandableFieldID(migratedToID, this.migratedTo);
  }

  public Account getMigratedToObject() {
    return (this.migratedTo != null) ? this.migratedTo.getExpanded() : null;
  }

  public void setMigratedToObject(Account c) {
    this.migratedTo = new ExpandableField<Account>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="all">
  /**
   * List all recipients.
   *
   * @deprecated Use the {@link #list(Map)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static RecipientCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all recipients.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static RecipientCollection all(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }

  /**
   * List all recipients.
   *
   * @deprecated Use the {@link #list(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static RecipientCollection all(Map<String, Object> params,
                      String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a recipient.
   */
  public static Recipient create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a recipient.
   */
  public static Recipient create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Recipient.class), params, Recipient.class, options);
  }

  /**
   * Create a recipient.
   *
   * @deprecated Use the {@link #create(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static Recipient create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="createCard">
  /**
   * Create a card.
   *
   * @deprecated Use {@link #getCards()} and
   *     {@link RecipientCardCollection#create(Map)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(String token) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, (RequestOptions) null);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getCards()} and
   *     {@link RecipientCardCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(String token, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    Map<String, Object> postParams = new HashMap<String, Object>();
    postParams.put("card", token);

    return createCard(postParams, options);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getCards()} and
   *     {@link RecipientCardCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(String token, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getCards()} and
   *     {@link RecipientCardCollection#create(Map)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, (RequestOptions) null);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getCards()} and
   *     {@link RecipientCardCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/cards",
        instanceURL(Recipient.class, this.id)), params, Card.class, options);
  }

  /**
   * Create a card.
   *
   * @deprecated Use {@link #getCards()} and
   *     {@link RecipientCardCollection#create(Map, RequestOptions)} instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Card createCard(Map<String, Object> params, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a recipient.
   */
  public DeletedRecipient delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a recipient.
   */
  public DeletedRecipient delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Recipient.class, this.id), null,
        DeletedRecipient.class, options);
  }

  /**
   * Delete a recipient.
   *
   * @deprecated Use the {@link #delete(RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public DeletedRecipient delete(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all recipients.
   */
  public static RecipientCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all recipients.
   */
  public static RecipientCollection list(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Recipient.class), params, RecipientCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a recipient.
   */
  public static Recipient retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a recipient.
   */
  public static Recipient retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Recipient.class, id), null, Recipient.class,
        options);
  }

  /**
   * Retrieve a recipient.
   *
   * @deprecated Use the {@link #retrieve(String, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public static Recipient retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Retrieve a recipient.
   */
  public static Recipient retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Recipient.class, id), params, Recipient.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a recipient.
   */
  @Override
  public Recipient update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a recipient.
   */
  @Override
  public Recipient update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Recipient.class, this.id), params,
        Recipient.class, options);
  }

  /**
   * Update a recipient.
   *
   * @deprecated Use the {@link #update(Map, RequestOptions)} method instead.
   *     This method will be removed in the next major version.
   */
  @Deprecated
  public Recipient update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }
  // </editor-fold>
}
