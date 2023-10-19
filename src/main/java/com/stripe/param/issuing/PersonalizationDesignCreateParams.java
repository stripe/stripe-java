// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PersonalizationDesignCreateParams extends ApiRequestParams {
  /**
   * The file for the card logo, for use with physical bundles that support card logos. Must have
   * {@code purpose} value of {@code issuing_logo}.
   */
  @SerializedName("card_logo")
  String cardLogo;

  /** Hash containing carrier text, for use with physical bundles that support carrier text. */
  @SerializedName("carrier_text")
  CarrierText carrierText;

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
   * A lookup key used to retrieve personalization designs dynamically from a static string. This
   * may be up to 200 characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Friendly display name. */
  @SerializedName("name")
  String name;

  /**
   * <strong>Required.</strong> The physical bundle object belonging to this personalization design.
   */
  @SerializedName("physical_bundle")
  String physicalBundle;

  /**
   * Information on whether this personalization design is used to create cards when one is not
   * specified.
   */
  @SerializedName("preferences")
  Preferences preferences;

  /**
   * If set to true, will atomically remove the lookup key from the existing personalization design,
   * and assign it to this personalization design.
   */
  @SerializedName("transfer_lookup_key")
  Boolean transferLookupKey;

  private PersonalizationDesignCreateParams(
      String cardLogo,
      CarrierText carrierText,
      List<String> expand,
      Map<String, Object> extraParams,
      String lookupKey,
      Map<String, String> metadata,
      String name,
      String physicalBundle,
      Preferences preferences,
      Boolean transferLookupKey) {
    this.cardLogo = cardLogo;
    this.carrierText = carrierText;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.name = name;
    this.physicalBundle = physicalBundle;
    this.preferences = preferences;
    this.transferLookupKey = transferLookupKey;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String cardLogo;

    private CarrierText carrierText;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private Map<String, String> metadata;

    private String name;

    private String physicalBundle;

    private Preferences preferences;

    private Boolean transferLookupKey;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonalizationDesignCreateParams build() {
      return new PersonalizationDesignCreateParams(
          this.cardLogo,
          this.carrierText,
          this.expand,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.name,
          this.physicalBundle,
          this.preferences,
          this.transferLookupKey);
    }

    /**
     * The file for the card logo, for use with physical bundles that support card logos. Must have
     * {@code purpose} value of {@code issuing_logo}.
     */
    public Builder setCardLogo(String cardLogo) {
      this.cardLogo = cardLogo;
      return this;
    }

    /** Hash containing carrier text, for use with physical bundles that support carrier text. */
    public Builder setCarrierText(PersonalizationDesignCreateParams.CarrierText carrierText) {
      this.carrierText = carrierText;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PersonalizationDesignCreateParams#expand} for the field documentation.
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
     * PersonalizationDesignCreateParams#expand} for the field documentation.
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
     * PersonalizationDesignCreateParams#extraParams} for the field documentation.
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
     * See {@link PersonalizationDesignCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A lookup key used to retrieve personalization designs dynamically from a static string. This
     * may be up to 200 characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PersonalizationDesignCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PersonalizationDesignCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Friendly display name. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * <strong>Required.</strong> The physical bundle object belonging to this personalization
     * design.
     */
    public Builder setPhysicalBundle(String physicalBundle) {
      this.physicalBundle = physicalBundle;
      return this;
    }

    /**
     * Information on whether this personalization design is used to create cards when one is not
     * specified.
     */
    public Builder setPreferences(PersonalizationDesignCreateParams.Preferences preferences) {
      this.preferences = preferences;
      return this;
    }

    /**
     * If set to true, will atomically remove the lookup key from the existing personalization
     * design, and assign it to this personalization design.
     */
    public Builder setTransferLookupKey(Boolean transferLookupKey) {
      this.transferLookupKey = transferLookupKey;
      return this;
    }
  }

  @Getter
  public static class CarrierText {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The footer body text of the carrier letter. */
    @SerializedName("footer_body")
    Object footerBody;

    /** The footer title text of the carrier letter. */
    @SerializedName("footer_title")
    Object footerTitle;

    /** The header body text of the carrier letter. */
    @SerializedName("header_body")
    Object headerBody;

    /** The header title text of the carrier letter. */
    @SerializedName("header_title")
    Object headerTitle;

    private CarrierText(
        Map<String, Object> extraParams,
        Object footerBody,
        Object footerTitle,
        Object headerBody,
        Object headerTitle) {
      this.extraParams = extraParams;
      this.footerBody = footerBody;
      this.footerTitle = footerTitle;
      this.headerBody = headerBody;
      this.headerTitle = headerTitle;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object footerBody;

      private Object footerTitle;

      private Object headerBody;

      private Object headerTitle;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonalizationDesignCreateParams.CarrierText build() {
        return new PersonalizationDesignCreateParams.CarrierText(
            this.extraParams, this.footerBody, this.footerTitle, this.headerBody, this.headerTitle);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonalizationDesignCreateParams.CarrierText#extraParams} for the field documentation.
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
       * See {@link PersonalizationDesignCreateParams.CarrierText#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The footer body text of the carrier letter. */
      public Builder setFooterBody(String footerBody) {
        this.footerBody = footerBody;
        return this;
      }

      /** The footer body text of the carrier letter. */
      public Builder setFooterBody(EmptyParam footerBody) {
        this.footerBody = footerBody;
        return this;
      }

      /** The footer title text of the carrier letter. */
      public Builder setFooterTitle(String footerTitle) {
        this.footerTitle = footerTitle;
        return this;
      }

      /** The footer title text of the carrier letter. */
      public Builder setFooterTitle(EmptyParam footerTitle) {
        this.footerTitle = footerTitle;
        return this;
      }

      /** The header body text of the carrier letter. */
      public Builder setHeaderBody(String headerBody) {
        this.headerBody = headerBody;
        return this;
      }

      /** The header body text of the carrier letter. */
      public Builder setHeaderBody(EmptyParam headerBody) {
        this.headerBody = headerBody;
        return this;
      }

      /** The header title text of the carrier letter. */
      public Builder setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
        return this;
      }

      /** The header title text of the carrier letter. */
      public Builder setHeaderTitle(EmptyParam headerTitle) {
        this.headerTitle = headerTitle;
        return this;
      }
    }
  }

  @Getter
  public static class Preferences {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Whether this personalization design is used to create cards when
     * one is not specified. A connected account will use the Connect platform's default if no
     * personalization design is set as default.
     */
    @SerializedName("is_default")
    Boolean isDefault;

    private Preferences(Map<String, Object> extraParams, Boolean isDefault) {
      this.extraParams = extraParams;
      this.isDefault = isDefault;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Boolean isDefault;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonalizationDesignCreateParams.Preferences build() {
        return new PersonalizationDesignCreateParams.Preferences(this.extraParams, this.isDefault);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonalizationDesignCreateParams.Preferences#extraParams} for the field documentation.
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
       * See {@link PersonalizationDesignCreateParams.Preferences#extraParams} for the field
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
       * <strong>Required.</strong> Whether this personalization design is used to create cards when
       * one is not specified. A connected account will use the Connect platform's default if no
       * personalization design is set as default.
       */
      public Builder setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
      }
    }
  }
}
