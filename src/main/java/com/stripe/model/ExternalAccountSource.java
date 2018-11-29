package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;
import java.util.Map;

public interface ExternalAccountSource extends HasId {
  ExternalAccountSource update(Map<String, Object> params) throws StripeException;

  ExternalAccountSource update(Map<String, Object> params, RequestOptions options)
      throws StripeException;

  ExternalAccountSource delete() throws StripeException;

  ExternalAccountSource delete(RequestOptions options) throws StripeException;

  ExternalAccountSource delete(Map<String, Object> params) throws StripeException;

  ExternalAccountSource delete(Map<String, Object> params, RequestOptions options)
      throws StripeException;
}
