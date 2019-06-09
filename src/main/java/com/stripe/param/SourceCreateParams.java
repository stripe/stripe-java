package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class SourceCreateParams extends ApiRequestParams {

  /**
   * Amount associated with the source. This is the amount for which the source will be chargeable
   * once ready. Required for `single_use` sources.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with
   * the source. This is the currency for which the source will be chargeable once ready.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The `Customer` to whom the original source is attached to. Must be set when the original source
   * is not a `Source` (e.g., `Card`).
   */
  @SerializedName("customer")
  String customer;

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
   * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`,
   * `code_verification`, `none`. It is generally inferred unless a type supports multiple flows.
   */
  @SerializedName("flow")
  SourceCreateParams.Flow flow;

  /**
   * A set of key-value pairs that you can attach to a source object. It can be useful for storing
   * additional information about the source in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The source to share. */
  @SerializedName("original_source")
  String originalSource;

  /**
   * Information about the owner of the payment instrument that may be used or required by
   * particular source types.
   */
  @SerializedName("owner")
  SourceCreateParams.Owner owner;

  /**
   * Optional parameters for the receiver flow. Can be set only if the source is a receiver (`flow`
   * is `receiver`).
   */
  @SerializedName("receiver")
  SourceCreateParams.Receiver receiver;

  /**
   * Parameters required for the redirect flow. Required if the source is authenticated by a
   * redirect (`flow` is `redirect`).
   */
  @SerializedName("redirect")
  SourceCreateParams.Redirect redirect;

  /**
   * An arbitrary string to be displayed on your customer's statement. As an example, if your
   * website is `RunClub` and the item you're charging for is a race ticket, you may want to specify
   * a `statement_descriptor` of `RunClub 5K race ticket.` While many payment types will display
   * this information, some may not display it at all.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * An optional token used to create the source. When passed, token properties will override source
   * parameters.
   */
  @SerializedName("token")
  String token;

  /**
   * The `type` of the source to create. Required unless `customer` and `original_source` are
   * specified (see the [Shared card
   * Sources](https://stripe.com/docs/sources/connect#shared-card-sources) guide)
   */
  @SerializedName("type")
  String type;

  @SerializedName("usage")
  SourceCreateParams.Usage usage;

  private SourceCreateParams(
      Long amount,
      String currency,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      SourceCreateParams.Flow flow,
      Map<String, String> metadata,
      String originalSource,
      SourceCreateParams.Owner owner,
      SourceCreateParams.Receiver receiver,
      SourceCreateParams.Redirect redirect,
      String statementDescriptor,
      String token,
      String type,
      SourceCreateParams.Usage usage) {

    this.amount = amount;
    this.currency = currency;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.flow = flow;
    this.metadata = metadata;
    this.originalSource = originalSource;
    this.owner = owner;
    this.receiver = receiver;
    this.redirect = redirect;
    this.statementDescriptor = statementDescriptor;
    this.token = token;
    this.type = type;
    this.usage = usage;
  }

  public static SourceCreateParams.Builder builder() {
    return new SourceCreateParams.Builder();
  }

  public static class Builder {
    private Long amount;
    private String currency;
    private String customer;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private SourceCreateParams.Flow flow;
    private Map<String, String> metadata;
    private String originalSource;
    private SourceCreateParams.Owner owner;
    private SourceCreateParams.Receiver receiver;
    private SourceCreateParams.Redirect redirect;
    private String statementDescriptor;
    private String token;
    private String type;
    private SourceCreateParams.Usage usage;

    public SourceCreateParams build() {
      return new SourceCreateParams(
          this.amount,
          this.currency,
          this.customer,
          this.expand,
          this.extraParams,
          this.flow,
          this.metadata,
          this.originalSource,
          this.owner,
          this.receiver,
          this.redirect,
          this.statementDescriptor,
          this.token,
          this.type,
          this.usage);
    }

    /**
     * Amount associated with the source. This is the amount for which the source will be chargeable
     * once ready. Required for `single_use` sources.
     */
    public SourceCreateParams.Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with
     * the source. This is the currency for which the source will be chargeable once ready.
     */
    public SourceCreateParams.Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The `Customer` to whom the original source is attached to. Must be set when the original
     * source is not a `Source` (e.g., `Card`).
     */
    public SourceCreateParams.Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SourceCreateParams#expand} for the field documentation.
     */
    public SourceCreateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SourceCreateParams#expand} for the field documentation.
     */
    public SourceCreateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SourceCreateParams#extraParams} for the field documentation.
     */
    public SourceCreateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SourceCreateParams#extraParams} for the field documentation.
     */
    public SourceCreateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`,
     * `code_verification`, `none`. It is generally inferred unless a type supports multiple flows.
     */
    public SourceCreateParams.Builder setFlow(SourceCreateParams.Flow flow) {

      this.flow = flow;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SourceCreateParams#metadata} for the field documentation.
     */
    public SourceCreateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SourceCreateParams#metadata} for the field documentation.
     */
    public SourceCreateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The source to share. */
    public SourceCreateParams.Builder setOriginalSource(String originalSource) {

      this.originalSource = originalSource;
      return this;
    }

    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    public SourceCreateParams.Builder setOwner(SourceCreateParams.Owner owner) {

      this.owner = owner;
      return this;
    }

    /**
     * Optional parameters for the receiver flow. Can be set only if the source is a receiver
     * (`flow` is `receiver`).
     */
    public SourceCreateParams.Builder setReceiver(SourceCreateParams.Receiver receiver) {

      this.receiver = receiver;
      return this;
    }

    /**
     * Parameters required for the redirect flow. Required if the source is authenticated by a
     * redirect (`flow` is `redirect`).
     */
    public SourceCreateParams.Builder setRedirect(SourceCreateParams.Redirect redirect) {

      this.redirect = redirect;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's statement. As an example, if your
     * website is `RunClub` and the item you're charging for is a race ticket, you may want to
     * specify a `statement_descriptor` of `RunClub 5K race ticket.` While many payment types will
     * display this information, some may not display it at all.
     */
    public SourceCreateParams.Builder setStatementDescriptor(String statementDescriptor) {

      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * An optional token used to create the source. When passed, token properties will override
     * source parameters.
     */
    public SourceCreateParams.Builder setToken(String token) {
      this.token = token;
      return this;
    }

    /**
     * The `type` of the source to create. Required unless `customer` and `original_source` are
     * specified (see the [Shared card
     * Sources](https://stripe.com/docs/sources/connect#shared-card-sources) guide)
     */
    public SourceCreateParams.Builder setType(String type) {
      this.type = type;
      return this;
    }

    public SourceCreateParams.Builder setUsage(SourceCreateParams.Usage usage) {

      this.usage = usage;
      return this;
    }
  }

  public static class Owner {

    /** Owner's address. */
    @SerializedName("address")
    SourceCreateParams.Owner.Address address;

    /** Owner's email address. */
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

    /** Owner's full name. */
    @SerializedName("name")
    String name;

    /** Owner's phone number. */
    @SerializedName("phone")
    String phone;

    private Owner(
        SourceCreateParams.Owner.Address address,
        String email,
        Map<String, Object> extraParams,
        String name,
        String phone) {

      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static SourceCreateParams.Owner.Builder builder() {
      return new SourceCreateParams.Owner.Builder();
    }

    public static class Builder {
      private SourceCreateParams.Owner.Address address;
      private String email;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;

      public SourceCreateParams.Owner build() {
        return new SourceCreateParams.Owner(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Owner's address. */
      public SourceCreateParams.Owner.Builder setAddress(SourceCreateParams.Owner.Address address) {

        this.address = address;
        return this;
      }

      /** Owner's email address. */
      public SourceCreateParams.Owner.Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.Owner#extraParams} for the field documentation.
       */
      public SourceCreateParams.Owner.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SourceCreateParams.Owner#extraParams} for the field documentation.
       */
      public SourceCreateParams.Owner.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Owner's full name. */
      public SourceCreateParams.Owner.Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Owner's phone number. */
      public SourceCreateParams.Owner.Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    public static class Address {
      @SerializedName("city")
      String city;

      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {

        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static SourceCreateParams.Owner.Address.Builder builder() {
        return new SourceCreateParams.Owner.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public SourceCreateParams.Owner.Address build() {
          return new SourceCreateParams.Owner.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public SourceCreateParams.Owner.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public SourceCreateParams.Owner.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.Owner.Address#extraParams} for the field
         * documentation.
         */
        public SourceCreateParams.Owner.Address.Builder putExtraParam(String key, Object value) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.Owner.Address#extraParams} for the field
         * documentation.
         */
        public SourceCreateParams.Owner.Address.Builder putAllExtraParam(Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public SourceCreateParams.Owner.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public SourceCreateParams.Owner.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public SourceCreateParams.Owner.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public SourceCreateParams.Owner.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }

  public static class Receiver {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The method Stripe should use to request information needed to process a refund or mispayment.
     * Either `email` (an email is sent directly to the customer) or `manual` (a
     * `source.refund_attributes_required` event is sent to your webhooks endpoint). Refer to each
     * payment method's documentation to learn which refund attributes may be required.
     */
    @SerializedName("refund_attributes_method")
    SourceCreateParams.Receiver.RefundAttributesMethod refundAttributesMethod;

    private Receiver(
        Map<String, Object> extraParams,
        SourceCreateParams.Receiver.RefundAttributesMethod refundAttributesMethod) {

      this.extraParams = extraParams;
      this.refundAttributesMethod = refundAttributesMethod;
    }

    public static SourceCreateParams.Receiver.Builder builder() {
      return new SourceCreateParams.Receiver.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private SourceCreateParams.Receiver.RefundAttributesMethod refundAttributesMethod;

      public SourceCreateParams.Receiver build() {
        return new SourceCreateParams.Receiver(this.extraParams, this.refundAttributesMethod);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.Receiver#extraParams} for the field documentation.
       */
      public SourceCreateParams.Receiver.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SourceCreateParams.Receiver#extraParams} for the field documentation.
       */
      public SourceCreateParams.Receiver.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The method Stripe should use to request information needed to process a refund or
       * mispayment. Either `email` (an email is sent directly to the customer) or `manual` (a
       * `source.refund_attributes_required` event is sent to your webhooks endpoint). Refer to each
       * payment method's documentation to learn which refund attributes may be required.
       */
      public SourceCreateParams.Receiver.Builder setRefundAttributesMethod(
          SourceCreateParams.Receiver.RefundAttributesMethod refundAttributesMethod) {

        this.refundAttributesMethod = refundAttributesMethod;
        return this;
      }
    }

    public enum RefundAttributesMethod implements ApiRequestParams.EnumParam {
      @SerializedName("email")
      EMAIL("email"),
      @SerializedName("manual")
      MANUAL("manual"),
      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      private RefundAttributesMethod(String value) {
        this.value = value;
      }
    }
  }

  public static class Redirect {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The URL you provide to redirect the customer back to you after they authenticated their
     * payment. It can use your application URI scheme in the context of a mobile application.
     */
    @SerializedName("return_url")
    String returnUrl;

    private Redirect(Map<String, Object> extraParams, String returnUrl) {
      this.extraParams = extraParams;
      this.returnUrl = returnUrl;
    }

    public static SourceCreateParams.Redirect.Builder builder() {
      return new SourceCreateParams.Redirect.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private String returnUrl;

      public SourceCreateParams.Redirect build() {
        return new SourceCreateParams.Redirect(this.extraParams, this.returnUrl);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.Redirect#extraParams} for the field documentation.
       */
      public SourceCreateParams.Redirect.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link SourceCreateParams.Redirect#extraParams} for the field documentation.
       */
      public SourceCreateParams.Redirect.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The URL you provide to redirect the customer back to you after they authenticated their
       * payment. It can use your application URI scheme in the context of a mobile application.
       */
      public SourceCreateParams.Redirect.Builder setReturnUrl(String returnUrl) {

        this.returnUrl = returnUrl;
        return this;
      }
    }
  }

  public enum Flow implements ApiRequestParams.EnumParam {
    @SerializedName("code_verification")
    CODE_VERIFICATION("code_verification"),
    @SerializedName("none")
    NONE("none"),
    @SerializedName("receiver")
    RECEIVER("receiver"),
    @SerializedName("redirect")
    REDIRECT("redirect");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Flow(String value) {
      this.value = value;
    }
  }

  public enum Usage implements ApiRequestParams.EnumParam {
    @SerializedName("reusable")
    REUSABLE("reusable"),
    @SerializedName("single_use")
    SINGLE_USE("single_use");

    @Getter(onMethod_ = {@Override})
    private final String value;

    private Usage(String value) {
      this.value = value;
    }
  }
}
