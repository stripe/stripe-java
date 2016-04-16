package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Subscription;
import com.stripe.model.Discount;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import org.junit.After;
import org.junit.Before;
import junit.framework.Assert;

import java.util.HashMap;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class SubscriptionTest extends BaseStripeTest {

  @Before
  public void mockStripeResponseGetter() {
    APIResource.setStripeResponseGetter(networkMock);
  }

  @After
  public void unmockStripeResponseGetter() {
    /* This needs to be done because tests aren't isolated in Java */
    APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
  }

  @Test
  public void testRetrieve() throws StripeException {
    Subscription.retrieve("test_sub");

    verifyGet(Subscription.class, "https://api.stripe.com/v1/subscriptions/test_sub");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testAll() throws StripeException {
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 3);
    params.put("customer", "test_cus");
    params.put("plan", "gold");

    Subscription.all(params);

    verifyGet(SubscriptionCollection.class, "https://api.stripe.com/v1/subscriptions", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testUpdate() throws StripeException {
    Subscription subscription = new Subscription();
    subscription.setId("test_sub");

    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("plan", "gold");

    subscription.update(params);

    verifyPost(Subscription.class, "https://api.stripe.com/v1/subscriptions/test_sub", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testCreate() throws StripeException {
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "test_cus");
    params.put("plan", "gold");

    Subscription subscription = Subscription.create(params);

    verifyPost(Subscription.class, "https://api.stripe.com/v1/subscriptions", params);
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testCancel() throws StripeException {
    Subscription subscription = new Subscription();
    subscription.setId("test_sub");

    subscription.cancel(null);

    verifyDelete(Subscription.class, "https://api.stripe.com/v1/subscriptions/test_sub");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testSetDeleteDiscount() throws StripeException {
    Subscription subscription = new Subscription();
    subscription.setId("test_sub");

    Discount discount = new Discount();
    discount.setId("test_dis");
    subscription.setDiscount(discount);
    Assert.assertEquals("test_dis", subscription.getDiscount().id);

    subscription.deleteDiscount();

    verifyDelete(Discount.class, "https://api.stripe.com/v1/subscriptions/test_sub/discount");
    verifyNoMoreInteractions(networkMock);
  }
}