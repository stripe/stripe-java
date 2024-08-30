// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.TokenListParams;
import com.stripe.param.issuing.TokenRetrieveParams;
import com.stripe.param.issuing.TokenUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An issuing token object is created when an issued card is added to a digital wallet. As a <a
 * href="https://stripe.com/docs/issuing">card issuer</a>, you can <a
 * href="https://stripe.com/docs/issuing/controls/token-management">view and manage these tokens</a>
 * through Stripe.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Token extends ApiResource implements HasId {
  /** Card associated with this token. */
  @SerializedName("card")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Card> card;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The hashed ID derived from the device ID from the card network associated with the token. */
  @SerializedName("device_fingerprint")
  String deviceFingerprint;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The last four digits of the token. */
  @SerializedName("last4")
  String last4;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The token service provider / card network associated with the token.
   *
   * <p>One of {@code mastercard}, or {@code visa}.
   */
  @SerializedName("network")
  String network;

  @SerializedName("network_data")
  NetworkData networkData;

  /**
   * Time at which the token was last updated by the card network. Measured in seconds since the
   * Unix epoch.
   */
  @SerializedName("network_updated_at")
  Long networkUpdatedAt;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.token}.
   */
  @SerializedName("object")
  String object;

  /**
   * The usage state of the token.
   *
   * <p>One of {@code active}, {@code deleted}, {@code requested}, or {@code suspended}.
   */
  @SerializedName("status")
  String status;

  /**
   * The digital wallet for this token, if one was used.
   *
   * <p>One of {@code apple_pay}, {@code google_pay}, or {@code samsung_pay}.
   */
  @SerializedName("wallet_provider")
  String walletProvider;

  /** Get ID of expandable {@code card} object. */
  public String getCard() {
    return (this.card != null) ? this.card.getId() : null;
  }

  public void setCard(String id) {
    this.card = ApiResource.setExpandableFieldId(id, this.card);
  }

  /** Get expanded {@code card}. */
  public Card getCardObject() {
    return (this.card != null) ? this.card.getExpanded() : null;
  }

  public void setCardObject(Card expandableObject) {
    this.card = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /** Lists all Issuing {@code Token} objects for a given card. */
  public static TokenCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all Issuing {@code Token} objects for a given card. */
  public static TokenCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/tokens";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TokenCollection.class);
  }

  /** Lists all Issuing {@code Token} objects for a given card. */
  public static TokenCollection list(TokenListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all Issuing {@code Token} objects for a given card. */
  public static TokenCollection list(TokenListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/tokens";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TokenCollection.class);
  }

  /** Retrieves an Issuing {@code Token} object. */
  public static Token retrieve(String token) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing {@code Token} object. */
  public static Token retrieve(String token, RequestOptions options) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing {@code Token} object. */
  public static Token retrieve(String token, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/tokens/%s", ApiResource.urlEncodeId(token));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Token.class);
  }

  /** Retrieves an Issuing {@code Token} object. */
  public static Token retrieve(String token, TokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/issuing/tokens/%s", ApiResource.urlEncodeId(token));
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

  /** Attempts to update the specified Issuing {@code Token} object to the status specified. */
  public Token update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Attempts to update the specified Issuing {@code Token} object to the status specified. */
  public Token update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/issuing/tokens/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Token.class);
  }

  /** Attempts to update the specified Issuing {@code Token} object to the status specified. */
  public Token update(TokenUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Attempts to update the specified Issuing {@code Token} object to the status specified. */
  public Token update(TokenUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/issuing/tokens/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Token.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NetworkData extends StripeObject {
    @SerializedName("device")
    Device device;

    @SerializedName("mastercard")
    Mastercard mastercard;

    /**
     * The network that the token is associated with. An additional hash is included with a name
     * matching this value, containing tokenization data specific to the card network.
     *
     * <p>One of {@code mastercard}, or {@code visa}.
     */
    @SerializedName("type")
    String type;

    @SerializedName("visa")
    Visa visa;

    @SerializedName("wallet_provider")
    WalletProvider walletProvider;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Device extends StripeObject {
      /** An obfuscated ID derived from the device ID. */
      @SerializedName("device_fingerprint")
      String deviceFingerprint;

      /** The IP address of the device at provisioning time. */
      @SerializedName("ip_address")
      String ipAddress;

      /**
       * The geographic latitude/longitude coordinates of the device at provisioning time. The
       * format is [+-]decimal/[+-]decimal.
       */
      @SerializedName("location")
      String location;

      /** The name of the device used for tokenization. */
      @SerializedName("name")
      String name;

      /** The phone number of the device used for tokenization. */
      @SerializedName("phone_number")
      String phoneNumber;

      /**
       * The type of device used for tokenization.
       *
       * <p>One of {@code other}, {@code phone}, or {@code watch}.
       */
      @SerializedName("type")
      String type;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mastercard extends StripeObject {
      /** A unique reference ID from MasterCard to represent the card account number. */
      @SerializedName("card_reference_id")
      String cardReferenceId;

      /** The network-unique identifier for the token. */
      @SerializedName("token_reference_id")
      String tokenReferenceId;

      /** The ID of the entity requesting tokenization, specific to MasterCard. */
      @SerializedName("token_requestor_id")
      String tokenRequestorId;

      /**
       * The name of the entity requesting tokenization, if known. This is directly provided from
       * MasterCard.
       */
      @SerializedName("token_requestor_name")
      String tokenRequestorName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Visa extends StripeObject {
      /** A unique reference ID from Visa to represent the card account number. */
      @SerializedName("card_reference_id")
      String cardReferenceId;

      /** The network-unique identifier for the token. */
      @SerializedName("token_reference_id")
      String tokenReferenceId;

      /** The ID of the entity requesting tokenization, specific to Visa. */
      @SerializedName("token_requestor_id")
      String tokenRequestorId;

      /**
       * Degree of risk associated with the token between {@code 01} and {@code 99}, with higher
       * number indicating higher risk. A {@code 00} value indicates the token was not scored by
       * Visa.
       */
      @SerializedName("token_risk_score")
      String tokenRiskScore;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class WalletProvider extends StripeObject {
      /** The wallet provider-given account ID of the digital wallet the token belongs to. */
      @SerializedName("account_id")
      String accountId;

      /**
       * An evaluation on the trustworthiness of the wallet account between 1 and 5. A higher score
       * indicates more trustworthy.
       */
      @SerializedName("account_trust_score")
      Long accountTrustScore;

      /**
       * The method used for tokenizing a card.
       *
       * <p>One of {@code app}, {@code manual}, {@code on_file}, or {@code other}.
       */
      @SerializedName("card_number_source")
      String cardNumberSource;

      @SerializedName("cardholder_address")
      CardholderAddress cardholderAddress;

      /** The name of the cardholder tokenizing the card. */
      @SerializedName("cardholder_name")
      String cardholderName;

      /**
       * An evaluation on the trustworthiness of the device. A higher score indicates more
       * trustworthy.
       */
      @SerializedName("device_trust_score")
      Long deviceTrustScore;

      /** The hashed email address of the cardholder's account with the wallet provider. */
      @SerializedName("hashed_account_email_address")
      String hashedAccountEmailAddress;

      /** The reasons for suggested tokenization given by the card network. */
      @SerializedName("reason_codes")
      List<String> reasonCodes;

      /**
       * The recommendation on responding to the tokenization request.
       *
       * <p>One of {@code approve}, {@code decline}, or {@code require_auth}.
       */
      @SerializedName("suggested_decision")
      String suggestedDecision;

      /** The version of the standard for mapping reason codes followed by the wallet provider. */
      @SerializedName("suggested_decision_version")
      String suggestedDecisionVersion;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CardholderAddress extends StripeObject {
        /** The street address of the cardholder tokenizing the card. */
        @SerializedName("line1")
        String line1;

        /** The postal code of the cardholder tokenizing the card. */
        @SerializedName("postal_code")
        String postalCode;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(networkData, responseGetter);
  }
}
