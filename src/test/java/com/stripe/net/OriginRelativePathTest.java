package com.stripe.net;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Customer;
import com.stripe.model.checkout.Session;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
    // Dots are fine anywhere other than a whole "." or ".." segment.
    "/v1/reporting/report_types/balance.summary.1",
    "/v1/customers/...",
    "/v1/customers/.cus_123",
    "/v1/customers/cus_123..",
    "/v1/customers?email=a..b%40example.com",
    // A double-encoded dot reaches the API as the literal "%2E".
    "/v1/customers/%252E",
  };

  private static final String[] DOT_SEGMENT_PATHS = {
    // A client, proxy, or server that removes these segments would send each
    // request to a different endpoint than the one the path was built for.
    "/v1/checkout/sessions/.",
    "/v1/checkout/sessions/..",
    "/v1/customers/../payment_methods/pm_123",
    "/v1/customers/./payment_methods/pm_123",
    "/v1/customers/cus_123/sources/..?expand[]=customer",
    "/v2/core/accounts/.",
    // Some of them decode "%2E" to "." before removing dot segments.
    "/v1/checkout/sessions/%2E",
    "/v1/checkout/sessions/%2e%2E",
    "/v1/checkout/sessions/.%2E",
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

  @Test
  public void testRejectsDotSegmentPaths() {
    for (String path : DOT_SEGMENT_PATHS) {
      InvalidRequestException e =
          assertThrows(
              InvalidRequestException.class,
              () -> LiveStripeResponseGetter.validatePath(path),
              "expected to reject: " + path);
      assertEquals(
          "Request path may not contain a \".\" or \"..\" segment, got: " + path, e.getMessage());
    }
  }

  @Test
  public void testRequestRejectsDotSegmentPathsWithoutSendingRequest() {
    for (String path : DOT_SEGMENT_PATHS) {
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, null);
      assertThrows(
          InvalidRequestException.class,
          () -> networkSpy.request(request, Customer.class),
          "expected to reject: " + path);
    }

    Mockito.verifyNoInteractions(httpClientSpy);
  }

  @Test
  public void testRawRequestRejectsDotSegmentPathsWithoutSendingRequest() {
    for (String path : DOT_SEGMENT_PATHS) {
      assertThrows(
          InvalidRequestException.class,
          () -> mockClient.rawRequest(ApiResource.RequestMethod.GET, path, null),
          "expected to reject: " + path);
    }

    Mockito.verifyNoInteractions(httpClientSpy);
  }

  @Test
  public void testServiceRetrieveRejectsDotIdWithoutSendingRequest() {
    for (String id : new String[] {".", ".."}) {
      assertThrows(
          InvalidRequestException.class, () -> mockClient.v1().checkout().sessions().retrieve(id));
    }

    Mockito.verifyNoInteractions(httpClientSpy);
  }

  @Test
  public void testNestedServiceRetrieveRejectsDotParentIdWithoutSendingRequest() {
    assertThrows(
        InvalidRequestException.class,
        () -> mockClient.v1().customers().paymentMethods().retrieve("..", "pm_123"));

    Mockito.verifyNoInteractions(httpClientSpy);
  }

  @Test
  public void testLegacyRetrieveRejectsDotIdWithoutSendingRequest() {
    for (String id : new String[] {".", ".."}) {
      assertThrows(InvalidRequestException.class, () -> Session.retrieve(id));
    }

    Mockito.verifyNoInteractions(httpClientSpy);
  }
}
