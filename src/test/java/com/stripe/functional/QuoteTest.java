package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItemCollection;
import com.stripe.model.Quote;
import com.stripe.model.QuoteCollection;
import com.stripe.net.ApiResource;
import com.stripe.util.StreamUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class QuoteTest extends BaseStripeTest {
  public static final String QUOTE_ID = "qt_123";

  private Quote getQuoteFixture() throws StripeException {
    final Quote quote = Quote.retrieve(QUOTE_ID);
    resetNetworkSpy();
    return quote;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");

    final Quote quote = Quote.create(params);

    assertNotNull(quote);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/quotes"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Quote quote = Quote.retrieve(QUOTE_ID);

    assertNotNull(quote);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/quotes/%s", QUOTE_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Quote quote = getQuoteFixture();

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Quote updatedQuote = quote.update(params);

    assertNotNull(updatedQuote);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/quotes/%s", quote.getId()), params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    QuoteCollection quotes = Quote.list(params);

    assertNotNull(quotes);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/quotes"));
  }

  @Test
  public void testListLineItems() throws StripeException {

    final Quote quote = getQuoteFixture();
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);
    LineItemCollection lineItems = quote.listLineItems(params);

    assertNotNull(lineItems);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/quotes/%s/line_items", QUOTE_ID));
  }

  @Test
  public void testListComputedUpfrontLineItems() throws StripeException {

    final Quote quote = getQuoteFixture();
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);
    LineItemCollection lineItems = quote.listComputedUpfrontLineItems(params);

    assertNotNull(lineItems);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/quotes/%s/computed_upfront_line_items", QUOTE_ID));
  }

  @Test
  public void testFinalizeQuote() throws StripeException {
    final Quote quote = getQuoteFixture();

    final Quote finalizedQuote = quote.finalizeQuote();

    assertNotNull(finalizedQuote);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/quotes/%s/finalize", quote.getId()));
  }

  @Test
  public void testAccept() throws StripeException {
    final Quote quote = getQuoteFixture();

    final Quote acceptedQuote = quote.accept();

    assertNotNull(acceptedQuote);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/quotes/%s/accept", quote.getId()));
  }

  @Test
  public void testCancel() throws StripeException {
    final Quote quote = getQuoteFixture();

    final Quote canceledQuote = quote.cancel();

    assertNotNull(canceledQuote);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/quotes/%s/cancel", quote.getId()));
  }

  @Test
  public void testPdf() throws StripeException, java.io.IOException {
    final Quote quote = getQuoteFixture();

    final InputStream stream = quote.pdf();
    final String body = StreamUtils.readToEnd(stream, ApiResource.CHARSET);
    assertNotNull(stream);
    assertEquals(body, "Stripe binary response");
  }
}
