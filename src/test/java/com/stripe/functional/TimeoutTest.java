package com.stripe.functional;

import org.junit.Test;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.StripeException;
import com.stripe.model.Token;
import com.stripe.net.RequestOptions;

public class TimeoutTest extends BaseStripeFunctionalTest {
	
	@Test(expected=APIConnectionException.class)
	public void testConnectionTimeoutIsConsidered() throws StripeException {
		int tooShortTimeoutInMillis = 1;
		RequestOptions options = RequestOptions.builder()
				.setConnectionTimeout(tooShortTimeoutInMillis)
				.build();
		Token.create(defaultTokenParams, options);
	}
	
	@Test(expected=APIConnectionException.class)
	public void testReadTimeoutIsConsidered() throws StripeException {
		int tooShortTimeoutInMillis = 1;
		RequestOptions options = RequestOptions.builder()
				.setReadTimeout(tooShortTimeoutInMillis)
				.build();
		Token.create(defaultTokenParams, options);
	}

}
