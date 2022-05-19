// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccountFeatures extends StripeObject {
  /** Toggle settings for enabling/disabling a feature. */
  @SerializedName("card_issuing")
  FinancialAccount.ToggleSettings cardIssuing;

  /** Toggle settings for enabling/disabling a feature. */
  @SerializedName("deposit_insurance")
  FinancialAccount.ToggleSettings depositInsurance;

  /** Settings related to Financial Addresses features on a Financial Account. */
  @SerializedName("financial_addresses")
  FinancialAddress financialAddresses;

  /** InboundTransfers contains inbound transfers features for a FinancialAccount. */
  @SerializedName("inbound_transfers")
  InboundTransfer inboundTransfers;

  /** Toggle settings for enabling/disabling a feature. */
  @SerializedName("intra_stripe_flows")
  FinancialAccount.ToggleSettings intraStripeFlows;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.financial_account_features}.
   */
  @SerializedName("object")
  String object;

  /** Settings related to Outbound Payments features on a Financial Account. */
  @SerializedName("outbound_payments")
  OutboundPayment outboundPayments;

  /** OutboundTransfers contains outbound transfers features for a FinancialAccount. */
  @SerializedName("outbound_transfers")
  OutboundTransfer outboundTransfers;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FinancialAddress extends StripeObject {
    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("aba")
    FinancialAccount.ToggleSettings aba;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InboundTransfer extends StripeObject {
    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("ach")
    FinancialAccount.ToggleSettings ach;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OutboundPayment extends StripeObject {
    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("ach")
    FinancialAccount.ToggleSettings ach;

    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("us_domestic_wire")
    FinancialAccount.ToggleSettings usDomesticWire;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OutboundTransfer extends StripeObject {
    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("ach")
    FinancialAccount.ToggleSettings ach;

    /** Toggle settings for enabling/disabling a feature. */
    @SerializedName("us_domestic_wire")
    FinancialAccount.ToggleSettings usDomesticWire;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PlatformRestriction extends StripeObject {
    /**
     * Restricts all inbound money movement.
     *
     * <p>One of {@code restricted}, or {@code unrestricted}.
     */
    @SerializedName("inbound_flows")
    String inboundFlows;

    /**
     * Restricts all outbound money movement.
     *
     * <p>One of {@code restricted}, or {@code unrestricted}.
     */
    @SerializedName("outbound_flows")
    String outboundFlows;
  }
}
