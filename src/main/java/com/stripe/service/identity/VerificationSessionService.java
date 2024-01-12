// File generated from our OpenAPI spec
package com.stripe.service.identity;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.identity.VerificationSession;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.identity.VerificationSessionCancelParams;
import com.stripe.param.identity.VerificationSessionCreateParams;
import com.stripe.param.identity.VerificationSessionListParams;
import com.stripe.param.identity.VerificationSessionRedactParams;
import com.stripe.param.identity.VerificationSessionRetrieveParams;
import com.stripe.param.identity.VerificationSessionUpdateParams;

public final class VerificationSessionService extends ApiService {
  public VerificationSessionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of VerificationSessions. */
  public StripeCollection<VerificationSession> list(VerificationSessionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of VerificationSessions. */
  public StripeCollection<VerificationSession> list(RequestOptions options) throws StripeException {
    return list((VerificationSessionListParams) null, options);
  }
  /** Returns a list of VerificationSessions. */
  public StripeCollection<VerificationSession> list() throws StripeException {
    return list((VerificationSessionListParams) null, (RequestOptions) null);
  }
  /** Returns a list of VerificationSessions. */
  public StripeCollection<VerificationSession> list(
      VerificationSessionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/verification_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<VerificationSession>>() {}.getType());
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
  public VerificationSession create(VerificationSessionCreateParams params) throws StripeException {
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
  public VerificationSession create(VerificationSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/identity/verification_sessions";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, VerificationSession.class);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(String session, VerificationSessionRetrieveParams params)
      throws StripeException {
    return retrieve(session, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(String session, RequestOptions options)
      throws StripeException {
    return retrieve(session, (VerificationSessionRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(String session) throws StripeException {
    return retrieve(session, (VerificationSessionRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(
      String session, VerificationSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, VerificationSession.class);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(String session, VerificationSessionUpdateParams params)
      throws StripeException {
    return update(session, params, (RequestOptions) null);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(String session, RequestOptions options) throws StripeException {
    return update(session, (VerificationSessionUpdateParams) null, options);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(String session) throws StripeException {
    return update(session, (VerificationSessionUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(
      String session, VerificationSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, VerificationSession.class);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(String session, VerificationSessionCancelParams params)
      throws StripeException {
    return cancel(session, params, (RequestOptions) null);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(String session, RequestOptions options) throws StripeException {
    return cancel(session, (VerificationSessionCancelParams) null, options);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(String session) throws StripeException {
    return cancel(session, (VerificationSessionCancelParams) null, (RequestOptions) null);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(
      String session, VerificationSessionCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s/cancel", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
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
  public VerificationSession redact(String session, VerificationSessionRedactParams params)
      throws StripeException {
    return redact(session, params, (RequestOptions) null);
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
  public VerificationSession redact(String session, RequestOptions options) throws StripeException {
    return redact(session, (VerificationSessionRedactParams) null, options);
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
  public VerificationSession redact(String session) throws StripeException {
    return redact(session, (VerificationSessionRedactParams) null, (RequestOptions) null);
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
  public VerificationSession redact(
      String session, VerificationSessionRedactParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/verification_sessions/%s/redact", ApiResource.urlEncodeId(session));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, VerificationSession.class);
  }
}
