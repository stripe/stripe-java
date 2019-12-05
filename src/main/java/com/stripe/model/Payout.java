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
   * Returns `true` if the payout was created by an [automated payout
   * schedule](https://stripe.com/docs/payouts#payout-schedule), and `false` if it was [requested
   * manually](https://stripe.com/docs/payouts#manual-payouts).
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
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
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
   * Error code explaining reason for payout failure if available. See [Types of payout
   * failures](https://stripe.com/docs/api#payout_failures) for a list of failure codes.
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
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The method used to send this payout, which can be `standard` or `instant`. `instant` is only
   * supported for payouts to debit cards. (See [Instant payouts for
   * marketplaces](/blog/instant-payouts-for-marketplaces) for more information.)
   */
  @SerializedName("method")
  String method;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `payout`.
   */
  @SerializedName("object")
  String object;

  /** The source balance this payout came from. One of `card` or `bank_account`. */
  @SerializedName("source_type")
  String sourceType;

  /** Extra information about a payout to be displayed on the user's bank statement. */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Current status of the payout (`paid`, `pending`, `in_transit`, `canceled` or `failed`). A
   * payout will be `pending` until it is submitted to the bank, at which point it becomes
   * `in_transit`. It will then change to `paid` if the transaction goes through. If it does not go
   * through successfully, its status will change to `failed` or `canceled`.
   */
  @SerializedName("status")
  String status;

  /** Can be `bank_account` or `card`. */
  @SerializedName("type")
  String type;

  /** Get id of expandable `balanceTransaction` object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded `balanceTransaction`. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `destination` object. */
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String id) {
    this.destination = ApiResource.setExpandableFieldId(id, this.destination);
  }

  /** Get expanded `destination`. */
  public ExternalAccount getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(ExternalAccount expandableObject) {
    this.destination =
        new ExpandableField<ExternalAccount>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `failureBalanceTransaction` object. */
  public String getFailureBalanceTransaction() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getId() : null;
  }

  public void setFailureBalanceTransaction(String id) {
    this.failureBalanceTransaction =
        ApiResource.setExpandableFieldId(id, this.failureBalanceTransaction);
  }

  /** Get expanded `failureBalanceTransaction`. */
  public BalanceTransaction getFailureBalanceTransactionObject() {
    return (this.failureBalanceTransaction != null)
        ? this.failureBalanceTransaction.getExpanded()
        : null;
  }

  public void setFailureBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.failureBalanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
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
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
   */
  public static Payout create(PayoutCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
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
}
