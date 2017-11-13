package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class LoginLink extends APIResource implements HasId {
	String object;
	Long created;
	String url;

	public String getId() {
		throw new UnsupportedOperationException("Login links are ephemeral and do not have an identifier");
	}
}
