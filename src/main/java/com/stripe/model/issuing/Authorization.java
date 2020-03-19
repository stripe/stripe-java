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
  /** The total amount in the card's currency that was authorized or rejected. */
  @SerializedName("amount")
  Long amount;

  /** Whether the authorization has been approved. */
  @SerializedName("approved")
  Boolean approved;

  /**
   * How the card details were provided.
   *
   * <p>One of {@code chip}, {@code contactless}, {@code keyed_in}, {@code online}, or {@code
   * swipe}.
   */
  @SerializedName("authorization_method")
  String authorizationMethod;

  /**
   * The amount that has been authorized. This will be {@code 0} when the object is created, and
   * increase after it has been approved.
   */
  @SerializedName("authorized_amount")
  Long authorizedAmount;

  /**
   * The currency that was presented to the cardholder for the authorization. Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("authorized_currency")
  String authorizedCurrency;

  /** List of balance transactions associated with this authorization. */
  @SerializedName("balance_transactions")
  List<BalanceTransaction> balanceTransactions;

  /**
   * You can <a href="https://stripe.com/docs/issuing/cards">create physical or virtual cards</a>
   * that are issued to cardholders.
   */
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
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The amount the authorization is expected to be in {@code held_currency}. When Stripe holds
   * funds from you, this is the amount reserved for the authorization. This will be {@code 0} when
   * the object is created, and increase after it has been approved. For multi-currency
   * transactions, {@code held_amount} can be used to determine the expected exchange rate.
   */
  @SerializedName("held_amount")
  Long heldAmount;

  /**
   * The currency of the <a
   * href="https://stripe.com/docs/api#issuing_authorization_object-held_amount">held amount</a>.
   * This will always be the card currency.
   */
  @SerializedName("held_currency")
  String heldCurrency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If set {@code true}, you may provide <a
   * href="https://stripe.com/docs/api/issuing/authorizations/approve#approve_issuing_authorization-held_amount">held_amount</a>
   * to control how much to hold for the authorization.
   */
  @SerializedName("is_held_amount_controllable")
  Boolean isHeldAmountControllable;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The total amount that was authorized or rejected in the local merchant_currency. */
  @SerializedName("merchant_amount")
  Long merchantAmount;

  /**
   * The currency that was presented to the cardholder for the authorization. Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("merchant_currency")
  String merchantCurrency;

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
   * <p>Equal to {@code issuing.authorization}.
   */
  @SerializedName("object")
  String object;

  /**
   * The amount the user is requesting to be authorized. This field will only be non-zero during an
   * {@code issuing.authorization.request} webhook.
   */
  @SerializedName("pending_authorized_amount")
  Long pendingAuthorizedAmount;

  /**
   * The additional amount Stripe will hold if the authorization is approved. This field will only
   * be non-zero during an {@code issuing.authorization.request} webhook.
   */
  @SerializedName("pending_held_amount")
  Long pendingHeldAmount;

  /**
   * The pending authorization request. This field will only be non-null during an {@code
   * issuing.authorization.request} webhook.
   */
  @SerializedName("pending_request")
  PendingRequest pendingRequest;

  /**
   * History of every time the authorization was approved/denied (whether approved/denied by you
   * directly, or by Stripe based on your authorization_controls). If the merchant changes the
   * authorization by performing an <a
   * href="https://stripe.com/docs/issuing/purchases/authorizations">incremental authorization or
   * partial capture</a>, you can look at request_history to see the previous states of the
   * authorization.
   */
  @SerializedName("request_history")
  List<Authorization.RequestHistory> requestHistory;

  /**
   * The current status of the authorization in its lifecycle.
   *
   * <p>One of {@code closed}, {@code pending}, or {@code reversed}.
   */
  @SerializedName("status")
  String status;

  /**
   * List of <a href="https://stripe.com/docs/api/issuing/transactions">transactions</a> associated
   * with this authorization.
   */
  @SerializedName("transactions")
  List<Transaction> transactions;

  @SerializedName("verification_data")
  VerificationData verificationData;

  /**
   * What, if any, digital wallet was used for this authorization. One of {@code apple_pay}, {@code
   * google_pay}, or {@code samsung_pay}.
   */
  @SerializedName("wallet")
  String wallet;

  /**
   * [DEPRECATED] What, if any, digital wallet was used for this authorization. One of {@code
   * apple_pay}, {@code google_pay}, or {@code samsung_pay}.
   */
  @SerializedName("wallet_provider")
  String walletProvider;

  /** Get ID of expandable {@code cardholder} object. */
  public String getCardholder() {
    return (this.cardholder != null) ? this.cardholder.getId() : null;
  }

  public void setCardholder(String id) {
    this.cardholder = ApiResource.setExpandableFieldId(id, this.cardholder);
  }

  /** Get expanded {@code cardholder}. */
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
  public static class PendingRequest extends StripeObject {
    /**
     * The additional amount Stripe will hold if the authorization is approved, in the <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-pending-request-currency">currency</a>,
     * which is always the card's currency.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * If set {@code true}, you may provide <a
     * href="https://stripe.com/docs/api/issuing/authorizations/approve#approve_issuing_authorization-amount">amount</a>
     * to control how much to hold for the authorization.
     */
    @SerializedName("is_amount_controllable")
    Boolean isAmountControllable;

    /** The amount the merchant is requesting to be authorized in the {@code merchant_currency}. */
    @SerializedName("merchant_amount")
    Long merchantAmount;

    /** The local currency the merchant is requesting to authorize. */
    @SerializedName("merchant_currency")
    String merchantCurrency;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RequestHistory extends StripeObject {
    /**
     * The amount of the authorization is your card's currency. Stripe held this amount from your
     * account to fund the authorization, if the request was approved
     */
    @SerializedName("amount")
    Long amount;

    /** Whether this request was approved. */
    @SerializedName("approved")
    Boolean approved;

    /** The amount that was authorized at the time of this request. */
    @SerializedName("authorized_amount")
    Long authorizedAmount;

    /**
     * The currency that was presented to the cardholder for the authorization. Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("authorized_currency")
    String authorizedCurrency;

    /** Time at which the object was created. Measured in seconds since the Unix epoch. */
    @SerializedName("created")
    Long created;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * The amount Stripe held from your account to fund the authorization, if the request was
     * approved.
     */
    @SerializedName("held_amount")
    Long heldAmount;

    /**
     * The currency of the <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-held_amount">held amount.</a>
     */
    @SerializedName("held_currency")
    String heldCurrency;

    /** The amount that was authorized at the time of this request. */
    @SerializedName("merchant_amount")
    Long merchantAmount;

    /**
     * The currency that was collected by the merchant and presented to the cardholder for the
     * authorization. Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO
     * currency code</a>, in lowercase. Must be a <a
     * href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("merchant_currency")
    String merchantCurrency;

    /**
     * The reason for the approval or decline.
     *
     * <p>One of {@code account_compliance_disabled}, {@code account_inactive}, {@code
     * authentication_failed}, {@code authorization_controls}, {@code card_active}, {@code
     * card_inactive}, {@code cardholder_inactive}, {@code cardholder_verification_required}, {@code
     * incorrect_cvc}, {@code incorrect_expiry}, {@code insufficient_funds}, {@code not_allowed},
     * {@code suspected_fraud}, {@code webhook_approved}, {@code webhook_declined}, or {@code
     * webhook_timeout}.
     */
    @SerializedName("reason")
    String reason;

    /**
     * When an authorization is declined due to {@code authorization_controls}, this array contains
     * details about the authorization controls that were violated. Otherwise, it is empty.
     */
    @SerializedName("violated_authorization_controls")
    List<Authorization.RequestHistory.ViolatedAuthorizationControl> violatedAuthorizationControls;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ViolatedAuthorizationControl extends StripeObject {
      /**
       * Entity which the authorization control acts on. One of {@code card}, {@code cardholder}, or
       * {@code account}.
       */
      @SerializedName("entity")
      String entity;

      /**
       * Name of the authorization control. One of {@code allowed_categories}, {@code
       * blocked_categories}, {@code spending_limits}, {@code max_approvals}, or {@code max_amount}.
       */
      @SerializedName("name")
      String name;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ThreeDSecure extends StripeObject {
    /**
     * The outcome of the 3D Secure authentication request.
     *
     * <p>One of {@code attempt_acknowledged}, {@code authenticated}, or {@code failed}.
     */
    @SerializedName("result")
    String result;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationData extends StripeObject {
    /**
     * Whether the cardholder provided an address first line and if it matched the cardholder’s
     * {@code billing.address.line1}.
     *
     * <p>One of {@code match}, {@code mismatch}, or {@code not_provided}.
     */
    @SerializedName("address_line1_check")
    String addressLine1Check;

    /**
     * Whether the cardholder provided a postal code and if it matched the cardholder’s {@code
     * billing.address.postal_code}.
     *
     * <p>One of {@code match}, {@code mismatch}, or {@code not_provided}.
     */
    @SerializedName("address_postal_code_check")
    String addressPostalCodeCheck;

    /**
     * [DEPRECATED] Whether the cardholder provided a postal code and if it matched the cardholder’s
     * {@code billing.address.postal_code}.
     *
     * <p>One of {@code match}, {@code mismatch}, or {@code not_provided}.
     */
    @SerializedName("address_zip_check")
    String addressZipCheck;

    /**
     * [DEPRECATED] Whether 3DS authentication was performed.
     *
     * <p>One of {@code failure}, {@code none}, or {@code success}.
     */
    @SerializedName("authentication")
    String authentication;

    /**
     * Whether the cardholder provided a CVC and if it matched Stripe’s record.
     *
     * <p>One of {@code match}, {@code mismatch}, or {@code not_provided}.
     */
    @SerializedName("cvc_check")
    String cvcCheck;

    /**
     * Whether the cardholder provided an expiry date and if it matched Stripe’s record.
     *
     * <p>One of {@code match}, {@code mismatch}, or {@code not_provided}.
     */
    @SerializedName("expiry_check")
    String expiryCheck;

    /** 3D Secure details on this authorization. */
    @SerializedName("three_d_secure")
    ThreeDSecure threeDSecure;
  }
}
