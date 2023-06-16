package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.jupiter.api.Test;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

public class DeserializationTest extends BaseStripeTest {
  public static class MyReferencedResourceCollection extends StripeCollection<MyReferencedResource> {
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MyReferencedResource extends StripeObject implements HasId {
    @Getter(onMethod_ = { @Override })
    @SerializedName("id")
    String id;

    @SerializedName("some_int")
    Long someInt;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MyTopLevelResource extends StripeObject {
    @SerializedName("array_expanded")
    List<ExpandableField<MyReferencedResource>> arrayExpanded;

    @SerializedName("direct")
    MyReferencedResource direct;

    @SerializedName("expanded")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<MyReferencedResource> expanded;

    @SerializedName("in_array")
    List<MyReferencedResource> inArray;

    @SerializedName("in_list_object")
    MyReferencedResourceCollection inListObject;

    /**
     * Get ID of expandable {@code expanded} object.
     */
    public String getExpanded() {
      return (this.expanded != null) ? this.expanded.getId() : null;
    }

    public void setExpanded(String id) {
      this.expanded = ApiResource.setExpandableFieldId(id, this.expanded);
    }

    /**
     * Get expanded {@code expanded}.
     */
    public MyReferencedResource getExpandedObject() {
      return (this.expanded != null) ? this.expanded.getExpanded() : null;
    }

    public void setExpandedObject(MyReferencedResource expandableObject) {
      this.expanded = new ExpandableField<MyReferencedResource>(
          expandableObject.getId(),
          expandableObject);
    }

    /**
     * Get IDs of expandable {@code arrayExpanded} object list.
     */
    public List<String> getArrayExpanded() {
      return (this.arrayExpanded != null)
          ? this.arrayExpanded
              .stream()
              .map(x -> x.getId())
              .collect(Collectors.toList())
          : null;
    }

    public void setArrayExpanded(List<String> ids) {
      if (ids == null) {
        this.arrayExpanded = null;
        return;
      }
      if (this.arrayExpanded != null && this.arrayExpanded
          .stream()
          .map(x -> x.getId())
          .collect(Collectors.toList()).equals(ids)) {
        // noop if the ids are equal to what are already present
        return;
      }
      this.arrayExpanded = (ids != null)
          ? ids
              .stream()
              .map(id -> new ExpandableField<MyReferencedResource>(id, null))
              .collect(Collectors.toList())
          : null;
    }

    /**
     * Get expanded {@code arrayExpanded}.
     */
    public List<MyReferencedResource> getArrayExpandedObjects() {
      return (this.arrayExpanded != null)
          ? this.arrayExpanded
              .stream()
              .map(x -> x.getExpanded())
              .collect(Collectors.toList())
          : null;
    }

    public void setArrayExpandedObjects(List<MyReferencedResource> objs) {
      this.arrayExpanded = objs != null
          ? objs
              .stream()
              .map(x -> new ExpandableField<MyReferencedResource>(x.getId(), x))
              .collect(Collectors.toList())
          : null;
    }
  }

  @Test
  public void testStubWithIdDirect() throws Exception {
    String input = "{\"direct\":{\"id\":\"xyz\"}}";
    MyTopLevelResource resource = ApiResource.GSON.fromJson(input, MyTopLevelResource.class);
    assertEquals("xyz", resource.getDirect().getId());
  }

  @Test
  public void testStubWithIdExpanded() throws Exception {
    String input = "{\"expanded\":{\"id\":\"xyz\"}}";
    MyTopLevelResource resource = ApiResource.GSON.fromJson(input, MyTopLevelResource.class);
    assertEquals("xyz", resource.getExpandedObject().getId());
  }

  @Test
  public void testStubWithIdArrayExpanded() throws Exception {
    String input = "{\"array_expanded\":[{\"id\":\"xyz\"}]}";
    MyTopLevelResource resource = ApiResource.GSON.fromJson(input, MyTopLevelResource.class);
    assertEquals("xyz", resource.getArrayExpandedObjects().get(0).getId());
  }

  @Test
  public void testStubWithIdInArray() throws Exception {
    String input = "{\"in_array\":[{\"id\":\"xyz\"}]}";
    MyTopLevelResource resource = ApiResource.GSON.fromJson(input, MyTopLevelResource.class);
    assertEquals("xyz", resource.getInArray().get(0).getId());
  }

  @Test
  public void testStubWithIdInListObject() throws Exception {
    String input = "{\"in_list_object\":{\"data\":[{\"id\":\"xyz\"}]}}";
    MyTopLevelResource resource = ApiResource.GSON.fromJson(input, MyTopLevelResource.class);
    assertEquals("xyz", resource.getInListObject().autoPagingIterable().iterator().next().getId());
  }

  @Test
  public void testEmptyObjectExpanded() throws Exception {
    String input = "{\"expanded\":{}}";
    assertThrows(Exception.class, () -> {
      ApiResource.GSON.fromJson(input, MyTopLevelResource.class).getExpandedObject().getId();
    });
  }

  @Test
  public void testEmptyObjectArrayExpanded() throws Exception {
    String input = "{\"array_expanded\":[{}]}";
    assertThrows(Exception.class, () -> {
      ApiResource.GSON.fromJson(input, MyTopLevelResource.class).getArrayExpandedObjects().get(0).getId();
    });
  }
}
