// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.Group;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.GroupCreateParams;
import com.stripe.param.v2.billing.GroupListParams;
import com.stripe.param.v2.billing.GroupRetrieveParams;
import com.stripe.param.v2.billing.GroupUpdateParams;

public final class GroupService extends ApiService {
  public GroupService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List Billing Groups. */
  public StripeCollection<Group> list(GroupListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List Billing Groups. */
  public StripeCollection<Group> list(RequestOptions options) throws StripeException {
    return list((GroupListParams) null, options);
  }
  /** List Billing Groups. */
  public StripeCollection<Group> list() throws StripeException {
    return list((GroupListParams) null, (RequestOptions) null);
  }
  /** List Billing Groups. */
  public StripeCollection<Group> list(GroupListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/groups";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Group>>() {}.getType());
  }
  /** Create a BillingGroup. */
  public Group create(GroupCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a BillingGroup. */
  public Group create(GroupCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/groups";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Group.class);
  }
  /** Retrieve a BillingGroup. */
  public Group retrieve(String id, GroupRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a BillingGroup. */
  public Group retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (GroupRetrieveParams) null, options);
  }
  /** Retrieve a BillingGroup. */
  public Group retrieve(String id) throws StripeException {
    return retrieve(id, (GroupRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a BillingGroup. */
  public Group retrieve(String id, GroupRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/groups/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Group.class);
  }
  /** Update a BillingGroup. */
  public Group update(String id, GroupUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a BillingGroup. */
  public Group update(String id, RequestOptions options) throws StripeException {
    return update(id, (GroupUpdateParams) null, options);
  }
  /** Update a BillingGroup. */
  public Group update(String id) throws StripeException {
    return update(id, (GroupUpdateParams) null, (RequestOptions) null);
  }
  /** Update a BillingGroup. */
  public Group update(String id, GroupUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/groups/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Group.class);
  }
  /** Cancel a BillingGroup. */
  public Group cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancel a BillingGroup. */
  public Group cancel(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/groups/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, Group.class);
  }

  public com.stripe.service.v2.billing.groups.InvoiceService invoices() {
    return new com.stripe.service.v2.billing.groups.InvoiceService(this.getResponseGetter());
  }

  public com.stripe.service.v2.billing.groups.SpendModifierRuleService spendModifierRules() {
    return new com.stripe.service.v2.billing.groups.SpendModifierRuleService(
        this.getResponseGetter());
  }
}
