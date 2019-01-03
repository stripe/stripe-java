package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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
  String defaultCurrency;

  /** Unique identifier for the object. Represented as the ISO country code for this country. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** Currencies that can be accepted in the specific country (for transfers). */
  Map<String, List<String>> supportedBankAccountCurrencies;

  /** Currencies that can be accepted in the specified country (for payments). */
  List<String> supportedPaymentCurrencies;

  /**
   * Payment methods available in the specified country. You may need to enable some payment methods
   * (e.g., [ACH](https://stripe.com/docs/ach)) on your account before they appear in this list. The
   * `stripe` payment method refers to [charging through your
   * platform](https://stripe.com/docs/connect/destination-charges).
   */
  List<String> supportedPaymentMethods;

  /** Countries that can accept transfers from the specified country. */
  List<String> supportedTransferCountries;

  VerificationFields verificationFields;

  /** Lists all Country Spec objects available in the API. */
  public static CountrySpecCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all Country Spec objects available in the API. */
  public static CountrySpecCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/country_specs");
    return requestCollection(url, params, CountrySpecCollection.class, options);
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
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/country_specs/%s", country));
    return request(ApiResource.RequestMethod.GET, url, params, CountrySpec.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationFieldDetails extends StripeObject {
    /** Additional fields which are only required for some users. */
    List<String> additional;

    /** Fields which every account must eventually provide. */
    List<String> minimum;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationFields extends StripeObject {
    VerificationFieldDetails company;

    VerificationFieldDetails individual;
  }
}
