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
public class CardDesignUpdateParams extends ApiRequestParams {
  /** The card bundle object belonging to this card design. */
  @SerializedName("card_bundle")
  Object cardBundle;

  /** The file for the card logo, for use with card bundles that support card logos. */
  @SerializedName("card_logo")
  Object cardLogo;

  /** Hash containing carrier text, for use with card bundles that support carrier text. */
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
   * A lookup key used to retrieve card designs dynamically from a static string. This may be up to
   * 200 characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Friendly display name. Providing an empty string will set the field to null. */
  @SerializedName("name")
  Object name;

  /** Information on whether this card design is used to create cards when one is not specified. */
  @SerializedName("preferences")
  Preferences preferences;

  /**
   * If set to true, will atomically remove the lookup key from the existing card design, and assign
   * it to this card design.
   */
  @SerializedName("transfer_lookup_key")
  Boolean transferLookupKey;

  private CardDesignUpdateParams(
      Object cardBundle,
      Object cardLogo,
      CarrierText carrierText,
      List<String> expand,
      Map<String, Object> extraParams,
      Object lookupKey,
      Map<String, String> metadata,
      Object name,
      Preferences preferences,
      Boolean transferLookupKey) {
    this.cardBundle = cardBundle;
    this.cardLogo = cardLogo;
    this.carrierText = carrierText;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.name = name;
    this.preferences = preferences;
    this.transferLookupKey = transferLookupKey;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object cardBundle;

    private Object cardLogo;

    private CarrierText carrierText;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object lookupKey;

    private Map<String, String> metadata;

    private Object name;

    private Preferences preferences;

    private Boolean transferLookupKey;

    /** Finalize and obtain parameter instance from this builder. */
    public CardDesignUpdateParams build() {
      return new CardDesignUpdateParams(
          this.cardBundle,
          this.cardLogo,
          this.carrierText,
          this.expand,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.name,
          this.preferences,
          this.transferLookupKey);
    }

    /** The card bundle object belonging to this card design. */
    public Builder setCardBundle(String cardBundle) {
      this.cardBundle = cardBundle;
      return this;
    }

    /** The card bundle object belonging to this card design. */
    public Builder setCardBundle(EmptyParam cardBundle) {
      this.cardBundle = cardBundle;
      return this;
    }

    /** The file for the card logo, for use with card bundles that support card logos. */
    public Builder setCardLogo(String cardLogo) {
      this.cardLogo = cardLogo;
      return this;
    }

    /** The file for the card logo, for use with card bundles that support card logos. */
    public Builder setCardLogo(EmptyParam cardLogo) {
      this.cardLogo = cardLogo;
      return this;
    }

    /** Hash containing carrier text, for use with card bundles that support carrier text. */
    public Builder setCarrierText(CardDesignUpdateParams.CarrierText carrierText) {
      this.carrierText = carrierText;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardDesignUpdateParams#expand} for the field documentation.
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
     * CardDesignUpdateParams#expand} for the field documentation.
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
     * CardDesignUpdateParams#extraParams} for the field documentation.
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
     * See {@link CardDesignUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A lookup key used to retrieve card designs dynamically from a static string. This may be up
     * to 200 characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * A lookup key used to retrieve card designs dynamically from a static string. This may be up
     * to 200 characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CardDesignUpdateParams#metadata} for the field documentation.
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
     * See {@link CardDesignUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** Friendly display name. Providing an empty string will set the field to null. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Friendly display name. Providing an empty string will set the field to null. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    /**
     * Information on whether this card design is used to create cards when one is not specified.
     */
    public Builder setPreferences(CardDesignUpdateParams.Preferences preferences) {
      this.preferences = preferences;
      return this;
    }

    /**
     * If set to true, will atomically remove the lookup key from the existing card design, and
     * assign it to this card design.
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
      public CardDesignUpdateParams.CarrierText build() {
        return new CardDesignUpdateParams.CarrierText(
            this.extraParams, this.footerBody, this.footerTitle, this.headerBody, this.headerTitle);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardDesignUpdateParams.CarrierText#extraParams} for the field documentation.
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
       * See {@link CardDesignUpdateParams.CarrierText#extraParams} for the field documentation.
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
     * <strong>Required.</strong> Whether this card design is used to create cards when one is not
     * specified. A connected account will use the Connect platform's default if no card design is
     * set as the account default.
     */
    @SerializedName("account_default")
    Boolean accountDefault;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Preferences(Boolean accountDefault, Map<String, Object> extraParams) {
      this.accountDefault = accountDefault;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean accountDefault;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CardDesignUpdateParams.Preferences build() {
        return new CardDesignUpdateParams.Preferences(this.accountDefault, this.extraParams);
      }

      /**
       * <strong>Required.</strong> Whether this card design is used to create cards when one is not
       * specified. A connected account will use the Connect platform's default if no card design is
       * set as the account default.
       */
      public Builder setAccountDefault(Boolean accountDefault) {
        this.accountDefault = accountDefault;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardDesignUpdateParams.Preferences#extraParams} for the field documentation.
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
       * See {@link CardDesignUpdateParams.Preferences#extraParams} for the field documentation.
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
