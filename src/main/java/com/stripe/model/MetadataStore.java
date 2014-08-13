package com.stripe.model;

import java.util.Map;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;

/**
 * Common interface for Stripe objects that can store metadata.
 */
public interface MetadataStore<T> {
	Map<String, String> getMetadata();
	void setMetadata(Map<String, String> metadata);
}
