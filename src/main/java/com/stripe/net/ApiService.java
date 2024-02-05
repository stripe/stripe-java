package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObjectInterface;
import java.io.InputStream;
import java.lang.reflect.Type;
import lombok.AccessLevel;
import lombok.Getter;

/** The base class for all services. */
public abstract class ApiService {
  @Getter(AccessLevel.PROTECTED)
  private final StripeResponseGetter responseGetter;

  protected ApiService(StripeResponseGetter responseGetter) {
    this.responseGetter = responseGetter;
  }

  protected <T extends StripeObjectInterface> T request(ApiRequest request, Type typeToken)
      throws StripeException {
    request.addUsage("stripe_client");
    return this.getResponseGetter().request(request, typeToken);
  }

  protected InputStream requestStream(ApiRequest request) throws StripeException {
    request.addUsage("stripe_client");
    return this.getResponseGetter().requestStream(request);
  }
}
