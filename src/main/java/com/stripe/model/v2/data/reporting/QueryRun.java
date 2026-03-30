// File generated from our OpenAPI spec
package com.stripe.model.v2.data.reporting;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code QueryRun} object represents an ad-hoc SQL execution. Once created, Stripe processes
 * the query. When the query has finished running, the object provides a reference to the results.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class QueryRun extends StripeObject implements HasId {
  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** The unique identifier of the {@code QueryRun} object. */
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
   * <p>Equal to {@code v2.data.reporting.query_run}.
   */
  @SerializedName("object")
  String object;

  /** Details how to retrieve the results of a successfully completed {@code QueryRun}. */
  @SerializedName("result")
  Result result;

  /** The options specified for customizing the output of the {@code QueryRun}. */
  @SerializedName("result_options")
  ResultOptions resultOptions;

  /** The SQL that was executed. */
  @SerializedName("sql")
  String sql;

  /**
   * The current status of the {@code QueryRun}.
   *
   * <p>One of {@code failed}, {@code running}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /**
   * Additional details about the current state of the {@code QueryRun}. Populated when the {@code
   * QueryRun} is in the {@code failed} state, providing more information about why the query
   * failed.
   */
  @SerializedName("status_details")
  Map<String, QueryRun.StatusDetail> statusDetails;

  /** Details how to retrieve the results of a successfully completed {@code QueryRun}. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Result extends StripeObject {
    /**
     * Contains metadata about the file produced by the {@code ReportRun} or {@code QueryRun},
     * including its content type, size, and a URL to download its contents.
     */
    @SerializedName("file")
    File file;

    /**
     * The type of the {@code ReportRun} or {@code QueryRun} result.
     *
     * <p>Equal to {@code file}.
     */
    @SerializedName("type")
    String type;

    /**
     * Contains metadata about the file produced by the {@code ReportRun} or {@code QueryRun},
     * including its content type, size, and a URL to download its contents.
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
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long size;

      /** A pre-signed URL that allows secure, time-limited access to download the file. */
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

  /** The options specified for customizing the output of the {@code QueryRun}. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ResultOptions extends StripeObject {
    /**
     * If set, the generated results file will be compressed into a ZIP folder. This is useful for
     * reducing file size and download time for large results.
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
     * Error code categorizing the reason the {@code QueryRun} failed.
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
