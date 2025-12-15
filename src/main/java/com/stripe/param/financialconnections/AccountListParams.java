// File generated from our OpenAPI spec
package com.stripe.param.financialconnections;

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
public class AccountListParams extends ApiRequestParams {
  /**
   * If present, only return accounts that belong to the specified account holder. {@code
   * account_holder[customer]} and {@code account_holder[account]} are mutually exclusive.
   */
  @SerializedName("account_holder")
  AccountHolder accountHolder;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

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
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** If present, only return accounts that were collected as part of the given session. */
  @SerializedName("session")
  String session;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private AccountListParams(
      AccountHolder accountHolder,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String session,
      String startingAfter) {
    this.accountHolder = accountHolder;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.session = session;
    this.startingAfter = startingAfter;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AccountHolder accountHolder;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String session;

    private String startingAfter;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountListParams build() {
      return new AccountListParams(
          this.accountHolder,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.session,
          this.startingAfter);
    }

    /**
     * If present, only return accounts that belong to the specified account holder. {@code
     * account_holder[customer]} and {@code account_holder[account]} are mutually exclusive.
     */
    public Builder setAccountHolder(AccountListParams.AccountHolder accountHolder) {
      this.accountHolder = accountHolder;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountListParams#expand} for the field documentation.
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
     * AccountListParams#expand} for the field documentation.
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
     * AccountListParams#extraParams} for the field documentation.
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
     * See {@link AccountListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** If present, only return accounts that were collected as part of the given session. */
    public Builder setSession(String session) {
      this.session = session;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountHolder {
    /** The ID of the Stripe account whose accounts you will retrieve. */
    @SerializedName("account")
    String account;

    /** The ID of the Stripe customer whose accounts you will retrieve. */
    @SerializedName("customer")
    String customer;

    /** The ID of the Account representing a customer whose accounts you will retrieve. */
    @SerializedName("customer_account")
    String customerAccount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AccountHolder(
        String account, String customer, String customerAccount, Map<String, Object> extraParams) {
      this.account = account;
      this.customer = customer;
      this.customerAccount = customerAccount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private String customer;

      private String customerAccount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountListParams.AccountHolder build() {
        return new AccountListParams.AccountHolder(
            this.account, this.customer, this.customerAccount, this.extraParams);
      }

      /** The ID of the Stripe account whose accounts you will retrieve. */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /** The ID of the Stripe customer whose accounts you will retrieve. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /** The ID of the Account representing a customer whose accounts you will retrieve. */
      public Builder setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountListParams.AccountHolder#extraParams} for the field documentation.
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
       * See {@link AccountListParams.AccountHolder#extraParams} for the field documentation.
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
}
