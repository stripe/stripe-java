// File generated from our OpenAPI spec
package com.stripe.model.giftcards;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.giftcards.CardCreateParams;
import com.stripe.param.giftcards.CardListParams;
import com.stripe.param.giftcards.CardRetrieveParams;
import com.stripe.param.giftcards.CardUpdateParams;
import com.stripe.param.giftcards.CardValidateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A gift card represents a single gift card owned by a customer, including the remaining balance,
 * gift card code, and whether or not it is active.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Card extends ApiResource implements HasId, MetadataStore<Card> {
  /** Whether this gift card can be used or not. */
  @SerializedName("active")
  Boolean active;

  /** The amount of funds available for new transactions. */
  @SerializedName("amount_available")
  Long amountAvailable;

  /** The amount of funds marked as held. */
  @SerializedName("amount_held")
  Long amountHeld;

  /** Code used to redeem this gift card. */
  @SerializedName("code")
  String code;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The related Stripe objects that created this gift card. */
  @SerializedName("created_by")
  CreatedBy createdBy;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code gift_cards.card}.
   */
  @SerializedName("object")
  String object;

  /** Transactions on this gift card. */
  @SerializedName("transactions")
  TransactionCollection transactions;

  /** Creates a new gift card object. */
  public static Card create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new gift card object. */
  public static Card create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/cards";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Card.class,
            options,
            ApiMode.V1);
  }

  /** Creates a new gift card object. */
  public static Card create(CardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new gift card object. */
  public static Card create(CardCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/cards";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Card.class,
            options,
            ApiMode.V1);
  }

  /** List gift cards for an account. */
  public static CardCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List gift cards for an account. */
  public static CardCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/cards";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CardCollection.class,
            options,
            ApiMode.V1);
  }

  /** List gift cards for an account. */
  public static CardCollection list(CardListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List gift cards for an account. */
  public static CardCollection list(CardListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/cards";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CardCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieve a gift card by id. */
  public static Card retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve a gift card by id. */
  public static Card retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieve a gift card by id. */
  public static Card retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/cards/%s", ApiResource.urlEncodeId(id));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Card.class,
            options,
            ApiMode.V1);
  }

  /** Retrieve a gift card by id. */
  public static Card retrieve(String id, CardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/cards/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Card.class,
            options,
            ApiMode.V1);
  }

  /** Update a gift card. */
  @Override
  public Card update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update a gift card. */
  @Override
  public Card update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_cards/cards/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Card.class,
            options,
            ApiMode.V1);
  }

  /** Update a gift card. */
  public Card update(CardUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update a gift card. */
  public Card update(CardUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_cards/cards/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Card.class,
            options,
            ApiMode.V1);
  }

  /** Validates a gift card code, returning the matching gift card object if it exists. */
  public static Card validate(Map<String, Object> params) throws StripeException {
    return validate(params, (RequestOptions) null);
  }

  /** Validates a gift card code, returning the matching gift card object if it exists. */
  public static Card validate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/cards/validate";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Card.class,
            options,
            ApiMode.V1);
  }

  /** Validates a gift card code, returning the matching gift card object if it exists. */
  public static Card validate(CardValidateParams params) throws StripeException {
    return validate(params, (RequestOptions) null);
  }

  /** Validates a gift card code, returning the matching gift card object if it exists. */
  public static Card validate(CardValidateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/cards/validate";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Card.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CreatedBy extends StripeObject {
    @SerializedName("checkout")
    Checkout checkout;

    @SerializedName("order")
    Order order;

    @SerializedName("payment")
    Payment payment;

    /**
     * The type of event that created this object.
     *
     * <p>One of {@code checkout}, {@code order}, or {@code payment}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Checkout extends StripeObject {
      /** The Stripe CheckoutSession that created this object. */
      @SerializedName("checkout_session")
      String checkoutSession;

      /** The Stripe CheckoutSession LineItem that created this object. */
      @SerializedName("line_item")
      String lineItem;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Order extends StripeObject {
      /** The Stripe Order LineItem that created this object. */
      @SerializedName("line_item")
      String lineItem;

      /** The Stripe Order that created this object. */
      @SerializedName("order")
      String order;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payment extends StripeObject {
      /** The PaymentIntent that created this object. */
      @SerializedName("payment_intent")
      String paymentIntent;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(createdBy, responseGetter);
    trySetResponseGetter(transactions, responseGetter);
  }
}
