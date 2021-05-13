package com.stripe.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileCreateParams.Purpose;
import com.stripe.param.FileListParams;
import org.junit.jupiter.api.Test;

public class FileServiceTest extends BaseServiceTest {
  @Test
  public void testCreate() throws StripeException {
    FileCreateParams params =
        FileCreateParams.builder()
            .setPurpose(Purpose.BUSINESS_ICON)
            .setFile(new java.io.File(getClass().getResource("/test.png").getFile()))
            .build();
    File file = this.client.files().create(params);
    assertNotNull(file);
    this.verifyRequest(ApiResource.RequestMethod.POST, "/v1/files");
    // TODO assert files.stripe.com
  }

  @Test
  public void testList() throws StripeException {
    FileListParams params = FileListParams.builder().setLimit(1L).build();
    StripeCollection<File> files = this.client.files().list(params);
    assertNotNull(files);
    assertNotNull(files.getData());
    assertEquals(1, files.getData().size());
    File file = files.getData().get(0);
    assertNotNull(file);
    assertEquals("file", file.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/files");
    // TODO assert files.stripe.com
  }

  @Test
  public void testRetrieve() throws StripeException {
    File file = this.client.files().retrieve("file_123");
    assertNotNull(file);
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/files/file_123");
    // TODO assert files.stripe.com
  }
}
