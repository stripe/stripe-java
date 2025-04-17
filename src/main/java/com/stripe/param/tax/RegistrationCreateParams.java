// File generated from our OpenAPI spec
package com.stripe.param.tax;

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
public class RegistrationCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Time at which the Tax Registration becomes active. It can be either
   * {@code now} to indicate the current time, or a future timestamp measured in seconds since the
   * Unix epoch.
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
     * either {@code now} to indicate the current time, or a future timestamp measured in seconds
     * since the Unix epoch.
     */
    public Builder setActiveFrom(RegistrationCreateParams.ActiveFrom activeFrom) {
      this.activeFrom = activeFrom;
      return this;
    }

    /**
     * <strong>Required.</strong> Time at which the Tax Registration becomes active. It can be
     * either {@code now} to indicate the current time, or a future timestamp measured in seconds
     * since the Unix epoch.
     */
    public Builder setActiveFrom(Long activeFrom) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class CountryOptions {
    /** Options for the registration in AE. */
    @SerializedName("ae")
    Ae ae;

    /** Options for the registration in AL. */
    @SerializedName("al")
    Al al;

    /** Options for the registration in AM. */
    @SerializedName("am")
    Am am;

    /** Options for the registration in AO. */
    @SerializedName("ao")
    Ao ao;

    /** Options for the registration in AT. */
    @SerializedName("at")
    At at;

    /** Options for the registration in AU. */
    @SerializedName("au")
    Au au;

    /** Options for the registration in AW. */
    @SerializedName("aw")
    Aw aw;

    /** Options for the registration in AZ. */
    @SerializedName("az")
    Az az;

    /** Options for the registration in BA. */
    @SerializedName("ba")
    Ba ba;

    /** Options for the registration in BB. */
    @SerializedName("bb")
    Bb bb;

    /** Options for the registration in BD. */
    @SerializedName("bd")
    Bd bd;

    /** Options for the registration in BE. */
    @SerializedName("be")
    Be be;

    /** Options for the registration in BG. */
    @SerializedName("bg")
    Bg bg;

    /** Options for the registration in BH. */
    @SerializedName("bh")
    Bh bh;

    /** Options for the registration in BJ. */
    @SerializedName("bj")
    Bj bj;

    /** Options for the registration in BS. */
    @SerializedName("bs")
    Bs bs;

    /** Options for the registration in BY. */
    @SerializedName("by")
    By by;

    /** Options for the registration in CA. */
    @SerializedName("ca")
    Ca ca;

    /** Options for the registration in CD. */
    @SerializedName("cd")
    Cd cd;

    /** Options for the registration in CH. */
    @SerializedName("ch")
    Ch ch;

    /** Options for the registration in CL. */
    @SerializedName("cl")
    Cl cl;

    /** Options for the registration in CO. */
    @SerializedName("co")
    Co co;

    /** Options for the registration in CR. */
    @SerializedName("cr")
    Cr cr;

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

    /** Options for the registration in EC. */
    @SerializedName("ec")
    Ec ec;

    /** Options for the registration in EE. */
    @SerializedName("ee")
    Ee ee;

    /** Options for the registration in EG. */
    @SerializedName("eg")
    Eg eg;

    /** Options for the registration in ES. */
    @SerializedName("es")
    Es es;

    /** Options for the registration in ET. */
    @SerializedName("et")
    Et et;

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

    /** Options for the registration in GE. */
    @SerializedName("ge")
    Ge ge;

    /** Options for the registration in GN. */
    @SerializedName("gn")
    Gn gn;

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

    /** Options for the registration in IN. */
    @SerializedName("in")
    In in;

    /** Options for the registration in IS. */
    @SerializedName("is")
    Is is;

    /** Options for the registration in IT. */
    @SerializedName("it")
    It it;

    /** Options for the registration in JP. */
    @SerializedName("jp")
    Jp jp;

    /** Options for the registration in KE. */
    @SerializedName("ke")
    Ke ke;

    /** Options for the registration in KG. */
    @SerializedName("kg")
    Kg kg;

    /** Options for the registration in KH. */
    @SerializedName("kh")
    Kh kh;

    /** Options for the registration in KR. */
    @SerializedName("kr")
    Kr kr;

    /** Options for the registration in KZ. */
    @SerializedName("kz")
    Kz kz;

    /** Options for the registration in LA. */
    @SerializedName("la")
    La la;

    /** Options for the registration in LT. */
    @SerializedName("lt")
    Lt lt;

    /** Options for the registration in LU. */
    @SerializedName("lu")
    Lu lu;

    /** Options for the registration in LV. */
    @SerializedName("lv")
    Lv lv;

    /** Options for the registration in MA. */
    @SerializedName("ma")
    Ma ma;

    /** Options for the registration in MD. */
    @SerializedName("md")
    Md md;

    /** Options for the registration in ME. */
    @SerializedName("me")
    Me me;

    /** Options for the registration in MK. */
    @SerializedName("mk")
    Mk mk;

    /** Options for the registration in MR. */
    @SerializedName("mr")
    Mr mr;

    /** Options for the registration in MT. */
    @SerializedName("mt")
    Mt mt;

    /** Options for the registration in MX. */
    @SerializedName("mx")
    Mx mx;

    /** Options for the registration in MY. */
    @SerializedName("my")
    My my;

    /** Options for the registration in NG. */
    @SerializedName("ng")
    Ng ng;

    /** Options for the registration in NL. */
    @SerializedName("nl")
    Nl nl;

    /** Options for the registration in NO. */
    @SerializedName("no")
    No no;

    /** Options for the registration in NP. */
    @SerializedName("np")
    Np np;

    /** Options for the registration in NZ. */
    @SerializedName("nz")
    Nz nz;

    /** Options for the registration in OM. */
    @SerializedName("om")
    Om om;

    /** Options for the registration in PE. */
    @SerializedName("pe")
    Pe pe;

    /** Options for the registration in PH. */
    @SerializedName("ph")
    Ph ph;

    /** Options for the registration in PL. */
    @SerializedName("pl")
    Pl pl;

    /** Options for the registration in PT. */
    @SerializedName("pt")
    Pt pt;

    /** Options for the registration in RO. */
    @SerializedName("ro")
    Ro ro;

    /** Options for the registration in RS. */
    @SerializedName("rs")
    Rs rs;

    /** Options for the registration in RU. */
    @SerializedName("ru")
    Ru ru;

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

    /** Options for the registration in SN. */
    @SerializedName("sn")
    Sn sn;

    /** Options for the registration in SR. */
    @SerializedName("sr")
    Sr sr;

    /** Options for the registration in TH. */
    @SerializedName("th")
    Th th;

    /** Options for the registration in TJ. */
    @SerializedName("tj")
    Tj tj;

    /** Options for the registration in TR. */
    @SerializedName("tr")
    Tr tr;

    /** Options for the registration in TZ. */
    @SerializedName("tz")
    Tz tz;

    /** Options for the registration in UG. */
    @SerializedName("ug")
    Ug ug;

    /** Options for the registration in US. */
    @SerializedName("us")
    Us us;

    /** Options for the registration in UY. */
    @SerializedName("uy")
    Uy uy;

    /** Options for the registration in UZ. */
    @SerializedName("uz")
    Uz uz;

    /** Options for the registration in VN. */
    @SerializedName("vn")
    Vn vn;

    /** Options for the registration in ZA. */
    @SerializedName("za")
    Za za;

    /** Options for the registration in ZM. */
    @SerializedName("zm")
    Zm zm;

    /** Options for the registration in ZW. */
    @SerializedName("zw")
    Zw zw;

    private CountryOptions(
        Ae ae,
        Al al,
        Am am,
        Ao ao,
        At at,
        Au au,
        Aw aw,
        Az az,
        Ba ba,
        Bb bb,
        Bd bd,
        Be be,
        Bg bg,
        Bh bh,
        Bj bj,
        Bs bs,
        By by,
        Ca ca,
        Cd cd,
        Ch ch,
        Cl cl,
        Co co,
        Cr cr,
        Cy cy,
        Cz cz,
        De de,
        Dk dk,
        Ec ec,
        Ee ee,
        Eg eg,
        Es es,
        Et et,
        Map<String, Object> extraParams,
        Fi fi,
        Fr fr,
        Gb gb,
        Ge ge,
        Gn gn,
        Gr gr,
        Hr hr,
        Hu hu,
        Id id,
        Ie ie,
        In in,
        Is is,
        It it,
        Jp jp,
        Ke ke,
        Kg kg,
        Kh kh,
        Kr kr,
        Kz kz,
        La la,
        Lt lt,
        Lu lu,
        Lv lv,
        Ma ma,
        Md md,
        Me me,
        Mk mk,
        Mr mr,
        Mt mt,
        Mx mx,
        My my,
        Ng ng,
        Nl nl,
        No no,
        Np np,
        Nz nz,
        Om om,
        Pe pe,
        Ph ph,
        Pl pl,
        Pt pt,
        Ro ro,
        Rs rs,
        Ru ru,
        Sa sa,
        Se se,
        Sg sg,
        Si si,
        Sk sk,
        Sn sn,
        Sr sr,
        Th th,
        Tj tj,
        Tr tr,
        Tz tz,
        Ug ug,
        Us us,
        Uy uy,
        Uz uz,
        Vn vn,
        Za za,
        Zm zm,
        Zw zw) {
      this.ae = ae;
      this.al = al;
      this.am = am;
      this.ao = ao;
      this.at = at;
      this.au = au;
      this.aw = aw;
      this.az = az;
      this.ba = ba;
      this.bb = bb;
      this.bd = bd;
      this.be = be;
      this.bg = bg;
      this.bh = bh;
      this.bj = bj;
      this.bs = bs;
      this.by = by;
      this.ca = ca;
      this.cd = cd;
      this.ch = ch;
      this.cl = cl;
      this.co = co;
      this.cr = cr;
      this.cy = cy;
      this.cz = cz;
      this.de = de;
      this.dk = dk;
      this.ec = ec;
      this.ee = ee;
      this.eg = eg;
      this.es = es;
      this.et = et;
      this.extraParams = extraParams;
      this.fi = fi;
      this.fr = fr;
      this.gb = gb;
      this.ge = ge;
      this.gn = gn;
      this.gr = gr;
      this.hr = hr;
      this.hu = hu;
      this.id = id;
      this.ie = ie;
      this.in = in;
      this.is = is;
      this.it = it;
      this.jp = jp;
      this.ke = ke;
      this.kg = kg;
      this.kh = kh;
      this.kr = kr;
      this.kz = kz;
      this.la = la;
      this.lt = lt;
      this.lu = lu;
      this.lv = lv;
      this.ma = ma;
      this.md = md;
      this.me = me;
      this.mk = mk;
      this.mr = mr;
      this.mt = mt;
      this.mx = mx;
      this.my = my;
      this.ng = ng;
      this.nl = nl;
      this.no = no;
      this.np = np;
      this.nz = nz;
      this.om = om;
      this.pe = pe;
      this.ph = ph;
      this.pl = pl;
      this.pt = pt;
      this.ro = ro;
      this.rs = rs;
      this.ru = ru;
      this.sa = sa;
      this.se = se;
      this.sg = sg;
      this.si = si;
      this.sk = sk;
      this.sn = sn;
      this.sr = sr;
      this.th = th;
      this.tj = tj;
      this.tr = tr;
      this.tz = tz;
      this.ug = ug;
      this.us = us;
      this.uy = uy;
      this.uz = uz;
      this.vn = vn;
      this.za = za;
      this.zm = zm;
      this.zw = zw;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Ae ae;

      private Al al;

      private Am am;

      private Ao ao;

      private At at;

      private Au au;

      private Aw aw;

      private Az az;

      private Ba ba;

      private Bb bb;

      private Bd bd;

      private Be be;

      private Bg bg;

      private Bh bh;

      private Bj bj;

      private Bs bs;

      private By by;

      private Ca ca;

      private Cd cd;

      private Ch ch;

      private Cl cl;

      private Co co;

      private Cr cr;

      private Cy cy;

      private Cz cz;

      private De de;

      private Dk dk;

      private Ec ec;

      private Ee ee;

      private Eg eg;

      private Es es;

      private Et et;

      private Map<String, Object> extraParams;

      private Fi fi;

      private Fr fr;

      private Gb gb;

      private Ge ge;

      private Gn gn;

      private Gr gr;

      private Hr hr;

      private Hu hu;

      private Id id;

      private Ie ie;

      private In in;

      private Is is;

      private It it;

      private Jp jp;

      private Ke ke;

      private Kg kg;

      private Kh kh;

      private Kr kr;

      private Kz kz;

      private La la;

      private Lt lt;

      private Lu lu;

      private Lv lv;

      private Ma ma;

      private Md md;

      private Me me;

      private Mk mk;

      private Mr mr;

      private Mt mt;

      private Mx mx;

      private My my;

      private Ng ng;

      private Nl nl;

      private No no;

      private Np np;

      private Nz nz;

      private Om om;

      private Pe pe;

      private Ph ph;

      private Pl pl;

      private Pt pt;

      private Ro ro;

      private Rs rs;

      private Ru ru;

      private Sa sa;

      private Se se;

      private Sg sg;

      private Si si;

      private Sk sk;

      private Sn sn;

      private Sr sr;

      private Th th;

      private Tj tj;

      private Tr tr;

      private Tz tz;

      private Ug ug;

      private Us us;

      private Uy uy;

      private Uz uz;

      private Vn vn;

      private Za za;

      private Zm zm;

      private Zw zw;

      /** Finalize and obtain parameter instance from this builder. */
      public RegistrationCreateParams.CountryOptions build() {
        return new RegistrationCreateParams.CountryOptions(
            this.ae,
            this.al,
            this.am,
            this.ao,
            this.at,
            this.au,
            this.aw,
            this.az,
            this.ba,
            this.bb,
            this.bd,
            this.be,
            this.bg,
            this.bh,
            this.bj,
            this.bs,
            this.by,
            this.ca,
            this.cd,
            this.ch,
            this.cl,
            this.co,
            this.cr,
            this.cy,
            this.cz,
            this.de,
            this.dk,
            this.ec,
            this.ee,
            this.eg,
            this.es,
            this.et,
            this.extraParams,
            this.fi,
            this.fr,
            this.gb,
            this.ge,
            this.gn,
            this.gr,
            this.hr,
            this.hu,
            this.id,
            this.ie,
            this.in,
            this.is,
            this.it,
            this.jp,
            this.ke,
            this.kg,
            this.kh,
            this.kr,
            this.kz,
            this.la,
            this.lt,
            this.lu,
            this.lv,
            this.ma,
            this.md,
            this.me,
            this.mk,
            this.mr,
            this.mt,
            this.mx,
            this.my,
            this.ng,
            this.nl,
            this.no,
            this.np,
            this.nz,
            this.om,
            this.pe,
            this.ph,
            this.pl,
            this.pt,
            this.ro,
            this.rs,
            this.ru,
            this.sa,
            this.se,
            this.sg,
            this.si,
            this.sk,
            this.sn,
            this.sr,
            this.th,
            this.tj,
            this.tr,
            this.tz,
            this.ug,
            this.us,
            this.uy,
            this.uz,
            this.vn,
            this.za,
            this.zm,
            this.zw);
      }

      /** Options for the registration in AE. */
      public Builder setAe(RegistrationCreateParams.CountryOptions.Ae ae) {
        this.ae = ae;
        return this;
      }

      /** Options for the registration in AL. */
      public Builder setAl(RegistrationCreateParams.CountryOptions.Al al) {
        this.al = al;
        return this;
      }

      /** Options for the registration in AM. */
      public Builder setAm(RegistrationCreateParams.CountryOptions.Am am) {
        this.am = am;
        return this;
      }

      /** Options for the registration in AO. */
      public Builder setAo(RegistrationCreateParams.CountryOptions.Ao ao) {
        this.ao = ao;
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

      /** Options for the registration in AW. */
      public Builder setAw(RegistrationCreateParams.CountryOptions.Aw aw) {
        this.aw = aw;
        return this;
      }

      /** Options for the registration in AZ. */
      public Builder setAz(RegistrationCreateParams.CountryOptions.Az az) {
        this.az = az;
        return this;
      }

      /** Options for the registration in BA. */
      public Builder setBa(RegistrationCreateParams.CountryOptions.Ba ba) {
        this.ba = ba;
        return this;
      }

      /** Options for the registration in BB. */
      public Builder setBb(RegistrationCreateParams.CountryOptions.Bb bb) {
        this.bb = bb;
        return this;
      }

      /** Options for the registration in BD. */
      public Builder setBd(RegistrationCreateParams.CountryOptions.Bd bd) {
        this.bd = bd;
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

      /** Options for the registration in BH. */
      public Builder setBh(RegistrationCreateParams.CountryOptions.Bh bh) {
        this.bh = bh;
        return this;
      }

      /** Options for the registration in BJ. */
      public Builder setBj(RegistrationCreateParams.CountryOptions.Bj bj) {
        this.bj = bj;
        return this;
      }

      /** Options for the registration in BS. */
      public Builder setBs(RegistrationCreateParams.CountryOptions.Bs bs) {
        this.bs = bs;
        return this;
      }

      /** Options for the registration in BY. */
      public Builder setBy(RegistrationCreateParams.CountryOptions.By by) {
        this.by = by;
        return this;
      }

      /** Options for the registration in CA. */
      public Builder setCa(RegistrationCreateParams.CountryOptions.Ca ca) {
        this.ca = ca;
        return this;
      }

      /** Options for the registration in CD. */
      public Builder setCd(RegistrationCreateParams.CountryOptions.Cd cd) {
        this.cd = cd;
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

      /** Options for the registration in CR. */
      public Builder setCr(RegistrationCreateParams.CountryOptions.Cr cr) {
        this.cr = cr;
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

      /** Options for the registration in EC. */
      public Builder setEc(RegistrationCreateParams.CountryOptions.Ec ec) {
        this.ec = ec;
        return this;
      }

      /** Options for the registration in EE. */
      public Builder setEe(RegistrationCreateParams.CountryOptions.Ee ee) {
        this.ee = ee;
        return this;
      }

      /** Options for the registration in EG. */
      public Builder setEg(RegistrationCreateParams.CountryOptions.Eg eg) {
        this.eg = eg;
        return this;
      }

      /** Options for the registration in ES. */
      public Builder setEs(RegistrationCreateParams.CountryOptions.Es es) {
        this.es = es;
        return this;
      }

      /** Options for the registration in ET. */
      public Builder setEt(RegistrationCreateParams.CountryOptions.Et et) {
        this.et = et;
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

      /** Options for the registration in GE. */
      public Builder setGe(RegistrationCreateParams.CountryOptions.Ge ge) {
        this.ge = ge;
        return this;
      }

      /** Options for the registration in GN. */
      public Builder setGn(RegistrationCreateParams.CountryOptions.Gn gn) {
        this.gn = gn;
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

      /** Options for the registration in IN. */
      public Builder setIn(RegistrationCreateParams.CountryOptions.In in) {
        this.in = in;
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

      /** Options for the registration in KE. */
      public Builder setKe(RegistrationCreateParams.CountryOptions.Ke ke) {
        this.ke = ke;
        return this;
      }

      /** Options for the registration in KG. */
      public Builder setKg(RegistrationCreateParams.CountryOptions.Kg kg) {
        this.kg = kg;
        return this;
      }

      /** Options for the registration in KH. */
      public Builder setKh(RegistrationCreateParams.CountryOptions.Kh kh) {
        this.kh = kh;
        return this;
      }

      /** Options for the registration in KR. */
      public Builder setKr(RegistrationCreateParams.CountryOptions.Kr kr) {
        this.kr = kr;
        return this;
      }

      /** Options for the registration in KZ. */
      public Builder setKz(RegistrationCreateParams.CountryOptions.Kz kz) {
        this.kz = kz;
        return this;
      }

      /** Options for the registration in LA. */
      public Builder setLa(RegistrationCreateParams.CountryOptions.La la) {
        this.la = la;
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

      /** Options for the registration in MA. */
      public Builder setMa(RegistrationCreateParams.CountryOptions.Ma ma) {
        this.ma = ma;
        return this;
      }

      /** Options for the registration in MD. */
      public Builder setMd(RegistrationCreateParams.CountryOptions.Md md) {
        this.md = md;
        return this;
      }

      /** Options for the registration in ME. */
      public Builder setMe(RegistrationCreateParams.CountryOptions.Me me) {
        this.me = me;
        return this;
      }

      /** Options for the registration in MK. */
      public Builder setMk(RegistrationCreateParams.CountryOptions.Mk mk) {
        this.mk = mk;
        return this;
      }

      /** Options for the registration in MR. */
      public Builder setMr(RegistrationCreateParams.CountryOptions.Mr mr) {
        this.mr = mr;
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

      /** Options for the registration in NG. */
      public Builder setNg(RegistrationCreateParams.CountryOptions.Ng ng) {
        this.ng = ng;
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

      /** Options for the registration in NP. */
      public Builder setNp(RegistrationCreateParams.CountryOptions.Np np) {
        this.np = np;
        return this;
      }

      /** Options for the registration in NZ. */
      public Builder setNz(RegistrationCreateParams.CountryOptions.Nz nz) {
        this.nz = nz;
        return this;
      }

      /** Options for the registration in OM. */
      public Builder setOm(RegistrationCreateParams.CountryOptions.Om om) {
        this.om = om;
        return this;
      }

      /** Options for the registration in PE. */
      public Builder setPe(RegistrationCreateParams.CountryOptions.Pe pe) {
        this.pe = pe;
        return this;
      }

      /** Options for the registration in PH. */
      public Builder setPh(RegistrationCreateParams.CountryOptions.Ph ph) {
        this.ph = ph;
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

      /** Options for the registration in RS. */
      public Builder setRs(RegistrationCreateParams.CountryOptions.Rs rs) {
        this.rs = rs;
        return this;
      }

      /** Options for the registration in RU. */
      public Builder setRu(RegistrationCreateParams.CountryOptions.Ru ru) {
        this.ru = ru;
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

      /** Options for the registration in SN. */
      public Builder setSn(RegistrationCreateParams.CountryOptions.Sn sn) {
        this.sn = sn;
        return this;
      }

      /** Options for the registration in SR. */
      public Builder setSr(RegistrationCreateParams.CountryOptions.Sr sr) {
        this.sr = sr;
        return this;
      }

      /** Options for the registration in TH. */
      public Builder setTh(RegistrationCreateParams.CountryOptions.Th th) {
        this.th = th;
        return this;
      }

      /** Options for the registration in TJ. */
      public Builder setTj(RegistrationCreateParams.CountryOptions.Tj tj) {
        this.tj = tj;
        return this;
      }

      /** Options for the registration in TR. */
      public Builder setTr(RegistrationCreateParams.CountryOptions.Tr tr) {
        this.tr = tr;
        return this;
      }

      /** Options for the registration in TZ. */
      public Builder setTz(RegistrationCreateParams.CountryOptions.Tz tz) {
        this.tz = tz;
        return this;
      }

      /** Options for the registration in UG. */
      public Builder setUg(RegistrationCreateParams.CountryOptions.Ug ug) {
        this.ug = ug;
        return this;
      }

      /** Options for the registration in US. */
      public Builder setUs(RegistrationCreateParams.CountryOptions.Us us) {
        this.us = us;
        return this;
      }

      /** Options for the registration in UY. */
      public Builder setUy(RegistrationCreateParams.CountryOptions.Uy uy) {
        this.uy = uy;
        return this;
      }

      /** Options for the registration in UZ. */
      public Builder setUz(RegistrationCreateParams.CountryOptions.Uz uz) {
        this.uz = uz;
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

      /** Options for the registration in ZM. */
      public Builder setZm(RegistrationCreateParams.CountryOptions.Zm zm) {
        this.zm = zm;
        return this;
      }

      /** Options for the registration in ZW. */
      public Builder setZw(RegistrationCreateParams.CountryOptions.Zw zw) {
        this.zw = zw;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Al {
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

      private Al(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Al build() {
          return new RegistrationCreateParams.CountryOptions.Al(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Al#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Al#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Al.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Am {
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

      private Am(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Am build() {
          return new RegistrationCreateParams.CountryOptions.Am(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Am#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Am#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Am.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ao {
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

      private Ao(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ao build() {
          return new RegistrationCreateParams.CountryOptions.Ao(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ao#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ao#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ao.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Aw {
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

      private Aw(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Aw build() {
          return new RegistrationCreateParams.CountryOptions.Aw(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Aw#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Aw#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Aw.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Az {
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

      private Az(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Az build() {
          return new RegistrationCreateParams.CountryOptions.Az(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Az#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Az#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Az.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ba {
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

      private Ba(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ba build() {
          return new RegistrationCreateParams.CountryOptions.Ba(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ba#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ba#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ba.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Bb {
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

      private Bb(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Bb build() {
          return new RegistrationCreateParams.CountryOptions.Bb(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Bb#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Bb#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Bb.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Bd {
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

      private Bd(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Bd build() {
          return new RegistrationCreateParams.CountryOptions.Bd(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Bd#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Bd#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Bd.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Bh {
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

      private Bh(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Bh build() {
          return new RegistrationCreateParams.CountryOptions.Bh(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Bh#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Bh#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Bh.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Bj {
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

      private Bj(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Bj build() {
          return new RegistrationCreateParams.CountryOptions.Bj(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Bj#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Bj#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Bj.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Bs {
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

      private Bs(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Bs build() {
          return new RegistrationCreateParams.CountryOptions.Bs(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Bs#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Bs#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Bs.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class By {
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

      private By(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.By build() {
          return new RegistrationCreateParams.CountryOptions.By(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.By#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.By#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.By.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Cd {
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

      private Cd(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Cd build() {
          return new RegistrationCreateParams.CountryOptions.Cd(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cd#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Cd#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Cd.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Cr {
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

      private Cr(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Cr build() {
          return new RegistrationCreateParams.CountryOptions.Cr(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Cr#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Cr#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Cr.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ec {
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

      private Ec(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ec build() {
          return new RegistrationCreateParams.CountryOptions.Ec(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ec#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ec#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ec.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Eg {
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

      private Eg(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Eg build() {
          return new RegistrationCreateParams.CountryOptions.Eg(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Eg#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Eg#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Eg.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Et {
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

      private Et(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Et build() {
          return new RegistrationCreateParams.CountryOptions.Et(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Et#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Et#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Et.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ge {
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

      private Ge(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ge build() {
          return new RegistrationCreateParams.CountryOptions.Ge(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ge#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ge#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ge.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Gn {
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

      private Gn(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Gn build() {
          return new RegistrationCreateParams.CountryOptions.Gn(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Gn#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Gn#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Gn.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class In {
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

      private In(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.In build() {
          return new RegistrationCreateParams.CountryOptions.In(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.In#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.In#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.In.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ke {
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

      private Ke(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ke build() {
          return new RegistrationCreateParams.CountryOptions.Ke(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ke#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ke#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ke.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Kg {
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

      private Kg(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Kg build() {
          return new RegistrationCreateParams.CountryOptions.Kg(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Kg#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Kg#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Kg.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Kh {
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

      private Kh(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Kh build() {
          return new RegistrationCreateParams.CountryOptions.Kh(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Kh#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Kh#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Kh.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Kz {
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

      private Kz(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Kz build() {
          return new RegistrationCreateParams.CountryOptions.Kz(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Kz#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Kz#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Kz.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class La {
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

      private La(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.La build() {
          return new RegistrationCreateParams.CountryOptions.La(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.La#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.La#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.La.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ma {
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

      private Ma(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ma build() {
          return new RegistrationCreateParams.CountryOptions.Ma(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ma#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ma#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ma.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Md {
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

      private Md(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Md build() {
          return new RegistrationCreateParams.CountryOptions.Md(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Md#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Md#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Md.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Me {
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

      private Me(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Me build() {
          return new RegistrationCreateParams.CountryOptions.Me(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Me#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Me#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Me.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Mk {
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

      private Mk(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Mk build() {
          return new RegistrationCreateParams.CountryOptions.Mk(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Mk#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Mk#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Mk.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Mr {
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

      private Mr(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Mr build() {
          return new RegistrationCreateParams.CountryOptions.Mr(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Mr#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Mr#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Mr.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ng {
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

      private Ng(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ng build() {
          return new RegistrationCreateParams.CountryOptions.Ng(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ng#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ng#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ng.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Np {
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

      private Np(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Np build() {
          return new RegistrationCreateParams.CountryOptions.Np(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Np#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Np#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Np.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Om {
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

      private Om(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Om build() {
          return new RegistrationCreateParams.CountryOptions.Om(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Om#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Om#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Om.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Pe {
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

      private Pe(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Pe build() {
          return new RegistrationCreateParams.CountryOptions.Pe(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Pe#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Pe#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Pe.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ph {
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

      private Ph(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ph build() {
          return new RegistrationCreateParams.CountryOptions.Ph(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ph#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ph#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ph.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Rs {
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

      private Rs(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Rs build() {
          return new RegistrationCreateParams.CountryOptions.Rs(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Rs#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Rs#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Rs.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ru {
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

      private Ru(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ru build() {
          return new RegistrationCreateParams.CountryOptions.Ru(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ru#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ru#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ru.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Sn {
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

      private Sn(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Sn build() {
          return new RegistrationCreateParams.CountryOptions.Sn(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sn#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Sn#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Sn.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Sr {
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

      private Sr(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Sr build() {
          return new RegistrationCreateParams.CountryOptions.Sr(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Sr#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Sr#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Sr.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Tj {
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

      private Tj(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Tj build() {
          return new RegistrationCreateParams.CountryOptions.Tj(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Tj#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Tj#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Tj.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class Tz {
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

      private Tz(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Tz build() {
          return new RegistrationCreateParams.CountryOptions.Tz(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Tz#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Tz#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Tz.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Ug {
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

      private Ug(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Ug build() {
          return new RegistrationCreateParams.CountryOptions.Ug(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Ug#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Ug#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Ug.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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

      /** Options for the state sales tax registration. */
      @SerializedName("state_sales_tax")
      StateSalesTax stateSalesTax;

      /** <strong>Required.</strong> Type of registration to be created in the US. */
      @SerializedName("type")
      Type type;

      private Us(
          Map<String, Object> extraParams,
          LocalAmusementTax localAmusementTax,
          LocalLeaseTax localLeaseTax,
          String state,
          StateSalesTax stateSalesTax,
          Type type) {
        this.extraParams = extraParams;
        this.localAmusementTax = localAmusementTax;
        this.localLeaseTax = localLeaseTax;
        this.state = state;
        this.stateSalesTax = stateSalesTax;
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

        private StateSalesTax stateSalesTax;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public RegistrationCreateParams.CountryOptions.Us build() {
          return new RegistrationCreateParams.CountryOptions.Us(
              this.extraParams,
              this.localAmusementTax,
              this.localLeaseTax,
              this.state,
              this.stateSalesTax,
              this.type);
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

        /** Options for the state sales tax registration. */
        public Builder setStateSalesTax(
            RegistrationCreateParams.CountryOptions.Us.StateSalesTax stateSalesTax) {
          this.stateSalesTax = stateSalesTax;
          return this;
        }

        /** <strong>Required.</strong> Type of registration to be created in the US. */
        public Builder setType(RegistrationCreateParams.CountryOptions.Us.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
         * {@code 06613} (Bloomington), {@code 21696} (East Dundee), {@code 24582} (Evanston),
         * {@code 45421} (Lynwood), {@code 64343} (River Grove), and {@code 68081} (Schiller Park).
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
           * {@code 06613} (Bloomington), {@code 21696} (East Dundee), {@code 24582} (Evanston),
           * {@code 45421} (Lynwood), {@code 64343} (River Grove), and {@code 68081} (Schiller
           * Park).
           */
          public Builder setJurisdiction(String jurisdiction) {
            this.jurisdiction = jurisdiction;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class StateSalesTax {
        /** <strong>Required.</strong> Elections for the state sales tax registration. */
        @SerializedName("elections")
        List<RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election> elections;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private StateSalesTax(
            List<RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election> elections,
            Map<String, Object> extraParams) {
          this.elections = elections;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election> elections;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public RegistrationCreateParams.CountryOptions.Us.StateSalesTax build() {
            return new RegistrationCreateParams.CountryOptions.Us.StateSalesTax(
                this.elections, this.extraParams);
          }

          /**
           * Add an element to `elections` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * RegistrationCreateParams.CountryOptions.Us.StateSalesTax#elections} for the field
           * documentation.
           */
          public Builder addElection(
              RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election element) {
            if (this.elections == null) {
              this.elections = new ArrayList<>();
            }
            this.elections.add(element);
            return this;
          }

          /**
           * Add all elements to `elections` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * RegistrationCreateParams.CountryOptions.Us.StateSalesTax#elections} for the field
           * documentation.
           */
          public Builder addAllElection(
              List<RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election> elements) {
            if (this.elections == null) {
              this.elections = new ArrayList<>();
            }
            this.elections.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RegistrationCreateParams.CountryOptions.Us.StateSalesTax#extraParams}
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
           * map. See {@link RegistrationCreateParams.CountryOptions.Us.StateSalesTax#extraParams}
           * for the field documentation.
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
        @EqualsAndHashCode(callSuper = false)
        public static class Election {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * A <a href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS code</a>
           * representing the local jurisdiction. Supported FIPS codes are: {@code 003} (Allegheny
           * County) and {@code 60000} (Philadelphia City).
           */
          @SerializedName("jurisdiction")
          String jurisdiction;

          /**
           * <strong>Required.</strong> The type of the election for the state sales tax
           * registration.
           */
          @SerializedName("type")
          Type type;

          private Election(Map<String, Object> extraParams, String jurisdiction, Type type) {
            this.extraParams = extraParams;
            this.jurisdiction = jurisdiction;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String jurisdiction;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election build() {
              return new RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election(
                  this.extraParams, this.jurisdiction, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election#extraParams} for
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
             * A <a href="https://www.census.gov/library/reference/code-lists/ansi.html">FIPS
             * code</a> representing the local jurisdiction. Supported FIPS codes are: {@code 003}
             * (Allegheny County) and {@code 60000} (Philadelphia City).
             */
            public Builder setJurisdiction(String jurisdiction) {
              this.jurisdiction = jurisdiction;
              return this;
            }

            /**
             * <strong>Required.</strong> The type of the election for the state sales tax
             * registration.
             */
            public Builder setType(
                RegistrationCreateParams.CountryOptions.Us.StateSalesTax.Election.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("local_use_tax")
            LOCAL_USE_TAX("local_use_tax"),

            @SerializedName("simplified_sellers_use_tax")
            SIMPLIFIED_SELLERS_USE_TAX("simplified_sellers_use_tax"),

            @SerializedName("single_local_use_tax")
            SINGLE_LOCAL_USE_TAX("single_local_use_tax");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
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

        @SerializedName("state_retail_delivery_fee")
        STATE_RETAIL_DELIVERY_FEE("state_retail_delivery_fee"),

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
    @EqualsAndHashCode(callSuper = false)
    public static class Uy {
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

      private Uy(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Uy build() {
          return new RegistrationCreateParams.CountryOptions.Uy(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Uy#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Uy#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Uy.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Uz {
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

      private Uz(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Uz build() {
          return new RegistrationCreateParams.CountryOptions.Uz(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Uz#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Uz#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Uz.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Zm {
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

      private Zm(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Zm build() {
          return new RegistrationCreateParams.CountryOptions.Zm(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Zm#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Zm#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Zm.Type type) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Zw {
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

      private Zw(Map<String, Object> extraParams, Type type) {
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
        public RegistrationCreateParams.CountryOptions.Zw build() {
          return new RegistrationCreateParams.CountryOptions.Zw(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RegistrationCreateParams.CountryOptions.Zw#extraParams} for the field
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
         * map. See {@link RegistrationCreateParams.CountryOptions.Zw#extraParams} for the field
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
        public Builder setType(RegistrationCreateParams.CountryOptions.Zw.Type type) {
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
