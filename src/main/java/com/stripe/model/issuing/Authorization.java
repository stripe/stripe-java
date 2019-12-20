package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.AuthorizationApproveParams;
import com.stripe.param.issuing.AuthorizationDeclineParams;
import com.stripe.param.issuing.AuthorizationListParams;
import com.stripe.param.issuing.AuthorizationRetrieveParams;
import com.stripe.param.issuing.AuthorizationUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Authorization extends ApiResource
    implements MetadataStore<Authorization>, BalanceTransactionSource {
  /** Whether the authorization has been approved. */
  @SerializedName("approved")
  Boolean approved;

  /**
   * How the card details were provided.
   *
   * <p>One of `chip`, `contactless`, `keyed_in`, `online`, or `swipe`.
   */
  @SerializedName("authorization_method")
  String authorizationMethod;

  /**
   * The amount that has been authorized. This will be `0` when the object is created, and increase
   * after it has been approved.
   */
  @SerializedName("authorized_amount")
  Long authorizedAmount;

  /**
   * The currency that was presented to the cardholder for the authorization. Three-letter [ISO
   * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("authorized_currency")
  String authorizedCurrency;

  @SerializedName("balance_transactions")
  List<BalanceTransaction> balanceTransactions;

  @SerializedName("card")
  Card card;

  /** The cardholder to whom this authorization belongs. */
  @SerializedName("cardholder")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Cardholder> cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The amount the authorization is expected to be in `held_currency`. When Stripe holds funds from
   * you, this is the amount reserved for the authorization. This will be `0` when the object is
   * created, and increase after it has been approved. For multi-currency transactions,
   * `held_amount` can be used to determine the expected exchange rate.
   */
  @SerializedName("held_amount")
  Long heldAmount;

  /**
   * The currency of the [held
   * amount](https://stripe.com/docs/api#issuing_authorization_object-held_amount). This will always
   * be the card currency.
   */
  @SerializedName("held_currency")
  String heldCurrency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("is_held_amount_controllable")
  Boolean isHeldAmountControllable;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("merchant_data")
  MerchantData merchantData;

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
   * <p>Equal to `issuing.authorization`.
   */
  @SerializedName("object")
  String object;

  /**
   * The amount the user is requesting to be authorized. This field will only be non-zero during an
   * `issuing.authorization.request` webhook.
   */
  @SerializedName("pending_authorized_amount")
  Long pendingAuthorizedAmount;

  /**
   * The additional amount Stripe will hold if the authorization is approved. This field will only
   * be non-zero during an `issuing.authorization.request` webhook.
   */
  @SerializedName("pending_held_amount")
  Long pendingHeldAmount;

  @SerializedName("request_history")
  List<Authorization.RequestHistory> requestHistory;

  /**
   * The current status of the authorization in its lifecycle.
   *
   * <p>One of `closed`, `pending`, or `reversed`.
   */
  @SerializedName("status")
  String status;

  @SerializedName("transactions")
  List<Transaction> transactions;

  @SerializedName("verification_data")
  VerificationData verificationData;

  /**
   * What, if any, digital wallet was used for this authorization. One of `apple_pay`, `google_pay`,
   * or `samsung_pay`.
   */
  @SerializedName("wallet_provider")
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
    return ApiResource.requestCollection(url, params, AuthorizationCollection.class, options);
  }

  /**
   * Returns a list of Issuing <code>Authorization</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(AuthorizationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Authorization</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(AuthorizationListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/authorizations");
    return ApiResource.requestCollection(url, params, AuthorizationCollection.class, options);
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
            Stripe.getApiBase(),
            String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(authorization)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Authorization.class, options);
  }

  /** Retrieves an Issuing <code>Authorization</code> object. */
  public static Authorization retrieve(
      String authorization, AuthorizationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(authorization)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Authorization.class, options);
  }

  /**
   * Updates the specified Issuing <code>Authorization</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Authorization update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Authorization</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Authorization update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  /**
   * Updates the specified Issuing <code>Authorization</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(AuthorizationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Authorization</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(AuthorizationUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  /** Approves a pending Issuing <code>Authorization</code> object. */
  public Authorization approve() throws StripeException {
    return approve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Approves a pending Issuing <code>Authorization</code> object. */
  public Authorization approve(RequestOptions options) throws StripeException {
    return approve((Map<String, Object>) null, options);
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
            String.format(
                "/v1/issuing/authorizations/%s/approve", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  /** Approves a pending Issuing <code>Authorization</code> object. */
  public Authorization approve(AuthorizationApproveParams params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /** Approves a pending Issuing <code>Authorization</code> object. */
  public Authorization approve(AuthorizationApproveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/issuing/authorizations/%s/approve", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  /** Declines a pending Issuing <code>Authorization</code> object. */
  public Authorization decline() throws StripeException {
    return decline((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Declines a pending Issuing <code>Authorization</code> object. */
  public Authorization decline(RequestOptions options) throws StripeException {
    return decline((Map<String, Object>) null, options);
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
            String.format(
                "/v1/issuing/authorizations/%s/decline", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  /** Declines a pending Issuing <code>Authorization</code> object. */
  public Authorization decline(AuthorizationDeclineParams params) throws StripeException {
    return decline(params, (RequestOptions) null);
  }

  /** Declines a pending Issuing <code>Authorization</code> object. */
  public Authorization decline(AuthorizationDeclineParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/issuing/authorizations/%s/decline", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Authorization.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RequestHistory extends StripeObject {
    /** Whether this request was approved. */
    @SerializedName("approved")
    Boolean approved;

    /** The amount that was authorized at the time of this request. */
    @SerializedName("authorized_amount")
    Long authorizedAmount;

    /**
     * The currency that was presented to the cardholder for the authorization. Three-letter [ISO
     * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    @SerializedName("authorized_currency")
    String authorizedCurrency;

    /** Time at which the object was created. Measured in seconds since the Unix epoch. */
    @SerializedName("created")
    Long created;

    /**
     * The amount Stripe held from your account to fund the authorization, if the request was
     * approved.
     */
    @SerializedName("held_amount")
    Long heldAmount;

    /**
     * The currency of the [held
     * amount](https://stripe.com/docs/api#issuing_authorization_object-held_amount).
     */
    @SerializedName("held_currency")
    String heldCurrency;

    /**
     * The reason for the approval or decline.
     *
     * <p>One of `account_compliance_disabled`, `account_inactive`, `authentication_failed`,
     * `authorization_controls`, `card_active`, `card_inactive`, `cardholder_inactive`,
     * `cardholder_verification_required`, `insufficient_funds`, `not_allowed`, `suspected_fraud`,
     * `webhook_approved`, `webhook_declined`, or `webhook_timeout`.
     */
    @SerializedName("reason")
    String reason;

    /**
     * When an authorization is declined due to `authorization_controls`, this array contains
     * details about the authorization controls that were violated. Otherwise, it is empty.
     */
    @SerializedName("violated_authorization_controls")
    List<Authorization.RequestHistory.ViolatedAuthorizationControl> violatedAuthorizationControls;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ViolatedAuthorizationControl extends StripeObject {
      /**
       * Entity which the authorization control acts on. One of `account`, `card`, or `cardholder`.
       */
      @SerializedName("entity")
      String entity;

      /**
       * Name of the authorization control. One of `allowed_categories`, `blocked_categories`,
       * `max_amount`, `max_approvals`, or `spending_limits`.
       */
      @SerializedName("name")
      String name;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationData extends StripeObject {
    /**
     * Whether the cardholder provided an address first line and if it matched the cardholder’s
     * `billing.address.line1`. One of `match`, `mismatch`, or `not_provided`.
     */
    @SerializedName("address_line1_check")
    String addressLine1Check;

    /**
     * Whether the cardholder provided a zip (or postal code) and if it matched the cardholder’s
     * `billing.address.postal_code`. One of `match`, `mismatch`, or `not_provided`.
     */
    @SerializedName("address_zip_check")
    String addressZipCheck;

    /** One of `exempt`, `failure`, `none`, or `success`. */
    @SerializedName("authentication")
    String authentication;

    /**
     * Whether the cardholder provided a CVC and if it matched Stripe’s record. One of `match`,
     * `mismatch`, or `not_provided`.
     */
    @SerializedName("cvc_check")
    String cvcCheck;
  }
}
