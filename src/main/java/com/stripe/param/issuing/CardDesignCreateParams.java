// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CardDesignCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The card bundle object belonging to this card design. */
  @SerializedName("card_bundle")
  String cardBundle;

  /**
   * The file for the card logo, for use with card bundles that support card logos. Must have {@code
   * purpose} value of {@code issuing_logo}.
   */
  @SerializedName("card_logo")
  String cardLogo;

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

  /** Information on whether this card design is used to create cards when one is not specified. */
  @SerializedName("preferences")
  Preferences preferences;

  /**
   * If set to true, will atomically remove the lookup key from the existing card design, and assign
   * it to this card design.
   */
  @SerializedName("transfer_lookup_key")
  Boolean transferLookupKey;

  private CardDesignCreateParams(
      String cardBundle,
      String cardLogo,
      CarrierText carrierText,
      List<String> expand,
      Map<String, Object> extraParams,
      String lookupKey,
      Map<String, String> metadata,
      String name,
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
    private String cardBundle;

    private String cardLogo;

    private CarrierText carrierText;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private Map<String, String> metadata;

    private String name;

    private Preferences preferences;

    private Boolean transferLookupKey;

    /** Finalize and obtain parameter instance from this builder. */
    public CardDesignCreateParams build() {
      return new CardDesignCreateParams(
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

    /** <strong>Required.</strong> The card bundle object belonging to this card design. */
    public Builder setCardBundle(String cardBundle) {
      this.cardBundle = cardBundle;
      return this;
    }

    /**
     * The file for the card logo, for use with card bundles that support card logos. Must have
     * {@code purpose} value of {@code issuing_logo}.
     */
    public Builder setCardLogo(String cardLogo) {
      this.cardLogo = cardLogo;
      return this;
    }

    /** Hash containing carrier text, for use with card bundles that support carrier text. */
    public Builder setCarrierText(CardDesignCreateParams.CarrierText carrierText) {
      this.carrierText = carrierText;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardDesignCreateParams#expand} for the field documentation.
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
     * CardDesignCreateParams#expand} for the field documentation.
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
     * CardDesignCreateParams#extraParams} for the field documentation.
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
     * See {@link CardDesignCreateParams#extraParams} for the field documentation.
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CardDesignCreateParams#metadata} for the field documentation.
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
     * See {@link CardDesignCreateParams#metadata} for the field documentation.
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
     * Information on whether this card design is used to create cards when one is not specified.
     */
    public Builder setPreferences(CardDesignCreateParams.Preferences preferences) {
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
    String footerBody;

    /** The footer title text of the carrier letter. */
    @SerializedName("footer_title")
    String footerTitle;

    /** The header body text of the carrier letter. */
    @SerializedName("header_body")
    String headerBody;

    /** The header title text of the carrier letter. */
    @SerializedName("header_title")
    String headerTitle;

    private CarrierText(
        Map<String, Object> extraParams,
        String footerBody,
        String footerTitle,
        String headerBody,
        String headerTitle) {
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

      private String footerBody;

      private String footerTitle;

      private String headerBody;

      private String headerTitle;

      /** Finalize and obtain parameter instance from this builder. */
      public CardDesignCreateParams.CarrierText build() {
        return new CardDesignCreateParams.CarrierText(
            this.extraParams, this.footerBody, this.footerTitle, this.headerBody, this.headerTitle);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CardDesignCreateParams.CarrierText#extraParams} for the field documentation.
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
       * See {@link CardDesignCreateParams.CarrierText#extraParams} for the field documentation.
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

      /** The footer title text of the carrier letter. */
      public Builder setFooterTitle(String footerTitle) {
        this.footerTitle = footerTitle;
        return this;
      }

      /** The header body text of the carrier letter. */
      public Builder setHeaderBody(String headerBody) {
        this.headerBody = headerBody;
        return this;
      }

      /** The header title text of the carrier letter. */
      public Builder setHeaderTitle(String headerTitle) {
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
      public CardDesignCreateParams.Preferences build() {
        return new CardDesignCreateParams.Preferences(this.accountDefault, this.extraParams);
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
       * CardDesignCreateParams.Preferences#extraParams} for the field documentation.
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
       * See {@link CardDesignCreateParams.Preferences#extraParams} for the field documentation.
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
