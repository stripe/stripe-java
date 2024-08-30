// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterErrorReport extends StripeObject implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.meter_error_report}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("reason")
  Reason reason;

  /** The related objects about the error. */
  @SerializedName("related_object")
  RelatedObject relatedObject;

  /** Summary of invalid events. */
  @SerializedName("summary")
  String summary;

  /** Time when validation ended. Measured in seconds since the Unix epoch */
  @SerializedName("validation_end")
  Long validationEnd;

  /** Time when validation started. Measured in seconds since the Unix epoch */
  @SerializedName("validation_start")
  Long validationStart;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reason extends StripeObject {
    /** The number of errors generated. */
    @SerializedName("error_count")
    Long errorCount;

    /** More information about errors. */
    @SerializedName("error_types")
    List<MeterErrorReport.Reason.ErrorType> errorTypes;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ErrorType extends StripeObject {
      @SerializedName("sample_errors")
      List<MeterErrorReport.Reason.ErrorType.SampleError> sampleErrors;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SampleError extends StripeObject {
        @SerializedName("api_request")
        ApiRequest apiRequest;

        /** message of the error. */
        @SerializedName("error_message")
        String errorMessage;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ApiRequest extends StripeObject implements HasId {
          /** Unique identifier for the object. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;

          /** idempotency_key of the request. */
          @SerializedName("idempotency_key")
          String idempotencyKey;
        }
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RelatedObject extends StripeObject implements HasId {
    /** Unique identifier for the object. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** The type of meter error related object. Should be 'meter' */
    @SerializedName("object")
    String object;

    /** The url of the meter object. */
    @SerializedName("url")
    String url;
  }
}
