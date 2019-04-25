package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.net.ApiResource;
import com.stripe.param.BankAccountUpdateOnAccountParams;
import com.stripe.param.BankAccountUpdateOnCustomerParams;
import com.stripe.param.BankAccountVerifyParams;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class BankAccountServiceTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "acct_123";
  public static final String CUSTOMER_ID = "cus_123";
  public static final String BANK_ACCOUNT_ID = "ba_123";

  private BankAccountService service = new BankAccountService();

  private String getBankAccountFixture() throws IOException, StripeException {
    // stripe-mock doesn't handle bank accounts very well just yet, so use a local fixture
    return getResourceAsString("/api_fixtures/bank_account.json");
  }

  @Test
  public void testUpdateOnCustomer() throws StripeException, IOException {
    BankAccountUpdateOnCustomerParams params = BankAccountUpdateOnCustomerParams.builder()
        .putMetadata("key", "value")
        .build();

    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, BANK_ACCOUNT_ID),
        params.toMap(),
        BankAccount.class,
        getBankAccountFixture()
    );

    BankAccount updatedBankAccount = service.update(CUSTOMER_ID, BANK_ACCOUNT_ID,
        params);

    assertNotNull(updatedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", CUSTOMER_ID, BANK_ACCOUNT_ID),
        ImmutableMap.of(
            "metadata", ImmutableMap.of("key", "value")
        )
    );
  }

  @Test
  public void testUpdateOnAccount() throws StripeException, IOException {
    BankAccountUpdateOnAccountParams params = BankAccountUpdateOnAccountParams.builder()
        // not present when updating on customer object
        .setDefaultForCurrency(true)
        .build();

    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, BANK_ACCOUNT_ID),
        params.toMap(),
        BankAccount.class,
        getBankAccountFixture()
    );

    BankAccount updatedBankAccount = service.update(ACCOUNT_ID, BANK_ACCOUNT_ID, params);

    assertNotNull(updatedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/external_accounts/%s", ACCOUNT_ID, BANK_ACCOUNT_ID),
        ImmutableMap.of(
            "default_for_currency", true
        )
    );
  }

  @Test
  public void testVerify() throws StripeException {
    BankAccountVerifyParams params = BankAccountVerifyParams.builder()
        .addAmount(32L)
        .addAmount(45L)
        .build();
    final BankAccount verifiedBankAccount = service.verify(
        CUSTOMER_ID, BANK_ACCOUNT_ID, params);

    assertNotNull(verifiedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s/verify", CUSTOMER_ID, BANK_ACCOUNT_ID),
        params.toMap()
    );
  }
}