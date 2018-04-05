package com.stripe.functional;

import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeFunctionalTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.Plan;
import com.stripe.model.Subscription;
import com.stripe.model.SubscriptionItem;
import com.stripe.model.UsageRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.junit.Test;

public class UsageRecordTest extends BaseStripeFunctionalTest {
  @Test
  public void testUsageRecordCreate() throws StripeException {
    Plan plan = createMeteredPlan();
    Subscription sub = createSubscription(plan);
    SubscriptionItem subItem = sub.getSubscriptionItems().getData().get(0);

    Map<String, Object> params = new HashMap<>();
    params.put("quantity", 1000);
    long unixTime = System.currentTimeMillis() / 1000L;
    params.put("timestamp", unixTime);
    params.put("subscription_item", subItem.getId());

    UsageRecord ur = UsageRecord.create(params, null);

    assertTrue(Objects.equals(1000L, ur.getQuantity()));
    assertTrue(Objects.equals(unixTime, ur.getTimestamp()));
  }

  private Plan createMeteredPlan() throws StripeException {
    Map<String, Object> productParams = new HashMap<String, Object>();
    productParams.put("name", "Bar");

    Map<String, Object> params = getUniquePlanParams();
    params.remove("name");
    params.put("nickname", "Foo");
    params.put("product", productParams);

    params.put("usage_type", "metered");

    return Plan.create(params);
  }

  private Subscription createSubscription(Plan plan) throws StripeException {
    final Customer customer = Customer.create(defaultCustomerParams);
    Map<String, Object> subscriptionParams = new HashMap<String, Object>();

    Map<String, Object> planEntry = new HashMap<>();
    planEntry.put("plan", plan.getId());

    List<Map<String, Object>> subItems = new ArrayList<>();
    subItems.add(planEntry);

    subscriptionParams.put("items", subItems);
    subscriptionParams.put("customer", customer.getId());
    return Subscription.create(subscriptionParams);
  }
}
