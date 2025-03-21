// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class EventDestinationUpdateParams extends ApiRequestParams {
  /** An optional description of what the event destination is used for. */
  @SerializedName("description")
  Object description;

  /** The list of events to enable for this endpoint. */
  @SerializedName("enabled_events")
  List<String> enabledEvents;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Additional fields to include in the response. Currently supports {@code webhook_endpoint.url}.
   */
  @SerializedName("include")
  List<EventDestinationUpdateParams.Include> include;

  /** Metadata. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  /** Event destination name. */
  @SerializedName("name")
  Object name;

  /** Webhook endpoint configuration. */
  @SerializedName("webhook_endpoint")
  WebhookEndpoint webhookEndpoint;

  private EventDestinationUpdateParams(
      Object description,
      List<String> enabledEvents,
      Map<String, Object> extraParams,
      List<EventDestinationUpdateParams.Include> include,
      Map<String, Object> metadata,
      Object name,
      WebhookEndpoint webhookEndpoint) {
    this.description = description;
    this.enabledEvents = enabledEvents;
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.name = name;
    this.webhookEndpoint = webhookEndpoint;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object description;

    private List<String> enabledEvents;

    private Map<String, Object> extraParams;

    private List<EventDestinationUpdateParams.Include> include;

    private Map<String, Object> metadata;

    private Object name;

    private WebhookEndpoint webhookEndpoint;

    /** Finalize and obtain parameter instance from this builder. */
    public EventDestinationUpdateParams build() {
      return new EventDestinationUpdateParams(
          this.description,
          this.enabledEvents,
          this.extraParams,
          this.include,
          this.metadata,
          this.name,
          this.webhookEndpoint);
    }

    /** An optional description of what the event destination is used for. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** An optional description of what the event destination is used for. */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `enabledEvents` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationUpdateParams#enabledEvents} for the field documentation.
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
     * EventDestinationUpdateParams#enabledEvents} for the field documentation.
     */
    public Builder addAllEnabledEvent(List<String> elements) {
      if (this.enabledEvents == null) {
        this.enabledEvents = new ArrayList<>();
      }
      this.enabledEvents.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * EventDestinationUpdateParams#extraParams} for the field documentation.
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
     * See {@link EventDestinationUpdateParams#extraParams} for the field documentation.
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
     * EventDestinationUpdateParams#include} for the field documentation.
     */
    public Builder addInclude(EventDestinationUpdateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationUpdateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<EventDestinationUpdateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * EventDestinationUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * EventDestinationUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * EventDestinationUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Event destination name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Event destination name. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    /** Webhook endpoint configuration. */
    public Builder setWebhookEndpoint(
        EventDestinationUpdateParams.WebhookEndpoint webhookEndpoint) {
      this.webhookEndpoint = webhookEndpoint;
      return this;
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
    Object url;

    private WebhookEndpoint(Map<String, Object> extraParams, Object url) {
      this.extraParams = extraParams;
      this.url = url;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object url;

      /** Finalize and obtain parameter instance from this builder. */
      public EventDestinationUpdateParams.WebhookEndpoint build() {
        return new EventDestinationUpdateParams.WebhookEndpoint(this.extraParams, this.url);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * EventDestinationUpdateParams.WebhookEndpoint#extraParams} for the field documentation.
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
       * See {@link EventDestinationUpdateParams.WebhookEndpoint#extraParams} for the field
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

      /** <strong>Required.</strong> The URL of the webhook endpoint. */
      public Builder setUrl(EmptyParam url) {
        this.url = url;
        return this;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("webhook_endpoint.url")
    WEBHOOK_ENDPOINT__URL("webhook_endpoint.url");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
