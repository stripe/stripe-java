package com.stripe;

import com.stripe.net.*;
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

  // The beginning of the section generated from our OpenAPI spec
  public com.stripe.service.AccountLinkService accountLinks() {
    return new com.stripe.service.AccountLinkService(this.getResponseGetter());
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

  public com.stripe.service.BalanceTransactionService balanceTransactions() {
    return new com.stripe.service.BalanceTransactionService(this.getResponseGetter());
  }

  public com.stripe.service.BankAccountService bankAccounts() {
    return new com.stripe.service.BankAccountService(this.getResponseGetter());
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

  public com.stripe.service.CountrySpecService countrySpecs() {
    return new com.stripe.service.CountrySpecService(this.getResponseGetter());
  }

  public com.stripe.service.CouponService coupons() {
    return new com.stripe.service.CouponService(this.getResponseGetter());
  }

  public com.stripe.service.CreditNoteService creditNotes() {
    return new com.stripe.service.CreditNoteService(this.getResponseGetter());
  }

  public com.stripe.service.CustomerService customers() {
    return new com.stripe.service.CustomerService(this.getResponseGetter());
  }

  public com.stripe.service.DisputeService disputes() {
    return new com.stripe.service.DisputeService(this.getResponseGetter());
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

  public com.stripe.service.IdentityService identity() {
    return new com.stripe.service.IdentityService(this.getResponseGetter());
  }

  public com.stripe.service.InvoiceItemService invoiceItems() {
    return new com.stripe.service.InvoiceItemService(this.getResponseGetter());
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

  public com.stripe.service.PaymentIntentService paymentIntents() {
    return new com.stripe.service.PaymentIntentService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentLinkService paymentLinks() {
    return new com.stripe.service.PaymentLinkService(this.getResponseGetter());
  }

  public com.stripe.service.PaymentMethodService paymentMethods() {
    return new com.stripe.service.PaymentMethodService(this.getResponseGetter());
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

  // The end of the section generated from our OpenAPI spec
  static class ClientStripeResponseGetterOptions extends StripeResponseGetterOptions {
    // When adding setting here keep them in sync with settings in RequestOptions and
    // in the RequestOptions.merge method
    @Getter(onMethod_ = {@Override})
    private final String apiKey;

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

    ClientStripeResponseGetterOptions(
        String apiKey,
        String clientId,
        int connectTimeout,
        int readTimeout,
        int maxNetworkRetries,
        Proxy connectionProxy,
        PasswordAuthentication proxyCredential,
        String apiBase,
        String filesBase,
        String connectBase) {
      this.apiKey = apiKey;
      this.clientId = clientId;
      this.connectTimeout = connectTimeout;
      this.readTimeout = readTimeout;
      this.maxNetworkRetries = maxNetworkRetries;
      this.connectionProxy = connectionProxy;
      this.proxyCredential = proxyCredential;
      this.apiBase = apiBase;
      this.filesBase = filesBase;
      this.connectBase = connectBase;
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
    private String apiKey;
    private String clientId;
    private int connectTimeout = Stripe.DEFAULT_CONNECT_TIMEOUT;
    private int readTimeout = Stripe.DEFAULT_READ_TIMEOUT;
    private int maxNetworkRetries;
    private Proxy connectionProxy;
    private PasswordAuthentication proxyCredential;
    private String apiBase;
    private String filesBase;
    private String connectBase;

    /**
     * Constructs a request options builder with the global parameters (API key and client ID) as
     * default values.
     */
    public StripeClientBuilder() {}

    public String getApiKey() {
      return this.apiKey;
    }

    /**
     * Set API key to use for authenticating requests.
     *
     * @param apiKey API key
     */
    public StripeClientBuilder setApiKey(String apiKey) {
      this.apiKey = apiKey;
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

    /** Constructs a {@link StripeClient} with the specified configuration. */
    public StripeClient build() {
      return new StripeClient(new LiveStripeResponseGetter(buildOptions(), null));
    }

    StripeResponseGetterOptions buildOptions() {
      if (this.apiKey == null) {
        throw new IllegalArgumentException(
            "No API key provided. Use setApiKey to set the Stripe API key");
      }
      return new ClientStripeResponseGetterOptions(
          this.apiKey,
          this.clientId,
          connectTimeout,
          readTimeout,
          maxNetworkRetries,
          connectionProxy,
          proxyCredential,
          apiBase,
          filesBase,
          connectBase);
    }
  }
}
