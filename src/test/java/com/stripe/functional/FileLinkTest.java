package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.FileLink;
import com.stripe.model.FileLinkCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class FileLinkTest extends BaseStripeTest {
  public static final String FILE_LINK_ID = "link_123";

  private FileLink getFileLinkFixture() throws StripeException {
    final FileLink fileLink = FileLink.retrieve(FILE_LINK_ID);
    resetNetworkSpy();
    return fileLink;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("file", "file_123");

    final FileLink fileLink = FileLink.create(params);

    assertNotNull(fileLink);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/file_links"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final FileLink fileLink = FileLink.retrieve(FILE_LINK_ID);

    assertNotNull(fileLink);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/file_links/%s", FILE_LINK_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final FileLink fileLink = getFileLinkFixture();

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final FileLink updatedFileLink = fileLink.update(params);

    assertNotNull(updatedFileLink);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/file_links/%s", fileLink.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("file", "file_123");
    params.put("limit", 1);

    final FileLinkCollection fileLinks = FileLink.list(params);

    assertNotNull(fileLinks);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/file_links"));
  }
}
