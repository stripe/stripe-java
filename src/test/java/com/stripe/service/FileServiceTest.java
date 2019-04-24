package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.FileCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileListParams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileServiceTest extends BaseStripeTest {
  public static final String FILE_ID = "file_123";

  private FileService service = new FileService();

  @Test
  public void testCreateWithFile() throws StripeException {
    File fileObject = new File(getClass().getResource("/test.png").getFile());
    FileCreateParams fileCreateParams = FileCreateParams.builder()
        .setPurpose(FileCreateParams.Purpose.DISPUTE_EVIDENCE)
        .setFileLinkData(FileCreateParams.FileLinkData.builder()
            .setCreate(true)
            .setExpiresAt(123L)
            .build())
        .setFile(fileObject)
        .build();

    final com.stripe.model.File file = service.create(fileCreateParams);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        ImmutableMap.of(
            "purpose", "dispute_evidence",
            "file", fileObject,
            "file_link_data", ImmutableMap.of(
                "create", true,
                "expires_at", 123
            )
        ),
        ApiResource.RequestType.MULTIPART,
        null
    );
  }

  @Test
  public void testCreateWithInputStream() throws IOException, StripeException {
    FileInputStream inputStream = new FileInputStream(getClass()
        .getResource("/test.png").getFile());

    FileCreateParams fileCreateParams = FileCreateParams.builder()
        .setPurpose(FileCreateParams.Purpose.DISPUTE_EVIDENCE)
        .setFile(inputStream)
        .build();

    final com.stripe.model.File file = service.create(fileCreateParams);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/files",
        ImmutableMap.of(
            "purpose", "dispute_evidence",
            "file", inputStream
        ),
        ApiResource.RequestType.MULTIPART,
        null
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final com.stripe.model.File file = service.retrieve(FILE_ID, null);

    assertNotNull(file);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/files/%s", FILE_ID)
    );
  }

  @Test
  public void testList() throws StripeException {
    final FileCollection files = service.list(FileListParams.builder().setLimit(1L).build());

    assertNotNull(files);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/files",
        ImmutableMap.of("limit", 1L)
    );
  }
}