// File generated from our OpenAPI spec
package com.stripe.param;

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
public class AccountPersonListParams extends ApiRequestParams {
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

  /**
   * Filters on the list of people returned based on the person's relationship to the account's
   * company.
   */
  @SerializedName("relationship")
  Relationship relationship;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  private AccountPersonListParams(
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      Relationship relationship,
      String startingAfter) {
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.relationship = relationship;
    this.startingAfter = startingAfter;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private Relationship relationship;

    private String startingAfter;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountPersonListParams build() {
      return new AccountPersonListParams(
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.relationship,
          this.startingAfter);
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
     * AccountPersonListParams#expand} for the field documentation.
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
     * AccountPersonListParams#expand} for the field documentation.
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
     * AccountPersonListParams#extraParams} for the field documentation.
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
     * See {@link AccountPersonListParams#extraParams} for the field documentation.
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
     * Filters on the list of people returned based on the person's relationship to the account's
     * company.
     */
    public Builder setRelationship(AccountPersonListParams.Relationship relationship) {
      this.relationship = relationship;
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
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Relationship {
    /**
     * A filter on the list of people returned based on whether these people are authorizers of the
     * account's representative.
     */
    @SerializedName("authorizer")
    Boolean authorizer;

    /**
     * A filter on the list of people returned based on whether these people are directors of the
     * account's company.
     */
    @SerializedName("director")
    Boolean director;

    /**
     * A filter on the list of people returned based on whether these people are executives of the
     * account's company.
     */
    @SerializedName("executive")
    Boolean executive;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A filter on the list of people returned based on whether these people are legal guardians of
     * the account's representative.
     */
    @SerializedName("legal_guardian")
    Boolean legalGuardian;

    /**
     * A filter on the list of people returned based on whether these people are owners of the
     * account's company.
     */
    @SerializedName("owner")
    Boolean owner;

    /**
     * A filter on the list of people returned based on whether these people are the representative
     * of the account's company.
     */
    @SerializedName("representative")
    Boolean representative;

    private Relationship(
        Boolean authorizer,
        Boolean director,
        Boolean executive,
        Map<String, Object> extraParams,
        Boolean legalGuardian,
        Boolean owner,
        Boolean representative) {
      this.authorizer = authorizer;
      this.director = director;
      this.executive = executive;
      this.extraParams = extraParams;
      this.legalGuardian = legalGuardian;
      this.owner = owner;
      this.representative = representative;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean authorizer;

      private Boolean director;

      private Boolean executive;

      private Map<String, Object> extraParams;

      private Boolean legalGuardian;

      private Boolean owner;

      private Boolean representative;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountPersonListParams.Relationship build() {
        return new AccountPersonListParams.Relationship(
            this.authorizer,
            this.director,
            this.executive,
            this.extraParams,
            this.legalGuardian,
            this.owner,
            this.representative);
      }

      /**
       * A filter on the list of people returned based on whether these people are authorizers of
       * the account's representative.
       */
      public Builder setAuthorizer(Boolean authorizer) {
        this.authorizer = authorizer;
        return this;
      }

      /**
       * A filter on the list of people returned based on whether these people are directors of the
       * account's company.
       */
      public Builder setDirector(Boolean director) {
        this.director = director;
        return this;
      }

      /**
       * A filter on the list of people returned based on whether these people are executives of the
       * account's company.
       */
      public Builder setExecutive(Boolean executive) {
        this.executive = executive;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountPersonListParams.Relationship#extraParams} for the field documentation.
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
       * See {@link AccountPersonListParams.Relationship#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A filter on the list of people returned based on whether these people are legal guardians
       * of the account's representative.
       */
      public Builder setLegalGuardian(Boolean legalGuardian) {
        this.legalGuardian = legalGuardian;
        return this;
      }

      /**
       * A filter on the list of people returned based on whether these people are owners of the
       * account's company.
       */
      public Builder setOwner(Boolean owner) {
        this.owner = owner;
        return this;
      }

      /**
       * A filter on the list of people returned based on whether these people are the
       * representative of the account's company.
       */
      public Builder setRepresentative(Boolean representative) {
        this.representative = representative;
        return this;
      }
    }
  }
}
