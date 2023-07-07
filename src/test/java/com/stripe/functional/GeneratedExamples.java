// File generated from our OpenAPI spec
package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.*;
import com.stripe.net.ApiResource;
import com.stripe.param.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class GeneratedExamples extends BaseStripeTest {
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/apps/secrets/delete", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/apps/secrets/find", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/checkout/sessions", params.toMap());
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
        ApiResource.RequestMethod.POST, "/v1/checkout/sessions/sess_xyz/expire", params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_123/funding_instructions",
        params.toMap());
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
        ApiResource.RequestMethod.GET, "/v1/customers/cus_xyz/payment_methods", params.toMap());
  }

  @Test
  public void testAccountList() throws StripeException {
    com.stripe.param.financialconnections.AccountListParams params =
        com.stripe.param.financialconnections.AccountListParams.builder().build();

    com.stripe.model.financialconnections.AccountCollection accounts =
        com.stripe.model.financialconnections.Account.list(params);
    assertNotNull(accounts);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/financial_connections/accounts", params.toMap());
  }

  @Test
  public void testAccountRetrieve() throws StripeException {
    com.stripe.model.financialconnections.Account account =
        com.stripe.model.financialconnections.Account.retrieve("fca_xyz");
    assertNotNull(account);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/financial_connections/accounts/fca_xyz");
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
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/disconnect",
        params.toMap());
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
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xyz/owners",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xyz/refresh",
        params.toMap());
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
        ApiResource.RequestMethod.POST, "/v1/financial_connections/sessions", params.toMap());
  }

  @Test
  public void testSessionRetrieve() throws StripeException {
    com.stripe.model.financialconnections.Session session =
        com.stripe.model.financialconnections.Session.retrieve("fcsess_xyz");
    assertNotNull(session);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/financial_connections/sessions/fcsess_xyz");
  }

  @Test
  public void testInvoiceUpcoming() throws StripeException {
    InvoiceUpcomingParams params =
        InvoiceUpcomingParams.builder().setCustomer("cus_9utnxg47pWjV1e").build();

    Invoice invoice = Invoice.upcoming(params);
    assertNotNull(invoice);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/invoices/upcoming", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/payment_intents", params.toMap());
  }

  @Test
  public void testPaymentIntentVerifyMicrodeposits() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentVerifyMicrodepositsParams params =
        PaymentIntentVerifyMicrodepositsParams.builder().build();

    PaymentIntent paymentIntent = resource.verifyMicrodeposits(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap());
  }

  @Test
  public void testPaymentLinkRetrieve() throws StripeException {
    PaymentLink paymentLink = PaymentLink.retrieve("pl_xyz");
    assertNotNull(paymentLink);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_links/pl_xyz");
  }

  @Test
  public void testPaymentLinkListLineItems() throws StripeException {
    PaymentLink resource = PaymentLink.retrieve("pl_xyz");

    PaymentLinkListLineItemsParams params = PaymentLinkListLineItemsParams.builder().build();

    LineItemCollection lineItems = resource.listLineItems(params);
    assertNotNull(lineItems);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/payment_links/pl_xyz/line_items", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/prices", params.toMap());
  }

  @Test
  public void testSetupAttemptList() throws StripeException {
    SetupAttemptListParams params =
        SetupAttemptListParams.builder().setLimit(3L).setSetupIntent("si_xyz").build();

    SetupAttemptCollection setupAttempts = SetupAttempt.list(params);
    assertNotNull(setupAttempts);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/setup_attempts", params.toMap());
  }

  @Test
  public void testSetupIntentVerifyMicrodeposits() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentVerifyMicrodepositsParams params =
        SetupIntentVerifyMicrodepositsParams.builder().build();

    SetupIntent setupIntent = resource.verifyMicrodeposits(params);
    assertNotNull(setupIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap());
  }

  @Test
  public void testShippingRateList() throws StripeException {
    ShippingRateListParams params = ShippingRateListParams.builder().build();

    ShippingRateCollection shippingRates = ShippingRate.list(params);
    assertNotNull(shippingRates);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/shipping_rates", params.toMap());
  }

  @Test
  public void testConfigurationList() throws StripeException {
    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().build();

    com.stripe.model.terminal.ConfigurationCollection configurations =
        com.stripe.model.terminal.Configuration.list(params);
    assertNotNull(configurations);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/configurations", params.toMap());
  }

  @Test
  public void testConfigurationCreate() throws StripeException {
    com.stripe.param.terminal.ConfigurationCreateParams params =
        com.stripe.param.terminal.ConfigurationCreateParams.builder().build();

    com.stripe.model.terminal.Configuration configuration =
        com.stripe.model.terminal.Configuration.create(params);
    assertNotNull(configuration);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/terminal/configurations", params.toMap());
  }

  @Test
  public void testConfigurationDelete() throws StripeException {
    com.stripe.model.terminal.Configuration resource =
        com.stripe.model.terminal.Configuration.retrieve("uc_123");

    com.stripe.model.terminal.Configuration configuration = resource.delete();
    assertNotNull(configuration);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/terminal/configurations/uc_123");
  }

  @Test
  public void testConfigurationRetrieve() throws StripeException {
    com.stripe.model.terminal.Configuration configuration =
        com.stripe.model.terminal.Configuration.retrieve("uc_123");
    assertNotNull(configuration);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/configurations/uc_123");
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
        ApiResource.RequestMethod.POST, "/v1/terminal/configurations/uc_123", params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/customers/cus_123/fund_cash_balance",
        params.toMap());
  }

  @Test
  public void testCardDeliverCard() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardDeliverCardParams params =
        com.stripe.param.issuing.CardDeliverCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().deliverCard(params);
    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/deliver",
        params.toMap());
  }

  @Test
  public void testCardFailCard() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardFailCardParams params =
        com.stripe.param.issuing.CardFailCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().failCard(params);
    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/fail",
        params.toMap());
  }

  @Test
  public void testCardReturnCard() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardReturnCardParams params =
        com.stripe.param.issuing.CardReturnCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().returnCard(params);
    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/return",
        params.toMap());
  }

  @Test
  public void testCardShipCard() throws StripeException {
    com.stripe.model.issuing.Card resource = com.stripe.model.issuing.Card.retrieve("card_123");

    com.stripe.param.issuing.CardShipCardParams params =
        com.stripe.param.issuing.CardShipCardParams.builder().build();

    com.stripe.model.issuing.Card card = resource.getTestHelpers().shipCard(params);
    assertNotNull(card);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/issuing/cards/card_123/shipping/ship",
        params.toMap());
  }

  @Test
  public void testRefundExpire() throws StripeException {
    Refund resource = Refund.retrieve("re_123");

    RefundExpireParams params = RefundExpireParams.builder().build();

    Refund refund = resource.getTestHelpers().expire(params);
    assertNotNull(refund);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/test_helpers/refunds/re_123/expire", params.toMap());
  }

  @Test
  public void testTestClockList() throws StripeException {
    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().build();

    com.stripe.model.testhelpers.TestClockCollection testClocks =
        com.stripe.model.testhelpers.TestClock.list(params);
    assertNotNull(testClocks);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/test_helpers/test_clocks", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/test_helpers/test_clocks", params.toMap());
  }

  @Test
  public void testTestClockDelete() throws StripeException {
    com.stripe.model.testhelpers.TestClock resource =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xyz");

    com.stripe.model.testhelpers.TestClock testClock = resource.delete();
    assertNotNull(testClock);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/test_helpers/test_clocks/clock_xyz");
  }

  @Test
  public void testTestClockRetrieve() throws StripeException {
    com.stripe.model.testhelpers.TestClock testClock =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xyz");
    assertNotNull(testClock);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/test_helpers/test_clocks/clock_xyz");
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xyz/advance",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/fail",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/return",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/inbound_transfers/ibt_123/succeed",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/fail",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/post",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/outbound_transfers/obt_123/return",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_credits",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/treasury/received_debits",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/account_links", params.toMap());
  }

  @Test
  public void testAccountList2() throws StripeException {
    AccountListParams params = AccountListParams.builder().setLimit(3L).build();

    AccountCollection accounts = Account.list(params);
    assertNotNull(accounts);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/accounts", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/accounts", params.toMap());
  }

  @Test
  public void testAccountDelete() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    Account account = resource.delete();
    assertNotNull(account);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/accounts/acct_xxxxxxxxxxxxx");
  }

  @Test
  public void testAccountRetrieve2() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");
    assertNotNull(account);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/accounts/acct_xxxxxxxxxxxxx");
  }

  @Test
  public void testAccountUpdate() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountUpdateParams params =
        AccountUpdateParams.builder().putMetadata("order_id", "6735").build();

    Account account = resource.update(params);
    assertNotNull(account);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/accounts/acct_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testAccountReject() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountRejectParams params = AccountRejectParams.builder().setReason("fraud").build();

    Account account = resource.reject(params);
    assertNotNull(account);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/accounts/acct_xxxxxxxxxxxxx/reject", params.toMap());
  }

  @Test
  public void testAccountCapabilities() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountCapabilitiesParams params = AccountCapabilitiesParams.builder().build();

    CapabilityCollection capabilities = resource.capabilities(params);
    assertNotNull(capabilities);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities",
        params.toMap());
  }

  @Test
  public void testCapabilityRetrieve() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Capability capability = account.capabilities().retrieve("card_payments");
    assertNotNull(capability);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments");
  }

  @Test
  public void testCapabilityUpdate() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Capability resource = account.capabilities().retrieve("card_payments");

    CapabilityUpdateParams params = CapabilityUpdateParams.builder().setRequested(true).build();

    Capability capability = resource.update(params);
    assertNotNull(capability);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/capabilities/card_payments",
        params.toMap());
  }

  @Test
  public void testAccountPersons() throws StripeException {
    Account resource = Account.retrieve("acct_xxxxxxxxxxxxx");

    AccountPersonsParams params = AccountPersonsParams.builder().setLimit(3L).build();

    PersonCollection persons = resource.persons(params);
    assertNotNull(persons);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/accounts/acct_xxxxxxxxxxxxx/persons", params.toMap());
  }

  @Test
  public void testPersonCreate() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    PersonCollectionCreateParams params =
        PersonCollectionCreateParams.builder().setFirstName("Jane").setLastName("Diaz").build();

    Person person = account.persons().create(params);
    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/accounts/acct_xxxxxxxxxxxxx/persons", params.toMap());
  }

  @Test
  public void testPersonDelete() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Person resource = account.persons().retrieve("person_xxxxxxxxxxxxx");

    Person person = resource.delete();
    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx");
  }

  @Test
  public void testPersonRetrieve() throws StripeException {
    Account account = Account.retrieve("acct_xxxxxxxxxxxxx");

    Person person = account.persons().retrieve("person_xxxxxxxxxxxxx");
    assertNotNull(person);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/accounts/acct_xxxxxxxxxxxxx/persons/person_xxxxxxxxxxxxx",
        params.toMap());
  }

  @Test
  public void testApplicationFeeList() throws StripeException {
    ApplicationFeeListParams params = ApplicationFeeListParams.builder().setLimit(3L).build();

    ApplicationFeeCollection applicationFees = ApplicationFee.list(params);
    assertNotNull(applicationFees);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/application_fees", params.toMap());
  }

  @Test
  public void testApplicationFeeRetrieve() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");
    assertNotNull(applicationFee);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/application_fees/fee_xxxxxxxxxxxxx");
  }

  @Test
  public void testFeeRefundList() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");

    FeeRefundCollectionListParams params =
        FeeRefundCollectionListParams.builder().setLimit(3L).build();

    FeeRefundCollection feeRefunds = applicationFee.getRefunds().list(params);
    assertNotNull(feeRefunds);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap());
  }

  @Test
  public void testFeeRefundCreate() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");

    FeeRefundCollectionCreateParams params = FeeRefundCollectionCreateParams.builder().build();

    FeeRefund feeRefund = applicationFee.getRefunds().create(params);
    assertNotNull(feeRefund);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds",
        params.toMap());
  }

  @Test
  public void testFeeRefundRetrieve() throws StripeException {
    ApplicationFee applicationFee = ApplicationFee.retrieve("fee_xxxxxxxxxxxxx");

    FeeRefund feeRefund = applicationFee.getRefunds().retrieve("fr_xxxxxxxxxxxxx");
    assertNotNull(feeRefund);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/application_fees/fee_xxxxxxxxxxxxx/refunds/fr_xxxxxxxxxxxxx",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/apps/secrets", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/apps/secrets", params.toMap());
  }

  @Test
  public void testBalanceTransactionList() throws StripeException {
    BalanceTransactionListParams params =
        BalanceTransactionListParams.builder().setLimit(3L).build();

    BalanceTransactionCollection balanceTransactions = BalanceTransaction.list(params);
    assertNotNull(balanceTransactions);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/balance_transactions", params.toMap());
  }

  @Test
  public void testBalanceTransactionRetrieve() throws StripeException {
    BalanceTransaction balanceTransaction = BalanceTransaction.retrieve("txn_xxxxxxxxxxxxx");
    assertNotNull(balanceTransaction);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/balance_transactions/txn_xxxxxxxxxxxxx");
  }

  @Test
  public void testConfigurationList2() throws StripeException {
    com.stripe.param.billingportal.ConfigurationListParams params =
        com.stripe.param.billingportal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.billingportal.ConfigurationCollection configurations =
        com.stripe.model.billingportal.Configuration.list(params);
    assertNotNull(configurations);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/billing_portal/configurations", params.toMap());
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
        ApiResource.RequestMethod.POST, "/v1/billing_portal/configurations", params.toMap());
  }

  @Test
  public void testConfigurationRetrieve2() throws StripeException {
    com.stripe.model.billingportal.Configuration configuration =
        com.stripe.model.billingportal.Configuration.retrieve("bpc_xxxxxxxxxxxxx");
    assertNotNull(configuration);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/billing_portal/configurations/bpc_xxxxxxxxxxxxx",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/billing_portal/sessions", params.toMap());
  }

  @Test
  public void testChargeList() throws StripeException {
    ChargeListParams params = ChargeListParams.builder().setLimit(3L).build();

    ChargeCollection charges = Charge.list(params);
    assertNotNull(charges);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/charges", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/charges", params.toMap());
  }

  @Test
  public void testChargeRetrieve() throws StripeException {
    Charge charge = Charge.retrieve("ch_xxxxxxxxxxxxx");
    assertNotNull(charge);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/charges/ch_xxxxxxxxxxxxx");
  }

  @Test
  public void testChargeUpdate() throws StripeException {
    Charge resource = Charge.retrieve("ch_xxxxxxxxxxxxx");

    ChargeUpdateParams params =
        ChargeUpdateParams.builder().putMetadata("order_id", "6735").build();

    Charge charge = resource.update(params);
    assertNotNull(charge);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/charges/ch_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testChargeCapture() throws StripeException {
    Charge resource = Charge.retrieve("ch_xxxxxxxxxxxxx");

    ChargeCaptureParams params = ChargeCaptureParams.builder().build();

    Charge charge = resource.capture(params);
    assertNotNull(charge);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/charges/ch_xxxxxxxxxxxxx/capture", params.toMap());
  }

  @Test
  public void testChargeSearch() throws StripeException {
    ChargeSearchParams params =
        ChargeSearchParams.builder().setQuery("amount>999 AND metadata['order_id']:'6735'").build();

    ChargeSearchResult charges = Charge.search(params);
    assertNotNull(charges);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/charges/search", params.toMap());
  }

  @Test
  public void testSessionList() throws StripeException {
    com.stripe.param.checkout.SessionListParams params =
        com.stripe.param.checkout.SessionListParams.builder().setLimit(3L).build();

    com.stripe.model.checkout.SessionCollection sessions =
        com.stripe.model.checkout.Session.list(params);
    assertNotNull(sessions);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/checkout/sessions", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/checkout/sessions", params.toMap());
  }

  @Test
  public void testSessionRetrieve2() throws StripeException {
    com.stripe.model.checkout.Session session =
        com.stripe.model.checkout.Session.retrieve("cs_test_xxxxxxxxxxxxx");
    assertNotNull(session);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/checkout/sessions/cs_test_xxxxxxxxxxxxx/expire",
        params.toMap());
  }

  @Test
  public void testCountrySpecList() throws StripeException {
    CountrySpecListParams params = CountrySpecListParams.builder().setLimit(3L).build();

    CountrySpecCollection countrySpecs = CountrySpec.list(params);
    assertNotNull(countrySpecs);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/country_specs", params.toMap());
  }

  @Test
  public void testCountrySpecRetrieve() throws StripeException {
    CountrySpec countrySpec = CountrySpec.retrieve("US");
    assertNotNull(countrySpec);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/country_specs/US");
  }

  @Test
  public void testCouponList() throws StripeException {
    CouponListParams params = CouponListParams.builder().setLimit(3L).build();

    CouponCollection coupons = Coupon.list(params);
    assertNotNull(coupons);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/coupons", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/coupons", params.toMap());
  }

  @Test
  public void testCouponDelete() throws StripeException {
    Coupon resource = Coupon.retrieve("Z4OV52SU");

    Coupon coupon = resource.delete();
    assertNotNull(coupon);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/coupons/Z4OV52SU");
  }

  @Test
  public void testCouponRetrieve() throws StripeException {
    Coupon coupon = Coupon.retrieve("Z4OV52SU");
    assertNotNull(coupon);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/coupons/Z4OV52SU");
  }

  @Test
  public void testCouponUpdate() throws StripeException {
    Coupon resource = Coupon.retrieve("Z4OV52SU");

    CouponUpdateParams params =
        CouponUpdateParams.builder().putMetadata("order_id", "6735").build();

    Coupon coupon = resource.update(params);
    assertNotNull(coupon);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/coupons/Z4OV52SU", params.toMap());
  }

  @Test
  public void testCreditNoteList() throws StripeException {
    CreditNoteListParams params = CreditNoteListParams.builder().setLimit(3L).build();

    CreditNoteCollection creditNotes = CreditNote.list(params);
    assertNotNull(creditNotes);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/credit_notes", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/credit_notes", params.toMap());
  }

  @Test
  public void testCreditNoteVoidCreditNote() throws StripeException {
    CreditNote resource = CreditNote.retrieve("cn_xxxxxxxxxxxxx");

    CreditNoteVoidCreditNoteParams params = CreditNoteVoidCreditNoteParams.builder().build();

    CreditNote creditNote = resource.voidCreditNote(params);
    assertNotNull(creditNote);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/credit_notes/cn_xxxxxxxxxxxxx/void", params.toMap());
  }

  @Test
  public void testCreditNoteLineItemList() throws StripeException {
    CreditNote creditNote = CreditNote.retrieve("cn_xxxxxxxxxxxxx");

    CreditNoteLineItemCollectionListParams params =
        CreditNoteLineItemCollectionListParams.builder().setLimit(3L).build();

    CreditNoteLineItemCollection creditNoteLineItems = creditNote.getLines().list(params);
    assertNotNull(creditNoteLineItems);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/credit_notes/cn_xxxxxxxxxxxxx/lines", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/credit_notes/preview", params.toMap());
  }

  @Test
  public void testCustomerList() throws StripeException {
    CustomerListParams params = CustomerListParams.builder().setLimit(3L).build();

    CustomerCollection customers = Customer.list(params);
    assertNotNull(customers);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/customers", params.toMap());
  }

  @Test
  public void testCustomerList2() throws StripeException {
    CustomerListParams params = CustomerListParams.builder().setLimit(3L).build();

    CustomerCollection customers = Customer.list(params);
    assertNotNull(customers);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/customers", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/customers", params.toMap());
  }

  @Test
  public void testCustomerDelete() throws StripeException {
    Customer resource = Customer.retrieve("cus_xxxxxxxxxxxxx");

    Customer customer = resource.delete();
    assertNotNull(customer);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/customers/cus_xxxxxxxxxxxxx");
  }

  @Test
  public void testCustomerRetrieve() throws StripeException {
    Customer customer = Customer.retrieve("cus_xxxxxxxxxxxxx");
    assertNotNull(customer);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/customers/cus_xxxxxxxxxxxxx");
  }

  @Test
  public void testCustomerUpdate() throws StripeException {
    Customer resource = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerUpdateParams params =
        CustomerUpdateParams.builder().putMetadata("order_id", "6735").build();

    Customer customer = resource.update(params);
    assertNotNull(customer);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/customers/cus_xxxxxxxxxxxxx", params.toMap());
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
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions",
        params.toMap());
  }

  @Test
  public void testCustomerBalanceTransactionRetrieve() throws StripeException {
    Customer customer = Customer.retrieve("cus_xxxxxxxxxxxxx");

    CustomerBalanceTransaction customerBalanceTransaction =
        customer.balanceTransactions().retrieve("cbtxn_xxxxxxxxxxxxx");
    assertNotNull(customerBalanceTransaction);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/customers/cus_xxxxxxxxxxxxx/balance_transactions/cbtxn_xxxxxxxxxxxxx",
        params.toMap());
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
        ApiResource.RequestMethod.GET,
        "/v1/customers/cus_xxxxxxxxxxxxx/payment_methods",
        params.toMap());
  }

  @Test
  public void testCustomerSearch() throws StripeException {
    CustomerSearchParams params =
        CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    CustomerSearchResult customers = Customer.search(params);
    assertNotNull(customers);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/customers/search", params.toMap());
  }

  @Test
  public void testCustomerSearch2() throws StripeException {
    CustomerSearchParams params =
        CustomerSearchParams.builder()
            .setQuery("name:'fakename' AND metadata['foo']:'bar'")
            .build();

    CustomerSearchResult customers = Customer.search(params);
    assertNotNull(customers);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/customers/search", params.toMap());
  }

  @Test
  public void testDisputeList() throws StripeException {
    DisputeListParams params = DisputeListParams.builder().setLimit(3L).build();

    DisputeCollection disputes = Dispute.list(params);
    assertNotNull(disputes);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/disputes", params.toMap());
  }

  @Test
  public void testDisputeRetrieve() throws StripeException {
    Dispute dispute = Dispute.retrieve("dp_xxxxxxxxxxxxx");
    assertNotNull(dispute);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/disputes/dp_xxxxxxxxxxxxx");
  }

  @Test
  public void testDisputeUpdate() throws StripeException {
    Dispute resource = Dispute.retrieve("dp_xxxxxxxxxxxxx");

    DisputeUpdateParams params =
        DisputeUpdateParams.builder().putMetadata("order_id", "6735").build();

    Dispute dispute = resource.update(params);
    assertNotNull(dispute);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/disputes/dp_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testDisputeClose() throws StripeException {
    Dispute resource = Dispute.retrieve("dp_xxxxxxxxxxxxx");

    DisputeCloseParams params = DisputeCloseParams.builder().build();

    Dispute dispute = resource.close(params);
    assertNotNull(dispute);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/disputes/dp_xxxxxxxxxxxxx/close", params.toMap());
  }

  @Test
  public void testEventList() throws StripeException {
    EventListParams params = EventListParams.builder().setLimit(3L).build();

    EventCollection events = Event.list(params);
    assertNotNull(events);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/events", params.toMap());
  }

  @Test
  public void testEventRetrieve() throws StripeException {
    Event event = Event.retrieve("evt_xxxxxxxxxxxxx");
    assertNotNull(event);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/events/evt_xxxxxxxxxxxxx");
  }

  @Test
  public void testFileLinkList() throws StripeException {
    FileLinkListParams params = FileLinkListParams.builder().setLimit(3L).build();

    FileLinkCollection fileLinks = FileLink.list(params);
    assertNotNull(fileLinks);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/file_links", params.toMap());
  }

  @Test
  public void testFileLinkCreate() throws StripeException {
    FileLinkCreateParams params =
        FileLinkCreateParams.builder().setFile("file_xxxxxxxxxxxxx").build();

    FileLink fileLink = FileLink.create(params);
    assertNotNull(fileLink);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/file_links", params.toMap());
  }

  @Test
  public void testFileLinkRetrieve() throws StripeException {
    FileLink fileLink = FileLink.retrieve("link_xxxxxxxxxxxxx");
    assertNotNull(fileLink);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/file_links/link_xxxxxxxxxxxxx");
  }

  @Test
  public void testFileLinkUpdate() throws StripeException {
    FileLink resource = FileLink.retrieve("link_xxxxxxxxxxxxx");

    FileLinkUpdateParams params =
        FileLinkUpdateParams.builder().putMetadata("order_id", "6735").build();

    FileLink fileLink = resource.update(params);
    assertNotNull(fileLink);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/file_links/link_xxxxxxxxxxxxx", params.toMap());
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
        ApiResource.RequestMethod.GET, "/v1/financial_connections/accounts", params.toMap());
  }

  @Test
  public void testAccountRetrieve3() throws StripeException {
    com.stripe.model.financialconnections.Account account =
        com.stripe.model.financialconnections.Account.retrieve("fca_xxxxxxxxxxxxx");
    assertNotNull(account);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/disconnect",
        params.toMap());
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
        ApiResource.RequestMethod.GET,
        "/v1/financial_connections/accounts/fca_xxxxxxxxxxxxx/owners",
        params.toMap());
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
        ApiResource.RequestMethod.POST, "/v1/financial_connections/sessions", params.toMap());
  }

  @Test
  public void testSessionRetrieve3() throws StripeException {
    com.stripe.model.financialconnections.Session session =
        com.stripe.model.financialconnections.Session.retrieve("fcsess_xxxxxxxxxxxxx");
    assertNotNull(session);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/financial_connections/sessions/fcsess_xxxxxxxxxxxxx");
  }

  @Test
  public void testVerificationReportList() throws StripeException {
    com.stripe.param.identity.VerificationReportListParams params =
        com.stripe.param.identity.VerificationReportListParams.builder().setLimit(3L).build();

    com.stripe.model.identity.VerificationReportCollection verificationReports =
        com.stripe.model.identity.VerificationReport.list(params);
    assertNotNull(verificationReports);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/identity/verification_reports", params.toMap());
  }

  @Test
  public void testVerificationReportRetrieve() throws StripeException {
    com.stripe.model.identity.VerificationReport verificationReport =
        com.stripe.model.identity.VerificationReport.retrieve("vr_xxxxxxxxxxxxx");
    assertNotNull(verificationReport);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/identity/verification_reports/vr_xxxxxxxxxxxxx");
  }

  @Test
  public void testVerificationSessionList() throws StripeException {
    com.stripe.param.identity.VerificationSessionListParams params =
        com.stripe.param.identity.VerificationSessionListParams.builder().setLimit(3L).build();

    com.stripe.model.identity.VerificationSessionCollection verificationSessions =
        com.stripe.model.identity.VerificationSession.list(params);
    assertNotNull(verificationSessions);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/identity/verification_sessions", params.toMap());
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
        ApiResource.RequestMethod.POST, "/v1/identity/verification_sessions", params.toMap());
  }

  @Test
  public void testVerificationSessionRetrieve() throws StripeException {
    com.stripe.model.identity.VerificationSession verificationSession =
        com.stripe.model.identity.VerificationSession.retrieve("vs_xxxxxxxxxxxxx");
    assertNotNull(verificationSession);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/cancel",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/identity/verification_sessions/vs_xxxxxxxxxxxxx/redact",
        params.toMap());
  }

  @Test
  public void testInvoiceItemList() throws StripeException {
    InvoiceItemListParams params = InvoiceItemListParams.builder().setLimit(3L).build();

    InvoiceItemCollection invoiceItems = InvoiceItem.list(params);
    assertNotNull(invoiceItems);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/invoiceitems", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/invoiceitems", params.toMap());
  }

  @Test
  public void testInvoiceItemDelete() throws StripeException {
    InvoiceItem resource = InvoiceItem.retrieve("ii_xxxxxxxxxxxxx");

    InvoiceItem invoiceItem = resource.delete();
    assertNotNull(invoiceItem);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/invoiceitems/ii_xxxxxxxxxxxxx");
  }

  @Test
  public void testInvoiceItemRetrieve() throws StripeException {
    InvoiceItem invoiceItem = InvoiceItem.retrieve("ii_xxxxxxxxxxxxx");
    assertNotNull(invoiceItem);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/invoiceitems/ii_xxxxxxxxxxxxx");
  }

  @Test
  public void testInvoiceItemUpdate() throws StripeException {
    InvoiceItem resource = InvoiceItem.retrieve("ii_xxxxxxxxxxxxx");

    InvoiceItemUpdateParams params =
        InvoiceItemUpdateParams.builder().putMetadata("order_id", "6735").build();

    InvoiceItem invoiceItem = resource.update(params);
    assertNotNull(invoiceItem);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/invoiceitems/ii_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testInvoiceList() throws StripeException {
    InvoiceListParams params = InvoiceListParams.builder().setLimit(3L).build();

    InvoiceCollection invoices = Invoice.list(params);
    assertNotNull(invoices);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/invoices", params.toMap());
  }

  @Test
  public void testInvoiceCreate() throws StripeException {
    InvoiceCreateParams params =
        InvoiceCreateParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    Invoice invoice = Invoice.create(params);
    assertNotNull(invoice);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/invoices", params.toMap());
  }

  @Test
  public void testInvoiceDelete() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    Invoice invoice = resource.delete();
    assertNotNull(invoice);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/invoices/in_xxxxxxxxxxxxx");
  }

  @Test
  public void testInvoiceRetrieve() throws StripeException {
    Invoice invoice = Invoice.retrieve("in_xxxxxxxxxxxxx");
    assertNotNull(invoice);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/invoices/in_xxxxxxxxxxxxx");
  }

  @Test
  public void testInvoiceRetrieve2() throws StripeException {
    InvoiceRetrieveParams params = InvoiceRetrieveParams.builder().addExpand("customer").build();

    Invoice invoice = Invoice.retrieve("in_xxxxxxxxxxxxx", params, null);
    assertNotNull(invoice);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/invoices/in_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testInvoiceUpdate() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceUpdateParams params =
        InvoiceUpdateParams.builder().putMetadata("order_id", "6735").build();

    Invoice invoice = resource.update(params);
    assertNotNull(invoice);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/invoices/in_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testInvoiceFinalizeInvoice() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceFinalizeInvoiceParams params = InvoiceFinalizeInvoiceParams.builder().build();

    Invoice invoice = resource.finalizeInvoice(params);
    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/invoices/in_xxxxxxxxxxxxx/finalize", params.toMap());
  }

  @Test
  public void testInvoiceMarkUncollectible() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceMarkUncollectibleParams params = InvoiceMarkUncollectibleParams.builder().build();

    Invoice invoice = resource.markUncollectible(params);
    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/invoices/in_xxxxxxxxxxxxx/mark_uncollectible",
        params.toMap());
  }

  @Test
  public void testInvoicePay() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoicePayParams params = InvoicePayParams.builder().build();

    Invoice invoice = resource.pay(params);
    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/invoices/in_xxxxxxxxxxxxx/pay", params.toMap());
  }

  @Test
  public void testInvoiceSendInvoice() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceSendInvoiceParams params = InvoiceSendInvoiceParams.builder().build();

    Invoice invoice = resource.sendInvoice(params);
    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/invoices/in_xxxxxxxxxxxxx/send", params.toMap());
  }

  @Test
  public void testInvoiceVoidInvoice() throws StripeException {
    Invoice resource = Invoice.retrieve("in_xxxxxxxxxxxxx");

    InvoiceVoidInvoiceParams params = InvoiceVoidInvoiceParams.builder().build();

    Invoice invoice = resource.voidInvoice(params);
    assertNotNull(invoice);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/invoices/in_xxxxxxxxxxxxx/void", params.toMap());
  }

  @Test
  public void testInvoiceSearch() throws StripeException {
    InvoiceSearchParams params =
        InvoiceSearchParams.builder().setQuery("total>999 AND metadata['order_id']:'6735'").build();

    InvoiceSearchResult invoices = Invoice.search(params);
    assertNotNull(invoices);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/invoices/search", params.toMap());
  }

  @Test
  public void testAuthorizationList() throws StripeException {
    com.stripe.param.issuing.AuthorizationListParams params =
        com.stripe.param.issuing.AuthorizationListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.AuthorizationCollection authorizations =
        com.stripe.model.issuing.Authorization.list(params);
    assertNotNull(authorizations);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/authorizations", params.toMap());
  }

  @Test
  public void testAuthorizationRetrieve() throws StripeException {
    com.stripe.model.issuing.Authorization authorization =
        com.stripe.model.issuing.Authorization.retrieve("iauth_xxxxxxxxxxxxx");
    assertNotNull(authorization);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/approve",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/issuing/authorizations/iauth_xxxxxxxxxxxxx/decline",
        params.toMap());
  }

  @Test
  public void testCardholderList() throws StripeException {
    com.stripe.param.issuing.CardholderListParams params =
        com.stripe.param.issuing.CardholderListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.CardholderCollection cardholders =
        com.stripe.model.issuing.Cardholder.list(params);
    assertNotNull(cardholders);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/cardholders", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/issuing/cardholders", params.toMap());
  }

  @Test
  public void testCardholderRetrieve() throws StripeException {
    com.stripe.model.issuing.Cardholder cardholder =
        com.stripe.model.issuing.Cardholder.retrieve("ich_xxxxxxxxxxxxx");
    assertNotNull(cardholder);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/issuing/cardholders/ich_xxxxxxxxxxxxx",
        params.toMap());
  }

  @Test
  public void testCardList() throws StripeException {
    com.stripe.param.issuing.CardListParams params =
        com.stripe.param.issuing.CardListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.CardCollection cards = com.stripe.model.issuing.Card.list(params);
    assertNotNull(cards);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/cards", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/issuing/cards", params.toMap());
  }

  @Test
  public void testCardRetrieve() throws StripeException {
    com.stripe.model.issuing.Card card = com.stripe.model.issuing.Card.retrieve("ic_xxxxxxxxxxxxx");
    assertNotNull(card);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/cards/ic_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST, "/v1/issuing/cards/ic_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testDisputeList2() throws StripeException {
    com.stripe.param.issuing.DisputeListParams params =
        com.stripe.param.issuing.DisputeListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.DisputeCollection disputes =
        com.stripe.model.issuing.Dispute.list(params);
    assertNotNull(disputes);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/disputes", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/issuing/disputes", params.toMap());
  }

  @Test
  public void testDisputeRetrieve2() throws StripeException {
    com.stripe.model.issuing.Dispute dispute =
        com.stripe.model.issuing.Dispute.retrieve("idp_xxxxxxxxxxxxx");
    assertNotNull(dispute);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/disputes/idp_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/issuing/disputes/idp_xxxxxxxxxxxxx/submit",
        params.toMap());
  }

  @Test
  public void testTransactionList() throws StripeException {
    com.stripe.param.issuing.TransactionListParams params =
        com.stripe.param.issuing.TransactionListParams.builder().setLimit(3L).build();

    com.stripe.model.issuing.TransactionCollection transactions =
        com.stripe.model.issuing.Transaction.list(params);
    assertNotNull(transactions);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/transactions", params.toMap());
  }

  @Test
  public void testTransactionRetrieve() throws StripeException {
    com.stripe.model.issuing.Transaction transaction =
        com.stripe.model.issuing.Transaction.retrieve("ipi_xxxxxxxxxxxxx");
    assertNotNull(transaction);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/issuing/transactions/ipi_xxxxxxxxxxxxx",
        params.toMap());
  }

  @Test
  public void testMandateRetrieve() throws StripeException {
    Mandate mandate = Mandate.retrieve("mandate_xxxxxxxxxxxxx");
    assertNotNull(mandate);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/mandates/mandate_xxxxxxxxxxxxx");
  }

  @Test
  public void testPaymentIntentList() throws StripeException {
    PaymentIntentListParams params = PaymentIntentListParams.builder().setLimit(3L).build();

    PaymentIntentCollection paymentIntents = PaymentIntent.list(params);
    assertNotNull(paymentIntents);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_intents", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/payment_intents", params.toMap());
  }

  @Test
  public void testPaymentIntentRetrieve() throws StripeException {
    PaymentIntent paymentIntent = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");
    assertNotNull(paymentIntent);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_intents/pi_xxxxxxxxxxxxx");
  }

  @Test
  public void testPaymentIntentUpdate() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentUpdateParams params =
        PaymentIntentUpdateParams.builder().putMetadata("order_id", "6735").build();

    PaymentIntent paymentIntent = resource.update(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/payment_intents/pi_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testPaymentIntentApplyCustomerBalance() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentApplyCustomerBalanceParams params =
        PaymentIntentApplyCustomerBalanceParams.builder().build();

    PaymentIntent paymentIntent = resource.applyCustomerBalance(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/apply_customer_balance",
        params.toMap());
  }

  @Test
  public void testPaymentIntentCancel() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentCancelParams params = PaymentIntentCancelParams.builder().build();

    PaymentIntent paymentIntent = resource.cancel(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/cancel",
        params.toMap());
  }

  @Test
  public void testPaymentIntentCapture() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentCaptureParams params = PaymentIntentCaptureParams.builder().build();

    PaymentIntent paymentIntent = resource.capture(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/capture",
        params.toMap());
  }

  @Test
  public void testPaymentIntentConfirm() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentConfirmParams params =
        PaymentIntentConfirmParams.builder().setPaymentMethod("pm_card_visa").build();

    PaymentIntent paymentIntent = resource.confirm(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/confirm",
        params.toMap());
  }

  @Test
  public void testPaymentIntentIncrementAuthorization() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentIncrementAuthorizationParams params =
        PaymentIntentIncrementAuthorizationParams.builder().setAmount(2099L).build();

    PaymentIntent paymentIntent = resource.incrementAuthorization(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/increment_authorization",
        params.toMap());
  }

  @Test
  public void testPaymentIntentVerifyMicrodeposits2() throws StripeException {
    PaymentIntent resource = PaymentIntent.retrieve("pi_xxxxxxxxxxxxx");

    PaymentIntentVerifyMicrodepositsParams params =
        PaymentIntentVerifyMicrodepositsParams.builder().addAmount(32L).addAmount(45L).build();

    PaymentIntent paymentIntent = resource.verifyMicrodeposits(params);
    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_intents/pi_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap());
  }

  @Test
  public void testPaymentIntentSearch() throws StripeException {
    PaymentIntentSearchParams params =
        PaymentIntentSearchParams.builder()
            .setQuery("status:'succeeded' AND metadata['order_id']:'6735'")
            .build();

    PaymentIntentSearchResult paymentIntents = PaymentIntent.search(params);
    assertNotNull(paymentIntents);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_intents/search", params.toMap());
  }

  @Test
  public void testPaymentLinkList() throws StripeException {
    PaymentLinkListParams params = PaymentLinkListParams.builder().setLimit(3L).build();

    PaymentLinkCollection paymentLinks = PaymentLink.list(params);
    assertNotNull(paymentLinks);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_links", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/payment_links", params.toMap());
  }

  @Test
  public void testPaymentLinkRetrieve2() throws StripeException {
    PaymentLink paymentLink = PaymentLink.retrieve("plink_xxxxxxxxxxxxx");
    assertNotNull(paymentLink);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_links/plink_xxxxxxxxxxxxx");
  }

  @Test
  public void testPaymentLinkUpdate() throws StripeException {
    PaymentLink resource = PaymentLink.retrieve("plink_xxxxxxxxxxxxx");

    PaymentLinkUpdateParams params = PaymentLinkUpdateParams.builder().setActive(false).build();

    PaymentLink paymentLink = resource.update(params);
    assertNotNull(paymentLink);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/payment_links/plink_xxxxxxxxxxxxx", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_methods", params.toMap());
  }

  @Test
  public void testPaymentMethodRetrieve() throws StripeException {
    PaymentMethod paymentMethod = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");
    assertNotNull(paymentMethod);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payment_methods/pm_xxxxxxxxxxxxx");
  }

  @Test
  public void testPaymentMethodUpdate() throws StripeException {
    PaymentMethod resource = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");

    PaymentMethodUpdateParams params =
        PaymentMethodUpdateParams.builder().putMetadata("order_id", "6735").build();

    PaymentMethod paymentMethod = resource.update(params);
    assertNotNull(paymentMethod);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/payment_methods/pm_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testPaymentMethodAttach() throws StripeException {
    PaymentMethod resource = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");

    PaymentMethodAttachParams params =
        PaymentMethodAttachParams.builder().setCustomer("cus_xxxxxxxxxxxxx").build();

    PaymentMethod paymentMethod = resource.attach(params);
    assertNotNull(paymentMethod);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/attach",
        params.toMap());
  }

  @Test
  public void testPaymentMethodDetach() throws StripeException {
    PaymentMethod resource = PaymentMethod.retrieve("pm_xxxxxxxxxxxxx");

    PaymentMethodDetachParams params = PaymentMethodDetachParams.builder().build();

    PaymentMethod paymentMethod = resource.detach(params);
    assertNotNull(paymentMethod);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/payment_methods/pm_xxxxxxxxxxxxx/detach",
        params.toMap());
  }

  @Test
  public void testPayoutList() throws StripeException {
    PayoutListParams params = PayoutListParams.builder().setLimit(3L).build();

    PayoutCollection payouts = Payout.list(params);
    assertNotNull(payouts);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payouts", params.toMap());
  }

  @Test
  public void testPayoutCreate() throws StripeException {
    PayoutCreateParams params =
        PayoutCreateParams.builder().setAmount(1100L).setCurrency("usd").build();

    Payout payout = Payout.create(params);
    assertNotNull(payout);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/payouts", params.toMap());
  }

  @Test
  public void testPayoutRetrieve() throws StripeException {
    Payout payout = Payout.retrieve("po_xxxxxxxxxxxxx");
    assertNotNull(payout);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/payouts/po_xxxxxxxxxxxxx");
  }

  @Test
  public void testPayoutUpdate() throws StripeException {
    Payout resource = Payout.retrieve("po_xxxxxxxxxxxxx");

    PayoutUpdateParams params =
        PayoutUpdateParams.builder().putMetadata("order_id", "6735").build();

    Payout payout = resource.update(params);
    assertNotNull(payout);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/payouts/po_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testPayoutCancel() throws StripeException {
    Payout resource = Payout.retrieve("po_xxxxxxxxxxxxx");

    PayoutCancelParams params = PayoutCancelParams.builder().build();

    Payout payout = resource.cancel(params);
    assertNotNull(payout);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/payouts/po_xxxxxxxxxxxxx/cancel", params.toMap());
  }

  @Test
  public void testPayoutReverse() throws StripeException {
    Payout resource = Payout.retrieve("po_xxxxxxxxxxxxx");

    PayoutReverseParams params = PayoutReverseParams.builder().build();

    Payout payout = resource.reverse(params);
    assertNotNull(payout);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/payouts/po_xxxxxxxxxxxxx/reverse", params.toMap());
  }

  @Test
  public void testPlanList() throws StripeException {
    PlanListParams params = PlanListParams.builder().setLimit(3L).build();

    PlanCollection plans = Plan.list(params);
    assertNotNull(plans);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/plans", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/plans", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/plans", params.toMap());
  }

  @Test
  public void testPlanDelete() throws StripeException {
    Plan resource = Plan.retrieve("price_xxxxxxxxxxxxx");

    Plan plan = resource.delete();
    assertNotNull(plan);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/plans/price_xxxxxxxxxxxxx");
  }

  @Test
  public void testPlanRetrieve() throws StripeException {
    Plan plan = Plan.retrieve("price_xxxxxxxxxxxxx");
    assertNotNull(plan);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/plans/price_xxxxxxxxxxxxx");
  }

  @Test
  public void testPlanUpdate() throws StripeException {
    Plan resource = Plan.retrieve("price_xxxxxxxxxxxxx");

    PlanUpdateParams params = PlanUpdateParams.builder().putMetadata("order_id", "6735").build();

    Plan plan = resource.update(params);
    assertNotNull(plan);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/plans/price_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testPriceList() throws StripeException {
    PriceListParams params = PriceListParams.builder().setLimit(3L).build();

    PriceCollection prices = Price.list(params);
    assertNotNull(prices);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/prices", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/prices", params.toMap());
  }

  @Test
  public void testPriceRetrieve() throws StripeException {
    Price price = Price.retrieve("price_xxxxxxxxxxxxx");
    assertNotNull(price);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/prices/price_xxxxxxxxxxxxx");
  }

  @Test
  public void testPriceUpdate() throws StripeException {
    Price resource = Price.retrieve("price_xxxxxxxxxxxxx");

    PriceUpdateParams params = PriceUpdateParams.builder().putMetadata("order_id", "6735").build();

    Price price = resource.update(params);
    assertNotNull(price);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/prices/price_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testPriceSearch() throws StripeException {
    PriceSearchParams params =
        PriceSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    PriceSearchResult prices = Price.search(params);
    assertNotNull(prices);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/prices/search", params.toMap());
  }

  @Test
  public void testProductList() throws StripeException {
    ProductListParams params = ProductListParams.builder().setLimit(3L).build();

    ProductCollection products = Product.list(params);
    assertNotNull(products);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/products", params.toMap());
  }

  @Test
  public void testProductCreate() throws StripeException {
    ProductCreateParams params = ProductCreateParams.builder().setName("Gold Special").build();

    Product product = Product.create(params);
    assertNotNull(product);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/products", params.toMap());
  }

  @Test
  public void testProductDelete() throws StripeException {
    Product resource = Product.retrieve("prod_xxxxxxxxxxxxx");

    Product product = resource.delete();
    assertNotNull(product);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/products/prod_xxxxxxxxxxxxx");
  }

  @Test
  public void testProductRetrieve() throws StripeException {
    Product product = Product.retrieve("prod_xxxxxxxxxxxxx");
    assertNotNull(product);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/products/prod_xxxxxxxxxxxxx");
  }

  @Test
  public void testProductUpdate() throws StripeException {
    Product resource = Product.retrieve("prod_xxxxxxxxxxxxx");

    ProductUpdateParams params =
        ProductUpdateParams.builder().putMetadata("order_id", "6735").build();

    Product product = resource.update(params);
    assertNotNull(product);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/products/prod_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testProductSearch() throws StripeException {
    ProductSearchParams params =
        ProductSearchParams.builder()
            .setQuery("active:'true' AND metadata['order_id']:'6735'")
            .build();

    ProductSearchResult products = Product.search(params);
    assertNotNull(products);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/products/search", params.toMap());
  }

  @Test
  public void testPromotionCodeList() throws StripeException {
    PromotionCodeListParams params = PromotionCodeListParams.builder().setLimit(3L).build();

    PromotionCodeCollection promotionCodes = PromotionCode.list(params);
    assertNotNull(promotionCodes);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/promotion_codes", params.toMap());
  }

  @Test
  public void testPromotionCodeCreate() throws StripeException {
    PromotionCodeCreateParams params =
        PromotionCodeCreateParams.builder().setCoupon("Z4OV52SU").build();

    PromotionCode promotionCode = PromotionCode.create(params);
    assertNotNull(promotionCode);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/promotion_codes", params.toMap());
  }

  @Test
  public void testPromotionCodeRetrieve() throws StripeException {
    PromotionCode promotionCode = PromotionCode.retrieve("promo_xxxxxxxxxxxxx");
    assertNotNull(promotionCode);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/promotion_codes/promo_xxxxxxxxxxxxx");
  }

  @Test
  public void testPromotionCodeUpdate() throws StripeException {
    PromotionCode resource = PromotionCode.retrieve("promo_xxxxxxxxxxxxx");

    PromotionCodeUpdateParams params =
        PromotionCodeUpdateParams.builder().putMetadata("order_id", "6735").build();

    PromotionCode promotionCode = resource.update(params);
    assertNotNull(promotionCode);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/promotion_codes/promo_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testQuoteList() throws StripeException {
    QuoteListParams params = QuoteListParams.builder().setLimit(3L).build();

    QuoteCollection quotes = Quote.list(params);
    assertNotNull(quotes);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/quotes", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/quotes", params.toMap());
  }

  @Test
  public void testQuoteRetrieve() throws StripeException {
    Quote quote = Quote.retrieve("qt_xxxxxxxxxxxxx");
    assertNotNull(quote);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/quotes/qt_xxxxxxxxxxxxx");
  }

  @Test
  public void testQuoteUpdate() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteUpdateParams params = QuoteUpdateParams.builder().putMetadata("order_id", "6735").build();

    Quote quote = resource.update(params);
    assertNotNull(quote);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/quotes/qt_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testQuoteAccept() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteAcceptParams params = QuoteAcceptParams.builder().build();

    Quote quote = resource.accept(params);
    assertNotNull(quote);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/quotes/qt_xxxxxxxxxxxxx/accept", params.toMap());
  }

  @Test
  public void testQuoteCancel() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteCancelParams params = QuoteCancelParams.builder().build();

    Quote quote = resource.cancel(params);
    assertNotNull(quote);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/quotes/qt_xxxxxxxxxxxxx/cancel", params.toMap());
  }

  @Test
  public void testQuoteFinalizeQuote() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteFinalizeQuoteParams params = QuoteFinalizeQuoteParams.builder().build();

    Quote quote = resource.finalizeQuote(params);
    assertNotNull(quote);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/quotes/qt_xxxxxxxxxxxxx/finalize", params.toMap());
  }

  @Test
  public void testEarlyFraudWarningList() throws StripeException {
    com.stripe.param.radar.EarlyFraudWarningListParams params =
        com.stripe.param.radar.EarlyFraudWarningListParams.builder().setLimit(3L).build();

    com.stripe.model.radar.EarlyFraudWarningCollection earlyFraudWarnings =
        com.stripe.model.radar.EarlyFraudWarning.list(params);
    assertNotNull(earlyFraudWarnings);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/radar/early_fraud_warnings", params.toMap());
  }

  @Test
  public void testEarlyFraudWarningRetrieve() throws StripeException {
    com.stripe.model.radar.EarlyFraudWarning earlyFraudWarning =
        com.stripe.model.radar.EarlyFraudWarning.retrieve("issfr_xxxxxxxxxxxxx");
    assertNotNull(earlyFraudWarning);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/radar/early_fraud_warnings/issfr_xxxxxxxxxxxxx");
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/radar/value_list_items", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/radar/value_list_items", params.toMap());
  }

  @Test
  public void testValueListItemDelete() throws StripeException {
    com.stripe.model.radar.ValueListItem resource =
        com.stripe.model.radar.ValueListItem.retrieve("rsli_xxxxxxxxxxxxx");

    com.stripe.model.radar.ValueListItem valueListItem = resource.delete();
    assertNotNull(valueListItem);
    verifyRequest(
        ApiResource.RequestMethod.DELETE, "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx");
  }

  @Test
  public void testValueListItemRetrieve() throws StripeException {
    com.stripe.model.radar.ValueListItem valueListItem =
        com.stripe.model.radar.ValueListItem.retrieve("rsli_xxxxxxxxxxxxx");
    assertNotNull(valueListItem);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/radar/value_list_items/rsli_xxxxxxxxxxxxx");
  }

  @Test
  public void testValueListList() throws StripeException {
    com.stripe.param.radar.ValueListListParams params =
        com.stripe.param.radar.ValueListListParams.builder().setLimit(3L).build();

    com.stripe.model.radar.ValueListCollection valueLists =
        com.stripe.model.radar.ValueList.list(params);
    assertNotNull(valueLists);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/radar/value_lists", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/radar/value_lists", params.toMap());
  }

  @Test
  public void testValueListDelete() throws StripeException {
    com.stripe.model.radar.ValueList resource =
        com.stripe.model.radar.ValueList.retrieve("rsl_xxxxxxxxxxxxx");

    com.stripe.model.radar.ValueList valueList = resource.delete();
    assertNotNull(valueList);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx");
  }

  @Test
  public void testValueListRetrieve() throws StripeException {
    com.stripe.model.radar.ValueList valueList =
        com.stripe.model.radar.ValueList.retrieve("rsl_xxxxxxxxxxxxx");
    assertNotNull(valueList);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST, "/v1/radar/value_lists/rsl_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testRefundList() throws StripeException {
    RefundListParams params = RefundListParams.builder().setLimit(3L).build();

    RefundCollection refunds = Refund.list(params);
    assertNotNull(refunds);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/refunds", params.toMap());
  }

  @Test
  public void testRefundCreate() throws StripeException {
    RefundCreateParams params = RefundCreateParams.builder().setCharge("ch_xxxxxxxxxxxxx").build();

    Refund refund = Refund.create(params);
    assertNotNull(refund);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/refunds", params.toMap());
  }

  @Test
  public void testRefundRetrieve() throws StripeException {
    Refund refund = Refund.retrieve("re_xxxxxxxxxxxxx");
    assertNotNull(refund);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/refunds/re_xxxxxxxxxxxxx");
  }

  @Test
  public void testRefundUpdate() throws StripeException {
    Refund resource = Refund.retrieve("re_xxxxxxxxxxxxx");

    RefundUpdateParams params =
        RefundUpdateParams.builder().putMetadata("order_id", "6735").build();

    Refund refund = resource.update(params);
    assertNotNull(refund);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/refunds/re_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testRefundCancel() throws StripeException {
    Refund resource = Refund.retrieve("re_xxxxxxxxxxxxx");

    RefundCancelParams params = RefundCancelParams.builder().build();

    Refund refund = resource.cancel(params);
    assertNotNull(refund);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/refunds/re_xxxxxxxxxxxxx/cancel", params.toMap());
  }

  @Test
  public void testReportRunList() throws StripeException {
    com.stripe.param.reporting.ReportRunListParams params =
        com.stripe.param.reporting.ReportRunListParams.builder().setLimit(3L).build();

    com.stripe.model.reporting.ReportRunCollection reportRuns =
        com.stripe.model.reporting.ReportRun.list(params);
    assertNotNull(reportRuns);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/reporting/report_runs", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/reporting/report_runs", params.toMap());
  }

  @Test
  public void testReportRunRetrieve() throws StripeException {
    com.stripe.model.reporting.ReportRun reportRun =
        com.stripe.model.reporting.ReportRun.retrieve("frr_xxxxxxxxxxxxx");
    assertNotNull(reportRun);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/reporting/report_runs/frr_xxxxxxxxxxxxx");
  }

  @Test
  public void testReportTypeList() throws StripeException {
    com.stripe.param.reporting.ReportTypeListParams params =
        com.stripe.param.reporting.ReportTypeListParams.builder().build();

    com.stripe.model.reporting.ReportTypeCollection reportTypes =
        com.stripe.model.reporting.ReportType.list(params);
    assertNotNull(reportTypes);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/reporting/report_types", params.toMap());
  }

  @Test
  public void testReportTypeRetrieve() throws StripeException {
    com.stripe.model.reporting.ReportType reportType =
        com.stripe.model.reporting.ReportType.retrieve("balance.summary.1");
    assertNotNull(reportType);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/reporting/report_types/balance.summary.1");
  }

  @Test
  public void testReviewList() throws StripeException {
    ReviewListParams params = ReviewListParams.builder().setLimit(3L).build();

    ReviewCollection reviews = Review.list(params);
    assertNotNull(reviews);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/reviews", params.toMap());
  }

  @Test
  public void testReviewRetrieve() throws StripeException {
    Review review = Review.retrieve("prv_xxxxxxxxxxxxx");
    assertNotNull(review);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/reviews/prv_xxxxxxxxxxxxx");
  }

  @Test
  public void testReviewApprove() throws StripeException {
    Review resource = Review.retrieve("prv_xxxxxxxxxxxxx");

    ReviewApproveParams params = ReviewApproveParams.builder().build();

    Review review = resource.approve(params);
    assertNotNull(review);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/reviews/prv_xxxxxxxxxxxxx/approve", params.toMap());
  }

  @Test
  public void testSetupIntentList() throws StripeException {
    SetupIntentListParams params = SetupIntentListParams.builder().setLimit(3L).build();

    SetupIntentCollection setupIntents = SetupIntent.list(params);
    assertNotNull(setupIntents);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/setup_intents", params.toMap());
  }

  @Test
  public void testSetupIntentCreate() throws StripeException {
    SetupIntentCreateParams params =
        SetupIntentCreateParams.builder().addPaymentMethodType("card").build();

    SetupIntent setupIntent = SetupIntent.create(params);
    assertNotNull(setupIntent);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/setup_intents", params.toMap());
  }

  @Test
  public void testSetupIntentRetrieve() throws StripeException {
    SetupIntent setupIntent = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");
    assertNotNull(setupIntent);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/setup_intents/seti_xxxxxxxxxxxxx");
  }

  @Test
  public void testSetupIntentUpdate() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentUpdateParams params =
        SetupIntentUpdateParams.builder().putMetadata("user_id", "3435453").build();

    SetupIntent setupIntent = resource.update(params);
    assertNotNull(setupIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/setup_intents/seti_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testSetupIntentCancel() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentCancelParams params = SetupIntentCancelParams.builder().build();

    SetupIntent setupIntent = resource.cancel(params);
    assertNotNull(setupIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/cancel",
        params.toMap());
  }

  @Test
  public void testSetupIntentConfirm() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentConfirmParams params =
        SetupIntentConfirmParams.builder().setPaymentMethod("pm_card_visa").build();

    SetupIntent setupIntent = resource.confirm(params);
    assertNotNull(setupIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/confirm",
        params.toMap());
  }

  @Test
  public void testSetupIntentVerifyMicrodeposits2() throws StripeException {
    SetupIntent resource = SetupIntent.retrieve("seti_xxxxxxxxxxxxx");

    SetupIntentVerifyMicrodepositsParams params =
        SetupIntentVerifyMicrodepositsParams.builder().addAmount(32L).addAmount(45L).build();

    SetupIntent setupIntent = resource.verifyMicrodeposits(params);
    assertNotNull(setupIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/setup_intents/seti_xxxxxxxxxxxxx/verify_microdeposits",
        params.toMap());
  }

  @Test
  public void testShippingRateList2() throws StripeException {
    ShippingRateListParams params = ShippingRateListParams.builder().setLimit(3L).build();

    ShippingRateCollection shippingRates = ShippingRate.list(params);
    assertNotNull(shippingRates);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/shipping_rates", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/shipping_rates", params.toMap());
  }

  @Test
  public void testShippingRateRetrieve() throws StripeException {
    ShippingRate shippingRate = ShippingRate.retrieve("shr_xxxxxxxxxxxxx");
    assertNotNull(shippingRate);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/shipping_rates/shr_xxxxxxxxxxxxx");
  }

  @Test
  public void testShippingRateUpdate() throws StripeException {
    ShippingRate resource = ShippingRate.retrieve("shr_xxxxxxxxxxxxx");

    ShippingRateUpdateParams params =
        ShippingRateUpdateParams.builder().putMetadata("order_id", "6735").build();

    ShippingRate shippingRate = resource.update(params);
    assertNotNull(shippingRate);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/shipping_rates/shr_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testScheduledQueryRunList() throws StripeException {
    com.stripe.param.sigma.ScheduledQueryRunListParams params =
        com.stripe.param.sigma.ScheduledQueryRunListParams.builder().setLimit(3L).build();

    com.stripe.model.sigma.ScheduledQueryRunCollection scheduledQueryRuns =
        com.stripe.model.sigma.ScheduledQueryRun.list(params);
    assertNotNull(scheduledQueryRuns);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/sigma/scheduled_query_runs", params.toMap());
  }

  @Test
  public void testScheduledQueryRunRetrieve() throws StripeException {
    com.stripe.model.sigma.ScheduledQueryRun scheduledQueryRun =
        com.stripe.model.sigma.ScheduledQueryRun.retrieve("sqr_xxxxxxxxxxxxx");
    assertNotNull(scheduledQueryRun);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/sigma/scheduled_query_runs/sqr_xxxxxxxxxxxxx");
  }

  @Test
  public void testSourceRetrieve() throws StripeException {
    Source source = Source.retrieve("src_xxxxxxxxxxxxx");
    assertNotNull(source);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/sources/src_xxxxxxxxxxxxx");
  }

  @Test
  public void testSourceRetrieve2() throws StripeException {
    Source source = Source.retrieve("src_xxxxxxxxxxxxx");
    assertNotNull(source);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/sources/src_xxxxxxxxxxxxx");
  }

  @Test
  public void testSourceUpdate() throws StripeException {
    Source resource = Source.retrieve("src_xxxxxxxxxxxxx");

    SourceUpdateParams params =
        SourceUpdateParams.builder().putMetadata("order_id", "6735").build();

    Source source = resource.update(params);
    assertNotNull(source);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/sources/src_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testSubscriptionItemList() throws StripeException {
    SubscriptionItemListParams params =
        SubscriptionItemListParams.builder().setSubscription("sub_xxxxxxxxxxxxx").build();

    SubscriptionItemCollection subscriptionItems = SubscriptionItem.list(params);
    assertNotNull(subscriptionItems);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/subscription_items", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/subscription_items", params.toMap());
  }

  @Test
  public void testSubscriptionItemDelete() throws StripeException {
    SubscriptionItem resource = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");

    SubscriptionItemDeleteParams params = SubscriptionItemDeleteParams.builder().build();

    SubscriptionItem subscriptionItem = resource.delete(params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        "/v1/subscription_items/si_xxxxxxxxxxxxx",
        params.toMap());
  }

  @Test
  public void testSubscriptionItemRetrieve() throws StripeException {
    SubscriptionItem subscriptionItem = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");
    assertNotNull(subscriptionItem);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/subscription_items/si_xxxxxxxxxxxxx");
  }

  @Test
  public void testSubscriptionItemUpdate() throws StripeException {
    SubscriptionItem resource = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");

    SubscriptionItemUpdateParams params =
        SubscriptionItemUpdateParams.builder().putMetadata("order_id", "6735").build();

    SubscriptionItem subscriptionItem = resource.update(params);
    assertNotNull(subscriptionItem);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/subscription_items/si_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testSubscriptionItemUsageRecordSummaries() throws StripeException {
    SubscriptionItem resource = SubscriptionItem.retrieve("si_xxxxxxxxxxxxx");

    SubscriptionItemUsageRecordSummariesParams params =
        SubscriptionItemUsageRecordSummariesParams.builder().setLimit(3L).build();

    UsageRecordSummaryCollection usageRecordSummaries = resource.usageRecordSummaries(params);
    assertNotNull(usageRecordSummaries);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/subscription_items/si_xxxxxxxxxxxxx/usage_record_summaries",
        params.toMap());
  }

  @Test
  public void testSubscriptionScheduleList() throws StripeException {
    SubscriptionScheduleListParams params =
        SubscriptionScheduleListParams.builder().setLimit(3L).build();

    SubscriptionScheduleCollection subscriptionSchedules = SubscriptionSchedule.list(params);
    assertNotNull(subscriptionSchedules);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/subscription_schedules", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/subscription_schedules", params.toMap());
  }

  @Test
  public void testSubscriptionScheduleRetrieve() throws StripeException {
    SubscriptionSchedule subscriptionSchedule =
        SubscriptionSchedule.retrieve("sub_sched_xxxxxxxxxxxxx");
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx",
        params.toMap());
  }

  @Test
  public void testSubscriptionScheduleCancel() throws StripeException {
    SubscriptionSchedule resource = SubscriptionSchedule.retrieve("sub_sched_xxxxxxxxxxxxx");

    SubscriptionScheduleCancelParams params = SubscriptionScheduleCancelParams.builder().build();

    SubscriptionSchedule subscriptionSchedule = resource.cancel(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/cancel",
        params.toMap());
  }

  @Test
  public void testSubscriptionScheduleRelease() throws StripeException {
    SubscriptionSchedule resource = SubscriptionSchedule.retrieve("sub_sched_xxxxxxxxxxxxx");

    SubscriptionScheduleReleaseParams params = SubscriptionScheduleReleaseParams.builder().build();

    SubscriptionSchedule subscriptionSchedule = resource.release(params);
    assertNotNull(subscriptionSchedule);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/subscription_schedules/sub_sched_xxxxxxxxxxxxx/release",
        params.toMap());
  }

  @Test
  public void testSubscriptionList() throws StripeException {
    SubscriptionListParams params = SubscriptionListParams.builder().setLimit(3L).build();

    SubscriptionCollection subscriptions = Subscription.list(params);
    assertNotNull(subscriptions);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/subscriptions", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/subscriptions", params.toMap());
  }

  @Test
  public void testSubscriptionCancel() throws StripeException {
    Subscription resource = Subscription.retrieve("sub_xxxxxxxxxxxxx");

    SubscriptionCancelParams params = SubscriptionCancelParams.builder().build();

    Subscription subscription = resource.cancel(params);
    assertNotNull(subscription);
    verifyRequest(
        ApiResource.RequestMethod.DELETE, "/v1/subscriptions/sub_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testSubscriptionRetrieve() throws StripeException {
    Subscription subscription = Subscription.retrieve("sub_xxxxxxxxxxxxx");
    assertNotNull(subscription);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/subscriptions/sub_xxxxxxxxxxxxx");
  }

  @Test
  public void testSubscriptionUpdate() throws StripeException {
    Subscription resource = Subscription.retrieve("sub_xxxxxxxxxxxxx");

    SubscriptionUpdateParams params =
        SubscriptionUpdateParams.builder().putMetadata("order_id", "6735").build();

    Subscription subscription = resource.update(params);
    assertNotNull(subscription);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/subscriptions/sub_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testSubscriptionSearch() throws StripeException {
    SubscriptionSearchParams params =
        SubscriptionSearchParams.builder()
            .setQuery("status:'active' AND metadata['order_id']:'6735'")
            .build();

    SubscriptionSearchResult subscriptions = Subscription.search(params);
    assertNotNull(subscriptions);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/subscriptions/search", params.toMap());
  }

  @Test
  public void testTaxCodeList() throws StripeException {
    TaxCodeListParams params = TaxCodeListParams.builder().setLimit(3L).build();

    TaxCodeCollection taxCodes = TaxCode.list(params);
    assertNotNull(taxCodes);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/tax_codes", params.toMap());
  }

  @Test
  public void testTaxCodeRetrieve() throws StripeException {
    TaxCode taxCode = TaxCode.retrieve("txcd_xxxxxxxxxxxxx");
    assertNotNull(taxCode);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/tax_codes/txcd_xxxxxxxxxxxxx");
  }

  @Test
  public void testTaxRateList() throws StripeException {
    TaxRateListParams params = TaxRateListParams.builder().setLimit(3L).build();

    TaxRateCollection taxRates = TaxRate.list(params);
    assertNotNull(taxRates);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/tax_rates", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tax_rates", params.toMap());
  }

  @Test
  public void testTaxRateRetrieve() throws StripeException {
    TaxRate taxRate = TaxRate.retrieve("txr_xxxxxxxxxxxxx");
    assertNotNull(taxRate);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/tax_rates/txr_xxxxxxxxxxxxx");
  }

  @Test
  public void testTaxRateUpdate() throws StripeException {
    TaxRate resource = TaxRate.retrieve("txr_xxxxxxxxxxxxx");

    TaxRateUpdateParams params = TaxRateUpdateParams.builder().setActive(false).build();

    TaxRate taxRate = resource.update(params);
    assertNotNull(taxRate);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/tax_rates/txr_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testConfigurationList3() throws StripeException {
    com.stripe.param.terminal.ConfigurationListParams params =
        com.stripe.param.terminal.ConfigurationListParams.builder().setLimit(3L).build();

    com.stripe.model.terminal.ConfigurationCollection configurations =
        com.stripe.model.terminal.Configuration.list(params);
    assertNotNull(configurations);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/configurations", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/terminal/configurations", params.toMap());
  }

  @Test
  public void testConfigurationDelete2() throws StripeException {
    com.stripe.model.terminal.Configuration resource =
        com.stripe.model.terminal.Configuration.retrieve("tmc_xxxxxxxxxxxxx");

    com.stripe.model.terminal.Configuration configuration = resource.delete();
    assertNotNull(configuration);
    verifyRequest(
        ApiResource.RequestMethod.DELETE, "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx");
  }

  @Test
  public void testConfigurationRetrieve3() throws StripeException {
    com.stripe.model.terminal.Configuration configuration =
        com.stripe.model.terminal.Configuration.retrieve("tmc_xxxxxxxxxxxxx");
    assertNotNull(configuration);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/terminal/configurations/tmc_xxxxxxxxxxxxx",
        params.toMap());
  }

  @Test
  public void testConnectionTokenCreate() throws StripeException {
    com.stripe.param.terminal.ConnectionTokenCreateParams params =
        com.stripe.param.terminal.ConnectionTokenCreateParams.builder().build();

    com.stripe.model.terminal.ConnectionToken connectionToken =
        com.stripe.model.terminal.ConnectionToken.create(params);
    assertNotNull(connectionToken);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/terminal/connection_tokens", params.toMap());
  }

  @Test
  public void testLocationList() throws StripeException {
    com.stripe.param.terminal.LocationListParams params =
        com.stripe.param.terminal.LocationListParams.builder().setLimit(3L).build();

    com.stripe.model.terminal.LocationCollection locations =
        com.stripe.model.terminal.Location.list(params);
    assertNotNull(locations);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/locations", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/terminal/locations", params.toMap());
  }

  @Test
  public void testLocationDelete() throws StripeException {
    com.stripe.model.terminal.Location resource =
        com.stripe.model.terminal.Location.retrieve("tml_xxxxxxxxxxxxx");

    com.stripe.model.terminal.Location location = resource.delete();
    assertNotNull(location);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/terminal/locations/tml_xxxxxxxxxxxxx");
  }

  @Test
  public void testLocationRetrieve() throws StripeException {
    com.stripe.model.terminal.Location location =
        com.stripe.model.terminal.Location.retrieve("tml_xxxxxxxxxxxxx");
    assertNotNull(location);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/locations/tml_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST, "/v1/terminal/locations/tml_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testReaderList() throws StripeException {
    com.stripe.param.terminal.ReaderListParams params =
        com.stripe.param.terminal.ReaderListParams.builder().setLimit(3L).build();

    com.stripe.model.terminal.ReaderCollection readers =
        com.stripe.model.terminal.Reader.list(params);
    assertNotNull(readers);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/readers", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/terminal/readers", params.toMap());
  }

  @Test
  public void testReaderDelete() throws StripeException {
    com.stripe.model.terminal.Reader resource =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");

    com.stripe.model.terminal.Reader reader = resource.delete();
    assertNotNull(reader);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/terminal/readers/tmr_xxxxxxxxxxxxx");
  }

  @Test
  public void testReaderRetrieve() throws StripeException {
    com.stripe.model.terminal.Reader reader =
        com.stripe.model.terminal.Reader.retrieve("tmr_xxxxxxxxxxxxx");
    assertNotNull(reader);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/terminal/readers/tmr_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST, "/v1/terminal/readers/tmr_xxxxxxxxxxxxx", params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/cancel_action",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_payment_intent",
        params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/terminal/readers/tmr_xxxxxxxxxxxxx/process_setup_intent",
        params.toMap());
  }

  @Test
  public void testTestClockList2() throws StripeException {
    com.stripe.param.testhelpers.TestClockListParams params =
        com.stripe.param.testhelpers.TestClockListParams.builder().setLimit(3L).build();

    com.stripe.model.testhelpers.TestClockCollection testClocks =
        com.stripe.model.testhelpers.TestClock.list(params);
    assertNotNull(testClocks);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/test_helpers/test_clocks", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/test_helpers/test_clocks", params.toMap());
  }

  @Test
  public void testTestClockDelete2() throws StripeException {
    com.stripe.model.testhelpers.TestClock resource =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xxxxxxxxxxxxx");

    com.stripe.model.testhelpers.TestClock testClock = resource.delete();
    assertNotNull(testClock);
    verifyRequest(
        ApiResource.RequestMethod.DELETE, "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx");
  }

  @Test
  public void testTestClockRetrieve2() throws StripeException {
    com.stripe.model.testhelpers.TestClock testClock =
        com.stripe.model.testhelpers.TestClock.retrieve("clock_xxxxxxxxxxxxx");
    assertNotNull(testClock);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/test_helpers/test_clocks/clock_xxxxxxxxxxxxx/advance",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap());
  }

  @Test
  public void testTokenCreate3() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setPii(TokenCreateParams.Pii.builder().setIdNumber("000000000").build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap());
  }

  @Test
  public void testTokenCreate6() throws StripeException {
    TokenCreateParams params =
        TokenCreateParams.builder()
            .setCvcUpdate(TokenCreateParams.CvcUpdate.builder().setCvc("123").build())
            .build();

    Token token = Token.create(params);
    assertNotNull(token);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tokens", params.toMap());
  }

  @Test
  public void testTokenRetrieve() throws StripeException {
    Token token = Token.retrieve("tok_xxxx");
    assertNotNull(token);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/tokens/tok_xxxx");
  }

  @Test
  public void testTopupList() throws StripeException {
    TopupListParams params = TopupListParams.builder().setLimit(3L).build();

    TopupCollection topups = Topup.list(params);
    assertNotNull(topups);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/topups", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/topups", params.toMap());
  }

  @Test
  public void testTopupRetrieve() throws StripeException {
    Topup topup = Topup.retrieve("tu_xxxxxxxxxxxxx");
    assertNotNull(topup);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/topups/tu_xxxxxxxxxxxxx");
  }

  @Test
  public void testTopupUpdate() throws StripeException {
    Topup resource = Topup.retrieve("tu_xxxxxxxxxxxxx");

    TopupUpdateParams params = TopupUpdateParams.builder().putMetadata("order_id", "6735").build();

    Topup topup = resource.update(params);
    assertNotNull(topup);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/topups/tu_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testTopupCancel() throws StripeException {
    Topup resource = Topup.retrieve("tu_xxxxxxxxxxxxx");

    TopupCancelParams params = TopupCancelParams.builder().build();

    Topup topup = resource.cancel(params);
    assertNotNull(topup);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/topups/tu_xxxxxxxxxxxxx/cancel", params.toMap());
  }

  @Test
  public void testTransferList() throws StripeException {
    TransferListParams params = TransferListParams.builder().setLimit(3L).build();

    TransferCollection transfers = Transfer.list(params);
    assertNotNull(transfers);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/transfers", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/transfers", params.toMap());
  }

  @Test
  public void testTransferRetrieve() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");
    assertNotNull(transfer);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/transfers/tr_xxxxxxxxxxxxx");
  }

  @Test
  public void testTransferUpdate() throws StripeException {
    Transfer resource = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferUpdateParams params =
        TransferUpdateParams.builder().putMetadata("order_id", "6735").build();

    Transfer transfer = resource.update(params);
    assertNotNull(transfer);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/transfers/tr_xxxxxxxxxxxxx", params.toMap());
  }

  @Test
  public void testTransferReversalList() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferReversalCollectionListParams params =
        TransferReversalCollectionListParams.builder().setLimit(3L).build();

    TransferReversalCollection transferReversals = transfer.getReversals().list(params);
    assertNotNull(transferReversals);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/transfers/tr_xxxxxxxxxxxxx/reversals", params.toMap());
  }

  @Test
  public void testTransferReversalCreate() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferReversalCollectionCreateParams params =
        TransferReversalCollectionCreateParams.builder().setAmount(100L).build();

    TransferReversal transferReversal = transfer.getReversals().create(params);
    assertNotNull(transferReversal);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/transfers/tr_xxxxxxxxxxxxx/reversals", params.toMap());
  }

  @Test
  public void testTransferReversalRetrieve() throws StripeException {
    Transfer transfer = Transfer.retrieve("tr_xxxxxxxxxxxxx");

    TransferReversal transferReversal = transfer.getReversals().retrieve("trr_xxxxxxxxxxxxx");
    assertNotNull(transferReversal);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/transfers/tr_xxxxxxxxxxxxx/reversals/trr_xxxxxxxxxxxxx",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/credit_reversals", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/treasury/credit_reversals", params.toMap());
  }

  @Test
  public void testCreditReversalRetrieve() throws StripeException {
    com.stripe.model.treasury.CreditReversal creditReversal =
        com.stripe.model.treasury.CreditReversal.retrieve("credrev_xxxxxxxxxxxxx");
    assertNotNull(creditReversal);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/treasury/credit_reversals/credrev_xxxxxxxxxxxxx");
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/debit_reversals", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/treasury/debit_reversals", params.toMap());
  }

  @Test
  public void testDebitReversalRetrieve() throws StripeException {
    com.stripe.model.treasury.DebitReversal debitReversal =
        com.stripe.model.treasury.DebitReversal.retrieve("debrev_xxxxxxxxxxxxx");
    assertNotNull(debitReversal);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/treasury/debit_reversals/debrev_xxxxxxxxxxxxx");
  }

  @Test
  public void testFinancialAccountList() throws StripeException {
    com.stripe.param.treasury.FinancialAccountListParams params =
        com.stripe.param.treasury.FinancialAccountListParams.builder().setLimit(3L).build();

    com.stripe.model.treasury.FinancialAccountCollection financialAccounts =
        com.stripe.model.treasury.FinancialAccount.list(params);
    assertNotNull(financialAccounts);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/financial_accounts", params.toMap());
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
        ApiResource.RequestMethod.POST, "/v1/treasury/financial_accounts", params.toMap());
  }

  @Test
  public void testFinancialAccountRetrieve() throws StripeException {
    com.stripe.model.treasury.FinancialAccount financialAccount =
        com.stripe.model.treasury.FinancialAccount.retrieve("fa_xxxxxxxxxxxxx");
    assertNotNull(financialAccount);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx",
        params.toMap());
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
        ApiResource.RequestMethod.GET,
        "/v1/treasury/financial_accounts/fa_xxxxxxxxxxxxx/features",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/inbound_transfers", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/treasury/inbound_transfers", params.toMap());
  }

  @Test
  public void testInboundTransferRetrieve() throws StripeException {
    com.stripe.model.treasury.InboundTransfer inboundTransfer =
        com.stripe.model.treasury.InboundTransfer.retrieve("ibt_xxxxxxxxxxxxx");
    assertNotNull(inboundTransfer);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/treasury/inbound_transfers/ibt_xxxxxxxxxxxxx/cancel",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/outbound_payments", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/treasury/outbound_payments", params.toMap());
  }

  @Test
  public void testOutboundPaymentRetrieve() throws StripeException {
    com.stripe.model.treasury.OutboundPayment outboundPayment =
        com.stripe.model.treasury.OutboundPayment.retrieve("bot_xxxxxxxxxxxxx");
    assertNotNull(outboundPayment);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_payments/bot_xxxxxxxxxxxxx/cancel",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/outbound_transfers", params.toMap());
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
        ApiResource.RequestMethod.POST, "/v1/treasury/outbound_transfers", params.toMap());
  }

  @Test
  public void testOutboundTransferRetrieve() throws StripeException {
    com.stripe.model.treasury.OutboundTransfer outboundTransfer =
        com.stripe.model.treasury.OutboundTransfer.retrieve("obt_xxxxxxxxxxxxx");
    assertNotNull(outboundTransfer);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.POST,
        "/v1/treasury/outbound_transfers/obt_xxxxxxxxxxxxx/cancel",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/received_credits", params.toMap());
  }

  @Test
  public void testReceivedCreditRetrieve() throws StripeException {
    com.stripe.model.treasury.ReceivedCredit receivedCredit =
        com.stripe.model.treasury.ReceivedCredit.retrieve("rc_xxxxxxxxxxxxx");
    assertNotNull(receivedCredit);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/received_credits/rc_xxxxxxxxxxxxx");
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/received_debits", params.toMap());
  }

  @Test
  public void testReceivedDebitRetrieve() throws StripeException {
    com.stripe.model.treasury.ReceivedDebit receivedDebit =
        com.stripe.model.treasury.ReceivedDebit.retrieve("rd_xxxxxxxxxxxxx");
    assertNotNull(receivedDebit);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/received_debits/rd_xxxxxxxxxxxxx");
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
        ApiResource.RequestMethod.GET, "/v1/treasury/transaction_entries", params.toMap());
  }

  @Test
  public void testTransactionEntryRetrieve() throws StripeException {
    com.stripe.model.treasury.TransactionEntry transactionEntry =
        com.stripe.model.treasury.TransactionEntry.retrieve("trxne_xxxxxxxxxxxxx");
    assertNotNull(transactionEntry);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/treasury/transaction_entries/trxne_xxxxxxxxxxxxx");
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
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/transactions", params.toMap());
  }

  @Test
  public void testTransactionRetrieve2() throws StripeException {
    com.stripe.model.treasury.Transaction transaction =
        com.stripe.model.treasury.Transaction.retrieve("trxn_xxxxxxxxxxxxx");
    assertNotNull(transaction);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/treasury/transactions/trxn_xxxxxxxxxxxxx");
  }

  @Test
  public void testWebhookEndpointList() throws StripeException {
    WebhookEndpointListParams params = WebhookEndpointListParams.builder().setLimit(3L).build();

    WebhookEndpointCollection webhookEndpoints = WebhookEndpoint.list(params);
    assertNotNull(webhookEndpoints);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/webhook_endpoints", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/webhook_endpoints", params.toMap());
  }

  @Test
  public void testWebhookEndpointDelete() throws StripeException {
    WebhookEndpoint resource = WebhookEndpoint.retrieve("we_xxxxxxxxxxxxx");

    WebhookEndpoint webhookEndpoint = resource.delete();
    assertNotNull(webhookEndpoint);
    verifyRequest(ApiResource.RequestMethod.DELETE, "/v1/webhook_endpoints/we_xxxxxxxxxxxxx");
  }

  @Test
  public void testWebhookEndpointRetrieve() throws StripeException {
    WebhookEndpoint webhookEndpoint = WebhookEndpoint.retrieve("we_xxxxxxxxxxxxx");
    assertNotNull(webhookEndpoint);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/webhook_endpoints/we_xxxxxxxxxxxxx");
  }

  @Test
  public void testWebhookEndpointUpdate() throws StripeException {
    WebhookEndpoint resource = WebhookEndpoint.retrieve("we_xxxxxxxxxxxxx");

    WebhookEndpointUpdateParams params =
        WebhookEndpointUpdateParams.builder().setUrl("https://example.com/new_endpoint").build();

    WebhookEndpoint webhookEndpoint = resource.update(params);
    assertNotNull(webhookEndpoint);
    verifyRequest(
        ApiResource.RequestMethod.POST, "/v1/webhook_endpoints/we_xxxxxxxxxxxxx", params.toMap());
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
        ApiResource.RequestMethod.POST,
        "/v1/tax/transactions/create_from_calculation",
        params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/payment_intents", params.toMap());
  }

  @Test
  public void testQuoteListLineItems() throws StripeException {
    Quote resource = Quote.retrieve("qt_xxxxxxxxxxxxx");

    QuoteListLineItemsParams params = QuoteListLineItemsParams.builder().build();

    LineItemCollection lineItems = resource.listLineItems(params);
    assertNotNull(lineItems);
    verifyRequest(
        ApiResource.RequestMethod.GET, "/v1/quotes/qt_xxxxxxxxxxxxx/line_items", params.toMap());
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
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/tax/calculations", params.toMap());
  }
}
