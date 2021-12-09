// File generated from our OpenAPI spec
package com.stripe.model.identity;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.identity.VerificationSessionCancelParams;
import com.stripe.param.identity.VerificationSessionCreateParams;
import com.stripe.param.identity.VerificationSessionListParams;
import com.stripe.param.identity.VerificationSessionRedactParams;
import com.stripe.param.identity.VerificationSessionRetrieveParams;
import com.stripe.param.identity.VerificationSessionUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class VerificationSession extends ApiResource
    implements HasId, MetadataStore<VerificationSession> {
  /**
   * The short-lived client secret used by Stripe.js to <a
   * href="https://stripe.com/docs/js/identity/modal">show a verification modal</a> inside your app.
   * This client secret expires after 24 hours and can only be used once. Don’t store it, log it,
   * embed it in a URL, or expose it to anyone other than the user. Make sure that you have TLS
   * enabled on any page that includes the client secret. Refer to our docs on <a
   * href="https://stripe.com/docs/identity/verification-sessions#client-secret">passing the client
   * secret to the frontend</a> to learn more.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If present, this property tells you the last error encountered when processing the
   * verification.
   */
  @SerializedName("last_error")
  LastError lastError;

  /**
   * ID of the most recent VerificationReport. <a
   * href="https://stripe.com/docs/identity/verification-sessions#results">Learn more about
   * accessing detailed verification results.</a>
   */
  @SerializedName("last_verification_report")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<VerificationReport> lastVerificationReport;

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
   * <p>Equal to {@code identity.verification_session}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("options")
  Options options;

  /**
   * Redaction status of this VerificationSession. If the VerificationSession is not redacted, this
   * field will be null.
   */
  @SerializedName("redaction")
  Redaction redaction;

  /**
   * Status of this VerificationSession. <a
   * href="https://stripe.com/docs/identity/how-sessions-work">Learn more about the lifecycle of
   * sessions</a>.
   *
   * <p>One of {@code canceled}, {@code processing}, {@code requires_input}, or {@code verified}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of <a href="https://stripe.com/docs/identity/verification-checks">verification
   * check</a> to be performed.
   *
   * <p>One of {@code document}, or {@code id_number}.
   */
  @SerializedName("type")
  String type;

  /**
   * The short-lived URL that you use to redirect a user to Stripe to submit their identity
   * information. This URL expires after 48 hours and can only be used once. Don’t store it, log it,
   * send it in emails or expose it to anyone other than the user. Refer to our docs on <a
   * href="https://stripe.com/docs/identity/verify-identity-documents?platform=web&amp;type=redirect">verifying
   * identity documents</a> to learn how to redirect users to Stripe.
   */
  @SerializedName("url")
  String url;

  /** The user’s verified data. */
  @SerializedName("verified_outputs")
  VerifiedOutputs verifiedOutputs;

  /** Get ID of expandable {@code lastVerificationReport} object. */
  public String getLastVerificationReport() {
    return (this.lastVerificationReport != null) ? this.lastVerificationReport.getId() : null;
  }

  public void setLastVerificationReport(String id) {
    this.lastVerificationReport = ApiResource.setExpandableFieldId(id, this.lastVerificationReport);
  }

  /** Get expanded {@code lastVerificationReport}. */
  public VerificationReport getLastVerificationReportObject() {
    return (this.lastVerificationReport != null) ? this.lastVerificationReport.getExpanded() : null;
  }

  public void setLastVerificationReportObject(VerificationReport expandableObject) {
    this.lastVerificationReport =
        new ExpandableField<VerificationReport>(expandableObject.getId(), expandableObject);
  }

  /**
   * Creates a VerificationSession object.
   *
   * <p>After the VerificationSession is created, display a verification modal using the session
   * <code>client_secret</code> or send your users to the session’s <code>url</code>.
   *
   * <p>If your API key is in test mode, verification checks won’t actually process, though
   * everything else will occur as if in live mode.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/verify-identity-documents">Verify
   * your users’ identity documents</a>.
   */
  public static VerificationSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a VerificationSession object.
   *
   * <p>After the VerificationSession is created, display a verification modal using the session
   * <code>client_secret</code> or send your users to the session’s <code>url</code>.
   *
   * <p>If your API key is in test mode, verification checks won’t actually process, though
   * everything else will occur as if in live mode.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/verify-identity-documents">Verify
   * your users’ identity documents</a>.
   */
  public static VerificationSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/identity/verification_sessions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  /**
   * Creates a VerificationSession object.
   *
   * <p>After the VerificationSession is created, display a verification modal using the session
   * <code>client_secret</code> or send your users to the session’s <code>url</code>.
   *
   * <p>If your API key is in test mode, verification checks won’t actually process, though
   * everything else will occur as if in live mode.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/verify-identity-documents">Verify
   * your users’ identity documents</a>.
   */
  public static VerificationSession create(VerificationSessionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a VerificationSession object.
   *
   * <p>After the VerificationSession is created, display a verification modal using the session
   * <code>client_secret</code> or send your users to the session’s <code>url</code>.
   *
   * <p>If your API key is in test mode, verification checks won’t actually process, though
   * everything else will occur as if in live mode.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/verify-identity-documents">Verify
   * your users’ identity documents</a>.
   */
  public static VerificationSession create(
      VerificationSessionCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/identity/verification_sessions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to retrieve
   * a valid <code>client_secret</code> or <code>url</code> to allow re-submission.
   */
  public static VerificationSession retrieve(String session) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to retrieve
   * a valid <code>client_secret</code> or <code>url</code> to allow re-submission.
   */
  public static VerificationSession retrieve(String session, RequestOptions options)
      throws StripeException {
    return retrieve(session, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to retrieve
   * a valid <code>client_secret</code> or <code>url</code> to allow re-submission.
   */
  public static VerificationSession retrieve(
      String session, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(session)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, VerificationSession.class, options);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to retrieve
   * a valid <code>client_secret</code> or <code>url</code> to allow re-submission.
   */
  public static VerificationSession retrieve(
      String session, VerificationSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(session)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, VerificationSession.class, options);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/identity/verification_sessions");
    return ApiResource.requestCollection(url, params, VerificationSessionCollection.class, options);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(VerificationSessionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(
      VerificationSessionListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/identity/verification_sessions");
    return ApiResource.requestCollection(url, params, VerificationSessionCollection.class, options);
  }

  /**
   * A VerificationSession object can be canceled when it is in <code>requires_input</code> <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A VerificationSession object can be canceled when it is in <code>requires_input</code> <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * A VerificationSession object can be canceled when it is in <code>requires_input</code> <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A VerificationSession object can be canceled when it is in <code>requires_input</code> <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s/cancel",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  /**
   * A VerificationSession object can be canceled when it is in <code>requires_input</code> <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(VerificationSessionCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A VerificationSession object can be canceled when it is in <code>requires_input</code> <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(VerificationSessionCancelParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s/cancel",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in <code>requires_input</code> or
   * <code>verified</code> <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   * Redacting a VerificationSession in <code>requires_action</code> state will automatically cancel
   * it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s <code>redaction.status</code> field will be set to <code>processing
   * </code>; when the process is finished, it will change to <code>redacted</code> and an <code>
   * identity.verification_session.redacted</code> event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string <code>[redacted]</code> or
   * a similar placeholder. The <code>metadata</code> field will also be erased. Redacted objects
   * cannot be updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact() throws StripeException {
    return redact((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in <code>requires_input</code> or
   * <code>verified</code> <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   * Redacting a VerificationSession in <code>requires_action</code> state will automatically cancel
   * it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s <code>redaction.status</code> field will be set to <code>processing
   * </code>; when the process is finished, it will change to <code>redacted</code> and an <code>
   * identity.verification_session.redacted</code> event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string <code>[redacted]</code> or
   * a similar placeholder. The <code>metadata</code> field will also be erased. Redacted objects
   * cannot be updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact(RequestOptions options) throws StripeException {
    return redact((Map<String, Object>) null, options);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in <code>requires_input</code> or
   * <code>verified</code> <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   * Redacting a VerificationSession in <code>requires_action</code> state will automatically cancel
   * it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s <code>redaction.status</code> field will be set to <code>processing
   * </code>; when the process is finished, it will change to <code>redacted</code> and an <code>
   * identity.verification_session.redacted</code> event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string <code>[redacted]</code> or
   * a similar placeholder. The <code>metadata</code> field will also be erased. Redacted objects
   * cannot be updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact(Map<String, Object> params) throws StripeException {
    return redact(params, (RequestOptions) null);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in <code>requires_input</code> or
   * <code>verified</code> <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   * Redacting a VerificationSession in <code>requires_action</code> state will automatically cancel
   * it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s <code>redaction.status</code> field will be set to <code>processing
   * </code>; when the process is finished, it will change to <code>redacted</code> and an <code>
   * identity.verification_session.redacted</code> event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string <code>[redacted]</code> or
   * a similar placeholder. The <code>metadata</code> field will also be erased. Redacted objects
   * cannot be updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s/redact",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in <code>requires_input</code> or
   * <code>verified</code> <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   * Redacting a VerificationSession in <code>requires_action</code> state will automatically cancel
   * it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s <code>redaction.status</code> field will be set to <code>processing
   * </code>; when the process is finished, it will change to <code>redacted</code> and an <code>
   * identity.verification_session.redacted</code> event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string <code>[redacted]</code> or
   * a similar placeholder. The <code>metadata</code> field will also be erased. Redacted objects
   * cannot be updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact(VerificationSessionRedactParams params) throws StripeException {
    return redact(params, (RequestOptions) null);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in <code>requires_input</code> or
   * <code>verified</code> <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   * Redacting a VerificationSession in <code>requires_action</code> state will automatically cancel
   * it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s <code>redaction.status</code> field will be set to <code>processing
   * </code>; when the process is finished, it will change to <code>redacted</code> and an <code>
   * identity.verification_session.redacted</code> event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string <code>[redacted]</code> or
   * a similar placeholder. The <code>metadata</code> field will also be erased. Redacted objects
   * cannot be updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact(VerificationSessionRedactParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s/redact",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to update
   * the verification check and options.
   */
  @Override
  public VerificationSession update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to update
   * the verification check and options.
   */
  @Override
  public VerificationSession update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to update
   * the verification check and options.
   */
  public VerificationSession update(VerificationSessionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to update
   * the verification check and options.
   */
  public VerificationSession update(VerificationSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, VerificationSession.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LastError extends StripeObject {
    /**
     * A short machine-readable string giving the reason for the verification or user-session
     * failure.
     *
     * <p>One of {@code abandoned}, {@code consent_declined}, {@code country_not_supported}, {@code
     * device_not_supported}, {@code document_expired}, {@code document_type_not_supported}, {@code
     * document_unverified_other}, {@code id_number_insufficient_document_data}, {@code
     * id_number_mismatch}, {@code id_number_unverified_other}, {@code
     * selfie_document_missing_photo}, {@code selfie_face_mismatch}, {@code selfie_manipulated},
     * {@code selfie_unverified_other}, or {@code under_supported_age}.
     */
    @SerializedName("code")
    String code;

    /** A message that explains the reason for verification or user-session failure. */
    @SerializedName("reason")
    String reason;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Options extends StripeObject {
    @SerializedName("document")
    Document document;

    @SerializedName("id_number")
    IdNumber idNumber;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Document extends StripeObject {
      /**
       * Array of strings of allowed identity document types. If the provided identity document
       * isn’t one of the allowed types, the verification check will fail with a
       * document_type_not_allowed error code.
       */
      @SerializedName("allowed_types")
      List<String> allowedTypes;

      /**
       * Collect an ID number and perform an <a
       * href="https://stripe.com/docs/identity/verification-checks?type=id-number">ID number
       * check</a> with the document’s extracted name and date of birth.
       */
      @SerializedName("require_id_number")
      Boolean requireIdNumber;

      /**
       * Disable image uploads, identity document images have to be captured using the device’s
       * camera.
       */
      @SerializedName("require_live_capture")
      Boolean requireLiveCapture;

      /**
       * Capture a face image and perform a <a
       * href="https://stripe.com/docs/identity/verification-checks?type=selfie">selfie check</a>
       * comparing a photo ID and a picture of your user’s face. <a
       * href="https://stripe.com/docs/identity/selfie">Learn more</a>.
       */
      @SerializedName("require_matching_selfie")
      Boolean requireMatchingSelfie;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IdNumber extends StripeObject {}
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Redaction extends StripeObject {
    /**
     * Indicates whether this object and its related objects have been redacted or not.
     *
     * <p>One of {@code processing}, or {@code redacted}.
     */
    @SerializedName("status")
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerifiedOutputs extends StripeObject {
    /** The user's verified address. */
    @SerializedName("address")
    Address address;

    /** The user’s verified date of birth. */
    @SerializedName("dob")
    DateOfBirth dob;

    /** The user's verified first name. */
    @SerializedName("first_name")
    String firstName;

    /** The user's verified id number. */
    @SerializedName("id_number")
    String idNumber;

    /**
     * The user's verified id number type.
     *
     * <p>One of {@code br_cpf}, {@code sg_nric}, or {@code us_ssn}.
     */
    @SerializedName("id_number_type")
    String idNumberType;

    /** The user's verified last name. */
    @SerializedName("last_name")
    String lastName;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DateOfBirth extends StripeObject {
      /** Numerical day between 1 and 31. */
      @SerializedName("day")
      Long day;

      /** Numerical month between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year. */
      @SerializedName("year")
      Long year;
    }
  }
}
