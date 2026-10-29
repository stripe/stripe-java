// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OutboundPaymentListParams extends ApiRequestParams {
  /** Filter OutboundPayments by their creation time. */
  @SerializedName("created")
  Created created;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The maximum number of results to return. */
  @SerializedName("limit")
  Long limit;

  /** Only return OutboundPayments sent to this recipient. */
  @SerializedName("recipient")
  String recipient;

  /** Closed Enum. Only return OutboundPayments with this status. */
  @SerializedName("status")
  List<OutboundPaymentListParams.Status> status;

  private OutboundPaymentListParams(
      Created created,
      Map<String, Object> extraParams,
      Long limit,
      String recipient,
      List<OutboundPaymentListParams.Status> status) {
    this.created = created;
    this.extraParams = extraParams;
    this.limit = limit;
    this.recipient = recipient;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Created created;

    private Map<String, Object> extraParams;

    private Long limit;

    private String recipient;

    private List<OutboundPaymentListParams.Status> status;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundPaymentListParams build() {
      return new OutboundPaymentListParams(
          this.created, this.extraParams, this.limit, this.recipient, this.status);
    }

    /** Filter OutboundPayments by their creation time. */
    public Builder setCreated(OutboundPaymentListParams.Created created) {
      this.created = created;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OutboundPaymentListParams#extraParams} for the field documentation.
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
     * See {@link OutboundPaymentListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The maximum number of results to return. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Only return OutboundPayments sent to this recipient. */
    public Builder setRecipient(String recipient) {
      this.recipient = recipient;
      return this;
    }

    /**
     * Add an element to `status` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OutboundPaymentListParams#status} for the field documentation.
     */
    public Builder addStatus(OutboundPaymentListParams.Status element) {
      if (this.status == null) {
        this.status = new ArrayList<>();
      }
      this.status.add(element);
      return this;
    }

    /**
     * Add all elements to `status` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OutboundPaymentListParams#status} for the field documentation.
     */
    public Builder addAllStatus(List<OutboundPaymentListParams.Status> elements) {
      if (this.status == null) {
        this.status = new ArrayList<>();
      }
      this.status.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp; time
     * value, for example: 2022-09-18T13:22:00Z.
     */
    @SerializedName("gt")
    Instant gt;

    /**
     * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2022-09-18T13:22:00Z.
     */
    @SerializedName("gte")
    Instant gte;

    /**
     * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp;
     * time value, for example: 2022-09-18T13:22:00Z.
     */
    @SerializedName("lt")
    Instant lt;

    /**
     * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date
     * &amp; time value, for example: 2022-09-18T13:22:00Z.
     */
    @SerializedName("lte")
    Instant lte;

    private Created(
        Map<String, Object> extraParams, Instant gt, Instant gte, Instant lt, Instant lte) {
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

      private Instant gt;

      private Instant gte;

      private Instant lt;

      private Instant lte;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentListParams.Created build() {
        return new OutboundPaymentListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentListParams.Created#extraParams} for the field documentation.
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
       * See {@link OutboundPaymentListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Filter for objects created after the specified timestamp. Must be an RFC 3339 date &amp;
       * time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setGt(Instant gt) {
        this.gt = gt;
        return this;
      }

      /**
       * Filter for objects created on or after the specified timestamp. Must be an RFC 3339 date
       * &amp; time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setGte(Instant gte) {
        this.gte = gte;
        return this;
      }

      /**
       * Filter for objects created before the specified timestamp. Must be an RFC 3339 date &amp;
       * time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setLt(Instant lt) {
        this.lt = lt;
        return this;
      }

      /**
       * Filter for objects created on or before the specified timestamp. Must be an RFC 3339 date
       * &amp; time value, for example: 2022-09-18T13:22:00Z.
       */
      public Builder setLte(Instant lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("posted")
    POSTED("posted"),

    @SerializedName("processing")
    PROCESSING("processing"),

    @SerializedName("returned")
    RETURNED("returned");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
