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

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReportRun extends StripeObject implements HasId {
  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** The unique identifier of the {@code ReportRun} object. */
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
   * <p>Equal to {@code v2.reporting.report_run}.
   */
  @SerializedName("object")
  String object;

  /** The unique identifier of the {@code Report} object which was run. */
  @SerializedName("report")
  String report;

  /** The human-readable name of the {@code Report} which was run. */
  @SerializedName("report_name")
  String reportName;

  /** The parameters used to customize the generation of the report. */
  @SerializedName("report_parameters")
  Map<String, ReportRun.ReportParameter> reportParameters;

  /** Details how to retrieve the results of a successfully completed {@code ReportRun}. */
  @SerializedName("result")
  Result result;

  /** The options specified for customizing the output file of the {@code ReportRun}. */
  @SerializedName("result_options")
  ResultOptions resultOptions;

  /**
   * The current status of the {@code ReportRun}.
   *
   * <p>One of {@code failed}, {@code running}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /**
   * Additional details about the current state of the {@code ReportRun}. The field is currently
   * only populated when a {@code ReportRun} is in the {@code failed} state, providing more
   * information about why the report failed to generate successfully.
   */
  @SerializedName("status_details")
  Map<String, ReportRun.StatusDetail> statusDetails;

  /**
   * For more details about ReportParameter, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReportParameter extends StripeObject {
    /** Parameter with an array data type. */
    @SerializedName("array_value")
    ArrayValue arrayValue;

    /** Parameter with a string data type. */
    @SerializedName("string_value")
    String stringValue;

    /** Parameter with a timestamp data type. */
    @SerializedName("timestamp_value")
    Instant timestampValue;

    /**
     * For more details about ArrayValue, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ArrayValue extends StripeObject {
      /** The list of string values in the array. */
      @SerializedName("items")
      List<String> items;
    }
  }

  /**
   * For more details about Result, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Result extends StripeObject {
    /**
     * Contains metadata about the file produced by the {@code ReportRun}, including its content
     * type, size, and a URL to download its contents.
     */
    @SerializedName("file")
    File file;

    /**
     * The type of the {@code ReportRun} result.
     *
     * <p>Equal to {@code file}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about File, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class File extends StripeObject {
      /**
       * The content type of the file.
       *
       * <p>One of {@code csv}, or {@code zip}.
       */
      @SerializedName("content_type")
      String contentType;

      /** A pre-signed URL that allows secure, time-limited access to download the file. */
      @SerializedName("download_url")
      DownloadUrl downloadUrl;

      /** The total size of the file in bytes. */
      @SerializedName("size")
      Long size;

      /**
       * For more details about DownloadUrl, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DownloadUrl extends StripeObject {
        /** The time that the URL expires. */
        @SerializedName("expires_at")
        Instant expiresAt;

        /** The URL that can be used for accessing the file. */
        @SerializedName("url")
        String url;
      }
    }
  }

  /**
   * For more details about ResultOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ResultOptions extends StripeObject {
    /**
     * If set, the generated report file will be compressed into a ZIP folder. This is useful for
     * reducing file size and download time for large reports.
     */
    @SerializedName("compress_file")
    Boolean compressFile;
  }

  /**
   * For more details about StatusDetail, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetail extends StripeObject {
    /**
     * Error code categorizing the reason the {@code ReportRun} failed.
     *
     * <p>One of {@code file_size_above_limit}, or {@code internal_error}.
     */
    @SerializedName("error_code")
    String errorCode;

    /** Error message with additional details about the failure. */
    @SerializedName("error_message")
    String errorMessage;
  }
}
