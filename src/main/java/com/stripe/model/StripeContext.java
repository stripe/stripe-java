package com.stripe.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * StripeContext represents a context path for Stripe API requests.
 *
 * The context is used to access child accounts by adding segments,
 * or parent accounts by removing segments. This class provides an
 * immutable interface for manipulating context paths.
 */
public class StripeContext {
    private final List<String> segments;

    /**
     * Initialize a StripeContext with no segments.
     */
    public StripeContext() {
        this.segments = Collections.emptyList();
    }

    /**
     * Initialize a StripeContext with the given segments.
     *
     * @param segments List of context path segments
     */
    public StripeContext(List<String> segments) {
        this.segments = segments != null ?
            Collections.unmodifiableList(new ArrayList<>(segments)) :
            Collections.emptyList();
    }

    /**
     * Parse a context string into a StripeContext instance.
     *
     * @param contextString A string like "a/b/c" to be split on "/"
     * @return A new StripeContext instance with the parsed segments
     */
    public static StripeContext parse(String contextString) {
        if (contextString == null || contextString.isEmpty()) {
            return new StripeContext();
        }
        return new StripeContext(Arrays.asList(contextString.split("/")));
    }

    /**
     * Create a new StripeContext with the last segment removed.
     *
     * @return A new StripeContext instance with one fewer segment
     * @throws IllegalStateException If context has no segments to remove
     */
    public StripeContext parent() {
        if (segments.isEmpty()) {
            throw new IllegalStateException("Cannot get parent of empty context");
        }
        return new StripeContext(segments.subList(0, segments.size() - 1));
    }

    /**
     * Create a new StripeContext with an additional segment appended.
     *
     * @param segment The segment to append to the context path
     * @return A new StripeContext instance with the new segment added
     */
    public StripeContext child(String segment) {
        List<String> newSegments = new ArrayList<>(segments);
        newSegments.add(segment);
        return new StripeContext(newSegments);
    }

    /**
     * Convert the StripeContext to its string representation.
     *
     * @return A string with segments joined by "/"
     */
    @Override
    public String toString() {
        return String.join("/", segments);
    }
}