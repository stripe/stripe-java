// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.RequestOptions;
import java.util.Map;

public interface PaymentSource extends StripeObjectInterface, HasId {
  PaymentSource update(Map<String, Object> params, RequestOptions options) throws StripeException;

  PaymentSource update(Map<String, Object> params) throws StripeException;
}
