package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapterFactory;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public abstract class ApiResource extends StripeObject implements StripeActiveObject {
  public static final Charset CHARSET = StandardCharsets.UTF_8;
  private static StripeResponseGetter globalResponseGetter = new LiveStripeResponseGetter();
  private transient StripeResponseGetter responseGetter;

  public static final Gson GSON = createGson();

  public static void setStripeResponseGetter(StripeResponseGetter srg) {
    ApiResource.globalResponseGetter = srg;
  }

  protected static StripeResponseGetter getGlobalResponseGetter() {
    return ApiResource.globalResponseGetter;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter srg) {
    responseGetter = srg;
  }

  protected StripeResponseGetter getResponseGetter() {
    return this.responseGetter;
  }

  private static Gson createGson() {
    GsonBuilder builder =
        new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeAdapter(EphemeralKey.class, new EphemeralKeyDeserializer())
            .registerTypeAdapter(Event.Data.class, new EventDataDeserializer())
            .registerTypeAdapter(Event.Request.class, new EventRequestDeserializer())
            .registerTypeAdapter(ExpandableField.class, new ExpandableFieldDeserializer())
            .registerTypeAdapter(StripeRawJsonObject.class, new StripeRawJsonObjectDeserializer())
            .addReflectionAccessFilter(
                new ReflectionAccessFilter() {
                  @Override
                  public ReflectionAccessFilter.FilterResult check(Class<?> rawClass) {
                    if (rawClass.getTypeName().startsWith("com.stripe.")) {
                      return ReflectionAccessFilter.FilterResult.ALLOW;
                    }
                    return ReflectionAccessFilter.FilterResult.BLOCK_ALL;
                  }
                });

    for (TypeAdapterFactory factory : ApiResourceTypeAdapterFactoryProvider.getAll()) {
      builder.registerTypeAdapterFactory(factory);
    }
    return builder.create();
  }

  public enum RequestMethod {
    GET,
    POST,
    DELETE
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
      return URLEncoder.encode(str, CHARSET.name()).replaceAll("%5B", "[").replaceAll("%5D", "]");
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
