// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class TaxIdCollectionCreateParams extends ApiRequestParams {
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
   * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn}, {@code
   * ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bo_tin}, {@code br_cnpj},
   * {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code
   * ca_pst_sk}, {@code ca_qst}, {@code ch_vat}, {@code cl_tin}, {@code cn_tin}, {@code co_nit},
   * {@code cr_tin}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin}, {@code es_cif}, {@code
   * eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code hk_br}, {@code hu_tin},
   * {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat}, {@code jp_cn}, {@code jp_rn},
   * {@code jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code li_uid}, {@code mx_rfc}, {@code my_frp},
   * {@code my_itn}, {@code my_sst}, {@code no_vat}, {@code nz_gst}, {@code pe_ruc}, {@code ph_tin},
   * {@code ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code ru_kpp}, {@code sa_vat}, {@code sg_gst},
   * {@code sg_uen}, {@code si_tin}, {@code sv_nit}, {@code th_vat}, {@code tr_tin}, {@code tw_vat},
   * {@code ua_vat}, {@code us_ein}, {@code uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code
   * za_vat}
   */
  @SerializedName("type")
  Type type;

  /** <strong>Required.</strong> Value of the tax ID. */
  @SerializedName("value")
  String value;

  private TaxIdCollectionCreateParams(
      List<String> expand, Map<String, Object> extraParams, Type type, String value) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.type = type;
    this.value = value;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Type type;

    private String value;

    /** Finalize and obtain parameter instance from this builder. */
    public TaxIdCollectionCreateParams build() {
      return new TaxIdCollectionCreateParams(this.expand, this.extraParams, this.type, this.value);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TaxIdCollectionCreateParams#expand} for the field documentation.
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
     * TaxIdCollectionCreateParams#expand} for the field documentation.
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
     * TaxIdCollectionCreateParams#extraParams} for the field documentation.
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
     * See {@link TaxIdCollectionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Type of the tax ID, one of {@code ad_nrt}, {@code ae_trn}, {@code
     * ar_cuit}, {@code au_abn}, {@code au_arn}, {@code bg_uic}, {@code bo_tin}, {@code br_cnpj},
     * {@code br_cpf}, {@code ca_bn}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb},
     * {@code ca_pst_sk}, {@code ca_qst}, {@code ch_vat}, {@code cl_tin}, {@code cn_tin}, {@code
     * co_nit}, {@code cr_tin}, {@code do_rcn}, {@code ec_ruc}, {@code eg_tin}, {@code es_cif},
     * {@code eu_oss_vat}, {@code eu_vat}, {@code gb_vat}, {@code ge_vat}, {@code hk_br}, {@code
     * hu_tin}, {@code id_npwp}, {@code il_vat}, {@code in_gst}, {@code is_vat}, {@code jp_cn},
     * {@code jp_rn}, {@code jp_trn}, {@code ke_pin}, {@code kr_brn}, {@code li_uid}, {@code
     * mx_rfc}, {@code my_frp}, {@code my_itn}, {@code my_sst}, {@code no_vat}, {@code nz_gst},
     * {@code pe_ruc}, {@code ph_tin}, {@code ro_tin}, {@code rs_pib}, {@code ru_inn}, {@code
     * ru_kpp}, {@code sa_vat}, {@code sg_gst}, {@code sg_uen}, {@code si_tin}, {@code sv_nit},
     * {@code th_vat}, {@code tr_tin}, {@code tw_vat}, {@code ua_vat}, {@code us_ein}, {@code
     * uy_ruc}, {@code ve_rif}, {@code vn_tin}, or {@code za_vat}
     */
    public Builder setType(TaxIdCollectionCreateParams.Type type) {
      this.type = type;
      return this;
    }

    /** <strong>Required.</strong> Value of the tax ID. */
    public Builder setValue(String value) {
      this.value = value;
      return this;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("ad_nrt")
    AD_NRT("ad_nrt"),

    @SerializedName("ae_trn")
    AE_TRN("ae_trn"),

    @SerializedName("ar_cuit")
    AR_CUIT("ar_cuit"),

    @SerializedName("au_abn")
    AU_ABN("au_abn"),

    @SerializedName("au_arn")
    AU_ARN("au_arn"),

    @SerializedName("bg_uic")
    BG_UIC("bg_uic"),

    @SerializedName("bo_tin")
    BO_TIN("bo_tin"),

    @SerializedName("br_cnpj")
    BR_CNPJ("br_cnpj"),

    @SerializedName("br_cpf")
    BR_CPF("br_cpf"),

    @SerializedName("ca_bn")
    CA_BN("ca_bn"),

    @SerializedName("ca_gst_hst")
    CA_GST_HST("ca_gst_hst"),

    @SerializedName("ca_pst_bc")
    CA_PST_BC("ca_pst_bc"),

    @SerializedName("ca_pst_mb")
    CA_PST_MB("ca_pst_mb"),

    @SerializedName("ca_pst_sk")
    CA_PST_SK("ca_pst_sk"),

    @SerializedName("ca_qst")
    CA_QST("ca_qst"),

    @SerializedName("ch_vat")
    CH_VAT("ch_vat"),

    @SerializedName("cl_tin")
    CL_TIN("cl_tin"),

    @SerializedName("cn_tin")
    CN_TIN("cn_tin"),

    @SerializedName("co_nit")
    CO_NIT("co_nit"),

    @SerializedName("cr_tin")
    CR_TIN("cr_tin"),

    @SerializedName("do_rcn")
    DO_RCN("do_rcn"),

    @SerializedName("ec_ruc")
    EC_RUC("ec_ruc"),

    @SerializedName("eg_tin")
    EG_TIN("eg_tin"),

    @SerializedName("es_cif")
    ES_CIF("es_cif"),

    @SerializedName("eu_oss_vat")
    EU_OSS_VAT("eu_oss_vat"),

    @SerializedName("eu_vat")
    EU_VAT("eu_vat"),

    @SerializedName("gb_vat")
    GB_VAT("gb_vat"),

    @SerializedName("ge_vat")
    GE_VAT("ge_vat"),

    @SerializedName("hk_br")
    HK_BR("hk_br"),

    @SerializedName("hu_tin")
    HU_TIN("hu_tin"),

    @SerializedName("id_npwp")
    ID_NPWP("id_npwp"),

    @SerializedName("il_vat")
    IL_VAT("il_vat"),

    @SerializedName("in_gst")
    IN_GST("in_gst"),

    @SerializedName("is_vat")
    IS_VAT("is_vat"),

    @SerializedName("jp_cn")
    JP_CN("jp_cn"),

    @SerializedName("jp_rn")
    JP_RN("jp_rn"),

    @SerializedName("jp_trn")
    JP_TRN("jp_trn"),

    @SerializedName("ke_pin")
    KE_PIN("ke_pin"),

    @SerializedName("kr_brn")
    KR_BRN("kr_brn"),

    @SerializedName("li_uid")
    LI_UID("li_uid"),

    @SerializedName("mx_rfc")
    MX_RFC("mx_rfc"),

    @SerializedName("my_frp")
    MY_FRP("my_frp"),

    @SerializedName("my_itn")
    MY_ITN("my_itn"),

    @SerializedName("my_sst")
    MY_SST("my_sst"),

    @SerializedName("no_vat")
    NO_VAT("no_vat"),

    @SerializedName("nz_gst")
    NZ_GST("nz_gst"),

    @SerializedName("pe_ruc")
    PE_RUC("pe_ruc"),

    @SerializedName("ph_tin")
    PH_TIN("ph_tin"),

    @SerializedName("ro_tin")
    RO_TIN("ro_tin"),

    @SerializedName("rs_pib")
    RS_PIB("rs_pib"),

    @SerializedName("ru_inn")
    RU_INN("ru_inn"),

    @SerializedName("ru_kpp")
    RU_KPP("ru_kpp"),

    @SerializedName("sa_vat")
    SA_VAT("sa_vat"),

    @SerializedName("sg_gst")
    SG_GST("sg_gst"),

    @SerializedName("sg_uen")
    SG_UEN("sg_uen"),

    @SerializedName("si_tin")
    SI_TIN("si_tin"),

    @SerializedName("sv_nit")
    SV_NIT("sv_nit"),

    @SerializedName("th_vat")
    TH_VAT("th_vat"),

    @SerializedName("tr_tin")
    TR_TIN("tr_tin"),

    @SerializedName("tw_vat")
    TW_VAT("tw_vat"),

    @SerializedName("ua_vat")
    UA_VAT("ua_vat"),

    @SerializedName("us_ein")
    US_EIN("us_ein"),

    @SerializedName("uy_ruc")
    UY_RUC("uy_ruc"),

    @SerializedName("ve_rif")
    VE_RIF("ve_rif"),

    @SerializedName("vn_tin")
    VN_TIN("vn_tin"),

    @SerializedName("za_vat")
    ZA_VAT("za_vat");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
