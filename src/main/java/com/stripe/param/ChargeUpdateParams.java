package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class ChargeUpdateParams extends ApiRequestParams {

  /**
   * The ID of an existing customer that will be associated with this request. This field may only
   * be updated if there is no existing associated customer with this charge.
   */
  @SerializedName("customer")
  String customer;

  /**
   * An arbitrary string which you can attach to a charge object. It is displayed when in the web
   * interface alongside the charge. Note that if you use Stripe to send automatic email receipts to
   * your customers, your receipt emails will include the `description` of the charge(s) that they
   * are describing.
   */
  @SerializedName("description")
  String description;

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
   * you believe a charge is fraudulent, include a `user_report` key with a value of `fraudulent`.
   * If you believe a charge is safe, include a `user_report` key with a value of `safe`. Stripe
   * will use the information you send to improve our fraud detection algorithms.
   */
  @SerializedName("fraud_details")
  ChargeUpdateParams.FraudDetails fraudDetails;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * This is the email address that the receipt for this charge will be sent to. If this field is
   * updated, then a new email receipt will be sent to the updated address.
   */
  @SerializedName("receipt_email")
  String receiptEmail;

  /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
  @SerializedName("shipping")
  ChargeUpdateParams.Shipping shipping;

  /**
   * A string that identifies this transaction as part of a group. `transfer_group` may only be
   * provided if it has not been set. See the [Connect
   * documentation](https://stripe.com/docs/connect/charges-transfers#grouping-transactions) for
   * details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  private ChargeUpdateParams(
      String customer,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      ChargeUpdateParams.FraudDetails fraudDetails,
      Map<String, String> metadata,
      String receiptEmail,
      ChargeUpdateParams.Shipping shipping,
      String transferGroup) {

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

  public static ChargeUpdateParams.Builder builder() {
    return new ChargeUpdateParams.Builder();
  }

  public static class Builder {
    private String customer;
    private String description;
    private List<String> expand;
    private Map<String, Object> extraParams;
    private ChargeUpdateParams.FraudDetails fraudDetails;
    private Map<String, String> metadata;
    private String receiptEmail;
    private ChargeUpdateParams.Shipping shipping;
    private String transferGroup;

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
    public ChargeUpdateParams.Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a charge object. It is displayed when in the web
     * interface alongside the charge. Note that if you use Stripe to send automatic email receipts
     * to your customers, your receipt emails will include the `description` of the charge(s) that
     * they are describing.
     */
    public ChargeUpdateParams.Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ChargeUpdateParams#expand} for the field documentation.
     */
    public ChargeUpdateParams.Builder addExpand(String element) {
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
    public ChargeUpdateParams.Builder addAllExpand(List<String> list) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(list);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ChargeUpdateParams#extraParams} for the field documentation.
     */
    public ChargeUpdateParams.Builder putExtraParam(String key, Object value) {

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
    public ChargeUpdateParams.Builder putAllExtraParam(Map<String, Object> map) {

      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A set of key-value pairs you can attach to a charge giving information about its riskiness.
     * If you believe a charge is fraudulent, include a `user_report` key with a value of
     * `fraudulent`. If you believe a charge is safe, include a `user_report` key with a value of
     * `safe`. Stripe will use the information you send to improve our fraud detection algorithms.
     */
    public ChargeUpdateParams.Builder setFraudDetails(
        ChargeUpdateParams.FraudDetails fraudDetails) {

      this.fraudDetails = fraudDetails;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ChargeUpdateParams#metadata} for the field documentation.
     */
    public ChargeUpdateParams.Builder putMetadata(String key, String value) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ChargeUpdateParams#metadata} for the field documentation.
     */
    public ChargeUpdateParams.Builder putAllMetadata(Map<String, String> map) {

      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * This is the email address that the receipt for this charge will be sent to. If this field is
     * updated, then a new email receipt will be sent to the updated address.
     */
    public ChargeUpdateParams.Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
    public ChargeUpdateParams.Builder setShipping(ChargeUpdateParams.Shipping shipping) {

      this.shipping = shipping;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. `transfer_group` may only be
     * provided if it has not been set. See the [Connect
     * documentation](https://stripe.com/docs/connect/charges-transfers#grouping-transactions) for
     * details.
     */
    public ChargeUpdateParams.Builder setTransferGroup(String transferGroup) {

      this.transferGroup = transferGroup;
      return this;
    }
  }

  public static class FraudDetails {

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("user_report")
    ApiRequestParams.EnumParam userReport;

    private FraudDetails(Map<String, Object> extraParams, ApiRequestParams.EnumParam userReport) {

      this.extraParams = extraParams;
      this.userReport = userReport;
    }

    public static ChargeUpdateParams.FraudDetails.Builder builder() {
      return new ChargeUpdateParams.FraudDetails.Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;
      private ApiRequestParams.EnumParam userReport;

      public ChargeUpdateParams.FraudDetails build() {
        return new ChargeUpdateParams.FraudDetails(this.extraParams, this.userReport);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeUpdateParams.FraudDetails#extraParams} for the field documentation.
       */
      public ChargeUpdateParams.FraudDetails.Builder putExtraParam(String key, Object value) {

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
      public ChargeUpdateParams.FraudDetails.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public ChargeUpdateParams.FraudDetails.Builder setUserReport(EmptyParam userReport) {

        this.userReport = userReport;
        return this;
      }

      public ChargeUpdateParams.FraudDetails.Builder setUserReport(
          ChargeUpdateParams.FraudDetails.UserReport userReport) {

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

      private UserReport(String value) {
        this.value = value;
      }
    }
  }

  public static class Shipping {

    /** Shipping address. */
    @SerializedName("address")
    ChargeUpdateParams.Shipping.Address address;

    /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
    @SerializedName("carrier")
    String carrier;

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
    String name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    String phone;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("tracking_number")
    String trackingNumber;

    private Shipping(
        ChargeUpdateParams.Shipping.Address address,
        String carrier,
        Map<String, Object> extraParams,
        String name,
        String phone,
        String trackingNumber) {

      this.address = address;
      this.carrier = carrier;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.trackingNumber = trackingNumber;
    }

    public static ChargeUpdateParams.Shipping.Builder builder() {
      return new ChargeUpdateParams.Shipping.Builder();
    }

    public static class Builder {
      private ChargeUpdateParams.Shipping.Address address;
      private String carrier;
      private Map<String, Object> extraParams;
      private String name;
      private String phone;
      private String trackingNumber;

      public ChargeUpdateParams.Shipping build() {
        return new ChargeUpdateParams.Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public ChargeUpdateParams.Shipping.Builder setAddress(
          ChargeUpdateParams.Shipping.Address address) {

        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public ChargeUpdateParams.Shipping.Builder setCarrier(String carrier) {

        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public ChargeUpdateParams.Shipping.Builder putExtraParam(String key, Object value) {

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
      public ChargeUpdateParams.Shipping.Builder putAllExtraParam(Map<String, Object> map) {

        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public ChargeUpdateParams.Shipping.Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public ChargeUpdateParams.Shipping.Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public ChargeUpdateParams.Shipping.Builder setTrackingNumber(String trackingNumber) {

        this.trackingNumber = trackingNumber;
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

      public static ChargeUpdateParams.Shipping.Address.Builder builder() {

        return new ChargeUpdateParams.Shipping.Address.Builder();
      }

      public static class Builder {
        private String city;
        private String country;
        private Map<String, Object> extraParams;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public ChargeUpdateParams.Shipping.Address build() {
          return new ChargeUpdateParams.Shipping.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public ChargeUpdateParams.Shipping.Address.Builder setCity(String city) {

          this.city = city;
          return this;
        }

        public ChargeUpdateParams.Shipping.Address.Builder setCountry(String country) {

          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public ChargeUpdateParams.Shipping.Address.Builder putExtraParam(String key, Object value) {

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
        public ChargeUpdateParams.Shipping.Address.Builder putAllExtraParam(
            Map<String, Object> map) {

          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public ChargeUpdateParams.Shipping.Address.Builder setLine1(String line1) {

          this.line1 = line1;
          return this;
        }

        public ChargeUpdateParams.Shipping.Address.Builder setLine2(String line2) {

          this.line2 = line2;
          return this;
        }

        public ChargeUpdateParams.Shipping.Address.Builder setPostalCode(String postalCode) {

          this.postalCode = postalCode;
          return this;
        }

        public ChargeUpdateParams.Shipping.Address.Builder setState(String state) {

          this.state = state;
          return this;
        }
      }
    }
  }
}
