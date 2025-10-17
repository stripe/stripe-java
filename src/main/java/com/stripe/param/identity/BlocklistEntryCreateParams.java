// File generated from our OpenAPI spec
package com.stripe.param.identity;

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
public class BlocklistEntryCreateParams extends ApiRequestParams {
  /**
   * When true, the created BlocklistEntry will be used to retroactively unverify matching
   * verifications.
   */
  @SerializedName("check_existing_verifications")
  Boolean checkExistingVerifications;

  /** <strong>Required.</strong> The type of blocklist entry to be created. */
  @SerializedName("entry_type")
  EntryType entryType;

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
   * <strong>Required.</strong> The identifier of the VerificationReport to create the
   * BlocklistEntry from.
   */
  @SerializedName("verification_report")
  String verificationReport;

  private BlocklistEntryCreateParams(
      Boolean checkExistingVerifications,
      EntryType entryType,
      List<String> expand,
      Map<String, Object> extraParams,
      String verificationReport) {
    this.checkExistingVerifications = checkExistingVerifications;
    this.entryType = entryType;
    this.expand = expand;
    this.extraParams = extraParams;
    this.verificationReport = verificationReport;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean checkExistingVerifications;

    private EntryType entryType;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String verificationReport;

    /** Finalize and obtain parameter instance from this builder. */
    public BlocklistEntryCreateParams build() {
      return new BlocklistEntryCreateParams(
          this.checkExistingVerifications,
          this.entryType,
          this.expand,
          this.extraParams,
          this.verificationReport);
    }

    /**
     * When true, the created BlocklistEntry will be used to retroactively unverify matching
     * verifications.
     */
    public Builder setCheckExistingVerifications(Boolean checkExistingVerifications) {
      this.checkExistingVerifications = checkExistingVerifications;
      return this;
    }

    /** <strong>Required.</strong> The type of blocklist entry to be created. */
    public Builder setEntryType(BlocklistEntryCreateParams.EntryType entryType) {
      this.entryType = entryType;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * BlocklistEntryCreateParams#expand} for the field documentation.
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
     * BlocklistEntryCreateParams#expand} for the field documentation.
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
     * BlocklistEntryCreateParams#extraParams} for the field documentation.
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
     * See {@link BlocklistEntryCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The identifier of the VerificationReport to create the
     * BlocklistEntry from.
     */
    public Builder setVerificationReport(String verificationReport) {
      this.verificationReport = verificationReport;
      return this;
    }
  }

  public enum EntryType implements ApiRequestParams.EnumParam {
    @SerializedName("document")
    DOCUMENT("document"),

    @SerializedName("selfie")
    SELFIE("selfie");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EntryType(String value) {
      this.value = value;
    }
  }
}
