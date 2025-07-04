// File generated from our OpenAPI spec
package com.stripe.model.identity;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
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

/**
 * A VerificationSession guides you through the process of collecting and verifying the identities
 * of your users. It contains details about the type of verification, such as what <a
 * href="https://stripe.com/docs/identity/verification-checks">verification check</a> to perform.
 * Only create one VerificationSession for each verification in your system.
 *
 * <p>A VerificationSession transitions through <a
 * href="https://stripe.com/docs/identity/how-sessions-work">multiple statuses</a> throughout its
 * lifetime as it progresses through the verification flow. The VerificationSession contains the
 * user's verified data after verification checks are complete.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/identity/verification-sessions">The
 * Verification Sessions API</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class VerificationSession extends ApiResource
    implements HasId, MetadataStore<VerificationSession> {
  /**
   * A string to reference this user. This can be a customer ID, a session ID, or similar, and can
   * be used to reconcile this verification with your internal systems.
   */
  @SerializedName("client_reference_id")
  String clientReferenceId;

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

  /** A set of options for the session’s verification checks. */
  @SerializedName("options")
  Options options;

  /** Details provided about the user being verified. These details may be shown to the user. */
  @SerializedName("provided_details")
  ProvidedDetails providedDetails;

  /**
   * Redaction status of this VerificationSession. If the VerificationSession is not redacted, this
   * field will be null.
   */
  @SerializedName("redaction")
  Redaction redaction;

  /** Customer ID. */
  @SerializedName("related_customer")
  String relatedCustomer;

  @SerializedName("related_person")
  RelatedPerson relatedPerson;

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
   * <p>One of {@code document}, {@code id_number}, or {@code verification_flow}.
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

  /** The configuration token of a verification flow from the dashboard. */
  @SerializedName("verification_flow")
  String verificationFlow;

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
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(VerificationSessionCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(VerificationSessionCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * Creates a VerificationSession object.
   *
   * <p>After the VerificationSession is created, display a verification modal using the session
   * {@code client_secret} or send your users to the session’s {@code url}.
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
   * {@code client_secret} or send your users to the session’s {@code url}.
   *
   * <p>If your API key is in test mode, verification checks won’t actually process, though
   * everything else will occur as if in live mode.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/verify-identity-documents">Verify
   * your users’ identity documents</a>.
   */
  public static VerificationSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/identity/verification_sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * Creates a VerificationSession object.
   *
   * <p>After the VerificationSession is created, display a verification modal using the session
   * {@code client_secret} or send your users to the session’s {@code url}.
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
   * {@code client_secret} or send your users to the session’s {@code url}.
   *
   * <p>If your API key is in test mode, verification checks won’t actually process, though
   * everything else will occur as if in live mode.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/verify-identity-documents">Verify
   * your users’ identity documents</a>.
   */
  public static VerificationSession create(
      VerificationSessionCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/verification_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, VerificationSession.class);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/verification_sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, VerificationSessionCollection.class);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(VerificationSessionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of VerificationSessions. */
  public static VerificationSessionCollection list(
      VerificationSessionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/verification_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, VerificationSessionCollection.class);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in {@code requires_input} or {@code
   * verified} <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>. Redacting a
   * VerificationSession in {@code requires_action} state will automatically cancel it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s {@code redaction.status} field will be set to {@code processing};
   * when the process is finished, it will change to {@code redacted} and an {@code
   * identity.verification_session.redacted} event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string {@code [redacted]} or a
   * similar placeholder. The {@code metadata} field will also be erased. Redacted objects cannot be
   * updated or used for any purpose.
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
   * <p>A VerificationSession object can be redacted when it is in {@code requires_input} or {@code
   * verified} <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>. Redacting a
   * VerificationSession in {@code requires_action} state will automatically cancel it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s {@code redaction.status} field will be set to {@code processing};
   * when the process is finished, it will change to {@code redacted} and an {@code
   * identity.verification_session.redacted} event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string {@code [redacted]} or a
   * similar placeholder. The {@code metadata} field will also be erased. Redacted objects cannot be
   * updated or used for any purpose.
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
   * <p>A VerificationSession object can be redacted when it is in {@code requires_input} or {@code
   * verified} <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>. Redacting a
   * VerificationSession in {@code requires_action} state will automatically cancel it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s {@code redaction.status} field will be set to {@code processing};
   * when the process is finished, it will change to {@code redacted} and an {@code
   * identity.verification_session.redacted} event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string {@code [redacted]} or a
   * similar placeholder. The {@code metadata} field will also be erased. Redacted objects cannot be
   * updated or used for any purpose.
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
   * <p>A VerificationSession object can be redacted when it is in {@code requires_input} or {@code
   * verified} <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>. Redacting a
   * VerificationSession in {@code requires_action} state will automatically cancel it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s {@code redaction.status} field will be set to {@code processing};
   * when the process is finished, it will change to {@code redacted} and an {@code
   * identity.verification_session.redacted} event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string {@code [redacted]} or a
   * similar placeholder. The {@code metadata} field will also be erased. Redacted objects cannot be
   * updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s/redact", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.
   *
   * <p>A VerificationSession object can be redacted when it is in {@code requires_input} or {@code
   * verified} <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>. Redacting a
   * VerificationSession in {@code requires_action} state will automatically cancel it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s {@code redaction.status} field will be set to {@code processing};
   * when the process is finished, it will change to {@code redacted} and an {@code
   * identity.verification_session.redacted} event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string {@code [redacted]} or a
   * similar placeholder. The {@code metadata} field will also be erased. Redacted objects cannot be
   * updated or used for any purpose.
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
   * <p>A VerificationSession object can be redacted when it is in {@code requires_input} or {@code
   * verified} <a href="https://stripe.com/docs/identity/how-sessions-work">status</a>. Redacting a
   * VerificationSession in {@code requires_action} state will automatically cancel it.
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress,
   * the VerificationSession’s {@code redaction.status} field will be set to {@code processing};
   * when the process is finished, it will change to {@code redacted} and an {@code
   * identity.verification_session.redacted} event will be emitted.
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all
   * the fields that contain personal data will be replaced by the string {@code [redacted]} or a
   * similar placeholder. The {@code metadata} field will also be erased. Redacted objects cannot be
   * updated or used for any purpose.
   *
   * <p><a href="https://stripe.com/docs/identity/verification-sessions#redact">Learn more</a>.
   */
  public VerificationSession redact(VerificationSessionRedactParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s/redact", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public static VerificationSession retrieve(String session) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public static VerificationSession retrieve(String session, RequestOptions options)
      throws StripeException {
    return retrieve(session, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public static VerificationSession retrieve(
      String session, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public static VerificationSession retrieve(
      String session, VerificationSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(session));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  @Override
  public VerificationSession update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  @Override
  public VerificationSession update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, VerificationSession.class);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(VerificationSessionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(VerificationSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, VerificationSession.class);
  }

  /** Shows last VerificationSession error. */
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
     * document_unverified_other}, {@code email_unverified_other}, {@code
     * email_verification_declined}, {@code id_number_insufficient_document_data}, {@code
     * id_number_mismatch}, {@code id_number_unverified_other}, {@code phone_unverified_other},
     * {@code phone_verification_declined}, {@code selfie_document_missing_photo}, {@code
     * selfie_face_mismatch}, {@code selfie_manipulated}, {@code selfie_unverified_other}, or {@code
     * under_supported_age}.
     */
    @SerializedName("code")
    String code;

    /** A message that explains the reason for verification or user-session failure. */
    @SerializedName("reason")
    String reason;
  }

  /**
   * For more details about Options, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Options extends StripeObject {
    @SerializedName("document")
    Document document;

    @SerializedName("email")
    Email email;

    @SerializedName("id_number")
    IdNumber idNumber;

    @SerializedName("matching")
    Matching matching;

    @SerializedName("phone")
    Phone phone;

    /**
     * For more details about Document, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
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

    /**
     * For more details about Email, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Email extends StripeObject {
      /** Request one time password verification of {@code provided_details.email}. */
      @SerializedName("require_verification")
      Boolean requireVerification;
    }

    /**
     * For more details about IdNumber, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IdNumber extends StripeObject {}

    /**
     * For more details about Matching, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Matching extends StripeObject {
      /**
       * Strictness of the DOB matching policy to apply.
       *
       * <p>One of {@code none}, or {@code similar}.
       */
      @SerializedName("dob")
      String dob;

      /**
       * Strictness of the name matching policy to apply.
       *
       * <p>One of {@code none}, or {@code similar}.
       */
      @SerializedName("name")
      String name;
    }

    /**
     * For more details about Phone, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Phone extends StripeObject {
      /** Request one time password verification of {@code provided_details.phone}. */
      @SerializedName("require_verification")
      Boolean requireVerification;
    }
  }

  /**
   * For more details about ProvidedDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ProvidedDetails extends StripeObject {
    /** Email of user being verified. */
    @SerializedName("email")
    String email;

    /** Phone number of user being verified. */
    @SerializedName("phone")
    String phone;
  }

  /**
   * For more details about Redaction, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
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

  /**
   * For more details about RelatedPerson, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RelatedPerson extends StripeObject {
    /** Token referencing the associated Account of the related Person resource. */
    @SerializedName("account")
    String account;

    /** Token referencing the related Person resource. */
    @SerializedName("person")
    String person;
  }

  /**
   * For more details about VerifiedOutputs, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class VerifiedOutputs extends StripeObject {
    /** The user's verified address. */
    @SerializedName("address")
    Address address;

    /** The user’s verified date of birth. */
    @SerializedName("dob")
    Dob dob;

    /** The user's verified email address. */
    @SerializedName("email")
    String email;

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

    /** The user's verified phone number. */
    @SerializedName("phone")
    String phone;

    /**
     * The user's verified sex.
     *
     * <p>One of {@code [redacted]}, {@code female}, {@code male}, or {@code unknown}.
     */
    @SerializedName("sex")
    String sex;

    /** The user's verified place of birth as it appears in the document. */
    @SerializedName("unparsed_place_of_birth")
    String unparsedPlaceOfBirth;

    /** The user's verified sex as it appears in the document. */
    @SerializedName("unparsed_sex")
    String unparsedSex;

    /** Point in Time. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dob extends StripeObject {
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(lastError, responseGetter);
    trySetResponseGetter(lastVerificationReport, responseGetter);
    trySetResponseGetter(options, responseGetter);
    trySetResponseGetter(providedDetails, responseGetter);
    trySetResponseGetter(redaction, responseGetter);
    trySetResponseGetter(relatedPerson, responseGetter);
    trySetResponseGetter(verifiedOutputs, responseGetter);
  }
}
