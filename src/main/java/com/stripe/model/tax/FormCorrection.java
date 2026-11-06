// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Corrections to filed tax forms. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FormCorrection extends StripeObject {
  /** The tax forms created by the correction. */
  @SerializedName("correction_forms")
  List<FormCorrection.CorrectionForm> correctionForms;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.form_correction}.
   */
  @SerializedName("object")
  String object;

  /** The original tax form that was corrected. */
  @SerializedName("original_form")
  String originalForm;

  /**
   * For more details about CorrectionForm, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CorrectionForm extends StripeObject {
    /**
     * The kind of information changed by this correction.
     *
     * <p>One of {@code payee_changed}, or {@code totals_changed}.
     */
    @SerializedName("correction_type")
    String correctionType;

    /** The corrected tax form. */
    @SerializedName("form")
    String form;
  }
}
