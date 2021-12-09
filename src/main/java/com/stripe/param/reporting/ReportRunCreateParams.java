// File generated from our OpenAPI spec
package com.stripe.param.reporting;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ReportRunCreateParams extends ApiRequestParams {
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
   * Parameters specifying how the report should be run. Different Report Types have different
   * required and optional parameters, listed in the <a
   * href="https://stripe.com/docs/reporting/statements/api">API Access to Reports</a>
   * documentation.
   */
  @SerializedName("parameters")
  Parameters parameters;

  /**
   * The ID of the <a href="https://stripe.com/docs/reporting/statements/api#report-types">report
   * type</a> to run, such as {@code "balance.summary.1"}.
   */
  @SerializedName("report_type")
  String reportType;

  private ReportRunCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Parameters parameters,
      String reportType) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.parameters = parameters;
    this.reportType = reportType;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Parameters parameters;

    private String reportType;

    /** Finalize and obtain parameter instance from this builder. */
    public ReportRunCreateParams build() {
      return new ReportRunCreateParams(
          this.expand, this.extraParams, this.parameters, this.reportType);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReportRunCreateParams#expand} for the field documentation.
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
     * ReportRunCreateParams#expand} for the field documentation.
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
     * ReportRunCreateParams#extraParams} for the field documentation.
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
     * See {@link ReportRunCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Parameters specifying how the report should be run. Different Report Types have different
     * required and optional parameters, listed in the <a
     * href="https://stripe.com/docs/reporting/statements/api">API Access to Reports</a>
     * documentation.
     */
    public Builder setParameters(Parameters parameters) {
      this.parameters = parameters;
      return this;
    }

    /**
     * The ID of the <a href="https://stripe.com/docs/reporting/statements/api#report-types">report
     * type</a> to run, such as {@code "balance.summary.1"}.
     */
    public Builder setReportType(String reportType) {
      this.reportType = reportType;
      return this;
    }
  }

  @Getter
  public static class Parameters {
    /**
     * The set of report columns to include in the report output. If omitted, the Report Type is run
     * with its default column set.
     */
    @SerializedName("columns")
    List<String> columns;

    /** Connected account ID to filter for in the report run. */
    @SerializedName("connected_account")
    String connectedAccount;

    /** Currency of objects to be included in the report run. */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Ending timestamp of data to be included in the report run (exclusive). */
    @SerializedName("interval_end")
    Long intervalEnd;

    /** Starting timestamp of data to be included in the report run. */
    @SerializedName("interval_start")
    Long intervalStart;

    /** Payout ID by which to filter the report run. */
    @SerializedName("payout")
    String payout;

    /** Category of balance transactions to be included in the report run. */
    @SerializedName("reporting_category")
    ReportingCategory reportingCategory;

    /**
     * Defaults to {@code Etc/UTC}. The output timezone for all timestamps in the report. A list of
     * possible time zone values is maintained at the <a href="http://www.iana.org/time-zones">IANA
     * Time Zone Database</a>. Has no effect on {@code interval_start} or {@code interval_end}.
     */
    @SerializedName("timezone")
    Timezone timezone;

    private Parameters(
        List<String> columns,
        String connectedAccount,
        String currency,
        Map<String, Object> extraParams,
        Long intervalEnd,
        Long intervalStart,
        String payout,
        ReportingCategory reportingCategory,
        Timezone timezone) {
      this.columns = columns;
      this.connectedAccount = connectedAccount;
      this.currency = currency;
      this.extraParams = extraParams;
      this.intervalEnd = intervalEnd;
      this.intervalStart = intervalStart;
      this.payout = payout;
      this.reportingCategory = reportingCategory;
      this.timezone = timezone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<String> columns;

      private String connectedAccount;

      private String currency;

      private Map<String, Object> extraParams;

      private Long intervalEnd;

      private Long intervalStart;

      private String payout;

      private ReportingCategory reportingCategory;

      private Timezone timezone;

      /** Finalize and obtain parameter instance from this builder. */
      public Parameters build() {
        return new Parameters(
            this.columns,
            this.connectedAccount,
            this.currency,
            this.extraParams,
            this.intervalEnd,
            this.intervalStart,
            this.payout,
            this.reportingCategory,
            this.timezone);
      }

      /**
       * Add an element to `columns` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ReportRunCreateParams.Parameters#columns} for the field documentation.
       */
      public Builder addColumn(String element) {
        if (this.columns == null) {
          this.columns = new ArrayList<>();
        }
        this.columns.add(element);
        return this;
      }

      /**
       * Add all elements to `columns` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ReportRunCreateParams.Parameters#columns} for the field documentation.
       */
      public Builder addAllColumn(List<String> elements) {
        if (this.columns == null) {
          this.columns = new ArrayList<>();
        }
        this.columns.addAll(elements);
        return this;
      }

      /** Connected account ID to filter for in the report run. */
      public Builder setConnectedAccount(String connectedAccount) {
        this.connectedAccount = connectedAccount;
        return this;
      }

      /** Currency of objects to be included in the report run. */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReportRunCreateParams.Parameters#extraParams} for the field documentation.
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
       * See {@link ReportRunCreateParams.Parameters#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Ending timestamp of data to be included in the report run (exclusive). */
      public Builder setIntervalEnd(Long intervalEnd) {
        this.intervalEnd = intervalEnd;
        return this;
      }

      /** Starting timestamp of data to be included in the report run. */
      public Builder setIntervalStart(Long intervalStart) {
        this.intervalStart = intervalStart;
        return this;
      }

      /** Payout ID by which to filter the report run. */
      public Builder setPayout(String payout) {
        this.payout = payout;
        return this;
      }

      /** Category of balance transactions to be included in the report run. */
      public Builder setReportingCategory(ReportingCategory reportingCategory) {
        this.reportingCategory = reportingCategory;
        return this;
      }

      /**
       * Defaults to {@code Etc/UTC}. The output timezone for all timestamps in the report. A list
       * of possible time zone values is maintained at the <a
       * href="http://www.iana.org/time-zones">IANA Time Zone Database</a>. Has no effect on {@code
       * interval_start} or {@code interval_end}.
       */
      public Builder setTimezone(Timezone timezone) {
        this.timezone = timezone;
        return this;
      }
    }

    public enum ReportingCategory implements ApiRequestParams.EnumParam {
      @SerializedName("advance")
      ADVANCE("advance"),

      @SerializedName("advance_funding")
      ADVANCE_FUNDING("advance_funding"),

      @SerializedName("anticipation_repayment")
      ANTICIPATION_REPAYMENT("anticipation_repayment"),

      @SerializedName("charge")
      CHARGE("charge"),

      @SerializedName("charge_failure")
      CHARGE_FAILURE("charge_failure"),

      @SerializedName("connect_collection_transfer")
      CONNECT_COLLECTION_TRANSFER("connect_collection_transfer"),

      @SerializedName("connect_reserved_funds")
      CONNECT_RESERVED_FUNDS("connect_reserved_funds"),

      @SerializedName("contribution")
      CONTRIBUTION("contribution"),

      @SerializedName("dispute")
      DISPUTE("dispute"),

      @SerializedName("dispute_reversal")
      DISPUTE_REVERSAL("dispute_reversal"),

      @SerializedName("fee")
      FEE("fee"),

      @SerializedName("financing_paydown")
      FINANCING_PAYDOWN("financing_paydown"),

      @SerializedName("financing_paydown_reversal")
      FINANCING_PAYDOWN_REVERSAL("financing_paydown_reversal"),

      @SerializedName("financing_payout")
      FINANCING_PAYOUT("financing_payout"),

      @SerializedName("financing_payout_reversal")
      FINANCING_PAYOUT_REVERSAL("financing_payout_reversal"),

      @SerializedName("issuing_authorization_hold")
      ISSUING_AUTHORIZATION_HOLD("issuing_authorization_hold"),

      @SerializedName("issuing_authorization_release")
      ISSUING_AUTHORIZATION_RELEASE("issuing_authorization_release"),

      @SerializedName("issuing_dispute")
      ISSUING_DISPUTE("issuing_dispute"),

      @SerializedName("issuing_transaction")
      ISSUING_TRANSACTION("issuing_transaction"),

      @SerializedName("network_cost")
      NETWORK_COST("network_cost"),

      @SerializedName("other_adjustment")
      OTHER_ADJUSTMENT("other_adjustment"),

      @SerializedName("partial_capture_reversal")
      PARTIAL_CAPTURE_REVERSAL("partial_capture_reversal"),

      @SerializedName("payout")
      PAYOUT("payout"),

      @SerializedName("payout_reversal")
      PAYOUT_REVERSAL("payout_reversal"),

      @SerializedName("platform_earning")
      PLATFORM_EARNING("platform_earning"),

      @SerializedName("platform_earning_refund")
      PLATFORM_EARNING_REFUND("platform_earning_refund"),

      @SerializedName("refund")
      REFUND("refund"),

      @SerializedName("refund_failure")
      REFUND_FAILURE("refund_failure"),

      @SerializedName("risk_reserved_funds")
      RISK_RESERVED_FUNDS("risk_reserved_funds"),

      @SerializedName("tax")
      TAX("tax"),

      @SerializedName("topup")
      TOPUP("topup"),

      @SerializedName("topup_reversal")
      TOPUP_REVERSAL("topup_reversal"),

      @SerializedName("transfer")
      TRANSFER("transfer"),

      @SerializedName("transfer_reversal")
      TRANSFER_REVERSAL("transfer_reversal");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ReportingCategory(String value) {
        this.value = value;
      }
    }

    public enum Timezone implements ApiRequestParams.EnumParam {
      @SerializedName("Africa/Abidjan")
      AFRICA_ABIDJAN("Africa/Abidjan"),

      @SerializedName("Africa/Accra")
      AFRICA_ACCRA("Africa/Accra"),

      @SerializedName("Africa/Addis_Ababa")
      AFRICA_ADDIS_ABABA("Africa/Addis_Ababa"),

      @SerializedName("Africa/Algiers")
      AFRICA_ALGIERS("Africa/Algiers"),

      @SerializedName("Africa/Asmara")
      AFRICA_ASMARA("Africa/Asmara"),

      @SerializedName("Africa/Asmera")
      AFRICA_ASMERA("Africa/Asmera"),

      @SerializedName("Africa/Bamako")
      AFRICA_BAMAKO("Africa/Bamako"),

      @SerializedName("Africa/Bangui")
      AFRICA_BANGUI("Africa/Bangui"),

      @SerializedName("Africa/Banjul")
      AFRICA_BANJUL("Africa/Banjul"),

      @SerializedName("Africa/Bissau")
      AFRICA_BISSAU("Africa/Bissau"),

      @SerializedName("Africa/Blantyre")
      AFRICA_BLANTYRE("Africa/Blantyre"),

      @SerializedName("Africa/Brazzaville")
      AFRICA_BRAZZAVILLE("Africa/Brazzaville"),

      @SerializedName("Africa/Bujumbura")
      AFRICA_BUJUMBURA("Africa/Bujumbura"),

      @SerializedName("Africa/Cairo")
      AFRICA_CAIRO("Africa/Cairo"),

      @SerializedName("Africa/Casablanca")
      AFRICA_CASABLANCA("Africa/Casablanca"),

      @SerializedName("Africa/Ceuta")
      AFRICA_CEUTA("Africa/Ceuta"),

      @SerializedName("Africa/Conakry")
      AFRICA_CONAKRY("Africa/Conakry"),

      @SerializedName("Africa/Dakar")
      AFRICA_DAKAR("Africa/Dakar"),

      @SerializedName("Africa/Dar_es_Salaam")
      AFRICA_DAR_ES_SALAAM("Africa/Dar_es_Salaam"),

      @SerializedName("Africa/Djibouti")
      AFRICA_DJIBOUTI("Africa/Djibouti"),

      @SerializedName("Africa/Douala")
      AFRICA_DOUALA("Africa/Douala"),

      @SerializedName("Africa/El_Aaiun")
      AFRICA_EL_AAIUN("Africa/El_Aaiun"),

      @SerializedName("Africa/Freetown")
      AFRICA_FREETOWN("Africa/Freetown"),

      @SerializedName("Africa/Gaborone")
      AFRICA_GABORONE("Africa/Gaborone"),

      @SerializedName("Africa/Harare")
      AFRICA_HARARE("Africa/Harare"),

      @SerializedName("Africa/Johannesburg")
      AFRICA_JOHANNESBURG("Africa/Johannesburg"),

      @SerializedName("Africa/Juba")
      AFRICA_JUBA("Africa/Juba"),

      @SerializedName("Africa/Kampala")
      AFRICA_KAMPALA("Africa/Kampala"),

      @SerializedName("Africa/Khartoum")
      AFRICA_KHARTOUM("Africa/Khartoum"),

      @SerializedName("Africa/Kigali")
      AFRICA_KIGALI("Africa/Kigali"),

      @SerializedName("Africa/Kinshasa")
      AFRICA_KINSHASA("Africa/Kinshasa"),

      @SerializedName("Africa/Lagos")
      AFRICA_LAGOS("Africa/Lagos"),

      @SerializedName("Africa/Libreville")
      AFRICA_LIBREVILLE("Africa/Libreville"),

      @SerializedName("Africa/Lome")
      AFRICA_LOME("Africa/Lome"),

      @SerializedName("Africa/Luanda")
      AFRICA_LUANDA("Africa/Luanda"),

      @SerializedName("Africa/Lubumbashi")
      AFRICA_LUBUMBASHI("Africa/Lubumbashi"),

      @SerializedName("Africa/Lusaka")
      AFRICA_LUSAKA("Africa/Lusaka"),

      @SerializedName("Africa/Malabo")
      AFRICA_MALABO("Africa/Malabo"),

      @SerializedName("Africa/Maputo")
      AFRICA_MAPUTO("Africa/Maputo"),

      @SerializedName("Africa/Maseru")
      AFRICA_MASERU("Africa/Maseru"),

      @SerializedName("Africa/Mbabane")
      AFRICA_MBABANE("Africa/Mbabane"),

      @SerializedName("Africa/Mogadishu")
      AFRICA_MOGADISHU("Africa/Mogadishu"),

      @SerializedName("Africa/Monrovia")
      AFRICA_MONROVIA("Africa/Monrovia"),

      @SerializedName("Africa/Nairobi")
      AFRICA_NAIROBI("Africa/Nairobi"),

      @SerializedName("Africa/Ndjamena")
      AFRICA_NDJAMENA("Africa/Ndjamena"),

      @SerializedName("Africa/Niamey")
      AFRICA_NIAMEY("Africa/Niamey"),

      @SerializedName("Africa/Nouakchott")
      AFRICA_NOUAKCHOTT("Africa/Nouakchott"),

      @SerializedName("Africa/Ouagadougou")
      AFRICA_OUAGADOUGOU("Africa/Ouagadougou"),

      @SerializedName("Africa/Porto-Novo")
      AFRICA_PORTO_NOVO("Africa/Porto-Novo"),

      @SerializedName("Africa/Sao_Tome")
      AFRICA_SAO_TOME("Africa/Sao_Tome"),

      @SerializedName("Africa/Timbuktu")
      AFRICA_TIMBUKTU("Africa/Timbuktu"),

      @SerializedName("Africa/Tripoli")
      AFRICA_TRIPOLI("Africa/Tripoli"),

      @SerializedName("Africa/Tunis")
      AFRICA_TUNIS("Africa/Tunis"),

      @SerializedName("Africa/Windhoek")
      AFRICA_WINDHOEK("Africa/Windhoek"),

      @SerializedName("America/Adak")
      AMERICA_ADAK("America/Adak"),

      @SerializedName("America/Anchorage")
      AMERICA_ANCHORAGE("America/Anchorage"),

      @SerializedName("America/Anguilla")
      AMERICA_ANGUILLA("America/Anguilla"),

      @SerializedName("America/Antigua")
      AMERICA_ANTIGUA("America/Antigua"),

      @SerializedName("America/Araguaina")
      AMERICA_ARAGUAINA("America/Araguaina"),

      @SerializedName("America/Argentina/Buenos_Aires")
      AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),

      @SerializedName("America/Argentina/Catamarca")
      AMERICA_ARGENTINA_CATAMARCA("America/Argentina/Catamarca"),

      @SerializedName("America/Argentina/ComodRivadavia")
      AMERICA_ARGENTINA_COMODRIVADAVIA("America/Argentina/ComodRivadavia"),

      @SerializedName("America/Argentina/Cordoba")
      AMERICA_ARGENTINA_CORDOBA("America/Argentina/Cordoba"),

      @SerializedName("America/Argentina/Jujuy")
      AMERICA_ARGENTINA_JUJUY("America/Argentina/Jujuy"),

      @SerializedName("America/Argentina/La_Rioja")
      AMERICA_ARGENTINA_LA_RIOJA("America/Argentina/La_Rioja"),

      @SerializedName("America/Argentina/Mendoza")
      AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),

      @SerializedName("America/Argentina/Rio_Gallegos")
      AMERICA_ARGENTINA_RIO_GALLEGOS("America/Argentina/Rio_Gallegos"),

      @SerializedName("America/Argentina/Salta")
      AMERICA_ARGENTINA_SALTA("America/Argentina/Salta"),

      @SerializedName("America/Argentina/San_Juan")
      AMERICA_ARGENTINA_SAN_JUAN("America/Argentina/San_Juan"),

      @SerializedName("America/Argentina/San_Luis")
      AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),

      @SerializedName("America/Argentina/Tucuman")
      AMERICA_ARGENTINA_TUCUMAN("America/Argentina/Tucuman"),

      @SerializedName("America/Argentina/Ushuaia")
      AMERICA_ARGENTINA_USHUAIA("America/Argentina/Ushuaia"),

      @SerializedName("America/Aruba")
      AMERICA_ARUBA("America/Aruba"),

      @SerializedName("America/Asuncion")
      AMERICA_ASUNCION("America/Asuncion"),

      @SerializedName("America/Atikokan")
      AMERICA_ATIKOKAN("America/Atikokan"),

      @SerializedName("America/Atka")
      AMERICA_ATKA("America/Atka"),

      @SerializedName("America/Bahia")
      AMERICA_BAHIA("America/Bahia"),

      @SerializedName("America/Bahia_Banderas")
      AMERICA_BAHIA_BANDERAS("America/Bahia_Banderas"),

      @SerializedName("America/Barbados")
      AMERICA_BARBADOS("America/Barbados"),

      @SerializedName("America/Belem")
      AMERICA_BELEM("America/Belem"),

      @SerializedName("America/Belize")
      AMERICA_BELIZE("America/Belize"),

      @SerializedName("America/Blanc-Sablon")
      AMERICA_BLANC_SABLON("America/Blanc-Sablon"),

      @SerializedName("America/Boa_Vista")
      AMERICA_BOA_VISTA("America/Boa_Vista"),

      @SerializedName("America/Bogota")
      AMERICA_BOGOTA("America/Bogota"),

      @SerializedName("America/Boise")
      AMERICA_BOISE("America/Boise"),

      @SerializedName("America/Buenos_Aires")
      AMERICA_BUENOS_AIRES("America/Buenos_Aires"),

      @SerializedName("America/Cambridge_Bay")
      AMERICA_CAMBRIDGE_BAY("America/Cambridge_Bay"),

      @SerializedName("America/Campo_Grande")
      AMERICA_CAMPO_GRANDE("America/Campo_Grande"),

      @SerializedName("America/Cancun")
      AMERICA_CANCUN("America/Cancun"),

      @SerializedName("America/Caracas")
      AMERICA_CARACAS("America/Caracas"),

      @SerializedName("America/Catamarca")
      AMERICA_CATAMARCA("America/Catamarca"),

      @SerializedName("America/Cayenne")
      AMERICA_CAYENNE("America/Cayenne"),

      @SerializedName("America/Cayman")
      AMERICA_CAYMAN("America/Cayman"),

      @SerializedName("America/Chicago")
      AMERICA_CHICAGO("America/Chicago"),

      @SerializedName("America/Chihuahua")
      AMERICA_CHIHUAHUA("America/Chihuahua"),

      @SerializedName("America/Coral_Harbour")
      AMERICA_CORAL_HARBOUR("America/Coral_Harbour"),

      @SerializedName("America/Cordoba")
      AMERICA_CORDOBA("America/Cordoba"),

      @SerializedName("America/Costa_Rica")
      AMERICA_COSTA_RICA("America/Costa_Rica"),

      @SerializedName("America/Creston")
      AMERICA_CRESTON("America/Creston"),

      @SerializedName("America/Cuiaba")
      AMERICA_CUIABA("America/Cuiaba"),

      @SerializedName("America/Curacao")
      AMERICA_CURACAO("America/Curacao"),

      @SerializedName("America/Danmarkshavn")
      AMERICA_DANMARKSHAVN("America/Danmarkshavn"),

      @SerializedName("America/Dawson")
      AMERICA_DAWSON("America/Dawson"),

      @SerializedName("America/Dawson_Creek")
      AMERICA_DAWSON_CREEK("America/Dawson_Creek"),

      @SerializedName("America/Denver")
      AMERICA_DENVER("America/Denver"),

      @SerializedName("America/Detroit")
      AMERICA_DETROIT("America/Detroit"),

      @SerializedName("America/Dominica")
      AMERICA_DOMINICA("America/Dominica"),

      @SerializedName("America/Edmonton")
      AMERICA_EDMONTON("America/Edmonton"),

      @SerializedName("America/Eirunepe")
      AMERICA_EIRUNEPE("America/Eirunepe"),

      @SerializedName("America/El_Salvador")
      AMERICA_EL_SALVADOR("America/El_Salvador"),

      @SerializedName("America/Ensenada")
      AMERICA_ENSENADA("America/Ensenada"),

      @SerializedName("America/Fort_Nelson")
      AMERICA_FORT_NELSON("America/Fort_Nelson"),

      @SerializedName("America/Fort_Wayne")
      AMERICA_FORT_WAYNE("America/Fort_Wayne"),

      @SerializedName("America/Fortaleza")
      AMERICA_FORTALEZA("America/Fortaleza"),

      @SerializedName("America/Glace_Bay")
      AMERICA_GLACE_BAY("America/Glace_Bay"),

      @SerializedName("America/Godthab")
      AMERICA_GODTHAB("America/Godthab"),

      @SerializedName("America/Goose_Bay")
      AMERICA_GOOSE_BAY("America/Goose_Bay"),

      @SerializedName("America/Grand_Turk")
      AMERICA_GRAND_TURK("America/Grand_Turk"),

      @SerializedName("America/Grenada")
      AMERICA_GRENADA("America/Grenada"),

      @SerializedName("America/Guadeloupe")
      AMERICA_GUADELOUPE("America/Guadeloupe"),

      @SerializedName("America/Guatemala")
      AMERICA_GUATEMALA("America/Guatemala"),

      @SerializedName("America/Guayaquil")
      AMERICA_GUAYAQUIL("America/Guayaquil"),

      @SerializedName("America/Guyana")
      AMERICA_GUYANA("America/Guyana"),

      @SerializedName("America/Halifax")
      AMERICA_HALIFAX("America/Halifax"),

      @SerializedName("America/Havana")
      AMERICA_HAVANA("America/Havana"),

      @SerializedName("America/Hermosillo")
      AMERICA_HERMOSILLO("America/Hermosillo"),

      @SerializedName("America/Indiana/Indianapolis")
      AMERICA_INDIANA_INDIANAPOLIS("America/Indiana/Indianapolis"),

      @SerializedName("America/Indiana/Knox")
      AMERICA_INDIANA_KNOX("America/Indiana/Knox"),

      @SerializedName("America/Indiana/Marengo")
      AMERICA_INDIANA_MARENGO("America/Indiana/Marengo"),

      @SerializedName("America/Indiana/Petersburg")
      AMERICA_INDIANA_PETERSBURG("America/Indiana/Petersburg"),

      @SerializedName("America/Indiana/Tell_City")
      AMERICA_INDIANA_TELL_CITY("America/Indiana/Tell_City"),

      @SerializedName("America/Indiana/Vevay")
      AMERICA_INDIANA_VEVAY("America/Indiana/Vevay"),

      @SerializedName("America/Indiana/Vincennes")
      AMERICA_INDIANA_VINCENNES("America/Indiana/Vincennes"),

      @SerializedName("America/Indiana/Winamac")
      AMERICA_INDIANA_WINAMAC("America/Indiana/Winamac"),

      @SerializedName("America/Indianapolis")
      AMERICA_INDIANAPOLIS("America/Indianapolis"),

      @SerializedName("America/Inuvik")
      AMERICA_INUVIK("America/Inuvik"),

      @SerializedName("America/Iqaluit")
      AMERICA_IQALUIT("America/Iqaluit"),

      @SerializedName("America/Jamaica")
      AMERICA_JAMAICA("America/Jamaica"),

      @SerializedName("America/Jujuy")
      AMERICA_JUJUY("America/Jujuy"),

      @SerializedName("America/Juneau")
      AMERICA_JUNEAU("America/Juneau"),

      @SerializedName("America/Kentucky/Louisville")
      AMERICA_KENTUCKY_LOUISVILLE("America/Kentucky/Louisville"),

      @SerializedName("America/Kentucky/Monticello")
      AMERICA_KENTUCKY_MONTICELLO("America/Kentucky/Monticello"),

      @SerializedName("America/Knox_IN")
      AMERICA_KNOX_IN("America/Knox_IN"),

      @SerializedName("America/Kralendijk")
      AMERICA_KRALENDIJK("America/Kralendijk"),

      @SerializedName("America/La_Paz")
      AMERICA_LA_PAZ("America/La_Paz"),

      @SerializedName("America/Lima")
      AMERICA_LIMA("America/Lima"),

      @SerializedName("America/Los_Angeles")
      AMERICA_LOS_ANGELES("America/Los_Angeles"),

      @SerializedName("America/Louisville")
      AMERICA_LOUISVILLE("America/Louisville"),

      @SerializedName("America/Lower_Princes")
      AMERICA_LOWER_PRINCES("America/Lower_Princes"),

      @SerializedName("America/Maceio")
      AMERICA_MACEIO("America/Maceio"),

      @SerializedName("America/Managua")
      AMERICA_MANAGUA("America/Managua"),

      @SerializedName("America/Manaus")
      AMERICA_MANAUS("America/Manaus"),

      @SerializedName("America/Marigot")
      AMERICA_MARIGOT("America/Marigot"),

      @SerializedName("America/Martinique")
      AMERICA_MARTINIQUE("America/Martinique"),

      @SerializedName("America/Matamoros")
      AMERICA_MATAMOROS("America/Matamoros"),

      @SerializedName("America/Mazatlan")
      AMERICA_MAZATLAN("America/Mazatlan"),

      @SerializedName("America/Mendoza")
      AMERICA_MENDOZA("America/Mendoza"),

      @SerializedName("America/Menominee")
      AMERICA_MENOMINEE("America/Menominee"),

      @SerializedName("America/Merida")
      AMERICA_MERIDA("America/Merida"),

      @SerializedName("America/Metlakatla")
      AMERICA_METLAKATLA("America/Metlakatla"),

      @SerializedName("America/Mexico_City")
      AMERICA_MEXICO_CITY("America/Mexico_City"),

      @SerializedName("America/Miquelon")
      AMERICA_MIQUELON("America/Miquelon"),

      @SerializedName("America/Moncton")
      AMERICA_MONCTON("America/Moncton"),

      @SerializedName("America/Monterrey")
      AMERICA_MONTERREY("America/Monterrey"),

      @SerializedName("America/Montevideo")
      AMERICA_MONTEVIDEO("America/Montevideo"),

      @SerializedName("America/Montreal")
      AMERICA_MONTREAL("America/Montreal"),

      @SerializedName("America/Montserrat")
      AMERICA_MONTSERRAT("America/Montserrat"),

      @SerializedName("America/Nassau")
      AMERICA_NASSAU("America/Nassau"),

      @SerializedName("America/New_York")
      AMERICA_NEW_YORK("America/New_York"),

      @SerializedName("America/Nipigon")
      AMERICA_NIPIGON("America/Nipigon"),

      @SerializedName("America/Nome")
      AMERICA_NOME("America/Nome"),

      @SerializedName("America/Noronha")
      AMERICA_NORONHA("America/Noronha"),

      @SerializedName("America/North_Dakota/Beulah")
      AMERICA_NORTH_DAKOTA_BEULAH("America/North_Dakota/Beulah"),

      @SerializedName("America/North_Dakota/Center")
      AMERICA_NORTH_DAKOTA_CENTER("America/North_Dakota/Center"),

      @SerializedName("America/North_Dakota/New_Salem")
      AMERICA_NORTH_DAKOTA_NEW_SALEM("America/North_Dakota/New_Salem"),

      @SerializedName("America/Ojinaga")
      AMERICA_OJINAGA("America/Ojinaga"),

      @SerializedName("America/Panama")
      AMERICA_PANAMA("America/Panama"),

      @SerializedName("America/Pangnirtung")
      AMERICA_PANGNIRTUNG("America/Pangnirtung"),

      @SerializedName("America/Paramaribo")
      AMERICA_PARAMARIBO("America/Paramaribo"),

      @SerializedName("America/Phoenix")
      AMERICA_PHOENIX("America/Phoenix"),

      @SerializedName("America/Port-au-Prince")
      AMERICA_PORT_AU_PRINCE("America/Port-au-Prince"),

      @SerializedName("America/Port_of_Spain")
      AMERICA_PORT_OF_SPAIN("America/Port_of_Spain"),

      @SerializedName("America/Porto_Acre")
      AMERICA_PORTO_ACRE("America/Porto_Acre"),

      @SerializedName("America/Porto_Velho")
      AMERICA_PORTO_VELHO("America/Porto_Velho"),

      @SerializedName("America/Puerto_Rico")
      AMERICA_PUERTO_RICO("America/Puerto_Rico"),

      @SerializedName("America/Punta_Arenas")
      AMERICA_PUNTA_ARENAS("America/Punta_Arenas"),

      @SerializedName("America/Rainy_River")
      AMERICA_RAINY_RIVER("America/Rainy_River"),

      @SerializedName("America/Rankin_Inlet")
      AMERICA_RANKIN_INLET("America/Rankin_Inlet"),

      @SerializedName("America/Recife")
      AMERICA_RECIFE("America/Recife"),

      @SerializedName("America/Regina")
      AMERICA_REGINA("America/Regina"),

      @SerializedName("America/Resolute")
      AMERICA_RESOLUTE("America/Resolute"),

      @SerializedName("America/Rio_Branco")
      AMERICA_RIO_BRANCO("America/Rio_Branco"),

      @SerializedName("America/Rosario")
      AMERICA_ROSARIO("America/Rosario"),

      @SerializedName("America/Santa_Isabel")
      AMERICA_SANTA_ISABEL("America/Santa_Isabel"),

      @SerializedName("America/Santarem")
      AMERICA_SANTAREM("America/Santarem"),

      @SerializedName("America/Santiago")
      AMERICA_SANTIAGO("America/Santiago"),

      @SerializedName("America/Santo_Domingo")
      AMERICA_SANTO_DOMINGO("America/Santo_Domingo"),

      @SerializedName("America/Sao_Paulo")
      AMERICA_SAO_PAULO("America/Sao_Paulo"),

      @SerializedName("America/Scoresbysund")
      AMERICA_SCORESBYSUND("America/Scoresbysund"),

      @SerializedName("America/Shiprock")
      AMERICA_SHIPROCK("America/Shiprock"),

      @SerializedName("America/Sitka")
      AMERICA_SITKA("America/Sitka"),

      @SerializedName("America/St_Barthelemy")
      AMERICA_ST_BARTHELEMY("America/St_Barthelemy"),

      @SerializedName("America/St_Johns")
      AMERICA_ST_JOHNS("America/St_Johns"),

      @SerializedName("America/St_Kitts")
      AMERICA_ST_KITTS("America/St_Kitts"),

      @SerializedName("America/St_Lucia")
      AMERICA_ST_LUCIA("America/St_Lucia"),

      @SerializedName("America/St_Thomas")
      AMERICA_ST_THOMAS("America/St_Thomas"),

      @SerializedName("America/St_Vincent")
      AMERICA_ST_VINCENT("America/St_Vincent"),

      @SerializedName("America/Swift_Current")
      AMERICA_SWIFT_CURRENT("America/Swift_Current"),

      @SerializedName("America/Tegucigalpa")
      AMERICA_TEGUCIGALPA("America/Tegucigalpa"),

      @SerializedName("America/Thule")
      AMERICA_THULE("America/Thule"),

      @SerializedName("America/Thunder_Bay")
      AMERICA_THUNDER_BAY("America/Thunder_Bay"),

      @SerializedName("America/Tijuana")
      AMERICA_TIJUANA("America/Tijuana"),

      @SerializedName("America/Toronto")
      AMERICA_TORONTO("America/Toronto"),

      @SerializedName("America/Tortola")
      AMERICA_TORTOLA("America/Tortola"),

      @SerializedName("America/Vancouver")
      AMERICA_VANCOUVER("America/Vancouver"),

      @SerializedName("America/Virgin")
      AMERICA_VIRGIN("America/Virgin"),

      @SerializedName("America/Whitehorse")
      AMERICA_WHITEHORSE("America/Whitehorse"),

      @SerializedName("America/Winnipeg")
      AMERICA_WINNIPEG("America/Winnipeg"),

      @SerializedName("America/Yakutat")
      AMERICA_YAKUTAT("America/Yakutat"),

      @SerializedName("America/Yellowknife")
      AMERICA_YELLOWKNIFE("America/Yellowknife"),

      @SerializedName("Antarctica/Casey")
      ANTARCTICA_CASEY("Antarctica/Casey"),

      @SerializedName("Antarctica/Davis")
      ANTARCTICA_DAVIS("Antarctica/Davis"),

      @SerializedName("Antarctica/DumontDUrville")
      ANTARCTICA_DUMONTDURVILLE("Antarctica/DumontDUrville"),

      @SerializedName("Antarctica/Macquarie")
      ANTARCTICA_MACQUARIE("Antarctica/Macquarie"),

      @SerializedName("Antarctica/Mawson")
      ANTARCTICA_MAWSON("Antarctica/Mawson"),

      @SerializedName("Antarctica/McMurdo")
      ANTARCTICA_MCMURDO("Antarctica/McMurdo"),

      @SerializedName("Antarctica/Palmer")
      ANTARCTICA_PALMER("Antarctica/Palmer"),

      @SerializedName("Antarctica/Rothera")
      ANTARCTICA_ROTHERA("Antarctica/Rothera"),

      @SerializedName("Antarctica/South_Pole")
      ANTARCTICA_SOUTH_POLE("Antarctica/South_Pole"),

      @SerializedName("Antarctica/Syowa")
      ANTARCTICA_SYOWA("Antarctica/Syowa"),

      @SerializedName("Antarctica/Troll")
      ANTARCTICA_TROLL("Antarctica/Troll"),

      @SerializedName("Antarctica/Vostok")
      ANTARCTICA_VOSTOK("Antarctica/Vostok"),

      @SerializedName("Arctic/Longyearbyen")
      ARCTIC_LONGYEARBYEN("Arctic/Longyearbyen"),

      @SerializedName("Asia/Aden")
      ASIA_ADEN("Asia/Aden"),

      @SerializedName("Asia/Almaty")
      ASIA_ALMATY("Asia/Almaty"),

      @SerializedName("Asia/Amman")
      ASIA_AMMAN("Asia/Amman"),

      @SerializedName("Asia/Anadyr")
      ASIA_ANADYR("Asia/Anadyr"),

      @SerializedName("Asia/Aqtau")
      ASIA_AQTAU("Asia/Aqtau"),

      @SerializedName("Asia/Aqtobe")
      ASIA_AQTOBE("Asia/Aqtobe"),

      @SerializedName("Asia/Ashgabat")
      ASIA_ASHGABAT("Asia/Ashgabat"),

      @SerializedName("Asia/Ashkhabad")
      ASIA_ASHKHABAD("Asia/Ashkhabad"),

      @SerializedName("Asia/Atyrau")
      ASIA_ATYRAU("Asia/Atyrau"),

      @SerializedName("Asia/Baghdad")
      ASIA_BAGHDAD("Asia/Baghdad"),

      @SerializedName("Asia/Bahrain")
      ASIA_BAHRAIN("Asia/Bahrain"),

      @SerializedName("Asia/Baku")
      ASIA_BAKU("Asia/Baku"),

      @SerializedName("Asia/Bangkok")
      ASIA_BANGKOK("Asia/Bangkok"),

      @SerializedName("Asia/Barnaul")
      ASIA_BARNAUL("Asia/Barnaul"),

      @SerializedName("Asia/Beirut")
      ASIA_BEIRUT("Asia/Beirut"),

      @SerializedName("Asia/Bishkek")
      ASIA_BISHKEK("Asia/Bishkek"),

      @SerializedName("Asia/Brunei")
      ASIA_BRUNEI("Asia/Brunei"),

      @SerializedName("Asia/Calcutta")
      ASIA_CALCUTTA("Asia/Calcutta"),

      @SerializedName("Asia/Chita")
      ASIA_CHITA("Asia/Chita"),

      @SerializedName("Asia/Choibalsan")
      ASIA_CHOIBALSAN("Asia/Choibalsan"),

      @SerializedName("Asia/Chongqing")
      ASIA_CHONGQING("Asia/Chongqing"),

      @SerializedName("Asia/Chungking")
      ASIA_CHUNGKING("Asia/Chungking"),

      @SerializedName("Asia/Colombo")
      ASIA_COLOMBO("Asia/Colombo"),

      @SerializedName("Asia/Dacca")
      ASIA_DACCA("Asia/Dacca"),

      @SerializedName("Asia/Damascus")
      ASIA_DAMASCUS("Asia/Damascus"),

      @SerializedName("Asia/Dhaka")
      ASIA_DHAKA("Asia/Dhaka"),

      @SerializedName("Asia/Dili")
      ASIA_DILI("Asia/Dili"),

      @SerializedName("Asia/Dubai")
      ASIA_DUBAI("Asia/Dubai"),

      @SerializedName("Asia/Dushanbe")
      ASIA_DUSHANBE("Asia/Dushanbe"),

      @SerializedName("Asia/Famagusta")
      ASIA_FAMAGUSTA("Asia/Famagusta"),

      @SerializedName("Asia/Gaza")
      ASIA_GAZA("Asia/Gaza"),

      @SerializedName("Asia/Harbin")
      ASIA_HARBIN("Asia/Harbin"),

      @SerializedName("Asia/Hebron")
      ASIA_HEBRON("Asia/Hebron"),

      @SerializedName("Asia/Ho_Chi_Minh")
      ASIA_HO_CHI_MINH("Asia/Ho_Chi_Minh"),

      @SerializedName("Asia/Hong_Kong")
      ASIA_HONG_KONG("Asia/Hong_Kong"),

      @SerializedName("Asia/Hovd")
      ASIA_HOVD("Asia/Hovd"),

      @SerializedName("Asia/Irkutsk")
      ASIA_IRKUTSK("Asia/Irkutsk"),

      @SerializedName("Asia/Istanbul")
      ASIA_ISTANBUL("Asia/Istanbul"),

      @SerializedName("Asia/Jakarta")
      ASIA_JAKARTA("Asia/Jakarta"),

      @SerializedName("Asia/Jayapura")
      ASIA_JAYAPURA("Asia/Jayapura"),

      @SerializedName("Asia/Jerusalem")
      ASIA_JERUSALEM("Asia/Jerusalem"),

      @SerializedName("Asia/Kabul")
      ASIA_KABUL("Asia/Kabul"),

      @SerializedName("Asia/Kamchatka")
      ASIA_KAMCHATKA("Asia/Kamchatka"),

      @SerializedName("Asia/Karachi")
      ASIA_KARACHI("Asia/Karachi"),

      @SerializedName("Asia/Kashgar")
      ASIA_KASHGAR("Asia/Kashgar"),

      @SerializedName("Asia/Kathmandu")
      ASIA_KATHMANDU("Asia/Kathmandu"),

      @SerializedName("Asia/Katmandu")
      ASIA_KATMANDU("Asia/Katmandu"),

      @SerializedName("Asia/Khandyga")
      ASIA_KHANDYGA("Asia/Khandyga"),

      @SerializedName("Asia/Kolkata")
      ASIA_KOLKATA("Asia/Kolkata"),

      @SerializedName("Asia/Krasnoyarsk")
      ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),

      @SerializedName("Asia/Kuala_Lumpur")
      ASIA_KUALA_LUMPUR("Asia/Kuala_Lumpur"),

      @SerializedName("Asia/Kuching")
      ASIA_KUCHING("Asia/Kuching"),

      @SerializedName("Asia/Kuwait")
      ASIA_KUWAIT("Asia/Kuwait"),

      @SerializedName("Asia/Macao")
      ASIA_MACAO("Asia/Macao"),

      @SerializedName("Asia/Macau")
      ASIA_MACAU("Asia/Macau"),

      @SerializedName("Asia/Magadan")
      ASIA_MAGADAN("Asia/Magadan"),

      @SerializedName("Asia/Makassar")
      ASIA_MAKASSAR("Asia/Makassar"),

      @SerializedName("Asia/Manila")
      ASIA_MANILA("Asia/Manila"),

      @SerializedName("Asia/Muscat")
      ASIA_MUSCAT("Asia/Muscat"),

      @SerializedName("Asia/Nicosia")
      ASIA_NICOSIA("Asia/Nicosia"),

      @SerializedName("Asia/Novokuznetsk")
      ASIA_NOVOKUZNETSK("Asia/Novokuznetsk"),

      @SerializedName("Asia/Novosibirsk")
      ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),

      @SerializedName("Asia/Omsk")
      ASIA_OMSK("Asia/Omsk"),

      @SerializedName("Asia/Oral")
      ASIA_ORAL("Asia/Oral"),

      @SerializedName("Asia/Phnom_Penh")
      ASIA_PHNOM_PENH("Asia/Phnom_Penh"),

      @SerializedName("Asia/Pontianak")
      ASIA_PONTIANAK("Asia/Pontianak"),

      @SerializedName("Asia/Pyongyang")
      ASIA_PYONGYANG("Asia/Pyongyang"),

      @SerializedName("Asia/Qatar")
      ASIA_QATAR("Asia/Qatar"),

      @SerializedName("Asia/Qostanay")
      ASIA_QOSTANAY("Asia/Qostanay"),

      @SerializedName("Asia/Qyzylorda")
      ASIA_QYZYLORDA("Asia/Qyzylorda"),

      @SerializedName("Asia/Rangoon")
      ASIA_RANGOON("Asia/Rangoon"),

      @SerializedName("Asia/Riyadh")
      ASIA_RIYADH("Asia/Riyadh"),

      @SerializedName("Asia/Saigon")
      ASIA_SAIGON("Asia/Saigon"),

      @SerializedName("Asia/Sakhalin")
      ASIA_SAKHALIN("Asia/Sakhalin"),

      @SerializedName("Asia/Samarkand")
      ASIA_SAMARKAND("Asia/Samarkand"),

      @SerializedName("Asia/Seoul")
      ASIA_SEOUL("Asia/Seoul"),

      @SerializedName("Asia/Shanghai")
      ASIA_SHANGHAI("Asia/Shanghai"),

      @SerializedName("Asia/Singapore")
      ASIA_SINGAPORE("Asia/Singapore"),

      @SerializedName("Asia/Srednekolymsk")
      ASIA_SREDNEKOLYMSK("Asia/Srednekolymsk"),

      @SerializedName("Asia/Taipei")
      ASIA_TAIPEI("Asia/Taipei"),

      @SerializedName("Asia/Tashkent")
      ASIA_TASHKENT("Asia/Tashkent"),

      @SerializedName("Asia/Tbilisi")
      ASIA_TBILISI("Asia/Tbilisi"),

      @SerializedName("Asia/Tehran")
      ASIA_TEHRAN("Asia/Tehran"),

      @SerializedName("Asia/Tel_Aviv")
      ASIA_TEL_AVIV("Asia/Tel_Aviv"),

      @SerializedName("Asia/Thimbu")
      ASIA_THIMBU("Asia/Thimbu"),

      @SerializedName("Asia/Thimphu")
      ASIA_THIMPHU("Asia/Thimphu"),

      @SerializedName("Asia/Tokyo")
      ASIA_TOKYO("Asia/Tokyo"),

      @SerializedName("Asia/Tomsk")
      ASIA_TOMSK("Asia/Tomsk"),

      @SerializedName("Asia/Ujung_Pandang")
      ASIA_UJUNG_PANDANG("Asia/Ujung_Pandang"),

      @SerializedName("Asia/Ulaanbaatar")
      ASIA_ULAANBAATAR("Asia/Ulaanbaatar"),

      @SerializedName("Asia/Ulan_Bator")
      ASIA_ULAN_BATOR("Asia/Ulan_Bator"),

      @SerializedName("Asia/Urumqi")
      ASIA_URUMQI("Asia/Urumqi"),

      @SerializedName("Asia/Ust-Nera")
      ASIA_UST_NERA("Asia/Ust-Nera"),

      @SerializedName("Asia/Vientiane")
      ASIA_VIENTIANE("Asia/Vientiane"),

      @SerializedName("Asia/Vladivostok")
      ASIA_VLADIVOSTOK("Asia/Vladivostok"),

      @SerializedName("Asia/Yakutsk")
      ASIA_YAKUTSK("Asia/Yakutsk"),

      @SerializedName("Asia/Yangon")
      ASIA_YANGON("Asia/Yangon"),

      @SerializedName("Asia/Yekaterinburg")
      ASIA_YEKATERINBURG("Asia/Yekaterinburg"),

      @SerializedName("Asia/Yerevan")
      ASIA_YEREVAN("Asia/Yerevan"),

      @SerializedName("Atlantic/Azores")
      ATLANTIC_AZORES("Atlantic/Azores"),

      @SerializedName("Atlantic/Bermuda")
      ATLANTIC_BERMUDA("Atlantic/Bermuda"),

      @SerializedName("Atlantic/Canary")
      ATLANTIC_CANARY("Atlantic/Canary"),

      @SerializedName("Atlantic/Cape_Verde")
      ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),

      @SerializedName("Atlantic/Faeroe")
      ATLANTIC_FAEROE("Atlantic/Faeroe"),

      @SerializedName("Atlantic/Faroe")
      ATLANTIC_FAROE("Atlantic/Faroe"),

      @SerializedName("Atlantic/Jan_Mayen")
      ATLANTIC_JAN_MAYEN("Atlantic/Jan_Mayen"),

      @SerializedName("Atlantic/Madeira")
      ATLANTIC_MADEIRA("Atlantic/Madeira"),

      @SerializedName("Atlantic/Reykjavik")
      ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),

      @SerializedName("Atlantic/South_Georgia")
      ATLANTIC_SOUTH_GEORGIA("Atlantic/South_Georgia"),

      @SerializedName("Atlantic/St_Helena")
      ATLANTIC_ST_HELENA("Atlantic/St_Helena"),

      @SerializedName("Atlantic/Stanley")
      ATLANTIC_STANLEY("Atlantic/Stanley"),

      @SerializedName("Australia/ACT")
      AUSTRALIA_ACT("Australia/ACT"),

      @SerializedName("Australia/Adelaide")
      AUSTRALIA_ADELAIDE("Australia/Adelaide"),

      @SerializedName("Australia/Brisbane")
      AUSTRALIA_BRISBANE("Australia/Brisbane"),

      @SerializedName("Australia/Broken_Hill")
      AUSTRALIA_BROKEN_HILL("Australia/Broken_Hill"),

      @SerializedName("Australia/Canberra")
      AUSTRALIA_CANBERRA("Australia/Canberra"),

      @SerializedName("Australia/Currie")
      AUSTRALIA_CURRIE("Australia/Currie"),

      @SerializedName("Australia/Darwin")
      AUSTRALIA_DARWIN("Australia/Darwin"),

      @SerializedName("Australia/Eucla")
      AUSTRALIA_EUCLA("Australia/Eucla"),

      @SerializedName("Australia/Hobart")
      AUSTRALIA_HOBART("Australia/Hobart"),

      @SerializedName("Australia/LHI")
      AUSTRALIA_LHI("Australia/LHI"),

      @SerializedName("Australia/Lindeman")
      AUSTRALIA_LINDEMAN("Australia/Lindeman"),

      @SerializedName("Australia/Lord_Howe")
      AUSTRALIA_LORD_HOWE("Australia/Lord_Howe"),

      @SerializedName("Australia/Melbourne")
      AUSTRALIA_MELBOURNE("Australia/Melbourne"),

      @SerializedName("Australia/NSW")
      AUSTRALIA_NSW("Australia/NSW"),

      @SerializedName("Australia/North")
      AUSTRALIA_NORTH("Australia/North"),

      @SerializedName("Australia/Perth")
      AUSTRALIA_PERTH("Australia/Perth"),

      @SerializedName("Australia/Queensland")
      AUSTRALIA_QUEENSLAND("Australia/Queensland"),

      @SerializedName("Australia/South")
      AUSTRALIA_SOUTH("Australia/South"),

      @SerializedName("Australia/Sydney")
      AUSTRALIA_SYDNEY("Australia/Sydney"),

      @SerializedName("Australia/Tasmania")
      AUSTRALIA_TASMANIA("Australia/Tasmania"),

      @SerializedName("Australia/Victoria")
      AUSTRALIA_VICTORIA("Australia/Victoria"),

      @SerializedName("Australia/West")
      AUSTRALIA_WEST("Australia/West"),

      @SerializedName("Australia/Yancowinna")
      AUSTRALIA_YANCOWINNA("Australia/Yancowinna"),

      @SerializedName("Brazil/Acre")
      BRAZIL_ACRE("Brazil/Acre"),

      @SerializedName("Brazil/DeNoronha")
      BRAZIL_DENORONHA("Brazil/DeNoronha"),

      @SerializedName("Brazil/East")
      BRAZIL_EAST("Brazil/East"),

      @SerializedName("Brazil/West")
      BRAZIL_WEST("Brazil/West"),

      @SerializedName("CET")
      CET("CET"),

      @SerializedName("CST6CDT")
      CST6CDT("CST6CDT"),

      @SerializedName("Canada/Atlantic")
      CANADA_ATLANTIC("Canada/Atlantic"),

      @SerializedName("Canada/Central")
      CANADA_CENTRAL("Canada/Central"),

      @SerializedName("Canada/Eastern")
      CANADA_EASTERN("Canada/Eastern"),

      @SerializedName("Canada/Mountain")
      CANADA_MOUNTAIN("Canada/Mountain"),

      @SerializedName("Canada/Newfoundland")
      CANADA_NEWFOUNDLAND("Canada/Newfoundland"),

      @SerializedName("Canada/Pacific")
      CANADA_PACIFIC("Canada/Pacific"),

      @SerializedName("Canada/Saskatchewan")
      CANADA_SASKATCHEWAN("Canada/Saskatchewan"),

      @SerializedName("Canada/Yukon")
      CANADA_YUKON("Canada/Yukon"),

      @SerializedName("Chile/Continental")
      CHILE_CONTINENTAL("Chile/Continental"),

      @SerializedName("Chile/EasterIsland")
      CHILE_EASTERISLAND("Chile/EasterIsland"),

      @SerializedName("Cuba")
      CUBA("Cuba"),

      @SerializedName("EET")
      EET("EET"),

      @SerializedName("EST")
      EST("EST"),

      @SerializedName("EST5EDT")
      EST5EDT("EST5EDT"),

      @SerializedName("Egypt")
      EGYPT("Egypt"),

      @SerializedName("Eire")
      EIRE("Eire"),

      @SerializedName("Etc/GMT")
      ETC_GMT("Etc/GMT"),

      @SerializedName("Etc/GMT+0")
      ETC_GMT_PLUS_0("Etc/GMT+0"),

      @SerializedName("Etc/GMT+1")
      ETC_GMT_PLUS_1("Etc/GMT+1"),

      @SerializedName("Etc/GMT+10")
      ETC_GMT_PLUS_10("Etc/GMT+10"),

      @SerializedName("Etc/GMT+11")
      ETC_GMT_PLUS_11("Etc/GMT+11"),

      @SerializedName("Etc/GMT+12")
      ETC_GMT_PLUS_12("Etc/GMT+12"),

      @SerializedName("Etc/GMT+2")
      ETC_GMT_PLUS_2("Etc/GMT+2"),

      @SerializedName("Etc/GMT+3")
      ETC_GMT_PLUS_3("Etc/GMT+3"),

      @SerializedName("Etc/GMT+4")
      ETC_GMT_PLUS_4("Etc/GMT+4"),

      @SerializedName("Etc/GMT+5")
      ETC_GMT_PLUS_5("Etc/GMT+5"),

      @SerializedName("Etc/GMT+6")
      ETC_GMT_PLUS_6("Etc/GMT+6"),

      @SerializedName("Etc/GMT+7")
      ETC_GMT_PLUS_7("Etc/GMT+7"),

      @SerializedName("Etc/GMT+8")
      ETC_GMT_PLUS_8("Etc/GMT+8"),

      @SerializedName("Etc/GMT+9")
      ETC_GMT_PLUS_9("Etc/GMT+9"),

      @SerializedName("Etc/GMT-0")
      ETC_GMT_MINUS_0("Etc/GMT-0"),

      @SerializedName("Etc/GMT-1")
      ETC_GMT_MINUS_1("Etc/GMT-1"),

      @SerializedName("Etc/GMT-10")
      ETC_GMT_MINUS_10("Etc/GMT-10"),

      @SerializedName("Etc/GMT-11")
      ETC_GMT_MINUS_11("Etc/GMT-11"),

      @SerializedName("Etc/GMT-12")
      ETC_GMT_MINUS_12("Etc/GMT-12"),

      @SerializedName("Etc/GMT-13")
      ETC_GMT_MINUS_13("Etc/GMT-13"),

      @SerializedName("Etc/GMT-14")
      ETC_GMT_MINUS_14("Etc/GMT-14"),

      @SerializedName("Etc/GMT-2")
      ETC_GMT_MINUS_2("Etc/GMT-2"),

      @SerializedName("Etc/GMT-3")
      ETC_GMT_MINUS_3("Etc/GMT-3"),

      @SerializedName("Etc/GMT-4")
      ETC_GMT_MINUS_4("Etc/GMT-4"),

      @SerializedName("Etc/GMT-5")
      ETC_GMT_MINUS_5("Etc/GMT-5"),

      @SerializedName("Etc/GMT-6")
      ETC_GMT_MINUS_6("Etc/GMT-6"),

      @SerializedName("Etc/GMT-7")
      ETC_GMT_MINUS_7("Etc/GMT-7"),

      @SerializedName("Etc/GMT-8")
      ETC_GMT_MINUS_8("Etc/GMT-8"),

      @SerializedName("Etc/GMT-9")
      ETC_GMT_MINUS_9("Etc/GMT-9"),

      @SerializedName("Etc/GMT0")
      ETC_GMT0("Etc/GMT0"),

      @SerializedName("Etc/Greenwich")
      ETC_GREENWICH("Etc/Greenwich"),

      @SerializedName("Etc/UCT")
      ETC_UCT("Etc/UCT"),

      @SerializedName("Etc/UTC")
      ETC_UTC("Etc/UTC"),

      @SerializedName("Etc/Universal")
      ETC_UNIVERSAL("Etc/Universal"),

      @SerializedName("Etc/Zulu")
      ETC_ZULU("Etc/Zulu"),

      @SerializedName("Europe/Amsterdam")
      EUROPE_AMSTERDAM("Europe/Amsterdam"),

      @SerializedName("Europe/Andorra")
      EUROPE_ANDORRA("Europe/Andorra"),

      @SerializedName("Europe/Astrakhan")
      EUROPE_ASTRAKHAN("Europe/Astrakhan"),

      @SerializedName("Europe/Athens")
      EUROPE_ATHENS("Europe/Athens"),

      @SerializedName("Europe/Belfast")
      EUROPE_BELFAST("Europe/Belfast"),

      @SerializedName("Europe/Belgrade")
      EUROPE_BELGRADE("Europe/Belgrade"),

      @SerializedName("Europe/Berlin")
      EUROPE_BERLIN("Europe/Berlin"),

      @SerializedName("Europe/Bratislava")
      EUROPE_BRATISLAVA("Europe/Bratislava"),

      @SerializedName("Europe/Brussels")
      EUROPE_BRUSSELS("Europe/Brussels"),

      @SerializedName("Europe/Bucharest")
      EUROPE_BUCHAREST("Europe/Bucharest"),

      @SerializedName("Europe/Budapest")
      EUROPE_BUDAPEST("Europe/Budapest"),

      @SerializedName("Europe/Busingen")
      EUROPE_BUSINGEN("Europe/Busingen"),

      @SerializedName("Europe/Chisinau")
      EUROPE_CHISINAU("Europe/Chisinau"),

      @SerializedName("Europe/Copenhagen")
      EUROPE_COPENHAGEN("Europe/Copenhagen"),

      @SerializedName("Europe/Dublin")
      EUROPE_DUBLIN("Europe/Dublin"),

      @SerializedName("Europe/Gibraltar")
      EUROPE_GIBRALTAR("Europe/Gibraltar"),

      @SerializedName("Europe/Guernsey")
      EUROPE_GUERNSEY("Europe/Guernsey"),

      @SerializedName("Europe/Helsinki")
      EUROPE_HELSINKI("Europe/Helsinki"),

      @SerializedName("Europe/Isle_of_Man")
      EUROPE_ISLE_OF_MAN("Europe/Isle_of_Man"),

      @SerializedName("Europe/Istanbul")
      EUROPE_ISTANBUL("Europe/Istanbul"),

      @SerializedName("Europe/Jersey")
      EUROPE_JERSEY("Europe/Jersey"),

      @SerializedName("Europe/Kaliningrad")
      EUROPE_KALININGRAD("Europe/Kaliningrad"),

      @SerializedName("Europe/Kiev")
      EUROPE_KIEV("Europe/Kiev"),

      @SerializedName("Europe/Kirov")
      EUROPE_KIROV("Europe/Kirov"),

      @SerializedName("Europe/Lisbon")
      EUROPE_LISBON("Europe/Lisbon"),

      @SerializedName("Europe/Ljubljana")
      EUROPE_LJUBLJANA("Europe/Ljubljana"),

      @SerializedName("Europe/London")
      EUROPE_LONDON("Europe/London"),

      @SerializedName("Europe/Luxembourg")
      EUROPE_LUXEMBOURG("Europe/Luxembourg"),

      @SerializedName("Europe/Madrid")
      EUROPE_MADRID("Europe/Madrid"),

      @SerializedName("Europe/Malta")
      EUROPE_MALTA("Europe/Malta"),

      @SerializedName("Europe/Mariehamn")
      EUROPE_MARIEHAMN("Europe/Mariehamn"),

      @SerializedName("Europe/Minsk")
      EUROPE_MINSK("Europe/Minsk"),

      @SerializedName("Europe/Monaco")
      EUROPE_MONACO("Europe/Monaco"),

      @SerializedName("Europe/Moscow")
      EUROPE_MOSCOW("Europe/Moscow"),

      @SerializedName("Europe/Nicosia")
      EUROPE_NICOSIA("Europe/Nicosia"),

      @SerializedName("Europe/Oslo")
      EUROPE_OSLO("Europe/Oslo"),

      @SerializedName("Europe/Paris")
      EUROPE_PARIS("Europe/Paris"),

      @SerializedName("Europe/Podgorica")
      EUROPE_PODGORICA("Europe/Podgorica"),

      @SerializedName("Europe/Prague")
      EUROPE_PRAGUE("Europe/Prague"),

      @SerializedName("Europe/Riga")
      EUROPE_RIGA("Europe/Riga"),

      @SerializedName("Europe/Rome")
      EUROPE_ROME("Europe/Rome"),

      @SerializedName("Europe/Samara")
      EUROPE_SAMARA("Europe/Samara"),

      @SerializedName("Europe/San_Marino")
      EUROPE_SAN_MARINO("Europe/San_Marino"),

      @SerializedName("Europe/Sarajevo")
      EUROPE_SARAJEVO("Europe/Sarajevo"),

      @SerializedName("Europe/Saratov")
      EUROPE_SARATOV("Europe/Saratov"),

      @SerializedName("Europe/Simferopol")
      EUROPE_SIMFEROPOL("Europe/Simferopol"),

      @SerializedName("Europe/Skopje")
      EUROPE_SKOPJE("Europe/Skopje"),

      @SerializedName("Europe/Sofia")
      EUROPE_SOFIA("Europe/Sofia"),

      @SerializedName("Europe/Stockholm")
      EUROPE_STOCKHOLM("Europe/Stockholm"),

      @SerializedName("Europe/Tallinn")
      EUROPE_TALLINN("Europe/Tallinn"),

      @SerializedName("Europe/Tirane")
      EUROPE_TIRANE("Europe/Tirane"),

      @SerializedName("Europe/Tiraspol")
      EUROPE_TIRASPOL("Europe/Tiraspol"),

      @SerializedName("Europe/Ulyanovsk")
      EUROPE_ULYANOVSK("Europe/Ulyanovsk"),

      @SerializedName("Europe/Uzhgorod")
      EUROPE_UZHGOROD("Europe/Uzhgorod"),

      @SerializedName("Europe/Vaduz")
      EUROPE_VADUZ("Europe/Vaduz"),

      @SerializedName("Europe/Vatican")
      EUROPE_VATICAN("Europe/Vatican"),

      @SerializedName("Europe/Vienna")
      EUROPE_VIENNA("Europe/Vienna"),

      @SerializedName("Europe/Vilnius")
      EUROPE_VILNIUS("Europe/Vilnius"),

      @SerializedName("Europe/Volgograd")
      EUROPE_VOLGOGRAD("Europe/Volgograd"),

      @SerializedName("Europe/Warsaw")
      EUROPE_WARSAW("Europe/Warsaw"),

      @SerializedName("Europe/Zagreb")
      EUROPE_ZAGREB("Europe/Zagreb"),

      @SerializedName("Europe/Zaporozhye")
      EUROPE_ZAPOROZHYE("Europe/Zaporozhye"),

      @SerializedName("Europe/Zurich")
      EUROPE_ZURICH("Europe/Zurich"),

      @SerializedName("Factory")
      FACTORY("Factory"),

      @SerializedName("GB")
      GB("GB"),

      @SerializedName("GB-Eire")
      GB_EIRE("GB-Eire"),

      @SerializedName("GMT")
      GMT("GMT"),

      @SerializedName("GMT+0")
      GMT_PLUS_0("GMT+0"),

      @SerializedName("GMT-0")
      GMT_MINUS_0("GMT-0"),

      @SerializedName("GMT0")
      GMT0("GMT0"),

      @SerializedName("Greenwich")
      GREENWICH("Greenwich"),

      @SerializedName("HST")
      HST("HST"),

      @SerializedName("Hongkong")
      HONGKONG("Hongkong"),

      @SerializedName("Iceland")
      ICELAND("Iceland"),

      @SerializedName("Indian/Antananarivo")
      INDIAN_ANTANANARIVO("Indian/Antananarivo"),

      @SerializedName("Indian/Chagos")
      INDIAN_CHAGOS("Indian/Chagos"),

      @SerializedName("Indian/Christmas")
      INDIAN_CHRISTMAS("Indian/Christmas"),

      @SerializedName("Indian/Cocos")
      INDIAN_COCOS("Indian/Cocos"),

      @SerializedName("Indian/Comoro")
      INDIAN_COMORO("Indian/Comoro"),

      @SerializedName("Indian/Kerguelen")
      INDIAN_KERGUELEN("Indian/Kerguelen"),

      @SerializedName("Indian/Mahe")
      INDIAN_MAHE("Indian/Mahe"),

      @SerializedName("Indian/Maldives")
      INDIAN_MALDIVES("Indian/Maldives"),

      @SerializedName("Indian/Mauritius")
      INDIAN_MAURITIUS("Indian/Mauritius"),

      @SerializedName("Indian/Mayotte")
      INDIAN_MAYOTTE("Indian/Mayotte"),

      @SerializedName("Indian/Reunion")
      INDIAN_REUNION("Indian/Reunion"),

      @SerializedName("Iran")
      IRAN("Iran"),

      @SerializedName("Israel")
      ISRAEL("Israel"),

      @SerializedName("Jamaica")
      JAMAICA("Jamaica"),

      @SerializedName("Japan")
      JAPAN("Japan"),

      @SerializedName("Kwajalein")
      KWAJALEIN("Kwajalein"),

      @SerializedName("Libya")
      LIBYA("Libya"),

      @SerializedName("MET")
      MET("MET"),

      @SerializedName("MST")
      MST("MST"),

      @SerializedName("MST7MDT")
      MST7MDT("MST7MDT"),

      @SerializedName("Mexico/BajaNorte")
      MEXICO_BAJANORTE("Mexico/BajaNorte"),

      @SerializedName("Mexico/BajaSur")
      MEXICO_BAJASUR("Mexico/BajaSur"),

      @SerializedName("Mexico/General")
      MEXICO_GENERAL("Mexico/General"),

      @SerializedName("NZ")
      NZ("NZ"),

      @SerializedName("NZ-CHAT")
      NZ_CHAT("NZ-CHAT"),

      @SerializedName("Navajo")
      NAVAJO("Navajo"),

      @SerializedName("PRC")
      PRC("PRC"),

      @SerializedName("PST8PDT")
      PST8PDT("PST8PDT"),

      @SerializedName("Pacific/Apia")
      PACIFIC_APIA("Pacific/Apia"),

      @SerializedName("Pacific/Auckland")
      PACIFIC_AUCKLAND("Pacific/Auckland"),

      @SerializedName("Pacific/Bougainville")
      PACIFIC_BOUGAINVILLE("Pacific/Bougainville"),

      @SerializedName("Pacific/Chatham")
      PACIFIC_CHATHAM("Pacific/Chatham"),

      @SerializedName("Pacific/Chuuk")
      PACIFIC_CHUUK("Pacific/Chuuk"),

      @SerializedName("Pacific/Easter")
      PACIFIC_EASTER("Pacific/Easter"),

      @SerializedName("Pacific/Efate")
      PACIFIC_EFATE("Pacific/Efate"),

      @SerializedName("Pacific/Enderbury")
      PACIFIC_ENDERBURY("Pacific/Enderbury"),

      @SerializedName("Pacific/Fakaofo")
      PACIFIC_FAKAOFO("Pacific/Fakaofo"),

      @SerializedName("Pacific/Fiji")
      PACIFIC_FIJI("Pacific/Fiji"),

      @SerializedName("Pacific/Funafuti")
      PACIFIC_FUNAFUTI("Pacific/Funafuti"),

      @SerializedName("Pacific/Galapagos")
      PACIFIC_GALAPAGOS("Pacific/Galapagos"),

      @SerializedName("Pacific/Gambier")
      PACIFIC_GAMBIER("Pacific/Gambier"),

      @SerializedName("Pacific/Guadalcanal")
      PACIFIC_GUADALCANAL("Pacific/Guadalcanal"),

      @SerializedName("Pacific/Guam")
      PACIFIC_GUAM("Pacific/Guam"),

      @SerializedName("Pacific/Honolulu")
      PACIFIC_HONOLULU("Pacific/Honolulu"),

      @SerializedName("Pacific/Johnston")
      PACIFIC_JOHNSTON("Pacific/Johnston"),

      @SerializedName("Pacific/Kiritimati")
      PACIFIC_KIRITIMATI("Pacific/Kiritimati"),

      @SerializedName("Pacific/Kosrae")
      PACIFIC_KOSRAE("Pacific/Kosrae"),

      @SerializedName("Pacific/Kwajalein")
      PACIFIC_KWAJALEIN("Pacific/Kwajalein"),

      @SerializedName("Pacific/Majuro")
      PACIFIC_MAJURO("Pacific/Majuro"),

      @SerializedName("Pacific/Marquesas")
      PACIFIC_MARQUESAS("Pacific/Marquesas"),

      @SerializedName("Pacific/Midway")
      PACIFIC_MIDWAY("Pacific/Midway"),

      @SerializedName("Pacific/Nauru")
      PACIFIC_NAURU("Pacific/Nauru"),

      @SerializedName("Pacific/Niue")
      PACIFIC_NIUE("Pacific/Niue"),

      @SerializedName("Pacific/Norfolk")
      PACIFIC_NORFOLK("Pacific/Norfolk"),

      @SerializedName("Pacific/Noumea")
      PACIFIC_NOUMEA("Pacific/Noumea"),

      @SerializedName("Pacific/Pago_Pago")
      PACIFIC_PAGO_PAGO("Pacific/Pago_Pago"),

      @SerializedName("Pacific/Palau")
      PACIFIC_PALAU("Pacific/Palau"),

      @SerializedName("Pacific/Pitcairn")
      PACIFIC_PITCAIRN("Pacific/Pitcairn"),

      @SerializedName("Pacific/Pohnpei")
      PACIFIC_POHNPEI("Pacific/Pohnpei"),

      @SerializedName("Pacific/Ponape")
      PACIFIC_PONAPE("Pacific/Ponape"),

      @SerializedName("Pacific/Port_Moresby")
      PACIFIC_PORT_MORESBY("Pacific/Port_Moresby"),

      @SerializedName("Pacific/Rarotonga")
      PACIFIC_RAROTONGA("Pacific/Rarotonga"),

      @SerializedName("Pacific/Saipan")
      PACIFIC_SAIPAN("Pacific/Saipan"),

      @SerializedName("Pacific/Samoa")
      PACIFIC_SAMOA("Pacific/Samoa"),

      @SerializedName("Pacific/Tahiti")
      PACIFIC_TAHITI("Pacific/Tahiti"),

      @SerializedName("Pacific/Tarawa")
      PACIFIC_TARAWA("Pacific/Tarawa"),

      @SerializedName("Pacific/Tongatapu")
      PACIFIC_TONGATAPU("Pacific/Tongatapu"),

      @SerializedName("Pacific/Truk")
      PACIFIC_TRUK("Pacific/Truk"),

      @SerializedName("Pacific/Wake")
      PACIFIC_WAKE("Pacific/Wake"),

      @SerializedName("Pacific/Wallis")
      PACIFIC_WALLIS("Pacific/Wallis"),

      @SerializedName("Pacific/Yap")
      PACIFIC_YAP("Pacific/Yap"),

      @SerializedName("Poland")
      POLAND("Poland"),

      @SerializedName("Portugal")
      PORTUGAL("Portugal"),

      @SerializedName("ROC")
      ROC("ROC"),

      @SerializedName("ROK")
      ROK("ROK"),

      @SerializedName("Singapore")
      SINGAPORE("Singapore"),

      @SerializedName("Turkey")
      TURKEY("Turkey"),

      @SerializedName("UCT")
      UCT("UCT"),

      @SerializedName("US/Alaska")
      US_ALASKA("US/Alaska"),

      @SerializedName("US/Aleutian")
      US_ALEUTIAN("US/Aleutian"),

      @SerializedName("US/Arizona")
      US_ARIZONA("US/Arizona"),

      @SerializedName("US/Central")
      US_CENTRAL("US/Central"),

      @SerializedName("US/East-Indiana")
      US_EAST_INDIANA("US/East-Indiana"),

      @SerializedName("US/Eastern")
      US_EASTERN("US/Eastern"),

      @SerializedName("US/Hawaii")
      US_HAWAII("US/Hawaii"),

      @SerializedName("US/Indiana-Starke")
      US_INDIANA_STARKE("US/Indiana-Starke"),

      @SerializedName("US/Michigan")
      US_MICHIGAN("US/Michigan"),

      @SerializedName("US/Mountain")
      US_MOUNTAIN("US/Mountain"),

      @SerializedName("US/Pacific")
      US_PACIFIC("US/Pacific"),

      @SerializedName("US/Pacific-New")
      US_PACIFIC_NEW("US/Pacific-New"),

      @SerializedName("US/Samoa")
      US_SAMOA("US/Samoa"),

      @SerializedName("UTC")
      UTC("UTC"),

      @SerializedName("Universal")
      UNIVERSAL("Universal"),

      @SerializedName("W-SU")
      W_SU("W-SU"),

      @SerializedName("WET")
      WET("WET"),

      @SerializedName("Zulu")
      ZULU("Zulu");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Timezone(String value) {
        this.value = value;
      }
    }
  }
}
