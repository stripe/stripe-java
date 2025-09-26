package com.stripe;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StripeContextTest {

  @Test
  public void testDefaultConstructor() {
    StripeContext context = new StripeContext();
    assertEquals(Collections.emptyList(), context.getSegments());
  }

  @Test
  public void testConstructorWithSegments() {
    List<String> segments = Arrays.asList("a", "b", "c");
    StripeContext context = new StripeContext(segments);
    assertEquals(segments, context.getSegments());
  }

  @Test
  public void testConstructorWithNullSegments() {
    StripeContext context = new StripeContext(null);
    assertEquals(Collections.emptyList(), context.getSegments());
  }

  @Test
  public void testPush() {
    StripeContext context = new StripeContext(Arrays.asList("a", "b"));
    StripeContext newContext = context.push("c");

    // Original context unchanged
    assertEquals(Arrays.asList("a", "b"), context.getSegments());
    // New context has added segment
    assertEquals(Arrays.asList("a", "b", "c"), newContext.getSegments());
    // Different objects
    assertNotSame(context, newContext);
  }

  @Test
  public void testPopWithSegments() {
    StripeContext context = new StripeContext(Arrays.asList("a", "b", "c"));
    StripeContext newContext = context.pop();

    // Original context unchanged
    assertEquals(Arrays.asList("a", "b", "c"), context.getSegments());
    // New context has removed last segment
    assertEquals(Arrays.asList("a", "b"), newContext.getSegments());
    // Different objects
    assertNotSame(context, newContext);
  }

  @Test
  public void testPopEmpty() {
    StripeContext context = new StripeContext();
    assertThrows(IllegalStateException.class, () -> context.pop());
  }

  @Test
  public void testToStringEmpty() {
    StripeContext context = new StripeContext();
    // useful for clearing context
    assertEquals("", context.toString());
  }

  @Test
  public void testToStringSingleSegment() {
    StripeContext context = new StripeContext(Arrays.asList("a"));
    assertEquals("a", context.toString());
  }

  @Test
  public void testToStringMultipleSegments() {
    StripeContext context = new StripeContext(Arrays.asList("a", "b", "c"));
    assertEquals("a/b/c", context.toString());
  }

  @Test
  public void testParseEmptyString() {
    StripeContext context = StripeContext.parse("");
    assertEquals(Collections.emptyList(), context.getSegments());
  }

  @Test
  public void testParseNull() {
    StripeContext context = StripeContext.parse(null);
    assertEquals(Collections.emptyList(), context.getSegments());
  }

  @Test
  public void testParseSingleSegment() {
    StripeContext context = StripeContext.parse("a");
    assertEquals(Arrays.asList("a"), context.getSegments());
  }

  @Test
  public void testParseMultipleSegments() {
    StripeContext context = StripeContext.parse("a/b/c");
    assertEquals(Arrays.asList("a", "b", "c"), context.getSegments());
  }

  @Test
  public void testEquals() {
    StripeContext context1 = new StripeContext(Arrays.asList("a", "b"));
    StripeContext context2 = new StripeContext(Arrays.asList("a", "b"));
    StripeContext context3 = new StripeContext(Arrays.asList("a", "c"));

    assertEquals(context1, context2);
    assertNotEquals(context1, context3);
    assertNotEquals(context1, "a/b");
    assertNotEquals(context1, null);
  }

  @Test
  public void testHashCode() {
    StripeContext context1 = new StripeContext(Arrays.asList("a", "b"));
    StripeContext context2 = new StripeContext(Arrays.asList("a", "b"));

    assertEquals(context1.hashCode(), context2.hashCode());
  }

  @Test
  public void testImmutableSegments() {
    List<String> originalSegments = Arrays.asList("a", "b");
    StripeContext context = new StripeContext(originalSegments);

    // Getting segments should return an unmodifiable list
    List<String> segments = context.getSegments();
    assertThrows(UnsupportedOperationException.class, () -> segments.add("c"));
  }

  @Test
  public void testContextManipulationPattern() {
    // Common usage: start with base context, add child contexts
    StripeContext base = StripeContext.parse("workspace_123");
    StripeContext child = base.push("account_456");
    StripeContext grandchild = child.push("customer_789");

    assertEquals("workspace_123", base.toString());
    assertEquals("workspace_123/account_456", child.toString());
    assertEquals("workspace_123/account_456/customer_789", grandchild.toString());

    // Go back up the hierarchy
    StripeContext backToChild = grandchild.pop();
    StripeContext backToBase = backToChild.pop();

    assertEquals("workspace_123/account_456", backToChild.toString());
    assertEquals("workspace_123", backToBase.toString());
  }

  @Test
  public void testContextImmutability() {
    StripeContext original = new StripeContext(Arrays.asList("a", "b"));

    // Multiple operations on the same context
    StripeContext pushed = original.push("c");
    StripeContext popped = original.pop();

    // Original remains unchanged
    assertEquals(Arrays.asList("a", "b"), original.getSegments());
    assertEquals(Arrays.asList("a", "b", "c"), pushed.getSegments());
    assertEquals(Arrays.asList("a"), popped.getSegments());

    // All are different objects
    assertNotSame(original, pushed);
    assertNotSame(original, popped);
    assertNotSame(pushed, popped);
  }
}
