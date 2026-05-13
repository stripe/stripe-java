// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A Financial Account Statement represents a monthly statement for a Financial Account. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountStatement extends StripeObject implements HasId {
  /** Time at which the statement was created, in ISO 8601 format (UTC). */
  @SerializedName("created")
  Instant created;

  /** Available balance at the end of the statement period. */
  @SerializedName("ending_balance")
  Map<String, Amount> endingBalance;

  /**
   * Currency-specific files and file metadata. Null by default, populated by specifying
   * include=files_by_currency in the Retrieve endpoint.
   */
  @SerializedName("files_by_currency")
  Map<String, FinancialAccountStatement.FilesByCurrency> filesByCurrency;

  /** The Financial Account this statement belongs to. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Unique identifier for the statement. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** True if the object exists in live mode, false if in test mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.financial_account_statement}.
   */
  @SerializedName("object")
  String object;

  /** The time period covered by this statement. */
  @SerializedName("period")
  Period period;

  /**
   * The ID of the statement that replaced this one. Only present on statements that have been
   * restated.
   */
  @SerializedName("restated_by")
  String restatedBy;

  /** The ID of the statement this one replaces. Only present on restatements. */
  @SerializedName("restated_statement")
  String restatedStatement;

  /** Available balance at the start of the statement period. */
  @SerializedName("starting_balance")
  Map<String, Amount> startingBalance;

  /**
   * The status of the statement. A statement is &quot;active&quot; by default. When a statement is
   * replaced by a restatement, its status becomes &quot;restated&quot;.
   *
   * <p>One of {@code active}, or {@code restated}.
   */
  @SerializedName("status")
  String status;

  /**
   * For more details about FilesByCurrency, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FilesByCurrency extends StripeObject {
    /** The MIME type of the file. */
    @SerializedName("content_type")
    String contentType;

    /** The download URL and expiration. */
    @SerializedName("download_url")
    DownloadUrl downloadUrl;

    /** The size of the file in bytes. */
    @SerializedName("size")
    @JsonAdapter(StringInt64TypeAdapter.class)
    Long size;

    /** The download URL and expiration. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DownloadUrl extends StripeObject {
      /** The time at which the URL expires, in ISO 8601 format (UTC). */
      @SerializedName("expires_at")
      Instant expiresAt;

      /** The URL to download the file. */
      @SerializedName("url")
      String url;
    }
  }

  /** The time period covered by this statement. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Period extends StripeObject {
    /**
     * The end of the statement period (exclusive), as a UTC-aligned ISO 8601 date (e.g.,
     * &quot;2025-02-01&quot;). For example, a January statement has end_date
     * &quot;2025-02-01&quot;, meaning all transactions up to but not including February 1st UTC are
     * included.
     */
    @SerializedName("end_date")
    String endDate;

    /**
     * The start of the statement period (inclusive), as a UTC-aligned ISO 8601 date (e.g.,
     * &quot;2025-01-01&quot;).
     */
    @SerializedName("start_date")
    String startDate;
  }
}
