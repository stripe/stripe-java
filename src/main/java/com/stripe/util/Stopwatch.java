package com.stripe.util;

import java.time.Duration;

/**
 * This class provides a set of methods and properties that can be used to accurately measure
 * elapsed time.
 */
public class Stopwatch {
  private long elapsed;
  private boolean running;
  private long startTimeStamp;

  /** Initializes a new instance of the {@link Stopwatch} class. */
  public Stopwatch() {
    this.reset();
  }

  /** Starts, or resumes, measuring elapsed time for an interval. */
  public void start() {
    if (!this.running) {
      this.startTimeStamp = getTimestamp();
      this.running = true;
    }
  }

  /**
   * Initializes a new {@link Stopwatch} instance, sets the elapsed time property to zero, and
   * starts measuring elapsed time.
   *
   * @return a {@link Stopwatch} that has just begun measuring elapsed time
   */
  public static Stopwatch startNew() {
    Stopwatch s = new Stopwatch();
    s.start();
    return s;
  }

  /** Stops measuring elapsed time for an interval. */
  public void stop() {
    // Calling stop on a stopped Stopwatch is a no-op.
    if (!this.running) {
      return;
    }

    long endTimeStamp = getTimestamp();
    long elapsedThisPeriod = endTimeStamp - this.startTimeStamp;
    this.elapsed += elapsedThisPeriod;
    this.running = false;
  }

  /** Stops time interval measurement and resets the elapsed time to zero. */
  public void reset() {
    this.elapsed = 0;
    this.running = false;
    this.startTimeStamp = 0;
  }

  /**
   * Stops time interval measurement, resets the elapsed time to zero, and starts measuring elapsed
   * time.
   */
  public void restart() {
    this.elapsed = 0;
    this.running = true;
    this.startTimeStamp = getTimestamp();
  }

  /**
   * Gets a value indicating whether the {@link Stopwatch} timer is running.
   *
   * @return {@code true} if the {@link Stopwatch} instance is currently running and measuring
   *     elapsed time for an interval; otherwise, {@code false}
   */
  public boolean isRunning() {
    return this.running;
  }

  /**
   * Gets the total elapsed time measured by the current instance.
   *
   * @return a {@link Duration} representing the total elapsed time measured by the current instance
   */
  public Duration getElapsed() {
    return Duration.ofNanos(this.getRawElapsed());
  }

  /**
   * Gets the current timestamp with the highest precision available. This should use a monotonic
   * clock whenever possible.
   *
   * @return a long integer representing the current timestamp
   */
  public static long getTimestamp() {
    return System.nanoTime();
  }

  private long getRawElapsed() {
    long timeElapsed = this.elapsed;

    // If the Stopwatch is running, add elapsed time since the Stopwatch is started last time.
    if (this.running) {
      long currentTimeStamp = getTimestamp();
      long elapsedUntilNow = currentTimeStamp - this.startTimeStamp;
      timeElapsed += elapsedUntilNow;
    }

    return timeElapsed;
  }
}
