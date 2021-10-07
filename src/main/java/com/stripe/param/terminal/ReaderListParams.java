// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ReaderListParams extends ApiRequestParams {
  /** Filters readers by device type. */
  @SerializedName("device_type")
  DeviceType deviceType;

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

  /** A location ID to filter the response list to only readers at the specific location. */
  @SerializedName("location")
  String location;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** A status filter to filter readers to only offline or online readers. */
  @SerializedName("status")
  Status status;

  private ReaderListParams(
      DeviceType deviceType,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String location,
      String startingAfter,
      Status status) {
    this.deviceType = deviceType;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.location = location;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private DeviceType deviceType;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String location;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderListParams build() {
      return new ReaderListParams(
          this.deviceType,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.location,
          this.startingAfter,
          this.status);
    }

    /** Filters readers by device type. */
    public Builder setDeviceType(DeviceType deviceType) {
      this.deviceType = deviceType;
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
     * ReaderListParams#expand} for the field documentation.
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
     * ReaderListParams#expand} for the field documentation.
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
     * ReaderListParams#extraParams} for the field documentation.
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
     * See {@link ReaderListParams#extraParams} for the field documentation.
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

    /** A location ID to filter the response list to only readers at the specific location. */
    public Builder setLocation(String location) {
      this.location = location;
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

    /** A status filter to filter readers to only offline or online readers. */
    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }
  }

  public enum DeviceType implements ApiRequestParams.EnumParam {
    @SerializedName("bbpos_chipper2x")
    BBPOS_CHIPPER2X("bbpos_chipper2x"),

    @SerializedName("bbpos_wisepos_e")
    BBPOS_WISEPOS_E("bbpos_wisepos_e"),

    @SerializedName("verifone_P400")
    VERIFONE_P400("verifone_P400");

    @Getter(onMethod_ = {@Override})
    private final String value;

    DeviceType(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("offline")
    OFFLINE("offline"),

    @SerializedName("online")
    ONLINE("online");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
