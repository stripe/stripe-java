package com.stripe.v2;

import com.stripe.model.StripeObject;

/**
 * An empty entity for API methods with a void return type. We need a class to to deserialize into,
 * but we can't instantiate the abstract `StripeObject` directly. This class shouldn't do anything.
 * It's handwritten, not auto-generated.
 */
public final class EmptyStripeObject extends StripeObject {}
