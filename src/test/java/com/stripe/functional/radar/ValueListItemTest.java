package com.stripe.functional.radar;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.radar.ValueListItem;
import com.stripe.model.radar.ValueListItemCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ValueListItemTest extends BaseStripeTest {
  public static final String VALUE_LIST_ID = "rsli_123";

  private ValueListItem getValueListItemFixture() throws StripeException {
    final ValueListItem valueListItem = ValueListItem.retrieve(VALUE_LIST_ID);
    resetNetworkSpy();
    return valueListItem;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("value", "value");
    params.put("value_list", "rsl_123");

    final ValueListItem valueListItem = ValueListItem.create(params);

    assertNotNull(valueListItem);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/radar/value_list_items"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final ValueListItem valueListItem = ValueListItem.retrieve(VALUE_LIST_ID);

    assertNotNull(valueListItem);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/radar/value_list_items/%s", VALUE_LIST_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("value_list", "rsl_123");
    params.put("limit", 1);

    final ValueListItemCollection valueListItems = ValueListItem.list(params);

    assertNotNull(valueListItems);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/radar/value_list_items"));
  }

  @Test
  public void testDelete() throws StripeException {
    final ValueListItem valueListItem = getValueListItemFixture();

    final ValueListItem deletedValueListItem = valueListItem.delete();

    assertNotNull(deletedValueListItem);
    assertTrue(deletedValueListItem.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/radar/value_list_items/%s", valueListItem.getId()));
  }
}
