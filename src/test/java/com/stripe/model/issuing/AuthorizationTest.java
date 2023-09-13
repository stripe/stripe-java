package com.stripe.model.issuing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class AuthorizationTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/issuing/authorizations/iauth_123");
    final Authorization authorization = ApiResource.GSON.fromJson(data, Authorization.class);

    assertNotNull(authorization);
    assertNotNull(authorization.getId());
    assertEquals("issuing.authorization", authorization.getObject());
    assertNotNull(authorization.getCard());
    assertEquals("issuing.card", authorization.getCard().getObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "cardholder",
    };
    final String data = getFixture("/v1/issuing/authorizations/iauth_123", expansions);
    final Authorization authorization = ApiResource.GSON.fromJson(data, Authorization.class);

    assertNotNull(authorization);
    assertNotNull(authorization.getId());
    assertEquals("issuing.authorization", authorization.getObject());
    assertEquals("issuing.card", authorization.getCard().getObject());

    final Cardholder cardholder = authorization.getCardholderObject();
    assertNotNull(cardholder);
    assertNotNull(cardholder.getId());
    assertEquals(authorization.getCardholder(), cardholder.getId());
  }
}
