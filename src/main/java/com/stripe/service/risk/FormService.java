// File generated from our OpenAPI spec
package com.stripe.service.risk;

import com.stripe.exception.StripeException;
import com.stripe.model.risk.Form;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.risk.FormRetrieveParams;
import com.stripe.param.risk.FormUpdateParams;

public final class FormService extends ApiService {
  public FormService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public Form retrieve(String id, FormRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public Form retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FormRetrieveParams) null, options);
  }
  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public Form retrieve(String id) throws StripeException {
    return retrieve(id, (FormRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public Form retrieve(String id, FormRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/risk/forms/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Form.class);
  }
  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(String id, FormUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(String id, RequestOptions options) throws StripeException {
    return update(id, (FormUpdateParams) null, options);
  }
  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(String id) throws StripeException {
    return update(id, (FormUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h4>Error Codes</h4>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(String id, FormUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/risk/forms/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Form.class);
  }
}
