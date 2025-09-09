// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.v2.Event;
import java.time.Instant;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V1BillingMeterNoMeterFoundEvent extends Event {
  /** Data for the v1.billing.meter.no_meter_found event. */
  @SerializedName("data")
  V1BillingMeterNoMeterFoundEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** Extra field included in the event's {@code data} when fetched from /v2/events. */
    @SerializedName("developer_message_summary")
    String developerMessageSummary;
    /** This contains information about why meter error happens. */
    @SerializedName("reason")
    Reason reason;
    /** The end of the window that is encapsulated by this summary. */
    @SerializedName("validation_end")
    Instant validationEnd;
    /** The start of the window that is encapsulated by this summary. */
    @SerializedName("validation_start")
    Instant validationStart;

    public static final class Reason {
      /** The total error count within this window. */
      @SerializedName("error_count")
      Long errorCount;
      /** The error details. */
      @SerializedName("error_types")
      List<V1BillingMeterNoMeterFoundEvent.EventData.Reason.ErrorType> errorTypes;

      public static final class ErrorType {
        /**
         * Open Enum.
         *
         * <p>One of {@code archived_meter}, {@code meter_event_customer_not_found}, {@code
         * meter_event_dimension_count_too_high}, {@code meter_event_invalid_value}, {@code
         * meter_event_no_customer_defined}, {@code missing_dimension_payload_keys}, {@code
         * no_meter}, {@code timestamp_in_future}, or {@code timestamp_too_far_in_past}.
         */
        @SerializedName("code")
        String code;
        /** The number of errors of this type. */
        @SerializedName("error_count")
        Long errorCount;
        /** A list of sample errors of this type. */
        @SerializedName("sample_errors")
        List<V1BillingMeterNoMeterFoundEvent.EventData.Reason.ErrorType.SampleError> sampleErrors;

        public static final class SampleError {
          /** The error message. */
          @SerializedName("error_message")
          String errorMessage;
          /** The request causes the error. */
          @SerializedName("request")
          Request request;

          public static final class Request {
            /** The request idempotency key. */
            @SerializedName("identifier")
            String identifier;
          }
        }
      }
    }
  }
}
