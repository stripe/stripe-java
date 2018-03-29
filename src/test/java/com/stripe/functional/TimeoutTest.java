package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.StripeException;
import com.stripe.model.Token;
import com.stripe.net.RequestOptions;

import org.junit.Test;

public class TimeoutTest extends BaseStripeFunctionalTest {

  @Test(expected = APIConnectionException.class)
  public void testReadTimeoutIsConsidered() throws StripeException {

    int tooShortTimeoutInMillis = 1;
    RequestOptions options = RequestOptions.builder()
        .setReadTimeout(tooShortTimeoutInMillis)
        .build();
    Token.create(defaultTokenParams, options);
  }

}
