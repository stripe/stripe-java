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
   * The total amount that was authorized or rejected. This amount is in {@code currency} and in the
   * <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>. {@code
   * amount} should be the same as {@code merchant_amount}, unless {@code currency} and {@code
   * merchant_currency} are different.
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
   * You can <a href="https://stripe.com/docs/issuing">create physical or virtual cards</a> that are
   * issued to cardholders.
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
   * The currency of the cardholder. This currency can be different from the currency presented at
   * authorization and the {@code merchant_currency} field on this authorization. Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Fleet-specific information for authorizations using Fleet cards. */
  @SerializedName("fleet")
  Fleet fleet;

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
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
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
   * <a href="https://stripe.com/docs/api/issuing/tokens/object">Token</a> object used for this
   * authorization. If a network token was not used for this authorization, this field will be null.
   */
  @SerializedName("token")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Token> token;

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
    /**
     * Identifier assigned to the acquirer by the card network. Sometimes this value is not provided
     * by the network; in this case, the value will be {@code null}.
     */
    @SerializedName("acquiring_institution_id")
    String acquiringInstitutionId;

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
   * For more details about RequestHistory, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
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
     * insecure_authorization_method}, {@code insufficient_funds}, {@code not_allowed}, {@code
     * pin_blocked}, {@code spending_controls}, {@code suspected_fraud}, {@code
     * verification_failed}, {@code webhook_approved}, {@code webhook_declined}, {@code
     * webhook_error}, or {@code webhook_timeout}.
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
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(cardholder, responseGetter);
    trySetResponseGetter(fleet, responseGetter);
    trySetResponseGetter(fuel, responseGetter);
    trySetResponseGetter(merchantData, responseGetter);
    trySetResponseGetter(networkData, responseGetter);
    trySetResponseGetter(pendingRequest, responseGetter);
    trySetResponseGetter(token, responseGetter);
    trySetResponseGetter(treasury, responseGetter);
    trySetResponseGetter(verificationData, responseGetter);
  }
}
