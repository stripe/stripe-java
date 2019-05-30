package com.stripe.functional.terminal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.terminal.Location;
import com.stripe.model.terminal.LocationCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class LocationTest extends BaseStripeTest {
  public static final String LOCATION_ID = "loc_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    final Map<String, String> address = new HashMap<>();
    address.put("line1", "line1");
    address.put("country", "US");
    address.put("state", "CA");
    address.put("postal_code", "123");
    address.put("city", "San Francisco");
    params.put("address", address);
    params.put("display_name", "name");

    final Location location = Location.create(params);

    assertNotNull(location);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/terminal/locations"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Location location = Location.retrieve(LOCATION_ID);

    assertNotNull(location);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/terminal/locations/%s", LOCATION_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Location location = Location.retrieve(LOCATION_ID);

    final Map<String, Object> params = new HashMap<>();
    params.put("display_name", "new_name");

    final Location updatedLocation = location.update(params);

    assertNotNull(updatedLocation);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/terminal/locations/%s", location.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    LocationCollection resources = Location.list(params);

    assertNotNull(resources);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/terminal/locations"), params);
  }

  @Test
  public void testDelete() throws StripeException {
    final Location location = Location.retrieve(LOCATION_ID);

    final Location deletedLocation = location.delete();

    assertNotNull(deletedLocation);
    assertTrue(deletedLocation.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/terminal/locations/%s", location.getId()));
  }
}
