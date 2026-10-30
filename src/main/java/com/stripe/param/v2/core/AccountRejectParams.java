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
public class AccountRejectParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<AccountRejectParams.Include> include;

  /**
   * Operations that remain unaffected by the rejection. Repeated requests replace the previous set;
   * omitting this field clears any preserved operations.
   */
  @SerializedName("preserve_operations")
  List<AccountRejectParams.PreserveOperation> preserveOperations;

  /**
   * <strong>Required.</strong> The reason for rejecting the Account. Repeated requests replace the
   * previously recorded reason.
   */
  @SerializedName("reason")
  Reason reason;

  private AccountRejectParams(
      Map<String, Object> extraParams,
      List<AccountRejectParams.Include> include,
      List<AccountRejectParams.PreserveOperation> preserveOperations,
      Reason reason) {
    this.extraParams = extraParams;
    this.include = include;
    this.preserveOperations = preserveOperations;
    this.reason = reason;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<AccountRejectParams.Include> include;

    private List<AccountRejectParams.PreserveOperation> preserveOperations;

    private Reason reason;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountRejectParams build() {
      return new AccountRejectParams(
          this.extraParams, this.include, this.preserveOperations, this.reason);
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
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountRejectParams#include} for the field documentation.
     */
    public Builder addInclude(AccountRejectParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * AccountRejectParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<AccountRejectParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add an element to `preserveOperations` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * AccountRejectParams#preserveOperations} for the field documentation.
     */
    public Builder addPreserveOperation(AccountRejectParams.PreserveOperation element) {
      if (this.preserveOperations == null) {
        this.preserveOperations = new ArrayList<>();
      }
      this.preserveOperations.add(element);
      return this;
    }

    /**
     * Add all elements to `preserveOperations` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link AccountRejectParams#preserveOperations} for the field documentation.
     */
    public Builder addAllPreserveOperation(List<AccountRejectParams.PreserveOperation> elements) {
      if (this.preserveOperations == null) {
        this.preserveOperations = new ArrayList<>();
      }
      this.preserveOperations.addAll(elements);
      return this;
    }

    /**
     * <strong>Required.</strong> The reason for rejecting the Account. Repeated requests replace
     * the previously recorded reason.
     */
    public Builder setReason(AccountRejectParams.Reason reason) {
      this.reason = reason;
      return this;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("configuration.card_creator")
    CONFIGURATION__CARD_CREATOR("configuration.card_creator"),

    @SerializedName("configuration.customer")
    CONFIGURATION__CUSTOMER("configuration.customer"),

    @SerializedName("configuration.developer")
    CONFIGURATION__DEVELOPER("configuration.developer"),

    @SerializedName("configuration.merchant")
    CONFIGURATION__MERCHANT("configuration.merchant"),

    @SerializedName("configuration.recipient")
    CONFIGURATION__RECIPIENT("configuration.recipient"),

    @SerializedName("configuration.money_manager")
    CONFIGURATION__MONEY_MANAGER("configuration.money_manager"),

    @SerializedName("defaults")
    DEFAULTS("defaults"),

    @SerializedName("future_requirements")
    FUTURE_REQUIREMENTS("future_requirements"),

    @SerializedName("identity")
    IDENTITY("identity"),

    @SerializedName("requirements")
    REQUIREMENTS("requirements");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }

  public enum PreserveOperation implements ApiRequestParams.EnumParam {
    @SerializedName("payouts")
    PAYOUTS("payouts");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PreserveOperation(String value) {
      this.value = value;
    }
  }

  public enum Reason implements ApiRequestParams.EnumParam {
    @SerializedName("credit")
    CREDIT("credit"),

    @SerializedName("fraud_no_intent_to_fulfill")
    FRAUD_NO_INTENT_TO_FULFILL("fraud_no_intent_to_fulfill"),

    @SerializedName("fraud_other")
    FRAUD_OTHER("fraud_other"),

    @SerializedName("fraud_payment_method_casher")
    FRAUD_PAYMENT_METHOD_CASHER("fraud_payment_method_casher"),

    @SerializedName("fraud_payment_method_tester")
    FRAUD_PAYMENT_METHOD_TESTER("fraud_payment_method_tester"),

    @SerializedName("other")
    OTHER("other"),

    @SerializedName("terms_of_service")
    TERMS_OF_SERVICE("terms_of_service");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Reason(String value) {
      this.value = value;
    }
  }
}
