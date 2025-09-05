// File generated from our OpenAPI spec
package com.stripe.model.v2;

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
 * including <a href="https://docs.stripe.com/webhooks">webhook endpoints</a> and <a
 * href="https://docs.stripe.com/event-destinations/eventbridge">Amazon EventBridge</a>. Event
 * destinations support receiving <a href="https://docs.stripe.com/api/v2/events">thin events</a>
 * and <a href="https://docs.stripe.com/api/events">snapshot events</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EventDestination extends StripeObject implements HasId {
  /** Amazon EventBridge configuration. */
  @SerializedName("amazon_eventbridge")
  AmazonEventbridge amazonEventbridge;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** An optional description of what the event destination is used for. */
  @SerializedName("description")
  String description;

  /** The list of events to enable for this endpoint. */
  @SerializedName("enabled_events")
  List<String> enabledEvents;

  /**
   * Payload type of events being subscribed to.
   *
   * <p>One of {@code snapshot}, or {@code thin}.
   */
  @SerializedName("event_payload")
  String eventPayload;

  /** Where events should be routed from. */
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

  /** Metadata. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Event destination name. */
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

  /** If using the snapshot event payload, the API version events are rendered as. */
  @SerializedName("snapshot_api_version")
  String snapshotApiVersion;

  /**
   * Status. It can be set to either enabled or disabled.
   *
   * <p>One of {@code disabled}, or {@code enabled}.
   */
  @SerializedName("status")
  String status;

  /** Additional information about event destination status. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /**
   * Event destination type.
   *
   * <p>One of {@code amazon_eventbridge}, or {@code webhook_endpoint}.
   */
  @SerializedName("type")
  String type;

  /** Time at which the object was last updated. */
  @SerializedName("updated")
  Instant updated;

  /** Webhook endpoint configuration. */
  @SerializedName("webhook_endpoint")
  WebhookEndpoint webhookEndpoint;

  /** Amazon EventBridge configuration. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmazonEventbridge extends StripeObject {
    /** The AWS account ID. */
    @SerializedName("aws_account_id")
    String awsAccountId;

    /** The ARN of the AWS event source. */
    @SerializedName("aws_event_source_arn")
    String awsEventSourceArn;

    /**
     * The state of the AWS event source.
     *
     * <p>One of {@code active}, {@code deleted}, {@code pending}, or {@code unknown}.
     */
    @SerializedName("aws_event_source_status")
    String awsEventSourceStatus;
  }

  /** Additional information about event destination status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Details about why the event destination has been disabled. */
    @SerializedName("disabled")
    Disabled disabled;

    /** Details about why the event destination has been disabled. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Disabled extends StripeObject {
      /**
       * Reason event destination has been disabled.
       *
       * <p>One of {@code no_aws_event_source_exists}, or {@code user}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /** Webhook endpoint configuration. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class WebhookEndpoint extends StripeObject {
    /** The signing secret of the webhook endpoint, only includable on creation. */
    @SerializedName("signing_secret")
    String signingSecret;

    /** The URL of the webhook endpoint, includable. */
    @SerializedName("url")
    String url;
  }
}
