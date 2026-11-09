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
public class GbBankAccountCreateParams extends ApiRequestParams {
  /** The Account Number of the bank account. */
  @SerializedName("account_number")
  String accountNumber;

  /** Closed Enum. The type of the bank account (checking or savings). */
  @SerializedName("bank_account_type")
  BankAccountType bankAccountType;

  /** <strong>Required.</strong> The currency of the bank account. */
  @SerializedName("currency")
  String currency;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The IBAN of the bank account. */
  @SerializedName("iban")
  String iban;

  /** The Sort Code of the bank account. */
  @SerializedName("sort_code")
  String sortCode;

  private GbBankAccountCreateParams(
      String accountNumber,
      BankAccountType bankAccountType,
      String currency,
      Map<String, Object> extraParams,
      String iban,
      String sortCode) {
    this.accountNumber = accountNumber;
    this.bankAccountType = bankAccountType;
    this.currency = currency;
    this.extraParams = extraParams;
    this.iban = iban;
    this.sortCode = sortCode;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String accountNumber;

    private BankAccountType bankAccountType;

    private String currency;

    private Map<String, Object> extraParams;

    private String iban;

    private String sortCode;

    /** Finalize and obtain parameter instance from this builder. */
    public GbBankAccountCreateParams build() {
      return new GbBankAccountCreateParams(
          this.accountNumber,
          this.bankAccountType,
          this.currency,
          this.extraParams,
          this.iban,
          this.sortCode);
    }

    /** The Account Number of the bank account. */
    public Builder setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    /** Closed Enum. The type of the bank account (checking or savings). */
    public Builder setBankAccountType(GbBankAccountCreateParams.BankAccountType bankAccountType) {
      this.bankAccountType = bankAccountType;
      return this;
    }

    /** <strong>Required.</strong> The currency of the bank account. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * GbBankAccountCreateParams#extraParams} for the field documentation.
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
     * See {@link GbBankAccountCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The IBAN of the bank account. */
    public Builder setIban(String iban) {
      this.iban = iban;
      return this;
    }

    /** The Sort Code of the bank account. */
    public Builder setSortCode(String sortCode) {
      this.sortCode = sortCode;
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
