// File generated from our OpenAPI spec
package com.stripe.param.reserve;

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
public class HoldListParams extends ApiRequestParams {
  /**
   * Only return ReserveHolds associated with the currency specified by this currency code.
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
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

  /** Only return ReserveHolds that are releasable. */
  @SerializedName("is_releasable")
  Boolean isReleasable;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  @SerializedName("reason")
  Reason reason;

  /** Only return ReserveHolds associated with the ReservePlan specified by this ReservePlan ID. */
  @SerializedName("reserve_plan")
  String reservePlan;

  /**
   * Only return ReserveHolds associated with the ReserveRelease specified by this ReserveRelease
   * ID.
   */
  @SerializedName("reserve_release")
  String reserveRelease;

  /** Only return ReserveHolds associated with the Charge specified by this source charge ID. */
  @SerializedName("source_charge")
  String sourceCharge;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private HoldListParams(
      String currency,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean isReleasable,
      Long limit,
      Reason reason,
      String reservePlan,
      String reserveRelease,
      String sourceCharge,
      String startingAfter) {
    this.currency = currency;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.isReleasable = isReleasable;
    this.limit = limit;
    this.reason = reason;
    this.reservePlan = reservePlan;
    this.reserveRelease = reserveRelease;
    this.sourceCharge = sourceCharge;
    this.startingAfter = startingAfter;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean isReleasable;

    private Long limit;

    private Reason reason;

    private String reservePlan;

    private String reserveRelease;

    private String sourceCharge;

    private String startingAfter;

    /** Finalize and obtain parameter instance from this builder. */
    public HoldListParams build() {
      return new HoldListParams(
          this.currency,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.isReleasable,
          this.limit,
          this.reason,
          this.reservePlan,
          this.reserveRelease,
          this.sourceCharge,
          this.startingAfter);
    }

    /**
     * Only return ReserveHolds associated with the currency specified by this currency code.
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
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
     * HoldListParams#expand} for the field documentation.
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
     * HoldListParams#expand} for the field documentation.
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
     * HoldListParams#extraParams} for the field documentation.
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
     * See {@link HoldListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Only return ReserveHolds that are releasable. */
    public Builder setIsReleasable(Boolean isReleasable) {
      this.isReleasable = isReleasable;
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

    public Builder setReason(HoldListParams.Reason reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Only return ReserveHolds associated with the ReservePlan specified by this ReservePlan ID.
     */
    public Builder setReservePlan(String reservePlan) {
      this.reservePlan = reservePlan;
      return this;
    }

    /**
     * Only return ReserveHolds associated with the ReserveRelease specified by this ReserveRelease
     * ID.
     */
    public Builder setReserveRelease(String reserveRelease) {
      this.reserveRelease = reserveRelease;
      return this;
    }

    /** Only return ReserveHolds associated with the Charge specified by this source charge ID. */
    public Builder setSourceCharge(String sourceCharge) {
      this.sourceCharge = sourceCharge;
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
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("charge")
    CHARGE("charge"),

    @SerializedName("standalone")
    STANDALONE("standalone");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
