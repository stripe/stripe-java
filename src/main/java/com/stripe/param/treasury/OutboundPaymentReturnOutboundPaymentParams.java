// File generated from our OpenAPI spec
package com.stripe.param.treasury;

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
public class OutboundPaymentReturnOutboundPaymentParams extends ApiRequestParams {
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

  /** Optional hash to set the return code. */
  @SerializedName("returned_details")
  ReturnedDetails returnedDetails;

  private OutboundPaymentReturnOutboundPaymentParams(
      List<String> expand, Map<String, Object> extraParams, ReturnedDetails returnedDetails) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.returnedDetails = returnedDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private ReturnedDetails returnedDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public OutboundPaymentReturnOutboundPaymentParams build() {
      return new OutboundPaymentReturnOutboundPaymentParams(
          this.expand, this.extraParams, this.returnedDetails);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OutboundPaymentReturnOutboundPaymentParams#expand} for the field documentation.
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
     * OutboundPaymentReturnOutboundPaymentParams#expand} for the field documentation.
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
     * OutboundPaymentReturnOutboundPaymentParams#extraParams} for the field documentation.
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
     * See {@link OutboundPaymentReturnOutboundPaymentParams#extraParams} for the field
     * documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Optional hash to set the return code. */
    public Builder setReturnedDetails(
        OutboundPaymentReturnOutboundPaymentParams.ReturnedDetails returnedDetails) {
      this.returnedDetails = returnedDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ReturnedDetails {
    /** The return code to be set on the OutboundPayment object. */
    @SerializedName("code")
    Code code;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ReturnedDetails(Code code, Map<String, Object> extraParams) {
      this.code = code;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Code code;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OutboundPaymentReturnOutboundPaymentParams.ReturnedDetails build() {
        return new OutboundPaymentReturnOutboundPaymentParams.ReturnedDetails(
            this.code, this.extraParams);
      }

      /** The return code to be set on the OutboundPayment object. */
      public Builder setCode(OutboundPaymentReturnOutboundPaymentParams.ReturnedDetails.Code code) {
        this.code = code;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OutboundPaymentReturnOutboundPaymentParams.ReturnedDetails#extraParams} for the field
       * documentation.
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
       * See {@link OutboundPaymentReturnOutboundPaymentParams.ReturnedDetails#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum Code implements ApiRequestParams.EnumParam {
      @SerializedName("account_closed")
      ACCOUNT_CLOSED("account_closed"),

      @SerializedName("account_frozen")
      ACCOUNT_FROZEN("account_frozen"),

      @SerializedName("bank_account_restricted")
      BANK_ACCOUNT_RESTRICTED("bank_account_restricted"),

      @SerializedName("bank_ownership_changed")
      BANK_OWNERSHIP_CHANGED("bank_ownership_changed"),

      @SerializedName("declined")
      DECLINED("declined"),

      @SerializedName("incorrect_account_holder_name")
      INCORRECT_ACCOUNT_HOLDER_NAME("incorrect_account_holder_name"),

      @SerializedName("invalid_account_number")
      INVALID_ACCOUNT_NUMBER("invalid_account_number"),

      @SerializedName("invalid_currency")
      INVALID_CURRENCY("invalid_currency"),

      @SerializedName("no_account")
      NO_ACCOUNT("no_account"),

      @SerializedName("other")
      OTHER("other");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Code(String value) {
        this.value = value;
      }
    }
  }
}
