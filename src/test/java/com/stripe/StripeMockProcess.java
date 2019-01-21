package com.stripe;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import lombok.Getter;

public class StripeMockProcess {

  private static final String ROOT = "src/test";
  private static final String FIXTURE_PATH = "/openapi/fixtures3.json";
  private static final String SPEC_PATH = "/openapi/spec3.json";

  private static Process process;
  @Getter
  private static Integer port;
  private static String pid;

  /**
   * Start embedded stripe-mock when spec and fixture resources are detected.
   *
   * @return whether the stripe-mock can be started and is now running.
   */
  public static boolean start() throws IOException, InterruptedException, NoSuchFieldException,
      IllegalAccessException {

    if (!new File(getPathSpec()).exists() || !new File(getPathFixture()).exists()) {
      return false;
    }

    if (process != null && isAlive(process)) {
      System.out.println(String.format("stripe-mock is already running, port = %d", port));
      return true;
    } else {
      // to reinitialize all properties
      process = null;
      port = null;
      pid = null;
    }

    port = findAvailablePort();

    ProcessBuilder processBuilder = new ProcessBuilder()
        .command(
            "stripe-mock",
            "-http-port",
            String.valueOf(port),
            "-spec",
            getPathSpec(),
            "-fixtures",
            getPathFixture()
        );

    // stripe-mock output/error will be the same as this current test parent process
    processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
    processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);

    try {
      process = processBuilder.start();
    } catch (IOException e) {
      System.out.println(String.format(
          "Error while starting stripe-mock, port = %d, fixtures = %s and %s, "
              + "error message = %s",
          port, getPathSpec(), getPathFixture(), e.getMessage()
      ));
      System.exit(1);
    }

    pid = getProcessId(process);

    // not returning immediately, otherwise caller to stripe-mock will get connection refused error
    // sleeping ensures that stripe-mock will already be listening on the port
    Thread.sleep(1000);

    if (isAlive(process)) {
      System.out.println(String.format("Started stripe-mock, PID = %s", pid));
    } else {
      System.out.println(
          String.format("stripe-mock terminated early, exit value = %d", process.exitValue()));
      System.exit(1);
    }

    return true;
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

  private static String getProcessId(Process process) throws NoSuchFieldException,
      IllegalAccessException {
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

  private static int findAvailablePort() throws IOException {
    ServerSocket socket = null;
    try {
      // create socket automatically bound to an available port
      socket = new ServerSocket(0);
      return socket.getLocalPort();
    } finally {
      // always close any created socket
      // so strip-mock can bind to that available port
      if (socket != null) {
        socket.close();
      }
    }
  }
}
