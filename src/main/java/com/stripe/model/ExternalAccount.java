// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;
import java.util.Map;

public interface ExternalAccount extends StripeObjectInterface, HasId {
  ExternalAccount delete(String accountId, Map<String, Object> params, RequestOptions options)
      throws StripeException;

  ExternalAccount delete(String accountId) throws StripeException;

  ExternalAccount delete(String accountId, RequestOptions options) throws StripeException;

  ExternalAccount delete(String accountId, Map<String, Object> params) throws StripeException;

  ExternalAccount update(String accountId, Map<String, Object> params, RequestOptions options)
      throws StripeException;

  ExternalAccount update(String accountId, Map<String, Object> params) throws StripeException;
}
