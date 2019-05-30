package com.stripe;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Getter;

public class StripeMockProcess {

  private static final String ROOT = "src/test";
  private static final String FIXTURE_PATH = "/openapi/fixtures3.json";
  private static final String SPEC_PATH = "/openapi/spec3.json";

  private static Process process;
  @Getter private static String port;
  private static String pid;

  /**
   * Start embedded stripe-mock when spec and fixture resources are detected.
   *
   * @return whether the stripe-mock can be started and is now running.
   */
  public static boolean start()
      throws IOException, InterruptedException, NoSuchFieldException, IllegalAccessException {

    if (!new File(getPathSpec()).exists() || !new File(getPathFixture()).exists()) {
      return false;
    }

    if (process != null && isAlive(process)) {
      System.out.println(String.format("stripe-mock is already running, port = %s", port));
      return true;
    } else {
      // to reinitialize all properties
      process = null;
      port = null;
      pid = null;
    }

    ProcessBuilder processBuilder =
        new ProcessBuilder()
            .command(
                "stripe-mock",
                "-http-port",
                "0", // stripe-mock to choose an available port
                "-spec",
                getPathSpec(),
                "-fixtures",
                getPathFixture());

    try {
      process = processBuilder.start();
    } catch (IOException e) {
      System.out.println(
          String.format(
              "Error while starting stripe-mock, fixtures = %s and %s, error message = %s",
              getPathSpec(), getPathFixture(), e.getMessage()));
      System.exit(1);
    }

    pid = getProcessId(process);

    if (isAlive(process)) {
      System.out.println(String.format("Started stripe-mock, PID = %s", pid));
      System.out.println("Finding port bound to stripe-mock...");
      port = detectBoundPort(process);
      if (port == null) {
        System.out.println(String.format("Unable to find port for stripe-mock, PID = %s", pid));
        System.exit(1);
      }
    } else {
      System.out.println(
          String.format("stripe-mock terminated early, exit value = %d", process.exitValue()));
      System.exit(1);
    }

    return true;
  }

  /** Find port bound to stripe-mock, relying on process output. */
  private static String detectBoundPort(Process process) throws IOException, InterruptedException {
    // output of stripe-mock available as an input stream
    BufferedReader processOutput =
        new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));

    Pattern pattern = Pattern.compile("Listening for HTTP on port: (\\d+)");
    String line;
    while ((line = processOutput.readLine()) != null) {
      Matcher matcher = pattern.matcher(line);
      if (matcher.find()) {
        return matcher.group(1);
      }
      Thread.sleep(100);
    }
    return null;
  }

  /**
   * Stop embedded stripe-mock, and waits to return its exit value.
   *
   * @return stripe-mock process exit value.
   */
  public static int stop() throws InterruptedException {
    if (process == null) {
      return 0;
    } else if (!isAlive(process)) {
      return process.exitValue();
    } else {
      System.out.println("Stopping stripe-mock...");
      process.destroy();
      int exitValue = process.waitFor();
      System.out.println(String.format("Stopped stripe-mock, exit value = %d", exitValue));
      return exitValue;
    }
  }

  private static String getProcessId(Process process)
      throws NoSuchFieldException, IllegalAccessException {
    // abstract class `Process` does not have PID interface
    // reflection is workaround in getting process ID, only available in the concrete UNIXProcess
    // (casting not possible due to the class default access)
    Field field = process.getClass().getDeclaredField("pid");
    field.setAccessible(true);
    return String.valueOf((int) field.get(process));
  }

  private static boolean isAlive(Process process) {
    // copied from java 8 implementation
    try {
      process.exitValue();
      return false;
    } catch (IllegalThreadStateException e) {
      return true;
    }
  }

  private static String getPathSpec() {
    return new File(ROOT + SPEC_PATH).getAbsolutePath();
  }

  private static String getPathFixture() {
    return new File(ROOT + FIXTURE_PATH).getAbsolutePath();
  }
}
