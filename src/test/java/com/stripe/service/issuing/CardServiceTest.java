package com.stripe.service.issuing;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.issuing.Card;
import com.stripe.net.ApiResource;
import com.stripe.param.issuing.CardCreateParams;
import com.stripe.param.issuing.CardCreateParams.Type;
import com.stripe.param.issuing.CardListParams;
import com.stripe.param.issuing.CardUpdateParams;
import com.stripe.service.BaseServiceTest;
import org.junit.jupiter.api.Test;

public class CardServiceTest extends BaseServiceTest {
  @Test
  public void testCreate() throws StripeException {
    CardCreateParams params =
        CardCreateParams.builder().setCurrency("usd").setType(CardCreateParams.Type.PHYSICAL).build();
    Card card = this.client.issuing().cards().create(params);
    assertNotNull(card);
    assertEquals("issuing.card", card.getObject());
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/issuing/cards");
  }

  @Test
  public void testList() throws StripeException {
    CardListParams params = CardListParams.builder().setLimit(1L).build();
    StripeCollection<Card> cards = this.client.issuing().cards().list(params);
    assertNotNull(cards);
    assertNotNull(cards.getData());
    assertEquals(1, cards.getData().size());
    Card card = cards.getData().get(0);
    assertNotNull(card);
    assertEquals("issuing.card", card.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/cards");
  }

  @Test
  public void testRetrieve() throws StripeException {
    Card card = this.client.issuing().cards().retrieve("ic_123");
    assertNotNull(card);
    assertEquals("issuing.card", card.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/cards/ic_123");
  }

  @Test
  public void testUpdate() throws StripeException {
    CardUpdateParams params = CardUpdateParams.builder().putMetadata("key", "value").build();
    Card card = this.client.issuing().cards().update("ic_123", params);
    assertNotNull(card);
    assertEquals("issuing.card", card.getObject());
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/issuing/cards/ic_123");
  }
}
