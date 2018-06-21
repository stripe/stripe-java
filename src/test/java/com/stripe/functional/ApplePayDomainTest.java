package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplePayDomain;
import com.stripe.model.ApplePayDomainCollection;
import com.stripe.model.DeletedApplePayDomain;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ApplePayDomainTest extends BaseStripeTest {
  public static final String DOMAIN_ID = "apftw_123";

  private ApplePayDomain getDomainFixture() throws StripeException {
    final ApplePayDomain domain = ApplePayDomain.retrieve(DOMAIN_ID);
    resetNetworkSpy();
    return domain;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("domain_name", "stripe.com");

    final ApplePayDomain domain = ApplePayDomain.create(params);

    assertNotNull(domain);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/apple_pay/domains"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final ApplePayDomain domain = ApplePayDomain.retrieve(DOMAIN_ID);

    assertNotNull(domain);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/apple_pay/domains/%s", DOMAIN_ID)
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final ApplePayDomainCollection domains = ApplePayDomain.list(params);

    assertNotNull(domains);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/apple_pay/domains"),
        params
    );
  }

  @Test
  public void testDelete() throws StripeException {
    final ApplePayDomain domain = getDomainFixture();

    final DeletedApplePayDomain deletedDomain = domain.delete();

    assertNotNull(deletedDomain);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/apple_pay/domains/%s", domain.getId())
    );
  }
}
