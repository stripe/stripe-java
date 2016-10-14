package com.stripe.functional;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplePayDomain;
import com.stripe.model.DeletedApplePayDomain;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ApplePayDomainTest extends BaseStripeFunctionalTest {
    static Map<String, Object> getApplePayDomainParams() throws StripeException {
        Map<String, Object> params = new HashMap<String, Object>();
        Random rand = new Random();
        Integer subdomain = rand.nextInt(Integer.MAX_VALUE);
        params.put("domain_name", "subdomain" + subdomain.toString() + ".example.com");
        return params;
    }

    @Test
    public void testApplePayDomainCreate() throws StripeException {
        ApplePayDomain domain = ApplePayDomain.create(getApplePayDomainParams());
        assertTrue(domain.getDomainName().contains("example.com"));
    }

    @Test
    public void testApplePayDomainRetrieve() throws StripeException {
        ApplePayDomain createdDomain = ApplePayDomain.create(getApplePayDomainParams());
        ApplePayDomain retrievedDomain = ApplePayDomain.retrieve(createdDomain.getId());
        assertEquals(createdDomain.getId(), retrievedDomain.getId());
    }

    @Test
    public void testApplePayDomainList() throws StripeException {
        Map<String, Object> listParams = new HashMap<String, Object>();
        listParams.put("count", 1);
        List<ApplePayDomain> Domains = ApplePayDomain.list(listParams).getData();
        assertEquals(Domains.size(), 1);
    }

    @Test
    public void testApplePayDomainDelete() throws StripeException {
        ApplePayDomain createdDomain = ApplePayDomain.create(getApplePayDomainParams());
        DeletedApplePayDomain deletedDomain = createdDomain.delete();
        assertTrue(deletedDomain.getDeleted());
        assertEquals(deletedDomain.getId(), createdDomain.getId());
    }
}
