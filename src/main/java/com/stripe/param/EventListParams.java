package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;

public class EventListParams extends ApiRequestParams {
  @SerializedName("created")
  Object created;

  /**
   * Filter events by whether all webhooks were successfully delivered. If false, events which are
   * still pending or have failed all delivery attempts to a webhook endpoint will be returned.
   */
  @SerializedName("delivery_success")
  Boolean deliverySuccess;

  /**
   * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with
   * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
   * previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * A string containing a specific event name, or group of events using * as a wildcard. The list
   * will be filtered to include only events with a matching event property.
   */
  @SerializedName("type")
  String type;

  /**
   * An array of up to 20 strings containing specific event names. The list will be filtered to
   * include only events with a matching event property. You may pass either `type` or `types`, but
   * not both.
   */
  @SerializedName("types")
  List<String> types;

  private EventListParams(
      Object created,
      Boolean deliverySuccess,
      String endingBefore,
      List<String> expand,
      Long limit,
      String startingAfter,
      String type,
      List<String> types) {
    this.created = created;
    this.deliverySuccess = deliverySuccess;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.type = type;
    this.types = types;
  }

  public static Builder builder() {
    return new com.stripe.param.EventListParams.Builder();
  }

  public static class Builder {
    private Object created;

    private Boolean deliverySuccess;

    private String endingBefore;

    private List<String> expand;

    private Long limit;

    private String startingAfter;

    private String type;

    private List<String> types;

    /** Finalize and obtain parameter instance from this builder. */
    public EventListParams build() {
      return new EventListParams(
          this.created,
          this.deliverySuccess,
          this.endingBefore,
          this.expand,
          this.limit,
          this.startingAfter,
          this.type,
          this.types);
    }

    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /**
     * Filter events by whether all webhooks were successfully delivered. If false, events which are
     * still pending or have failed all delivery attempts to a webhook endpoint will be returned.
     */
    public Builder setDeliverySuccess(Boolean deliverySuccess) {
      this.deliverySuccess = deliverySuccess;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EventListParams#expand} for the field documentation.
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
     * EventListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
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

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * A string containing a specific event name, or group of events using * as a wildcard. The list
     * will be filtered to include only events with a matching event property.
     */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    /**
     * Add an element to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EventListParams#types} for the field documentation.
     */
    public Builder addType(String element) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.add(element);
      return this;
    }

    /**
     * Add all elements to `types` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EventListParams#types} for the field documentation.
     */
    public Builder addAllType(List<String> elements) {
      if (this.types == null) {
        this.types = new ArrayList<>();
      }
      this.types.addAll(elements);
      return this;
    }
  }

  public static class Created {
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

    private Created(Long gt, Long gte, Long lt, Long lte) {
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new com.stripe.param.EventListParams.Created.Builder();
    }

    public static class Builder {
      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public Created build() {
        return new Created(this.gt, this.gte, this.lt, this.lte);
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
}
