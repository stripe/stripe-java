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
public class SubscriptionScheduleCancelParams extends ApiRequestParams {
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
   * If the subscription schedule is {@code active}, indicates if a final invoice will be generated
   * that contains any un-invoiced metered usage and new/pending proration invoice items. Defaults
   * to {@code true}.
   */
  @SerializedName("invoice_now")
  Boolean invoiceNow;

  /**
   * If the subscription schedule is {@code active}, indicates if the cancellation should be
   * prorated. Defaults to {@code true}.
   */
  @SerializedName("prorate")
  Boolean prorate;

  private SubscriptionScheduleCancelParams(
      List<String> expand, Map<String, Object> extraParams, Boolean invoiceNow, Boolean prorate) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoiceNow = invoiceNow;
    this.prorate = prorate;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean invoiceNow;

    private Boolean prorate;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionScheduleCancelParams build() {
      return new SubscriptionScheduleCancelParams(
          this.expand, this.extraParams, this.invoiceNow, this.prorate);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionScheduleCancelParams#expand} for the field documentation.
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
     * SubscriptionScheduleCancelParams#expand} for the field documentation.
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
     * SubscriptionScheduleCancelParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionScheduleCancelParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * If the subscription schedule is {@code active}, indicates if a final invoice will be
     * generated that contains any un-invoiced metered usage and new/pending proration invoice
     * items. Defaults to {@code true}.
     */
    public Builder setInvoiceNow(Boolean invoiceNow) {
      this.invoiceNow = invoiceNow;
      return this;
    }

    /**
     * If the subscription schedule is {@code active}, indicates if the cancellation should be
     * prorated. Defaults to {@code true}.
     */
    public Builder setProrate(Boolean prorate) {
      this.prorate = prorate;
      return this;
    }
  }
}
