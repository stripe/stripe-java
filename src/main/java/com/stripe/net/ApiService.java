package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
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

  /**
   * V2 search uses POST but sends limit in the URL query rather than the JSON body. Add it only to
   * the initial URL; page URLs already contain their pagination parameters. Delegate to the
   * ordinary request path exactly once.
   */
  @SuppressWarnings("TypeParameterUnusedInFormals")
  protected <T extends StripeObject> T requestV2Search(ApiRequest request, Type typeToken)
      throws StripeException {
    String path = request.getPath();
    Map<String, Object> params = request.getParams();
    if (params != null) {
      params = new HashMap<>(params);
      if (params.containsKey("limit")) {
        Object limit = params.remove("limit");
        if (!path.contains("?")) {
          path += "?limit=" + ApiResource.urlEncode(String.valueOf(limit));
        }
      }
    }
    ApiRequest prepared =
        new ApiRequest(
            request.getBaseAddress(), request.getMethod(), path, params, request.getOptions());
    if (request.getUsage() != null) {
      for (String usage : request.getUsage()) {
        prepared = prepared.addUsage(usage);
      }
    }
    return this.request(prepared, typeToken);
  }

  protected InputStream requestStream(ApiRequest request) throws StripeException {
    return this.getResponseGetter().requestStream(request.addUsage("stripe_client"));
  }
}
