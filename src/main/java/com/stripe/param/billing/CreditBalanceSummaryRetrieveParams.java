// File generated from our OpenAPI spec
package com.stripe.param.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CreditBalanceSummaryRetrieveParams extends ApiRequestParams {
  /** <strong>Required.</strong> The customer for which to fetch credit balance summary. */
  @SerializedName("customer")
  String customer;

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

  /** <strong>Required.</strong> The filter criteria for the credit balance summary. */
  @SerializedName("filter")
  Filter filter;

  private CreditBalanceSummaryRetrieveParams(
      String customer, List<String> expand, Map<String, Object> extraParams, Filter filter) {
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.filter = filter;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Filter filter;

    /** Finalize and obtain parameter instance from this builder. */
    public CreditBalanceSummaryRetrieveParams build() {
      return new CreditBalanceSummaryRetrieveParams(
          this.customer, this.expand, this.extraParams, this.filter);
    }

    /** <strong>Required.</strong> The customer for which to fetch credit balance summary. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CreditBalanceSummaryRetrieveParams#expand} for the field documentation.
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
     * CreditBalanceSummaryRetrieveParams#expand} for the field documentation.
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
     * CreditBalanceSummaryRetrieveParams#extraParams} for the field documentation.
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
     * See {@link CreditBalanceSummaryRetrieveParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The filter criteria for the credit balance summary. */
    public Builder setFilter(CreditBalanceSummaryRetrieveParams.Filter filter) {
      this.filter = filter;
      return this;
    }
  }

  @Getter
  public static class Filter {
    /** The billing credit applicability scope for which to fetch credit balance summary. */
    @SerializedName("applicability_scope")
    ApplicabilityScope applicabilityScope;

    /** The credit grant for which to fetch credit balance summary. */
    @SerializedName("credit_grant")
    String creditGrant;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Specify the type of this filter. */
    @SerializedName("type")
    Type type;

    private Filter(
        ApplicabilityScope applicabilityScope,
        String creditGrant,
        Map<String, Object> extraParams,
        Type type) {
      this.applicabilityScope = applicabilityScope;
      this.creditGrant = creditGrant;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ApplicabilityScope applicabilityScope;

      private String creditGrant;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CreditBalanceSummaryRetrieveParams.Filter build() {
        return new CreditBalanceSummaryRetrieveParams.Filter(
            this.applicabilityScope, this.creditGrant, this.extraParams, this.type);
      }

      /** The billing credit applicability scope for which to fetch credit balance summary. */
      public Builder setApplicabilityScope(
          CreditBalanceSummaryRetrieveParams.Filter.ApplicabilityScope applicabilityScope) {
        this.applicabilityScope = applicabilityScope;
        return this;
      }

      /** The credit grant for which to fetch credit balance summary. */
      public Builder setCreditGrant(String creditGrant) {
        this.creditGrant = creditGrant;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CreditBalanceSummaryRetrieveParams.Filter#extraParams} for the field documentation.
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
       * See {@link CreditBalanceSummaryRetrieveParams.Filter#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Specify the type of this filter. */
      public Builder setType(CreditBalanceSummaryRetrieveParams.Filter.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class ApplicabilityScope {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The price type for which credit grants can apply. We currently
       * only support the {@code metered} price type.
       */
      @SerializedName("price_type")
      PriceType priceType;

      private ApplicabilityScope(Map<String, Object> extraParams, PriceType priceType) {
        this.extraParams = extraParams;
        this.priceType = priceType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private PriceType priceType;

        /** Finalize and obtain parameter instance from this builder. */
        public CreditBalanceSummaryRetrieveParams.Filter.ApplicabilityScope build() {
          return new CreditBalanceSummaryRetrieveParams.Filter.ApplicabilityScope(
              this.extraParams, this.priceType);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CreditBalanceSummaryRetrieveParams.Filter.ApplicabilityScope#extraParams}
         * for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CreditBalanceSummaryRetrieveParams.Filter.ApplicabilityScope#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> The price type for which credit grants can apply. We currently
         * only support the {@code metered} price type.
         */
        public Builder setPriceType(
            CreditBalanceSummaryRetrieveParams.Filter.ApplicabilityScope.PriceType priceType) {
          this.priceType = priceType;
          return this;
        }
      }

      public enum PriceType implements ApiRequestParams.EnumParam {
        @SerializedName("metered")
        METERED("metered");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PriceType(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("applicability_scope")
      APPLICABILITY_SCOPE("applicability_scope"),

      @SerializedName("credit_grant")
      CREDIT_GRANT("credit_grant");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
