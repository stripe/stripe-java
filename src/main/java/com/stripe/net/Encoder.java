package com.stripe.net;

import java.io.IOException;
import java.util.Collection;

/**
 * An interface for encoding HTTP content and query strings.
 * This interface defines methods for encoding HTTP content and query strings for use in HTTP requests.
 * Implementations of this interface provide the functionality to encode data in various formats, such as
 * form-urlencoded or multipart/form-data.
 */
public interface Encoder {
  /**
   * Encodes a collection of key-value pairs into a query string.
   *
   * @param nameValueCollection The collection of key-value pairs to encode.
   * @return The encoded query string.
   * @throws IOException If an I/O error occurs during encoding.
   */
  String encodeQueryString(Collection<KeyValuePair<String, String>> nameValueCollection) throws IOException;
  /**
   * Encodes a collection of key-value pairs as form URL-encoded content.
   *
   * @param nameValueCollection The collection of KeyValuePair objects to be encoded.
   * @return An HttpContent object containing the form URL-encoded content.
   * @throws IOException If an IO exception occurs during the encoding process.
   */
  HttpContent encodeFormURLEncodedContent(Collection<KeyValuePair<String, String>> nameValueCollection) throws IOException;
  /**
   * Encodes a collection of key-value pairs as multipart/form-data content.
   *
   * @param nameValueCollection The collection of KeyValuePair objects to be encoded.
   * @param boundary The boundary string to be used for separating parts in the encoded data.
   * @return An HttpContent object containing the multipart/form-data encoded content.
   * @throws IOException If an I/O error occurs during encoding or processing the data.
   */
  HttpContent encodeMultipartFormDataContent(Collection<KeyValuePair<String, Object>> nameValueCollection, String boundary) throws IOException;
}

