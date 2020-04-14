package com.stripe.functional.issuing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Card;
import com.stripe.model.issuing.CardCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class CardTest extends BaseStripeTest {
  public static final String CARD_ID = "ic_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("currency", "usd");
    params.put("type", "physical");

    final Card card = Card.create(params);

    assertNotNull(card);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/issuing/cards"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Card card = Card.retrieve(CARD_ID);

    assertNotNull(card);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/issuing/cards/%s", CARD_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Card card = Card.retrieve(CARD_ID);

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Card updatedCard = card.update(params);

    assertNotNull(updatedCard);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/cards/%s", card.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    CardCollection resources = Card.list(params);

    assertNotNull(resources);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/issuing/cards"), params);
  }
}
