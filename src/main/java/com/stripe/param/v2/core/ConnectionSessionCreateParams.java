// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

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
public class ConnectionSessionCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The Account the ConnectionSession will create a connection for. */
  @SerializedName("account")
  String account;

  /** The Connection types that the ConnectionSession is allowed to establish. */
  @SerializedName("allowed_connection_types")
  List<ConnectionSessionCreateParams.AllowedConnectionType> allowedConnectionTypes;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The access that should be collected with the ConnectionSession. */
  @SerializedName("requested_access")
  List<ConnectionSessionCreateParams.RequestedAccess> requestedAccess;

  private ConnectionSessionCreateParams(
      String account,
      List<ConnectionSessionCreateParams.AllowedConnectionType> allowedConnectionTypes,
      Map<String, Object> extraParams,
      List<ConnectionSessionCreateParams.RequestedAccess> requestedAccess) {
    this.account = account;
    this.allowedConnectionTypes = allowedConnectionTypes;
    this.extraParams = extraParams;
    this.requestedAccess = requestedAccess;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private List<ConnectionSessionCreateParams.AllowedConnectionType> allowedConnectionTypes;

    private Map<String, Object> extraParams;

    private List<ConnectionSessionCreateParams.RequestedAccess> requestedAccess;

    /** Finalize and obtain parameter instance from this builder. */
    public ConnectionSessionCreateParams build() {
      return new ConnectionSessionCreateParams(
          this.account, this.allowedConnectionTypes, this.extraParams, this.requestedAccess);
    }

    /**
     * <strong>Required.</strong> The Account the ConnectionSession will create a connection for.
     */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * Add an element to `allowedConnectionTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ConnectionSessionCreateParams#allowedConnectionTypes} for the field documentation.
     */
    public Builder addAllowedConnectionType(
        ConnectionSessionCreateParams.AllowedConnectionType element) {
      if (this.allowedConnectionTypes == null) {
        this.allowedConnectionTypes = new ArrayList<>();
      }
      this.allowedConnectionTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `allowedConnectionTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ConnectionSessionCreateParams#allowedConnectionTypes} for the field documentation.
     */
    public Builder addAllAllowedConnectionType(
        List<ConnectionSessionCreateParams.AllowedConnectionType> elements) {
      if (this.allowedConnectionTypes == null) {
        this.allowedConnectionTypes = new ArrayList<>();
      }
      this.allowedConnectionTypes.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ConnectionSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link ConnectionSessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `requestedAccess` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ConnectionSessionCreateParams#requestedAccess} for the field documentation.
     */
    public Builder addRequestedAccess(ConnectionSessionCreateParams.RequestedAccess element) {
      if (this.requestedAccess == null) {
        this.requestedAccess = new ArrayList<>();
      }
      this.requestedAccess.add(element);
      return this;
    }

    /**
     * Add all elements to `requestedAccess` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ConnectionSessionCreateParams#requestedAccess} for the field documentation.
     */
    public Builder addAllRequestedAccess(
        List<ConnectionSessionCreateParams.RequestedAccess> elements) {
      if (this.requestedAccess == null) {
        this.requestedAccess = new ArrayList<>();
      }
      this.requestedAccess.addAll(elements);
      return this;
    }
  }

  public enum AllowedConnectionType implements ApiRequestParams.EnumParam {
    @SerializedName("link")
    LINK("link");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AllowedConnectionType(String value) {
      this.value = value;
    }
  }

  public enum RequestedAccess implements ApiRequestParams.EnumParam {
    @SerializedName("payout_methods")
    PAYOUT_METHODS("payout_methods");

    @Getter(onMethod_ = {@Override})
    private final String value;

    RequestedAccess(String value) {
      this.value = value;
    }
  }
}
