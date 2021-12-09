// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CardListParams extends ApiRequestParams {
  /** Only return cards belonging to the Cardholder with the provided ID. */
  @SerializedName("cardholder")
  String cardholder;

  /** Only return cards that were issued during the given date interval. */
  @SerializedName("created")
  Object created;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Only return cards that have the given expiration month. */
  @SerializedName("exp_month")
  Long expMonth;

  /** Only return cards that have the given expiration year. */
  @SerializedName("exp_year")
  Long expYear;

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

  /** Only return cards that have the given last four digits. */
  @SerializedName("last4")
  String last4;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Only return cards that have the given status. One of {@code active}, {@code inactive}, or
   * {@code canceled}.
   */
  @SerializedName("status")
  Status status;

  /** Only return cards that have the given type. One of {@code virtual} or {@code physical}. */
  @SerializedName("type")
  Type type;

  private CardListParams(
      String cardholder,
      Object created,
      String endingBefore,
      Long expMonth,
      Long expYear,
      List<String> expand,
      Map<String, Object> extraParams,
      String last4,
      Long limit,
      String startingAfter,
      Status status,
      Type type) {
    this.cardholder = cardholder;
    this.created = created;
    this.endingBefore = endingBefore;
    this.expMonth = expMonth;
    this.expYear = expYear;
    this.expand = expand;
    this.extraParams = extraParams;
    this.last4 = last4;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String cardholder;

    private Object created;

    private String endingBefore;

    private Long expMonth;

    private Long expYear;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String last4;

    private Long limit;

    private String startingAfter;

    private Status status;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public CardListParams build() {
      return new CardListParams(
          this.cardholder,
          this.created,
          this.endingBefore,
          this.expMonth,
          this.expYear,
          this.expand,
          this.extraParams,
          this.last4,
          this.limit,
          this.startingAfter,
          this.status,
          this.type);
    }

    /** Only return cards belonging to the Cardholder with the provided ID. */
    public Builder setCardholder(String cardholder) {
      this.cardholder = cardholder;
      return this;
    }

    /** Only return cards that were issued during the given date interval. */
    public Builder setCreated(Created created) {
      this.created = created;
      return this;
    }

    /** Only return cards that were issued during the given date interval. */
    public Builder setCreated(Long created) {
      this.created = created;
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

    /** Only return cards that have the given expiration month. */
    public Builder setExpMonth(Long expMonth) {
      this.expMonth = expMonth;
      return this;
    }

    /** Only return cards that have the given expiration year. */
    public Builder setExpYear(Long expYear) {
      this.expYear = expYear;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardListParams#expand} for the field documentation.
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
     * CardListParams#expand} for the field documentation.
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
     * CardListParams#extraParams} for the field documentation.
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
     * See {@link CardListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Only return cards that have the given last four digits. */
    public Builder setLast4(String last4) {
      this.last4 = last4;
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
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Only return cards that have the given status. One of {@code active}, {@code inactive}, or
     * {@code canceled}.
     */
    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }

    /** Only return cards that have the given type. One of {@code virtual} or {@code physical}. */
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
       * CardListParams.Created#extraParams} for the field documentation.
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
       * See {@link CardListParams.Created#extraParams} for the field documentation.
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

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("inactive")
    INACTIVE("inactive");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("physical")
    PHYSICAL("physical"),

    @SerializedName("virtual")
    VIRTUAL("virtual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
