package com.stripe.net;

import com.stripe.util.StreamUtils;
import java.io.IOException;
import java.io.InputStream;

public class StripeResponseStream extends AbstractStripeResponse<InputStream> {
  /**
   * Initializes a new instance of the {@link StripeResponseStream} class.
   *
   * @param code the HTTP status code of the response
   * @param headers the HTTP headers of the response
   * @param body streaming body response
   * @throws NullPointerException if {@code headers} or {@code body} is {@code null}
   */
  public StripeResponseStream(int code, HttpHeaders headers, InputStream body) {
    super(code, headers, body);
  }

  /**
   * Buffers the entire response body into a string, constructing the appropriate StripeResponse
   *
   * @return the StripeResponse
   */
  StripeResponse unstream() throws IOException {
    final String bodyString = StreamUtils.readToEnd(this.body, ApiResource.CHARSET);
    this.body.close();
    return new StripeResponse(this.code, this.headers, bodyString);
  }
}
