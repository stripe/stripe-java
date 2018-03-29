package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.DeletedSubscriptionItem;
import com.stripe.model.Plan;
import com.stripe.model.Subscription;
import com.stripe.model.SubscriptionItem;
import com.stripe.model.SubscriptionItemCollection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SubscriptionItemTest extends BaseStripeFunctionalTest {
  static Subscription createDefaultSubscription(Customer customer)
      throws StripeException {
    Plan plan = Plan.create(getUniquePlanParams());
    Map<String, Object> subCreateParams = new HashMap<String, Object>();
    HashMap<String, Object> items = new HashMap<String, Object>();
    HashMap<String, Object> item = new HashMap<String, Object>();

    item.put("plan", plan.getId());
    item.put("quantity", 1);
    items.put("0", item);

    subCreateParams.put("items", items);
    subCreateParams.put("customer", customer.getId());
    return Subscription.create(subCreateParams);
  }

  static SubscriptionItem createDefaultSubscriptionItem(Subscription subscription)
      throws StripeException {
    Plan plan = Plan.create(getUniquePlanParams());
    Map<String, Object> subItemParams = new HashMap<String, Object>();
    subItemParams.put("plan", plan.getId());
    subItemParams.put("subscription", subscription.getId());
    return SubscriptionItem.create(subItemParams);
  }

  @Test
  public void testSubscriptionItemCreate() throws StripeException {
    Customer customer = Customer.create(defaultCustomerParams);
    Subscription subscription = createDefaultSubscription(customer);
    SubscriptionItem subscriptionItem = createDefaultSubscriptionItem(subscription);

    assertEquals(subscriptionItem.getPlan().getName(), "J Bindings Plan");
  }

  @Test
  public void testSubscriptionItemRetrieve() throws StripeException {
    Customer customer = Customer.create(defaultCustomerParams);
    Subscription subscription = createDefaultSubscription(customer);
    SubscriptionItem subscriptionItem = createDefaultSubscriptionItem(subscription);

    SubscriptionItem retrievedSubscriptionItem = SubscriptionItem
        .retrieve(subscriptionItem.getId());
    assertEquals(subscriptionItem.getId(), retrievedSubscriptionItem.getId());
  }

  @Test
  public void testSubscriptionItemList() throws StripeException {
    Customer customer = Customer.create(defaultCustomerParams);
    Subscription subscription = createDefaultSubscription(customer);
    createDefaultSubscriptionItem(subscription);

    Map<String, Object> listParams = new HashMap<String, Object>();
    listParams.put("subscription", subscription.getId());
    SubscriptionItemCollection subscriptionItems = SubscriptionItem.list(listParams);
    List<SubscriptionItem> subscriptionItemsData = subscriptionItems.getData();
    assertEquals(subscriptionItemsData.size(), 2);
  }

  @Test
  public void testSubscriptionItemUpdate() throws StripeException {
    Customer customer = Customer.create(defaultCustomerParams);
    Subscription subscription = createDefaultSubscription(customer);
    SubscriptionItem subscriptionItem = createDefaultSubscriptionItem(subscription);

    Map<String, Object> updateParams = new HashMap<String, Object>();
    updateParams.put("quantity", 4);

    SubscriptionItem updatedSubscriptionItem =
        subscriptionItem.update(updateParams);
    assertTrue(updatedSubscriptionItem.getQuantity() == 4);
  }

  @Test
  public void testSubscriptionItemDelete() throws StripeException {
    Customer customer = Customer.create(defaultCustomerParams);
    Subscription subscription = createDefaultSubscription(customer);
    SubscriptionItem subscriptionItem = createDefaultSubscriptionItem(subscription);

    DeletedSubscriptionItem deletedSubscriptionItem = subscriptionItem.delete();
    assertTrue(deletedSubscriptionItem.getDeleted());
    assertEquals(deletedSubscriptionItem.getId(), subscriptionItem.getId());
  }
}
