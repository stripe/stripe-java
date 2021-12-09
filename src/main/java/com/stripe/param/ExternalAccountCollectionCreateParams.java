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
public class ExternalAccountCollectionCreateParams extends ApiRequestParams {
  /**
   * When set to true, or if this is the first external account added in this currency, this account
   * becomes the default external account for its currency.
   */
  @SerializedName("default_for_currency")
  Boolean defaultForCurrency;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** Please refer to full <a href="https://stripe.com/docs/api">documentation</a> instead. */
  @SerializedName("external_account")
  String externalAccount;

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

  private ExternalAccountCollectionCreateParams(
      Boolean defaultForCurrency,
      List<String> expand,
      String externalAccount,
      Map<String, Object> extraParams,
      Map<String, String> metadata) {
    this.defaultForCurrency = defaultForCurrency;
    this.expand = expand;
    this.externalAccount = externalAccount;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean defaultForCurrency;

    private List<String> expand;

    private String externalAccount;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ExternalAccountCollectionCreateParams build() {
      return new ExternalAccountCollectionCreateParams(
          this.defaultForCurrency,
          this.expand,
          this.externalAccount,
          this.extraParams,
          this.metadata);
    }

    /**
     * When set to true, or if this is the first external account added in this currency, this
     * account becomes the default external account for its currency.
     */
    public Builder setDefaultForCurrency(Boolean defaultForCurrency) {
      this.defaultForCurrency = defaultForCurrency;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ExternalAccountCollectionCreateParams#expand} for the field documentation.
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
     * ExternalAccountCollectionCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** Please refer to full <a href="https://stripe.com/docs/api">documentation</a> instead. */
    public Builder setExternalAccount(String externalAccount) {
      this.externalAccount = externalAccount;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ExternalAccountCollectionCreateParams#extraParams} for the field documentation.
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
     * See {@link ExternalAccountCollectionCreateParams#extraParams} for the field documentation.
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
     * ExternalAccountCollectionCreateParams#metadata} for the field documentation.
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
     * See {@link ExternalAccountCollectionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }
}
