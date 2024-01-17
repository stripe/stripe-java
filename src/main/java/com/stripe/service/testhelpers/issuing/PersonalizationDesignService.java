// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.PersonalizationDesign;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.PersonalizationDesignActivateParams;
import com.stripe.param.issuing.PersonalizationDesignDeactivateParams;
import com.stripe.param.issuing.PersonalizationDesignRejectParams;

public final class PersonalizationDesignService extends ApiService {
  public PersonalizationDesignService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * active}.
   */
  public PersonalizationDesign activate(
      String personalizationDesign, PersonalizationDesignActivateParams params)
      throws StripeException {
    return activate(personalizationDesign, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * active}.
   */
  public PersonalizationDesign activate(String personalizationDesign, RequestOptions options)
      throws StripeException {
    return activate(personalizationDesign, (PersonalizationDesignActivateParams) null, options);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * active}.
   */
  public PersonalizationDesign activate(String personalizationDesign) throws StripeException {
    return activate(
        personalizationDesign, (PersonalizationDesignActivateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * active}.
   */
  public PersonalizationDesign activate(
      String personalizationDesign,
      PersonalizationDesignActivateParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/personalization_designs/%s/activate",
            ApiResource.urlEncodeId(personalizationDesign));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(
      String personalizationDesign, PersonalizationDesignDeactivateParams params)
      throws StripeException {
    return deactivate(personalizationDesign, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(String personalizationDesign, RequestOptions options)
      throws StripeException {
    return deactivate(personalizationDesign, (PersonalizationDesignDeactivateParams) null, options);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(String personalizationDesign) throws StripeException {
    return deactivate(
        personalizationDesign, (PersonalizationDesignDeactivateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(
      String personalizationDesign,
      PersonalizationDesignDeactivateParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/personalization_designs/%s/deactivate",
            ApiResource.urlEncodeId(personalizationDesign));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * rejected}.
   */
  public PersonalizationDesign reject(
      String personalizationDesign, PersonalizationDesignRejectParams params)
      throws StripeException {
    return reject(personalizationDesign, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * rejected}.
   */
  public PersonalizationDesign reject(
      String personalizationDesign,
      PersonalizationDesignRejectParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/personalization_designs/%s/reject",
            ApiResource.urlEncodeId(personalizationDesign));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, PersonalizationDesign.class);
  }
}
