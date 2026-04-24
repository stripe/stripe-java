// File generated from our OpenAPI spec
package com.stripe.events;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.core.Event;
import com.stripe.model.v2.core.Event.RelatedObject;
import com.stripe.model.v2.extend.WorkflowRun;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class V2ExtendWorkflowRunFailedEvent extends Event {
  /** Data for the v2.extend.workflow_run.failed event. */
  @SerializedName("data")
  V2ExtendWorkflowRunFailedEvent.EventData data;

  @Getter
  @Setter
  public static final class EventData {
    /** A Stripe dashboard URL with more information about the Workflow Run failure. */
    @SerializedName("dashboard_url")
    String dashboardUrl;
    /** Details about the Workflow Run's transition into the FAILED state. */
    @SerializedName("failure_details")
    FailureDetails failureDetails;

    public static final class FailureDetails {
      /** Optional details about the failure result. */
      @SerializedName("error_message")
      String errorMessage;
    }
  }

  @SerializedName("related_object")

  /** Object containing the reference to API resource relevant to the event. */
  RelatedObject relatedObject;

  /** Retrieves the related object from the API. Make an API request on every call. */
  public WorkflowRun fetchRelatedObject() throws StripeException {
    return (WorkflowRun) super.fetchRelatedObject(this.relatedObject);
  }
}
