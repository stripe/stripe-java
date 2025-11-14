// File generated from our OpenAPI spec
package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.gson.reflect.TypeToken;
import com.stripe.BaseStripeTest;
import com.stripe.StripeClient;
import com.stripe.exception.*;
import com.stripe.model.*;
import com.stripe.net.*;
import com.stripe.net.ApiResource;
import com.stripe.param.*;
import java.math.BigDecimal;
import java.time.Instant;
import org.junit.jupiter.api.Test;

class GeneratedExamples extends BaseStripeTest {
  @Test
  public void testAccountLinksPost() throws StripeException {
    AccountLinkCreateParams params =
        AccountLinkCreateParams.builder()
            .setAccount("acct_xxxxxxxxxxxxx")
            .setRefreshUrl("https://example.com/reauth")
            .setReturnUrl("https://example.com/return")
            .setType(AccountLinkCreateParams.Type.ACCOUNT_ONBOARDING)
            .build();

    AccountLink accountLink = AccountLink.create(params);
    assertNotNull(accountLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/account_links", params.toMap(), null);
  }

  @Test
  public void testAccountLinksPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountLinkCreateParams params =
        com.stripe.param.AccountLinkCreateParams.builder()
            .setAccount("acct_xxxxxxxxxxxxx")
            .setRefreshUrl("https://example.com/reauth")
            .setReturnUrl("https://example.com/return")
            .setType(com.stripe.param.AccountLinkCreateParams.Type.ACCOUNT_ONBOARDING)
            .build();

    com.stripe.model.AccountLink accountLink = client.v1().accountLinks().create(params);
    assertNotNull(accountLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/account_links", params.toMap(), null);
  }

  @Test
  public void testAccountLinksPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountLinkCreateParams params =
        com.stripe.param.AccountLinkCreateParams.builder()
            .setAccount("acct_xxxxxxxxxxxxx")
            .setRefreshUrl("https://example.com/reauth")
            .setReturnUrl("https://example.com/return")
            .setType(com.stripe.param.AccountLinkCreateParams.Type.ACCOUNT_ONBOARDING)
            .build();

    com.stripe.model.AccountLink accountLink = client.accountLinks().create(params);
    assertNotNull(accountLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/account_links", params.toMap(), null);
  }

  @Test
  public void testAccountsCapabilitiesGet() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountCapabilitiesParams params = AccountCapabilitiesParams.builder().build();

    CapabilityCollection capabilities = resource.capabilities(params);
    assertNotNull(capabilities);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsCapabilitiesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCapabilityListParams params =
        com.stripe.param.AccountCapabilityListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.Capability> stripeCollection =
        client.v1().accounts().capabilities().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsCapabilitiesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCapabilityListParams params =
        com.stripe.param.AccountCapabilityListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.Capability> stripeCollection =
        client.accounts().capabilities().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsCapabilitiesGet2() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Capability capability = account.capabilities().retrieve("card_payments");
    assertNotNull(capability);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments",
        null,
        null);
  }

  @Test
  public void testAccountsCapabilitiesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCapabilityRetrieveParams params =
        com.stripe.param.AccountCapabilityRetrieveParams.builder().build();

    com.stripe.model.Capability capability =
        client
            .v1()
            .accounts()
            .capabilities()
            .retrieve("acct_xxxxxxxxxxxxx", "card_payments", params);
    assertNotNull(capability);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsCapabilitiesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCapabilityRetrieveParams params =
        com.stripe.param.AccountCapabilityRetrieveParams.builder().build();

    com.stripe.model.Capability capability =
        client.accounts().capabilities().retrieve("acct_xxxxxxxxxxxxx", "card_payments", params);
    assertNotNull(capability);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsCapabilitiesPost() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Capability resource = account.capabilities().retrieve("card_payments");

    CapabilityUpdateParams params = CapabilityUpdateParams.builder().setRequested(true).build();

    Capability capability = resource.update(params);
    assertNotNull(capability);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsCapabilitiesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCapabilityUpdateParams params =
        com.stripe.param.AccountCapabilityUpdateParams.builder().setRequested(true).build();

    com.stripe.model.Capability capability =
        client.v1().accounts().capabilities().update("acct_xxxxxxxxxxxxx", "card_payments", params);
    assertNotNull(capability);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsCapabilitiesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCapabilityUpdateParams params =
        com.stripe.param.AccountCapabilityUpdateParams.builder().setRequested(true).build();

    com.stripe.model.Capability capability =
        client.accounts().capabilities().update("acct_xxxxxxxxxxxxx", "card_payments", params);
    assertNotNull(capability);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsDelete() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    Account account = resource.delete();
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Account account = client.v1().accounts().delete("acct_xxxxxxxxxxxxx");
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Account account = client.accounts().delete("acct_xxxxxxxxxxxxx");
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsExternalAccountsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.ExternalAccount externalAccount =
        client.v1().accounts().externalAccounts().delete("acct_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx");
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/ba_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsExternalAccountsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.ExternalAccount externalAccount =
        client.accounts().externalAccounts().delete("acct_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx");
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/ba_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsExternalAccountsDelete2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.ExternalAccount externalAccount =
        client
            .v1()
            .accounts()
            .externalAccounts()
            .delete("acct_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx");
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/card_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsExternalAccountsDelete2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.ExternalAccount externalAccount =
        client.accounts().externalAccounts().delete("acct_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx");
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/card_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsExternalAccountsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountListParams params =
        com.stripe.param.AccountExternalAccountListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.ExternalAccount> stripeCollection =
        client.v1().accounts().externalAccounts().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountListParams params =
        com.stripe.param.AccountExternalAccountListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.ExternalAccount> stripeCollection =
        client.accounts().externalAccounts().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountListParams params =
        com.stripe.param.AccountExternalAccountListParams.builder()
            .setObject("bank_account")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.ExternalAccount> stripeCollection =
        client.v1().accounts().externalAccounts().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountListParams params =
        com.stripe.param.AccountExternalAccountListParams.builder()
            .setObject("bank_account")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.ExternalAccount> stripeCollection =
        client.accounts().externalAccounts().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountListParams params =
        com.stripe.param.AccountExternalAccountListParams.builder()
            .setObject("card")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.ExternalAccount> stripeCollection =
        client.v1().accounts().externalAccounts().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountListParams params =
        com.stripe.param.AccountExternalAccountListParams.builder()
            .setObject("card")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.ExternalAccount> stripeCollection =
        client.accounts().externalAccounts().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountRetrieveParams params =
        com.stripe.param.AccountExternalAccountRetrieveParams.builder().build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .v1()
            .accounts()
            .externalAccounts()
            .retrieve("acct_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountRetrieveParams params =
        com.stripe.param.AccountExternalAccountRetrieveParams.builder().build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .accounts()
            .externalAccounts()
            .retrieve("acct_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet5Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountRetrieveParams params =
        com.stripe.param.AccountExternalAccountRetrieveParams.builder().build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .v1()
            .accounts()
            .externalAccounts()
            .retrieve("acct_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsGet5ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountRetrieveParams params =
        com.stripe.param.AccountExternalAccountRetrieveParams.builder().build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .accounts()
            .externalAccounts()
            .retrieve("acct_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountCreateParams params =
        com.stripe.param.AccountExternalAccountCreateParams.builder()
            .setExternalAccount("btok_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client.v1().accounts().externalAccounts().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountCreateParams params =
        com.stripe.param.AccountExternalAccountCreateParams.builder()
            .setExternalAccount("btok_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client.accounts().externalAccounts().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountCreateParams params =
        com.stripe.param.AccountExternalAccountCreateParams.builder()
            .setExternalAccount("tok_xxxx_debit")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client.v1().accounts().externalAccounts().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountCreateParams params =
        com.stripe.param.AccountExternalAccountCreateParams.builder()
            .setExternalAccount("tok_xxxx_debit")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client.accounts().externalAccounts().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountUpdateParams params =
        com.stripe.param.AccountExternalAccountUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .v1()
            .accounts()
            .externalAccounts()
            .update("acct_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountUpdateParams params =
        com.stripe.param.AccountExternalAccountUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .accounts()
            .externalAccounts()
            .update("acct_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPost4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountUpdateParams params =
        com.stripe.param.AccountExternalAccountUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .v1()
            .accounts()
            .externalAccounts()
            .update("acct_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsExternalAccountsPost4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountExternalAccountUpdateParams params =
        com.stripe.param.AccountExternalAccountUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.ExternalAccount externalAccount =
        client
            .accounts()
            .externalAccounts()
            .update("acct_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(externalAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/external_accounts/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsGet() throws StripeException {
    AccountListParams params = AccountListParams.builder().setLimit(3L).build();

    AccountCollection accounts = Account.list(params);
    assertNotNull(accounts);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/accounts", params.toMap(), null);
  }

  @Test
  public void testAccountsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountListParams params =
        com.stripe.param.AccountListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Account> stripeCollection =
        client.v1().accounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/accounts", params.toMap(), null);
  }

  @Test
  public void testAccountsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountListParams params =
        com.stripe.param.AccountListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Account> stripeCollection =
        client.accounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/accounts", params.toMap(), null);
  }

  @Test
  public void testAccountsGet2() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountRetrieveParams params =
        com.stripe.param.AccountRetrieveParams.builder().build();

    com.stripe.model.Account account =
        client.v1().accounts().retrieve("acct_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountRetrieveParams params =
        com.stripe.param.AccountRetrieveParams.builder().build();

    com.stripe.model.Account account = client.accounts().retrieve("acct_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsLoginLinksPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountLoginLinkCreateParams params =
        com.stripe.param.AccountLoginLinkCreateParams.builder().build();

    com.stripe.model.LoginLink loginLink =
        client.v1().accounts().loginLinks().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(loginLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/login_links",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsLoginLinksPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountLoginLinkCreateParams params =
        com.stripe.param.AccountLoginLinkCreateParams.builder().build();

    com.stripe.model.LoginLink loginLink =
        client.accounts().loginLinks().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(loginLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/login_links",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsDelete() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Person resource = account.persons().retrieve("person_xxxxxxxxxxxxx");

    Person person = resource.delete();
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsPersonsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Person person =
        client.v1().accounts().persons().delete("acct_xxxxxxxxxxxxx", "person_xxxxxxxxxxxxx");
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsPersonsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Person person =
        client.accounts().persons().delete("acct_xxxxxxxxxxxxx", "person_xxxxxxxxxxxxx");
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsPersonsGet() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountPersonsParams params = AccountPersonsParams.builder().setLimit(3L).build();

    PersonCollection persons = resource.persons(params);
    assertNotNull(persons);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonListParams params =
        com.stripe.param.AccountPersonListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Person> stripeCollection =
        client.v1().accounts().persons().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonListParams params =
        com.stripe.param.AccountPersonListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Person> stripeCollection =
        client.accounts().persons().list("acct_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsGet2() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Person person = account.persons().retrieve("person_xxxxxxxxxxxxx");
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testAccountsPersonsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonRetrieveParams params =
        com.stripe.param.AccountPersonRetrieveParams.builder().build();

    com.stripe.model.Person person =
        client
            .v1()
            .accounts()
            .persons()
            .retrieve("acct_xxxxxxxxxxxxx", "person_xxxxxxxxxxxxx", params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonRetrieveParams params =
        com.stripe.param.AccountPersonRetrieveParams.builder().build();

    com.stripe.model.Person person =
        client.accounts().persons().retrieve("acct_xxxxxxxxxxxxx", "person_xxxxxxxxxxxxx", params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsPost() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    PersonCollectionCreateParams params =
        PersonCollectionCreateParams.builder().setFirstName("Jane").setLastName("Diaz").build();

    Person person = account.persons().create(params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonCreateParams params =
        com.stripe.param.AccountPersonCreateParams.builder()
            .setFirstName("Jane")
            .setLastName("Diaz")
            .build();

    com.stripe.model.Person person =
        client.v1().accounts().persons().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonCreateParams params =
        com.stripe.param.AccountPersonCreateParams.builder()
            .setFirstName("Jane")
            .setLastName("Diaz")
            .build();

    com.stripe.model.Person person =
        client.accounts().persons().create("acct_xxxxxxxxxxxxx", params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsPost2() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Person resource = account.persons().retrieve("person_xxxxxxxxxxxxx");

    PersonUpdateParams params =
        PersonUpdateParams.builder().putMetadata("order_id", "6735").build();

    Person person = resource.update(params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonUpdateParams params =
        com.stripe.param.AccountPersonUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.Person person =
        client
            .v1()
            .accounts()
            .persons()
            .update("acct_xxxxxxxxxxxxx", "person_xxxxxxxxxxxxx", params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPersonsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountPersonUpdateParams params =
        com.stripe.param.AccountPersonUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.Person person =
        client.accounts().persons().update("acct_xxxxxxxxxxxxx", "person_xxxxxxxxxxxxx", params);
    assertNotNull(person);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPost() throws StripeException {
    AccountCreateParams params =
        AccountCreateParams.builder()
            .setType(AccountCreateParams.Type.CUSTOM)
            .setCountry("US")
            .setEmail("jenny.rosen@example.com")
            .setCapabilities(
                AccountCreateParams.Capabilities.builder()
                    .setCardPayments(
                        AccountCreateParams.Capabilities.CardPayments.builder()
                            .setRequested(true)
                            .build())
                    .setTransfers(
                        AccountCreateParams.Capabilities.Transfers.builder()
                            .setRequested(true)
                            .build())
                    .build())
            .build();

    Account account = Account.create(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/accounts", params.toMap(), null);
  }

  @Test
  public void testAccountsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCreateParams params =
        com.stripe.param.AccountCreateParams.builder()
            .setType(com.stripe.param.AccountCreateParams.Type.CUSTOM)
            .setCountry("US")
            .setEmail("jenny.rosen@example.com")
            .setCapabilities(
                com.stripe.param.AccountCreateParams.Capabilities.builder()
                    .setCardPayments(
                        com.stripe.param.AccountCreateParams.Capabilities.CardPayments.builder()
                            .setRequested(true)
                            .build())
                    .setTransfers(
                        com.stripe.param.AccountCreateParams.Capabilities.Transfers.builder()
                            .setRequested(true)
                            .build())
                    .build())
            .build();

    com.stripe.model.Account account = client.v1().accounts().create(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/accounts", params.toMap(), null);
  }

  @Test
  public void testAccountsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountCreateParams params =
        com.stripe.param.AccountCreateParams.builder()
            .setType(com.stripe.param.AccountCreateParams.Type.CUSTOM)
            .setCountry("US")
            .setEmail("jenny.rosen@example.com")
            .setCapabilities(
                com.stripe.param.AccountCreateParams.Capabilities.builder()
                    .setCardPayments(
                        com.stripe.param.AccountCreateParams.Capabilities.CardPayments.builder()
                            .setRequested(true)
                            .build())
                    .setTransfers(
                        com.stripe.param.AccountCreateParams.Capabilities.Transfers.builder()
                            .setRequested(true)
                            .build())
                    .build())
            .build();

    com.stripe.model.Account account = client.accounts().create(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/accounts", params.toMap(), null);
  }

  @Test
  public void testAccountsPost2() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountUpdateParams params =
        AccountUpdateParams.builder().putMetadata("order_id", "6735").build();

    Account account = resource.update(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountUpdateParams params =
        com.stripe.param.AccountUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Account account = client.v1().accounts().update("acct_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountUpdateParams params =
        com.stripe.param.AccountUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Account account = client.accounts().update("acct_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsRejectPost() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountRejectParams params = AccountRejectParams.builder().setReason("fraud").build();

    Account account = resource.reject(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/reject",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsRejectPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountRejectParams params =
        com.stripe.param.AccountRejectParams.builder().setReason("fraud").build();

    com.stripe.model.Account account = client.v1().accounts().reject("acct_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/reject",
        params.toMap(),
        null);
  }

  @Test
  public void testAccountsRejectPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.AccountRejectParams params =
        com.stripe.param.AccountRejectParams.builder().setReason("fraud").build();

    com.stripe.model.Account account = client.accounts().reject("acct_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/reject",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesGet() throws StripeException {
    ApplicationFeeListParams params = ApplicationFeeListParams.builder().setLimit(3L).build();

    ApplicationFeeCollection applicationFees = ApplicationFee.list(params);
    assertNotNull(applicationFees);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeListParams params =
        com.stripe.param.ApplicationFeeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.ApplicationFee> stripeCollection =
        client.v1().applicationFees().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeListParams params =
        com.stripe.param.ApplicationFeeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.ApplicationFee> stripeCollection =
        client.applicationFees().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesGet2() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");
    assertNotNull(applicationFee);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testApplicationFeesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRetrieveParams params =
        com.stripe.param.ApplicationFeeRetrieveParams.builder().build();

    com.stripe.model.ApplicationFee applicationFee =
        client.v1().applicationFees().retrieve("fee_xxxxxxxxxxxxx", params);
    assertNotNull(applicationFee);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRetrieveParams params =
        com.stripe.param.ApplicationFeeRetrieveParams.builder().build();

    com.stripe.model.ApplicationFee applicationFee =
        client.applicationFees().retrieve("fee_xxxxxxxxxxxxx", params);
    assertNotNull(applicationFee);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsGet() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");

    FeeRefundCollectionListParams params =
        FeeRefundCollectionListParams.builder().setLimit(3L).build();

    FeeRefundCollection feeRefunds = applicationFee.getRefunds().list(params);
    assertNotNull(feeRefunds);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundListParams params =
        com.stripe.param.ApplicationFeeRefundListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.FeeRefund> stripeCollection =
        client.v1().applicationFees().refunds().list("fee_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundListParams params =
        com.stripe.param.ApplicationFeeRefundListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.FeeRefund> stripeCollection =
        client.applicationFees().refunds().list("fee_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsGet2() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");

    FeeRefund feeRefund = applicationFee.getRefunds().retrieve("fr_xxxxxxxxxxxxx");
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testApplicationFeesRefundsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundRetrieveParams params =
        com.stripe.param.ApplicationFeeRefundRetrieveParams.builder().build();

    com.stripe.model.FeeRefund feeRefund =
        client
            .v1()
            .applicationFees()
            .refunds()
            .retrieve("fee_xxxxxxxxxxxxx", "fr_xxxxxxxxxxxxx", params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundRetrieveParams params =
        com.stripe.param.ApplicationFeeRefundRetrieveParams.builder().build();

    com.stripe.model.FeeRefund feeRefund =
        client
            .applicationFees()
            .refunds()
            .retrieve("fee_xxxxxxxxxxxxx", "fr_xxxxxxxxxxxxx", params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsPost() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");

    FeeRefundCollectionCreateParams params = FeeRefundCollectionCreateParams.builder().build();

    FeeRefund feeRefund = applicationFee.getRefunds().create(params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundCreateParams params =
        com.stripe.param.ApplicationFeeRefundCreateParams.builder().build();

    com.stripe.model.FeeRefund feeRefund =
        client.v1().applicationFees().refunds().create("fee_xxxxxxxxxxxxx", params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundCreateParams params =
        com.stripe.param.ApplicationFeeRefundCreateParams.builder().build();

    com.stripe.model.FeeRefund feeRefund =
        client.applicationFees().refunds().create("fee_xxxxxxxxxxxxx", params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsPost2() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");

    FeeRefund resource = applicationFee.getRefunds().retrieve("fr_xxxxxxxxxxxxx");

    FeeRefundUpdateParams params =
        FeeRefundUpdateParams.builder().putMetadata("order_id", "6735").build();

    FeeRefund feeRefund = resource.update(params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundUpdateParams params =
        com.stripe.param.ApplicationFeeRefundUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.FeeRefund feeRefund =
        client
            .v1()
            .applicationFees()
            .refunds()
            .update("fee_xxxxxxxxxxxxx", "fr_xxxxxxxxxxxxx", params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testApplicationFeesRefundsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ApplicationFeeRefundUpdateParams params =
        com.stripe.param.ApplicationFeeRefundUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.FeeRefund feeRefund =
        client.applicationFees().refunds().update("fee_xxxxxxxxxxxxx", "fr_xxxxxxxxxxxxx", params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testAppsSecretsDeletePost() throws StripeException {
    com.stripe.param.apps.SecretDeleteWhereParams params =
        com.stripe.param.apps.SecretDeleteWhereParams.builder()
            .setName("my-api-key")
            .setScope(
                com.stripe.param.apps.SecretDeleteWhereParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretDeleteWhereParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = com.stripe.model.apps.Secret.deleteWhere(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/apps/secrets/delete",
        params.toMap(),
        null);
  }

  @Test
  public void testAppsSecretsDeletePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretDeleteWhereParams params =
        com.stripe.param.apps.SecretDeleteWhereParams.builder()
            .setName("my-api-key")
            .setScope(
                com.stripe.param.apps.SecretDeleteWhereParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretDeleteWhereParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.v1().apps().secrets().deleteWhere(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/apps/secrets/delete",
        params.toMap(),
        null);
  }

  @Test
  public void testAppsSecretsDeletePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretDeleteWhereParams params =
        com.stripe.param.apps.SecretDeleteWhereParams.builder()
            .setName("my-api-key")
            .setScope(
                com.stripe.param.apps.SecretDeleteWhereParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretDeleteWhereParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.apps().secrets().deleteWhere(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/apps/secrets/delete",
        params.toMap(),
        null);
  }

  @Test
  public void testAppsSecretsFindGet() throws StripeException {
    com.stripe.param.apps.SecretFindParams params =
        com.stripe.param.apps.SecretFindParams.builder()
            .setName("sec_123")
            .setScope(
                com.stripe.param.apps.SecretFindParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretFindParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = com.stripe.model.apps.Secret.find(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/apps/secrets/find",
        params.toMap(),
        null);
  }

  @Test
  public void testAppsSecretsFindGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretFindParams params =
        com.stripe.param.apps.SecretFindParams.builder()
            .setName("sec_123")
            .setScope(
                com.stripe.param.apps.SecretFindParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretFindParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.v1().apps().secrets().find(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/apps/secrets/find",
        params.toMap(),
        null);
  }

  @Test
  public void testAppsSecretsFindGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretFindParams params =
        com.stripe.param.apps.SecretFindParams.builder()
            .setName("sec_123")
            .setScope(
                com.stripe.param.apps.SecretFindParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretFindParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.apps().secrets().find(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/apps/secrets/find",
        params.toMap(),
        null);
  }

  @Test
  public void testAppsSecretsGet() throws StripeException {
    com.stripe.param.apps.SecretListParams params =
        com.stripe.param.apps.SecretListParams.builder()
            .setScope(
                com.stripe.param.apps.SecretListParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretListParams.Scope.Type.ACCOUNT)
                    .build())
            .setLimit(2L)
            .build();

    com.stripe.model.apps.SecretCollection secrets = com.stripe.model.apps.Secret.list(params);
    assertNotNull(secrets);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretListParams params =
        com.stripe.param.apps.SecretListParams.builder()
            .setScope(
                com.stripe.param.apps.SecretListParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretListParams.Scope.Type.ACCOUNT)
                    .build())
            .setLimit(2L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.apps.Secret> stripeCollection =
        client.v1().apps().secrets().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretListParams params =
        com.stripe.param.apps.SecretListParams.builder()
            .setScope(
                com.stripe.param.apps.SecretListParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretListParams.Scope.Type.ACCOUNT)
                    .build())
            .setLimit(2L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.apps.Secret> stripeCollection =
        client.apps().secrets().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsGet2() throws StripeException {
    com.stripe.param.apps.SecretListParams params =
        com.stripe.param.apps.SecretListParams.builder()
            .setScope(
                com.stripe.param.apps.SecretListParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretListParams.Scope.Type.ACCOUNT)
                    .build())
            .setLimit(2L)
            .build();

    com.stripe.model.apps.SecretCollection secrets = com.stripe.model.apps.Secret.list(params);
    assertNotNull(secrets);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretListParams params =
        com.stripe.param.apps.SecretListParams.builder()
            .setScope(
                com.stripe.param.apps.SecretListParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretListParams.Scope.Type.ACCOUNT)
                    .build())
            .setLimit(2L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.apps.Secret> stripeCollection =
        client.v1().apps().secrets().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretListParams params =
        com.stripe.param.apps.SecretListParams.builder()
            .setScope(
                com.stripe.param.apps.SecretListParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretListParams.Scope.Type.ACCOUNT)
                    .build())
            .setLimit(2L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.apps.Secret> stripeCollection =
        client.apps().secrets().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsPost() throws StripeException {
    com.stripe.param.apps.SecretCreateParams params =
        com.stripe.param.apps.SecretCreateParams.builder()
            .setName("sec_123")
            .setPayload("very secret string")
            .setScope(
                com.stripe.param.apps.SecretCreateParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretCreateParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = com.stripe.model.apps.Secret.create(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretCreateParams params =
        com.stripe.param.apps.SecretCreateParams.builder()
            .setName("sec_123")
            .setPayload("very secret string")
            .setScope(
                com.stripe.param.apps.SecretCreateParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretCreateParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.v1().apps().secrets().create(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretCreateParams params =
        com.stripe.param.apps.SecretCreateParams.builder()
            .setName("sec_123")
            .setPayload("very secret string")
            .setScope(
                com.stripe.param.apps.SecretCreateParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretCreateParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.apps().secrets().create(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsPost2() throws StripeException {
    com.stripe.param.apps.SecretCreateParams params =
        com.stripe.param.apps.SecretCreateParams.builder()
            .setName("my-api-key")
            .setPayload("secret_key_xxxxxx")
            .setScope(
                com.stripe.param.apps.SecretCreateParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretCreateParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = com.stripe.model.apps.Secret.create(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretCreateParams params =
        com.stripe.param.apps.SecretCreateParams.builder()
            .setName("my-api-key")
            .setPayload("secret_key_xxxxxx")
            .setScope(
                com.stripe.param.apps.SecretCreateParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretCreateParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.v1().apps().secrets().create(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testAppsSecretsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.apps.SecretCreateParams params =
        com.stripe.param.apps.SecretCreateParams.builder()
            .setName("my-api-key")
            .setPayload("secret_key_xxxxxx")
            .setScope(
                com.stripe.param.apps.SecretCreateParams.Scope.builder()
                    .setType(com.stripe.param.apps.SecretCreateParams.Scope.Type.ACCOUNT)
                    .build())
            .build();

    com.stripe.model.apps.Secret secret = client.apps().secrets().create(params);
    assertNotNull(secret);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap(), null);
  }

  @Test
  public void testBalanceTransactionsGet() throws StripeException {
    BalanceTransactionListParams params =
        BalanceTransactionListParams.builder().setLimit(3L).build();

    BalanceTransactionCollection balanceTransactions = BalanceTransaction.list(params);
    assertNotNull(balanceTransactions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testBalanceTransactionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.BalanceTransactionListParams params =
        com.stripe.param.BalanceTransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.BalanceTransaction> stripeCollection =
        client.v1().balanceTransactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testBalanceTransactionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.BalanceTransactionListParams params =
        com.stripe.param.BalanceTransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.BalanceTransaction> stripeCollection =
        client.balanceTransactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testBalanceTransactionsGet2() throws StripeException {
    BalanceTransaction balanceTransaction = BalanceTransaction.retrieve("txn_xxxxxxxxxxxxx");
    assertNotNull(balanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/balance_transactions/txn_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testBalanceTransactionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.BalanceTransactionRetrieveParams params =
        com.stripe.param.BalanceTransactionRetrieveParams.builder().build();

    com.stripe.model.BalanceTransaction balanceTransaction =
        client.v1().balanceTransactions().retrieve("txn_xxxxxxxxxxxxx", params);
    assertNotNull(balanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/balance_transactions/txn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testBalanceTransactionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.BalanceTransactionRetrieveParams params =
        com.stripe.param.BalanceTransactionRetrieveParams.builder().build();

    com.stripe.model.BalanceTransaction balanceTransaction =
        client.balanceTransactions().retrieve("txn_xxxxxxxxxxxxx", params);
    assertNotNull(balanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/balance_transactions/txn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsGet() throws StripeException {
    com.stripe.param.billingportal.ConfigurationListParams params =
        com.stripe.param.billingportal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.billingportal.ConfigurationCollection configurations =
        com.stripe.model.billingportal.Configuration.list(params);
    assertNotNull(configurations);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/billing_portal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationListParams params =
        com.stripe.param.billingportal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.billingportal.Configuration>
        stripeCollection = client.v1().billingPortal().configurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/billing_portal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationListParams params =
        com.stripe.param.billingportal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.billingportal.Configuration>
        stripeCollection = client.billingPortal().configurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/billing_portal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsGet2() throws StripeException {
    com.stripe.model.billingportal.Configuration configuration =
        com.stripe.model.billingportal.Configuration.retrieve("bpc_xxxxxxxxxxxxx");
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testBillingPortalConfigurationsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationRetrieveParams params =
        com.stripe.param.billingportal.ConfigurationRetrieveParams.builder().build();

    com.stripe.model.billingportal.Configuration configuration =
        client.v1().billingPortal().configurations().retrieve("bpc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationRetrieveParams params =
        com.stripe.param.billingportal.ConfigurationRetrieveParams.builder().build();

    com.stripe.model.billingportal.Configuration configuration =
        client.billingPortal().configurations().retrieve("bpc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsPost() throws StripeException {
    com.stripe.param.billingportal.ConfigurationCreateParams params =
        com.stripe.param.billingportal.ConfigurationCreateParams.builder()
            .setFeatures(
                com.stripe.param.billingportal.ConfigurationCreateParams.Features.builder()
                    .setCustomerUpdate(
                        com.stripe.param.billingportal.ConfigurationCreateParams.Features
                            .CustomerUpdate.builder()
                            .addAllowedUpdate(
                                com.stripe.param.billingportal.ConfigurationCreateParams.Features
                                    .CustomerUpdate.AllowedUpdate.EMAIL)
                            .addAllowedUpdate(
                                com.stripe.param.billingportal.ConfigurationCreateParams.Features
                                    .CustomerUpdate.AllowedUpdate.TAX_ID)
                            .setEnabled(true)
                            .build())
                    .setInvoiceHistory(
                        com.stripe.param.billingportal.ConfigurationCreateParams.Features
                            .InvoiceHistory.builder()
                            .setEnabled(true)
                            .build())
                    .build())
            .setBusinessProfile(
                com.stripe.param.billingportal.ConfigurationCreateParams.BusinessProfile.builder()
                    .setPrivacyPolicyUrl("https://example.com/privacy")
                    .setTermsOfServiceUrl("https://example.com/terms")
                    .build())
            .build();

    com.stripe.model.billingportal.Configuration configuration =
        com.stripe.model.billingportal.Configuration.create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationCreateParams params =
        com.stripe.param.billingportal.ConfigurationCreateParams.builder()
            .setFeatures(
                com.stripe.param.billingportal.ConfigurationCreateParams.Features.builder()
                    .setCustomerUpdate(
                        com.stripe.param.billingportal.ConfigurationCreateParams.Features
                            .CustomerUpdate.builder()
                            .addAllowedUpdate(
                                com.stripe.param.billingportal.ConfigurationCreateParams.Features
                                    .CustomerUpdate.AllowedUpdate.EMAIL)
                            .addAllowedUpdate(
                                com.stripe.param.billingportal.ConfigurationCreateParams.Features
                                    .CustomerUpdate.AllowedUpdate.TAX_ID)
                            .setEnabled(true)
                            .build())
                    .setInvoiceHistory(
                        com.stripe.param.billingportal.ConfigurationCreateParams.Features
                            .InvoiceHistory.builder()
                            .setEnabled(true)
                            .build())
                    .build())
            .setBusinessProfile(
                com.stripe.param.billingportal.ConfigurationCreateParams.BusinessProfile.builder()
                    .setPrivacyPolicyUrl("https://example.com/privacy")
                    .setTermsOfServiceUrl("https://example.com/terms")
                    .build())
            .build();

    com.stripe.model.billingportal.Configuration configuration =
        client.v1().billingPortal().configurations().create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationCreateParams params =
        com.stripe.param.billingportal.ConfigurationCreateParams.builder()
            .setFeatures(
                com.stripe.param.billingportal.ConfigurationCreateParams.Features.builder()
                    .setCustomerUpdate(
                        com.stripe.param.billingportal.ConfigurationCreateParams.Features
                            .CustomerUpdate.builder()
                            .addAllowedUpdate(
                                com.stripe.param.billingportal.ConfigurationCreateParams.Features
                                    .CustomerUpdate.AllowedUpdate.EMAIL)
                            .addAllowedUpdate(
                                com.stripe.param.billingportal.ConfigurationCreateParams.Features
                                    .CustomerUpdate.AllowedUpdate.TAX_ID)
                            .setEnabled(true)
                            .build())
                    .setInvoiceHistory(
                        com.stripe.param.billingportal.ConfigurationCreateParams.Features
                            .InvoiceHistory.builder()
                            .setEnabled(true)
                            .build())
                    .build())
            .setBusinessProfile(
                com.stripe.param.billingportal.ConfigurationCreateParams.BusinessProfile.builder()
                    .setPrivacyPolicyUrl("https://example.com/privacy")
                    .setTermsOfServiceUrl("https://example.com/terms")
                    .build())
            .build();

    com.stripe.model.billingportal.Configuration configuration =
        client.billingPortal().configurations().create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsPost2() throws StripeException {
    com.stripe.model.billingportal.Configuration resource =
        com.stripe.model.billingportal.Configuration.retrieve("bpc_xxxxxxxxxxxxx");

    com.stripe.param.billingportal.ConfigurationUpdateParams params =
        com.stripe.param.billingportal.ConfigurationUpdateParams.builder()
            .setBusinessProfile(
                com.stripe.param.billingportal.ConfigurationUpdateParams.BusinessProfile.builder()
                    .setPrivacyPolicyUrl("https://example.com/privacy")
                    .setTermsOfServiceUrl("https://example.com/terms")
                    .build())
            .build();

    com.stripe.model.billingportal.Configuration configuration = resource.update(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationUpdateParams params =
        com.stripe.param.billingportal.ConfigurationUpdateParams.builder()
            .setBusinessProfile(
                com.stripe.param.billingportal.ConfigurationUpdateParams.BusinessProfile.builder()
                    .setPrivacyPolicyUrl("https://example.com/privacy")
                    .setTermsOfServiceUrl("https://example.com/terms")
                    .build())
            .build();

    com.stripe.model.billingportal.Configuration configuration =
        client.v1().billingPortal().configurations().update("bpc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalConfigurationsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.ConfigurationUpdateParams params =
        com.stripe.param.billingportal.ConfigurationUpdateParams.builder()
            .setBusinessProfile(
                com.stripe.param.billingportal.ConfigurationUpdateParams.BusinessProfile.builder()
                    .setPrivacyPolicyUrl("https://example.com/privacy")
                    .setTermsOfServiceUrl("https://example.com/terms")
                    .build())
            .build();

    com.stripe.model.billingportal.Configuration configuration =
        client.billingPortal().configurations().update("bpc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalSessionsPost() throws StripeException {
    com.stripe.param.billingportal.SessionCreateParams params =
        com.stripe.param.billingportal.SessionCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setReturnUrl("https://example.com/account")
            .build();

    com.stripe.model.billingportal.Session session =
        com.stripe.model.billingportal.Session.create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalSessionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.SessionCreateParams params =
        com.stripe.param.billingportal.SessionCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setReturnUrl("https://example.com/account")
            .build();

    com.stripe.model.billingportal.Session session =
        client.v1().billingPortal().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testBillingPortalSessionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.billingportal.SessionCreateParams params =
        com.stripe.param.billingportal.SessionCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setReturnUrl("https://example.com/account")
            .build();

    com.stripe.model.billingportal.Session session =
        client.billingPortal().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesCapturePost() throws StripeException {
    Charge resource = Charge.retrieve("ch_xxxxxxxxxxxxx");

    ChargeCaptureParams params = ChargeCaptureParams.builder().build();

    Charge charge = resource.capture(params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/charges/ch_xxxxxxxxxxxxx/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesCapturePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeCaptureParams params =
        com.stripe.param.ChargeCaptureParams.builder().build();

    com.stripe.model.Charge charge = client.v1().charges().capture("ch_xxxxxxxxxxxxx", params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/charges/ch_xxxxxxxxxxxxx/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesCapturePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeCaptureParams params =
        com.stripe.param.ChargeCaptureParams.builder().build();

    com.stripe.model.Charge charge = client.charges().capture("ch_xxxxxxxxxxxxx", params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/charges/ch_xxxxxxxxxxxxx/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesGet() throws StripeException {
    ChargeListParams params = ChargeListParams.builder().setLimit(3L).build();

    ChargeCollection charges = Charge.list(params);
    assertNotNull(charges);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges", params.toMap(), null);
  }

  @Test
  public void testChargesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeListParams params =
        com.stripe.param.ChargeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Charge> stripeCollection =
        client.v1().charges().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges", params.toMap(), null);
  }

  @Test
  public void testChargesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeListParams params =
        com.stripe.param.ChargeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Charge> stripeCollection =
        client.charges().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges", params.toMap(), null);
  }

  @Test
  public void testChargesGet2() throws StripeException {
    Charge charge = Charge.retrieve("ch_xxxxxxxxxxxxx");
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges/ch_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testChargesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeRetrieveParams params =
        com.stripe.param.ChargeRetrieveParams.builder().build();

    com.stripe.model.Charge charge = client.v1().charges().retrieve("ch_xxxxxxxxxxxxx", params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/charges/ch_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeRetrieveParams params =
        com.stripe.param.ChargeRetrieveParams.builder().build();

    com.stripe.model.Charge charge = client.charges().retrieve("ch_xxxxxxxxxxxxx", params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/charges/ch_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesPost() throws StripeException {
    ChargeCreateParams params =
        ChargeCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setSource("tok_xxxx")
            .setDescription(
                "My First Test Charge (created for API docs at https://www.stripe.com/docs/api)")
            .build();

    Charge charge = Charge.create(params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/charges", params.toMap(), null);
  }

  @Test
  public void testChargesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeCreateParams params =
        com.stripe.param.ChargeCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setSource("tok_xxxx")
            .setDescription(
                "My First Test Charge (created for API docs at https://www.stripe.com/docs/api)")
            .build();

    com.stripe.model.Charge charge = client.v1().charges().create(params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/charges", params.toMap(), null);
  }

  @Test
  public void testChargesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeCreateParams params =
        com.stripe.param.ChargeCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setSource("tok_xxxx")
            .setDescription(
                "My First Test Charge (created for API docs at https://www.stripe.com/docs/api)")
            .build();

    com.stripe.model.Charge charge = client.charges().create(params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/charges", params.toMap(), null);
  }

  @Test
  public void testChargesPost2() throws StripeException {
    Charge resource = Charge.retrieve("ch_xxxxxxxxxxxxx");

    ChargeUpdateParams params =
        ChargeUpdateParams.builder().putMetadata("order_id", "6735").build();

    Charge charge = resource.update(params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/charges/ch_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeUpdateParams params =
        com.stripe.param.ChargeUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Charge charge = client.v1().charges().update("ch_xxxxxxxxxxxxx", params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/charges/ch_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeUpdateParams params =
        com.stripe.param.ChargeUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Charge charge = client.charges().update("ch_xxxxxxxxxxxxx", params);
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/charges/ch_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testChargesSearchGet() throws StripeException {
    ChargeSearchParams params =
        ChargeSearchParams.builder().setQuery("amount>999 AND metadata['order_id']:'6735'").build();

    ChargeSearchResult charges = Charge.search(params);
    assertNotNull(charges);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges/search", params.toMap(), null);
  }

  @Test
  public void testChargesSearchGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeSearchParams params =
        com.stripe.param.ChargeSearchParams.builder()
            .setQuery("amount>999 AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Charge> stripeSearchResult =
        client.v1().charges().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges/search", params.toMap(), null);
  }

  @Test
  public void testChargesSearchGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ChargeSearchParams params =
        com.stripe.param.ChargeSearchParams.builder()
            .setQuery("amount>999 AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Charge> stripeSearchResult =
        client.charges().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges/search", params.toMap(), null);
  }

  @Test
  public void testCheckoutSessionsExpirePost() throws StripeException {
    com.stripe.model.checkout.Session resource =
        com.stripe.model.checkout.Session.retrieve("sess_xyz");

    com.stripe.param.checkout.SessionExpireParams params =
        com.stripe.param.checkout.SessionExpireParams.builder().build();

    com.stripe.model.checkout.Session session = resource.expire(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions/sess_xyz/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsExpirePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionExpireParams params =
        com.stripe.param.checkout.SessionExpireParams.builder().build();

    com.stripe.model.checkout.Session session =
        client.v1().checkout().sessions().expire("sess_xyz", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions/sess_xyz/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsExpirePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionExpireParams params =
        com.stripe.param.checkout.SessionExpireParams.builder().build();

    com.stripe.model.checkout.Session session =
        client.checkout().sessions().expire("sess_xyz", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions/sess_xyz/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsExpirePost2() throws StripeException {
    com.stripe.model.checkout.Session resource =
        com.stripe.model.checkout.Session.retrieve("cs_test_xxxxxxxxxxxxx");

    com.stripe.param.checkout.SessionExpireParams params =
        com.stripe.param.checkout.SessionExpireParams.builder().build();

    com.stripe.model.checkout.Session session = resource.expire(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsExpirePost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionExpireParams params =
        com.stripe.param.checkout.SessionExpireParams.builder().build();

    com.stripe.model.checkout.Session session =
        client.v1().checkout().sessions().expire("cs_test_xxxxxxxxxxxxx", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsExpirePost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionExpireParams params =
        com.stripe.param.checkout.SessionExpireParams.builder().build();

    com.stripe.model.checkout.Session session =
        client.checkout().sessions().expire("cs_test_xxxxxxxxxxxxx", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsGet() throws StripeException {
    com.stripe.param.checkout.SessionListParams params =
        com.stripe.param.checkout.SessionListParams.builder().setLimit(3L).build();

    com.stripe.model.checkout.SessionCollection sessions =
        com.stripe.model.checkout.Session.list(params);
    assertNotNull(sessions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionListParams params =
        com.stripe.param.checkout.SessionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.checkout.Session> stripeCollection =
        client.v1().checkout().sessions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionListParams params =
        com.stripe.param.checkout.SessionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.checkout.Session> stripeCollection =
        client.checkout().sessions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsGet2() throws StripeException {
    com.stripe.model.checkout.Session session =
        com.stripe.model.checkout.Session.retrieve("cs_test_xxxxxxxxxxxxx");
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCheckoutSessionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionRetrieveParams params =
        com.stripe.param.checkout.SessionRetrieveParams.builder().build();

    com.stripe.model.checkout.Session session =
        client.v1().checkout().sessions().retrieve("cs_test_xxxxxxxxxxxxx", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionRetrieveParams params =
        com.stripe.param.checkout.SessionRetrieveParams.builder().build();

    com.stripe.model.checkout.Session session =
        client.checkout().sessions().retrieve("cs_test_xxxxxxxxxxxxx", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsLineItemsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionLineItemListParams params =
        com.stripe.param.checkout.SessionLineItemListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.LineItem> stripeCollection =
        client.v1().checkout().sessions().lineItems().list("sess_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions/sess_xyz/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsLineItemsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionLineItemListParams params =
        com.stripe.param.checkout.SessionLineItemListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.LineItem> stripeCollection =
        client.checkout().sessions().lineItems().list("sess_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/checkout/sessions/sess_xyz/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsPost() throws StripeException {
    com.stripe.param.checkout.SessionCreateParams params =
        com.stripe.param.checkout.SessionCreateParams.builder()
            .setSuccessUrl("https://example.com/success")
            .setCancelUrl("https://example.com/cancel")
            .setMode(com.stripe.param.checkout.SessionCreateParams.Mode.PAYMENT)
            .addShippingOption(
                com.stripe.param.checkout.SessionCreateParams.ShippingOption.builder()
                    .setShippingRate("shr_standard")
                    .build())
            .addShippingOption(
                com.stripe.param.checkout.SessionCreateParams.ShippingOption.builder()
                    .setShippingRateData(
                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                            .ShippingRateData.builder()
                            .setDisplayName("Standard")
                            .setDeliveryEstimate(
                                com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                    .ShippingRateData.DeliveryEstimate.builder()
                                    .setMinimum(
                                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                            .ShippingRateData.DeliveryEstimate.Minimum.builder()
                                            .setUnit(
                                                com.stripe.param.checkout.SessionCreateParams
                                                    .ShippingOption.ShippingRateData
                                                    .DeliveryEstimate.Minimum.Unit.DAY)
                                            .setValue(5L)
                                            .build())
                                    .setMaximum(
                                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                            .ShippingRateData.DeliveryEstimate.Maximum.builder()
                                            .setUnit(
                                                com.stripe.param.checkout.SessionCreateParams
                                                    .ShippingOption.ShippingRateData
                                                    .DeliveryEstimate.Maximum.Unit.DAY)
                                            .setValue(7L)
                                            .build())
                                    .build())
                            .build())
                    .build())
            .build();

    com.stripe.model.checkout.Session session = com.stripe.model.checkout.Session.create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionCreateParams params =
        com.stripe.param.checkout.SessionCreateParams.builder()
            .setSuccessUrl("https://example.com/success")
            .setCancelUrl("https://example.com/cancel")
            .setMode(com.stripe.param.checkout.SessionCreateParams.Mode.PAYMENT)
            .addShippingOption(
                com.stripe.param.checkout.SessionCreateParams.ShippingOption.builder()
                    .setShippingRate("shr_standard")
                    .build())
            .addShippingOption(
                com.stripe.param.checkout.SessionCreateParams.ShippingOption.builder()
                    .setShippingRateData(
                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                            .ShippingRateData.builder()
                            .setDisplayName("Standard")
                            .setDeliveryEstimate(
                                com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                    .ShippingRateData.DeliveryEstimate.builder()
                                    .setMinimum(
                                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                            .ShippingRateData.DeliveryEstimate.Minimum.builder()
                                            .setUnit(
                                                com.stripe.param.checkout.SessionCreateParams
                                                    .ShippingOption.ShippingRateData
                                                    .DeliveryEstimate.Minimum.Unit.DAY)
                                            .setValue(5L)
                                            .build())
                                    .setMaximum(
                                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                            .ShippingRateData.DeliveryEstimate.Maximum.builder()
                                            .setUnit(
                                                com.stripe.param.checkout.SessionCreateParams
                                                    .ShippingOption.ShippingRateData
                                                    .DeliveryEstimate.Maximum.Unit.DAY)
                                            .setValue(7L)
                                            .build())
                                    .build())
                            .build())
                    .build())
            .build();

    com.stripe.model.checkout.Session session = client.v1().checkout().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionCreateParams params =
        com.stripe.param.checkout.SessionCreateParams.builder()
            .setSuccessUrl("https://example.com/success")
            .setCancelUrl("https://example.com/cancel")
            .setMode(com.stripe.param.checkout.SessionCreateParams.Mode.PAYMENT)
            .addShippingOption(
                com.stripe.param.checkout.SessionCreateParams.ShippingOption.builder()
                    .setShippingRate("shr_standard")
                    .build())
            .addShippingOption(
                com.stripe.param.checkout.SessionCreateParams.ShippingOption.builder()
                    .setShippingRateData(
                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                            .ShippingRateData.builder()
                            .setDisplayName("Standard")
                            .setDeliveryEstimate(
                                com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                    .ShippingRateData.DeliveryEstimate.builder()
                                    .setMinimum(
                                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                            .ShippingRateData.DeliveryEstimate.Minimum.builder()
                                            .setUnit(
                                                com.stripe.param.checkout.SessionCreateParams
                                                    .ShippingOption.ShippingRateData
                                                    .DeliveryEstimate.Minimum.Unit.DAY)
                                            .setValue(5L)
                                            .build())
                                    .setMaximum(
                                        com.stripe.param.checkout.SessionCreateParams.ShippingOption
                                            .ShippingRateData.DeliveryEstimate.Maximum.builder()
                                            .setUnit(
                                                com.stripe.param.checkout.SessionCreateParams
                                                    .ShippingOption.ShippingRateData
                                                    .DeliveryEstimate.Maximum.Unit.DAY)
                                            .setValue(7L)
                                            .build())
                                    .build())
                            .build())
                    .build())
            .build();

    com.stripe.model.checkout.Session session = client.checkout().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsPost2() throws StripeException {
    com.stripe.param.checkout.SessionCreateParams params =
        com.stripe.param.checkout.SessionCreateParams.builder()
            .setSuccessUrl("https://example.com/success")
            .addLineItem(
                com.stripe.param.checkout.SessionCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(2L)
                    .build())
            .setMode(com.stripe.param.checkout.SessionCreateParams.Mode.PAYMENT)
            .build();

    com.stripe.model.checkout.Session session = com.stripe.model.checkout.Session.create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionCreateParams params =
        com.stripe.param.checkout.SessionCreateParams.builder()
            .setSuccessUrl("https://example.com/success")
            .addLineItem(
                com.stripe.param.checkout.SessionCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(2L)
                    .build())
            .setMode(com.stripe.param.checkout.SessionCreateParams.Mode.PAYMENT)
            .build();

    com.stripe.model.checkout.Session session = client.v1().checkout().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCheckoutSessionsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.checkout.SessionCreateParams params =
        com.stripe.param.checkout.SessionCreateParams.builder()
            .setSuccessUrl("https://example.com/success")
            .addLineItem(
                com.stripe.param.checkout.SessionCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(2L)
                    .build())
            .setMode(com.stripe.param.checkout.SessionCreateParams.Mode.PAYMENT)
            .build();

    com.stripe.model.checkout.Session session = client.checkout().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCoreEventsGetServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/core/events/ll_123",
        null,
        null,
        com.stripe.model.v2.core.Event.class,
        "{\"changes\":{\"int_key\":123,\"string_key\":\"value\",\"boolean_key\":true,\"object_key\":{\"object_int_key\":123,\"object_string_key\":\"value\",\"object_boolean_key\":true},\"array_key\":[1,2,3]},\"context\":\"context\",\"created\":\"1970-01-12T21:42:34.472Z\",\"id\":\"obj_123\",\"livemode\":true,\"object\":\"v2.core.event\",\"reason\":{\"type\":\"request\",\"request\":{\"id\":\"obj_123\",\"idempotency_key\":\"idempotency_key\"}},\"type\":\"type\"}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.v2.core.Event event = client.v2().core().events().retrieve("ll_123");
    assertNotNull(event);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/core/events/ll_123", null, null);
  }

  @Test
  public void testCountrySpecsGet() throws StripeException {
    CountrySpecListParams params = CountrySpecListParams.builder().setLimit(3L).build();

    CountrySpecCollection countrySpecs = CountrySpec.list(params);
    assertNotNull(countrySpecs);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/country_specs", params.toMap(), null);
  }

  @Test
  public void testCountrySpecsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CountrySpecListParams params =
        com.stripe.param.CountrySpecListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CountrySpec> stripeCollection =
        client.v1().countrySpecs().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/country_specs", params.toMap(), null);
  }

  @Test
  public void testCountrySpecsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CountrySpecListParams params =
        com.stripe.param.CountrySpecListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CountrySpec> stripeCollection =
        client.countrySpecs().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/country_specs", params.toMap(), null);
  }

  @Test
  public void testCountrySpecsGet2() throws StripeException {
    CountrySpec countrySpec = CountrySpec.retrieve("US");
    assertNotNull(countrySpec);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/country_specs/US", null, null);
  }

  @Test
  public void testCountrySpecsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CountrySpecRetrieveParams params =
        com.stripe.param.CountrySpecRetrieveParams.builder().build();

    com.stripe.model.CountrySpec countrySpec = client.v1().countrySpecs().retrieve("US", params);
    assertNotNull(countrySpec);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/country_specs/US",
        params.toMap(),
        null);
  }

  @Test
  public void testCountrySpecsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CountrySpecRetrieveParams params =
        com.stripe.param.CountrySpecRetrieveParams.builder().build();

    com.stripe.model.CountrySpec countrySpec = client.countrySpecs().retrieve("US", params);
    assertNotNull(countrySpec);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/country_specs/US",
        params.toMap(),
        null);
  }

  @Test
  public void testCouponsDelete() throws StripeException {
    Coupon resource = Coupon.retrieve("Z4OV52SU");

    Coupon coupon = resource.delete();
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.DELETE, "/v1/coupons/Z4OV52SU", null, null);
  }

  @Test
  public void testCouponsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Coupon coupon = client.v1().coupons().delete("Z4OV52SU");
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.DELETE, "/v1/coupons/Z4OV52SU", null, null);
  }

  @Test
  public void testCouponsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Coupon coupon = client.coupons().delete("Z4OV52SU");
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.DELETE, "/v1/coupons/Z4OV52SU", null, null);
  }

  @Test
  public void testCouponsGet() throws StripeException {
    CouponListParams params = CouponListParams.builder().setLimit(3L).build();

    CouponCollection coupons = Coupon.list(params);
    assertNotNull(coupons);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponListParams params =
        com.stripe.param.CouponListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Coupon> stripeCollection =
        client.v1().coupons().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponListParams params =
        com.stripe.param.CouponListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Coupon> stripeCollection =
        client.coupons().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponsGet2() throws StripeException {
    Coupon coupon = Coupon.retrieve("Z4OV52SU");
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/coupons/Z4OV52SU", null, null);
  }

  @Test
  public void testCouponsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponRetrieveParams params =
        com.stripe.param.CouponRetrieveParams.builder().build();

    com.stripe.model.Coupon coupon = client.v1().coupons().retrieve("Z4OV52SU", params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/coupons/Z4OV52SU",
        params.toMap(),
        null);
  }

  @Test
  public void testCouponsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponRetrieveParams params =
        com.stripe.param.CouponRetrieveParams.builder().build();

    com.stripe.model.Coupon coupon = client.coupons().retrieve("Z4OV52SU", params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/coupons/Z4OV52SU",
        params.toMap(),
        null);
  }

  @Test
  public void testCouponsPost() throws StripeException {
    CouponCreateParams params =
        CouponCreateParams.builder()
            .setPercentOff(new BigDecimal(25.5))
            .setDuration(CouponCreateParams.Duration.ONCE)
            .build();

    Coupon coupon = Coupon.create(params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponCreateParams params =
        com.stripe.param.CouponCreateParams.builder()
            .setPercentOff(new BigDecimal(25.5))
            .setDuration(com.stripe.param.CouponCreateParams.Duration.ONCE)
            .build();

    com.stripe.model.Coupon coupon = client.v1().coupons().create(params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponCreateParams params =
        com.stripe.param.CouponCreateParams.builder()
            .setPercentOff(new BigDecimal(25.5))
            .setDuration(com.stripe.param.CouponCreateParams.Duration.ONCE)
            .build();

    com.stripe.model.Coupon coupon = client.coupons().create(params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponsPost2() throws StripeException {
    Coupon resource = Coupon.retrieve("Z4OV52SU");

    CouponUpdateParams params =
        CouponUpdateParams.builder().putMetadata("order_id", "6735").build();

    Coupon coupon = resource.update(params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/coupons/Z4OV52SU",
        params.toMap(),
        null);
  }

  @Test
  public void testCouponsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponUpdateParams params =
        com.stripe.param.CouponUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Coupon coupon = client.v1().coupons().update("Z4OV52SU", params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/coupons/Z4OV52SU",
        params.toMap(),
        null);
  }

  @Test
  public void testCouponsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponUpdateParams params =
        com.stripe.param.CouponUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Coupon coupon = client.coupons().update("Z4OV52SU", params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/coupons/Z4OV52SU",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesGet() throws StripeException {
    CreditNoteListParams params = CreditNoteListParams.builder().setLimit(3L).build();

    CreditNoteCollection creditNotes = CreditNote.list(params);
    assertNotNull(creditNotes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/credit_notes", params.toMap(), null);
  }

  @Test
  public void testCreditNotesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteListParams params =
        com.stripe.param.CreditNoteListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CreditNote> stripeCollection =
        client.v1().creditNotes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/credit_notes", params.toMap(), null);
  }

  @Test
  public void testCreditNotesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteListParams params =
        com.stripe.param.CreditNoteListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CreditNote> stripeCollection =
        client.creditNotes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/credit_notes", params.toMap(), null);
  }

  @Test
  public void testCreditNotesLinesGet() throws StripeException {
    CreditNote creditNote = CreditNote.retrieve("cn_xxxxxxxxxxxxx");

    CreditNoteLineItemCollectionListParams params =
        CreditNoteLineItemCollectionListParams.builder().setLimit(3L).build();

    CreditNoteLineItemCollection creditNoteLineItems = creditNote.getLines().list(params);
    assertNotNull(creditNoteLineItems);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/cn_xxxxxxxxxxxxx/lines",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesLinesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteLineItemListParams params =
        com.stripe.param.CreditNoteLineItemListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CreditNoteLineItem> stripeCollection =
        client.v1().creditNotes().lineItems().list("cn_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/cn_xxxxxxxxxxxxx/lines",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesLinesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteLineItemListParams params =
        com.stripe.param.CreditNoteLineItemListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CreditNoteLineItem> stripeCollection =
        client.creditNotes().lineItems().list("cn_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/cn_xxxxxxxxxxxxx/lines",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesPost() throws StripeException {
    CreditNoteCreateParams params =
        CreditNoteCreateParams.builder()
            .setInvoice("in_xxxxxxxxxxxxx")
            .addLine(
                CreditNoteCreateParams.Line.builder()
                    .setType(CreditNoteCreateParams.Line.Type.INVOICE_LINE_ITEM)
                    .setInvoiceLineItem("il_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    CreditNote creditNote = CreditNote.create(params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/credit_notes", params.toMap(), null);
  }

  @Test
  public void testCreditNotesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteCreateParams params =
        com.stripe.param.CreditNoteCreateParams.builder()
            .setInvoice("in_xxxxxxxxxxxxx")
            .addLine(
                com.stripe.param.CreditNoteCreateParams.Line.builder()
                    .setType(com.stripe.param.CreditNoteCreateParams.Line.Type.INVOICE_LINE_ITEM)
                    .setInvoiceLineItem("il_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.CreditNote creditNote = client.v1().creditNotes().create(params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/credit_notes", params.toMap(), null);
  }

  @Test
  public void testCreditNotesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteCreateParams params =
        com.stripe.param.CreditNoteCreateParams.builder()
            .setInvoice("in_xxxxxxxxxxxxx")
            .addLine(
                com.stripe.param.CreditNoteCreateParams.Line.builder()
                    .setType(com.stripe.param.CreditNoteCreateParams.Line.Type.INVOICE_LINE_ITEM)
                    .setInvoiceLineItem("il_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.CreditNote creditNote = client.creditNotes().create(params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/credit_notes", params.toMap(), null);
  }

  @Test
  public void testCreditNotesPreviewGet() throws StripeException {
    CreditNotePreviewParams params =
        CreditNotePreviewParams.builder()
            .setInvoice("in_xxxxxxxxxxxxx")
            .addLine(
                CreditNotePreviewParams.Line.builder()
                    .setType(CreditNotePreviewParams.Line.Type.INVOICE_LINE_ITEM)
                    .setInvoiceLineItem("il_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    CreditNote creditNote = CreditNote.preview(params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/preview",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesPreviewGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNotePreviewParams params =
        com.stripe.param.CreditNotePreviewParams.builder()
            .setInvoice("in_xxxxxxxxxxxxx")
            .addLine(
                com.stripe.param.CreditNotePreviewParams.Line.builder()
                    .setType(com.stripe.param.CreditNotePreviewParams.Line.Type.INVOICE_LINE_ITEM)
                    .setInvoiceLineItem("il_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.CreditNote creditNote = client.v1().creditNotes().preview(params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/preview",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesPreviewGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNotePreviewParams params =
        com.stripe.param.CreditNotePreviewParams.builder()
            .setInvoice("in_xxxxxxxxxxxxx")
            .addLine(
                com.stripe.param.CreditNotePreviewParams.Line.builder()
                    .setType(com.stripe.param.CreditNotePreviewParams.Line.Type.INVOICE_LINE_ITEM)
                    .setInvoiceLineItem("il_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.CreditNote creditNote = client.creditNotes().preview(params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/preview",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesPreviewLinesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNotePreviewLinesListParams params =
        com.stripe.param.CreditNotePreviewLinesListParams.builder()
            .setLimit(3L)
            .setInvoice("in_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.CreditNoteLineItem> stripeCollection =
        client.v1().creditNotes().previewLines().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/preview/lines",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesPreviewLinesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNotePreviewLinesListParams params =
        com.stripe.param.CreditNotePreviewLinesListParams.builder()
            .setLimit(3L)
            .setInvoice("in_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.CreditNoteLineItem> stripeCollection =
        client.creditNotes().previewLines().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/credit_notes/preview/lines",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesVoidPost() throws StripeException {
    CreditNote resource = CreditNote.retrieve("cn_xxxxxxxxxxxxx");

    CreditNoteVoidCreditNoteParams params = CreditNoteVoidCreditNoteParams.builder().build();

    CreditNote creditNote = resource.voidCreditNote(params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/credit_notes/cn_xxxxxxxxxxxxx/void",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesVoidPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteVoidCreditNoteParams params =
        com.stripe.param.CreditNoteVoidCreditNoteParams.builder().build();

    com.stripe.model.CreditNote creditNote =
        client.v1().creditNotes().voidCreditNote("cn_xxxxxxxxxxxxx", params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/credit_notes/cn_xxxxxxxxxxxxx/void",
        params.toMap(),
        null);
  }

  @Test
  public void testCreditNotesVoidPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CreditNoteVoidCreditNoteParams params =
        com.stripe.param.CreditNoteVoidCreditNoteParams.builder().build();

    com.stripe.model.CreditNote creditNote =
        client.creditNotes().voidCreditNote("cn_xxxxxxxxxxxxx", params);
    assertNotNull(creditNote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/credit_notes/cn_xxxxxxxxxxxxx/void",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomerSessionsPost() throws StripeException {
    CustomerSessionCreateParams params =
        CustomerSessionCreateParams.builder()
            .setCustomer("cus_123")
            .setComponents(
                CustomerSessionCreateParams.Components.builder()
                    .setBuyButton(
                        CustomerSessionCreateParams.Components.BuyButton.builder()
                            .setEnabled(true)
                            .build())
                    .build())
            .build();

    CustomerSession customerSession = CustomerSession.create(params);
    assertNotNull(customerSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customer_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomerSessionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerSessionCreateParams params =
        com.stripe.param.CustomerSessionCreateParams.builder()
            .setCustomer("cus_123")
            .setComponents(
                com.stripe.param.CustomerSessionCreateParams.Components.builder()
                    .setBuyButton(
                        com.stripe.param.CustomerSessionCreateParams.Components.BuyButton.builder()
                            .setEnabled(true)
                            .build())
                    .build())
            .build();

    com.stripe.model.CustomerSession customerSession =
        client.v1().customerSessions().create(params);
    assertNotNull(customerSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customer_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomerSessionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerSessionCreateParams params =
        com.stripe.param.CustomerSessionCreateParams.builder()
            .setCustomer("cus_123")
            .setComponents(
                com.stripe.param.CustomerSessionCreateParams.Components.builder()
                    .setBuyButton(
                        com.stripe.param.CustomerSessionCreateParams.Components.BuyButton.builder()
                            .setEnabled(true)
                            .build())
                    .build())
            .build();

    com.stripe.model.CustomerSession customerSession = client.customerSessions().create(params);
    assertNotNull(customerSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customer_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsGet() throws StripeException {
    Customer resource = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerBalanceTransactionsParams params =
        CustomerBalanceTransactionsParams.builder().setLimit(3L).build();

    CustomerBalanceTransactionCollection customerBalanceTransactions =
        resource.balanceTransactions(params);
    assertNotNull(customerBalanceTransactions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionListParams params =
        com.stripe.param.CustomerBalanceTransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CustomerBalanceTransaction>
        stripeCollection =
            client.v1().customers().balanceTransactions().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionListParams params =
        com.stripe.param.CustomerBalanceTransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CustomerBalanceTransaction>
        stripeCollection =
            client.customers().balanceTransactions().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsGet2() throws StripeException {
    Customer customer = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerBalanceTransaction customerBalanceTransaction =
        customer.balanceTransactions().retrieve("cbtxn_xxxxxxxxxxxxx");
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionRetrieveParams params =
        com.stripe.param.CustomerBalanceTransactionRetrieveParams.builder().build();

    com.stripe.model.CustomerBalanceTransaction customerBalanceTransaction =
        client
            .v1()
            .customers()
            .balanceTransactions()
            .retrieve("cus_xxxxxxxxxxxxx", "cbtxn_xxxxxxxxxxxxx", params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionRetrieveParams params =
        com.stripe.param.CustomerBalanceTransactionRetrieveParams.builder().build();

    com.stripe.model.CustomerBalanceTransaction customerBalanceTransaction =
        client
            .customers()
            .balanceTransactions()
            .retrieve("cus_xxxxxxxxxxxxx", "cbtxn_xxxxxxxxxxxxx", params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsPost() throws StripeException {
    Customer customer = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerBalanceTransactionCollectionCreateParams params =
        CustomerBalanceTransactionCollectionCreateParams.builder()
            .setAmount(-500L)
            .setCurrency("usd")
            .build();

    CustomerBalanceTransaction customerBalanceTransaction =
        customer.balanceTransactions().create(params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionCreateParams params =
        com.stripe.param.CustomerBalanceTransactionCreateParams.builder()
            .setAmount(-500L)
            .setCurrency("usd")
            .build();

    com.stripe.model.CustomerBalanceTransaction customerBalanceTransaction =
        client.v1().customers().balanceTransactions().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionCreateParams params =
        com.stripe.param.CustomerBalanceTransactionCreateParams.builder()
            .setAmount(-500L)
            .setCurrency("usd")
            .build();

    com.stripe.model.CustomerBalanceTransaction customerBalanceTransaction =
        client.customers().balanceTransactions().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsPost2() throws StripeException {
    Customer customer = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerBalanceTransaction resource =
        customer.balanceTransactions().retrieve("cbtxn_xxxxxxxxxxxxx");

    CustomerBalanceTransactionUpdateParams params =
        CustomerBalanceTransactionUpdateParams.builder().putMetadata("order_id", "6735").build();

    CustomerBalanceTransaction customerBalanceTransaction = resource.update(params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionUpdateParams params =
        com.stripe.param.CustomerBalanceTransactionUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.CustomerBalanceTransaction customerBalanceTransaction =
        client
            .v1()
            .customers()
            .balanceTransactions()
            .update("cus_xxxxxxxxxxxxx", "cbtxn_xxxxxxxxxxxxx", params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersBalanceTransactionsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerBalanceTransactionUpdateParams params =
        com.stripe.param.CustomerBalanceTransactionUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.CustomerBalanceTransaction customerBalanceTransaction =
        client
            .customers()
            .balanceTransactions()
            .update("cus_xxxxxxxxxxxxx", "cbtxn_xxxxxxxxxxxxx", params);
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersCashBalanceGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCashBalanceRetrieveParams params =
        com.stripe.param.CustomerCashBalanceRetrieveParams.builder().build();

    com.stripe.model.CashBalance cashBalance =
        client.v1().customers().cashBalance().retrieve("cus_123", params);
    assertNotNull(cashBalance);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_123/cash_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersCashBalanceGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCashBalanceRetrieveParams params =
        com.stripe.param.CustomerCashBalanceRetrieveParams.builder().build();

    com.stripe.model.CashBalance cashBalance =
        client.customers().cashBalance().retrieve("cus_123", params);
    assertNotNull(cashBalance);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_123/cash_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersCashBalancePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCashBalanceUpdateParams params =
        com.stripe.param.CustomerCashBalanceUpdateParams.builder()
            .setSettings(
                com.stripe.param.CustomerCashBalanceUpdateParams.Settings.builder()
                    .setReconciliationMode(
                        com.stripe.param.CustomerCashBalanceUpdateParams.Settings.ReconciliationMode
                            .MANUAL)
                    .build())
            .build();

    com.stripe.model.CashBalance cashBalance =
        client.v1().customers().cashBalance().update("cus_123", params);
    assertNotNull(cashBalance);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/cash_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersCashBalancePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCashBalanceUpdateParams params =
        com.stripe.param.CustomerCashBalanceUpdateParams.builder()
            .setSettings(
                com.stripe.param.CustomerCashBalanceUpdateParams.Settings.builder()
                    .setReconciliationMode(
                        com.stripe.param.CustomerCashBalanceUpdateParams.Settings.ReconciliationMode
                            .MANUAL)
                    .build())
            .build();

    com.stripe.model.CashBalance cashBalance =
        client.customers().cashBalance().update("cus_123", params);
    assertNotNull(cashBalance);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/cash_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersCashBalanceTransactionsGet() throws StripeException {
    Customer resource = Customer.retrieve("cus_123");

    CustomerCashBalanceTransactionsParams params =
        CustomerCashBalanceTransactionsParams.builder().setLimit(3L).build();

    CustomerCashBalanceTransactionCollection customerCashBalanceTransactions =
        resource.cashBalanceTransactions(params);
    assertNotNull(customerCashBalanceTransactions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_123/cash_balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersCashBalanceTransactionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCashBalanceTransactionListParams params =
        com.stripe.param.CustomerCashBalanceTransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CustomerCashBalanceTransaction>
        stripeCollection =
            client.v1().customers().cashBalanceTransactions().list("cus_123", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_123/cash_balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersCashBalanceTransactionsGetServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCashBalanceTransactionListParams params =
        com.stripe.param.CustomerCashBalanceTransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.CustomerCashBalanceTransaction>
        stripeCollection = client.customers().cashBalanceTransactions().list("cus_123", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_123/cash_balance_transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersDelete() throws StripeException {
    Customer resource = Customer.retrieve("cus_xxxxxxxxxxxxx");

    Customer customer = resource.delete();
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCustomersDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Customer customer = client.v1().customers().delete("cus_xxxxxxxxxxxxx");
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCustomersDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Customer customer = client.customers().delete("cus_xxxxxxxxxxxxx");
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCustomersFundingInstructionsPost() throws StripeException {
    Customer resource = Customer.retrieve("cus_123");

    CustomerCreateFundingInstructionsParams params =
        CustomerCreateFundingInstructionsParams.builder()
            .setBankTransfer(
                CustomerCreateFundingInstructionsParams.BankTransfer.builder()
                    .addRequestedAddressType(
                        CustomerCreateFundingInstructionsParams.BankTransfer.RequestedAddressType
                            .ZENGIN)
                    .setType(
                        CustomerCreateFundingInstructionsParams.BankTransfer.Type.JP_BANK_TRANSFER)
                    .build())
            .setCurrency("usd")
            .setFundingType(CustomerCreateFundingInstructionsParams.FundingType.BANK_TRANSFER)
            .build();

    FundingInstructions fundingInstructions = resource.createFundingInstructions(params);
    assertNotNull(fundingInstructions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/funding_instructions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersFundingInstructionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerFundingInstructionsCreateParams params =
        com.stripe.param.CustomerFundingInstructionsCreateParams.builder()
            .setBankTransfer(
                com.stripe.param.CustomerFundingInstructionsCreateParams.BankTransfer.builder()
                    .addRequestedAddressType(
                        com.stripe.param.CustomerFundingInstructionsCreateParams.BankTransfer
                            .RequestedAddressType.ZENGIN)
                    .setType(
                        com.stripe.param.CustomerFundingInstructionsCreateParams.BankTransfer.Type
                            .JP_BANK_TRANSFER)
                    .build())
            .setCurrency("usd")
            .setFundingType(
                com.stripe.param.CustomerFundingInstructionsCreateParams.FundingType.BANK_TRANSFER)
            .build();

    com.stripe.model.FundingInstructions fundingInstructions =
        client.v1().customers().fundingInstructions().create("cus_123", params);
    assertNotNull(fundingInstructions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/funding_instructions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersFundingInstructionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerFundingInstructionsCreateParams params =
        com.stripe.param.CustomerFundingInstructionsCreateParams.builder()
            .setBankTransfer(
                com.stripe.param.CustomerFundingInstructionsCreateParams.BankTransfer.builder()
                    .addRequestedAddressType(
                        com.stripe.param.CustomerFundingInstructionsCreateParams.BankTransfer
                            .RequestedAddressType.ZENGIN)
                    .setType(
                        com.stripe.param.CustomerFundingInstructionsCreateParams.BankTransfer.Type
                            .JP_BANK_TRANSFER)
                    .build())
            .setCurrency("usd")
            .setFundingType(
                com.stripe.param.CustomerFundingInstructionsCreateParams.FundingType.BANK_TRANSFER)
            .build();

    com.stripe.model.FundingInstructions fundingInstructions =
        client.customers().fundingInstructions().create("cus_123", params);
    assertNotNull(fundingInstructions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/funding_instructions",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersGet() throws StripeException {
    CustomerListParams params = CustomerListParams.builder().setLimit(3L).build();

    CustomerCollection customers = Customer.list(params);
    assertNotNull(customers);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerListParams params =
        com.stripe.param.CustomerListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Customer> stripeCollection =
        client.v1().customers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerListParams params =
        com.stripe.param.CustomerListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Customer> stripeCollection =
        client.customers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersGet2() throws StripeException {
    CustomerListParams params = CustomerListParams.builder().setLimit(3L).build();

    CustomerCollection customers = Customer.list(params);
    assertNotNull(customers);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerListParams params =
        com.stripe.param.CustomerListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Customer> stripeCollection =
        client.v1().customers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerListParams params =
        com.stripe.param.CustomerListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Customer> stripeCollection =
        client.customers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersGet3() throws StripeException {
    Customer customer = Customer.retrieve("cus_xxxxxxxxxxxxx");
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCustomersGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerRetrieveParams params =
        com.stripe.param.CustomerRetrieveParams.builder().build();

    com.stripe.model.Customer customer =
        client.v1().customers().retrieve("cus_xxxxxxxxxxxxx", params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerRetrieveParams params =
        com.stripe.param.CustomerRetrieveParams.builder().build();

    com.stripe.model.Customer customer = client.customers().retrieve("cus_xxxxxxxxxxxxx", params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPaymentMethodsGet() throws StripeException {
    Customer resource = Customer.retrieve("cus_xyz");

    CustomerListPaymentMethodsParams params =
        CustomerListPaymentMethodsParams.builder()
            .setType(CustomerListPaymentMethodsParams.Type.CARD)
            .build();

    PaymentMethodCollection paymentMethods = resource.listPaymentMethods(params);
    assertNotNull(paymentMethods);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xyz/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPaymentMethodsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentMethodListParams params =
        com.stripe.param.CustomerPaymentMethodListParams.builder()
            .setType(com.stripe.param.CustomerPaymentMethodListParams.Type.CARD)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethod> stripeCollection =
        client.v1().customers().paymentMethods().list("cus_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xyz/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPaymentMethodsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentMethodListParams params =
        com.stripe.param.CustomerPaymentMethodListParams.builder()
            .setType(com.stripe.param.CustomerPaymentMethodListParams.Type.CARD)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethod> stripeCollection =
        client.customers().paymentMethods().list("cus_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xyz/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPaymentMethodsGet2() throws StripeException {
    Customer resource = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerListPaymentMethodsParams params =
        CustomerListPaymentMethodsParams.builder()
            .setType(CustomerListPaymentMethodsParams.Type.CARD)
            .build();

    PaymentMethodCollection paymentMethods = resource.listPaymentMethods(params);
    assertNotNull(paymentMethods);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPaymentMethodsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentMethodListParams params =
        com.stripe.param.CustomerPaymentMethodListParams.builder()
            .setType(com.stripe.param.CustomerPaymentMethodListParams.Type.CARD)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethod> stripeCollection =
        client.v1().customers().paymentMethods().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPaymentMethodsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentMethodListParams params =
        com.stripe.param.CustomerPaymentMethodListParams.builder()
            .setType(com.stripe.param.CustomerPaymentMethodListParams.Type.CARD)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethod> stripeCollection =
        client.customers().paymentMethods().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPost() throws StripeException {
    CustomerCreateParams params =
        CustomerCreateParams.builder()
            .setDescription(
                "My First Test Customer (created for API docs at https://www.stripe.com/docs/api)")
            .build();

    Customer customer = Customer.create(params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCreateParams params =
        com.stripe.param.CustomerCreateParams.builder()
            .setDescription(
                "My First Test Customer (created for API docs at https://www.stripe.com/docs/api)")
            .build();

    com.stripe.model.Customer customer = client.v1().customers().create(params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerCreateParams params =
        com.stripe.param.CustomerCreateParams.builder()
            .setDescription(
                "My First Test Customer (created for API docs at https://www.stripe.com/docs/api)")
            .build();

    com.stripe.model.Customer customer = client.customers().create(params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomersPost2() throws StripeException {
    Customer resource = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerUpdateParams params =
        CustomerUpdateParams.builder().putMetadata("order_id", "6735").build();

    Customer customer = resource.update(params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerUpdateParams params =
        com.stripe.param.CustomerUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Customer customer =
        client.v1().customers().update("cus_xxxxxxxxxxxxx", params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerUpdateParams params =
        com.stripe.param.CustomerUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Customer customer = client.customers().update("cus_xxxxxxxxxxxxx", params);
    assertNotNull(customer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSearchGet() throws StripeException {
    CustomerSearchParams params =
        CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    CustomerSearchResult customers = Customer.search(params);
    assertNotNull(customers);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/search",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSearchGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerSearchParams params =
        com.stripe.param.CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Customer> stripeSearchResult =
        client.v1().customers().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/search",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSearchGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerSearchParams params =
        com.stripe.param.CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Customer> stripeSearchResult =
        client.customers().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/search",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSearchGet2() throws StripeException {
    CustomerSearchParams params =
        CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    CustomerSearchResult customers = Customer.search(params);
    assertNotNull(customers);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/search",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSearchGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerSearchParams params =
        com.stripe.param.CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Customer> stripeSearchResult =
        client.v1().customers().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/search",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSearchGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerSearchParams params =
        com.stripe.param.CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Customer> stripeSearchResult =
        client.customers().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/search",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceDetachParams params =
        com.stripe.param.SourceDetachParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client.v1().sources().detach("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceDetachParams params =
        com.stripe.param.SourceDetachParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client.sources().detach("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesDelete2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceDetachParams params =
        com.stripe.param.SourceDetachParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client.v1().sources().detach("cus_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesDelete2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceDetachParams params =
        com.stripe.param.SourceDetachParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client.sources().detach("cus_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceListParams params =
        com.stripe.param.CustomerPaymentSourceListParams.builder()
            .setObject("bank_account")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentSource> stripeCollection =
        client.v1().customers().paymentSources().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceListParams params =
        com.stripe.param.CustomerPaymentSourceListParams.builder()
            .setObject("bank_account")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentSource> stripeCollection =
        client.customers().paymentSources().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceListParams params =
        com.stripe.param.CustomerPaymentSourceListParams.builder()
            .setObject("card")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentSource> stripeCollection =
        client.v1().customers().paymentSources().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceListParams params =
        com.stripe.param.CustomerPaymentSourceListParams.builder()
            .setObject("card")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentSource> stripeCollection =
        client.customers().paymentSources().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceRetrieveParams params =
        com.stripe.param.CustomerPaymentSourceRetrieveParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client
            .v1()
            .customers()
            .paymentSources()
            .retrieve("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceRetrieveParams params =
        com.stripe.param.CustomerPaymentSourceRetrieveParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client
            .customers()
            .paymentSources()
            .retrieve("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGet4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceRetrieveParams params =
        com.stripe.param.CustomerPaymentSourceRetrieveParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client
            .v1()
            .customers()
            .paymentSources()
            .retrieve("cus_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesGet4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceRetrieveParams params =
        com.stripe.param.CustomerPaymentSourceRetrieveParams.builder().build();

    com.stripe.model.PaymentSource paymentSource =
        client
            .customers()
            .paymentSources()
            .retrieve("cus_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceUpdateParams params =
        com.stripe.param.CustomerPaymentSourceUpdateParams.builder().setName("Kamil").build();

    com.stripe.model.PaymentSource paymentSource =
        client.v1().customers().paymentSources().update("cus_123", "card_123", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/sources/card_123",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceUpdateParams params =
        com.stripe.param.CustomerPaymentSourceUpdateParams.builder().setName("Kamil").build();

    com.stripe.model.PaymentSource paymentSource =
        client.customers().paymentSources().update("cus_123", "card_123", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/sources/card_123",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceCreateParams params =
        com.stripe.param.CustomerPaymentSourceCreateParams.builder()
            .setSource("btok_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.PaymentSource paymentSource =
        client.v1().customers().paymentSources().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceCreateParams params =
        com.stripe.param.CustomerPaymentSourceCreateParams.builder()
            .setSource("btok_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.PaymentSource paymentSource =
        client.customers().paymentSources().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceCreateParams params =
        com.stripe.param.CustomerPaymentSourceCreateParams.builder().setSource("tok_xxxx").build();

    com.stripe.model.PaymentSource paymentSource =
        client.v1().customers().paymentSources().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceCreateParams params =
        com.stripe.param.CustomerPaymentSourceCreateParams.builder().setSource("tok_xxxx").build();

    com.stripe.model.PaymentSource paymentSource =
        client.customers().paymentSources().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceUpdateParams params =
        com.stripe.param.CustomerPaymentSourceUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PaymentSource paymentSource =
        client
            .v1()
            .customers()
            .paymentSources()
            .update("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceUpdateParams params =
        com.stripe.param.CustomerPaymentSourceUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PaymentSource paymentSource =
        client.customers().paymentSources().update("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost5Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceUpdateParams params =
        com.stripe.param.CustomerPaymentSourceUpdateParams.builder().setName("Jenny Rosen").build();

    com.stripe.model.PaymentSource paymentSource =
        client
            .v1()
            .customers()
            .paymentSources()
            .update("cus_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesPost5ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceUpdateParams params =
        com.stripe.param.CustomerPaymentSourceUpdateParams.builder().setName("Jenny Rosen").build();

    com.stripe.model.PaymentSource paymentSource =
        client
            .customers()
            .paymentSources()
            .update("cus_xxxxxxxxxxxxx", "card_xxxxxxxxxxxxx", params);
    assertNotNull(paymentSource);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/card_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesVerifyPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceVerifyParams params =
        com.stripe.param.CustomerPaymentSourceVerifyParams.builder()
            .addAmount(32L)
            .addAmount(45L)
            .build();

    com.stripe.model.BankAccount bankAccount =
        client
            .v1()
            .customers()
            .paymentSources()
            .verify("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(bankAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx/verify",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersSourcesVerifyPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerPaymentSourceVerifyParams params =
        com.stripe.param.CustomerPaymentSourceVerifyParams.builder()
            .addAmount(32L)
            .addAmount(45L)
            .build();

    com.stripe.model.BankAccount bankAccount =
        client.customers().paymentSources().verify("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(bankAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx/verify",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersTaxIdsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.TaxId taxId =
        client.v1().customers().taxIds().delete("cus_xxxxxxxxxxxxx", "txi_xxxxxxxxxxxxx");
    assertNotNull(taxId);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids/txi_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCustomersTaxIdsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.TaxId taxId =
        client.customers().taxIds().delete("cus_xxxxxxxxxxxxx", "txi_xxxxxxxxxxxxx");
    assertNotNull(taxId);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids/txi_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testCustomersTaxIdsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerTaxIdListParams params =
        com.stripe.param.CustomerTaxIdListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TaxId> stripeCollection =
        client.v1().customers().taxIds().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersTaxIdsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerTaxIdListParams params =
        com.stripe.param.CustomerTaxIdListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TaxId> stripeCollection =
        client.customers().taxIds().list("cus_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersTaxIdsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerTaxIdRetrieveParams params =
        com.stripe.param.CustomerTaxIdRetrieveParams.builder().build();

    com.stripe.model.TaxId taxId =
        client.v1().customers().taxIds().retrieve("cus_xxxxxxxxxxxxx", "txi_xxxxxxxxxxxxx", params);
    assertNotNull(taxId);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids/txi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersTaxIdsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerTaxIdRetrieveParams params =
        com.stripe.param.CustomerTaxIdRetrieveParams.builder().build();

    com.stripe.model.TaxId taxId =
        client.customers().taxIds().retrieve("cus_xxxxxxxxxxxxx", "txi_xxxxxxxxxxxxx", params);
    assertNotNull(taxId);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids/txi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersTaxIdsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerTaxIdCreateParams params =
        com.stripe.param.CustomerTaxIdCreateParams.builder()
            .setType(com.stripe.param.CustomerTaxIdCreateParams.Type.EU_VAT)
            .setValue("DE123456789")
            .build();

    com.stripe.model.TaxId taxId =
        client.v1().customers().taxIds().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(taxId);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids",
        params.toMap(),
        null);
  }

  @Test
  public void testCustomersTaxIdsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerTaxIdCreateParams params =
        com.stripe.param.CustomerTaxIdCreateParams.builder()
            .setType(com.stripe.param.CustomerTaxIdCreateParams.Type.EU_VAT)
            .setValue("DE123456789")
            .build();

    com.stripe.model.TaxId taxId = client.customers().taxIds().create("cus_xxxxxxxxxxxxx", params);
    assertNotNull(taxId);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/tax_ids",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesClosePost() throws StripeException {
    Dispute resource = Dispute.retrieve("dp_xxxxxxxxxxxxx");

    DisputeCloseParams params = DisputeCloseParams.builder().build();

    Dispute dispute = resource.close(params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/disputes/dp_xxxxxxxxxxxxx/close",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesClosePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeCloseParams params =
        com.stripe.param.DisputeCloseParams.builder().build();

    com.stripe.model.Dispute dispute = client.v1().disputes().close("dp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/disputes/dp_xxxxxxxxxxxxx/close",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesClosePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeCloseParams params =
        com.stripe.param.DisputeCloseParams.builder().build();

    com.stripe.model.Dispute dispute = client.disputes().close("dp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/disputes/dp_xxxxxxxxxxxxx/close",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesGet() throws StripeException {
    DisputeListParams params = DisputeListParams.builder().setLimit(3L).build();

    DisputeCollection disputes = Dispute.list(params);
    assertNotNull(disputes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/disputes", params.toMap(), null);
  }

  @Test
  public void testDisputesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeListParams params =
        com.stripe.param.DisputeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Dispute> stripeCollection =
        client.v1().disputes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/disputes", params.toMap(), null);
  }

  @Test
  public void testDisputesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeListParams params =
        com.stripe.param.DisputeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Dispute> stripeCollection =
        client.disputes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/disputes", params.toMap(), null);
  }

  @Test
  public void testDisputesGet2() throws StripeException {
    Dispute dispute = Dispute.retrieve("dp_xxxxxxxxxxxxx");
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/disputes/dp_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testDisputesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeRetrieveParams params =
        com.stripe.param.DisputeRetrieveParams.builder().build();

    com.stripe.model.Dispute dispute = client.v1().disputes().retrieve("dp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/disputes/dp_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeRetrieveParams params =
        com.stripe.param.DisputeRetrieveParams.builder().build();

    com.stripe.model.Dispute dispute = client.disputes().retrieve("dp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/disputes/dp_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesPost() throws StripeException {
    Dispute resource = Dispute.retrieve("dp_xxxxxxxxxxxxx");

    DisputeUpdateParams params =
        DisputeUpdateParams.builder().putMetadata("order_id", "6735").build();

    Dispute dispute = resource.update(params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/disputes/dp_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeUpdateParams params =
        com.stripe.param.DisputeUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Dispute dispute = client.v1().disputes().update("dp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/disputes/dp_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testDisputesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.DisputeUpdateParams params =
        com.stripe.param.DisputeUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Dispute dispute = client.disputes().update("dp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/disputes/dp_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testEventsGet() throws StripeException {
    EventListParams params = EventListParams.builder().setLimit(3L).build();

    EventCollection events = Event.list(params);
    assertNotNull(events);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/events", params.toMap(), null);
  }

  @Test
  public void testEventsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.EventListParams params =
        com.stripe.param.EventListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Event> stripeCollection =
        client.v1().events().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/events", params.toMap(), null);
  }

  @Test
  public void testEventsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.EventListParams params =
        com.stripe.param.EventListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Event> stripeCollection =
        client.events().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/events", params.toMap(), null);
  }

  @Test
  public void testEventsGet2() throws StripeException {
    Event event = Event.retrieve("evt_xxxxxxxxxxxxx");
    assertNotNull(event);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/events/evt_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testEventsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.EventRetrieveParams params =
        com.stripe.param.EventRetrieveParams.builder().build();

    com.stripe.model.Event event = client.v1().events().retrieve("evt_xxxxxxxxxxxxx", params);
    assertNotNull(event);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/events/evt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testEventsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.EventRetrieveParams params =
        com.stripe.param.EventRetrieveParams.builder().build();

    com.stripe.model.Event event = client.events().retrieve("evt_xxxxxxxxxxxxx", params);
    assertNotNull(event);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/events/evt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFileLinksGet() throws StripeException {
    FileLinkListParams params = FileLinkListParams.builder().setLimit(3L).build();

    FileLinkCollection fileLinks = FileLink.list(params);
    assertNotNull(fileLinks);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinksGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkListParams params =
        com.stripe.param.FileLinkListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.FileLink> stripeCollection =
        client.v1().fileLinks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinksGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkListParams params =
        com.stripe.param.FileLinkListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.FileLink> stripeCollection =
        client.fileLinks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinksGet2() throws StripeException {
    FileLink fileLink = FileLink.retrieve("link_xxxxxxxxxxxxx");
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/file_links/link_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testFileLinksGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkRetrieveParams params =
        com.stripe.param.FileLinkRetrieveParams.builder().build();

    com.stripe.model.FileLink fileLink =
        client.v1().fileLinks().retrieve("link_xxxxxxxxxxxxx", params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/file_links/link_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFileLinksGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkRetrieveParams params =
        com.stripe.param.FileLinkRetrieveParams.builder().build();

    com.stripe.model.FileLink fileLink = client.fileLinks().retrieve("link_xxxxxxxxxxxxx", params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/file_links/link_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFileLinksPost() throws StripeException {
    FileLinkCreateParams params =
        FileLinkCreateParams.builder().setFile("file_xxxxxxxxxxxxx").build();

    FileLink fileLink = FileLink.create(params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinksPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkCreateParams params =
        com.stripe.param.FileLinkCreateParams.builder().setFile("file_xxxxxxxxxxxxx").build();

    com.stripe.model.FileLink fileLink = client.v1().fileLinks().create(params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinksPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkCreateParams params =
        com.stripe.param.FileLinkCreateParams.builder().setFile("file_xxxxxxxxxxxxx").build();

    com.stripe.model.FileLink fileLink = client.fileLinks().create(params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinksPost2() throws StripeException {
    FileLink resource = FileLink.retrieve("link_xxxxxxxxxxxxx");

    FileLinkUpdateParams params =
        FileLinkUpdateParams.builder().putMetadata("order_id", "6735").build();

    FileLink fileLink = resource.update(params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/file_links/link_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFileLinksPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkUpdateParams params =
        com.stripe.param.FileLinkUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.FileLink fileLink =
        client.v1().fileLinks().update("link_xxxxxxxxxxxxx", params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/file_links/link_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFileLinksPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkUpdateParams params =
        com.stripe.param.FileLinkUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.FileLink fileLink = client.fileLinks().update("link_xxxxxxxxxxxxx", params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/file_links/link_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFilesGet() throws StripeException {
    FileListParams params = FileListParams.builder().setLimit(3L).build();

    FileCollection files = File.list(params);
    assertNotNull(files);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/files", params.toMap(), null);
  }

  @Test
  public void testFilesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileListParams params =
        com.stripe.param.FileListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.File> stripeCollection =
        client.v1().files().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/files", params.toMap(), null);
  }

  @Test
  public void testFilesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileListParams params =
        com.stripe.param.FileListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.File> stripeCollection =
        client.files().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/files", params.toMap(), null);
  }

  @Test
  public void testFilesGet2() throws StripeException {
    File file = File.retrieve("file_xxxxxxxxxxxxx");
    assertNotNull(file);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/files/file_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testFilesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileRetrieveParams params =
        com.stripe.param.FileRetrieveParams.builder().build();

    com.stripe.model.File file = client.v1().files().retrieve("file_xxxxxxxxxxxxx", params);
    assertNotNull(file);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/files/file_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFilesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileRetrieveParams params =
        com.stripe.param.FileRetrieveParams.builder().build();

    com.stripe.model.File file = client.files().retrieve("file_xxxxxxxxxxxxx", params);
    assertNotNull(file);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/files/file_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFilesPost() throws StripeException {
    FileCreateParams params =
        FileCreateParams.builder()
            .setPurpose(FileCreateParams.Purpose.ACCOUNT_REQUIREMENT)
            .setFile(
                new java.io.ByteArrayInputStream(
                    "Hello world".getBytes(java.nio.charset.Charset.defaultCharset())))
            .build();

    File file = File.create(params);
    assertNotNull(file);
    verifyRequest(
        BaseAddress.FILES, ApiResource.RequestMethod.POST, "/v1/files", params.toMap(), null);
  }

  @Test
  public void testFilesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileCreateParams params =
        com.stripe.param.FileCreateParams.builder()
            .setPurpose(com.stripe.param.FileCreateParams.Purpose.ACCOUNT_REQUIREMENT)
            .setFile(
                new java.io.ByteArrayInputStream(
                    "Hello world".getBytes(java.nio.charset.Charset.defaultCharset())))
            .build();

    com.stripe.model.File file = client.v1().files().create(params);
    assertNotNull(file);
    verifyRequest(
        BaseAddress.FILES, ApiResource.RequestMethod.POST, "/v1/files", params.toMap(), null);
  }

  @Test
  public void testFilesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileCreateParams params =
        com.stripe.param.FileCreateParams.builder()
            .setPurpose(com.stripe.param.FileCreateParams.Purpose.ACCOUNT_REQUIREMENT)
            .setFile(
                new java.io.ByteArrayInputStream(
                    "Hello world".getBytes(java.nio.charset.Charset.defaultCharset())))
            .build();

    com.stripe.model.File file = client.files().create(params);
    assertNotNull(file);
    verifyRequest(
        BaseAddress.FILES, ApiResource.RequestMethod.POST, "/v1/files", params.toMap(), null);
  }

  @Test
  public void testFinancialConnectionsAccountsDisconnectPost() throws StripeException {
    com.stripe.model.financialconnections.Account resource =
        com.stripe.model.financialconnections.Account.retrieve("fca_xyz");

    com.stripe.param.financialconnections.AccountDisconnectParams params =
        com.stripe.param.financialconnections.AccountDisconnectParams.builder().build();

    com.stripe.model.financialconnections.Account account = resource.disconnect(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/disconnect",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsDisconnectPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountDisconnectParams params =
        com.stripe.param.financialconnections.AccountDisconnectParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.v1().financialConnections().accounts().disconnect("fca_xyz", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/disconnect",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsDisconnectPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountDisconnectParams params =
        com.stripe.param.financialconnections.AccountDisconnectParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.financialConnections().accounts().disconnect("fca_xyz", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/disconnect",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsDisconnectPost2() throws StripeException {
    com.stripe.model.financialconnections.Account resource =
        com.stripe.model.financialconnections.Account.retrieve("fca_xxxxxxxxxxxxx");

    com.stripe.param.financialconnections.AccountDisconnectParams params =
        com.stripe.param.financialconnections.AccountDisconnectParams.builder().build();

    com.stripe.model.financialconnections.Account account = resource.disconnect(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/disconnect",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsDisconnectPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountDisconnectParams params =
        com.stripe.param.financialconnections.AccountDisconnectParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.v1().financialConnections().accounts().disconnect("fca_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/disconnect",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsDisconnectPost2ServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountDisconnectParams params =
        com.stripe.param.financialconnections.AccountDisconnectParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.financialConnections().accounts().disconnect("fca_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/disconnect",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet() throws StripeException {
    com.stripe.param.financialconnections.AccountListParams params =
        com.stripe.param.financialconnections.AccountListParams.builder().build();

    com.stripe.model.financialconnections.AccountCollection accounts =
        com.stripe.model.financialconnections.Account.list(params);
    assertNotNull(accounts);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountListParams params =
        com.stripe.param.financialconnections.AccountListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.Account>
        stripeCollection = client.v1().financialConnections().accounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountListParams params =
        com.stripe.param.financialconnections.AccountListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.Account>
        stripeCollection = client.financialConnections().accounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet2() throws StripeException {
    com.stripe.model.financialconnections.Account account =
        com.stripe.model.financialconnections.Account.retrieve("fca_xyz");
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xyz",
        null,
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountRetrieveParams params =
        com.stripe.param.financialconnections.AccountRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.v1().financialConnections().accounts().retrieve("fca_xyz", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountRetrieveParams params =
        com.stripe.param.financialconnections.AccountRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.financialConnections().accounts().retrieve("fca_xyz", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet3() throws StripeException {
    com.stripe.param.financialconnections.AccountListParams params =
        com.stripe.param.financialconnections.AccountListParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.AccountListParams.AccountHolder.builder()
                    .setCustomer("cus_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.financialconnections.AccountCollection accounts =
        com.stripe.model.financialconnections.Account.list(params);
    assertNotNull(accounts);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountListParams params =
        com.stripe.param.financialconnections.AccountListParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.AccountListParams.AccountHolder.builder()
                    .setCustomer("cus_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.Account>
        stripeCollection = client.v1().financialConnections().accounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountListParams params =
        com.stripe.param.financialconnections.AccountListParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.AccountListParams.AccountHolder.builder()
                    .setCustomer("cus_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.Account>
        stripeCollection = client.financialConnections().accounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet4() throws StripeException {
    com.stripe.model.financialconnections.Account account =
        com.stripe.model.financialconnections.Account.retrieve("fca_xxxxxxxxxxxxx");
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountRetrieveParams params =
        com.stripe.param.financialconnections.AccountRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.v1().financialConnections().accounts().retrieve("fca_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsGet4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountRetrieveParams params =
        com.stripe.param.financialconnections.AccountRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Account account =
        client.financialConnections().accounts().retrieve("fca_xxxxxxxxxxxxx", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsOwnersGet() throws StripeException {
    com.stripe.model.financialconnections.Account resource =
        com.stripe.model.financialconnections.Account.retrieve("fca_xyz");

    com.stripe.param.financialconnections.AccountListOwnersParams params =
        com.stripe.param.financialconnections.AccountListOwnersParams.builder()
            .setOwnership("fcaowns_xyz")
            .build();

    com.stripe.model.financialconnections.AccountOwnerCollection accountOwners =
        resource.listOwners(params);
    assertNotNull(accountOwners);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xyz/owners",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsOwnersGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountOwnerListParams params =
        com.stripe.param.financialconnections.AccountOwnerListParams.builder()
            .setOwnership("fcaowns_xyz")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.AccountOwner>
        stripeCollection =
            client.v1().financialConnections().accounts().owners().list("fca_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xyz/owners",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsOwnersGetServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountOwnerListParams params =
        com.stripe.param.financialconnections.AccountOwnerListParams.builder()
            .setOwnership("fcaowns_xyz")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.AccountOwner>
        stripeCollection =
            client.financialConnections().accounts().owners().list("fca_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xyz/owners",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsOwnersGet2() throws StripeException {
    com.stripe.model.financialconnections.Account resource =
        com.stripe.model.financialconnections.Account.retrieve("fca_xxxxxxxxxxxxx");

    com.stripe.param.financialconnections.AccountListOwnersParams params =
        com.stripe.param.financialconnections.AccountListOwnersParams.builder()
            .setLimit(3L)
            .setOwnership("fcaowns_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.financialconnections.AccountOwnerCollection accountOwners =
        resource.listOwners(params);
    assertNotNull(accountOwners);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/owners",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsOwnersGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountOwnerListParams params =
        com.stripe.param.financialconnections.AccountOwnerListParams.builder()
            .setLimit(3L)
            .setOwnership("fcaowns_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.AccountOwner>
        stripeCollection =
            client
                .v1()
                .financialConnections()
                .accounts()
                .owners()
                .list("fca_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/owners",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsOwnersGet2ServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountOwnerListParams params =
        com.stripe.param.financialconnections.AccountOwnerListParams.builder()
            .setLimit(3L)
            .setOwnership("fcaowns_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.AccountOwner>
        stripeCollection =
            client.financialConnections().accounts().owners().list("fca_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/owners",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsRefreshPost() throws StripeException {
    com.stripe.model.financialconnections.Account resource =
        com.stripe.model.financialconnections.Account.retrieve("fca_xyz");

    com.stripe.param.financialconnections.AccountRefreshParams params =
        com.stripe.param.financialconnections.AccountRefreshParams.builder()
            .addFeature(com.stripe.param.financialconnections.AccountRefreshParams.Feature.BALANCE)
            .build();

    com.stripe.model.financialconnections.Account account = resource.refresh(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/refresh",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsRefreshPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountRefreshParams params =
        com.stripe.param.financialconnections.AccountRefreshParams.builder()
            .addFeature(com.stripe.param.financialconnections.AccountRefreshParams.Feature.BALANCE)
            .build();

    com.stripe.model.financialconnections.Account account =
        client.v1().financialConnections().accounts().refresh("fca_xyz", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/refresh",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsRefreshPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountRefreshParams params =
        com.stripe.param.financialconnections.AccountRefreshParams.builder()
            .addFeature(com.stripe.param.financialconnections.AccountRefreshParams.Feature.BALANCE)
            .build();

    com.stripe.model.financialconnections.Account account =
        client.financialConnections().accounts().refresh("fca_xyz", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/refresh",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsSubscribePost() throws StripeException {
    com.stripe.model.financialconnections.Account resource =
        com.stripe.model.financialconnections.Account.retrieve("fa_123");

    com.stripe.param.financialconnections.AccountSubscribeParams params =
        com.stripe.param.financialconnections.AccountSubscribeParams.builder()
            .addFeature(
                com.stripe.param.financialconnections.AccountSubscribeParams.Feature.TRANSACTIONS)
            .build();

    com.stripe.model.financialconnections.Account account = resource.subscribe(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fa_123/subscribe",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsSubscribePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountSubscribeParams params =
        com.stripe.param.financialconnections.AccountSubscribeParams.builder()
            .addFeature(
                com.stripe.param.financialconnections.AccountSubscribeParams.Feature.TRANSACTIONS)
            .build();

    com.stripe.model.financialconnections.Account account =
        client.v1().financialConnections().accounts().subscribe("fa_123", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fa_123/subscribe",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsSubscribePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountSubscribeParams params =
        com.stripe.param.financialconnections.AccountSubscribeParams.builder()
            .addFeature(
                com.stripe.param.financialconnections.AccountSubscribeParams.Feature.TRANSACTIONS)
            .build();

    com.stripe.model.financialconnections.Account account =
        client.financialConnections().accounts().subscribe("fa_123", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fa_123/subscribe",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsUnsubscribePost() throws StripeException {
    com.stripe.model.financialconnections.Account resource =
        com.stripe.model.financialconnections.Account.retrieve("fa_123");

    com.stripe.param.financialconnections.AccountUnsubscribeParams params =
        com.stripe.param.financialconnections.AccountUnsubscribeParams.builder()
            .addFeature(
                com.stripe.param.financialconnections.AccountUnsubscribeParams.Feature.TRANSACTIONS)
            .build();

    com.stripe.model.financialconnections.Account account = resource.unsubscribe(params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fa_123/unsubscribe",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsUnsubscribePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountUnsubscribeParams params =
        com.stripe.param.financialconnections.AccountUnsubscribeParams.builder()
            .addFeature(
                com.stripe.param.financialconnections.AccountUnsubscribeParams.Feature.TRANSACTIONS)
            .build();

    com.stripe.model.financialconnections.Account account =
        client.v1().financialConnections().accounts().unsubscribe("fa_123", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fa_123/unsubscribe",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsAccountsUnsubscribePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.AccountUnsubscribeParams params =
        com.stripe.param.financialconnections.AccountUnsubscribeParams.builder()
            .addFeature(
                com.stripe.param.financialconnections.AccountUnsubscribeParams.Feature.TRANSACTIONS)
            .build();

    com.stripe.model.financialconnections.Account account =
        client.financialConnections().accounts().unsubscribe("fa_123", params);
    assertNotNull(account);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fa_123/unsubscribe",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsGet() throws StripeException {
    com.stripe.model.financialconnections.Session session =
        com.stripe.model.financialconnections.Session.retrieve("fcsess_xyz");
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/sessions/fcsess_xyz",
        null,
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionRetrieveParams params =
        com.stripe.param.financialconnections.SessionRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Session session =
        client.v1().financialConnections().sessions().retrieve("fcsess_xyz", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/sessions/fcsess_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionRetrieveParams params =
        com.stripe.param.financialconnections.SessionRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Session session =
        client.financialConnections().sessions().retrieve("fcsess_xyz", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/sessions/fcsess_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsGet2() throws StripeException {
    com.stripe.model.financialconnections.Session session =
        com.stripe.model.financialconnections.Session.retrieve("fcsess_xxxxxxxxxxxxx");
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/sessions/fcsess_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionRetrieveParams params =
        com.stripe.param.financialconnections.SessionRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Session session =
        client.v1().financialConnections().sessions().retrieve("fcsess_xxxxxxxxxxxxx", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/sessions/fcsess_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionRetrieveParams params =
        com.stripe.param.financialconnections.SessionRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Session session =
        client.financialConnections().sessions().retrieve("fcsess_xxxxxxxxxxxxx", params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/sessions/fcsess_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsPost() throws StripeException {
    com.stripe.param.financialconnections.SessionCreateParams params =
        com.stripe.param.financialconnections.SessionCreateParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.builder()
                    .setType(
                        com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.Type
                            .CUSTOMER)
                    .setCustomer("cus_123")
                    .build())
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.BALANCES)
            .build();

    com.stripe.model.financialconnections.Session session =
        com.stripe.model.financialconnections.Session.create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionCreateParams params =
        com.stripe.param.financialconnections.SessionCreateParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.builder()
                    .setType(
                        com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.Type
                            .CUSTOMER)
                    .setCustomer("cus_123")
                    .build())
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.BALANCES)
            .build();

    com.stripe.model.financialconnections.Session session =
        client.v1().financialConnections().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionCreateParams params =
        com.stripe.param.financialconnections.SessionCreateParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.builder()
                    .setType(
                        com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.Type
                            .CUSTOMER)
                    .setCustomer("cus_123")
                    .build())
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.BALANCES)
            .build();

    com.stripe.model.financialconnections.Session session =
        client.financialConnections().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsPost2() throws StripeException {
    com.stripe.param.financialconnections.SessionCreateParams params =
        com.stripe.param.financialconnections.SessionCreateParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.builder()
                    .setType(
                        com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.Type
                            .CUSTOMER)
                    .setCustomer("cus_xxxxxxxxxxxxx")
                    .build())
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.PAYMENT_METHOD)
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.BALANCES)
            .setFilters(
                com.stripe.param.financialconnections.SessionCreateParams.Filters.builder()
                    .addCountry("US")
                    .build())
            .build();

    com.stripe.model.financialconnections.Session session =
        com.stripe.model.financialconnections.Session.create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionCreateParams params =
        com.stripe.param.financialconnections.SessionCreateParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.builder()
                    .setType(
                        com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.Type
                            .CUSTOMER)
                    .setCustomer("cus_xxxxxxxxxxxxx")
                    .build())
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.PAYMENT_METHOD)
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.BALANCES)
            .setFilters(
                com.stripe.param.financialconnections.SessionCreateParams.Filters.builder()
                    .addCountry("US")
                    .build())
            .build();

    com.stripe.model.financialconnections.Session session =
        client.v1().financialConnections().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsSessionsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.SessionCreateParams params =
        com.stripe.param.financialconnections.SessionCreateParams.builder()
            .setAccountHolder(
                com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.builder()
                    .setType(
                        com.stripe.param.financialconnections.SessionCreateParams.AccountHolder.Type
                            .CUSTOMER)
                    .setCustomer("cus_xxxxxxxxxxxxx")
                    .build())
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.PAYMENT_METHOD)
            .addPermission(
                com.stripe.param.financialconnections.SessionCreateParams.Permission.BALANCES)
            .setFilters(
                com.stripe.param.financialconnections.SessionCreateParams.Filters.builder()
                    .addCountry("US")
                    .build())
            .build();

    com.stripe.model.financialconnections.Session session =
        client.financialConnections().sessions().create(params);
    assertNotNull(session);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsTransactionsGet() throws StripeException {
    com.stripe.model.financialconnections.Transaction transaction =
        com.stripe.model.financialconnections.Transaction.retrieve("tr_123");
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/transactions/tr_123",
        null,
        null);
  }

  @Test
  public void testFinancialConnectionsTransactionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.TransactionRetrieveParams params =
        com.stripe.param.financialconnections.TransactionRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Transaction transaction =
        client.v1().financialConnections().transactions().retrieve("tr_123", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/transactions/tr_123",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsTransactionsGetServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.TransactionRetrieveParams params =
        com.stripe.param.financialconnections.TransactionRetrieveParams.builder().build();

    com.stripe.model.financialconnections.Transaction transaction =
        client.financialConnections().transactions().retrieve("tr_123", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/transactions/tr_123",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsTransactionsGet2() throws StripeException {
    com.stripe.param.financialconnections.TransactionListParams params =
        com.stripe.param.financialconnections.TransactionListParams.builder()
            .setAccount("fca_xyz")
            .build();

    com.stripe.model.financialconnections.TransactionCollection transactions =
        com.stripe.model.financialconnections.Transaction.list(params);
    assertNotNull(transactions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsTransactionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.TransactionListParams params =
        com.stripe.param.financialconnections.TransactionListParams.builder()
            .setAccount("fca_xyz")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.Transaction>
        stripeCollection = client.v1().financialConnections().transactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testFinancialConnectionsTransactionsGet2ServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.financialconnections.TransactionListParams params =
        com.stripe.param.financialconnections.TransactionListParams.builder()
            .setAccount("fca_xyz")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.financialconnections.Transaction>
        stripeCollection = client.financialConnections().transactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationReportsGet() throws StripeException {
    com.stripe.param.identity.VerificationReportListParams params =
        com.stripe.param.identity.VerificationReportListParams.builder().setLimit(3L).build();

    com.stripe.model.identity.VerificationReportCollection verificationReports =
        com.stripe.model.identity.VerificationReport.list(params);
    assertNotNull(verificationReports);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_reports",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationReportsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationReportListParams params =
        com.stripe.param.identity.VerificationReportListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.identity.VerificationReport>
        stripeCollection = client.v1().identity().verificationReports().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_reports",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationReportsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationReportListParams params =
        com.stripe.param.identity.VerificationReportListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.identity.VerificationReport>
        stripeCollection = client.identity().verificationReports().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_reports",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationReportsGet2() throws StripeException {
    com.stripe.model.identity.VerificationReport verificationReport =
        com.stripe.model.identity.VerificationReport.retrieve("vr_xxxxxxxxxxxxx");
    assertNotNull(verificationReport);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_reports/vr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testIdentityVerificationReportsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationReportRetrieveParams params =
        com.stripe.param.identity.VerificationReportRetrieveParams.builder().build();

    com.stripe.model.identity.VerificationReport verificationReport =
        client.v1().identity().verificationReports().retrieve("vr_xxxxxxxxxxxxx", params);
    assertNotNull(verificationReport);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_reports/vr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationReportsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationReportRetrieveParams params =
        com.stripe.param.identity.VerificationReportRetrieveParams.builder().build();

    com.stripe.model.identity.VerificationReport verificationReport =
        client.identity().verificationReports().retrieve("vr_xxxxxxxxxxxxx", params);
    assertNotNull(verificationReport);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_reports/vr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsCancelPost() throws StripeException {
    com.stripe.model.identity.VerificationSession resource =
        com.stripe.model.identity.VerificationSession.retrieve("vs_xxxxxxxxxxxxx");

    com.stripe.param.identity.VerificationSessionCancelParams params =
        com.stripe.param.identity.VerificationSessionCancelParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession = resource.cancel(params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionCancelParams params =
        com.stripe.param.identity.VerificationSessionCancelParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.v1().identity().verificationSessions().cancel("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsCancelPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionCancelParams params =
        com.stripe.param.identity.VerificationSessionCancelParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.identity().verificationSessions().cancel("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsGet() throws StripeException {
    com.stripe.param.identity.VerificationSessionListParams params =
        com.stripe.param.identity.VerificationSessionListParams.builder().setLimit(3L).build();

    com.stripe.model.identity.VerificationSessionCollection verificationSessions =
        com.stripe.model.identity.VerificationSession.list(params);
    assertNotNull(verificationSessions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionListParams params =
        com.stripe.param.identity.VerificationSessionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.identity.VerificationSession>
        stripeCollection = client.v1().identity().verificationSessions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionListParams params =
        com.stripe.param.identity.VerificationSessionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.identity.VerificationSession>
        stripeCollection = client.identity().verificationSessions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsGet2() throws StripeException {
    com.stripe.model.identity.VerificationSession verificationSession =
        com.stripe.model.identity.VerificationSession.retrieve("vs_xxxxxxxxxxxxx");
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testIdentityVerificationSessionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionRetrieveParams params =
        com.stripe.param.identity.VerificationSessionRetrieveParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.v1().identity().verificationSessions().retrieve("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionRetrieveParams params =
        com.stripe.param.identity.VerificationSessionRetrieveParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.identity().verificationSessions().retrieve("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsPost() throws StripeException {
    com.stripe.param.identity.VerificationSessionCreateParams params =
        com.stripe.param.identity.VerificationSessionCreateParams.builder()
            .setType(com.stripe.param.identity.VerificationSessionCreateParams.Type.DOCUMENT)
            .build();

    com.stripe.model.identity.VerificationSession verificationSession =
        com.stripe.model.identity.VerificationSession.create(params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionCreateParams params =
        com.stripe.param.identity.VerificationSessionCreateParams.builder()
            .setType(com.stripe.param.identity.VerificationSessionCreateParams.Type.DOCUMENT)
            .build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.v1().identity().verificationSessions().create(params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionCreateParams params =
        com.stripe.param.identity.VerificationSessionCreateParams.builder()
            .setType(com.stripe.param.identity.VerificationSessionCreateParams.Type.DOCUMENT)
            .build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.identity().verificationSessions().create(params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsPost2() throws StripeException {
    com.stripe.model.identity.VerificationSession resource =
        com.stripe.model.identity.VerificationSession.retrieve("vs_xxxxxxxxxxxxx");

    com.stripe.param.identity.VerificationSessionUpdateParams params =
        com.stripe.param.identity.VerificationSessionUpdateParams.builder()
            .setType(com.stripe.param.identity.VerificationSessionUpdateParams.Type.ID_NUMBER)
            .build();

    com.stripe.model.identity.VerificationSession verificationSession = resource.update(params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionUpdateParams params =
        com.stripe.param.identity.VerificationSessionUpdateParams.builder()
            .setType(com.stripe.param.identity.VerificationSessionUpdateParams.Type.ID_NUMBER)
            .build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.v1().identity().verificationSessions().update("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionUpdateParams params =
        com.stripe.param.identity.VerificationSessionUpdateParams.builder()
            .setType(com.stripe.param.identity.VerificationSessionUpdateParams.Type.ID_NUMBER)
            .build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.identity().verificationSessions().update("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsRedactPost() throws StripeException {
    com.stripe.model.identity.VerificationSession resource =
        com.stripe.model.identity.VerificationSession.retrieve("vs_xxxxxxxxxxxxx");

    com.stripe.param.identity.VerificationSessionRedactParams params =
        com.stripe.param.identity.VerificationSessionRedactParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession = resource.redact(params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/redact",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsRedactPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionRedactParams params =
        com.stripe.param.identity.VerificationSessionRedactParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.v1().identity().verificationSessions().redact("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/redact",
        params.toMap(),
        null);
  }

  @Test
  public void testIdentityVerificationSessionsRedactPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.identity.VerificationSessionRedactParams params =
        com.stripe.param.identity.VerificationSessionRedactParams.builder().build();

    com.stripe.model.identity.VerificationSession verificationSession =
        client.identity().verificationSessions().redact("vs_xxxxxxxxxxxxx", params);
    assertNotNull(verificationSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/redact",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoiceitemsDelete() throws StripeException {
    InvoiceItem resource = InvoiceItem.retrieve("ii_xxxxxxxxxxxxx");

    InvoiceItem invoiceItem = resource.delete();
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoiceitemsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.InvoiceItem invoiceItem =
        client.v1().invoiceItems().delete("ii_xxxxxxxxxxxxx");
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoiceitemsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.InvoiceItem invoiceItem = client.invoiceItems().delete("ii_xxxxxxxxxxxxx");
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoiceitemsGet() throws StripeException {
    InvoiceItemListParams params = InvoiceItemListParams.builder().setLimit(3L).build();

    InvoiceItemCollection invoiceItems = InvoiceItem.list(params);
    assertNotNull(invoiceItems);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceitemsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemListParams params =
        com.stripe.param.InvoiceItemListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.InvoiceItem> stripeCollection =
        client.v1().invoiceItems().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceitemsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemListParams params =
        com.stripe.param.InvoiceItemListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.InvoiceItem> stripeCollection =
        client.invoiceItems().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceitemsGet2() throws StripeException {
    InvoiceItem invoiceItem = InvoiceItem.retrieve("ii_xxxxxxxxxxxxx");
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoiceitemsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemRetrieveParams params =
        com.stripe.param.InvoiceItemRetrieveParams.builder().build();

    com.stripe.model.InvoiceItem invoiceItem =
        client.v1().invoiceItems().retrieve("ii_xxxxxxxxxxxxx", params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoiceitemsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemRetrieveParams params =
        com.stripe.param.InvoiceItemRetrieveParams.builder().build();

    com.stripe.model.InvoiceItem invoiceItem =
        client.invoiceItems().retrieve("ii_xxxxxxxxxxxxx", params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoiceitemsPost() throws StripeException {
    InvoiceItemCreateParams params =
        InvoiceItemCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    InvoiceItem invoiceItem = InvoiceItem.create(params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceitemsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemCreateParams params =
        com.stripe.param.InvoiceItemCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    com.stripe.model.InvoiceItem invoiceItem = client.v1().invoiceItems().create(params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceitemsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemCreateParams params =
        com.stripe.param.InvoiceItemCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    com.stripe.model.InvoiceItem invoiceItem = client.invoiceItems().create(params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceitemsPost2() throws StripeException {
    InvoiceItem resource = InvoiceItem.retrieve("ii_xxxxxxxxxxxxx");

    InvoiceItemUpdateParams params =
        InvoiceItemUpdateParams.builder().putMetadata("order_id", "6735").build();

    InvoiceItem invoiceItem = resource.update(params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoiceitemsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemUpdateParams params =
        com.stripe.param.InvoiceItemUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.InvoiceItem invoiceItem =
        client.v1().invoiceItems().update("ii_xxxxxxxxxxxxx", params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoiceitemsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemUpdateParams params =
        com.stripe.param.InvoiceItemUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.InvoiceItem invoiceItem =
        client.invoiceItems().update("ii_xxxxxxxxxxxxx", params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoiceitems/ii_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesDelete() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    Invoice invoice = resource.delete();
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoicesDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Invoice invoice = client.v1().invoices().delete("in_xxxxxxxxxxxxx");
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoicesDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Invoice invoice = client.invoices().delete("in_xxxxxxxxxxxxx");
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoicesFinalizePost() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceFinalizeInvoiceParams params = InvoiceFinalizeInvoiceParams.builder().build();

    Invoice invoice = resource.finalizeInvoice(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/finalize",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesFinalizePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceFinalizeInvoiceParams params =
        com.stripe.param.InvoiceFinalizeInvoiceParams.builder().build();

    com.stripe.model.Invoice invoice =
        client.v1().invoices().finalizeInvoice("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/finalize",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesFinalizePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceFinalizeInvoiceParams params =
        com.stripe.param.InvoiceFinalizeInvoiceParams.builder().build();

    com.stripe.model.Invoice invoice =
        client.invoices().finalizeInvoice("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/finalize",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesGet() throws StripeException {
    InvoiceListParams params = InvoiceListParams.builder().setLimit(3L).build();

    InvoiceCollection invoices = Invoice.list(params);
    assertNotNull(invoices);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoicesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceListParams params =
        com.stripe.param.InvoiceListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Invoice> stripeCollection =
        client.v1().invoices().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoicesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceListParams params =
        com.stripe.param.InvoiceListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Invoice> stripeCollection =
        client.invoices().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoicesGet2() throws StripeException {
    Invoice invoice = Invoice.retrieve("in_xxxxxxxxxxxxx");
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testInvoicesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceRetrieveParams params =
        com.stripe.param.InvoiceRetrieveParams.builder().build();

    com.stripe.model.Invoice invoice = client.v1().invoices().retrieve("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceRetrieveParams params =
        com.stripe.param.InvoiceRetrieveParams.builder().build();

    com.stripe.model.Invoice invoice = client.invoices().retrieve("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesGet3() throws StripeException {
    InvoiceRetrieveParams params = InvoiceRetrieveParams.builder().addExpand("customer").build();

    Invoice invoice = Invoice.retrieve("in_xxxxxxxxxxxxx", params, null);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceRetrieveParams params =
        com.stripe.param.InvoiceRetrieveParams.builder().addExpand("customer").build();

    com.stripe.model.Invoice invoice = client.v1().invoices().retrieve("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceRetrieveParams params =
        com.stripe.param.InvoiceRetrieveParams.builder().addExpand("customer").build();

    com.stripe.model.Invoice invoice = client.invoices().retrieve("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesMarkUncollectiblePost() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceMarkUncollectibleParams params = InvoiceMarkUncollectibleParams.builder().build();

    Invoice invoice = resource.markUncollectible(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/mark_uncollectible",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesMarkUncollectiblePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceMarkUncollectibleParams params =
        com.stripe.param.InvoiceMarkUncollectibleParams.builder().build();

    com.stripe.model.Invoice invoice =
        client.v1().invoices().markUncollectible("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/mark_uncollectible",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesMarkUncollectiblePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceMarkUncollectibleParams params =
        com.stripe.param.InvoiceMarkUncollectibleParams.builder().build();

    com.stripe.model.Invoice invoice =
        client.invoices().markUncollectible("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/mark_uncollectible",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesPayPost() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoicePayParams params = InvoicePayParams.builder().build();

    Invoice invoice = resource.pay(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/pay",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesPayPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoicePayParams params = com.stripe.param.InvoicePayParams.builder().build();

    com.stripe.model.Invoice invoice = client.v1().invoices().pay("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/pay",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesPayPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoicePayParams params = com.stripe.param.InvoicePayParams.builder().build();

    com.stripe.model.Invoice invoice = client.invoices().pay("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/pay",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesPost() throws StripeException {
    InvoiceCreateParams params =
        InvoiceCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    Invoice invoice = Invoice.create(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoicesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceCreateParams params =
        com.stripe.param.InvoiceCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    com.stripe.model.Invoice invoice = client.v1().invoices().create(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoicesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceCreateParams params =
        com.stripe.param.InvoiceCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    com.stripe.model.Invoice invoice = client.invoices().create(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoicesPost2() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceUpdateParams params =
        InvoiceUpdateParams.builder().putMetadata("order_id", "6735").build();

    Invoice invoice = resource.update(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceUpdateParams params =
        com.stripe.param.InvoiceUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Invoice invoice = client.v1().invoices().update("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceUpdateParams params =
        com.stripe.param.InvoiceUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Invoice invoice = client.invoices().update("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesSearchGet() throws StripeException {
    InvoiceSearchParams params =
        InvoiceSearchParams.builder().setQuery("total>999 AND metadata['order_id']:'6735'").build();

    InvoiceSearchResult invoices = Invoice.search(params);
    assertNotNull(invoices);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/search",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesSearchGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceSearchParams params =
        com.stripe.param.InvoiceSearchParams.builder()
            .setQuery("total>999 AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Invoice> stripeSearchResult =
        client.v1().invoices().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/search",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesSearchGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceSearchParams params =
        com.stripe.param.InvoiceSearchParams.builder()
            .setQuery("total>999 AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Invoice> stripeSearchResult =
        client.invoices().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/search",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesSendPost() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceSendInvoiceParams params = InvoiceSendInvoiceParams.builder().build();

    Invoice invoice = resource.sendInvoice(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/send",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesSendPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceSendInvoiceParams params =
        com.stripe.param.InvoiceSendInvoiceParams.builder().build();

    com.stripe.model.Invoice invoice =
        client.v1().invoices().sendInvoice("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/send",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesSendPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceSendInvoiceParams params =
        com.stripe.param.InvoiceSendInvoiceParams.builder().build();

    com.stripe.model.Invoice invoice = client.invoices().sendInvoice("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/send",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesVoidPost() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceVoidInvoiceParams params = InvoiceVoidInvoiceParams.builder().build();

    Invoice invoice = resource.voidInvoice(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/void",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesVoidPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceVoidInvoiceParams params =
        com.stripe.param.InvoiceVoidInvoiceParams.builder().build();

    com.stripe.model.Invoice invoice =
        client.v1().invoices().voidInvoice("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/void",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoicesVoidPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceVoidInvoiceParams params =
        com.stripe.param.InvoiceVoidInvoiceParams.builder().build();

    com.stripe.model.Invoice invoice = client.invoices().voidInvoice("in_xxxxxxxxxxxxx", params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/void",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsApprovePost() throws StripeException {
    com.stripe.model.issuing.Authorization resource =
        com.stripe.model.issuing.Authorization.retrieve("iauth_xxxxxxxxxxxxx");

    com.stripe.param.issuing.AuthorizationApproveParams params =
        com.stripe.param.issuing.AuthorizationApproveParams.builder().build();

    com.stripe.model.issuing.Authorization authorization = resource.approve(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/approve",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsApprovePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationApproveParams params =
        com.stripe.param.issuing.AuthorizationApproveParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client.v1().issuing().authorizations().approve("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/approve",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsApprovePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationApproveParams params =
        com.stripe.param.issuing.AuthorizationApproveParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client.issuing().authorizations().approve("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/approve",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsDeclinePost() throws StripeException {
    com.stripe.model.issuing.Authorization resource =
        com.stripe.model.issuing.Authorization.retrieve("iauth_xxxxxxxxxxxxx");

    com.stripe.param.issuing.AuthorizationDeclineParams params =
        com.stripe.param.issuing.AuthorizationDeclineParams.builder().build();

    com.stripe.model.issuing.Authorization authorization = resource.decline(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/decline",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsDeclinePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationDeclineParams params =
        com.stripe.param.issuing.AuthorizationDeclineParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client.v1().issuing().authorizations().decline("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/decline",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsDeclinePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationDeclineParams params =
        com.stripe.param.issuing.AuthorizationDeclineParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client.issuing().authorizations().decline("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/decline",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsGet() throws StripeException {
    com.stripe.param.issuing.AuthorizationListParams params =
        com.stripe.param.issuing.AuthorizationListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.AuthorizationCollection authorizations =
        com.stripe.model.issuing.Authorization.list(params);
    assertNotNull(authorizations);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/authorizations",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationListParams params =
        com.stripe.param.issuing.AuthorizationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Authorization> stripeCollection =
        client.v1().issuing().authorizations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/authorizations",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationListParams params =
        com.stripe.param.issuing.AuthorizationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Authorization> stripeCollection =
        client.issuing().authorizations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/authorizations",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsGet2() throws StripeException {
    com.stripe.model.issuing.Authorization authorization =
        com.stripe.model.issuing.Authorization.retrieve("iauth_xxxxxxxxxxxxx");
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testIssuingAuthorizationsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationRetrieveParams params =
        com.stripe.param.issuing.AuthorizationRetrieveParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client.v1().issuing().authorizations().retrieve("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationRetrieveParams params =
        com.stripe.param.issuing.AuthorizationRetrieveParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client.issuing().authorizations().retrieve("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsPost() throws StripeException {
    com.stripe.model.issuing.Authorization resource =
        com.stripe.model.issuing.Authorization.retrieve("iauth_xxxxxxxxxxxxx");

    com.stripe.param.issuing.AuthorizationUpdateParams params =
        com.stripe.param.issuing.AuthorizationUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Authorization authorization = resource.update(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationUpdateParams params =
        com.stripe.param.issuing.AuthorizationUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client.v1().issuing().authorizations().update("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingAuthorizationsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationUpdateParams params =
        com.stripe.param.issuing.AuthorizationUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client.issuing().authorizations().update("iauth_xxxxxxxxxxxxx", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersGet() throws StripeException {
    com.stripe.param.issuing.CardholderListParams params =
        com.stripe.param.issuing.CardholderListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.CardholderCollection cardholders =
        com.stripe.model.issuing.Cardholder.list(params);
    assertNotNull(cardholders);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cardholders",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderListParams params =
        com.stripe.param.issuing.CardholderListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Cardholder> stripeCollection =
        client.v1().issuing().cardholders().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cardholders",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderListParams params =
        com.stripe.param.issuing.CardholderListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Cardholder> stripeCollection =
        client.issuing().cardholders().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cardholders",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersGet2() throws StripeException {
    com.stripe.model.issuing.Cardholder cardholder =
        com.stripe.model.issuing.Cardholder.retrieve("ich_xxxxxxxxxxxxx");
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testIssuingCardholdersGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderRetrieveParams params =
        com.stripe.param.issuing.CardholderRetrieveParams.builder().build();

    com.stripe.model.issuing.Cardholder cardholder =
        client.v1().issuing().cardholders().retrieve("ich_xxxxxxxxxxxxx", params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderRetrieveParams params =
        com.stripe.param.issuing.CardholderRetrieveParams.builder().build();

    com.stripe.model.issuing.Cardholder cardholder =
        client.issuing().cardholders().retrieve("ich_xxxxxxxxxxxxx", params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersPost() throws StripeException {
    com.stripe.param.issuing.CardholderCreateParams params =
        com.stripe.param.issuing.CardholderCreateParams.builder()
            .setType(com.stripe.param.issuing.CardholderCreateParams.Type.INDIVIDUAL)
            .setName("Jenny Rosen")
            .setEmail("jenny.rosen@example.com")
            .setPhoneNumber("+18888675309")
            .setBilling(
                com.stripe.param.issuing.CardholderCreateParams.Billing.builder()
                    .setAddress(
                        com.stripe.param.issuing.CardholderCreateParams.Billing.Address.builder()
                            .setLine1("1234 Main Street")
                            .setCity("San Francisco")
                            .setState("CA")
                            .setCountry("US")
                            .setPostalCode("94111")
                            .build())
                    .build())
            .build();

    com.stripe.model.issuing.Cardholder cardholder =
        com.stripe.model.issuing.Cardholder.create(params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cardholders",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderCreateParams params =
        com.stripe.param.issuing.CardholderCreateParams.builder()
            .setType(com.stripe.param.issuing.CardholderCreateParams.Type.INDIVIDUAL)
            .setName("Jenny Rosen")
            .setEmail("jenny.rosen@example.com")
            .setPhoneNumber("+18888675309")
            .setBilling(
                com.stripe.param.issuing.CardholderCreateParams.Billing.builder()
                    .setAddress(
                        com.stripe.param.issuing.CardholderCreateParams.Billing.Address.builder()
                            .setLine1("1234 Main Street")
                            .setCity("San Francisco")
                            .setState("CA")
                            .setCountry("US")
                            .setPostalCode("94111")
                            .build())
                    .build())
            .build();

    com.stripe.model.issuing.Cardholder cardholder =
        client.v1().issuing().cardholders().create(params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cardholders",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderCreateParams params =
        com.stripe.param.issuing.CardholderCreateParams.builder()
            .setType(com.stripe.param.issuing.CardholderCreateParams.Type.INDIVIDUAL)
            .setName("Jenny Rosen")
            .setEmail("jenny.rosen@example.com")
            .setPhoneNumber("+18888675309")
            .setBilling(
                com.stripe.param.issuing.CardholderCreateParams.Billing.builder()
                    .setAddress(
                        com.stripe.param.issuing.CardholderCreateParams.Billing.Address.builder()
                            .setLine1("1234 Main Street")
                            .setCity("San Francisco")
                            .setState("CA")
                            .setCountry("US")
                            .setPostalCode("94111")
                            .build())
                    .build())
            .build();

    com.stripe.model.issuing.Cardholder cardholder = client.issuing().cardholders().create(params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cardholders",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersPost2() throws StripeException {
    com.stripe.model.issuing.Cardholder resource =
        com.stripe.model.issuing.Cardholder.retrieve("ich_xxxxxxxxxxxxx");

    com.stripe.param.issuing.CardholderUpdateParams params =
        com.stripe.param.issuing.CardholderUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Cardholder cardholder = resource.update(params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderUpdateParams params =
        com.stripe.param.issuing.CardholderUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Cardholder cardholder =
        client.v1().issuing().cardholders().update("ich_xxxxxxxxxxxxx", params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardholdersPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardholderUpdateParams params =
        com.stripe.param.issuing.CardholderUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Cardholder cardholder =
        client.issuing().cardholders().update("ich_xxxxxxxxxxxxx", params);
    assertNotNull(cardholder);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardsGet() throws StripeException {
    com.stripe.param.issuing.CardListParams params =
        com.stripe.param.issuing.CardListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.CardCollection cards = com.stripe.model.issuing.Card.list(params);
    assertNotNull(cards);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/issuing/cards", params.toMap(), null);
  }

  @Test
  public void testIssuingCardsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardListParams params =
        com.stripe.param.issuing.CardListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Card> stripeCollection =
        client.v1().issuing().cards().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/issuing/cards", params.toMap(), null);
  }

  @Test
  public void testIssuingCardsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardListParams params =
        com.stripe.param.issuing.CardListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Card> stripeCollection =
        client.issuing().cards().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/issuing/cards", params.toMap(), null);
  }

  @Test
  public void testIssuingCardsGet2() throws StripeException {
    com.stripe.model.issuing.Card card = com.stripe.model.issuing.Card.retrieve("ic_xxxxxxxxxxxxx");
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cards/ic_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testIssuingCardsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardRetrieveParams params =
        com.stripe.param.issuing.CardRetrieveParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.v1().issuing().cards().retrieve("ic_xxxxxxxxxxxxx", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cards/ic_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardRetrieveParams params =
        com.stripe.param.issuing.CardRetrieveParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.issuing().cards().retrieve("ic_xxxxxxxxxxxxx", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/cards/ic_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardsPost() throws StripeException {
    com.stripe.param.issuing.CardCreateParams params =
        com.stripe.param.issuing.CardCreateParams.builder()
            .setCardholder("ich_xxxxxxxxxxxxx")
            .setCurrency("usd")
            .setType(com.stripe.param.issuing.CardCreateParams.Type.VIRTUAL)
            .build();

    com.stripe.model.issuing.Card card = com.stripe.model.issuing.Card.create(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/issuing/cards", params.toMap(), null);
  }

  @Test
  public void testIssuingCardsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardCreateParams params =
        com.stripe.param.issuing.CardCreateParams.builder()
            .setCardholder("ich_xxxxxxxxxxxxx")
            .setCurrency("usd")
            .setType(com.stripe.param.issuing.CardCreateParams.Type.VIRTUAL)
            .build();

    com.stripe.model.issuing.Card card = client.v1().issuing().cards().create(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/issuing/cards", params.toMap(), null);
  }

  @Test
  public void testIssuingCardsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardCreateParams params =
        com.stripe.param.issuing.CardCreateParams.builder()
            .setCardholder("ich_xxxxxxxxxxxxx")
            .setCurrency("usd")
            .setType(com.stripe.param.issuing.CardCreateParams.Type.VIRTUAL)
            .build();

    com.stripe.model.issuing.Card card = client.issuing().cards().create(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/issuing/cards", params.toMap(), null);
  }

  @Test
  public void testIssuingCardsPost2() throws StripeException {
    com.stripe.model.issuing.Card resource =
        com.stripe.model.issuing.Card.retrieve("ic_xxxxxxxxxxxxx");

    com.stripe.param.issuing.CardUpdateParams params =
        com.stripe.param.issuing.CardUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.issuing.Card card = resource.update(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cards/ic_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardUpdateParams params =
        com.stripe.param.issuing.CardUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.issuing.Card card =
        client.v1().issuing().cards().update("ic_xxxxxxxxxxxxx", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cards/ic_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingCardsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardUpdateParams params =
        com.stripe.param.issuing.CardUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.issuing.Card card =
        client.issuing().cards().update("ic_xxxxxxxxxxxxx", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cards/ic_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesGet() throws StripeException {
    com.stripe.param.issuing.DisputeListParams params =
        com.stripe.param.issuing.DisputeListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.DisputeCollection disputes =
        com.stripe.model.issuing.Dispute.list(params);
    assertNotNull(disputes);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/disputes",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeListParams params =
        com.stripe.param.issuing.DisputeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Dispute> stripeCollection =
        client.v1().issuing().disputes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/disputes",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeListParams params =
        com.stripe.param.issuing.DisputeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Dispute> stripeCollection =
        client.issuing().disputes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/disputes",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesGet2() throws StripeException {
    com.stripe.model.issuing.Dispute dispute =
        com.stripe.model.issuing.Dispute.retrieve("idp_xxxxxxxxxxxxx");
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/disputes/idp_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testIssuingDisputesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeRetrieveParams params =
        com.stripe.param.issuing.DisputeRetrieveParams.builder().build();

    com.stripe.model.issuing.Dispute dispute =
        client.v1().issuing().disputes().retrieve("idp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/disputes/idp_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeRetrieveParams params =
        com.stripe.param.issuing.DisputeRetrieveParams.builder().build();

    com.stripe.model.issuing.Dispute dispute =
        client.issuing().disputes().retrieve("idp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/disputes/idp_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesPost() throws StripeException {
    com.stripe.param.issuing.DisputeCreateParams params =
        com.stripe.param.issuing.DisputeCreateParams.builder()
            .setTransaction("ipi_xxxxxxxxxxxxx")
            .setEvidence(
                com.stripe.param.issuing.DisputeCreateParams.Evidence.builder()
                    .setReason(
                        com.stripe.param.issuing.DisputeCreateParams.Evidence.Reason.FRAUDULENT)
                    .setFraudulent(
                        com.stripe.param.issuing.DisputeCreateParams.Evidence.Fraudulent.builder()
                            .setExplanation("Purchase was unrecognized.")
                            .build())
                    .build())
            .build();

    com.stripe.model.issuing.Dispute dispute = com.stripe.model.issuing.Dispute.create(params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/disputes",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeCreateParams params =
        com.stripe.param.issuing.DisputeCreateParams.builder()
            .setTransaction("ipi_xxxxxxxxxxxxx")
            .setEvidence(
                com.stripe.param.issuing.DisputeCreateParams.Evidence.builder()
                    .setReason(
                        com.stripe.param.issuing.DisputeCreateParams.Evidence.Reason.FRAUDULENT)
                    .setFraudulent(
                        com.stripe.param.issuing.DisputeCreateParams.Evidence.Fraudulent.builder()
                            .setExplanation("Purchase was unrecognized.")
                            .build())
                    .build())
            .build();

    com.stripe.model.issuing.Dispute dispute = client.v1().issuing().disputes().create(params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/disputes",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeCreateParams params =
        com.stripe.param.issuing.DisputeCreateParams.builder()
            .setTransaction("ipi_xxxxxxxxxxxxx")
            .setEvidence(
                com.stripe.param.issuing.DisputeCreateParams.Evidence.builder()
                    .setReason(
                        com.stripe.param.issuing.DisputeCreateParams.Evidence.Reason.FRAUDULENT)
                    .setFraudulent(
                        com.stripe.param.issuing.DisputeCreateParams.Evidence.Fraudulent.builder()
                            .setExplanation("Purchase was unrecognized.")
                            .build())
                    .build())
            .build();

    com.stripe.model.issuing.Dispute dispute = client.issuing().disputes().create(params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/disputes",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesSubmitPost() throws StripeException {
    com.stripe.model.issuing.Dispute resource =
        com.stripe.model.issuing.Dispute.retrieve("idp_xxxxxxxxxxxxx");

    com.stripe.param.issuing.DisputeSubmitParams params =
        com.stripe.param.issuing.DisputeSubmitParams.builder().build();

    com.stripe.model.issuing.Dispute dispute = resource.submit(params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/disputes/idp_xxxxxxxxxxxxx/submit",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesSubmitPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeSubmitParams params =
        com.stripe.param.issuing.DisputeSubmitParams.builder().build();

    com.stripe.model.issuing.Dispute dispute =
        client.v1().issuing().disputes().submit("idp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/disputes/idp_xxxxxxxxxxxxx/submit",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingDisputesSubmitPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.DisputeSubmitParams params =
        com.stripe.param.issuing.DisputeSubmitParams.builder().build();

    com.stripe.model.issuing.Dispute dispute =
        client.issuing().disputes().submit("idp_xxxxxxxxxxxxx", params);
    assertNotNull(dispute);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/disputes/idp_xxxxxxxxxxxxx/submit",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsGet() throws StripeException {
    com.stripe.param.issuing.PersonalizationDesignListParams params =
        com.stripe.param.issuing.PersonalizationDesignListParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesignCollection personalizationDesigns =
        com.stripe.model.issuing.PersonalizationDesign.list(params);
    assertNotNull(personalizationDesigns);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/personalization_designs",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignListParams params =
        com.stripe.param.issuing.PersonalizationDesignListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.PersonalizationDesign>
        stripeCollection = client.v1().issuing().personalizationDesigns().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/personalization_designs",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignListParams params =
        com.stripe.param.issuing.PersonalizationDesignListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.PersonalizationDesign>
        stripeCollection = client.issuing().personalizationDesigns().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/personalization_designs",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsGet2() throws StripeException {
    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        com.stripe.model.issuing.PersonalizationDesign.retrieve("pd_xyz");
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/personalization_designs/pd_xyz",
        null,
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignRetrieveParams params =
        com.stripe.param.issuing.PersonalizationDesignRetrieveParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.v1().issuing().personalizationDesigns().retrieve("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/personalization_designs/pd_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignRetrieveParams params =
        com.stripe.param.issuing.PersonalizationDesignRetrieveParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.issuing().personalizationDesigns().retrieve("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/personalization_designs/pd_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsPost() throws StripeException {
    com.stripe.param.issuing.PersonalizationDesignCreateParams params =
        com.stripe.param.issuing.PersonalizationDesignCreateParams.builder()
            .setPhysicalBundle("pb_xyz")
            .build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        com.stripe.model.issuing.PersonalizationDesign.create(params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/personalization_designs",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignCreateParams params =
        com.stripe.param.issuing.PersonalizationDesignCreateParams.builder()
            .setPhysicalBundle("pb_xyz")
            .build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.v1().issuing().personalizationDesigns().create(params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/personalization_designs",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignCreateParams params =
        com.stripe.param.issuing.PersonalizationDesignCreateParams.builder()
            .setPhysicalBundle("pb_xyz")
            .build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.issuing().personalizationDesigns().create(params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/personalization_designs",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsPost2() throws StripeException {
    com.stripe.model.issuing.PersonalizationDesign resource =
        com.stripe.model.issuing.PersonalizationDesign.retrieve("pd_xyz");

    com.stripe.param.issuing.PersonalizationDesignUpdateParams params =
        com.stripe.param.issuing.PersonalizationDesignUpdateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign = resource.update(params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/personalization_designs/pd_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignUpdateParams params =
        com.stripe.param.issuing.PersonalizationDesignUpdateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.v1().issuing().personalizationDesigns().update("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/personalization_designs/pd_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPersonalizationDesignsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignUpdateParams params =
        com.stripe.param.issuing.PersonalizationDesignUpdateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.issuing().personalizationDesigns().update("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/personalization_designs/pd_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPhysicalBundlesGet() throws StripeException {
    com.stripe.param.issuing.PhysicalBundleListParams params =
        com.stripe.param.issuing.PhysicalBundleListParams.builder().build();

    com.stripe.model.issuing.PhysicalBundleCollection physicalBundles =
        com.stripe.model.issuing.PhysicalBundle.list(params);
    assertNotNull(physicalBundles);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/physical_bundles",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPhysicalBundlesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PhysicalBundleListParams params =
        com.stripe.param.issuing.PhysicalBundleListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.PhysicalBundle> stripeCollection =
        client.v1().issuing().physicalBundles().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/physical_bundles",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPhysicalBundlesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PhysicalBundleListParams params =
        com.stripe.param.issuing.PhysicalBundleListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.PhysicalBundle> stripeCollection =
        client.issuing().physicalBundles().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/physical_bundles",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPhysicalBundlesGet2() throws StripeException {
    com.stripe.model.issuing.PhysicalBundle physicalBundle =
        com.stripe.model.issuing.PhysicalBundle.retrieve("pb_xyz");
    assertNotNull(physicalBundle);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/physical_bundles/pb_xyz",
        null,
        null);
  }

  @Test
  public void testIssuingPhysicalBundlesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PhysicalBundleRetrieveParams params =
        com.stripe.param.issuing.PhysicalBundleRetrieveParams.builder().build();

    com.stripe.model.issuing.PhysicalBundle physicalBundle =
        client.v1().issuing().physicalBundles().retrieve("pb_xyz", params);
    assertNotNull(physicalBundle);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/physical_bundles/pb_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingPhysicalBundlesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PhysicalBundleRetrieveParams params =
        com.stripe.param.issuing.PhysicalBundleRetrieveParams.builder().build();

    com.stripe.model.issuing.PhysicalBundle physicalBundle =
        client.issuing().physicalBundles().retrieve("pb_xyz", params);
    assertNotNull(physicalBundle);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/physical_bundles/pb_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsGet() throws StripeException {
    com.stripe.param.issuing.TransactionListParams params =
        com.stripe.param.issuing.TransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.TransactionCollection transactions =
        com.stripe.model.issuing.Transaction.list(params);
    assertNotNull(transactions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionListParams params =
        com.stripe.param.issuing.TransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Transaction> stripeCollection =
        client.v1().issuing().transactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionListParams params =
        com.stripe.param.issuing.TransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.issuing.Transaction> stripeCollection =
        client.issuing().transactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsGet2() throws StripeException {
    com.stripe.model.issuing.Transaction transaction =
        com.stripe.model.issuing.Transaction.retrieve("ipi_xxxxxxxxxxxxx");
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testIssuingTransactionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionRetrieveParams params =
        com.stripe.param.issuing.TransactionRetrieveParams.builder().build();

    com.stripe.model.issuing.Transaction transaction =
        client.v1().issuing().transactions().retrieve("ipi_xxxxxxxxxxxxx", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionRetrieveParams params =
        com.stripe.param.issuing.TransactionRetrieveParams.builder().build();

    com.stripe.model.issuing.Transaction transaction =
        client.issuing().transactions().retrieve("ipi_xxxxxxxxxxxxx", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsPost() throws StripeException {
    com.stripe.model.issuing.Transaction resource =
        com.stripe.model.issuing.Transaction.retrieve("ipi_xxxxxxxxxxxxx");

    com.stripe.param.issuing.TransactionUpdateParams params =
        com.stripe.param.issuing.TransactionUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Transaction transaction = resource.update(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionUpdateParams params =
        com.stripe.param.issuing.TransactionUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Transaction transaction =
        client.v1().issuing().transactions().update("ipi_xxxxxxxxxxxxx", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testIssuingTransactionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionUpdateParams params =
        com.stripe.param.issuing.TransactionUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.issuing.Transaction transaction =
        client.issuing().transactions().update("ipi_xxxxxxxxxxxxx", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testMandatesGet() throws StripeException {
    Mandate mandate = Mandate.retrieve("mandate_xxxxxxxxxxxxx");
    assertNotNull(mandate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/mandates/mandate_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testMandatesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.MandateRetrieveParams params =
        com.stripe.param.MandateRetrieveParams.builder().build();

    com.stripe.model.Mandate mandate =
        client.v1().mandates().retrieve("mandate_xxxxxxxxxxxxx", params);
    assertNotNull(mandate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/mandates/mandate_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testMandatesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.MandateRetrieveParams params =
        com.stripe.param.MandateRetrieveParams.builder().build();

    com.stripe.model.Mandate mandate = client.mandates().retrieve("mandate_xxxxxxxxxxxxx", params);
    assertNotNull(mandate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/mandates/mandate_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsApplyCustomerBalancePost() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentApplyCustomerBalanceParams params =
        PaymentIntentApplyCustomerBalanceParams.builder().build();

    PaymentIntent paymentIntent = resource.applyCustomerBalance(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/apply_customer_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsApplyCustomerBalancePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentApplyCustomerBalanceParams params =
        com.stripe.param.PaymentIntentApplyCustomerBalanceParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().applyCustomerBalance("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/apply_customer_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsApplyCustomerBalancePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentApplyCustomerBalanceParams params =
        com.stripe.param.PaymentIntentApplyCustomerBalanceParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().applyCustomerBalance("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/apply_customer_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsCancelPost() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentCancelParams params = PaymentIntentCancelParams.builder().build();

    PaymentIntent paymentIntent = resource.cancel(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCancelParams params =
        com.stripe.param.PaymentIntentCancelParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().cancel("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCancelParams params =
        com.stripe.param.PaymentIntentCancelParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().cancel("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsCapturePost() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentCaptureParams params = PaymentIntentCaptureParams.builder().build();

    PaymentIntent paymentIntent = resource.capture(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsCapturePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCaptureParams params =
        com.stripe.param.PaymentIntentCaptureParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().capture("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsCapturePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCaptureParams params =
        com.stripe.param.PaymentIntentCaptureParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().capture("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsConfirmPost() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentConfirmParams params =
        PaymentIntentConfirmParams.builder().setPaymentMethod("pm_card_visa").build();

    PaymentIntent paymentIntent = resource.confirm(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/confirm",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsConfirmPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentConfirmParams params =
        com.stripe.param.PaymentIntentConfirmParams.builder()
            .setPaymentMethod("pm_card_visa")
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().confirm("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/confirm",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsConfirmPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentConfirmParams params =
        com.stripe.param.PaymentIntentConfirmParams.builder()
            .setPaymentMethod("pm_card_visa")
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().confirm("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/confirm",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsGet() throws StripeException {
    PaymentIntentListParams params = PaymentIntentListParams.builder().setLimit(3L).build();

    PaymentIntentCollection paymentIntents = PaymentIntent.list(params);
    assertNotNull(paymentIntents);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentListParams params =
        com.stripe.param.PaymentIntentListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentIntent> stripeCollection =
        client.v1().paymentIntents().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentListParams params =
        com.stripe.param.PaymentIntentListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentIntent> stripeCollection =
        client.paymentIntents().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsGet2() throws StripeException {
    PaymentIntent paymentIntent = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPaymentIntentsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentRetrieveParams params =
        com.stripe.param.PaymentIntentRetrieveParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().retrieve("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentRetrieveParams params =
        com.stripe.param.PaymentIntentRetrieveParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().retrieve("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsIncrementAuthorizationPost() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentIncrementAuthorizationParams params =
        PaymentIntentIncrementAuthorizationParams.builder().setAmount(2099L).build();

    PaymentIntent paymentIntent = resource.incrementAuthorization(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/increment_authorization",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsIncrementAuthorizationPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentIncrementAuthorizationParams params =
        com.stripe.param.PaymentIntentIncrementAuthorizationParams.builder()
            .setAmount(2099L)
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().incrementAuthorization("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/increment_authorization",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsIncrementAuthorizationPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentIncrementAuthorizationParams params =
        com.stripe.param.PaymentIntentIncrementAuthorizationParams.builder()
            .setAmount(2099L)
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().incrementAuthorization("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/increment_authorization",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost() throws StripeException {
    PaymentIntentCreateParams params =
        PaymentIntentCreateParams.builder()
            .setAmount(1099L)
            .setCurrency("eur")
            .setAutomaticPaymentMethods(
                PaymentIntentCreateParams.AutomaticPaymentMethods.builder()
                    .setEnabled(true)
                    .build())
            .build();

    PaymentIntent paymentIntent = PaymentIntent.create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCreateParams params =
        com.stripe.param.PaymentIntentCreateParams.builder()
            .setAmount(1099L)
            .setCurrency("eur")
            .setAutomaticPaymentMethods(
                com.stripe.param.PaymentIntentCreateParams.AutomaticPaymentMethods.builder()
                    .setEnabled(true)
                    .build())
            .build();

    com.stripe.model.PaymentIntent paymentIntent = client.v1().paymentIntents().create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCreateParams params =
        com.stripe.param.PaymentIntentCreateParams.builder()
            .setAmount(1099L)
            .setCurrency("eur")
            .setAutomaticPaymentMethods(
                com.stripe.param.PaymentIntentCreateParams.AutomaticPaymentMethods.builder()
                    .setEnabled(true)
                    .build())
            .build();

    com.stripe.model.PaymentIntent paymentIntent = client.paymentIntents().create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost2() throws StripeException {
    PaymentIntentCreateParams params =
        PaymentIntentCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setAutomaticPaymentMethods(
                PaymentIntentCreateParams.AutomaticPaymentMethods.builder()
                    .setEnabled(true)
                    .build())
            .build();

    PaymentIntent paymentIntent = PaymentIntent.create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCreateParams params =
        com.stripe.param.PaymentIntentCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setAutomaticPaymentMethods(
                com.stripe.param.PaymentIntentCreateParams.AutomaticPaymentMethods.builder()
                    .setEnabled(true)
                    .build())
            .build();

    com.stripe.model.PaymentIntent paymentIntent = client.v1().paymentIntents().create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCreateParams params =
        com.stripe.param.PaymentIntentCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setAutomaticPaymentMethods(
                com.stripe.param.PaymentIntentCreateParams.AutomaticPaymentMethods.builder()
                    .setEnabled(true)
                    .build())
            .build();

    com.stripe.model.PaymentIntent paymentIntent = client.paymentIntents().create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost3() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentUpdateParams params =
        PaymentIntentUpdateParams.builder().putMetadata("order_id", "6735").build();

    PaymentIntent paymentIntent = resource.update(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentUpdateParams params =
        com.stripe.param.PaymentIntentUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().update("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentUpdateParams params =
        com.stripe.param.PaymentIntentUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().update("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost4() throws StripeException {
    PaymentIntentCreateParams params =
        PaymentIntentCreateParams.builder()
            .setAmount(200L)
            .setCurrency("usd")
            .setPaymentMethodData(
                PaymentIntentCreateParams.PaymentMethodData.builder()
                    .setType(PaymentIntentCreateParams.PaymentMethodData.Type.P24)
                    .setP24(
                        PaymentIntentCreateParams.PaymentMethodData.P24
                            .builder()
                            .setBank(PaymentIntentCreateParams.PaymentMethodData.P24.Bank.BLIK)
                            .build())
                    .build())
            .build();

    PaymentIntent paymentIntent = PaymentIntent.create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCreateParams params =
        com.stripe.param.PaymentIntentCreateParams.builder()
            .setAmount(200L)
            .setCurrency("usd")
            .setPaymentMethodData(
                com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.builder()
                    .setType(com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.Type.P24)
                    .setP24(
                        com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.P24
                            .builder()
                            .setBank(
                                com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.P24
                                    .Bank
                                    .BLIK)
                            .build())
                    .build())
            .build();

    com.stripe.model.PaymentIntent paymentIntent = client.v1().paymentIntents().create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsPost4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentCreateParams params =
        com.stripe.param.PaymentIntentCreateParams.builder()
            .setAmount(200L)
            .setCurrency("usd")
            .setPaymentMethodData(
                com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.builder()
                    .setType(com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.Type.P24)
                    .setP24(
                        com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.P24
                            .builder()
                            .setBank(
                                com.stripe.param.PaymentIntentCreateParams.PaymentMethodData.P24
                                    .Bank
                                    .BLIK)
                            .build())
                    .build())
            .build();

    com.stripe.model.PaymentIntent paymentIntent = client.paymentIntents().create(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsSearchGet() throws StripeException {
    PaymentIntentSearchParams params =
        PaymentIntentSearchParams.builder()
            .setQuery("status:'succeeded' AND metadata['order_id']:'6735'")
            .build();

    PaymentIntentSearchResult paymentIntents = PaymentIntent.search(params);
    assertNotNull(paymentIntents);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents/search",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsSearchGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentSearchParams params =
        com.stripe.param.PaymentIntentSearchParams.builder()
            .setQuery("status:'succeeded' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.PaymentIntent> stripeSearchResult =
        client.v1().paymentIntents().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents/search",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsSearchGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentSearchParams params =
        com.stripe.param.PaymentIntentSearchParams.builder()
            .setQuery("status:'succeeded' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.PaymentIntent> stripeSearchResult =
        client.paymentIntents().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_intents/search",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsVerifyMicrodepositsPost() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentVerifyMicrodepositsParams params =
        PaymentIntentVerifyMicrodepositsParams.builder().build();

    PaymentIntent paymentIntent = resource.verifyMicrodeposits(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsVerifyMicrodepositsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentVerifyMicrodepositsParams params =
        com.stripe.param.PaymentIntentVerifyMicrodepositsParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().verifyMicrodeposits("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsVerifyMicrodepositsPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentVerifyMicrodepositsParams params =
        com.stripe.param.PaymentIntentVerifyMicrodepositsParams.builder().build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().verifyMicrodeposits("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsVerifyMicrodepositsPost2() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentVerifyMicrodepositsParams params =
        PaymentIntentVerifyMicrodepositsParams.builder().addAmount(32L).addAmount(45L).build();

    PaymentIntent paymentIntent = resource.verifyMicrodeposits(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsVerifyMicrodepositsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentVerifyMicrodepositsParams params =
        com.stripe.param.PaymentIntentVerifyMicrodepositsParams.builder()
            .addAmount(32L)
            .addAmount(45L)
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.v1().paymentIntents().verifyMicrodeposits("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentsVerifyMicrodepositsPost2ServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentIntentVerifyMicrodepositsParams params =
        com.stripe.param.PaymentIntentVerifyMicrodepositsParams.builder()
            .addAmount(32L)
            .addAmount(45L)
            .build();

    com.stripe.model.PaymentIntent paymentIntent =
        client.paymentIntents().verifyMicrodeposits("pi_xxxxxxxxxxxxx", params);
    assertNotNull(paymentIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksGet() throws StripeException {
    PaymentLink paymentLink = PaymentLink.retrieve("pl_xyz");
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payment_links/pl_xyz", null, null);
  }

  @Test
  public void testPaymentLinksGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkRetrieveParams params =
        com.stripe.param.PaymentLinkRetrieveParams.builder().build();

    com.stripe.model.PaymentLink paymentLink =
        client.v1().paymentLinks().retrieve("pl_xyz", params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/pl_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkRetrieveParams params =
        com.stripe.param.PaymentLinkRetrieveParams.builder().build();

    com.stripe.model.PaymentLink paymentLink = client.paymentLinks().retrieve("pl_xyz", params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/pl_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksGet2() throws StripeException {
    PaymentLinkListParams params = PaymentLinkListParams.builder().setLimit(3L).build();

    PaymentLinkCollection paymentLinks = PaymentLink.list(params);
    assertNotNull(paymentLinks);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkListParams params =
        com.stripe.param.PaymentLinkListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentLink> stripeCollection =
        client.v1().paymentLinks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkListParams params =
        com.stripe.param.PaymentLinkListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentLink> stripeCollection =
        client.paymentLinks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksGet3() throws StripeException {
    PaymentLink paymentLink = PaymentLink.retrieve("plink_xxxxxxxxxxxxx");
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/plink_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPaymentLinksGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkRetrieveParams params =
        com.stripe.param.PaymentLinkRetrieveParams.builder().build();

    com.stripe.model.PaymentLink paymentLink =
        client.v1().paymentLinks().retrieve("plink_xxxxxxxxxxxxx", params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/plink_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkRetrieveParams params =
        com.stripe.param.PaymentLinkRetrieveParams.builder().build();

    com.stripe.model.PaymentLink paymentLink =
        client.paymentLinks().retrieve("plink_xxxxxxxxxxxxx", params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/plink_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksLineItemsGet() throws StripeException {
    PaymentLink resource = PaymentLink.retrieve("pl_xyz");

    PaymentLinkListLineItemsParams params = PaymentLinkListLineItemsParams.builder().build();

    LineItemCollection lineItems = resource.listLineItems(params);
    assertNotNull(lineItems);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/pl_xyz/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksLineItemsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkLineItemListParams params =
        com.stripe.param.PaymentLinkLineItemListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.LineItem> stripeCollection =
        client.v1().paymentLinks().lineItems().list("pl_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/pl_xyz/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksLineItemsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkLineItemListParams params =
        com.stripe.param.PaymentLinkLineItemListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.LineItem> stripeCollection =
        client.paymentLinks().lineItems().list("pl_xyz", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_links/pl_xyz/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksPost() throws StripeException {
    PaymentLinkCreateParams params =
        PaymentLinkCreateParams.builder()
            .addLineItem(
                PaymentLinkCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    PaymentLink paymentLink = PaymentLink.create(params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkCreateParams params =
        com.stripe.param.PaymentLinkCreateParams.builder()
            .addLineItem(
                com.stripe.param.PaymentLinkCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.PaymentLink paymentLink = client.v1().paymentLinks().create(params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkCreateParams params =
        com.stripe.param.PaymentLinkCreateParams.builder()
            .addLineItem(
                com.stripe.param.PaymentLinkCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.PaymentLink paymentLink = client.paymentLinks().create(params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksPost2() throws StripeException {
    PaymentLinkCreateParams params =
        PaymentLinkCreateParams.builder()
            .addLineItem(
                PaymentLinkCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    PaymentLink paymentLink = PaymentLink.create(params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkCreateParams params =
        com.stripe.param.PaymentLinkCreateParams.builder()
            .addLineItem(
                com.stripe.param.PaymentLinkCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.PaymentLink paymentLink = client.v1().paymentLinks().create(params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkCreateParams params =
        com.stripe.param.PaymentLinkCreateParams.builder()
            .addLineItem(
                com.stripe.param.PaymentLinkCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(1L)
                    .build())
            .build();

    com.stripe.model.PaymentLink paymentLink = client.paymentLinks().create(params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinksPost3() throws StripeException {
    PaymentLink resource = PaymentLink.retrieve("plink_xxxxxxxxxxxxx");

    PaymentLinkUpdateParams params = PaymentLinkUpdateParams.builder().setActive(false).build();

    PaymentLink paymentLink = resource.update(params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_links/plink_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkUpdateParams params =
        com.stripe.param.PaymentLinkUpdateParams.builder().setActive(false).build();

    com.stripe.model.PaymentLink paymentLink =
        client.v1().paymentLinks().update("plink_xxxxxxxxxxxxx", params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_links/plink_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentLinksPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentLinkUpdateParams params =
        com.stripe.param.PaymentLinkUpdateParams.builder().setActive(false).build();

    com.stripe.model.PaymentLink paymentLink =
        client.paymentLinks().update("plink_xxxxxxxxxxxxx", params);
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_links/plink_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsGet() throws StripeException {
    PaymentMethodConfigurationListParams params =
        PaymentMethodConfigurationListParams.builder().setApplication("foo").build();

    PaymentMethodConfigurationCollection paymentMethodConfigurations =
        PaymentMethodConfiguration.list(params);
    assertNotNull(paymentMethodConfigurations);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_method_configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationListParams params =
        com.stripe.param.PaymentMethodConfigurationListParams.builder()
            .setApplication("foo")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethodConfiguration>
        stripeCollection = client.v1().paymentMethodConfigurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_method_configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationListParams params =
        com.stripe.param.PaymentMethodConfigurationListParams.builder()
            .setApplication("foo")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethodConfiguration>
        stripeCollection = client.paymentMethodConfigurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_method_configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsGet2() throws StripeException {
    PaymentMethodConfiguration paymentMethodConfiguration =
        PaymentMethodConfiguration.retrieve("foo");
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_method_configurations/foo",
        null,
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationRetrieveParams params =
        com.stripe.param.PaymentMethodConfigurationRetrieveParams.builder().build();

    com.stripe.model.PaymentMethodConfiguration paymentMethodConfiguration =
        client.v1().paymentMethodConfigurations().retrieve("foo", params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_method_configurations/foo",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationRetrieveParams params =
        com.stripe.param.PaymentMethodConfigurationRetrieveParams.builder().build();

    com.stripe.model.PaymentMethodConfiguration paymentMethodConfiguration =
        client.paymentMethodConfigurations().retrieve("foo", params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_method_configurations/foo",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsPost() throws StripeException {
    PaymentMethodConfigurationCreateParams params =
        PaymentMethodConfigurationCreateParams.builder()
            .setAcssDebit(
                PaymentMethodConfigurationCreateParams.AcssDebit.builder()
                    .setDisplayPreference(
                        PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference.builder()
                            .setPreference(
                                PaymentMethodConfigurationCreateParams.AcssDebit.DisplayPreference
                                    .Preference.NONE)
                            .build())
                    .build())
            .setAffirm(
                PaymentMethodConfigurationCreateParams.Affirm.builder()
                    .setDisplayPreference(
                        PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference.builder()
                            .setPreference(
                                PaymentMethodConfigurationCreateParams.Affirm.DisplayPreference
                                    .Preference.NONE)
                            .build())
                    .build())
            .build();

    PaymentMethodConfiguration paymentMethodConfiguration =
        PaymentMethodConfiguration.create(params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_method_configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationCreateParams params =
        com.stripe.param.PaymentMethodConfigurationCreateParams.builder()
            .setAcssDebit(
                com.stripe.param.PaymentMethodConfigurationCreateParams.AcssDebit.builder()
                    .setDisplayPreference(
                        com.stripe.param.PaymentMethodConfigurationCreateParams.AcssDebit
                            .DisplayPreference.builder()
                            .setPreference(
                                com.stripe.param.PaymentMethodConfigurationCreateParams.AcssDebit
                                    .DisplayPreference.Preference.NONE)
                            .build())
                    .build())
            .setAffirm(
                com.stripe.param.PaymentMethodConfigurationCreateParams.Affirm.builder()
                    .setDisplayPreference(
                        com.stripe.param.PaymentMethodConfigurationCreateParams.Affirm
                            .DisplayPreference.builder()
                            .setPreference(
                                com.stripe.param.PaymentMethodConfigurationCreateParams.Affirm
                                    .DisplayPreference.Preference.NONE)
                            .build())
                    .build())
            .build();

    com.stripe.model.PaymentMethodConfiguration paymentMethodConfiguration =
        client.v1().paymentMethodConfigurations().create(params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_method_configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationCreateParams params =
        com.stripe.param.PaymentMethodConfigurationCreateParams.builder()
            .setAcssDebit(
                com.stripe.param.PaymentMethodConfigurationCreateParams.AcssDebit.builder()
                    .setDisplayPreference(
                        com.stripe.param.PaymentMethodConfigurationCreateParams.AcssDebit
                            .DisplayPreference.builder()
                            .setPreference(
                                com.stripe.param.PaymentMethodConfigurationCreateParams.AcssDebit
                                    .DisplayPreference.Preference.NONE)
                            .build())
                    .build())
            .setAffirm(
                com.stripe.param.PaymentMethodConfigurationCreateParams.Affirm.builder()
                    .setDisplayPreference(
                        com.stripe.param.PaymentMethodConfigurationCreateParams.Affirm
                            .DisplayPreference.builder()
                            .setPreference(
                                com.stripe.param.PaymentMethodConfigurationCreateParams.Affirm
                                    .DisplayPreference.Preference.NONE)
                            .build())
                    .build())
            .build();

    com.stripe.model.PaymentMethodConfiguration paymentMethodConfiguration =
        client.paymentMethodConfigurations().create(params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_method_configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsPost2() throws StripeException {
    PaymentMethodConfiguration resource = PaymentMethodConfiguration.retrieve("foo");

    PaymentMethodConfigurationUpdateParams params =
        PaymentMethodConfigurationUpdateParams.builder()
            .setAcssDebit(
                PaymentMethodConfigurationUpdateParams.AcssDebit.builder()
                    .setDisplayPreference(
                        PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference.builder()
                            .setPreference(
                                PaymentMethodConfigurationUpdateParams.AcssDebit.DisplayPreference
                                    .Preference.ON)
                            .build())
                    .build())
            .build();

    PaymentMethodConfiguration paymentMethodConfiguration = resource.update(params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_method_configurations/foo",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationUpdateParams params =
        com.stripe.param.PaymentMethodConfigurationUpdateParams.builder()
            .setAcssDebit(
                com.stripe.param.PaymentMethodConfigurationUpdateParams.AcssDebit.builder()
                    .setDisplayPreference(
                        com.stripe.param.PaymentMethodConfigurationUpdateParams.AcssDebit
                            .DisplayPreference.builder()
                            .setPreference(
                                com.stripe.param.PaymentMethodConfigurationUpdateParams.AcssDebit
                                    .DisplayPreference.Preference.ON)
                            .build())
                    .build())
            .build();

    com.stripe.model.PaymentMethodConfiguration paymentMethodConfiguration =
        client.v1().paymentMethodConfigurations().update("foo", params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_method_configurations/foo",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodConfigurationUpdateParams params =
        com.stripe.param.PaymentMethodConfigurationUpdateParams.builder()
            .setAcssDebit(
                com.stripe.param.PaymentMethodConfigurationUpdateParams.AcssDebit.builder()
                    .setDisplayPreference(
                        com.stripe.param.PaymentMethodConfigurationUpdateParams.AcssDebit
                            .DisplayPreference.builder()
                            .setPreference(
                                com.stripe.param.PaymentMethodConfigurationUpdateParams.AcssDebit
                                    .DisplayPreference.Preference.ON)
                            .build())
                    .build())
            .build();

    com.stripe.model.PaymentMethodConfiguration paymentMethodConfiguration =
        client.paymentMethodConfigurations().update("foo", params);
    assertNotNull(paymentMethodConfiguration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_method_configurations/foo",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsAttachPost() throws StripeException {
    PaymentMethod resource = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");

    PaymentMethodAttachParams params =
        PaymentMethodAttachParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    PaymentMethod paymentMethod = resource.attach(params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/attach",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsAttachPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodAttachParams params =
        com.stripe.param.PaymentMethodAttachParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.v1().paymentMethods().attach("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/attach",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsAttachPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodAttachParams params =
        com.stripe.param.PaymentMethodAttachParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.paymentMethods().attach("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/attach",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsDetachPost() throws StripeException {
    PaymentMethod resource = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");

    PaymentMethodDetachParams params = PaymentMethodDetachParams.builder().build();

    PaymentMethod paymentMethod = resource.detach(params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/detach",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsDetachPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodDetachParams params =
        com.stripe.param.PaymentMethodDetachParams.builder().build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.v1().paymentMethods().detach("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/detach",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsDetachPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodDetachParams params =
        com.stripe.param.PaymentMethodDetachParams.builder().build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.paymentMethods().detach("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/detach",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsGet() throws StripeException {
    PaymentMethodListParams params =
        PaymentMethodListParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setType(PaymentMethodListParams.Type.CARD)
            .build();

    PaymentMethodCollection paymentMethods = PaymentMethod.list(params);
    assertNotNull(paymentMethods);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodListParams params =
        com.stripe.param.PaymentMethodListParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setType(com.stripe.param.PaymentMethodListParams.Type.CARD)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethod> stripeCollection =
        client.v1().paymentMethods().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodListParams params =
        com.stripe.param.PaymentMethodListParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setType(com.stripe.param.PaymentMethodListParams.Type.CARD)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.PaymentMethod> stripeCollection =
        client.paymentMethods().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_methods",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsGet2() throws StripeException {
    PaymentMethod paymentMethod = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPaymentMethodsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodRetrieveParams params =
        com.stripe.param.PaymentMethodRetrieveParams.builder().build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.v1().paymentMethods().retrieve("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodRetrieveParams params =
        com.stripe.param.PaymentMethodRetrieveParams.builder().build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.paymentMethods().retrieve("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsPost2() throws StripeException {
    PaymentMethod resource = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");

    PaymentMethodUpdateParams params =
        PaymentMethodUpdateParams.builder().putMetadata("order_id", "6735").build();

    PaymentMethod paymentMethod = resource.update(params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodUpdateParams params =
        com.stripe.param.PaymentMethodUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.v1().paymentMethods().update("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentMethodUpdateParams params =
        com.stripe.param.PaymentMethodUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PaymentMethod paymentMethod =
        client.paymentMethods().update("pm_xxxxxxxxxxxxx", params);
    assertNotNull(paymentMethod);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsCancelPost() throws StripeException {
    Payout resource = Payout.retrieve("po_xxxxxxxxxxxxx");

    PayoutCancelParams params = PayoutCancelParams.builder().build();

    Payout payout = resource.cancel(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutCancelParams params =
        com.stripe.param.PayoutCancelParams.builder().build();

    com.stripe.model.Payout payout = client.v1().payouts().cancel("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutCancelParams params =
        com.stripe.param.PayoutCancelParams.builder().build();

    com.stripe.model.Payout payout = client.payouts().cancel("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsGet() throws StripeException {
    PayoutListParams params = PayoutListParams.builder().setLimit(3L).build();

    PayoutCollection payouts = Payout.list(params);
    assertNotNull(payouts);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutListParams params =
        com.stripe.param.PayoutListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Payout> stripeCollection =
        client.v1().payouts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutListParams params =
        com.stripe.param.PayoutListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Payout> stripeCollection =
        client.payouts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutsGet2() throws StripeException {
    Payout payout = Payout.retrieve("po_xxxxxxxxxxxxx");
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payouts/po_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testPayoutsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutRetrieveParams params =
        com.stripe.param.PayoutRetrieveParams.builder().build();

    com.stripe.model.Payout payout = client.v1().payouts().retrieve("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payouts/po_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutRetrieveParams params =
        com.stripe.param.PayoutRetrieveParams.builder().build();

    com.stripe.model.Payout payout = client.payouts().retrieve("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/payouts/po_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsPost() throws StripeException {
    PayoutCreateParams params =
        PayoutCreateParams.builder().setAmount(1100L).setCurrency("usd").build();

    Payout payout = Payout.create(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutCreateParams params =
        com.stripe.param.PayoutCreateParams.builder().setAmount(1100L).setCurrency("usd").build();

    com.stripe.model.Payout payout = client.v1().payouts().create(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutCreateParams params =
        com.stripe.param.PayoutCreateParams.builder().setAmount(1100L).setCurrency("usd").build();

    com.stripe.model.Payout payout = client.payouts().create(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutsPost2() throws StripeException {
    Payout resource = Payout.retrieve("po_xxxxxxxxxxxxx");

    PayoutUpdateParams params =
        PayoutUpdateParams.builder().putMetadata("order_id", "6735").build();

    Payout payout = resource.update(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutUpdateParams params =
        com.stripe.param.PayoutUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Payout payout = client.v1().payouts().update("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutUpdateParams params =
        com.stripe.param.PayoutUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Payout payout = client.payouts().update("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsReversePost() throws StripeException {
    Payout resource = Payout.retrieve("po_xxxxxxxxxxxxx");

    PayoutReverseParams params = PayoutReverseParams.builder().build();

    Payout payout = resource.reverse(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx/reverse",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsReversePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutReverseParams params =
        com.stripe.param.PayoutReverseParams.builder().build();

    com.stripe.model.Payout payout = client.v1().payouts().reverse("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx/reverse",
        params.toMap(),
        null);
  }

  @Test
  public void testPayoutsReversePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutReverseParams params =
        com.stripe.param.PayoutReverseParams.builder().build();

    com.stripe.model.Payout payout = client.payouts().reverse("po_xxxxxxxxxxxxx", params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/payouts/po_xxxxxxxxxxxxx/reverse",
        params.toMap(),
        null);
  }

  @Test
  public void testPlansDelete() throws StripeException {
    Plan resource = Plan.retrieve("price_xxxxxxxxxxxxx");

    Plan plan = resource.delete();
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/plans/price_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPlansDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Plan plan = client.v1().plans().delete("price_xxxxxxxxxxxxx");
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/plans/price_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPlansDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Plan plan = client.plans().delete("price_xxxxxxxxxxxxx");
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/plans/price_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPlansGet() throws StripeException {
    PlanListParams params = PlanListParams.builder().setLimit(3L).build();

    PlanCollection plans = Plan.list(params);
    assertNotNull(plans);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanListParams params =
        com.stripe.param.PlanListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Plan> stripeCollection =
        client.v1().plans().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanListParams params =
        com.stripe.param.PlanListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Plan> stripeCollection =
        client.plans().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansGet2() throws StripeException {
    Plan plan = Plan.retrieve("price_xxxxxxxxxxxxx");
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/plans/price_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPlansGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanRetrieveParams params =
        com.stripe.param.PlanRetrieveParams.builder().build();

    com.stripe.model.Plan plan = client.v1().plans().retrieve("price_xxxxxxxxxxxxx", params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/plans/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPlansGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanRetrieveParams params =
        com.stripe.param.PlanRetrieveParams.builder().build();

    com.stripe.model.Plan plan = client.plans().retrieve("price_xxxxxxxxxxxxx", params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/plans/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPlansPost() throws StripeException {
    PlanCreateParams params =
        PlanCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setInterval(PlanCreateParams.Interval.MONTH)
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    Plan plan = Plan.create(params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanCreateParams params =
        com.stripe.param.PlanCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setInterval(com.stripe.param.PlanCreateParams.Interval.MONTH)
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.Plan plan = client.v1().plans().create(params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanCreateParams params =
        com.stripe.param.PlanCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setInterval(com.stripe.param.PlanCreateParams.Interval.MONTH)
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.Plan plan = client.plans().create(params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansPost2() throws StripeException {
    PlanCreateParams params =
        PlanCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setInterval(PlanCreateParams.Interval.MONTH)
            .setProduct(PlanCreateParams.Product.builder().setName("My product").build())
            .build();

    Plan plan = Plan.create(params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanCreateParams params =
        com.stripe.param.PlanCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setInterval(com.stripe.param.PlanCreateParams.Interval.MONTH)
            .setProduct(
                com.stripe.param.PlanCreateParams.Product.builder().setName("My product").build())
            .build();

    com.stripe.model.Plan plan = client.v1().plans().create(params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanCreateParams params =
        com.stripe.param.PlanCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setInterval(com.stripe.param.PlanCreateParams.Interval.MONTH)
            .setProduct(
                com.stripe.param.PlanCreateParams.Product.builder().setName("My product").build())
            .build();

    com.stripe.model.Plan plan = client.plans().create(params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlansPost3() throws StripeException {
    Plan resource = Plan.retrieve("price_xxxxxxxxxxxxx");

    PlanUpdateParams params = PlanUpdateParams.builder().putMetadata("order_id", "6735").build();

    Plan plan = resource.update(params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/plans/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPlansPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanUpdateParams params =
        com.stripe.param.PlanUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Plan plan = client.v1().plans().update("price_xxxxxxxxxxxxx", params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/plans/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPlansPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PlanUpdateParams params =
        com.stripe.param.PlanUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Plan plan = client.plans().update("price_xxxxxxxxxxxxx", params);
    assertNotNull(plan);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/plans/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPricesGet() throws StripeException {
    PriceListParams params = PriceListParams.builder().setLimit(3L).build();

    PriceCollection prices = Price.list(params);
    assertNotNull(prices);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceListParams params =
        com.stripe.param.PriceListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Price> stripeCollection =
        client.v1().prices().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceListParams params =
        com.stripe.param.PriceListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Price> stripeCollection =
        client.prices().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesGet2() throws StripeException {
    Price price = Price.retrieve("price_xxxxxxxxxxxxx");
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/prices/price_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPricesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceRetrieveParams params =
        com.stripe.param.PriceRetrieveParams.builder().build();

    com.stripe.model.Price price = client.v1().prices().retrieve("price_xxxxxxxxxxxxx", params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/prices/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPricesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceRetrieveParams params =
        com.stripe.param.PriceRetrieveParams.builder().build();

    com.stripe.model.Price price = client.prices().retrieve("price_xxxxxxxxxxxxx", params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/prices/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPricesPost() throws StripeException {
    PriceCreateParams params =
        PriceCreateParams.builder()
            .setUnitAmount(2000L)
            .setCurrency("usd")
            .putCurrencyOption(
                "uah", PriceCreateParams.CurrencyOption.builder().setUnitAmount(5000L).build())
            .putCurrencyOption(
                "eur", PriceCreateParams.CurrencyOption.builder().setUnitAmount(1800L).build())
            .setRecurring(
                PriceCreateParams.Recurring.builder()
                    .setInterval(PriceCreateParams.Recurring.Interval.MONTH)
                    .build())
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    Price price = Price.create(params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceCreateParams params =
        com.stripe.param.PriceCreateParams.builder()
            .setUnitAmount(2000L)
            .setCurrency("usd")
            .putCurrencyOption(
                "uah",
                com.stripe.param.PriceCreateParams.CurrencyOption.builder()
                    .setUnitAmount(5000L)
                    .build())
            .putCurrencyOption(
                "eur",
                com.stripe.param.PriceCreateParams.CurrencyOption.builder()
                    .setUnitAmount(1800L)
                    .build())
            .setRecurring(
                com.stripe.param.PriceCreateParams.Recurring.builder()
                    .setInterval(com.stripe.param.PriceCreateParams.Recurring.Interval.MONTH)
                    .build())
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.Price price = client.v1().prices().create(params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceCreateParams params =
        com.stripe.param.PriceCreateParams.builder()
            .setUnitAmount(2000L)
            .setCurrency("usd")
            .putCurrencyOption(
                "uah",
                com.stripe.param.PriceCreateParams.CurrencyOption.builder()
                    .setUnitAmount(5000L)
                    .build())
            .putCurrencyOption(
                "eur",
                com.stripe.param.PriceCreateParams.CurrencyOption.builder()
                    .setUnitAmount(1800L)
                    .build())
            .setRecurring(
                com.stripe.param.PriceCreateParams.Recurring.builder()
                    .setInterval(com.stripe.param.PriceCreateParams.Recurring.Interval.MONTH)
                    .build())
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.Price price = client.prices().create(params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesPost2() throws StripeException {
    PriceCreateParams params =
        PriceCreateParams.builder()
            .setUnitAmount(2000L)
            .setCurrency("usd")
            .setRecurring(
                PriceCreateParams.Recurring.builder()
                    .setInterval(PriceCreateParams.Recurring.Interval.MONTH)
                    .build())
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    Price price = Price.create(params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceCreateParams params =
        com.stripe.param.PriceCreateParams.builder()
            .setUnitAmount(2000L)
            .setCurrency("usd")
            .setRecurring(
                com.stripe.param.PriceCreateParams.Recurring.builder()
                    .setInterval(com.stripe.param.PriceCreateParams.Recurring.Interval.MONTH)
                    .build())
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.Price price = client.v1().prices().create(params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceCreateParams params =
        com.stripe.param.PriceCreateParams.builder()
            .setUnitAmount(2000L)
            .setCurrency("usd")
            .setRecurring(
                com.stripe.param.PriceCreateParams.Recurring.builder()
                    .setInterval(com.stripe.param.PriceCreateParams.Recurring.Interval.MONTH)
                    .build())
            .setProduct("prod_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.Price price = client.prices().create(params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPricesPost3() throws StripeException {
    Price resource = Price.retrieve("price_xxxxxxxxxxxxx");

    PriceUpdateParams params = PriceUpdateParams.builder().putMetadata("order_id", "6735").build();

    Price price = resource.update(params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/prices/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPricesPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceUpdateParams params =
        com.stripe.param.PriceUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Price price = client.v1().prices().update("price_xxxxxxxxxxxxx", params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/prices/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPricesPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceUpdateParams params =
        com.stripe.param.PriceUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Price price = client.prices().update("price_xxxxxxxxxxxxx", params);
    assertNotNull(price);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/prices/price_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPricesSearchGet() throws StripeException {
    PriceSearchParams params =
        PriceSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    PriceSearchResult prices = Price.search(params);
    assertNotNull(prices);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/prices/search", params.toMap(), null);
  }

  @Test
  public void testPricesSearchGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceSearchParams params =
        com.stripe.param.PriceSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Price> stripeSearchResult =
        client.v1().prices().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/prices/search", params.toMap(), null);
  }

  @Test
  public void testPricesSearchGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PriceSearchParams params =
        com.stripe.param.PriceSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Price> stripeSearchResult =
        client.prices().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/prices/search", params.toMap(), null);
  }

  @Test
  public void testProductsDelete() throws StripeException {
    Product resource = Product.retrieve("prod_xxxxxxxxxxxxx");

    Product product = resource.delete();
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/products/prod_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testProductsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Product product = client.v1().products().delete("prod_xxxxxxxxxxxxx");
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/products/prod_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testProductsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Product product = client.products().delete("prod_xxxxxxxxxxxxx");
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/products/prod_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testProductsGet() throws StripeException {
    ProductListParams params = ProductListParams.builder().setLimit(3L).build();

    ProductCollection products = Product.list(params);
    assertNotNull(products);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductListParams params =
        com.stripe.param.ProductListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Product> stripeCollection =
        client.v1().products().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductListParams params =
        com.stripe.param.ProductListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Product> stripeCollection =
        client.products().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductsGet2() throws StripeException {
    Product product = Product.retrieve("prod_xxxxxxxxxxxxx");
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/products/prod_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testProductsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductRetrieveParams params =
        com.stripe.param.ProductRetrieveParams.builder().build();

    com.stripe.model.Product product =
        client.v1().products().retrieve("prod_xxxxxxxxxxxxx", params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/products/prod_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testProductsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductRetrieveParams params =
        com.stripe.param.ProductRetrieveParams.builder().build();

    com.stripe.model.Product product = client.products().retrieve("prod_xxxxxxxxxxxxx", params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/products/prod_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testProductsPost() throws StripeException {
    ProductCreateParams params = ProductCreateParams.builder().setName("Gold Special").build();

    Product product = Product.create(params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductCreateParams params =
        com.stripe.param.ProductCreateParams.builder().setName("Gold Special").build();

    com.stripe.model.Product product = client.v1().products().create(params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductCreateParams params =
        com.stripe.param.ProductCreateParams.builder().setName("Gold Special").build();

    com.stripe.model.Product product = client.products().create(params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductsPost2() throws StripeException {
    Product resource = Product.retrieve("prod_xxxxxxxxxxxxx");

    ProductUpdateParams params =
        ProductUpdateParams.builder().putMetadata("order_id", "6735").build();

    Product product = resource.update(params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/products/prod_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testProductsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductUpdateParams params =
        com.stripe.param.ProductUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Product product = client.v1().products().update("prod_xxxxxxxxxxxxx", params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/products/prod_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testProductsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductUpdateParams params =
        com.stripe.param.ProductUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Product product = client.products().update("prod_xxxxxxxxxxxxx", params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/products/prod_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testProductsSearchGet() throws StripeException {
    ProductSearchParams params =
        ProductSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    ProductSearchResult products = Product.search(params);
    assertNotNull(products);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/products/search",
        params.toMap(),
        null);
  }

  @Test
  public void testProductsSearchGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductSearchParams params =
        com.stripe.param.ProductSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Product> stripeSearchResult =
        client.v1().products().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/products/search",
        params.toMap(),
        null);
  }

  @Test
  public void testProductsSearchGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductSearchParams params =
        com.stripe.param.ProductSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Product> stripeSearchResult =
        client.products().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/products/search",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesGet() throws StripeException {
    PromotionCodeListParams params = PromotionCodeListParams.builder().setLimit(3L).build();

    PromotionCodeCollection promotionCodes = PromotionCode.list(params);
    assertNotNull(promotionCodes);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/promotion_codes",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeListParams params =
        com.stripe.param.PromotionCodeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.PromotionCode> stripeCollection =
        client.v1().promotionCodes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/promotion_codes",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeListParams params =
        com.stripe.param.PromotionCodeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.PromotionCode> stripeCollection =
        client.promotionCodes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/promotion_codes",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesGet2() throws StripeException {
    PromotionCode promotionCode = PromotionCode.retrieve("promo_xxxxxxxxxxxxx");
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/promotion_codes/promo_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testPromotionCodesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeRetrieveParams params =
        com.stripe.param.PromotionCodeRetrieveParams.builder().build();

    com.stripe.model.PromotionCode promotionCode =
        client.v1().promotionCodes().retrieve("promo_xxxxxxxxxxxxx", params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/promotion_codes/promo_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeRetrieveParams params =
        com.stripe.param.PromotionCodeRetrieveParams.builder().build();

    com.stripe.model.PromotionCode promotionCode =
        client.promotionCodes().retrieve("promo_xxxxxxxxxxxxx", params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/promotion_codes/promo_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesPost() throws StripeException {
    PromotionCodeCreateParams params =
        PromotionCodeCreateParams.builder()
            .setPromotion(
                PromotionCodeCreateParams.Promotion.builder()
                    .setType(PromotionCodeCreateParams.Promotion.Type.COUPON)
                    .setCoupon("Z4OV52SU")
                    .build())
            .build();

    PromotionCode promotionCode = PromotionCode.create(params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/promotion_codes",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeCreateParams params =
        com.stripe.param.PromotionCodeCreateParams.builder()
            .setPromotion(
                com.stripe.param.PromotionCodeCreateParams.Promotion.builder()
                    .setType(com.stripe.param.PromotionCodeCreateParams.Promotion.Type.COUPON)
                    .setCoupon("Z4OV52SU")
                    .build())
            .build();

    com.stripe.model.PromotionCode promotionCode = client.v1().promotionCodes().create(params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/promotion_codes",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeCreateParams params =
        com.stripe.param.PromotionCodeCreateParams.builder()
            .setPromotion(
                com.stripe.param.PromotionCodeCreateParams.Promotion.builder()
                    .setType(com.stripe.param.PromotionCodeCreateParams.Promotion.Type.COUPON)
                    .setCoupon("Z4OV52SU")
                    .build())
            .build();

    com.stripe.model.PromotionCode promotionCode = client.promotionCodes().create(params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/promotion_codes",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesPost2() throws StripeException {
    PromotionCode resource = PromotionCode.retrieve("promo_xxxxxxxxxxxxx");

    PromotionCodeUpdateParams params =
        PromotionCodeUpdateParams.builder().putMetadata("order_id", "6735").build();

    PromotionCode promotionCode = resource.update(params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/promotion_codes/promo_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeUpdateParams params =
        com.stripe.param.PromotionCodeUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PromotionCode promotionCode =
        client.v1().promotionCodes().update("promo_xxxxxxxxxxxxx", params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/promotion_codes/promo_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testPromotionCodesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeUpdateParams params =
        com.stripe.param.PromotionCodeUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.PromotionCode promotionCode =
        client.promotionCodes().update("promo_xxxxxxxxxxxxx", params);
    assertNotNull(promotionCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/promotion_codes/promo_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesAcceptPost() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteAcceptParams params = QuoteAcceptParams.builder().build();

    Quote quote = resource.accept(params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/accept",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesAcceptPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteAcceptParams params =
        com.stripe.param.QuoteAcceptParams.builder().build();

    com.stripe.model.Quote quote = client.v1().quotes().accept("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/accept",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesAcceptPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteAcceptParams params =
        com.stripe.param.QuoteAcceptParams.builder().build();

    com.stripe.model.Quote quote = client.quotes().accept("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/accept",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesCancelPost() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteCancelParams params = QuoteCancelParams.builder().build();

    Quote quote = resource.cancel(params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteCancelParams params =
        com.stripe.param.QuoteCancelParams.builder().build();

    com.stripe.model.Quote quote = client.v1().quotes().cancel("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteCancelParams params =
        com.stripe.param.QuoteCancelParams.builder().build();

    com.stripe.model.Quote quote = client.quotes().cancel("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesFinalizePost() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteFinalizeQuoteParams params = QuoteFinalizeQuoteParams.builder().build();

    Quote quote = resource.finalizeQuote(params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/finalize",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesFinalizePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteFinalizeQuoteParams params =
        com.stripe.param.QuoteFinalizeQuoteParams.builder().build();

    com.stripe.model.Quote quote = client.v1().quotes().finalizeQuote("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/finalize",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesFinalizePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteFinalizeQuoteParams params =
        com.stripe.param.QuoteFinalizeQuoteParams.builder().build();

    com.stripe.model.Quote quote = client.quotes().finalizeQuote("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx/finalize",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesGet() throws StripeException {
    QuoteListParams params = QuoteListParams.builder().setLimit(3L).build();

    QuoteCollection quotes = Quote.list(params);
    assertNotNull(quotes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/quotes", params.toMap(), null);
  }

  @Test
  public void testQuotesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteListParams params =
        com.stripe.param.QuoteListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Quote> stripeCollection =
        client.v1().quotes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/quotes", params.toMap(), null);
  }

  @Test
  public void testQuotesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteListParams params =
        com.stripe.param.QuoteListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Quote> stripeCollection =
        client.quotes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/quotes", params.toMap(), null);
  }

  @Test
  public void testQuotesGet2() throws StripeException {
    Quote quote = Quote.retrieve("qt_xxxxxxxxxxxxx");
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/quotes/qt_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testQuotesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteRetrieveParams params =
        com.stripe.param.QuoteRetrieveParams.builder().build();

    com.stripe.model.Quote quote = client.v1().quotes().retrieve("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteRetrieveParams params =
        com.stripe.param.QuoteRetrieveParams.builder().build();

    com.stripe.model.Quote quote = client.quotes().retrieve("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesLineItemsGet() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteListLineItemsParams params = QuoteListLineItemsParams.builder().build();

    LineItemCollection lineItems = resource.listLineItems(params);
    assertNotNull(lineItems);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesLineItemsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteLineItemListParams params =
        com.stripe.param.QuoteLineItemListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.LineItem> stripeCollection =
        client.v1().quotes().lineItems().list("qt_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesLineItemsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteLineItemListParams params =
        com.stripe.param.QuoteLineItemListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.LineItem> stripeCollection =
        client.quotes().lineItems().list("qt_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx/line_items",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesPdfGet() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuotePdfParams params = QuotePdfParams.builder().build();

    java.io.InputStream file = resource.pdf(params);
    assertNotNull(file);
    verifyRequest(
        BaseAddress.FILES,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx/pdf",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesPdfGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuotePdfParams params = com.stripe.param.QuotePdfParams.builder().build();

    java.io.InputStream inputStream = client.v1().quotes().pdf("qt_xxxxxxxxxxxxx", params);
    assertNotNull(inputStream);
    verifyRequest(
        BaseAddress.FILES,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx/pdf",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesPdfGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuotePdfParams params = com.stripe.param.QuotePdfParams.builder().build();

    java.io.InputStream inputStream = client.quotes().pdf("qt_xxxxxxxxxxxxx", params);
    assertNotNull(inputStream);
    verifyRequest(
        BaseAddress.FILES,
        ApiResource.RequestMethod.GET,
        "/v1/quotes/qt_xxxxxxxxxxxxx/pdf",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesPost() throws StripeException {
    QuoteCreateParams params =
        QuoteCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .addLineItem(
                QuoteCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(2L)
                    .build())
            .build();

    Quote quote = Quote.create(params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/quotes", params.toMap(), null);
  }

  @Test
  public void testQuotesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteCreateParams params =
        com.stripe.param.QuoteCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .addLineItem(
                com.stripe.param.QuoteCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(2L)
                    .build())
            .build();

    com.stripe.model.Quote quote = client.v1().quotes().create(params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/quotes", params.toMap(), null);
  }

  @Test
  public void testQuotesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteCreateParams params =
        com.stripe.param.QuoteCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .addLineItem(
                com.stripe.param.QuoteCreateParams.LineItem.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .setQuantity(2L)
                    .build())
            .build();

    com.stripe.model.Quote quote = client.quotes().create(params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/quotes", params.toMap(), null);
  }

  @Test
  public void testQuotesPost2() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteUpdateParams params = QuoteUpdateParams.builder().putMetadata("order_id", "6735").build();

    Quote quote = resource.update(params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteUpdateParams params =
        com.stripe.param.QuoteUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Quote quote = client.v1().quotes().update("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testQuotesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.QuoteUpdateParams params =
        com.stripe.param.QuoteUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Quote quote = client.quotes().update("qt_xxxxxxxxxxxxx", params);
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/quotes/qt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarEarlyFraudWarningsGet() throws StripeException {
    com.stripe.param.radar.EarlyFraudWarningListParams params =
        com.stripe.param.radar.EarlyFraudWarningListParams.builder().setLimit(3L).build();

    com.stripe.model.radar.EarlyFraudWarningCollection earlyFraudWarnings =
        com.stripe.model.radar.EarlyFraudWarning.list(params);
    assertNotNull(earlyFraudWarnings);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/early_fraud_warnings",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarEarlyFraudWarningsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.EarlyFraudWarningListParams params =
        com.stripe.param.radar.EarlyFraudWarningListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.radar.EarlyFraudWarning> stripeCollection =
        client.v1().radar().earlyFraudWarnings().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/early_fraud_warnings",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarEarlyFraudWarningsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.EarlyFraudWarningListParams params =
        com.stripe.param.radar.EarlyFraudWarningListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.radar.EarlyFraudWarning> stripeCollection =
        client.radar().earlyFraudWarnings().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/early_fraud_warnings",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarEarlyFraudWarningsGet2() throws StripeException {
    com.stripe.model.radar.EarlyFraudWarning earlyFraudWarning =
        com.stripe.model.radar.EarlyFraudWarning.retrieve("issfr_xxxxxxxxxxxxx");
    assertNotNull(earlyFraudWarning);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/early_fraud_warnings/issfr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarEarlyFraudWarningsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.EarlyFraudWarningRetrieveParams params =
        com.stripe.param.radar.EarlyFraudWarningRetrieveParams.builder().build();

    com.stripe.model.radar.EarlyFraudWarning earlyFraudWarning =
        client.v1().radar().earlyFraudWarnings().retrieve("issfr_xxxxxxxxxxxxx", params);
    assertNotNull(earlyFraudWarning);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/early_fraud_warnings/issfr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarEarlyFraudWarningsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.EarlyFraudWarningRetrieveParams params =
        com.stripe.param.radar.EarlyFraudWarningRetrieveParams.builder().build();

    com.stripe.model.radar.EarlyFraudWarning earlyFraudWarning =
        client.radar().earlyFraudWarnings().retrieve("issfr_xxxxxxxxxxxxx", params);
    assertNotNull(earlyFraudWarning);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/early_fraud_warnings/issfr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsDelete() throws StripeException {
    com.stripe.model.radar.ValueListItem resource =
        com.stripe.model.radar.ValueListItem.retrieve("rsli_xxxxxxxxxxxxx");

    com.stripe.model.radar.ValueListItem valueListItem = resource.delete();
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListItemsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.radar.ValueListItem valueListItem =
        client.v1().radar().valueListItems().delete("rsli_xxxxxxxxxxxxx");
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListItemsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.radar.ValueListItem valueListItem =
        client.radar().valueListItems().delete("rsli_xxxxxxxxxxxxx");
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListItemsGet() throws StripeException {
    com.stripe.param.radar.ValueListItemListParams params =
        com.stripe.param.radar.ValueListItemListParams.builder()
            .setLimit(3L)
            .setValueList("rsl_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.radar.ValueListItemCollection valueListItems =
        com.stripe.model.radar.ValueListItem.list(params);
    assertNotNull(valueListItems);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_list_items",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListItemListParams params =
        com.stripe.param.radar.ValueListItemListParams.builder()
            .setLimit(3L)
            .setValueList("rsl_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.radar.ValueListItem> stripeCollection =
        client.v1().radar().valueListItems().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_list_items",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListItemListParams params =
        com.stripe.param.radar.ValueListItemListParams.builder()
            .setLimit(3L)
            .setValueList("rsl_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.radar.ValueListItem> stripeCollection =
        client.radar().valueListItems().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_list_items",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsGet2() throws StripeException {
    com.stripe.model.radar.ValueListItem valueListItem =
        com.stripe.model.radar.ValueListItem.retrieve("rsli_xxxxxxxxxxxxx");
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListItemsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListItemRetrieveParams params =
        com.stripe.param.radar.ValueListItemRetrieveParams.builder().build();

    com.stripe.model.radar.ValueListItem valueListItem =
        client.v1().radar().valueListItems().retrieve("rsli_xxxxxxxxxxxxx", params);
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListItemRetrieveParams params =
        com.stripe.param.radar.ValueListItemRetrieveParams.builder().build();

    com.stripe.model.radar.ValueListItem valueListItem =
        client.radar().valueListItems().retrieve("rsli_xxxxxxxxxxxxx", params);
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsPost() throws StripeException {
    com.stripe.param.radar.ValueListItemCreateParams params =
        com.stripe.param.radar.ValueListItemCreateParams.builder()
            .setValueList("rsl_xxxxxxxxxxxxx")
            .setValue("1.2.3.4")
            .build();

    com.stripe.model.radar.ValueListItem valueListItem =
        com.stripe.model.radar.ValueListItem.create(params);
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_list_items",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListItemCreateParams params =
        com.stripe.param.radar.ValueListItemCreateParams.builder()
            .setValueList("rsl_xxxxxxxxxxxxx")
            .setValue("1.2.3.4")
            .build();

    com.stripe.model.radar.ValueListItem valueListItem =
        client.v1().radar().valueListItems().create(params);
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_list_items",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListItemsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListItemCreateParams params =
        com.stripe.param.radar.ValueListItemCreateParams.builder()
            .setValueList("rsl_xxxxxxxxxxxxx")
            .setValue("1.2.3.4")
            .build();

    com.stripe.model.radar.ValueListItem valueListItem =
        client.radar().valueListItems().create(params);
    assertNotNull(valueListItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_list_items",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsDelete() throws StripeException {
    com.stripe.model.radar.ValueList resource =
        com.stripe.model.radar.ValueList.retrieve("rsl_xxxxxxxxxxxxx");

    com.stripe.model.radar.ValueList valueList = resource.delete();
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.radar.ValueList valueList =
        client.v1().radar().valueLists().delete("rsl_xxxxxxxxxxxxx");
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.radar.ValueList valueList =
        client.radar().valueLists().delete("rsl_xxxxxxxxxxxxx");
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListsGet() throws StripeException {
    com.stripe.param.radar.ValueListListParams params =
        com.stripe.param.radar.ValueListListParams.builder().setLimit(3L).build();

    com.stripe.model.radar.ValueListCollection valueLists =
        com.stripe.model.radar.ValueList.list(params);
    assertNotNull(valueLists);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_lists",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListListParams params =
        com.stripe.param.radar.ValueListListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.radar.ValueList> stripeCollection =
        client.v1().radar().valueLists().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_lists",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListListParams params =
        com.stripe.param.radar.ValueListListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.radar.ValueList> stripeCollection =
        client.radar().valueLists().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_lists",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsGet2() throws StripeException {
    com.stripe.model.radar.ValueList valueList =
        com.stripe.model.radar.ValueList.retrieve("rsl_xxxxxxxxxxxxx");
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testRadarValueListsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListRetrieveParams params =
        com.stripe.param.radar.ValueListRetrieveParams.builder().build();

    com.stripe.model.radar.ValueList valueList =
        client.v1().radar().valueLists().retrieve("rsl_xxxxxxxxxxxxx", params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListRetrieveParams params =
        com.stripe.param.radar.ValueListRetrieveParams.builder().build();

    com.stripe.model.radar.ValueList valueList =
        client.radar().valueLists().retrieve("rsl_xxxxxxxxxxxxx", params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsPost() throws StripeException {
    com.stripe.param.radar.ValueListCreateParams params =
        com.stripe.param.radar.ValueListCreateParams.builder()
            .setAlias("custom_ip_xxxxxxxxxxxxx")
            .setName("Custom IP Blocklist")
            .setItemType(com.stripe.param.radar.ValueListCreateParams.ItemType.IP_ADDRESS)
            .build();

    com.stripe.model.radar.ValueList valueList = com.stripe.model.radar.ValueList.create(params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_lists",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListCreateParams params =
        com.stripe.param.radar.ValueListCreateParams.builder()
            .setAlias("custom_ip_xxxxxxxxxxxxx")
            .setName("Custom IP Blocklist")
            .setItemType(com.stripe.param.radar.ValueListCreateParams.ItemType.IP_ADDRESS)
            .build();

    com.stripe.model.radar.ValueList valueList = client.v1().radar().valueLists().create(params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_lists",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListCreateParams params =
        com.stripe.param.radar.ValueListCreateParams.builder()
            .setAlias("custom_ip_xxxxxxxxxxxxx")
            .setName("Custom IP Blocklist")
            .setItemType(com.stripe.param.radar.ValueListCreateParams.ItemType.IP_ADDRESS)
            .build();

    com.stripe.model.radar.ValueList valueList = client.radar().valueLists().create(params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_lists",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsPost2() throws StripeException {
    com.stripe.model.radar.ValueList resource =
        com.stripe.model.radar.ValueList.retrieve("rsl_xxxxxxxxxxxxx");

    com.stripe.param.radar.ValueListUpdateParams params =
        com.stripe.param.radar.ValueListUpdateParams.builder()
            .setName("Updated IP Block List")
            .build();

    com.stripe.model.radar.ValueList valueList = resource.update(params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListUpdateParams params =
        com.stripe.param.radar.ValueListUpdateParams.builder()
            .setName("Updated IP Block List")
            .build();

    com.stripe.model.radar.ValueList valueList =
        client.v1().radar().valueLists().update("rsl_xxxxxxxxxxxxx", params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRadarValueListsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.radar.ValueListUpdateParams params =
        com.stripe.param.radar.ValueListUpdateParams.builder()
            .setName("Updated IP Block List")
            .build();

    com.stripe.model.radar.ValueList valueList =
        client.radar().valueLists().update("rsl_xxxxxxxxxxxxx", params);
    assertNotNull(valueList);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsCancelPost() throws StripeException {
    Refund resource = Refund.retrieve("re_xxxxxxxxxxxxx");

    RefundCancelParams params = RefundCancelParams.builder().build();

    Refund refund = resource.cancel(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/refunds/re_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundCancelParams params =
        com.stripe.param.RefundCancelParams.builder().build();

    com.stripe.model.Refund refund = client.v1().refunds().cancel("re_xxxxxxxxxxxxx", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/refunds/re_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundCancelParams params =
        com.stripe.param.RefundCancelParams.builder().build();

    com.stripe.model.Refund refund = client.refunds().cancel("re_xxxxxxxxxxxxx", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/refunds/re_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsGet() throws StripeException {
    RefundListParams params = RefundListParams.builder().setLimit(3L).build();

    RefundCollection refunds = Refund.list(params);
    assertNotNull(refunds);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundListParams params =
        com.stripe.param.RefundListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Refund> stripeCollection =
        client.v1().refunds().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundListParams params =
        com.stripe.param.RefundListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Refund> stripeCollection =
        client.refunds().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundsGet2() throws StripeException {
    Refund refund = Refund.retrieve("re_xxxxxxxxxxxxx");
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/refunds/re_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testRefundsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundRetrieveParams params =
        com.stripe.param.RefundRetrieveParams.builder().build();

    com.stripe.model.Refund refund = client.v1().refunds().retrieve("re_xxxxxxxxxxxxx", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/refunds/re_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundRetrieveParams params =
        com.stripe.param.RefundRetrieveParams.builder().build();

    com.stripe.model.Refund refund = client.refunds().retrieve("re_xxxxxxxxxxxxx", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/refunds/re_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsPost() throws StripeException {
    RefundCreateParams params = RefundCreateParams.builder().setCharge("ch_xxxxxxxxxxxxx").build();

    Refund refund = Refund.create(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundCreateParams params =
        com.stripe.param.RefundCreateParams.builder().setCharge("ch_xxxxxxxxxxxxx").build();

    com.stripe.model.Refund refund = client.v1().refunds().create(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundCreateParams params =
        com.stripe.param.RefundCreateParams.builder().setCharge("ch_xxxxxxxxxxxxx").build();

    com.stripe.model.Refund refund = client.refunds().create(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundsPost2() throws StripeException {
    Refund resource = Refund.retrieve("re_xxxxxxxxxxxxx");

    RefundUpdateParams params =
        RefundUpdateParams.builder().putMetadata("order_id", "6735").build();

    Refund refund = resource.update(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/refunds/re_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundUpdateParams params =
        com.stripe.param.RefundUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Refund refund = client.v1().refunds().update("re_xxxxxxxxxxxxx", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/refunds/re_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testRefundsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundUpdateParams params =
        com.stripe.param.RefundUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Refund refund = client.refunds().update("re_xxxxxxxxxxxxx", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/refunds/re_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsGet() throws StripeException {
    com.stripe.param.reporting.ReportRunListParams params =
        com.stripe.param.reporting.ReportRunListParams.builder().setLimit(3L).build();

    com.stripe.model.reporting.ReportRunCollection reportRuns =
        com.stripe.model.reporting.ReportRun.list(params);
    assertNotNull(reportRuns);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportRunListParams params =
        com.stripe.param.reporting.ReportRunListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.reporting.ReportRun> stripeCollection =
        client.v1().reporting().reportRuns().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportRunListParams params =
        com.stripe.param.reporting.ReportRunListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.reporting.ReportRun> stripeCollection =
        client.reporting().reportRuns().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsGet2() throws StripeException {
    com.stripe.model.reporting.ReportRun reportRun =
        com.stripe.model.reporting.ReportRun.retrieve("frr_xxxxxxxxxxxxx");
    assertNotNull(reportRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_runs/frr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testReportingReportRunsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportRunRetrieveParams params =
        com.stripe.param.reporting.ReportRunRetrieveParams.builder().build();

    com.stripe.model.reporting.ReportRun reportRun =
        client.v1().reporting().reportRuns().retrieve("frr_xxxxxxxxxxxxx", params);
    assertNotNull(reportRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_runs/frr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportRunRetrieveParams params =
        com.stripe.param.reporting.ReportRunRetrieveParams.builder().build();

    com.stripe.model.reporting.ReportRun reportRun =
        client.reporting().reportRuns().retrieve("frr_xxxxxxxxxxxxx", params);
    assertNotNull(reportRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_runs/frr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsPost() throws StripeException {
    com.stripe.param.reporting.ReportRunCreateParams params =
        com.stripe.param.reporting.ReportRunCreateParams.builder()
            .setReportType("balance.summary.1")
            .setParameters(
                com.stripe.param.reporting.ReportRunCreateParams.Parameters.builder()
                    .setIntervalStart(1522540800L)
                    .setIntervalEnd(1525132800L)
                    .build())
            .build();

    com.stripe.model.reporting.ReportRun reportRun =
        com.stripe.model.reporting.ReportRun.create(params);
    assertNotNull(reportRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/reporting/report_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportRunCreateParams params =
        com.stripe.param.reporting.ReportRunCreateParams.builder()
            .setReportType("balance.summary.1")
            .setParameters(
                com.stripe.param.reporting.ReportRunCreateParams.Parameters.builder()
                    .setIntervalStart(1522540800L)
                    .setIntervalEnd(1525132800L)
                    .build())
            .build();

    com.stripe.model.reporting.ReportRun reportRun =
        client.v1().reporting().reportRuns().create(params);
    assertNotNull(reportRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/reporting/report_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportRunsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportRunCreateParams params =
        com.stripe.param.reporting.ReportRunCreateParams.builder()
            .setReportType("balance.summary.1")
            .setParameters(
                com.stripe.param.reporting.ReportRunCreateParams.Parameters.builder()
                    .setIntervalStart(1522540800L)
                    .setIntervalEnd(1525132800L)
                    .build())
            .build();

    com.stripe.model.reporting.ReportRun reportRun = client.reporting().reportRuns().create(params);
    assertNotNull(reportRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/reporting/report_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportTypesGet() throws StripeException {
    com.stripe.param.reporting.ReportTypeListParams params =
        com.stripe.param.reporting.ReportTypeListParams.builder().build();

    com.stripe.model.reporting.ReportTypeCollection reportTypes =
        com.stripe.model.reporting.ReportType.list(params);
    assertNotNull(reportTypes);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_types",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportTypesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportTypeListParams params =
        com.stripe.param.reporting.ReportTypeListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.reporting.ReportType> stripeCollection =
        client.v1().reporting().reportTypes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_types",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportTypesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportTypeListParams params =
        com.stripe.param.reporting.ReportTypeListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.reporting.ReportType> stripeCollection =
        client.reporting().reportTypes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_types",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportTypesGet2() throws StripeException {
    com.stripe.model.reporting.ReportType reportType =
        com.stripe.model.reporting.ReportType.retrieve("balance.summary.1");
    assertNotNull(reportType);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_types/balance.summary.1",
        null,
        null);
  }

  @Test
  public void testReportingReportTypesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportTypeRetrieveParams params =
        com.stripe.param.reporting.ReportTypeRetrieveParams.builder().build();

    com.stripe.model.reporting.ReportType reportType =
        client.v1().reporting().reportTypes().retrieve("balance.summary.1", params);
    assertNotNull(reportType);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_types/balance.summary.1",
        params.toMap(),
        null);
  }

  @Test
  public void testReportingReportTypesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.reporting.ReportTypeRetrieveParams params =
        com.stripe.param.reporting.ReportTypeRetrieveParams.builder().build();

    com.stripe.model.reporting.ReportType reportType =
        client.reporting().reportTypes().retrieve("balance.summary.1", params);
    assertNotNull(reportType);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reporting/report_types/balance.summary.1",
        params.toMap(),
        null);
  }

  @Test
  public void testReviewsApprovePost() throws StripeException {
    Review resource = Review.retrieve("prv_xxxxxxxxxxxxx");

    ReviewApproveParams params = ReviewApproveParams.builder().build();

    Review review = resource.approve(params);
    assertNotNull(review);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/reviews/prv_xxxxxxxxxxxxx/approve",
        params.toMap(),
        null);
  }

  @Test
  public void testReviewsApprovePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ReviewApproveParams params =
        com.stripe.param.ReviewApproveParams.builder().build();

    com.stripe.model.Review review = client.v1().reviews().approve("prv_xxxxxxxxxxxxx", params);
    assertNotNull(review);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/reviews/prv_xxxxxxxxxxxxx/approve",
        params.toMap(),
        null);
  }

  @Test
  public void testReviewsApprovePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ReviewApproveParams params =
        com.stripe.param.ReviewApproveParams.builder().build();

    com.stripe.model.Review review = client.reviews().approve("prv_xxxxxxxxxxxxx", params);
    assertNotNull(review);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/reviews/prv_xxxxxxxxxxxxx/approve",
        params.toMap(),
        null);
  }

  @Test
  public void testReviewsGet() throws StripeException {
    ReviewListParams params = ReviewListParams.builder().setLimit(3L).build();

    ReviewCollection reviews = Review.list(params);
    assertNotNull(reviews);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/reviews", params.toMap(), null);
  }

  @Test
  public void testReviewsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ReviewListParams params =
        com.stripe.param.ReviewListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Review> stripeCollection =
        client.v1().reviews().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/reviews", params.toMap(), null);
  }

  @Test
  public void testReviewsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ReviewListParams params =
        com.stripe.param.ReviewListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Review> stripeCollection =
        client.reviews().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/reviews", params.toMap(), null);
  }

  @Test
  public void testReviewsGet2() throws StripeException {
    Review review = Review.retrieve("prv_xxxxxxxxxxxxx");
    assertNotNull(review);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reviews/prv_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testReviewsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ReviewRetrieveParams params =
        com.stripe.param.ReviewRetrieveParams.builder().build();

    com.stripe.model.Review review = client.v1().reviews().retrieve("prv_xxxxxxxxxxxxx", params);
    assertNotNull(review);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reviews/prv_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testReviewsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ReviewRetrieveParams params =
        com.stripe.param.ReviewRetrieveParams.builder().build();

    com.stripe.model.Review review = client.reviews().retrieve("prv_xxxxxxxxxxxxx", params);
    assertNotNull(review);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/reviews/prv_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupAttemptsGet() throws StripeException {
    SetupAttemptListParams params =
        SetupAttemptListParams.builder().setLimit(3L).setSetupIntent("si_xyz").build();

    SetupAttemptCollection setupAttempts = SetupAttempt.list(params);
    assertNotNull(setupAttempts);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_attempts", params.toMap(), null);
  }

  @Test
  public void testSetupAttemptsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupAttemptListParams params =
        com.stripe.param.SetupAttemptListParams.builder()
            .setLimit(3L)
            .setSetupIntent("si_xyz")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.SetupAttempt> stripeCollection =
        client.v1().setupAttempts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_attempts", params.toMap(), null);
  }

  @Test
  public void testSetupAttemptsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupAttemptListParams params =
        com.stripe.param.SetupAttemptListParams.builder()
            .setLimit(3L)
            .setSetupIntent("si_xyz")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.SetupAttempt> stripeCollection =
        client.setupAttempts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_attempts", params.toMap(), null);
  }

  @Test
  public void testSetupIntentsCancelPost() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentCancelParams params = SetupIntentCancelParams.builder().build();

    SetupIntent setupIntent = resource.cancel(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentCancelParams params =
        com.stripe.param.SetupIntentCancelParams.builder().build();

    com.stripe.model.SetupIntent setupIntent =
        client.v1().setupIntents().cancel("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentCancelParams params =
        com.stripe.param.SetupIntentCancelParams.builder().build();

    com.stripe.model.SetupIntent setupIntent =
        client.setupIntents().cancel("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsConfirmPost() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentConfirmParams params =
        SetupIntentConfirmParams.builder().setPaymentMethod("pm_card_visa").build();

    SetupIntent setupIntent = resource.confirm(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/confirm",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsConfirmPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentConfirmParams params =
        com.stripe.param.SetupIntentConfirmParams.builder()
            .setPaymentMethod("pm_card_visa")
            .build();

    com.stripe.model.SetupIntent setupIntent =
        client.v1().setupIntents().confirm("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/confirm",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsConfirmPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentConfirmParams params =
        com.stripe.param.SetupIntentConfirmParams.builder()
            .setPaymentMethod("pm_card_visa")
            .build();

    com.stripe.model.SetupIntent setupIntent =
        client.setupIntents().confirm("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/confirm",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsGet() throws StripeException {
    SetupIntentListParams params = SetupIntentListParams.builder().setLimit(3L).build();

    SetupIntentCollection setupIntents = SetupIntent.list(params);
    assertNotNull(setupIntents);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentListParams params =
        com.stripe.param.SetupIntentListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.SetupIntent> stripeCollection =
        client.v1().setupIntents().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentListParams params =
        com.stripe.param.SetupIntentListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.SetupIntent> stripeCollection =
        client.setupIntents().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentsGet2() throws StripeException {
    SetupIntent setupIntent = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testSetupIntentsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentRetrieveParams params =
        com.stripe.param.SetupIntentRetrieveParams.builder().build();

    com.stripe.model.SetupIntent setupIntent =
        client.v1().setupIntents().retrieve("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentRetrieveParams params =
        com.stripe.param.SetupIntentRetrieveParams.builder().build();

    com.stripe.model.SetupIntent setupIntent =
        client.setupIntents().retrieve("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsPost() throws StripeException {
    SetupIntentCreateParams params =
        SetupIntentCreateParams.builder().addPaymentMethodType("card").build();

    SetupIntent setupIntent = SetupIntent.create(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentCreateParams params =
        com.stripe.param.SetupIntentCreateParams.builder().addPaymentMethodType("card").build();

    com.stripe.model.SetupIntent setupIntent = client.v1().setupIntents().create(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentCreateParams params =
        com.stripe.param.SetupIntentCreateParams.builder().addPaymentMethodType("card").build();

    com.stripe.model.SetupIntent setupIntent = client.setupIntents().create(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentsPost2() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentUpdateParams params =
        SetupIntentUpdateParams.builder().putMetadata("user_id", "3435453").build();

    SetupIntent setupIntent = resource.update(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentUpdateParams params =
        com.stripe.param.SetupIntentUpdateParams.builder()
            .putMetadata("user_id", "3435453")
            .build();

    com.stripe.model.SetupIntent setupIntent =
        client.v1().setupIntents().update("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentUpdateParams params =
        com.stripe.param.SetupIntentUpdateParams.builder()
            .putMetadata("user_id", "3435453")
            .build();

    com.stripe.model.SetupIntent setupIntent =
        client.setupIntents().update("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsVerifyMicrodepositsPost() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentVerifyMicrodepositsParams params =
        SetupIntentVerifyMicrodepositsParams.builder().build();

    SetupIntent setupIntent = resource.verifyMicrodeposits(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsVerifyMicrodepositsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentVerifyMicrodepositsParams params =
        com.stripe.param.SetupIntentVerifyMicrodepositsParams.builder().build();

    com.stripe.model.SetupIntent setupIntent =
        client.v1().setupIntents().verifyMicrodeposits("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsVerifyMicrodepositsPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentVerifyMicrodepositsParams params =
        com.stripe.param.SetupIntentVerifyMicrodepositsParams.builder().build();

    com.stripe.model.SetupIntent setupIntent =
        client.setupIntents().verifyMicrodeposits("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsVerifyMicrodepositsPost2() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentVerifyMicrodepositsParams params =
        SetupIntentVerifyMicrodepositsParams.builder().addAmount(32L).addAmount(45L).build();

    SetupIntent setupIntent = resource.verifyMicrodeposits(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsVerifyMicrodepositsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentVerifyMicrodepositsParams params =
        com.stripe.param.SetupIntentVerifyMicrodepositsParams.builder()
            .addAmount(32L)
            .addAmount(45L)
            .build();

    com.stripe.model.SetupIntent setupIntent =
        client.v1().setupIntents().verifyMicrodeposits("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testSetupIntentsVerifyMicrodepositsPost2ServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentVerifyMicrodepositsParams params =
        com.stripe.param.SetupIntentVerifyMicrodepositsParams.builder()
            .addAmount(32L)
            .addAmount(45L)
            .build();

    com.stripe.model.SetupIntent setupIntent =
        client.setupIntents().verifyMicrodeposits("seti_xxxxxxxxxxxxx", params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesGet() throws StripeException {
    ShippingRateListParams params = ShippingRateListParams.builder().build();

    ShippingRateCollection shippingRates = ShippingRate.list(params);
    assertNotNull(shippingRates);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRatesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateListParams params =
        com.stripe.param.ShippingRateListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.ShippingRate> stripeCollection =
        client.v1().shippingRates().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRatesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateListParams params =
        com.stripe.param.ShippingRateListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.ShippingRate> stripeCollection =
        client.shippingRates().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRatesGet2() throws StripeException {
    ShippingRateListParams params = ShippingRateListParams.builder().setLimit(3L).build();

    ShippingRateCollection shippingRates = ShippingRate.list(params);
    assertNotNull(shippingRates);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRatesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateListParams params =
        com.stripe.param.ShippingRateListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.ShippingRate> stripeCollection =
        client.v1().shippingRates().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRatesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateListParams params =
        com.stripe.param.ShippingRateListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.ShippingRate> stripeCollection =
        client.shippingRates().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRatesGet3() throws StripeException {
    ShippingRate shippingRate = ShippingRate.retrieve("shr_xxxxxxxxxxxxx");
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/shipping_rates/shr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testShippingRatesGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateRetrieveParams params =
        com.stripe.param.ShippingRateRetrieveParams.builder().build();

    com.stripe.model.ShippingRate shippingRate =
        client.v1().shippingRates().retrieve("shr_xxxxxxxxxxxxx", params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/shipping_rates/shr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateRetrieveParams params =
        com.stripe.param.ShippingRateRetrieveParams.builder().build();

    com.stripe.model.ShippingRate shippingRate =
        client.shippingRates().retrieve("shr_xxxxxxxxxxxxx", params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/shipping_rates/shr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPost() throws StripeException {
    ShippingRateCreateParams params =
        ShippingRateCreateParams.builder()
            .setDisplayName("Sample Shipper")
            .setFixedAmount(
                ShippingRateCreateParams.FixedAmount.builder()
                    .setCurrency("usd")
                    .setAmount(400L)
                    .build())
            .setType(ShippingRateCreateParams.Type.FIXED_AMOUNT)
            .build();

    ShippingRate shippingRate = ShippingRate.create(params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateCreateParams params =
        com.stripe.param.ShippingRateCreateParams.builder()
            .setDisplayName("Sample Shipper")
            .setFixedAmount(
                com.stripe.param.ShippingRateCreateParams.FixedAmount.builder()
                    .setCurrency("usd")
                    .setAmount(400L)
                    .build())
            .setType(com.stripe.param.ShippingRateCreateParams.Type.FIXED_AMOUNT)
            .build();

    com.stripe.model.ShippingRate shippingRate = client.v1().shippingRates().create(params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateCreateParams params =
        com.stripe.param.ShippingRateCreateParams.builder()
            .setDisplayName("Sample Shipper")
            .setFixedAmount(
                com.stripe.param.ShippingRateCreateParams.FixedAmount.builder()
                    .setCurrency("usd")
                    .setAmount(400L)
                    .build())
            .setType(com.stripe.param.ShippingRateCreateParams.Type.FIXED_AMOUNT)
            .build();

    com.stripe.model.ShippingRate shippingRate = client.shippingRates().create(params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPost2() throws StripeException {
    ShippingRateCreateParams params =
        ShippingRateCreateParams.builder()
            .setDisplayName("Ground shipping")
            .setType(ShippingRateCreateParams.Type.FIXED_AMOUNT)
            .setFixedAmount(
                ShippingRateCreateParams.FixedAmount.builder()
                    .setAmount(500L)
                    .setCurrency("usd")
                    .build())
            .build();

    ShippingRate shippingRate = ShippingRate.create(params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateCreateParams params =
        com.stripe.param.ShippingRateCreateParams.builder()
            .setDisplayName("Ground shipping")
            .setType(com.stripe.param.ShippingRateCreateParams.Type.FIXED_AMOUNT)
            .setFixedAmount(
                com.stripe.param.ShippingRateCreateParams.FixedAmount.builder()
                    .setAmount(500L)
                    .setCurrency("usd")
                    .build())
            .build();

    com.stripe.model.ShippingRate shippingRate = client.v1().shippingRates().create(params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateCreateParams params =
        com.stripe.param.ShippingRateCreateParams.builder()
            .setDisplayName("Ground shipping")
            .setType(com.stripe.param.ShippingRateCreateParams.Type.FIXED_AMOUNT)
            .setFixedAmount(
                com.stripe.param.ShippingRateCreateParams.FixedAmount.builder()
                    .setAmount(500L)
                    .setCurrency("usd")
                    .build())
            .build();

    com.stripe.model.ShippingRate shippingRate = client.shippingRates().create(params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPost3() throws StripeException {
    ShippingRate resource = ShippingRate.retrieve("shr_xxxxxxxxxxxxx");

    ShippingRateUpdateParams params =
        ShippingRateUpdateParams.builder().putMetadata("order_id", "6735").build();

    ShippingRate shippingRate = resource.update(params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates/shr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateUpdateParams params =
        com.stripe.param.ShippingRateUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.ShippingRate shippingRate =
        client.v1().shippingRates().update("shr_xxxxxxxxxxxxx", params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates/shr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testShippingRatesPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ShippingRateUpdateParams params =
        com.stripe.param.ShippingRateUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.ShippingRate shippingRate =
        client.shippingRates().update("shr_xxxxxxxxxxxxx", params);
    assertNotNull(shippingRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/shipping_rates/shr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSigmaScheduledQueryRunsGet() throws StripeException {
    com.stripe.param.sigma.ScheduledQueryRunListParams params =
        com.stripe.param.sigma.ScheduledQueryRunListParams.builder().setLimit(3L).build();

    com.stripe.model.sigma.ScheduledQueryRunCollection scheduledQueryRuns =
        com.stripe.model.sigma.ScheduledQueryRun.list(params);
    assertNotNull(scheduledQueryRuns);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sigma/scheduled_query_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testSigmaScheduledQueryRunsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.sigma.ScheduledQueryRunListParams params =
        com.stripe.param.sigma.ScheduledQueryRunListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.sigma.ScheduledQueryRun> stripeCollection =
        client.v1().sigma().scheduledQueryRuns().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sigma/scheduled_query_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testSigmaScheduledQueryRunsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.sigma.ScheduledQueryRunListParams params =
        com.stripe.param.sigma.ScheduledQueryRunListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.sigma.ScheduledQueryRun> stripeCollection =
        client.sigma().scheduledQueryRuns().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sigma/scheduled_query_runs",
        params.toMap(),
        null);
  }

  @Test
  public void testSigmaScheduledQueryRunsGet2() throws StripeException {
    com.stripe.model.sigma.ScheduledQueryRun scheduledQueryRun =
        com.stripe.model.sigma.ScheduledQueryRun.retrieve("sqr_xxxxxxxxxxxxx");
    assertNotNull(scheduledQueryRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sigma/scheduled_query_runs/sqr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testSigmaScheduledQueryRunsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.sigma.ScheduledQueryRunRetrieveParams params =
        com.stripe.param.sigma.ScheduledQueryRunRetrieveParams.builder().build();

    com.stripe.model.sigma.ScheduledQueryRun scheduledQueryRun =
        client.v1().sigma().scheduledQueryRuns().retrieve("sqr_xxxxxxxxxxxxx", params);
    assertNotNull(scheduledQueryRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sigma/scheduled_query_runs/sqr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSigmaScheduledQueryRunsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.sigma.ScheduledQueryRunRetrieveParams params =
        com.stripe.param.sigma.ScheduledQueryRunRetrieveParams.builder().build();

    com.stripe.model.sigma.ScheduledQueryRun scheduledQueryRun =
        client.sigma().scheduledQueryRuns().retrieve("sqr_xxxxxxxxxxxxx", params);
    assertNotNull(scheduledQueryRun);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sigma/scheduled_query_runs/sqr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSourcesGet() throws StripeException {
    Source source = Source.retrieve("src_xxxxxxxxxxxxx");
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sources/src_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testSourcesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceRetrieveParams params =
        com.stripe.param.SourceRetrieveParams.builder().build();

    com.stripe.model.Source source = client.v1().sources().retrieve("src_xxxxxxxxxxxxx", params);
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sources/src_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSourcesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceRetrieveParams params =
        com.stripe.param.SourceRetrieveParams.builder().build();

    com.stripe.model.Source source = client.sources().retrieve("src_xxxxxxxxxxxxx", params);
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sources/src_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSourcesGet2() throws StripeException {
    Source source = Source.retrieve("src_xxxxxxxxxxxxx");
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sources/src_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testSourcesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceRetrieveParams params =
        com.stripe.param.SourceRetrieveParams.builder().build();

    com.stripe.model.Source source = client.v1().sources().retrieve("src_xxxxxxxxxxxxx", params);
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sources/src_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSourcesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceRetrieveParams params =
        com.stripe.param.SourceRetrieveParams.builder().build();

    com.stripe.model.Source source = client.sources().retrieve("src_xxxxxxxxxxxxx", params);
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/sources/src_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSourcesPost() throws StripeException {
    Source resource = Source.retrieve("src_xxxxxxxxxxxxx");

    SourceUpdateParams params =
        SourceUpdateParams.builder().putMetadata("order_id", "6735").build();

    Source source = resource.update(params);
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/sources/src_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSourcesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceUpdateParams params =
        com.stripe.param.SourceUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Source source = client.v1().sources().update("src_xxxxxxxxxxxxx", params);
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/sources/src_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSourcesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SourceUpdateParams params =
        com.stripe.param.SourceUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Source source = client.sources().update("src_xxxxxxxxxxxxx", params);
    assertNotNull(source);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/sources/src_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsDelete() throws StripeException {
    SubscriptionItem resource = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");

    SubscriptionItemDeleteParams params = SubscriptionItemDeleteParams.builder().build();

    SubscriptionItem subscriptionItem = resource.delete(params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemDeleteParams params =
        com.stripe.param.SubscriptionItemDeleteParams.builder().build();

    com.stripe.model.SubscriptionItem subscriptionItem =
        client.v1().subscriptionItems().delete("si_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemDeleteParams params =
        com.stripe.param.SubscriptionItemDeleteParams.builder().build();

    com.stripe.model.SubscriptionItem subscriptionItem =
        client.subscriptionItems().delete("si_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsGet() throws StripeException {
    SubscriptionItemListParams params =
        SubscriptionItemListParams.builder().setSubscription("sub_xxxxxxxxxxxxx").build();

    SubscriptionItemCollection subscriptionItems = SubscriptionItem.list(params);
    assertNotNull(subscriptionItems);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemListParams params =
        com.stripe.param.SubscriptionItemListParams.builder()
            .setSubscription("sub_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.SubscriptionItem> stripeCollection =
        client.v1().subscriptionItems().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemListParams params =
        com.stripe.param.SubscriptionItemListParams.builder()
            .setSubscription("sub_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.SubscriptionItem> stripeCollection =
        client.subscriptionItems().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsGet2() throws StripeException {
    SubscriptionItem subscriptionItem = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testSubscriptionItemsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemRetrieveParams params =
        com.stripe.param.SubscriptionItemRetrieveParams.builder().build();

    com.stripe.model.SubscriptionItem subscriptionItem =
        client.v1().subscriptionItems().retrieve("si_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemRetrieveParams params =
        com.stripe.param.SubscriptionItemRetrieveParams.builder().build();

    com.stripe.model.SubscriptionItem subscriptionItem =
        client.subscriptionItems().retrieve("si_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsPost() throws StripeException {
    SubscriptionItemCreateParams params =
        SubscriptionItemCreateParams.builder()
            .setSubscription("sub_xxxxxxxxxxxxx")
            .setPrice("price_xxxxxxxxxxxxx")
            .setQuantity(2L)
            .build();

    SubscriptionItem subscriptionItem = SubscriptionItem.create(params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_items",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemCreateParams params =
        com.stripe.param.SubscriptionItemCreateParams.builder()
            .setSubscription("sub_xxxxxxxxxxxxx")
            .setPrice("price_xxxxxxxxxxxxx")
            .setQuantity(2L)
            .build();

    com.stripe.model.SubscriptionItem subscriptionItem =
        client.v1().subscriptionItems().create(params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_items",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemCreateParams params =
        com.stripe.param.SubscriptionItemCreateParams.builder()
            .setSubscription("sub_xxxxxxxxxxxxx")
            .setPrice("price_xxxxxxxxxxxxx")
            .setQuantity(2L)
            .build();

    com.stripe.model.SubscriptionItem subscriptionItem = client.subscriptionItems().create(params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_items",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsPost2() throws StripeException {
    SubscriptionItem resource = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");

    SubscriptionItemUpdateParams params =
        SubscriptionItemUpdateParams.builder().putMetadata("order_id", "6735").build();

    SubscriptionItem subscriptionItem = resource.update(params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemUpdateParams params =
        com.stripe.param.SubscriptionItemUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.SubscriptionItem subscriptionItem =
        client.v1().subscriptionItems().update("si_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionItemsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionItemUpdateParams params =
        com.stripe.param.SubscriptionItemUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.SubscriptionItem subscriptionItem =
        client.subscriptionItems().update("si_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesCancelPost() throws StripeException {
    SubscriptionSchedule resource = SubscriptionSchedule.retrieve("sub_sched_xxxxxxxxxxxxx");

    SubscriptionScheduleCancelParams params = SubscriptionScheduleCancelParams.builder().build();

    SubscriptionSchedule subscriptionSchedule = resource.cancel(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleCancelParams params =
        com.stripe.param.SubscriptionScheduleCancelParams.builder().build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.v1().subscriptionSchedules().cancel("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleCancelParams params =
        com.stripe.param.SubscriptionScheduleCancelParams.builder().build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.subscriptionSchedules().cancel("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesGet() throws StripeException {
    SubscriptionScheduleListParams params =
        SubscriptionScheduleListParams.builder().setLimit(3L).build();

    SubscriptionScheduleCollection subscriptionSchedules = SubscriptionSchedule.list(params);
    assertNotNull(subscriptionSchedules);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_schedules",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleListParams params =
        com.stripe.param.SubscriptionScheduleListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.SubscriptionSchedule> stripeCollection =
        client.v1().subscriptionSchedules().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_schedules",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleListParams params =
        com.stripe.param.SubscriptionScheduleListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.SubscriptionSchedule> stripeCollection =
        client.subscriptionSchedules().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_schedules",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesGet2() throws StripeException {
    SubscriptionSchedule subscriptionSchedule =
        SubscriptionSchedule.retrieve("sub_sched_xxxxxxxxxxxxx");
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testSubscriptionSchedulesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleRetrieveParams params =
        com.stripe.param.SubscriptionScheduleRetrieveParams.builder().build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.v1().subscriptionSchedules().retrieve("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleRetrieveParams params =
        com.stripe.param.SubscriptionScheduleRetrieveParams.builder().build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.subscriptionSchedules().retrieve("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesPost() throws StripeException {
    SubscriptionScheduleCreateParams params =
        SubscriptionScheduleCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setStartDate(1676070661L)
            .setEndBehavior(SubscriptionScheduleCreateParams.EndBehavior.RELEASE)
            .addPhase(
                SubscriptionScheduleCreateParams.Phase.builder()
                    .addItem(
                        SubscriptionScheduleCreateParams.Phase.Item.builder()
                            .setPrice("price_xxxxxxxxxxxxx")
                            .setQuantity(1L)
                            .build())
                    .build())
            .build();

    SubscriptionSchedule subscriptionSchedule = SubscriptionSchedule.create(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleCreateParams params =
        com.stripe.param.SubscriptionScheduleCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setStartDate(1676070661L)
            .setEndBehavior(com.stripe.param.SubscriptionScheduleCreateParams.EndBehavior.RELEASE)
            .addPhase(
                com.stripe.param.SubscriptionScheduleCreateParams.Phase.builder()
                    .addItem(
                        com.stripe.param.SubscriptionScheduleCreateParams.Phase.Item.builder()
                            .setPrice("price_xxxxxxxxxxxxx")
                            .setQuantity(1L)
                            .build())
                    .build())
            .build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.v1().subscriptionSchedules().create(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleCreateParams params =
        com.stripe.param.SubscriptionScheduleCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setStartDate(1676070661L)
            .setEndBehavior(com.stripe.param.SubscriptionScheduleCreateParams.EndBehavior.RELEASE)
            .addPhase(
                com.stripe.param.SubscriptionScheduleCreateParams.Phase.builder()
                    .addItem(
                        com.stripe.param.SubscriptionScheduleCreateParams.Phase.Item.builder()
                            .setPrice("price_xxxxxxxxxxxxx")
                            .setQuantity(1L)
                            .build())
                    .build())
            .build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.subscriptionSchedules().create(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesPost2() throws StripeException {
    SubscriptionSchedule resource = SubscriptionSchedule.retrieve("sub_sched_xxxxxxxxxxxxx");

    SubscriptionScheduleUpdateParams params =
        SubscriptionScheduleUpdateParams.builder()
            .setEndBehavior(SubscriptionScheduleUpdateParams.EndBehavior.RELEASE)
            .build();

    SubscriptionSchedule subscriptionSchedule = resource.update(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleUpdateParams params =
        com.stripe.param.SubscriptionScheduleUpdateParams.builder()
            .setEndBehavior(com.stripe.param.SubscriptionScheduleUpdateParams.EndBehavior.RELEASE)
            .build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.v1().subscriptionSchedules().update("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleUpdateParams params =
        com.stripe.param.SubscriptionScheduleUpdateParams.builder()
            .setEndBehavior(com.stripe.param.SubscriptionScheduleUpdateParams.EndBehavior.RELEASE)
            .build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.subscriptionSchedules().update("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesReleasePost() throws StripeException {
    SubscriptionSchedule resource = SubscriptionSchedule.retrieve("sub_sched_xxxxxxxxxxxxx");

    SubscriptionScheduleReleaseParams params = SubscriptionScheduleReleaseParams.builder().build();

    SubscriptionSchedule subscriptionSchedule = resource.release(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/release",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesReleasePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleReleaseParams params =
        com.stripe.param.SubscriptionScheduleReleaseParams.builder().build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.v1().subscriptionSchedules().release("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/release",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionSchedulesReleasePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionScheduleReleaseParams params =
        com.stripe.param.SubscriptionScheduleReleaseParams.builder().build();

    com.stripe.model.SubscriptionSchedule subscriptionSchedule =
        client.subscriptionSchedules().release("sub_sched_xxxxxxxxxxxxx", params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/release",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsDelete() throws StripeException {
    Subscription resource = Subscription.retrieve("sub_xxxxxxxxxxxxx");

    SubscriptionCancelParams params = SubscriptionCancelParams.builder().build();

    Subscription subscription = resource.cancel(params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionCancelParams params =
        com.stripe.param.SubscriptionCancelParams.builder().build();

    com.stripe.model.Subscription subscription =
        client.v1().subscriptions().cancel("sub_xxxxxxxxxxxxx", params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionCancelParams params =
        com.stripe.param.SubscriptionCancelParams.builder().build();

    com.stripe.model.Subscription subscription =
        client.subscriptions().cancel("sub_xxxxxxxxxxxxx", params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsDiscountDelete() throws StripeException {
    Subscription resource = Subscription.retrieve("sub_xyz");

    Discount discount = resource.deleteDiscount();
    assertNotNull(discount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscriptions/sub_xyz/discount",
        null,
        null);
  }

  @Test
  public void testSubscriptionsDiscountDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Discount discount = client.v1().subscriptions().deleteDiscount("sub_xyz");
    assertNotNull(discount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscriptions/sub_xyz/discount",
        null,
        null);
  }

  @Test
  public void testSubscriptionsDiscountDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Discount discount = client.subscriptions().deleteDiscount("sub_xyz");
    assertNotNull(discount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/subscriptions/sub_xyz/discount",
        null,
        null);
  }

  @Test
  public void testSubscriptionsGet() throws StripeException {
    SubscriptionListParams params = SubscriptionListParams.builder().setLimit(3L).build();

    SubscriptionCollection subscriptions = Subscription.list(params);
    assertNotNull(subscriptions);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/subscriptions", params.toMap(), null);
  }

  @Test
  public void testSubscriptionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionListParams params =
        com.stripe.param.SubscriptionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Subscription> stripeCollection =
        client.v1().subscriptions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/subscriptions", params.toMap(), null);
  }

  @Test
  public void testSubscriptionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionListParams params =
        com.stripe.param.SubscriptionListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Subscription> stripeCollection =
        client.subscriptions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/subscriptions", params.toMap(), null);
  }

  @Test
  public void testSubscriptionsGet2() throws StripeException {
    Subscription subscription = Subscription.retrieve("sub_xxxxxxxxxxxxx");
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testSubscriptionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionRetrieveParams params =
        com.stripe.param.SubscriptionRetrieveParams.builder().build();

    com.stripe.model.Subscription subscription =
        client.v1().subscriptions().retrieve("sub_xxxxxxxxxxxxx", params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionRetrieveParams params =
        com.stripe.param.SubscriptionRetrieveParams.builder().build();

    com.stripe.model.Subscription subscription =
        client.subscriptions().retrieve("sub_xxxxxxxxxxxxx", params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsPost() throws StripeException {
    SubscriptionCreateParams params =
        SubscriptionCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .addItem(
                SubscriptionCreateParams.Item.builder().setPrice("price_xxxxxxxxxxxxx").build())
            .build();

    Subscription subscription = Subscription.create(params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/subscriptions", params.toMap(), null);
  }

  @Test
  public void testSubscriptionsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionCreateParams params =
        com.stripe.param.SubscriptionCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .addItem(
                com.stripe.param.SubscriptionCreateParams.Item.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.Subscription subscription = client.v1().subscriptions().create(params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/subscriptions", params.toMap(), null);
  }

  @Test
  public void testSubscriptionsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionCreateParams params =
        com.stripe.param.SubscriptionCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .addItem(
                com.stripe.param.SubscriptionCreateParams.Item.builder()
                    .setPrice("price_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.Subscription subscription = client.subscriptions().create(params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/subscriptions", params.toMap(), null);
  }

  @Test
  public void testSubscriptionsPost2() throws StripeException {
    Subscription resource = Subscription.retrieve("sub_xxxxxxxxxxxxx");

    SubscriptionUpdateParams params =
        SubscriptionUpdateParams.builder().putMetadata("order_id", "6735").build();

    Subscription subscription = resource.update(params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionUpdateParams params =
        com.stripe.param.SubscriptionUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Subscription subscription =
        client.v1().subscriptions().update("sub_xxxxxxxxxxxxx", params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionUpdateParams params =
        com.stripe.param.SubscriptionUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Subscription subscription =
        client.subscriptions().update("sub_xxxxxxxxxxxxx", params);
    assertNotNull(subscription);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscriptions/sub_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsSearchGet() throws StripeException {
    SubscriptionSearchParams params =
        SubscriptionSearchParams.builder()
            .setQuery("status:'active' AND metadata['order_id']:'6735'")
            .build();

    SubscriptionSearchResult subscriptions = Subscription.search(params);
    assertNotNull(subscriptions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscriptions/search",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsSearchGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionSearchParams params =
        com.stripe.param.SubscriptionSearchParams.builder()
            .setQuery("status:'active' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Subscription> stripeSearchResult =
        client.v1().subscriptions().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscriptions/search",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionsSearchGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SubscriptionSearchParams params =
        com.stripe.param.SubscriptionSearchParams.builder()
            .setQuery("status:'active' AND metadata['order_id']:'6735'")
            .build();

    com.stripe.model.StripeSearchResult<com.stripe.model.Subscription> stripeSearchResult =
        client.subscriptions().search(params);
    assertNotNull(stripeSearchResult);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscriptions/search",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxCalculationsPost() throws StripeException {
    com.stripe.param.tax.CalculationCreateParams params =
        com.stripe.param.tax.CalculationCreateParams.builder()
            .setCurrency("usd")
            .addLineItem(
                com.stripe.param.tax.CalculationCreateParams.LineItem.builder()
                    .setAmount(1000L)
                    .setReference("L1")
                    .build())
            .setCustomerDetails(
                com.stripe.param.tax.CalculationCreateParams.CustomerDetails.builder()
                    .setAddress(
                        com.stripe.param.tax.CalculationCreateParams.CustomerDetails.Address
                            .builder()
                            .setLine1("354 Oyster Point Blvd")
                            .setCity("South San Francisco")
                            .setState("CA")
                            .setPostalCode("94080")
                            .setCountry("US")
                            .build())
                    .setAddressSource(
                        com.stripe.param.tax.CalculationCreateParams.CustomerDetails.AddressSource
                            .SHIPPING)
                    .build())
            .build();

    com.stripe.model.tax.Calculation calculation = com.stripe.model.tax.Calculation.create(params);
    assertNotNull(calculation);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/calculations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxCalculationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.CalculationCreateParams params =
        com.stripe.param.tax.CalculationCreateParams.builder()
            .setCurrency("usd")
            .addLineItem(
                com.stripe.param.tax.CalculationCreateParams.LineItem.builder()
                    .setAmount(1000L)
                    .setReference("L1")
                    .build())
            .setCustomerDetails(
                com.stripe.param.tax.CalculationCreateParams.CustomerDetails.builder()
                    .setAddress(
                        com.stripe.param.tax.CalculationCreateParams.CustomerDetails.Address
                            .builder()
                            .setLine1("354 Oyster Point Blvd")
                            .setCity("South San Francisco")
                            .setState("CA")
                            .setPostalCode("94080")
                            .setCountry("US")
                            .build())
                    .setAddressSource(
                        com.stripe.param.tax.CalculationCreateParams.CustomerDetails.AddressSource
                            .SHIPPING)
                    .build())
            .build();

    com.stripe.model.tax.Calculation calculation = client.v1().tax().calculations().create(params);
    assertNotNull(calculation);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/calculations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxCalculationsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.CalculationCreateParams params =
        com.stripe.param.tax.CalculationCreateParams.builder()
            .setCurrency("usd")
            .addLineItem(
                com.stripe.param.tax.CalculationCreateParams.LineItem.builder()
                    .setAmount(1000L)
                    .setReference("L1")
                    .build())
            .setCustomerDetails(
                com.stripe.param.tax.CalculationCreateParams.CustomerDetails.builder()
                    .setAddress(
                        com.stripe.param.tax.CalculationCreateParams.CustomerDetails.Address
                            .builder()
                            .setLine1("354 Oyster Point Blvd")
                            .setCity("South San Francisco")
                            .setState("CA")
                            .setPostalCode("94080")
                            .setCountry("US")
                            .build())
                    .setAddressSource(
                        com.stripe.param.tax.CalculationCreateParams.CustomerDetails.AddressSource
                            .SHIPPING)
                    .build())
            .build();

    com.stripe.model.tax.Calculation calculation = client.tax().calculations().create(params);
    assertNotNull(calculation);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/calculations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxCodesGet() throws StripeException {
    TaxCodeListParams params = TaxCodeListParams.builder().setLimit(3L).build();

    TaxCodeCollection taxCodes = TaxCode.list(params);
    assertNotNull(taxCodes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_codes", params.toMap(), null);
  }

  @Test
  public void testTaxCodesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxCodeListParams params =
        com.stripe.param.TaxCodeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TaxCode> stripeCollection =
        client.v1().taxCodes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_codes", params.toMap(), null);
  }

  @Test
  public void testTaxCodesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxCodeListParams params =
        com.stripe.param.TaxCodeListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TaxCode> stripeCollection =
        client.taxCodes().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_codes", params.toMap(), null);
  }

  @Test
  public void testTaxCodesGet2() throws StripeException {
    TaxCode taxCode = TaxCode.retrieve("txcd_xxxxxxxxxxxxx");
    assertNotNull(taxCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax_codes/txcd_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTaxCodesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxCodeRetrieveParams params =
        com.stripe.param.TaxCodeRetrieveParams.builder().build();

    com.stripe.model.TaxCode taxCode =
        client.v1().taxCodes().retrieve("txcd_xxxxxxxxxxxxx", params);
    assertNotNull(taxCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax_codes/txcd_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxCodesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxCodeRetrieveParams params =
        com.stripe.param.TaxCodeRetrieveParams.builder().build();

    com.stripe.model.TaxCode taxCode = client.taxCodes().retrieve("txcd_xxxxxxxxxxxxx", params);
    assertNotNull(taxCode);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax_codes/txcd_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRatesGet() throws StripeException {
    TaxRateListParams params = TaxRateListParams.builder().setLimit(3L).build();

    TaxRateCollection taxRates = TaxRate.list(params);
    assertNotNull(taxRates);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_rates", params.toMap(), null);
  }

  @Test
  public void testTaxRatesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateListParams params =
        com.stripe.param.TaxRateListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TaxRate> stripeCollection =
        client.v1().taxRates().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_rates", params.toMap(), null);
  }

  @Test
  public void testTaxRatesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateListParams params =
        com.stripe.param.TaxRateListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TaxRate> stripeCollection =
        client.taxRates().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_rates", params.toMap(), null);
  }

  @Test
  public void testTaxRatesGet2() throws StripeException {
    TaxRate taxRate = TaxRate.retrieve("txr_xxxxxxxxxxxxx");
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax_rates/txr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTaxRatesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateRetrieveParams params =
        com.stripe.param.TaxRateRetrieveParams.builder().build();

    com.stripe.model.TaxRate taxRate = client.v1().taxRates().retrieve("txr_xxxxxxxxxxxxx", params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax_rates/txr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRatesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateRetrieveParams params =
        com.stripe.param.TaxRateRetrieveParams.builder().build();

    com.stripe.model.TaxRate taxRate = client.taxRates().retrieve("txr_xxxxxxxxxxxxx", params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax_rates/txr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRatesPost() throws StripeException {
    TaxRateCreateParams params =
        TaxRateCreateParams.builder()
            .setDisplayName("VAT")
            .setDescription("VAT Germany")
            .setJurisdiction("DE")
            .setPercentage(new BigDecimal(16))
            .setInclusive(false)
            .build();

    TaxRate taxRate = TaxRate.create(params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tax_rates", params.toMap(), null);
  }

  @Test
  public void testTaxRatesPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateCreateParams params =
        com.stripe.param.TaxRateCreateParams.builder()
            .setDisplayName("VAT")
            .setDescription("VAT Germany")
            .setJurisdiction("DE")
            .setPercentage(new BigDecimal(16))
            .setInclusive(false)
            .build();

    com.stripe.model.TaxRate taxRate = client.v1().taxRates().create(params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tax_rates", params.toMap(), null);
  }

  @Test
  public void testTaxRatesPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateCreateParams params =
        com.stripe.param.TaxRateCreateParams.builder()
            .setDisplayName("VAT")
            .setDescription("VAT Germany")
            .setJurisdiction("DE")
            .setPercentage(new BigDecimal(16))
            .setInclusive(false)
            .build();

    com.stripe.model.TaxRate taxRate = client.taxRates().create(params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tax_rates", params.toMap(), null);
  }

  @Test
  public void testTaxRatesPost2() throws StripeException {
    TaxRate resource = TaxRate.retrieve("txr_xxxxxxxxxxxxx");

    TaxRateUpdateParams params = TaxRateUpdateParams.builder().setActive(false).build();

    TaxRate taxRate = resource.update(params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax_rates/txr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRatesPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateUpdateParams params =
        com.stripe.param.TaxRateUpdateParams.builder().setActive(false).build();

    com.stripe.model.TaxRate taxRate = client.v1().taxRates().update("txr_xxxxxxxxxxxxx", params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax_rates/txr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRatesPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxRateUpdateParams params =
        com.stripe.param.TaxRateUpdateParams.builder().setActive(false).build();

    com.stripe.model.TaxRate taxRate = client.taxRates().update("txr_xxxxxxxxxxxxx", params);
    assertNotNull(taxRate);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax_rates/txr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRegistrationsGet() throws StripeException {
    com.stripe.param.tax.RegistrationListParams params =
        com.stripe.param.tax.RegistrationListParams.builder()
            .setStatus(com.stripe.param.tax.RegistrationListParams.Status.ALL)
            .build();

    com.stripe.model.tax.RegistrationCollection registrations =
        com.stripe.model.tax.Registration.list(params);
    assertNotNull(registrations);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax/registrations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRegistrationsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.RegistrationListParams params =
        com.stripe.param.tax.RegistrationListParams.builder()
            .setStatus(com.stripe.param.tax.RegistrationListParams.Status.ALL)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.tax.Registration> stripeCollection =
        client.v1().tax().registrations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax/registrations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRegistrationsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.RegistrationListParams params =
        com.stripe.param.tax.RegistrationListParams.builder()
            .setStatus(com.stripe.param.tax.RegistrationListParams.Status.ALL)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.tax.Registration> stripeCollection =
        client.tax().registrations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tax/registrations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRegistrationsPost() throws StripeException {
    com.stripe.param.tax.RegistrationCreateParams params =
        com.stripe.param.tax.RegistrationCreateParams.builder()
            .setCountry("IE")
            .setCountryOptions(
                com.stripe.param.tax.RegistrationCreateParams.CountryOptions.builder()
                    .setIe(
                        com.stripe.param.tax.RegistrationCreateParams.CountryOptions.Ie.builder()
                            .setType(
                                com.stripe.param.tax.RegistrationCreateParams.CountryOptions.Ie.Type
                                    .OSS_UNION)
                            .build())
                    .build())
            .setActiveFrom(com.stripe.param.tax.RegistrationCreateParams.ActiveFrom.NOW)
            .build();

    com.stripe.model.tax.Registration registration =
        com.stripe.model.tax.Registration.create(params);
    assertNotNull(registration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/registrations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRegistrationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.RegistrationCreateParams params =
        com.stripe.param.tax.RegistrationCreateParams.builder()
            .setCountry("IE")
            .setCountryOptions(
                com.stripe.param.tax.RegistrationCreateParams.CountryOptions.builder()
                    .setIe(
                        com.stripe.param.tax.RegistrationCreateParams.CountryOptions.Ie.builder()
                            .setType(
                                com.stripe.param.tax.RegistrationCreateParams.CountryOptions.Ie.Type
                                    .OSS_UNION)
                            .build())
                    .build())
            .setActiveFrom(com.stripe.param.tax.RegistrationCreateParams.ActiveFrom.NOW)
            .build();

    com.stripe.model.tax.Registration registration =
        client.v1().tax().registrations().create(params);
    assertNotNull(registration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/registrations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxRegistrationsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.RegistrationCreateParams params =
        com.stripe.param.tax.RegistrationCreateParams.builder()
            .setCountry("IE")
            .setCountryOptions(
                com.stripe.param.tax.RegistrationCreateParams.CountryOptions.builder()
                    .setIe(
                        com.stripe.param.tax.RegistrationCreateParams.CountryOptions.Ie.builder()
                            .setType(
                                com.stripe.param.tax.RegistrationCreateParams.CountryOptions.Ie.Type
                                    .OSS_UNION)
                            .build())
                    .build())
            .setActiveFrom(com.stripe.param.tax.RegistrationCreateParams.ActiveFrom.NOW)
            .build();

    com.stripe.model.tax.Registration registration = client.tax().registrations().create(params);
    assertNotNull(registration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/registrations",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxSettingsGet() throws StripeException {
    com.stripe.model.tax.Settings settings = com.stripe.model.tax.Settings.retrieve();
    assertNotNull(settings);
    verifyRequest(BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax/settings", null, null);
  }

  @Test
  public void testTaxSettingsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.SettingsRetrieveParams params =
        com.stripe.param.tax.SettingsRetrieveParams.builder().build();

    com.stripe.model.tax.Settings settings = client.v1().tax().settings().retrieve(params);
    assertNotNull(settings);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax/settings", params.toMap(), null);
  }

  @Test
  public void testTaxSettingsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.SettingsRetrieveParams params =
        com.stripe.param.tax.SettingsRetrieveParams.builder().build();

    com.stripe.model.tax.Settings settings = client.tax().settings().retrieve(params);
    assertNotNull(settings);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax/settings", params.toMap(), null);
  }

  @Test
  public void testTaxSettingsPost() throws StripeException {
    com.stripe.param.tax.SettingsUpdateParams params =
        com.stripe.param.tax.SettingsUpdateParams.builder()
            .setDefaults(
                com.stripe.param.tax.SettingsUpdateParams.Defaults.builder()
                    .setTaxCode("txcd_10000000")
                    .build())
            .build();

    com.stripe.model.tax.Settings settings = com.stripe.model.tax.Settings.update(params);
    assertNotNull(settings);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tax/settings", params.toMap(), null);
  }

  @Test
  public void testTaxSettingsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.SettingsUpdateParams params =
        com.stripe.param.tax.SettingsUpdateParams.builder()
            .setDefaults(
                com.stripe.param.tax.SettingsUpdateParams.Defaults.builder()
                    .setTaxCode("txcd_10000000")
                    .build())
            .build();

    com.stripe.model.tax.Settings settings = client.v1().tax().settings().update(params);
    assertNotNull(settings);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tax/settings", params.toMap(), null);
  }

  @Test
  public void testTaxSettingsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.SettingsUpdateParams params =
        com.stripe.param.tax.SettingsUpdateParams.builder()
            .setDefaults(
                com.stripe.param.tax.SettingsUpdateParams.Defaults.builder()
                    .setTaxCode("txcd_10000000")
                    .build())
            .build();

    com.stripe.model.tax.Settings settings = client.tax().settings().update(params);
    assertNotNull(settings);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tax/settings", params.toMap(), null);
  }

  @Test
  public void testTaxTransactionsCreateFromCalculationPost() throws StripeException {
    com.stripe.param.tax.TransactionCreateFromCalculationParams params =
        com.stripe.param.tax.TransactionCreateFromCalculationParams.builder()
            .setCalculation("xxx")
            .setReference("yyy")
            .build();

    com.stripe.model.tax.Transaction transaction =
        com.stripe.model.tax.Transaction.createFromCalculation(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/transactions/create_from_calculation",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxTransactionsCreateFromCalculationPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.TransactionCreateFromCalculationParams params =
        com.stripe.param.tax.TransactionCreateFromCalculationParams.builder()
            .setCalculation("xxx")
            .setReference("yyy")
            .build();

    com.stripe.model.tax.Transaction transaction =
        client.v1().tax().transactions().createFromCalculation(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/transactions/create_from_calculation",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxTransactionsCreateFromCalculationPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.TransactionCreateFromCalculationParams params =
        com.stripe.param.tax.TransactionCreateFromCalculationParams.builder()
            .setCalculation("xxx")
            .setReference("yyy")
            .build();

    com.stripe.model.tax.Transaction transaction =
        client.tax().transactions().createFromCalculation(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/tax/transactions/create_from_calculation",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsDelete() throws StripeException {
    com.stripe.model.terminal.Configuration resource =
        com.stripe.model.terminal.Configuration.retrieve("uc_123");

    com.stripe.model.terminal.Configuration configuration = resource.delete();
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/configurations/uc_123",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().delete("uc_123");
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/configurations/uc_123",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().delete("uc_123");
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/configurations/uc_123",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsDelete2() throws StripeException {
    com.stripe.model.terminal.Configuration resource =
        com.stripe.model.terminal.Configuration.retrieve("tmc_xxxxxxxxxxxxx");

    com.stripe.model.terminal.Configuration configuration = resource.delete();
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsDelete2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().delete("tmc_xxxxxxxxxxxxx");
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsDelete2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().delete("tmc_xxxxxxxxxxxxx");
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsGet() throws StripeException {
    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().build();

    com.stripe.model.terminal.ConfigurationCollection configurations =
        com.stripe.model.terminal.Configuration.list(params);
    assertNotNull(configurations);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Configuration> stripeCollection =
        client.v1().terminal().configurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Configuration> stripeCollection =
        client.terminal().configurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGet2() throws StripeException {
    com.stripe.model.terminal.Configuration configuration =
        com.stripe.model.terminal.Configuration.retrieve("uc_123");
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations/uc_123",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationRetrieveParams params =
        com.stripe.param.terminal.ConfigurationRetrieveParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().retrieve("uc_123", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations/uc_123",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationRetrieveParams params =
        com.stripe.param.terminal.ConfigurationRetrieveParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().retrieve("uc_123", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations/uc_123",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGet3() throws StripeException {
    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.terminal.ConfigurationCollection configurations =
        com.stripe.model.terminal.Configuration.list(params);
    assertNotNull(configurations);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Configuration> stripeCollection =
        client.v1().terminal().configurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Configuration> stripeCollection =
        client.terminal().configurations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGet4() throws StripeException {
    com.stripe.model.terminal.Configuration configuration =
        com.stripe.model.terminal.Configuration.retrieve("tmc_xxxxxxxxxxxxx");
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalConfigurationsGet4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationRetrieveParams params =
        com.stripe.param.terminal.ConfigurationRetrieveParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().retrieve("tmc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsGet4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationRetrieveParams params =
        com.stripe.param.terminal.ConfigurationRetrieveParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().retrieve("tmc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost() throws StripeException {
    com.stripe.param.terminal.ConfigurationCreateParams params =
        com.stripe.param.terminal.ConfigurationCreateParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        com.stripe.model.terminal.Configuration.create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationCreateParams params =
        com.stripe.param.terminal.ConfigurationCreateParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationCreateParams params =
        com.stripe.param.terminal.ConfigurationCreateParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost2() throws StripeException {
    com.stripe.model.terminal.Configuration resource =
        com.stripe.model.terminal.Configuration.retrieve("uc_123");

    com.stripe.param.terminal.ConfigurationUpdateParams params =
        com.stripe.param.terminal.ConfigurationUpdateParams.builder()
            .setTipping(
                com.stripe.param.terminal.ConfigurationUpdateParams.Tipping.builder()
                    .setUsd(
                        com.stripe.param.terminal.ConfigurationUpdateParams.Tipping.Usd.builder()
                            .addFixedAmount(10L)
                            .build())
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration = resource.update(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations/uc_123",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationUpdateParams params =
        com.stripe.param.terminal.ConfigurationUpdateParams.builder()
            .setTipping(
                com.stripe.param.terminal.ConfigurationUpdateParams.Tipping.builder()
                    .setUsd(
                        com.stripe.param.terminal.ConfigurationUpdateParams.Tipping.Usd.builder()
                            .addFixedAmount(10L)
                            .build())
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().update("uc_123", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations/uc_123",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationUpdateParams params =
        com.stripe.param.terminal.ConfigurationUpdateParams.builder()
            .setTipping(
                com.stripe.param.terminal.ConfigurationUpdateParams.Tipping.builder()
                    .setUsd(
                        com.stripe.param.terminal.ConfigurationUpdateParams.Tipping.Usd.builder()
                            .addFixedAmount(10L)
                            .build())
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().update("uc_123", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations/uc_123",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost3() throws StripeException {
    com.stripe.param.terminal.ConfigurationCreateParams params =
        com.stripe.param.terminal.ConfigurationCreateParams.builder()
            .setBbposWiseposE(
                com.stripe.param.terminal.ConfigurationCreateParams.BbposWiseposE.builder()
                    .setSplashscreen("file_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration =
        com.stripe.model.terminal.Configuration.create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationCreateParams params =
        com.stripe.param.terminal.ConfigurationCreateParams.builder()
            .setBbposWiseposE(
                com.stripe.param.terminal.ConfigurationCreateParams.BbposWiseposE.builder()
                    .setSplashscreen("file_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationCreateParams params =
        com.stripe.param.terminal.ConfigurationCreateParams.builder()
            .setBbposWiseposE(
                com.stripe.param.terminal.ConfigurationCreateParams.BbposWiseposE.builder()
                    .setSplashscreen("file_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().create(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost4() throws StripeException {
    com.stripe.model.terminal.Configuration resource =
        com.stripe.model.terminal.Configuration.retrieve("tmc_xxxxxxxxxxxxx");

    com.stripe.param.terminal.ConfigurationUpdateParams params =
        com.stripe.param.terminal.ConfigurationUpdateParams.builder()
            .setBbposWiseposE(
                com.stripe.param.terminal.ConfigurationUpdateParams.BbposWiseposE.builder()
                    .setSplashscreen("file_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration = resource.update(params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationUpdateParams params =
        com.stripe.param.terminal.ConfigurationUpdateParams.builder()
            .setBbposWiseposE(
                com.stripe.param.terminal.ConfigurationUpdateParams.BbposWiseposE.builder()
                    .setSplashscreen("file_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration =
        client.v1().terminal().configurations().update("tmc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConfigurationsPost4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConfigurationUpdateParams params =
        com.stripe.param.terminal.ConfigurationUpdateParams.builder()
            .setBbposWiseposE(
                com.stripe.param.terminal.ConfigurationUpdateParams.BbposWiseposE.builder()
                    .setSplashscreen("file_xxxxxxxxxxxxx")
                    .build())
            .build();

    com.stripe.model.terminal.Configuration configuration =
        client.terminal().configurations().update("tmc_xxxxxxxxxxxxx", params);
    assertNotNull(configuration);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConnectionTokensPost() throws StripeException {
    com.stripe.param.terminal.ConnectionTokenCreateParams params =
        com.stripe.param.terminal.ConnectionTokenCreateParams.builder().build();

    com.stripe.model.terminal.ConnectionToken connectionToken =
        com.stripe.model.terminal.ConnectionToken.create(params);
    assertNotNull(connectionToken);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/connection_tokens",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConnectionTokensPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConnectionTokenCreateParams params =
        com.stripe.param.terminal.ConnectionTokenCreateParams.builder().build();

    com.stripe.model.terminal.ConnectionToken connectionToken =
        client.v1().terminal().connectionTokens().create(params);
    assertNotNull(connectionToken);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/connection_tokens",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalConnectionTokensPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ConnectionTokenCreateParams params =
        com.stripe.param.terminal.ConnectionTokenCreateParams.builder().build();

    com.stripe.model.terminal.ConnectionToken connectionToken =
        client.terminal().connectionTokens().create(params);
    assertNotNull(connectionToken);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/connection_tokens",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsDelete() throws StripeException {
    com.stripe.model.terminal.Location resource =
        com.stripe.model.terminal.Location.retrieve("tml_xxxxxxxxxxxxx");

    com.stripe.model.terminal.Location location = resource.delete();
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalLocationsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Location location =
        client.v1().terminal().locations().delete("tml_xxxxxxxxxxxxx");
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalLocationsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Location location =
        client.terminal().locations().delete("tml_xxxxxxxxxxxxx");
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalLocationsGet() throws StripeException {
    com.stripe.param.terminal.LocationListParams params =
        com.stripe.param.terminal.LocationListParams.builder().setLimit(3L).build();

    com.stripe.model.terminal.LocationCollection locations =
        com.stripe.model.terminal.Location.list(params);
    assertNotNull(locations);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/locations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationListParams params =
        com.stripe.param.terminal.LocationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Location> stripeCollection =
        client.v1().terminal().locations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/locations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationListParams params =
        com.stripe.param.terminal.LocationListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Location> stripeCollection =
        client.terminal().locations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/locations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsGet2() throws StripeException {
    com.stripe.model.terminal.Location location =
        com.stripe.model.terminal.Location.retrieve("tml_xxxxxxxxxxxxx");
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalLocationsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationRetrieveParams params =
        com.stripe.param.terminal.LocationRetrieveParams.builder().build();

    com.stripe.model.terminal.Location location =
        client.v1().terminal().locations().retrieve("tml_xxxxxxxxxxxxx", params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationRetrieveParams params =
        com.stripe.param.terminal.LocationRetrieveParams.builder().build();

    com.stripe.model.terminal.Location location =
        client.terminal().locations().retrieve("tml_xxxxxxxxxxxxx", params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsPost() throws StripeException {
    com.stripe.param.terminal.LocationCreateParams params =
        com.stripe.param.terminal.LocationCreateParams.builder()
            .setDisplayName("My First Store")
            .setAddress(
                com.stripe.param.terminal.LocationCreateParams.Address.builder()
                    .setLine1("1234 Main Street")
                    .setCity("San Francisco")
                    .setPostalCode("94111")
                    .setState("CA")
                    .setCountry("US")
                    .build())
            .build();

    com.stripe.model.terminal.Location location = com.stripe.model.terminal.Location.create(params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/locations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationCreateParams params =
        com.stripe.param.terminal.LocationCreateParams.builder()
            .setDisplayName("My First Store")
            .setAddress(
                com.stripe.param.terminal.LocationCreateParams.Address.builder()
                    .setLine1("1234 Main Street")
                    .setCity("San Francisco")
                    .setPostalCode("94111")
                    .setState("CA")
                    .setCountry("US")
                    .build())
            .build();

    com.stripe.model.terminal.Location location = client.v1().terminal().locations().create(params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/locations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationCreateParams params =
        com.stripe.param.terminal.LocationCreateParams.builder()
            .setDisplayName("My First Store")
            .setAddress(
                com.stripe.param.terminal.LocationCreateParams.Address.builder()
                    .setLine1("1234 Main Street")
                    .setCity("San Francisco")
                    .setPostalCode("94111")
                    .setState("CA")
                    .setCountry("US")
                    .build())
            .build();

    com.stripe.model.terminal.Location location = client.terminal().locations().create(params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/locations",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsPost2() throws StripeException {
    com.stripe.model.terminal.Location resource =
        com.stripe.model.terminal.Location.retrieve("tml_xxxxxxxxxxxxx");

    com.stripe.param.terminal.LocationUpdateParams params =
        com.stripe.param.terminal.LocationUpdateParams.builder()
            .setDisplayName("My First Store")
            .build();

    com.stripe.model.terminal.Location location = resource.update(params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationUpdateParams params =
        com.stripe.param.terminal.LocationUpdateParams.builder()
            .setDisplayName("My First Store")
            .build();

    com.stripe.model.terminal.Location location =
        client.v1().terminal().locations().update("tml_xxxxxxxxxxxxx", params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalLocationsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.LocationUpdateParams params =
        com.stripe.param.terminal.LocationUpdateParams.builder()
            .setDisplayName("My First Store")
            .build();

    com.stripe.model.terminal.Location location =
        client.terminal().locations().update("tml_xxxxxxxxxxxxx", params);
    assertNotNull(location);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/locations/tml_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersCancelActionPost() throws StripeException {
    com.stripe.model.terminal.Reader resource =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");

    com.stripe.param.terminal.ReaderCancelActionParams params =
        com.stripe.param.terminal.ReaderCancelActionParams.builder().build();

    com.stripe.model.terminal.Reader reader = resource.cancelAction(params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/cancel_action",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersCancelActionPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderCancelActionParams params =
        com.stripe.param.terminal.ReaderCancelActionParams.builder().build();

    com.stripe.model.terminal.Reader reader =
        client.v1().terminal().readers().cancelAction("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/cancel_action",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersCancelActionPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderCancelActionParams params =
        com.stripe.param.terminal.ReaderCancelActionParams.builder().build();

    com.stripe.model.terminal.Reader reader =
        client.terminal().readers().cancelAction("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/cancel_action",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersDelete() throws StripeException {
    com.stripe.model.terminal.Reader resource =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");

    com.stripe.model.terminal.Reader reader = resource.delete();
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalReadersDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Reader reader =
        client.v1().terminal().readers().delete("tmr_xxxxxxxxxxxxx");
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalReadersDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.terminal.Reader reader =
        client.terminal().readers().delete("tmr_xxxxxxxxxxxxx");
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalReadersGet() throws StripeException {
    com.stripe.param.terminal.ReaderListParams params =
        com.stripe.param.terminal.ReaderListParams.builder().setLimit(3L).build();

    com.stripe.model.terminal.ReaderCollection readers =
        com.stripe.model.terminal.Reader.list(params);
    assertNotNull(readers);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/readers",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderListParams params =
        com.stripe.param.terminal.ReaderListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Reader> stripeCollection =
        client.v1().terminal().readers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/readers",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderListParams params =
        com.stripe.param.terminal.ReaderListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.terminal.Reader> stripeCollection =
        client.terminal().readers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/readers",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersGet2() throws StripeException {
    com.stripe.model.terminal.Reader reader =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTerminalReadersGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderRetrieveParams params =
        com.stripe.param.terminal.ReaderRetrieveParams.builder().build();

    com.stripe.model.terminal.Reader reader =
        client.v1().terminal().readers().retrieve("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderRetrieveParams params =
        com.stripe.param.terminal.ReaderRetrieveParams.builder().build();

    com.stripe.model.terminal.Reader reader =
        client.terminal().readers().retrieve("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersPost() throws StripeException {
    com.stripe.param.terminal.ReaderCreateParams params =
        com.stripe.param.terminal.ReaderCreateParams.builder()
            .setRegistrationCode("puppies-plug-could")
            .setLabel("Blue Rabbit")
            .setLocation("tml_1234")
            .build();

    com.stripe.model.terminal.Reader reader = com.stripe.model.terminal.Reader.create(params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderCreateParams params =
        com.stripe.param.terminal.ReaderCreateParams.builder()
            .setRegistrationCode("puppies-plug-could")
            .setLabel("Blue Rabbit")
            .setLocation("tml_1234")
            .build();

    com.stripe.model.terminal.Reader reader = client.v1().terminal().readers().create(params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderCreateParams params =
        com.stripe.param.terminal.ReaderCreateParams.builder()
            .setRegistrationCode("puppies-plug-could")
            .setLabel("Blue Rabbit")
            .setLocation("tml_1234")
            .build();

    com.stripe.model.terminal.Reader reader = client.terminal().readers().create(params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersPost2() throws StripeException {
    com.stripe.model.terminal.Reader resource =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");

    com.stripe.param.terminal.ReaderUpdateParams params =
        com.stripe.param.terminal.ReaderUpdateParams.builder().setLabel("Blue Rabbit").build();

    com.stripe.model.terminal.Reader reader = resource.update(params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderUpdateParams params =
        com.stripe.param.terminal.ReaderUpdateParams.builder().setLabel("Blue Rabbit").build();

    com.stripe.model.terminal.Reader reader =
        client.v1().terminal().readers().update("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderUpdateParams params =
        com.stripe.param.terminal.ReaderUpdateParams.builder().setLabel("Blue Rabbit").build();

    com.stripe.model.terminal.Reader reader =
        client.terminal().readers().update("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersProcessPaymentIntentPost() throws StripeException {
    com.stripe.model.terminal.Reader resource =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");

    com.stripe.param.terminal.ReaderProcessPaymentIntentParams params =
        com.stripe.param.terminal.ReaderProcessPaymentIntentParams.builder()
            .setPaymentIntent("pi_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.terminal.Reader reader = resource.processPaymentIntent(params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_payment_intent",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersProcessPaymentIntentPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderProcessPaymentIntentParams params =
        com.stripe.param.terminal.ReaderProcessPaymentIntentParams.builder()
            .setPaymentIntent("pi_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.terminal.Reader reader =
        client.v1().terminal().readers().processPaymentIntent("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_payment_intent",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersProcessPaymentIntentPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderProcessPaymentIntentParams params =
        com.stripe.param.terminal.ReaderProcessPaymentIntentParams.builder()
            .setPaymentIntent("pi_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.terminal.Reader reader =
        client.terminal().readers().processPaymentIntent("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_payment_intent",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersProcessSetupIntentPost() throws StripeException {
    com.stripe.model.terminal.Reader resource =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");

    com.stripe.param.terminal.ReaderProcessSetupIntentParams params =
        com.stripe.param.terminal.ReaderProcessSetupIntentParams.builder()
            .setSetupIntent("seti_xxxxxxxxxxxxx")
            .setAllowRedisplay(
                com.stripe.param.terminal.ReaderProcessSetupIntentParams.AllowRedisplay.ALWAYS)
            .build();

    com.stripe.model.terminal.Reader reader = resource.processSetupIntent(params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_setup_intent",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersProcessSetupIntentPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderProcessSetupIntentParams params =
        com.stripe.param.terminal.ReaderProcessSetupIntentParams.builder()
            .setSetupIntent("seti_xxxxxxxxxxxxx")
            .setAllowRedisplay(
                com.stripe.param.terminal.ReaderProcessSetupIntentParams.AllowRedisplay.ALWAYS)
            .build();

    com.stripe.model.terminal.Reader reader =
        client.v1().terminal().readers().processSetupIntent("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_setup_intent",
        params.toMap(),
        null);
  }

  @Test
  public void testTerminalReadersProcessSetupIntentPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderProcessSetupIntentParams params =
        com.stripe.param.terminal.ReaderProcessSetupIntentParams.builder()
            .setSetupIntent("seti_xxxxxxxxxxxxx")
            .setAllowRedisplay(
                com.stripe.param.terminal.ReaderProcessSetupIntentParams.AllowRedisplay.ALWAYS)
            .build();

    com.stripe.model.terminal.Reader reader =
        client.terminal().readers().processSetupIntent("tmr_xxxxxxxxxxxxx", params);
    assertNotNull(reader);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_setup_intent",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersCustomersFundCashBalancePost() throws StripeException {
    Customer resource = Customer.retrieve("cus_123");

    CustomerFundCashBalanceParams params =
        CustomerFundCashBalanceParams.builder().setAmount(30L).setCurrency("eur").build();

    CustomerCashBalanceTransaction customerCashBalanceTransaction =
        resource.getTestHelpers().fundCashBalance(params);
    assertNotNull(customerCashBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/customers/cus_123/fund_cash_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersCustomersFundCashBalancePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerFundCashBalanceParams params =
        com.stripe.param.CustomerFundCashBalanceParams.builder()
            .setAmount(30L)
            .setCurrency("eur")
            .build();

    com.stripe.model.CustomerCashBalanceTransaction customerCashBalanceTransaction =
        client.v1().testHelpers().customers().fundCashBalance("cus_123", params);
    assertNotNull(customerCashBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/customers/cus_123/fund_cash_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersCustomersFundCashBalancePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CustomerFundCashBalanceParams params =
        com.stripe.param.CustomerFundCashBalanceParams.builder()
            .setAmount(30L)
            .setCurrency("eur")
            .build();

    com.stripe.model.CustomerCashBalanceTransaction customerCashBalanceTransaction =
        client.testHelpers().customers().fundCashBalance("cus_123", params);
    assertNotNull(customerCashBalanceTransaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/customers/cus_123/fund_cash_balance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsCapturePost() throws StripeException {
    com.stripe.model.issuing.Authorization resource =
        com.stripe.model.issuing.Authorization.retrieve("example_authorization");

    com.stripe.param.issuing.AuthorizationCaptureParams params =
        com.stripe.param.issuing.AuthorizationCaptureParams.builder()
            .setCaptureAmount(100L)
            .setCloseAuthorization(true)
            .setPurchaseDetails(
                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.builder()
                    .setFlight(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Flight
                            .builder()
                            .setDepartureAt(1633651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Fuel
                            .builder()
                            .setType(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Lodging
                            .builder()
                            .setCheckInAt(1633651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Receipt
                            .builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Authorization authorization =
        resource.getTestHelpers().capture(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsCapturePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationCaptureParams params =
        com.stripe.param.issuing.AuthorizationCaptureParams.builder()
            .setCaptureAmount(100L)
            .setCloseAuthorization(true)
            .setPurchaseDetails(
                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.builder()
                    .setFlight(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Flight
                            .builder()
                            .setDepartureAt(1633651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Fuel
                            .builder()
                            .setType(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Lodging
                            .builder()
                            .setCheckInAt(1633651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Receipt
                            .builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client
            .v1()
            .testHelpers()
            .issuing()
            .authorizations()
            .capture("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsCapturePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationCaptureParams params =
        com.stripe.param.issuing.AuthorizationCaptureParams.builder()
            .setCaptureAmount(100L)
            .setCloseAuthorization(true)
            .setPurchaseDetails(
                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.builder()
                    .setFlight(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Flight
                            .builder()
                            .setDepartureAt(1633651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Fuel
                            .builder()
                            .setType(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails
                                    .Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Lodging
                            .builder()
                            .setCheckInAt(1633651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.AuthorizationCaptureParams.PurchaseDetails.Receipt
                            .builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client.testHelpers().issuing().authorizations().capture("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/capture",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsExpirePost() throws StripeException {
    com.stripe.model.issuing.Authorization resource =
        com.stripe.model.issuing.Authorization.retrieve("example_authorization");

    com.stripe.param.issuing.AuthorizationExpireParams params =
        com.stripe.param.issuing.AuthorizationExpireParams.builder().build();

    com.stripe.model.issuing.Authorization authorization = resource.getTestHelpers().expire(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsExpirePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationExpireParams params =
        com.stripe.param.issuing.AuthorizationExpireParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client
            .v1()
            .testHelpers()
            .issuing()
            .authorizations()
            .expire("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsExpirePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationExpireParams params =
        com.stripe.param.issuing.AuthorizationExpireParams.builder().build();

    com.stripe.model.issuing.Authorization authorization =
        client.testHelpers().issuing().authorizations().expire("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsIncrementPost() throws StripeException {
    com.stripe.model.issuing.Authorization resource =
        com.stripe.model.issuing.Authorization.retrieve("example_authorization");

    com.stripe.param.issuing.AuthorizationIncrementParams params =
        com.stripe.param.issuing.AuthorizationIncrementParams.builder()
            .setIncrementAmount(50L)
            .setIsAmountControllable(true)
            .build();

    com.stripe.model.issuing.Authorization authorization =
        resource.getTestHelpers().increment(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/increment",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsIncrementPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationIncrementParams params =
        com.stripe.param.issuing.AuthorizationIncrementParams.builder()
            .setIncrementAmount(50L)
            .setIsAmountControllable(true)
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client
            .v1()
            .testHelpers()
            .issuing()
            .authorizations()
            .increment("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/increment",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsIncrementPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationIncrementParams params =
        com.stripe.param.issuing.AuthorizationIncrementParams.builder()
            .setIncrementAmount(50L)
            .setIsAmountControllable(true)
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client.testHelpers().issuing().authorizations().increment("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/increment",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsPost() throws StripeException {
    com.stripe.param.issuing.AuthorizationCreateParams params =
        com.stripe.param.issuing.AuthorizationCreateParams.builder()
            .setAmount(100L)
            .setAmountDetails(
                com.stripe.param.issuing.AuthorizationCreateParams.AmountDetails.builder()
                    .setAtmFee(10L)
                    .setCashbackAmount(5L)
                    .build())
            .setAuthorizationMethod(
                com.stripe.param.issuing.AuthorizationCreateParams.AuthorizationMethod.CHIP)
            .setCard("foo")
            .setCurrency("usd")
            .setIsAmountControllable(true)
            .setMerchantData(
                com.stripe.param.issuing.AuthorizationCreateParams.MerchantData.builder()
                    .setCategory(
                        com.stripe.param.issuing.AuthorizationCreateParams.MerchantData.Category
                            .AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("bar")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("foo")
                    .setState("bar")
                    .setTerminalId("foo")
                    .build())
            .setNetworkData(
                com.stripe.param.issuing.AuthorizationCreateParams.NetworkData.builder()
                    .setAcquiringInstitutionId("foo")
                    .build())
            .setVerificationData(
                com.stripe.param.issuing.AuthorizationCreateParams.VerificationData.builder()
                    .setAddressLine1Check(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .AddressLine1Check.MISMATCH)
                    .setAddressPostalCodeCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .AddressPostalCodeCheck.MATCH)
                    .setCvcCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData.CvcCheck
                            .MATCH)
                    .setExpiryCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .ExpiryCheck.MISMATCH)
                    .build())
            .setWallet(com.stripe.param.issuing.AuthorizationCreateParams.Wallet.APPLE_PAY)
            .build();

    com.stripe.model.issuing.Authorization authorization =
        com.stripe.model.issuing.Authorization.TestHelpers.create(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationCreateParams params =
        com.stripe.param.issuing.AuthorizationCreateParams.builder()
            .setAmount(100L)
            .setAmountDetails(
                com.stripe.param.issuing.AuthorizationCreateParams.AmountDetails.builder()
                    .setAtmFee(10L)
                    .setCashbackAmount(5L)
                    .build())
            .setAuthorizationMethod(
                com.stripe.param.issuing.AuthorizationCreateParams.AuthorizationMethod.CHIP)
            .setCard("foo")
            .setCurrency("usd")
            .setIsAmountControllable(true)
            .setMerchantData(
                com.stripe.param.issuing.AuthorizationCreateParams.MerchantData.builder()
                    .setCategory(
                        com.stripe.param.issuing.AuthorizationCreateParams.MerchantData.Category
                            .AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("bar")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("foo")
                    .setState("bar")
                    .setTerminalId("foo")
                    .build())
            .setNetworkData(
                com.stripe.param.issuing.AuthorizationCreateParams.NetworkData.builder()
                    .setAcquiringInstitutionId("foo")
                    .build())
            .setVerificationData(
                com.stripe.param.issuing.AuthorizationCreateParams.VerificationData.builder()
                    .setAddressLine1Check(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .AddressLine1Check.MISMATCH)
                    .setAddressPostalCodeCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .AddressPostalCodeCheck.MATCH)
                    .setCvcCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData.CvcCheck
                            .MATCH)
                    .setExpiryCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .ExpiryCheck.MISMATCH)
                    .build())
            .setWallet(com.stripe.param.issuing.AuthorizationCreateParams.Wallet.APPLE_PAY)
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client.v1().testHelpers().issuing().authorizations().create(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationCreateParams params =
        com.stripe.param.issuing.AuthorizationCreateParams.builder()
            .setAmount(100L)
            .setAmountDetails(
                com.stripe.param.issuing.AuthorizationCreateParams.AmountDetails.builder()
                    .setAtmFee(10L)
                    .setCashbackAmount(5L)
                    .build())
            .setAuthorizationMethod(
                com.stripe.param.issuing.AuthorizationCreateParams.AuthorizationMethod.CHIP)
            .setCard("foo")
            .setCurrency("usd")
            .setIsAmountControllable(true)
            .setMerchantData(
                com.stripe.param.issuing.AuthorizationCreateParams.MerchantData.builder()
                    .setCategory(
                        com.stripe.param.issuing.AuthorizationCreateParams.MerchantData.Category
                            .AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("bar")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("foo")
                    .setState("bar")
                    .setTerminalId("foo")
                    .build())
            .setNetworkData(
                com.stripe.param.issuing.AuthorizationCreateParams.NetworkData.builder()
                    .setAcquiringInstitutionId("foo")
                    .build())
            .setVerificationData(
                com.stripe.param.issuing.AuthorizationCreateParams.VerificationData.builder()
                    .setAddressLine1Check(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .AddressLine1Check.MISMATCH)
                    .setAddressPostalCodeCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .AddressPostalCodeCheck.MATCH)
                    .setCvcCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData.CvcCheck
                            .MATCH)
                    .setExpiryCheck(
                        com.stripe.param.issuing.AuthorizationCreateParams.VerificationData
                            .ExpiryCheck.MISMATCH)
                    .build())
            .setWallet(com.stripe.param.issuing.AuthorizationCreateParams.Wallet.APPLE_PAY)
            .build();

    com.stripe.model.issuing.Authorization authorization =
        client.testHelpers().issuing().authorizations().create(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsReversePost() throws StripeException {
    com.stripe.model.issuing.Authorization resource =
        com.stripe.model.issuing.Authorization.retrieve("example_authorization");

    com.stripe.param.issuing.AuthorizationReverseParams params =
        com.stripe.param.issuing.AuthorizationReverseParams.builder().setReverseAmount(20L).build();

    com.stripe.model.issuing.Authorization authorization =
        resource.getTestHelpers().reverse(params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/reverse",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsReversePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationReverseParams params =
        com.stripe.param.issuing.AuthorizationReverseParams.builder().setReverseAmount(20L).build();

    com.stripe.model.issuing.Authorization authorization =
        client
            .v1()
            .testHelpers()
            .issuing()
            .authorizations()
            .reverse("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/reverse",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingAuthorizationsReversePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.AuthorizationReverseParams params =
        com.stripe.param.issuing.AuthorizationReverseParams.builder().setReverseAmount(20L).build();

    com.stripe.model.issuing.Authorization authorization =
        client.testHelpers().issuing().authorizations().reverse("example_authorization", params);
    assertNotNull(authorization);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/authorizations/example_authorization/reverse",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingDeliverPost() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardDeliverCardParams params =
        com.stripe.param.issuing.CardDeliverCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().deliverCard(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/deliver",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingDeliverPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardDeliverCardParams params =
        com.stripe.param.issuing.CardDeliverCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.v1().testHelpers().issuing().cards().deliverCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/deliver",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingDeliverPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardDeliverCardParams params =
        com.stripe.param.issuing.CardDeliverCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.testHelpers().issuing().cards().deliverCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/deliver",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingFailPost() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardFailCardParams params =
        com.stripe.param.issuing.CardFailCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().failCard(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingFailPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardFailCardParams params =
        com.stripe.param.issuing.CardFailCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.v1().testHelpers().issuing().cards().failCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingFailPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardFailCardParams params =
        com.stripe.param.issuing.CardFailCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.testHelpers().issuing().cards().failCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingReturnPost() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardReturnCardParams params =
        com.stripe.param.issuing.CardReturnCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().returnCard(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingReturnPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardReturnCardParams params =
        com.stripe.param.issuing.CardReturnCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.v1().testHelpers().issuing().cards().returnCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingReturnPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardReturnCardParams params =
        com.stripe.param.issuing.CardReturnCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.testHelpers().issuing().cards().returnCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingShipPost() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardShipCardParams params =
        com.stripe.param.issuing.CardShipCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().shipCard(params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/ship",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingShipPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardShipCardParams params =
        com.stripe.param.issuing.CardShipCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.v1().testHelpers().issuing().cards().shipCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/ship",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingCardsShippingShipPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.CardShipCardParams params =
        com.stripe.param.issuing.CardShipCardParams.builder().build();

    com.stripe.model.issuing.Card card =
        client.testHelpers().issuing().cards().shipCard("card_123", params);
    assertNotNull(card);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/ship",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsActivatePost() throws StripeException {
    com.stripe.model.issuing.PersonalizationDesign resource =
        com.stripe.model.issuing.PersonalizationDesign.retrieve("pd_xyz");

    com.stripe.param.issuing.PersonalizationDesignActivateParams params =
        com.stripe.param.issuing.PersonalizationDesignActivateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        resource.getTestHelpers().activate(params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/activate",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsActivatePostServices()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignActivateParams params =
        com.stripe.param.issuing.PersonalizationDesignActivateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.v1().testHelpers().issuing().personalizationDesigns().activate("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/activate",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsActivatePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignActivateParams params =
        com.stripe.param.issuing.PersonalizationDesignActivateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.testHelpers().issuing().personalizationDesigns().activate("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/activate",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsDeactivatePost() throws StripeException {
    com.stripe.model.issuing.PersonalizationDesign resource =
        com.stripe.model.issuing.PersonalizationDesign.retrieve("pd_xyz");

    com.stripe.param.issuing.PersonalizationDesignDeactivateParams params =
        com.stripe.param.issuing.PersonalizationDesignDeactivateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        resource.getTestHelpers().deactivate(params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/deactivate",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsDeactivatePostServices()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignDeactivateParams params =
        com.stripe.param.issuing.PersonalizationDesignDeactivateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.v1().testHelpers().issuing().personalizationDesigns().deactivate("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/deactivate",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsDeactivatePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignDeactivateParams params =
        com.stripe.param.issuing.PersonalizationDesignDeactivateParams.builder().build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.testHelpers().issuing().personalizationDesigns().deactivate("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/deactivate",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsRejectPost() throws StripeException {
    com.stripe.model.issuing.PersonalizationDesign resource =
        com.stripe.model.issuing.PersonalizationDesign.retrieve("pd_xyz");

    com.stripe.param.issuing.PersonalizationDesignRejectParams params =
        com.stripe.param.issuing.PersonalizationDesignRejectParams.builder()
            .setRejectionReasons(
                com.stripe.param.issuing.PersonalizationDesignRejectParams.RejectionReasons
                    .builder()
                    .addCardLogo(
                        com.stripe.param.issuing.PersonalizationDesignRejectParams.RejectionReasons
                            .CardLogo.GEOGRAPHIC_LOCATION)
                    .build())
            .build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        resource.getTestHelpers().reject(params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/reject",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsRejectPostServices()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignRejectParams params =
        com.stripe.param.issuing.PersonalizationDesignRejectParams.builder()
            .setRejectionReasons(
                com.stripe.param.issuing.PersonalizationDesignRejectParams.RejectionReasons
                    .builder()
                    .addCardLogo(
                        com.stripe.param.issuing.PersonalizationDesignRejectParams.RejectionReasons
                            .CardLogo.GEOGRAPHIC_LOCATION)
                    .build())
            .build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.v1().testHelpers().issuing().personalizationDesigns().reject("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/reject",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingPersonalizationDesignsRejectPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.PersonalizationDesignRejectParams params =
        com.stripe.param.issuing.PersonalizationDesignRejectParams.builder()
            .setRejectionReasons(
                com.stripe.param.issuing.PersonalizationDesignRejectParams.RejectionReasons
                    .builder()
                    .addCardLogo(
                        com.stripe.param.issuing.PersonalizationDesignRejectParams.RejectionReasons
                            .CardLogo.GEOGRAPHIC_LOCATION)
                    .build())
            .build();

    com.stripe.model.issuing.PersonalizationDesign personalizationDesign =
        client.testHelpers().issuing().personalizationDesigns().reject("pd_xyz", params);
    assertNotNull(personalizationDesign);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/personalization_designs/pd_xyz/reject",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsCreateForceCapturePost() throws StripeException {
    com.stripe.param.issuing.TransactionCreateForceCaptureParams params =
        com.stripe.param.issuing.TransactionCreateForceCaptureParams.builder()
            .setAmount(100L)
            .setCard("foo")
            .setCurrency("usd")
            .setMerchantData(
                com.stripe.param.issuing.TransactionCreateForceCaptureParams.MerchantData.builder()
                    .setCategory(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.MerchantData
                            .Category.AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("US")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("10001")
                    .setState("NY")
                    .setTerminalId("foo")
                    .build())
            .setPurchaseDetails(
                com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                    .builder()
                    .setFlight(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Flight.builder()
                            .setDepartureAt(1633651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Fuel.builder()
                            .setType(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Lodging.builder()
                            .setCheckInAt(1533651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Receipt.builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Transaction transaction =
        com.stripe.model.issuing.Transaction.TestHelpers.createForceCapture(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/create_force_capture",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsCreateForceCapturePostServices()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionCreateForceCaptureParams params =
        com.stripe.param.issuing.TransactionCreateForceCaptureParams.builder()
            .setAmount(100L)
            .setCard("foo")
            .setCurrency("usd")
            .setMerchantData(
                com.stripe.param.issuing.TransactionCreateForceCaptureParams.MerchantData.builder()
                    .setCategory(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.MerchantData
                            .Category.AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("US")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("10001")
                    .setState("NY")
                    .setTerminalId("foo")
                    .build())
            .setPurchaseDetails(
                com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                    .builder()
                    .setFlight(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Flight.builder()
                            .setDepartureAt(1633651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Fuel.builder()
                            .setType(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Lodging.builder()
                            .setCheckInAt(1533651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Receipt.builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Transaction transaction =
        client.v1().testHelpers().issuing().transactions().createForceCapture(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/create_force_capture",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsCreateForceCapturePostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionCreateForceCaptureParams params =
        com.stripe.param.issuing.TransactionCreateForceCaptureParams.builder()
            .setAmount(100L)
            .setCard("foo")
            .setCurrency("usd")
            .setMerchantData(
                com.stripe.param.issuing.TransactionCreateForceCaptureParams.MerchantData.builder()
                    .setCategory(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.MerchantData
                            .Category.AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("US")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("10001")
                    .setState("NY")
                    .setTerminalId("foo")
                    .build())
            .setPurchaseDetails(
                com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                    .builder()
                    .setFlight(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Flight.builder()
                            .setDepartureAt(1633651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Fuel.builder()
                            .setType(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.TransactionCreateForceCaptureParams
                                    .PurchaseDetails.Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Lodging.builder()
                            .setCheckInAt(1533651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.TransactionCreateForceCaptureParams.PurchaseDetails
                            .Receipt.builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Transaction transaction =
        client.testHelpers().issuing().transactions().createForceCapture(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/create_force_capture",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsCreateUnlinkedRefundPost() throws StripeException {
    com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams params =
        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.builder()
            .setAmount(100L)
            .setCard("foo")
            .setCurrency("usd")
            .setMerchantData(
                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.MerchantData
                    .builder()
                    .setCategory(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.MerchantData
                            .Category.AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("bar")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("foo")
                    .setState("bar")
                    .setTerminalId("foo")
                    .build())
            .setPurchaseDetails(
                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.PurchaseDetails
                    .builder()
                    .setFlight(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Flight.builder()
                            .setDepartureAt(1533651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Fuel.builder()
                            .setType(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Lodging.builder()
                            .setCheckInAt(1533651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Receipt.builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Transaction transaction =
        com.stripe.model.issuing.Transaction.TestHelpers.createUnlinkedRefund(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/create_unlinked_refund",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsCreateUnlinkedRefundPostServices()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams params =
        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.builder()
            .setAmount(100L)
            .setCard("foo")
            .setCurrency("usd")
            .setMerchantData(
                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.MerchantData
                    .builder()
                    .setCategory(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.MerchantData
                            .Category.AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("bar")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("foo")
                    .setState("bar")
                    .setTerminalId("foo")
                    .build())
            .setPurchaseDetails(
                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.PurchaseDetails
                    .builder()
                    .setFlight(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Flight.builder()
                            .setDepartureAt(1533651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Fuel.builder()
                            .setType(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Lodging.builder()
                            .setCheckInAt(1533651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Receipt.builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Transaction transaction =
        client.v1().testHelpers().issuing().transactions().createUnlinkedRefund(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/create_unlinked_refund",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsCreateUnlinkedRefundPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams params =
        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.builder()
            .setAmount(100L)
            .setCard("foo")
            .setCurrency("usd")
            .setMerchantData(
                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.MerchantData
                    .builder()
                    .setCategory(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.MerchantData
                            .Category.AC_REFRIGERATION_REPAIR)
                    .setCity("foo")
                    .setCountry("bar")
                    .setName("foo")
                    .setNetworkId("bar")
                    .setPostalCode("foo")
                    .setState("bar")
                    .setTerminalId("foo")
                    .build())
            .setPurchaseDetails(
                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams.PurchaseDetails
                    .builder()
                    .setFlight(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Flight.builder()
                            .setDepartureAt(1533651200L)
                            .setPassengerName("John Doe")
                            .setRefundable(true)
                            .addSegment(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Flight.Segment.builder()
                                    .setArrivalAirportCode("SFO")
                                    .setCarrier("Delta")
                                    .setDepartureAirportCode("LAX")
                                    .setFlightNumber("DL100")
                                    .setServiceClass("Economy")
                                    .setStopoverAllowed(true)
                                    .build())
                            .setTravelAgency("Orbitz")
                            .build())
                    .setFuel(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Fuel.builder()
                            .setType(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Fuel.Type.DIESEL)
                            .setUnit(
                                com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                                    .PurchaseDetails.Fuel.Unit.LITER)
                            .setUnitCostDecimal(new BigDecimal("3.5"))
                            .setQuantityDecimal(new BigDecimal("10"))
                            .build())
                    .setLodging(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Lodging.builder()
                            .setCheckInAt(1533651200L)
                            .setNights(2L)
                            .build())
                    .addReceipt(
                        com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams
                            .PurchaseDetails.Receipt.builder()
                            .setDescription("Room charge")
                            .setQuantity(new BigDecimal("1"))
                            .setTotal(200L)
                            .setUnitCost(200L)
                            .build())
                    .setReference("foo")
                    .build())
            .build();

    com.stripe.model.issuing.Transaction transaction =
        client.testHelpers().issuing().transactions().createUnlinkedRefund(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/create_unlinked_refund",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsRefundPost() throws StripeException {
    com.stripe.model.issuing.Transaction resource =
        com.stripe.model.issuing.Transaction.retrieve("example_transaction");

    com.stripe.param.issuing.TransactionRefundParams params =
        com.stripe.param.issuing.TransactionRefundParams.builder().setRefundAmount(50L).build();

    com.stripe.model.issuing.Transaction transaction = resource.getTestHelpers().refund(params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/example_transaction/refund",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsRefundPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionRefundParams params =
        com.stripe.param.issuing.TransactionRefundParams.builder().setRefundAmount(50L).build();

    com.stripe.model.issuing.Transaction transaction =
        client.v1().testHelpers().issuing().transactions().refund("example_transaction", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/example_transaction/refund",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersIssuingTransactionsRefundPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.issuing.TransactionRefundParams params =
        com.stripe.param.issuing.TransactionRefundParams.builder().setRefundAmount(50L).build();

    com.stripe.model.issuing.Transaction transaction =
        client.testHelpers().issuing().transactions().refund("example_transaction", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/transactions/example_transaction/refund",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersRefundsExpirePost() throws StripeException {
    Refund resource = Refund.retrieve("re_123");

    RefundExpireParams params = RefundExpireParams.builder().build();

    Refund refund = resource.getTestHelpers().expire(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/refunds/re_123/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersRefundsExpirePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundExpireParams params =
        com.stripe.param.RefundExpireParams.builder().build();

    com.stripe.model.Refund refund = client.v1().testHelpers().refunds().expire("re_123", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/refunds/re_123/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersRefundsExpirePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundExpireParams params =
        com.stripe.param.RefundExpireParams.builder().build();

    com.stripe.model.Refund refund = client.testHelpers().refunds().expire("re_123", params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/refunds/re_123/expire",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksAdvancePost() throws StripeException {
    com.stripe.model.testhelpers.TestClock resource =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xyz");

    com.stripe.param.testhelpers.TestClockAdvanceParams params =
        com.stripe.param.testhelpers.TestClockAdvanceParams.builder().setFrozenTime(142L).build();

    com.stripe.model.testhelpers.TestClock testClock = resource.advance(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xyz/advance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksAdvancePostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockAdvanceParams params =
        com.stripe.param.testhelpers.TestClockAdvanceParams.builder().setFrozenTime(142L).build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().advance("clock_xyz", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xyz/advance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksAdvancePostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockAdvanceParams params =
        com.stripe.param.testhelpers.TestClockAdvanceParams.builder().setFrozenTime(142L).build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().advance("clock_xyz", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xyz/advance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksAdvancePost2() throws StripeException {
    com.stripe.model.testhelpers.TestClock resource =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xxxxxxxxxxxxx");

    com.stripe.param.testhelpers.TestClockAdvanceParams params =
        com.stripe.param.testhelpers.TestClockAdvanceParams.builder()
            .setFrozenTime(1675552261L)
            .build();

    com.stripe.model.testhelpers.TestClock testClock = resource.advance(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx/advance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksAdvancePost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockAdvanceParams params =
        com.stripe.param.testhelpers.TestClockAdvanceParams.builder()
            .setFrozenTime(1675552261L)
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().advance("clock_xxxxxxxxxxxxx", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx/advance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksAdvancePost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockAdvanceParams params =
        com.stripe.param.testhelpers.TestClockAdvanceParams.builder()
            .setFrozenTime(1675552261L)
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().advance("clock_xxxxxxxxxxxxx", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx/advance",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksDelete() throws StripeException {
    com.stripe.model.testhelpers.TestClock resource =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xyz");

    com.stripe.model.testhelpers.TestClock testClock = resource.delete();
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/test_helpers/test_clocks/clock_xyz",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().delete("clock_xyz");
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/test_helpers/test_clocks/clock_xyz",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().delete("clock_xyz");
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/test_helpers/test_clocks/clock_xyz",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksDelete2() throws StripeException {
    com.stripe.model.testhelpers.TestClock resource =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xxxxxxxxxxxxx");

    com.stripe.model.testhelpers.TestClock testClock = resource.delete();
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksDelete2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().delete("clock_xxxxxxxxxxxxx");
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksDelete2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().delete("clock_xxxxxxxxxxxxx");
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet() throws StripeException {
    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().build();

    com.stripe.model.testhelpers.TestClockCollection testClocks =
        com.stripe.model.testhelpers.TestClock.list(params);
    assertNotNull(testClocks);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.testhelpers.TestClock> stripeCollection =
        client.v1().testHelpers().testClocks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().build();

    com.stripe.model.StripeCollection<com.stripe.model.testhelpers.TestClock> stripeCollection =
        client.testHelpers().testClocks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet2() throws StripeException {
    com.stripe.model.testhelpers.TestClock testClock =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xyz");
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks/clock_xyz",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockRetrieveParams params =
        com.stripe.param.testhelpers.TestClockRetrieveParams.builder().build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().retrieve("clock_xyz", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks/clock_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockRetrieveParams params =
        com.stripe.param.testhelpers.TestClockRetrieveParams.builder().build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().retrieve("clock_xyz", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks/clock_xyz",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet3() throws StripeException {
    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().setLimit(3L).build();

    com.stripe.model.testhelpers.TestClockCollection testClocks =
        com.stripe.model.testhelpers.TestClock.list(params);
    assertNotNull(testClocks);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.testhelpers.TestClock> stripeCollection =
        client.v1().testHelpers().testClocks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.testhelpers.TestClock> stripeCollection =
        client.testHelpers().testClocks().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet4() throws StripeException {
    com.stripe.model.testhelpers.TestClock testClock =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xxxxxxxxxxxxx");
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockRetrieveParams params =
        com.stripe.param.testhelpers.TestClockRetrieveParams.builder().build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().retrieve("clock_xxxxxxxxxxxxx", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksGet4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockRetrieveParams params =
        com.stripe.param.testhelpers.TestClockRetrieveParams.builder().build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().retrieve("clock_xxxxxxxxxxxxx", params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksPost() throws StripeException {
    com.stripe.param.testhelpers.TestClockCreateParams params =
        com.stripe.param.testhelpers.TestClockCreateParams.builder()
            .setFrozenTime(123L)
            .setName("cogsworth")
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        com.stripe.model.testhelpers.TestClock.create(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockCreateParams params =
        com.stripe.param.testhelpers.TestClockCreateParams.builder()
            .setFrozenTime(123L)
            .setName("cogsworth")
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().create(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockCreateParams params =
        com.stripe.param.testhelpers.TestClockCreateParams.builder()
            .setFrozenTime(123L)
            .setName("cogsworth")
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().create(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksPost2() throws StripeException {
    com.stripe.param.testhelpers.TestClockCreateParams params =
        com.stripe.param.testhelpers.TestClockCreateParams.builder()
            .setFrozenTime(1577836800L)
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        com.stripe.model.testhelpers.TestClock.create(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockCreateParams params =
        com.stripe.param.testhelpers.TestClockCreateParams.builder()
            .setFrozenTime(1577836800L)
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.v1().testHelpers().testClocks().create(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTestClocksPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.testhelpers.TestClockCreateParams params =
        com.stripe.param.testhelpers.TestClockCreateParams.builder()
            .setFrozenTime(1577836800L)
            .build();

    com.stripe.model.testhelpers.TestClock testClock =
        client.testHelpers().testClocks().create(params);
    assertNotNull(testClock);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersFailPost() throws StripeException {
    com.stripe.model.treasury.InboundTransfer resource =
        com.stripe.model.treasury.InboundTransfer.retrieve("ibt_123");

    com.stripe.param.treasury.InboundTransferFailParams params =
        com.stripe.param.treasury.InboundTransferFailParams.builder()
            .setFailureDetails(
                com.stripe.param.treasury.InboundTransferFailParams.FailureDetails.builder()
                    .setCode(
                        com.stripe.param.treasury.InboundTransferFailParams.FailureDetails.Code
                            .ACCOUNT_CLOSED)
                    .build())
            .build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        resource.getTestHelpers().fail(params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersFailPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferFailParams params =
        com.stripe.param.treasury.InboundTransferFailParams.builder()
            .setFailureDetails(
                com.stripe.param.treasury.InboundTransferFailParams.FailureDetails.builder()
                    .setCode(
                        com.stripe.param.treasury.InboundTransferFailParams.FailureDetails.Code
                            .ACCOUNT_CLOSED)
                    .build())
            .build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.v1().testHelpers().treasury().inboundTransfers().fail("ibt_123", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersFailPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferFailParams params =
        com.stripe.param.treasury.InboundTransferFailParams.builder()
            .setFailureDetails(
                com.stripe.param.treasury.InboundTransferFailParams.FailureDetails.builder()
                    .setCode(
                        com.stripe.param.treasury.InboundTransferFailParams.FailureDetails.Code
                            .ACCOUNT_CLOSED)
                    .build())
            .build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.testHelpers().treasury().inboundTransfers().fail("ibt_123", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersReturnPost() throws StripeException {
    com.stripe.model.treasury.InboundTransfer resource =
        com.stripe.model.treasury.InboundTransfer.retrieve("ibt_123");

    com.stripe.param.treasury.InboundTransferReturnInboundTransferParams params =
        com.stripe.param.treasury.InboundTransferReturnInboundTransferParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        resource.getTestHelpers().returnInboundTransfer(params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersReturnPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferReturnInboundTransferParams params =
        com.stripe.param.treasury.InboundTransferReturnInboundTransferParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client
            .v1()
            .testHelpers()
            .treasury()
            .inboundTransfers()
            .returnInboundTransfer("ibt_123", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersReturnPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferReturnInboundTransferParams params =
        com.stripe.param.treasury.InboundTransferReturnInboundTransferParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.testHelpers().treasury().inboundTransfers().returnInboundTransfer("ibt_123", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersSucceedPost() throws StripeException {
    com.stripe.model.treasury.InboundTransfer resource =
        com.stripe.model.treasury.InboundTransfer.retrieve("ibt_123");

    com.stripe.param.treasury.InboundTransferSucceedParams params =
        com.stripe.param.treasury.InboundTransferSucceedParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        resource.getTestHelpers().succeed(params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/succeed",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersSucceedPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferSucceedParams params =
        com.stripe.param.treasury.InboundTransferSucceedParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.v1().testHelpers().treasury().inboundTransfers().succeed("ibt_123", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/succeed",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryInboundTransfersSucceedPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferSucceedParams params =
        com.stripe.param.treasury.InboundTransferSucceedParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.testHelpers().treasury().inboundTransfers().succeed("ibt_123", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/succeed",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersFailPost() throws StripeException {
    com.stripe.model.treasury.OutboundTransfer resource =
        com.stripe.model.treasury.OutboundTransfer.retrieve("obt_123");

    com.stripe.param.treasury.OutboundTransferFailParams params =
        com.stripe.param.treasury.OutboundTransferFailParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        resource.getTestHelpers().fail(params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersFailPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferFailParams params =
        com.stripe.param.treasury.OutboundTransferFailParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.v1().testHelpers().treasury().outboundTransfers().fail("obt_123", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersFailPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferFailParams params =
        com.stripe.param.treasury.OutboundTransferFailParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.testHelpers().treasury().outboundTransfers().fail("obt_123", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/fail",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersPostPost() throws StripeException {
    com.stripe.model.treasury.OutboundTransfer resource =
        com.stripe.model.treasury.OutboundTransfer.retrieve("obt_123");

    com.stripe.param.treasury.OutboundTransferPostParams params =
        com.stripe.param.treasury.OutboundTransferPostParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        resource.getTestHelpers().post(params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/post",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersPostPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferPostParams params =
        com.stripe.param.treasury.OutboundTransferPostParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.v1().testHelpers().treasury().outboundTransfers().post("obt_123", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/post",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersPostPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferPostParams params =
        com.stripe.param.treasury.OutboundTransferPostParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.testHelpers().treasury().outboundTransfers().post("obt_123", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/post",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersReturnPost() throws StripeException {
    com.stripe.model.treasury.OutboundTransfer resource =
        com.stripe.model.treasury.OutboundTransfer.retrieve("obt_123");

    com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams params =
        com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams.builder()
            .setReturnedDetails(
                com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams
                    .ReturnedDetails.builder()
                    .setCode(
                        com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams
                            .ReturnedDetails.Code.ACCOUNT_CLOSED)
                    .build())
            .build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        resource.getTestHelpers().returnOutboundTransfer(params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersReturnPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams params =
        com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams.builder()
            .setReturnedDetails(
                com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams
                    .ReturnedDetails.builder()
                    .setCode(
                        com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams
                            .ReturnedDetails.Code.ACCOUNT_CLOSED)
                    .build())
            .build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client
            .v1()
            .testHelpers()
            .treasury()
            .outboundTransfers()
            .returnOutboundTransfer("obt_123", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryOutboundTransfersReturnPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams params =
        com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams.builder()
            .setReturnedDetails(
                com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams
                    .ReturnedDetails.builder()
                    .setCode(
                        com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams
                            .ReturnedDetails.Code.ACCOUNT_CLOSED)
                    .build())
            .build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client
            .testHelpers()
            .treasury()
            .outboundTransfers()
            .returnOutboundTransfer("obt_123", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/return",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryReceivedCreditsPost() throws StripeException {
    com.stripe.param.treasury.ReceivedCreditCreateParams params =
        com.stripe.param.treasury.ReceivedCreditCreateParams.builder()
            .setFinancialAccount("fa_123")
            .setNetwork(com.stripe.param.treasury.ReceivedCreditCreateParams.Network.ACH)
            .setAmount(1234L)
            .setCurrency("usd")
            .build();

    com.stripe.model.treasury.ReceivedCredit receivedCredit =
        com.stripe.model.treasury.ReceivedCredit.TestHelpers.create(params);
    assertNotNull(receivedCredit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_credits",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryReceivedCreditsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedCreditCreateParams params =
        com.stripe.param.treasury.ReceivedCreditCreateParams.builder()
            .setFinancialAccount("fa_123")
            .setNetwork(com.stripe.param.treasury.ReceivedCreditCreateParams.Network.ACH)
            .setAmount(1234L)
            .setCurrency("usd")
            .build();

    com.stripe.model.treasury.ReceivedCredit receivedCredit =
        client.v1().testHelpers().treasury().receivedCredits().create(params);
    assertNotNull(receivedCredit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_credits",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryReceivedCreditsPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedCreditCreateParams params =
        com.stripe.param.treasury.ReceivedCreditCreateParams.builder()
            .setFinancialAccount("fa_123")
            .setNetwork(com.stripe.param.treasury.ReceivedCreditCreateParams.Network.ACH)
            .setAmount(1234L)
            .setCurrency("usd")
            .build();

    com.stripe.model.treasury.ReceivedCredit receivedCredit =
        client.testHelpers().treasury().receivedCredits().create(params);
    assertNotNull(receivedCredit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_credits",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryReceivedDebitsPost() throws StripeException {
    com.stripe.param.treasury.ReceivedDebitCreateParams params =
        com.stripe.param.treasury.ReceivedDebitCreateParams.builder()
            .setFinancialAccount("fa_123")
            .setNetwork(com.stripe.param.treasury.ReceivedDebitCreateParams.Network.ACH)
            .setAmount(1234L)
            .setCurrency("usd")
            .build();

    com.stripe.model.treasury.ReceivedDebit receivedDebit =
        com.stripe.model.treasury.ReceivedDebit.TestHelpers.create(params);
    assertNotNull(receivedDebit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_debits",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryReceivedDebitsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedDebitCreateParams params =
        com.stripe.param.treasury.ReceivedDebitCreateParams.builder()
            .setFinancialAccount("fa_123")
            .setNetwork(com.stripe.param.treasury.ReceivedDebitCreateParams.Network.ACH)
            .setAmount(1234L)
            .setCurrency("usd")
            .build();

    com.stripe.model.treasury.ReceivedDebit receivedDebit =
        client.v1().testHelpers().treasury().receivedDebits().create(params);
    assertNotNull(receivedDebit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_debits",
        params.toMap(),
        null);
  }

  @Test
  public void testTestHelpersTreasuryReceivedDebitsPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedDebitCreateParams params =
        com.stripe.param.treasury.ReceivedDebitCreateParams.builder()
            .setFinancialAccount("fa_123")
            .setNetwork(com.stripe.param.treasury.ReceivedDebitCreateParams.Network.ACH)
            .setAmount(1234L)
            .setCurrency("usd")
            .build();

    com.stripe.model.treasury.ReceivedDebit receivedDebit =
        client.testHelpers().treasury().receivedDebits().create(params);
    assertNotNull(receivedDebit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_debits",
        params.toMap(),
        null);
  }

  @Test
  public void testTokensGet() throws StripeException {
    Token token = Token.retrieve("tok_xxxx");
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tokens/tok_xxxx", null, null);
  }

  @Test
  public void testTokensGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenRetrieveParams params =
        com.stripe.param.TokenRetrieveParams.builder().build();

    com.stripe.model.Token token = client.v1().tokens().retrieve("tok_xxxx", params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tokens/tok_xxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTokensGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenRetrieveParams params =
        com.stripe.param.TokenRetrieveParams.builder().build();

    com.stripe.model.Token token = client.tokens().retrieve("tok_xxxx", params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/tokens/tok_xxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTokensPost() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setCard(
                TokenCreateParams.Card.builder()
                    .setNumber("4242424242424242")
                    .setExpMonth("5")
                    .setExpYear("2023")
                    .setCvc("314")
                    .build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setCard(
                com.stripe.param.TokenCreateParams.Card.builder()
                    .setNumber("4242424242424242")
                    .setExpMonth("5")
                    .setExpYear("2023")
                    .setCvc("314")
                    .build())
            .build();

    com.stripe.model.Token token = client.v1().tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setCard(
                com.stripe.param.TokenCreateParams.Card.builder()
                    .setNumber("4242424242424242")
                    .setExpMonth("5")
                    .setExpYear("2023")
                    .setCvc("314")
                    .build())
            .build();

    com.stripe.model.Token token = client.tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost2() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setBankAccount(
                TokenCreateParams.BankAccount.builder()
                    .setCountry("US")
                    .setCurrency("usd")
                    .setAccountHolderName("Jenny Rosen")
                    .setAccountHolderType(
                        TokenCreateParams.BankAccount.AccountHolderType.INDIVIDUAL)
                    .setRoutingNumber("110000000")
                    .setAccountNumber("000123456789")
                    .build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setBankAccount(
                com.stripe.param.TokenCreateParams.BankAccount.builder()
                    .setCountry("US")
                    .setCurrency("usd")
                    .setAccountHolderName("Jenny Rosen")
                    .setAccountHolderType(
                        com.stripe.param.TokenCreateParams.BankAccount.AccountHolderType.INDIVIDUAL)
                    .setRoutingNumber("110000000")
                    .setAccountNumber("000123456789")
                    .build())
            .build();

    com.stripe.model.Token token = client.v1().tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setBankAccount(
                com.stripe.param.TokenCreateParams.BankAccount.builder()
                    .setCountry("US")
                    .setCurrency("usd")
                    .setAccountHolderName("Jenny Rosen")
                    .setAccountHolderType(
                        com.stripe.param.TokenCreateParams.BankAccount.AccountHolderType.INDIVIDUAL)
                    .setRoutingNumber("110000000")
                    .setAccountNumber("000123456789")
                    .build())
            .build();

    com.stripe.model.Token token = client.tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost3() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setPii(TokenCreateParams.Pii.builder().setIdNumber("000000000").build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost3Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setPii(
                com.stripe.param.TokenCreateParams.Pii.builder().setIdNumber("000000000").build())
            .build();

    com.stripe.model.Token token = client.v1().tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost3ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setPii(
                com.stripe.param.TokenCreateParams.Pii.builder().setIdNumber("000000000").build())
            .build();

    com.stripe.model.Token token = client.tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost4() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setAccount(
                TokenCreateParams.Account.builder()
                    .setIndividual(
                        TokenCreateParams.Account.Individual.builder()
                            .setFirstName("Jane")
                            .setLastName("Doe")
                            .build())
                    .setTosShownAndAccepted(true)
                    .build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost4Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setAccount(
                com.stripe.param.TokenCreateParams.Account.builder()
                    .setIndividual(
                        com.stripe.param.TokenCreateParams.Account.Individual.builder()
                            .setFirstName("Jane")
                            .setLastName("Doe")
                            .build())
                    .setTosShownAndAccepted(true)
                    .build())
            .build();

    com.stripe.model.Token token = client.v1().tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost4ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setAccount(
                com.stripe.param.TokenCreateParams.Account.builder()
                    .setIndividual(
                        com.stripe.param.TokenCreateParams.Account.Individual.builder()
                            .setFirstName("Jane")
                            .setLastName("Doe")
                            .build())
                    .setTosShownAndAccepted(true)
                    .build())
            .build();

    com.stripe.model.Token token = client.tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost5() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setPerson(
                TokenCreateParams.Person.builder()
                    .setFirstName("Jane")
                    .setLastName("Doe")
                    .setRelationship(
                        TokenCreateParams.Person.Relationship.builder().setOwner(true).build())
                    .build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost5Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setPerson(
                com.stripe.param.TokenCreateParams.Person.builder()
                    .setFirstName("Jane")
                    .setLastName("Doe")
                    .setRelationship(
                        com.stripe.param.TokenCreateParams.Person.Relationship.builder()
                            .setOwner(true)
                            .build())
                    .build())
            .build();

    com.stripe.model.Token token = client.v1().tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost5ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setPerson(
                com.stripe.param.TokenCreateParams.Person.builder()
                    .setFirstName("Jane")
                    .setLastName("Doe")
                    .setRelationship(
                        com.stripe.param.TokenCreateParams.Person.Relationship.builder()
                            .setOwner(true)
                            .build())
                    .build())
            .build();

    com.stripe.model.Token token = client.tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost6() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setCvcUpdate(TokenCreateParams.CvcUpdate.builder().setCvc("123").build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost6Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setCvcUpdate(
                com.stripe.param.TokenCreateParams.CvcUpdate.builder().setCvc("123").build())
            .build();

    com.stripe.model.Token token = client.v1().tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTokensPost6ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TokenCreateParams params =
        com.stripe.param.TokenCreateParams.builder()
            .setCvcUpdate(
                com.stripe.param.TokenCreateParams.CvcUpdate.builder().setCvc("123").build())
            .build();

    com.stripe.model.Token token = client.tokens().create(params);
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap(), null);
  }

  @Test
  public void testTopupsCancelPost() throws StripeException {
    Topup resource = Topup.retrieve("tu_xxxxxxxxxxxxx");

    TopupCancelParams params = TopupCancelParams.builder().build();

    Topup topup = resource.cancel(params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/topups/tu_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTopupsCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupCancelParams params =
        com.stripe.param.TopupCancelParams.builder().build();

    com.stripe.model.Topup topup = client.v1().topups().cancel("tu_xxxxxxxxxxxxx", params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/topups/tu_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTopupsCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupCancelParams params =
        com.stripe.param.TopupCancelParams.builder().build();

    com.stripe.model.Topup topup = client.topups().cancel("tu_xxxxxxxxxxxxx", params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/topups/tu_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTopupsGet() throws StripeException {
    TopupListParams params = TopupListParams.builder().setLimit(3L).build();

    TopupCollection topups = Topup.list(params);
    assertNotNull(topups);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/topups", params.toMap(), null);
  }

  @Test
  public void testTopupsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupListParams params =
        com.stripe.param.TopupListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Topup> stripeCollection =
        client.v1().topups().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/topups", params.toMap(), null);
  }

  @Test
  public void testTopupsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupListParams params =
        com.stripe.param.TopupListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Topup> stripeCollection =
        client.topups().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/topups", params.toMap(), null);
  }

  @Test
  public void testTopupsGet2() throws StripeException {
    Topup topup = Topup.retrieve("tu_xxxxxxxxxxxxx");
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/topups/tu_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testTopupsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupRetrieveParams params =
        com.stripe.param.TopupRetrieveParams.builder().build();

    com.stripe.model.Topup topup = client.v1().topups().retrieve("tu_xxxxxxxxxxxxx", params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/topups/tu_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTopupsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupRetrieveParams params =
        com.stripe.param.TopupRetrieveParams.builder().build();

    com.stripe.model.Topup topup = client.topups().retrieve("tu_xxxxxxxxxxxxx", params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/topups/tu_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTopupsPost() throws StripeException {
    TopupCreateParams params =
        TopupCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setDescription("Top-up for Jenny Rosen")
            .setStatementDescriptor("Top-up")
            .build();

    Topup topup = Topup.create(params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/topups", params.toMap(), null);
  }

  @Test
  public void testTopupsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupCreateParams params =
        com.stripe.param.TopupCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setDescription("Top-up for Jenny Rosen")
            .setStatementDescriptor("Top-up")
            .build();

    com.stripe.model.Topup topup = client.v1().topups().create(params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/topups", params.toMap(), null);
  }

  @Test
  public void testTopupsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupCreateParams params =
        com.stripe.param.TopupCreateParams.builder()
            .setAmount(2000L)
            .setCurrency("usd")
            .setDescription("Top-up for Jenny Rosen")
            .setStatementDescriptor("Top-up")
            .build();

    com.stripe.model.Topup topup = client.topups().create(params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/topups", params.toMap(), null);
  }

  @Test
  public void testTopupsPost2() throws StripeException {
    Topup resource = Topup.retrieve("tu_xxxxxxxxxxxxx");

    TopupUpdateParams params = TopupUpdateParams.builder().putMetadata("order_id", "6735").build();

    Topup topup = resource.update(params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/topups/tu_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTopupsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupUpdateParams params =
        com.stripe.param.TopupUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Topup topup = client.v1().topups().update("tu_xxxxxxxxxxxxx", params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/topups/tu_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTopupsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TopupUpdateParams params =
        com.stripe.param.TopupUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Topup topup = client.topups().update("tu_xxxxxxxxxxxxx", params);
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/topups/tu_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersGet() throws StripeException {
    TransferListParams params = TransferListParams.builder().setLimit(3L).build();

    TransferCollection transfers = Transfer.list(params);
    assertNotNull(transfers);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/transfers", params.toMap(), null);
  }

  @Test
  public void testTransfersGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferListParams params =
        com.stripe.param.TransferListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Transfer> stripeCollection =
        client.v1().transfers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/transfers", params.toMap(), null);
  }

  @Test
  public void testTransfersGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferListParams params =
        com.stripe.param.TransferListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.Transfer> stripeCollection =
        client.transfers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/transfers", params.toMap(), null);
  }

  @Test
  public void testTransfersGet2() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTransfersGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferRetrieveParams params =
        com.stripe.param.TransferRetrieveParams.builder().build();

    com.stripe.model.Transfer transfer =
        client.v1().transfers().retrieve("tr_xxxxxxxxxxxxx", params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferRetrieveParams params =
        com.stripe.param.TransferRetrieveParams.builder().build();

    com.stripe.model.Transfer transfer = client.transfers().retrieve("tr_xxxxxxxxxxxxx", params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersPost() throws StripeException {
    TransferCreateParams params =
        TransferCreateParams.builder()
            .setAmount(400L)
            .setCurrency("usd")
            .setDestination("acct_xxxxxxxxxxxxx")
            .setTransferGroup("ORDER_95")
            .build();

    Transfer transfer = Transfer.create(params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/transfers", params.toMap(), null);
  }

  @Test
  public void testTransfersPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferCreateParams params =
        com.stripe.param.TransferCreateParams.builder()
            .setAmount(400L)
            .setCurrency("usd")
            .setDestination("acct_xxxxxxxxxxxxx")
            .setTransferGroup("ORDER_95")
            .build();

    com.stripe.model.Transfer transfer = client.v1().transfers().create(params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/transfers", params.toMap(), null);
  }

  @Test
  public void testTransfersPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferCreateParams params =
        com.stripe.param.TransferCreateParams.builder()
            .setAmount(400L)
            .setCurrency("usd")
            .setDestination("acct_xxxxxxxxxxxxx")
            .setTransferGroup("ORDER_95")
            .build();

    com.stripe.model.Transfer transfer = client.transfers().create(params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/transfers", params.toMap(), null);
  }

  @Test
  public void testTransfersPost2() throws StripeException {
    Transfer resource = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferUpdateParams params =
        TransferUpdateParams.builder().putMetadata("order_id", "6735").build();

    Transfer transfer = resource.update(params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferUpdateParams params =
        com.stripe.param.TransferUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Transfer transfer = client.v1().transfers().update("tr_xxxxxxxxxxxxx", params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferUpdateParams params =
        com.stripe.param.TransferUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.Transfer transfer = client.transfers().update("tr_xxxxxxxxxxxxx", params);
    assertNotNull(transfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsGet() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferReversalCollectionListParams params =
        TransferReversalCollectionListParams.builder().setLimit(3L).build();

    TransferReversalCollection transferReversals = transfer.getReversals().list(params);
    assertNotNull(transferReversals);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalListParams params =
        com.stripe.param.TransferReversalListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TransferReversal> stripeCollection =
        client.v1().transfers().reversals().list("tr_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalListParams params =
        com.stripe.param.TransferReversalListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.TransferReversal> stripeCollection =
        client.transfers().reversals().list("tr_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsGet2() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferReversal transferReversal = transfer.getReversals().retrieve("trr_xxxxxxxxxxxxx");
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTransfersReversalsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalRetrieveParams params =
        com.stripe.param.TransferReversalRetrieveParams.builder().build();

    com.stripe.model.TransferReversal transferReversal =
        client
            .v1()
            .transfers()
            .reversals()
            .retrieve("tr_xxxxxxxxxxxxx", "trr_xxxxxxxxxxxxx", params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalRetrieveParams params =
        com.stripe.param.TransferReversalRetrieveParams.builder().build();

    com.stripe.model.TransferReversal transferReversal =
        client.transfers().reversals().retrieve("tr_xxxxxxxxxxxxx", "trr_xxxxxxxxxxxxx", params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsPost() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferReversalCollectionCreateParams params =
        TransferReversalCollectionCreateParams.builder().setAmount(100L).build();

    TransferReversal transferReversal = transfer.getReversals().create(params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalCreateParams params =
        com.stripe.param.TransferReversalCreateParams.builder().setAmount(100L).build();

    com.stripe.model.TransferReversal transferReversal =
        client.v1().transfers().reversals().create("tr_xxxxxxxxxxxxx", params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalCreateParams params =
        com.stripe.param.TransferReversalCreateParams.builder().setAmount(100L).build();

    com.stripe.model.TransferReversal transferReversal =
        client.transfers().reversals().create("tr_xxxxxxxxxxxxx", params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsPost2() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferReversal resource = transfer.getReversals().retrieve("trr_xxxxxxxxxxxxx");

    TransferReversalUpdateParams params =
        TransferReversalUpdateParams.builder().putMetadata("order_id", "6735").build();

    TransferReversal transferReversal = resource.update(params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalUpdateParams params =
        com.stripe.param.TransferReversalUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.TransferReversal transferReversal =
        client.v1().transfers().reversals().update("tr_xxxxxxxxxxxxx", "trr_xxxxxxxxxxxxx", params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTransfersReversalsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TransferReversalUpdateParams params =
        com.stripe.param.TransferReversalUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.TransferReversal transferReversal =
        client.transfers().reversals().update("tr_xxxxxxxxxxxxx", "trr_xxxxxxxxxxxxx", params);
    assertNotNull(transferReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsGet() throws StripeException {
    com.stripe.param.treasury.CreditReversalListParams params =
        com.stripe.param.treasury.CreditReversalListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.CreditReversalCollection creditReversals =
        com.stripe.model.treasury.CreditReversal.list(params);
    assertNotNull(creditReversals);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/credit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.CreditReversalListParams params =
        com.stripe.param.treasury.CreditReversalListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.CreditReversal> stripeCollection =
        client.v1().treasury().creditReversals().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/credit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.CreditReversalListParams params =
        com.stripe.param.treasury.CreditReversalListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.CreditReversal> stripeCollection =
        client.treasury().creditReversals().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/credit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsGet2() throws StripeException {
    com.stripe.model.treasury.CreditReversal creditReversal =
        com.stripe.model.treasury.CreditReversal.retrieve("credrev_xxxxxxxxxxxxx");
    assertNotNull(creditReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/credit_reversals/credrev_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryCreditReversalsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.CreditReversalRetrieveParams params =
        com.stripe.param.treasury.CreditReversalRetrieveParams.builder().build();

    com.stripe.model.treasury.CreditReversal creditReversal =
        client.v1().treasury().creditReversals().retrieve("credrev_xxxxxxxxxxxxx", params);
    assertNotNull(creditReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/credit_reversals/credrev_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.CreditReversalRetrieveParams params =
        com.stripe.param.treasury.CreditReversalRetrieveParams.builder().build();

    com.stripe.model.treasury.CreditReversal creditReversal =
        client.treasury().creditReversals().retrieve("credrev_xxxxxxxxxxxxx", params);
    assertNotNull(creditReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/credit_reversals/credrev_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsPost() throws StripeException {
    com.stripe.param.treasury.CreditReversalCreateParams params =
        com.stripe.param.treasury.CreditReversalCreateParams.builder()
            .setReceivedCredit("rc_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.treasury.CreditReversal creditReversal =
        com.stripe.model.treasury.CreditReversal.create(params);
    assertNotNull(creditReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/credit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.CreditReversalCreateParams params =
        com.stripe.param.treasury.CreditReversalCreateParams.builder()
            .setReceivedCredit("rc_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.treasury.CreditReversal creditReversal =
        client.v1().treasury().creditReversals().create(params);
    assertNotNull(creditReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/credit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryCreditReversalsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.CreditReversalCreateParams params =
        com.stripe.param.treasury.CreditReversalCreateParams.builder()
            .setReceivedCredit("rc_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.treasury.CreditReversal creditReversal =
        client.treasury().creditReversals().create(params);
    assertNotNull(creditReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/credit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsGet() throws StripeException {
    com.stripe.param.treasury.DebitReversalListParams params =
        com.stripe.param.treasury.DebitReversalListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.DebitReversalCollection debitReversals =
        com.stripe.model.treasury.DebitReversal.list(params);
    assertNotNull(debitReversals);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/debit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.DebitReversalListParams params =
        com.stripe.param.treasury.DebitReversalListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.DebitReversal> stripeCollection =
        client.v1().treasury().debitReversals().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/debit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.DebitReversalListParams params =
        com.stripe.param.treasury.DebitReversalListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.DebitReversal> stripeCollection =
        client.treasury().debitReversals().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/debit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsGet2() throws StripeException {
    com.stripe.model.treasury.DebitReversal debitReversal =
        com.stripe.model.treasury.DebitReversal.retrieve("debrev_xxxxxxxxxxxxx");
    assertNotNull(debitReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/debit_reversals/debrev_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryDebitReversalsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.DebitReversalRetrieveParams params =
        com.stripe.param.treasury.DebitReversalRetrieveParams.builder().build();

    com.stripe.model.treasury.DebitReversal debitReversal =
        client.v1().treasury().debitReversals().retrieve("debrev_xxxxxxxxxxxxx", params);
    assertNotNull(debitReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/debit_reversals/debrev_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.DebitReversalRetrieveParams params =
        com.stripe.param.treasury.DebitReversalRetrieveParams.builder().build();

    com.stripe.model.treasury.DebitReversal debitReversal =
        client.treasury().debitReversals().retrieve("debrev_xxxxxxxxxxxxx", params);
    assertNotNull(debitReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/debit_reversals/debrev_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsPost() throws StripeException {
    com.stripe.param.treasury.DebitReversalCreateParams params =
        com.stripe.param.treasury.DebitReversalCreateParams.builder()
            .setReceivedDebit("rd_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.treasury.DebitReversal debitReversal =
        com.stripe.model.treasury.DebitReversal.create(params);
    assertNotNull(debitReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/debit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.DebitReversalCreateParams params =
        com.stripe.param.treasury.DebitReversalCreateParams.builder()
            .setReceivedDebit("rd_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.treasury.DebitReversal debitReversal =
        client.v1().treasury().debitReversals().create(params);
    assertNotNull(debitReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/debit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryDebitReversalsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.DebitReversalCreateParams params =
        com.stripe.param.treasury.DebitReversalCreateParams.builder()
            .setReceivedDebit("rd_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.treasury.DebitReversal debitReversal =
        client.treasury().debitReversals().create(params);
    assertNotNull(debitReversal);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/debit_reversals",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsFeaturesGet() throws StripeException {
    com.stripe.model.treasury.FinancialAccount resource =
        com.stripe.model.treasury.FinancialAccount.retrieve("fa_xxxxxxxxxxxxx");

    com.stripe.param.treasury.FinancialAccountRetrieveFeaturesParams params =
        com.stripe.param.treasury.FinancialAccountRetrieveFeaturesParams.builder().build();

    com.stripe.model.treasury.FinancialAccountFeatures financialAccountFeatures =
        resource.retrieveFeatures(params);
    assertNotNull(financialAccountFeatures);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx/features",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsFeaturesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountFeaturesRetrieveParams params =
        com.stripe.param.treasury.FinancialAccountFeaturesRetrieveParams.builder().build();

    com.stripe.model.treasury.FinancialAccountFeatures financialAccountFeatures =
        client.v1().treasury().financialAccounts().features().retrieve("fa_xxxxxxxxxxxxx", params);
    assertNotNull(financialAccountFeatures);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx/features",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsFeaturesGetServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountFeaturesRetrieveParams params =
        com.stripe.param.treasury.FinancialAccountFeaturesRetrieveParams.builder().build();

    com.stripe.model.treasury.FinancialAccountFeatures financialAccountFeatures =
        client.treasury().financialAccounts().features().retrieve("fa_xxxxxxxxxxxxx", params);
    assertNotNull(financialAccountFeatures);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx/features",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsGet() throws StripeException {
    com.stripe.param.treasury.FinancialAccountListParams params =
        com.stripe.param.treasury.FinancialAccountListParams.builder().setLimit(3L).build();

    com.stripe.model.treasury.FinancialAccountCollection financialAccounts =
        com.stripe.model.treasury.FinancialAccount.list(params);
    assertNotNull(financialAccounts);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountListParams params =
        com.stripe.param.treasury.FinancialAccountListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.FinancialAccount> stripeCollection =
        client.v1().treasury().financialAccounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountListParams params =
        com.stripe.param.treasury.FinancialAccountListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.FinancialAccount> stripeCollection =
        client.treasury().financialAccounts().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsGet2() throws StripeException {
    com.stripe.model.treasury.FinancialAccount financialAccount =
        com.stripe.model.treasury.FinancialAccount.retrieve("fa_xxxxxxxxxxxxx");
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountRetrieveParams params =
        com.stripe.param.treasury.FinancialAccountRetrieveParams.builder().build();

    com.stripe.model.treasury.FinancialAccount financialAccount =
        client.v1().treasury().financialAccounts().retrieve("fa_xxxxxxxxxxxxx", params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountRetrieveParams params =
        com.stripe.param.treasury.FinancialAccountRetrieveParams.builder().build();

    com.stripe.model.treasury.FinancialAccount financialAccount =
        client.treasury().financialAccounts().retrieve("fa_xxxxxxxxxxxxx", params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsPost() throws StripeException {
    com.stripe.param.treasury.FinancialAccountCreateParams params =
        com.stripe.param.treasury.FinancialAccountCreateParams.builder()
            .addSupportedCurrency("usd")
            .setFeatures(
                com.stripe.param.treasury.FinancialAccountCreateParams.Features.builder().build())
            .build();

    com.stripe.model.treasury.FinancialAccount financialAccount =
        com.stripe.model.treasury.FinancialAccount.create(params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/financial_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountCreateParams params =
        com.stripe.param.treasury.FinancialAccountCreateParams.builder()
            .addSupportedCurrency("usd")
            .setFeatures(
                com.stripe.param.treasury.FinancialAccountCreateParams.Features.builder().build())
            .build();

    com.stripe.model.treasury.FinancialAccount financialAccount =
        client.v1().treasury().financialAccounts().create(params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/financial_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountCreateParams params =
        com.stripe.param.treasury.FinancialAccountCreateParams.builder()
            .addSupportedCurrency("usd")
            .setFeatures(
                com.stripe.param.treasury.FinancialAccountCreateParams.Features.builder().build())
            .build();

    com.stripe.model.treasury.FinancialAccount financialAccount =
        client.treasury().financialAccounts().create(params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/financial_accounts",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsPost2() throws StripeException {
    com.stripe.model.treasury.FinancialAccount resource =
        com.stripe.model.treasury.FinancialAccount.retrieve("fa_xxxxxxxxxxxxx");

    com.stripe.param.treasury.FinancialAccountUpdateParams params =
        com.stripe.param.treasury.FinancialAccountUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.treasury.FinancialAccount financialAccount = resource.update(params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountUpdateParams params =
        com.stripe.param.treasury.FinancialAccountUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.treasury.FinancialAccount financialAccount =
        client.v1().treasury().financialAccounts().update("fa_xxxxxxxxxxxxx", params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryFinancialAccountsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountUpdateParams params =
        com.stripe.param.treasury.FinancialAccountUpdateParams.builder()
            .putMetadata("order_id", "6735")
            .build();

    com.stripe.model.treasury.FinancialAccount financialAccount =
        client.treasury().financialAccounts().update("fa_xxxxxxxxxxxxx", params);
    assertNotNull(financialAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersCancelPost() throws StripeException {
    com.stripe.model.treasury.InboundTransfer resource =
        com.stripe.model.treasury.InboundTransfer.retrieve("ibt_xxxxxxxxxxxxx");

    com.stripe.param.treasury.InboundTransferCancelParams params =
        com.stripe.param.treasury.InboundTransferCancelParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer = resource.cancel(params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferCancelParams params =
        com.stripe.param.treasury.InboundTransferCancelParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.v1().treasury().inboundTransfers().cancel("ibt_xxxxxxxxxxxxx", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferCancelParams params =
        com.stripe.param.treasury.InboundTransferCancelParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.treasury().inboundTransfers().cancel("ibt_xxxxxxxxxxxxx", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersGet() throws StripeException {
    com.stripe.param.treasury.InboundTransferListParams params =
        com.stripe.param.treasury.InboundTransferListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.InboundTransferCollection inboundTransfers =
        com.stripe.model.treasury.InboundTransfer.list(params);
    assertNotNull(inboundTransfers);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/inbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferListParams params =
        com.stripe.param.treasury.InboundTransferListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.InboundTransfer> stripeCollection =
        client.v1().treasury().inboundTransfers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/inbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferListParams params =
        com.stripe.param.treasury.InboundTransferListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.InboundTransfer> stripeCollection =
        client.treasury().inboundTransfers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/inbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersGet2() throws StripeException {
    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        com.stripe.model.treasury.InboundTransfer.retrieve("ibt_xxxxxxxxxxxxx");
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryInboundTransfersGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferRetrieveParams params =
        com.stripe.param.treasury.InboundTransferRetrieveParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.v1().treasury().inboundTransfers().retrieve("ibt_xxxxxxxxxxxxx", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferRetrieveParams params =
        com.stripe.param.treasury.InboundTransferRetrieveParams.builder().build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.treasury().inboundTransfers().retrieve("ibt_xxxxxxxxxxxxx", params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersPost() throws StripeException {
    com.stripe.param.treasury.InboundTransferCreateParams params =
        com.stripe.param.treasury.InboundTransferCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setAmount(10000L)
            .setCurrency("usd")
            .setOriginPaymentMethod("pm_xxxxxxxxxxxxx")
            .setDescription("InboundTransfer from my bank account")
            .build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        com.stripe.model.treasury.InboundTransfer.create(params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/inbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferCreateParams params =
        com.stripe.param.treasury.InboundTransferCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setAmount(10000L)
            .setCurrency("usd")
            .setOriginPaymentMethod("pm_xxxxxxxxxxxxx")
            .setDescription("InboundTransfer from my bank account")
            .build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.v1().treasury().inboundTransfers().create(params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/inbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryInboundTransfersPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.InboundTransferCreateParams params =
        com.stripe.param.treasury.InboundTransferCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setAmount(10000L)
            .setCurrency("usd")
            .setOriginPaymentMethod("pm_xxxxxxxxxxxxx")
            .setDescription("InboundTransfer from my bank account")
            .build();

    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        client.treasury().inboundTransfers().create(params);
    assertNotNull(inboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/inbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsCancelPost() throws StripeException {
    com.stripe.model.treasury.OutboundPayment resource =
        com.stripe.model.treasury.OutboundPayment.retrieve("bot_xxxxxxxxxxxxx");

    com.stripe.param.treasury.OutboundPaymentCancelParams params =
        com.stripe.param.treasury.OutboundPaymentCancelParams.builder().build();

    com.stripe.model.treasury.OutboundPayment outboundPayment = resource.cancel(params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentCancelParams params =
        com.stripe.param.treasury.OutboundPaymentCancelParams.builder().build();

    com.stripe.model.treasury.OutboundPayment outboundPayment =
        client.v1().treasury().outboundPayments().cancel("bot_xxxxxxxxxxxxx", params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsCancelPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentCancelParams params =
        com.stripe.param.treasury.OutboundPaymentCancelParams.builder().build();

    com.stripe.model.treasury.OutboundPayment outboundPayment =
        client.treasury().outboundPayments().cancel("bot_xxxxxxxxxxxxx", params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsGet() throws StripeException {
    com.stripe.param.treasury.OutboundPaymentListParams params =
        com.stripe.param.treasury.OutboundPaymentListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.OutboundPaymentCollection outboundPayments =
        com.stripe.model.treasury.OutboundPayment.list(params);
    assertNotNull(outboundPayments);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentListParams params =
        com.stripe.param.treasury.OutboundPaymentListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.OutboundPayment> stripeCollection =
        client.v1().treasury().outboundPayments().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentListParams params =
        com.stripe.param.treasury.OutboundPaymentListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.OutboundPayment> stripeCollection =
        client.treasury().outboundPayments().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsGet2() throws StripeException {
    com.stripe.model.treasury.OutboundPayment outboundPayment =
        com.stripe.model.treasury.OutboundPayment.retrieve("bot_xxxxxxxxxxxxx");
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentRetrieveParams params =
        com.stripe.param.treasury.OutboundPaymentRetrieveParams.builder().build();

    com.stripe.model.treasury.OutboundPayment outboundPayment =
        client.v1().treasury().outboundPayments().retrieve("bot_xxxxxxxxxxxxx", params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentRetrieveParams params =
        com.stripe.param.treasury.OutboundPaymentRetrieveParams.builder().build();

    com.stripe.model.treasury.OutboundPayment outboundPayment =
        client.treasury().outboundPayments().retrieve("bot_xxxxxxxxxxxxx", params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsPost() throws StripeException {
    com.stripe.param.treasury.OutboundPaymentCreateParams params =
        com.stripe.param.treasury.OutboundPaymentCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setAmount(10000L)
            .setCurrency("usd")
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setDestinationPaymentMethod("pm_xxxxxxxxxxxxx")
            .setDescription("OutboundPayment to a 3rd party")
            .build();

    com.stripe.model.treasury.OutboundPayment outboundPayment =
        com.stripe.model.treasury.OutboundPayment.create(params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentCreateParams params =
        com.stripe.param.treasury.OutboundPaymentCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setAmount(10000L)
            .setCurrency("usd")
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setDestinationPaymentMethod("pm_xxxxxxxxxxxxx")
            .setDescription("OutboundPayment to a 3rd party")
            .build();

    com.stripe.model.treasury.OutboundPayment outboundPayment =
        client.v1().treasury().outboundPayments().create(params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundPaymentsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundPaymentCreateParams params =
        com.stripe.param.treasury.OutboundPaymentCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setAmount(10000L)
            .setCurrency("usd")
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setDestinationPaymentMethod("pm_xxxxxxxxxxxxx")
            .setDescription("OutboundPayment to a 3rd party")
            .build();

    com.stripe.model.treasury.OutboundPayment outboundPayment =
        client.treasury().outboundPayments().create(params);
    assertNotNull(outboundPayment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_payments",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersCancelPost() throws StripeException {
    com.stripe.model.treasury.OutboundTransfer resource =
        com.stripe.model.treasury.OutboundTransfer.retrieve("obt_xxxxxxxxxxxxx");

    com.stripe.param.treasury.OutboundTransferCancelParams params =
        com.stripe.param.treasury.OutboundTransferCancelParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer = resource.cancel(params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersCancelPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferCancelParams params =
        com.stripe.param.treasury.OutboundTransferCancelParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.v1().treasury().outboundTransfers().cancel("obt_xxxxxxxxxxxxx", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersCancelPostServicesNonNamespaced()
      throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferCancelParams params =
        com.stripe.param.treasury.OutboundTransferCancelParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.treasury().outboundTransfers().cancel("obt_xxxxxxxxxxxxx", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx/cancel",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersGet() throws StripeException {
    com.stripe.param.treasury.OutboundTransferListParams params =
        com.stripe.param.treasury.OutboundTransferListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.OutboundTransferCollection outboundTransfers =
        com.stripe.model.treasury.OutboundTransfer.list(params);
    assertNotNull(outboundTransfers);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferListParams params =
        com.stripe.param.treasury.OutboundTransferListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.OutboundTransfer> stripeCollection =
        client.v1().treasury().outboundTransfers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferListParams params =
        com.stripe.param.treasury.OutboundTransferListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.OutboundTransfer> stripeCollection =
        client.treasury().outboundTransfers().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersGet2() throws StripeException {
    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        com.stripe.model.treasury.OutboundTransfer.retrieve("obt_xxxxxxxxxxxxx");
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferRetrieveParams params =
        com.stripe.param.treasury.OutboundTransferRetrieveParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.v1().treasury().outboundTransfers().retrieve("obt_xxxxxxxxxxxxx", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferRetrieveParams params =
        com.stripe.param.treasury.OutboundTransferRetrieveParams.builder().build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.treasury().outboundTransfers().retrieve("obt_xxxxxxxxxxxxx", params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersPost() throws StripeException {
    com.stripe.param.treasury.OutboundTransferCreateParams params =
        com.stripe.param.treasury.OutboundTransferCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setDestinationPaymentMethod("pm_xxxxxxxxxxxxx")
            .setAmount(500L)
            .setCurrency("usd")
            .setDescription("OutboundTransfer to my external bank account")
            .build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        com.stripe.model.treasury.OutboundTransfer.create(params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferCreateParams params =
        com.stripe.param.treasury.OutboundTransferCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setDestinationPaymentMethod("pm_xxxxxxxxxxxxx")
            .setAmount(500L)
            .setCurrency("usd")
            .setDescription("OutboundTransfer to my external bank account")
            .build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.v1().treasury().outboundTransfers().create(params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryOutboundTransfersPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.OutboundTransferCreateParams params =
        com.stripe.param.treasury.OutboundTransferCreateParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setDestinationPaymentMethod("pm_xxxxxxxxxxxxx")
            .setAmount(500L)
            .setCurrency("usd")
            .setDescription("OutboundTransfer to my external bank account")
            .build();

    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        client.treasury().outboundTransfers().create(params);
    assertNotNull(outboundTransfer);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_transfers",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedCreditsGet() throws StripeException {
    com.stripe.param.treasury.ReceivedCreditListParams params =
        com.stripe.param.treasury.ReceivedCreditListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.ReceivedCreditCollection receivedCredits =
        com.stripe.model.treasury.ReceivedCredit.list(params);
    assertNotNull(receivedCredits);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_credits",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedCreditsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedCreditListParams params =
        com.stripe.param.treasury.ReceivedCreditListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.ReceivedCredit> stripeCollection =
        client.v1().treasury().receivedCredits().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_credits",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedCreditsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedCreditListParams params =
        com.stripe.param.treasury.ReceivedCreditListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.ReceivedCredit> stripeCollection =
        client.treasury().receivedCredits().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_credits",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedCreditsGet2() throws StripeException {
    com.stripe.model.treasury.ReceivedCredit receivedCredit =
        com.stripe.model.treasury.ReceivedCredit.retrieve("rc_xxxxxxxxxxxxx");
    assertNotNull(receivedCredit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_credits/rc_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryReceivedCreditsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedCreditRetrieveParams params =
        com.stripe.param.treasury.ReceivedCreditRetrieveParams.builder().build();

    com.stripe.model.treasury.ReceivedCredit receivedCredit =
        client.v1().treasury().receivedCredits().retrieve("rc_xxxxxxxxxxxxx", params);
    assertNotNull(receivedCredit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_credits/rc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedCreditsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedCreditRetrieveParams params =
        com.stripe.param.treasury.ReceivedCreditRetrieveParams.builder().build();

    com.stripe.model.treasury.ReceivedCredit receivedCredit =
        client.treasury().receivedCredits().retrieve("rc_xxxxxxxxxxxxx", params);
    assertNotNull(receivedCredit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_credits/rc_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedDebitsGet() throws StripeException {
    com.stripe.param.treasury.ReceivedDebitListParams params =
        com.stripe.param.treasury.ReceivedDebitListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.ReceivedDebitCollection receivedDebits =
        com.stripe.model.treasury.ReceivedDebit.list(params);
    assertNotNull(receivedDebits);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_debits",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedDebitsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedDebitListParams params =
        com.stripe.param.treasury.ReceivedDebitListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.ReceivedDebit> stripeCollection =
        client.v1().treasury().receivedDebits().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_debits",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedDebitsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedDebitListParams params =
        com.stripe.param.treasury.ReceivedDebitListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.ReceivedDebit> stripeCollection =
        client.treasury().receivedDebits().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_debits",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedDebitsGet2() throws StripeException {
    com.stripe.model.treasury.ReceivedDebit receivedDebit =
        com.stripe.model.treasury.ReceivedDebit.retrieve("rd_xxxxxxxxxxxxx");
    assertNotNull(receivedDebit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_debits/rd_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryReceivedDebitsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedDebitRetrieveParams params =
        com.stripe.param.treasury.ReceivedDebitRetrieveParams.builder().build();

    com.stripe.model.treasury.ReceivedDebit receivedDebit =
        client.v1().treasury().receivedDebits().retrieve("rd_xxxxxxxxxxxxx", params);
    assertNotNull(receivedDebit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_debits/rd_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryReceivedDebitsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.ReceivedDebitRetrieveParams params =
        com.stripe.param.treasury.ReceivedDebitRetrieveParams.builder().build();

    com.stripe.model.treasury.ReceivedDebit receivedDebit =
        client.treasury().receivedDebits().retrieve("rd_xxxxxxxxxxxxx", params);
    assertNotNull(receivedDebit);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/received_debits/rd_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionEntriesGet() throws StripeException {
    com.stripe.param.treasury.TransactionEntryListParams params =
        com.stripe.param.treasury.TransactionEntryListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.TransactionEntryCollection transactionEntries =
        com.stripe.model.treasury.TransactionEntry.list(params);
    assertNotNull(transactionEntries);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transaction_entries",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionEntriesGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionEntryListParams params =
        com.stripe.param.treasury.TransactionEntryListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.TransactionEntry> stripeCollection =
        client.v1().treasury().transactionEntries().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transaction_entries",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionEntriesGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionEntryListParams params =
        com.stripe.param.treasury.TransactionEntryListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.TransactionEntry> stripeCollection =
        client.treasury().transactionEntries().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transaction_entries",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionEntriesGet2() throws StripeException {
    com.stripe.model.treasury.TransactionEntry transactionEntry =
        com.stripe.model.treasury.TransactionEntry.retrieve("trxne_xxxxxxxxxxxxx");
    assertNotNull(transactionEntry);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transaction_entries/trxne_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryTransactionEntriesGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionEntryRetrieveParams params =
        com.stripe.param.treasury.TransactionEntryRetrieveParams.builder().build();

    com.stripe.model.treasury.TransactionEntry transactionEntry =
        client.v1().treasury().transactionEntries().retrieve("trxne_xxxxxxxxxxxxx", params);
    assertNotNull(transactionEntry);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transaction_entries/trxne_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionEntriesGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionEntryRetrieveParams params =
        com.stripe.param.treasury.TransactionEntryRetrieveParams.builder().build();

    com.stripe.model.treasury.TransactionEntry transactionEntry =
        client.treasury().transactionEntries().retrieve("trxne_xxxxxxxxxxxxx", params);
    assertNotNull(transactionEntry);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transaction_entries/trxne_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionsGet() throws StripeException {
    com.stripe.param.treasury.TransactionListParams params =
        com.stripe.param.treasury.TransactionListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.treasury.TransactionCollection transactions =
        com.stripe.model.treasury.Transaction.list(params);
    assertNotNull(transactions);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionListParams params =
        com.stripe.param.treasury.TransactionListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.Transaction> stripeCollection =
        client.v1().treasury().transactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionListParams params =
        com.stripe.param.treasury.TransactionListParams.builder()
            .setFinancialAccount("fa_xxxxxxxxxxxxx")
            .setLimit(3L)
            .build();

    com.stripe.model.StripeCollection<com.stripe.model.treasury.Transaction> stripeCollection =
        client.treasury().transactions().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transactions",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionsGet2() throws StripeException {
    com.stripe.model.treasury.Transaction transaction =
        com.stripe.model.treasury.Transaction.retrieve("trxn_xxxxxxxxxxxxx");
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transactions/trxn_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testTreasuryTransactionsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionRetrieveParams params =
        com.stripe.param.treasury.TransactionRetrieveParams.builder().build();

    com.stripe.model.treasury.Transaction transaction =
        client.v1().treasury().transactions().retrieve("trxn_xxxxxxxxxxxxx", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transactions/trxn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testTreasuryTransactionsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.TransactionRetrieveParams params =
        com.stripe.param.treasury.TransactionRetrieveParams.builder().build();

    com.stripe.model.treasury.Transaction transaction =
        client.treasury().transactions().retrieve("trxn_xxxxxxxxxxxxx", params);
    assertNotNull(transaction);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/transactions/trxn_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsDelete() throws StripeException {
    WebhookEndpoint resource = WebhookEndpoint.retrieve("we_xxxxxxxxxxxxx");

    WebhookEndpoint webhookEndpoint = resource.delete();
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testWebhookEndpointsDeleteServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.WebhookEndpoint webhookEndpoint =
        client.v1().webhookEndpoints().delete("we_xxxxxxxxxxxxx");
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testWebhookEndpointsDeleteServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.WebhookEndpoint webhookEndpoint =
        client.webhookEndpoints().delete("we_xxxxxxxxxxxxx");
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testWebhookEndpointsGet() throws StripeException {
    WebhookEndpointListParams params = WebhookEndpointListParams.builder().setLimit(3L).build();

    WebhookEndpointCollection webhookEndpoints = WebhookEndpoint.list(params);
    assertNotNull(webhookEndpoints);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/webhook_endpoints",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsGetServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointListParams params =
        com.stripe.param.WebhookEndpointListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.WebhookEndpoint> stripeCollection =
        client.v1().webhookEndpoints().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/webhook_endpoints",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsGetServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointListParams params =
        com.stripe.param.WebhookEndpointListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.WebhookEndpoint> stripeCollection =
        client.webhookEndpoints().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/webhook_endpoints",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsGet2() throws StripeException {
    WebhookEndpoint webhookEndpoint = WebhookEndpoint.retrieve("we_xxxxxxxxxxxxx");
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        null,
        null);
  }

  @Test
  public void testWebhookEndpointsGet2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointRetrieveParams params =
        com.stripe.param.WebhookEndpointRetrieveParams.builder().build();

    com.stripe.model.WebhookEndpoint webhookEndpoint =
        client.v1().webhookEndpoints().retrieve("we_xxxxxxxxxxxxx", params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsGet2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointRetrieveParams params =
        com.stripe.param.WebhookEndpointRetrieveParams.builder().build();

    com.stripe.model.WebhookEndpoint webhookEndpoint =
        client.webhookEndpoints().retrieve("we_xxxxxxxxxxxxx", params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsPost() throws StripeException {
    WebhookEndpointCreateParams params =
        WebhookEndpointCreateParams.builder()
            .setUrl("https://example.com/my/webhook/endpoint")
            .addEnabledEvent(WebhookEndpointCreateParams.EnabledEvent.CHARGE__FAILED)
            .addEnabledEvent(WebhookEndpointCreateParams.EnabledEvent.CHARGE__SUCCEEDED)
            .build();

    WebhookEndpoint webhookEndpoint = WebhookEndpoint.create(params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/webhook_endpoints",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsPostServices() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointCreateParams params =
        com.stripe.param.WebhookEndpointCreateParams.builder()
            .setUrl("https://example.com/my/webhook/endpoint")
            .addEnabledEvent(
                com.stripe.param.WebhookEndpointCreateParams.EnabledEvent.CHARGE__FAILED)
            .addEnabledEvent(
                com.stripe.param.WebhookEndpointCreateParams.EnabledEvent.CHARGE__SUCCEEDED)
            .build();

    com.stripe.model.WebhookEndpoint webhookEndpoint =
        client.v1().webhookEndpoints().create(params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/webhook_endpoints",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsPostServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointCreateParams params =
        com.stripe.param.WebhookEndpointCreateParams.builder()
            .setUrl("https://example.com/my/webhook/endpoint")
            .addEnabledEvent(
                com.stripe.param.WebhookEndpointCreateParams.EnabledEvent.CHARGE__FAILED)
            .addEnabledEvent(
                com.stripe.param.WebhookEndpointCreateParams.EnabledEvent.CHARGE__SUCCEEDED)
            .build();

    com.stripe.model.WebhookEndpoint webhookEndpoint = client.webhookEndpoints().create(params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/webhook_endpoints",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsPost2() throws StripeException {
    WebhookEndpoint resource = WebhookEndpoint.retrieve("we_xxxxxxxxxxxxx");

    WebhookEndpointUpdateParams params =
        WebhookEndpointUpdateParams.builder().setUrl("https://example.com/new_endpoint").build();

    WebhookEndpoint webhookEndpoint = resource.update(params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsPost2Services() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointUpdateParams params =
        com.stripe.param.WebhookEndpointUpdateParams.builder()
            .setUrl("https://example.com/new_endpoint")
            .build();

    com.stripe.model.WebhookEndpoint webhookEndpoint =
        client.v1().webhookEndpoints().update("we_xxxxxxxxxxxxx", params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testWebhookEndpointsPost2ServicesNonNamespaced() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.WebhookEndpointUpdateParams params =
        com.stripe.param.WebhookEndpointUpdateParams.builder()
            .setUrl("https://example.com/new_endpoint")
            .build();

    com.stripe.model.WebhookEndpoint webhookEndpoint =
        client.webhookEndpoints().update("we_xxxxxxxxxxxxx", params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/webhook_endpoints/we_xxxxxxxxxxxxx",
        params.toMap(),
        null);
  }

  @Test
  public void testV2BillingMeterEventPostServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_events",
        null,
        null,
        com.stripe.model.v2.billing.MeterEvent.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"event_name\":\"event_name\",\"identifier\":\"identifier\",\"object\":\"v2.billing.meter_event\",\"payload\":{\"key\":\"payload\"},\"timestamp\":\"1970-01-01T15:18:46.294Z\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.billing.MeterEventCreateParams params =
        com.stripe.param.v2.billing.MeterEventCreateParams.builder()
            .setEventName("event_name")
            .putPayload("key", "payload")
            .build();

    com.stripe.model.v2.billing.MeterEvent meterEvent =
        client.v2().billing().meterEvents().create(params);
    assertNotNull(meterEvent);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_events",
        params.toMap(),
        null);
  }

  @Test
  public void testV2BillingMeterEventAdjustmentPostServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_adjustments",
        null,
        null,
        com.stripe.model.v2.billing.MeterEventAdjustment.class,
        "{\"cancel\":{\"identifier\":\"identifier\"},\"created\":\"1970-01-12T21:42:34.472Z\",\"event_name\":\"event_name\",\"id\":\"obj_123\",\"object\":\"v2.billing.meter_event_adjustment\",\"status\":\"complete\",\"type\":\"cancel\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.billing.MeterEventAdjustmentCreateParams params =
        com.stripe.param.v2.billing.MeterEventAdjustmentCreateParams.builder()
            .setCancel(
                com.stripe.param.v2.billing.MeterEventAdjustmentCreateParams.Cancel.builder()
                    .setIdentifier("identifier")
                    .build())
            .setEventName("event_name")
            .setType(com.stripe.param.v2.billing.MeterEventAdjustmentCreateParams.Type.CANCEL)
            .build();

    com.stripe.model.v2.billing.MeterEventAdjustment meterEventAdjustment =
        client.v2().billing().meterEventAdjustments().create(params);
    assertNotNull(meterEventAdjustment);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_adjustments",
        params.toMap(),
        null);
  }

  @Test
  public void testV2BillingMeterEventSessionPostServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_session",
        null,
        null,
        com.stripe.model.v2.billing.MeterEventSession.class,
        "{\"authentication_token\":\"authentication_token\",\"created\":\"1970-01-12T21:42:34.472Z\",\"expires_at\":\"1970-01-10T15:36:51.170Z\",\"id\":\"obj_123\",\"object\":\"v2.billing.meter_event_session\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.v2.billing.MeterEventSession meterEventSession =
        client.v2().billing().meterEventSession().create();
    assertNotNull(meterEventSession);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_session",
        null,
        null);
  }

  @Test
  public void testV2BillingMeterEventStreamPostServices() throws StripeException {
    stubRequest(
        BaseAddress.METER_EVENTS,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_stream",
        null,
        null,
        com.stripe.v2.EmptyStripeObject.class,
        "{}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.billing.MeterEventStreamCreateParams params =
        com.stripe.param.v2.billing.MeterEventStreamCreateParams.builder()
            .addEvent(
                com.stripe.param.v2.billing.MeterEventStreamCreateParams.Event.builder()
                    .setEventName("event_name")
                    .setIdentifier("identifier")
                    .putPayload("key", "payload")
                    .setTimestamp(Instant.parse("1970-01-01T15:18:46.294Z"))
                    .build())
            .build();

    client.v2().billing().meterEventStream().create(params);
    verifyRequest(
        BaseAddress.METER_EVENTS,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_stream",
        params.toMap(),
        null);
  }

  @Test
  public void testV2CoreEventGetServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/core/events",
        null,
        null,
        new TypeToken<
            com.stripe.model.v2.StripeCollection<com.stripe.model.v2.core.Event>>() {}.getType(),
        "{\"data\":[{\"created\":\"1970-01-12T21:42:34.472Z\",\"id\":\"obj_123\",\"livemode\":true,\"object\":\"v2.core.event\",\"type\":\"type\"}],\"next_page_url\":null,\"previous_page_url\":null}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.core.EventListParams params =
        com.stripe.param.v2.core.EventListParams.builder().build();

    com.stripe.model.v2.StripeCollection<com.stripe.model.v2.core.Event> stripeCollection =
        client.v2().core().events().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/core/events", params.toMap(), null);
  }

  @Test
  public void testV2CoreEventGet2Services() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/core/events/id_123",
        null,
        null,
        com.stripe.model.v2.core.Event.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"id\":\"obj_123\",\"livemode\":true,\"object\":\"v2.core.event\",\"type\":\"type\"}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.v2.core.Event event = client.v2().core().events().retrieve("id_123");
    assertNotNull(event);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v2/core/events/id_123", null, null);
  }

  @Test
  public void testV2CoreEventDestinationGetServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/core/event_destinations",
        null,
        null,
        new TypeToken<
            com.stripe.model.v2.StripeCollection<
                com.stripe.model.v2.core.EventDestination>>() {}.getType(),
        "{\"data\":[{\"created\":\"1970-01-12T21:42:34.472Z\",\"description\":\"description\",\"enabled_events\":[\"enabled_events\"],\"event_payload\":\"thin\",\"id\":\"obj_123\",\"name\":\"name\",\"object\":\"v2.core.event_destination\",\"status\":\"disabled\",\"type\":\"amazon_eventbridge\",\"updated\":\"1970-01-03T17:07:10.277Z\",\"livemode\":true}],\"next_page_url\":null,\"previous_page_url\":null}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.core.EventDestinationListParams params =
        com.stripe.param.v2.core.EventDestinationListParams.builder().build();

    com.stripe.model.v2.StripeCollection<com.stripe.model.v2.core.EventDestination>
        stripeCollection = client.v2().core().eventDestinations().list(params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/core/event_destinations",
        params.toMap(),
        null);
  }

  @Test
  public void testV2CoreEventDestinationPostServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations",
        null,
        null,
        com.stripe.model.v2.core.EventDestination.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"description\":\"description\",\"enabled_events\":[\"enabled_events\"],\"event_payload\":\"thin\",\"id\":\"obj_123\",\"name\":\"name\",\"object\":\"v2.core.event_destination\",\"status\":\"disabled\",\"type\":\"amazon_eventbridge\",\"updated\":\"1970-01-03T17:07:10.277Z\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.core.EventDestinationCreateParams params =
        com.stripe.param.v2.core.EventDestinationCreateParams.builder()
            .addEnabledEvent("enabled_events")
            .setEventPayload(
                com.stripe.param.v2.core.EventDestinationCreateParams.EventPayload.THIN)
            .setName("name")
            .setType(com.stripe.param.v2.core.EventDestinationCreateParams.Type.AMAZON_EVENTBRIDGE)
            .build();

    com.stripe.model.v2.core.EventDestination eventDestination =
        client.v2().core().eventDestinations().create(params);
    assertNotNull(eventDestination);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations",
        params.toMap(),
        null);
  }

  @Test
  public void testV2CoreEventDestinationDeleteServices() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v2/core/event_destinations/id_123",
        null,
        null,
        com.stripe.model.v2.DeletedObject.class,
        "{\"id\":\"abc_123\",\"object\":\"some.object.tag\"}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.v2.DeletedObject deletedObject =
        client.v2().core().eventDestinations().delete("id_123");
    assertNotNull(deletedObject);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.DELETE,
        "/v2/core/event_destinations/id_123",
        null,
        null);
  }

  @Test
  public void testV2CoreEventDestinationGet2Services() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/core/event_destinations/id_123",
        null,
        null,
        com.stripe.model.v2.core.EventDestination.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"description\":\"description\",\"enabled_events\":[\"enabled_events\"],\"event_payload\":\"thin\",\"id\":\"obj_123\",\"name\":\"name\",\"object\":\"v2.core.event_destination\",\"status\":\"disabled\",\"type\":\"amazon_eventbridge\",\"updated\":\"1970-01-03T17:07:10.277Z\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.core.EventDestinationRetrieveParams params =
        com.stripe.param.v2.core.EventDestinationRetrieveParams.builder().build();

    com.stripe.model.v2.core.EventDestination eventDestination =
        client.v2().core().eventDestinations().retrieve("id_123", params);
    assertNotNull(eventDestination);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v2/core/event_destinations/id_123",
        params.toMap(),
        null);
  }

  @Test
  public void testV2CoreEventDestinationPost2Services() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123",
        null,
        null,
        com.stripe.model.v2.core.EventDestination.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"description\":\"description\",\"enabled_events\":[\"enabled_events\"],\"event_payload\":\"thin\",\"id\":\"obj_123\",\"name\":\"name\",\"object\":\"v2.core.event_destination\",\"status\":\"disabled\",\"type\":\"amazon_eventbridge\",\"updated\":\"1970-01-03T17:07:10.277Z\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.core.EventDestinationUpdateParams params =
        com.stripe.param.v2.core.EventDestinationUpdateParams.builder().build();

    com.stripe.model.v2.core.EventDestination eventDestination =
        client.v2().core().eventDestinations().update("id_123", params);
    assertNotNull(eventDestination);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123",
        params.toMap(),
        null);
  }

  @Test
  public void testV2CoreEventDestinationPost3Services() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123/disable",
        null,
        null,
        com.stripe.model.v2.core.EventDestination.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"description\":\"description\",\"enabled_events\":[\"enabled_events\"],\"event_payload\":\"thin\",\"id\":\"obj_123\",\"name\":\"name\",\"object\":\"v2.core.event_destination\",\"status\":\"disabled\",\"type\":\"amazon_eventbridge\",\"updated\":\"1970-01-03T17:07:10.277Z\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.v2.core.EventDestination eventDestination =
        client.v2().core().eventDestinations().disable("id_123");
    assertNotNull(eventDestination);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123/disable",
        null,
        null);
  }

  @Test
  public void testV2CoreEventDestinationPost4Services() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123/enable",
        null,
        null,
        com.stripe.model.v2.core.EventDestination.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"description\":\"description\",\"enabled_events\":[\"enabled_events\"],\"event_payload\":\"thin\",\"id\":\"obj_123\",\"name\":\"name\",\"object\":\"v2.core.event_destination\",\"status\":\"disabled\",\"type\":\"amazon_eventbridge\",\"updated\":\"1970-01-03T17:07:10.277Z\",\"livemode\":true}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.v2.core.EventDestination eventDestination =
        client.v2().core().eventDestinations().enable("id_123");
    assertNotNull(eventDestination);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123/enable",
        null,
        null);
  }

  @Test
  public void testV2CoreEventDestinationPost5Services() throws StripeException {
    stubRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123/ping",
        null,
        null,
        com.stripe.model.v2.core.Event.class,
        "{\"created\":\"1970-01-12T21:42:34.472Z\",\"id\":\"obj_123\",\"livemode\":true,\"object\":\"v2.core.event\",\"type\":\"type\"}");
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.v2.core.Event event = client.v2().core().eventDestinations().ping("id_123");
    assertNotNull(event);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v2/core/event_destinations/id_123/ping",
        null,
        null);
  }

  @Test
  public void testTemporarySessionExpiredErrorServices() throws StripeException {
    stubRequestReturnError(
        BaseAddress.METER_EVENTS,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_stream",
        null,
        null,
        "{\"error\":{\"type\":\"temporary_session_expired\",\"code\":\"billing_meter_event_session_expired\"}}",
        400);
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.v2.billing.MeterEventStreamCreateParams params =
        com.stripe.param.v2.billing.MeterEventStreamCreateParams.builder()
            .addEvent(
                com.stripe.param.v2.billing.MeterEventStreamCreateParams.Event.builder()
                    .setEventName("event_name")
                    .putPayload("key", "payload")
                    .build())
            .build();

    try {
      client.v2().billing().meterEventStream().create(params);
    } catch (TemporarySessionExpiredException e) {

    }
    ;
    verifyRequest(
        BaseAddress.METER_EVENTS,
        ApiResource.RequestMethod.POST,
        "/v2/billing/meter_event_stream",
        params.toMap(),
        null);
  }
}
