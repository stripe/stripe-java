// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.BitcoinReceiverListParams;
import com.stripe.param.BitcoinReceiverRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BitcoinReceiver extends ApiResource implements PaymentSource {
  /**
   * True when this bitcoin receiver has received a non-zero amount of bitcoin.
   */
  @SerializedName("active")
  Boolean active;

  /**
   * The amount of {@code currency} that you are collecting as payment.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of {@code currency} to which {@code bitcoin_amount_received} has been converted.
   */
  @SerializedName("amount_received")
  Long amountReceived;

  /**
   * The amount of bitcoin that the customer should send to fill the receiver. The {@code bitcoin_amount} is denominated in Satoshi: there are 10^8 Satoshi in one bitcoin.
   */
  @SerializedName("bitcoin_amount")
  Long bitcoinAmount;

  /**
   * The amount of bitcoin that has been sent by the customer to this receiver.
   */
  @SerializedName("bitcoin_amount_received")
  Long bitcoinAmountReceived;

  /**
   * This URI can be displayed to the customer as a clickable link (to activate their bitcoin client) or as a QR code (for mobile wallets).
   */
  @SerializedName("bitcoin_uri")
  String bitcoinUri;

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a> to which the bitcoin will be converted.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The customer ID of the bitcoin receiver.
   */
  @SerializedName("customer")
  String customer;

  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  @SerializedName("description")
  String description;

  /**
   * The customer's email address, set by the API call that creates the receiver.
   */
  @SerializedName("email")
  String email;

  /**
   * This flag is initially false and updates to true when the customer sends the {@code bitcoin_amount} to this receiver.
   */
  @SerializedName("filled")
  Boolean filled;

  /**
   * Unique identifier for the object.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this address to fill the receiver.
   */
  @SerializedName("inbound_address")
  String inboundAddress;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code bitcoin_receiver}.
   */
  @SerializedName("object")
  String object;

  /**
   * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with a publishable key.
   */
  @SerializedName("payment")
  String payment;

  /**
   * The refund address of this bitcoin receiver.
   */
  @SerializedName("refund_address")
  String refundAddress;

  /**
   * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when viewing the receiver with a publishable key.
   */
  @SerializedName("transactions")
  BitcoinTransactionCollection transactions;

  /**
   * This receiver contains uncaptured funds that can be used for a payment or refunded.
   */
  @SerializedName("uncaptured_funds")
  Boolean uncapturedFunds;

  /**
   * Indicate if this source is used for payment.
   */
  @SerializedName("used_for_payment")
  Boolean usedForPayment;

  /**
   * <p>Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.</p>
   */
  public static BitcoinReceiverCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.</p>
   */
  public static BitcoinReceiverCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/bitcoin/receivers");
    return ApiResource.requestCollection(url, params, BitcoinReceiverCollection.class, options);
  }

  /**
   * <p>Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.</p>
   */
  public static BitcoinReceiverCollection list(
      BitcoinReceiverListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.</p>
   */
  public static BitcoinReceiverCollection list(
      BitcoinReceiverListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/bitcoin/receivers");
    return ApiResource.requestCollection(url, params, BitcoinReceiverCollection.class, options);
  }

  /**
   * <p>Retrieves the Bitcoin receiver with the given ID.</p>
   */
  public static BitcoinReceiver retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves the Bitcoin receiver with the given ID.</p>
   */
  public static BitcoinReceiver retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves the Bitcoin receiver with the given ID.</p>
   */
  public static BitcoinReceiver retrieve(
      String id,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/bitcoin/receivers/%s", ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      BitcoinReceiver.class,
      options
    );
  }

  /**
   * <p>Retrieves the Bitcoin receiver with the given ID.</p>
   */
  public static BitcoinReceiver retrieve(
      String id,
      BitcoinReceiverRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/bitcoin/receivers/%s", ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      BitcoinReceiver.class,
      options
    );
  }
}