package com.stripe.net;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.annotations.SerializedName;
import com.stripe.BaseStripeTest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import lombok.Data;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

public class FormEncoderTest extends BaseStripeTest {
  enum TestEnum {
    @SerializedName("foo")
    FOO,

    @SerializedName("bar")
    BAR,
  }

  @Test
  public void testCreateHttpContentNull() throws IOException {
    HttpContent content = FormEncoder.createHttpContent(null);

    assertNotNull(content);
    assertEquals("application/x-www-form-urlencoded;charset=UTF-8", content.contentType());
    assertEquals(0, content.byteArrayContent().length);
  }

  @Test
  public void testCreateHttpContentNoStream() throws IOException {
    final List<Object> nested = new ArrayList<>();
    nested.add(1);
    nested.add(2);
    nested.add(3);

    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("list", nested);
    params.put("string", "String!");

    HttpContent content = FormEncoder.createHttpContent(params);

    assertNotNull(content);
    assertEquals("application/x-www-form-urlencoded;charset=UTF-8", content.contentType());
    assertEquals(46, content.byteArrayContent().length);
    assertEquals(
        "list[0]=1&list[1]=2&list[2]=3&string=String%21",
        new String(content.byteArrayContent(), StandardCharsets.UTF_8));
  }

  @Test
  public void testCreateHttpContentStream() throws IOException {
    final List<Object> nested = new ArrayList<>();
    nested.add(1);
    nested.add(2);
    nested.add(3);

    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("list", nested);
    params.put("stream", new ByteArrayInputStream("Hello world!".getBytes(StandardCharsets.UTF_8)));
    params.put("string", "String!");

    HttpContent content = FormEncoder.createHttpContent(params);

    assertNotNull(content);
    assertThat(content.contentType(), CoreMatchers.startsWith("multipart/form-data"));
    assertEquals(594, content.byteArrayContent().length);

    // The boundary will be a random GUID, so we just check for substrings.
    // HttpContentTest has more exhaustive tests with a non-random boundary.
    String result = new String(content.byteArrayContent(), StandardCharsets.UTF_8);
    assertThat(
        result,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"list[0]\"\r\n\r\n1\r\n"));
    assertThat(
        result,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"list[1]\"\r\n\r\n2\r\n"));
    assertThat(
        result,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"list[2]\"\r\n\r\n3\r\n"));
    assertThat(
        result,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"list[0]\"\r\n\r\n1\r\n"));
    assertThat(
        result,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"list[0]\"\r\n\r\n1\r\n"));
    assertThat(
        result,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"stream\"; filename=\"blob\"\r\nContent-Type: null\r\nContent-Transfer-Encoding: binary\r\n\r\nHello world!"));
    assertThat(
        result,
        CoreMatchers.containsString(
            "Content-Disposition: form-data; name=\"string\"\r\n\r\nString!\r\n"));
  }

  @Test
  @SuppressWarnings("cast")
  public void testCreateQueryString() {
    @Data
    class TestCase {
      private final Map<String, Object> data;
      private final String want;
    }

    List<TestCase> testCases =
        new ArrayList<TestCase>() {
          private static final long serialVersionUID = 1L;

          {
            // No data
            add(new TestCase(Collections.emptyMap(), ""));

            // --- Primitive types ---

            // byte
            add(new TestCase(Collections.singletonMap("byte", (byte) 0), "byte=0"));
            add(new TestCase(Collections.singletonMap("byte", (byte) 42), "byte=42"));
            add(new TestCase(Collections.singletonMap("byte", Byte.MIN_VALUE), "byte=-128"));
            add(new TestCase(Collections.singletonMap("byte", Byte.MAX_VALUE), "byte=127"));

            // short
            add(new TestCase(Collections.singletonMap("short", (short) 0), "short=0"));
            add(new TestCase(Collections.singletonMap("short", (short) 42), "short=42"));
            add(new TestCase(Collections.singletonMap("short", Short.MIN_VALUE), "short=-32768"));
            add(new TestCase(Collections.singletonMap("short", Short.MAX_VALUE), "short=32767"));

            // int
            add(new TestCase(Collections.singletonMap("int", (int) 0), "int=0"));
            add(new TestCase(Collections.singletonMap("int", (int) 42), "int=42"));
            add(
                new TestCase(
                    Collections.singletonMap("int", Integer.MIN_VALUE), "int=-2147483648"));
            add(new TestCase(Collections.singletonMap("int", Integer.MAX_VALUE), "int=2147483647"));

            // long
            add(new TestCase(Collections.singletonMap("long", (long) 0), "long=0"));
            add(new TestCase(Collections.singletonMap("long", (long) 42), "long=42"));
            add(
                new TestCase(
                    Collections.singletonMap("long", Long.MIN_VALUE), "long=-9223372036854775808"));
            add(
                new TestCase(
                    Collections.singletonMap("long", Long.MAX_VALUE), "long=9223372036854775807"));

            // float
            add(new TestCase(Collections.singletonMap("float", (float) 0), "float=0.0"));
            add(new TestCase(Collections.singletonMap("float", (float) 42), "float=42.0"));
            add(new TestCase(Collections.singletonMap("float", (float) 0.234), "float=0.234"));
            add(new TestCase(Collections.singletonMap("float", Float.MIN_VALUE), "float=1.4E-45"));
            add(
                new TestCase(
                    Collections.singletonMap("float", Float.MAX_VALUE), "float=3.4028235E38"));

            // double
            add(new TestCase(Collections.singletonMap("double", (double) 0), "double=0.0"));
            add(new TestCase(Collections.singletonMap("double", (double) 42), "double=42.0"));
            add(new TestCase(Collections.singletonMap("double", (double) 0.234), "double=0.234"));
            add(
                new TestCase(
                    Collections.singletonMap("double", Double.MIN_VALUE), "double=4.9E-324"));
            add(
                new TestCase(
                    Collections.singletonMap("double", Double.MAX_VALUE),
                    "double=1.7976931348623157E308"));

            // char
            add(new TestCase(Collections.singletonMap("char", (char) 'c'), "char=c"));
            add(new TestCase(Collections.singletonMap("char", (char) 0), "char=%00"));

            // boolean
            add(new TestCase(Collections.singletonMap("boolean", true), "boolean=true"));
            add(new TestCase(Collections.singletonMap("boolean", false), "boolean=false"));

            // --- Wrapper classes for primitive types ---

            // Byte
            add(new TestCase(Collections.singletonMap("byte", (Byte) null), "byte="));
            add(new TestCase(Collections.singletonMap("byte", Byte.valueOf((byte) 0)), "byte=0"));
            add(new TestCase(Collections.singletonMap("byte", Byte.valueOf((byte) 42)), "byte=42"));
            add(
                new TestCase(
                    Collections.singletonMap("byte", Byte.valueOf(Byte.MIN_VALUE)), "byte=-128"));
            add(
                new TestCase(
                    Collections.singletonMap("byte", Byte.valueOf(Byte.MAX_VALUE)), "byte=127"));

            // Short
            add(new TestCase(Collections.singletonMap("short", (Short) null), "short="));
            add(
                new TestCase(
                    Collections.singletonMap("short", Short.valueOf((short) 0)), "short=0"));
            add(
                new TestCase(
                    Collections.singletonMap("short", Short.valueOf((short) 42)), "short=42"));
            add(
                new TestCase(
                    Collections.singletonMap("short", Short.valueOf(Short.MIN_VALUE)),
                    "short=-32768"));
            add(
                new TestCase(
                    Collections.singletonMap("short", Short.valueOf(Short.MAX_VALUE)),
                    "short=32767"));

            // Integer
            add(new TestCase(Collections.singletonMap("integer", (Integer) null), "integer="));
            add(
                new TestCase(
                    Collections.singletonMap("integer", Integer.valueOf((int) 0)), "integer=0"));
            add(
                new TestCase(
                    Collections.singletonMap("integer", Integer.valueOf((int) 42)), "integer=42"));
            add(
                new TestCase(
                    Collections.singletonMap("integer", Integer.valueOf(Integer.MIN_VALUE)),
                    "integer=-2147483648"));
            add(
                new TestCase(
                    Collections.singletonMap("integer", Integer.valueOf(Integer.MAX_VALUE)),
                    "integer=2147483647"));

            // Long
            add(new TestCase(Collections.singletonMap("long", (Long) null), "long="));
            add(new TestCase(Collections.singletonMap("long", Long.valueOf((long) 0)), "long=0"));
            add(new TestCase(Collections.singletonMap("long", Long.valueOf((long) 42)), "long=42"));
            add(
                new TestCase(
                    Collections.singletonMap("long", Long.valueOf(Long.MIN_VALUE)),
                    "long=-9223372036854775808"));
            add(
                new TestCase(
                    Collections.singletonMap("long", Long.valueOf(Long.MAX_VALUE)),
                    "long=9223372036854775807"));

            // Float
            add(new TestCase(Collections.singletonMap("float", (Float) null), "float="));
            add(
                new TestCase(
                    Collections.singletonMap("float", Float.valueOf((float) 0)), "float=0.0"));
            add(
                new TestCase(
                    Collections.singletonMap("float", Float.valueOf((float) 42)), "float=42.0"));
            add(
                new TestCase(
                    Collections.singletonMap("float", Float.valueOf((float) 0.234)),
                    "float=0.234"));
            add(
                new TestCase(
                    Collections.singletonMap("float", Float.valueOf(Float.MIN_VALUE)),
                    "float=1.4E-45"));
            add(
                new TestCase(
                    Collections.singletonMap("float", Float.valueOf(Float.MAX_VALUE)),
                    "float=3.4028235E38"));

            // Double
            add(new TestCase(Collections.singletonMap("double", (Double) null), "double="));
            add(
                new TestCase(
                    Collections.singletonMap("double", Double.valueOf((double) 0)), "double=0.0"));
            add(
                new TestCase(
                    Collections.singletonMap("double", Double.valueOf((double) 42)),
                    "double=42.0"));
            add(
                new TestCase(
                    Collections.singletonMap("double", Double.valueOf((double) 0.234)),
                    "double=0.234"));
            add(
                new TestCase(
                    Collections.singletonMap("double", Double.valueOf(Double.MIN_VALUE)),
                    "double=4.9E-324"));
            add(
                new TestCase(
                    Collections.singletonMap("double", Double.valueOf(Double.MAX_VALUE)),
                    "double=1.7976931348623157E308"));

            // Character
            add(
                new TestCase(
                    Collections.singletonMap("character", (Character) null), "character="));
            add(
                new TestCase(
                    Collections.singletonMap("character", Character.valueOf((char) 'c')),
                    "character=c"));
            add(
                new TestCase(
                    Collections.singletonMap("character", Character.valueOf((char) 0)),
                    "character=%00"));

            // Boolean
            add(new TestCase(Collections.singletonMap("boolean", (Boolean) null), "boolean="));
            add(new TestCase(Collections.singletonMap("boolean", Boolean.TRUE), "boolean=true"));
            add(new TestCase(Collections.singletonMap("boolean", Boolean.FALSE), "boolean=false"));

            // --- Other scalar types ---

            // BigDecimal
            add(
                new TestCase(
                    Collections.singletonMap("big_decimal", (BigDecimal) null), "big_decimal="));
            add(
                new TestCase(
                    Collections.singletonMap("big_decimal", new BigDecimal("0.0")),
                    "big_decimal=0.0"));
            add(
                new TestCase(
                    Collections.singletonMap("big_decimal", new BigDecimal("1.2345")),
                    "big_decimal=1.2345"));
            add(
                new TestCase(
                    Collections.singletonMap("big_decimal", new BigDecimal("1e100")),
                    "big_decimal=1E%2B100"));

            // Enum
            add(new TestCase(Collections.singletonMap("enum", TestEnum.FOO), "enum=foo"));
            add(new TestCase(Collections.singletonMap("enum", TestEnum.BAR), "enum=bar"));

            // String
            add(new TestCase(Collections.singletonMap("string", (String) null), "string="));
            add(new TestCase(Collections.singletonMap("string", ""), "string="));
            add(new TestCase(Collections.singletonMap("string", "foo"), "string=foo"));
            add(new TestCase(Collections.singletonMap("string", "abc def"), "string=abc+def"));
            add(new TestCase(Collections.singletonMap("string", "%[@]"), "string=%25[%40]"));

            // --- Compound types ---

            // Array
            add(new TestCase(Collections.singletonMap("array", new String[] {}), "array="));
            add(
                new TestCase(
                    Collections.singletonMap("array", new String[] {"1", "2", "3"}),
                    "array[0]=1&array[1]=2&array[2]=3"));
            add(
                new TestCase(
                    Collections.singletonMap("array", new Object[] {123, "foo"}),
                    "array[0]=123&array[1]=foo"));
            add(
                new TestCase(
                    Collections.singletonMap(
                        "array", new Object[] {new String[] {"foo", "bar"}, new int[] {1, 2, 3}}),
                    "array[0][0]=foo&array[0][1]=bar&array[1][0]=1&array[1][1]=2&array[1][2]=3"));

            // Collection
            add(
                new TestCase(
                    Collections.singletonMap("collection", Collections.emptyList()),
                    "collection="));
            add(
                new TestCase(
                    Collections.singletonMap("collection", ImmutableList.of("1", "2", "3")),
                    "collection[0]=1&collection[1]=2&collection[2]=3"));
            add(
                new TestCase(
                    Collections.singletonMap("collection", ImmutableList.of(123, "foo")),
                    "collection[0]=123&collection[1]=foo"));
            add(
                new TestCase(
                    Collections.singletonMap(
                        "collection",
                        ImmutableList.of(
                            ImmutableList.of("foo", "bar"), ImmutableList.of(1, 2, 3))),
                    "collection[0][0]=foo&collection[0][1]=bar&collection[1][0]=1&collection[1][1]=2&collection[1][2]=3"));

            // Map
            add(new TestCase(Collections.singletonMap("map", Collections.emptyMap()), ""));
            add(
                new TestCase(
                    Collections.singletonMap("map", ImmutableMap.of("one", 1, "two", 2)),
                    "map[one]=1&map[two]=2"));

            // --- URL-encoding of both keys and values ---
            add(
                new TestCase(
                    ImmutableMap.of(
                        "map",
                        ImmutableMap.of("#", "1 2 3", "bar&baz", "+foo?"),
                        "string",
                        "[éàü]"),
                    "map[%23]=1+2+3&map[bar%26baz]=%2Bfoo%3F&string=[%C3%A9%C3%A0%C3%BC]"));
          }
        };

    for (TestCase testCase : testCases) {
      assertEquals(testCase.getWant(), FormEncoder.createQueryString(testCase.getData()));
    }
  }

  @Test
  public void testFlattenParams() {
    @Data
    class TestCase {
      private final Map<String, Object> data;
      private final List<KeyValuePair<String, Object>> want;
    }

    List<TestCase> testCases =
        new ArrayList<TestCase>() {
          private static final long serialVersionUID = 1L;

          {
            // No data
            add(new TestCase(Collections.emptyMap(), Collections.emptyList()));

            // Already flat parameters
            add(
                new TestCase(
                    ImmutableMap.of("key", "value"),
                    ImmutableList.of(new KeyValuePair<String, Object>("key", "value"))));
            add(
                new TestCase(
                    ImmutableMap.of("key1", "value1", "key2", "value2"),
                    ImmutableList.of(
                        new KeyValuePair<String, Object>("key1", "value1"),
                        new KeyValuePair<String, Object>("key2", "value2"))));

            // Nested parameters
            add(
                new TestCase(
                    Collections.singletonMap("collection", ImmutableList.of("1", "2", "3")),
                    ImmutableList.of(
                        new KeyValuePair<String, Object>("collection[0]", "1"),
                        new KeyValuePair<String, Object>("collection[1]", "2"),
                        new KeyValuePair<String, Object>("collection[2]", "3"))));
            add(
                new TestCase(
                    Collections.singletonMap("map", ImmutableMap.of("one", 1, "two", 2)),
                    ImmutableList.of(
                        new KeyValuePair<String, Object>("map[one]", "1"),
                        new KeyValuePair<String, Object>("map[two]", "2"))));
          }
        };

    for (TestCase testCase : testCases) {
      assertEquals(testCase.getWant(), FormEncoder.flattenParams(testCase.getData()));
    }
  }

  @Test
  public void testCreateQueryString_old() {
    Map<String, Object> params = new HashMap<>();
    params.put("a", "b");
    assertEquals("a=b", FormEncoder.createQueryString(params));
  }

  @Test
  public void testCreateQueryStringWithNestedParams() {
    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    final Map<String, Object> nested = new LinkedHashMap<>();
    nested.put("A", "B");
    nested.put("C", "D");
    params.put("nested", nested);
    params.put("c", "d");
    params.put("e", "f");
    assertEquals("nested[A]=B&nested[C]=D&c=d&e=f", FormEncoder.createQueryString(params));
  }

  @Test
  public void testCreateQueryWithListParams() {
    final List<String> nested = new ArrayList<>();
    nested.add("A");
    nested.add("B");
    nested.add("C");

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("nested", nested);
    params.put("a", "b");
    params.put("c", "d");

    assertEquals(
        "nested[0]=A&nested[1]=B&nested[2]=C&a=b&c=d", FormEncoder.createQueryString(params));
  }

  @Test
  public void testCreateQueryStringWithArrayParams() {
    final String[] nested = {"A", "B", "C"};

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("nested", nested);
    params.put("a", "b");
    params.put("c", "d");

    assertEquals(
        "nested[0]=A&nested[1]=B&nested[2]=C&a=b&c=d", FormEncoder.createQueryString(params));
  }

  @Test
  public void testCreateQueryStringWithListOfHashes() {
    final Map<String, String> deepNestedMap1 = new LinkedHashMap<>();
    deepNestedMap1.put("A", "A-1");
    deepNestedMap1.put("B", "B-1");

    final Map<String, String> deepNestedMap2 = new LinkedHashMap<>();
    deepNestedMap2.put("A", "A-2");
    deepNestedMap2.put("B", "B-2");

    final List<Object> nested = new ArrayList<>();
    nested.add(deepNestedMap1);
    nested.add(deepNestedMap2);

    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();
    params.put("nested", nested);

    assertEquals(
        "nested[0][A]=A-1&nested[0][B]=B-1&nested[1][A]=A-2&nested[1][B]=B-2",
        FormEncoder.createQueryString(params));
  }

  @Test
  public void testCreateQueryStringWithFormEncodedKeys() {
    /* Use LinkedHashMap because it preserves iteration order */
    final Map<String, Object> params = new LinkedHashMap<>();

    // Params with form-encoded keys can happen through "extraParams". Instead of passing a
    // string key and `Object` value, users can also specify key as form-encoded path to the
    // extra param value.
    // This "extraParams" behavior is supported by other typed libraries, but not
    // intended in `stripe-java`. However, by the virtue of supporting arbitrary string key in
    // extra param map, this behavior is implicitly supported.
    params.put("nested[0][A]", "A-1");
    params.put("nested[0][B]", "B-1");
    params.put("nested[1][A]", "A-2");
    params.put("nested[1][B]", "B-2");

    assertEquals(
        "nested[0][A]=A-1&nested[0][B]=B-1&nested[1][A]=A-2&nested[1][B]=B-2",
        FormEncoder.createQueryString(params));
  }

  @SuppressWarnings("ModifiedButNotUsed")
  @Test
  public void testCreateQueryStringWithCollection() {
    // test collections with its own implementation to return iterator giving "A", "B", "C" in order
    final Set<String> nestedTreeSet = new TreeSet<>(String::compareTo);
    nestedTreeSet.add("B");
    nestedTreeSet.add("C");
    nestedTreeSet.add("A");

    final Deque<String> nestedDequeue = new ArrayDeque<>();
    nestedDequeue.addFirst("C");
    nestedDequeue.addFirst("B");
    nestedDequeue.addFirst("A");

    final Set<String> nestedLinkedHashSet = new LinkedHashSet<>();
    nestedLinkedHashSet.add("A");
    nestedLinkedHashSet.add("B");
    nestedLinkedHashSet.add("C");

    final List<String> nestedList = new ArrayList<>();
    nestedList.add("A");
    nestedList.add("B");
    nestedList.add("C");

    List<Collection<String>> collections =
        Arrays.asList(nestedTreeSet, nestedDequeue, nestedLinkedHashSet, nestedList);

    for (Collection<String> collection : collections) {
      final Map<String, Object> params = new LinkedHashMap<>();
      params.put("nested", collection);
      // collection is treated the same as array encoding
      assertEquals(
          "nested[0]=A&nested[1]=B&nested[2]=C",
          FormEncoder.createQueryString(params),
          "Failed encoding for collection " + collection.getClass());
    }
  }

  @Test
  public void testCreateQueryStringWithEmptyCollection() {
    final Map<String, Object> params = new HashMap<>();
    params.put("a", new ArrayList<String>());
    assertEquals("a=", FormEncoder.createQueryString(params));

    params.put("a", new HashSet<>());
    assertEquals("a=", FormEncoder.createQueryString(params));

    params.put("a", new TreeSet<>());
    assertEquals("a=", FormEncoder.createQueryString(params));
  }

  @Test
  public void testCreateQueryStringWithEmptyArray() {
    final String[] array = {};
    final Map<String, Object> params = new HashMap<>();
    params.put("a", array);
    assertEquals("a=", FormEncoder.createQueryString(params));
  }

  @Test
  public void testCreateQueryStringUrlEncodeSpecialCharacters() {
    final Map<String, Object> params = new HashMap<>();
    params.put("a", "+foo?");
    assertEquals("a=%2Bfoo%3F", FormEncoder.createQueryString(params));
  }

  @Test
  public void testIncorrectAdditionalOwners() {
    final Map<String, String> ownerParams = new HashMap<>();
    ownerParams.put("first_name", "Stripe");

    final List<Object> additionalOwners = new ArrayList<>();
    additionalOwners.add(ownerParams);

    final Map<String, Object> legalEntityParams = new HashMap<>();
    legalEntityParams.put("additional_owners", additionalOwners);

    final Map<String, Object> params = new HashMap<>();
    params.put("legal_entity", legalEntityParams);

    assertEquals(
        "legal_entity[additional_owners][0][first_name]=Stripe",
        FormEncoder.createQueryString(params));
  }

  @Test
  public void testCorrectAdditionalOwners() {
    final Map<String, String> ownerParams = new HashMap<>();
    ownerParams.put("first_name", "Stripe");

    final Map<String, Object> additionalOwnersMap = new HashMap<>();
    additionalOwnersMap.put("0", ownerParams);

    final Map<String, Object> legalEntityParams = new HashMap<>();
    legalEntityParams.put("additional_owners", additionalOwnersMap);

    final Map<String, Object> params = new HashMap<>();
    params.put("legal_entity", legalEntityParams);

    assertEquals(
        "legal_entity[additional_owners][0][first_name]=Stripe",
        FormEncoder.createQueryString(params));
  }
}
