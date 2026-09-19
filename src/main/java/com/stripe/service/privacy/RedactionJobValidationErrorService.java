// File generated from our OpenAPI spec
package com.stripe.service.privacy;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.privacy.RedactionJobValidationError;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.privacy.RedactionJobValidationErrorListParams;

public final class RedactionJobValidationErrorService extends ApiService {
  public RedactionJobValidationErrorService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of validation errors for the specified redaction job. */
  public StripeCollection<RedactionJobValidationError> list(
      String id, RedactionJobValidationErrorListParams params) throws StripeException {
    return list(id, params, (RequestOptions) null);
  }
  /** Returns a list of validation errors for the specified redaction job. */
  public StripeCollection<RedactionJobValidationError> list(String id, RequestOptions options)
      throws StripeException {
    return list(id, (RedactionJobValidationErrorListParams) null, options);
  }
  /** Returns a list of validation errors for the specified redaction job. */
  public StripeCollection<RedactionJobValidationError> list(String id) throws StripeException {
    return list(id, (RedactionJobValidationErrorListParams) null, (RequestOptions) null);
  }
  /** Returns a list of validation errors for the specified redaction job. */
  public StripeCollection<RedactionJobValidationError> list(
      String id, RedactionJobValidationErrorListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/privacy/redaction_jobs/%s/validation_errors", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<RedactionJobValidationError>>() {}.getType());
  }
}
