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
public class PersonalizationDesignListParams extends ApiRequestParams {
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

  /** Only return personalization designs with the given lookup keys. */
  @SerializedName("lookup_keys")
  List<String> lookupKeys;

  /** Only return personalization designs with the given preferences. */
  @SerializedName("preferences")
  Preferences preferences;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** Only return personalization designs with the given status. */
  @SerializedName("status")
  Status status;

  private PersonalizationDesignListParams(
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      List<String> lookupKeys,
      Preferences preferences,
      String startingAfter,
      Status status) {
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.lookupKeys = lookupKeys;
    this.preferences = preferences;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<String> lookupKeys;

    private Preferences preferences;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public PersonalizationDesignListParams build() {
      return new PersonalizationDesignListParams(
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.lookupKeys,
          this.preferences,
          this.startingAfter,
          this.status);
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
     * PersonalizationDesignListParams#expand} for the field documentation.
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
     * PersonalizationDesignListParams#expand} for the field documentation.
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
     * PersonalizationDesignListParams#extraParams} for the field documentation.
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
     * See {@link PersonalizationDesignListParams#extraParams} for the field documentation.
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

    /**
     * Add an element to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PersonalizationDesignListParams#lookupKeys} for the field documentation.
     */
    public Builder addLookupKey(String element) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.add(element);
      return this;
    }

    /**
     * Add all elements to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PersonalizationDesignListParams#lookupKeys} for the field documentation.
     */
    public Builder addAllLookupKey(List<String> elements) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.addAll(elements);
      return this;
    }

    /** Only return personalization designs with the given preferences. */
    public Builder setPreferences(PersonalizationDesignListParams.Preferences preferences) {
      this.preferences = preferences;
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

    /** Only return personalization designs with the given status. */
    public Builder setStatus(PersonalizationDesignListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  public static class Preferences {
    /**
     * Only return the personalization design that is set as the account default. A connected
     * account will use the Connect platform's default if no personalization design is set as the
     * account default.
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

    /**
     * Only return the personalization design that is set as the Connect platform's default. This
     * parameter is only applicable to connected accounts.
     */
    @SerializedName("platform_default")
    Boolean platformDefault;

    private Preferences(
        Boolean accountDefault, Map<String, Object> extraParams, Boolean platformDefault) {
      this.accountDefault = accountDefault;
      this.extraParams = extraParams;
      this.platformDefault = platformDefault;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean accountDefault;

      private Map<String, Object> extraParams;

      private Boolean platformDefault;

      /** Finalize and obtain parameter instance from this builder. */
      public PersonalizationDesignListParams.Preferences build() {
        return new PersonalizationDesignListParams.Preferences(
            this.accountDefault, this.extraParams, this.platformDefault);
      }

      /**
       * Only return the personalization design that is set as the account default. A connected
       * account will use the Connect platform's default if no personalization design is set as the
       * account default.
       */
      public Builder setAccountDefault(Boolean accountDefault) {
        this.accountDefault = accountDefault;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PersonalizationDesignListParams.Preferences#extraParams} for the field documentation.
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
       * See {@link PersonalizationDesignListParams.Preferences#extraParams} for the field
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
       * Only return the personalization design that is set as the Connect platform's default. This
       * parameter is only applicable to connected accounts.
       */
      public Builder setPlatformDefault(Boolean platformDefault) {
        this.platformDefault = platformDefault;
        return this;
      }
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive"),

    @SerializedName("rejected")
    REJECTED("rejected"),

    @SerializedName("review")
    REVIEW("review");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
