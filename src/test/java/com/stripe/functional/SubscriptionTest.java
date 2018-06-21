package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Subscription;
import com.stripe.model.SubscriptionCollection;
import com.stripe.net.ApiResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SubscriptionTest extends BaseStripeTest {
  public static final String SUBSCRIPTION_ID = "sub_123";

  private Subscription getSubscriptionFixture() throws StripeException {
    final Subscription subscription = Subscription.retrieve(SUBSCRIPTION_ID);
    resetNetworkSpy();
    return subscription;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> item = new HashMap<String, Object>();
    item.put("plan", "silver-plan_123-898");
    final List<Object> items = new ArrayList<Object>();
    items.add(item);
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");
    params.put("items", items);

    final Subscription subscription = Subscription.create(params);

    assertNotNull(subscription);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/subscriptions",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Subscription subscription = Subscription.retrieve(SUBSCRIPTION_ID);

    assertNotNull(subscription);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/subscriptions/%s", SUBSCRIPTION_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Subscription subscription = getSubscriptionFixture();

    final Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Subscription updatedSubscription = subscription.update(params);

    assertNotNull(updatedSubscription);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/subscriptions/%s", subscription.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final SubscriptionCollection subscriptions = Subscription.list(params);

    assertNotNull(subscriptions);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/subscriptions",
        params
    );
  }

  @Test
  public void testCancel() throws StripeException {
    final Subscription subscription = getSubscriptionFixture();

    final Subscription canceledSubscription = subscription.cancel(null);

    assertNotNull(canceledSubscription);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/subscriptions/%s", subscription.getId())
    );
  }

  @Test
  public void testDeleteDiscount() throws StripeException {
    final Subscription subscription = getSubscriptionFixture();

    subscription.deleteDiscount();

    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/subscriptions/%s/discount", subscription.getId())
    );
  }
}
