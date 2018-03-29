package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;
import com.stripe.net.RequestOptions;

import java.util.UUID;

import org.junit.Test;

public class IdempotentTest extends BaseStripeFunctionalTest {
  @Test
  public void testIdempotentRequestSent() throws CardException, APIException,
      AuthenticationException, InvalidRequestException, APIConnectionException {
    RequestOptions options = RequestOptions.builder()
        .setIdempotencyKey(UUID.randomUUID().toString())
        .build();

    Charge firstCharge = Charge.create(defaultChargeParams, options);
    Charge secondCharge = Charge.create(defaultChargeParams, options);

    assertEquals(firstCharge.getId(), secondCharge.getId());
  }

  @Test
  public void testNotIdempotentWhenUnset() throws CardException, APIException,
      AuthenticationException, InvalidRequestException, APIConnectionException {
    RequestOptions options = RequestOptions.builder().build();

    Charge firstCharge = Charge.create(defaultChargeParams, options);
    Charge secondCharge = Charge.create(defaultChargeParams, options);

    assertNotSame(firstCharge.getId(), secondCharge.getId());
  }

  @Test
  public void testClearingIdempotentcyActuallyWorks() throws CardException, APIException,
      AuthenticationException, InvalidRequestException, APIConnectionException {
    RequestOptions options = RequestOptions.builder()
        .setIdempotencyKey(UUID.randomUUID().toString())
        .clearIdempotencyKey()
        .build();

    Charge firstCharge = Charge.create(defaultChargeParams, options);
    Charge secondCharge = Charge.create(defaultChargeParams, options);

    assertNotSame(firstCharge.getId(), secondCharge.getId());
  }

  @Test
  public void testDefaultOptionsHaveUnsetIdempotentRequest() throws CardException, APIException,
      AuthenticationException, InvalidRequestException, APIConnectionException {
    RequestOptions options = RequestOptions.getDefault();

    Charge firstCharge = Charge.create(defaultChargeParams, options);
    Charge secondCharge = Charge.create(defaultChargeParams, options);

    assertNotSame(firstCharge.getId(), secondCharge.getId());
  }
}
