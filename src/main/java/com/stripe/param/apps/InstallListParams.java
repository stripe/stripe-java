// File generated from our OpenAPI spec
package com.stripe.param.apps;

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
public class InstallListParams extends ApiRequestParams {
  /**
   * Only return installs made by this account. Only useful to app developers and embedding
   * platforms, whose lists span the accounts that installed their app.
   */
  @SerializedName("account")
  String account;

  /** Only return installs for the app specified by this app ID. */
  @SerializedName("app")
  String app;

  /**
   * Only return installs whose installer must authorize pending permissions, content security
   * policy entries, or endpoints.
   */
  @SerializedName("approval_required")
  Boolean approvalRequired;

  /** Only return installs in the distribution channel specified by this channel name. */
  @SerializedName("channel")
  Channel channel;

  /** Only return app installs that were created during the given date interval. */
  @SerializedName("created")
  Object created;

  /** Only return installs created by the embedding platform specified by this account ID. */
  @SerializedName("created_by")
  String createdBy;

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
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** Only return installs with the given status. */
  @SerializedName("status")
  Status status;

  private InstallListParams(
      String account,
      String app,
      Boolean approvalRequired,
      Channel channel,
      Object created,
      String createdBy,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String startingAfter,
      Status status) {
    this.account = account;
    this.app = app;
    this.approvalRequired = approvalRequired;
    this.channel = channel;
    this.created = created;
    this.createdBy = createdBy;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private String app;

    private Boolean approvalRequired;

    private Channel channel;

    private Object created;

    private String createdBy;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public InstallListParams build() {
      return new InstallListParams(
          this.account,
          this.app,
          this.approvalRequired,
          this.channel,
          this.created,
          this.createdBy,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.startingAfter,
          this.status);
    }

    /**
     * Only return installs made by this account. Only useful to app developers and embedding
     * platforms, whose lists span the accounts that installed their app.
     */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /** Only return installs for the app specified by this app ID. */
    public Builder setApp(String app) {
      this.app = app;
      return this;
    }

    /**
     * Only return installs whose installer must authorize pending permissions, content security
     * policy entries, or endpoints.
     */
    public Builder setApprovalRequired(Boolean approvalRequired) {
      this.approvalRequired = approvalRequired;
      return this;
    }

    /** Only return installs in the distribution channel specified by this channel name. */
    public Builder setChannel(InstallListParams.Channel channel) {
      this.channel = channel;
      return this;
    }

    /** Only return app installs that were created during the given date interval. */
    public Builder setCreated(InstallListParams.Created created) {
      this.created = created;
      return this;
    }

    /** Only return app installs that were created during the given date interval. */
    public Builder setCreated(Long created) {
      this.created = created;
      return this;
    }

    /** Only return installs created by the embedding platform specified by this account ID. */
    public Builder setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
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
     * InstallListParams#expand} for the field documentation.
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
     * InstallListParams#expand} for the field documentation.
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
     * InstallListParams#extraParams} for the field documentation.
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
     * See {@link InstallListParams#extraParams} for the field documentation.
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
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /** Only return installs with the given status. */
    public Builder setStatus(InstallListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Created {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Minimum value to filter by (exclusive). */
    @SerializedName("gt")
    Long gt;

    /** Minimum value to filter by (inclusive). */
    @SerializedName("gte")
    Long gte;

    /** Maximum value to filter by (exclusive). */
    @SerializedName("lt")
    Long lt;

    /** Maximum value to filter by (inclusive). */
    @SerializedName("lte")
    Long lte;

    private Created(Map<String, Object> extraParams, Long gt, Long gte, Long lt, Long lte) {
      this.extraParams = extraParams;
      this.gt = gt;
      this.gte = gte;
      this.lt = lt;
      this.lte = lte;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gt;

      private Long gte;

      private Long lt;

      private Long lte;

      /** Finalize and obtain parameter instance from this builder. */
      public InstallListParams.Created build() {
        return new InstallListParams.Created(
            this.extraParams, this.gt, this.gte, this.lt, this.lte);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * InstallListParams.Created#extraParams} for the field documentation.
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
       * See {@link InstallListParams.Created#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Minimum value to filter by (exclusive). */
      public Builder setGt(Long gt) {
        this.gt = gt;
        return this;
      }

      /** Minimum value to filter by (inclusive). */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /** Maximum value to filter by (exclusive). */
      public Builder setLt(Long lt) {
        this.lt = lt;
        return this;
      }

      /** Maximum value to filter by (inclusive). */
      public Builder setLte(Long lte) {
        this.lte = lte;
        return this;
      }
    }
  }

  public enum Channel implements ApiRequestParams.EnumParam {
    @SerializedName("private_live")
    PRIVATE_LIVE("private_live"),

    @SerializedName("private_test")
    PRIVATE_TEST("private_test"),

    @SerializedName("public")
    PUBLIC("public"),

    @SerializedName("testing")
    TESTING("testing");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Channel(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("install_failed")
    INSTALL_FAILED("install_failed"),

    @SerializedName("installed")
    INSTALLED("installed"),

    @SerializedName("installing")
    INSTALLING("installing"),

    @SerializedName("uninstall_failed")
    UNINSTALL_FAILED("uninstall_failed"),

    @SerializedName("uninstalling")
    UNINSTALLING("uninstalling");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
