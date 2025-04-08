// File generated from our OpenAPI spec
package com.stripe.model.privacy;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The objects to redact, grouped by type. All redactable objects associated with these objects will
 * be redacted as well.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RedactionJobRootObjects extends StripeObject {
  @SerializedName("charges")
  List<String> charges;

  @SerializedName("checkout_sessions")
  List<String> checkoutSessions;

  @SerializedName("customers")
  List<String> customers;

  @SerializedName("identity_verification_sessions")
  List<String> identityVerificationSessions;

  @SerializedName("invoices")
  List<String> invoices;

  @SerializedName("issuing_cardholders")
  List<String> issuingCardholders;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code privacy.redaction_job_root_objects}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("payment_intents")
  List<String> paymentIntents;

  @SerializedName("radar_value_list_items")
  List<String> radarValueListItems;

  @SerializedName("setup_intents")
  List<String> setupIntents;
}
