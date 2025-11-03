// File generated from our OpenAPI spec
package com.stripe.model.v2.reporting;

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
 * The Report resource represents a customizable report template that provides insights into various
 * aspects of your Stripe integration.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Report extends StripeObject implements HasId {
  /** The unique identifier of the {@code Report} object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The human-readable name of the {@code Report}. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.reporting.report}.
   */
  @SerializedName("object")
  String object;

  /**
   * Specification of the parameters that the {@code Report} accepts. It details each parameter's
   * name, description, whether it is required, and any validations performed.
   */
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

    /** For timestamp parameters, specifies the allowed date range. */
    @SerializedName("timestamp_details")
    TimestampDetails timestampDetails;

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
       * Data type of the elements in the array.
       *
       * <p>Equal to {@code enum}.
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

    /** For timestamp parameters, specifies the allowed date range. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TimestampDetails extends StripeObject {
      /** Maximum permitted timestamp which can be requested. */
      @SerializedName("max")
      Instant max;

      /** Minimum permitted timestamp which can be requested. */
      @SerializedName("min")
      Instant min;
    }
  }
}
