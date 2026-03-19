// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** BatchJob resource. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BatchJob extends StripeObject implements HasId {
  /** Timestamp at which BatchJob was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the BatchJob. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The maximum rps defined for the {@code BatchJob}. */
  @SerializedName("maximum_rps")
  Long maximumRps;

  /** The metadata of the {@code BatchJob} object. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.batch_job}.
   */
  @SerializedName("object")
  String object;

  /** If the validation will be run previous to the execution of the {@code BatchJob}. */
  @SerializedName("skip_validation")
  Boolean skipValidation;

  /**
   * The current status of the {@code BatchJob}.
   *
   * <p>One of {@code batch_failed}, {@code canceled}, {@code cancelling}, {@code complete}, {@code
   * in_progress}, {@code ready_for_upload}, {@code timeout}, {@code upload_timeout}, {@code
   * validating}, or {@code validation_failed}.
   */
  @SerializedName("status")
  String status;

  /** Additional details about the current state of the {@code BatchJob}. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Additional details about the current state of the {@code BatchJob}. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Additional details for the {@code BATCH_FAILED} status of the {@code BatchJob}. */
    @SerializedName("batch_failed")
    BatchFailed batchFailed;

    /** Additional details for the {@code CANCELED} status of the {@code BatchJob}. */
    @SerializedName("canceled")
    Canceled canceled;

    /** Additional details for the {@code COMPLETE} status of the {@code BatchJob}. */
    @SerializedName("complete")
    Complete complete;

    /** Additional details for the {@code IN_PROGRESS} status of the {@code BatchJob}. */
    @SerializedName("in_progress")
    InProgress inProgress;

    /** Additional details for the {@code READY_FOR_UPLOAD} status of the {@code BatchJob}. */
    @SerializedName("ready_for_upload")
    ReadyForUpload readyForUpload;

    /** Additional details for the {@code TIMEOUT} status of the {@code BatchJob}. */
    @SerializedName("timeout")
    Timeout timeout;

    /** Additional details for the {@code VALIDATING} status of the {@code BatchJob}. */
    @SerializedName("validating")
    Validating validating;

    /** Additional details for the {@code VALIDATION_FAILED} status of the {@code BatchJob}. */
    @SerializedName("validation_failed")
    ValidationFailed validationFailed;

    /** Additional details for the {@code BATCH_FAILED} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BatchFailed extends StripeObject {
      /** Details about the {@code BatchJob} failure. */
      @SerializedName("error")
      String error;
    }

    /** Additional details for the {@code CANCELED} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {
      /** The total number of records that failed processing. */
      @SerializedName("failure_count")
      Long failureCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @SerializedName("output_file")
      OutputFile outputFile;

      /** The total number of records that were successfully processed. */
      @SerializedName("success_count")
      Long successCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OutputFile extends StripeObject {
        /** The content type of the file. */
        @SerializedName("content_type")
        String contentType;

        /** A pre-signed URL that allows secure, time-limited access to download the file. */
        @SerializedName("download_url")
        DownloadUrl downloadUrl;

        /** The total size of the file in bytes. */
        @SerializedName("size")
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

    /** Additional details for the {@code COMPLETE} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Complete extends StripeObject {
      /** The total number of records that failed processing. */
      @SerializedName("failure_count")
      Long failureCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @SerializedName("output_file")
      OutputFile outputFile;

      /** The total number of records that were successfully processed. */
      @SerializedName("success_count")
      Long successCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OutputFile extends StripeObject {
        /** The content type of the file. */
        @SerializedName("content_type")
        String contentType;

        /** A pre-signed URL that allows secure, time-limited access to download the file. */
        @SerializedName("download_url")
        DownloadUrl downloadUrl;

        /** The total size of the file in bytes. */
        @SerializedName("size")
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

    /** Additional details for the {@code IN_PROGRESS} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InProgress extends StripeObject {
      /** The number of records that failed processing so far. */
      @SerializedName("failure_count")
      Long failureCount;

      /** The number of records that were successfully processed so far. */
      @SerializedName("success_count")
      Long successCount;
    }

    /** Additional details for the {@code READY_FOR_UPLOAD} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ReadyForUpload extends StripeObject {
      /** The upload file details. */
      @SerializedName("upload_url")
      UploadUrl uploadUrl;

      /** The upload file details. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class UploadUrl extends StripeObject {
        /** The time that the URL expires. */
        @SerializedName("expires_at")
        Instant expiresAt;

        /** The URL that can be used for accessing the file. */
        @SerializedName("url")
        String url;
      }
    }

    /** Additional details for the {@code TIMEOUT} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Timeout extends StripeObject {
      /** The total number of records that failed processing. */
      @SerializedName("failure_count")
      Long failureCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @SerializedName("output_file")
      OutputFile outputFile;

      /** The total number of records that were successfully processed. */
      @SerializedName("success_count")
      Long successCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OutputFile extends StripeObject {
        /** The content type of the file. */
        @SerializedName("content_type")
        String contentType;

        /** A pre-signed URL that allows secure, time-limited access to download the file. */
        @SerializedName("download_url")
        DownloadUrl downloadUrl;

        /** The total size of the file in bytes. */
        @SerializedName("size")
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

    /** Additional details for the {@code VALIDATING} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Validating extends StripeObject {
      /**
       * The number of records that were validated. Note that there is no failure counter here; once
       * we have any validation failures we give up.
       */
      @SerializedName("validated_count")
      Long validatedCount;
    }

    /** Additional details for the {@code VALIDATION_FAILED} status of the {@code BatchJob}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ValidationFailed extends StripeObject {
      /** The total number of records that failed processing. */
      @SerializedName("failure_count")
      Long failureCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @SerializedName("output_file")
      OutputFile outputFile;

      /** The total number of records that were successfully processed. */
      @SerializedName("success_count")
      Long successCount;

      /**
       * The output file details. If BatchJob is cancelled it's provided only if there is already
       * output at this point.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OutputFile extends StripeObject {
        /** The content type of the file. */
        @SerializedName("content_type")
        String contentType;

        /** A pre-signed URL that allows secure, time-limited access to download the file. */
        @SerializedName("download_url")
        DownloadUrl downloadUrl;

        /** The total size of the file in bytes. */
        @SerializedName("size")
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
  }
}
