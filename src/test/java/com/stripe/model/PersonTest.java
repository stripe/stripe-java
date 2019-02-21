package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class PersonTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/accounts/acct_123/persons/person_123");
    final Person resource = ApiResource.GSON.fromJson(data, Person.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "verification.document.back",
      "verification.document.front",
    };
    final String data = getFixture("/v1/accounts/acct_123/persons/person_123", expansions);
    final Person resource = ApiResource.GSON.fromJson(data, Person.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
    assertNotNull(resource.getVerification());

    /**
     * TODO need to change pay-server to have verification on person.
     */
    final Account.VerificationDocument verifDoc = resource.getVerification().getDocument();
    assertNotNull(verifDoc);

    final File back = verifDoc.getBackObject();
    assertNotNull(back);
    assertNotNull(back.getId());
    assertEquals(verifDoc.getBack(), back.getId());

    final File front = verifDoc.getFrontObject();
    assertNotNull(front);
    assertNotNull(front.getId());
    assertEquals(verifDoc.getFront(), front.getId());
  }
}
