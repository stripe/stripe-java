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
   * updates. | | {@code invalid_field_for_form_type} | 400 | Submitted fields contain invalid
   * values. | | {@code form_field_already_submitted} | 400 | A submitted field has already been
   * submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for this
   * Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   *
   * <p>Validation errors include a summary in {@code message}. Missing required properties use
   * {@code form_insufficient_fields} and include {@code missing_fields}, an array of public dotted
   * paths. Missing required properties take precedence over value violations.
   *
   * <p>Invalid values use {@code invalid_field_for_form_type} and include {@code violations}. Each
   * violation has a public dotted {@code field} path and a {@code reason} of {@code missing_value}
   * or {@code invalid_value}. Reviewed-field violations include a corrective {@code message};
   * corrective messages for other Form types are omitted. For an array member, {@code target}
   * identifies the member’s field path. For a scalar value, {@code target} is explicitly null.
   *
   * <p>For example, a reviewed-fields submission with an out-of-date timestamp and an omitted
   * requested member returns both violations:
   *
   * <p>{@code json { "error": { "type": "invalid_request_error", "code":
   * "invalid_field_for_form_type", "message": "Submitted fields are invalid for Form type
   * reviewed_fields. See violations for details and corrective actions for these fields:
   * ’reviewed_fields.attestation.attested_at’, ’reviewed_fields.attestation.fields’.",
   * "violations": [ { "field": "reviewed_fields.attestation.attested_at", "reason":
   * "invalid_value", "message": "The attestation timestamp is out of date. Review and attest the
   * requested information again, then provide the new attestation timestamp.", "target": null }, {
   * "field": "reviewed_fields.attestation.fields", "reason": "missing_value", "message":
   * "’defaults.profile.product_description’ is required by subject.fields_to_review but is missing
   * from reviewed_fields.attestation.fields. Review this information, then include its path in the
   * attestation.", "target": "defaults.profile.product_description" } ] } } }
   *
   * <p>A v1 request with no extracted field submissions is rejected before the Form is loaded,
   * including for reviewed-fields Forms. This early error uses {@code form_insufficient_fields} and
   * omits {@code missing_fields}, {@code violations}, and {@code param}. Partially populated
   * reviewed-fields requests use structured missing-property validation.
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
   * updates. | | {@code invalid_field_for_form_type} | 400 | Submitted fields contain invalid
   * values. | | {@code form_field_already_submitted} | 400 | A submitted field has already been
   * submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for this
   * Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   *
   * <p>Validation errors include a summary in {@code message}. Missing required properties use
   * {@code form_insufficient_fields} and include {@code missing_fields}, an array of public dotted
   * paths. Missing required properties take precedence over value violations.
   *
   * <p>Invalid values use {@code invalid_field_for_form_type} and include {@code violations}. Each
   * violation has a public dotted {@code field} path and a {@code reason} of {@code missing_value}
   * or {@code invalid_value}. Reviewed-field violations include a corrective {@code message};
   * corrective messages for other Form types are omitted. For an array member, {@code target}
   * identifies the member’s field path. For a scalar value, {@code target} is explicitly null.
   *
   * <p>For example, a reviewed-fields submission with an out-of-date timestamp and an omitted
   * requested member returns both violations:
   *
   * <p>{@code json { "error": { "type": "invalid_request_error", "code":
   * "invalid_field_for_form_type", "message": "Submitted fields are invalid for Form type
   * reviewed_fields. See violations for details and corrective actions for these fields:
   * ’reviewed_fields.attestation.attested_at’, ’reviewed_fields.attestation.fields’.",
   * "violations": [ { "field": "reviewed_fields.attestation.attested_at", "reason":
   * "invalid_value", "message": "The attestation timestamp is out of date. Review and attest the
   * requested information again, then provide the new attestation timestamp.", "target": null }, {
   * "field": "reviewed_fields.attestation.fields", "reason": "missing_value", "message":
   * "’defaults.profile.product_description’ is required by subject.fields_to_review but is missing
   * from reviewed_fields.attestation.fields. Review this information, then include its path in the
   * attestation.", "target": "defaults.profile.product_description" } ] } } }
   *
   * <p>A v1 request with no extracted field submissions is rejected before the Form is loaded,
   * including for reviewed-fields Forms. This early error uses {@code form_insufficient_fields} and
   * omits {@code missing_fields}, {@code violations}, and {@code param}. Partially populated
   * reviewed-fields requests use structured missing-property validation.
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
   * updates. | | {@code invalid_field_for_form_type} | 400 | Submitted fields contain invalid
   * values. | | {@code form_field_already_submitted} | 400 | A submitted field has already been
   * submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for this
   * Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   *
   * <p>Validation errors include a summary in {@code message}. Missing required properties use
   * {@code form_insufficient_fields} and include {@code missing_fields}, an array of public dotted
   * paths. Missing required properties take precedence over value violations.
   *
   * <p>Invalid values use {@code invalid_field_for_form_type} and include {@code violations}. Each
   * violation has a public dotted {@code field} path and a {@code reason} of {@code missing_value}
   * or {@code invalid_value}. Reviewed-field violations include a corrective {@code message};
   * corrective messages for other Form types are omitted. For an array member, {@code target}
   * identifies the member’s field path. For a scalar value, {@code target} is explicitly null.
   *
   * <p>For example, a reviewed-fields submission with an out-of-date timestamp and an omitted
   * requested member returns both violations:
   *
   * <p>{@code json { "error": { "type": "invalid_request_error", "code":
   * "invalid_field_for_form_type", "message": "Submitted fields are invalid for Form type
   * reviewed_fields. See violations for details and corrective actions for these fields:
   * ’reviewed_fields.attestation.attested_at’, ’reviewed_fields.attestation.fields’.",
   * "violations": [ { "field": "reviewed_fields.attestation.attested_at", "reason":
   * "invalid_value", "message": "The attestation timestamp is out of date. Review and attest the
   * requested information again, then provide the new attestation timestamp.", "target": null }, {
   * "field": "reviewed_fields.attestation.fields", "reason": "missing_value", "message":
   * "’defaults.profile.product_description’ is required by subject.fields_to_review but is missing
   * from reviewed_fields.attestation.fields. Review this information, then include its path in the
   * attestation.", "target": "defaults.profile.product_description" } ] } } }
   *
   * <p>A v1 request with no extracted field submissions is rejected before the Form is loaded,
   * including for reviewed-fields Forms. This early error uses {@code form_insufficient_fields} and
   * omits {@code missing_fields}, {@code violations}, and {@code param}. Partially populated
   * reviewed-fields requests use structured missing-property validation.
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
   * updates. | | {@code invalid_field_for_form_type} | 400 | Submitted fields contain invalid
   * values. | | {@code form_field_already_submitted} | 400 | A submitted field has already been
   * submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for this
   * Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   *
   * <p>Validation errors include a summary in {@code message}. Missing required properties use
   * {@code form_insufficient_fields} and include {@code missing_fields}, an array of public dotted
   * paths. Missing required properties take precedence over value violations.
   *
   * <p>Invalid values use {@code invalid_field_for_form_type} and include {@code violations}. Each
   * violation has a public dotted {@code field} path and a {@code reason} of {@code missing_value}
   * or {@code invalid_value}. Reviewed-field violations include a corrective {@code message};
   * corrective messages for other Form types are omitted. For an array member, {@code target}
   * identifies the member’s field path. For a scalar value, {@code target} is explicitly null.
   *
   * <p>For example, a reviewed-fields submission with an out-of-date timestamp and an omitted
   * requested member returns both violations:
   *
   * <p>{@code json { "error": { "type": "invalid_request_error", "code":
   * "invalid_field_for_form_type", "message": "Submitted fields are invalid for Form type
   * reviewed_fields. See violations for details and corrective actions for these fields:
   * ’reviewed_fields.attestation.attested_at’, ’reviewed_fields.attestation.fields’.",
   * "violations": [ { "field": "reviewed_fields.attestation.attested_at", "reason":
   * "invalid_value", "message": "The attestation timestamp is out of date. Review and attest the
   * requested information again, then provide the new attestation timestamp.", "target": null }, {
   * "field": "reviewed_fields.attestation.fields", "reason": "missing_value", "message":
   * "’defaults.profile.product_description’ is required by subject.fields_to_review but is missing
   * from reviewed_fields.attestation.fields. Review this information, then include its path in the
   * attestation.", "target": "defaults.profile.product_description" } ] } } }
   *
   * <p>A v1 request with no extracted field submissions is rejected before the Form is loaded,
   * including for reviewed-fields Forms. This early error uses {@code form_insufficient_fields} and
   * omits {@code missing_fields}, {@code violations}, and {@code param}. Partially populated
   * reviewed-fields requests use structured missing-property validation.
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
