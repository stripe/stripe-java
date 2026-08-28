package com.stripe.net;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import org.junit.jupiter.api.Test;

/**
 * The absolute request URL is built by concatenating a base URL onto a relative path, and no base
 * URL ends in a slash. A path that does not begin with a single "/" can therefore land inside the
 * URL's authority component and redirect the request -- Authorization header included -- to a host
 * of the path's choosing.
 *
 * <p>This matters because some request paths originate in remote data: a webhook body's {@code
 * related_object.url}, a collection's {@code url}, a response's {@code next_page_url}.
 */
public class OriginRelativePathTest extends BaseStripeTest {

  private static final String[] ORIGIN_RELATIVE_PATHS = {
    "/v1/customers/cus_123",
    "/v1/customers",
    "/v2/core/accounts?page=page_123&limit=2",
    // '@' is legal inside a path or query string -- it only opens an authority
    // when it precedes the first '/'.
    "/v1/customers?email=user%40example.com",
    "/v1/invoices/in_123@456",
    // A backslash does not open an authority: the '/' already closed it.
    "/v1/\\evil.example",
  };

  private static final String[] HOSTILE_PATHS = {
    // Concatenated onto a base URL with no trailing slash, each of these moves
    // the request's authority off api.stripe.com.
    "@evil.example/v1/leak",
    ":pw@evil.example/v1/leak",
    ":80@evil.example/v1/leak",
    // Extends the host into an attacker-owned subdomain
    // (api.stripe.com.evil.example), which has a valid certificate.
    ".evil.example/v1/leak",
    "-evil.example/v1/leak",
    "https://evil.example/v1/leak",
    "//evil.example/v1/leak",
    "",
    "v1/customers",
    null,
  };

  @Test
  public void testAcceptsOriginRelativePaths() {
    for (String path : ORIGIN_RELATIVE_PATHS) {
      assertDoesNotThrow(
          () -> LiveStripeResponseGetter.validatePath(path), "expected to accept: " + path);
    }
  }

  @Test
  public void testRejectsHostilePaths() {
    for (String path : HOSTILE_PATHS) {
      assertThrows(
          IllegalArgumentException.class,
          () -> LiveStripeResponseGetter.validatePath(path),
          "expected to reject: " + path);
    }
  }

  @Test
  public void testRejectionMessageNamesThePath() {
    IllegalArgumentException e =
        assertThrows(
            IllegalArgumentException.class,
            () -> LiveStripeResponseGetter.validatePath("@evil.example/v1/leak"));
    assertTrue(e.getMessage().contains("@evil.example/v1/leak"));
  }
}
