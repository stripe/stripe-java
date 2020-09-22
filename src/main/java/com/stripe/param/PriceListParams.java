// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PriceListParams extends ApiRequestParams {
  /**
   * Only return prices that are active or inactive (e.g., pass {@code false} to list all inactive
   * prices).
   */
  @SerializedName("active")
  Boolean active;

  /**
   * A filter on the list, based on the object {@code created} field. The value can be a string with
   * an integer Unix timestamp, or it can be a dictionary with a number of different query options.
   */
  @SerializedName("created")
  Object created;

  /** Only return prices for the given currency. */
  @SerializedName("currency")
  String currency;

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

  /** Only return the price with these lookup_keys, if any exist. */
  @SerializedName("lookup_keys")
  List<String> lookupKeys;

  /** Only return prices for the given product. */
  @SerializedName("product")
  String product;

  /** Only return prices with these recurring fields. */
  @SerializedName("recurring")
  Recurring recurring;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** Only return prices of type {@code recurring} or {@code one_time}. */
  @SerializedName("type")
  Type type;

  private PriceListParams(
      Boolean active,
      Object created,
      String currency,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      List<String> lookupKeys,
      String product,
      Recurring recurring,
      String startingAfter,
      Type type) {
    this.active = active;
    this.created = created;
    this.currency = currency;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.lookupKeys = lookupKeys;
    this.product = product;
    this.recurring = recurring;
    this.startingAfter = startingAfter;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private Object created;

    private String currency;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<String> lookupKeys;

    private String product;

    private Recurring recurring;

    private String startingAfter;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public PriceListParams build() {
      return new PriceListParams(
          this.active,
          this.created,
          this.currency,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.lookupKeys,
          this.product,
          this.recurring,
          this.startingAfter,
          this.type);
    }

    /**
     * Only return prices that are active or inactive (e.g., pass {@code false} to list all inactive
     * prices).
     */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * A filter on the list, based on the object {@code created} field. The value can be a string
     * with an integer Unix timestamp, or it can be a dictionary with a number of different query
     * options.
     */
    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    /**
     * A filter on the list, based on the object {@code created} field. The value can be a string
     * with an integer Unix timestamp, or it can be a dictionary with a number of different query
     * options.
     */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** Only return prices for the given currency. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
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
     * PriceListParams#expand} for the field documentation.
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
     * PriceListParams#expand} for the field documentation.
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
     * PriceListParams#extraParams} for the field documentation.
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
     * See {@link PriceListParams#extraParams} for the field documentation.
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

    /**
     * Add an element to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PriceListParams#lookupKeys} for the field documentation.
     */
    public Builder addLookupKeys(String element) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.add(element);
      return this;
    }

    /**
     * Add all elements to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PriceListParams#lookupKeys} for the field documentation.
     */
    public Builder addAllLookupKeys(List<String> elements) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.addAll(elements);
      return this;
    }

    /** Only return prices for the given product. */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }

    /** Only return prices with these recurring fields. */
    public Builder setRecurring(Recurring recurring) {
      this.recurring = recurring;
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

    /** Only return prices of type {@code recurring} or {@code one_time}. */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
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
      public Created build() {
        return new Created(this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceListParams.Created#extraParams} for the field documentation.
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
       * See {@link PriceListParams.Created#extraParams} for the field documentation.
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

  @Getter
  public static class Recurring {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Filter by billing frequency. Either {@code day}, {@code week}, {@code month} or {@code year}.
     */
    @SerializedName("interval")
    Interval interval;

    /**
     * Filter by the usage type for this price. Can be either {@code metered} or {@code licensed}.
     */
    @SerializedName("usage_type")
    UsageType usageType;

    private Recurring(Map<String, Object> extraParams, Interval interval, UsageType usageType) {
      this.extraParams = extraParams;
      this.interval = interval;
      this.usageType = usageType;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Interval interval;

      private UsageType usageType;

      /** Finalize and obtain parameter instance from this builder. */
      public Recurring build() {
        return new Recurring(this.extraParams, this.interval, this.usageType);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceListParams.Recurring#extraParams} for the field documentation.
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
       * See {@link PriceListParams.Recurring#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Filter by billing frequency. Either {@code day}, {@code week}, {@code month} or {@code
       * year}.
       */
      public Builder setInterval(Interval interval) {
        this.interval = interval;
        return this;
      }

      /**
       * Filter by the usage type for this price. Can be either {@code metered} or {@code licensed}.
       */
      public Builder setUsageType(UsageType usageType) {
        this.usageType = usageType;
        return this;
      }
    }

    public enum Interval implements ApiRequestParams.EnumParam {
      @SerializedName("day")
      DAY("day"),

      @SerializedName("month")
      MONTH("month"),

      @SerializedName("week")
      WEEK("week"),

      @SerializedName("year")
      YEAR("year");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Interval(String value) {
        this.value = value;
      }
    }

    public enum UsageType implements ApiRequestParams.EnumParam {
      @SerializedName("licensed")
      LICENSED("licensed"),

      @SerializedName("metered")
      METERED("metered");

      @Getter(onMethod_ = {@Override})
      private final String value;

      UsageType(String value) {
        this.value = value;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("one_time")
    ONE_TIME("one_time"),

    @SerializedName("recurring")
    RECURRING("recurring");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
