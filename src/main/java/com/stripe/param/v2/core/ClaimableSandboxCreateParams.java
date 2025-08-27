// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ClaimableSandboxCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> If true, returns a key that can be used with <a
   * href="https://docs.stripe.com/mcp">Stripe's MCP server</a>.
   */
  @SerializedName("enable_mcp_access")
  Boolean enableMcpAccess;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Values that are prefilled when a user claims the sandbox. */
  @SerializedName("prefill")
  Prefill prefill;

  private ClaimableSandboxCreateParams(
      Boolean enableMcpAccess, Map<String, Object> extraParams, Prefill prefill) {
    this.enableMcpAccess = enableMcpAccess;
    this.extraParams = extraParams;
    this.prefill = prefill;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean enableMcpAccess;

    private Map<String, Object> extraParams;

    private Prefill prefill;

    /** Finalize and obtain parameter instance from this builder. */
    public ClaimableSandboxCreateParams build() {
      return new ClaimableSandboxCreateParams(this.enableMcpAccess, this.extraParams, this.prefill);
    }

    /**
     * <strong>Required.</strong> If true, returns a key that can be used with <a
     * href="https://docs.stripe.com/mcp">Stripe's MCP server</a>.
     */
    public Builder setEnableMcpAccess(Boolean enableMcpAccess) {
      this.enableMcpAccess = enableMcpAccess;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ClaimableSandboxCreateParams#extraParams} for the field documentation.
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
     * See {@link ClaimableSandboxCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Values that are prefilled when a user claims the sandbox. */
    public Builder setPrefill(ClaimableSandboxCreateParams.Prefill prefill) {
      this.prefill = prefill;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Prefill {
    /**
     * <strong>Required.</strong> Country in which the account holder resides, or in which the
     * business is legally established. Use two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
    @SerializedName("country")
    Country country;

    /**
     * <strong>Required.</strong> Email that this sandbox is meant to be claimed by. Stripe will
     * notify this email address before the sandbox expires.
     */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Name for the sandbox. If not provided, this will be generated. */
    @SerializedName("name")
    String name;

    private Prefill(Country country, String email, Map<String, Object> extraParams, String name) {
      this.country = country;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Country country;

      private String email;

      private Map<String, Object> extraParams;

      private String name;

      /** Finalize and obtain parameter instance from this builder. */
      public ClaimableSandboxCreateParams.Prefill build() {
        return new ClaimableSandboxCreateParams.Prefill(
            this.country, this.email, this.extraParams, this.name);
      }

      /**
       * <strong>Required.</strong> Country in which the account holder resides, or in which the
       * business is legally established. Use two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setCountry(ClaimableSandboxCreateParams.Prefill.Country country) {
        this.country = country;
        return this;
      }

      /**
       * <strong>Required.</strong> Email that this sandbox is meant to be claimed by. Stripe will
       * notify this email address before the sandbox expires.
       */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ClaimableSandboxCreateParams.Prefill#extraParams} for the field documentation.
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
       * See {@link ClaimableSandboxCreateParams.Prefill#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Name for the sandbox. If not provided, this will be generated. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }
    }

    public enum Country implements ApiRequestParams.EnumParam {
      @SerializedName("ad")
      AD("ad"),

      @SerializedName("ae")
      AE("ae"),

      @SerializedName("af")
      AF("af"),

      @SerializedName("ag")
      AG("ag"),

      @SerializedName("ai")
      AI("ai"),

      @SerializedName("al")
      AL("al"),

      @SerializedName("am")
      AM("am"),

      @SerializedName("ao")
      AO("ao"),

      @SerializedName("aq")
      AQ("aq"),

      @SerializedName("ar")
      AR("ar"),

      @SerializedName("as")
      AS("as"),

      @SerializedName("at")
      AT("at"),

      @SerializedName("au")
      AU("au"),

      @SerializedName("aw")
      AW("aw"),

      @SerializedName("ax")
      AX("ax"),

      @SerializedName("az")
      AZ("az"),

      @SerializedName("ba")
      BA("ba"),

      @SerializedName("bb")
      BB("bb"),

      @SerializedName("bd")
      BD("bd"),

      @SerializedName("be")
      BE("be"),

      @SerializedName("bf")
      BF("bf"),

      @SerializedName("bg")
      BG("bg"),

      @SerializedName("bh")
      BH("bh"),

      @SerializedName("bi")
      BI("bi"),

      @SerializedName("bj")
      BJ("bj"),

      @SerializedName("bl")
      BL("bl"),

      @SerializedName("bm")
      BM("bm"),

      @SerializedName("bn")
      BN("bn"),

      @SerializedName("bo")
      BO("bo"),

      @SerializedName("bq")
      BQ("bq"),

      @SerializedName("br")
      BR("br"),

      @SerializedName("bs")
      BS("bs"),

      @SerializedName("bt")
      BT("bt"),

      @SerializedName("bv")
      BV("bv"),

      @SerializedName("bw")
      BW("bw"),

      @SerializedName("by")
      BY("by"),

      @SerializedName("bz")
      BZ("bz"),

      @SerializedName("ca")
      CA("ca"),

      @SerializedName("cc")
      CC("cc"),

      @SerializedName("cd")
      CD("cd"),

      @SerializedName("cf")
      CF("cf"),

      @SerializedName("cg")
      CG("cg"),

      @SerializedName("ch")
      CH("ch"),

      @SerializedName("ci")
      CI("ci"),

      @SerializedName("ck")
      CK("ck"),

      @SerializedName("cl")
      CL("cl"),

      @SerializedName("cm")
      CM("cm"),

      @SerializedName("cn")
      CN("cn"),

      @SerializedName("co")
      CO("co"),

      @SerializedName("cr")
      CR("cr"),

      @SerializedName("cu")
      CU("cu"),

      @SerializedName("cv")
      CV("cv"),

      @SerializedName("cw")
      CW("cw"),

      @SerializedName("cx")
      CX("cx"),

      @SerializedName("cy")
      CY("cy"),

      @SerializedName("cz")
      CZ("cz"),

      @SerializedName("de")
      DE("de"),

      @SerializedName("dj")
      DJ("dj"),

      @SerializedName("dk")
      DK("dk"),

      @SerializedName("dm")
      DM("dm"),

      @SerializedName("do")
      DO("do"),

      @SerializedName("dz")
      DZ("dz"),

      @SerializedName("ec")
      EC("ec"),

      @SerializedName("ee")
      EE("ee"),

      @SerializedName("eg")
      EG("eg"),

      @SerializedName("eh")
      EH("eh"),

      @SerializedName("er")
      ER("er"),

      @SerializedName("es")
      ES("es"),

      @SerializedName("et")
      ET("et"),

      @SerializedName("fi")
      FI("fi"),

      @SerializedName("fj")
      FJ("fj"),

      @SerializedName("fk")
      FK("fk"),

      @SerializedName("fm")
      FM("fm"),

      @SerializedName("fo")
      FO("fo"),

      @SerializedName("fr")
      FR("fr"),

      @SerializedName("ga")
      GA("ga"),

      @SerializedName("gb")
      GB("gb"),

      @SerializedName("gd")
      GD("gd"),

      @SerializedName("ge")
      GE("ge"),

      @SerializedName("gf")
      GF("gf"),

      @SerializedName("gg")
      GG("gg"),

      @SerializedName("gh")
      GH("gh"),

      @SerializedName("gi")
      GI("gi"),

      @SerializedName("gl")
      GL("gl"),

      @SerializedName("gm")
      GM("gm"),

      @SerializedName("gn")
      GN("gn"),

      @SerializedName("gp")
      GP("gp"),

      @SerializedName("gq")
      GQ("gq"),

      @SerializedName("gr")
      GR("gr"),

      @SerializedName("gs")
      GS("gs"),

      @SerializedName("gt")
      GT("gt"),

      @SerializedName("gu")
      GU("gu"),

      @SerializedName("gw")
      GW("gw"),

      @SerializedName("gy")
      GY("gy"),

      @SerializedName("hk")
      HK("hk"),

      @SerializedName("hm")
      HM("hm"),

      @SerializedName("hn")
      HN("hn"),

      @SerializedName("hr")
      HR("hr"),

      @SerializedName("ht")
      HT("ht"),

      @SerializedName("hu")
      HU("hu"),

      @SerializedName("id")
      ID("id"),

      @SerializedName("ie")
      IE("ie"),

      @SerializedName("il")
      IL("il"),

      @SerializedName("im")
      IM("im"),

      @SerializedName("in")
      IN("in"),

      @SerializedName("io")
      IO("io"),

      @SerializedName("iq")
      IQ("iq"),

      @SerializedName("ir")
      IR("ir"),

      @SerializedName("is")
      IS("is"),

      @SerializedName("it")
      IT("it"),

      @SerializedName("je")
      JE("je"),

      @SerializedName("jm")
      JM("jm"),

      @SerializedName("jo")
      JO("jo"),

      @SerializedName("jp")
      JP("jp"),

      @SerializedName("ke")
      KE("ke"),

      @SerializedName("kg")
      KG("kg"),

      @SerializedName("kh")
      KH("kh"),

      @SerializedName("ki")
      KI("ki"),

      @SerializedName("km")
      KM("km"),

      @SerializedName("kn")
      KN("kn"),

      @SerializedName("kp")
      KP("kp"),

      @SerializedName("kr")
      KR("kr"),

      @SerializedName("kw")
      KW("kw"),

      @SerializedName("ky")
      KY("ky"),

      @SerializedName("kz")
      KZ("kz"),

      @SerializedName("la")
      LA("la"),

      @SerializedName("lb")
      LB("lb"),

      @SerializedName("lc")
      LC("lc"),

      @SerializedName("li")
      LI("li"),

      @SerializedName("lk")
      LK("lk"),

      @SerializedName("lr")
      LR("lr"),

      @SerializedName("ls")
      LS("ls"),

      @SerializedName("lt")
      LT("lt"),

      @SerializedName("lu")
      LU("lu"),

      @SerializedName("lv")
      LV("lv"),

      @SerializedName("ly")
      LY("ly"),

      @SerializedName("ma")
      MA("ma"),

      @SerializedName("mc")
      MC("mc"),

      @SerializedName("md")
      MD("md"),

      @SerializedName("me")
      ME("me"),

      @SerializedName("mf")
      MF("mf"),

      @SerializedName("mg")
      MG("mg"),

      @SerializedName("mh")
      MH("mh"),

      @SerializedName("mk")
      MK("mk"),

      @SerializedName("ml")
      ML("ml"),

      @SerializedName("mm")
      MM("mm"),

      @SerializedName("mn")
      MN("mn"),

      @SerializedName("mo")
      MO("mo"),

      @SerializedName("mp")
      MP("mp"),

      @SerializedName("mq")
      MQ("mq"),

      @SerializedName("mr")
      MR("mr"),

      @SerializedName("ms")
      MS("ms"),

      @SerializedName("mt")
      MT("mt"),

      @SerializedName("mu")
      MU("mu"),

      @SerializedName("mv")
      MV("mv"),

      @SerializedName("mw")
      MW("mw"),

      @SerializedName("mx")
      MX("mx"),

      @SerializedName("my")
      MY("my"),

      @SerializedName("mz")
      MZ("mz"),

      @SerializedName("na")
      NA("na"),

      @SerializedName("nc")
      NC("nc"),

      @SerializedName("ne")
      NE("ne"),

      @SerializedName("nf")
      NF("nf"),

      @SerializedName("ng")
      NG("ng"),

      @SerializedName("ni")
      NI("ni"),

      @SerializedName("nl")
      NL("nl"),

      @SerializedName("no")
      NO("no"),

      @SerializedName("np")
      NP("np"),

      @SerializedName("nr")
      NR("nr"),

      @SerializedName("nu")
      NU("nu"),

      @SerializedName("nz")
      NZ("nz"),

      @SerializedName("om")
      OM("om"),

      @SerializedName("pa")
      PA("pa"),

      @SerializedName("pe")
      PE("pe"),

      @SerializedName("pf")
      PF("pf"),

      @SerializedName("pg")
      PG("pg"),

      @SerializedName("ph")
      PH("ph"),

      @SerializedName("pk")
      PK("pk"),

      @SerializedName("pl")
      PL("pl"),

      @SerializedName("pm")
      PM("pm"),

      @SerializedName("pn")
      PN("pn"),

      @SerializedName("pr")
      PR("pr"),

      @SerializedName("ps")
      PS("ps"),

      @SerializedName("pt")
      PT("pt"),

      @SerializedName("pw")
      PW("pw"),

      @SerializedName("py")
      PY("py"),

      @SerializedName("qa")
      QA("qa"),

      @SerializedName("qz")
      QZ("qz"),

      @SerializedName("re")
      RE("re"),

      @SerializedName("ro")
      RO("ro"),

      @SerializedName("rs")
      RS("rs"),

      @SerializedName("ru")
      RU("ru"),

      @SerializedName("rw")
      RW("rw"),

      @SerializedName("sa")
      SA("sa"),

      @SerializedName("sb")
      SB("sb"),

      @SerializedName("sc")
      SC("sc"),

      @SerializedName("sd")
      SD("sd"),

      @SerializedName("se")
      SE("se"),

      @SerializedName("sg")
      SG("sg"),

      @SerializedName("sh")
      SH("sh"),

      @SerializedName("si")
      SI("si"),

      @SerializedName("sj")
      SJ("sj"),

      @SerializedName("sk")
      SK("sk"),

      @SerializedName("sl")
      SL("sl"),

      @SerializedName("sm")
      SM("sm"),

      @SerializedName("sn")
      SN("sn"),

      @SerializedName("so")
      SO("so"),

      @SerializedName("sr")
      SR("sr"),

      @SerializedName("ss")
      SS("ss"),

      @SerializedName("st")
      ST("st"),

      @SerializedName("sv")
      SV("sv"),

      @SerializedName("sx")
      SX("sx"),

      @SerializedName("sy")
      SY("sy"),

      @SerializedName("sz")
      SZ("sz"),

      @SerializedName("tc")
      TC("tc"),

      @SerializedName("td")
      TD("td"),

      @SerializedName("tf")
      TF("tf"),

      @SerializedName("tg")
      TG("tg"),

      @SerializedName("th")
      TH("th"),

      @SerializedName("tj")
      TJ("tj"),

      @SerializedName("tk")
      TK("tk"),

      @SerializedName("tl")
      TL("tl"),

      @SerializedName("tm")
      TM("tm"),

      @SerializedName("tn")
      TN("tn"),

      @SerializedName("to")
      TO("to"),

      @SerializedName("tr")
      TR("tr"),

      @SerializedName("tt")
      TT("tt"),

      @SerializedName("tv")
      TV("tv"),

      @SerializedName("tw")
      TW("tw"),

      @SerializedName("tz")
      TZ("tz"),

      @SerializedName("ua")
      UA("ua"),

      @SerializedName("ug")
      UG("ug"),

      @SerializedName("um")
      UM("um"),

      @SerializedName("us")
      US("us"),

      @SerializedName("uy")
      UY("uy"),

      @SerializedName("uz")
      UZ("uz"),

      @SerializedName("va")
      VA("va"),

      @SerializedName("vc")
      VC("vc"),

      @SerializedName("ve")
      VE("ve"),

      @SerializedName("vg")
      VG("vg"),

      @SerializedName("vi")
      VI("vi"),

      @SerializedName("vn")
      VN("vn"),

      @SerializedName("vu")
      VU("vu"),

      @SerializedName("wf")
      WF("wf"),

      @SerializedName("ws")
      WS("ws"),

      @SerializedName("xx")
      XX("xx"),

      @SerializedName("ye")
      YE("ye"),

      @SerializedName("yt")
      YT("yt"),

      @SerializedName("za")
      ZA("za"),

      @SerializedName("zm")
      ZM("zm"),

      @SerializedName("zw")
      ZW("zw");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Country(String value) {
        this.value = value;
      }
    }
  }
}
