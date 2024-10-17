// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SourceCreateParams;
import com.stripe.param.SourceDetachParams;
import com.stripe.param.SourceRetrieveParams;
import com.stripe.param.SourceSourceTransactionsParams;
import com.stripe.param.SourceUpdateParams;
import com.stripe.param.SourceVerifyParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * {@code Source} objects allow you to accept a variety of payment methods. They represent a
 * customer's payment instrument, and can be used with the Stripe API just like a {@code Card}
 * object: once chargeable, they can be charged, or can be attached to customers.
 *
 * <p>Stripe doesn't recommend using the deprecated <a
 * href="https://stripe.com/docs/api/sources">Sources API</a>. We recommend that you adopt the <a
 * href="https://stripe.com/docs/api/payment_methods">PaymentMethods API</a>. This newer API
 * provides access to our latest features and payment method types.
 *
 * <p>Related guides: <a href="https://stripe.com/docs/sources">Sources API</a> and <a
 * href="https://stripe.com/docs/sources/customers">Sources &amp; Customers</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Source extends ApiResource implements MetadataStore<Source>, PaymentSource {
  @SerializedName("ach_credit_transfer")
  AchCreditTransfer achCreditTransfer;

  @SerializedName("ach_debit")
  AchDebit achDebit;

  @SerializedName("acss_debit")
  AcssDebit acssDebit;

  @SerializedName("alipay")
  Alipay alipay;

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the total amount associated with the
   * source. This is the amount for which the source will be chargeable once ready. Required for
   * {@code single_use} sources.
   */
  @SerializedName("amount")
  Long amount;

  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  @SerializedName("bancontact")
  Bancontact bancontact;

  @SerializedName("card")
  Card card;

  @SerializedName("card_present")
  CardPresent cardPresent;

  /** The client secret of the source. Used for client-side retrieval using a publishable key. */
  @SerializedName("client_secret")
  String clientSecret;

  @SerializedName("code_verification")
  CodeVerification codeVerification;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a>
   * associated with the source. This is the currency for which the source will be chargeable once
   * ready. Required for {@code single_use} sources.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The ID of the customer to which this source is attached. This will not be present when the
   * source has not been attached to a customer.
   */
  @SerializedName("customer")
  String customer;

  @SerializedName("eps")
  Eps eps;

  /**
   * The authentication {@code flow} of the source. {@code flow} is one of {@code redirect}, {@code
   * receiver}, {@code code_verification}, {@code none}.
   */
  @SerializedName("flow")
  String flow;

  @SerializedName("giropay")
  Giropay giropay;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("ideal")
  Ideal ideal;

  @SerializedName("klarna")
  Klarna klarna;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("multibanco")
  Multibanco multibanco;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code source}.
   */
  @SerializedName("object")
  String object;

  /**
   * Information about the owner of the payment instrument that may be used or required by
   * particular source types.
   */
  @SerializedName("owner")
  Owner owner;

  @SerializedName("p24")
  P24 p24;

  @SerializedName("paypal")
  Paypal paypal;

  @SerializedName("receiver")
  Receiver receiver;

  @SerializedName("redirect")
  Redirect redirect;

  @SerializedName("sepa_credit_transfer")
  SepaCreditTransfer sepaCreditTransfer;

  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  @SerializedName("sofort")
  Sofort sofort;

  @SerializedName("source_order")
  SourceOrder sourceOrder;

  /**
   * Extra information about a source. This will appear on your customer's statement every time you
   * charge the source.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The status of the source, one of {@code canceled}, {@code chargeable}, {@code consumed}, {@code
   * failed}, or {@code pending}. Only {@code chargeable} sources can be used to create a charge.
   */
  @SerializedName("status")
  String status;

  @SerializedName("three_d_secure")
  ThreeDSecure threeDSecure;

  /**
   * The {@code type} of the source. The {@code type} is a payment method, one of {@code
   * ach_credit_transfer}, {@code ach_debit}, {@code alipay}, {@code bancontact}, {@code card},
   * {@code card_present}, {@code eps}, {@code giropay}, {@code ideal}, {@code multibanco}, {@code
   * klarna}, {@code p24}, {@code sepa_debit}, {@code sofort}, {@code three_d_secure}, or {@code
   * wechat}. An additional hash is included on the source with a name matching this value. It
   * contains additional information specific to the <a
   * href="https://stripe.com/docs/sources">payment method</a> used.
   */
  @SerializedName("type")
  String type;

  /**
   * Either {@code reusable} or {@code single_use}. Whether this source should be reusable or not.
   * Some source types may or may not be reusable by construction, while others may leave the option
   * at creation. If an incompatible value is passed, an error will be returned.
   */
  @SerializedName("usage")
  String usage;

  @SerializedName("wechat")
  Wechat wechat;

  /** Creates a new source object. */
  public static Source create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new source object. */
  public static Source create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/sources";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Source.class);
  }

  /** Creates a new source object. */
  public static Source create(SourceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new source object. */
  public static Source create(SourceCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/sources";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Source.class);
  }

  /** Delete a specified source for a given customer. */
  public Source detach() throws StripeException {
    return detach((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Delete a specified source for a given customer. */
  public Source detach(Map<String, Object> params) throws StripeException {
    return detach(params, (RequestOptions) null);
  }

  /** Delete a specified source for a given customer. */
  public Source detach(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, Source.class);
  }

  /** Delete a specified source for a given customer. */
  public Source detach(SourceDetachParams params) throws StripeException {
    return detach(params, (RequestOptions) null);
  }

  /** Delete a specified source for a given customer. */
  public Source detach(SourceDetachParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s",
            ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Source.class);
  }

  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public static Source retrieve(String source) throws StripeException {
    return retrieve(source, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public static Source retrieve(String source, RequestOptions options) throws StripeException {
    return retrieve(source, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public static Source retrieve(String source, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/sources/%s", ApiResource.urlEncodeId(source));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Source.class);
  }

  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public static Source retrieve(String source, SourceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/sources/%s", ApiResource.urlEncodeId(source));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Source.class);
  }

  /** List source transactions for a given source. */
  public SourceTransactionCollection sourceTransactions() throws StripeException {
    return sourceTransactions((Map<String, Object>) null, (RequestOptions) null);
  }

  /** List source transactions for a given source. */
  public SourceTransactionCollection sourceTransactions(Map<String, Object> params)
      throws StripeException {
    return sourceTransactions(params, (RequestOptions) null);
  }

  /** List source transactions for a given source. */
  public SourceTransactionCollection sourceTransactions(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/sources/%s/source_transactions", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getResponseGetter().request(request, SourceTransactionCollection.class);
  }

  /** List source transactions for a given source. */
  public SourceTransactionCollection sourceTransactions(SourceSourceTransactionsParams params)
      throws StripeException {
    return sourceTransactions(params, (RequestOptions) null);
  }

  /** List source transactions for a given source. */
  public SourceTransactionCollection sourceTransactions(
      SourceSourceTransactionsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/sources/%s/source_transactions", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, SourceTransactionCollection.class);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  @Override
  public Source update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  @Override
  public Source update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/sources/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Source.class);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(SourceUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the {@code metadata} and {@code owner} as arguments. It is also
   * possible to update type specific information for selected payment methods. Please refer to our
   * <a href="https://stripe.com/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(SourceUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/sources/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Source.class);
  }

  /** Verify a given source. */
  public Source verify(Map<String, Object> params) throws StripeException {
    return verify(params, (RequestOptions) null);
  }

  /** Verify a given source. */
  public Source verify(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/sources/%s/verify", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Source.class);
  }

  /** Verify a given source. */
  public Source verify(SourceVerifyParams params) throws StripeException {
    return verify(params, (RequestOptions) null);
  }

  /** Verify a given source. */
  public Source verify(SourceVerifyParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/sources/%s/verify", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Source.class);
  }

  /**
   * For more details about AchCreditTransfer, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AchCreditTransfer extends StripeObject {
    @SerializedName("account_number")
    String accountNumber;

    @SerializedName("bank_name")
    String bankName;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("refund_account_holder_name")
    String refundAccountHolderName;

    @SerializedName("refund_account_holder_type")
    String refundAccountHolderType;

    @SerializedName("refund_routing_number")
    String refundRoutingNumber;

    @SerializedName("routing_number")
    String routingNumber;

    @SerializedName("swift_code")
    String swiftCode;
  }

  /**
   * For more details about AchDebit, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AchDebit extends StripeObject {
    @SerializedName("bank_name")
    String bankName;

    @SerializedName("country")
    String country;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("last4")
    String last4;

    @SerializedName("routing_number")
    String routingNumber;

    @SerializedName("type")
    String type;
  }

  /**
   * For more details about AcssDebit, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AcssDebit extends StripeObject {
    @SerializedName("bank_address_city")
    String bankAddressCity;

    @SerializedName("bank_address_line_1")
    String bankAddressLine1;

    @SerializedName("bank_address_line_2")
    String bankAddressLine2;

    @SerializedName("bank_address_postal_code")
    String bankAddressPostalCode;

    @SerializedName("bank_name")
    String bankName;

    @SerializedName("category")
    String category;

    @SerializedName("country")
    String country;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("last4")
    String last4;

    @SerializedName("routing_number")
    String routingNumber;
  }

  /**
   * For more details about Alipay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Alipay extends StripeObject {
    @SerializedName("data_string")
    String dataString;

    @SerializedName("native_url")
    String nativeUrl;

    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /**
   * For more details about AuBecsDebit, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecsDebit extends StripeObject {
    @SerializedName("bsb_number")
    String bsbNumber;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("last4")
    String last4;
  }

  /**
   * For more details about Bancontact, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Bancontact extends StripeObject {
    @SerializedName("bank_code")
    String bankCode;

    @SerializedName("bank_name")
    String bankName;

    @SerializedName("bic")
    String bic;

    @SerializedName("iban_last4")
    String ibanLast4;

    @SerializedName("preferred_language")
    String preferredLanguage;

    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /**
   * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Card extends StripeObject {
    @SerializedName("address_line1_check")
    String addressLine1Check;

    @SerializedName("address_zip_check")
    String addressZipCheck;

    @SerializedName("brand")
    String brand;

    @SerializedName("country")
    String country;

    @SerializedName("cvc_check")
    String cvcCheck;

    @SerializedName("description")
    String description;

    @SerializedName("dynamic_last4")
    String dynamicLast4;

    @SerializedName("exp_month")
    Long expMonth;

    @SerializedName("exp_year")
    Long expYear;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("funding")
    String funding;

    @SerializedName("iin")
    String iin;

    @SerializedName("issuer")
    String issuer;

    @SerializedName("last4")
    String last4;

    @SerializedName("name")
    String name;

    @SerializedName("three_d_secure")
    String threeDSecure;

    @SerializedName("tokenization_method")
    String tokenizationMethod;
  }

  /**
   * For more details about CardPresent, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CardPresent extends StripeObject {
    @SerializedName("application_cryptogram")
    String applicationCryptogram;

    @SerializedName("application_preferred_name")
    String applicationPreferredName;

    @SerializedName("authorization_code")
    String authorizationCode;

    @SerializedName("authorization_response_code")
    String authorizationResponseCode;

    @SerializedName("brand")
    String brand;

    @SerializedName("country")
    String country;

    @SerializedName("cvm_type")
    String cvmType;

    @SerializedName("data_type")
    String dataType;

    @SerializedName("dedicated_file_name")
    String dedicatedFileName;

    @SerializedName("description")
    String description;

    @SerializedName("emv_auth_data")
    String emvAuthData;

    @SerializedName("evidence_customer_signature")
    String evidenceCustomerSignature;

    @SerializedName("evidence_transaction_certificate")
    String evidenceTransactionCertificate;

    @SerializedName("exp_month")
    Long expMonth;

    @SerializedName("exp_year")
    Long expYear;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("funding")
    String funding;

    @SerializedName("iin")
    String iin;

    @SerializedName("issuer")
    String issuer;

    @SerializedName("last4")
    String last4;

    @SerializedName("pos_device_id")
    String posDeviceId;

    @SerializedName("pos_entry_mode")
    String posEntryMode;

    @SerializedName("read_method")
    String readMethod;

    @SerializedName("reader")
    String reader;

    @SerializedName("terminal_verification_results")
    String terminalVerificationResults;

    @SerializedName("transaction_status_information")
    String transactionStatusInformation;
  }

  /**
   * For more details about CodeVerification, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CodeVerification extends StripeObject {
    /**
     * The number of attempts remaining to authenticate the source object with a verification code.
     */
    @SerializedName("attempts_remaining")
    Long attemptsRemaining;

    /**
     * The status of the code verification, either {@code pending} (awaiting verification, {@code
     * attempts_remaining} should be greater than 0), {@code succeeded} (successful verification) or
     * {@code failed} (failed verification, cannot be verified anymore as {@code attempts_remaining}
     * should be 0).
     */
    @SerializedName("status")
    String status;
  }

  /**
   * For more details about Eps, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Eps extends StripeObject {
    @SerializedName("reference")
    String reference;

    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /**
   * For more details about Giropay, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Giropay extends StripeObject {
    @SerializedName("bank_code")
    String bankCode;

    @SerializedName("bank_name")
    String bankName;

    @SerializedName("bic")
    String bic;

    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /**
   * For more details about Ideal, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Ideal extends StripeObject {
    @SerializedName("bank")
    String bank;

    @SerializedName("bic")
    String bic;

    @SerializedName("iban_last4")
    String ibanLast4;

    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /**
   * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Klarna extends StripeObject {
    @SerializedName("background_image_url")
    String backgroundImageUrl;

    @SerializedName("client_token")
    String clientToken;

    @SerializedName("first_name")
    String firstName;

    @SerializedName("last_name")
    String lastName;

    @SerializedName("locale")
    String locale;

    @SerializedName("logo_url")
    String logoUrl;

    @SerializedName("page_title")
    String pageTitle;

    @SerializedName("pay_later_asset_urls_descriptive")
    String payLaterAssetUrlsDescriptive;

    @SerializedName("pay_later_asset_urls_standard")
    String payLaterAssetUrlsStandard;

    @SerializedName("pay_later_name")
    String payLaterName;

    @SerializedName("pay_later_redirect_url")
    String payLaterRedirectUrl;

    @SerializedName("pay_now_asset_urls_descriptive")
    String payNowAssetUrlsDescriptive;

    @SerializedName("pay_now_asset_urls_standard")
    String payNowAssetUrlsStandard;

    @SerializedName("pay_now_name")
    String payNowName;

    @SerializedName("pay_now_redirect_url")
    String payNowRedirectUrl;

    @SerializedName("pay_over_time_asset_urls_descriptive")
    String payOverTimeAssetUrlsDescriptive;

    @SerializedName("pay_over_time_asset_urls_standard")
    String payOverTimeAssetUrlsStandard;

    @SerializedName("pay_over_time_name")
    String payOverTimeName;

    @SerializedName("pay_over_time_redirect_url")
    String payOverTimeRedirectUrl;

    @SerializedName("payment_method_categories")
    String paymentMethodCategories;

    @SerializedName("purchase_country")
    String purchaseCountry;

    @SerializedName("purchase_type")
    String purchaseType;

    @SerializedName("redirect_url")
    String redirectUrl;

    @SerializedName("shipping_delay")
    Long shippingDelay;

    @SerializedName("shipping_first_name")
    String shippingFirstName;

    @SerializedName("shipping_last_name")
    String shippingLastName;
  }

  /**
   * For more details about Multibanco, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Multibanco extends StripeObject {
    @SerializedName("entity")
    String entity;

    @SerializedName("reference")
    String reference;

    @SerializedName("refund_account_holder_address_city")
    String refundAccountHolderAddressCity;

    @SerializedName("refund_account_holder_address_country")
    String refundAccountHolderAddressCountry;

    @SerializedName("refund_account_holder_address_line1")
    String refundAccountHolderAddressLine1;

    @SerializedName("refund_account_holder_address_line2")
    String refundAccountHolderAddressLine2;

    @SerializedName("refund_account_holder_address_postal_code")
    String refundAccountHolderAddressPostalCode;

    @SerializedName("refund_account_holder_address_state")
    String refundAccountHolderAddressState;

    @SerializedName("refund_account_holder_name")
    String refundAccountHolderName;

    @SerializedName("refund_iban")
    String refundIban;
  }

  /**
   * For more details about Owner, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Owner extends StripeObject {
    /** Owner's address. */
    @SerializedName("address")
    Address address;

    /** Owner's email address. */
    @SerializedName("email")
    String email;

    /** Owner's full name. */
    @SerializedName("name")
    String name;

    /** Owner's phone number (including extension). */
    @SerializedName("phone")
    String phone;

    /**
     * Verified owner's address. Verified values are verified or provided by the payment method
     * directly (and if supported) at the time of authorization or settlement. They cannot be set or
     * mutated.
     */
    @SerializedName("verified_address")
    Address verifiedAddress;

    /**
     * Verified owner's email address. Verified values are verified or provided by the payment
     * method directly (and if supported) at the time of authorization or settlement. They cannot be
     * set or mutated.
     */
    @SerializedName("verified_email")
    String verifiedEmail;

    /**
     * Verified owner's full name. Verified values are verified or provided by the payment method
     * directly (and if supported) at the time of authorization or settlement. They cannot be set or
     * mutated.
     */
    @SerializedName("verified_name")
    String verifiedName;

    /**
     * Verified owner's phone number (including extension). Verified values are verified or provided
     * by the payment method directly (and if supported) at the time of authorization or settlement.
     * They cannot be set or mutated.
     */
    @SerializedName("verified_phone")
    String verifiedPhone;
  }

  /**
   * For more details about P24, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class P24 extends StripeObject {
    @SerializedName("reference")
    String reference;
  }

  /**
   * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Paypal extends StripeObject {
    @SerializedName("billing_agreement")
    String billingAgreement;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("payer_id")
    String payerId;

    @SerializedName("reference_id")
    String referenceId;

    @SerializedName("reference_transaction_amount")
    String referenceTransactionAmount;

    @SerializedName("reference_transaction_charged")
    Boolean referenceTransactionCharged;

    @SerializedName("statement_descriptor")
    String statementDescriptor;

    @SerializedName("transaction_id")
    String transactionId;

    @SerializedName("verified_email")
    String verifiedEmail;
  }

  /**
   * For more details about Receiver, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Receiver extends StripeObject {
    /**
     * The address of the receiver source. This is the value that should be communicated to the
     * customer to send their funds to.
     */
    @SerializedName("address")
    String address;

    /**
     * The total amount that was moved to your balance. This is almost always equal to the amount
     * charged. In rare cases when customers deposit excess funds and we are unable to refund those,
     * those funds get moved to your balance and show up in amount_charged as well. The amount
     * charged is expressed in the source's currency.
     */
    @SerializedName("amount_charged")
    Long amountCharged;

    /**
     * The total amount received by the receiver source. {@code amount_received = amount_returned +
     * amount_charged} should be true for consumed sources unless customers deposit excess funds.
     * The amount received is expressed in the source's currency.
     */
    @SerializedName("amount_received")
    Long amountReceived;

    /**
     * The total amount that was returned to the customer. The amount returned is expressed in the
     * source's currency.
     */
    @SerializedName("amount_returned")
    Long amountReturned;

    /** Type of refund attribute method, one of {@code email}, {@code manual}, or {@code none}. */
    @SerializedName("refund_attributes_method")
    String refundAttributesMethod;

    /**
     * Type of refund attribute status, one of {@code missing}, {@code requested}, or {@code
     * available}.
     */
    @SerializedName("refund_attributes_status")
    String refundAttributesStatus;
  }

  /**
   * For more details about Redirect, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Redirect extends StripeObject {
    /**
     * The failure reason for the redirect, either {@code user_abort} (the customer aborted or
     * dropped out of the redirect flow), {@code declined} (the authentication failed or the
     * transaction was declined), or {@code processing_error} (the redirect failed due to a
     * technical error). Present only if the redirect status is {@code failed}.
     */
    @SerializedName("failure_reason")
    String failureReason;

    /** The URL you provide to redirect the customer to after they authenticated their payment. */
    @SerializedName("return_url")
    String returnUrl;

    /**
     * The status of the redirect, either {@code pending} (ready to be used by your customer to
     * authenticate the transaction), {@code succeeded} (succesful authentication, cannot be reused)
     * or {@code not_required} (redirect should not be used) or {@code failed} (failed
     * authentication, cannot be reused).
     */
    @SerializedName("status")
    String status;

    /**
     * The URL provided to you to redirect a customer to as part of a {@code redirect}
     * authentication flow.
     */
    @SerializedName("url")
    String url;
  }

  /**
   * For more details about SepaCreditTransfer, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaCreditTransfer extends StripeObject {
    @SerializedName("bank_name")
    String bankName;

    @SerializedName("bic")
    String bic;

    @SerializedName("iban")
    String iban;

    @SerializedName("refund_account_holder_address_city")
    String refundAccountHolderAddressCity;

    @SerializedName("refund_account_holder_address_country")
    String refundAccountHolderAddressCountry;

    @SerializedName("refund_account_holder_address_line1")
    String refundAccountHolderAddressLine1;

    @SerializedName("refund_account_holder_address_line2")
    String refundAccountHolderAddressLine2;

    @SerializedName("refund_account_holder_address_postal_code")
    String refundAccountHolderAddressPostalCode;

    @SerializedName("refund_account_holder_address_state")
    String refundAccountHolderAddressState;

    @SerializedName("refund_account_holder_name")
    String refundAccountHolderName;

    @SerializedName("refund_iban")
    String refundIban;
  }

  /**
   * For more details about SepaDebit, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaDebit extends StripeObject {
    @SerializedName("bank_code")
    String bankCode;

    @SerializedName("branch_code")
    String branchCode;

    @SerializedName("country")
    String country;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("last4")
    String last4;

    @SerializedName("mandate_reference")
    String mandateReference;

    @SerializedName("mandate_url")
    String mandateUrl;
  }

  /**
   * For more details about Sofort, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Sofort extends StripeObject {
    @SerializedName("bank_code")
    String bankCode;

    @SerializedName("bank_name")
    String bankName;

    @SerializedName("bic")
    String bic;

    @SerializedName("country")
    String country;

    @SerializedName("iban_last4")
    String ibanLast4;

    @SerializedName("preferred_language")
    String preferredLanguage;

    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  /**
   * For more details about SourceOrder, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SourceOrder extends StripeObject {
    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
     * Japanese Yen being a zero-decimal currency) representing the total amount for the order.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /** The email address of the customer placing the order. */
    @SerializedName("email")
    String email;

    /** List of items constituting the order. */
    @SerializedName("items")
    List<Source.SourceOrder.Item> items;

    @SerializedName("shipping")
    ShippingDetails shipping;

    /**
     * For more details about Item, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Item extends StripeObject {
      /** The amount (price) for this order item. */
      @SerializedName("amount")
      Long amount;

      /** This currency of this order item. Required when {@code amount} is present. */
      @SerializedName("currency")
      String currency;

      /** Human-readable description for this order item. */
      @SerializedName("description")
      String description;

      /**
       * The ID of the associated object for this line item. Expandable if not null (e.g.,
       * expandable to a SKU).
       */
      @SerializedName("parent")
      String parent;

      /**
       * The quantity of this order item. When type is {@code sku}, this is the number of instances
       * of the SKU to be ordered.
       */
      @SerializedName("quantity")
      Long quantity;

      /** The type of this order item. Must be {@code sku}, {@code tax}, or {@code shipping}. */
      @SerializedName("type")
      String type;
    }
  }

  /**
   * For more details about ThreeDSecure, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ThreeDSecure extends StripeObject {
    @SerializedName("address_line1_check")
    String addressLine1Check;

    @SerializedName("address_zip_check")
    String addressZipCheck;

    @SerializedName("authenticated")
    Boolean authenticated;

    @SerializedName("brand")
    String brand;

    @SerializedName("card")
    String card;

    @SerializedName("country")
    String country;

    @SerializedName("customer")
    String customer;

    @SerializedName("cvc_check")
    String cvcCheck;

    @SerializedName("description")
    String description;

    @SerializedName("dynamic_last4")
    String dynamicLast4;

    @SerializedName("exp_month")
    Long expMonth;

    @SerializedName("exp_year")
    Long expYear;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("funding")
    String funding;

    @SerializedName("iin")
    String iin;

    @SerializedName("issuer")
    String issuer;

    @SerializedName("last4")
    String last4;

    @SerializedName("name")
    String name;

    @SerializedName("three_d_secure")
    String threeDSecure;

    @SerializedName("tokenization_method")
    String tokenizationMethod;
  }

  /**
   * For more details about Wechat, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Wechat extends StripeObject {
    @SerializedName("prepay_id")
    String prepayId;

    @SerializedName("qr_code_url")
    String qrCodeUrl;

    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(achCreditTransfer, responseGetter);
    trySetResponseGetter(achDebit, responseGetter);
    trySetResponseGetter(acssDebit, responseGetter);
    trySetResponseGetter(alipay, responseGetter);
    trySetResponseGetter(auBecsDebit, responseGetter);
    trySetResponseGetter(bancontact, responseGetter);
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(cardPresent, responseGetter);
    trySetResponseGetter(codeVerification, responseGetter);
    trySetResponseGetter(eps, responseGetter);
    trySetResponseGetter(giropay, responseGetter);
    trySetResponseGetter(ideal, responseGetter);
    trySetResponseGetter(klarna, responseGetter);
    trySetResponseGetter(multibanco, responseGetter);
    trySetResponseGetter(owner, responseGetter);
    trySetResponseGetter(p24, responseGetter);
    trySetResponseGetter(paypal, responseGetter);
    trySetResponseGetter(receiver, responseGetter);
    trySetResponseGetter(redirect, responseGetter);
    trySetResponseGetter(sepaCreditTransfer, responseGetter);
    trySetResponseGetter(sepaDebit, responseGetter);
    trySetResponseGetter(sofort, responseGetter);
    trySetResponseGetter(sourceOrder, responseGetter);
    trySetResponseGetter(threeDSecure, responseGetter);
    trySetResponseGetter(wechat, responseGetter);
  }
}
