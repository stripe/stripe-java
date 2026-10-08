// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class InboundTransferMandateListParams extends ApiRequestParams {
  /** Filter by v2 credential. */
  @SerializedName("credential")
  String credential;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum number of results to return on a single page. */
  @SerializedName("limit")
  Long limit;

  /** Filter by mandate status. */
  @SerializedName("status")
  Status status;

  /** Filter by mandate scheme type. */
  @SerializedName("type")
  Type type;

  private InboundTransferMandateListParams(
      String credential, Map<String, Object> extraParams, Long limit, Status status, Type type) {
    this.credential = credential;
    this.extraParams = extraParams;
    this.limit = limit;
    this.status = status;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String credential;

    private Map<String, Object> extraParams;

    private Long limit;

    private Status status;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public InboundTransferMandateListParams build() {
      return new InboundTransferMandateListParams(
          this.credential, this.extraParams, this.limit, this.status, this.type);
    }

    /** Filter by v2 credential. */
    public Builder setCredential(String credential) {
      this.credential = credential;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * InboundTransferMandateListParams#extraParams} for the field documentation.
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
     * See {@link InboundTransferMandateListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum number of results to return on a single page. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Filter by mandate status. */
    public Builder setStatus(InboundTransferMandateListParams.Status status) {
      this.status = status;
      return this;
    }

    /** Filter by mandate scheme type. */
    public Builder setType(InboundTransferMandateListParams.Type type) {
      this.type = type;
      return this;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("expired")
    EXPIRED("expired"),

    @SerializedName("pending")
    PENDING("pending");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("au_becs")
    AU_BECS("au_becs"),

    @SerializedName("bacs")
    BACS("bacs"),

    @SerializedName("nz_becs")
    NZ_BECS("nz_becs"),

    @SerializedName("sepa")
    SEPA("sepa");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
