package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.model.StripeObject;

import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExpandableFieldSerializerTest extends BaseStripeTest {

    private class TestNestedObject implements HasId {
        String id;
        int bar;

        public String getId() {
            return id;
        }
    }

    private class TestTopLevelObject extends StripeObject {
        ExpandableField<TestNestedObject> nested;
    }

    @Test
    public void serializeNotExpanded() throws IOException {
        TestTopLevelObject object = new TestTopLevelObject();
        object.nested = new ExpandableField<TestNestedObject>("id_not_expanded", null);

        String expected = "{\n  \"nested\": \"id_not_expanded\"\n}";
        assertEquals(expected, object.toJson());
    }

    @Test
    public void serializeExpanded() throws IOException {
        TestNestedObject nested = new TestNestedObject();
        nested.id = "id_expanded";
        nested.bar = 42;
        TestTopLevelObject object = new TestTopLevelObject();
        object.nested = new ExpandableField<TestNestedObject>(nested.id, nested);

        String expected = "{\n  \"nested\": {\n    \"id\": \"id_expanded\",\n    \"bar\": 42\n  }\n}";
        assertEquals(expected, object.toJson());
    }

    @Test
    public void serializeNull() throws IOException {
        TestTopLevelObject object = new TestTopLevelObject();
        object.nested = new ExpandableField<TestNestedObject>(null, null);

        String expected = "{\n  \"nested\": null\n}";
        assertEquals(expected, object.toJson());
    }
}
