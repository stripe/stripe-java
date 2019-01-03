package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.FileCollection;
import com.stripe.net.ApiResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FileTest extends BaseStripeTest {
  public static final String FILE_ID = "file_123";

  @Test
  public void testCreateWithFile() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("purpose", "dispute_evidence");
    params.put("file", new File(getClass().getResource("/test.png").getFile()));

    final com.stripe.model.File file = com.stripe.model.File.create(params);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        params,
        ApiResource.RequestType.MULTIPART,
        null
    );
  }

  @Test
  public void testCreateWithStream() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("purpose", "dispute_evidence");
    params.put("file", new FileInputStream(getClass().getResource("/test.png").getFile()));

    final com.stripe.model.File file = com.stripe.model.File.create(params);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        params,
        ApiResource.RequestType.MULTIPART,
        null
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final com.stripe.model.File file = com.stripe.model.File.retrieve(FILE_ID);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/files/%s", FILE_ID)
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final FileCollection files = com.stripe.model.File.list(params);

    assertNotNull(files);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/files",
        params
    );
  }
}
