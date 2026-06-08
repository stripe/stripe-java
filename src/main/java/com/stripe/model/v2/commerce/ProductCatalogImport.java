// File generated from our OpenAPI spec
package com.stripe.model.v2.commerce;

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
 * The ProductCatalogImport object tracks the long-running background process that handles
 * uploading, processing and validation.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ProductCatalogImport extends StripeObject implements HasId {
  /** The time this ProductCatalogImport was created. */
  @SerializedName("created")
  Instant created;

  /**
   * The type of feed data being imported into the product catalog.
   *
   * <p>One of {@code inventory}, {@code pricing}, {@code product}, or {@code promotion}.
   */
  @SerializedName("feed_type")
  String feedType;

  /** The unique identifier for this ProductCatalogImport. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Additional information about the object in a structured format. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.commerce.product_catalog_import}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current status of this ProductCatalogImport.
   *
   * <p>One of {@code awaiting_upload}, {@code failed}, {@code processing}, {@code succeeded}, or
   * {@code succeeded_with_errors}.
   */
  @SerializedName("status")
  String status;

  /** Details about the current import status. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Details about the current import status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Details when the import is awaiting file upload. */
    @SerializedName("awaiting_upload")
    AwaitingUpload awaitingUpload;

    /** Details when the import didn't complete. */
    @SerializedName("failed")
    Failed failed;

    /** Details when the import is processing. */
    @SerializedName("processing")
    Processing processing;

    /** Details when the import has succeeded. */
    @SerializedName("succeeded")
    Succeeded succeeded;

    /** Details when the import completed but some records failed to process. */
    @SerializedName("succeeded_with_errors")
    SucceededWithErrors succeededWithErrors;

    /** Details when the import is awaiting file upload. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AwaitingUpload extends StripeObject {
      /** The pre-signed URL information for uploading the catalog file. */
      @SerializedName("upload_url")
      UploadUrl uploadUrl;

      /** The pre-signed URL information for uploading the catalog file. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class UploadUrl extends StripeObject {
        /** The timestamp when the upload URL expires. */
        @SerializedName("expires_at")
        Instant expiresAt;

        /** The pre-signed URL for uploading the catalog file. */
        @SerializedName("url")
        String url;
      }
    }

    /** Details when the import didn't complete. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /**
       * The error code for this product catalog processing failure.
       *
       * <p>One of {@code file_not_found}, {@code internal_error}, or {@code invalid_file}.
       */
      @SerializedName("code")
      String code;

      /** A message explaining why the import failed. */
      @SerializedName("failure_message")
      String failureMessage;

      /**
       * The error type for this product catalog processing failure.
       *
       * <p>One of {@code cannot_proceed}, or {@code transient_failure}.
       */
      @SerializedName("type")
      String type;
    }

    /** Details when the import is processing. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Processing extends StripeObject {
      /** The number of records that failed to process so far. */
      @SerializedName("error_count")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long errorCount;

      /** The number of records processed so far. */
      @SerializedName("success_count")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long successCount;
    }

    /** Details when the import has succeeded. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Succeeded extends StripeObject {
      /** The total number of records processed. */
      @SerializedName("success_count")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long successCount;
    }

    /** Details when the import completed but some records failed to process. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SucceededWithErrors extends StripeObject {
      /** The total number of records that failed to process. */
      @SerializedName("error_count")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long errorCount;

      /** A file containing details about all errors that occurred. */
      @SerializedName("error_file")
      ErrorFile errorFile;

      /** A sample of errors that occurred during processing. */
      @SerializedName("samples")
      List<ProductCatalogImport.StatusDetails.SucceededWithErrors.Sample> samples;

      /** The total number of records processed. */
      @SerializedName("success_count")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long successCount;

      /** A file containing details about all errors that occurred. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ErrorFile extends StripeObject {
        /** The MIME type of the error file. */
        @SerializedName("content_type")
        String contentType;

        /** The pre-signed URL information for downloading the error file. */
        @SerializedName("download_url")
        DownloadUrl downloadUrl;

        /** The size of the error file in bytes. */
        @SerializedName("size")
        @JsonAdapter(StringInt64TypeAdapter.class)
        Long size;

        /** The pre-signed URL information for downloading the error file. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class DownloadUrl extends StripeObject {
          /** The timestamp when the download URL expires. */
          @SerializedName("expires_at")
          Instant expiresAt;

          /** The pre-signed URL for downloading the error file. */
          @SerializedName("url")
          String url;
        }
      }

      /**
       * For more details about Sample, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Sample extends StripeObject implements HasId {
        /** A description of what went wrong with this record. */
        @SerializedName("error_message")
        String errorMessage;

        /** The name of the field that caused the error. */
        @SerializedName("field")
        String field;

        /** The identifier of the record that failed to process. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The row number in the import file where the error occurred. */
        @SerializedName("row")
        @JsonAdapter(StringInt64TypeAdapter.class)
        Long row;
      }
    }
  }
}
