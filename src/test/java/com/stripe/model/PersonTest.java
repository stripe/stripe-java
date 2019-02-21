package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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

    final Person.VerificationDocument verifDoc = resource.getVerification().getDocument();
    assertNotNull(verifDoc);

    final File back = verifDoc.getBackObject();
    assertNotNull(back);
    assertNotNull(back.getId());
    assertEquals(verifDoc.getBack(), back.getId());

    final File front = verifDoc.getFrontObject();
    assertNotNull(front);
    assertNotNull(front.getId());
    assertEquals(verifDoc.getFront(), front.getId());

    // Old document format (pre 2019-02-19)
    assertNull(resource.getVerification().getDocument());
    assertNull(resource.getVerification().getDocumentObject());
  }

  @Test
  public void testDeserializeOldDocumentUnexpanded() throws Exception {
    final String data = getResourceAsString("/api_fixtures/person_old_document_unexpanded.json");
    final Person resource = ApiResource.GSON.fromJson(data, Person.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
    assertNotNull(resource.getVerification());

    assertNotNull(resource.getVerification().getDocument());

    // Expanded attribute
    assertNull(resource.getVerification().getDocumentObject());

    // New document format (2019-09-19)
    assertNull(resource.getVerification().getDocumentSubObject());
  }

  @Test
  public void testDeserializeOldDocumentExpanded() throws Exception {
    final String data = getResourceAsString("/api_fixtures/person_old_document_expanded.json");
    final Person resource = ApiResource.GSON.fromJson(data, Person.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
    assertNotNull(resource.getVerification());

    // Expanded attribute
    assertNotNull(resource.getVerification().getDocumentObject());
    assertEquals(resource.getVerification().getDocumentObject().getId(),
        resource.getVerification().getDocument());

    // New document format (2019-09-19)
    assertNull(resource.getVerification().getDocumentSubObject());
  }
}
