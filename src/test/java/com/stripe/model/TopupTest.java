package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TopupTest extends BaseStripeTest {
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
  public void testDeserialize() throws IOException {
    String json = resource("topup.json");
    Topup topup = APIResource.GSON.fromJson(json, Topup.class);
    assertEquals("tu_123", topup.getId());
    assertEquals("topup", topup.getObject());
    assertEquals(1000, topup.getAmount().intValue());
    assertEquals("usd", topup.getCurrency());
    assertEquals("Testing", topup.getDescription());
    assertEquals(1518134400, topup.getExpectedAvailabilityDate().longValue());
    assertEquals(1517619386, topup.getCreated().longValue());
    assertEquals("pending", topup.getStatus());
    assertEquals("statement_descriptor", topup.getStatementDescriptor());
    assertEquals("txn_123", topup.getBalanceTransaction());
    assertFalse(topup.getLivemode());
    assertFalse(topup.getMetadata().isEmpty());
    assertTrue(topup.getMetadata().containsKey("email"));
    assertEquals("test@test.com", topup.getMetadata().get("email"));
    Source source = topup.getSource();
    assertEquals("src_123", source.getId());
    assertEquals("ach_debit", source.getType());
  }

  @Test
  public void testDeserializeExpandBalanceTransaction() throws IOException {
    String expandedJson = resource("topup_expansions.json");
    Topup expandedTopup = APIResource.GSON.fromJson(expandedJson, Topup.class);

    BalanceTransaction balanceTransaction = expandedTopup.getBalanceTransactionObject();
    assertEquals("txn_18tjj22eZvKYlo2CeFxM3FxI", expandedTopup.getBalanceTransaction());
    assertEquals("txn_18tjj22eZvKYlo2CeFxM3FxI", balanceTransaction.getId());
    assertEquals(316, balanceTransaction.getAmount().longValue());

    expandedTopup.setBalanceTransaction("txn_456");
    assertEquals("txn_456", expandedTopup.getBalanceTransaction());
    BalanceTransaction newBalanceTranscation = new BalanceTransaction();
    expandedTopup.setBalanceTransactionObject(newBalanceTranscation);
    assertEquals(newBalanceTranscation, expandedTopup.getBalanceTransactionObject());
  }

  @Test
  public void testCreate() throws StripeException {
    Map<String, Object> params = new HashMap<>();
    params.put("id", "tu_123");
    params.put("amount", 1000);
    params.put("currency", "usd");
    params.put("description", "top-up description");
    params.put("source", "src_foo");
    params.put("statement_descriptor", "Stripe");

    Map<String, String> metadata = new HashMap<>();
    metadata.put("extra-data", "More data");
    params.put("metadata", metadata);

    Topup.create(params);
    verifyPost(Topup.class, "https://api.stripe.com/v1/topups", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testRetrieve() throws StripeException {
    Topup.retrieve("tu_123");
    verifyGet(Topup.class, "https://api.stripe.com/v1/topups/tu_123");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testUpdate() throws StripeException {
    Topup topup = new Topup();
    topup.setId("tu_123");

    Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("email", "test@test.com");
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);
    topup.update(params);

    verifyPost(Topup.class, "https://api.stripe.com/v1/topups/tu_123", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testList() throws StripeException {
    Topup.list(Collections.<String, Object>emptyMap());

    verifyGet(TopupCollection.class, "https://api.stripe.com/v1/topups");
    verifyNoMoreInteractions(networkMock);
  }
}
