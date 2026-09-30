// File generated from our OpenAPI spec
package com.stripe.model.v2.data;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Report} resource represents a Stripe-defined, parameterized report that provides
 * insights into various aspects of your Stripe integration.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Report extends StripeObject implements HasId {
  /**
   * Representative SQL generated using common parameter values, or an explanatory message when the
   * report's SQL cannot be exposed. Only present when requested via {@code include[0]=default_sql}.
   */
  @SerializedName("default_sql")
  String defaultSql;

  /** A human-readable description of what this report contains. */
  @SerializedName("description")
  String description;

  /** The unique identifier of the {@code Report}. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this {@code Report} is available in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /** The human-readable name of the {@code Report}. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.data.report}.
   */
  @SerializedName("object")
  String object;

  /** Specification of the parameters that the {@code Report} accepts, keyed by parameter name. */
  @SerializedName("parameters")
  Map<String, Report.Parameter> parameters;

  /**
   * For more details about Parameter, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Parameter extends StripeObject {
    /** For array parameters, provides details about the array elements. */
    @SerializedName("array_details")
    ArrayDetails arrayDetails;

    /** Explains the purpose and usage of the parameter. */
    @SerializedName("description")
    String description;

    /** For enum parameters, provides the list of allowed values. */
    @SerializedName("enum_details")
    EnumDetails enumDetails;

    /** Indicates whether the parameter must be provided. */
    @SerializedName("required")
    Boolean required;

    /**
     * The data type of the parameter.
     *
     * <p>One of {@code array}, {@code enum}, {@code string}, or {@code timestamp}.
     */
    @SerializedName("type")
    String type;

    /** For array parameters, provides details about the array elements. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ArrayDetails extends StripeObject {
      /**
       * The data type of the elements in the array.
       *
       * <p>One of {@code array}, {@code enum}, {@code string}, or {@code timestamp}.
       */
      @SerializedName("element_type")
      String elementType;

      /** Details about enum elements in the array. */
      @SerializedName("enum_details")
      EnumDetails enumDetails;

      /** Details about enum elements in the array. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EnumDetails extends StripeObject {
        /** Allowed values of the enum. */
        @SerializedName("allowed_values")
        List<String> allowedValues;
      }
    }

    /** For enum parameters, provides the list of allowed values. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EnumDetails extends StripeObject {
      /** Allowed values of the enum. */
      @SerializedName("allowed_values")
      List<String> allowedValues;
    }
  }
}
