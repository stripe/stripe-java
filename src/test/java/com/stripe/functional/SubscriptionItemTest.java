package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.SubscriptionItem;
import com.stripe.model.SubscriptionItemCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class SubscriptionItemTest extends BaseStripeTest {
  public static final String ITEM_ID = "si_123";

  private SubscriptionItem getItemFixture() throws StripeException {
    final SubscriptionItem item = SubscriptionItem.retrieve(ITEM_ID);
    resetNetworkSpy();
    return item;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("price", "price_123");
    params.put("subscription", "cus_123");
    params.put("quantity", 99);

    final SubscriptionItem subscriptionItem = SubscriptionItem.create(params);

    assertNotNull(subscriptionItem);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/subscription_items", params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final SubscriptionItem subscriptionItem = SubscriptionItem.retrieve(ITEM_ID);

    assertNotNull(subscriptionItem);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/subscription_items/%s", ITEM_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final SubscriptionItem subscriptionItem = getItemFixture();

    final Map<String, Object> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final SubscriptionItem updatedSubscriptionItem = subscriptionItem.update(params);

    assertNotNull(updatedSubscriptionItem);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/subscription_items/%s", subscriptionItem.getId()),
        params);
  }

  @Test
  public void testDelete() throws StripeException {
    final SubscriptionItem subscriptionItem = getItemFixture();

    final SubscriptionItem deletedSubscriptionItem = subscriptionItem.delete();

    assertNotNull(deletedSubscriptionItem);
    assertTrue(deletedSubscriptionItem.getDeleted());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/subscription_items/%s", subscriptionItem.getId()));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);
    params.put("subscription", "sub_123");

    final SubscriptionItemCollection subscriptionItems = SubscriptionItem.list(params);

    assertNotNull(subscriptionItems);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/subscription_items", params);
  }
}
