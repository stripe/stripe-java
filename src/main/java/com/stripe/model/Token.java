// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TokenCreateParams;
import com.stripe.param.TokenRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Tokenization is the process Stripe uses to collect sensitive card or bank account details, or
 * personally identifiable information (PII), directly from your customers in a secure manner. A
 * token representing this information is returned to your server to use. You should use our <a
 * href="https://stripe.com/docs/payments">recommended payments integrations</a> to perform this
 * process client-side. This ensures that no sensitive card data touches your server, and allows
 * your integration to operate in a PCI-compliant way.
 *
 * <p>If you cannot use client-side tokenization, you can also create tokens using the API with
 * either your publishable or secret API key. Keep in mind that if your integration uses this
 * method, you are responsible for any PCI compliance that may be required, and you must keep your
 * secret API key safe. Unlike with client-side tokenization, your customer's information is not
 * sent directly to Stripe, so we cannot determine how it is handled or stored.
 *
 * <p>Tokens cannot be stored or used more than once. To store card or bank account information for
 * later use, you can create <a href="https://stripe.com/docs/api#customers">Customer</a> objects or
 * <a href="https://stripe.com/docs/api#external_accounts">Custom accounts</a>. Note that <a
 * href="https://stripe.com/docs/radar">Radar</a>, our integrated solution for automatic fraud
 * protection, performs best with integrations that use client-side tokenization.
 *
 * <p>Related guide: <a
 * href="https://stripe.com/docs/payments/accept-a-payment-charges#web-create-token">Accept a
 * payment with Charges and Tokens</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Token extends ApiResource implements HasId {
  /**
   * These bank accounts are payment methods on {@code Customer} objects.
   *
   * <p>On the other hand <a href="https://stripe.com/docs/api#external_accounts">External
   * Accounts</a> are transfer destinations on {@code Account} objects for <a
   * href="https://stripe.com/docs/connect/custom-accounts">Custom accounts</a>. They can be bank
   * accounts or debit cards as well, and are documented in the links above.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/payments/bank-debits-transfers">Bank debits
   * and transfers</a>
   */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  /**
   * You can store multiple cards on a customer in order to charge the customer later. You can also
   * store multiple debit cards on a recipient in order to transfer to those cards later.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/sources/cards">Card payments with
   * Sources</a>
   */
  @SerializedName("card")
  Card card;

  /** IP address of the client that generated the token. */
  @SerializedName("client_ip")
  String clientIp;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code token}.
   */
  @SerializedName("object")
  String object;

  /** Type of the token: {@code account}, {@code bank_account}, {@code card}, or {@code pii}. */
  @SerializedName("type")
  String type;

  /** Whether this token has already been used (tokens can be used only once). */
  @SerializedName("used")
  Boolean used;

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public static Token create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public static Token create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tokens");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Token.class, options);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public static Token create(TokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="https://stripe.com/docs/api#accounts">Custom account</a>.
   */
  public static Token create(TokenCreateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tokens");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Token.class, options);
  }

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token, RequestOptions options) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, options);
  }

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/tokens/%s", ApiResource.urlEncodeId(token)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Token.class, options);
  }

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token, TokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/tokens/%s", ApiResource.urlEncodeId(token)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Token.class, options);
  }
}
