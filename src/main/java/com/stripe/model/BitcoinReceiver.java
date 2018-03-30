package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
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

  public static BitcoinReceiver create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  public static BitcoinReceiver create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/%s", Stripe.getApiBase(),
        "v1/bitcoin/receivers"), params, BitcoinReceiver.class, options);
  }

  public static BitcoinReceiver retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }


  public static BitcoinReceiver retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, String.format("%s/%s/%s", Stripe.getApiBase(),
        "v1/bitcoin/receivers", id), null, BitcoinReceiver.class, options);
  }

  public static BitcoinReceiverCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static BitcoinReceiverCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    String url = String.format("%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers");
    return requestCollection(url, params, BitcoinReceiverCollection.class, options);
  }

  @Deprecated
  public static BitcoinReceiverCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static BitcoinReceiverCollection all(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, options);
  }

  @Override
  public BitcoinReceiver update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  @Override
  public BitcoinReceiver update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, BitcoinReceiver.class,
        options);
  }

  @Override
  public DeletedBitcoinReceiver delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(null);
  }

  @Override
  public DeletedBitcoinReceiver delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedBitcoinReceiver.class,
        options);
  }

  @Override
  protected String getInstanceURL() {
    String result = super.getInstanceURL();
    if (result == null) {
      return String.format("%s/%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers", this.getId());
    } else {
      return result;
    }
  }
}
