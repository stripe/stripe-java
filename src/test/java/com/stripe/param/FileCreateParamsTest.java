package com.stripe.param;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import org.junit.jupiter.api.Test;

class FileCreateParamsTest {

  @Test
  public void testToMapWithFileObject() {
    java.io.File file = new File(getClass().getResource("/test.png").getFile());
    FileCreateParams fileCreateParams =
        FileCreateParams.builder()
            .setFile(file)
            .setPurpose(FileCreateParams.Purpose.BUSINESS_ICON)
            .build();

    Map<String, Object> untypedParams = fileCreateParams.toMap();
    // file object is not deserialized/transformed into something other than
    // the value set in builder
    assertSame(file, untypedParams.get("file"));
    assertEquals(FileCreateParams.Purpose.BUSINESS_ICON.getValue(), untypedParams.get("purpose"));
  }

  @Test
  public void testToMapWithFileInputStream() throws FileNotFoundException {
    java.io.FileInputStream fileInputStream =
        new FileInputStream(getClass().getResource("/test.png").getFile());
    FileCreateParams fileCreateParams =
        FileCreateParams.builder()
            .setFile(fileInputStream)
            .setPurpose(FileCreateParams.Purpose.BUSINESS_ICON)
            .build();

    Map<String, Object> untypedParams = fileCreateParams.toMap();
    // file object is not deserialized/transformed into something other than
    // the value set in builder
    assertSame(fileInputStream, untypedParams.get("file"));
    assertEquals(FileCreateParams.Purpose.BUSINESS_ICON.getValue(), untypedParams.get("purpose"));
  }
}
