// File generated from our OpenAPI spec
package com.stripe.param.climate;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OrderCreateParams extends ApiRequestParams {
  /**
   * Requested amount of carbon removal units. Either this or {@code metric_tons} must be specified.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the Stripe
   * account if not set.
   */
  @SerializedName("beneficiary")
  Beneficiary beneficiary;

  /**
   * Request currency for the order as a three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   * Must be a supported <a href="https://stripe.com/docs/currencies">settlement currency for your
   * account</a>. If omitted, the account's default currency will be used.
   */
  @SerializedName("currency")
  String currency;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Requested number of tons for the order. Either this or {@code amount} must be specified. */
  @SerializedName("metric_tons")
  BigDecimal metricTons;

  /** <strong>Required.</strong> Unique identifier of the Climate product. */
  @SerializedName("product")
  String product;

  private OrderCreateParams(
      Long amount,
      Beneficiary beneficiary,
      String currency,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      BigDecimal metricTons,
      String product) {
    this.amount = amount;
    this.beneficiary = beneficiary;
    this.currency = currency;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.metricTons = metricTons;
    this.product = product;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Beneficiary beneficiary;

    private String currency;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private BigDecimal metricTons;

    private String product;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderCreateParams build() {
      return new OrderCreateParams(
          this.amount,
          this.beneficiary,
          this.currency,
          this.expand,
          this.extraParams,
          this.metadata,
          this.metricTons,
          this.product);
    }

    /**
     * Requested amount of carbon removal units. Either this or {@code metric_tons} must be
     * specified.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the
     * Stripe account if not set.
     */
    public Builder setBeneficiary(OrderCreateParams.Beneficiary beneficiary) {
      this.beneficiary = beneficiary;
      return this;
    }

    /**
     * Request currency for the order as a three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a supported <a href="https://stripe.com/docs/currencies">settlement currency for your
     * account</a>. If omitted, the account's default currency will be used.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderCreateParams#expand} for the field documentation.
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
     * OrderCreateParams#expand} for the field documentation.
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
     * OrderCreateParams#extraParams} for the field documentation.
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
     * See {@link OrderCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * OrderCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link OrderCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Requested number of tons for the order. Either this or {@code amount} must be specified. */
    public Builder setMetricTons(BigDecimal metricTons) {
      this.metricTons = metricTons;
      return this;
    }

    /** <strong>Required.</strong> Unique identifier of the Climate product. */
    public Builder setProduct(String product) {
      this.product = product;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Beneficiary {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Publicly displayable name for the end beneficiary of carbon
     * removal.
     */
    @SerializedName("public_name")
    String publicName;

    private Beneficiary(Map<String, Object> extraParams, String publicName) {
      this.extraParams = extraParams;
      this.publicName = publicName;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String publicName;

      /** Finalize and obtain parameter instance from this builder. */
      public OrderCreateParams.Beneficiary build() {
        return new OrderCreateParams.Beneficiary(this.extraParams, this.publicName);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OrderCreateParams.Beneficiary#extraParams} for the field documentation.
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
       * See {@link OrderCreateParams.Beneficiary#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Publicly displayable name for the end beneficiary of carbon
       * removal.
       */
      public Builder setPublicName(String publicName) {
        this.publicName = publicName;
        return this;
      }
    }
  }
}
