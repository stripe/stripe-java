// Stub — provides v1 EventDataClassLookup referenced by StripeObject deserialization.
package com.stripe.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Event data class look up used in event deserialization. The key to look up is {@code object}
 * string of the model.
 *
 * <p>For internal use by Stripe SDK only.
 */
public final class EventDataClassLookup {
  public static final Map<String, Class<? extends StripeObject>> classLookup = new HashMap<>();

  static {
    // Lookup map will be populated by generated code
  }
}
