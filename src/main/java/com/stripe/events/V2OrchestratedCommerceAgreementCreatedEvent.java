// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.orchestratedcommerce.Agreement;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2OrchestratedCommerceAgreementCreatedEvent extends Event {
  /** Data for the v2.orchestrated_commerce.agreement.created event. */
  @SerializedName("data")
  V2OrchestratedCommerceAgreementCreatedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** The time at which the agreement was created. */
    @SerializedName("created")
    Instant created;
    /**
     * The party that initiated the agreement.
     *
     * <p>One of {@code orchestrator}, or {@code seller}.
     */
    @SerializedName("initiated_by")
    String initiatedBy;
    /** Details about the orchestrator. */
    @SerializedName("orchestrator_details")
    OrchestratorDetails orchestratorDetails;
    /** Details about the seller. */
    @SerializedName("seller_details")
    SellerDetails sellerDetails;

    public static final class OrchestratorDetails {
      /**
       * The name of the orchestrator. This can be the name of the agent or the name of the
       * business.
       */
      @SerializedName("name")
      String name;
      /** The Network ID of the orchestrator. */
      @SerializedName("network_business_profile")
      String networkBusinessProfile;
    }

    public static final class SellerDetails {
      /** The Network ID of the seller. */
      @SerializedName("network_business_profile")
      String networkBusinessProfile;
    }
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public Agreement fetchRelatedObject() throws StripeException {
    return (Agreement) super.fetchRelatedObject(this.relatedObject);
  }
}
