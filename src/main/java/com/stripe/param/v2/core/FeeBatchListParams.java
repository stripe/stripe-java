// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

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
public class FeeBatchListParams extends ApiRequestParams {
  /** Filter to return only FeeBatches associated with this collection record ID. */
  @SerializedName("collection_record")
  String collectionRecord;

  /** Filter for FeeBatches created at the exact specified timestamp. */
  @SerializedName("created")
  Instant created;

  /** Filter for FeeBatches created after the specified timestamp (exclusive). */
  @SerializedName("created_gt")
  Instant createdGt;

  /** Filter for FeeBatches created at or after the specified timestamp (inclusive). */
  @SerializedName("created_gte")
  Instant createdGte;

  /** Filter for FeeBatches created before the specified timestamp (exclusive). */
  @SerializedName("created_lt")
  Instant createdLt;

  /** Filter for FeeBatches created at or before the specified timestamp (inclusive). */
  @SerializedName("created_lte")
  Instant createdLte;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum number of results to return per page. Defaults to 20. */
  @SerializedName("limit")
  Long limit;

  /**
   * Filters FeeBatches by status. Multiple values use OR semantics. When omitted or empty, returns
   * {@code pending} and {@code billed} FeeBatches. To return canceled FeeBatches, include {@code
   * canceled}.
   */
  @SerializedName("statuses")
  List<FeeBatchListParams.Status> statuses;

  private FeeBatchListParams(
      String collectionRecord,
      Instant created,
      Instant createdGt,
      Instant createdGte,
      Instant createdLt,
      Instant createdLte,
      Map<String, Object> extraParams,
      Long limit,
      List<FeeBatchListParams.Status> statuses) {
    this.collectionRecord = collectionRecord;
    this.created = created;
    this.createdGt = createdGt;
    this.createdGte = createdGte;
    this.createdLt = createdLt;
    this.createdLte = createdLte;
    this.extraParams = extraParams;
    this.limit = limit;
    this.statuses = statuses;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String collectionRecord;

    private Instant created;

    private Instant createdGt;

    private Instant createdGte;

    private Instant createdLt;

    private Instant createdLte;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<FeeBatchListParams.Status> statuses;

    /** Finalize and obtain parameter instance from this builder. */
    public FeeBatchListParams build() {
      return new FeeBatchListParams(
          this.collectionRecord,
          this.created,
          this.createdGt,
          this.createdGte,
          this.createdLt,
          this.createdLte,
          this.extraParams,
          this.limit,
          this.statuses);
    }

    /** Filter to return only FeeBatches associated with this collection record ID. */
    public Builder setCollectionRecord(String collectionRecord) {
      this.collectionRecord = collectionRecord;
      return this;
    }

    /** Filter for FeeBatches created at the exact specified timestamp. */
    public Builder setCreated(Instant created) {
      this.created = created;
      return this;
    }

    /** Filter for FeeBatches created after the specified timestamp (exclusive). */
    public Builder setCreatedGt(Instant createdGt) {
      this.createdGt = createdGt;
      return this;
    }

    /** Filter for FeeBatches created at or after the specified timestamp (inclusive). */
    public Builder setCreatedGte(Instant createdGte) {
      this.createdGte = createdGte;
      return this;
    }

    /** Filter for FeeBatches created before the specified timestamp (exclusive). */
    public Builder setCreatedLt(Instant createdLt) {
      this.createdLt = createdLt;
      return this;
    }

    /** Filter for FeeBatches created at or before the specified timestamp (inclusive). */
    public Builder setCreatedLte(Instant createdLte) {
      this.createdLte = createdLte;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * FeeBatchListParams#extraParams} for the field documentation.
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
     * See {@link FeeBatchListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum number of results to return per page. Defaults to 20. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `statuses` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * FeeBatchListParams#statuses} for the field documentation.
     */
    public Builder addStatus(FeeBatchListParams.Status element) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.add(element);
      return this;
    }

    /**
     * Add all elements to `statuses` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * FeeBatchListParams#statuses} for the field documentation.
     */
    public Builder addAllStatus(List<FeeBatchListParams.Status> elements) {
      if (this.statuses == null) {
        this.statuses = new ArrayList<>();
      }
      this.statuses.addAll(elements);
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("billed")
    BILLED("billed"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("pending")
    PENDING("pending");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
