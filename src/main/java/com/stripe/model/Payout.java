// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Payout extends ApiResource implements MetadataStore<Payout>, BalanceTransactionSource {
  /** Amount (in %s) to be transferred to your bank account or debit card. */
  @SerializedName("amount")
  Long amount;

  /**
   * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank
   * holidays.
   */
  @SerializedName("arrival_date")
  Long arrivalDate;

  /**
   * Returns {@code true} if the payout was created by an <a
   * href="https://stripe.com/docs/payouts#payout-schedule">automated payout schedule</a>, and
   * {@code false} if it was <a href="https://stripe.com/docs/payouts#manual-payouts">requested
   * manually</a>.
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

  /** ID of the bank account or card the payout was sent to. */
  @SerializedName("destination")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<ExternalAccount> destination;

  /**
   * If the payout failed or was canceled, this will be the ID of the balance transaction that
   * reversed the initial balance transaction, and puts the funds from the failed payout back in
   * your balance.
   */
  @SerializedName("failure_balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> failureBalanceTransaction;

  /**
   * Error code explaining reason for payout failure if available. See <a
   * href="https://stripe.com/docs/api#payout_failures">Types of payout failures</a> for a list of
   * failure codes.
   */
  @SerializedName("failure_code")
  String failureCode;

  /** Message to user further explaining reason for payout failure if available. */
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
   * instant} is only supported for payouts to debit cards. (See <a
   * href="https://stripe.com/blog/instant-payouts-for-marketplaces">Instant payouts for
   * marketplaces</a> for more information.)
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

  /** If the payout was reversed, this is the ID of the payout that reverses this payout. */
  @SerializedName("reversed_by")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Payout> reversedBy;

  /**
   * The source balance this payout came from. One of {@code card}, {@code fpx}, or {@code
   * bank_account}.
   */
  @SerializedName("source_type")
  String sourceType;

  /** Extra information about a payout to be displayed on the user's bank statement. */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Current status of the payout: {@code paid}, {@code pending}, {@code in_transit}, {@code
   * canceled} or {@code failed}. A payout is {@code pending} until it is submitted to the bank,
   * when it becomes {@code in_transit}. The status then changes to {@code paid} if the transaction
   * goes through, or to {@code failed} or {@code canceled} (within 5 business days). Some failed
   * payouts may initially show as {@code paid} but then change to {@code failed}.
   */
  @SerializedName("status")
  String status;

  /** Can be {@code bank_account} or {@code card}. */
  @SerializedName("type")
  String type;

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
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout) throws StripeException {
    return retrieve(payout, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout, RequestOptions options) throws StripeException {
    return retrieve(payout, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payouts/%s", ApiResource.urlEncodeId(payout)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Payout.class, options);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout, PayoutRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payouts/%s", ApiResource.urlEncodeId(payout)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Payout.class, options);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return ApiResource.requestCollection(url, params, PayoutCollection.class, options);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(PayoutListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(PayoutListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return ApiResource.requestCollection(url, params, PayoutCollection.class, options);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must be able to cover the payout
   * amount, or you’ll receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must be able to cover the payout
   * amount, or you’ll receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must be able to cover the payout
   * amount, or you’ll receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(PayoutCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must be able to cover the payout
   * amount, or you’ll receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="https://stripe.com/docs/api#balance_object">balance object</a> details available and
   * pending amounts by source type.
   */
  public static Payout create(PayoutCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  @Override
  public Payout update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  @Override
  public Payout update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payouts/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  public Payout update(PayoutUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  public Payout update(PayoutUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payouts/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payouts/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(PayoutCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(PayoutCancelParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payouts/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * Reverses a payout by debiting the destination bank account. Only payouts for connected accounts
   * to US bank accounts may be reversed at this time. If the payout is in the <code>pending</code>
   * status, <code>/v1/payouts/:id/cancel</code> should be used instead.
   *
   * <p>By requesting a reversal via <code>/v1/payouts/:id/reverse</code>, you confirm that the
   * authorized signatory of the selected bank account has authorized the debit on the bank account
   * and that no other authorization is required.
   */
  public Payout reverse() throws StripeException {
    return reverse((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Reverses a payout by debiting the destination bank account. Only payouts for connected accounts
   * to US bank accounts may be reversed at this time. If the payout is in the <code>pending</code>
   * status, <code>/v1/payouts/:id/cancel</code> should be used instead.
   *
   * <p>By requesting a reversal via <code>/v1/payouts/:id/reverse</code>, you confirm that the
   * authorized signatory of the selected bank account has authorized the debit on the bank account
   * and that no other authorization is required.
   */
  public Payout reverse(RequestOptions options) throws StripeException {
    return reverse((Map<String, Object>) null, options);
  }

  /**
   * Reverses a payout by debiting the destination bank account. Only payouts for connected accounts
   * to US bank accounts may be reversed at this time. If the payout is in the <code>pending</code>
   * status, <code>/v1/payouts/:id/cancel</code> should be used instead.
   *
   * <p>By requesting a reversal via <code>/v1/payouts/:id/reverse</code>, you confirm that the
   * authorized signatory of the selected bank account has authorized the debit on the bank account
   * and that no other authorization is required.
   */
  public Payout reverse(Map<String, Object> params) throws StripeException {
    return reverse(params, (RequestOptions) null);
  }

  /**
   * Reverses a payout by debiting the destination bank account. Only payouts for connected accounts
   * to US bank accounts may be reversed at this time. If the payout is in the <code>pending</code>
   * status, <code>/v1/payouts/:id/cancel</code> should be used instead.
   *
   * <p>By requesting a reversal via <code>/v1/payouts/:id/reverse</code>, you confirm that the
   * authorized signatory of the selected bank account has authorized the debit on the bank account
   * and that no other authorization is required.
   */
  public Payout reverse(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payouts/%s/reverse", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * Reverses a payout by debiting the destination bank account. Only payouts for connected accounts
   * to US bank accounts may be reversed at this time. If the payout is in the <code>pending</code>
   * status, <code>/v1/payouts/:id/cancel</code> should be used instead.
   *
   * <p>By requesting a reversal via <code>/v1/payouts/:id/reverse</code>, you confirm that the
   * authorized signatory of the selected bank account has authorized the debit on the bank account
   * and that no other authorization is required.
   */
  public Payout reverse(PayoutReverseParams params) throws StripeException {
    return reverse(params, (RequestOptions) null);
  }

  /**
   * Reverses a payout by debiting the destination bank account. Only payouts for connected accounts
   * to US bank accounts may be reversed at this time. If the payout is in the <code>pending</code>
   * status, <code>/v1/payouts/:id/cancel</code> should be used instead.
   *
   * <p>By requesting a reversal via <code>/v1/payouts/:id/reverse</code>, you confirm that the
   * authorized signatory of the selected bank account has authorized the debit on the bank account
   * and that no other authorization is required.
   */
  public Payout reverse(PayoutReverseParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payouts/%s/reverse", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }
}
