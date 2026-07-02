// File generated from our OpenAPI spec
package com.stripe.model.crypto;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.crypto.CustomerPaymentTokenListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A read-only representation of a user's PaymentMethod for use in Crypto On Ramp transactions. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CustomerPaymentToken extends ApiResource implements HasId {
  /** A {@code card} PaymentToken, this hash contains details of the card PaymentToken. */
  @SerializedName("card")
  Card card;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code crypto.payment_token}.
   */
  @SerializedName("object")
  String object;

  /**
   * Type of the Payment Token.
   *
   * <p>One of {@code card}, or {@code us_bank_account}.
   */
  @SerializedName("type")
  String type;

  /**
   * A {@code us_bank_account} PaymentToken, this hash contains details of the US bank account
   * PaymentToken.
   */
  @SerializedName("us_bank_account")
  UsBankAccount usBankAccount;

  /** Lists the Payment Tokens for a Crypto Customer. */
  public static CustomerPaymentTokenCollection list(String id, Map<String, Object> params)
      throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Lists the Payment Tokens for a Crypto Customer. */
  public static CustomerPaymentTokenCollection list(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/crypto/customers/%s/payment_tokens", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, CustomerPaymentTokenCollection.class);
  }

  /** Lists the Payment Tokens for a Crypto Customer. */
  public static CustomerPaymentTokenCollection list(
      String id, CustomerPaymentTokenListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }

  /** Lists the Payment Tokens for a Crypto Customer. */
  public static CustomerPaymentTokenCollection list(
      String id, CustomerPaymentTokenListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/crypto/customers/%s/payment_tokens", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, CustomerPaymentTokenCollection.class);
  }

  /**
   * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Card extends StripeObject {
    /**
     * Card brand. Can be {@code amex}, {@code cartes_bancaires}, {@code diners}, {@code discover},
     * {@code eftpos_au}, {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code
     * visa} or {@code unknown}.
     */
    @SerializedName("brand")
    String brand;

    /** Two-digit number representing the card’s expiration month. */
    @SerializedName("exp_month")
    Long expMonth;

    /** Four-digit number representing the card’s expiration year. */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code unknown}.
     */
    @SerializedName("funding")
    String funding;

    /** The last four digits of the card. */
    @SerializedName("last4")
    String last4;

    /** If this Card is part of a card wallet, this contains the details of the card wallet. */
    @SerializedName("wallet")
    Wallet wallet;

    /**
     * For more details about Wallet, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Wallet extends StripeObject {
      /** The type of the card wallet, one of {@code apple_pay} or {@code google_pay}. */
      @SerializedName("type")
      String type;
    }
  }

  /**
   * For more details about UsBankAccount, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsBankAccount extends StripeObject {
    /**
     * Account type: {@code checkings} or {@code savings}.
     *
     * <p>One of {@code checking}, or {@code savings}.
     */
    @SerializedName("account_type")
    String accountType;

    /** The name of the bank. */
    @SerializedName("bank_name")
    String bankName;

    /** Last four digits of the bank account number. */
    @SerializedName("last4")
    String last4;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(usBankAccount, responseGetter);
  }
}
