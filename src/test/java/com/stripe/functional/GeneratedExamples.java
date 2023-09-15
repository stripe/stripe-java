// File generated from our OpenAPI spec
package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import com.stripe.net.*;
import com.stripe.net.ApiResource;
import com.stripe.param.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class GeneratedExamples extends BaseStripeTest {
  @Test
  public void testExternalAccountServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ExternalAccountListParams params =
        com.stripe.param.ExternalAccountListParams.builder().setLimit(3L).build();

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
  public void testSecretList() throws StripeException {
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
  public void testSecretServiceList() throws StripeException {
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
  public void testSecretCreate() throws StripeException {
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
  public void testSecretServiceCreate() throws StripeException {
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
  public void testSecretDeleteWhere() throws StripeException {
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
  public void testSecretServiceDeleteWhere() throws StripeException {
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
  public void testSecretFind() throws StripeException {
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
  public void testSecretServiceFind() throws StripeException {
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
  public void testSessionCreate() throws StripeException {
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
  public void testSessionServiceCreate() throws StripeException {
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
  public void testSessionExpire() throws StripeException {
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
  public void testSessionServiceExpire() throws StripeException {
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
  public void testSessionLineItemServiceList() throws StripeException {
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
  public void testCashBalanceServiceRetrieve() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CashBalanceRetrieveParams params =
        com.stripe.param.CashBalanceRetrieveParams.builder().build();

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
  public void testCashBalanceServiceUpdate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CashBalanceUpdateParams params =
        com.stripe.param.CashBalanceUpdateParams.builder()
            .setSettings(
                com.stripe.param.CashBalanceUpdateParams.Settings.builder()
                    .setReconciliationMode(
                        com.stripe.param.CashBalanceUpdateParams.Settings.ReconciliationMode.MANUAL)
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
  public void testCustomerCreateFundingInstructions() throws StripeException {
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
  public void testCustomerFundingInstructionsServiceCreate() throws StripeException {
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
  public void testCustomerListPaymentMethods() throws StripeException {
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
  public void testCustomerPaymentMethodServiceList() throws StripeException {
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
  public void testPaymentSourceServiceUpdate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceUpdateParams params =
        com.stripe.param.PaymentSourceUpdateParams.builder().setAccountHolderName("Kamil").build();

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
  public void testAccountList() throws StripeException {
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
  public void testAccountServiceList() throws StripeException {
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
  public void testAccountRetrieve() throws StripeException {
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
  public void testAccountServiceRetrieve() throws StripeException {
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
  public void testAccountDisconnect() throws StripeException {
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
  public void testAccountServiceDisconnect() throws StripeException {
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
  public void testAccountListOwners() throws StripeException {
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
  public void testAccountOwnerServiceList() throws StripeException {
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
  public void testAccountRefresh() throws StripeException {
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
  public void testAccountServiceRefresh() throws StripeException {
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
  public void testSessionCreate2() throws StripeException {
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
  public void testSessionServiceCreate2() throws StripeException {
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
  public void testSessionRetrieve() throws StripeException {
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
  public void testSessionServiceRetrieve() throws StripeException {
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
  public void testInvoiceUpcoming() throws StripeException {
    InvoiceUpcomingParams params =
        InvoiceUpcomingParams.builder().setCustomer("cus_9utnxg47pWjV1e").build();

    Invoice invoice = Invoice.upcoming(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/upcoming",
        params.toMap(),
        null);
  }

  @Test
  public void testInvoiceServiceUpcoming() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceUpcomingParams params =
        com.stripe.param.InvoiceUpcomingParams.builder().setCustomer("cus_9utnxg47pWjV1e").build();

    com.stripe.model.Invoice invoice = client.invoices().upcoming(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/invoices/upcoming",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentIntentCreate() throws StripeException {
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
  public void testPaymentIntentServiceCreate() throws StripeException {
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
  public void testPaymentIntentVerifyMicrodeposits() throws StripeException {
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
  public void testPaymentIntentServiceVerifyMicrodeposits() throws StripeException {
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
  public void testPaymentLinkCreate() throws StripeException {
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
  public void testPaymentLinkServiceCreate() throws StripeException {
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
  public void testPaymentLinkRetrieve() throws StripeException {
    PaymentLink paymentLink = PaymentLink.retrieve("pl_xyz");
    assertNotNull(paymentLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payment_links/pl_xyz", null, null);
  }

  @Test
  public void testPaymentLinkServiceRetrieve() throws StripeException {
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
  public void testPaymentLinkListLineItems() throws StripeException {
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
  public void testPaymentLinkLineItemServiceList() throws StripeException {
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
  public void testPriceCreate() throws StripeException {
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
  public void testPriceServiceCreate() throws StripeException {
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
  public void testSetupAttemptList() throws StripeException {
    SetupAttemptListParams params =
        SetupAttemptListParams.builder().setLimit(3L).setSetupIntent("si_xyz").build();

    SetupAttemptCollection setupAttempts = SetupAttempt.list(params);
    assertNotNull(setupAttempts);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_attempts", params.toMap(), null);
  }

  @Test
  public void testSetupAttemptServiceList() throws StripeException {
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
  public void testSetupIntentVerifyMicrodeposits() throws StripeException {
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
  public void testSetupIntentServiceVerifyMicrodeposits() throws StripeException {
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
  public void testShippingRateList() throws StripeException {
    ShippingRateListParams params = ShippingRateListParams.builder().build();

    ShippingRateCollection shippingRates = ShippingRate.list(params);
    assertNotNull(shippingRates);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRateServiceList() throws StripeException {
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
  public void testShippingRateCreate() throws StripeException {
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
  public void testShippingRateServiceCreate() throws StripeException {
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
  public void testConfigurationList() throws StripeException {
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
  public void testConfigurationServiceList() throws StripeException {
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
  public void testConfigurationCreate() throws StripeException {
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
  public void testConfigurationServiceCreate() throws StripeException {
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
  public void testConfigurationDelete() throws StripeException {
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
  public void testConfigurationServiceDelete() throws StripeException {
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
  public void testConfigurationRetrieve() throws StripeException {
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
  public void testConfigurationServiceRetrieve() throws StripeException {
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
  public void testConfigurationUpdate() throws StripeException {
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
  public void testConfigurationServiceUpdate() throws StripeException {
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
  public void testCustomerFundCashBalance() throws StripeException {
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
  public void testCustomerServiceFundCashBalance() throws StripeException {
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
  public void testCardDeliverCard() throws StripeException {
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
  public void testCardServiceDeliverCard() throws StripeException {
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
  public void testCardFailCard() throws StripeException {
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
  public void testCardServiceFailCard() throws StripeException {
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
  public void testCardReturnCard() throws StripeException {
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
  public void testCardServiceReturnCard() throws StripeException {
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
  public void testCardShipCard() throws StripeException {
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
  public void testCardServiceShipCard() throws StripeException {
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
  public void testRefundExpire() throws StripeException {
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
  public void testRefundServiceExpire() throws StripeException {
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
  public void testTestClockList() throws StripeException {
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
  public void testTestClockServiceList() throws StripeException {
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
  public void testTestClockCreate() throws StripeException {
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
  public void testTestClockServiceCreate() throws StripeException {
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
  public void testTestClockDelete() throws StripeException {
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
  public void testTestClockServiceDelete() throws StripeException {
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
  public void testTestClockRetrieve() throws StripeException {
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
  public void testTestClockServiceRetrieve() throws StripeException {
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
  public void testTestClockAdvance() throws StripeException {
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
  public void testTestClockServiceAdvance() throws StripeException {
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
  public void testInboundTransferFail() throws StripeException {
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
  public void testInboundTransferServiceFail() throws StripeException {
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
  public void testInboundTransferReturnInboundTransfer() throws StripeException {
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
  public void testInboundTransferServiceReturnInboundTransfer() throws StripeException {
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
  public void testInboundTransferSucceed() throws StripeException {
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
  public void testInboundTransferServiceSucceed() throws StripeException {
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
  public void testOutboundTransferFail() throws StripeException {
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
  public void testOutboundTransferServiceFail() throws StripeException {
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
  public void testOutboundTransferPost() throws StripeException {
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
  public void testOutboundTransferServicePost() throws StripeException {
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
  public void testOutboundTransferReturnOutboundTransfer() throws StripeException {
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
  public void testOutboundTransferServiceReturnOutboundTransfer() throws StripeException {
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
  public void testReceivedCreditCreate() throws StripeException {
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
  public void testReceivedCreditServiceCreate() throws StripeException {
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
  public void testReceivedDebitCreate() throws StripeException {
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
  public void testReceivedDebitServiceCreate() throws StripeException {
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
  public void testTokenCreate() throws StripeException {
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
  public void testTokenServiceCreate() throws StripeException {
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
  public void testAccountLinkCreate() throws StripeException {
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
  public void testAccountLinkServiceCreate() throws StripeException {
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
  public void testAccountList2() throws StripeException {
    AccountListParams params = AccountListParams.builder().setLimit(3L).build();

    AccountCollection accounts = Account.list(params);
    assertNotNull(accounts);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/accounts", params.toMap(), null);
  }

  @Test
  public void testAccountServiceList2() throws StripeException {
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
  public void testAccountCreate() throws StripeException {
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
  public void testAccountServiceCreate() throws StripeException {
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
  public void testAccountDelete() throws StripeException {
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
  public void testAccountServiceDelete() throws StripeException {
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
  public void testAccountRetrieve2() throws StripeException {
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
  public void testAccountServiceRetrieve2() throws StripeException {
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
  public void testAccountUpdate() throws StripeException {
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
  public void testAccountServiceUpdate() throws StripeException {
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
  public void testAccountReject() throws StripeException {
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
  public void testAccountServiceReject() throws StripeException {
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
  public void testAccountCapabilities() throws StripeException {
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
  public void testCapabilityServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CapabilityListParams params =
        com.stripe.param.CapabilityListParams.builder().build();

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
  public void testCapabilityRetrieve() throws StripeException {
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
  public void testCapabilityServiceRetrieve() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CapabilityRetrieveParams params =
        com.stripe.param.CapabilityRetrieveParams.builder().build();

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
  public void testCapabilityUpdate() throws StripeException {
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
  public void testCapabilityServiceUpdate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CapabilityUpdateParams params =
        com.stripe.param.CapabilityUpdateParams.builder().setRequested(true).build();

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
  public void testExternalAccountServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ExternalAccountCreateParams params =
        com.stripe.param.ExternalAccountCreateParams.builder()
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
  public void testExternalAccountServiceCreate2() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ExternalAccountCreateParams params =
        com.stripe.param.ExternalAccountCreateParams.builder()
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
  public void testExternalAccountServiceDelete() throws StripeException {
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
  public void testExternalAccountServiceDelete2() throws StripeException {
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
  public void testExternalAccountServiceRetrieve() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ExternalAccountRetrieveParams params =
        com.stripe.param.ExternalAccountRetrieveParams.builder().build();

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
  public void testExternalAccountServiceRetrieve2() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ExternalAccountRetrieveParams params =
        com.stripe.param.ExternalAccountRetrieveParams.builder().build();

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
  public void testExternalAccountServiceUpdate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ExternalAccountUpdateParams params =
        com.stripe.param.ExternalAccountUpdateParams.builder()
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
  public void testExternalAccountServiceUpdate2() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ExternalAccountUpdateParams params =
        com.stripe.param.ExternalAccountUpdateParams.builder()
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
  public void testLoginLinkServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.LoginLinkCreateParams params =
        com.stripe.param.LoginLinkCreateParams.builder().build();

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
  public void testAccountPersons() throws StripeException {
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
  public void testPersonServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PersonListParams params =
        com.stripe.param.PersonListParams.builder().setLimit(3L).build();

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
  public void testPersonCreate() throws StripeException {
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
  public void testPersonServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PersonCreateParams params =
        com.stripe.param.PersonCreateParams.builder()
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
  public void testPersonDelete() throws StripeException {
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
  public void testPersonServiceDelete() throws StripeException {
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
  public void testPersonRetrieve() throws StripeException {
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
  public void testPersonServiceRetrieve() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PersonRetrieveParams params =
        com.stripe.param.PersonRetrieveParams.builder().build();

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
  public void testPersonUpdate() throws StripeException {
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
  public void testPersonServiceUpdate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PersonUpdateParams params =
        com.stripe.param.PersonUpdateParams.builder().putMetadata("order_id", "6735").build();

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
  public void testApplicationFeeList() throws StripeException {
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
  public void testApplicationFeeServiceList() throws StripeException {
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
  public void testApplicationFeeRetrieve() throws StripeException {
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
  public void testApplicationFeeServiceRetrieve() throws StripeException {
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
  public void testFeeRefundList() throws StripeException {
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
  public void testFeeRefundServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FeeRefundListParams params =
        com.stripe.param.FeeRefundListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.FeeRefund> stripeCollection =
        client.applicationFees().feeRefunds().list("fee_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testFeeRefundCreate() throws StripeException {
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
  public void testFeeRefundServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FeeRefundCreateParams params =
        com.stripe.param.FeeRefundCreateParams.builder().build();

    com.stripe.model.FeeRefund feeRefund =
        client.applicationFees().feeRefunds().create("fee_xxxxxxxxxxxxx", params);
    assertNotNull(feeRefund);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap(),
        null);
  }

  @Test
  public void testFeeRefundRetrieve() throws StripeException {
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
  public void testFeeRefundServiceRetrieve() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FeeRefundRetrieveParams params =
        com.stripe.param.FeeRefundRetrieveParams.builder().build();

    com.stripe.model.FeeRefund feeRefund =
        client
            .applicationFees()
            .feeRefunds()
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
  public void testFeeRefundUpdate() throws StripeException {
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
  public void testFeeRefundServiceUpdate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FeeRefundUpdateParams params =
        com.stripe.param.FeeRefundUpdateParams.builder().putMetadata("order_id", "6735").build();

    com.stripe.model.FeeRefund feeRefund =
        client
            .applicationFees()
            .feeRefunds()
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
  public void testSecretList2() throws StripeException {
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
  public void testSecretServiceList2() throws StripeException {
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
  public void testSecretCreate2() throws StripeException {
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
  public void testSecretServiceCreate2() throws StripeException {
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
  public void testBalanceTransactionList() throws StripeException {
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
  public void testBalanceTransactionServiceList() throws StripeException {
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
  public void testBalanceTransactionRetrieve() throws StripeException {
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
  public void testBalanceTransactionServiceRetrieve() throws StripeException {
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
  public void testConfigurationList2() throws StripeException {
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
  public void testConfigurationServiceList2() throws StripeException {
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
  public void testConfigurationCreate2() throws StripeException {
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
  public void testConfigurationServiceCreate2() throws StripeException {
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
  public void testConfigurationRetrieve2() throws StripeException {
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
  public void testConfigurationServiceRetrieve2() throws StripeException {
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
  public void testConfigurationUpdate2() throws StripeException {
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
  public void testConfigurationServiceUpdate2() throws StripeException {
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
  public void testSessionCreate3() throws StripeException {
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
  public void testSessionServiceCreate3() throws StripeException {
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
  public void testChargeList() throws StripeException {
    ChargeListParams params = ChargeListParams.builder().setLimit(3L).build();

    ChargeCollection charges = Charge.list(params);
    assertNotNull(charges);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges", params.toMap(), null);
  }

  @Test
  public void testChargeServiceList() throws StripeException {
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
  public void testChargeCreate() throws StripeException {
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
  public void testChargeServiceCreate() throws StripeException {
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
  public void testChargeRetrieve() throws StripeException {
    Charge charge = Charge.retrieve("ch_xxxxxxxxxxxxx");
    assertNotNull(charge);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges/ch_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testChargeServiceRetrieve() throws StripeException {
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
  public void testChargeUpdate() throws StripeException {
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
  public void testChargeServiceUpdate() throws StripeException {
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
  public void testChargeCapture() throws StripeException {
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
  public void testChargeServiceCapture() throws StripeException {
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
  public void testChargeSearch() throws StripeException {
    ChargeSearchParams params =
        ChargeSearchParams.builder().setQuery("amount>999 AND metadata['order_id']:'6735'").build();

    ChargeSearchResult charges = Charge.search(params);
    assertNotNull(charges);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/charges/search", params.toMap(), null);
  }

  @Test
  public void testChargeServiceSearch() throws StripeException {
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
  public void testSessionList() throws StripeException {
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
  public void testSessionServiceList() throws StripeException {
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
  public void testSessionCreate4() throws StripeException {
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
  public void testSessionServiceCreate4() throws StripeException {
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
  public void testSessionRetrieve2() throws StripeException {
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
  public void testSessionServiceRetrieve2() throws StripeException {
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
  public void testSessionExpire2() throws StripeException {
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
  public void testSessionServiceExpire2() throws StripeException {
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
  public void testCountrySpecList() throws StripeException {
    CountrySpecListParams params = CountrySpecListParams.builder().setLimit(3L).build();

    CountrySpecCollection countrySpecs = CountrySpec.list(params);
    assertNotNull(countrySpecs);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/country_specs", params.toMap(), null);
  }

  @Test
  public void testCountrySpecServiceList() throws StripeException {
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
  public void testCountrySpecRetrieve() throws StripeException {
    CountrySpec countrySpec = CountrySpec.retrieve("US");
    assertNotNull(countrySpec);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/country_specs/US", null, null);
  }

  @Test
  public void testCountrySpecServiceRetrieve() throws StripeException {
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
  public void testCouponList() throws StripeException {
    CouponListParams params = CouponListParams.builder().setLimit(3L).build();

    CouponCollection coupons = Coupon.list(params);
    assertNotNull(coupons);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponServiceList() throws StripeException {
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
  public void testCouponCreate() throws StripeException {
    CouponCreateParams params =
        CouponCreateParams.builder()
            .setPercentOff(new BigDecimal(25.5))
            .setDuration(CouponCreateParams.Duration.REPEATING)
            .setDurationInMonths(3L)
            .build();

    Coupon coupon = Coupon.create(params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.CouponCreateParams params =
        com.stripe.param.CouponCreateParams.builder()
            .setPercentOff(new BigDecimal(25.5))
            .setDuration(com.stripe.param.CouponCreateParams.Duration.REPEATING)
            .setDurationInMonths(3L)
            .build();

    com.stripe.model.Coupon coupon = client.coupons().create(params);
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/coupons", params.toMap(), null);
  }

  @Test
  public void testCouponDelete() throws StripeException {
    Coupon resource = Coupon.retrieve("Z4OV52SU");

    Coupon coupon = resource.delete();
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.DELETE, "/v1/coupons/Z4OV52SU", null, null);
  }

  @Test
  public void testCouponServiceDelete() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.model.Coupon coupon = client.coupons().delete("Z4OV52SU");
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.DELETE, "/v1/coupons/Z4OV52SU", null, null);
  }

  @Test
  public void testCouponRetrieve() throws StripeException {
    Coupon coupon = Coupon.retrieve("Z4OV52SU");
    assertNotNull(coupon);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/coupons/Z4OV52SU", null, null);
  }

  @Test
  public void testCouponServiceRetrieve() throws StripeException {
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
  public void testCouponUpdate() throws StripeException {
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
  public void testCouponServiceUpdate() throws StripeException {
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
  public void testCreditNoteList() throws StripeException {
    CreditNoteListParams params = CreditNoteListParams.builder().setLimit(3L).build();

    CreditNoteCollection creditNotes = CreditNote.list(params);
    assertNotNull(creditNotes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/credit_notes", params.toMap(), null);
  }

  @Test
  public void testCreditNoteServiceList() throws StripeException {
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
  public void testCreditNoteCreate() throws StripeException {
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
  public void testCreditNoteServiceCreate() throws StripeException {
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
  public void testCreditNoteVoidCreditNote() throws StripeException {
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
  public void testCreditNoteServiceVoidCreditNote() throws StripeException {
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
  public void testCreditNoteLineItemList() throws StripeException {
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
  public void testCreditNoteLineItemServiceList() throws StripeException {
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
  public void testCreditNotePreview() throws StripeException {
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
  public void testCreditNoteServicePreview() throws StripeException {
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
  public void testCustomerList() throws StripeException {
    CustomerListParams params = CustomerListParams.builder().setLimit(3L).build();

    CustomerCollection customers = Customer.list(params);
    assertNotNull(customers);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomerServiceList() throws StripeException {
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
  public void testCustomerList2() throws StripeException {
    CustomerListParams params = CustomerListParams.builder().setLimit(3L).build();

    CustomerCollection customers = Customer.list(params);
    assertNotNull(customers);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/customers", params.toMap(), null);
  }

  @Test
  public void testCustomerServiceList2() throws StripeException {
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
  public void testCustomerCreate() throws StripeException {
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
  public void testCustomerServiceCreate() throws StripeException {
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
  public void testCustomerDelete() throws StripeException {
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
  public void testCustomerServiceDelete() throws StripeException {
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
  public void testCustomerRetrieve() throws StripeException {
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
  public void testCustomerServiceRetrieve() throws StripeException {
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
  public void testCustomerUpdate() throws StripeException {
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
  public void testCustomerServiceUpdate() throws StripeException {
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
  public void testCustomerBalanceTransactions() throws StripeException {
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
  public void testCustomerBalanceTransactionServiceList() throws StripeException {
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
  public void testCustomerBalanceTransactionCreate() throws StripeException {
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
  public void testCustomerBalanceTransactionServiceCreate() throws StripeException {
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
  public void testCustomerBalanceTransactionRetrieve() throws StripeException {
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
  public void testCustomerBalanceTransactionServiceRetrieve() throws StripeException {
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
  public void testCustomerBalanceTransactionUpdate() throws StripeException {
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
  public void testCustomerBalanceTransactionServiceUpdate() throws StripeException {
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
  public void testCustomerListPaymentMethods2() throws StripeException {
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
  public void testCustomerPaymentMethodServiceList2() throws StripeException {
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
  public void testPaymentSourceServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceListParams params =
        com.stripe.param.PaymentSourceListParams.builder()
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
  public void testPaymentSourceServiceList2() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceListParams params =
        com.stripe.param.PaymentSourceListParams.builder().setObject("card").setLimit(3L).build();

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
  public void testPaymentSourceServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceCreateParams params =
        com.stripe.param.PaymentSourceCreateParams.builder()
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
  public void testPaymentSourceServiceCreate2() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceCreateParams params =
        com.stripe.param.PaymentSourceCreateParams.builder().setSource("tok_xxxx").build();

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
  public void testSourceServiceDetach() throws StripeException {
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
  public void testSourceServiceDetach2() throws StripeException {
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
  public void testPaymentSourceServiceRetrieve() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceRetrieveParams params =
        com.stripe.param.PaymentSourceRetrieveParams.builder().build();

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
  public void testPaymentSourceServiceRetrieve2() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceRetrieveParams params =
        com.stripe.param.PaymentSourceRetrieveParams.builder().build();

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
  public void testPaymentSourceServiceUpdate2() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceUpdateParams params =
        com.stripe.param.PaymentSourceUpdateParams.builder()
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
  public void testPaymentSourceServiceUpdate3() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PaymentSourceUpdateParams params =
        com.stripe.param.PaymentSourceUpdateParams.builder().setName("Jenny Rosen").build();

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
  public void testBankAccountServiceVerify() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.BankAccountVerifyParams params =
        com.stripe.param.BankAccountVerifyParams.builder().addAmount(32L).addAmount(45L).build();

    com.stripe.model.BankAccount bankAccount =
        client.bankAccounts().verify("cus_xxxxxxxxxxxxx", "ba_xxxxxxxxxxxxx", params);
    assertNotNull(bankAccount);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/sources/ba_xxxxxxxxxxxxx/verify",
        params.toMap(),
        null);
  }

  @Test
  public void testTaxIdServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxIdListParams params =
        com.stripe.param.TaxIdListParams.builder().setLimit(3L).build();

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
  public void testTaxIdServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxIdCreateParams params =
        com.stripe.param.TaxIdCreateParams.builder()
            .setType(com.stripe.param.TaxIdCreateParams.Type.EU_VAT)
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
  public void testTaxIdServiceDelete() throws StripeException {
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
  public void testTaxIdServiceRetrieve() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.TaxIdRetrieveParams params =
        com.stripe.param.TaxIdRetrieveParams.builder().build();

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
  public void testCustomerSearch() throws StripeException {
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
  public void testCustomerServiceSearch() throws StripeException {
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
  public void testCustomerSearch2() throws StripeException {
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
  public void testCustomerServiceSearch2() throws StripeException {
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
  public void testDisputeList() throws StripeException {
    DisputeListParams params = DisputeListParams.builder().setLimit(3L).build();

    DisputeCollection disputes = Dispute.list(params);
    assertNotNull(disputes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/disputes", params.toMap(), null);
  }

  @Test
  public void testDisputeServiceList() throws StripeException {
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
  public void testDisputeRetrieve() throws StripeException {
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
  public void testDisputeServiceRetrieve() throws StripeException {
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
  public void testDisputeUpdate() throws StripeException {
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
  public void testDisputeServiceUpdate() throws StripeException {
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
  public void testDisputeClose() throws StripeException {
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
  public void testDisputeServiceClose() throws StripeException {
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
  public void testEventList() throws StripeException {
    EventListParams params = EventListParams.builder().setLimit(3L).build();

    EventCollection events = Event.list(params);
    assertNotNull(events);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/events", params.toMap(), null);
  }

  @Test
  public void testEventServiceList() throws StripeException {
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
  public void testEventRetrieve() throws StripeException {
    Event event = Event.retrieve("evt_xxxxxxxxxxxxx");
    assertNotNull(event);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/events/evt_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testEventServiceRetrieve() throws StripeException {
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
  public void testFileLinkList() throws StripeException {
    FileLinkListParams params = FileLinkListParams.builder().setLimit(3L).build();

    FileLinkCollection fileLinks = FileLink.list(params);
    assertNotNull(fileLinks);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinkServiceList() throws StripeException {
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
  public void testFileLinkCreate() throws StripeException {
    FileLinkCreateParams params =
        FileLinkCreateParams.builder().setFile("file_xxxxxxxxxxxxx").build();

    FileLink fileLink = FileLink.create(params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinkServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.FileLinkCreateParams params =
        com.stripe.param.FileLinkCreateParams.builder().setFile("file_xxxxxxxxxxxxx").build();

    com.stripe.model.FileLink fileLink = client.fileLinks().create(params);
    assertNotNull(fileLink);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/file_links", params.toMap(), null);
  }

  @Test
  public void testFileLinkRetrieve() throws StripeException {
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
  public void testFileLinkServiceRetrieve() throws StripeException {
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
  public void testFileLinkUpdate() throws StripeException {
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
  public void testFileLinkServiceUpdate() throws StripeException {
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
  public void testFileList() throws StripeException {
    FileListParams params = FileListParams.builder().setLimit(3L).build();

    FileCollection files = File.list(params);
    assertNotNull(files);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/files", params.toMap(), null);
  }

  @Test
  public void testFileServiceList() throws StripeException {
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
  public void testFileCreate() throws StripeException {
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
  public void testFileServiceCreate() throws StripeException {
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
  public void testFileRetrieve() throws StripeException {
    File file = File.retrieve("file_xxxxxxxxxxxxx");
    assertNotNull(file);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/files/file_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testFileServiceRetrieve() throws StripeException {
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
  public void testAccountList3() throws StripeException {
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
  public void testAccountServiceList3() throws StripeException {
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
  public void testAccountRetrieve3() throws StripeException {
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
  public void testAccountServiceRetrieve3() throws StripeException {
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
  public void testAccountDisconnect2() throws StripeException {
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
  public void testAccountServiceDisconnect2() throws StripeException {
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
  public void testAccountListOwners2() throws StripeException {
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
  public void testAccountOwnerServiceList2() throws StripeException {
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
  public void testSessionCreate5() throws StripeException {
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
  public void testSessionServiceCreate5() throws StripeException {
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
  public void testSessionRetrieve3() throws StripeException {
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
  public void testSessionServiceRetrieve3() throws StripeException {
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
  public void testVerificationReportList() throws StripeException {
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
  public void testVerificationReportServiceList() throws StripeException {
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
  public void testVerificationReportRetrieve() throws StripeException {
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
  public void testVerificationReportServiceRetrieve() throws StripeException {
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
  public void testVerificationSessionList() throws StripeException {
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
  public void testVerificationSessionServiceList() throws StripeException {
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
  public void testVerificationSessionCreate() throws StripeException {
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
  public void testVerificationSessionServiceCreate() throws StripeException {
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
  public void testVerificationSessionRetrieve() throws StripeException {
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
  public void testVerificationSessionServiceRetrieve() throws StripeException {
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
  public void testVerificationSessionUpdate() throws StripeException {
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
  public void testVerificationSessionServiceUpdate() throws StripeException {
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
  public void testVerificationSessionCancel() throws StripeException {
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
  public void testVerificationSessionServiceCancel() throws StripeException {
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
  public void testVerificationSessionRedact() throws StripeException {
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
  public void testVerificationSessionServiceRedact() throws StripeException {
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
  public void testInvoiceItemList() throws StripeException {
    InvoiceItemListParams params = InvoiceItemListParams.builder().setLimit(3L).build();

    InvoiceItemCollection invoiceItems = InvoiceItem.list(params);
    assertNotNull(invoiceItems);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceItemServiceList() throws StripeException {
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
  public void testInvoiceItemCreate() throws StripeException {
    InvoiceItemCreateParams params =
        InvoiceItemCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setPrice("price_xxxxxxxxxxxxx")
            .build();

    InvoiceItem invoiceItem = InvoiceItem.create(params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceItemServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceItemCreateParams params =
        com.stripe.param.InvoiceItemCreateParams.builder()
            .setCustomer("cus_xxxxxxxxxxxxx")
            .setPrice("price_xxxxxxxxxxxxx")
            .build();

    com.stripe.model.InvoiceItem invoiceItem = client.invoiceItems().create(params);
    assertNotNull(invoiceItem);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoiceitems", params.toMap(), null);
  }

  @Test
  public void testInvoiceItemDelete() throws StripeException {
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
  public void testInvoiceItemServiceDelete() throws StripeException {
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
  public void testInvoiceItemRetrieve() throws StripeException {
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
  public void testInvoiceItemServiceRetrieve() throws StripeException {
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
  public void testInvoiceItemUpdate() throws StripeException {
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
  public void testInvoiceItemServiceUpdate() throws StripeException {
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
  public void testInvoiceList() throws StripeException {
    InvoiceListParams params = InvoiceListParams.builder().setLimit(3L).build();

    InvoiceCollection invoices = Invoice.list(params);
    assertNotNull(invoices);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoiceServiceList() throws StripeException {
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
  public void testInvoiceCreate() throws StripeException {
    InvoiceCreateParams params =
        InvoiceCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    Invoice invoice = Invoice.create(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoiceServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.InvoiceCreateParams params =
        com.stripe.param.InvoiceCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    com.stripe.model.Invoice invoice = client.invoices().create(params);
    assertNotNull(invoice);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/invoices", params.toMap(), null);
  }

  @Test
  public void testInvoiceDelete() throws StripeException {
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
  public void testInvoiceServiceDelete() throws StripeException {
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
  public void testInvoiceRetrieve() throws StripeException {
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
  public void testInvoiceServiceRetrieve() throws StripeException {
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
  public void testInvoiceRetrieve2() throws StripeException {
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
  public void testInvoiceServiceRetrieve2() throws StripeException {
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
  public void testInvoiceUpdate() throws StripeException {
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
  public void testInvoiceServiceUpdate() throws StripeException {
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
  public void testInvoiceFinalizeInvoice() throws StripeException {
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
  public void testInvoiceServiceFinalizeInvoice() throws StripeException {
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
  public void testInvoiceMarkUncollectible() throws StripeException {
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
  public void testInvoiceServiceMarkUncollectible() throws StripeException {
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
  public void testInvoicePay() throws StripeException {
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
  public void testInvoiceServicePay() throws StripeException {
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
  public void testInvoiceSendInvoice() throws StripeException {
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
  public void testInvoiceServiceSendInvoice() throws StripeException {
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
  public void testInvoiceVoidInvoice() throws StripeException {
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
  public void testInvoiceServiceVoidInvoice() throws StripeException {
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
  public void testInvoiceSearch() throws StripeException {
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
  public void testInvoiceServiceSearch() throws StripeException {
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
  public void testAuthorizationList() throws StripeException {
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
  public void testAuthorizationServiceList() throws StripeException {
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
  public void testAuthorizationRetrieve() throws StripeException {
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
  public void testAuthorizationServiceRetrieve() throws StripeException {
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
  public void testAuthorizationUpdate() throws StripeException {
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
  public void testAuthorizationServiceUpdate() throws StripeException {
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
  public void testAuthorizationApprove() throws StripeException {
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
  public void testAuthorizationServiceApprove() throws StripeException {
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
  public void testAuthorizationDecline() throws StripeException {
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
  public void testAuthorizationServiceDecline() throws StripeException {
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
  public void testCardholderList() throws StripeException {
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
  public void testCardholderServiceList() throws StripeException {
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
  public void testCardholderCreate() throws StripeException {
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
  public void testCardholderServiceCreate() throws StripeException {
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
  public void testCardholderRetrieve() throws StripeException {
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
  public void testCardholderServiceRetrieve() throws StripeException {
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
  public void testCardholderUpdate() throws StripeException {
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
  public void testCardholderServiceUpdate() throws StripeException {
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
  public void testCardList() throws StripeException {
    com.stripe.param.issuing.CardListParams params =
        com.stripe.param.issuing.CardListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.CardCollection cards = com.stripe.model.issuing.Card.list(params);
    assertNotNull(cards);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/issuing/cards", params.toMap(), null);
  }

  @Test
  public void testCardServiceList() throws StripeException {
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
  public void testCardCreate() throws StripeException {
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
  public void testCardServiceCreate() throws StripeException {
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
  public void testCardRetrieve() throws StripeException {
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
  public void testCardServiceRetrieve() throws StripeException {
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
  public void testCardUpdate() throws StripeException {
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
  public void testCardServiceUpdate() throws StripeException {
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
  public void testDisputeList2() throws StripeException {
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
  public void testDisputeServiceList2() throws StripeException {
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
  public void testDisputeCreate() throws StripeException {
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
  public void testDisputeServiceCreate() throws StripeException {
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
  public void testDisputeRetrieve2() throws StripeException {
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
  public void testDisputeServiceRetrieve2() throws StripeException {
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
  public void testDisputeSubmit() throws StripeException {
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
  public void testDisputeServiceSubmit() throws StripeException {
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
  public void testTransactionList() throws StripeException {
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
  public void testTransactionServiceList() throws StripeException {
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
  public void testTransactionRetrieve() throws StripeException {
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
  public void testTransactionServiceRetrieve() throws StripeException {
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
  public void testTransactionUpdate() throws StripeException {
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
  public void testTransactionServiceUpdate() throws StripeException {
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
  public void testMandateRetrieve() throws StripeException {
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
  public void testMandateServiceRetrieve() throws StripeException {
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
  public void testPaymentIntentList() throws StripeException {
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
  public void testPaymentIntentServiceList() throws StripeException {
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
  public void testPaymentIntentCreate2() throws StripeException {
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
  public void testPaymentIntentServiceCreate2() throws StripeException {
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
  public void testPaymentIntentRetrieve() throws StripeException {
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
  public void testPaymentIntentServiceRetrieve() throws StripeException {
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
  public void testPaymentIntentUpdate() throws StripeException {
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
  public void testPaymentIntentServiceUpdate() throws StripeException {
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
  public void testPaymentIntentApplyCustomerBalance() throws StripeException {
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
  public void testPaymentIntentServiceApplyCustomerBalance() throws StripeException {
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
  public void testPaymentIntentCancel() throws StripeException {
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
  public void testPaymentIntentServiceCancel() throws StripeException {
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
  public void testPaymentIntentCapture() throws StripeException {
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
  public void testPaymentIntentServiceCapture() throws StripeException {
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
  public void testPaymentIntentConfirm() throws StripeException {
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
  public void testPaymentIntentServiceConfirm() throws StripeException {
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
  public void testPaymentIntentIncrementAuthorization() throws StripeException {
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
  public void testPaymentIntentServiceIncrementAuthorization() throws StripeException {
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
  public void testPaymentIntentVerifyMicrodeposits2() throws StripeException {
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
  public void testPaymentIntentServiceVerifyMicrodeposits2() throws StripeException {
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
  public void testPaymentIntentSearch() throws StripeException {
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
  public void testPaymentIntentServiceSearch() throws StripeException {
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
  public void testPaymentLinkList() throws StripeException {
    PaymentLinkListParams params = PaymentLinkListParams.builder().setLimit(3L).build();

    PaymentLinkCollection paymentLinks = PaymentLink.list(params);
    assertNotNull(paymentLinks);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payment_links", params.toMap(), null);
  }

  @Test
  public void testPaymentLinkServiceList() throws StripeException {
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
  public void testPaymentLinkCreate2() throws StripeException {
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
  public void testPaymentLinkServiceCreate2() throws StripeException {
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
  public void testPaymentLinkRetrieve2() throws StripeException {
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
  public void testPaymentLinkServiceRetrieve2() throws StripeException {
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
  public void testPaymentLinkUpdate() throws StripeException {
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
  public void testPaymentLinkServiceUpdate() throws StripeException {
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
  public void testPaymentMethodList() throws StripeException {
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
  public void testPaymentMethodServiceList() throws StripeException {
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
  public void testPaymentMethodRetrieve() throws StripeException {
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
  public void testPaymentMethodServiceRetrieve() throws StripeException {
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
  public void testPaymentMethodUpdate() throws StripeException {
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
  public void testPaymentMethodServiceUpdate() throws StripeException {
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
  public void testPaymentMethodAttach() throws StripeException {
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
  public void testPaymentMethodServiceAttach() throws StripeException {
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
  public void testPaymentMethodDetach() throws StripeException {
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
  public void testPaymentMethodServiceDetach() throws StripeException {
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
  public void testPayoutList() throws StripeException {
    PayoutListParams params = PayoutListParams.builder().setLimit(3L).build();

    PayoutCollection payouts = Payout.list(params);
    assertNotNull(payouts);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutServiceList() throws StripeException {
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
  public void testPayoutCreate() throws StripeException {
    PayoutCreateParams params =
        PayoutCreateParams.builder().setAmount(1100L).setCurrency("usd").build();

    Payout payout = Payout.create(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PayoutCreateParams params =
        com.stripe.param.PayoutCreateParams.builder().setAmount(1100L).setCurrency("usd").build();

    com.stripe.model.Payout payout = client.payouts().create(params);
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/payouts", params.toMap(), null);
  }

  @Test
  public void testPayoutRetrieve() throws StripeException {
    Payout payout = Payout.retrieve("po_xxxxxxxxxxxxx");
    assertNotNull(payout);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/payouts/po_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testPayoutServiceRetrieve() throws StripeException {
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
  public void testPayoutUpdate() throws StripeException {
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
  public void testPayoutServiceUpdate() throws StripeException {
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
  public void testPayoutCancel() throws StripeException {
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
  public void testPayoutServiceCancel() throws StripeException {
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
  public void testPayoutReverse() throws StripeException {
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
  public void testPayoutServiceReverse() throws StripeException {
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
  public void testPlanList() throws StripeException {
    PlanListParams params = PlanListParams.builder().setLimit(3L).build();

    PlanCollection plans = Plan.list(params);
    assertNotNull(plans);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/plans", params.toMap(), null);
  }

  @Test
  public void testPlanServiceList() throws StripeException {
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
  public void testPlanCreate() throws StripeException {
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
  public void testPlanServiceCreate() throws StripeException {
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
  public void testPlanCreate2() throws StripeException {
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
  public void testPlanServiceCreate2() throws StripeException {
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
  public void testPlanDelete() throws StripeException {
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
  public void testPlanServiceDelete() throws StripeException {
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
  public void testPlanRetrieve() throws StripeException {
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
  public void testPlanServiceRetrieve() throws StripeException {
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
  public void testPlanUpdate() throws StripeException {
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
  public void testPlanServiceUpdate() throws StripeException {
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
  public void testPriceList() throws StripeException {
    PriceListParams params = PriceListParams.builder().setLimit(3L).build();

    PriceCollection prices = Price.list(params);
    assertNotNull(prices);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/prices", params.toMap(), null);
  }

  @Test
  public void testPriceServiceList() throws StripeException {
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
  public void testPriceCreate2() throws StripeException {
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
  public void testPriceServiceCreate2() throws StripeException {
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
  public void testPriceRetrieve() throws StripeException {
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
  public void testPriceServiceRetrieve() throws StripeException {
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
  public void testPriceUpdate() throws StripeException {
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
  public void testPriceServiceUpdate() throws StripeException {
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
  public void testPriceSearch() throws StripeException {
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
  public void testPriceServiceSearch() throws StripeException {
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
  public void testProductList() throws StripeException {
    ProductListParams params = ProductListParams.builder().setLimit(3L).build();

    ProductCollection products = Product.list(params);
    assertNotNull(products);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductServiceList() throws StripeException {
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
  public void testProductCreate() throws StripeException {
    ProductCreateParams params = ProductCreateParams.builder().setName("Gold Special").build();

    Product product = Product.create(params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.ProductCreateParams params =
        com.stripe.param.ProductCreateParams.builder().setName("Gold Special").build();

    com.stripe.model.Product product = client.products().create(params);
    assertNotNull(product);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/products", params.toMap(), null);
  }

  @Test
  public void testProductDelete() throws StripeException {
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
  public void testProductServiceDelete() throws StripeException {
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
  public void testProductRetrieve() throws StripeException {
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
  public void testProductServiceRetrieve() throws StripeException {
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
  public void testProductUpdate() throws StripeException {
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
  public void testProductServiceUpdate() throws StripeException {
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
  public void testProductSearch() throws StripeException {
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
  public void testProductServiceSearch() throws StripeException {
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
  public void testPromotionCodeList() throws StripeException {
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
  public void testPromotionCodeServiceList() throws StripeException {
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
  public void testPromotionCodeCreate() throws StripeException {
    PromotionCodeCreateParams params =
        PromotionCodeCreateParams.builder().setCoupon("Z4OV52SU").build();

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
  public void testPromotionCodeServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.PromotionCodeCreateParams params =
        com.stripe.param.PromotionCodeCreateParams.builder().setCoupon("Z4OV52SU").build();

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
  public void testPromotionCodeRetrieve() throws StripeException {
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
  public void testPromotionCodeServiceRetrieve() throws StripeException {
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
  public void testPromotionCodeUpdate() throws StripeException {
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
  public void testPromotionCodeServiceUpdate() throws StripeException {
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
  public void testQuoteList() throws StripeException {
    QuoteListParams params = QuoteListParams.builder().setLimit(3L).build();

    QuoteCollection quotes = Quote.list(params);
    assertNotNull(quotes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/quotes", params.toMap(), null);
  }

  @Test
  public void testQuoteServiceList() throws StripeException {
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
  public void testQuoteCreate() throws StripeException {
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
  public void testQuoteServiceCreate() throws StripeException {
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
  public void testQuoteRetrieve() throws StripeException {
    Quote quote = Quote.retrieve("qt_xxxxxxxxxxxxx");
    assertNotNull(quote);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/quotes/qt_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testQuoteServiceRetrieve() throws StripeException {
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
  public void testQuoteUpdate() throws StripeException {
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
  public void testQuoteServiceUpdate() throws StripeException {
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
  public void testQuoteAccept() throws StripeException {
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
  public void testQuoteServiceAccept() throws StripeException {
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
  public void testQuoteCancel() throws StripeException {
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
  public void testQuoteServiceCancel() throws StripeException {
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
  public void testQuoteFinalizeQuote() throws StripeException {
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
  public void testQuoteServiceFinalizeQuote() throws StripeException {
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
  public void testEarlyFraudWarningList() throws StripeException {
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
  public void testEarlyFraudWarningServiceList() throws StripeException {
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
  public void testEarlyFraudWarningRetrieve() throws StripeException {
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
  public void testEarlyFraudWarningServiceRetrieve() throws StripeException {
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
  public void testValueListItemList() throws StripeException {
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
  public void testValueListItemServiceList() throws StripeException {
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
  public void testValueListItemCreate() throws StripeException {
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
  public void testValueListItemServiceCreate() throws StripeException {
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
  public void testValueListItemDelete() throws StripeException {
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
  public void testValueListItemServiceDelete() throws StripeException {
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
  public void testValueListItemRetrieve() throws StripeException {
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
  public void testValueListItemServiceRetrieve() throws StripeException {
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
  public void testValueListList() throws StripeException {
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
  public void testValueListServiceList() throws StripeException {
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
  public void testValueListCreate() throws StripeException {
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
  public void testValueListServiceCreate() throws StripeException {
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
  public void testValueListDelete() throws StripeException {
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
  public void testValueListServiceDelete() throws StripeException {
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
  public void testValueListRetrieve() throws StripeException {
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
  public void testValueListServiceRetrieve() throws StripeException {
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
  public void testValueListUpdate() throws StripeException {
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
  public void testValueListServiceUpdate() throws StripeException {
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
  public void testRefundList() throws StripeException {
    RefundListParams params = RefundListParams.builder().setLimit(3L).build();

    RefundCollection refunds = Refund.list(params);
    assertNotNull(refunds);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundServiceList() throws StripeException {
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
  public void testRefundCreate() throws StripeException {
    RefundCreateParams params = RefundCreateParams.builder().setCharge("ch_xxxxxxxxxxxxx").build();

    Refund refund = Refund.create(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.RefundCreateParams params =
        com.stripe.param.RefundCreateParams.builder().setCharge("ch_xxxxxxxxxxxxx").build();

    com.stripe.model.Refund refund = client.refunds().create(params);
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/refunds", params.toMap(), null);
  }

  @Test
  public void testRefundRetrieve() throws StripeException {
    Refund refund = Refund.retrieve("re_xxxxxxxxxxxxx");
    assertNotNull(refund);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/refunds/re_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testRefundServiceRetrieve() throws StripeException {
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
  public void testRefundUpdate() throws StripeException {
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
  public void testRefundServiceUpdate() throws StripeException {
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
  public void testRefundCancel() throws StripeException {
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
  public void testRefundServiceCancel() throws StripeException {
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
  public void testReportRunList() throws StripeException {
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
  public void testReportRunServiceList() throws StripeException {
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
  public void testReportRunCreate() throws StripeException {
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
  public void testReportRunServiceCreate() throws StripeException {
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
  public void testReportRunRetrieve() throws StripeException {
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
  public void testReportRunServiceRetrieve() throws StripeException {
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
  public void testReportTypeList() throws StripeException {
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
  public void testReportTypeServiceList() throws StripeException {
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
  public void testReportTypeRetrieve() throws StripeException {
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
  public void testReportTypeServiceRetrieve() throws StripeException {
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
  public void testReviewList() throws StripeException {
    ReviewListParams params = ReviewListParams.builder().setLimit(3L).build();

    ReviewCollection reviews = Review.list(params);
    assertNotNull(reviews);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/reviews", params.toMap(), null);
  }

  @Test
  public void testReviewServiceList() throws StripeException {
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
  public void testReviewRetrieve() throws StripeException {
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
  public void testReviewServiceRetrieve() throws StripeException {
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
  public void testReviewApprove() throws StripeException {
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
  public void testReviewServiceApprove() throws StripeException {
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
  public void testSetupIntentList() throws StripeException {
    SetupIntentListParams params = SetupIntentListParams.builder().setLimit(3L).build();

    SetupIntentCollection setupIntents = SetupIntent.list(params);
    assertNotNull(setupIntents);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentServiceList() throws StripeException {
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
  public void testSetupIntentCreate() throws StripeException {
    SetupIntentCreateParams params =
        SetupIntentCreateParams.builder().addPaymentMethodType("card").build();

    SetupIntent setupIntent = SetupIntent.create(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.SetupIntentCreateParams params =
        com.stripe.param.SetupIntentCreateParams.builder().addPaymentMethodType("card").build();

    com.stripe.model.SetupIntent setupIntent = client.setupIntents().create(params);
    assertNotNull(setupIntent);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.POST, "/v1/setup_intents", params.toMap(), null);
  }

  @Test
  public void testSetupIntentRetrieve() throws StripeException {
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
  public void testSetupIntentServiceRetrieve() throws StripeException {
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
  public void testSetupIntentUpdate() throws StripeException {
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
  public void testSetupIntentServiceUpdate() throws StripeException {
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
  public void testSetupIntentCancel() throws StripeException {
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
  public void testSetupIntentServiceCancel() throws StripeException {
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
  public void testSetupIntentConfirm() throws StripeException {
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
  public void testSetupIntentServiceConfirm() throws StripeException {
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
  public void testSetupIntentVerifyMicrodeposits2() throws StripeException {
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
  public void testSetupIntentServiceVerifyMicrodeposits2() throws StripeException {
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
  public void testShippingRateList2() throws StripeException {
    ShippingRateListParams params = ShippingRateListParams.builder().setLimit(3L).build();

    ShippingRateCollection shippingRates = ShippingRate.list(params);
    assertNotNull(shippingRates);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap(), null);
  }

  @Test
  public void testShippingRateServiceList2() throws StripeException {
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
  public void testShippingRateCreate2() throws StripeException {
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
  public void testShippingRateServiceCreate2() throws StripeException {
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
  public void testShippingRateRetrieve() throws StripeException {
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
  public void testShippingRateServiceRetrieve() throws StripeException {
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
  public void testShippingRateUpdate() throws StripeException {
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
  public void testShippingRateServiceUpdate() throws StripeException {
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
  public void testScheduledQueryRunList() throws StripeException {
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
  public void testScheduledQueryRunServiceList() throws StripeException {
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
  public void testScheduledQueryRunRetrieve() throws StripeException {
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
  public void testScheduledQueryRunServiceRetrieve() throws StripeException {
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
  public void testSourceRetrieve() throws StripeException {
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
  public void testSourceServiceRetrieve() throws StripeException {
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
  public void testSourceRetrieve2() throws StripeException {
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
  public void testSourceServiceRetrieve2() throws StripeException {
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
  public void testSourceUpdate() throws StripeException {
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
  public void testSourceServiceUpdate() throws StripeException {
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
  public void testSubscriptionItemList() throws StripeException {
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
  public void testSubscriptionItemServiceList() throws StripeException {
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
  public void testSubscriptionItemCreate() throws StripeException {
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
  public void testSubscriptionItemServiceCreate() throws StripeException {
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
  public void testSubscriptionItemDelete() throws StripeException {
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
  public void testSubscriptionItemServiceDelete() throws StripeException {
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
  public void testSubscriptionItemRetrieve() throws StripeException {
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
  public void testSubscriptionItemServiceRetrieve() throws StripeException {
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
  public void testSubscriptionItemUpdate() throws StripeException {
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
  public void testSubscriptionItemServiceUpdate() throws StripeException {
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
  public void testSubscriptionItemUsageRecordSummaries() throws StripeException {
    SubscriptionItem resource = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");

    SubscriptionItemUsageRecordSummariesParams params =
        SubscriptionItemUsageRecordSummariesParams.builder().setLimit(3L).build();

    UsageRecordSummaryCollection usageRecordSummaries = resource.usageRecordSummaries(params);
    assertNotNull(usageRecordSummaries);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items/si_xxxxxxxxxxxxx/usage_record_summaries",
        params.toMap(),
        null);
  }

  @Test
  public void testUsageRecordSummaryServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.UsageRecordSummaryListParams params =
        com.stripe.param.UsageRecordSummaryListParams.builder().setLimit(3L).build();

    com.stripe.model.StripeCollection<com.stripe.model.UsageRecordSummary> stripeCollection =
        client.subscriptionItems().usageRecordSummaries().list("si_xxxxxxxxxxxxx", params);
    assertNotNull(stripeCollection);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items/si_xxxxxxxxxxxxx/usage_record_summaries",
        params.toMap(),
        null);
  }

  @Test
  public void testUsageRecordServiceCreate() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.UsageRecordCreateParams params =
        com.stripe.param.UsageRecordCreateParams.builder()
            .setQuantity(100L)
            .setTimestamp(1571252444L)
            .build();

    com.stripe.model.UsageRecord usageRecord =
        client.subscriptionItems().usageRecords().create("si_xxxxxxxxxxxxx", params);
    assertNotNull(usageRecord);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.POST,
        "/v1/subscription_items/si_xxxxxxxxxxxxx/usage_records",
        params.toMap(),
        null);
  }

  @Test
  public void testSubscriptionScheduleList() throws StripeException {
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
  public void testSubscriptionScheduleServiceList() throws StripeException {
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
  public void testSubscriptionScheduleCreate() throws StripeException {
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
                    .setIterations(12L)
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
  public void testSubscriptionScheduleServiceCreate() throws StripeException {
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
                    .setIterations(12L)
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
  public void testSubscriptionScheduleRetrieve() throws StripeException {
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
  public void testSubscriptionScheduleServiceRetrieve() throws StripeException {
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
  public void testSubscriptionScheduleUpdate() throws StripeException {
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
  public void testSubscriptionScheduleServiceUpdate() throws StripeException {
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
  public void testSubscriptionScheduleCancel() throws StripeException {
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
  public void testSubscriptionScheduleServiceCancel() throws StripeException {
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
  public void testSubscriptionScheduleRelease() throws StripeException {
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
  public void testSubscriptionScheduleServiceRelease() throws StripeException {
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
  public void testSubscriptionList() throws StripeException {
    SubscriptionListParams params = SubscriptionListParams.builder().setLimit(3L).build();

    SubscriptionCollection subscriptions = Subscription.list(params);
    assertNotNull(subscriptions);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/subscriptions", params.toMap(), null);
  }

  @Test
  public void testSubscriptionServiceList() throws StripeException {
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
  public void testSubscriptionCreate() throws StripeException {
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
  public void testSubscriptionServiceCreate() throws StripeException {
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
  public void testSubscriptionCancel() throws StripeException {
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
  public void testSubscriptionServiceCancel() throws StripeException {
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
  public void testSubscriptionRetrieve() throws StripeException {
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
  public void testSubscriptionServiceRetrieve() throws StripeException {
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
  public void testSubscriptionUpdate() throws StripeException {
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
  public void testSubscriptionServiceUpdate() throws StripeException {
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
  public void testSubscriptionSearch() throws StripeException {
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
  public void testSubscriptionServiceSearch() throws StripeException {
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
  public void testTaxCodeList() throws StripeException {
    TaxCodeListParams params = TaxCodeListParams.builder().setLimit(3L).build();

    TaxCodeCollection taxCodes = TaxCode.list(params);
    assertNotNull(taxCodes);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_codes", params.toMap(), null);
  }

  @Test
  public void testTaxCodeServiceList() throws StripeException {
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
  public void testTaxCodeRetrieve() throws StripeException {
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
  public void testTaxCodeServiceRetrieve() throws StripeException {
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
  public void testTaxRateList() throws StripeException {
    TaxRateListParams params = TaxRateListParams.builder().setLimit(3L).build();

    TaxRateCollection taxRates = TaxRate.list(params);
    assertNotNull(taxRates);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tax_rates", params.toMap(), null);
  }

  @Test
  public void testTaxRateServiceList() throws StripeException {
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
  public void testTaxRateCreate() throws StripeException {
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
  public void testTaxRateServiceCreate() throws StripeException {
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
  public void testTaxRateRetrieve() throws StripeException {
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
  public void testTaxRateServiceRetrieve() throws StripeException {
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
  public void testTaxRateUpdate() throws StripeException {
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
  public void testTaxRateServiceUpdate() throws StripeException {
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
  public void testConfigurationList3() throws StripeException {
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
  public void testConfigurationServiceList3() throws StripeException {
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
  public void testConfigurationCreate3() throws StripeException {
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
  public void testConfigurationServiceCreate3() throws StripeException {
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
  public void testConfigurationDelete2() throws StripeException {
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
  public void testConfigurationServiceDelete2() throws StripeException {
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
  public void testConfigurationRetrieve3() throws StripeException {
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
  public void testConfigurationServiceRetrieve3() throws StripeException {
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
  public void testConfigurationUpdate3() throws StripeException {
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
  public void testConfigurationServiceUpdate3() throws StripeException {
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
  public void testConnectionTokenCreate() throws StripeException {
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
  public void testConnectionTokenServiceCreate() throws StripeException {
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
  public void testLocationList() throws StripeException {
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
  public void testLocationServiceList() throws StripeException {
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
  public void testLocationCreate() throws StripeException {
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
  public void testLocationServiceCreate() throws StripeException {
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
  public void testLocationDelete() throws StripeException {
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
  public void testLocationServiceDelete() throws StripeException {
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
  public void testLocationRetrieve() throws StripeException {
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
  public void testLocationServiceRetrieve() throws StripeException {
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
  public void testLocationUpdate() throws StripeException {
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
  public void testLocationServiceUpdate() throws StripeException {
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
  public void testReaderList() throws StripeException {
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
  public void testReaderServiceList() throws StripeException {
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
  public void testReaderCreate() throws StripeException {
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
  public void testReaderServiceCreate() throws StripeException {
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
  public void testReaderDelete() throws StripeException {
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
  public void testReaderServiceDelete() throws StripeException {
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
  public void testReaderRetrieve() throws StripeException {
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
  public void testReaderServiceRetrieve() throws StripeException {
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
  public void testReaderUpdate() throws StripeException {
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
  public void testReaderServiceUpdate() throws StripeException {
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
  public void testReaderCancelAction() throws StripeException {
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
  public void testReaderServiceCancelAction() throws StripeException {
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
  public void testReaderProcessPaymentIntent() throws StripeException {
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
  public void testReaderServiceProcessPaymentIntent() throws StripeException {
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
  public void testReaderProcessSetupIntent() throws StripeException {
    com.stripe.model.terminal.Reader resource =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");

    com.stripe.param.terminal.ReaderProcessSetupIntentParams params =
        com.stripe.param.terminal.ReaderProcessSetupIntentParams.builder()
            .setSetupIntent("seti_xxxxxxxxxxxxx")
            .setCustomerConsentCollected(true)
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
  public void testReaderServiceProcessSetupIntent() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.terminal.ReaderProcessSetupIntentParams params =
        com.stripe.param.terminal.ReaderProcessSetupIntentParams.builder()
            .setSetupIntent("seti_xxxxxxxxxxxxx")
            .setCustomerConsentCollected(true)
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
  public void testTestClockList2() throws StripeException {
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
  public void testTestClockServiceList2() throws StripeException {
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
  public void testTestClockCreate2() throws StripeException {
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
  public void testTestClockServiceCreate2() throws StripeException {
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
  public void testTestClockDelete2() throws StripeException {
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
  public void testTestClockServiceDelete2() throws StripeException {
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
  public void testTestClockRetrieve2() throws StripeException {
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
  public void testTestClockServiceRetrieve2() throws StripeException {
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
  public void testTestClockAdvance2() throws StripeException {
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
  public void testTestClockServiceAdvance2() throws StripeException {
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
  public void testTokenCreate2() throws StripeException {
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
  public void testTokenServiceCreate2() throws StripeException {
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
  public void testTokenCreate3() throws StripeException {
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
  public void testTokenServiceCreate3() throws StripeException {
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
  public void testTokenCreate4() throws StripeException {
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
  public void testTokenServiceCreate4() throws StripeException {
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
  public void testTokenCreate5() throws StripeException {
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
  public void testTokenServiceCreate5() throws StripeException {
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
  public void testTokenCreate6() throws StripeException {
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
  public void testTokenServiceCreate6() throws StripeException {
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
  public void testTokenRetrieve() throws StripeException {
    Token token = Token.retrieve("tok_xxxx");
    assertNotNull(token);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/tokens/tok_xxxx", null, null);
  }

  @Test
  public void testTokenServiceRetrieve() throws StripeException {
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
  public void testTopupList() throws StripeException {
    TopupListParams params = TopupListParams.builder().setLimit(3L).build();

    TopupCollection topups = Topup.list(params);
    assertNotNull(topups);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/topups", params.toMap(), null);
  }

  @Test
  public void testTopupServiceList() throws StripeException {
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
  public void testTopupCreate() throws StripeException {
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
  public void testTopupServiceCreate() throws StripeException {
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
  public void testTopupRetrieve() throws StripeException {
    Topup topup = Topup.retrieve("tu_xxxxxxxxxxxxx");
    assertNotNull(topup);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/topups/tu_xxxxxxxxxxxxx", null, null);
  }

  @Test
  public void testTopupServiceRetrieve() throws StripeException {
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
  public void testTopupUpdate() throws StripeException {
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
  public void testTopupServiceUpdate() throws StripeException {
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
  public void testTopupCancel() throws StripeException {
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
  public void testTopupServiceCancel() throws StripeException {
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
  public void testTransferList() throws StripeException {
    TransferListParams params = TransferListParams.builder().setLimit(3L).build();

    TransferCollection transfers = Transfer.list(params);
    assertNotNull(transfers);
    verifyRequest(
        BaseAddress.API, ApiResource.RequestMethod.GET, "/v1/transfers", params.toMap(), null);
  }

  @Test
  public void testTransferServiceList() throws StripeException {
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
  public void testTransferCreate() throws StripeException {
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
  public void testTransferServiceCreate() throws StripeException {
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
  public void testTransferRetrieve() throws StripeException {
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
  public void testTransferServiceRetrieve() throws StripeException {
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
  public void testTransferUpdate() throws StripeException {
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
  public void testTransferServiceUpdate() throws StripeException {
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
  public void testTransferReversalList() throws StripeException {
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
  public void testTransferReversalServiceList() throws StripeException {
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
  public void testTransferReversalCreate() throws StripeException {
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
  public void testTransferReversalServiceCreate() throws StripeException {
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
  public void testTransferReversalRetrieve() throws StripeException {
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
  public void testTransferReversalServiceRetrieve() throws StripeException {
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
  public void testTransferReversalUpdate() throws StripeException {
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
  public void testTransferReversalServiceUpdate() throws StripeException {
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
  public void testCreditReversalList() throws StripeException {
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
  public void testCreditReversalServiceList() throws StripeException {
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
  public void testCreditReversalCreate() throws StripeException {
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
  public void testCreditReversalServiceCreate() throws StripeException {
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
  public void testCreditReversalRetrieve() throws StripeException {
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
  public void testCreditReversalServiceRetrieve() throws StripeException {
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
  public void testDebitReversalList() throws StripeException {
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
  public void testDebitReversalServiceList() throws StripeException {
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
  public void testDebitReversalCreate() throws StripeException {
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
  public void testDebitReversalServiceCreate() throws StripeException {
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
  public void testDebitReversalRetrieve() throws StripeException {
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
  public void testDebitReversalServiceRetrieve() throws StripeException {
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
  public void testFinancialAccountList() throws StripeException {
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
  public void testFinancialAccountServiceList() throws StripeException {
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
  public void testFinancialAccountCreate() throws StripeException {
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
  public void testFinancialAccountServiceCreate() throws StripeException {
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
  public void testFinancialAccountRetrieve() throws StripeException {
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
  public void testFinancialAccountServiceRetrieve() throws StripeException {
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
  public void testFinancialAccountUpdate() throws StripeException {
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
  public void testFinancialAccountServiceUpdate() throws StripeException {
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
  public void testFinancialAccountRetrieveFeatures() throws StripeException {
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
  public void testFinancialAccountFeaturesServiceList() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.treasury.FinancialAccountFeaturesListParams params =
        com.stripe.param.treasury.FinancialAccountFeaturesListParams.builder().build();

    com.stripe.model.treasury.FinancialAccountFeatures financialAccountFeatures =
        client.treasury().financialAccounts().features().list("fa_xxxxxxxxxxxxx", params);
    assertNotNull(financialAccountFeatures);
    verifyRequest(
        BaseAddress.API,
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx/features",
        params.toMap(),
        null);
  }

  @Test
  public void testInboundTransferList() throws StripeException {
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
  public void testInboundTransferServiceList() throws StripeException {
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
  public void testInboundTransferCreate() throws StripeException {
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
  public void testInboundTransferServiceCreate() throws StripeException {
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
  public void testInboundTransferRetrieve() throws StripeException {
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
  public void testInboundTransferServiceRetrieve() throws StripeException {
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
  public void testInboundTransferCancel() throws StripeException {
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
  public void testInboundTransferServiceCancel() throws StripeException {
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
  public void testOutboundPaymentList() throws StripeException {
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
  public void testOutboundPaymentServiceList() throws StripeException {
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
  public void testOutboundPaymentCreate() throws StripeException {
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
  public void testOutboundPaymentServiceCreate() throws StripeException {
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
  public void testOutboundPaymentRetrieve() throws StripeException {
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
  public void testOutboundPaymentServiceRetrieve() throws StripeException {
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
  public void testOutboundPaymentCancel() throws StripeException {
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
  public void testOutboundPaymentServiceCancel() throws StripeException {
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
  public void testOutboundTransferList() throws StripeException {
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
  public void testOutboundTransferServiceList() throws StripeException {
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
  public void testOutboundTransferCreate() throws StripeException {
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
  public void testOutboundTransferServiceCreate() throws StripeException {
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
  public void testOutboundTransferRetrieve() throws StripeException {
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
  public void testOutboundTransferServiceRetrieve() throws StripeException {
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
  public void testOutboundTransferCancel() throws StripeException {
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
  public void testOutboundTransferServiceCancel() throws StripeException {
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
  public void testReceivedCreditList() throws StripeException {
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
  public void testReceivedCreditServiceList() throws StripeException {
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
  public void testReceivedCreditRetrieve() throws StripeException {
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
  public void testReceivedCreditServiceRetrieve() throws StripeException {
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
  public void testReceivedDebitList() throws StripeException {
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
  public void testReceivedDebitServiceList() throws StripeException {
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
  public void testReceivedDebitRetrieve() throws StripeException {
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
  public void testReceivedDebitServiceRetrieve() throws StripeException {
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
  public void testTransactionEntryList() throws StripeException {
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
  public void testTransactionEntryServiceList() throws StripeException {
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
  public void testTransactionEntryRetrieve() throws StripeException {
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
  public void testTransactionEntryServiceRetrieve() throws StripeException {
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
  public void testTransactionList2() throws StripeException {
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
  public void testTransactionServiceList2() throws StripeException {
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
  public void testTransactionRetrieve2() throws StripeException {
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
  public void testTransactionServiceRetrieve2() throws StripeException {
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
  public void testWebhookEndpointList() throws StripeException {
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
  public void testWebhookEndpointServiceList() throws StripeException {
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
  public void testWebhookEndpointCreate() throws StripeException {
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
  public void testWebhookEndpointServiceCreate() throws StripeException {
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
  public void testWebhookEndpointDelete() throws StripeException {
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
  public void testWebhookEndpointServiceDelete() throws StripeException {
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
  public void testWebhookEndpointRetrieve() throws StripeException {
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
  public void testWebhookEndpointServiceRetrieve() throws StripeException {
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
  public void testWebhookEndpointUpdate() throws StripeException {
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
  public void testWebhookEndpointServiceUpdate() throws StripeException {
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
  public void testTransactionCreateFromCalculation() throws StripeException {
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
  public void testTransactionServiceCreateFromCalculation() throws StripeException {
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
  public void testPaymentIntentCreate3() throws StripeException {
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
  public void testPaymentIntentServiceCreate3() throws StripeException {
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
  public void testQuoteListLineItems() throws StripeException {
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
  public void testQuoteLineItemServiceList() throws StripeException {
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
  public void testCalculationCreate() throws StripeException {
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
  public void testCalculationServiceCreate() throws StripeException {
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
  public void testCreditNotePreviewLinesServiceList() throws StripeException {
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
  public void testQuotePdf() throws StripeException {
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
  public void testQuoteServicePdf() throws StripeException {
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
  public void testFormPdf() throws StripeException {
    com.stripe.model.tax.Form resource = com.stripe.model.tax.Form.retrieve("form_xxxxxxxxxxxxx");

    com.stripe.param.tax.FormPdfParams params =
        com.stripe.param.tax.FormPdfParams.builder().build();

    java.io.InputStream file = resource.pdf(params);
    assertNotNull(file);
    verifyRequest(
        BaseAddress.FILES,
        ApiResource.RequestMethod.GET,
        "/v1/tax/forms/form_xxxxxxxxxxxxx/pdf",
        params.toMap(),
        null);
  }

  @Test
  public void testFormServicePdf() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);

    com.stripe.param.tax.FormPdfParams params =
        com.stripe.param.tax.FormPdfParams.builder().build();

    java.io.InputStream inputStream = client.tax().forms().pdf("form_xxxxxxxxxxxxx", params);
    assertNotNull(inputStream);
    verifyRequest(
        BaseAddress.FILES,
        ApiResource.RequestMethod.GET,
        "/v1/tax/forms/form_xxxxxxxxxxxxx/pdf",
        params.toMap(),
        null);
  }

  @Test
  public void testPaymentMethodConfigurationList() throws StripeException {
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
  public void testPaymentMethodConfigurationServiceList() throws StripeException {
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
  public void testPaymentMethodConfigurationCreate() throws StripeException {
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
  public void testPaymentMethodConfigurationServiceCreate() throws StripeException {
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
  public void testPaymentMethodConfigurationRetrieve() throws StripeException {
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
  public void testPaymentMethodConfigurationServiceRetrieve() throws StripeException {
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
  public void testPaymentMethodConfigurationUpdate() throws StripeException {
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
  public void testPaymentMethodConfigurationServiceUpdate() throws StripeException {
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
  public void testAuthorizationCreate() throws StripeException {
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
  public void testAuthorizationServiceCreate() throws StripeException {
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
  public void testAuthorizationCapture() throws StripeException {
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
                            .setVolumeDecimal(new BigDecimal("10"))
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
  public void testAuthorizationServiceCapture() throws StripeException {
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
                            .setVolumeDecimal(new BigDecimal("10"))
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
  public void testAuthorizationExpire() throws StripeException {
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
  public void testAuthorizationServiceExpire() throws StripeException {
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
  public void testAuthorizationIncrement() throws StripeException {
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
  public void testAuthorizationServiceIncrement() throws StripeException {
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
  public void testAuthorizationReverse() throws StripeException {
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
  public void testAuthorizationServiceReverse() throws StripeException {
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
  public void testTransactionCreateForceCapture() throws StripeException {
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
                            .setVolumeDecimal(new BigDecimal("10"))
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
  public void testTransactionServiceCreateForceCapture() throws StripeException {
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
                            .setVolumeDecimal(new BigDecimal("10"))
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
  public void testTransactionCreateUnlinkedRefund() throws StripeException {
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
                            .setVolumeDecimal(new BigDecimal("10"))
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
  public void testTransactionServiceCreateUnlinkedRefund() throws StripeException {
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
                            .setVolumeDecimal(new BigDecimal("10"))
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
  public void testTransactionRefund() throws StripeException {
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
  public void testTransactionServiceRefund() throws StripeException {
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
}
