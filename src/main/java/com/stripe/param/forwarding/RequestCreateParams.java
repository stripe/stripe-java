// File generated from our OpenAPI spec
package com.stripe.param.forwarding;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class RequestCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The Forwarding Config used when making the forwarded request. The
   * config specifes the HTTP method, merchant credentials, connection settings, and supported
   * destination URLs.
   */
  @SerializedName("config")
  String config;

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
   * <strong>Required.</strong> The PaymentMethod to insert into the forwarded request. Forwarding
   * previously consumed PaymentMethods is allowed.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** <strong>Required.</strong> The field kinds to be replaced in the forwarded request. */
  @SerializedName("replacements")
  List<RequestCreateParams.Replacement> replacements;

  /**
   * <strong>Required.</strong> The request body and headers to be sent to the destination endpoint.
   */
  @SerializedName("request")
  Request request;

  /**
   * <strong>Required.</strong> The destination URL for the forwarded request. Must be supported by
   * the config.
   */
  @SerializedName("url")
  String url;

  private RequestCreateParams(
      String config,
      List<String> expand,
      Map<String, Object> extraParams,
      String paymentMethod,
      List<RequestCreateParams.Replacement> replacements,
      Request request,
      String url) {
    this.config = config;
    this.expand = expand;
    this.extraParams = extraParams;
    this.paymentMethod = paymentMethod;
    this.replacements = replacements;
    this.request = request;
    this.url = url;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String config;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String paymentMethod;

    private List<RequestCreateParams.Replacement> replacements;

    private Request request;

    private String url;

    /** Finalize and obtain parameter instance from this builder. */
    public RequestCreateParams build() {
      return new RequestCreateParams(
          this.config,
          this.expand,
          this.extraParams,
          this.paymentMethod,
          this.replacements,
          this.request,
          this.url);
    }

    /**
     * <strong>Required.</strong> The Forwarding Config used when making the forwarded request. The
     * config specifes the HTTP method, merchant credentials, connection settings, and supported
     * destination URLs.
     */
    public Builder setConfig(String config) {
      this.config = config;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RequestCreateParams#expand} for the field documentation.
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
     * RequestCreateParams#expand} for the field documentation.
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
     * RequestCreateParams#extraParams} for the field documentation.
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
     * See {@link RequestCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The PaymentMethod to insert into the forwarded request. Forwarding
     * previously consumed PaymentMethods is allowed.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Add an element to `replacements` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * RequestCreateParams#replacements} for the field documentation.
     */
    public Builder addReplacement(RequestCreateParams.Replacement element) {
      if (this.replacements == null) {
        this.replacements = new ArrayList<>();
      }
      this.replacements.add(element);
      return this;
    }

    /**
     * Add all elements to `replacements` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * RequestCreateParams#replacements} for the field documentation.
     */
    public Builder addAllReplacement(List<RequestCreateParams.Replacement> elements) {
      if (this.replacements == null) {
        this.replacements = new ArrayList<>();
      }
      this.replacements.addAll(elements);
      return this;
    }

    /**
     * <strong>Required.</strong> The request body and headers to be sent to the destination
     * endpoint.
     */
    public Builder setRequest(RequestCreateParams.Request request) {
      this.request = request;
      return this;
    }

    /**
     * <strong>Required.</strong> The destination URL for the forwarded request. Must be supported
     * by the config.
     */
    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }
  }

  @Getter
  public static class Request {
    /** The body payload to send to the destination endpoint. */
    @SerializedName("body")
    String body;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The headers to include in the forwarded request. Can be omitted if no additional headers
     * (excluding Stripe-generated ones such as the Content-Type header) should be included.
     */
    @SerializedName("headers")
    List<RequestCreateParams.Request.Header> headers;

    private Request(
        String body,
        Map<String, Object> extraParams,
        List<RequestCreateParams.Request.Header> headers) {
      this.body = body;
      this.extraParams = extraParams;
      this.headers = headers;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String body;

      private Map<String, Object> extraParams;

      private List<RequestCreateParams.Request.Header> headers;

      /** Finalize and obtain parameter instance from this builder. */
      public RequestCreateParams.Request build() {
        return new RequestCreateParams.Request(this.body, this.extraParams, this.headers);
      }

      /** The body payload to send to the destination endpoint. */
      public Builder setBody(String body) {
        this.body = body;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RequestCreateParams.Request#extraParams} for the field documentation.
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
       * See {@link RequestCreateParams.Request#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `headers` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RequestCreateParams.Request#headers} for the field documentation.
       */
      public Builder addHeader(RequestCreateParams.Request.Header element) {
        if (this.headers == null) {
          this.headers = new ArrayList<>();
        }
        this.headers.add(element);
        return this;
      }

      /**
       * Add all elements to `headers` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RequestCreateParams.Request#headers} for the field documentation.
       */
      public Builder addAllHeader(List<RequestCreateParams.Request.Header> elements) {
        if (this.headers == null) {
          this.headers = new ArrayList<>();
        }
        this.headers.addAll(elements);
        return this;
      }
    }

    @Getter
    public static class Header {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The header name. */
      @SerializedName("name")
      String name;

      /** <strong>Required.</strong> The header value. */
      @SerializedName("value")
      String value;

      private Header(Map<String, Object> extraParams, String name, String value) {
        this.extraParams = extraParams;
        this.name = name;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String name;

        private String value;

        /** Finalize and obtain parameter instance from this builder. */
        public RequestCreateParams.Request.Header build() {
          return new RequestCreateParams.Request.Header(this.extraParams, this.name, this.value);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RequestCreateParams.Request.Header#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RequestCreateParams.Request.Header#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The header name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** <strong>Required.</strong> The header value. */
        public Builder setValue(String value) {
          this.value = value;
          return this;
        }
      }
    }
  }

  public enum Replacement implements ApiRequestParams.EnumParam {
    @SerializedName("card_cvc")
    CARD_CVC("card_cvc"),

    @SerializedName("card_expiry")
    CARD_EXPIRY("card_expiry"),

    @SerializedName("card_number")
    CARD_NUMBER("card_number"),

    @SerializedName("cardholder_name")
    CARDHOLDER_NAME("cardholder_name");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Replacement(String value) {
      this.value = value;
    }
  }
}
