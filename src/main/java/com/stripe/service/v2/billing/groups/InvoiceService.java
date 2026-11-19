// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.groups;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.billing.GroupInvoice;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;

public final class InvoiceService extends ApiService {
  public InvoiceService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Create an empty invoice using the billing group's settings. */
  public GroupInvoice create(String id) throws StripeException {
    return create(id, (RequestOptions) null);
  }
  /** Create an empty invoice using the billing group's settings. */
  public GroupInvoice create(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/groups/%s/invoices", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, GroupInvoice.class);
  }
}
