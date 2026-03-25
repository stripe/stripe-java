// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class BatchJobCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The endpoint configuration for the batch job. */
  @SerializedName("endpoint")
  Endpoint endpoint;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Optional field that allows the user to control how fast they want this batch job to run. Gives
   * them a control over the number of webhooks they receive.
   */
  @SerializedName("maximum_rps")
  Long maximumRps;

  /** <strong>Required.</strong> The metadata of the {@code BatchJob} object. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Notification suppression settings for the batch job. */
  @SerializedName("notification_suppression")
  NotificationSuppression notificationSuppression;

  /** <strong>Required.</strong> Allows the user to skip validation. */
  @SerializedName("skip_validation")
  Boolean skipValidation;

  private BatchJobCreateParams(
      Endpoint endpoint,
      Map<String, Object> extraParams,
      Long maximumRps,
      Map<String, String> metadata,
      NotificationSuppression notificationSuppression,
      Boolean skipValidation) {
    this.endpoint = endpoint;
    this.extraParams = extraParams;
    this.maximumRps = maximumRps;
    this.metadata = metadata;
    this.notificationSuppression = notificationSuppression;
    this.skipValidation = skipValidation;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Endpoint endpoint;

    private Map<String, Object> extraParams;

    private Long maximumRps;

    private Map<String, String> metadata;

    private NotificationSuppression notificationSuppression;

    private Boolean skipValidation;

    /** Finalize and obtain parameter instance from this builder. */
    public BatchJobCreateParams build() {
      return new BatchJobCreateParams(
          this.endpoint,
          this.extraParams,
          this.maximumRps,
          this.metadata,
          this.notificationSuppression,
          this.skipValidation);
    }

    /** <strong>Required.</strong> The endpoint configuration for the batch job. */
    public Builder setEndpoint(BatchJobCreateParams.Endpoint endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * BatchJobCreateParams#extraParams} for the field documentation.
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
     * See {@link BatchJobCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Optional field that allows the user to control how fast they want this batch job to run.
     * Gives them a control over the number of webhooks they receive.
     */
    public Builder setMaximumRps(Long maximumRps) {
      this.maximumRps = maximumRps;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * BatchJobCreateParams#metadata} for the field documentation.
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
     * See {@link BatchJobCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Notification suppression settings for the batch job. */
    public Builder setNotificationSuppression(
        BatchJobCreateParams.NotificationSuppression notificationSuppression) {
      this.notificationSuppression = notificationSuppression;
      return this;
    }

    /** <strong>Required.</strong> Allows the user to skip validation. */
    public Builder setSkipValidation(Boolean skipValidation) {
      this.skipValidation = skipValidation;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Endpoint {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The HTTP method to use when calling the endpoint. */
    @SerializedName("http_method")
    HttpMethod httpMethod;

    /**
     * <strong>Required.</strong> The path of the endpoint to run this batch job against. In the
     * form used in the documentation. For instance, for subscription migration this would be {@code
     * /v1/subscriptions/:id/migrate}.
     */
    @SerializedName("path")
    Path path;

    private Endpoint(Map<String, Object> extraParams, HttpMethod httpMethod, Path path) {
      this.extraParams = extraParams;
      this.httpMethod = httpMethod;
      this.path = path;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private HttpMethod httpMethod;

      private Path path;

      /** Finalize and obtain parameter instance from this builder. */
      public BatchJobCreateParams.Endpoint build() {
        return new BatchJobCreateParams.Endpoint(this.extraParams, this.httpMethod, this.path);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BatchJobCreateParams.Endpoint#extraParams} for the field documentation.
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
       * See {@link BatchJobCreateParams.Endpoint#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The HTTP method to use when calling the endpoint. */
      public Builder setHttpMethod(BatchJobCreateParams.Endpoint.HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
        return this;
      }

      /**
       * <strong>Required.</strong> The path of the endpoint to run this batch job against. In the
       * form used in the documentation. For instance, for subscription migration this would be
       * {@code /v1/subscriptions/:id/migrate}.
       */
      public Builder setPath(BatchJobCreateParams.Endpoint.Path path) {
        this.path = path;
        return this;
      }
    }

    public enum HttpMethod implements ApiRequestParams.EnumParam {
      @SerializedName("post")
      POST("post");

      @Getter(onMethod_ = {@Override})
      private final String value;

      HttpMethod(String value) {
        this.value = value;
      }
    }

    public enum Path implements ApiRequestParams.EnumParam {
      @SerializedName("/v1/accounts/:account")
      V1_ACCOUNT_UPDATE("/v1/accounts/:account"),

      @SerializedName("/v1/credit_notes")
      V1_CREDIT_NOTE_CREATE("/v1/credit_notes"),

      @SerializedName("/v1/customers/:customer")
      V1_CUSTOMER_UPDATE("/v1/customers/:customer"),

      @SerializedName("/v1/invoices/:invoice")
      V1_INVOICE_UPDATE("/v1/invoices/:invoice"),

      @SerializedName("/v1/invoices/:invoice/pay")
      V1_INVOICE_PAY("/v1/invoices/:invoice/pay"),

      @SerializedName("/v1/promotion_codes")
      V1_PROMOTION_CODE_CREATE("/v1/promotion_codes"),

      @SerializedName("/v1/promotion_codes/:promotion_code")
      V1_PROMOTION_CODE_UPDATE("/v1/promotion_codes/:promotion_code"),

      @SerializedName("/v1/subscriptions/:subscription_exposed_id")
      V1_SUBSCRIPTION_UPDATE("/v1/subscriptions/:subscription_exposed_id"),

      @SerializedName("/v1/subscriptions/:subscription/migrate")
      V1_SUBSCRIPTION_MIGRATE("/v1/subscriptions/:subscription/migrate"),

      @SerializedName("/v1/subscription_schedules")
      V1_SUBSCRIPTION_SCHEDULE_CREATE("/v1/subscription_schedules"),

      @SerializedName("/v1/subscription_schedules/:schedule")
      V1_SUBSCRIPTION_SCHEDULE_UPDATE("/v1/subscription_schedules/:schedule"),

      @SerializedName("/v1/subscription_schedules/:schedule/cancel")
      V1_SUBSCRIPTION_SCHEDULE_CANCEL("/v1/subscription_schedules/:schedule/cancel");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Path(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class NotificationSuppression {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The scope of notification suppression. */
    @SerializedName("scope")
    Scope scope;

    private NotificationSuppression(Map<String, Object> extraParams, Scope scope) {
      this.extraParams = extraParams;
      this.scope = scope;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Scope scope;

      /** Finalize and obtain parameter instance from this builder. */
      public BatchJobCreateParams.NotificationSuppression build() {
        return new BatchJobCreateParams.NotificationSuppression(this.extraParams, this.scope);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BatchJobCreateParams.NotificationSuppression#extraParams} for the field documentation.
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
       * See {@link BatchJobCreateParams.NotificationSuppression#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The scope of notification suppression. */
      public Builder setScope(BatchJobCreateParams.NotificationSuppression.Scope scope) {
        this.scope = scope;
        return this;
      }
    }

    public enum Scope implements ApiRequestParams.EnumParam {
      @SerializedName("all")
      ALL("all"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Scope(String value) {
        this.value = value;
      }
    }
  }
}
