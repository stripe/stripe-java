// File generated from our OpenAPI spec
package com.stripe.model.v2.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The result of resolving an address to its tax precision level. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OperationsResolveAddressResult extends StripeObject {
  /** The normalized form of the input address. */
  @SerializedName("address")
  Address address;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.tax.operations_resolve_address_result}.
   */
  @SerializedName("object")
  String object;

  /**
   * The precision level of the resolved address.
   *
   * <p>One of {@code none}, {@code address}, {@code city}, {@code country}, {@code postal_code},
   * {@code state}, or {@code street}.
   */
  @SerializedName("precision")
  String precision;

  /** Details about the precision, including any issues. */
  @SerializedName("precision_details")
  PrecisionDetails precisionDetails;

  /** The normalized form of the input address. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Address extends StripeObject {
    /** The city. */
    @SerializedName("city")
    String city;

    /** The two-letter country code. */
    @SerializedName("country")
    String country;

    /** The first line of the street address. */
    @SerializedName("line1")
    String line1;

    /** The postal code. */
    @SerializedName("postal_code")
    String postalCode;

    /** The state or province. */
    @SerializedName("state")
    String state;
  }

  /** Details about the precision, including any issues. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PrecisionDetails extends StripeObject {
    /** Issues preventing higher precision. */
    @SerializedName("issues")
    List<OperationsResolveAddressResult.PrecisionDetails.Issue> issues;

    /**
     * For more details about Issue, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Issue extends StripeObject {
      /**
       * A code describing the issue.
       *
       * <p>Equal to {@code required_for_improved_precision}.
       */
      @SerializedName("code")
      String code;

      /**
       * The address field with the issue.
       *
       * <p>One of {@code city}, {@code country}, {@code line1}, {@code postal_code}, or {@code
       * state}.
       */
      @SerializedName("field")
      String field;
    }
  }
}
