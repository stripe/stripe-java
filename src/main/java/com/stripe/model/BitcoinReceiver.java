package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BitcoinReceiver extends ApiResource implements PaymentSource {
  /** True when this bitcoin receiver has received a non-zero amount of bitcoin. */
  Boolean active;

  /** The amount of `currency` that you are collecting as payment. */
  Long amount;

  /** The amount of `currency` to which `bitcoin_amount_received` has been converted. */
  Long amountReceived;

  /**
   * The amount of bitcoin that the customer should send to fill the receiver. The `bitcoin_amount`
   * is denominated in Satoshi: there are 10^8 Satoshi in one bitcoin.
   */
  Long bitcoinAmount;

  /** The amount of bitcoin that has been sent by the customer to this receiver. */
  Long bitcoinAmountReceived;

  /**
   * This URI can be displayed to the customer as a clickable link (to activate their bitcoin
   * client) or as a QR code (for mobile wallets).
   */
  String bitcoinUri;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which the
   * bitcoin will be converted.
   */
  String currency;

  String customer;

  /** Always true for a deleted object. */
  Boolean deleted;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  String description;

  /** The customer's email address, set by the API call that creates the receiver. */
  String email;

  /**
   * This flag is initially false and updates to true when the customer sends the `bitcoin_amount`
   * to this receiver.
   */
  Boolean filled;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this
   * address to fill the receiver.
   */
  String inboundAddress;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with
   * a publishable key.
   */
  String payment;

  String refundAddress;

  /**
   * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when
   * viewing the receiver with a publishable key.
   */
  BitcoinTransactionCollection transactions;

  /** This receiver contains uncaptured funds that can be used for a payment or refunded. */
  Boolean uncapturedFunds;

  Boolean usedForPayment;

  /**
   * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most
   * recently created receivers appearing first.
   */
  public static BitcoinReceiverCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most
   * recently created receivers appearing first.
   */
  public static BitcoinReceiverCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/bitcoin/receivers");
    return requestCollection(url, params, BitcoinReceiverCollection.class, options);
  }

  /** Retrieves the Bitcoin receiver with the given ID. */
  public static BitcoinReceiver retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the Bitcoin receiver with the given ID. */
  public static BitcoinReceiver retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the Bitcoin receiver with the given ID. */
  public static BitcoinReceiver retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/bitcoin/receivers/%s", id));
    return request(ApiResource.RequestMethod.GET, url, params, BitcoinReceiver.class, options);
  }
}
