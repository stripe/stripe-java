package com.stripe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.EqualsAndHashCode;

/**
 * The StripeContext class provides an immutable container for interacting with the `Stripe-Context`
 * header.
 *
 * <p>You can use it whenever you're initializing a `StripeClient` or sending `stripe_context` with
 * a request. It's also found in the `EventNotification.context` property.
 */
@EqualsAndHashCode
public final class StripeContext {
  private final List<String> segments;

  /** Creates a new StripeContext with no segments. */
  public StripeContext() {
    this(null);
  }

  /**
   * Creates a new StripeContext with the specified segments.
   *
   * @param segments the list of context segments
   */
  public StripeContext(List<String> segments) {
    this.segments =
        segments == null
            ? Collections.emptyList()
            : Collections.unmodifiableList(new ArrayList<>(segments));
  }

  /**
   * Returns a new StripeContext with the given segment added to the end.
   *
   * @param segment the segment to add
   * @return a new StripeContext instance with the segment appended
   */
  public StripeContext push(String segment) {
    List<String> newSegments = new ArrayList<>(this.segments);
    newSegments.add(segment);
    return new StripeContext(newSegments);
  }

  /**
   * Returns a new StripeContext with the last segment removed.
   *
   * @return a new StripeContext instance with the last segment removed
   */
  public StripeContext pop() {
    if (segments.isEmpty()) {
      throw new IllegalStateException("Cannot pop from an empty StripeContext");
    }

    List<String> newSegments = new ArrayList<>(this.segments);
    newSegments.remove(newSegments.size() - 1);
    return new StripeContext(newSegments);
  }

  /**
   * Converts the context to a string by joining segments with '/'.
   *
   * @return string representation of the context segments joined by '/'. If there are no segments,
   *     returns an empty string (useful for clearing context).
   */
  @Override
  public String toString() {
    return String.join("/", segments);
  }

  /**
   * Parse a context string into a StripeContext instance.
   *
   * @param contextStr string to parse (segments separated by '/')
   * @return StripeContext instance with segments from the string
   */
  public static StripeContext parse(String contextStr) {
    if (contextStr == null || contextStr.isEmpty()) {
      return new StripeContext();
    }

    List<String> segments = Arrays.asList(contextStr.split("/"));
    return new StripeContext(segments);
  }

  /**
   * Returns an unmodifiable list of the current segments.
   *
   * @return the list of segments
   */
  public List<String> getSegments() {
    return segments;
  }
}
