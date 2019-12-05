package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CountrySpecListParams;
import com.stripe.param.CountrySpecRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CountrySpec extends ApiResource implements HasId {
  /**
   * The default currency for this country. This applies to both payment methods and bank accounts.
   */
  @SerializedName("default_currency")
  String defaultCurrency;

  /** Unique identifier for the object. Represented as the ISO country code for this country. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `country_spec`.
   */
  @SerializedName("object")
  String object;

  /** Currencies that can be accepted in the specific country (for transfers). */
  @SerializedName("supported_bank_account_currencies")
  Map<String, List<String>> supportedBankAccountCurrencies;

  /** Currencies that can be accepted in the specified country (for payments). */
  @SerializedName("supported_payment_currencies")
  List<String> supportedPaymentCurrencies;

  /**
   * Payment methods available in the specified country. You may need to enable some payment methods
   * (e.g., [ACH](https://stripe.com/docs/ach)) on your account before they appear in this list. The
   * `stripe` payment method refers to [charging through your
   * platform](https://stripe.com/docs/connect/destination-charges).
   */
  @SerializedName("supported_payment_methods")
  List<String> supportedPaymentMethods;

  /** Countries that can accept transfers from the specified country. */
  @SerializedName("supported_transfer_countries")
  List<String> supportedTransferCountries;

  @SerializedName("verification_fields")
  VerificationFields verificationFields;

  /** Lists all Country Spec objects available in the API. */
  public static CountrySpecCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all Country Spec objects available in the API. */
  public static CountrySpecCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/country_specs");
    return ApiResource.requestCollection(url, params, CountrySpecCollection.class, options);
  }

  /** Lists all Country Spec objects available in the API. */
  public static CountrySpecCollection list(CountrySpecListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all Country Spec objects available in the API. */
  public static CountrySpecCollection list(CountrySpecListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/country_specs");
    return ApiResource.requestCollection(url, params, CountrySpecCollection.class, options);
  }

  /** Returns a Country Spec for a given Country code. */
  public static CountrySpec retrieve(String country) throws StripeException {
    return retrieve(country, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Returns a Country Spec for a given Country code. */
  public static CountrySpec retrieve(String country, RequestOptions options)
      throws StripeException {
    return retrieve(country, (Map<String, Object>) null, options);
  }

  /** Returns a Country Spec for a given Country code. */
  public static CountrySpec retrieve(
      String country, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/country_specs/%s", ApiResource.urlEncodeId(country)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CountrySpec.class, options);
  }

  /** Returns a Country Spec for a given Country code. */
  public static CountrySpec retrieve(
      String country, CountrySpecRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/country_specs/%s", ApiResource.urlEncodeId(country)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, CountrySpec.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationFields extends StripeObject {
    @SerializedName("company")
    Details company;

    @SerializedName("individual")
    Details individual;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Details extends StripeObject {
      /** Additional fields which are only required for some users. */
      @SerializedName("additional")
      List<String> additional;

      /** Fields which every account must eventually provide. */
      @SerializedName("minimum")
      List<String> minimum;
    }
  }
}
