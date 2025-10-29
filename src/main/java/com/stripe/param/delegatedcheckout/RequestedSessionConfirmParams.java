// File generated from our OpenAPI spec
package com.stripe.param.delegatedcheckout;

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
public class RequestedSessionConfirmParams extends ApiRequestParams {
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

  /** The PaymentMethod to use with the requested session. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Risk details/signals associated with the requested session. */
  @SerializedName("risk_details")
  RiskDetails riskDetails;

  private RequestedSessionConfirmParams(
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentMethod,
      RiskDetails riskDetails) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentMethod = paymentMethod;
    this.riskDetails = riskDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentMethod;

    private RiskDetails riskDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public RequestedSessionConfirmParams build() {
      return new RequestedSessionConfirmParams(
          this.expand, this.extraParams, this.paymentMethod, this.riskDetails);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RequestedSessionConfirmParams#expand} for the field documentation.
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
     * RequestedSessionConfirmParams#expand} for the field documentation.
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
     * RequestedSessionConfirmParams#extraParams} for the field documentation.
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
     * See {@link RequestedSessionConfirmParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The PaymentMethod to use with the requested session. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** Risk details/signals associated with the requested session. */
    public Builder setRiskDetails(RequestedSessionConfirmParams.RiskDetails riskDetails) {
      this.riskDetails = riskDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RiskDetails {
    /** The client device metadata details for this requested session. */
    @SerializedName("client_device_metadata_details")
    ClientDeviceMetadataDetails clientDeviceMetadataDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private RiskDetails(
        ClientDeviceMetadataDetails clientDeviceMetadataDetails, Map<String, Object> extraParams) {
      this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDeviceMetadataDetails clientDeviceMetadataDetails;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestedSessionConfirmParams.RiskDetails build() {
        return new RequestedSessionConfirmParams.RiskDetails(
            this.clientDeviceMetadataDetails, this.extraParams);
      }

      /** The client device metadata details for this requested session. */
      public Builder setClientDeviceMetadataDetails(
          RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails
              clientDeviceMetadataDetails) {
        this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestedSessionConfirmParams.RiskDetails#extraParams} for the field documentation.
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
       * See {@link RequestedSessionConfirmParams.RiskDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDeviceMetadataDetails {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The radar session. */
      @SerializedName("radar_session")
      String radarSession;

      /** The referrer of the client device. */
      @SerializedName("referrer")
      String referrer;

      /** The remote IP address of the client device. */
      @SerializedName("remote_ip")
      String remoteIp;

      /** The time on page in milliseconds. */
      @SerializedName("time_on_page_ms")
      Long timeOnPageMs;

      /** The user agent of the client device. */
      @SerializedName("user_agent")
      String userAgent;

      private ClientDeviceMetadataDetails(
          Map<String, Object> extraParams,
          String radarSession,
          String referrer,
          String remoteIp,
          Long timeOnPageMs,
          String userAgent) {
        this.extraParams = extraParams;
        this.radarSession = radarSession;
        this.referrer = referrer;
        this.remoteIp = remoteIp;
        this.timeOnPageMs = timeOnPageMs;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String radarSession;

        private String referrer;

        private String remoteIp;

        private Long timeOnPageMs;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails build() {
          return new RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails(
              this.extraParams,
              this.radarSession,
              this.referrer,
              this.remoteIp,
              this.timeOnPageMs,
              this.userAgent);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails#extraParams} for
         * the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * RequestedSessionConfirmParams.RiskDetails.ClientDeviceMetadataDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The radar session. */
        public Builder setRadarSession(String radarSession) {
          this.radarSession = radarSession;
          return this;
        }

        /** The referrer of the client device. */
        public Builder setReferrer(String referrer) {
          this.referrer = referrer;
          return this;
        }

        /** The remote IP address of the client device. */
        public Builder setRemoteIp(String remoteIp) {
          this.remoteIp = remoteIp;
          return this;
        }

        /** The time on page in milliseconds. */
        public Builder setTimeOnPageMs(Long timeOnPageMs) {
          this.timeOnPageMs = timeOnPageMs;
          return this;
        }

        /** The user agent of the client device. */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }
    }
  }
}
