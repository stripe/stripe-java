package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class CardholderListParams extends ApiRequestParams {

  /** Only return cardholders that were created during the given date interval. */
  @SerializedName("created")
  Object created;

  /** Only return cardholders that have the given email address. */
  @SerializedName("email")
  String email;

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

  /** Only return the default cardholder. */
  @SerializedName("is_default")
  Boolean isDefault;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Only return cardholders that have the given phone number. */
  @SerializedName("phone_number")
  String phoneNumber;

  /**
   * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`,
   * your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of
   * the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * Only return cardholders that have the given status. One of `active`, `inactive`, or `blocked`.
   */
  @SerializedName("status")
  CardholderListParams.Status status;

  /** Only return cardholders that have the given type. One of `individual` or `business_entity`. */
  @SerializedName("type")
  CardholderListParams.Type type;

  private CardholderListParams(
      Object created,
      String email,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean isDefault,
      Long limit,
      String phoneNumber,
      String startingAfter,
      CardholderListParams.Status status,
      CardholderListParams.Type type) {

    this.created = created;
    this.email = email;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.isDefault = isDefault;
    this.limit = limit;
    this.phoneNumber = phoneNumber;
    this.startingAfter = startingAfter;
    this.status = status;
    this.type = type;
  }

  public static CardholderListParams.Builder builder() {
    return new CardholderListParams.Builder();
  }

  public static class Builder {
    private Object created;
    private String email;
    private String endingBefore;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Boolean isDefault;
    private Long limit;
    private String phoneNumber;
    private String startingAfter;
    private CardholderListParams.Status status;
    private CardholderListParams.Type type;

    public CardholderListParams build() {
      return new CardholderListParams(
          this.created,
          this.email,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.isDefault,
          this.limit,
          this.phoneNumber,
          this.startingAfter,
          this.status,
          this.type);
    }

    /** Only return cardholders that were created during the given date interval. */
    public CardholderListParams.Builder setCreated(CardholderListParams.Created created) {

      this.created = created;
      return this;
    }

    /** Only return cardholders that were created during the given date interval. */
    public CardholderListParams.Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** Only return cardholders that have the given email address. */
    public CardholderListParams.Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public CardholderListParams.Builder setEndingBefore(String endingBefore) {

      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardholderListParams#expand} for the field documentation.
     */
    public CardholderListParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardholderListParams#expand} for the field documentation.
     */
    public CardholderListParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CardholderListParams#extraParams} for the field documentation.
     */
    public CardholderListParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CardholderListParams#extraParams} for the field documentation.
     */
    public CardholderListParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Only return the default cardholder. */
    public CardholderListParams.Builder setIsDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public CardholderListParams.Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Only return cardholders that have the given phone number. */
    public CardholderListParams.Builder setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public CardholderListParams.Builder setStartingAfter(String startingAfter) {

      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * Only return cardholders that have the given status. One of `active`, `inactive`, or
     * `blocked`.
     */
    public CardholderListParams.Builder setStatus(CardholderListParams.Status status) {

      this.status = status;
      return this;
    }

    /**
     * Only return cardholders that have the given type. One of `individual` or `business_entity`.
     */
    public CardholderListParams.Builder setType(CardholderListParams.Type type) {

      this.type = type;
      return this;
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

    public static CardholderListParams.Created.Builder builder() {
      return new CardholderListParams.Created.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public CardholderListParams.Created build() {
        return new CardholderListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardholderListParams.Created#extraParams} for the field documentation.
       */
      public CardholderListParams.Created.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CardholderListParams.Created#extraParams} for the field documentation.
       */
      public CardholderListParams.Created.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public CardholderListParams.Created.Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public CardholderListParams.Created.Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public CardholderListParams.Created.Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public CardholderListParams.Created.Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),
    @SerializedName("blocked")
    BLOCKED("blocked"),
    @SerializedName("inactive")
    INACTIVE("inactive");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Status(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("business_entity")
    BUSINESS_ENTITY("business_entity"),
    @SerializedName("individual")
    INDIVIDUAL("individual");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Type(String value) {
      this.value = value;
    }
  }
}
