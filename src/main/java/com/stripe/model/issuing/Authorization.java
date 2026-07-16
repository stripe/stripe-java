// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.AuthorizationApproveParams;
import com.stripe.param.issuing.AuthorizationCaptureParams;
import com.stripe.param.issuing.AuthorizationCreateParams;
import com.stripe.param.issuing.AuthorizationDeclineParams;
import com.stripe.param.issuing.AuthorizationExpireParams;
import com.stripe.param.issuing.AuthorizationFinalizeAmountParams;
import com.stripe.param.issuing.AuthorizationIncrementParams;
import com.stripe.param.issuing.AuthorizationListParams;
import com.stripe.param.issuing.AuthorizationRespondParams;
import com.stripe.param.issuing.AuthorizationRetrieveParams;
import com.stripe.param.issuing.AuthorizationReverseParams;
import com.stripe.param.issuing.AuthorizationUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * When an <a href="https://docs.stripe.com/issuing">issued card</a> is used to make a purchase, an
 * Issuing {@code Authorization} object is created. <a
 * href="https://docs.stripe.com/issuing/purchases/authorizations">Authorizations</a> must be
 * approved for the purchase to be completed successfully.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/issuing/purchases/authorizations">Issued card
 * authorizations</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Authorization extends ApiResource
    implements MetadataStore<Authorization>, BalanceTransactionSource {
  /**
   * The total amount that was authorized or rejected. This amount is in {@code currency} and in the
   * <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>. {@code
   * amount} should be the same as {@code merchant_amount}, unless {@code currency} and {@code
   * merchant_currency} are different.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Detailed breakdown of amount components. These amounts are denominated in {@code currency} and
   * in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
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

  @SerializedName("balance_response")
  BalanceResponse balanceResponse;

  /** List of balance transactions associated with this authorization. */
  @SerializedName("balance_transactions")
  List<BalanceTransaction> balanceTransactions;

  /**
   * You can <a href="https://docs.stripe.com/issuing">create physical or virtual cards</a> that are
   * issued to cardholders.
   */
  @SerializedName("card")
  Card card;

  /**
   * Whether the card was present at the point of sale for the authorization.
   *
   * <p>One of {@code not_present}, or {@code present}.
   */
  @SerializedName("card_presence")
  String cardPresence;

  /** The cardholder to whom this authorization belongs. */
  @SerializedName("cardholder")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Cardholder> cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Array of onchain crypto transactions linked to this resource. */
  @SerializedName("crypto_transactions")
  List<Authorization.CryptoTransaction> cryptoTransactions;

  /**
   * The currency of the cardholder. This currency can be different from the currency presented at
   * authorization and the {@code merchant_currency} field on this authorization. Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Enriched merchant data for this authorization. */
  @SerializedName("enriched_merchant_data")
  EnrichedMerchantData enrichedMerchantData;

  /** Fleet-specific information for authorizations using Fleet cards. */
  @SerializedName("fleet")
  Fleet fleet;

  /**
   * Fraud challenges sent to the cardholder, if this authorization was declined for fraud risk
   * reasons.
   */
  @SerializedName("fraud_challenges")
  List<Authorization.FraudChallenge> fraudChallenges;

  /**
   * Information about fuel that was purchased with this transaction. Typically this information is
   * received from the merchant after the authorization has been approved and the fuel dispensed.
   */
  @SerializedName("fuel")
  Fuel fuel;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The total amount that was authorized or rejected. This amount is in the {@code
   * merchant_currency} and in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>. {@code
   * merchant_amount} should be the same as {@code amount}, unless {@code merchant_currency} and
   * {@code currency} are different.
   */
  @SerializedName("merchant_amount")
  Long merchantAmount;

  /**
   * The exchange rate used by the network to convert the {@code merchant_amount} to {@code amount}.
   * The {@code merchant_amount} multiplied with this rate will equal to the {@code amount}.
   */
  @SerializedName("merchant_amount_exchange_rate")
  BigDecimal merchantAmountExchangeRate;

  /**
   * The local currency that was presented to the cardholder for the authorization. This currency
   * can be different from the cardholder currency and the {@code currency} field on this
   * authorization. Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO
   * currency code</a>, in lowercase. Must be a <a
   * href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("merchant_currency")
  String merchantCurrency;

  @SerializedName("merchant_data")
  MerchantData merchantData;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
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
   * Redaction status of this authorization. If the authorization is not redacted, this field will
   * be null.
   */
  @SerializedName("redaction")
  Redaction redaction;

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
   * <p>One of {@code closed}, {@code expired}, {@code pending}, or {@code reversed}.
   */
  @SerializedName("status")
  String status;

  /** Details about the cardholder verification outcome at the terminal. */
  @SerializedName("terminal_data")
  TerminalData terminalData;

  /**
   * <a href="https://docs.stripe.com/api/issuing/tokens/object">Token</a> object used for this
   * authorization. If a network token was not used for this authorization, this field will be null.
   */
  @SerializedName("token")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Token> token;

  @SerializedName("token_details")
  TokenDetails tokenDetails;

  /**
   * List of <a href="https://docs.stripe.com/api/issuing/transactions">transactions</a> associated
   * with this authorization.
   */
  @SerializedName("transactions")
  List<Transaction> transactions;

  /**
   * <a href="https://docs.stripe.com/api/treasury">Treasury</a> details related to this
   * authorization if it was created on a <a
   * href="https://docs.stripe.com/api/treasury/financial_accounts">FinancialAccount</a>.
   */
  @SerializedName("treasury")
  Treasury treasury;

  @SerializedName("verification_data")
  VerificationData verificationData;

  /**
   * Whether the authorization bypassed fraud risk checks because the cardholder has previously
   * completed a fraud challenge on a similar high-risk authorization from the same merchant.
   */
  @SerializedName("verified_by_fraud_challenge")
  Boolean verifiedByFraudChallenge;

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

  /** Get ID of expandable {@code token} object. */
  public String getToken() {
    return (this.token != null) ? this.token.getId() : null;
  }

  public void setToken(String id) {
    this.token = ApiResource.setExpandableFieldId(id, this.token);
  }

  /** Get expanded {@code token}. */
  public Token getTokenObject() {
    return (this.token != null) ? this.token.getExpanded() : null;
  }

  public void setTokenObject(Token expandableObject) {
    this.token = new ExpandableField<Token>(expandableObject.getId(), expandableObject);
  }

  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  @Deprecated
  public Authorization approve() throws StripeException {
    return approve((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  @Deprecated
  public Authorization approve(RequestOptions options) throws StripeException {
    return approve((Map<String, Object>) null, options);
  }

  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  @Deprecated
  public Authorization approve(Map<String, Object> params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  @Deprecated
  public Authorization approve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/approve", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Authorization.class);
  }

  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  @Deprecated
  public Authorization approve(AuthorizationApproveParams params) throws StripeException {
    return approve(params, (RequestOptions) null);
  }

  /**
   * [Deprecated] Approves a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real-time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to approve an authorization</a>.
   */
  @Deprecated
  public Authorization approve(AuthorizationApproveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/approve", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Authorization.class);
  }

  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  @Deprecated
  public Authorization decline() throws StripeException {
    return decline((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  @Deprecated
  public Authorization decline(RequestOptions options) throws StripeException {
    return decline((Map<String, Object>) null, options);
  }

  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  @Deprecated
  public Authorization decline(Map<String, Object> params) throws StripeException {
    return decline(params, (RequestOptions) null);
  }

  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  @Deprecated
  public Authorization decline(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/decline", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Authorization.class);
  }

  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  @Deprecated
  public Authorization decline(AuthorizationDeclineParams params) throws StripeException {
    return decline(params, (RequestOptions) null);
  }

  /**
   * [Deprecated] Declines a pending Issuing {@code Authorization} object. This request should be
   * made within the timeout window of the <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations">real time
   * authorization</a> flow. This method is deprecated. Instead, <a
   * href="https://stripe.com/docs/issuing/controls/real-time-authorizations#authorization-handling">respond
   * directly to the webhook request to decline an authorization</a>.
   */
  @Deprecated
  public Authorization decline(AuthorizationDeclineParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/authorizations/%s/decline", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Authorization.class);
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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AuthorizationCollection.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AuthorizationCollection.class);
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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Authorization.class);
  }

  /** Retrieves an Issuing {@code Authorization} object. */
  public static Authorization retrieve(
      String authorization, AuthorizationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/authorizations/%s", ApiResource.urlEncodeId(authorization));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Authorization.class);
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
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Authorization.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Authorization.class);
  }

  /**
   * For more details about AmountDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails extends StripeObject {
    /** The fee charged by the ATM for the cash withdrawal. */
    @SerializedName("atm_fee")
    Long atmFee;

    /** The amount of cash requested by the cardholder. */
    @SerializedName("cashback_amount")
    Long cashbackAmount;
  }

  /**
   * For more details about BalanceResponse, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceResponse extends StripeObject {
    /**
     * The cardholder account type affected by this authorization.
     *
     * <p>One of {@code checking}, {@code credit}, {@code default}, {@code other}, {@code savings},
     * or {@code universal}.
     */
    @SerializedName("account_type")
    String accountType;

    /**
     * The available balance or credit limit in the cardholder's account after the authorization, in
     * the smallest currency unit.
     */
    @SerializedName("available_balance")
    Long availableBalance;

    /**
     * The currency of the remaining balances in the cardholder's account after the authorization.
     */
    @SerializedName("currency")
    String currency;

    /**
     * The current ledger balance or remaining credit amount in the cardholder's account after the
     * authorization, in the smallest currency unit.
     */
    @SerializedName("current_balance")
    Long currentBalance;
  }

  /**
   * For more details about CryptoTransaction, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CryptoTransaction extends StripeObject {
    /**
     * The confirmed crypto transaction details when {@code type} is {@code
     * crypto_transaction_confirmed}; otherwise null.
     */
    @SerializedName("crypto_transaction_confirmed")
    CryptoTransactionConfirmed cryptoTransactionConfirmed;

    /**
     * The failed crypto transaction details when {@code type} is {@code crypto_transaction_failed};
     * otherwise null.
     */
    @SerializedName("crypto_transaction_failed")
    CryptoTransactionFailed cryptoTransactionFailed;

    /** The crypto transaction variant for this array entry. */
    @SerializedName("type")
    String type;

    /**
     * For more details about CryptoTransactionConfirmed, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CryptoTransactionConfirmed extends StripeObject {
      /** The crypto amount for the confirmed transaction. */
      @SerializedName("amount")
      String amount;

      /** The upcharged MCC amount, if one was applied. */
      @SerializedName("amount_mcc_upcharged")
      String amountMccUpcharged;

      /** The blockchain network for the confirmed transaction. */
      @SerializedName("chain")
      String chain;

      /** When the transaction was confirmed onchain. */
      @SerializedName("confirmed_at")
      Long confirmedAt;

      /** The currency of the crypto transaction amount. */
      @SerializedName("currency")
      String currency;

      /** Fees associated with the transaction. */
      @SerializedName("fees")
      List<Authorization.CryptoTransaction.CryptoTransactionConfirmed.Fee> fees;

      /** The source wallet address for the transaction. */
      @SerializedName("from_address")
      String fromAddress;

      /** Memo metadata attached to the transaction, if present. */
      @SerializedName("memo")
      String memo;

      /** The destination wallet address for the transaction. */
      @SerializedName("to_address")
      String toAddress;

      /** The blockchain transaction hash. */
      @SerializedName("transaction_hash")
      String transactionHash;

      /**
       * For more details about Fee, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Fee extends StripeObject {
        /** The fee amount. */
        @SerializedName("amount")
        String amount;

        /** The fee currency. */
        @SerializedName("currency")
        String currency;

        /** The fee type. */
        @SerializedName("type")
        String type;
      }
    }

    /**
     * For more details about CryptoTransactionFailed, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CryptoTransactionFailed extends StripeObject {
      /** The crypto amount for the failed transaction. */
      @SerializedName("amount")
      String amount;

      /** The upcharged MCC amount, if one was applied. */
      @SerializedName("amount_mcc_upcharged")
      String amountMccUpcharged;

      /** The blockchain network for the failed transaction. */
      @SerializedName("chain")
      String chain;

      /** The currency of the crypto transaction amount. */
      @SerializedName("currency")
      String currency;

      /** When the transaction failed. */
      @SerializedName("failed_at")
      Long failedAt;

      /** The reason the transaction failed. */
      @SerializedName("failure_reason")
      String failureReason;

      /** Fees associated with the transaction. */
      @SerializedName("fees")
      List<Authorization.CryptoTransaction.CryptoTransactionFailed.Fee> fees;

      /** The source wallet address for the attempted transaction. */
      @SerializedName("from_address")
      String fromAddress;

      /** Memo metadata attached to the transaction, if present. */
      @SerializedName("memo")
      String memo;

      /** The destination wallet address for the attempted transaction when one exists. */
      @SerializedName("to_address")
      String toAddress;

      /** The blockchain transaction hash when one exists. */
      @SerializedName("transaction_hash")
      String transactionHash;

      /**
       * For more details about Fee, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Fee extends StripeObject {
        /** The fee amount. */
        @SerializedName("amount")
        String amount;

        /** The fee currency. */
        @SerializedName("currency")
        String currency;

        /** The fee type. */
        @SerializedName("type")
        String type;
      }
    }
  }

  /**
   * For more details about EnrichedMerchantData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EnrichedMerchantData extends StripeObject {
    /**
     * Additional details about the seller (grocery store, e-commerce website, and so on) where the
     * card authorization happened.
     */
    @SerializedName("merchant")
    Merchant merchant;

    /** An array of third parties involved in the card authorization, when applicable. */
    @SerializedName("third_parties")
    List<Authorization.EnrichedMerchantData.ThirdParty> thirdParties;

    /**
     * For more details about Merchant, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Merchant extends StripeObject {
      @SerializedName("data_sources")
      List<String> dataSources;

      @SerializedName("industry")
      Industry industry;

      /** Location data of the seller. */
      @SerializedName("location")
      Location location;

      /** Image link to the seller's logo. */
      @SerializedName("logo")
      String logo;

      /** The name of the seller. */
      @SerializedName("name")
      String name;

      /** Phone number of the seller. */
      @SerializedName("phone")
      String phone;

      /** If {@code spade} is a data source, this hash contains details provided by Spade. */
      @SerializedName("spade")
      Spade spade;

      /** URL of the seller's website. */
      @SerializedName("url")
      String url;

      /**
       * For more details about Industry, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Industry extends StripeObject {
        /**
         * Most specific value of the seller's category.
         *
         * <p>One of {@code accessories}, {@code accounting_and_bookkeeping}, {@code acupuncture},
         * {@code administrative_services}, {@code adult_entertainment}, {@code adult_retail},
         * {@code advertising_and_marketing}, {@code advertising_technology}, {@code
         * agricultural_technology}, {@code agriculture_and_forestry}, {@code
         * airlines_and_aviation}, {@code alternative_medicine}, {@code alternative_rentals}, {@code
         * anesthesiologists}, {@code antiques}, {@code aquatic_transportation}, {@code
         * arcades_and_amusement_parks}, {@code art_dealers_and_galleries}, {@code
         * arts_and_hobbies}, {@code atms}, {@code auctions}, {@code auto_parts_and_supplies},
         * {@code auto_smog_checks}, {@code auto_tires}, {@code auto_transmission}, {@code
         * automotive_dealerships}, {@code automotive_retail}, {@code automotive_services}, {@code
         * bakeries}, {@code banking_and_finance}, {@code bars}, {@code beauty_spas_and_salons},
         * {@code beer_wine_and_spirits}, {@code benefits}, {@code bicycles}, {@code
         * billiards_and_pool}, {@code biotechnology}, {@code blood_banks_and_centers}, {@code
         * boat_dealers}, {@code bookstores}, {@code bowling}, {@code
         * breweries_distilleries_and_wineries}, {@code business_brokers_and_franchises}, {@code
         * business_services}, {@code butchers}, {@code buy_now_pay_later}, {@code cafes}, {@code
         * candy_shops}, {@code cannabis_dispensary}, {@code car_appraisers}, {@code
         * car_wash_and_detail}, {@code cardiologists}, {@code cards_and_stationery}, {@code
         * casinos_and_gambling}, {@code catering}, {@code charity}, {@code childcare}, {@code
         * children_s_clothing}, {@code children_s_retail}, {@code chiropractors}, {@code
         * circuses_and_carnivals}, {@code cleaning}, {@code clothing_and_accessories}, {@code
         * clothing_services}, {@code commercial_supplies}, {@code communication_software}, {@code
         * computers_and_electronics}, {@code construction_and_home_improvement}, {@code
         * construction_supplies}, {@code contractors}, {@code convenience_stores}, {@code
         * cosmetics}, {@code costumes}, {@code counseling_and_therapy}, {@code couriers}, {@code
         * coworking_spaces}, {@code creative}, {@code creative_software}, {@code credit_reporting},
         * {@code crm}, {@code crowdfunding}, {@code cryptocurrency}, {@code
         * dance_halls_and_saloons}, {@code delivery_services}, {@code dentists}, {@code
         * department_stores}, {@code dermatologists}, {@code design_technology}, {@code
         * developer_tools}, {@code digital_money_movement}, {@code discount_stores}, {@code
         * education}, {@code educational_technology}, {@code electric_vehicle_charging}, {@code
         * emergency_services}, {@code employment_services}, {@code enterprise_software}, {@code
         * entertainment}, {@code ents}, {@code environmental_technology}, {@code
         * equipment_rentals}, {@code events_and_event_planning}, {@code eyewear}, {@code
         * fairgrounds_and_rodeos}, {@code family_medicine}, {@code fast_food}, {@code fertility},
         * {@code financial_management_software}, {@code financial_planning_and_investments}, {@code
         * financial_technology}, {@code fishmongers}, {@code flea_markets}, {@code fleet}, {@code
         * florists}, {@code food_and_drink}, {@code food_delivery_services}, {@code food_trucks},
         * {@code fuel_dealers}, {@code funeral_services}, {@code furniture}, {@code gas_stations},
         * {@code gastroenterologists}, {@code general_goods}, {@code general_surgery}, {@code
         * gift_and_novelty}, {@code government}, {@code grocery_delivery_services}, {@code
         * gyms_health_and_fitness_centers}, {@code hair_removal}, {@code hair_salons_and_barbers},
         * {@code hardware}, {@code hardware_and_home_improvement}, {@code
         * hospitals_clinics_and_medical_centers}, {@code household_services}, {@code hr_platform},
         * {@code immigration}, {@code import_and_export}, {@code industrial_and_energy}, {@code
         * inflight_internet_and_entertainment}, {@code insurance}, {@code internal_medicine},
         * {@code internet}, {@code jewelry_and_watches}, {@code landmarks}, {@code
         * laundry_and_garment_services}, {@code lawn_and_garden}, {@code legal_services}, {@code
         * legal_technology}, {@code lending}, {@code lingerie}, {@code lodging}, {@code luggage},
         * {@code maintenance_and_repair}, {@code manicures_and_pedicures}, {@code manufacturing},
         * {@code marina}, {@code marine_supplies}, {@code marketing_software}, {@code
         * massage_clinics_and_therapists}, {@code media}, {@code medical_and_healthcare_services},
         * {@code medical_supplies_and_labs}, {@code men_s_clothing}, {@code
         * mental_health_professionals}, {@code mobile_applications}, {@code
         * motorcycle_moped_and_scooter_repair}, {@code museums}, {@code musical_instruments},
         * {@code neurologists}, {@code news_and_magazines}, {@code newsstands}, {@code
         * nutritionists}, {@code obstetricians_and_gynecologists}, {@code office_supplies}, {@code
         * oil_and_gas}, {@code oncologists}, {@code online_marketplace}, {@code ophthalmologists},
         * {@code optometrists}, {@code organizations}, {@code orthopedic_surgeons}, {@code other},
         * {@code outlets}, {@code packaging}, {@code paper}, {@code parking}, {@code
         * parks_and_outdoors}, {@code party_centers}, {@code pathologists}, {@code pawn_shops},
         * {@code pediatricians}, {@code pet_grooming}, {@code pet_services}, {@code pets}, {@code
         * pharmacies}, {@code photography}, {@code physical_therapy}, {@code piercings}, {@code
         * plastic_surgeons}, {@code podiatrists}, {@code pregnancy_and_sexual_health}, {@code
         * professional_services}, {@code property_management}, {@code psychiatrists}, {@code
         * psychics_and_astrologers}, {@code psychologists}, {@code public_services}, {@code
         * public_transportation}, {@code publishing_software}, {@code radiologists}, {@code rails},
         * {@code real_estate}, {@code recreation}, {@code religious}, {@code renewable_energy},
         * {@code respiratory}, {@code restaurants}, {@code retail}, {@code ride_shares}, {@code
         * sales_enablement_software}, {@code security_and_privacy}, {@code security_and_safety},
         * {@code services}, {@code shipping_and_freight}, {@code shoes}, {@code skin_care}, {@code
         * social_clubs}, {@code software}, {@code software_engineering}, {@code spas}, {@code
         * specialist_physicans}, {@code specialty_clothing_and_accessories}, {@code
         * specialty_foods}, {@code specialty_groceries}, {@code specialty_retail}, {@code
         * sporting_goods}, {@code storage}, {@code streaming_services}, {@code
         * supermarkets_and_grocery_stores}, {@code swimwear}, {@code tailors}, {@code
         * tanning_salons}, {@code tattoos}, {@code taxes}, {@code taxi_and_limousines}, {@code
         * technology}, {@code telecommunications}, {@code television}, {@code textiles}, {@code
         * theater_and_cinema}, {@code tickets_and_reservations}, {@code
         * tobacco_smoke_and_vape_shops}, {@code tolls_and_fees}, {@code
         * tourist_information_and_services}, {@code towing_and_roadside_assistance}, {@code
         * toy_stores}, {@code transportation}, {@code travel}, {@code travel_services}, {@code
         * travel_software}, {@code urologists}, {@code utilities}, {@code vehicle_rentals}, {@code
         * vending_machine}, {@code venues}, {@code veterinarians}, {@code video_games}, {@code
         * vintage_and_thrift}, {@code warehouses_and_wholesale_stores}, {@code
         * water_and_waste_management_services}, {@code web_infrastructure}, {@code
         * wedding_and_bridal}, {@code women_s_clothing}, or {@code zoos_and_aquariums}.
         */
        @SerializedName("id")
        String id;

        /** Increasingly specific textual representations of the seller's category. */
        @SerializedName("names")
        List<String> names;
      }

      /**
       * For more details about Location, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Location extends StripeObject {
        /** Address details of the seller. */
        @SerializedName("address")
        Address address;

        /** Coordinates of the seller. */
        @SerializedName("coordinates")
        Coordinates coordinates;

        /**
         * For more details about Address, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Address extends StripeObject {
          /** City, district, suburb, town, or village. */
          @SerializedName("city")
          String city;

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          String country;

          /** Address line 1, such as the street, PO Box, or company name. */
          @SerializedName("line1")
          String line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          String line2;

          /** ZIP or postal code. */
          @SerializedName("postal_code")
          String postalCode;

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          @SerializedName("state")
          String state;
        }

        /**
         * For more details about Coordinates, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Coordinates extends StripeObject {
          /** Latitude of the seller's location. */
          @SerializedName("latitude")
          BigDecimal latitude;

          /** Longitude of the seller's location. */
          @SerializedName("longitude")
          BigDecimal longitude;
        }
      }

      /**
       * For more details about Spade, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Spade extends StripeObject {
        /** Unified identifier for the seller. */
        @SerializedName("counterparty_id")
        String counterpartyId;

        /** Unified identifier for the seller's location. */
        @SerializedName("location_id")
        String locationId;
      }
    }

    /**
     * For more details about ThirdParty, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ThirdParty extends StripeObject {
      @SerializedName("data_sources")
      List<String> dataSources;

      /** Image link to the third party's logo. */
      @SerializedName("logo")
      String logo;

      /** Name of the third party. */
      @SerializedName("name")
      String name;

      /** If {@code spade} is a data source, this hash contains details provided by Spade. */
      @SerializedName("spade")
      Spade spade;

      /**
       * Category of the third party.
       *
       * <p>One of {@code buy_now_pay_later}, {@code delivery_service}, {@code marketplace}, {@code
       * other}, {@code payment_processor}, or {@code platform}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Spade, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Spade extends StripeObject {
        /** Unified identifier for the third party. */
        @SerializedName("third_party_id")
        String thirdPartyId;
      }
    }
  }

  /**
   * For more details about Fleet, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fleet extends StripeObject {
    /**
     * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary
     * depending on the configuration of your physical fleet cards. Typical points of sale support
     * only numeric entry.
     */
    @SerializedName("cardholder_prompt_data")
    CardholderPromptData cardholderPromptData;

    /**
     * The type of purchase.
     *
     * <p>One of {@code fuel_and_non_fuel_purchase}, {@code fuel_purchase}, or {@code
     * non_fuel_purchase}.
     */
    @SerializedName("purchase_type")
    String purchaseType;

    /**
     * More information about the total amount. Typically this information is received from the
     * merchant after the authorization has been approved and the fuel dispensed. This information
     * is not guaranteed to be accurate as some merchants may provide unreliable data.
     */
    @SerializedName("reported_breakdown")
    ReportedBreakdown reportedBreakdown;

    /**
     * The type of fuel service.
     *
     * <p>One of {@code full_service}, {@code non_fuel_transaction}, or {@code self_service}.
     */
    @SerializedName("service_type")
    String serviceType;

    /**
     * For more details about CardholderPromptData, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardholderPromptData extends StripeObject {
      /**
       * [Deprecated] An alphanumeric ID, though typical point of sales only support numeric entry.
       * The card program can be configured to prompt for a vehicle ID, driver ID, or generic ID.
       */
      @SerializedName("alphanumeric_id")
      @Deprecated
      String alphanumericId;

      /** Driver ID. */
      @SerializedName("driver_id")
      String driverId;

      /** Odometer reading. */
      @SerializedName("odometer")
      Long odometer;

      /**
       * An alphanumeric ID. This field is used when a vehicle ID, driver ID, or generic ID is
       * entered by the cardholder, but the merchant or card network did not specify the prompt
       * type.
       */
      @SerializedName("unspecified_id")
      String unspecifiedId;

      /** User ID. */
      @SerializedName("user_id")
      String userId;

      /** Vehicle number. */
      @SerializedName("vehicle_number")
      String vehicleNumber;
    }

    /**
     * For more details about ReportedBreakdown, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ReportedBreakdown extends StripeObject {
      /** Breakdown of fuel portion of the purchase. */
      @SerializedName("fuel")
      Fuel fuel;

      /** Breakdown of non-fuel portion of the purchase. */
      @SerializedName("non_fuel")
      NonFuel nonFuel;

      /** Information about tax included in this transaction. */
      @SerializedName("tax")
      Tax tax;

      /**
       * For more details about Fuel, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Fuel extends StripeObject {
        /**
         * Gross fuel amount that should equal Fuel Quantity multiplied by Fuel Unit Cost, inclusive
         * of taxes.
         */
        @SerializedName("gross_amount_decimal")
        BigDecimal grossAmountDecimal;
      }

      /**
       * For more details about NonFuel, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NonFuel extends StripeObject {
        /**
         * Gross non-fuel amount that should equal the sum of the line items, inclusive of taxes.
         */
        @SerializedName("gross_amount_decimal")
        BigDecimal grossAmountDecimal;
      }

      /**
       * For more details about Tax, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax extends StripeObject {
        /**
         * Amount of state or provincial Sales Tax included in the transaction amount. {@code null}
         * if not reported by merchant or not subject to tax.
         */
        @SerializedName("local_amount_decimal")
        BigDecimal localAmountDecimal;

        /**
         * Amount of national Sales Tax or VAT included in the transaction amount. {@code null} if
         * not reported by merchant or not subject to tax.
         */
        @SerializedName("national_amount_decimal")
        BigDecimal nationalAmountDecimal;
      }
    }
  }

  /**
   * For more details about FraudChallenge, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FraudChallenge extends StripeObject {
    /**
     * The method by which the fraud challenge was delivered to the cardholder.
     *
     * <p>Equal to {@code sms}.
     */
    @SerializedName("channel")
    String channel;

    /**
     * The status of the fraud challenge.
     *
     * <p>One of {@code expired}, {@code pending}, {@code rejected}, {@code undeliverable}, or
     * {@code verified}.
     */
    @SerializedName("status")
    String status;

    /**
     * If the challenge is not deliverable, the reason why.
     *
     * <p>One of {@code no_phone_number}, or {@code unsupported_phone_number}.
     */
    @SerializedName("undeliverable_reason")
    String undeliverableReason;
  }

  /**
   * For more details about Fuel, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fuel extends StripeObject {
    /**
     * <a href="https://www.conexxus.org/conexxus-payment-system-product-codes">Conexxus Payment
     * System Product Code</a> identifying the primary fuel product purchased.
     */
    @SerializedName("industry_product_code")
    String industryProductCode;

    /**
     * The quantity of {@code unit}s of fuel that was dispensed, represented as a decimal string
     * with at most 12 decimal places.
     */
    @SerializedName("quantity_decimal")
    BigDecimal quantityDecimal;

    /**
     * The type of fuel that was purchased.
     *
     * <p>One of {@code diesel}, {@code other}, {@code unleaded_plus}, {@code unleaded_regular}, or
     * {@code unleaded_super}.
     */
    @SerializedName("type")
    String type;

    /**
     * The units for {@code quantity_decimal}.
     *
     * <p>One of {@code charging_minute}, {@code imperial_gallon}, {@code kilogram}, {@code
     * kilowatt_hour}, {@code liter}, {@code other}, {@code pound}, or {@code us_gallon}.
     */
    @SerializedName("unit")
    String unit;

    /**
     * The cost in cents per each unit of fuel, represented as a decimal string with at most 12
     * decimal places.
     */
    @SerializedName("unit_cost_decimal")
    BigDecimal unitCostDecimal;
  }

  /**
   * For more details about MerchantData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantData extends StripeObject {
    /**
     * A categorization of the seller's type of business. See our <a
     * href="https://docs.stripe.com/issuing/merchant-categories">merchant categories guide</a> for
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

    /**
     * The identifier of the payment facilitator (PayFac) that processed this authorization, as
     * assigned by the card network. Null when the transaction was not processed through a PayFac.
     */
    @SerializedName("payment_facilitator_id")
    String paymentFacilitatorId;

    /** Postal code where the seller is located. */
    @SerializedName("postal_code")
    String postalCode;

    /** State where the seller is located. */
    @SerializedName("state")
    String state;

    /**
     * The identifier of the sub-merchant involved in this authorization, as assigned by the payment
     * facilitator. Null when the transaction was not processed through a PayFac or when no
     * sub-merchant ID was provided.
     */
    @SerializedName("sub_merchant_id")
    String subMerchantId;

    /** The seller's tax identification number. Currently populated for French merchants only. */
    @SerializedName("tax_id")
    String taxId;

    /** An ID assigned by the seller to the location of the sale. */
    @SerializedName("terminal_id")
    String terminalId;

    /** URL provided by the merchant on a 3DS request. */
    @SerializedName("url")
    String url;
  }

  /**
   * For more details about NetworkData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkData extends StripeObject {
    /** Country code of the acquirer assigned by the card network. */
    @SerializedName("acquiring_institution_country")
    String acquiringInstitutionCountry;

    /**
     * Identifier assigned to the acquirer by the card network. Sometimes this value is not provided
     * by the network; in this case, the value will be {@code null}.
     */
    @SerializedName("acquiring_institution_id")
    String acquiringInstitutionId;

    /** Identifier assigned by the acquirer to track all messages related to this transaction. */
    @SerializedName("retrieval_reference_number")
    String retrievalReferenceNumber;

    /**
     * The System Trace Audit Number (STAN) is a 6-digit identifier assigned by the acquirer. Prefer
     * {@code network_data.transaction_id} if present, unless you have special requirements.
     */
    @SerializedName("system_trace_audit_number")
    String systemTraceAuditNumber;

    /**
     * Unique identifier for the authorization assigned by the card network used to match subsequent
     * messages, disputes, and transactions.
     */
    @SerializedName("transaction_id")
    String transactionId;
  }

  /**
   * For more details about PendingRequest, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PendingRequest extends StripeObject {
    /**
     * The additional amount Stripe will hold if the authorization is approved, in the card's <a
     * href="https://docs.stripe.com/api#issuing_authorization_object-pending-request-currency">currency</a>
     * and in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency
     * unit</a>.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Detailed breakdown of amount components. These amounts are denominated in {@code currency}
     * and in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency
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
     * href="https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount">amount</a>
     * to control how much to hold for the authorization.
     */
    @SerializedName("is_amount_controllable")
    Boolean isAmountControllable;

    /**
     * The amount the merchant is requesting to be authorized in the {@code merchant_currency}. The
     * amount is in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency
     * unit</a>.
     */
    @SerializedName("merchant_amount")
    Long merchantAmount;

    /** The local currency the merchant is requesting to authorize. */
    @SerializedName("merchant_currency")
    String merchantCurrency;

    /**
     * The card network's estimate of the likelihood that an authorization is fraudulent. Takes on
     * values between 1 and 99.
     */
    @SerializedName("network_risk_score")
    Long networkRiskScore;

    /**
     * For more details about AmountDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountDetails extends StripeObject {
      /** The fee charged by the ATM for the cash withdrawal. */
      @SerializedName("atm_fee")
      Long atmFee;

      /** The amount of cash requested by the cardholder. */
      @SerializedName("cashback_amount")
      Long cashbackAmount;
    }
  }

  /**
   * For more details about Redaction, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Redaction extends StripeObject {
    /**
     * Indicates whether this object and its related objects have been redacted or not.
     *
     * <p>One of {@code processing}, {@code redacted}, or {@code validated}.
     */
    @SerializedName("status")
    String status;
  }

  /**
   * For more details about RequestHistory, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RequestHistory extends StripeObject {
    /**
     * The {@code pending_request.amount} at the time of the request, presented in your card's
     * currency and in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest
     * currency unit</a>. Stripe held this amount from your account to fund the authorization if the
     * request was approved.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Detailed breakdown of amount components. These amounts are denominated in {@code currency}
     * and in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency
     * unit</a>.
     */
    @SerializedName("amount_details")
    AmountDetails amountDetails;

    /** Whether this request was approved. */
    @SerializedName("approved")
    Boolean approved;

    /**
     * A code created by Stripe which is shared with the merchant to validate the authorization.
     * This field will be populated if the authorization message was approved. The code typically
     * starts with the letter &quot;S&quot;, followed by a six-digit number. For example,
     * &quot;S498162&quot;. Please note that the code is not guaranteed to be unique across
     * authorizations.
     */
    @SerializedName("authorization_code")
    String authorizationCode;

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
     * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
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

    /** Details about the authorization request, such as identifiers, set by the card network. */
    @SerializedName("network_data")
    NetworkData networkData;

    /**
     * The card network's estimate of the likelihood that an authorization is fraudulent. Takes on
     * values between 1 and 99.
     */
    @SerializedName("network_risk_score")
    Long networkRiskScore;

    /**
     * When an authorization is approved or declined by you or by Stripe, this field provides
     * additional detail on the reason for the outcome.
     *
     * <p>One of {@code account_disabled}, {@code card_active}, {@code card_canceled}, {@code
     * card_expired}, {@code card_inactive}, {@code cardholder_blocked}, {@code
     * cardholder_inactive}, {@code cardholder_verification_required}, {@code
     * insecure_authorization_method}, {@code insufficient_funds}, {@code network_fallback}, {@code
     * not_allowed}, {@code pin_blocked}, {@code spending_controls}, {@code stripe_internal_error},
     * {@code suspected_fraud}, {@code verification_failed}, {@code webhook_approved}, {@code
     * webhook_declined}, {@code webhook_error}, or {@code webhook_timeout}.
     */
    @SerializedName("reason")
    String reason;

    /**
     * If the {@code request_history.reason} is {@code webhook_error} because the direct webhook
     * response is invalid (for example, parsing errors or missing parameters), we surface a more
     * detailed error message via this field.
     */
    @SerializedName("reason_message")
    String reasonMessage;

    /**
     * Time when the card network received an authorization request from the acquirer in UTC.
     * Referred to by networks as transmission time.
     */
    @SerializedName("requested_at")
    Long requestedAt;

    /**
     * For more details about AmountDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountDetails extends StripeObject {
      /** The fee charged by the ATM for the cash withdrawal. */
      @SerializedName("atm_fee")
      Long atmFee;

      /** The amount of cash requested by the cardholder. */
      @SerializedName("cashback_amount")
      Long cashbackAmount;
    }

    /**
     * For more details about NetworkData, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NetworkData extends StripeObject {
      /** Mastercard identifier for each authorization request. */
      @SerializedName("trace_id")
      TraceId traceId;

      /**
       * For more details about TraceId, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class TraceId extends StripeObject {
        /**
         * The unique reference number within the specified financial network on the specified
         * network date.
         */
        @SerializedName("banknet_reference_number")
        String banknetReferenceNumber;

        /** The identifier of the program or service. */
        @SerializedName("financial_network_code")
        String financialNetworkCode;

        /** The card network's record date for this authorization. */
        @SerializedName("network_date")
        String networkDate;
      }
    }
  }

  /**
   * For more details about TerminalData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TerminalData extends StripeObject {
    /**
     * The method used to confirm the cardholder's identity.
     *
     * <p>One of {@code failed}, {@code none}, {@code pin}, {@code pin_and_signature}, {@code
     * signature}, or {@code unknown}.
     */
    @SerializedName("cardholder_verification_result")
    String cardholderVerificationResult;
  }

  /**
   * For more details about TokenDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TokenDetails extends StripeObject {
    /** The card associated with this token. */
    @SerializedName("card")
    String card;

    /** Time at which the object was created. Measured in seconds since the Unix epoch. */
    @SerializedName("created")
    Long created;

    /** The hashed ID derived from the device ID from the card network associated with the token. */
    @SerializedName("device_fingerprint")
    String deviceFingerprint;

    @SerializedName("network_data")
    NetworkData networkData;

    /**
     * The decision made during token provisioning.
     *
     * <p>One of {@code approve}, {@code approve_pending_id_and_v}, or {@code decline}.
     */
    @SerializedName("provisioning_decision")
    String provisioningDecision;

    /**
     * The type of the token, indicating how it is used.
     *
     * <p>One of {@code card_on_file}, {@code cloud_based}, {@code commerce_platform}, {@code
     * commercial_virtual_account}, {@code secure_element}, or {@code static_credential}.
     */
    @SerializedName("token_type")
    String tokenType;

    /**
     * For more details about NetworkData, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NetworkData extends StripeObject {
      @SerializedName("device")
      Device device;

      @SerializedName("mastercard")
      Mastercard mastercard;

      /**
       * The card network for this token.
       *
       * <p>One of {@code mastercard}, or {@code visa}.
       */
      @SerializedName("type")
      String type;

      @SerializedName("visa")
      Visa visa;

      @SerializedName("wallet_provider")
      WalletProvider walletProvider;

      /**
       * For more details about Device, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Device extends StripeObject {
        /** An identifier for the device used during wallet provisioning. */
        @SerializedName("device_id")
        String deviceId;

        /** The IP address of the device at provisioning time. */
        @SerializedName("ip_address")
        String ipAddress;

        /**
         * The ISO 639-1 language code of the device associated with the tokenization request.
         *
         * <p>One of {@code aa}, {@code ab}, {@code ae}, {@code af}, {@code ak}, {@code am}, {@code
         * an}, {@code ar}, {@code as}, {@code av}, {@code ay}, {@code az}, {@code ba}, {@code be},
         * {@code bg}, {@code bi}, {@code bm}, {@code bn}, {@code bo}, {@code br}, {@code bs},
         * {@code ca}, {@code ce}, {@code ch}, {@code co}, {@code cr}, {@code cs}, {@code cu},
         * {@code cv}, {@code cy}, {@code da}, {@code de}, {@code dv}, {@code dz}, {@code ee},
         * {@code el}, {@code en}, {@code eo}, {@code es}, {@code et}, {@code eu}, {@code fa},
         * {@code ff}, {@code fi}, {@code fj}, {@code fo}, {@code fr}, {@code fy}, {@code ga},
         * {@code gd}, {@code gl}, {@code gn}, {@code gu}, {@code gv}, {@code ha}, {@code he},
         * {@code hi}, {@code ho}, {@code hr}, {@code ht}, {@code hu}, {@code hy}, {@code hz},
         * {@code ia}, {@code id}, {@code ie}, {@code ig}, {@code ii}, {@code ik}, {@code io},
         * {@code is}, {@code it}, {@code iu}, {@code ja}, {@code jv}, {@code ka}, {@code kg},
         * {@code ki}, {@code kj}, {@code kk}, {@code kl}, {@code km}, {@code kn}, {@code ko},
         * {@code kr}, {@code ks}, {@code ku}, {@code kv}, {@code kw}, {@code ky}, {@code la},
         * {@code lb}, {@code lg}, {@code li}, {@code ln}, {@code lo}, {@code lt}, {@code lu},
         * {@code lv}, {@code mg}, {@code mh}, {@code mi}, {@code mk}, {@code ml}, {@code mn},
         * {@code mr}, {@code ms}, {@code mt}, {@code my}, {@code na}, {@code nb}, {@code nd},
         * {@code ne}, {@code ng}, {@code nl}, {@code nn}, {@code no}, {@code nr}, {@code nv},
         * {@code ny}, {@code oc}, {@code oj}, {@code om}, {@code or}, {@code os}, {@code pa},
         * {@code pi}, {@code pl}, {@code ps}, {@code pt}, {@code qu}, {@code rm}, {@code rn},
         * {@code ro}, {@code ru}, {@code rw}, {@code sa}, {@code sc}, {@code sd}, {@code se},
         * {@code sg}, {@code si}, {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so},
         * {@code sq}, {@code sr}, {@code ss}, {@code st}, {@code su}, {@code sv}, {@code sw},
         * {@code ta}, {@code te}, {@code tg}, {@code th}, {@code ti}, {@code tk}, {@code tl},
         * {@code tn}, {@code to}, {@code tr}, {@code ts}, {@code tt}, {@code tw}, {@code ty},
         * {@code ug}, {@code uk}, {@code ur}, {@code uz}, {@code ve}, {@code vi}, {@code vo},
         * {@code wa}, {@code wo}, {@code xh}, {@code yi}, {@code yo}, {@code za}, {@code zh}, or
         * {@code zu}.
         */
        @SerializedName("language")
        String language;

        /** The phone number of the device used for tokenization. */
        @SerializedName("phone_number")
        String phoneNumber;
      }

      /**
       * For more details about Mastercard, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Mastercard extends StripeObject {
        /** A unique reference ID from the network to represent the card account number. */
        @SerializedName("card_reference_id")
        String cardReferenceId;

        /** The network-unique identifier for the token. */
        @SerializedName("token_reference_id")
        String tokenReferenceId;

        /** The ID of the entity requesting tokenization. */
        @SerializedName("token_requestor_id")
        String tokenRequestorId;
      }

      /**
       * For more details about Visa, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Visa extends StripeObject {
        /** A unique reference ID from the network to represent the card account number. */
        @SerializedName("card_reference_id")
        String cardReferenceId;

        /**
         * The network's recommendation to Stripe for this token activation request.
         *
         * <p>One of {@code approve}, {@code decline}, or {@code recommend_id_and_v}.
         */
        @SerializedName("token_decision_recommendation")
        String tokenDecisionRecommendation;

        /** The network-unique identifier for the token. */
        @SerializedName("token_reference_id")
        String tokenReferenceId;

        /** The ID of the entity requesting tokenization. */
        @SerializedName("token_requestor_id")
        String tokenRequestorId;

        /**
         * Degree of risk associated with the token between {@code 01} and {@code 99}, with higher
         * number indicating higher risk. A {@code 00} value indicates the token was not scored by
         * Visa.
         */
        @SerializedName("token_risk_score")
        String tokenRiskScore;
      }

      /**
       * For more details about WalletProvider, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class WalletProvider extends StripeObject {
        /**
         * An evaluation on the trustworthiness of the wallet account between 1 and 5. A higher
         * score indicates more trustworthy.
         */
        @SerializedName("account_trust_score")
        Long accountTrustScore;

        /**
         * The method used for tokenizing a card.
         *
         * <p>One of {@code app}, {@code manual}, {@code on_file}, or {@code other}.
         */
        @SerializedName("card_number_source")
        String cardNumberSource;

        /**
         * An evaluation on the trustworthiness of the device. A higher score indicates more
         * trustworthy.
         */
        @SerializedName("device_trust_score")
        Long deviceTrustScore;

        /** The reasons for suggested tokenization given by the card network. */
        @SerializedName("reason_codes")
        List<String> reasonCodes;

        /**
         * The recommendation on responding to the tokenization request.
         *
         * <p>One of {@code approve}, {@code decline}, or {@code require_auth}.
         */
        @SerializedName("suggested_decision")
        String suggestedDecision;
      }
    }
  }

  /**
   * For more details about Treasury, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Treasury extends StripeObject {
    /**
     * The array of <a
     * href="https://docs.stripe.com/api/treasury/received_credits">ReceivedCredits</a> associated
     * with this authorization
     */
    @SerializedName("received_credits")
    List<String> receivedCredits;

    /**
     * The array of <a
     * href="https://docs.stripe.com/api/treasury/received_debits">ReceivedDebits</a> associated
     * with this authorization
     */
    @SerializedName("received_debits")
    List<String> receivedDebits;

    /**
     * The Treasury <a href="https://docs.stripe.com/api/treasury/transactions">Transaction</a>
     * associated with this authorization
     */
    @SerializedName("transaction")
    String transaction;
  }

  /**
   * For more details about VerificationData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
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

    /** The exemption applied to this authorization. */
    @SerializedName("authentication_exemption")
    AuthenticationExemption authenticationExemption;

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

    /** The postal code submitted as part of the authorization used for postal code verification. */
    @SerializedName("postal_code")
    String postalCode;

    /** 3D Secure details. */
    @SerializedName("three_d_secure")
    ThreeDSecure threeDSecure;

    /**
     * For more details about AuthenticationExemption, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuthenticationExemption extends StripeObject {
      /**
       * The entity that requested the exemption, either the acquiring merchant or the Issuing user.
       *
       * <p>One of {@code acquirer}, or {@code issuer}.
       */
      @SerializedName("claimed_by")
      String claimedBy;

      /**
       * The specific exemption claimed for this authorization.
       *
       * <p>One of {@code low_value_transaction}, {@code transaction_risk_analysis}, or {@code
       * unknown}.
       */
      @SerializedName("type")
      String type;
    }

    /**
     * For more details about ThreeDSecure, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ThreeDSecure extends StripeObject {
      /**
       * The outcome of the 3D Secure authentication request.
       *
       * <p>One of {@code attempt_acknowledged}, {@code authenticated}, {@code failed}, or {@code
       * required}.
       */
      @SerializedName("result")
      String result;
    }
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final Authorization resource;

    private TestHelpers(Authorization resource) {
      this.resource = resource;
    }

    /** Create a test-mode authorization. */
    public static Authorization create(Map<String, Object> params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /** Create a test-mode authorization. */
    public static Authorization create(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/issuing/authorizations";
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return getGlobalResponseGetter().request(request, Authorization.class);
    }

    /** Create a test-mode authorization. */
    public static Authorization create(AuthorizationCreateParams params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /** Create a test-mode authorization. */
    public static Authorization create(AuthorizationCreateParams params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/issuing/authorizations";
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return getGlobalResponseGetter().request(request, Authorization.class);
    }

    /** Capture a test-mode authorization. */
    public Authorization capture() throws StripeException {
      return capture((Map<String, Object>) null, (RequestOptions) null);
    }

    /** Capture a test-mode authorization. */
    public Authorization capture(RequestOptions options) throws StripeException {
      return capture((Map<String, Object>) null, options);
    }

    /** Capture a test-mode authorization. */
    public Authorization capture(Map<String, Object> params) throws StripeException {
      return capture(params, (RequestOptions) null);
    }

    /** Capture a test-mode authorization. */
    public Authorization capture(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/capture",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /** Capture a test-mode authorization. */
    public Authorization capture(AuthorizationCaptureParams params) throws StripeException {
      return capture(params, (RequestOptions) null);
    }

    /** Capture a test-mode authorization. */
    public Authorization capture(AuthorizationCaptureParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/capture",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /** Expire a test-mode Authorization. */
    public Authorization expire() throws StripeException {
      return expire((Map<String, Object>) null, (RequestOptions) null);
    }

    /** Expire a test-mode Authorization. */
    public Authorization expire(RequestOptions options) throws StripeException {
      return expire((Map<String, Object>) null, options);
    }

    /** Expire a test-mode Authorization. */
    public Authorization expire(Map<String, Object> params) throws StripeException {
      return expire(params, (RequestOptions) null);
    }

    /** Expire a test-mode Authorization. */
    public Authorization expire(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/expire",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /** Expire a test-mode Authorization. */
    public Authorization expire(AuthorizationExpireParams params) throws StripeException {
      return expire(params, (RequestOptions) null);
    }

    /** Expire a test-mode Authorization. */
    public Authorization expire(AuthorizationExpireParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/expire",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /**
     * Finalize the amount on an Authorization prior to capture, when the initial authorization was
     * for an estimated amount.
     */
    public Authorization finalizeAmount(Map<String, Object> params) throws StripeException {
      return finalizeAmount(params, (RequestOptions) null);
    }

    /**
     * Finalize the amount on an Authorization prior to capture, when the initial authorization was
     * for an estimated amount.
     */
    public Authorization finalizeAmount(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/finalize_amount",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /**
     * Finalize the amount on an Authorization prior to capture, when the initial authorization was
     * for an estimated amount.
     */
    public Authorization finalizeAmount(AuthorizationFinalizeAmountParams params)
        throws StripeException {
      return finalizeAmount(params, (RequestOptions) null);
    }

    /**
     * Finalize the amount on an Authorization prior to capture, when the initial authorization was
     * for an estimated amount.
     */
    public Authorization finalizeAmount(
        AuthorizationFinalizeAmountParams params, RequestOptions options) throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/finalize_amount",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /**
     * Respond to a fraud challenge on a testmode Issuing authorization, simulating either a
     * confirmation of fraud or a correction of legitimacy.
     */
    public Authorization respond(Map<String, Object> params) throws StripeException {
      return respond(params, (RequestOptions) null);
    }

    /**
     * Respond to a fraud challenge on a testmode Issuing authorization, simulating either a
     * confirmation of fraud or a correction of legitimacy.
     */
    public Authorization respond(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/fraud_challenges/respond",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /**
     * Respond to a fraud challenge on a testmode Issuing authorization, simulating either a
     * confirmation of fraud or a correction of legitimacy.
     */
    public Authorization respond(AuthorizationRespondParams params) throws StripeException {
      return respond(params, (RequestOptions) null);
    }

    /**
     * Respond to a fraud challenge on a testmode Issuing authorization, simulating either a
     * confirmation of fraud or a correction of legitimacy.
     */
    public Authorization respond(AuthorizationRespondParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/fraud_challenges/respond",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /** Increment a test-mode Authorization. */
    public Authorization increment(Map<String, Object> params) throws StripeException {
      return increment(params, (RequestOptions) null);
    }

    /** Increment a test-mode Authorization. */
    public Authorization increment(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/increment",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /** Increment a test-mode Authorization. */
    public Authorization increment(AuthorizationIncrementParams params) throws StripeException {
      return increment(params, (RequestOptions) null);
    }

    /** Increment a test-mode Authorization. */
    public Authorization increment(AuthorizationIncrementParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/increment",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /** Reverse a test-mode Authorization. */
    public Authorization reverse() throws StripeException {
      return reverse((Map<String, Object>) null, (RequestOptions) null);
    }

    /** Reverse a test-mode Authorization. */
    public Authorization reverse(RequestOptions options) throws StripeException {
      return reverse((Map<String, Object>) null, options);
    }

    /** Reverse a test-mode Authorization. */
    public Authorization reverse(Map<String, Object> params) throws StripeException {
      return reverse(params, (RequestOptions) null);
    }

    /** Reverse a test-mode Authorization. */
    public Authorization reverse(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/reverse",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }

    /** Reverse a test-mode Authorization. */
    public Authorization reverse(AuthorizationReverseParams params) throws StripeException {
      return reverse(params, (RequestOptions) null);
    }

    /** Reverse a test-mode Authorization. */
    public Authorization reverse(AuthorizationReverseParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/authorizations/%s/reverse",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, Authorization.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(amountDetails, responseGetter);
    trySetResponseGetter(balanceResponse, responseGetter);
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(cardholder, responseGetter);
    trySetResponseGetter(enrichedMerchantData, responseGetter);
    trySetResponseGetter(fleet, responseGetter);
    trySetResponseGetter(fuel, responseGetter);
    trySetResponseGetter(merchantData, responseGetter);
    trySetResponseGetter(networkData, responseGetter);
    trySetResponseGetter(pendingRequest, responseGetter);
    trySetResponseGetter(redaction, responseGetter);
    trySetResponseGetter(terminalData, responseGetter);
    trySetResponseGetter(token, responseGetter);
    trySetResponseGetter(tokenDetails, responseGetter);
    trySetResponseGetter(treasury, responseGetter);
    trySetResponseGetter(verificationData, responseGetter);
  }
}
