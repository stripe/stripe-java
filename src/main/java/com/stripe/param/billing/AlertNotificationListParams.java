// File generated from our OpenAPI spec
package com.stripe.param.billing;

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
public class AlertNotificationListParams extends ApiRequestParams {
  /** Filter results to only include triggered or recovered notifications. */
  @SerializedName("action")
  Action action;

  /** Filter results to only include notifications for the given billing cadence. */
  @SerializedName("cadence")
  String cadence;

  /** <strong>Required.</strong> The customer to list notifications for. */
  @SerializedName("customer")
  String customer;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Filter results to only include notifications for the given meter. */
  @SerializedName("meter")
  String meter;

  /** Filter results according to when the notification was sent. */
  @SerializedName("notified_at")
  Object notifiedAt;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** Filter results to only include notifications for the given subscription. */
  @SerializedName("subscription")
  String subscription;

  private AlertNotificationListParams(
      Action action,
      String cadence,
      String customer,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String meter,
      Object notifiedAt,
      String startingAfter,
      String subscription) {
    this.action = action;
    this.cadence = cadence;
    this.customer = customer;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.meter = meter;
    this.notifiedAt = notifiedAt;
    this.startingAfter = startingAfter;
    this.subscription = subscription;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Action action;

    private String cadence;

    private String customer;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String meter;

    private Object notifiedAt;

    private String startingAfter;

    private String subscription;

    /** Finalize and obtain parameter instance from this builder. */
    public AlertNotificationListParams build() {
      return new AlertNotificationListParams(
          this.action,
          this.cadence,
          this.customer,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.meter,
          this.notifiedAt,
          this.startingAfter,
          this.subscription);
    }

    /** Filter results to only include triggered or recovered notifications. */
    public Builder setAction(AlertNotificationListParams.Action action) {
      this.action = action;
      return this;
    }

    /** Filter results to only include notifications for the given billing cadence. */
    public Builder setCadence(String cadence) {
      this.cadence = cadence;
      return this;
    }

    /** <strong>Required.</strong> The customer to list notifications for. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AlertNotificationListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AlertNotificationListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AlertNotificationListParams#extraParams} for the field documentation.
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
     * See {@link AlertNotificationListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Filter results to only include notifications for the given meter. */
    public Builder setMeter(String meter) {
      this.meter = meter;
      return this;
    }

    /** Filter results according to when the notification was sent. */
    public Builder setNotifiedAt(AlertNotificationListParams.NotifiedAt notifiedAt) {
      this.notifiedAt = notifiedAt;
      return this;
    }

    /** Filter results according to when the notification was sent. */
    public Builder setNotifiedAt(Long notifiedAt) {
      this.notifiedAt = notifiedAt;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /** Filter results to only include notifications for the given subscription. */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class NotifiedAt {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private NotifiedAt(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public AlertNotificationListParams.NotifiedAt build() {
        return new AlertNotificationListParams.NotifiedAt(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AlertNotificationListParams.NotifiedAt#extraParams} for the field documentation.
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
       * See {@link AlertNotificationListParams.NotifiedAt#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Action implements ApiRequestParams.EnumParam {
    @SerializedName("recovered")
    RECOVERED("recovered"),

    @SerializedName("triggered")
    TRIGGERED("triggered");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Action(String value) {
      this.value = value;
    }
  }
}
