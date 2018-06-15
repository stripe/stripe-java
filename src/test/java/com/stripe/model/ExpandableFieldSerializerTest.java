package com.stripe.model;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.model.StripeObject;

import java.io.IOException;

import org.junit.Test;

public class ExpandableFieldSerializerTest extends BaseStripeTest {

  private static class TestNestedObject implements HasId {
    String id;
    @SuppressWarnings("unused")
    int bar;

    @Override
    public String getId() {
      return id;
    }
  }

  private static class TestTopLevelObject extends StripeObject {
    @SuppressWarnings("unused")
    ExpandableField<TestNestedObject> nested;
  }

  @Test
  public void serializeNotExpanded() throws IOException {
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = new ExpandableField<TestNestedObject>("id_not_expanded", null);

    final String expected = "{\n  \"nested\": \"id_not_expanded\"\n}";
    assertEquals(expected, object.toJson());
  }

  @Test
  public void serializeExpanded() throws IOException {
    final TestNestedObject nested = new TestNestedObject();
    nested.id = "id_expanded";
    nested.bar = 42;
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = new ExpandableField<TestNestedObject>(nested.id, nested);

    final String expected =
        "{\n  \"nested\": {\n    \"id\": \"id_expanded\",\n    \"bar\": 42\n  }\n}";
    assertEquals(expected, object.toJson());
  }

  @Test
  public void serializeNull() throws IOException {
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = new ExpandableField<TestNestedObject>(null, null);

    final String expected = "{\n  \"nested\": null\n}";
    assertEquals(expected, object.toJson());
  }
}
