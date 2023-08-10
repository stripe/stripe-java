// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
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

/**
 * When an <a href="https://stripe.com/docs/issuing">issued card</a> is used to make a purchase, an
 * Issuing {@code Authorization} object is created. <a
 * href="https://stripe.com/docs/issuing/purchases/authorizations">Authorizations</a> must be
 * approved for the purchase to be completed successfully.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/issuing/purchases/authorizations">Issued card
 * authorizations</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Authorization extends ApiResource
    implements MetadataStore<Authorization>, BalanceTransactionSource {
  /**
   * The total amount that was authorized or rejected. This amount is in the card's currency and in
   * the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Detailed breakdown of amount components. These amounts are denominated in {@code currency} and
   * in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

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

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The total amount that was authorized or rejected. This amount is in the {@code
   * merchant_currency} and in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Details about the authorization, such as identifiers, set by the card network. */
  @SerializedName("network_data")
  NetworkData networkData;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.authorization}.
   */
  @SerializedName("object")
  String object;

  /**
   * The pending authorization request. This field will only be non-null during an {@code
   * issuing_authorization.request} webhook.
   */
  @SerializedName("pending_request")
  PendingRequest pendingRequest;

  /**
   * History of every time a {@code pending_request} authorization was approved/declined, either by
   * you directly or by Stripe (e.g. based on your spending_controls). If the merchant changes the
   * authorization by performing an incremental authorization, you can look at this field to see the
   * previous requests for the authorization. This field can be helpful in determining why a given
   * authorization was approved/declined.
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

  /**
   * <a href="https://stripe.com/docs/api/treasury">Treasury</a> details related to this
   * authorization if it was created on a <a
   * href="https://stripe.com/docs/api/treasury/financial_accounts">FinancialAccount</a>.
   */
  @SerializedName("treasury")
  Treasury treasury;

  @SerializedName("verification_data")
  VerificationData verificationData;

  /**
   * The digital wallet used for this transaction. One of {@code apple_pay}, {@code google_pay}, or
   * {@code samsung_pay}. Will populate as {@code null} when no digital wallet was utilized.
   */
  @SerializedName("wallet")
  String wallet;

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
   * Approves a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. You can also respond directly to the webhook request to approve an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization approve() throws StripeException {
    return approve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Approves a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. You can also respond directly to the webhook request to approve an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization approve(RequestOptions options) throws StripeException {
    return approve((Map<String, Object>) null, options);
  }

  /**
   * Approves a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. You can also respond directly to the webhook request to approve an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization approve(Map<String, Object> params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /**
   * Approves a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. You can also respond directly to the webhook request to approve an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization approve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/approve", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Authorization.class,
            options,
            ApiMode.V1);
  }

  /**
   * Approves a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. You can also respond directly to the webhook request to approve an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization approve(AuthorizationApproveParams params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /**
   * Approves a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. You can also respond directly to the webhook request to approve an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization approve(AuthorizationApproveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/approve", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }

  /**
   * Declines a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. You can also respond directly to the webhook request to decline an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization decline() throws StripeException {
    return decline((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Declines a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. You can also respond directly to the webhook request to decline an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization decline(RequestOptions options) throws StripeException {
    return decline((Map<String, Object>) null, options);
  }

  /**
   * Declines a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. You can also respond directly to the webhook request to decline an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization decline(Map<String, Object> params) throws StripeException {
    return decline(params, (RequestOptions) null);
  }

  /**
   * Declines a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. You can also respond directly to the webhook request to decline an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization decline(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/decline", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Authorization.class,
            options,
            ApiMode.V1);
  }

  /**
   * Declines a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. You can also respond directly to the webhook request to decline an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization decline(AuthorizationDeclineParams params) throws StripeException {
    return decline(params, (RequestOptions) null);
  }

  /**
   * Declines a pending Issuing {@code Authorization} object. This request should be made within the
   * timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. You can also respond directly to the webhook request to decline an
   * authorization (preferred). More details can be found <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">here</a>.
   */
  public Authorization decline(AuthorizationDeclineParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/decline", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/authorizations";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            AuthorizationCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(AuthorizationListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Authorization} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static AuthorizationCollection list(AuthorizationListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/authorizations";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            AuthorizationCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves an Issuing {@code Authorization} object. */
  public static Authorization retrieve(String authorization) throws StripeException {
    return retrieve(authorization, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing {@code Authorization} object. */
  public static Authorization retrieve(String authorization, RequestOptions options)
      throws StripeException {
    return retrieve(authorization, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing {@code Authorization} object. */
  public static Authorization retrieve(
      String authorization, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(authorization));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Authorization.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves an Issuing {@code Authorization} object. */
  public static Authorization retrieve(
      String authorization, AuthorizationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(authorization));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Authorization update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Authorization update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Authorization.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(AuthorizationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Authorization} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Authorization update(AuthorizationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Authorization.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails extends StripeObject {
    /** The fee charged by the ATM for the cash withdrawal. */
    @SerializedName("atm_fee")
    Long atmFee;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantData extends StripeObject {
    /**
     * A categorization of the seller's type of business. See our <a
     * href="https://stripe.com/docs/issuing/merchant-categories">merchant categories guide</a> for
     * a list of possible values.
     */
    @SerializedName("category")
    String category;

    /** The merchant category code for the seller’s business. */
    @SerializedName("category_code")
    String categoryCode;

    /** City where the seller is located. */
    @SerializedName("city")
    String city;

    /** Country where the seller is located. */
    @SerializedName("country")
    String country;

    /** Name of the seller. */
    @SerializedName("name")
    String name;

    /**
     * Identifier assigned to the seller by the card network. Different card networks may assign
     * different network_id fields to the same merchant.
     */
    @SerializedName("network_id")
    String networkId;

    /** Postal code where the seller is located. */
    @SerializedName("postal_code")
    String postalCode;

    /** State where the seller is located. */
    @SerializedName("state")
    String state;

    /** An ID assigned by the seller to the location of the sale. */
    @SerializedName("terminal_id")
    String terminalId;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkData extends StripeObject {
    /**
     * Identifier assigned to the acquirer by the card network. Sometimes this value is not provided
     * by the network; in this case, the value will be {@code null}.
     */
    @SerializedName("acquiring_institution_id")
    String acquiringInstitutionId;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PendingRequest extends StripeObject {
    /**
     * The additional amount Stripe will hold if the authorization is approved, in the card's <a
     * href="https://stripe.com/docs/api#issuing_authorization_object-pending-request-currency">currency</a>
     * and in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
     * unit</a>.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Detailed breakdown of amount components. These amounts are denominated in {@code currency}
     * and in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
     * unit</a>.
     */
    @SerializedName("amount_details")
    AmountDetails amountDetails;

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

    /**
     * The amount the merchant is requesting to be authorized in the {@code merchant_currency}. The
     * amount is in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
     * unit</a>.
     */
    @SerializedName("merchant_amount")
    Long merchantAmount;

    /** The local currency the merchant is requesting to authorize. */
    @SerializedName("merchant_currency")
    String merchantCurrency;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountDetails extends StripeObject {
      /** The fee charged by the ATM for the cash withdrawal. */
      @SerializedName("atm_fee")
      Long atmFee;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RequestHistory extends StripeObject {
    /**
     * The {@code pending_request.amount} at the time of the request, presented in your card's
     * currency and in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
     * currency unit</a>. Stripe held this amount from your account to fund the authorization if the
     * request was approved.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Detailed breakdown of amount components. These amounts are denominated in {@code currency}
     * and in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
     * unit</a>.
     */
    @SerializedName("amount_details")
    AmountDetails amountDetails;

    /** Whether this request was approved. */
    @SerializedName("approved")
    Boolean approved;

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
     * The {@code pending_request.merchant_amount} at the time of the request, presented in the
     * {@code merchant_currency} and in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
     */
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
     * When an authorization is approved or declined by you or by Stripe, this field provides
     * additional detail on the reason for the outcome.
     *
     * <p>One of {@code account_disabled}, {@code card_active}, {@code card_inactive}, {@code
     * cardholder_inactive}, {@code cardholder_verification_required}, {@code insufficient_funds},
     * {@code not_allowed}, {@code spending_controls}, {@code suspected_fraud}, {@code
     * verification_failed}, {@code webhook_approved}, {@code webhook_declined}, {@code
     * webhook_error}, or {@code webhook_timeout}.
     */
    @SerializedName("reason")
    String reason;

    /**
     * If approve/decline decision is directly responsed to the webhook with json payload and if the
     * response is invalid (e.g., parsing errors), we surface the detailed message via this field.
     */
    @SerializedName("reason_message")
    String reasonMessage;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountDetails extends StripeObject {
      /** The fee charged by the ATM for the cash withdrawal. */
      @SerializedName("atm_fee")
      Long atmFee;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Treasury extends StripeObject {
    /**
     * The array of <a
     * href="https://stripe.com/docs/api/treasury/received_credits">ReceivedCredits</a> associated
     * with this authorization
     */
    @SerializedName("received_credits")
    List<String> receivedCredits;

    /**
     * The array of <a
     * href="https://stripe.com/docs/api/treasury/received_debits">ReceivedDebits</a> associated
     * with this authorization
     */
    @SerializedName("received_debits")
    List<String> receivedDebits;

    /**
     * The Treasury <a href="https://stripe.com/docs/api/treasury/transactions">Transaction</a>
     * associated with this authorization
     */
    @SerializedName("transaction")
    String transaction;
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
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(amountDetails, responseGetter);
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(cardholder, responseGetter);
    trySetResponseGetter(merchantData, responseGetter);
    trySetResponseGetter(networkData, responseGetter);
    trySetResponseGetter(pendingRequest, responseGetter);
    trySetResponseGetter(treasury, responseGetter);
    trySetResponseGetter(verificationData, responseGetter);
  }
}
