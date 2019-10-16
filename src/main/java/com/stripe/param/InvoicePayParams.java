package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class InvoicePayParams extends ApiRequestParams {
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
   * In cases where the source used to pay the invoice has insufficient funds, passing
   * `forgive=true` controls whether a charge should be attempted for the full amount available on
   * the source, up to the amount to fully pay the invoice. This effectively forgives the difference
   * between the amount available on the source and the amount due.
   *
   * <p>Passing `forgive=false` will fail the charge if the source hasn't been pre-funded with the
   * right amount. An example for this case is with ACH Credit Transfers and wires: if the amount
   * wired is less than the amount due by a small amount, you might want to forgive the difference.
   */
  @SerializedName("forgive")
  Boolean forgive;

  /** Indicates if a customer is on or off-session while an invoice payment is attempted. */
  @SerializedName("off_session")
  Boolean offSession;

  /**
   * Boolean representing whether an invoice is paid outside of Stripe. This will result in no
   * charge being made.
   */
  @SerializedName("paid_out_of_band")
  Boolean paidOutOfBand;

  /**
   * A PaymentMethod to be charged. The PaymentMethod must be the ID of a PaymentMethod belonging to
   * the customer associated with the invoice being paid.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * A payment source to be charged. The source must be the ID of a source belonging to the customer
   * associated with the invoice being paid.
   */
  @SerializedName("source")
  String source;

  private InvoicePayParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean forgive,
      Boolean offSession,
      Boolean paidOutOfBand,
      String paymentMethod,
      String source) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.forgive = forgive;
    this.offSession = offSession;
    this.paidOutOfBand = paidOutOfBand;
    this.paymentMethod = paymentMethod;
    this.source = source;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean forgive;

    private Boolean offSession;

    private Boolean paidOutOfBand;

    private String paymentMethod;

    private String source;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoicePayParams build() {
      return new InvoicePayParams(
          this.expand,
          this.extraParams,
          this.forgive,
          this.offSession,
          this.paidOutOfBand,
          this.paymentMethod,
          this.source);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoicePayParams#expand} for the field documentation.
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
     * InvoicePayParams#expand} for the field documentation.
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
     * InvoicePayParams#extraParams} for the field documentation.
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
     * See {@link InvoicePayParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * In cases where the source used to pay the invoice has insufficient funds, passing
     * `forgive=true` controls whether a charge should be attempted for the full amount available on
     * the source, up to the amount to fully pay the invoice. This effectively forgives the
     * difference between the amount available on the source and the amount due.
     *
     * <p>Passing `forgive=false` will fail the charge if the source hasn't been pre-funded with the
     * right amount. An example for this case is with ACH Credit Transfers and wires: if the amount
     * wired is less than the amount due by a small amount, you might want to forgive the
     * difference.
     */
    public Builder setForgive(Boolean forgive) {
      this.forgive = forgive;
      return this;
    }

    /** Indicates if a customer is on or off-session while an invoice payment is attempted. */
    public Builder setOffSession(Boolean offSession) {
      this.offSession = offSession;
      return this;
    }

    /**
     * Boolean representing whether an invoice is paid outside of Stripe. This will result in no
     * charge being made.
     */
    public Builder setPaidOutOfBand(Boolean paidOutOfBand) {
      this.paidOutOfBand = paidOutOfBand;
      return this;
    }

    /**
     * A PaymentMethod to be charged. The PaymentMethod must be the ID of a PaymentMethod belonging
     * to the customer associated with the invoice being paid.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * A payment source to be charged. The source must be the ID of a source belonging to the
     * customer associated with the invoice being paid.
     */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }
  }
}
