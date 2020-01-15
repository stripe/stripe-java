package com.stripe.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

public class StreamUtilsTest {
  @Test
  public void testReadToEnd() throws IOException {
    // Short string
    String string = "Hello world!";
    InputStream stream = new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8));
    assertEquals(string, StreamUtils.readToEnd(stream, StandardCharsets.UTF_8));

    // Long string
    string = CharBuffer.allocate(50000).toString().replace('\0', 'A');
    stream = new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8));
    assertEquals(string, StreamUtils.readToEnd(stream, StandardCharsets.UTF_8));
  }
}
