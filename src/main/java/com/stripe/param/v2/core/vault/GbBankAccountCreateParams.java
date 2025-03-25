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
  /** <strong>Required.</strong> The Account Number of the bank account. */
  @SerializedName("account_number")
  String accountNumber;

  /** Closed Enum. The type of the bank account (checking or savings). */
  @SerializedName("bank_account_type")
  BankAccountType bankAccountType;

  /**
   * Whether or not to automatically perform Confirmation of Payee to verify the users information
   * against what was provided by the bank. Doing so is required for all bank accounts not owned by
   * you before making domestic UK OutboundPayments.
   */
  @SerializedName("confirmation_of_payee")
  ConfirmationOfPayee confirmationOfPayee;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The Sort Code of the bank account. */
  @SerializedName("sort_code")
  String sortCode;

  private GbBankAccountCreateParams(
      String accountNumber,
      BankAccountType bankAccountType,
      ConfirmationOfPayee confirmationOfPayee,
      Map<String, Object> extraParams,
      String sortCode) {
    this.accountNumber = accountNumber;
    this.bankAccountType = bankAccountType;
    this.confirmationOfPayee = confirmationOfPayee;
    this.extraParams = extraParams;
    this.sortCode = sortCode;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String accountNumber;

    private BankAccountType bankAccountType;

    private ConfirmationOfPayee confirmationOfPayee;

    private Map<String, Object> extraParams;

    private String sortCode;

    /** Finalize and obtain parameter instance from this builder. */
    public GbBankAccountCreateParams build() {
      return new GbBankAccountCreateParams(
          this.accountNumber,
          this.bankAccountType,
          this.confirmationOfPayee,
          this.extraParams,
          this.sortCode);
    }

    /** <strong>Required.</strong> The Account Number of the bank account. */
    public Builder setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    /** Closed Enum. The type of the bank account (checking or savings). */
    public Builder setBankAccountType(GbBankAccountCreateParams.BankAccountType bankAccountType) {
      this.bankAccountType = bankAccountType;
      return this;
    }

    /**
     * Whether or not to automatically perform Confirmation of Payee to verify the users information
     * against what was provided by the bank. Doing so is required for all bank accounts not owned
     * by you before making domestic UK OutboundPayments.
     */
    public Builder setConfirmationOfPayee(
        GbBankAccountCreateParams.ConfirmationOfPayee confirmationOfPayee) {
      this.confirmationOfPayee = confirmationOfPayee;
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

    /** <strong>Required.</strong> The Sort Code of the bank account. */
    public Builder setSortCode(String sortCode) {
      this.sortCode = sortCode;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ConfirmationOfPayee {
    /**
     * The business type to be checked against. Legal entity information will be used if
     * unspecified. Closed enum.
     */
    @SerializedName("business_type")
    BusinessType businessType;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> User specifies whether Confirmation of Payee is automatically
     * initiated when creating the bank account.
     */
    @SerializedName("initiate")
    Boolean initiate;

    /** The name to be checked against. Legal entity information will be used if unspecified. */
    @SerializedName("name")
    String name;

    private ConfirmationOfPayee(
        BusinessType businessType, Map<String, Object> extraParams, Boolean initiate, String name) {
      this.businessType = businessType;
      this.extraParams = extraParams;
      this.initiate = initiate;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BusinessType businessType;

      private Map<String, Object> extraParams;

      private Boolean initiate;

      private String name;

      /** Finalize and obtain parameter instance from this builder. */
      public GbBankAccountCreateParams.ConfirmationOfPayee build() {
        return new GbBankAccountCreateParams.ConfirmationOfPayee(
            this.businessType, this.extraParams, this.initiate, this.name);
      }

      /**
       * The business type to be checked against. Legal entity information will be used if
       * unspecified. Closed enum.
       */
      public Builder setBusinessType(
          GbBankAccountCreateParams.ConfirmationOfPayee.BusinessType businessType) {
        this.businessType = businessType;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * GbBankAccountCreateParams.ConfirmationOfPayee#extraParams} for the field documentation.
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
       * See {@link GbBankAccountCreateParams.ConfirmationOfPayee#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> User specifies whether Confirmation of Payee is automatically
       * initiated when creating the bank account.
       */
      public Builder setInitiate(Boolean initiate) {
        this.initiate = initiate;
        return this;
      }

      /** The name to be checked against. Legal entity information will be used if unspecified. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }
    }

    public enum BusinessType implements ApiRequestParams.EnumParam {
      @SerializedName("business")
      BUSINESS("business"),

      @SerializedName("personal")
      PERSONAL("personal");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BusinessType(String value) {
        this.value = value;
      }
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
