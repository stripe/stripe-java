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
public class FormListParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The payee whose volume is represented on the tax form. */
  @SerializedName("payee")
  Payee payee;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /**
   * An optional filter on the list, based on the object {@code type} field. Without the filter, the
   * list includes all current and future tax form types. If your integration expects only one type
   * of tax form in the response, make sure to provide a type value in the request.
   */
  @SerializedName("type")
  Type type;

  private FormListParams(
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      Payee payee,
      String startingAfter,
      Type type) {
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.payee = payee;
    this.startingAfter = startingAfter;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private Payee payee;

    private String startingAfter;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public FormListParams build() {
      return new FormListParams(
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.payee,
          this.startingAfter,
          this.type);
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
     * FormListParams#expand} for the field documentation.
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
     * FormListParams#expand} for the field documentation.
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
     * FormListParams#extraParams} for the field documentation.
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
     * See {@link FormListParams#extraParams} for the field documentation.
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

    /** <strong>Required.</strong> The payee whose volume is represented on the tax form. */
    public Builder setPayee(FormListParams.Payee payee) {
      this.payee = payee;
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

    /**
     * An optional filter on the list, based on the object {@code type} field. Without the filter,
     * the list includes all current and future tax form types. If your integration expects only one
     * type of tax form in the response, make sure to provide a type value in the request.
     */
    public Builder setType(FormListParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  public static class Payee {
    /** The ID of the Stripe account whose forms will be retrieved. */
    @SerializedName("account")
    String account;

    /** The external reference to the payee whose forms will be retrieved. */
    @SerializedName("external_reference")
    String externalReference;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Specifies the payee type. Either {@code account} or {@code external_reference}. */
    @SerializedName("type")
    Type type;

    private Payee(
        String account, String externalReference, Map<String, Object> extraParams, Type type) {
      this.account = account;
      this.externalReference = externalReference;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private String externalReference;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public FormListParams.Payee build() {
        return new FormListParams.Payee(
            this.account, this.externalReference, this.extraParams, this.type);
      }

      /** The ID of the Stripe account whose forms will be retrieved. */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /** The external reference to the payee whose forms will be retrieved. */
      public Builder setExternalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * FormListParams.Payee#extraParams} for the field documentation.
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
       * See {@link FormListParams.Payee#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Specifies the payee type. Either {@code account} or {@code external_reference}. */
      public Builder setType(FormListParams.Payee.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("account")
      ACCOUNT("account"),

      @SerializedName("external_reference")
      EXTERNAL_REFERENCE("external_reference");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("au_serr")
    AU_SERR("au_serr"),

    @SerializedName("ca_mrdp")
    CA_MRDP("ca_mrdp"),

    @SerializedName("eu_dac7")
    EU_DAC7("eu_dac7"),

    @SerializedName("gb_mrdp")
    GB_MRDP("gb_mrdp"),

    @SerializedName("nz_mrdp")
    NZ_MRDP("nz_mrdp"),

    @SerializedName("us_1099_k")
    US_1099_K("us_1099_k"),

    @SerializedName("us_1099_misc")
    US_1099_MISC("us_1099_misc"),

    @SerializedName("us_1099_nec")
    US_1099_NEC("us_1099_nec");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
