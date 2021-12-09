// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.File;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.DisputeCreateParams;
import com.stripe.param.issuing.DisputeListParams;
import com.stripe.param.issuing.DisputeRetrieveParams;
import com.stripe.param.issuing.DisputeSubmitParams;
import com.stripe.param.issuing.DisputeUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Dispute extends ApiResource
    implements MetadataStore<Dispute>, BalanceTransactionSource {
  /**
   * Disputed amount. Usually the amount of the {@code transaction}, but can differ (usually because
   * of currency fluctuation).
   */
  @SerializedName("amount")
  Long amount;

  /** List of balance transactions associated with the dispute. */
  @SerializedName("balance_transactions")
  List<BalanceTransaction> balanceTransactions;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The currency the {@code transaction} was made in. */
  @SerializedName("currency")
  String currency;

  @SerializedName("evidence")
  Evidence evidence;

  /** Unique identifier for the object. */
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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.dispute}.
   */
  @SerializedName("object")
  String object;

  /**
   * Current status of the dispute.
   *
   * <p>One of {@code expired}, {@code lost}, {@code submitted}, {@code unsubmitted}, or {@code
   * won}.
   */
  @SerializedName("status")
  String status;

  /** The transaction being disputed. */
  @SerializedName("transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transaction> transaction;

  /** Get ID of expandable {@code transaction} object. */
  public String getTransaction() {
    return (this.transaction != null) ? this.transaction.getId() : null;
  }

  public void setTransaction(String id) {
    this.transaction = ApiResource.setExpandableFieldId(id, this.transaction);
  }

  /** Get expanded {@code transaction}. */
  public Transaction getTransactionObject() {
    return (this.transaction != null) ? this.transaction.getExpanded() : null;
  }

  public void setTransactionObject(Transaction expandableObject) {
    this.transaction = new ExpandableField<Transaction>(expandableObject.getId(), expandableObject);
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

  /**
   * Creates an Issuing <code>Dispute</code> object. Individual pieces of evidence within the <code>
   * evidence</code> object are optional at this point. Stripe only validates that required evidence
   * is present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public static Dispute create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an Issuing <code>Dispute</code> object. Individual pieces of evidence within the <code>
   * evidence</code> object are optional at this point. Stripe only validates that required evidence
   * is present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public static Dispute create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * Creates an Issuing <code>Dispute</code> object. Individual pieces of evidence within the <code>
   * evidence</code> object are optional at this point. Stripe only validates that required evidence
   * is present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public static Dispute create(DisputeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an Issuing <code>Dispute</code> object. Individual pieces of evidence within the <code>
   * evidence</code> object are optional at this point. Stripe only validates that required evidence
   * is present during submission. Refer to <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a> for more details about evidence requirements.
   */
  public static Dispute create(DisputeCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged. Properties on the <code>
   * evidence</code> object can be unset by passing in an empty string.
   */
  @Override
  public Dispute update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged. Properties on the <code>
   * evidence</code> object can be unset by passing in an empty string.
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
   * parameters passed. Any parameters not provided will be left unchanged. Properties on the <code>
   * evidence</code> object can be unset by passing in an empty string.
   */
  public Dispute update(DisputeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged. Properties on the <code>
   * evidence</code> object can be unset by passing in an empty string.
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

  /**
   * Submits an Issuing <code>Dispute</code> to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit() throws StripeException {
    return submit((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Submits an Issuing <code>Dispute</code> to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(RequestOptions options) throws StripeException {
    return submit((Map<String, Object>) null, options);
  }

  /**
   * Submits an Issuing <code>Dispute</code> to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(Map<String, Object> params) throws StripeException {
    return submit(params, (RequestOptions) null);
  }

  /**
   * Submits an Issuing <code>Dispute</code> to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s/submit", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * Submits an Issuing <code>Dispute</code> to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(DisputeSubmitParams params) throws StripeException {
    return submit(params, (RequestOptions) null);
  }

  /**
   * Submits an Issuing <code>Dispute</code> to the card network. Stripe validates that all evidence
   * fields required for the dispute’s reason are present. For more details, see <a
   * href="https://stripe.com/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute
   * reasons and evidence</a>.
   */
  public Dispute submit(DisputeSubmitParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s/submit", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Evidence extends StripeObject {
    @SerializedName("canceled")
    Canceled canceled;

    @SerializedName("duplicate")
    Duplicate duplicate;

    @SerializedName("fraudulent")
    Fraudulent fraudulent;

    @SerializedName("merchandise_not_as_described")
    MerchandiseNotAsDescribed merchandiseNotAsDescribed;

    @SerializedName("not_received")
    NotReceived notReceived;

    @SerializedName("other")
    Other other;

    /**
     * The reason for filing the dispute. Its value will match the field containing the evidence.
     *
     * <p>One of {@code canceled}, {@code duplicate}, {@code fraudulent}, {@code
     * merchandise_not_as_described}, {@code not_received}, {@code other}, or {@code
     * service_not_as_described}.
     */
    @SerializedName("reason")
    String reason;

    @SerializedName("service_not_as_described")
    ServiceNotAsDescribed serviceNotAsDescribed;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> additionalDocumentation;

      /** Date when order was canceled. */
      @SerializedName("canceled_at")
      Long canceledAt;

      /** Whether the cardholder was provided with a cancellation policy. */
      @SerializedName("cancellation_policy_provided")
      Boolean cancellationPolicyProvided;

      /** Reason for canceling the order. */
      @SerializedName("cancellation_reason")
      String cancellationReason;

      /** Date when the cardholder expected to receive the product. */
      @SerializedName("expected_at")
      Long expectedAt;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      String explanation;

      /** Description of the merchandise or service that was purchased. */
      @SerializedName("product_description")
      String productDescription;

      /**
       * Whether the product was a merchandise or service.
       *
       * <p>One of {@code merchandise}, or {@code service}.
       */
      @SerializedName("product_type")
      String productType;

      /** Date when the product was returned or attempted to be returned. */
      @SerializedName("returned_at")
      Long returnedAt;

      /**
       * Result of cardholder's attempt to return the product.
       *
       * <p>One of {@code merchant_rejected}, or {@code successful}.
       */
      @SerializedName("return_status")
      String returnStatus;

      /** Get ID of expandable {@code additionalDocumentation} object. */
      public String getAdditionalDocumentation() {
        return (this.additionalDocumentation != null) ? this.additionalDocumentation.getId() : null;
      }

      public void setAdditionalDocumentation(String id) {
        this.additionalDocumentation =
            ApiResource.setExpandableFieldId(id, this.additionalDocumentation);
      }

      /** Get expanded {@code additionalDocumentation}. */
      public File getAdditionalDocumentationObject() {
        return (this.additionalDocumentation != null)
            ? this.additionalDocumentation.getExpanded()
            : null;
      }

      public void setAdditionalDocumentationObject(File expandableObject) {
        this.additionalDocumentation =
            new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Duplicate extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> additionalDocumentation;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of the
       * card statement showing that the product had already been paid for.
       */
      @SerializedName("card_statement")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> cardStatement;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Copy of the
       * receipt showing that the product had been paid for in cash.
       */
      @SerializedName("cash_receipt")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> cashReceipt;

      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Image of the
       * front and back of the check that was used to pay for the product.
       */
      @SerializedName("check_image")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> checkImage;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      String explanation;

      /**
       * Transaction (e.g., ipi_...) that the disputed transaction is a duplicate of. Of the two or
       * more transactions that are copies of each other, this is original undisputed one.
       */
      @SerializedName("original_transaction")
      String originalTransaction;

      /** Get ID of expandable {@code additionalDocumentation} object. */
      public String getAdditionalDocumentation() {
        return (this.additionalDocumentation != null) ? this.additionalDocumentation.getId() : null;
      }

      public void setAdditionalDocumentation(String id) {
        this.additionalDocumentation =
            ApiResource.setExpandableFieldId(id, this.additionalDocumentation);
      }

      /** Get expanded {@code additionalDocumentation}. */
      public File getAdditionalDocumentationObject() {
        return (this.additionalDocumentation != null)
            ? this.additionalDocumentation.getExpanded()
            : null;
      }

      public void setAdditionalDocumentationObject(File expandableObject) {
        this.additionalDocumentation =
            new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code cardStatement} object. */
      public String getCardStatement() {
        return (this.cardStatement != null) ? this.cardStatement.getId() : null;
      }

      public void setCardStatement(String id) {
        this.cardStatement = ApiResource.setExpandableFieldId(id, this.cardStatement);
      }

      /** Get expanded {@code cardStatement}. */
      public File getCardStatementObject() {
        return (this.cardStatement != null) ? this.cardStatement.getExpanded() : null;
      }

      public void setCardStatementObject(File expandableObject) {
        this.cardStatement = new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code cashReceipt} object. */
      public String getCashReceipt() {
        return (this.cashReceipt != null) ? this.cashReceipt.getId() : null;
      }

      public void setCashReceipt(String id) {
        this.cashReceipt = ApiResource.setExpandableFieldId(id, this.cashReceipt);
      }

      /** Get expanded {@code cashReceipt}. */
      public File getCashReceiptObject() {
        return (this.cashReceipt != null) ? this.cashReceipt.getExpanded() : null;
      }

      public void setCashReceiptObject(File expandableObject) {
        this.cashReceipt = new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code checkImage} object. */
      public String getCheckImage() {
        return (this.checkImage != null) ? this.checkImage.getId() : null;
      }

      public void setCheckImage(String id) {
        this.checkImage = ApiResource.setExpandableFieldId(id, this.checkImage);
      }

      /** Get expanded {@code checkImage}. */
      public File getCheckImageObject() {
        return (this.checkImage != null) ? this.checkImage.getExpanded() : null;
      }

      public void setCheckImageObject(File expandableObject) {
        this.checkImage = new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fraudulent extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> additionalDocumentation;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      String explanation;

      /** Get ID of expandable {@code additionalDocumentation} object. */
      public String getAdditionalDocumentation() {
        return (this.additionalDocumentation != null) ? this.additionalDocumentation.getId() : null;
      }

      public void setAdditionalDocumentation(String id) {
        this.additionalDocumentation =
            ApiResource.setExpandableFieldId(id, this.additionalDocumentation);
      }

      /** Get expanded {@code additionalDocumentation}. */
      public File getAdditionalDocumentationObject() {
        return (this.additionalDocumentation != null)
            ? this.additionalDocumentation.getExpanded()
            : null;
      }

      public void setAdditionalDocumentationObject(File expandableObject) {
        this.additionalDocumentation =
            new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MerchandiseNotAsDescribed extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> additionalDocumentation;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      String explanation;

      /** Date when the product was received. */
      @SerializedName("received_at")
      Long receivedAt;

      /** Description of the cardholder's attempt to return the product. */
      @SerializedName("return_description")
      String returnDescription;

      /** Date when the product was returned or attempted to be returned. */
      @SerializedName("returned_at")
      Long returnedAt;

      /**
       * Result of cardholder's attempt to return the product.
       *
       * <p>One of {@code merchant_rejected}, or {@code successful}.
       */
      @SerializedName("return_status")
      String returnStatus;

      /** Get ID of expandable {@code additionalDocumentation} object. */
      public String getAdditionalDocumentation() {
        return (this.additionalDocumentation != null) ? this.additionalDocumentation.getId() : null;
      }

      public void setAdditionalDocumentation(String id) {
        this.additionalDocumentation =
            ApiResource.setExpandableFieldId(id, this.additionalDocumentation);
      }

      /** Get expanded {@code additionalDocumentation}. */
      public File getAdditionalDocumentationObject() {
        return (this.additionalDocumentation != null)
            ? this.additionalDocumentation.getExpanded()
            : null;
      }

      public void setAdditionalDocumentationObject(File expandableObject) {
        this.additionalDocumentation =
            new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NotReceived extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> additionalDocumentation;

      /** Date when the cardholder expected to receive the product. */
      @SerializedName("expected_at")
      Long expectedAt;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      String explanation;

      /** Description of the merchandise or service that was purchased. */
      @SerializedName("product_description")
      String productDescription;

      /**
       * Whether the product was a merchandise or service.
       *
       * <p>One of {@code merchandise}, or {@code service}.
       */
      @SerializedName("product_type")
      String productType;

      /** Get ID of expandable {@code additionalDocumentation} object. */
      public String getAdditionalDocumentation() {
        return (this.additionalDocumentation != null) ? this.additionalDocumentation.getId() : null;
      }

      public void setAdditionalDocumentation(String id) {
        this.additionalDocumentation =
            ApiResource.setExpandableFieldId(id, this.additionalDocumentation);
      }

      /** Get expanded {@code additionalDocumentation}. */
      public File getAdditionalDocumentationObject() {
        return (this.additionalDocumentation != null)
            ? this.additionalDocumentation.getExpanded()
            : null;
      }

      public void setAdditionalDocumentationObject(File expandableObject) {
        this.additionalDocumentation =
            new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Other extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> additionalDocumentation;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      String explanation;

      /** Description of the merchandise or service that was purchased. */
      @SerializedName("product_description")
      String productDescription;

      /**
       * Whether the product was a merchandise or service.
       *
       * <p>One of {@code merchandise}, or {@code service}.
       */
      @SerializedName("product_type")
      String productType;

      /** Get ID of expandable {@code additionalDocumentation} object. */
      public String getAdditionalDocumentation() {
        return (this.additionalDocumentation != null) ? this.additionalDocumentation.getId() : null;
      }

      public void setAdditionalDocumentation(String id) {
        this.additionalDocumentation =
            ApiResource.setExpandableFieldId(id, this.additionalDocumentation);
      }

      /** Get expanded {@code additionalDocumentation}. */
      public File getAdditionalDocumentationObject() {
        return (this.additionalDocumentation != null)
            ? this.additionalDocumentation.getExpanded()
            : null;
      }

      public void setAdditionalDocumentationObject(File expandableObject) {
        this.additionalDocumentation =
            new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ServiceNotAsDescribed extends StripeObject {
      /**
       * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Additional
       * documentation supporting the dispute.
       */
      @SerializedName("additional_documentation")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<File> additionalDocumentation;

      /** Date when order was canceled. */
      @SerializedName("canceled_at")
      Long canceledAt;

      /** Reason for canceling the order. */
      @SerializedName("cancellation_reason")
      String cancellationReason;

      /** Explanation of why the cardholder is disputing this transaction. */
      @SerializedName("explanation")
      String explanation;

      /** Date when the product was received. */
      @SerializedName("received_at")
      Long receivedAt;

      /** Get ID of expandable {@code additionalDocumentation} object. */
      public String getAdditionalDocumentation() {
        return (this.additionalDocumentation != null) ? this.additionalDocumentation.getId() : null;
      }

      public void setAdditionalDocumentation(String id) {
        this.additionalDocumentation =
            ApiResource.setExpandableFieldId(id, this.additionalDocumentation);
      }

      /** Get expanded {@code additionalDocumentation}. */
      public File getAdditionalDocumentationObject() {
        return (this.additionalDocumentation != null)
            ? this.additionalDocumentation.getExpanded()
            : null;
      }

      public void setAdditionalDocumentationObject(File expandableObject) {
        this.additionalDocumentation =
            new ExpandableField<File>(expandableObject.getId(), expandableObject);
      }
    }
  }
}
