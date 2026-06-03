// File generated from our OpenAPI spec
package com.stripe.param.v2.signals;

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
public class AccountSignalListParams extends ApiRequestParams {
  /**
   * The account or customer to list signals for. Exactly one of account_details.account or
   * account_details.customer must be provided.
   */
  @SerializedName("account_details")
  AccountDetails accountDetails;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum number of results to return per page. Defaults to 20. */
  @SerializedName("limit")
  Long limit;

  /** <strong>Required.</strong> Signal types to filter by. */
  @SerializedName("type")
  List<AccountSignalListParams.Type> type;

  private AccountSignalListParams(
      AccountDetails accountDetails,
      Map<String, Object> extraParams,
      Long limit,
      List<AccountSignalListParams.Type> type) {
    this.accountDetails = accountDetails;
    this.extraParams = extraParams;
    this.limit = limit;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AccountDetails accountDetails;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<AccountSignalListParams.Type> type;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountSignalListParams build() {
      return new AccountSignalListParams(
          this.accountDetails, this.extraParams, this.limit, this.type);
    }

    /**
     * The account or customer to list signals for. Exactly one of account_details.account or
     * account_details.customer must be provided.
     */
    public Builder setAccountDetails(AccountSignalListParams.AccountDetails accountDetails) {
      this.accountDetails = accountDetails;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * AccountSignalListParams#extraParams} for the field documentation.
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
     * See {@link AccountSignalListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum number of results to return per page. Defaults to 20. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `type` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountSignalListParams#type} for the field documentation.
     */
    public Builder addType(AccountSignalListParams.Type element) {
      if (this.type == null) {
        this.type = new ArrayList<>();
      }
      this.type.add(element);
      return this;
    }

    /**
     * Add all elements to `type` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountSignalListParams#type} for the field documentation.
     */
    public Builder addAllType(List<AccountSignalListParams.Type> elements) {
      if (this.type == null) {
        this.type = new ArrayList<>();
      }
      this.type.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountDetails {
    /** The v2 account ID of the account. */
    @SerializedName("account")
    String account;

    /** The v1 customer ID of the account, for users not yet migrated to v2/accounts. */
    @SerializedName("customer")
    String customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AccountDetails(String account, String customer, Map<String, Object> extraParams) {
      this.account = account;
      this.customer = customer;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private String customer;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountSignalListParams.AccountDetails build() {
        return new AccountSignalListParams.AccountDetails(
            this.account, this.customer, this.extraParams);
      }

      /** The v2 account ID of the account. */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /** The v1 customer ID of the account, for users not yet migrated to v2/accounts. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountSignalListParams.AccountDetails#extraParams} for the field documentation.
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
       * See {@link AccountSignalListParams.AccountDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("fraudulent_merchant")
    FRAUDULENT_MERCHANT("fraudulent_merchant"),

    @SerializedName("merchant_delinquency")
    MERCHANT_DELINQUENCY("merchant_delinquency");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
