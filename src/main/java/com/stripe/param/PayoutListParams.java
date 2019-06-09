package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayoutListParams extends ApiRequestParams {
  @SerializedName("arrival_date")
  Object arrivalDate;

  @SerializedName("created")
  Object created;

  /** The ID of an external account - only return payouts sent to this external account. */
  @SerializedName("destination")
  String destination;

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

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** Only return payouts that have the given status: `pending`, `paid`, `failed`, or `canceled`. */
  @SerializedName("status")
  String status;

  private PayoutListParams(
      Object arrivalDate,
      Object created,
      String destination,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String startingAfter,
      String status) {

    this.arrivalDate = arrivalDate;
    this.created = created;
    this.destination = destination;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static PayoutListParams.Builder builder() {
    return new PayoutListParams.Builder();
  }

  public static class Builder {
    private Object arrivalDate;
    private Object created;
    private String destination;
    private String endingBefore;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Long limit;
    private String startingAfter;
    private String status;

    public PayoutListParams build() {
      return new PayoutListParams(
          this.arrivalDate,
          this.created,
          this.destination,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.startingAfter,
          this.status);
    }

    public PayoutListParams.Builder setArrivalDate(PayoutListParams.ArrivalDate arrivalDate) {

      this.arrivalDate = arrivalDate;
      return this;
    }

    public PayoutListParams.Builder setArrivalDate(Long arrivalDate) {
      this.arrivalDate = arrivalDate;
      return this;
    }

    public PayoutListParams.Builder setCreated(PayoutListParams.Created created) {

      this.created = created;
      return this;
    }

    public PayoutListParams.Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** The ID of an external account - only return payouts sent to this external account. */
    public PayoutListParams.Builder setDestination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public PayoutListParams.Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PayoutListParams#expand} for the field documentation.
     */
    public PayoutListParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PayoutListParams#expand} for the field documentation.
     */
    public PayoutListParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PayoutListParams#extraParams} for the field documentation.
     */
    public PayoutListParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PayoutListParams#extraParams} for the field documentation.
     */
    public PayoutListParams.Builder putAllExtraParam(Map<String, Object> map) {

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
    public PayoutListParams.Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public PayoutListParams.Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Only return payouts that have the given status: `pending`, `paid`, `failed`, or `canceled`.
     */
    public PayoutListParams.Builder setStatus(String status) {
      this.status = status;
      return this;
    }
  }

  public static class ArrivalDate {

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

    private ArrivalDate(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {

      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static PayoutListParams.ArrivalDate.Builder builder() {
      return new PayoutListParams.ArrivalDate.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public PayoutListParams.ArrivalDate build() {
        return new PayoutListParams.ArrivalDate(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PayoutListParams.ArrivalDate#extraParams} for the field documentation.
       */
      public PayoutListParams.ArrivalDate.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PayoutListParams.ArrivalDate#extraParams} for the field documentation.
       */
      public PayoutListParams.ArrivalDate.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public PayoutListParams.ArrivalDate.Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public PayoutListParams.ArrivalDate.Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public PayoutListParams.ArrivalDate.Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public PayoutListParams.ArrivalDate.Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public static class Created {

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

    private Created(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {

      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static PayoutListParams.Created.Builder builder() {
      return new PayoutListParams.Created.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public PayoutListParams.Created build() {
        return new PayoutListParams.Created(this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PayoutListParams.Created#extraParams} for the field documentation.
       */
      public PayoutListParams.Created.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PayoutListParams.Created#extraParams} for the field documentation.
       */
      public PayoutListParams.Created.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public PayoutListParams.Created.Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public PayoutListParams.Created.Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public PayoutListParams.Created.Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public PayoutListParams.Created.Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }
}
