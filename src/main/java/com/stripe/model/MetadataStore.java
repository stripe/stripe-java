package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;
import java.util.Map;

/** Common interface for Stripe objects that can store metadata. */
public interface MetadataStore<T extends MetadataStore<T>> extends HasId {
  Map<String, String> getMetadata();

  T update(Map<String, Object> params) throws StripeException;

  T update(Map<String, Object> params, RequestOptions options) throws StripeException;
}
