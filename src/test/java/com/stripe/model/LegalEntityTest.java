package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.LegalEntity;
import com.stripe.net.APIResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import org.junit.Test;

public class LegalEntityTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws StripeException, IOException {
    String json = resource("legal_entity.json");
    LegalEntity le = APIResource.GSON.fromJson(json, LegalEntity.class);

    assertEquals("sole_prop", le.getType());
    assertEquals("business name", le.getBusinessName());
    assertEquals("12 Grove Street", le.getAddress().getLine1());
    assertEquals(null, le.getAddress().getLine2());
    assertEquals("New York", le.getAddress().getCity());
    assertEquals("NY", le.getAddress().getState());
    assertEquals("10014", le.getAddress().getPostalCode());
    assertEquals("US", le.getAddress().getCountry());
    assertEquals("Monica", le.getFirstName());
    assertEquals("Geller", le.getLastName());
    assertTrue(Objects.equals(4, le.getDob().getDay()));
    assertTrue(Objects.equals(4, le.getDob().getMonth()));
    assertTrue(Objects.equals(1969, le.getDob().getYear()));
    assertEquals(new ArrayList<Object>(), le.getAdditionalOwners());
    assertEquals("verified", le.getVerification().getStatus());
    assertEquals(null, le.getVerification().getDocument());
    assertEquals(null, le.getVerification().getDetails());
  }
}
