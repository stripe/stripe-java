package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Map;

public class BitcoinReceiver extends ExternalAccount {
	@Getter @Setter
	Boolean active;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long amountReceived;
	@Getter @Setter
	Long bitcoinAmount;
	@Getter @Setter
	Long bitcoinAmountReceived;
	@Getter @Setter
	String bitcoinUri;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	@Getter @Setter
	String description;
	@Getter @Setter
	String email;
	@Getter @Setter
	Boolean filled;
	@Getter @Setter
	String inboundAddress;
	@Getter @Setter
	Boolean livemode;
	@Getter @Setter
	String payment;
	@Getter @Setter
	String refundAddress;
	@Getter @Setter
	Boolean rejectTransactions;
	@Getter @Setter
	String status;
	@Getter @Setter
	BitcoinTransactionCollection transactions;
	@Getter @Setter
	Boolean uncapturedFunds;
	@Getter @Setter
	Boolean usedForPayment;

	public static BitcoinReceiver create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static BitcoinReceiver retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, null);
	}

	public static BitcoinReceiver create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, String.format("%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers"), params, BitcoinReceiver.class, options);
	}

	public static BitcoinReceiver retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, String.format("%s/%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers", id), null, BitcoinReceiver.class, options);
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
	public String getInstanceURL() {
		String result = super.getInstanceURL();
		if (result == null) {
			return String.format("%s/%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers", this.getId());
		} else {
			return result;
		}
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
		return request(RequestMethod.POST, this.getInstanceURL(), params, BitcoinReceiver.class, options);
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
		return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedBitcoinReceiver.class, options);
	}
}
