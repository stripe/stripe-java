// File generated from our OpenAPI spec
package com.stripe.param.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class UsBankAccountCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The account number of the bank account. */
  @SerializedName("account_number")
  String accountNumber;

  /** Closed Enum. The type of the bank account (checking or savings). */
  @SerializedName("bank_account_type")
  BankAccountType bankAccountType;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * The fedwire routing number of the bank account. Note that certain banks have the same ACH and
   * wire routing number.
   */
  @SerializedName("fedwire_routing_number")
  String fedwireRoutingNumber;

  /**
   * The ACH routing number of the bank account. Note that certain banks have the same ACH and wire
   * routing number.
   */
  @SerializedName("routing_number")
  String routingNumber;

  private UsBankAccountCreateParams(
      String accountNumber,
      BankAccountType bankAccountType,
      Map<String, Object> extraParams,
      String fedwireRoutingNumber,
      String routingNumber) {
    this.accountNumber = accountNumber;
    this.bankAccountType = bankAccountType;
    this.extraParams = extraParams;
    this.fedwireRoutingNumber = fedwireRoutingNumber;
    this.routingNumber = routingNumber;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String accountNumber;

    private BankAccountType bankAccountType;

    private Map<String, Object> extraParams;

    private String fedwireRoutingNumber;

    private String routingNumber;

    /** Finalize and obtain parameter instance from this builder. */
    public UsBankAccountCreateParams build() {
      return new UsBankAccountCreateParams(
          this.accountNumber,
          this.bankAccountType,
          this.extraParams,
          this.fedwireRoutingNumber,
          this.routingNumber);
    }

    /** <strong>Required.</strong> The account number of the bank account. */
    public Builder setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    /** Closed Enum. The type of the bank account (checking or savings). */
    public Builder setBankAccountType(UsBankAccountCreateParams.BankAccountType bankAccountType) {
      this.bankAccountType = bankAccountType;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * UsBankAccountCreateParams#extraParams} for the field documentation.
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
     * See {@link UsBankAccountCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The fedwire routing number of the bank account. Note that certain banks have the same ACH and
     * wire routing number.
     */
    public Builder setFedwireRoutingNumber(String fedwireRoutingNumber) {
      this.fedwireRoutingNumber = fedwireRoutingNumber;
      return this;
    }

    /**
     * The ACH routing number of the bank account. Note that certain banks have the same ACH and
     * wire routing number.
     */
    public Builder setRoutingNumber(String routingNumber) {
      this.routingNumber = routingNumber;
      return this;
    }
  }

  public enum BankAccountType implements ApiRequestParams.EnumParam {
    @SerializedName("checking")
    CHECKING("checking"),

    @SerializedName("savings")
    SAVINGS("savings");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BankAccountType(String value) {
      this.value = value;
    }
  }
}
