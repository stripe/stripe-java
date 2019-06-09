package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceTransactionListParams extends ApiRequestParams {
  @SerializedName("available_on")
  Object availableOn;

  @SerializedName("created")
  Object created;

  @SerializedName("currency")
  String currency;

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
   * For automatic Stripe payouts only, only returns transactions that were paid out on the
   * specified payout ID.
   */
  @SerializedName("payout")
  String payout;

  /** Only returns the original transaction. */
  @SerializedName("source")
  String source;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Only returns transactions of the given type. One of: `charge`, `refund`, `adjustment`,
   * `application_fee`, `application_fee_refund`, `transfer`, `payment`, `payout`, `payout_failure`,
   * `stripe_fee`, or `network_cost`.
   */
  @SerializedName("type")
  String type;

  private BalanceTransactionListParams(
      Object availableOn,
      Object created,
      String currency,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String payout,
      String source,
      String startingAfter,
      String type) {

    this.availableOn = availableOn;
    this.created = created;
    this.currency = currency;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.payout = payout;
    this.source = source;
    this.startingAfter = startingAfter;
    this.type = type;
  }

  public static BalanceTransactionListParams.Builder builder() {
    return new BalanceTransactionListParams.Builder();
  }

  public static class Builder {
    private Object availableOn;
    private Object created;
    private String currency;
    private String endingBefore;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Long limit;
    private String payout;
    private String source;
    private String startingAfter;
    private String type;

    public BalanceTransactionListParams build() {
      return new BalanceTransactionListParams(
          this.availableOn,
          this.created,
          this.currency,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.payout,
          this.source,
          this.startingAfter,
          this.type);
    }

    public BalanceTransactionListParams.Builder setAvailableOn(
        BalanceTransactionListParams.AvailableOn availableOn) {

      this.availableOn = availableOn;
      return this;
    }

    public BalanceTransactionListParams.Builder setAvailableOn(Long availableOn) {

      this.availableOn = availableOn;
      return this;
    }

    public BalanceTransactionListParams.Builder setCreated(
        BalanceTransactionListParams.Created created) {

      this.created = created;
      return this;
    }

    public BalanceTransactionListParams.Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    public BalanceTransactionListParams.Builder setCurrency(String currency) {

      this.currency = currency;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public BalanceTransactionListParams.Builder setEndingBefore(String endingBefore) {

      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BalanceTransactionListParams#expand} for the field documentation.
     */
    public BalanceTransactionListParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BalanceTransactionListParams#expand} for the field documentation.
     */
    public BalanceTransactionListParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * BalanceTransactionListParams#extraParams} for the field documentation.
     */
    public BalanceTransactionListParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link BalanceTransactionListParams#extraParams} for the field documentation.
     */
    public BalanceTransactionListParams.Builder putAllExtraParam(Map<String, Object> map) {

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
    public BalanceTransactionListParams.Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * For automatic Stripe payouts only, only returns transactions that were paid out on the
     * specified payout ID.
     */
    public BalanceTransactionListParams.Builder setPayout(String payout) {
      this.payout = payout;
      return this;
    }

    /** Only returns the original transaction. */
    public BalanceTransactionListParams.Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public BalanceTransactionListParams.Builder setStartingAfter(String startingAfter) {

      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Only returns transactions of the given type. One of: `charge`, `refund`, `adjustment`,
     * `application_fee`, `application_fee_refund`, `transfer`, `payment`, `payout`,
     * `payout_failure`, `stripe_fee`, or `network_cost`.
     */
    public BalanceTransactionListParams.Builder setType(String type) {
      this.type = type;
      return this;
    }
  }

  public static class AvailableOn {

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

    private AvailableOn(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {

      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static BalanceTransactionListParams.AvailableOn.Builder builder() {

      return new BalanceTransactionListParams.AvailableOn.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public BalanceTransactionListParams.AvailableOn build() {
        return new BalanceTransactionListParams.AvailableOn(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BalanceTransactionListParams.AvailableOn#extraParams} for the field documentation.
       */
      public BalanceTransactionListParams.AvailableOn.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link BalanceTransactionListParams.AvailableOn#extraParams} for the field
       * documentation.
       */
      public BalanceTransactionListParams.AvailableOn.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public BalanceTransactionListParams.AvailableOn.Builder setGt(Long gt) {

        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public BalanceTransactionListParams.AvailableOn.Builder setGte(Long gte) {

        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public BalanceTransactionListParams.AvailableOn.Builder setLt(Long lt) {

        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public BalanceTransactionListParams.AvailableOn.Builder setLte(Long lte) {

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

    public static BalanceTransactionListParams.Created.Builder builder() {
      return new BalanceTransactionListParams.Created.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public BalanceTransactionListParams.Created build() {
        return new BalanceTransactionListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BalanceTransactionListParams.Created#extraParams} for the field documentation.
       */
      public BalanceTransactionListParams.Created.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link BalanceTransactionListParams.Created#extraParams} for the field documentation.
       */
      public BalanceTransactionListParams.Created.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public BalanceTransactionListParams.Created.Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public BalanceTransactionListParams.Created.Builder setGte(Long gte) {

        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public BalanceTransactionListParams.Created.Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public BalanceTransactionListParams.Created.Builder setLte(Long lte) {

        this.lte = lte;
        return this;
      }
    }
  }
}
