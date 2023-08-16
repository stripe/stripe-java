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
import com.stripe.param.giftcards.TransactionCancelParams;
import com.stripe.param.giftcards.TransactionConfirmParams;
import com.stripe.param.giftcards.TransactionCreateParams;
import com.stripe.param.giftcards.TransactionListParams;
import com.stripe.param.giftcards.TransactionRetrieveParams;
import com.stripe.param.giftcards.TransactionUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A gift card transaction represents a single transaction on a referenced gift card. A transaction
 * is in one of three states, {@code confirmed}, {@code held} or {@code canceled}. A {@code
 * confirmed} transaction is one that has added/deducted funds. A {@code held} transaction has
 * created a temporary hold on funds, which can then be cancelled or confirmed. A {@code held}
 * transaction can be confirmed into a {@code confirmed} transaction, or canceled into a {@code
 * canceled} transaction. A {@code canceled} transaction has no effect on a gift card's balance.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends ApiResource implements HasId, MetadataStore<Transaction> {
  /**
   * The amount of this transaction. A positive value indicates that funds were added to the gift
   * card. A negative value indicates that funds were removed from the gift card.
   */
  @SerializedName("amount")
  Long amount;

  /** Time at which the transaction was confirmed. Measured in seconds since the Unix epoch. */
  @SerializedName("confirmed_at")
  Long confirmedAt;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The related Stripe objects that created this gift card transaction. */
  @SerializedName("created_by")
  CreatedBy createdBy;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** The gift card that this transaction occurred on. */
  @SerializedName("gift_card")
  String giftCard;

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
   * <p>Equal to {@code gift_cards.transaction}.
   */
  @SerializedName("object")
  String object;

  /** Status of this transaction, one of {@code held}, {@code confirmed}, or {@code canceled}. */
  @SerializedName("status")
  String status;

  /**
   * A string that identifies this transaction as part of a group. See the <a
   * href="https://stripe.com/docs/connect/separate-charges-and-transfers">Connect documentation</a>
   * for details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  /** Cancel a gift card transaction. */
  public Transaction cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancel a gift card transaction. */
  public Transaction cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancel a gift card transaction. */
  public Transaction cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancel a gift card transaction. */
  public Transaction cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/gift_cards/transactions/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Cancel a gift card transaction. */
  public Transaction cancel(TransactionCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancel a gift card transaction. */
  public Transaction cancel(TransactionCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/gift_cards/transactions/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Confirm a gift card transaction. */
  public Transaction confirm() throws StripeException {
    return confirm((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Confirm a gift card transaction. */
  public Transaction confirm(RequestOptions options) throws StripeException {
    return confirm((Map<String, Object>) null, options);
  }

  /** Confirm a gift card transaction. */
  public Transaction confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /** Confirm a gift card transaction. */
  public Transaction confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/gift_cards/transactions/%s/confirm", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Confirm a gift card transaction. */
  public Transaction confirm(TransactionConfirmParams params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /** Confirm a gift card transaction. */
  public Transaction confirm(TransactionConfirmParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/gift_cards/transactions/%s/confirm", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Create a gift card transaction. */
  public static Transaction create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a gift card transaction. */
  public static Transaction create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/transactions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Create a gift card transaction. */
  public static Transaction create(TransactionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a gift card transaction. */
  public static Transaction create(TransactionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/transactions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** List gift card transactions for a gift card. */
  public static TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List gift card transactions for a gift card. */
  public static TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/transactions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            TransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /** List gift card transactions for a gift card. */
  public static TransactionCollection list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List gift card transactions for a gift card. */
  public static TransactionCollection list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards/transactions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            TransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the gift card transaction. */
  public static Transaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the gift card transaction. */
  public static Transaction retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the gift card transaction. */
  public static Transaction retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/transactions/%s", ApiResource.urlEncodeId(id));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the gift card transaction. */
  public static Transaction retrieve(
      String id, TransactionRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_cards/transactions/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Update a gift card transaction. */
  @Override
  public Transaction update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update a gift card transaction. */
  @Override
  public Transaction update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/transactions/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Update a gift card transaction. */
  public Transaction update(TransactionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update a gift card transaction. */
  public Transaction update(TransactionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/transactions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
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
  }
}
