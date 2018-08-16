package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class BitcoinReceiver extends ExternalAccount {
  Boolean active;
  Long amount;
  Long amountReceived;
  Long bitcoinAmount;
  Long bitcoinAmountReceived;
  String bitcoinUri;
  Long created;
  String currency;
  String description;
  String email;
  Boolean filled;
  String inboundAddress;
  Boolean livemode;
  String payment;
  String refundAddress;
  Boolean rejectTransactions;
  String status;
  BitcoinTransactionCollection transactions;
  Boolean uncapturedFunds;
  Boolean usedForPayment;
  Boolean deleted;

  @Deprecated
  public static BitcoinReceiverCollection all(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  @Deprecated
  public static BitcoinReceiverCollection all(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return list(params, options);
  }

  public static BitcoinReceiverCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  public static BitcoinReceiverCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers");
    return requestCollection(url, params, BitcoinReceiverCollection.class, options);
  }

  public static BitcoinReceiver retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  public static BitcoinReceiver retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, String.format("%s/%s/%s", Stripe.getApiBase(),
        "v1/bitcoin/receivers", id), null, BitcoinReceiver.class, options);
  }

  @Override
  protected String getInstanceUrl() {
    String result = super.getInstanceUrl();
    if (result == null) {
      return String.format("%s/%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers", this.getId());
    } else {
      return result;
    }
  }
}
