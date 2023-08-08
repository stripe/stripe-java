package com.stripe.model;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.net.StripeResponseGetter;
import org.junit.jupiter.api.Test;

public class ExpandableFieldTest extends BaseStripeTest {
  @Test
  public void testPropagatesRequestGetter() {
    ActiveObject object = new ActiveObject();
    ExpandableField<ActiveObject> f = new ExpandableField<ActiveObject>("1", object);

    assertNull(object.responseGetter);
    f.setResponseGetter(networkSpy);

    assertNotNull(object.responseGetter);
  }

  static class ActiveObject implements HasId, StripeActiveObject {
    public StripeResponseGetter responseGetter;

    @Override
    public void setResponseGetter(StripeResponseGetter responseGetter) {
      this.responseGetter = responseGetter;
    }

    @Override
    public String getId() {
      return null;
    }
  }
}
