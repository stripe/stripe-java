package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Card;
import com.stripe.net.ApiResource;
import com.stripe.param.CardDeleteOnAccountParams;
import com.stripe.param.CardDeleteOnCustomerParams;
import com.stripe.param.CardUpdateOnAccountParams;
import com.stripe.param.CardUpdateOnCustomerParams;

import java.io.IOException;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CardServiceTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "acct_123";
  public static final String CARD_ID = "card_123";
  public static final String CUSTOMER_ID = "cus_123";

  private CardService cardService = new CardService();

  private String deletedCardFixture() {
    return String.format("{\"id\": \"%s\", \"object\": \"card\", \"deleted\": true}", CARD_ID);
  }

  @Test
  public void testUpdateOnCustomer() throws StripeException {
    final Card updatedCard = cardService.update(CUSTOMER_ID,
        CARD_ID,
        CardUpdateOnCustomerParams.builder()
            .putMetadata("key", "value")
            .build());

    assertNotNull(updatedCard);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, CARD_ID),
        ImmutableMap.of(
            "metadata", ImmutableMap.of("key", "value")
        )
    );
  }

  @Test
  public void testUpdateOnAccount() throws StripeException, IOException {
    Map<String, Object> params = ImmutableMap.of(
        "metadata", ImmutableMap.of("key", "value")
    );
    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, CARD_ID),
        params,
        Card.class,
        getResourceAsString("/api_fixtures/card.json")
    );

    final Card updatedCard = cardService.update(ACCOUNT_ID,
        CARD_ID,
        CardUpdateOnAccountParams.builder()
            .putMetadata("key", "value")
            .build());

    assertNotNull(updatedCard);

    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, CARD_ID),
        params
    );
  }

  @Test
  public void testDeleteOnCustomer() throws StripeException {
    final String deleteCardData = deletedCardFixture();

    stubRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, CARD_ID),
        null, Card.class, deleteCardData
    );
    final Card deletedCard = cardService.delete(
        CUSTOMER_ID,
        CARD_ID,
        CardDeleteOnCustomerParams.builder().build());

    assertNotNull(deletedCard);
    assertTrue(deletedCard.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, CARD_ID));
  }

  @Test
  public void testDeleteOnAccount() throws StripeException {
    final String deleteCardData = deletedCardFixture();

    stubRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, CARD_ID),
        null, Card.class, deleteCardData
    );
    final Card deletedCard = cardService.delete(
        ACCOUNT_ID,
        CARD_ID,
        CardDeleteOnAccountParams.builder().build());

    assertNotNull(deletedCard);
    assertTrue(deletedCard.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, CARD_ID)
    );
  }
}
