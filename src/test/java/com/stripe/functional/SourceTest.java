package com.stripe.functional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.Source;
import com.stripe.model.SourceTransactionCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SourceTest extends BaseStripeTest {
  public static final String SOURCE_ID = "src_123";

  private Source getSourceFixture() throws StripeException {
    final Source source = Source.retrieve(SOURCE_ID);
    resetNetworkSpy();
    return source;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> owner = new HashMap<String, Object>();
    owner.put("email", "jenny.rosen@example.com");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("type", "ach_credit_transfer");
    params.put("currency", "usd");
    params.put("owner", owner);

    final Source source = Source.create(params);

    assertNotNull(source);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/sources",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Source source = Source.retrieve(SOURCE_ID);

    assertNotNull(source);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/sources/%s", SOURCE_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Source source = getSourceFixture();

    final Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Source updatedSource = source.update(params);

    assertNotNull(updatedSource);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/sources/%s", source.getId()),
        params
    );
  }

  @Test
  public void testVerify() throws StripeException {
    final Source source = getSourceFixture();

    final List<Integer> values = new ArrayList<Integer>();
    values.add(32);
    values.add(45);
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("values", values);

    final Source verifiedSource = source.verify(params);

    assertNotNull(verifiedSource);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/sources/%s/verify", source.getId()),
        params
    );
  }

  @Test
  public void testDetachAttachedSource() throws IOException, StripeException {
    final Source source = getSourceFixture();
    source.setCustomer("cus_123");

    // stripe-mock returns a bank_account instead of a source, which causes a deserialization
    // error. Stub the request for now.
    stubRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", source.getCustomer(), source.getId()),
        new HashMap<String, Object>(),
        Source.class,
        getResourceAsString("/api_fixtures/source_detached.json")
    );

    final Source detachedSource = source.detach();

    assertNotNull(detachedSource);
    assertNull(detachedSource.getCustomer());
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/customers/%s/sources/%s", source.getCustomer(), source.getId())
    );
  }

  @Test(expected = InvalidRequestException.class)
  public void testDetachUnattachedSource() throws StripeException {
    final Source source = getSourceFixture();
    source.setCustomer(null);

    source.detach();
  }

  @Test
  public void testSourceTransactions() throws StripeException {
    final Source source = getSourceFixture();

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final SourceTransactionCollection transactions = source.sourceTransactions(params);

    assertNotNull(transactions);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/sources/%s/source_transactions", SOURCE_ID),
        params
    );
  }
}
