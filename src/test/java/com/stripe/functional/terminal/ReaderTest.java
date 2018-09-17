package com.stripe.functional.terminal;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.terminal.Reader;
import com.stripe.model.terminal.ReaderCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ReaderTest extends BaseStripeTest {
  public static final String READER_ID = "rdr_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("registration_code", "rabbit-analyzed-pig");
    params.put("label", "device");

    final Reader reader = Reader.create(params);

    assertNotNull(reader);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/terminal/readers"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Reader reader = Reader.retrieve(READER_ID);

    assertNotNull(reader);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/terminal/readers/%s", READER_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Reader reader = Reader.retrieve(READER_ID);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("label", "new_label");

    final Reader updatedReader = reader.update(params);

    assertNotNull(updatedReader);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/terminal/readers/%s", reader.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    ReaderCollection resources = Reader.list(params);

    assertNotNull(resources);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/terminal/readers"),
        params
    );
  }
}
