// File generated from our OpenAPI spec
package com.stripe.param.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class RegistrationCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Time at which the Tax Registration becomes active. It can be either
   * {@code now} to indicate the current time, or a timestamp measured in seconds since the Unix
   * epoch.
   */
  @SerializedName("active_from")
  Object activeFrom;

  /**
   * <strong>Required.</strong> Two-letter country code (<a
   * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
   */
  @SerializedName("country")
  String country;

  /**
   * <strong>Required.</strong> Specific options for a registration in the specified {@code
   * country}.
   */
  @SerializedName("country_options")
  CountryOptions countryOptions;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * If set, the Tax Registration stops being active at this time. If not set, the Tax Registration
   * will be active indefinitely. Timestamp measured in seconds since the Unix epoch.
   */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  private RegistrationCreateParams(
      Object activeFrom,
      String country,
      CountryOptions countryOptions,
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams) {
    this.activeFrom = activeFrom;
    this.country = country;
    this.countryOptions = countryOptions;
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object activeFrom;

    private String country;

    private CountryOptions countryOptions;

    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public RegistrationCreateParams build() {
      return new RegistrationCreateParams(
          this.activeFrom,
          this.country,
          this.countryOptions,
          this.expand,
          this.expiresAt,
          this.extraParams);
    }

    /**
     * <strong>Required.</strong> Time at which the Tax Registration becomes active. It can be
     * either {@code now} to indicate the current time, or a timestamp measured in seconds since the
     * Unix epoch.
     */
    public Builder setActiveFrom(Long activeFrom) {
      this.activeFrom = activeFrom;
      return this;
    }

    /**
     * <strong>Required.</strong> Time at which the Tax Registration becomes active. It can be
     * either {@code now} to indicate the current time, or a timestamp measured in seconds since the
     * Unix epoch.
     */
    public Builder setActiveFrom(RegistrationCreateParams.ActiveFrom activeFrom) {
      this.activeFrom = activeFrom;
      return this;
    }

    /**
     * <strong>Required.</strong> Two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }

    /**
     * <strong>Required.</strong> Specific options for a registration in the specified {@code
     * country}.
     */
    public Builder setCountryOptions(RegistrationCreateParams.CountryOptions countryOptions) {
      this.countryOptions = countryOptions;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RegistrationCreateParams#expand} for the field documentation.
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
     * RegistrationCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * If set, the Tax Registration stops being active at this time. If not set, the Tax
     * Registration will be active indefinitely. Timestamp measured in seconds since the Unix epoch.
     */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RegistrationCreateParams#extraParams} for the field documentation.
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
     * See {@link RegistrationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  @Getter
  public static class CountryOptions {
    /** Options for the registration in AE. */
    @SerializedName("ae")
    Ae ae;

    /** Options for the registration in AT. */
    @SerializedName("at")
    At at;

    /** Options for the registration in AU. */
    @SerializedName("au")
    Au au;

    /** Options for the registration in BE. */
    @SerializedName("be")
    Be be;

    /** Options for the registration in BG. */
    @SerializedName("bg")
    Bg bg;

    /** Options for the registration in CA. */
    @SerializedName("ca")
    Ca ca;

    /** Options for the registration in CH. */
    @SerializedName("ch")
    Ch ch;

    /** Options for the registration in CL. */
    @SerializedName("cl")
    Cl cl;

    /** Options for the registration in CO. */
    @SerializedName("co")
    Co co;

    /** Options for the registration in CY. */
    @SerializedName("cy")
    Cy cy;

    /** Options for the registration in CZ. */
    @SerializedName("cz")
    Cz cz;

    /** Options for the registration in DE. */
    @SerializedName("de")
    De de;

    /** Options for the registration in DK. */
    @SerializedName("dk")
    Dk dk;

    /** Options for the registration in EE. */
    @SerializedName("ee")
    Ee ee;

    /** Options for the registration in ES. */
    @SerializedName("es")
    Es es;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Options for the registration in FI. */
    @SerializedName("fi")
    Fi fi;

    /** Options for the registration in FR. */
    @SerializedName("fr")
    Fr fr;

    /** Options for the registration in GB. */
    @SerializedName("gb")
    Gb gb;

    /** Options for the registration in GR. */
    @SerializedName("gr")
    Gr gr;

    /** Options for the registration in HR. */
    @SerializedName("hr")
    Hr hr;

    /** Options for the registration in HU. */
    @SerializedName("hu")
    Hu hu;

    /** Options for the registration in ID. */
    @SerializedName("id")
    Id id;

    /** Options for the registration in IE. */
    @SerializedName("ie")
    Ie ie;

    /** Options for the registration in IS. */
    @SerializedName("is")
    Is is;

    /** Options for the registration in IT. */
    @SerializedName("it")
    It it;

    /** Options for the registration in JP. */
    @SerializedName("jp")
    Jp jp;

    /** Options for the registration in KR. */
    @SerializedName("kr")
    Kr kr;

    /** Options for the registration in LT. */
    @SerializedName("lt")
    Lt lt;

    /** Options for the registration in LU. */
    @SerializedName("lu")
    Lu lu;

    /** Options for the registration in LV. */
    @SerializedName("lv")
    Lv lv;

    /** Options for the registration in MT. */
    @SerializedName("mt")
    Mt mt;

    /** Options for the registration in MX. */
    @SerializedName("mx")
    Mx mx;

    /** Options for the registration in MY. */
    @SerializedName("my")
    My my;

    /** Options for the registration in NL. */
    @SerializedName("nl")
    Nl nl;

    /** Options for the registration in NO. */
    @SerializedName("no")
    No no;

    /** Options for the registration in NZ. */
    @SerializedName("nz")
    Nz nz;

    /** Options for the registration in PL. */
    @SerializedName("pl")
    Pl pl;

    /** Options for the registration in PT. */
    @SerializedName("pt")
    Pt pt;

    /** Options for the registration in RO. */
    @SerializedName("ro")
    Ro ro;

    /** Options for the registration in SA. */
    @SerializedName("sa")
    Sa sa;

    /** Options for the registration in SE. */
    @SerializedName("se")
    Se se;

    /** Options for the registration in SG. */
    @SerializedName("sg")
    Sg sg;

    /** Options for the registration in SI. */
    @SerializedName("si")
    Si si;

    /** Options for the registration in SK. */
    @SerializedName("sk")
    Sk sk;

    /** Options for the registration in TH. */
    @SerializedName("th")
    Th th;

    /** Options for the registration in TR. */
    @SerializedName("tr")
    Tr tr;

    /** Options for the registration in US. */
    @SerializedName("us")
    Us us;

    /** Options for the registration in VN. */
    @SerializedName("vn")
    Vn vn;

    /** Options for the registration in ZA. */
    @SerializedName("za")
    Za za;

    private CountryOptions(
        Ae ae,
        At at,
        Au au,
        Be be,
        Bg bg,
        Ca ca,
        Ch ch,
        Cl cl,
        Co co,
        Cy cy,
        Cz cz,
        De de,
        Dk dk,
        Ee ee,
        Es es,
        Map<String, Object> extraParams,
        Fi fi,
        Fr fr,
        Gb gb,
        Gr gr,
        Hr hr,
        Hu hu,
        Id id,
        Ie ie,
        Is is,
        It it,
        Jp jp,
        Kr kr,
        Lt lt,
        Lu lu,
        Lv lv,
        Mt mt,
        Mx mx,
        My my,
        Nl nl,
        No no,
        Nz nz,
        Pl pl,
        Pt pt,
        Ro ro,
        Sa sa,
        Se se,
        Sg sg,
        Si si,
        Sk sk,
        Th th,
        Tr tr,
        Us us,
        Vn vn,
        Za za) {
      this.ae = ae;
      this.at = at;
      this.au = au;
      this.be = be;
      this.bg = bg;
      this.ca = ca;
      this.ch = ch;
      this.cl = cl;
      this.co = co;
      this.cy = cy;
      this.cz = cz;
      this.de = de;
      this.dk = dk;
      this.ee = ee;
      this.es = es;
      this.extraParams = extraParams;
      this.fi = fi;
      this.fr = fr;
      this.gb = gb;
      this.gr = gr;
      this.hr = hr;
      this.hu = hu;
      this.id = id;
      this.ie = ie;
      this.is = is;
      this.it = it;
      this.jp = jp;
      this.kr = kr;
      this.lt = lt;
      this.lu = lu;
      this.lv = lv;
      this.mt = mt;
      this.mx = mx;
      this.my = my;
      this.nl = nl;
      this.no = no;
      this.nz = nz;
      this.pl = pl;
      this.pt = pt;
      this.ro = ro;
      this.sa = sa;
      this.se = se;
      this.sg = sg;
      this.si = si;
      this.sk = sk;
      this.th = th;
      this.tr = tr;
      this.us = us;
      this.vn = vn;
      this.za = za;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Ae ae;

      private At at;

      private Au au;

      private Be be;

      private Bg bg;

      private Ca ca;

      private Ch ch;

      private Cl cl;

      private Co co;

      private Cy cy;

      private Cz cz;

      private De de;

      private Dk dk;

      private Ee ee;

      private Es es;

      private Map<String, Object> extraParams;

      private Fi fi;

      private Fr fr;

      private Gb gb;

      private Gr gr;

      private Hr hr;

      private Hu hu;

      private Id id;

      private Ie ie;

      private Is is;

      private It it;

      private Jp jp;

      private Kr kr;

      private Lt lt;

      private Lu lu;

      private Lv lv;

      private Mt mt;

      private Mx mx;

      private My my;

      private Nl nl;

      private No no;

      private Nz nz;

      private Pl pl;

      private Pt pt;

      private Ro ro;

      private Sa sa;

      private Se se;

      private Sg sg;

      private Si si;

      private Sk sk;

      private Th th;

      private Tr tr;

      private Us us;

      private Vn vn;

      private Za za;

      /** Finalize and obtain parameter instance from this builder. */
      public RegistrationCreateParams.CountryOptions build() {
        return new RegistrationCreateParams.CountryOptions(
            this.ae,
            this.at,
            this.au,
            this.be,
            this.bg,
            this.ca,
            this.ch,
            this.cl,
            this.co,
            this.cy,
            this.cz,
            this.de,
            this.dk,
            this.ee,
            this.es,
            this.extraParams,
            this.fi,
            this.fr,
            this.gb,
            this.gr,
            this.hr,
            this.hu,
            this.id,
            this.ie,
            this.is,
            this.it,
            this.jp,
            this.kr,
            this.lt,
            this.lu,
            this.lv,
            this.mt,
            this.mx,
            this.my,
            this.nl,
            this.no,
            this.nz,
            this.pl,
            this.pt,
            this.ro,
            this.sa,
            this.se,
            this.sg,
            this.si,
            this.sk,
            this.th,
            this.tr,
            this.us,
            this.vn,
            this.za);
      }

      /** Options for the registration in AE. */
      public Builder setAe(RegistrationCreateParams.CountryOptions.Ae ae) {
        this.ae = ae;
        return this;
      }

      /** Options for the registration in AT. */
      public Builder setAt(RegistrationCreateParams.CountryOptions.At at) {
        this.at = at;
        return this;
      }

      /** Options for the registration in AU. */
      public Builder setAu(RegistrationCreateParams.CountryOptions.Au au) {
        this.au = au;
        return this;
      }

      /** Options for the registration in BE. */
      public Builder setBe(RegistrationCreateParams.CountryOptions.Be be) {
        this.be = be;
        return this;
      }

      /** Options for the registration in BG. */
      public Builder setBg(RegistrationCreateParams.CountryOptions.Bg bg) {
        this.bg = bg;
        return this;
      }

      /** Options for the registration in CA. */
      public Builder setCa(RegistrationCreateParams.CountryOptions.Ca ca) {
        this.ca = ca;
        return this;
      }

      /** Options for the registration in CH. */
      public Builder setCh(RegistrationCreateParams.CountryOptions.Ch ch) {
        this.ch = ch;
        return this;
      }

      /** Options for the registration in CL. */
      public Builder setCl(RegistrationCreateParams.CountryOptions.Cl cl) {
        this.cl = cl;
        return this;
      }

      /** Options for the registration in CO. */
      public Builder setCo(RegistrationCreateParams.CountryOptions.Co co) {
        this.co = co;
        return this;
      }

      /** Options for the registration in CY. */
      public Builder setCy(RegistrationCreateParams.CountryOptions.Cy cy) {
        this.cy = cy;
        return this;
      }

      /** Options for the registration in CZ. */
      public Builder setCz(RegistrationCreateParams.CountryOptions.Cz cz) {
        this.cz = cz;
        return this;
      }

      /** Options for the registration in DE. */
      public Builder setDe(RegistrationCreateParams.CountryOptions.De de) {
        this.de = de;
        return this;
      }

      /** Options for the registration in DK. */
      public Builder setDk(RegistrationCreateParams.CountryOptions.Dk dk) {
        this.dk = dk;
        return this;
      }

      /** Options for the registration in EE. */
      public Builder setEe(RegistrationCreateParams.CountryOptions.Ee ee) {
        this.ee = ee;
        return this;
      }

      /** Options for the registration in ES. */
      public Builder setEs(RegistrationCreateParams.CountryOptions.Es es) {
        this.es = es;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RegistrationCreateParams.CountryOptions#extraParams} for the field documentation.
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
       * See {@link RegistrationCreateParams.CountryOptions#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Options for the registration in FI. */
      public Builder setFi(RegistrationCreateParams.CountryOptions.Fi fi) {
        this.fi = fi;
        return this;
      }

      /** Options for the registration in FR. */
      public Builder setFr(RegistrationCreateParams.CountryOptions.Fr fr) {
        this.fr = fr;
        return this;
      }

      /** Options for the registration in GB. */
      public Builder setGb(RegistrationCreateParams.CountryOptions.Gb gb) {
        this.gb = gb;
        return this;
      }

      /** Options for the registration in GR. */
      public Builder setGr(RegistrationCreateParams.CountryOptions.Gr gr) {
        this.gr = gr;
        return this;
      }

      /** Options for the registration in HR. */
      public Builder setHr(RegistrationCreateParams.CountryOptions.Hr hr) {
        this.hr = hr;
        return this;
      }

      /** Options for the registration in HU. */
      public Builder setHu(RegistrationCreateParams.CountryOptions.Hu hu) {
        this.hu = hu;
        return this;
      }

      /** Options for the registration in ID. */
      public Builder setId(RegistrationCreateParams.CountryOptions.Id id) {
        this.id = id;
        return this;
      }

      /** Options for the registration in IE. */
      public Builder setIe(RegistrationCreateParams.CountryOptions.Ie ie) {
        this.ie = ie;
        return this;
      }

      /** Options for the registration in IS. */
      public Builder setIs(RegistrationCreateParams.CountryOptions.Is is) {
        this.is = is;
        return this;
      }

      /** Options for the registration in IT. */
      public Builder setIt(RegistrationCreateParams.CountryOptions.It it) {
        this.it = it;
        return this;
      }

      /** Options for the registration in JP. */
      public Builder setJp(RegistrationCreateParams.CountryOptions.Jp jp) {
        this.jp = jp;
        return this;
      }

      /** Options for the registration in KR. */
      public Builder setKr(RegistrationCreateParams.CountryOptions.Kr kr) {
        this.kr = kr;
        return this;
      }

      /** Options for the registration in LT. */
      public Builder setLt(RegistrationCreateParams.CountryOptions.Lt lt) {
        this.lt = lt;
        return this;
      }

      /** Options for the registration in LU. */
      public Builder setLu(RegistrationCreateParams.CountryOptions.Lu lu) {
        this.lu = lu;
        return this;
      }

      /** Options for the registration in LV. */
      public Builder setLv(RegistrationCreateParams.CountryOptions.Lv lv) {
        this.lv = lv;
        return this;
      }

      /** Options for the registration in MT. */
      public Builder setMt(RegistrationCreateParams.CountryOptions.Mt mt) {
        this.mt = mt;
        return this;
      }

      /** Options for the registration in MX. */
      public Builder setMx(RegistrationCreateParams.CountryOptions.Mx mx) {
        this.mx = mx;
        return this;
      }

      /** Options for the registration in MY. */
      public Builder setMy(RegistrationCreateParams.CountryOptions.My my) {
        this.my = my;
        return this;
      }

      /** Options for the registration in NL. */
      public Builder setNl(RegistrationCreateParams.CountryOptions.Nl nl) {
        this.nl = nl;
        return this;
      }

      /** Options for the registration in NO. */
      public Builder setNo(RegistrationCreateParams.CountryOptions.No no) {
        this.no = no;
        return this;
      }

      /** Options for the registration in NZ. */
      public Builder setNz(RegistrationCreateParams.CountryOptions.Nz nz) {
        this.nz = nz;
        return this;
      }

      /** Options for the registration in PL. */
      public Builder setPl(RegistrationCreateParams.CountryOptions.Pl pl) {
        this.pl = pl;
        return this;
      }

      /** Options for the registration in PT. */
      public Builder setPt(RegistrationCreateParams.CountryOptions.Pt pt) {
        this.pt = pt;
        return this;
      }

      /** Options for the registration in RO. */
      public Builder setRo(RegistrationCreateParams.CountryOptions.Ro ro) {
        this.ro = ro;
        return this;
      }

      /** Options for the registration in SA. */
      public Builder setSa(RegistrationCreateParams.CountryOptions.Sa sa) {
        this.sa = sa;
        return this;
      }

      /** Options for the registration in SE. */
      public Builder setSe(RegistrationCreateParams.CountryOptions.Se se) {
        this.se = se;
        return this;
      }

      /** Options for the registration in SG. */
      public Builder setSg(RegistrationCreateParams.CountryOptions.Sg sg) {
        this.sg = sg;
        return this;
      }

      /** Options for the registration in SI. */
      public Builder setSi(RegistrationCreateParams.CountryOptions.Si si) {
        this.si = si;
        return this;
      }

      /** Options for the registration in SK. */
      public Builder setSk(RegistrationCreateParams.CountryOptions.Sk sk) {
        this.sk = sk;
        return this;
      }

      /** Options for the registration in TH. */
      public Builder setTh(RegistrationCreateParams.CountryOptions.Th th) {
        this.th = th;
        return this;
      }

      /** Options for the registration in TR. */
      public Builder setTr(RegistrationCreateParams.CountryOptions.Tr tr) {
        this.tr = tr;
        return this;
      }

      /** Options for the registration in US. */
      public Builder setUs(RegistrationCreateParams.CountryOptions.Us us) {
        this.us = us;
        return this;
      }

      /** Options for the registration in VN. */
      public Builder setVn(RegistrationCreateParams.CountryOptions.Vn vn) {
        this.vn = vn;
        return this;
      }

      /** Options for the registration in ZA. */
      public Builder setZa(RegistrationCreateParams.CountryOptions.Za za) {
        this.za = za;
        return this;
      }
    }

    @Getter
    public static class Ae {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Ae(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Ae build() {
          return new RegistrationCreateParams.CountryOptions.Ae(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ae#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ae#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Ae.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class At {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private At(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.At build() {
          return new RegistrationCreateParams.CountryOptions.At(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.At#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.At#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.At.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.At.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.At.Standard build() {
            return new RegistrationCreateParams.CountryOptions.At.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.At.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.At.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.At.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Au {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Au(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Au build() {
          return new RegistrationCreateParams.CountryOptions.Au(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Au#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Au#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Au.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Be {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Be(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Be build() {
          return new RegistrationCreateParams.CountryOptions.Be(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Be#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Be#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Be.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Be.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Be.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Be.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Be.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Be.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Be.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Bg {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Bg(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Bg build() {
          return new RegistrationCreateParams.CountryOptions.Bg(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Bg#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Bg#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Bg.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Bg.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Bg.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Bg.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Bg.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Bg.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Bg.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Ca {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the provincial tax registration. */
      @SerializedName("province_standard")
      ProvinceStandard provinceStandard;

      /** <strong>Required.</strong> Type of registration to be created in Canada. */
      @SerializedName("type")
      Type type;

      private Ca(Map<String, Object> extraParams, ProvinceStandard provinceStandard, Type type) {
        this.extraParams = extraParams;
        this.provinceStandard = provinceStandard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private ProvinceStandard provinceStandard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Ca build() {
          return new RegistrationCreateParams.CountryOptions.Ca(
              this.extraParams, this.provinceStandard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ca#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ca#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the provincial tax registration. */
        public Builder setProvinceStandard(
            RegistrationCreateParams.CountryOptions.Ca.ProvinceStandard provinceStandard) {
          this.provinceStandard = provinceStandard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in Canada. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Ca.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class ProvinceStandard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Two-letter CA province code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
        @SerializedName("province")
        String province;

        private ProvinceStandard(Map<String, Object> extraParams, String province) {
          this.extraParams = extraParams;
          this.province = province;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String province;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Ca.ProvinceStandard build() {
            return new RegistrationCreateParams.CountryOptions.Ca.ProvinceStandard(
                this.extraParams, this.province);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RegistrationCreateParams.CountryOptions.Ca.ProvinceStandard#extraParams} for the field
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RegistrationCreateParams.CountryOptions.Ca.ProvinceStandard#extraParams} for the field
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
           * <strong>Required.</strong> Two-letter CA province code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          public Builder setProvince(String province) {
            this.province = province;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("province_standard")
        PROVINCE_STANDARD("province_standard"),

        @SerializedName("simplified")
        SIMPLIFIED("simplified"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Ch {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Ch(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Ch build() {
          return new RegistrationCreateParams.CountryOptions.Ch(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ch#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ch#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Ch.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Cl {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Cl(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Cl build() {
          return new RegistrationCreateParams.CountryOptions.Cl(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cl#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cl#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Cl.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Co {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Co(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Co build() {
          return new RegistrationCreateParams.CountryOptions.Co(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Co#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Co#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Co.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Cy {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Cy(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Cy build() {
          return new RegistrationCreateParams.CountryOptions.Cy(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cy#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cy#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Cy.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Cy.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Cy.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Cy.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Cy.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Cy.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Cy.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Cz {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Cz(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Cz build() {
          return new RegistrationCreateParams.CountryOptions.Cz(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cz#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cz#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Cz.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Cz.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Cz.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Cz.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Cz.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Cz.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Cz.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class De {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private De(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.De build() {
          return new RegistrationCreateParams.CountryOptions.De(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.De#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.De#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.De.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.De.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.De.Standard build() {
            return new RegistrationCreateParams.CountryOptions.De.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.De.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.De.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.De.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Dk {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Dk(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Dk build() {
          return new RegistrationCreateParams.CountryOptions.Dk(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Dk#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Dk#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Dk.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Dk.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Dk.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Dk.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Dk.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Dk.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Dk.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Ee {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Ee(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Ee build() {
          return new RegistrationCreateParams.CountryOptions.Ee(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ee#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ee#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Ee.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Ee.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Ee.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Ee.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Ee.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Ee.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Ee.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Es {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Es(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Es build() {
          return new RegistrationCreateParams.CountryOptions.Es(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Es#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Es#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Es.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Es.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Es.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Es.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Es.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Es.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Es.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Fi {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Fi(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Fi build() {
          return new RegistrationCreateParams.CountryOptions.Fi(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Fi#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Fi#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Fi.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Fi.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Fi.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Fi.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Fi.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Fi.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Fi.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Fr {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Fr(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Fr build() {
          return new RegistrationCreateParams.CountryOptions.Fr(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Fr#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Fr#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Fr.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Fr.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Fr.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Fr.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Fr.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Fr.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Fr.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Gb {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Gb(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Gb build() {
          return new RegistrationCreateParams.CountryOptions.Gb(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Gb#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Gb#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Gb.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Gr {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Gr(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Gr build() {
          return new RegistrationCreateParams.CountryOptions.Gr(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Gr#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Gr#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Gr.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Gr.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Gr.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Gr.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Gr.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Gr.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Gr.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Hr {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Hr(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Hr build() {
          return new RegistrationCreateParams.CountryOptions.Hr(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Hr#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Hr#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Hr.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Hr.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Hr.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Hr.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Hr.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Hr.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Hr.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Hu {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Hu(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Hu build() {
          return new RegistrationCreateParams.CountryOptions.Hu(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Hu#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Hu#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Hu.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Hu.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Hu.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Hu.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Hu.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Hu.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Hu.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Id {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Id(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Id build() {
          return new RegistrationCreateParams.CountryOptions.Id(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Id#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Id#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Id.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Ie {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Ie(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Ie build() {
          return new RegistrationCreateParams.CountryOptions.Ie(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ie#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ie#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Ie.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Ie.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Ie.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Ie.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Ie.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Ie.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Ie.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Is {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Is(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Is build() {
          return new RegistrationCreateParams.CountryOptions.Is(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Is#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Is#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Is.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class It {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private It(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.It build() {
          return new RegistrationCreateParams.CountryOptions.It(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.It#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.It#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.It.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.It.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.It.Standard build() {
            return new RegistrationCreateParams.CountryOptions.It.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.It.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.It.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.It.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Jp {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Jp(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Jp build() {
          return new RegistrationCreateParams.CountryOptions.Jp(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Jp#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Jp#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Jp.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Kr {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Kr(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Kr build() {
          return new RegistrationCreateParams.CountryOptions.Kr(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Kr#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Kr#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Kr.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Lt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Lt(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Lt build() {
          return new RegistrationCreateParams.CountryOptions.Lt(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Lt#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Lt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Lt.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Lt.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Lt.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Lt.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Lt.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Lt.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Lt.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Lu {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Lu(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Lu build() {
          return new RegistrationCreateParams.CountryOptions.Lu(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Lu#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Lu#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Lu.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Lu.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Lu.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Lu.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Lu.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Lu.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Lu.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Lv {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Lv(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Lv build() {
          return new RegistrationCreateParams.CountryOptions.Lv(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Lv#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Lv#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Lv.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Lv.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Lv.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Lv.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Lv.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Lv.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Lv.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Mt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Mt(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Mt build() {
          return new RegistrationCreateParams.CountryOptions.Mt(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Mt#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Mt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Mt.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Mt.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Mt.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Mt.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Mt.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Mt.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Mt.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Mx {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Mx(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Mx build() {
          return new RegistrationCreateParams.CountryOptions.Mx(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Mx#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Mx#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Mx.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class My {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private My(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.My build() {
          return new RegistrationCreateParams.CountryOptions.My(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.My#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.My#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.My.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Nl {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Nl(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Nl build() {
          return new RegistrationCreateParams.CountryOptions.Nl(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Nl#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Nl#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Nl.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Nl.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Nl.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Nl.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Nl.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Nl.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Nl.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class No {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private No(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.No build() {
          return new RegistrationCreateParams.CountryOptions.No(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.No#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.No#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.No.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Nz {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Nz(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Nz build() {
          return new RegistrationCreateParams.CountryOptions.Nz(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Nz#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Nz#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Nz.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Pl {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Pl(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Pl build() {
          return new RegistrationCreateParams.CountryOptions.Pl(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Pl#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Pl#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Pl.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Pl.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Pl.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Pl.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Pl.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Pl.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Pl.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Pt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Pt(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Pt build() {
          return new RegistrationCreateParams.CountryOptions.Pt(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Pt#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Pt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Pt.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Pt.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Pt.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Pt.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Pt.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Pt.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Pt.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Ro {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Ro(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Ro build() {
          return new RegistrationCreateParams.CountryOptions.Ro(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ro#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ro#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Ro.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Ro.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Ro.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Ro.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Ro.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Ro.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Ro.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Sa {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Sa(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Sa build() {
          return new RegistrationCreateParams.CountryOptions.Sa(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sa#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sa#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Sa.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Se {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Se(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Se build() {
          return new RegistrationCreateParams.CountryOptions.Se(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Se#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Se#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Se.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Se.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Se.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Se.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Se.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Se.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Se.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Sg {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Sg(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Sg build() {
          return new RegistrationCreateParams.CountryOptions.Sg(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sg#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sg#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Sg.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Si {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Si(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Si build() {
          return new RegistrationCreateParams.CountryOptions.Si(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Si#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Si#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Si.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Si.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Si.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Si.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Si.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Si.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Si.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Sk {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the standard registration. */
      @SerializedName("standard")
      Standard standard;

      /** <strong>Required.</strong> Type of registration to be created in an EU country. */
      @SerializedName("type")
      Type type;

      private Sk(Map<String, Object> extraParams, Standard standard, Type type) {
        this.extraParams = extraParams;
        this.standard = standard;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Standard standard;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Sk build() {
          return new RegistrationCreateParams.CountryOptions.Sk(
              this.extraParams, this.standard, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sk#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sk#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the standard registration. */
        public Builder setStandard(RegistrationCreateParams.CountryOptions.Sk.Standard standard) {
          this.standard = standard;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in an EU country. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Sk.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Standard {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
         */
        @SerializedName("place_of_supply_scheme")
        PlaceOfSupplyScheme placeOfSupplyScheme;

        private Standard(Map<String, Object> extraParams, PlaceOfSupplyScheme placeOfSupplyScheme) {
          this.extraParams = extraParams;
          this.placeOfSupplyScheme = placeOfSupplyScheme;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PlaceOfSupplyScheme placeOfSupplyScheme;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Sk.Standard build() {
            return new RegistrationCreateParams.CountryOptions.Sk.Standard(
                this.extraParams, this.placeOfSupplyScheme);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Sk.Standard#extraParams} for
           * the field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Sk.Standard#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Place of supply scheme used in an EU standard registration.
           */
          public Builder setPlaceOfSupplyScheme(
              RegistrationCreateParams.CountryOptions.Sk.Standard.PlaceOfSupplyScheme
                  placeOfSupplyScheme) {
            this.placeOfSupplyScheme = placeOfSupplyScheme;
            return this;
          }
        }

        public enum PlaceOfSupplyScheme implements ApiRequestParams.EnumParam {
          @SerializedName("small_seller")
          SMALL_SELLER("small_seller"),

          @SerializedName("standard")
          STANDARD("standard");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PlaceOfSupplyScheme(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("ioss")
        IOSS("ioss"),

        @SerializedName("oss_non_union")
        OSS_NON_UNION("oss_non_union"),

        @SerializedName("oss_union")
        OSS_UNION("oss_union"),

        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Th {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Th(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Th build() {
          return new RegistrationCreateParams.CountryOptions.Th(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Th#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Th#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Th.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Tr {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Tr(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Tr build() {
          return new RegistrationCreateParams.CountryOptions.Tr(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Tr#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Tr#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Tr.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Us {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Options for the local amusement tax registration. */
      @SerializedName("local_amusement_tax")
      LocalAmusementTax localAmusementTax;

      /** Options for the local lease tax registration. */
      @SerializedName("local_lease_tax")
      LocalLeaseTax localLeaseTax;

      /**
       * <strong>Required.</strong> Two-letter US state code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
       */
      @SerializedName("state")
      String state;

      /** <strong>Required.</strong> Type of registration to be created in the US. */
      @SerializedName("type")
      Type type;

      private Us(
          Map<String, Object> extraParams,
          LocalAmusementTax localAmusementTax,
          LocalLeaseTax localLeaseTax,
          String state,
          Type type) {
        this.extraParams = extraParams;
        this.localAmusementTax = localAmusementTax;
        this.localLeaseTax = localLeaseTax;
        this.state = state;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private LocalAmusementTax localAmusementTax;

        private LocalLeaseTax localLeaseTax;

        private String state;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Us build() {
          return new RegistrationCreateParams.CountryOptions.Us(
              this.extraParams, this.localAmusementTax, this.localLeaseTax, this.state, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Us#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Us#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Options for the local amusement tax registration. */
        public Builder setLocalAmusementTax(
            RegistrationCreateParams.CountryOptions.Us.LocalAmusementTax localAmusementTax) {
          this.localAmusementTax = localAmusementTax;
          return this;
        }

        /** Options for the local lease tax registration. */
        public Builder setLocalLeaseTax(
            RegistrationCreateParams.CountryOptions.Us.LocalLeaseTax localLeaseTax) {
          this.localLeaseTax = localLeaseTax;
          return this;
        }

        /**
         * <strong>Required.</strong> Two-letter US state code (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in the US. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Us.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class LocalAmusementTax {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> A <a
         * href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
         * representing the local jurisdiction. Supported FIPS codes are: {@code 14000} (Chicago),
         * {@code 06613} (Bloomington), {@code 21696} (East Dundee), {@code 24582} (Evanston), and
         * {@code 68081} (Schiller Park).
         */
        @SerializedName("jurisdiction")
        String jurisdiction;

        private LocalAmusementTax(Map<String, Object> extraParams, String jurisdiction) {
          this.extraParams = extraParams;
          this.jurisdiction = jurisdiction;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String jurisdiction;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Us.LocalAmusementTax build() {
            return new RegistrationCreateParams.CountryOptions.Us.LocalAmusementTax(
                this.extraParams, this.jurisdiction);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RegistrationCreateParams.CountryOptions.Us.LocalAmusementTax#extraParams} for the field
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * RegistrationCreateParams.CountryOptions.Us.LocalAmusementTax#extraParams} for the field
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
           * <strong>Required.</strong> A <a
           * href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
           * representing the local jurisdiction. Supported FIPS codes are: {@code 14000} (Chicago),
           * {@code 06613} (Bloomington), {@code 21696} (East Dundee), {@code 24582} (Evanston), and
           * {@code 68081} (Schiller Park).
           */
          public Builder setJurisdiction(String jurisdiction) {
            this.jurisdiction = jurisdiction;
            return this;
          }
        }
      }

      @Getter
      public static class LocalLeaseTax {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * <strong>Required.</strong> A <a
         * href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
         * representing the local jurisdiction. Supported FIPS codes are: {@code 14000} (Chicago).
         */
        @SerializedName("jurisdiction")
        String jurisdiction;

        private LocalLeaseTax(Map<String, Object> extraParams, String jurisdiction) {
          this.extraParams = extraParams;
          this.jurisdiction = jurisdiction;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String jurisdiction;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Us.LocalLeaseTax build() {
            return new RegistrationCreateParams.CountryOptions.Us.LocalLeaseTax(
                this.extraParams, this.jurisdiction);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Us.LocalLeaseTax#extraParams}
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Us.LocalLeaseTax#extraParams}
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
           * <strong>Required.</strong> A <a
           * href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
           * representing the local jurisdiction. Supported FIPS codes are: {@code 14000} (Chicago).
           */
          public Builder setJurisdiction(String jurisdiction) {
            this.jurisdiction = jurisdiction;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("local_amusement_tax")
        LOCAL_AMUSEMENT_TAX("local_amusement_tax"),

        @SerializedName("local_lease_tax")
        LOCAL_LEASE_TAX("local_lease_tax"),

        @SerializedName("state_communications_tax")
        STATE_COMMUNICATIONS_TAX("state_communications_tax"),

        @SerializedName("state_sales_tax")
        STATE_SALES_TAX("state_sales_tax");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Vn {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Vn(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Vn build() {
          return new RegistrationCreateParams.CountryOptions.Vn(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Vn#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Vn#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Vn.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("simplified")
        SIMPLIFIED("simplified");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Za {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
      @SerializedName("type")
      Type type;

      private Za(Map<String, Object> extraParams, Type type) {
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Za build() {
          return new RegistrationCreateParams.CountryOptions.Za(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Za#extraParams} for the field
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Za#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in {@code country}. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Za.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("standard")
        STANDARD("standard");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  public enum ActiveFrom implements ApiRequestParams.EnumParam {
    @SerializedName("now")
    NOW("now");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ActiveFrom(String value) {
      this.value = value;
    }
  }
}
