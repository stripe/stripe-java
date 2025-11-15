package com.stripe;

import com.stripe.exception.SignatureVerificationException;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.model.v2.core.EventNotification;
import com.stripe.net.*;
import com.stripe.net.Webhook.Signature;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import lombok.Getter;

/**
 * This is the primary entrypoint to make requests against Stripe's API. It provides a means of
 * accessing all the methods on the Stripe API, and the ability to set configuration such as apiKey
 * and connection timeouts.
 */
public class StripeClient {
  private final StripeResponseGetter responseGetter;

  /**
   * Constructs a StripeClient with default settings, using the provided API key. Use the builder
   * instead if you require more complex configuration.
   */
  public StripeClient(String apiKey) {
    this.responseGetter =
        new LiveStripeResponseGetter(builder().setApiKey(apiKey).buildOptions(), null);
  }

  /**
   * Constructs a StripeClient with a custom StripeResponseGetter.
   *
   * <p>Use this for testing, or advanced use cases where you need to make fundamental changes to
   * how the StripeClient makes requests.
   */
  public StripeClient(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  protected StripeResponseGetter getResponseGetter() {
    return responseGetter;
  }

  /**
   * Returns an StripeEvent instance using the provided JSON payload. Throws a JsonSyntaxException
   * if the payload is not valid JSON, and a SignatureVerificationException if the signature
   * verification fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @return the StripeEvent instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public EventNotification parseEventNotification(String payload, String sigHeader, String secret)
      throws SignatureVerificationException {
    return parseEventNotification(payload, sigHeader, secret, Webhook.DEFAULT_TOLERANCE);
  }

  /**
   * Returns an StripeEvent instance using the provided JSON payload. Throws a JsonSyntaxException
   * if the payload is not valid JSON, and a SignatureVerificationException if the signature
   * verification fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @param tolerance number of seconds that the event's timestamp can differ from the system time.
   *     Passing `0` will disable the time check entirely and is **strongly discouraged**.
   * @return the StripeEvent instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public EventNotification parseEventNotification(
      String payload, String sigHeader, String secret, long tolerance)
      throws SignatureVerificationException {
    Signature.verifyHeader(payload, sigHeader, secret, tolerance);

    return EventNotification.fromJson(payload, this);
  }

  /**
   * Returns an Event instance using the provided JSON payload. Throws a JsonSyntaxException if the
   * payload is not valid JSON, and a SignatureVerificationException if the signature verification
   * fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public com.stripe.model.Event constructEvent(String payload, String sigHeader, String secret)
      throws SignatureVerificationException {
    com.stripe.model.Event event = Webhook.constructEvent(payload, sigHeader, secret);
    event.setResponseGetter(this.getResponseGetter());
    return event;
  }

  /**
   * Returns an Event instance using the provided JSON payload. Throws a JsonSyntaxException if the
   * payload is not valid JSON, and a SignatureVerificationException if the signature verification
   * fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @param tolerance maximum difference in seconds allowed between the header's timestamp and the
   *     current time
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public com.stripe.model.Event constructEvent(
      String payload, String sigHeader, String secret, long tolerance)
      throws SignatureVerificationException {
    com.stripe.model.Event event = Webhook.constructEvent(payload, sigHeader, secret, tolerance);
    event.setResponseGetter(this.getResponseGetter());
    return event;
  }

  // The beginning of the section generated from our OpenAPI spec
  public com.stripe.service.V1Services v1() {
    return new com.stripe.service.V1Services(this.getResponseGetter());
  }

  public com.stripe.service.V2Services v2() {
    return new com.stripe.service.V2Services(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.accountLinks() is deprecated, use StripeClient.v1().accountLinks()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().accountLinks(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.AccountLinkService accountLinks() {
    return new com.stripe.service.AccountLinkService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.accountNotices() is deprecated, use StripeClient.v1().accountNotices()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().accountNotices(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.AccountNoticeService accountNotices() {
    return new com.stripe.service.AccountNoticeService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.accountSessions() is deprecated, use
   *     StripeClient.v1().accountSessions() instead. All functionality under it has been copied
   *     over to StripeClient.v1().accountSessions(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.AccountSessionService accountSessions() {
    return new com.stripe.service.AccountSessionService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.accounts() is deprecated, use StripeClient.v1().accounts() instead.
   *     All functionality under it has been copied over to StripeClient.v1().accounts(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.AccountService accounts() {
    return new com.stripe.service.AccountService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.applePayDomains() is deprecated, use
   *     StripeClient.v1().applePayDomains() instead. All functionality under it has been copied
   *     over to StripeClient.v1().applePayDomains(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ApplePayDomainService applePayDomains() {
    return new com.stripe.service.ApplePayDomainService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.applicationFees() is deprecated, use
   *     StripeClient.v1().applicationFees() instead. All functionality under it has been copied
   *     over to StripeClient.v1().applicationFees(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ApplicationFeeService applicationFees() {
    return new com.stripe.service.ApplicationFeeService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.apps() is deprecated, use StripeClient.v1().apps() instead. All
   *     functionality under it has been copied over to StripeClient.v1().apps(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.AppsService apps() {
    return new com.stripe.service.AppsService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.balance() is deprecated, use StripeClient.v1().balance() instead. All
   *     functionality under it has been copied over to StripeClient.v1().balance(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.BalanceService balance() {
    return new com.stripe.service.BalanceService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.balanceSettings() is deprecated, use
   *     StripeClient.v1().balanceSettings() instead. All functionality under it has been copied
   *     over to StripeClient.v1().balanceSettings(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.BalanceSettingsService balanceSettings() {
    return new com.stripe.service.BalanceSettingsService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.balanceTransactions() is deprecated, use
   *     StripeClient.v1().balanceTransactions() instead. All functionality under it has been copied
   *     over to StripeClient.v1().balanceTransactions(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.BalanceTransactionService balanceTransactions() {
    return new com.stripe.service.BalanceTransactionService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.billing() is deprecated, use StripeClient.v1().billing() instead. All
   *     functionality under it has been copied over to StripeClient.v1().billing(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.BillingService billing() {
    return new com.stripe.service.BillingService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.billingPortal() is deprecated, use StripeClient.v1().billingPortal()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().billingPortal(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.BillingPortalService billingPortal() {
    return new com.stripe.service.BillingPortalService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.capital() is deprecated, use StripeClient.v1().capital() instead. All
   *     functionality under it has been copied over to StripeClient.v1().capital(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.CapitalService capital() {
    return new com.stripe.service.CapitalService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.charges() is deprecated, use StripeClient.v1().charges() instead. All
   *     functionality under it has been copied over to StripeClient.v1().charges(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ChargeService charges() {
    return new com.stripe.service.ChargeService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.checkout() is deprecated, use StripeClient.v1().checkout() instead.
   *     All functionality under it has been copied over to StripeClient.v1().checkout(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.CheckoutService checkout() {
    return new com.stripe.service.CheckoutService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.climate() is deprecated, use StripeClient.v1().climate() instead. All
   *     functionality under it has been copied over to StripeClient.v1().climate(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ClimateService climate() {
    return new com.stripe.service.ClimateService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.confirmationTokens() is deprecated, use
   *     StripeClient.v1().confirmationTokens() instead. All functionality under it has been copied
   *     over to StripeClient.v1().confirmationTokens(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ConfirmationTokenService confirmationTokens() {
    return new com.stripe.service.ConfirmationTokenService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.countrySpecs() is deprecated, use StripeClient.v1().countrySpecs()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().countrySpecs(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.CountrySpecService countrySpecs() {
    return new com.stripe.service.CountrySpecService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.coupons() is deprecated, use StripeClient.v1().coupons() instead. All
   *     functionality under it has been copied over to StripeClient.v1().coupons(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.CouponService coupons() {
    return new com.stripe.service.CouponService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.creditNotes() is deprecated, use StripeClient.v1().creditNotes()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().creditNotes(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.CreditNoteService creditNotes() {
    return new com.stripe.service.CreditNoteService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.customerSessions() is deprecated, use
   *     StripeClient.v1().customerSessions() instead. All functionality under it has been copied
   *     over to StripeClient.v1().customerSessions(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.CustomerSessionService customerSessions() {
    return new com.stripe.service.CustomerSessionService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.customers() is deprecated, use StripeClient.v1().customers() instead.
   *     All functionality under it has been copied over to StripeClient.v1().customers(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.CustomerService customers() {
    return new com.stripe.service.CustomerService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.disputes() is deprecated, use StripeClient.v1().disputes() instead.
   *     All functionality under it has been copied over to StripeClient.v1().disputes(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.DisputeService disputes() {
    return new com.stripe.service.DisputeService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.entitlements() is deprecated, use StripeClient.v1().entitlements()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().entitlements(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.EntitlementsService entitlements() {
    return new com.stripe.service.EntitlementsService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.ephemeralKeys() is deprecated, use StripeClient.v1().ephemeralKeys()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().ephemeralKeys(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.EphemeralKeyService ephemeralKeys() {
    return new com.stripe.service.EphemeralKeyService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.events() is deprecated, use StripeClient.v1().events() instead. All
   *     functionality under it has been copied over to StripeClient.v1().events(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.EventService events() {
    return new com.stripe.service.EventService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.exchangeRates() is deprecated, use StripeClient.v1().exchangeRates()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().exchangeRates(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ExchangeRateService exchangeRates() {
    return new com.stripe.service.ExchangeRateService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.externalAccounts() is deprecated, use
   *     StripeClient.v1().externalAccounts() instead. All functionality under it has been copied
   *     over to StripeClient.v1().externalAccounts(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ExternalAccountService externalAccounts() {
    return new com.stripe.service.ExternalAccountService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.fileLinks() is deprecated, use StripeClient.v1().fileLinks() instead.
   *     All functionality under it has been copied over to StripeClient.v1().fileLinks(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.FileLinkService fileLinks() {
    return new com.stripe.service.FileLinkService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.files() is deprecated, use StripeClient.v1().files() instead. All
   *     functionality under it has been copied over to StripeClient.v1().files(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.FileService files() {
    return new com.stripe.service.FileService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.financialConnections() is deprecated, use
   *     StripeClient.v1().financialConnections() instead. All functionality under it has been
   *     copied over to StripeClient.v1().financialConnections(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.FinancialConnectionsService financialConnections() {
    return new com.stripe.service.FinancialConnectionsService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.forwarding() is deprecated, use StripeClient.v1().forwarding()
   *     instead. All functionality under it has been copied over to StripeClient.v1().forwarding().
   *     See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ForwardingService forwarding() {
    return new com.stripe.service.ForwardingService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.fxQuotes() is deprecated, use StripeClient.v1().fxQuotes() instead.
   *     All functionality under it has been copied over to StripeClient.v1().fxQuotes(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.FxQuoteService fxQuotes() {
    return new com.stripe.service.FxQuoteService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.identity() is deprecated, use StripeClient.v1().identity() instead.
   *     All functionality under it has been copied over to StripeClient.v1().identity(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.IdentityService identity() {
    return new com.stripe.service.IdentityService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.invoiceItems() is deprecated, use StripeClient.v1().invoiceItems()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().invoiceItems(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.InvoiceItemService invoiceItems() {
    return new com.stripe.service.InvoiceItemService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.invoicePayments() is deprecated, use
   *     StripeClient.v1().invoicePayments() instead. All functionality under it has been copied
   *     over to StripeClient.v1().invoicePayments(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.InvoicePaymentService invoicePayments() {
    return new com.stripe.service.InvoicePaymentService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.invoiceRenderingTemplates() is deprecated, use
   *     StripeClient.v1().invoiceRenderingTemplates() instead. All functionality under it has been
   *     copied over to StripeClient.v1().invoiceRenderingTemplates(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.InvoiceRenderingTemplateService invoiceRenderingTemplates() {
    return new com.stripe.service.InvoiceRenderingTemplateService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.invoices() is deprecated, use StripeClient.v1().invoices() instead.
   *     All functionality under it has been copied over to StripeClient.v1().invoices(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.InvoiceService invoices() {
    return new com.stripe.service.InvoiceService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.issuing() is deprecated, use StripeClient.v1().issuing() instead. All
   *     functionality under it has been copied over to StripeClient.v1().issuing(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.IssuingService issuing() {
    return new com.stripe.service.IssuingService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.mandates() is deprecated, use StripeClient.v1().mandates() instead.
   *     All functionality under it has been copied over to StripeClient.v1().mandates(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.MandateService mandates() {
    return new com.stripe.service.MandateService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.margins() is deprecated, use StripeClient.v1().margins() instead. All
   *     functionality under it has been copied over to StripeClient.v1().margins(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.MarginService margins() {
    return new com.stripe.service.MarginService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.orders() is deprecated, use StripeClient.v1().orders() instead. All
   *     functionality under it has been copied over to StripeClient.v1().orders(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.OrderService orders() {
    return new com.stripe.service.OrderService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.paymentAttemptRecords() is deprecated, use
   *     StripeClient.v1().paymentAttemptRecords() instead. All functionality under it has been
   *     copied over to StripeClient.v1().paymentAttemptRecords(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PaymentAttemptRecordService paymentAttemptRecords() {
    return new com.stripe.service.PaymentAttemptRecordService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.paymentIntents() is deprecated, use StripeClient.v1().paymentIntents()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().paymentIntents(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PaymentIntentService paymentIntents() {
    return new com.stripe.service.PaymentIntentService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.paymentLinks() is deprecated, use StripeClient.v1().paymentLinks()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().paymentLinks(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PaymentLinkService paymentLinks() {
    return new com.stripe.service.PaymentLinkService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.paymentMethodConfigurations() is deprecated, use
   *     StripeClient.v1().paymentMethodConfigurations() instead. All functionality under it has
   *     been copied over to StripeClient.v1().paymentMethodConfigurations(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PaymentMethodConfigurationService paymentMethodConfigurations() {
    return new com.stripe.service.PaymentMethodConfigurationService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.paymentMethodDomains() is deprecated, use
   *     StripeClient.v1().paymentMethodDomains() instead. All functionality under it has been
   *     copied over to StripeClient.v1().paymentMethodDomains(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PaymentMethodDomainService paymentMethodDomains() {
    return new com.stripe.service.PaymentMethodDomainService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.paymentMethods() is deprecated, use StripeClient.v1().paymentMethods()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().paymentMethods(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PaymentMethodService paymentMethods() {
    return new com.stripe.service.PaymentMethodService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.paymentRecords() is deprecated, use StripeClient.v1().paymentRecords()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().paymentRecords(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PaymentRecordService paymentRecords() {
    return new com.stripe.service.PaymentRecordService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.payouts() is deprecated, use StripeClient.v1().payouts() instead. All
   *     functionality under it has been copied over to StripeClient.v1().payouts(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PayoutService payouts() {
    return new com.stripe.service.PayoutService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.plans() is deprecated, use StripeClient.v1().plans() instead. All
   *     functionality under it has been copied over to StripeClient.v1().plans(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PlanService plans() {
    return new com.stripe.service.PlanService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.prices() is deprecated, use StripeClient.v1().prices() instead. All
   *     functionality under it has been copied over to StripeClient.v1().prices(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PriceService prices() {
    return new com.stripe.service.PriceService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.privacy() is deprecated, use StripeClient.v1().privacy() instead. All
   *     functionality under it has been copied over to StripeClient.v1().privacy(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PrivacyService privacy() {
    return new com.stripe.service.PrivacyService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.products() is deprecated, use StripeClient.v1().products() instead.
   *     All functionality under it has been copied over to StripeClient.v1().products(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ProductService products() {
    return new com.stripe.service.ProductService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.promotionCodes() is deprecated, use StripeClient.v1().promotionCodes()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().promotionCodes(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.PromotionCodeService promotionCodes() {
    return new com.stripe.service.PromotionCodeService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.quotes() is deprecated, use StripeClient.v1().quotes() instead. All
   *     functionality under it has been copied over to StripeClient.v1().quotes(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.QuoteService quotes() {
    return new com.stripe.service.QuoteService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.radar() is deprecated, use StripeClient.v1().radar() instead. All
   *     functionality under it has been copied over to StripeClient.v1().radar(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.RadarService radar() {
    return new com.stripe.service.RadarService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.refunds() is deprecated, use StripeClient.v1().refunds() instead. All
   *     functionality under it has been copied over to StripeClient.v1().refunds(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.RefundService refunds() {
    return new com.stripe.service.RefundService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.reporting() is deprecated, use StripeClient.v1().reporting() instead.
   *     All functionality under it has been copied over to StripeClient.v1().reporting(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ReportingService reporting() {
    return new com.stripe.service.ReportingService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.reviews() is deprecated, use StripeClient.v1().reviews() instead. All
   *     functionality under it has been copied over to StripeClient.v1().reviews(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ReviewService reviews() {
    return new com.stripe.service.ReviewService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.setupAttempts() is deprecated, use StripeClient.v1().setupAttempts()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().setupAttempts(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.SetupAttemptService setupAttempts() {
    return new com.stripe.service.SetupAttemptService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.setupIntents() is deprecated, use StripeClient.v1().setupIntents()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().setupIntents(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.SetupIntentService setupIntents() {
    return new com.stripe.service.SetupIntentService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.shippingRates() is deprecated, use StripeClient.v1().shippingRates()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().shippingRates(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.ShippingRateService shippingRates() {
    return new com.stripe.service.ShippingRateService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.sigma() is deprecated, use StripeClient.v1().sigma() instead. All
   *     functionality under it has been copied over to StripeClient.v1().sigma(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.SigmaService sigma() {
    return new com.stripe.service.SigmaService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.sources() is deprecated, use StripeClient.v1().sources() instead. All
   *     functionality under it has been copied over to StripeClient.v1().sources(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.SourceService sources() {
    return new com.stripe.service.SourceService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.subscriptionItems() is deprecated, use
   *     StripeClient.v1().subscriptionItems() instead. All functionality under it has been copied
   *     over to StripeClient.v1().subscriptionItems(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.SubscriptionItemService subscriptionItems() {
    return new com.stripe.service.SubscriptionItemService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.subscriptionSchedules() is deprecated, use
   *     StripeClient.v1().subscriptionSchedules() instead. All functionality under it has been
   *     copied over to StripeClient.v1().subscriptionSchedules(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.SubscriptionScheduleService subscriptionSchedules() {
    return new com.stripe.service.SubscriptionScheduleService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.subscriptions() is deprecated, use StripeClient.v1().subscriptions()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().subscriptions(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.SubscriptionService subscriptions() {
    return new com.stripe.service.SubscriptionService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.tax() is deprecated, use StripeClient.v1().tax() instead. All
   *     functionality under it has been copied over to StripeClient.v1().tax(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TaxService tax() {
    return new com.stripe.service.TaxService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.taxCodes() is deprecated, use StripeClient.v1().taxCodes() instead.
   *     All functionality under it has been copied over to StripeClient.v1().taxCodes(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TaxCodeService taxCodes() {
    return new com.stripe.service.TaxCodeService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.taxIds() is deprecated, use StripeClient.v1().taxIds() instead. All
   *     functionality under it has been copied over to StripeClient.v1().taxIds(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TaxIdService taxIds() {
    return new com.stripe.service.TaxIdService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.taxRates() is deprecated, use StripeClient.v1().taxRates() instead.
   *     All functionality under it has been copied over to StripeClient.v1().taxRates(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TaxRateService taxRates() {
    return new com.stripe.service.TaxRateService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.terminal() is deprecated, use StripeClient.v1().terminal() instead.
   *     All functionality under it has been copied over to StripeClient.v1().terminal(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TerminalService terminal() {
    return new com.stripe.service.TerminalService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.testHelpers() is deprecated, use StripeClient.v1().testHelpers()
   *     instead. All functionality under it has been copied over to
   *     StripeClient.v1().testHelpers(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TestHelpersService testHelpers() {
    return new com.stripe.service.TestHelpersService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.tokens() is deprecated, use StripeClient.v1().tokens() instead. All
   *     functionality under it has been copied over to StripeClient.v1().tokens(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TokenService tokens() {
    return new com.stripe.service.TokenService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.topups() is deprecated, use StripeClient.v1().topups() instead. All
   *     functionality under it has been copied over to StripeClient.v1().topups(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TopupService topups() {
    return new com.stripe.service.TopupService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.transfers() is deprecated, use StripeClient.v1().transfers() instead.
   *     All functionality under it has been copied over to StripeClient.v1().transfers(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TransferService transfers() {
    return new com.stripe.service.TransferService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.treasury() is deprecated, use StripeClient.v1().treasury() instead.
   *     All functionality under it has been copied over to StripeClient.v1().treasury(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.TreasuryService treasury() {
    return new com.stripe.service.TreasuryService(this.getResponseGetter());
  }

  /**
   * @deprecated StripeClient.webhookEndpoints() is deprecated, use
   *     StripeClient.v1().webhookEndpoints() instead. All functionality under it has been copied
   *     over to StripeClient.v1().webhookEndpoints(). See <a
   *     href="https://github.com/stripe/stripe-java/wiki/v1-namespace-in-StripeClient">migration
   *     guide</a> for more on this and tips on migrating to the new v1 namespace.
   */
  @Deprecated
  public com.stripe.service.WebhookEndpointService webhookEndpoints() {
    return new com.stripe.service.WebhookEndpointService(this.getResponseGetter());
  }

  // The end of the section generated from our OpenAPI spec
  static class ClientStripeResponseGetterOptions extends StripeResponseGetterOptions {
    // When adding setting here keep them in sync with settings in RequestOptions and
    // in the RequestOptions.merge method
    @Getter(onMethod_ = {@Override})
    private final Authenticator authenticator;

    @Getter(onMethod_ = {@Override})
    private final String clientId;

    @Getter(onMethod_ = {@Override})
    private final int connectTimeout;

    @Getter(onMethod_ = {@Override})
    private final int readTimeout;

    @Getter(onMethod_ = {@Override})
    private final int maxNetworkRetries;

    @Getter(onMethod_ = {@Override})
    private final Proxy connectionProxy;

    @Getter(onMethod_ = {@Override})
    private final PasswordAuthentication proxyCredential;

    @Getter(onMethod_ = {@Override})
    private final String apiBase;

    @Getter(onMethod_ = {@Override})
    private final String filesBase;

    @Getter(onMethod_ = {@Override})
    private final String connectBase;

    @Getter(onMethod_ = {@Override})
    private final String meterEventsBase;

    @Getter(onMethod_ = {@Override})
    private final String stripeAccount;

    @Getter(onMethod_ = {@Override})
    private final String stripeContext;

    ClientStripeResponseGetterOptions(
        Authenticator authenticator,
        String clientId,
        int connectTimeout,
        int readTimeout,
        int maxNetworkRetries,
        Proxy connectionProxy,
        PasswordAuthentication proxyCredential,
        String apiBase,
        String filesBase,
        String connectBase,
        String meterEventsBase,
        String stripeAccount,
        String stripeContext) {
      this.authenticator = authenticator;
      this.clientId = clientId;
      this.connectTimeout = connectTimeout;
      this.readTimeout = readTimeout;
      this.maxNetworkRetries = maxNetworkRetries;
      this.connectionProxy = connectionProxy;
      this.proxyCredential = proxyCredential;
      this.apiBase = apiBase;
      this.filesBase = filesBase;
      this.connectBase = connectBase;
      this.meterEventsBase = meterEventsBase;
      this.stripeAccount = stripeAccount;
      this.stripeContext = stripeContext;
    }
  }

  /**
   * Builder class for creating a {@link StripeClient} instance. Allows you to specify settings like
   * the API key, connect and read timeouts, and proxy settings.
   */
  public static StripeClientBuilder builder() {
    return new StripeClientBuilder();
  }

  public static final class StripeClientBuilder {
    private Authenticator authenticator;
    private String clientId;
    private int connectTimeout = Stripe.DEFAULT_CONNECT_TIMEOUT;
    private int readTimeout = Stripe.DEFAULT_READ_TIMEOUT;
    private int maxNetworkRetries;
    private Proxy connectionProxy;
    private PasswordAuthentication proxyCredential;
    private String apiBase = Stripe.LIVE_API_BASE;
    private String filesBase = Stripe.UPLOAD_API_BASE;
    private String connectBase = Stripe.CONNECT_API_BASE;
    private String meterEventsBase = Stripe.METER_EVENTS_API_BASE;
    private String stripeAccount;
    private String stripeContext;

    /**
     * Constructs a request options builder with the global parameters (API key and client ID) as
     * default values.
     */
    public StripeClientBuilder() {}

    public Authenticator getAuthenticator() {
      return this.authenticator;
    }

    public StripeClientBuilder setAuthenticator(Authenticator authenticator) {
      this.authenticator = authenticator;
      return this;
    }

    public String getApiKey() {
      if (authenticator instanceof BearerTokenAuthenticator) {
        return ((BearerTokenAuthenticator) authenticator).getApiKey();
      }

      return null;
    }

    public StripeClientBuilder setApiKey(String apiKey) {
      if (apiKey == null) {
        this.authenticator = null;
      } else {
        this.authenticator = new BearerTokenAuthenticator(apiKey);
      }
      return this;
    }

    public StripeClientBuilder clearApiKey() {
      this.authenticator = null;
      return this;
    }

    public String getClientId() {
      return clientId;
    }

    /**
     * Set the client id, used for OAuth with Stripe Connect.
     *
     * @param clientId client ID
     */
    public StripeClientBuilder setClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public int getConnectTimeout() {
      return connectTimeout;
    }

    /**
     * Sets the timeout value that will be used for making new connections to the Stripe API (in
     * milliseconds).
     *
     * @param timeout timeout value in milliseconds
     */
    public StripeClientBuilder setConnectTimeout(int timeout) {
      this.connectTimeout = timeout;
      return this;
    }

    public int getReadTimeout() {
      return readTimeout;
    }

    /**
     * Sets the timeout value that will be used when reading data from an established connection to
     * the Stripe API (in milliseconds).
     *
     * <p>Note that this value should be set conservatively because some API requests can take time
     * and a short timeout increases the likelihood of causing a problem in the backend.
     *
     * @param timeout timeout value in milliseconds
     */
    public StripeClientBuilder setReadTimeout(int timeout) {
      this.readTimeout = timeout;
      return this;
    }

    public int getMaxNetworkRetries() {
      return maxNetworkRetries;
    }

    /**
     * Sets the maximum number of times the request will be retried in the event of a failure.
     *
     * @param maxNetworkRetries the number of times to retry the request
     */
    public StripeClientBuilder setMaxNetworkRetries(int maxNetworkRetries) {
      this.maxNetworkRetries = maxNetworkRetries;
      return this;
    }

    public Proxy getConnectionProxy() {
      return connectionProxy;
    }

    /**
     * Set proxy to tunnel all Stripe connections.
     *
     * @param connectionProxy proxy host and port setting
     */
    public StripeClientBuilder setConnectionProxy(Proxy connectionProxy) {
      this.connectionProxy = connectionProxy;
      return this;
    }

    public PasswordAuthentication getProxyCredential() {
      return proxyCredential;
    }

    /**
     * Provide credential for proxy authorization if required.
     *
     * @param proxyCredential proxy required userName and password
     */
    public StripeClientBuilder setProxyCredential(PasswordAuthentication proxyCredential) {
      this.proxyCredential = proxyCredential;
      return this;
    }

    /**
     * Set the base URL for the Stripe API. By default this is "https://api.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of API. Use
     * {@link setFilesBase} or {@link setConnectBase} to interpect requests with other bases.
     */
    public StripeClientBuilder setApiBase(String address) {
      this.apiBase = address;
      return this;
    }

    public String getApiBase() {
      return this.apiBase;
    }

    /**
     * Set the base URL for the Stripe Files API. By default this is "https://files.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of FILES.
     */
    public StripeClientBuilder setFilesBase(String address) {
      this.filesBase = address;
      return this;
    }

    public String getFilesBase() {
      return this.filesBase;
    }

    /**
     * Set the base URL for the Stripe Connect API. By default this is "https://connect.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of CONNECT.
     */
    public StripeClientBuilder setConnectBase(String address) {
      this.connectBase = address;
      return this;
    }

    public String getConnectBase() {
      return this.connectBase;
    }

    /**
     * Set the base URL for the Stripe Meter Events API. By default this is
     * "https://events.stripe.com".
     *
     * <p>This only affects requests made with a {@link com.stripe.net.BaseAddress} of EVENTMES.
     */
    public StripeClientBuilder setMeterEventsBase(String address) {
      this.meterEventsBase = address;
      return this;
    }

    public String getMeterEventsBase() {
      return this.meterEventsBase;
    }

    public StripeClientBuilder setStripeAccount(String account) {
      this.stripeAccount = account;
      return this;
    }

    public String getStripeAccount() {
      return this.stripeAccount;
    }

    public StripeClientBuilder setStripeContext(String context) {
      this.stripeContext = context;
      return this;
    }

    public StripeClientBuilder setStripeContext(StripeContext context) {
      this.stripeContext = context == null ? null : context.toString();
      return this;
    }

    public String getStripeContext() {
      return this.stripeContext;
    }

    /** Constructs a {@link StripeResponseGetterOptions} with the specified values. */
    public StripeClient build() {
      return new StripeClient(new LiveStripeResponseGetter(buildOptions(), null));
    }

    StripeResponseGetterOptions buildOptions() {
      if (this.authenticator == null) {
        throw new IllegalArgumentException(
            "No authentication settings provided. Use setApiKey to set the Stripe API key");
      }
      return new ClientStripeResponseGetterOptions(
          this.authenticator,
          this.clientId,
          this.connectTimeout,
          this.readTimeout,
          this.maxNetworkRetries,
          this.connectionProxy,
          this.proxyCredential,
          this.apiBase,
          this.filesBase,
          this.connectBase,
          this.meterEventsBase,
          this.stripeAccount,
          this.stripeContext);
    }
  }

  /**
   * Send raw request to Stripe API. This is the lowest level method for interacting with the Stripe
   * API. This method is useful for interacting with endpoints that are not covered yet in
   * stripe-java.
   *
   * @param method the HTTP method
   * @param relativeUrl the relative URL of the request, e.g. "/v1/charges"
   * @param content the body of the request as a string
   * @return the JSON response as a string
   */
  public StripeResponse rawRequest(
      final ApiResource.RequestMethod method, final String relativeUrl, final String content)
      throws StripeException {
    return rawRequest(method, relativeUrl, content, null);
  }

  /**
   * Send raw request to Stripe API. This is the lowest level method for interacting with the Stripe
   * API. This method is useful for interacting with endpoints that are not covered yet in
   * stripe-java.
   *
   * @param method the HTTP method
   * @param relativeUrl the relative URL of the request, e.g. "/v1/charges"
   * @param content the body of the request as a string
   * @param options the special modifiers of the request
   * @return the JSON response as a string
   */
  public StripeResponse rawRequest(
      final ApiResource.RequestMethod method,
      final String relativeUrl,
      final String content,
      RawRequestOptions options)
      throws StripeException {
    if (options == null) {
      options = RawRequestOptions.builder().build();
    }
    if (method != ApiResource.RequestMethod.POST && content != null && !content.equals("")) {
      throw new IllegalArgumentException(
          "content is not allowed for non-POST requests. Please pass null and add request parameters to the query string of the URL.");
    }
    RawApiRequest req = new RawApiRequest(BaseAddress.API, method, relativeUrl, content, options);
    req = req.addUsage("stripe_client");
    req = req.addUsage("raw_request");
    return this.getResponseGetter().rawRequest(req);
  }

  /** Deserializes StripeResponse returned by rawRequest into a similar class. */
  public StripeObject deserialize(String rawJson, ApiMode apiMode) throws StripeException {
    return StripeObject.deserializeStripeObject(rawJson, this.getResponseGetter(), apiMode);
  }

  public StripeEventRouter router(
      String webhookSecret, StripeEventRouter.UnhandledEventHandler handler) {
    return new StripeEventRouter(webhookSecret, this, handler);
  }
}
