package com.stripe.model;

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
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String defaultCurrency;
  Map<String, List<String>> supportedBankAccountCurrencies;
  List<String> supportedPaymentCurrencies;
  List<String> supportedPaymentMethods;
  VerificationFields verificationFields;

  // <editor-fold desc="list">
  /**
   * List country specs.
   */
  public static CountrySpecCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List country specs.
   */
  public static CountrySpecCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(CountrySpec.class), params, CountrySpecCollection.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a country spec.
   */
  public static CountrySpec retrieve(String country) throws StripeException {
    return retrieve(country, null);
  }

  /**
   * Retrieve a country spec.
   */
  public static CountrySpec retrieve(String country, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(CountrySpec.class, country), null,
        CountrySpec.class, options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerificationFields extends StripeObject {
    Details individual;
    Details company;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Details extends StripeObject {
      List<String> additional;
      List<String> minimum;
    }
  }
}
