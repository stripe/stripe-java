package com.stripe.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import org.junit.jupiter.api.Test;

public class StopwatchTest {
  @Test
  public void testGetTimestamp() {
    long ts1 = Stopwatch.getTimestamp();
    sleep();
    long ts2 = Stopwatch.getTimestamp();
    assertNotEquals(ts1, ts2);
  }

  @Test
  public void testConstructStartAndStop() {
    Stopwatch watch = new Stopwatch();
    assertFalse(watch.isRunning());
    assertTrue(watch.getElapsed().compareTo(Duration.ZERO) == 0);
    watch.start();
    assertTrue(watch.isRunning());
    sleep();
    assertTrue(watch.getElapsed().compareTo(Duration.ZERO) > 0);

    watch.stop();
    assertFalse(watch.isRunning());

    Duration e1 = watch.getElapsed();
    sleep();
    Duration e2 = watch.getElapsed();
    assertTrue(e1.compareTo(e2) == 0);
  }

  @Test
  public void testStartNewAndReset() {
    Stopwatch watch = Stopwatch.startNew();
    assertTrue(watch.isRunning());
    watch.start(); // should be a no-op
    assertTrue(watch.isRunning());
    sleep();
    assertTrue(watch.getElapsed().compareTo(Duration.ZERO) > 0);

    watch.reset();
    assertFalse(watch.isRunning());
    assertTrue(watch.getElapsed().compareTo(Duration.ZERO) == 0);
  }

  @Test
  public void testStartNewAndRestart() {
    Stopwatch watch = Stopwatch.startNew();
    assertTrue(watch.isRunning());
    sleep(10);
    Duration elapsedSinceStart = watch.getElapsed();
    assertTrue(elapsedSinceStart.compareTo(Duration.ZERO) > 0);

    watch.restart();
    assertTrue(watch.isRunning());
    assertTrue(watch.getElapsed().compareTo(elapsedSinceStart) < 0);
  }

  private static void sleep() {
    sleep(1);
  }

  private static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      return;
    }
  }
}
