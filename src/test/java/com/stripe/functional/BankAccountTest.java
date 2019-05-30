package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.model.Customer;
import com.stripe.model.PaymentSource;
import com.stripe.model.PaymentSourceCollection;
import com.stripe.net.ApiResource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class BankAccountTest extends BaseStripeTest {
  public static final String CUSTOMER_ID = "cus_123";
  public static final String BANK_ACCOUNT_ID = "ba_123";

  private BankAccount getBankAccountFixture(Customer customer) throws IOException, StripeException {
    // stripe-mock doesn't handle bank accounts very well just yet, so use a local fixture
    final BankAccount bankAccount =
        ApiResource.GSON.fromJson(
            getResourceAsString("/api_fixtures/bank_account.json"), BankAccount.class);
    bankAccount.setCustomer(customer.getId());

    return bankAccount;
  }

  @Test
  public void testCreate() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    final Map<String, Object> params = new HashMap<>();
    params.put("source", "btok_123");

    // stripe-mock does not always return a Bank Account so we have to mock
    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params,
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json"));

    final BankAccount bankAccount = (BankAccount) customer.getSources().create(params);

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params);
  }

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    // stripe-mock does not always return a Bank Account so we have to mock
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), BANK_ACCOUNT_ID),
        null,
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json"));

    final BankAccount bankAccount = (BankAccount) customer.getSources().retrieve(BANK_ACCOUNT_ID);

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), BANK_ACCOUNT_ID));
  }

  @Test
  public void testUpdate() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final BankAccount bankAccount = getBankAccountFixture(customer);

    final Map<String, Object> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    // stripe-mock returns a Card instance instead of a BankAccount
    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), bankAccount.getId()),
        params,
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json"));

    final BankAccount updatedBankAccount = bankAccount.update(params);

    assertNotNull(updatedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), bankAccount.getId()),
        params);
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    Map<String, Object> params = new HashMap<>();
    params.put("object", "bank_account");
    params.put("limit", 1);

    // stripe-mock doesn't handle this, so we stub the request
    final BankAccount stubbedBankAccount =
        ApiResource.GSON.fromJson(
            getResourceAsString("/api_fixtures/bank_account.json"), BankAccount.class);
    final PaymentSourceCollection stubbedCollection = new PaymentSourceCollection();
    final List<PaymentSource> stubbedData = new ArrayList<PaymentSource>();
    stubbedData.add(stubbedBankAccount);
    stubbedCollection.setData(stubbedData);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params,
        PaymentSourceCollection.class,
        stubbedCollection.toJson());

    final PaymentSourceCollection sources = customer.getSources().list(params);

    assertNotNull(sources);
    assertEquals(1, sources.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/customers/%s/sources", customer.getId()));

    final BankAccount bankAccount = (BankAccount) sources.getData().get(0);
    assertNotNull(bankAccount);
  }

  @Test
  public void testDelete() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final BankAccount bankAccount = getBankAccountFixture(customer);
    final String deleteBankAccountData =
        String.format(
            "{\"id\": \"%s\", \"object\": \"bank_account\", \"deleted\": true}",
            bankAccount.getId());

    stubRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), bankAccount.getId()),
        null,
        BankAccount.class,
        deleteBankAccountData);
    final BankAccount deletedBankAccount = bankAccount.delete();

    assertNotNull(deletedBankAccount);
    assertTrue(deletedBankAccount.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), bankAccount.getId()));
  }

  @Test
  public void testVerify() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final BankAccount bankAccount = getBankAccountFixture(customer);

    final List<Integer> values = new ArrayList<>();
    values.add(32);
    values.add(45);
    final Map<String, Object> params = new HashMap<>();
    params.put("amounts", values);

    final BankAccount verifiedBankAccount = bankAccount.verify(params);

    assertNotNull(verifiedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s/verify", customer.getId(), bankAccount.getId()),
        params);
  }
}
