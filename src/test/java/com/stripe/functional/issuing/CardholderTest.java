package com.stripe.functional.issuing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Cardholder;
import com.stripe.model.issuing.CardholderCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class CardholderTest extends BaseStripeTest {
  public static final String CARDHOLDER_ID = "ich_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> address = new HashMap<>();
    address.put("city", "city");
    address.put("country", "US");
    address.put("line1", "line1");
    address.put("postal_code", "90210");

    final Map<String, Object> billing = new HashMap<>();
    billing.put("address", address);

    final Map<String, Object> params = new HashMap<>();
    params.put("billing", billing);
    params.put("name", "Jenny Rosen");
    params.put("type", "individual");

    final Cardholder cardholder = Cardholder.create(params);

    assertNotNull(cardholder);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/issuing/cardholders"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Cardholder cardholder = Cardholder.retrieve(CARDHOLDER_ID);

    assertNotNull(cardholder);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/issuing/cardholders/%s", CARDHOLDER_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Cardholder cardholder = Cardholder.retrieve(CARDHOLDER_ID);

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Cardholder updatedCardholder = cardholder.update(params);

    assertNotNull(updatedCardholder);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/cardholders/%s", cardholder.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    CardholderCollection cardholders = Cardholder.list(params);

    assertNotNull(cardholders);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/issuing/cardholders"), params);
  }
}
