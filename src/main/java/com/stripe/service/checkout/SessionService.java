package com.stripe.service.checkout;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.checkout.Session;
import com.stripe.model.LineItem;
import com.stripe.model.LineItemCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeClient;
import com.stripe.param.checkout.SessionRetrieveParams;
import com.stripe.param.checkout.SessionListLineItemsParams;
import com.stripe.service.Service;
import com.stripe.util.StringUtils;

public class SessionService extends Service<Session> {
  public SessionService(StripeClient client) {
    super(client);
  }

  /** Retrieves a Session object. */
  public Session retrieve(String session) throws StripeException {
    return this.retrieve(session, null, null);
  }

  /** Retrieves a Session object. */
  public Session retrieve(String session, SessionRetrieveParams params) throws StripeException {
    return this.retrieve(session, params, null);
  }

  /** Retrieves a Session object. */
  public Session retrieve(String session, SessionRetrieveParams params, RequestOptions options) throws StripeException {

    return this.request(Session.class, ApiResource.RequestMethod.GET,
        String.format("/v1/checkout/sessions/%s", StringUtils.urlEncode(session)), params, options);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(String session, SessionListLineItemsParams params) throws StripeException {
    return listLineItems(session, params, (RequestOptions) null);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(String session, SessionListLineItemsParams params, RequestOptions options)
      throws StripeException {
    return this.request(LineItemCollection.class, ApiResource.RequestMethod.GET,
        String.format("/v1/checkout/sessions/%s/line_items", StringUtils.urlEncode(session)), params, options);
  }

  // Other session methods...

}
