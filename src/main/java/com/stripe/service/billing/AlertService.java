// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billing.Alert;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.AlertActivateParams;
import com.stripe.param.billing.AlertArchiveParams;
import com.stripe.param.billing.AlertCreateParams;
import com.stripe.param.billing.AlertDeactivateParams;
import com.stripe.param.billing.AlertListParams;
import com.stripe.param.billing.AlertRetrieveParams;

public final class AlertService extends ApiService {
  public AlertService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists billing active and inactive alerts. */
  public StripeCollection<Alert> list(AlertListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists billing active and inactive alerts. */
  public StripeCollection<Alert> list(RequestOptions options) throws StripeException {
    return list((AlertListParams) null, options);
  }
  /** Lists billing active and inactive alerts. */
  public StripeCollection<Alert> list() throws StripeException {
    return list((AlertListParams) null, (RequestOptions) null);
  }
  /** Lists billing active and inactive alerts. */
  public StripeCollection<Alert> list(AlertListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/alerts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<Alert>>() {}.getType());
  }
  /** Creates a billing alert. */
  public Alert create(AlertCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a billing alert. */
  public Alert create(AlertCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/alerts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Alert.class);
  }
  /** Retrieves a billing alert given an ID. */
  public Alert retrieve(String id, AlertRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a billing alert given an ID. */
  public Alert retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (AlertRetrieveParams) null, options);
  }
  /** Retrieves a billing alert given an ID. */
  public Alert retrieve(String id) throws StripeException {
    return retrieve(id, (AlertRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a billing alert given an ID. */
  public Alert retrieve(String id, AlertRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Alert.class);
  }
  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(String id, AlertActivateParams params) throws StripeException {
    return activate(id, params, (RequestOptions) null);
  }
  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(String id, RequestOptions options) throws StripeException {
    return activate(id, (AlertActivateParams) null, options);
  }
  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(String id) throws StripeException {
    return activate(id, (AlertActivateParams) null, (RequestOptions) null);
  }
  /** Reactivates this alert, allowing it to trigger again. */
  public Alert activate(String id, AlertActivateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s/activate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Alert.class);
  }
  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(String id, AlertArchiveParams params) throws StripeException {
    return archive(id, params, (RequestOptions) null);
  }
  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(String id, RequestOptions options) throws StripeException {
    return archive(id, (AlertArchiveParams) null, options);
  }
  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(String id) throws StripeException {
    return archive(id, (AlertArchiveParams) null, (RequestOptions) null);
  }
  /** Archives this alert, removing it from the list view and APIs. This is non-reversible. */
  public Alert archive(String id, AlertArchiveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s/archive", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Alert.class);
  }
  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(String id, AlertDeactivateParams params) throws StripeException {
    return deactivate(id, params, (RequestOptions) null);
  }
  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(String id, RequestOptions options) throws StripeException {
    return deactivate(id, (AlertDeactivateParams) null, options);
  }
  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(String id) throws StripeException {
    return deactivate(id, (AlertDeactivateParams) null, (RequestOptions) null);
  }
  /** Deactivates this alert, preventing it from triggering. */
  public Alert deactivate(String id, AlertDeactivateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/alerts/%s/deactivate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Alert.class);
  }
}
