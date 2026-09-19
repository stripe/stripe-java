// File generated from our OpenAPI spec
package com.stripe.service.identity;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.identity.VerificationSession;
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
            options);
    return this.request(
        request, new TypeToken<StripeCollection<VerificationSession>>() {}.getType());
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
  public VerificationSession create(RequestOptions options) throws StripeException {
    return create((VerificationSessionCreateParams) null, options);
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
  public VerificationSession create() throws StripeException {
    return create((VerificationSessionCreateParams) null, (RequestOptions) null);
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
            options);
    return this.request(request, VerificationSession.class);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(String id, VerificationSessionRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (VerificationSessionRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(String id) throws StripeException {
    return retrieve(id, (VerificationSessionRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a VerificationSession that was previously created.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to retrieve a
   * valid {@code client_secret} or {@code url} to allow re-submission.
   */
  public VerificationSession retrieve(
      String id, VerificationSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, VerificationSession.class);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(String id, VerificationSessionUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(String id, RequestOptions options) throws StripeException {
    return update(id, (VerificationSessionUpdateParams) null, options);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(String id) throws StripeException {
    return update(id, (VerificationSessionUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a VerificationSession object.
   *
   * <p>When the session status is {@code requires_input}, you can use this method to update the
   * verification check and options.
   */
  public VerificationSession update(
      String id, VerificationSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, VerificationSession.class);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(String id, VerificationSessionCancelParams params)
      throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (VerificationSessionCancelParams) null, options);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(String id) throws StripeException {
    return cancel(id, (VerificationSessionCancelParams) null, (RequestOptions) null);
  }
  /**
   * A VerificationSession object can be canceled when it is in {@code requires_input} <a
   * href="https://stripe.com/docs/identity/how-sessions-work">status</a>.
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="https://stripe.com/docs/identity/verification-sessions#cancel">Learn more</a>.
   */
  public VerificationSession cancel(
      String id, VerificationSessionCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, VerificationSession.class);
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
  public VerificationSession redact(String id, VerificationSessionRedactParams params)
      throws StripeException {
    return redact(id, params, (RequestOptions) null);
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
  public VerificationSession redact(String id, RequestOptions options) throws StripeException {
    return redact(id, (VerificationSessionRedactParams) null, options);
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
  public VerificationSession redact(String id) throws StripeException {
    return redact(id, (VerificationSessionRedactParams) null, (RequestOptions) null);
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
      String id, VerificationSessionRedactParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_sessions/%s/redact", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, VerificationSession.class);
  }
}
