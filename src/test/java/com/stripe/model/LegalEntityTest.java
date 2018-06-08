package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;

import org.junit.Test;

public class LegalEntityTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/legal_entity.json");
    final LegalEntity le = APIResource.GSON.fromJson(json, LegalEntity.class);
    assertNotNull(le);
    // TODO: Figure out how to test various versions of legal_entity
    // such as with additional_owners, with expanded verification doc, etc.
  }
}
