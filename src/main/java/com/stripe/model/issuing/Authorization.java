package com.stripe.model.issuing;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.IssuingAuthorizationMerchantData;
import com.stripe.model.IssuingAuthorizationRequest;
import com.stripe.model.IssuingAuthorizationVerificationData;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Authorization extends ApiResource
    implements BalanceTransactionSource, MetadataStore<Authorization> {
  /** Whether the authorization has been approved. */
  Boolean approved;

  /**
   * How the card details were provided. One of `keyed_in`, `swipe`, `chip`, `contactless`, or
   * `online`.
   */
  String authorizationMethod;

  /**
   * The amount that has been authorized. This will be `0` when the object is created, and increase
   * after it has been approved.
   */
  Long authorizedAmount;

  /**
   * The currency that was presented to the cardholder for the authorization. Three-letter [ISO
   * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  String authorizedCurrency;

  List<BalanceTransaction> balanceTransactions;

  Card card;

  /** The cardholder to whom this authorization belongs. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Cardholder> cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * The amount the authorization is expected to be in `held_currency`. When Stripe holds funds from
   * you, this is the amount reserved for the authorization. This will be `0` when the object is
   * created, and increase after it has been approved. For multi-currency transactions,
   * `held_amount` can be used to determine the expected exchange rate.
   */
  Long heldAmount;

  /**
   * The currency of the [held amount](/docs/api#issuing_authorization_object-held_amount). This
   * will always be the card currency.
   */
  String heldCurrency;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  Boolean isHeldAmountControllable;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  IssuingAuthorizationMerchantData merchantData;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * The amount the user is requesting to be authorized. This field will only be non-zero during an
   * `issuing.authorization.request` webhook.
   */
  Long pendingAuthorizedAmount;

  /**
   * The additional amount Stripe will hold if the authorization is approved. This field will only
   * be non-zero during an `issuing.authorization.request` webhook.
   */
  Long pendingHeldAmount;

  List<IssuingAuthorizationRequest> requestHistory;

  /** One of `pending`, `reversed`, or `closed`. */
  String status;

  List<Transaction> transactions;

  IssuingAuthorizationVerificationData verificationData;

  /**
   * What, if any, digital wallet was used for this authorization. One of `apple_pay`, `google_pay`,
   * or `samsung_pay`.
   */
  String walletProvider;

  /** Get id of expandable `cardholder` object. */
  public String getCardholder() {
    return (this.cardholder != null) ? this.cardholder.getId() : null;
  }

  public void setCardholder(String id) {
    this.cardholder = ApiResource.setExpandableFieldId(id, this.cardholder);
  }

  /** Get expanded `cardholder`. */
  public Cardholder getCardholderObject() {
    return (this.cardholder != null) ? this.cardholder.getExpanded() : null;
  }

  public void setCardholderObject(Cardholder expandableObject) {
    this.cardholder = new ExpandableField<Cardholder>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing <code>Authorization</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Authorization</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/authorizations");
    return requestCollection(url, params, AuthorizationCollection.class, options);
  }

  /** Retrieves an Issuing <code>Authorization</code> object. */
  public static Authorization retrieve(String authorization) throws StripeException {
    return retrieve(authorization, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Authorization</code> object. */
  public static Authorization retrieve(String authorization, RequestOptions options)
      throws StripeException {
    return retrieve(authorization, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Authorization</code> object. */
  public static Authorization retrieve(
      String authorization, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/issuing/authorizations/%s", authorization));
    return request(ApiResource.RequestMethod.GET, url, params, Authorization.class, options);
  }

  /** Approves a pending Issuing <code>Authorization</code> object. */
  public Authorization approve() throws StripeException {
    return approve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Approves a pending Issuing <code>Authorization</code> object. */
  public Authorization approve(Map<String, Object> params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /** Approves a pending Issuing <code>Authorization</code> object. */
  public Authorization approve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/authorizations/%s/approve", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  /** Declines a pending Issuing <code>Authorization</code> object. */
  public Authorization decline() throws StripeException {
    return decline((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Declines a pending Issuing <code>Authorization</code> object. */
  public Authorization decline(Map<String, Object> params) throws StripeException {
    return decline(params, (RequestOptions) null);
  }

  /** Declines a pending Issuing <code>Authorization</code> object. */
  public Authorization decline(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/authorizations/%s/decline", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  /**
   * Updates the specified Issuing <code>Authorization</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Authorization</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/issuing/authorizations/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }
}
