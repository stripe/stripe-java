package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class AccountTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/accounts/acct_123");
    final Account resource = ApiResource.GSON.fromJson(data, Account.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "settings.branding.icon", "settings.branding.logo",
    };
    final String data = getFixture("/v1/accounts/acct_123", expansions);

    final Account resource = ApiResource.GSON.fromJson(data, Account.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());

    final File icon = resource.getSettings().getBranding().getIconObject();
    assertNotNull(icon);
    assertNotNull(icon.getId());
    assertEquals(resource.getSettings().getBranding().getIcon(), icon.getId());

    final File logo = resource.getSettings().getBranding().getLogoObject();
    assertNotNull(logo);
    assertNotNull(logo.getId());
    assertEquals(resource.getSettings().getBranding().getLogo(), logo.getId());
  }
}
