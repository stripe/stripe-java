package com.stripe.net;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.util.Stopwatch;
import java.util.HashMap;
import java.util.Map;

/** Base abstract class for HTTP clients used to send requests to Stripe's API. */
public abstract class HttpClient {
  private static final RequestTelemetry requestTelemetry = new RequestTelemetry();

  /**
   * Sends the given request to Stripe's API.
   *
   * @param request the request
   * @return the response
   * @throws StripeException If the request fails for any reason
   */
  public abstract StripeResponse request(StripeRequest request) throws StripeException;

  /**
   * Sends the given request to Stripe's API, handling telemetry if not disabled.
   *
   * @param request the request
   * @return the response
   * @throws StripeException If the request fails for any reason
   */
  public StripeResponse requestWithTelemetry(StripeRequest request) throws StripeException {
    requestTelemetry.maybeAddTelemetryHeader(request.headers());

    Stopwatch stopwatch = Stopwatch.startNew();

    StripeResponse response = this.request(request);

    stopwatch.stop();

    requestTelemetry.maybeEnqueueMetrics(response, stopwatch.getElapsed());

    return response;
  }

  /**
   * Builds the value of the {@code User-Agent} header.
   *
   * @return a string containing the value of the {@code User-Agent} header
   */
  protected static String buildUserAgentString() {
    String userAgent = String.format("Stripe/v1 JavaBindings/%s", Stripe.VERSION);

    if (Stripe.getAppInfo() != null) {
      userAgent += " " + formatAppInfo(Stripe.getAppInfo());
    }

    return userAgent;
  }

  /**
   * Builds the value of the {@code X-Stripe-Client-User-Agent} header.
   *
   * @return a string containing the value of the {@code X-Stripe-Client-User-Agent} header
   */
  protected static String buildXStripeClientUserAgentString() {
    String[] propertyNames = {
      "os.name",
      "os.version",
      "os.arch",
      "java.version",
      "java.vendor",
      "java.vm.version",
      "java.vm.vendor"
    };

    Map<String, String> propertyMap = new HashMap<>();
    for (String propertyName : propertyNames) {
      propertyMap.put(propertyName, System.getProperty(propertyName));
    }
    propertyMap.put("bindings.version", Stripe.VERSION);
    propertyMap.put("lang", "Java");
    propertyMap.put("publisher", "Stripe");
    if (Stripe.getAppInfo() != null) {
      propertyMap.put("application", ApiResource.GSON.toJson(Stripe.getAppInfo()));
    }

    return ApiResource.GSON.toJson(propertyMap);
  }

  private static String formatAppInfo(Map<String, String> info) {
    String str = info.get("name");

    if (info.get("version") != null) {
      str += String.format("/%s", info.get("version"));
    }

    if (info.get("url") != null) {
      str += String.format(" (%s)", info.get("url"));
    }

    return str;
  }
}
