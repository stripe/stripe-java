package com.stripe;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Joiner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Test;

public class DocumentationTest {

  private static String formatDateTime() {
    Calendar instance = Calendar.getInstance();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = format.format(instance.getTime());
    String result = "## " + Stripe.VERSION + " - " + formattedDate;
    return result;
  }

  @Test
  public void testChangeLogContainsStaticVersion() throws IOException {
    final File changelogFile = new File("CHANGELOG.md").getAbsoluteFile();

    assertTrue(
        String.format("Expected CHANGELOG file to exist, but it doesn't. (path is %s).",
            changelogFile.getAbsolutePath()),
        changelogFile.exists());
    assertTrue(
        String.format("Expected CHANGELOG to be a file, but it isn't. (path is %s).",
            changelogFile.getAbsolutePath()),
        changelogFile.isFile());

    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(
        new FileInputStream(changelogFile), StandardCharsets.UTF_8))) {
      final String expectedLine = formatDateTime();
      final String pattern = String.format(
          "^## %s - 20[12][0-9]-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$", Stripe.VERSION);
      final List<String> closeMatches = new ArrayList<String>();
      String line;

      while ((line = reader.readLine()) != null) {
        if (line.contains(Stripe.VERSION)) {
          if (Pattern.matches(pattern, line)) {
            return;
          }
          closeMatches.add(line);
        }
      }

      fail(String.format(
          "Expected a line of the format '%s' in the CHANGELOG, but didn't find one.%n"
          + "The following lines were close, but didn't match exactly:%n'%s'",
          expectedLine, Joiner.on(", ").join(closeMatches)));
    }
  }

  @Test
  public void testReadMeContainsStripeVersionThatMatches() throws IOException {
    // this will be very flaky, but we want to ensure that the readme is correct.
    final File readmeFile = new File("README.md").getAbsoluteFile();

    assertTrue(
        String.format("Expected README.md file to exist, but it doesn't. (path is %s).",
            readmeFile.getAbsolutePath()),
        readmeFile.exists());
    assertTrue(
        String.format("Expected README.md to be a file, but it doesn't. (path is %s).",
            readmeFile.getAbsolutePath()),
        readmeFile.isFile());

    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(
        new FileInputStream(readmeFile), StandardCharsets.UTF_8))) {
      final int expectedMentionsOfVersion = 2;
      // Currently two places mention the Stripe version: the sample pom and gradle files.
      final List<String> mentioningLines = new ArrayList<String>();
      String line;

      while ((line = reader.readLine()) != null) {
        if (line.contains(Stripe.VERSION)) {
          mentioningLines.add(line);
        }
      }

      final String message = String.format(
          "Expected %d mentions of the stripe-java version in the Readme, but found %d:%n%s",
          expectedMentionsOfVersion, mentioningLines.size(), Joiner.on(", ").join(mentioningLines));
      assertSame(message, expectedMentionsOfVersion, mentioningLines.size());
    }
  }

  @Test
  public void testGradlePropertiesContainsVersionThatMatches() throws IOException {
    // we want to ensure that the pom's version matches the static version.
    final File gradleFile = new File("gradle.properties").getAbsoluteFile();

    assertTrue(
        String.format("Expected gradle.properties file to exist, but it doesn't. (path is %s).",
            gradleFile.getAbsolutePath()),
        gradleFile.exists());
    assertTrue(
        String.format("Expected gradle.properties to be a file, but it doesn't. (path is %s).",
            gradleFile.getAbsolutePath()),
            gradleFile.isFile());

    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(
        new FileInputStream(gradleFile), StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.contains(Stripe.VERSION)) {
          return;
        }
      }

      fail(String.format("Expected the Stripe.VERSION (%s) to match up with the one listed in the "
          + "gradle.properties file. It wasn't found.", Stripe.VERSION));
    }
  }
}
