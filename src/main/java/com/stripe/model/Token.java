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
import com.stripe.param.TokenCreateParams;
import com.stripe.param.TokenRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Tokenization is the process Stripe uses to collect sensitive card or bank account details, or
 * personally identifiable information (PII), directly from your customers in a secure manner. A
 * token representing this information is returned to your server to use. Use our <a
 * href="https://stripe.com/docs/payments">recommended payments integrations</a> to perform this
 * process on the client-side. This guarantees that no sensitive card data touches your server, and
 * allows your integration to operate in a PCI-compliant way.
 *
 * <p>If you can't use client-side tokenization, you can also create tokens using the API with
 * either your publishable or secret API key. If your integration uses this method, you're
 * responsible for any PCI compliance that it might require, and you must keep your secret API key
 * safe. Unlike with client-side tokenization, your customer's information isn't sent directly to
 * Stripe, so we can't determine how it's handled or stored.
 *
 * <p>You can't store or use tokens more than once. To store card or bank account information for
 * later use, create <a href="https://stripe.com/docs/api#customers">Customer</a> objects or <a
 * href="https://stripe.com/api#external_accounts">External accounts</a>. <a
 * href="https://stripe.com/docs/radar">Radar</a>, our integrated solution for automatic fraud
 * protection, performs best with integrations that use client-side tokenization.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Token extends ApiResource implements HasId {
  /**
   * These bank accounts are payment methods on {@code Customer} objects.
   *
   * <p>On the other hand <a href="https://stripe.com/api#external_accounts">External Accounts</a>
   * are transfer destinations on {@code Account} objects for connected accounts. They can be bank
   * accounts or debit cards as well, and are documented in the links above.
   *
   * <p>Related guide: <a href="https://stripe.com/payments/bank-debits-transfers">Bank debits and
   * transfers</a>
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

  /** IP address of the client that generates the token. */
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

  /** Determines if you have already used this token (you can only use tokens once). */
  @SerializedName("used")
  Boolean used;

  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any v1 API method in place of a bank account dictionary. You can only use this token once.
   * To do so, attach it to a <a href="https://stripe.com/docs/api#accounts">connected account</a>
   * where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  public static Token create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any v1 API method in place of a bank account dictionary. You can only use this token once.
   * To do so, attach it to a <a href="https://stripe.com/docs/api#accounts">connected account</a>
   * where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  public static Token create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tokens";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Token.class);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any v1 API method in place of a bank account dictionary. You can only use this token once.
   * To do so, attach it to a <a href="https://stripe.com/docs/api#accounts">connected account</a>
   * where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  public static Token create(TokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. You can use this token
   * with any v1 API method in place of a bank account dictionary. You can only use this token once.
   * To do so, attach it to a <a href="https://stripe.com/docs/api#accounts">connected account</a>
   * where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  public static Token create(TokenCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tokens";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Token.class);
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
    String path = String.format("/v1/tokens/%s", ApiResource.urlEncodeId(token));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Token.class);
  }

  /** Retrieves the token with the given ID. */
  public static Token retrieve(String token, TokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/tokens/%s", ApiResource.urlEncodeId(token));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Token.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(bankAccount, responseGetter);
    trySetResponseGetter(card, responseGetter);
  }
}
