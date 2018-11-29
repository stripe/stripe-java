package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Source extends ApiResource
    implements CustomerSource, PaymentIntentSource, PaymentSource, MetadataStore<Source> {
  SourceTypeAchCreditTransfer achCreditTransfer;

  SourceTypeAchDebit achDebit;

  SourceTypeAlipay alipay;

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the total amount associated with the
   * source. This is the amount for which the source will be chargeable once ready. Required for
   * `single_use` sources.
   */
  Long amount;

  SourceTypeBancontact bancontact;

  SourceTypeCard card;

  SourceTypeCardPresent cardPresent;

  /** The client secret of the source. Used for client-side retrieval using a publishable key. */
  String clientSecret;

  SourceCodeVerificationFlow codeVerification;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with
   * the source. This is the currency for which the source will be chargeable once ready. Required
   * for `single_use` sources.
   */
  String currency;

  /**
   * The ID of the customer to which this source is attached. This will not be present when the
   * source has not been attached to a customer.
   */
  String customer;

  SourceTypeEps eps;

  /**
   * The authentication `flow` of the source. `flow` is one of `redirect`, `receiver`,
   * `code_verification`, `none`.
   */
  String flow;

  SourceTypeGiropay giropay;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  SourceTypeIdeal ideal;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  SourceTypeMultibanco multibanco;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * Information about the owner of the payment instrument that may be used or required by
   * particular source types.
   */
  SourceOwner owner;

  SourceTypeP24 p24;

  SourceTypePaperCheck paperCheck;

  SourceReceiverFlow receiver;

  SourceRedirectFlow redirect;

  SourceTypeSepaCreditTransfer sepaCreditTransfer;

  SourceTypeSepaDebit sepaDebit;

  SourceTypeSofort sofort;

  /**
   * Extra information about a source. This will appear on your customer's statement every time you
   * charge the source.
   */
  String statementDescriptor;

  /**
   * The status of the source, one of `canceled`, `chargeable`, `consumed`, `failed`, or `pending`.
   * Only `chargeable` sources can be used to create a charge.
   */
  String status;

  SourceTypeThreeDSecure threeDSecure;

  /**
   * The `type` of the source. The `type` is a payment method, one of `ach_credit_transfer`,
   * `ach_debit`, `alipay`, `bancontact`, `card`, `card_present`, `eps`, `giropay`, `ideal`,
   * `multibanco`, `p24`, `paper_check`, `sepa_credit_transfer`, `sepa_debit`, `sofort`, or
   * `three_d_secure`. An additional hash is included on the source with a name matching this value.
   * It contains additional information specific to the [payment method](/docs/sources) used.
   */
  String type;

  /**
   * Either `reusable` or `single_use`. Whether this source should be reusable or not. Some source
   * types may or may not be reusable by construction, while others may leave the option at
   * creation. If an incompatible value is passed, an error will be returned.
   */
  String usage;

  /** Creates a new source object. */
  public static Source create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new source object. */
  public static Source create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/sources");
    return request(ApiResource.RequestMethod.POST, url, params, Source.class, options);
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
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/sources/%s", source));
    return request(ApiResource.RequestMethod.GET, url, params, Source.class, options);
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
    String url;
    if (this.getCustomer() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format("/v1/customers/%s/sources/%s", this.getCustomer(), this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.DELETE, url, params, Source.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/sources/%s/source_transactions", this.getId()));
    return requestCollection(url, params, SourceTransactionCollection.class, options);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the <code>metadata</code> and <code>owner</code> as arguments. It is
   * also possible to update type specific information for selected payment methods. Please refer to
   * our <a href="/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the <code>metadata</code> and <code>owner</code> as arguments. It is
   * also possible to update type specific information for selected payment methods. Please refer to
   * our <a href="/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/sources/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Source.class, options);
  }

  /** Verify a given source. */
  public Source verify(Map<String, Object> params) throws StripeException {
    return verify(params, (RequestOptions) null);
  }

  /** Verify a given source. */
  public Source verify(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/sources/%s/verify", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Source.class, options);
  }
}
