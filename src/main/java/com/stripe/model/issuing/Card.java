package com.stripe.model.issuing;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Card extends APIResource implements MetadataStore<Card>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  AuthorizationControls authorizationControls;
  Billing billing;
  String brand;
  Cardholder cardholder;
  Long created;
  String currency;
  Integer expMonth;
  Integer expYear;
  String last4;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String name;
  String status;
  String type;

  // <editor-fold desc="create">
  /**
   * Create an issuing card.
   */
  public static Card create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create an issuing card.
   */
  public static Card create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Card.class), params,
      Card.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="details">
  /**
   * Retrieve the card details associated with an issuing card.
   */
  public CardDetails details(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return details(params, null);
  }

  /**
   * Retrieve the card details associated with an issuing card.
   */
  public CardDetails details(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, String.format("%s/details",
        instanceURL(Card.class, this.getId())), params, CardDetails.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all issuing cards.
   */
  public static CardCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all issuing cards.
   */
  public static CardCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return requestCollection(classURL(Card.class), params,
      CardCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an issuing card.
   */
  public static Card retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an issuing card.
   */
  public static Card retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Card.class, id), null,
      Card.class, options);
  }

  /**
   * Retrieve an issuing card.
   */
  public static Card retrieve(String id, Map<String, Object> params,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Card.class, id), params,
      Card.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update an issuing card.
   */
  @Override
  public Card update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update an issuing card.
   */
  @Override
  public Card update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Card.class, this.id), params,
      Card.class, options);
  }
  // </editor-fold>
  
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public final class AuthorizationControls extends StripeObject {
    List<String> allowedCategories;
    List<String> blockedCategories;
    String currency;
    Long maxAmount;
    Long maxApprovals;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public final class Billing extends StripeObject {
    Address address;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public final class Shipping extends StripeObject {
    Address address;
    String carrier;
    Long eta;
    String name;
    String phone;
    String status;
    String trackingNumber;
    String trackingURL;
    String type;
  }
}
