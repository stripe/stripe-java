// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ChargeUpdateParams extends ApiRequestParams {
  /**
   * The ID of an existing customer that will be associated with this request. This field may only
   * be updated if there is no existing associated customer with this charge.
   */
  @SerializedName("customer")
  Object customer;

  /**
   * An arbitrary string which you can attach to a charge object. It is displayed when in the web
   * interface alongside the charge. Note that if you use Stripe to send automatic email receipts to
   * your customers, your receipt emails will include the {@code description} of the charge(s) that
   * they are describing.
   */
  @SerializedName("description")
  Object description;

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
   * A set of key-value pairs you can attach to a charge giving information about its riskiness. If
   * you believe a charge is fraudulent, include a {@code user_report} key with a value of {@code
   * fraudulent}. If you believe a charge is safe, include a {@code user_report} key with a value of
   * {@code safe}. Stripe will use the information you send to improve our fraud detection
   * algorithms.
   */
  @SerializedName("fraud_details")
  FraudDetails fraudDetails;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * This is the email address that the receipt for this charge will be sent to. If this field is
   * updated, then a new email receipt will be sent to the updated address.
   */
  @SerializedName("receipt_email")
  Object receiptEmail;

  /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * A string that identifies this transaction as part of a group. {@code transfer_group} may only
   * be provided if it has not been set. See the <a
   * href="https://stripe.com/docs/connect/charges-transfers#transfer-options">Connect
   * documentation</a> for details.
   */
  @SerializedName("transfer_group")
  Object transferGroup;

  private ChargeUpdateParams(
      Object customer,
      Object description,
      List<String> expand,
      Map<String, Object> extraParams,
      FraudDetails fraudDetails,
      Object metadata,
      Object receiptEmail,
      Shipping shipping,
      Object transferGroup) {
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fraudDetails = fraudDetails;
    this.metadata = metadata;
    this.receiptEmail = receiptEmail;
    this.shipping = shipping;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object customer;

    private Object description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FraudDetails fraudDetails;

    private Object metadata;

    private Object receiptEmail;

    private Shipping shipping;

    private Object transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public ChargeUpdateParams build() {
      return new ChargeUpdateParams(
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.fraudDetails,
          this.metadata,
          this.receiptEmail,
          this.shipping,
          this.transferGroup);
    }

    /**
     * The ID of an existing customer that will be associated with this request. This field may only
     * be updated if there is no existing associated customer with this charge.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The ID of an existing customer that will be associated with this request. This field may only
     * be updated if there is no existing associated customer with this charge.
     */
    public Builder setCustomer(EmptyParam customer) {
      this.customer = customer;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a charge object. It is displayed when in the web
     * interface alongside the charge. Note that if you use Stripe to send automatic email receipts
     * to your customers, your receipt emails will include the {@code description} of the charge(s)
     * that they are describing.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a charge object. It is displayed when in the web
     * interface alongside the charge. Note that if you use Stripe to send automatic email receipts
     * to your customers, your receipt emails will include the {@code description} of the charge(s)
     * that they are describing.
     */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ChargeUpdateParams#expand} for the field documentation.
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
     * ChargeUpdateParams#expand} for the field documentation.
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
     * ChargeUpdateParams#extraParams} for the field documentation.
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
     * See {@link ChargeUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A set of key-value pairs you can attach to a charge giving information about its riskiness.
     * If you believe a charge is fraudulent, include a {@code user_report} key with a value of
     * {@code fraudulent}. If you believe a charge is safe, include a {@code user_report} key with a
     * value of {@code safe}. Stripe will use the information you send to improve our fraud
     * detection algorithms.
     */
    public Builder setFraudDetails(FraudDetails fraudDetails) {
      this.fraudDetails = fraudDetails;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ChargeUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ChargeUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * This is the email address that the receipt for this charge will be sent to. If this field is
     * updated, then a new email receipt will be sent to the updated address.
     */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * This is the email address that the receipt for this charge will be sent to. If this field is
     * updated, then a new email receipt will be sent to the updated address.
     */
    public Builder setReceiptEmail(EmptyParam receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. {@code transfer_group} may only
     * be provided if it has not been set. See the <a
     * href="https://stripe.com/docs/connect/charges-transfers#transfer-options">Connect
     * documentation</a> for details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. {@code transfer_group} may only
     * be provided if it has not been set. See the <a
     * href="https://stripe.com/docs/connect/charges-transfers#transfer-options">Connect
     * documentation</a> for details.
     */
    public Builder setTransferGroup(EmptyParam transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  @Getter
  public static class FraudDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Either {@code safe} or {@code fraudulent}. */
    @SerializedName("user_report")
    EnumParam userReport;

    private FraudDetails(Map<String, Object> extraParams, EnumParam userReport) {
      this.extraParams = extraParams;
      this.userReport = userReport;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private EnumParam userReport;

      /** Finalize and obtain parameter instance from this builder. */
      public FraudDetails build() {
        return new FraudDetails(this.extraParams, this.userReport);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeUpdateParams.FraudDetails#extraParams} for the field documentation.
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
       * See {@link ChargeUpdateParams.FraudDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Either {@code safe} or {@code fraudulent}. */
      public Builder setUserReport(UserReport userReport) {
        this.userReport = userReport;
        return this;
      }

      /** Either {@code safe} or {@code fraudulent}. */
      public Builder setUserReport(EmptyParam userReport) {
        this.userReport = userReport;
        return this;
      }
    }

    public enum UserReport implements ApiRequestParams.EnumParam {
      @SerializedName("fraudulent")
      FRAUDULENT("fraudulent"),

      @SerializedName("safe")
      SAFE("safe");

      @Getter(onMethod_ = {@Override})
      private final String value;

      UserReport(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Shipping {
    /** Shipping address. */
    @SerializedName("address")
    Address address;

    /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
    @SerializedName("carrier")
    Object carrier;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Recipient name. */
    @SerializedName("name")
    Object name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    Object phone;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("tracking_number")
    Object trackingNumber;

    private Shipping(
        Address address,
        Object carrier,
        Map<String, Object> extraParams,
        Object name,
        Object phone,
        Object trackingNumber) {
      this.address = address;
      this.carrier = carrier;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.trackingNumber = trackingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Object carrier;

      private Map<String, Object> extraParams;

      private Object name;

      private Object phone;

      private Object trackingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(EmptyParam carrier) {
        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeUpdateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link ChargeUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Recipient name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(EmptyParam trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public Address build() {
          return new Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }
}
