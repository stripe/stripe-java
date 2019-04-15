package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.model.Card;
import com.stripe.model.ExternalAccount;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.ExternalAccountCreateParams;
import com.stripe.param.ExternalAccountListParams;
import com.stripe.param.ExternalAccountRetrieveParams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class ExternalAccountServiceTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "acct_123";
  public static final String BANK_ACCOUNT_ID = "btok_123";
  public static final String CARD_ID = "card_123";

  private ExternalAccountService externalAccountService = new ExternalAccountService();

  private Card getCardFixture() throws IOException {
    final Card card = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/card.json"), Card.class);
    return card;
  }

  @Test
  public void testRetrieveCard() throws IOException, StripeException {
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, CARD_ID),
        new HashMap<>(),
        Card.class,
        getResourceAsString("/api_fixtures/card.json")
    );

    final Card card = (Card) externalAccountService.retrieve(
        ACCOUNT_ID,
        CARD_ID,
        ExternalAccountRetrieveParams.builder().build());

    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, CARD_ID),
        new HashMap<>()
    );
  }

  @Test
  public void testRetrieveBankAccount() throws StripeException, IOException {
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, BANK_ACCOUNT_ID),
        new HashMap<>(),
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json")
    );

    final BankAccount bankAccount = (BankAccount) externalAccountService.retrieve(
        ACCOUNT_ID,
        BANK_ACCOUNT_ID,
        ExternalAccountRetrieveParams.builder().build());

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, BANK_ACCOUNT_ID),
        new HashMap<>()
    );
  }

  @Test
  public void testCreate() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("external_account", "btok_123");

    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/external_accounts", ACCOUNT_ID),
        params,
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json")
    );

    final BankAccount bankAccount = (BankAccount) externalAccountService.create(
        ACCOUNT_ID,
        ExternalAccountCreateParams.builder()
            .setExternalAccount("btok_123")
            .build());

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/external_accounts", ACCOUNT_ID),
        params
    );
  }

  @Test
  public void testList() throws StripeException, IOException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    // stripe-mock doesn't handle this, so we stub the request
    final ExternalAccountCollection stubbedCollection = new ExternalAccountCollection();
    final List<ExternalAccount> stubbedData = new ArrayList<>();
    stubbedData.add(getCardFixture());
    stubbedCollection.setData(stubbedData);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/external_accounts", ACCOUNT_ID),
        params,
        ExternalAccountCollection.class,
        stubbedCollection.toJson()
    );

    final ExternalAccountCollection externalAccounts = externalAccountService.list(
        ACCOUNT_ID,
        ExternalAccountListParams.builder()
            .setLimit(1L)
            .build());

    assertNotNull(externalAccounts);
    assertEquals(1, externalAccounts.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/accounts/%s/external_accounts", ACCOUNT_ID)
    );

    final Card card = (Card) externalAccounts.getData().get(0);
    assertNotNull(card);
  }
}