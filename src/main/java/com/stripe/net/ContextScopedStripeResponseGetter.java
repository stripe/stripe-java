package com.stripe.net;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeActiveObject;
import com.stripe.model.StripeObject;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Applies a default context and suppresses inherited account scoping without replacing the
 * underlying requestor. Explicit request options retain their usual precedence.
 *
 * <p>For internal SDK use.
 */
public final class ContextScopedStripeResponseGetter implements StripeResponseGetter {
  private final StripeResponseGetter delegate;
  private final String stripeContext;

  private ContextScopedStripeResponseGetter(StripeResponseGetter delegate, String stripeContext) {
    this.delegate = delegate;
    this.stripeContext = stripeContext;
  }

  /**
   * Creates a getter with replacement context/account defaults, retaining the original requestor.
   */
  public static ContextScopedStripeResponseGetter withStripeContext(
      StripeResponseGetter delegate, String stripeContext) {
    if (delegate instanceof ContextScopedStripeResponseGetter) {
      delegate = ((ContextScopedStripeResponseGetter) delegate).delegate;
    }
    return new ContextScopedStripeResponseGetter(delegate, stripeContext);
  }

  /** Returns the scoped default context, including null when the context is cleared. */
  public String getStripeContext() {
    return stripeContext;
  }

  private <T extends RequestOptions.RequestOptionsBuilder> T scope(T builder) {
    if (builder.getStripeContext() == null) {
      // An empty context explicitly clears the delegate's default context during merging.
      builder.setStripeContext(stripeContext == null ? "" : stripeContext);
    }
    builder.stripeAccountSuppressed = true;
    return builder;
  }

  private RequestOptions scope(RequestOptions options) {
    return scope(options == null ? RequestOptions.builder() : options.toBuilderFullCopy()).build();
  }

  private RawRequestOptions scope(RawRequestOptions options) {
    return scope(options == null ? RawRequestOptions.builder() : options.toBuilderFullCopy())
        .build();
  }

  private <T extends StripeObject> T retainScope(T resource) {
    if (resource instanceof StripeActiveObject) {
      ((StripeActiveObject) resource).setResponseGetter(this);
    }
    return resource;
  }

  @Override
  @SuppressWarnings("TypeParameterUnusedInFormals")
  public <T extends StripeObject> T request(ApiRequest request, Type typeToken)
      throws StripeException {
    return retainScope(
        delegate.request(request.withOptions(scope(request.getOptions())), typeToken));
  }

  @Override
  public InputStream requestStream(ApiRequest request) throws StripeException {
    return delegate.requestStream(request.withOptions(scope(request.getOptions())));
  }

  @Override
  public StripeResponse rawRequest(RawApiRequest request) throws StripeException {
    return delegate.rawRequest(request.withOptions(scope(request.getOptions())));
  }

  @Override
  @SuppressWarnings({"TypeParameterUnusedInFormals", "deprecation"})
  public <T extends StripeObject> T request(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      Type typeToken,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    return retainScope(
        delegate.request(baseAddress, method, path, params, typeToken, scope(options), apiMode));
  }

  @Override
  @SuppressWarnings("deprecation")
  public InputStream requestStream(
      BaseAddress baseAddress,
      ApiResource.RequestMethod method,
      String path,
      Map<String, Object> params,
      RequestOptions options,
      ApiMode apiMode)
      throws StripeException {
    return delegate.requestStream(baseAddress, method, path, params, scope(options), apiMode);
  }

  @Override
  public void validateRequestOptions(RequestOptions options) {
    delegate.validateRequestOptions(scope(options));
  }
}
