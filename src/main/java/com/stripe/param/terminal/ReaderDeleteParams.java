package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public class ReaderDeleteParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * To [group
   * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
   * on your platform account by connected account, set this parameter to the connected account ID.
   */
  @SerializedName("operator_account")
  String operatorAccount;

  private ReaderDeleteParams(Map<String, Object> extraParams, String operatorAccount) {
    this.extraParams = extraParams;
    this.operatorAccount = operatorAccount;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String operatorAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderDeleteParams build() {
      return new ReaderDeleteParams(this.extraParams, this.operatorAccount);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ReaderDeleteParams#extraParams} for the field documentation.
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
     * See {@link ReaderDeleteParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * To [group
     * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
     * on your platform account by connected account, set this parameter to the connected account
     * ID.
     */
    public Builder setOperatorAccount(String operatorAccount) {
      this.operatorAccount = operatorAccount;
      return this;
    }
  }
}
