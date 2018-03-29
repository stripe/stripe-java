package com.stripe.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PayoutTest extends BaseStripeTest {
  @Before
  public void mockStripeResponseGetter() {
    APIResource.setStripeResponseGetter(networkMock);
  }

  @After
  public void unmockStripeResponseGetter() {
    /* This needs to be done because tests aren't isolated in Java */
    APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
  }

  @Test
  public void testDeserialize() throws StripeException, IOException {
    String json = resource("payout.json");
    Payout payout = APIResource.GSON.fromJson(json, Payout.class);

    assertEquals("po_123456789ABCD", payout.getId());
    assertEquals(10000L, (long) payout.getAmount());
    assertEquals(1487116449L, (long) payout.getArrivalDate());
    assertEquals(false, payout.getAutomatic());
    assertEquals("txn_123456789ABCD", payout.getBalanceTransaction());
    assertEquals("usd", payout.getCurrency());
    assertEquals("ba_123456789ABCD", payout.getDestination());
    assertEquals("standard", payout.getMethod());
    assertEquals("card", payout.getSourceType());
    assertEquals("paid", payout.getStatus());
    assertEquals("bank_account", payout.getType());
  }

  @Test
  public void testCancel() throws StripeException {
    Payout payout = new Payout();
    payout.setId("po_test_cancel");
    payout.cancel();

    verifyPost(Payout.class, "https://api.stripe.com/v1/payouts/po_test_cancel/cancel");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testCreate() throws StripeException {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", "10000");
    params.put("currency", "usd");

    Payout.create(params);

    verifyPost(Payout.class, "https://api.stripe.com/v1/payouts", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testRetrieve() throws StripeException {
    Payout.retrieve("po_test_retrieve");

    verifyGet(Payout.class, "https://api.stripe.com/v1/payouts/po_test_retrieve");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testList() throws StripeException {
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 3);

    Payout.list(params);

    verifyGet(PayoutCollection.class, "https://api.stripe.com/v1/payouts", params);
    verifyNoMoreInteractions(networkMock);
  }
}
