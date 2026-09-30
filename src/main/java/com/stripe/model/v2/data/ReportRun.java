// File generated from our OpenAPI spec
package com.stripe.model.v2.data;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code ReportRun} resource represents an instance of a {@code Report} generated with specific
 * parameter values. Once the object is created, Stripe begins processing the report. When the
 * report has finished running, it provides a reference to the results.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ReportRun extends StripeObject implements HasId {
  /** Time at which the {@code ReportRun} was created. */
  @SerializedName("created")
  Instant created;

  /** The unique identifier of the {@code ReportRun}. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether the {@code ReportRun} was executed in live mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /** The human-readable name of the {@code Report} which was run. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.data.report_run}.
   */
  @SerializedName("object")
  String object;

  /** The parameters used to customize the generation of the report. */
  @SerializedName("parameters")
  Map<String, Object> parameters;

  /** Time at which the data used by this report was last refreshed. */
  @SerializedName("refreshed_at")
  Instant refreshedAt;

  /** The unique identifier of the {@code Report} which was run. */
  @SerializedName("report")
  String report;

  /** The result of the {@code ReportRun}, populated when it has completed. */
  @SerializedName("result")
  Result result;

  /** Settings applied to the generated result file. */
  @SerializedName("result_options")
  ResultOptions resultOptions;

  /**
   * The fully-resolved SQL that was executed. Only present when requested via {@code
   * include[0]=sql}.
   */
  @SerializedName("sql")
  String sql;

  /**
   * The current status of the {@code ReportRun}.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code running}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Additional details about the current state of the {@code ReportRun}. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** The result of the {@code ReportRun}, populated when it has completed. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Result extends StripeObject {
    /** The total number of columns in the result. */
    @SerializedName("col_count")
    @JsonAdapter(StringInt64TypeAdapter.class)
    Long colCount;

    /** File result with a download URL. This is the default result type. */
    @SerializedName("file")
    File file;

    /**
     * Inline result with data returned directly. Only present when requested via {@code
     * include[0]=result.inline}.
     */
    @SerializedName("inline")
    Inline inline;

    /** The total number of data rows in the result, excluding any header row. */
    @SerializedName("row_count")
    @JsonAdapter(StringInt64TypeAdapter.class)
    Long rowCount;

    /** File result with a download URL. This is the default result type. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class File extends StripeObject {
      /** The schema of the result data. */
      @SerializedName("columns")
      List<ReportRun.Result.File.Column> columns;

      /**
       * The content type of the file.
       *
       * <p>Equal to {@code csv}.
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

      /**
       * For more details about Column, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Column extends StripeObject {
        /** The name of the column. */
        @SerializedName("name")
        String name;

        /**
         * The data type of the column.
         *
         * <p>One of {@code bigint}, {@code boolean}, {@code date}, {@code datetime}, {@code
         * decimal}, {@code double}, {@code integer}, {@code timestamp}, or {@code varchar}.
         */
        @SerializedName("type")
        String type;
      }

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

    /**
     * Inline result with data returned directly. Only present when requested via {@code
     * include[0]=result.inline}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Inline extends StripeObject {
      /** The schema of the result data. */
      @SerializedName("columns")
      List<ReportRun.Result.Inline.Column> columns;

      /** Token for the next page of rows. */
      @SerializedName("next_page_url")
      String nextPageUrl;

      /** Token for the previous page of rows. */
      @SerializedName("previous_page_url")
      String previousPageUrl;

      /** The result rows, each represented as a map of column name to value. */
      @SerializedName("rows")
      List<ReportRun.Result.Inline.Row> rows;

      /**
       * For more details about Column, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Column extends StripeObject {
        /** The name of the column. */
        @SerializedName("name")
        String name;

        /**
         * The data type of the column.
         *
         * <p>One of {@code bigint}, {@code boolean}, {@code date}, {@code datetime}, {@code
         * decimal}, {@code double}, {@code integer}, {@code timestamp}, or {@code varchar}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about Row, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Row extends StripeObject {
        /** The column data in this row, keyed by column name. */
        @SerializedName("data")
        Map<String, Object> data;
      }
    }
  }

  /** Settings applied to the generated result file. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ResultOptions extends StripeObject {
    /**
     * If set, the generated result file is compressed into a ZIP archive before it is stored. This
     * applies only to downloadable file results.
     */
    @SerializedName("compress_file")
    Boolean compressFile;
  }

  /** Additional details about the current state of the {@code ReportRun}. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /**
     * Time at which the run was canceled. Populated when the run is in the {@code canceled} state.
     */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /**
     * Error code categorizing the reason the run failed.
     *
     * <p>One of {@code file_size_above_limit}, {@code internal_error}, or {@code
     * query_run_invalid_sql}.
     */
    @SerializedName("code")
    String code;

    /** Error message with additional details about the failure. */
    @SerializedName("message")
    String message;
  }
}
