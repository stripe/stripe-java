package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentMethodUpdateParams extends ApiRequestParams {

  /**
   * Billing information associated with the PaymentMethod that may be used or required by
   * particular types of payment methods.
   */
  @SerializedName("billing_details")
  PaymentMethodUpdateParams.BillingDetails billingDetails;

  @SerializedName("card")
  PaymentMethodUpdateParams.Card card;

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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  private PaymentMethodUpdateParams(
      PaymentMethodUpdateParams.BillingDetails billingDetails,
      PaymentMethodUpdateParams.Card card,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata) {

    this.billingDetails = billingDetails;
    this.card = card;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
  }

  public static PaymentMethodUpdateParams.Builder builder() {
    return new PaymentMethodUpdateParams.Builder();
  }

  public static class Builder {
    private PaymentMethodUpdateParams.BillingDetails billingDetails;
    private PaymentMethodUpdateParams.Card card;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private Map<String, String> metadata;

    public PaymentMethodUpdateParams build() {
      return new PaymentMethodUpdateParams(
          this.billingDetails, this.card, this.expand, this.extraParams, this.metadata);
    }

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    public PaymentMethodUpdateParams.Builder setBillingDetails(
        PaymentMethodUpdateParams.BillingDetails billingDetails) {

      this.billingDetails = billingDetails;
      return this;
    }

    public PaymentMethodUpdateParams.Builder setCard(PaymentMethodUpdateParams.Card card) {

      this.card = card;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodUpdateParams#expand} for the field documentation.
     */
    public PaymentMethodUpdateParams.Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodUpdateParams#expand} for the field documentation.
     */
    public PaymentMethodUpdateParams.Builder addAllExpand(List<String> list) {

      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodUpdateParams#extraParams} for the field documentation.
     */
    public PaymentMethodUpdateParams.Builder putExtraParam(String key, Object value) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodUpdateParams#extraParams} for the field documentation.
     */
    public PaymentMethodUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodUpdateParams#metadata} for the field documentation.
     */
    public PaymentMethodUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodUpdateParams#metadata} for the field documentation.
     */
    public PaymentMethodUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  public static class BillingDetails {

    /** Billing address. */
    @SerializedName("address")
    PaymentMethodUpdateParams.BillingDetails.Address address;

    /** Email address. */
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

    /** Full name. */
    @SerializedName("name")
    String name;

    /** Billing phone number (including extension). */
    @SerializedName("phone")
    String phone;

    private BillingDetails(
        PaymentMethodUpdateParams.BillingDetails.Address address,
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

    public static PaymentMethodUpdateParams.BillingDetails.Builder builder() {

      return new PaymentMethodUpdateParams.BillingDetails.Builder();
    }

    public static class Builder {
      private PaymentMethodUpdateParams.BillingDetails.Address address;
      private String email;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;

      public PaymentMethodUpdateParams.BillingDetails build() {
        return new PaymentMethodUpdateParams.BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Billing address. */
      public PaymentMethodUpdateParams.BillingDetails.Builder setAddress(
          PaymentMethodUpdateParams.BillingDetails.Address address) {

        this.address = address;
        return this;
      }

      /** Email address. */
      public PaymentMethodUpdateParams.BillingDetails.Builder setEmail(String email) {

        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodUpdateParams.BillingDetails#extraParams} for the field documentation.
       */
      public PaymentMethodUpdateParams.BillingDetails.Builder putExtraParam(
          String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodUpdateParams.BillingDetails#extraParams} for the field
       * documentation.
       */
      public PaymentMethodUpdateParams.BillingDetails.Builder putAllExtraParam(
          Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Full name. */
      public PaymentMethodUpdateParams.BillingDetails.Builder setName(String name) {

        this.name = name;
        return this;
      }

      /** Billing phone number (including extension). */
      public PaymentMethodUpdateParams.BillingDetails.Builder setPhone(String phone) {

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

      public static PaymentMethodUpdateParams.BillingDetails.Address.Builder builder() {

        return new PaymentMethodUpdateParams.BillingDetails.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public PaymentMethodUpdateParams.BillingDetails.Address build() {

          return new PaymentMethodUpdateParams.BillingDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public PaymentMethodUpdateParams.BillingDetails.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public PaymentMethodUpdateParams.BillingDetails.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodUpdateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public PaymentMethodUpdateParams.BillingDetails.Address.Builder putExtraParam(
            String key, Object value) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodUpdateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public PaymentMethodUpdateParams.BillingDetails.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public PaymentMethodUpdateParams.BillingDetails.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public PaymentMethodUpdateParams.BillingDetails.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public PaymentMethodUpdateParams.BillingDetails.Address.Builder setPostalCode(
            String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public PaymentMethodUpdateParams.BillingDetails.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }

  public static class Card {

    /** Two-digit number representing the card's expiration month. */
    @SerializedName("exp_month")
    Long expMonth;

    /** Four-digit number representing the card's expiration year. */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Card(Long expMonth, Long expYear, Map<String, Object> extraParams) {

      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
    }

    public static PaymentMethodUpdateParams.Card.Builder builder() {
      return new PaymentMethodUpdateParams.Card.Builder();
    }

    public static class Builder {
      private Long expMonth;
      private Long expYear;
      private Map<String, Object> extraParams;

      public PaymentMethodUpdateParams.Card build() {
        return new PaymentMethodUpdateParams.Card(this.expMonth, this.expYear, this.extraParams);
      }

      /** Two-digit number representing the card's expiration month. */
      public PaymentMethodUpdateParams.Card.Builder setExpMonth(Long expMonth) {

        this.expMonth = expMonth;
        return this;
      }

      /** Four-digit number representing the card's expiration year. */
      public PaymentMethodUpdateParams.Card.Builder setExpYear(Long expYear) {

        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodUpdateParams.Card#extraParams} for the field documentation.
       */
      public PaymentMethodUpdateParams.Card.Builder putExtraParam(String key, Object value) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodUpdateParams.Card#extraParams} for the field documentation.
       */
      public PaymentMethodUpdateParams.Card.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }
}
