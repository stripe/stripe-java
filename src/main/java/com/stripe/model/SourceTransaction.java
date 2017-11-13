package com.stripe.model;

import java.util.Map;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SourceTransaction extends APIResource implements HasId, HasSourceTypeData {
	String id;
	String object;
	Long amount;
	Long created;
	String currency;
	String customerData;
	Boolean livemode;
	String source;
	String type;

	// Type-specific properties
	Map<String, String> typeData;
}
