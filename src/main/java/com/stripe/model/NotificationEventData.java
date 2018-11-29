package com.stripe.model;

import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class NotificationEventData extends StripeObject {
  /**
   * Object containing the API resource relevant to the event. For example, an `invoice.created`
   * event will have a full [invoice object](#invoice_object) as the value of the object key.
   */
  Map<String, Object> object;

  /**
   * Object containing the names of the attributes that have changed, and their previous values
   * (sent along only with *.updated events).
   */
  Map<String, Object> previousAttributes;
}
