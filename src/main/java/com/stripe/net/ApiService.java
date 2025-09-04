package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
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

  @SuppressWarnings("TypeParameterUnusedInFormals")
  protected <T extends StripeObject> T request(ApiRequest request, Type typeToken)
      throws StripeException {
    return this.getResponseGetter().request(request.addUsage("stripe_client"), typeToken);
  }

  protected InputStream requestStream(ApiRequest request) throws StripeException {
    return this.getResponseGetter().requestStream(request.addUsage("stripe_client"));
  }
}
