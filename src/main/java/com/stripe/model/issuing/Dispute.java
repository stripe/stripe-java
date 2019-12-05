package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.File;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.DisputeCreateParams;
import com.stripe.param.issuing.DisputeListParams;
import com.stripe.param.issuing.DisputeRetrieveParams;
import com.stripe.param.issuing.DisputeUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Dispute extends ApiResource implements HasId, MetadataStore<Dispute> {
  /**
   * Disputed amount. Usually the amount of the `disputed_transaction`, but can differ (usually
   * because of currency fluctuation or because only part of the order is disputed).
   */
  @SerializedName("amount")
  Long amount;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The currency the `disputed_transaction` was made in. */
  @SerializedName("currency")
  String currency;

  /** The transaction being disputed. */
  @SerializedName("disputed_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transaction> disputedTransaction;

  @SerializedName("evidence")
  Evidence evidence;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `issuing.dispute`.
   */
  @SerializedName("object")
  String object;

  /** Reason for this dispute. One of `other` or `fraudulent`. */
  @SerializedName("reason")
  String reason;

  /** Current status of dispute. One of `lost`, `under_review`, `unsubmitted`, or `won`. */
  @SerializedName("status")
  String status;

  /** Get id of expandable `disputedTransaction` object. */
  public String getDisputedTransaction() {
    return (this.disputedTransaction != null) ? this.disputedTransaction.getId() : null;
  }

  public void setDisputedTransaction(String id) {
    this.disputedTransaction = ApiResource.setExpandableFieldId(id, this.disputedTransaction);
  }

  /** Get expanded `disputedTransaction`. */
  public Transaction getDisputedTransactionObject() {
    return (this.disputedTransaction != null) ? this.disputedTransaction.getExpanded() : null;
  }

  public void setDisputedTransactionObject(Transaction expandableObject) {
    this.disputedTransaction =
        new ExpandableField<Transaction>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.requestCollection(url, params, DisputeCollection.class, options);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(DisputeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(DisputeListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.requestCollection(url, params, DisputeCollection.class, options);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(DisputeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(DisputeCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Dispute update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Dispute update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Dispute update(DisputeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Dispute update(DisputeUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(String dispute) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(String dispute, RequestOptions options) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(String dispute, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(dispute)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Dispute.class, options);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(
      String dispute, DisputeRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(dispute)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Dispute.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Evidence extends StripeObject {
    /**
     * Evidence to support a fraudulent dispute. This will only be present if your dispute's
     * `reason` is `fraudulent`.
     */
    @SerializedName("fraudulent")
    EvidenceFraudulent fraudulent;

    /**
     * Evidence to support an uncategorized dispute. This will only be present if your dispute's
     * `reason` is `other`.
     */
    @SerializedName("other")
    EvidenceOther other;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EvidenceFraudulent extends StripeObject {
    /** Brief freeform text explaining why you are disputing this transaction. */
    @SerializedName("dispute_explanation")
    String disputeExplanation;

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file evidence
     * supporting your dispute.
     */
    @SerializedName("uncategorized_file")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> uncategorizedFile;

    /** Get id of expandable `uncategorizedFile` object. */
    public String getUncategorizedFile() {
      return (this.uncategorizedFile != null) ? this.uncategorizedFile.getId() : null;
    }

    public void setUncategorizedFile(String id) {
      this.uncategorizedFile = ApiResource.setExpandableFieldId(id, this.uncategorizedFile);
    }

    /** Get expanded `uncategorizedFile`. */
    public File getUncategorizedFileObject() {
      return (this.uncategorizedFile != null) ? this.uncategorizedFile.getExpanded() : null;
    }

    public void setUncategorizedFileObject(File expandableObject) {
      this.uncategorizedFile =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EvidenceOther extends StripeObject {
    /** Brief freeform text explaining why you are disputing this transaction. */
    @SerializedName("dispute_explanation")
    String disputeExplanation;

    /**
     * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional file evidence
     * supporting your dispute.
     */
    @SerializedName("uncategorized_file")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> uncategorizedFile;

    /** Get id of expandable `uncategorizedFile` object. */
    public String getUncategorizedFile() {
      return (this.uncategorizedFile != null) ? this.uncategorizedFile.getId() : null;
    }

    public void setUncategorizedFile(String id) {
      this.uncategorizedFile = ApiResource.setExpandableFieldId(id, this.uncategorizedFile);
    }

    /** Get expanded `uncategorizedFile`. */
    public File getUncategorizedFileObject() {
      return (this.uncategorizedFile != null) ? this.uncategorizedFile.getExpanded() : null;
    }

    public void setUncategorizedFileObject(File expandableObject) {
      this.uncategorizedFile =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }
}
