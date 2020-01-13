package com.stripe.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
  @Test
  public void testContainsWhitespace() {
    @Data
    class TestCase {
      private final String data;
      private final Boolean want;
    }

    List<TestCase> testCases =
        new ArrayList<TestCase>() {
          private static final long serialVersionUID = 1L;

          {
            add(new TestCase("sk_test_123", false));
            add(new TestCase("sk_test_4eC39HqLyjWDarjtT1zdp7dc", false));
            add(new TestCase("abc", false));
            add(new TestCase("sk-test-123", false));
            add(new TestCase("", false));
            add(new TestCase("sk_test_123\n", true));
            add(new TestCase("\nsk_test_123", true));
            add(new TestCase("sk_test_\n123", true));
            add(new TestCase("sk_test_123 ", true));
            add(new TestCase(" sk_test_123", true));
            add(new TestCase("sk_test_ 123", true));
          }
        };

    for (TestCase testCase : testCases) {
      assertTrue(
          testCase.getWant() == StringUtils.containsWhitespace(testCase.getData()),
          String.format(
              "Expected containsWhitespace(\"%s\") to be %s",
              testCase.getData(), testCase.getWant() ? "true" : "false"));
    }
  }

  @Test
  public void testSecureCompare() {
    @Data
    class TestCase {
      private final String[] data;
      private final Boolean want;
    }

    List<TestCase> testCases =
        new ArrayList<TestCase>() {
          private static final long serialVersionUID = 1L;

          {
            add(new TestCase(new String[] {"Hello", "Hello"}, true));
            add(new TestCase(new String[] {"Hello", "hello"}, false));
            add(new TestCase(new String[] {"Hello", "Helloo"}, false));
            add(new TestCase(new String[] {"Hello", "Hell"}, false));
            add(new TestCase(new String[] {"Hello", ""}, false));
            add(new TestCase(new String[] {"", "Hello"}, false));
            add(new TestCase(new String[] {"", ""}, true));
            add(new TestCase(new String[] {"\0AAAAAAAAA", "\0BBBBBBBBBBBB"}, false));
          }
        };

    for (TestCase testCase : testCases) {
      assertTrue(
          testCase.getWant()
              == StringUtils.secureCompare(testCase.getData()[0], testCase.getData()[1]),
          String.format(
              "Expected secureCompare(\"%s\", \"%s\") to be %s",
              testCase.getData()[0], testCase.getData()[1], testCase.getWant() ? "true" : "false"));
    }
  }

  @Test
  public void testToSnakeCase() {
    @Data
    class TestCase {
      private final String data;
      private final String want;
    }

    List<TestCase> testCases =
        new ArrayList<TestCase>() {
          private static final long serialVersionUID = 1L;

          {
            add(new TestCase("Foo", "foo"));
            add(new TestCase("FooBar", "foo_bar"));
            add(new TestCase("FooBar123", "foo_bar123"));
            add(new TestCase("Foo123Bar", "foo123_bar"));
            add(new TestCase("FOOBar", "foo_bar"));
            add(new TestCase("FooBAR", "foo_bar"));
            add(new TestCase("FOOBAR", "foobar"));
            add(new TestCase("FOO_BAR", "foo_bar"));
          }
        };

    for (TestCase testCase : testCases) {
      assertEquals(testCase.getWant(), StringUtils.toSnakeCase(testCase.getData()));
    }
  }
}
