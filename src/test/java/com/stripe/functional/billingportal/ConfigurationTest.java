package com.stripe.functional.billingportal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.billingportal.Configuration;
import com.stripe.model.billingportal.ConfigurationCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.billingportal.ConfigurationCreateParams;
import com.stripe.param.billingportal.ConfigurationUpdateParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ConfigurationTest extends BaseStripeTest {
  public static final String SESSION_ID = "bpc_123";

  private Configuration getConfigurationFixture() throws StripeException {
    final Configuration configuration = Configuration.retrieve(SESSION_ID);
    resetNetworkSpy();
    return configuration;
  }

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

  @Test
  public void testRetrieve() throws StripeException {
    final Configuration configuration = Configuration.retrieve(SESSION_ID);

    assertNotNull(configuration);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/billing_portal/configurations/%s", configuration.getId()));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Configuration configuration = getConfigurationFixture();

    ConfigurationUpdateParams params = ConfigurationUpdateParams.builder().setActive(false).build();

    final Configuration updatedConfiguration = configuration.update(params);

    assertNotNull(updatedConfiguration);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/billing_portal/configurations/%s", configuration.getId()),
        params.toMap());
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final ConfigurationCollection coupons = Configuration.list(params);

    assertNotNull(coupons);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/billing_portal/configurations"));
  }
}
