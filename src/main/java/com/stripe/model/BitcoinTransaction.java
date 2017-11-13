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

public class BitcoinTransaction extends APIResource implements HasId {
	@Getter @Setter
	String id;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long bitcoinAmount;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	@Getter @Setter
	String customer;
	@Getter @Setter
	String receiver;
}
