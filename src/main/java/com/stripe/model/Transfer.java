package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TransferCreateParams;
import com.stripe.param.TransferListParams;
import com.stripe.param.TransferRetrieveParams;
import com.stripe.param.TransferUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transfer extends ApiResource
    implements MetadataStore<Transfer>, BalanceTransactionSource {
  /** Amount in %s to be transferred. */
  @SerializedName("amount")
  Long amount;

  /**
   * Amount in %s reversed (can be less than the amount attribute on the transfer if a partial
   * reversal was issued).
   */
  @SerializedName("amount_reversed")
  Long amountReversed;

  /** Balance transaction that describes the impact of this transfer on your account balance. */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** Time that this record of the transfer was first created. */
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

  /** ID of the Stripe account the transfer was sent to. */
  @SerializedName("destination")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> destination;

  /**
   * If the destination is a Stripe account, this will be the ID of the payment that the destination
   * account received for the transfer.
   */
  @SerializedName("destination_payment")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> destinationPayment;

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
   * A set of key-value pairs that you can attach to a transfer object. It can be useful for storing
   * additional information about the transfer in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `transfer`.
   */
  @SerializedName("object")
  String object;

  /** A list of reversals that have been applied to the transfer. */
  @SerializedName("reversals")
  TransferReversalCollection reversals;

  /**
   * Whether the transfer has been fully reversed. If the transfer is only partially reversed, this
   * attribute will still be false.
   */
  @SerializedName("reversed")
  Boolean reversed;

  /**
   * ID of the charge or payment that was used to fund the transfer. If null, the transfer was
   * funded from the available balance.
   */
  @SerializedName("source_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> sourceTransaction;

  /** The source balance this transfer came from. One of `card` or `bank_account`. */
  @SerializedName("source_type")
  String sourceType;

  /**
   * A string that identifies this transaction as part of a group. See the [Connect
   * documentation](https://stripe.com/docs/connect/charges-transfers#grouping-transactions) for
   * details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

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
  public Account getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(Account expandableObject) {
    this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `destinationPayment` object. */
  public String getDestinationPayment() {
    return (this.destinationPayment != null) ? this.destinationPayment.getId() : null;
  }

  public void setDestinationPayment(String id) {
    this.destinationPayment = ApiResource.setExpandableFieldId(id, this.destinationPayment);
  }

  /** Get expanded `destinationPayment`. */
  public Charge getDestinationPaymentObject() {
    return (this.destinationPayment != null) ? this.destinationPayment.getExpanded() : null;
  }

  public void setDestinationPaymentObject(Charge expandableObject) {
    this.destinationPayment =
        new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `sourceTransaction` object. */
  public String getSourceTransaction() {
    return (this.sourceTransaction != null) ? this.sourceTransaction.getId() : null;
  }

  public void setSourceTransaction(String id) {
    this.sourceTransaction = ApiResource.setExpandableFieldId(id, this.sourceTransaction);
  }

  /** Get expanded `sourceTransaction`. */
  public Charge getSourceTransactionObject() {
    return (this.sourceTransaction != null) ? this.sourceTransaction.getExpanded() : null;
  }

  public void setSourceTransactionObject(Charge expandableObject) {
    this.sourceTransaction =
        new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /**
   * To send funds from your Stripe account to a connected account, you create a new transfer
   * object. Your <a href="#balance">Stripe balance</a> must be able to cover the transfer amount,
   * or you’ll receive an “Insufficient Funds” error.
   */
  public static Transfer create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds from your Stripe account to a connected account, you create a new transfer
   * object. Your <a href="#balance">Stripe balance</a> must be able to cover the transfer amount,
   * or you’ll receive an “Insufficient Funds” error.
   */
  public static Transfer create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/transfers");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transfer.class, options);
  }

  /**
   * To send funds from your Stripe account to a connected account, you create a new transfer
   * object. Your <a href="#balance">Stripe balance</a> must be able to cover the transfer amount,
   * or you’ll receive an “Insufficient Funds” error.
   */
  public static Transfer create(TransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds from your Stripe account to a connected account, you create a new transfer
   * object. Your <a href="#balance">Stripe balance</a> must be able to cover the transfer amount,
   * or you’ll receive an “Insufficient Funds” error.
   */
  public static Transfer create(TransferCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/transfers");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transfer.class, options);
  }

  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public static TransferCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public static TransferCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/transfers");
    return ApiResource.requestCollection(url, params, TransferCollection.class, options);
  }

  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public static TransferCollection list(TransferListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing transfers sent to connected accounts. The transfers are returned in
   * sorted order, with the most recently created transfers appearing first.
   */
  public static TransferCollection list(TransferListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/transfers");
    return ApiResource.requestCollection(url, params, TransferCollection.class, options);
  }

  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public static Transfer retrieve(String transfer) throws StripeException {
    return retrieve(transfer, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public static Transfer retrieve(String transfer, RequestOptions options) throws StripeException {
    return retrieve(transfer, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public static Transfer retrieve(
      String transfer, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/transfers/%s", ApiResource.urlEncodeId(transfer)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Transfer.class, options);
  }

  /**
   * Retrieves the details of an existing transfer. Supply the unique transfer ID from either a
   * transfer creation request or the transfer list, and Stripe will return the corresponding
   * transfer information.
   */
  public static Transfer retrieve(
      String transfer, TransferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/transfers/%s", ApiResource.urlEncodeId(transfer)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Transfer.class, options);
  }

  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  @Override
  public Transfer update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  @Override
  public Transfer update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/transfers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transfer.class, options);
  }

  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  public Transfer update(TransferUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified transfer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request accepts only metadata as an argument.
   */
  public Transfer update(TransferUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/transfers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transfer.class, options);
  }
}
