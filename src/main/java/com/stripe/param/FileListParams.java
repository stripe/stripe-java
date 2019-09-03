package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class FileListParams extends ApiRequestParams {
  @SerializedName("created")
  Object created;

  /**
   * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with
   * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
   * previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * The file purpose to filter queries by. If none is provided, files will not be filtered by
   * purpose.
   */
  @SerializedName("purpose")
  Purpose purpose;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private FileListParams(
      Object created,
      String endingBefore,
      List<String> expand,
      Long limit,
      Purpose purpose,
      String startingAfter) {
    this.created = created;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.purpose = purpose;
    this.startingAfter = startingAfter;
  }

  public static Builder builder() {
    return new com.stripe.param.FileListParams.Builder();
  }

  public static class Builder {
    private Object created;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private Purpose purpose;

    private String startingAfter;

    /** Finalize and obtain parameter instance from this builder. */
    public FileListParams build() {
      return new FileListParams(
          this.created,
          this.endingBefore,
          this.expand,
          this.limit,
          this.purpose,
          this.startingAfter);
    }

    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FileListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FileListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * The file purpose to filter queries by. If none is provided, files will not be filtered by
     * purpose.
     */
    public Builder setPurpose(Purpose purpose) {
      this.purpose = purpose;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }
  }

  public static class Created {
    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private Created(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new com.stripe.param.FileListParams.Created.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public Created build() {
        return new Created(this.gt, this.gte, this.lt, this.lte);
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Purpose implements ApiRequestParams.EnumParam {
    @SerializedName("business_icon")
    BUSINESS_ICON("business_icon"),

    @SerializedName("business_logo")
    BUSINESS_LOGO("business_logo"),

    @SerializedName("customer_signature")
    CUSTOMER_SIGNATURE("customer_signature"),

    @SerializedName("dispute_evidence")
    DISPUTE_EVIDENCE("dispute_evidence"),

    @SerializedName("finance_report_run")
    FINANCE_REPORT_RUN("finance_report_run"),

    @SerializedName("identity_document")
    IDENTITY_DOCUMENT("identity_document"),

    @SerializedName("pci_document")
    PCI_DOCUMENT("pci_document"),

    @SerializedName("sigma_scheduled_query")
    SIGMA_SCHEDULED_QUERY("sigma_scheduled_query"),

    @SerializedName("tax_document_user_upload")
    TAX_DOCUMENT_USER_UPLOAD("tax_document_user_upload");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Purpose(String value) {
      this.value = value;
    }
  }
}
