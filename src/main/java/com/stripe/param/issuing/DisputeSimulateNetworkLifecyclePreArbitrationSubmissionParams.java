// File generated from our OpenAPI spec
package com.stripe.param.issuing;

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
public class DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams
    extends ApiRequestParams {
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
   * <strong>Required.</strong> Controls the acquiring merchant's simulated submitted evidence files
   * for the pre-arbitration submission stage.
   */
  @SerializedName("merchant_evidence_files")
  MerchantEvidenceFiles merchantEvidenceFiles;

  private DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams(
      List<String> expand,
      Map<String, Object> extraParams,
      MerchantEvidenceFiles merchantEvidenceFiles) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.merchantEvidenceFiles = merchantEvidenceFiles;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private MerchantEvidenceFiles merchantEvidenceFiles;

    /** Finalize and obtain parameter instance from this builder. */
    public DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams build() {
      return new DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams(
          this.expand, this.extraParams, this.merchantEvidenceFiles);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams#expand} for the field
     * documentation.
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
     * DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams#expand} for the field
     * documentation.
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
     * DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams#extraParams} for the field
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
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams#extraParams} for the
     * field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Controls the acquiring merchant's simulated submitted evidence
     * files for the pre-arbitration submission stage.
     */
    public Builder setMerchantEvidenceFiles(
        DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams.MerchantEvidenceFiles
            merchantEvidenceFiles) {
      this.merchantEvidenceFiles = merchantEvidenceFiles;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantEvidenceFiles {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> How many simulated merchant evidence file tokens to attach
     * (between 1 and 12).
     */
    @SerializedName("number_to_generate")
    Long numberToGenerate;

    private MerchantEvidenceFiles(Map<String, Object> extraParams, Long numberToGenerate) {
      this.extraParams = extraParams;
      this.numberToGenerate = numberToGenerate;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long numberToGenerate;

      /** Finalize and obtain parameter instance from this builder. */
      public DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams.MerchantEvidenceFiles
          build() {
        return new DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams
            .MerchantEvidenceFiles(this.extraParams, this.numberToGenerate);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams.MerchantEvidenceFiles#extraParams}
       * for the field documentation.
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
       * See {@link
       * DisputeSimulateNetworkLifecyclePreArbitrationSubmissionParams.MerchantEvidenceFiles#extraParams}
       * for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> How many simulated merchant evidence file tokens to attach
       * (between 1 and 12).
       */
      public Builder setNumberToGenerate(Long numberToGenerate) {
        this.numberToGenerate = numberToGenerate;
        return this;
      }
    }
  }
}
