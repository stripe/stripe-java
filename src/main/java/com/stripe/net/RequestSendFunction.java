package com.stripe.net;

import com.stripe.exception.StripeException;

@FunctionalInterface
interface RequestSendFunction<R> {
  R apply(StripeRequest request) throws StripeException;
}
