package com.stripe.util;

import static java.util.Objects.requireNonNull;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.regex.Pattern;

public final class StringUtils {
  private static Pattern whitespacePattern = Pattern.compile("\\s");

  /**
   * Checks whether a string contains any whitespace characters or not.
   *
   * @param str the string to check.
   * @return {@code true} if the string contains any whitespace characters; otherwise, {@code
   *     false}.
   */
  public static boolean containsWhitespace(String str) {
    requireNonNull(str);
    return whitespacePattern.matcher(str).find();
  }

  /**
   * Compares two strings for equality. The time taken is independent of the number of characters
   * that match.
   *
   * @param a one of the strings to compare.
   * @param b the other string to compare.
   * @return true if the strings are equal, false otherwise.
   */
  public static boolean secureCompare(String a, String b) {
    byte[] digesta = a.getBytes(StandardCharsets.UTF_8);
    byte[] digestb = b.getBytes(StandardCharsets.UTF_8);

    return MessageDigest.isEqual(digesta, digestb);
  }

  /**
   * Converts the string to snake case.
   *
   * @param str the string to convert.
   * @return A string with the contents of the input string converted to snake case.
   */
  public static String toSnakeCase(String str) {
    return str.replaceAll("(.)([A-Z][a-z]+)", "$1_$2")
        .replaceAll("([a-z0-9])([A-Z])", "$1_$2")
        .toLowerCase();
  }
}
