// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentIntentTriggerActionParams extends ApiRequestParams {
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

  /** True to simulate success, false to simulate failure. */
  @SerializedName("scan_qr_code")
  ScanQrCode scanQrCode;

  /** <strong>Required.</strong> The type of action to be simulated. */
  @SerializedName("type")
  Type type;

  private PaymentIntentTriggerActionParams(
      List<String> expand, Map<String, Object> extraParams, ScanQrCode scanQrCode, Type type) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.scanQrCode = scanQrCode;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private ScanQrCode scanQrCode;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentTriggerActionParams build() {
      return new PaymentIntentTriggerActionParams(
          this.expand, this.extraParams, this.scanQrCode, this.type);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentTriggerActionParams#expand} for the field documentation.
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
     * PaymentIntentTriggerActionParams#expand} for the field documentation.
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
     * PaymentIntentTriggerActionParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentTriggerActionParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** True to simulate success, false to simulate failure. */
    public Builder setScanQrCode(PaymentIntentTriggerActionParams.ScanQrCode scanQrCode) {
      this.scanQrCode = scanQrCode;
      return this;
    }

    /** <strong>Required.</strong> The type of action to be simulated. */
    public Builder setType(PaymentIntentTriggerActionParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class ScanQrCode {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Whether the QR Code scan's payment should succeed or fail. */
    @SerializedName("result")
    Result result;

    private ScanQrCode(Map<String, Object> extraParams, Result result) {
      this.extraParams = extraParams;
      this.result = result;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Result result;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentTriggerActionParams.ScanQrCode build() {
        return new PaymentIntentTriggerActionParams.ScanQrCode(this.extraParams, this.result);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentTriggerActionParams.ScanQrCode#extraParams} for the field documentation.
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
       * See {@link PaymentIntentTriggerActionParams.ScanQrCode#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Whether the QR Code scan's payment should succeed or fail. */
      public Builder setResult(PaymentIntentTriggerActionParams.ScanQrCode.Result result) {
        this.result = result;
        return this;
      }
    }

    public enum Result implements ApiRequestParams.EnumParam {
      @SerializedName("failure")
      FAILURE("failure"),

      @SerializedName("success")
      SUCCESS("success");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Result(String value) {
        this.value = value;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("expire")
    EXPIRE("expire"),

    @SerializedName("fund")
    FUND("fund");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
