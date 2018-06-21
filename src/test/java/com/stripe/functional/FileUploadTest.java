package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.FileUpload;
import com.stripe.model.FileUploadCollection;
import com.stripe.net.ApiResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FileUploadTest extends BaseStripeTest {
  public static final String FILE_UPLOAD_ID = "file_123";

  @Test
  public void testCreate() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("purpose", "dispute_evidence");
    params.put("file", new File(getClass().getResource("/test.png").getFile()));

    final FileUpload fileUpload = FileUpload.create(params);

    assertNotNull(fileUpload);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        params,
        ApiResource.RequestType.MULTIPART,
        null
    );
  }

  @Test
  public void testStreamCreate() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("purpose", "dispute_evidence");
    params.put("file", new FileInputStream(getClass().getResource("/test.png").getFile()));

    final FileUpload fileUpload = FileUpload.create(params);

    assertNotNull(fileUpload);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        params,
        ApiResource.RequestType.MULTIPART,
        null
    );
  }

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final FileUpload fileUpload = FileUpload.retrieve(FILE_UPLOAD_ID);

    assertNotNull(fileUpload);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/files/%s", FILE_UPLOAD_ID)
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final FileUploadCollection fileUploads = FileUpload.list(params);

    assertNotNull(fileUploads);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/files",
        params
    );
  }
}
