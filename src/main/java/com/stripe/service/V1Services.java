// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class V1Services extends ApiService {
  public V1Services(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.AccountLinkService accountLinks() {
    return new com.stripe.service.AccountLinkService(this.getResponseGetter());
  }

  public com.stripe.service.AccountSessionService accountSessions() {
    return new com.stripe.service.AccountSessionService(this.getResponseGetter());
  }

  public com.stripe.service.AccountService accounts() {
    return new com.stripe.service.AccountService(this.getResponseGetter());
  }

  public com.stripe.service.ApplePayDomainService applePayDomains() {
    return new com.stripe.service.ApplePayDomainService(this.getResponseGetter());
  }

  public com.stripe.service.ApplicationFeeService applicationFees() {
    return new com.stripe.service.ApplicationFeeService(this.getResponseGetter());
  }

  public com.stripe.service.AppsService apps() {
    return new com.stripe.service.AppsService(this.getResponseGetter());
  }

  public com.stripe.service.BalanceService balance() {
    return new com.stripe.service.BalanceService(this.getResponseGetter());
  }

  public com.stripe.service.BalanceSettingsService balanceSettings() {
    return new com.stripe.service.BalanceSettingsService(this.getResponseGetter());
  }

  public com.stripe.service.BalanceTransactionService balanceTransactions() {
    return new com.stripe.service.BalanceTransactionService(this.getResponseGetter());
  }

  public com.stripe.service.BillingService billing() {
    return new com.stripe.service.BillingService(this.getResponseGetter());
  }

  public com.stripe.service.BillingPortalService billingPortal() {
    return new com.stripe.service.BillingPortalService(this.getResponseGetter());
  }

  public com.stripe.service.ChargeService charges() {
    return new com.stripe.service.ChargeService(this.getResponseGetter());
  }

  public com.stripe.service.CheckoutService checkout() {
    return new com.stripe.service.CheckoutService(this.getResponseGetter());
  }

  public com.stripe.service.ClimateService climate() {
    return new com.stripe.service.ClimateService(this.getResponseGetter());
  }

  public com.stripe.service.ConfirmationTokenService confirmationTokens() {
    return new com.stripe.service.ConfirmationTokenService(this.getResponseGetter());
  }

  public com.stripe.service.CountrySpecService countrySpecs() {
    return new com.stripe.service.CountrySpecService(this.getResponseGetter());
  }

  public com.stripe.service.CouponService coupons() {
    return new com.stripe.service.CouponService(this.getResponseGetter());
  }

  public com.stripe.service.CreditNoteService creditNotes() {
    return new com.stripe.service.CreditNoteService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerSessionService customerSessions() {
    return new com.stripe.service.CustomerSessionService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerService customers() {
    return new com.stripe.service.CustomerService(this.getResponseGetter());
  }

  public com.stripe.service.DisputeService disputes() {
    return new com.stripe.service.DisputeService(this.getResponseGetter());
  }

  public com.stripe.service.EntitlementsService entitlements() {
    return new com.stripe.service.EntitlementsService(this.getResponseGetter());
  }

  public com.stripe.service.EphemeralKeyService ephemeralKeys() {
    return new com.stripe.service.EphemeralKeyService(this.getResponseGetter());
  }

  public com.stripe.service.EventService events() {
    return new com.stripe.service.EventService(this.getResponseGetter());
  }

  public com.stripe.service.ExchangeRateService exchangeRates() {
    return new com.stripe.service.ExchangeRateService(this.getResponseGetter());
  }

  public com.stripe.service.FileLinkService fileLinks() {
    return new com.stripe.service.FileLinkService(this.getResponseGetter());
  }

  public com.stripe.service.FileService files() {
    return new com.stripe.service.FileService(this.getResponseGetter());
  }

  public com.stripe.service.FinancialConnectionsService financialConnections() {
    return new com.stripe.service.FinancialConnectionsService(this.getResponseGetter());
  }

  public com.stripe.service.ForwardingService forwarding() {
    return new com.stripe.service.ForwardingService(this.getResponseGetter());
  }

  public com.stripe.service.IdentityService identity() {
    return new com.stripe.service.IdentityService(this.getResponseGetter());
  }

  public com.stripe.service.InvoiceItemService invoiceItems() {
    return new com.stripe.service.InvoiceItemService(this.getResponseGetter());
  }

  public com.stripe.service.InvoicePaymentService invoicePayments() {
    return new com.stripe.service.InvoicePaymentService(this.getResponseGetter());
  }

  public com.stripe.service.InvoiceRenderingTemplateService invoiceRenderingTemplates() {
    return new com.stripe.service.InvoiceRenderingTemplateService(this.getResponseGetter());
  }

  public com.stripe.service.InvoiceService invoices() {
    return new com.stripe.service.InvoiceService(this.getResponseGetter());
  }

  public com.stripe.service.IssuingService issuing() {
    return new com.stripe.service.IssuingService(this.getResponseGetter());
  }

  public com.stripe.service.MandateService mandates() {
    return new com.stripe.service.MandateService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentAttemptRecordService paymentAttemptRecords() {
    return new com.stripe.service.PaymentAttemptRecordService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentIntentService paymentIntents() {
    return new com.stripe.service.PaymentIntentService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentLinkService paymentLinks() {
    return new com.stripe.service.PaymentLinkService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentMethodConfigurationService paymentMethodConfigurations() {
    return new com.stripe.service.PaymentMethodConfigurationService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentMethodDomainService paymentMethodDomains() {
    return new com.stripe.service.PaymentMethodDomainService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentMethodService paymentMethods() {
    return new com.stripe.service.PaymentMethodService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentRecordService paymentRecords() {
    return new com.stripe.service.PaymentRecordService(this.getResponseGetter());
  }

  public com.stripe.service.PayoutService payouts() {
    return new com.stripe.service.PayoutService(this.getResponseGetter());
  }

  public com.stripe.service.PlanService plans() {
    return new com.stripe.service.PlanService(this.getResponseGetter());
  }

  public com.stripe.service.PriceService prices() {
    return new com.stripe.service.PriceService(this.getResponseGetter());
  }

  public com.stripe.service.ProductService products() {
    return new com.stripe.service.ProductService(this.getResponseGetter());
  }

  public com.stripe.service.PromotionCodeService promotionCodes() {
    return new com.stripe.service.PromotionCodeService(this.getResponseGetter());
  }

  public com.stripe.service.QuoteService quotes() {
    return new com.stripe.service.QuoteService(this.getResponseGetter());
  }

  public com.stripe.service.RadarService radar() {
    return new com.stripe.service.RadarService(this.getResponseGetter());
  }

  public com.stripe.service.RefundService refunds() {
    return new com.stripe.service.RefundService(this.getResponseGetter());
  }

  public com.stripe.service.ReportingService reporting() {
    return new com.stripe.service.ReportingService(this.getResponseGetter());
  }

  public com.stripe.service.ReviewService reviews() {
    return new com.stripe.service.ReviewService(this.getResponseGetter());
  }

  public com.stripe.service.SetupAttemptService setupAttempts() {
    return new com.stripe.service.SetupAttemptService(this.getResponseGetter());
  }

  public com.stripe.service.SetupIntentService setupIntents() {
    return new com.stripe.service.SetupIntentService(this.getResponseGetter());
  }

  public com.stripe.service.ShippingRateService shippingRates() {
    return new com.stripe.service.ShippingRateService(this.getResponseGetter());
  }

  public com.stripe.service.SigmaService sigma() {
    return new com.stripe.service.SigmaService(this.getResponseGetter());
  }

  public com.stripe.service.SourceService sources() {
    return new com.stripe.service.SourceService(this.getResponseGetter());
  }

  public com.stripe.service.SubscriptionItemService subscriptionItems() {
    return new com.stripe.service.SubscriptionItemService(this.getResponseGetter());
  }

  public com.stripe.service.SubscriptionScheduleService subscriptionSchedules() {
    return new com.stripe.service.SubscriptionScheduleService(this.getResponseGetter());
  }

  public com.stripe.service.SubscriptionService subscriptions() {
    return new com.stripe.service.SubscriptionService(this.getResponseGetter());
  }

  public com.stripe.service.TaxService tax() {
    return new com.stripe.service.TaxService(this.getResponseGetter());
  }

  public com.stripe.service.TaxCodeService taxCodes() {
    return new com.stripe.service.TaxCodeService(this.getResponseGetter());
  }

  public com.stripe.service.TaxIdService taxIds() {
    return new com.stripe.service.TaxIdService(this.getResponseGetter());
  }

  public com.stripe.service.TaxRateService taxRates() {
    return new com.stripe.service.TaxRateService(this.getResponseGetter());
  }

  public com.stripe.service.TerminalService terminal() {
    return new com.stripe.service.TerminalService(this.getResponseGetter());
  }

  public com.stripe.service.TestHelpersService testHelpers() {
    return new com.stripe.service.TestHelpersService(this.getResponseGetter());
  }

  public com.stripe.service.TokenService tokens() {
    return new com.stripe.service.TokenService(this.getResponseGetter());
  }

  public com.stripe.service.TopupService topups() {
    return new com.stripe.service.TopupService(this.getResponseGetter());
  }

  public com.stripe.service.TransferService transfers() {
    return new com.stripe.service.TransferService(this.getResponseGetter());
  }

  public com.stripe.service.TreasuryService treasury() {
    return new com.stripe.service.TreasuryService(this.getResponseGetter());
  }

  public com.stripe.service.WebhookEndpointService webhookEndpoints() {
    return new com.stripe.service.WebhookEndpointService(this.getResponseGetter());
  }
}
