// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PayoutCancelParams;
import com.stripe.param.PayoutCreateParams;
import com.stripe.param.PayoutListParams;
import com.stripe.param.PayoutRetrieveParams;
import com.stripe.param.PayoutReverseParams;
import com.stripe.param.PayoutUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A {@code Payout} object is created when you receive funds from Stripe, or when you initiate a
 * payout to either a bank account or debit card of a <a
 * href="https://stripe.com/docs/connect/bank-debit-card-payouts">connected Stripe account</a>. You
 * can retrieve individual payouts, and list all payouts. Payouts are made on <a
 * href="https://stripe.com/docs/connect/manage-payout-schedule">varying schedules</a>, depending on
 * your country and industry.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/payouts">Receiving payouts</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Payout extends ApiResource implements MetadataStore<Payout>, BalanceTransactionSource {
  /**
   * The amount (in cents (or local equivalent)) that transfers to your bank account or debit card.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The application fee (if any) for the payout. <a
   * href="https://stripe.com/docs/connect/instant-payouts#monetization-and-fees">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("application_fee")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<ApplicationFee> applicationFee;

  /**
   * The amount of the application fee (if any) requested for the payout. <a
   * href="https://stripe.com/docs/connect/instant-payouts#monetization-and-fees">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Date that you can expect the payout to arrive in the bank. This factors in delays to account
   * for weekends or bank holidays.
   */
  @SerializedName("arrival_date")
  Long arrivalDate;

  /**
   * Returns {@code true} if the payout is created by an <a
   * href="https://stripe.com/docs/payouts#payout-schedule">automated payout schedule</a> and {@code
   * false} if it's <a href="https://stripe.com/docs/payouts#manual-payouts">requested manually</a>.
   */
  @SerializedName("automatic")
  Boolean automatic;

  /**
   * ID of the balance transaction that describes the impact of this payout on your account balance.
   */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** ID of the bank account or card the payout is sent to. */
  @SerializedName("destination")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<ExternalAccount> destination;

  /**
   * If the payout fails or cancels, this is the ID of the balance transaction that reverses the
   * initial balance transaction and returns the funds from the failed payout back in your balance.
   */
  @SerializedName("failure_balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> failureBalanceTransaction;

  /**
   * Error code that provides a reason for a payout failure, if available. View our <a
   * href="https://stripe.com/docs/api#payout_failures">list of failure codes</a>.
   */
  @SerializedName("failure_code")
  String failureCode;

  /** Message that provides the reason for a payout failure, if available. */
  @SerializedName("failure_message")
  String failureMessage;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The method used to send this payout, which can be {@code standard} or {@code instant}. {@code
   * instant} is supported for payouts to debit cards and bank accounts in certain countries. Learn
   * more about <a href="https://stripe.com/docs/payouts/instant-payouts-banks">bank support for
   * Instant Payouts</a>.
   */
  @SerializedName("method")
  String method;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payout}.
   */
  @SerializedName("object")
  String object;

  /** If the payout reverses another, this is the ID of the original payout. */
  @SerializedName("original_payout")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Payout> originalPayout;

  /**
   * If {@code completed}, you can use the <a
   * href="https://stripe.com/docs/api/balance_transactions/list#balance_transaction_list-payout">Balance
   * Transactions API</a> to list all balance transactions that are paid out in this payout.
   *
   * <p>One of {@code completed}, {@code in_progress}, or {@code not_applicable}.
   */
  @SerializedName("reconciliation_status")
  String reconciliationStatus;

  /** If the payout reverses, this is the ID of the payout that reverses this payout. */
  @SerializedName("reversed_by")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Payout> reversedBy;

  /**
   * The source balance this payout came from, which can be one of the following: {@code card},
   * {@code fpx}, or {@code bank_account}.
   */
  @SerializedName("source_type")
  String sourceType;

  /** Extra information about a payout that displays on the user's bank statement. */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Current status of the payout: {@code paid}, {@code pending}, {@code in_transit}, {@code
   * canceled} or {@code failed}. A payout is {@code pending} until it's submitted to the bank, when
   * it becomes {@code in_transit}. The status changes to {@code paid} if the transaction succeeds,
   * or to {@code failed} or {@code canceled} (within 5 business days). Some payouts that fail might
   * initially show as {@code paid}, then change to {@code failed}.
   */
  @SerializedName("status")
  String status;

  /** Can be {@code bank_account} or {@code card}. */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code applicationFee} object. */
  public String getApplicationFee() {
    return (this.applicationFee != null) ? this.applicationFee.getId() : null;
  }

  public void setApplicationFee(String id) {
    this.applicationFee = ApiResource.setExpandableFieldId(id, this.applicationFee);
  }

  /** Get expanded {@code applicationFee}. */
  public ApplicationFee getApplicationFeeObject() {
    return (this.applicationFee != null) ? this.applicationFee.getExpanded() : null;
  }

  public void setApplicationFeeObject(ApplicationFee expandableObject) {
    this.applicationFee =
        new ExpandableField<ApplicationFee>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code balanceTransaction} object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded {@code balanceTransaction}. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code destination} object. */
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String id) {
    this.destination = ApiResource.setExpandableFieldId(id, this.destination);
  }

  /** Get expanded {@code destination}. */
  public ExternalAccount getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(ExternalAccount expandableObject) {
    this.destination =
        new ExpandableField<ExternalAccount>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code failureBalanceTransaction} object. */
  public String getFailureBalanceTransaction() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getId() : null;
  }

  public void setFailureBalanceTransaction(String id) {
    this.failureBalanceTransaction =
        ApiResource.setExpandableFieldId(id, this.failureBalanceTransaction);
  }

  /** Get expanded {@code failureBalanceTransaction}. */
  public BalanceTransaction getFailureBalanceTransactionObject() {
    return (this.failureBalanceTransaction != null)
        ? this.failureBalanceTransaction.getExpanded()
        : null;
  }

  public void setFailureBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.failureBalanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code originalPayout} object. */
  public String getOriginalPayout() {
    return (this.originalPayout != null) ? this.originalPayout.getId() : null;
  }

  public void setOriginalPayout(String id) {
    this.originalPayout = ApiResource.setExpandableFieldId(id, this.originalPayout);
  }

  /** Get expanded {@code originalPayout}. */
  public Payout getOriginalPayoutObject() {
    return (this.originalPayout != null) ? this.originalPayout.getExpanded() : null;
  }

  public void setOriginalPayoutObject(Payout expandableObject) {
    this.originalPayout = new ExpandableField<Payout>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code reversedBy} object. */
  public String getReversedBy() {
    return (this.reversedBy != null) ? this.reversedBy.getId() : null;
  }

  public void setReversedBy(String id) {
    this.reversedBy = ApiResource.setExpandableFieldId(id, this.reversedBy);
  }

  /** Get expanded {@code reversedBy}. */
  public Payout getReversedByObject() {
    return (this.reversedBy != null) ? this.reversedBy.getExpanded() : null;
  }

  public void setReversedByObject(Payout expandableObject) {
    this.reversedBy = new ExpandableField<Payout>(expandableObject.getId(), expandableObject);
  }

  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payouts/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Payout.class);
  }

  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(PayoutCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(PayoutCancelParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payouts/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Payout.class);
  }

  /**
   * To send funds to your own bank account, create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must cover the payout amount. If
   * it doesn’t, you receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though every other action
   * occurs as if you’re in live mode.
   *
   * <p>If you create a manual payout on a Stripe account that uses multiple payment source types,
   * you need to specify the source type balance that the payout draws from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must cover the payout amount. If
   * it doesn’t, you receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though every other action
   * occurs as if you’re in live mode.
   *
   * <p>If you create a manual payout on a Stripe account that uses multiple payment source types,
   * you need to specify the source type balance that the payout draws from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payouts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Payout.class);
  }

  /**
   * To send funds to your own bank account, create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must cover the payout amount. If
   * it doesn’t, you receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though every other action
   * occurs as if you’re in live mode.
   *
   * <p>If you create a manual payout on a Stripe account that uses multiple payment source types,
   * you need to specify the source type balance that the payout draws from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(PayoutCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must cover the payout amount. If
   * it doesn’t, you receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though every other action
   * occurs as if you’re in live mode.
   *
   * <p>If you create a manual payout on a Stripe account that uses multiple payment source types,
   * you need to specify the source type balance that the payout draws from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(PayoutCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payouts";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Payout.class);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public static PayoutCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public static PayoutCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payouts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, PayoutCollection.class);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public static PayoutCollection list(PayoutListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public static PayoutCollection list(PayoutListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payouts";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, PayoutCollection.class);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public static Payout retrieve(String payout) throws StripeException {
    return retrieve(payout, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public static Payout retrieve(String payout, RequestOptions options) throws StripeException {
    return retrieve(payout, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public static Payout retrieve(String payout, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payouts/%s", ApiResource.urlEncodeId(payout));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Payout.class);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public static Payout retrieve(String payout, PayoutRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payouts/%s", ApiResource.urlEncodeId(payout));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Payout.class);
  }

  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US bank accounts. If the payout is manual and in the {@code
   * pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse() throws StripeException {
    return reverse((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US bank accounts. If the payout is manual and in the {@code
   * pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(RequestOptions options) throws StripeException {
    return reverse((Map<String, Object>) null, options);
  }

  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US bank accounts. If the payout is manual and in the {@code
   * pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(Map<String, Object> params) throws StripeException {
    return reverse(params, (RequestOptions) null);
  }

  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US bank accounts. If the payout is manual and in the {@code
   * pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payouts/%s/reverse", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Payout.class);
  }

  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US bank accounts. If the payout is manual and in the {@code
   * pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(PayoutReverseParams params) throws StripeException {
    return reverse(params, (RequestOptions) null);
  }

  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US bank accounts. If the payout is manual and in the {@code
   * pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(PayoutReverseParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payouts/%s/reverse", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Payout.class);
  }

  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  @Override
  public Payout update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  @Override
  public Payout update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payouts/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Payout.class);
  }

  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  public Payout update(PayoutUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  public Payout update(PayoutUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payouts/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Payout.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(applicationFee, responseGetter);
    trySetResponseGetter(balanceTransaction, responseGetter);
    trySetResponseGetter(destination, responseGetter);
    trySetResponseGetter(failureBalanceTransaction, responseGetter);
    trySetResponseGetter(originalPayout, responseGetter);
    trySetResponseGetter(reversedBy, responseGetter);
  }
}
