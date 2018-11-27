package com.stripe.model.radar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ValueListItemTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/radar/value_lists/rsli_123");
    final ValueListItem valueListItem = ApiResource.GSON.fromJson(data, ValueListItem.class);

    assertNotNull(valueListItem);
    assertNotNull(valueListItem.getId());
    assertEquals("radar.value_list", valueListItem.getObject());
  }
}
