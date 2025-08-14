// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

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
public class CadenceListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional resource to include in the response. */
  @SerializedName("include")
  List<CadenceListParams.Include> include;

  /** Optionally set the maximum number of results per page. Defaults to 20. */
  @SerializedName("limit")
  Integer limit;

  /**
   * If provided, only Cadences that specifically reference the payer will be returned. Mutually
   * exclusive with {@code test_clock}.
   */
  @SerializedName("payer")
  Payer payer;

  /**
   * If provided, only Cadences that specifically reference the provided test clock ID (via the
   * customer's test clock) will be returned. Mutually exclusive with {@code payer}.
   */
  @SerializedName("test_clock")
  String testClock;

  private CadenceListParams(
      Map<String, Object> extraParams,
      List<CadenceListParams.Include> include,
      Integer limit,
      Payer payer,
      String testClock) {
    this.extraParams = extraParams;
    this.include = include;
    this.limit = limit;
    this.payer = payer;
    this.testClock = testClock;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<CadenceListParams.Include> include;

    private Integer limit;

    private Payer payer;

    private String testClock;

    /** Finalize and obtain parameter instance from this builder. */
    public CadenceListParams build() {
      return new CadenceListParams(
          this.extraParams, this.include, this.limit, this.payer, this.testClock);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CadenceListParams#extraParams} for the field documentation.
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
     * See {@link CadenceListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CadenceListParams#include} for the field documentation.
     */
    public Builder addInclude(CadenceListParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CadenceListParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<CadenceListParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /** Optionally set the maximum number of results per page. Defaults to 20. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * If provided, only Cadences that specifically reference the payer will be returned. Mutually
     * exclusive with {@code test_clock}.
     */
    public Builder setPayer(CadenceListParams.Payer payer) {
      this.payer = payer;
      return this;
    }

    /**
     * If provided, only Cadences that specifically reference the provided test clock ID (via the
     * customer's test clock) will be returned. Mutually exclusive with {@code payer}.
     */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payer {
    /**
     * The ID of the Customer object. If provided, only Cadences that specifically reference the
     * provided customer ID will be returned.
     */
    @SerializedName("customer")
    String customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> A string identifying the type of the payer. Currently the only
     * supported value is {@code customer}.
     */
    @SerializedName("type")
    Type type;

    private Payer(String customer, Map<String, Object> extraParams, Type type) {
      this.customer = customer;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String customer;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CadenceListParams.Payer build() {
        return new CadenceListParams.Payer(this.customer, this.extraParams, this.type);
      }

      /**
       * The ID of the Customer object. If provided, only Cadences that specifically reference the
       * provided customer ID will be returned.
       */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CadenceListParams.Payer#extraParams} for the field documentation.
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
       * See {@link CadenceListParams.Payer#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> A string identifying the type of the payer. Currently the only
       * supported value is {@code customer}.
       */
      public Builder setType(CadenceListParams.Payer.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("customer")
      CUSTOMER("customer");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("invoice_discount_rules")
    INVOICE_DISCOUNT_RULES("invoice_discount_rules");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
