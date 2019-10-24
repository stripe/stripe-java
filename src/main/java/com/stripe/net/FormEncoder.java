package com.stripe.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

final class FormEncoder {
  /**
   * Creates the HTTP query string for a given map of parameters.
   *
   * @param params The map of parameters.
   * @return The query string.
   */
  public static String createQueryString(Map<String, Object> params) {
    if (params == null) {
      return "";
    }

    Collection<KeyValuePair<String, String>> flatParams =
        flattenParamsValue(params, null).stream()
            .filter(kvp -> kvp.getValue() instanceof String)
            .map(kvp -> new KeyValuePair<String, String>(kvp.getKey(), (String) kvp.getValue()))
            .collect(Collectors.toList());
    return createQueryString(flatParams);
  }

  /**
   * Encode multipart params as a counter-part method to {@link this#createQueryString(Map)} for
   * encoding params for non-multipart requests.
   *
   * @param multipartProcessor multi-part processor handling encoding of input stream and basic
   *     key-value forms.
   * @param params parameter map that can contain file or input stream.
   */
  public static void encodeMultipartParams(
      MultipartProcessor multipartProcessor, Map<String, Object> params) throws IOException {
    Collection<KeyValuePair<String, Object>> flatParams = flattenParamsValue(params, null);

    for (KeyValuePair<String, Object> entry : flatParams) {
      String key = entry.getKey();
      Object value = entry.getValue();

      if (value instanceof File) {
        File file = (File) value;
        multipartProcessor.addFileField(key, file.getName(), new FileInputStream(file));
      } else if (value instanceof InputStream) {
        multipartProcessor.addFileField(key, "blob", (InputStream) value);
      } else {
        multipartProcessor.addFormField(key, (String) value);
      }
    }
  }

  /**
   * Creates the HTTP query string for a collection of name/value tuples.
   *
   * @param params The collection of name/value tuples.
   * @return The query string.
   */
  private static String createQueryString(
      Collection<KeyValuePair<String, String>> nameValueCollection) {
    if (nameValueCollection == null) {
      return "";
    }

    return String.join(
        "&",
        nameValueCollection.stream()
            .map(kvp -> String.format("%s=%s", urlEncode(kvp.getKey()), urlEncode(kvp.getValue())))
            .collect(Collectors.toList()));
  }

  /**
   * URL-encodes a string.
   *
   * @param value The string to URL-encode.
   * @return The URL-encoded string.
   */
  private static String urlEncode(String value) {
    if (value == null) {
      return null;
    }

    try {
      // Don't use strict form encoding by changing the square bracket control
      // characters back to their literals. This is fine by the server, and
      // makes these parameter strings easier to read.
      return URLEncoder.encode(value, StandardCharsets.UTF_8.name())
          .replaceAll("%5B", "[")
          .replaceAll("%5D", "]");
    } catch (UnsupportedEncodingException e) {
      // This can literally never happen, and lets us avoid having to catch
      // UnsupportedEncodingException in callers.
      throw new AssertionError("UTF-8 is unknown");
    }
  }

  /**
   * Returns a list of parameters for a given value. The value can be basically anything, as long as
   * it can be encoded in some way.
   *
   * @param value The value for which to create the list of parameters.
   * @param keyPrefix The key under which new keys should be nested, if any.
   * @return The list of parameters.
   */
  private static List<KeyValuePair<String, Object>> flattenParamsValue(
      Object value, String keyPrefix) {
    List<KeyValuePair<String, Object>> flatParams = null;

    // I wish Java had pattern matching :(

    if (value == null) {
      flatParams = singleParam(keyPrefix, "");

    } else if (value instanceof Map<?, ?>) {
      flatParams = flattenParamsMap((Map<?, ?>) value, keyPrefix);

    } else if (value instanceof String) {
      flatParams = singleParam(keyPrefix, value);

    } else if (value instanceof File) {
      flatParams = singleParam(keyPrefix, value);

    } else if (value instanceof InputStream) {
      flatParams = singleParam(keyPrefix, value);

    } else if (value instanceof Collection<?>) {
      flatParams = flattenParamsCollection((Collection<?>) value, keyPrefix);

    } else if (value.getClass().isArray()) {
      Object[] array = getArrayForObject(value);
      Collection<?> collection = Arrays.stream(array).collect(Collectors.toList());
      flatParams = flattenParamsCollection(collection, keyPrefix);

    } else if (value instanceof Date) {
      flatParams = singleParam(keyPrefix, String.format("%d", ((Date) value).getTime() / 1000L));

    } else if (value.getClass().isEnum()) {
      flatParams = singleParam(keyPrefix, ApiResource.GSON.toJson(value).replaceAll("\"", ""));

    } else {
      flatParams = singleParam(keyPrefix, value.toString());
    }

    return flatParams;
  }

  /**
   * Returns a list of parameters for a given map. If a key prefix is provided, the keys for the new
   * parameters will be nested under the key prefix. E.g. if the key prefix `foo` is passed and the
   * map contains a key `bar`, then a parameter with key `foo[bar]` will be returned.
   *
   * @param map The map for which to create the list of parameters.
   * @param keyPrefix The key under which new keys should be nested, if any.
   * @return The list of parameters.
   */
  private static List<KeyValuePair<String, Object>> flattenParamsMap(
      Map<?, ?> map, String keyPrefix) {
    List<KeyValuePair<String, Object>> flatParams = new ArrayList<KeyValuePair<String, Object>>();
    if (map == null) {
      return flatParams;
    }

    for (Map.Entry<?, ?> entry : map.entrySet()) {
      String key = entry.getKey().toString();
      Object value = entry.getValue();

      String newPrefix = newPrefix(key, keyPrefix);

      flatParams.addAll(flattenParamsValue(value, newPrefix));
    }

    return flatParams;
  }

  /**
   * Returns a list of parameters for a given collection of objects. The parameter keys will be
   * indexed under the `keyPrefix` parameter. E.g. if the `keyPrefix` is `foo`, then the key for the
   * first element's will be `foo[0]`, etc.
   *
   * @param collection The collection for which to create the list of parameters.
   * @param keyPrefix The key under which new keys should be nested.
   * @return The list of parameters.
   */
  private static List<KeyValuePair<String, Object>> flattenParamsCollection(
      Collection<?> collection, String keyPrefix) {
    List<KeyValuePair<String, Object>> flatParams = new ArrayList<KeyValuePair<String, Object>>();
    if (collection == null) {
      return flatParams;
    }

    int index = 0;
    for (Object value : collection) {
      String newPrefix = String.format("%s[%d]", keyPrefix, index);
      flatParams.addAll(flattenParamsValue(value, newPrefix));
      index += 1;
    }

    /* Because application/x-www-form-urlencoded cannot represent an empty list, convention
     * is to take the list parameter and just set it to an empty string. (E.g. A regular
     * list might look like `a[0]=1&b[1]=2`. Emptying it would look like `a=`.) */
    if (flatParams.isEmpty()) {
      flatParams.add(new KeyValuePair<String, Object>(keyPrefix, ""));
    }

    return flatParams;
  }

  /**
   * Creates a list containing a single parameter.
   *
   * @param key The parameter's key.
   * @param value The parameter's value.
   * @return A list containg the single parameter.
   */
  private static List<KeyValuePair<String, Object>> singleParam(String key, Object value) {
    List<KeyValuePair<String, Object>> flatParams = new ArrayList<KeyValuePair<String, Object>>();
    flatParams.add(new KeyValuePair<String, Object>(key, value));
    return flatParams;
  }

  /**
   * Computes the new key prefix, given a key and an existing prefix (if any). E.g. if the key is
   * `bar` and the existing prefix is `foo`, then `foo[bar]` is returned.
   *
   * <p>If a key already contains nested values, then only the non-nested part is nested under the
   * prefix, e.g. if the key is `bar[baz]` and the prefix is `foo`, then `foo[bar][baz]` is
   * returned.
   *
   * <p>If no prefix is provided, the key is returned unchanged.
   *
   * @param key The key.
   * @param keyPrefix The existing key prefix, if any.
   * @return The new key prefix.
   */
  private static String newPrefix(String key, String keyPrefix) {
    if (keyPrefix == null || keyPrefix.isEmpty()) {
      return key;
    }

    int i = key.indexOf("[");
    if (i == -1) {
      return String.format("%s[%s]", keyPrefix, key);
    } else {
      return String.format("%s[%s][%s]", keyPrefix, key.substring(0, i), key.substring(i));
    }
  }

  /**
   * Accepts an object (that must be an array) and returns an `Object[]`. If the array already holds
   * reference types, it is simply cast to `Object[]`. If the array holds primitive types, a new
   * array is created with elements copied and boxed to the appropriate wrapper class. E.g. an
   * `int[]` array will be returned as an `Integer[]` array.
   *
   * @param array The original array, as an Object.
   * @return The Object[] array.
   */
  private static Object[] getArrayForObject(Object array) {
    if (!array.getClass().isArray()) {
      throw new IllegalArgumentException("parameter is not an array");
    }

    // If element type is not a primitive, simply cast the object and return
    if (!array.getClass().getComponentType().isPrimitive()) {
      return (Object[]) array;
    }

    // Otherwise, initialize a new array of Object and copy elements one by one. Primitive
    // elements will be autoboxed.
    int length = Array.getLength(array);
    Object[] newArray = new Object[length];

    for (int index = 0; index < length; index++) {
      newArray[index] = Array.get(array, index);
    }

    return newArray;
  }

  private static class KeyValuePair<K, V> extends AbstractMap.SimpleEntry<K, V> {
    private static final long serialVersionUID = 1L;

    public KeyValuePair(K key, V value) {
      super(key, value);
    }
  }
}
