package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.FileUpload;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class FileUploadTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/files/file_123");
    final FileUpload fileUpload = ApiResource.GSON.fromJson(data, FileUpload.class);
    assertNotNull(fileUpload);
    assertNotNull(fileUpload.getId());
  }
}
