// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PayoutMethodsBankAccountSpec extends StripeObject {
  /** The list of specs by country. */
  @SerializedName("countries")
  Map<String, PayoutMethodsBankAccountSpec.Country> countries;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.payout_methods_bank_account_spec}.
   */
  @SerializedName("object")
  String object;

  /**
   * For more details about Country, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Country extends StripeObject {
    /** The list of fields for a country, along with associated information. */
    @SerializedName("fields")
    List<PayoutMethodsBankAccountSpec.Country.Field> fields;

    /**
     * For more details about Field, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Field extends StripeObject {
      /** The local name of the field. */
      @SerializedName("local_name")
      String localName;

      /** The human readable local name of the field. */
      @SerializedName("local_name_human")
      String localNameHuman;

      /** The maximum length of the field. */
      @SerializedName("max_length")
      Integer maxLength;

      /** THe minimum length of the field. */
      @SerializedName("min_length")
      Integer minLength;

      /** The placeholder value of the field. */
      @SerializedName("placeholder")
      String placeholder;

      /** The stripe name of the field. */
      @SerializedName("stripe_name")
      String stripeName;

      /** The validation regex of the field. */
      @SerializedName("validation_regex")
      String validationRegex;
    }
  }
}
