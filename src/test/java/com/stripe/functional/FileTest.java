package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.FileCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileListParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

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
        null);
  }

  @Test
  public void testCreateWithFileWithTypedParams() throws StripeException {
    File fileObject = new File(getClass().getResource("/test.png").getFile());
    FileCreateParams fileCreateParams =
        FileCreateParams.builder()
            .setPurpose(FileCreateParams.Purpose.DISPUTE_EVIDENCE)
            .setFileLinkData(
                FileCreateParams.FileLinkData.builder().setCreate(true).setExpiresAt(123L).build())
            .setFile(fileObject)
            .build();

    final com.stripe.model.File file = com.stripe.model.File.create(fileCreateParams);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        ImmutableMap.of(
            "purpose",
            "dispute_evidence",
            "file",
            fileObject,
            "file_link_data",
            ImmutableMap.of("create", true, "expires_at", 123)),
        ApiResource.RequestType.MULTIPART,
        null);
  }

  @Test
  public void testThrowExceptionCreateWithNullTypedParams() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              com.stripe.model.File.create((FileCreateParams) null, RequestOptions.getDefault());
            });
    assertTrue(exception.getMessage().contains("Found null params"));
  }

  @Test
  public void testCreateWithStream() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("purpose", "dispute_evidence");
    FileInputStream value = new FileInputStream(getClass().getResource("/test.png").getFile());
    params.put("file", value);

    final com.stripe.model.File file = com.stripe.model.File.create(params);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        params,
        ApiResource.RequestType.MULTIPART,
        null);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final com.stripe.model.File file = com.stripe.model.File.retrieve(FILE_ID);

    assertNotNull(file);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/files/%s", FILE_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final FileCollection files = com.stripe.model.File.list(params);

    assertNotNull(files);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/files", params);
  }

  @Test
  public void testListWithTypedParams() throws StripeException {
    FileListParams params = FileListParams.builder().setLimit(1L).build();

    final FileCollection files = com.stripe.model.File.list(params);

    assertNotNull(files);
    verifyRequest(ApiResource.RequestMethod.GET, "/v1/files", ImmutableMap.of("limit", 1));
  }
}
