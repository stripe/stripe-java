package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import com.stripe.model.*;
import com.stripe.net.ApiResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;

class DeserializationTest extends BaseStripeTest {
  public static class MyResourceCollection extends StripeCollection<MyResource> {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MyResource extends StripeObject implements HasId {
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    @SerializedName("some_boolean")
    Boolean someBoolean;

    @SerializedName("some_datetime")
    Long someDatetime;

    @SerializedName("some_decimal_string")
    BigDecimal someDecimalString;

    @SerializedName("some_enum")
    String someEnum;

    @SerializedName("some_expandable")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<MyResource> someExpandable;

    @SerializedName("some_expanded_array")
    List<ExpandableField<MyResource>> someExpandedArray;

    @SerializedName("some_integer")
    Integer someInteger;

    @SerializedName("some_list_object")
    MyResourceCollection someListObject;

    @SerializedName("some_literal")
    String someLiteral;

    @SerializedName("some_longinteger")
    Long someLonginteger;

    @SerializedName("some_map")
    Map<String, String> someMap;

    @SerializedName("some_nullable")
    String someNullable;

    @SerializedName("some_number")
    BigDecimal someNumber;

    @SerializedName("some_object")
    SomeObject someObject;

    @SerializedName("some_polymorphic_group")
    MyResource somePolymorphicGroup;

    @SerializedName("some_ref")
    MyResource someRef;

    @SerializedName("some_ref_array")
    List<MyResource> someRefArray;

    @SerializedName("some_string")
    String someString;

    @SerializedName("some_string_array")
    List<String> someStringArray;

    /** Get ID of expandable {@code someExpandable} object. */
    public String getSomeExpandable() {
      return (this.someExpandable != null) ? this.someExpandable.getId() : null;
    }

    public void setSomeExpandable(String id) {
      this.someExpandable = ApiResource.setExpandableFieldId(id, this.someExpandable);
    }

    /** Get expanded {@code someExpandable}. */
    public MyResource getSomeExpandableObject() {
      return (this.someExpandable != null) ? this.someExpandable.getExpanded() : null;
    }

    public void setSomeExpandableObject(MyResource expandableObject) {
      this.someExpandable =
          new ExpandableField<MyResource>(expandableObject.getId(), expandableObject);
    }

    /** Get IDs of expandable {@code someExpandedArray} object list. */
    public List<String> getSomeExpandedArray() {
      return (this.someExpandedArray != null)
          ? this.someExpandedArray.stream().map(x -> x.getId()).collect(Collectors.toList())
          : null;
    }

    public void setSomeExpandedArray(List<String> ids) {
      if (ids == null) {
        this.someExpandedArray = null;
        return;
      }
      if (this.someExpandedArray != null
          && this.someExpandedArray.stream()
              .map(x -> x.getId())
              .collect(Collectors.toList())
              .equals(ids)) {
        // noop if the ids are equal to what are already present
        return;
      }
      this.someExpandedArray =
          (ids != null)
              ? ids.stream()
                  .map(id -> new ExpandableField<MyResource>(id, null))
                  .collect(Collectors.toList())
              : null;
    }

    /** Get expanded {@code someExpandedArray}. */
    public List<MyResource> getSomeExpandedArrayObjects() {
      return (this.someExpandedArray != null)
          ? this.someExpandedArray.stream().map(x -> x.getExpanded()).collect(Collectors.toList())
          : null;
    }

    public void setSomeExpandedArrayObjects(List<MyResource> objs) {
      this.someExpandedArray =
          objs != null
              ? objs.stream()
                  .map(x -> new ExpandableField<MyResource>(x.getId(), x))
                  .collect(Collectors.toList())
              : null;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SomeObject extends StripeObject {
      @SerializedName("some_string")
      String someString;
    }
  }

  @Test
  public void testStubWithIdDirect() throws Exception {
    String input = "{\"some_ref\":{\"id\":\"xyz\"}}";
    MyResource resource = ApiResource.InternalGSON.fromJson(input, MyResource.class);
    assertEquals("xyz", resource.getSomeRef().getId());
  }

  @Test
  public void testStubWithIdExpanded() throws Exception {
    String input = "{\"some_expandable\":{\"id\":\"xyz\"}}";
    MyResource resource = ApiResource.InternalGSON.fromJson(input, MyResource.class);
    assertEquals("xyz", resource.getSomeExpandableObject().getId());
  }

  @Test
  public void testStubWithIdArrayExpanded() throws Exception {
    String input = "{\"some_expanded_array\":[{\"id\":\"xyz\"}]}";
    MyResource resource = ApiResource.InternalGSON.fromJson(input, MyResource.class);
    assertEquals("xyz", resource.getSomeExpandedArrayObjects().get(0).getId());
  }

  @Test
  public void testStubWithIdInArray() throws Exception {
    String input = "{\"some_ref_array\":[{\"id\":\"xyz\"}]}";
    MyResource resource = ApiResource.InternalGSON.fromJson(input, MyResource.class);
    assertEquals("xyz", resource.getSomeRefArray().get(0).getId());
  }

  @Test
  public void testStubWithIdInListObject() throws Exception {
    String input = "{\"some_list_object\":{\"data\":[{\"id\":\"xyz\"}]}}";
    MyResource resource = ApiResource.InternalGSON.fromJson(input, MyResource.class);
    assertEquals("xyz", resource.getSomeListObject().getData().get(0).getId());
  }

  @Test
  public void testEmptyObjectExpanded() throws Exception {
    String input = "{\"some_expandable\":{}}";
    assertThrows(
        Exception.class,
        () -> {
          ApiResource.InternalGSON.fromJson(input, MyResource.class)
              .getSomeExpandableObject()
              .getId();
        });
  }

  @Test
  public void testEmptyObjectArrayExpanded() throws Exception {
    String input = "{\"some_expanded_array\":[{}]}";
    assertThrows(
        Exception.class,
        () -> {
          ApiResource.InternalGSON.fromJson(input, MyResource.class)
              .getSomeExpandedArrayObjects()
              .get(0)
              .getId();
        });
  }
}
