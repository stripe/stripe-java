// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Set up an event destination to receive events from Stripe across multiple destination types,
 * including <a href="https://docs.stripe.com/webhooks">webhook endpoints</a>, <a
 * href="https://docs.stripe.com/event-destinations/eventbridge">Amazon EventBridge</a>, and <a
 * href="https://docs.stripe.com/event-destinations/eventgrid">Azure Event Grid</a>. Event
 * destinations support receiving <a href="https://docs.stripe.com/api/v2/events">thin events</a>
 * and <a href="https://docs.stripe.com/api/events">snapshot events</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EventDestination extends StripeObject implements HasId {
  /** Configuration for delivering events through an Amazon EventBridge partner event source. */
  @SerializedName("amazon_eventbridge")
  AmazonEventbridge amazonEventbridge;

  /** Configuration for delivering events through an Azure Event Grid partner topic. */
  @SerializedName("azure_event_grid")
  AzureEventGrid azureEventGrid;

  /** The time when the destination was created. */
  @SerializedName("created")
  Instant created;

  /** An optional user-defined description of the destination's purpose. */
  @SerializedName("description")
  String description;

  /** The list of event types enabled for delivery to this destination. */
  @SerializedName("enabled_events")
  List<String> enabledEvents;

  /**
   * Whether to deliver as snapshot or thin events.
   *
   * <p>One of {@code snapshot}, or {@code thin}.
   */
  @SerializedName("event_payload")
  String eventPayload;

  /**
   * Specifies which accounts' events route to this destination. {@code @self}: Receive events from
   * the account that owns the event destination. {@code @accounts}: Receive events emitted from
   * other accounts you manage which includes your v1 and v2 accounts.
   * {@code @organization_members}: Receive events from accounts directly linked to the
   * organization. {@code @organization_members/@accounts}: Receive events from all accounts
   * connected to any platform accounts in the organization.
   */
  @SerializedName("events_from")
  List<String> eventsFrom;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * User-defined key/value data for the destination; it has no effect on event matching or
   * delivery.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A user-defined label for identifying the destination in Stripe. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.event_destination}.
   */
  @SerializedName("object")
  String object;

  /**
   * For snapshot events only, the Stripe API version used to render event objects. You can't change
   * this value after you create the event destination. Thin events are not pinned to an API
   * version.
   */
  @SerializedName("snapshot_api_version")
  String snapshotApiVersion;

  /**
   * Whether Stripe currently attempts delivery. Stripe attempts delivery to enabled destinations
   * when their provider configuration is active; disabled destinations do not receive delivery
   * attempts.
   *
   * <p>One of {@code disabled}, or {@code enabled}.
   */
  @SerializedName("status")
  String status;

  /** Additional lifecycle context for the destination status, when available. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /**
   * The delivery transport. Chosen when the destination is created and cannot be changed by update.
   *
   * <p>One of {@code amazon_eventbridge}, {@code azure_event_grid}, or {@code webhook_endpoint}.
   */
  @SerializedName("type")
  String type;

  /** The time when the destination object was last updated. */
  @SerializedName("updated")
  Instant updated;

  /**
   * Configuration for delivering events to a webhook endpoint. Live mode requires HTTPS; sandbox
   * mode also supports HTTP.
   */
  @SerializedName("webhook_endpoint")
  WebhookEndpoint webhookEndpoint;

  /** Configuration for delivering events through an Amazon EventBridge partner event source. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmazonEventbridge extends StripeObject {
    /** The AWS account ID that owns the event bus receiving events. */
    @SerializedName("aws_account_id")
    String awsAccountId;

    /** The ARN of the Stripe-created partner event source in your AWS account. */
    @SerializedName("aws_event_source_arn")
    String awsEventSourceArn;

    /**
     * The AWS-reported lifecycle state of the partner event source.
     *
     * <p>One of {@code active}, {@code deleted}, {@code pending}, or {@code unknown}.
     */
    @SerializedName("aws_event_source_status")
    String awsEventSourceStatus;
  }

  /** Configuration for delivering events through an Azure Event Grid partner topic. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AzureEventGrid extends StripeObject {
    /** The name of the Stripe-created partner topic that receives events. */
    @SerializedName("azure_partner_topic_name")
    String azurePartnerTopicName;

    /**
     * The Azure-reported lifecycle state of the partner topic.
     *
     * <p>One of {@code activated}, {@code deleted}, {@code never_activated}, or {@code unknown}.
     */
    @SerializedName("azure_partner_topic_status")
    String azurePartnerTopicStatus;

    /** The Azure region where the partner topic is located. */
    @SerializedName("azure_region")
    String azureRegion;

    /** The Azure resource group containing the partner topic. */
    @SerializedName("azure_resource_group_name")
    String azureResourceGroupName;

    /** The Azure subscription containing the resource group and partner topic. */
    @SerializedName("azure_subscription_id")
    String azureSubscriptionId;
  }

  /** Additional lifecycle context for the destination status, when available. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /**
     * Present when the destination was disabled; identifies the cause, time, and provider-side
     * object involved when available.
     */
    @SerializedName("disabled")
    Disabled disabled;

    /**
     * Present when the destination was disabled; identifies the cause, time, and provider-side
     * object involved when available.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Disabled extends StripeObject {
      /**
       * Reason event destination has been disabled.
       *
       * <p>One of {@code no_aws_event_source_exists}, {@code no_azure_partner_topic_exists}, or
       * {@code user}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /**
   * Configuration for delivering events to a webhook endpoint. Live mode requires HTTPS; sandbox
   * mode also supports HTTP.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class WebhookEndpoint extends StripeObject {
    /**
     * The secret used to verify Stripe signatures on delivered events. Returned only in the create
     * response when explicitly included; public API clients cannot retrieve it later.
     */
    @SerializedName("signing_secret")
    String signingSecret;

    /**
     * The URL where Stripe sends matching events. Live mode requires HTTPS; sandbox mode also
     * supports HTTP. Returned only when explicitly included.
     */
    @SerializedName("url")
    String url;
  }
}
