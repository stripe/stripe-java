package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.CountrySpec;
import com.stripe.model.CountrySpecCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class CountrySpecTest extends BaseStripeTest {
  public static final String COUNTRY_SPEC_ID = "US";

  @Test
  public void testRetrieve() throws StripeException {
    final CountrySpec countrySpec = CountrySpec.retrieve(COUNTRY_SPEC_ID);

    assertNotNull(countrySpec);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/country_specs/%s", COUNTRY_SPEC_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    CountrySpecCollection countrySpecs = CountrySpec.list(params);

    assertNotNull(countrySpecs);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/country_specs"), params);
  }
}
