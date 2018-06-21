package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.BankAccount;
import com.stripe.model.Customer;
import com.stripe.model.DeletedBankAccount;
import com.stripe.model.ExternalAccount;
import com.stripe.model.ExternalAccountCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class BankAccountTest extends BaseStripeTest {
  public static final String CUSTOMER_ID = "cus_123";
  public static final String BANK_ACCOUNT_ID = "ba_123";

  private static BankAccount getBankAccountFixture(Customer customer) throws StripeException {
    final BankAccount bankAccount = (BankAccount) customer.getSources().retrieve(BANK_ACCOUNT_ID);
    resetNetworkSpy();
    // stripe-mock returns a bank account that is attached to an account rather than a customer,
    // so manually fix that. Hopefully this will no longer be necessary in the future.
    bankAccount.setAccount(null);
    bankAccount.setCustomer(customer.getId());

    return bankAccount;
  }

  @Test
  public void testCreate() throws StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("source", "btok_123");

    final BankAccount bankAccount = (BankAccount) customer.getSources().create(params);

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    final BankAccount bankAccount = (BankAccount) customer.getSources().retrieve(BANK_ACCOUNT_ID);

    assertNotNull(bankAccount);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), BANK_ACCOUNT_ID)
    );
  }

  @Test
  public void testUpdate() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final BankAccount bankAccount = getBankAccountFixture(customer);

    final Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    // stripe-mock returns a Card instance instead of a BankAccount
    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), bankAccount.getId()),
        params,
        BankAccount.class,
        getResourceAsString("/api_fixtures/bank_account.json")
    );

    final BankAccount updatedBankAccount = bankAccount.update(params);

    assertNotNull(updatedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), bankAccount.getId()),
        params
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);

    Map<String, Object> params = new HashMap<String, Object>();
    params.put("object", "bank_account");
    params.put("limit", 1);

    // stripe-mock doesn't handle this, so we stub the request
    final BankAccount stubbedBankAccount = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/bank_account.json"), BankAccount.class);
    final ExternalAccountCollection stubbedCollection = new ExternalAccountCollection();
    final List<ExternalAccount> stubbedData = new ArrayList<ExternalAccount>();
    stubbedData.add(stubbedBankAccount);
    stubbedCollection.setData(stubbedData);
    stubRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", customer.getId()),
        params,
        ExternalAccountCollection.class,
        stubbedCollection.toJson()
    );

    final ExternalAccountCollection externalAccounts = customer.getSources().list(params);

    assertNotNull(externalAccounts);
    assertEquals(1, externalAccounts.getData().size());
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/customers/%s/sources", customer.getId())
    );

    final BankAccount bankAccount = (BankAccount) externalAccounts.getData().get(0);
    assertNotNull(bankAccount);
  }

  @Test
  public void testDelete() throws StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final BankAccount bankAccount = getBankAccountFixture(customer);

    final DeletedBankAccount deletedBankAccount = bankAccount.delete();

    assertNotNull(deletedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", customer.getId(), bankAccount.getId())
    );
  }

  @Test
  public void testVerify() throws StripeException {
    final Customer customer = Customer.retrieve(CUSTOMER_ID);
    final BankAccount bankAccount = getBankAccountFixture(customer);

    final List<Integer> values = new ArrayList<Integer>();
    values.add(32);
    values.add(45);
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("amounts", values);

    final BankAccount verifiedBankAccount = (BankAccount) bankAccount.verify(params);

    assertNotNull(verifiedBankAccount);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/customers/%s/sources/%s/verify", customer.getId(), bankAccount.getId()),
        params
    );
  }
}
