package com.stripe.net;

import java.io.IOException;
import java.util.Collection;

public interface Encoder {
  String encodeQueryString(Collection<KeyValuePair<String, String>> nameValueCollection) throws IOException;
  HttpContent encodeFormURLEncodedContent(Collection<KeyValuePair<String, String>> nameValueCollection) throws IOException;
  HttpContent encodeMultipartFormDataContent(Collection<KeyValuePair<String, Object>> nameValueCollection, String boundary) throws IOException;
}

