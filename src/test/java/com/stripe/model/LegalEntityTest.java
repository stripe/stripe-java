package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class LegalEntityTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/legal_entity.json");
    final LegalEntity le = ApiResource.GSON.fromJson(json, LegalEntity.class);
    assertNotNull(le);
    assertNotNull(le.verification.document);
    assertNotNull(le.verification.documentBack);
    // TODO: Figure out how to test various versions of legal_entity
    // such as with additional_owners, with expanded verification doc, etc.
  }

  @Test
  public void testDeserializeCompany() throws Exception {
    final String json = getResourceAsString("/api_fixtures/legal_entity.json");
    final LegalEntity le = ApiResource.GSON.fromJson(json, LegalEntity.class);
    assertNotNull(le);
    assertNotNull(le.additionalOwners.get(0).verification.document);
    assertNotNull(le.additionalOwners.get(0).verification.documentBack);
  }
}
