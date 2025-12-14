// File generated from our OpenAPI spec
package com.stripe.param.v2.iam;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ApiKeyCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Name for the API key. */
  @SerializedName("name")
  String name;

  /** Note or description for the API key. */
  @SerializedName("note")
  String note;

  /**
   * Public key for encrypting the API key secret. This must a PEM-formatted RSA key suitable for
   * encryption, &gt;= 2048 bits. A public key is required when creating secret keys. Publishable
   * keys are not encrypted and a public key should not be included.
   */
  @SerializedName("public_key")
  PublicKey publicKey;

  /** <strong>Required.</strong> Type of the API key to create (secret or publishable). */
  @SerializedName("type")
  Type type;

  private ApiKeyCreateParams(
      Map<String, Object> extraParams, String name, String note, PublicKey publicKey, Type type) {
    this.extraParams = extraParams;
    this.name = name;
    this.note = note;
    this.publicKey = publicKey;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String name;

    private String note;

    private PublicKey publicKey;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public ApiKeyCreateParams build() {
      return new ApiKeyCreateParams(
          this.extraParams, this.name, this.note, this.publicKey, this.type);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ApiKeyCreateParams#extraParams} for the field documentation.
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
     * See {@link ApiKeyCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Name for the API key. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Note or description for the API key. */
    public Builder setNote(String note) {
      this.note = note;
      return this;
    }

    /**
     * Public key for encrypting the API key secret. This must a PEM-formatted RSA key suitable for
     * encryption, &gt;= 2048 bits. A public key is required when creating secret keys. Publishable
     * keys are not encrypted and a public key should not be included.
     */
    public Builder setPublicKey(ApiKeyCreateParams.PublicKey publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    /** <strong>Required.</strong> Type of the API key to create (secret or publishable). */
    public Builder setType(ApiKeyCreateParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PublicKey {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Caller's identifier of the public key. This is used for tracking purposes only, and will be
     * echoed in the response if provided.
     */
    @SerializedName("id")
    String id;

    /** PEM-formatted public key. */
    @SerializedName("pem_key")
    PemKey pemKey;

    private PublicKey(Map<String, Object> extraParams, String id, PemKey pemKey) {
      this.extraParams = extraParams;
      this.id = id;
      this.pemKey = pemKey;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      private PemKey pemKey;

      /** Finalize and obtain parameter instance from this builder. */
      public ApiKeyCreateParams.PublicKey build() {
        return new ApiKeyCreateParams.PublicKey(this.extraParams, this.id, this.pemKey);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ApiKeyCreateParams.PublicKey#extraParams} for the field documentation.
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
       * See {@link ApiKeyCreateParams.PublicKey#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Caller's identifier of the public key. This is used for tracking purposes only, and will be
       * echoed in the response if provided.
       */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** PEM-formatted public key. */
      public Builder setPemKey(ApiKeyCreateParams.PublicKey.PemKey pemKey) {
        this.pemKey = pemKey;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PemKey {
      /** <strong>Required.</strong> The encryption algorithm used with this key (e.g., RSA). */
      @SerializedName("algorithm")
      String algorithm;

      /**
       * <strong>Required.</strong> The PEM-encoded public key data. Newlines are required between
       * header/footer and body, and optional within the body.
       */
      @SerializedName("data")
      String data;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private PemKey(String algorithm, String data, Map<String, Object> extraParams) {
        this.algorithm = algorithm;
        this.data = data;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String algorithm;

        private String data;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ApiKeyCreateParams.PublicKey.PemKey build() {
          return new ApiKeyCreateParams.PublicKey.PemKey(
              this.algorithm, this.data, this.extraParams);
        }

        /** <strong>Required.</strong> The encryption algorithm used with this key (e.g., RSA). */
        public Builder setAlgorithm(String algorithm) {
          this.algorithm = algorithm;
          return this;
        }

        /**
         * <strong>Required.</strong> The PEM-encoded public key data. Newlines are required between
         * header/footer and body, and optional within the body.
         */
        public Builder setData(String data) {
          this.data = data;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ApiKeyCreateParams.PublicKey.PemKey#extraParams} for the field
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
         * map. See {@link ApiKeyCreateParams.PublicKey.PemKey#extraParams} for the field
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
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("publishable_key")
    PUBLISHABLE_KEY("publishable_key"),

    @SerializedName("secret_key")
    SECRET_KEY("secret_key");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
