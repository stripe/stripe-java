// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CreditUnderwritingRecordCorrectParams;
import com.stripe.param.issuing.CreditUnderwritingRecordCreateFromApplicationParams;
import com.stripe.param.issuing.CreditUnderwritingRecordCreateFromProactiveReviewParams;
import com.stripe.param.issuing.CreditUnderwritingRecordListParams;
import com.stripe.param.issuing.CreditUnderwritingRecordReportDecisionParams;
import com.stripe.param.issuing.CreditUnderwritingRecordRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Every time an applicant submits an application for a Charge Card product your platform offers, or
 * every time your platform takes a proactive credit decision on an existing account, you must
 * record the decision by creating a new {@code CreditUnderwritingRecord} object on a connected
 * account.
 *
 * <p><a
 * href="https://stripe.com/docs/issuing/credit/report-credit-decisions-and-manage-aans">Follow the
 * guide</a> to learn about your requirements as a platform.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class CreditUnderwritingRecord extends ApiResource implements HasId {
  /** For decisions triggered by an application, details about the submission. */
  @SerializedName("application")
  Application application;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The event that triggered the underwriting.
   *
   * <p>One of {@code application}, or {@code proactive_review}.
   */
  @SerializedName("created_from")
  String createdFrom;

  @SerializedName("credit_user")
  CreditUser creditUser;

  /** Date when a decision was made. */
  @SerializedName("decided_at")
  Long decidedAt;

  /** Details about the decision. */
  @SerializedName("decision")
  Decision decision;

  /**
   * For underwriting initiated by an application, a decision must be taken 30 days after the
   * submission.
   */
  @SerializedName("decision_deadline")
  Long decisionDeadline;

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
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.credit_underwriting_record}.
   */
  @SerializedName("object")
  String object;

  /**
   * If an exception to the usual underwriting criteria was made for this application, details about
   * the exception must be provided. Exceptions should only be granted in rare circumstances, in
   * consultation with Stripe Compliance.
   */
  @SerializedName("underwriting_exception")
  UnderwritingException underwritingException;

  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct() throws StripeException {
    return correct((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(RequestOptions options) throws StripeException {
    return correct((Map<String, Object>) null, options);
  }

  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(Map<String, Object> params) throws StripeException {
    return correct(params, (RequestOptions) null);
  }

  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s/correct",
            ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(CreditUnderwritingRecordCorrectParams params)
      throws StripeException {
    return correct(params, (RequestOptions) null);
  }

  /** Update a {@code CreditUnderwritingRecord} object to correct mistakes. */
  public CreditUnderwritingRecord correct(
      CreditUnderwritingRecordCorrectParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s/correct",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object with information about a credit application
   * submission.
   */
  public static CreditUnderwritingRecord createFromApplication(Map<String, Object> params)
      throws StripeException {
    return createFromApplication(params, (RequestOptions) null);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object with information about a credit application
   * submission.
   */
  public static CreditUnderwritingRecord createFromApplication(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records/create_from_application";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object with information about a credit application
   * submission.
   */
  public static CreditUnderwritingRecord createFromApplication(
      CreditUnderwritingRecordCreateFromApplicationParams params) throws StripeException {
    return createFromApplication(params, (RequestOptions) null);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object with information about a credit application
   * submission.
   */
  public static CreditUnderwritingRecord createFromApplication(
      CreditUnderwritingRecordCreateFromApplicationParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records/create_from_application";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object from an underwriting decision coming from a
   * proactive review of an existing accountholder.
   */
  public static CreditUnderwritingRecord createFromProactiveReview(Map<String, Object> params)
      throws StripeException {
    return createFromProactiveReview(params, (RequestOptions) null);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object from an underwriting decision coming from a
   * proactive review of an existing accountholder.
   */
  public static CreditUnderwritingRecord createFromProactiveReview(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records/create_from_proactive_review";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object from an underwriting decision coming from a
   * proactive review of an existing accountholder.
   */
  public static CreditUnderwritingRecord createFromProactiveReview(
      CreditUnderwritingRecordCreateFromProactiveReviewParams params) throws StripeException {
    return createFromProactiveReview(params, (RequestOptions) null);
  }

  /**
   * Creates a {@code CreditUnderwritingRecord} object from an underwriting decision coming from a
   * proactive review of an existing accountholder.
   */
  public static CreditUnderwritingRecord createFromProactiveReview(
      CreditUnderwritingRecordCreateFromProactiveReviewParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records/create_from_proactive_review";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public static CreditUnderwritingRecordCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public static CreditUnderwritingRecordCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CreditUnderwritingRecordCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public static CreditUnderwritingRecordCollection list(CreditUnderwritingRecordListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Retrieves a list of {@code CreditUnderwritingRecord} objects. The objects are sorted in
   * descending order by creation date, with the most-recently-created object appearing first.
   */
  public static CreditUnderwritingRecordCollection list(
      CreditUnderwritingRecordListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/issuing/credit_underwriting_records";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecordCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Update a {@code CreditUnderwritingRecord} object from a decision made on a credit application.
   */
  public CreditUnderwritingRecord reportDecision(Map<String, Object> params)
      throws StripeException {
    return reportDecision(params, (RequestOptions) null);
  }

  /**
   * Update a {@code CreditUnderwritingRecord} object from a decision made on a credit application.
   */
  public CreditUnderwritingRecord reportDecision(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s/report_decision",
            ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /**
   * Update a {@code CreditUnderwritingRecord} object from a decision made on a credit application.
   */
  public CreditUnderwritingRecord reportDecision(
      CreditUnderwritingRecordReportDecisionParams params) throws StripeException {
    return reportDecision(params, (RequestOptions) null);
  }

  /**
   * Update a {@code CreditUnderwritingRecord} object from a decision made on a credit application.
   */
  public CreditUnderwritingRecord reportDecision(
      CreditUnderwritingRecordReportDecisionParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s/report_decision",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public static CreditUnderwritingRecord retrieve(String creditUnderwritingRecord)
      throws StripeException {
    return retrieve(creditUnderwritingRecord, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public static CreditUnderwritingRecord retrieve(
      String creditUnderwritingRecord, RequestOptions options) throws StripeException {
    return retrieve(creditUnderwritingRecord, (Map<String, Object>) null, options);
  }

  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public static CreditUnderwritingRecord retrieve(
      String creditUnderwritingRecord, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s",
            ApiResource.urlEncodeId(creditUnderwritingRecord));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves a {@code CreditUnderwritingRecord} object. */
  public static CreditUnderwritingRecord retrieve(
      String creditUnderwritingRecord,
      CreditUnderwritingRecordRetrieveParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/issuing/credit_underwriting_records/%s",
            ApiResource.urlEncodeId(creditUnderwritingRecord));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            CreditUnderwritingRecord.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Application extends StripeObject {
    /**
     * The channel through which the applicant has submitted their application.
     *
     * <p>One of {@code in_person}, {@code mail}, {@code online}, or {@code phone}.
     */
    @SerializedName("application_method")
    String applicationMethod;

    /**
     * Scope of demand made by the applicant.
     *
     * <p>One of {@code credit_limit_increase}, or {@code credit_line_opening}.
     */
    @SerializedName("purpose")
    String purpose;

    /** Date when the applicant submitted their application. */
    @SerializedName("submitted_at")
    Long submittedAt;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditUser extends StripeObject {
    /** Email of the applicant or accountholder. */
    @SerializedName("email")
    String email;

    /** Full name of the company or person. */
    @SerializedName("name")
    String name;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Decision extends StripeObject {
    /** Details about a decision application_rejected. */
    @SerializedName("application_rejected")
    ApplicationRejected applicationRejected;

    /** Details about a decision credit_limit_approved. */
    @SerializedName("credit_limit_approved")
    CreditLimitApproved creditLimitApproved;

    /** Details about a decision credit_limit_decreased. */
    @SerializedName("credit_limit_decreased")
    CreditLimitDecreased creditLimitDecreased;

    /** Details about a decision credit_line_closed. */
    @SerializedName("credit_line_closed")
    CreditLineClosed creditLineClosed;

    /**
     * Outcome of the decision.
     *
     * <p>One of {@code additional_information_requested}, {@code application_rejected}, {@code
     * credit_limit_approved}, {@code credit_limit_decreased}, {@code credit_line_closed}, {@code
     * no_changes}, or {@code withdrawn_by_applicant}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicationRejected extends StripeObject {
      /** Details about the {@code reasons.other} when present. */
      @SerializedName("reason_other_explanation")
      String reasonOtherExplanation;

      /**
       * List of reasons why the application was rejected up to 4 reasons, in order of importance.
       */
      @SerializedName("reasons")
      List<String> reasons;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CreditLimitApproved extends StripeObject {
      /**
       * Credit amount approved. An approved credit limit is required before you can set a amount in
       * the <a href="https://stripe.com/docs/api/issuing/credit_policy">CreditPolicy API</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CreditLimitDecreased extends StripeObject {
      /**
       * Credit amount approved after decrease. An approved credit limit is required before you can
       * set a amount in the <a
       * href="https://stripe.com/docs/api/issuing/credit_policy">CreditPolicy API</a>.
       */
      @SerializedName("amount")
      Long amount;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /** Details about the {@code reasons.other} when present. */
      @SerializedName("reason_other_explanation")
      String reasonOtherExplanation;

      /**
       * List of reasons why the existing credit was decreased, up to 4 reasons, in order of
       * importance.
       */
      @SerializedName("reasons")
      List<String> reasons;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CreditLineClosed extends StripeObject {
      /** Details about the {@code reasons.other} when present. */
      @SerializedName("reason_other_explanation")
      String reasonOtherExplanation;

      /**
       * List of reasons why the existing account was closed, up to 4 reasons, in order of
       * importance.
       */
      @SerializedName("reasons")
      List<String> reasons;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UnderwritingException extends StripeObject {
    /** Written explanation for the exception. */
    @SerializedName("explanation")
    String explanation;

    /**
     * The decision before the exception was applied.
     *
     * <p>One of {@code additional_information_requested}, {@code application_rejected}, {@code
     * credit_limit_approved}, {@code credit_limit_decreased}, {@code credit_line_closed}, {@code
     * no_changes}, or {@code withdrawn_by_applicant}.
     */
    @SerializedName("original_decision_type")
    String originalDecisionType;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(creditUser, responseGetter);
    trySetResponseGetter(decision, responseGetter);
    trySetResponseGetter(underwritingException, responseGetter);
  }
}
