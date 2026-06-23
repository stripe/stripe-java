package com.stripe.net;

import static java.util.Objects.requireNonNull;

import com.stripe.util.CaseInsensitiveMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.EqualsAndHashCode;

/**
 * A read-only view of a set of HTTP headers.
 *
 * <p>This class mimics the {@code java.net.http.HttpHeaders} added in Java 11.
 */
@EqualsAndHashCode
public class HttpHeaders {
  private CaseInsensitiveMap<List<String>> headerMap;

  private HttpHeaders(CaseInsensitiveMap<List<String>> headerMap) {
    this.headerMap = headerMap;
  }

  /**
   * Returns an {@link HttpHeaders} instance initialized from the given map.
   *
   * @param headerMap the map containing the header names and values
   * @return an {@link HttpHeaders} instance containing the given headers
   * @throws NullPointerException if {@code headerMap} is {@code null}
   */
  public static HttpHeaders of(Map<String, List<String>> headerMap) {
    requireNonNull(headerMap);
    return new HttpHeaders(CaseInsensitiveMap.of(headerMap));
  }

  /**
   * Returns a new {@link HttpHeaders} instance containing the headers of the current instance plus
   * the provided header.
   *
   * @param name the name of the header to add
   * @param value the value of the header to add
   * @return the new {@link HttpHeaders} instance
   * @throws NullPointerException if {@code name} or {@code value} is {@code null}
   */
  public HttpHeaders withAdditionalHeader(String name, String value) {
    requireNonNull(name);
    requireNonNull(value);
    return this.withAdditionalHeader(name, Arrays.asList(value));
  }

  /**
   * Returns a new {@link HttpHeaders} instance containing the headers of the current instance plus
   * the provided header.
   *
   * @param name the name of the header to add
   * @param values the values of the header to add
   * @return the new {@link HttpHeaders} instance
   * @throws NullPointerException if {@code name} or {@code values} is {@code null}
   */
  public HttpHeaders withAdditionalHeader(String name, List<String> values) {
    requireNonNull(name);
    requireNonNull(values);
    Map<String, List<String>> headerMap = new HashMap<>();
    headerMap.put(name, values);
    return this.withAdditionalHeaders(headerMap);
  }

  /**
   * Returns a new {@link HttpHeaders} instance containing the headers of the current instance plus
   * the provided headers.
   *
   * @param headerMap the map containing the headers to add
   * @return the new {@link HttpHeaders} instance
   * @throws NullPointerException if {@code headerMap} is {@code null}
   */
  public HttpHeaders withAdditionalHeaders(Map<String, List<String>> headerMap) {
    requireNonNull(headerMap);
    Map<String, List<String>> newHeaderMap = new HashMap<>(this.map());
    newHeaderMap.putAll(headerMap);
    return HttpHeaders.of(newHeaderMap);
  }

  /**
   * Returns an unmodifiable List of all of the header string values of the given named header.
   * Always returns a List, which may be empty if the header is not present.
   *
   * @param name the header name
   * @return a List of headers string values
   */
  public List<String> allValues(String name) {
    if (this.headerMap.containsKey(name)) {
      List<String> values = this.headerMap.get(name);
      if ((values != null) && (values.size() > 0)) {
        return Collections.unmodifiableList(values);
      }
    }
    return Collections.emptyList();
  }

  /**
   * Returns an {@link Optional} containing the first header string value of the given named (and
   * possibly multi-valued) header. If the header is not present, then the returned {@code Optional}
   * is empty.
   *
   * @param name the header name
   * @return an {@code Optional<String>} containing the first named header string value, if present
   */
  public Optional<String> firstValue(String name) {
    if (this.headerMap.containsKey(name)) {
      List<String> values = this.headerMap.get(name);
      if ((values != null) && (values.size() > 0)) {
        return Optional.of(values.get(0));
      }
    }
    return Optional.empty();
  }

  /**
   * Returns an unmodifiable Map view of this HttpHeaders.
   *
   * @return the Map
   */
  public Map<String, List<String>> map() {
    return Collections.unmodifiableMap(this.headerMap);
  }

  /**
   * Returns this {@link HttpHeaders} as a string.
   *
   * @return a string describing the HTTP headers
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append(" { ");
    sb.append(map());
    sb.append(" }");
    return sb.toString();
  }
}
