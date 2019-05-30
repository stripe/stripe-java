package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.BaseStripeTest;
import org.junit.jupiter.api.Test;

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
  public void serializeNotExpanded() {
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = new ExpandableField<>("id_not_expanded", null);

    final String expected = "{\n  \"nested\": \"id_not_expanded\"\n}";
    assertEquals(expected, object.toJson());
  }

  @Test
  public void serializeExpanded() {
    final TestNestedObject nested = new TestNestedObject();
    nested.id = "id_expanded";
    nested.bar = 42;
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = new ExpandableField<>(nested.id, nested);

    final String expected =
        "{\n  \"nested\": {\n    \"id\": \"id_expanded\",\n    \"bar\": 42\n  }\n}";
    assertEquals(expected, object.toJson());
  }

  @Test
  public void serializeNull() {
    final TestTopLevelObject object = new TestTopLevelObject();
    object.nested = new ExpandableField<>(null, null);

    final String expected = "{\n  \"nested\": null\n}";
    assertEquals(expected, object.toJson());
  }
}
