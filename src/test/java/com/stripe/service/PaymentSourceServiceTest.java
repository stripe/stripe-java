package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.model.Card;
import com.stripe.model.PaymentSource;
import com.stripe.model.PaymentSourceCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.PaymentSourceCreateParams;
import com.stripe.param.PaymentSourceListParams;
import com.stripe.param.PaymentSourceRetrieveParams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class PaymentSourceServiceTest extends BaseStripeTest {
  public static final String BANK_ACCOUNT_ID = "btok_123";
  public static final String CARD_ID = "card_123";
  public static final String CUSTOMER_ID = "cus_123";
  private PaymentSourceService paymentSourceService = new PaymentSourceService();

  private Card getCardFixture() throws IOException {
    final Card card = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/card.json"), Card.class);
    return card;
  }

  @Test
  public void testRetrieveCard() throws IOException, StripeException {
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, CARD_ID),
        new HashMap<>(),
        Card.class,
        getResourceAsString("/api_fixtures/card.json")
    );

    final Card card = (Card) paymentSourceService.retrieve(
        CUSTOMER_ID,
        CARD_ID,
        PaymentSourceRetrieveParams.builder().build());

    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, CARD_ID),
        new HashMap<>()
    );
  }

  @Test
  public void testRetrieveBankAccount() throws StripeException, IOException {
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, BANK_ACCOUNT_ID),
        new HashMap<>(),
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json")
    );

    final BankAccount bankAccount = (BankAccount) paymentSourceService.retrieve(
        CUSTOMER_ID,
        BANK_ACCOUNT_ID,
        PaymentSourceRetrieveParams.builder().build());

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, BANK_ACCOUNT_ID),
        new HashMap<>()
    );
  }

  @Test
  public void testCreate() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("source", "btok_123");

    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", CUSTOMER_ID),
        params,
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json")
    );

    final BankAccount bankAccount = (BankAccount) paymentSourceService.create(
        CUSTOMER_ID,
        PaymentSourceCreateParams.builder()
            .setSource("btok_123")
            .build());

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", CUSTOMER_ID),
        params
    );
  }

  @Test
  public void testList() throws StripeException, IOException {
    final Map<String, Object> params = new HashMap<>();
    params.put("object", "card");
    params.put("limit", 1);

    // stripe-mock doesn't handle this, so we stub the request
    final PaymentSourceCollection stubbedCollection = new PaymentSourceCollection();
    final List<PaymentSource> stubbedData = new ArrayList<>();
    stubbedData.add(getCardFixture());
    stubbedCollection.setData(stubbedData);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", CUSTOMER_ID),
        params,
        PaymentSourceCollection.class,
        stubbedCollection.toJson()
    );

    final PaymentSourceCollection sources = paymentSourceService.list(
        CUSTOMER_ID,
        PaymentSourceListParams.builder()
            .setObject("card")
            .setLimit(1L).build());

    assertNotNull(sources);
    assertEquals(1, sources.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", CUSTOMER_ID)
    );

    final Card card = (Card) sources.getData().get(0);
    assertNotNull(card);
  }
}