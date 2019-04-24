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

  /**
   * Make an api request with a valid url like that from {@code resourceUrl}. This method is more
   * general than its counterpart {@code requestCollection} to list collection classes.
   * This implementation uses the same underlying method as that in resource class like
   * {@code Charge.create(params, opts)}.
   * @param method  http method
   * @param url     valid url
   * @param params  nullable request params; null value will be converted to empty params
   * @param clazz   class to which JSON response is deserialized to
   * @param options request options
   * @return object of type clazz
   * @throws StripeException exceptions containing error code and information helpful for debugging
   *     and reporting to stripe support.
   */
  protected static <T> T request(ApiResource.RequestMethod method,
                              String url, ApiRequestParams params, Class<T> clazz,
                              RequestOptions options) throws StripeException {
    return ApiResource.request(method, url, nullSafeParams(params), clazz, options);
  }

  /**
   * Make an api request for collection classes with a valid url like that from {@code resourceUrl}.
   * This implementation uses the same underlying method as that in resource class when obtaining
   * object collection like {@code Charge.list(params)} to get {@code ChargeCollection}. Note
   * that http method cannot be specified; the underlying implementation defaults to GET.
   * @param url     a valid url
   * @param params  nullable request params; null value will be converted to empty params
   * @param clazz   stripe collection class to which JSON response is deserialized to
   * @param options request options
   * @return stripe collection object
   * @throws StripeException exceptions containing error code and information helpful for debugging
   *     and reporting to stripe support.
   */
  protected static <T extends StripeCollectionInterface<?>> T requestCollection(
      String url, ApiRequestParams params, Class<T> clazz, RequestOptions options)
      throws StripeException {
    return ApiResource.requestCollection(url, nullSafeParams(params), clazz, options);
  }

  private static ApiRequestParams nullSafeParams(ApiRequestParams params) {
    return Optional.ofNullable(params).orElse(new ApiServiceNullParams());
  }
}
