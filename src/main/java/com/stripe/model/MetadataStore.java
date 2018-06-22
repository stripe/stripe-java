package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;

import java.util.Map;

/**
 * Common interface for Stripe objects that can store metadata.
 */
public interface MetadataStore<T> {
  Map<String, String> getMetadata();

  MetadataStore<T> update(Map<String, Object> params) throws StripeException;

  MetadataStore<T> update(Map<String, Object> params, RequestOptions options)
      throws StripeException;
}
