package com.stripe.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class StripeContextTest {
  @Test
  public void testEmptyContext() {
    StripeContext context = new StripeContext();
    assertEquals("", context.toString());
  }

  @Test
  public void testContextWithSegments() {
    StripeContext context = new StripeContext(Arrays.asList("a", "b", "c"));
    assertEquals("a/b/c", context.toString());
  }

  @Test
  public void testParseEmptyString() {
    StripeContext context = StripeContext.parse("");
    assertEquals("", context.toString());
  }

  @Test
  public void testParseNullString() {
    StripeContext context = StripeContext.parse(null);
    assertEquals("", context.toString());
  }

  @Test
  public void testParseSingleSegment() {
    StripeContext context = StripeContext.parse("a");
    assertEquals("a", context.toString());
  }

  @Test
  public void testParseMultipleSegments() {
    StripeContext context = StripeContext.parse("a/b/c");
    assertEquals("a/b/c", context.toString());
  }

  @Test
  public void testParentReturnsNewInstance() {
    StripeContext context = StripeContext.parse("a/b/c");
    StripeContext parent = context.parent();

    // Original unchanged
    assertEquals("a/b/c", context.toString());
    // New instance with removed segment
    assertEquals("a/b", parent.toString());
  }

  @Test
  public void testParentOfSingleSegment() {
    StripeContext context = StripeContext.parse("a");
    StripeContext parent = context.parent();
    assertEquals("", parent.toString());
  }

  @Test
  public void testParentOfEmptyContextThrowsException() {
    StripeContext context = new StripeContext();
    assertThrows(IllegalStateException.class, () -> context.parent(),
        "Cannot get parent of empty context");
  }

  @Test
  public void testChildReturnsNewInstance() {
    StripeContext context = StripeContext.parse("a/b");
    StripeContext child = context.child("c");

    // Original unchanged
    assertEquals("a/b", context.toString());
    // New instance with added segment
    assertEquals("a/b/c", child.toString());
  }

  @Test
  public void testChildOnEmptyContext() {
    StripeContext context = new StripeContext();
    StripeContext child = context.child("a");
    assertEquals("a", child.toString());
  }

  @Test
  public void testMethodChaining() {
    StripeContext context = StripeContext.parse("a");
    StripeContext result = context.child("b").child("c").parent();
    assertEquals("a/b", result.toString());
  }

  @Test
  public void testInitWithNullSegments() {
    StripeContext context = new StripeContext(null);
    assertEquals("", context.toString());
  }

  @Test
  public void testInitWithEmptyList() {
    StripeContext context = new StripeContext(Collections.emptyList());
    assertEquals("", context.toString());
  }

  @Test
  public void testEmptyContextDoesNotSetHeader() {
    StripeContext emptyContext = new StripeContext();
    RequestOptions options = RequestOptions.builder()
        .setStripeContext(emptyContext)
        .build();

    // Empty context should result in null stripeContext
    assertNull(options.getStripeContext());
  }

  @Test
  public void testNonEmptyContextSetsHeader() {
    StripeContext context = StripeContext.parse("org_123/proj_456");
    RequestOptions options = RequestOptions.builder()
        .setStripeContext(context)
        .build();

    // Non-empty context should set the header
    assertEquals("org_123/proj_456", options.getStripeContext());
  }
}