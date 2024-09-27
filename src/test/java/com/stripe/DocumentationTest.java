package com.stripe;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.jupiter.api.Test;

public class DocumentationTest {

  private static String formatDateTime() {
    Calendar instance = Calendar.getInstance();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = format.format(instance.getTime());
    String result = "## " + Stripe.VERSION + " - " + formattedDate;
    return result;
  }

  @Test
  public void testGradlePropertiesContainsVersionThatMatches() throws IOException {
    // we want to ensure that the pom's version matches the static version.
    final File gradleFile = new File("gradle.properties").getAbsoluteFile();

    assertTrue(
        gradleFile.exists(),
        String.format(
            "Expected gradle.properties file to exist, but it doesn't. (path is %s).",
            gradleFile.getAbsolutePath()));

    try (final BufferedReader reader =
        new BufferedReader(
            new InputStreamReader(new FileInputStream(gradleFile), StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.contains(Stripe.VERSION)) {
          return;
        }
      }

      fail(
          String.format(
              "Expected the Stripe.VERSION (%s) to match up with the one listed in the "
                  + "gradle.properties file. It wasn't found.",
              Stripe.VERSION));
    }
  }
}
