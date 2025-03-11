// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class EventDestinationCreateParams extends ApiRequestParams {
  /** Amazon EventBridge configuration. */
  @SerializedName("amazon_eventbridge")
  AmazonEventbridge amazonEventbridge;

  /** An optional description of what the event destination is used for. */
  @SerializedName("description")
  String description;

  /** <strong>Required.</strong> The list of events to enable for this endpoint. */
  @SerializedName("enabled_events")
  List<String> enabledEvents;

  /** <strong>Required.</strong> Payload type of events being subscribed to. */
  @SerializedName("event_payload")
  EventPayload eventPayload;

  /** Where events should be routed from. */
  @SerializedName("events_from")
  List<EventDestinationCreateParams.EventsFrom> eventsFrom;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<EventDestinationCreateParams.Include> include;

  /** Metadata. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> Event destination name. */
  @SerializedName("name")
  String name;

  /** If using the snapshot event payload, the API version events are rendered as. */
  @SerializedName("snapshot_api_version")
  String snapshotApiVersion;

  /** <strong>Required.</strong> Event destination type. */
  @SerializedName("type")
  Type type;

  /** Webhook endpoint configuration. */
  @SerializedName("webhook_endpoint")
  WebhookEndpoint webhookEndpoint;

  private EventDestinationCreateParams(
      AmazonEventbridge amazonEventbridge,
      String description,
      List<String> enabledEvents,
      EventPayload eventPayload,
      List<EventDestinationCreateParams.EventsFrom> eventsFrom,
      Map<String, Object> extraParams,
      List<EventDestinationCreateParams.Include> include,
      Map<String, String> metadata,
      String name,
      String snapshotApiVersion,
      Type type,
      WebhookEndpoint webhookEndpoint) {
    this.amazonEventbridge = amazonEventbridge;
    this.description = description;
    this.enabledEvents = enabledEvents;
    this.eventPayload = eventPayload;
    this.eventsFrom = eventsFrom;
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.name = name;
    this.snapshotApiVersion = snapshotApiVersion;
    this.type = type;
    this.webhookEndpoint = webhookEndpoint;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AmazonEventbridge amazonEventbridge;

    private String description;

    private List<String> enabledEvents;

    private EventPayload eventPayload;

    private List<EventDestinationCreateParams.EventsFrom> eventsFrom;

    private Map<String, Object> extraParams;

    private List<EventDestinationCreateParams.Include> include;

    private Map<String, String> metadata;

    private String name;

    private String snapshotApiVersion;

    private Type type;

    private WebhookEndpoint webhookEndpoint;

    /** Finalize and obtain parameter instance from this builder. */
    public EventDestinationCreateParams build() {
      return new EventDestinationCreateParams(
          this.amazonEventbridge,
          this.description,
          this.enabledEvents,
          this.eventPayload,
          this.eventsFrom,
          this.extraParams,
          this.include,
          this.metadata,
          this.name,
          this.snapshotApiVersion,
          this.type,
          this.webhookEndpoint);
    }

    /** Amazon EventBridge configuration. */
    public Builder setAmazonEventbridge(
        EventDestinationCreateParams.AmazonEventbridge amazonEventbridge) {
      this.amazonEventbridge = amazonEventbridge;
      return this;
    }

    /** An optional description of what the event destination is used for. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationCreateParams#enabledEvents} for the field documentation.
     */
    public Builder addEnabledEvent(String element) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.add(element);
      return this;
    }

    /**
     * Add all elements to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationCreateParams#enabledEvents} for the field documentation.
     */
    public Builder addAllEnabledEvent(List<String> elements) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.addAll(elements);
      return this;
    }

    /** <strong>Required.</strong> Payload type of events being subscribed to. */
    public Builder setEventPayload(EventDestinationCreateParams.EventPayload eventPayload) {
      this.eventPayload = eventPayload;
      return this;
    }

    /**
     * Add an element to `eventsFrom` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationCreateParams#eventsFrom} for the field documentation.
     */
    public Builder addEventsFrom(EventDestinationCreateParams.EventsFrom element) {
      if (this.eventsFrom == null) {
        this.eventsFrom = new ArrayList<>();
      }
      this.eventsFrom.add(element);
      return this;
    }

    /**
     * Add all elements to `eventsFrom` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationCreateParams#eventsFrom} for the field documentation.
     */
    public Builder addAllEventsFrom(List<EventDestinationCreateParams.EventsFrom> elements) {
      if (this.eventsFrom == null) {
        this.eventsFrom = new ArrayList<>();
      }
      this.eventsFrom.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * EventDestinationCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link EventDestinationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationCreateParams#include} for the field documentation.
     */
    public Builder addInclude(EventDestinationCreateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationCreateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<EventDestinationCreateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * EventDestinationCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link EventDestinationCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Event destination name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** If using the snapshot event payload, the API version events are rendered as. */
    public Builder setSnapshotApiVersion(String snapshotApiVersion) {
      this.snapshotApiVersion = snapshotApiVersion;
      return this;
    }

    /** <strong>Required.</strong> Event destination type. */
    public Builder setType(EventDestinationCreateParams.Type type) {
      this.type = type;
      return this;
    }

    /** Webhook endpoint configuration. */
    public Builder setWebhookEndpoint(
        EventDestinationCreateParams.WebhookEndpoint webhookEndpoint) {
      this.webhookEndpoint = webhookEndpoint;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AmazonEventbridge {
    /** <strong>Required.</strong> The AWS account ID. */
    @SerializedName("aws_account_id")
    String awsAccountId;

    /** <strong>Required.</strong> The region of the AWS event source. */
    @SerializedName("aws_region")
    String awsRegion;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AmazonEventbridge(
        String awsAccountId, String awsRegion, Map<String, Object> extraParams) {
      this.awsAccountId = awsAccountId;
      this.awsRegion = awsRegion;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String awsAccountId;

      private String awsRegion;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public EventDestinationCreateParams.AmazonEventbridge build() {
        return new EventDestinationCreateParams.AmazonEventbridge(
            this.awsAccountId, this.awsRegion, this.extraParams);
      }

      /** <strong>Required.</strong> The AWS account ID. */
      public Builder setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
      }

      /** <strong>Required.</strong> The region of the AWS event source. */
      public Builder setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * EventDestinationCreateParams.AmazonEventbridge#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link EventDestinationCreateParams.AmazonEventbridge#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class WebhookEndpoint {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The URL of the webhook endpoint. */
    @SerializedName("url")
    String url;

    private WebhookEndpoint(Map<String, Object> extraParams, String url) {
      this.extraParams = extraParams;
      this.url = url;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String url;

      /** Finalize and obtain parameter instance from this builder. */
      public EventDestinationCreateParams.WebhookEndpoint build() {
        return new EventDestinationCreateParams.WebhookEndpoint(this.extraParams, this.url);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * EventDestinationCreateParams.WebhookEndpoint#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link EventDestinationCreateParams.WebhookEndpoint#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The URL of the webhook endpoint. */
      public Builder setUrl(String url) {
        this.url = url;
        return this;
      }
    }
  }

  public enum EventPayload implements ApiRequestParams.EnumParam {
    @SerializedName("snapshot")
    SNAPSHOT("snapshot"),

    @SerializedName("thin")
    THIN("thin");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EventPayload(String value) {
      this.value = value;
    }
  }

  public enum EventsFrom implements ApiRequestParams.EnumParam {
    @SerializedName("other_accounts")
    OTHER_ACCOUNTS("other_accounts"),

    @SerializedName("self")
    SELF("self");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EventsFrom(String value) {
      this.value = value;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("webhook_endpoint.signing_secret")
    WEBHOOK_ENDPOINT__SIGNING_SECRET("webhook_endpoint.signing_secret"),

    @SerializedName("webhook_endpoint.url")
    WEBHOOK_ENDPOINT__URL("webhook_endpoint.url");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("amazon_eventbridge")
    AMAZON_EVENTBRIDGE("amazon_eventbridge"),

    @SerializedName("webhook_endpoint")
    WEBHOOK_ENDPOINT("webhook_endpoint");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
