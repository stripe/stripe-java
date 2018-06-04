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
  String id;
  String object;
  BankAccount activeAccount;
  RecipientCardCollection cards;
  Long created;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Card> defaultCard;
  Boolean deleted;
  String description;
  String email;
  Boolean livemode;
  Map<String, String> metadata;
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

  public static Recipient create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  @Deprecated
  public static Recipient create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Recipient create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Recipient.class), params, Recipient.class, options);
  }

  public static Recipient retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static Recipient retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Recipient retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Recipient.class, id), null, Recipient.class,
        options);
  }

  public static Recipient retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Recipient.class, id), params, Recipient.class,
        options);
  }

  public Recipient update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public Recipient update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Recipient update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Recipient.class, this.id), params,
        Recipient.class, options);
  }

  public DeletedRecipient delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  @Deprecated
  public DeletedRecipient delete(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return delete(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public DeletedRecipient delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, instanceURL(Recipient.class, this.id), null,
        DeletedRecipient.class, options);
  }

  public Card createCard(String token) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, (RequestOptions) null);
  }

  public Card createCard(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, (RequestOptions) null);
  }

  @Deprecated
  public Card createCard(String token, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(token, RequestOptions.builder().setApiKey(apiKey).build());
  }

  /**
   * Adds a card to the recipient using a card token.
   *
   * @param token card token ({@code "tok_..."})
   * @param options request options
   * @return the new card object
   */
  public Card createCard(String token, RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    Map<String, Object> postParams = new HashMap<String, Object>();
    postParams.put("card", token);

    return createCard(postParams, options);
  }

  @Deprecated
  public Card createCard(Map<String, Object> params, String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return createCard(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Card createCard(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/cards",
        instanceURL(Recipient.class, this.id)), params, Card.class, options);
  }

  public static RecipientCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static RecipientCollection list(Map<String, Object> params,
                       RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Recipient.class), params, RecipientCollection.class, options);
  }

  @Deprecated
  public static RecipientCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static RecipientCollection all(Map<String, Object> params,
                      String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static RecipientCollection all(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }
}
