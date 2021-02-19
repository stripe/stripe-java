package com.stripe.functional.billingportal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.billingportal.Configuration;
import com.stripe.net.ApiResource;
import com.stripe.param.billingportal.ConfigurationCreateParams;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ConfigurationTest extends BaseStripeTest {
  public static final String SESSION_ID = "bps_123";

  @Test
  public void testCreate() throws StripeException {

    List<ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate> allowedUpdates =
        new ArrayList<>();
    allowedUpdates.add(ConfigurationCreateParams.Features.CustomerUpdate.AllowedUpdate.ADDRESS);
    ConfigurationCreateParams params =
        ConfigurationCreateParams.builder()
            .setBusinessProfile(
                ConfigurationCreateParams.BusinessProfile.builder()
                    .setPrivacyPolicyUrl("https://example.com/privacy")
                    .setTermsOfServiceUrl("https://example.com/tos")
                    .build())
            .setFeatures(
                ConfigurationCreateParams.Features.builder()
                    .setCustomerUpdate(
                        ConfigurationCreateParams.Features.CustomerUpdate.builder()
                            .setAllowedUpdates(allowedUpdates)
                            .setEnabled(true)
                            .build())
                    .build())
            .build();

    final Configuration configuration = Configuration.create(params);

    assertNotNull(configuration);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/billing_portal/configurations"),
        params.toMap());
  }
}
