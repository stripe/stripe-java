package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.model.EphemeralKeyDeserializer;
import com.stripe.model.EventData;
import com.stripe.model.EventDataDeserializer;
import com.stripe.model.EventRequest;
import com.stripe.model.EventRequestDeserializer;
import com.stripe.model.ExpandableField;
import com.stripe.model.ExpandableFieldDeserializer;
import com.stripe.model.HasId;
import com.stripe.model.StripeCollectionInterface;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.StripeRawJsonObjectDeserializer;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;

public abstract class ApiResource extends StripeObject {
  public static final String CHARSET = StandardCharsets.UTF_8.name();

  private static StripeResponseGetter stripeResponseGetter = new LiveStripeResponseGetter();

  public static final Gson GSON = createGson();

  public static void setStripeResponseGetter(StripeResponseGetter srg) {
    ApiResource.stripeResponseGetter = srg;
  }

  private static Gson createGson() {
    GsonBuilder builder =
        new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeAdapter(EphemeralKey.class, new EphemeralKeyDeserializer())
            .registerTypeAdapter(EventData.class, new EventDataDeserializer())
            .registerTypeAdapter(EventRequest.class, new EventRequestDeserializer())
            .registerTypeAdapter(ExpandableField.class, new ExpandableFieldDeserializer())
            .registerTypeAdapter(StripeRawJsonObject.class, new StripeRawJsonObjectDeserializer());

    for (TypeAdapterFactory factory : ApiResourceTypeAdapterFactoryProvider.getAll()) {
      builder.registerTypeAdapterFactory(factory);
    }
    return builder.create();
  }

  private static String className(Class<?> clazz) {
    // Convert CamelCase to snake_case
    String className =
        clazz
            .getSimpleName()
            .replaceAll("(.)([A-Z][a-z]+)", "$1_$2")
            .replaceAll("([a-z0-9])([A-Z])", "$1_$2")
            .toLowerCase();

    // Handle namespaced resources by checking if the class is in a sub-package, and if so prepend
    // it to the class name
    String[] parts = clazz.getPackage().getName().split("\\.", -1);
    assert parts.length == 3 || parts.length == 4;
    if (parts.length == 4) {
      // The first three parts are always "com.stripe.model", the fourth part is the sub-package
      className = parts[3] + "/" + className;
    }

    // Handle special cases
    switch (className) {
      case "invoice_item":
        return "invoiceitem";
      case "file_upload":
        return "file";
      default:
        return className;
    }
  }

  protected static String singleClassUrl(Class<?> clazz) {
    return singleClassUrl(clazz, Stripe.getApiBase());
  }

  protected static String singleClassUrl(Class<?> clazz, String apiBase) {
    return String.format("%s/v1/%s", apiBase, className(clazz));
  }

  protected static String classUrl(Class<?> clazz) {
    return classUrl(clazz, Stripe.getApiBase());
  }

  protected static String classUrl(Class<?> clazz, String apiBase) {
    return String.format("%ss", singleClassUrl(clazz, apiBase));
  }

  protected static String instanceUrl(Class<?> clazz, String id) throws InvalidRequestException {
    return instanceUrl(clazz, id, Stripe.getApiBase());
  }

  protected static String instanceUrl(Class<?> clazz, String id, String apiBase)
      throws InvalidRequestException {
    return String.format("%s/%s", classUrl(clazz, apiBase), urlEncode(id));
  }

  protected static String subresourceUrl(Class<?> clazz, String id, Class<?> subClazz)
      throws InvalidRequestException {
    return subresourceUrl(clazz, id, subClazz, Stripe.getApiBase());
  }

  private static String subresourceUrl(Class<?> clazz, String id, Class<?> subClazz, String apiBase)
      throws InvalidRequestException {
    return String.format("%s/%s/%ss", classUrl(clazz, apiBase), urlEncode(id), className(subClazz));
  }

  public enum RequestMethod {
    GET,
    POST,
    DELETE
  }

  public enum RequestType {
    NORMAL,
    MULTIPART
  }

  /** URL-encodes a string. */
  public static String urlEncode(String str) {
    // Preserve original behavior that passing null for an object id will lead
    // to us actually making a request to /v1/foo/null
    if (str == null) {
      return null;
    }

    try {
      // Don't use strict form encoding by changing the square bracket control
      // characters back to their literals. This is fine by the server, and
      // makes these parameter strings easier to read.
      return URLEncoder.encode(str, CHARSET).replaceAll("%5B", "[").replaceAll("%5D", "]");
    } catch (UnsupportedEncodingException e) {
      // This can literally never happen, and lets us avoid having to catch
      // UnsupportedEncodingException in callers.
      throw new AssertionError("UTF-8 is unknown");
    }
  }

  /** URL-encode a string ID in url path formatting. */
  public static String urlEncodeId(String id) throws InvalidRequestException {
    if (id == null) {
      throw new InvalidRequestException(
          "Invalid null ID found for url path formatting. This can be because your string ID "
              + "argument to the API method is null, or the ID field in your stripe object "
              + "instance is null. Please contact support@stripe.com on the latter case. ",
          null,
          null,
          null,
          0,
          null);
    }

    return urlEncode(id);
  }

  public static <T> T multipartRequest(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      RequestOptions options)
      throws StripeException {
    return ApiResource.stripeResponseGetter.request(
        method, url, params, clazz, ApiResource.RequestType.MULTIPART, options);
  }

  public static <T> T request(
      ApiResource.RequestMethod method,
      String url,
      ApiRequestParams params,
      Class<T> clazz,
      RequestOptions options)
      throws StripeException {
    checkNullTypedParams(url, params);
    return request(method, url, params.toMap(), clazz, options);
  }

  public static <T> T request(
      ApiResource.RequestMethod method,
      String url,
      Map<String, Object> params,
      Class<T> clazz,
      RequestOptions options)
      throws StripeException {
    return ApiResource.stripeResponseGetter.request(
        method, url, params, clazz, ApiResource.RequestType.NORMAL, options);
  }

  public static <T extends StripeCollectionInterface<?>> T requestCollection(
      String url, ApiRequestParams params, Class<T> clazz, RequestOptions options)
      throws StripeException {
    checkNullTypedParams(url, params);
    return requestCollection(url, params.toMap(), clazz, options);
  }

  /**
   * Similar to #request, but specific for use with collection types that come from the API (i.e.
   * lists of resources).
   *
   * <p>Collections need a little extra work because we need to plumb request options and params
   * through so that we can iterate to the next page if necessary.
   */
  public static <T extends StripeCollectionInterface<?>> T requestCollection(
      String url, Map<String, Object> params, Class<T> clazz, RequestOptions options)
      throws StripeException {
    T collection = request(RequestMethod.GET, url, params, clazz, options);

    if (collection != null) {
      collection.setRequestOptions(options);
      collection.setRequestParams(params);
    }

    return collection;
  }

  /**
   * Invalidate null typed parameters.
   *
   * @param url request url associated with the given parameters.
   * @param params typed parameters to check for null value.
   */
  public static void checkNullTypedParams(String url, ApiRequestParams params) {
    if (params == null) {
      throw new IllegalArgumentException(
          String.format(
              "Found null params for %s. "
                  + "Please pass empty params using param builder via `builder().build()` instead.",
              url));
    }
  }

  /**
   * When setting a String ID for an ExpandableField, we need to be careful about keeping the String
   * ID and the expanded object in sync. If they specify a new String ID that is different from the
   * ID within the expanded object, we don't keep the object.
   */
  public static <T extends HasId> ExpandableField<T> setExpandableFieldId(
      String newId, ExpandableField<T> currentObject) {
    if (currentObject == null
        || (currentObject.isExpanded() && !Objects.equals(currentObject.getId(), newId))) {
      return new ExpandableField<>(newId, null);
    }

    return new ExpandableField<>(newId, currentObject.getExpanded());
  }
}
