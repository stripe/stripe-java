// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.PersonalizationDesign;
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
  public PersonalizationDesign activate(String id, PersonalizationDesignActivateParams params)
      throws StripeException {
    return activate(id, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * active}.
   */
  public PersonalizationDesign activate(String id, RequestOptions options) throws StripeException {
    return activate(id, (PersonalizationDesignActivateParams) null, options);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * active}.
   */
  public PersonalizationDesign activate(String id) throws StripeException {
    return activate(id, (PersonalizationDesignActivateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * active}.
   */
  public PersonalizationDesign activate(
      String id, PersonalizationDesignActivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/personalization_designs/%s/activate",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PersonalizationDesign.class);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(String id, PersonalizationDesignDeactivateParams params)
      throws StripeException {
    return deactivate(id, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(String id, RequestOptions options)
      throws StripeException {
    return deactivate(id, (PersonalizationDesignDeactivateParams) null, options);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(String id) throws StripeException {
    return deactivate(id, (PersonalizationDesignDeactivateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * inactive}.
   */
  public PersonalizationDesign deactivate(
      String id, PersonalizationDesignDeactivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/personalization_designs/%s/deactivate",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PersonalizationDesign.class);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * rejected}.
   */
  public PersonalizationDesign reject(String id, PersonalizationDesignRejectParams params)
      throws StripeException {
    return reject(id, params, (RequestOptions) null);
  }
  /**
   * Updates the {@code status} of the specified testmode personalization design object to {@code
   * rejected}.
   */
  public PersonalizationDesign reject(
      String id, PersonalizationDesignRejectParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/personalization_designs/%s/reject",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PersonalizationDesign.class);
  }
}
