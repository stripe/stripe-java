package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class AuthorizationListParams extends ApiRequestParams {

  /** Only return issuing transactions that belong to the given card. */
  @SerializedName("card")
  String card;

  /** Only return authorizations belonging to the given cardholder. */
  @SerializedName("cardholder")
  String cardholder;

  /** Only return authorizations that were created during the given date interval. */
  @SerializedName("created")
  Object created;

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

  /** Only return authorizations with the given status. One of pending, closed, or reversed. */
  @SerializedName("status")
  AuthorizationListParams.Status status;

  private AuthorizationListParams(
      String card,
      String cardholder,
      Object created,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String startingAfter,
      AuthorizationListParams.Status status) {

    this.card = card;
    this.cardholder = cardholder;
    this.created = created;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static AuthorizationListParams.Builder builder() {
    return new AuthorizationListParams.Builder();
  }

  public static class Builder {
    private String card;
    private String cardholder;
    private Object created;
    private String endingBefore;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Long limit;
    private String startingAfter;
    private AuthorizationListParams.Status status;

    public AuthorizationListParams build() {
      return new AuthorizationListParams(
          this.card,
          this.cardholder,
          this.created,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.startingAfter,
          this.status);
    }

    /** Only return issuing transactions that belong to the given card. */
    public AuthorizationListParams.Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /** Only return authorizations belonging to the given cardholder. */
    public AuthorizationListParams.Builder setCardholder(String cardholder) {

      this.cardholder = cardholder;
      return this;
    }

    /** Only return authorizations that were created during the given date interval. */
    public AuthorizationListParams.Builder setCreated(AuthorizationListParams.Created created) {

      this.created = created;
      return this;
    }

    /** Only return authorizations that were created during the given date interval. */
    public AuthorizationListParams.Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, starting with
     * `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the
     * previous page of the list.
     */
    public AuthorizationListParams.Builder setEndingBefore(String endingBefore) {

      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthorizationListParams#expand} for the field documentation.
     */
    public AuthorizationListParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthorizationListParams#expand} for the field documentation.
     */
    public AuthorizationListParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AuthorizationListParams#extraParams} for the field documentation.
     */
    public AuthorizationListParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link AuthorizationListParams#extraParams} for the field documentation.
     */
    public AuthorizationListParams.Builder putAllExtraParam(Map<String, Object> map) {

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
    public AuthorizationListParams.Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in
     * the list. For instance, if you make a list request and receive 100 objects, ending with
     * `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the
     * next page of the list.
     */
    public AuthorizationListParams.Builder setStartingAfter(String startingAfter) {

      this.startingAfter = startingAfter;
      return this;
    }

    /** Only return authorizations with the given status. One of pending, closed, or reversed. */
    public AuthorizationListParams.Builder setStatus(AuthorizationListParams.Status status) {

      this.status = status;
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

    public static AuthorizationListParams.Created.Builder builder() {
      return new AuthorizationListParams.Created.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private Long gt;
      private Long gte;
      private Long lt;
      private Long lte;

      public AuthorizationListParams.Created build() {
        return new AuthorizationListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthorizationListParams.Created#extraParams} for the field documentation.
       */
      public AuthorizationListParams.Created.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link AuthorizationListParams.Created#extraParams} for the field documentation.
       */
      public AuthorizationListParams.Created.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public AuthorizationListParams.Created.Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public AuthorizationListParams.Created.Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public AuthorizationListParams.Created.Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public AuthorizationListParams.Created.Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("closed")
    CLOSED("closed"),
    @SerializedName("pending")
    PENDING("pending"),
    @SerializedName("reversed")
    REVERSED("reversed");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Status(String value) {
      this.value = value;
    }
  }
}
