package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Optional;

/**
 * Super class to services that make API calls. The service sub-class takes in
 * {@link ApiRequestParams} and returns {@link ApiResource} or
 * {@link com.stripe.model.StripeCollection} similarly to the methods on the
 * resource itself.
 */
public abstract class ApiService {
  /**
   * Helper class to handle input null params, so users can still conveniently pass null instead of
   * invoking an empty builder.
   */
  private static class ApiServiceNullParams extends ApiRequestParams {
  }

  /**
   * Build a resource url given the url format (containing `%s`) and url variables.
   * The url variables will be UTF-8 encoded.
   * @param urlFormat     standard string format to be used with {@link String#format}
   * @param urlVariables  un-encoded url variables as arguments to the url format.
   * @return url for the resource
   */
  protected String resourceUrl(String urlFormat, String... urlVariables)
      throws InvalidRequestException {
    List<String> urlVariableList = new ArrayList<>();
    for (String variable : Arrays.asList(urlVariables)) {
      urlVariableList.add(ApiResource.urlEncodeId(variable));
    }

    String format;
    try {
      format = String.format(urlFormat, urlVariableList.toArray());
    } catch (MissingFormatArgumentException ex) {
      throw new InvalidRequestException(String.format(
          "Unable to create url with pattern `%s` with url variables `%s`. "
              + "This is likely a problem with this current library version `%s`. "
              + "Please contact support@stripe.com for assistance.",
          urlFormat, urlVariableList, Stripe.VERSION),
          null, null, null, 0, ex);
    }

    return String.format("%s%s", Stripe.getApiBase(), format);
  }

  protected static <T> T request(ApiResource.RequestMethod method,
                              String url, ApiRequestParams params, Class<T> clazz,
                              RequestOptions options) throws StripeException {
    return ApiResource.request(method, url, nullSafeParams(params), clazz, options);
  }

  protected static <T extends StripeCollectionInterface<?>> T requestCollection(
      String url, ApiRequestParams params, Class<T> clazz, RequestOptions options)
      throws StripeException {
    return ApiResource.requestCollection(url, nullSafeParams(params), clazz, options);
  }

  private static ApiRequestParams nullSafeParams(ApiRequestParams params) {
    return Optional.ofNullable(params).orElse(new ApiServiceNullParams());
  }
}
