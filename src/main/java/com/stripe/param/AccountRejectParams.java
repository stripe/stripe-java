// File generated from our OpenAPI spec
package com.stripe.param;

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
public class AccountRejectParams extends ApiRequestParams {
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
   * Whether to pause payouts on the account as part of the rejection. Defaults to {@code pause}.
   * Use {@code none} to leave payouts enabled.
   */
  @SerializedName("payouts_action")
  PayoutsAction payoutsAction;

  /**
   * <strong>Required.</strong> The reason for rejecting the account. Can be {@code fraud}, {@code
   * terms_of_service}, or {@code other}.
   */
  @SerializedName("reason")
  String reason;

  private AccountRejectParams(
      List<String> expand,
      Map<String, Object> extraParams,
      PayoutsAction payoutsAction,
      String reason) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.payoutsAction = payoutsAction;
    this.reason = reason;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private PayoutsAction payoutsAction;

    private String reason;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountRejectParams build() {
      return new AccountRejectParams(
          this.expand, this.extraParams, this.payoutsAction, this.reason);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountRejectParams#expand} for the field documentation.
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
     * AccountRejectParams#expand} for the field documentation.
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
     * AccountRejectParams#extraParams} for the field documentation.
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
     * See {@link AccountRejectParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Whether to pause payouts on the account as part of the rejection. Defaults to {@code pause}.
     * Use {@code none} to leave payouts enabled.
     */
    public Builder setPayoutsAction(AccountRejectParams.PayoutsAction payoutsAction) {
      this.payoutsAction = payoutsAction;
      return this;
    }

    /**
     * <strong>Required.</strong> The reason for rejecting the account. Can be {@code fraud}, {@code
     * terms_of_service}, or {@code other}.
     */
    public Builder setReason(String reason) {
      this.reason = reason;
      return this;
    }
  }

  public enum PayoutsAction implements ApiRequestParams.EnumParam {
    @SerializedName("none")
    NONE("none"),

    @SerializedName("pause")
    PAUSE("pause");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PayoutsAction(String value) {
      this.value = value;
    }
  }
}
