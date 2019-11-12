package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HttpContentTest extends BaseStripeTest {
  @Test
  public void TestBuildFormURLEncodedContentNull() throws IOException {
    Throwable exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              HttpContent.buildFormURLEncodedContent(null);
            });
    assertTrue(exception.getMessage().contains("nameValueCollection may not be null"));
  }

  @Test
  public void TestBuildFormURLEncodedContentEmptySourceSuccess() throws IOException {
    HttpContent content =
        HttpContent.buildFormURLEncodedContent(new ArrayList<KeyValuePair<String, String>>());
    assertEquals(0, content.byteArrayContent().length);
  }

  @Test
  public void TestBuildFormURLEncodedContentEmptySourceCorrectContentType() throws IOException {
    HttpContent content =
        HttpContent.buildFormURLEncodedContent(new ArrayList<KeyValuePair<String, String>>());
    assertEquals("application/x-www-form-urlencoded;charset=UTF-8", content.contentType());
  }

  @Test
  public void TestBuildFormURLEncodedContentOneEntrySeparatedByEquals() throws IOException {
    List<KeyValuePair<String, String>> data = new ArrayList<KeyValuePair<String, String>>();
    data.add(new KeyValuePair<String, String>("key", "value"));

    HttpContent content = HttpContent.buildFormURLEncodedContent(data);
    assertEquals(9, content.byteArrayContent().length);
    assertEquals("key=value", new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildFormURLEncodedContentOneUnicodeEntryEncoded() throws IOException {
    List<KeyValuePair<String, String>> data = new ArrayList<KeyValuePair<String, String>>();
    data.add(new KeyValuePair<String, String>("key", "valueク"));

    HttpContent content = HttpContent.buildFormURLEncodedContent(data);
    assertEquals(18, content.byteArrayContent().length);
    assertEquals(
        "key=value%E3%82%AF", new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildFormURLEncodedContentTwoEntriesSeparatedByAnd() throws IOException {
    List<KeyValuePair<String, String>> data = new ArrayList<KeyValuePair<String, String>>();
    data.add(new KeyValuePair<String, String>("key1", "value1"));
    data.add(new KeyValuePair<String, String>("key2", "value2"));

    HttpContent content = HttpContent.buildFormURLEncodedContent(data);
    assertEquals(23, content.byteArrayContent().length);
    assertEquals(
        "key1=value1&key2=value2", new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildFormURLEncodedContentWithSpacesEncodedAsPlus() throws IOException {
    List<KeyValuePair<String, String>> data = new ArrayList<KeyValuePair<String, String>>();
    data.add(new KeyValuePair<String, String>("key 1", "val%20ue 1"));
    data.add(new KeyValuePair<String, String>("key 2", "val%ue 2"));

    HttpContent content = HttpContent.buildFormURLEncodedContent(data);
    assertEquals(35, content.byteArrayContent().length);
    assertEquals(
        "key+1=val%2520ue+1&key+2=val%25ue+2",
        new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildFormURLEncodedContentWithSquareBracketsUnencoded() throws IOException {
    List<KeyValuePair<String, String>> data = new ArrayList<KeyValuePair<String, String>>();
    data.add(new KeyValuePair<String, String>("key[subkey]", "[#value]"));

    HttpContent content = HttpContent.buildFormURLEncodedContent(data);
    assertEquals(22, content.byteArrayContent().length);
    assertEquals(
        "key[subkey]=[%23value]", new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildMultipartFormDataContentNull() throws IOException {
    Throwable exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              HttpContent.buildMultipartFormDataContent(null);
            });
    assertTrue(exception.getMessage().contains("nameValueCollection may not be null"));
  }

  @Test
  public void TestBuildMultipartFormDataContentNullEmptySourceCorrectContentType()
      throws IOException {
    HttpContent content =
        HttpContent.buildMultipartFormDataContent(
            new ArrayList<KeyValuePair<String, Object>>(), "test-boundary");
    assertEquals("multipart/form-data; boundary=test-boundary", content.contentType());
  }

  @Test
  public void TestBuildMultipartFormDataContentNullEmptySourceSuccess() throws IOException {
    List<KeyValuePair<String, Object>> data = new ArrayList<KeyValuePair<String, Object>>();

    HttpContent content = HttpContent.buildMultipartFormDataContent(data, "test-boundary");
    assertEquals(19, content.byteArrayContent().length);
    assertEquals(
        "--test-boundary--\r\n", new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildMultipartFormDataContentNullOneStringEntrySuccess() throws IOException {
    List<KeyValuePair<String, Object>> data = new ArrayList<KeyValuePair<String, Object>>();
    data.add(new KeyValuePair<String, Object>("key", "valueク"));

    HttpContent content = HttpContent.buildMultipartFormDataContent(data, "test-boundary");
    assertEquals(92, content.byteArrayContent().length);
    assertEquals(
        "--test-boundary\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\nvalueク\r\n"
            + "--test-boundary--\r\n",
        new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildMultipartFormDataContentNullOneStreamEntrySuccess() throws IOException {
    List<KeyValuePair<String, Object>> data = new ArrayList<KeyValuePair<String, Object>>();
    data.add(
        new KeyValuePair<String, Object>(
            "key", new ByteArrayInputStream("Hello World!".getBytes(StandardCharsets.UTF_8))));

    HttpContent content = HttpContent.buildMultipartFormDataContent(data, "test-boundary");
    assertEquals(168, content.byteArrayContent().length);
    assertEquals(
        "--test-boundary\r\nContent-Disposition: form-data; name=\"key\"; filename=\"blob\"\r\n"
            + "Content-Type: null\r\nContent-Transfer-Encoding: binary\r\n\r\nHello World!\r\n"
            + "--test-boundary--\r\n",
        new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void TestBuildMultipartFormDataContentNullTwoEntriesSuccess() throws IOException {
    List<KeyValuePair<String, Object>> data = new ArrayList<KeyValuePair<String, Object>>();
    data.add(
        new KeyValuePair<String, Object>(
            "key", new ByteArrayInputStream("Hello クWorld!".getBytes(StandardCharsets.UTF_8))));
    data.add(new KeyValuePair<String, Object>("key", "String!ク"));

    HttpContent content = HttpContent.buildMultipartFormDataContent(data, "test-boundary");
    assertEquals(246, content.byteArrayContent().length);
    assertEquals(
        "--test-boundary\r\nContent-Disposition: form-data; name=\"key\"; filename=\"blob\"\r\n"
            + "Content-Type: null\r\nContent-Transfer-Encoding: binary\r\n\r\nHello クWorld!\r\n"
            + "--test-boundary\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\nString!ク\r\n"
            + "--test-boundary--\r\n",
        new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }
}
