// File generated from our OpenAPI spec
package com.stripe.model.v2.extend;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents an immutable version of an object definition. It defines the fields of the object
 * records created from it.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ObjectDefinitionVersion extends StripeObject implements HasId {
  /** Time at which the object definition version was created. */
  @SerializedName("created")
  Instant created;

  /** A description of what this version of the object definition represents. */
  @SerializedName("description")
  String description;

  /** The human-readable plural name of this version. */
  @SerializedName("display_name_plural")
  String displayNamePlural;

  /** The human-readable singular name of this version. */
  @SerializedName("display_name_singular")
  String displayNameSingular;

  /**
   * The complete version ID, consisting of the object definition ID, {@code @}, and a semantic
   * version.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.extend.object_definition_version}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the parent object definition. */
  @SerializedName("object_definition")
  String objectDefinition;

  /** The stable identity and API names of the parent object definition. */
  @SerializedName("parent_details")
  ParentDetails parentDetails;

  /** The schema of the object record fields defined by this object definition. */
  @SerializedName("properties")
  Map<String, ObjectDefinitionVersion.Property> properties;

  /**
   * The semantic version of this object definition version, in {@code major.minor.patch} format.
   */
  @SerializedName("version")
  String version;

  /** The stable identity and API names of the parent object definition. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ParentDetails extends StripeObject implements HasId {
    /** The plural API name used in this definition's object record API paths. */
    @SerializedName("api_name_plural")
    String apiNamePlural;

    /** The singular API name used in this definition's object record tags. */
    @SerializedName("api_name_singular")
    String apiNameSingular;

    /** The ID of the parent object definition. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;
  }

  /**
   * For more details about Property, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Property extends StripeObject {
    /** A required list of values for enum types. */
    @SerializedName("allowed_values")
    List<String> allowedValues;

    /** An optional default value for the field. */
    @SerializedName("default_value")
    Object defaultValue;

    /** An optional human-readable description of the field. */
    @SerializedName("description")
    String description;

    /** An optional exclusive maximum value for integer or decimal types. */
    @SerializedName("exclusive_maximum")
    Object exclusiveMaximum;

    /** An optional exclusive minimum value for integer or decimal types. */
    @SerializedName("exclusive_minimum")
    Object exclusiveMinimum;

    /** Whether or not the field is deprecated (default false). */
    @SerializedName("is_deprecated")
    Boolean isDeprecated;

    /**
     * The required scalar schema for each array item. Array values retain their supplied order, and
     * order is significant. Values are never sorted. Empty arrays are valid unless min_items is
     * positive.
     */
    @SerializedName("items")
    Items items;

    /** An optional maximum number of array items. It defaults to and cannot exceed 100. */
    @SerializedName("max_items")
    Long maxItems;

    /** An optional maximum length validation for string fields. */
    @SerializedName("max_length")
    Long maxLength;

    /** An optional maximum value for integer or decimal types. */
    @SerializedName("maximum")
    Object maximum;

    /**
     * An optional minimum number of array items. Empty arrays are valid when this is absent or
     * zero.
     */
    @SerializedName("min_items")
    Long minItems;

    /** An optional minimum length validation for string fields. */
    @SerializedName("min_length")
    Long minLength;

    /** An optional minimum value for integer or decimal types. */
    @SerializedName("minimum")
    Object minimum;

    /** The type referenced by object reference fields. */
    @SerializedName("referenced_type")
    String referencedType;

    /** Whether or not the field is required (default false). */
    @SerializedName("required")
    Boolean required;

    /** An optional human-readable name for the field. */
    @SerializedName("title")
    String title;

    /**
     * The data type of the field.
     *
     * <p>One of {@code array}, {@code boolean}, {@code currency}, {@code datetime}, {@code
     * decimal}, {@code enum}, {@code integer}, {@code monetary_amount}, {@code object_reference},
     * or {@code string}.
     */
    @SerializedName("type")
    String type;

    /**
     * Whether array item values must be unique (default false). Duplicate values are allowed by
     * default.
     */
    @SerializedName("unique_items")
    Boolean uniqueItems;

    /**
     * The required scalar schema for each array item. Array values retain their supplied order, and
     * order is significant. Values are never sorted. Empty arrays are valid unless min_items is
     * positive.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Items extends StripeObject {
      /** A required list of values for enum types. */
      @SerializedName("allowed_values")
      List<String> allowedValues;

      /** An optional default value for the field. */
      @SerializedName("default_value")
      Object defaultValue;

      /** An optional human-readable description of the field. */
      @SerializedName("description")
      String description;

      /** An optional exclusive maximum value for integer or decimal types. */
      @SerializedName("exclusive_maximum")
      Object exclusiveMaximum;

      /** An optional exclusive minimum value for integer or decimal types. */
      @SerializedName("exclusive_minimum")
      Object exclusiveMinimum;

      /** Whether or not the field is deprecated (default false). */
      @SerializedName("is_deprecated")
      Boolean isDeprecated;

      /**
       * The required scalar schema for each array item. Array values retain their supplied order,
       * and order is significant. Values are never sorted. Empty arrays are valid unless min_items
       * is positive.
       */
      @SerializedName("items")
      InnerItems items;

      /** An optional maximum number of array items. It defaults to and cannot exceed 100. */
      @SerializedName("max_items")
      Long maxItems;

      /** An optional maximum length validation for string fields. */
      @SerializedName("max_length")
      Long maxLength;

      /** An optional maximum value for integer or decimal types. */
      @SerializedName("maximum")
      Object maximum;

      /**
       * An optional minimum number of array items. Empty arrays are valid when this is absent or
       * zero.
       */
      @SerializedName("min_items")
      Long minItems;

      /** An optional minimum length validation for string fields. */
      @SerializedName("min_length")
      Long minLength;

      /** An optional minimum value for integer or decimal types. */
      @SerializedName("minimum")
      Object minimum;

      /** The type referenced by object reference fields. */
      @SerializedName("referenced_type")
      String referencedType;

      /** Whether or not the field is required (default false). */
      @SerializedName("required")
      Boolean required;

      /** An optional human-readable name for the field. */
      @SerializedName("title")
      String title;

      /**
       * The data type of the field.
       *
       * <p>One of {@code array}, {@code boolean}, {@code currency}, {@code datetime}, {@code
       * decimal}, {@code enum}, {@code integer}, {@code monetary_amount}, {@code object_reference},
       * or {@code string}.
       */
      @SerializedName("type")
      String type;

      /**
       * Whether array item values must be unique (default false). Duplicate values are allowed by
       * default.
       */
      @SerializedName("unique_items")
      Boolean uniqueItems;

      /**
       * The required scalar schema for each array item. Array values retain their supplied order,
       * and order is significant. Values are never sorted. Empty arrays are valid unless min_items
       * is positive.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class InnerItems extends StripeObject {}
    }
  }
}
