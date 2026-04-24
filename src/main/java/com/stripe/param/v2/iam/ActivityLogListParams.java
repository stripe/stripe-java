// File generated from our OpenAPI spec
package com.stripe.param.v2.iam;

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
public class ActivityLogListParams extends ApiRequestParams {
  /** Filter results to only include activity logs for the specified action group types. */
  @SerializedName("action_groups")
  List<ActivityLogListParams.ActionGroup> actionGroups;

  /** Filter results to only include activity logs for the specified action types. */
  @SerializedName("actions")
  List<ActivityLogListParams.Action> actions;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum number of results to return per page. */
  @SerializedName("limit")
  Long limit;

  private ActivityLogListParams(
      List<ActivityLogListParams.ActionGroup> actionGroups,
      List<ActivityLogListParams.Action> actions,
      Map<String, Object> extraParams,
      Long limit) {
    this.actionGroups = actionGroups;
    this.actions = actions;
    this.extraParams = extraParams;
    this.limit = limit;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<ActivityLogListParams.ActionGroup> actionGroups;

    private List<ActivityLogListParams.Action> actions;

    private Map<String, Object> extraParams;

    private Long limit;

    /** Finalize and obtain parameter instance from this builder. */
    public ActivityLogListParams build() {
      return new ActivityLogListParams(
          this.actionGroups, this.actions, this.extraParams, this.limit);
    }

    /**
     * Add an element to `actionGroups` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actionGroups} for the field documentation.
     */
    public Builder addActionGroup(ActivityLogListParams.ActionGroup element) {
      if (this.actionGroups == null) {
        this.actionGroups = new ArrayList<>();
      }
      this.actionGroups.add(element);
      return this;
    }

    /**
     * Add all elements to `actionGroups` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actionGroups} for the field documentation.
     */
    public Builder addAllActionGroup(List<ActivityLogListParams.ActionGroup> elements) {
      if (this.actionGroups == null) {
        this.actionGroups = new ArrayList<>();
      }
      this.actionGroups.addAll(elements);
      return this;
    }

    /**
     * Add an element to `actions` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actions} for the field documentation.
     */
    public Builder addAction(ActivityLogListParams.Action element) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.add(element);
      return this;
    }

    /**
     * Add all elements to `actions` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ActivityLogListParams#actions} for the field documentation.
     */
    public Builder addAllAction(List<ActivityLogListParams.Action> elements) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ActivityLogListParams#extraParams} for the field documentation.
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
     * See {@link ActivityLogListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum number of results to return per page. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }
  }

  public enum Action implements ApiRequestParams.EnumParam {
    @SerializedName("api_key_created")
    API_KEY_CREATED("api_key_created"),

    @SerializedName("api_key_deleted")
    API_KEY_DELETED("api_key_deleted"),

    @SerializedName("api_key_updated")
    API_KEY_UPDATED("api_key_updated"),

    @SerializedName("api_key_viewed")
    API_KEY_VIEWED("api_key_viewed"),

    @SerializedName("user_invite_accepted")
    USER_INVITE_ACCEPTED("user_invite_accepted"),

    @SerializedName("user_invite_created")
    USER_INVITE_CREATED("user_invite_created"),

    @SerializedName("user_invite_deleted")
    USER_INVITE_DELETED("user_invite_deleted"),

    @SerializedName("user_roles_deleted")
    USER_ROLES_DELETED("user_roles_deleted"),

    @SerializedName("user_roles_updated")
    USER_ROLES_UPDATED("user_roles_updated");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Action(String value) {
      this.value = value;
    }
  }

  public enum ActionGroup implements ApiRequestParams.EnumParam {
    @SerializedName("api_key")
    API_KEY("api_key"),

    @SerializedName("user_invite")
    USER_INVITE("user_invite"),

    @SerializedName("user_roles")
    USER_ROLES("user_roles");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ActionGroup(String value) {
      this.value = value;
    }
  }
}
