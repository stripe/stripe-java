package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialReportingFinanceReportRunRunParameters extends StripeObject {
  /** Connected account ID by which to filter the report run. */
  String connectedAccount;

  /** Currency of objects to be included in the report run. */
  String currency;

  /** Ending timestamp of data to be included in the report run (exclusive). */
  Long intervalEnd;

  /** Starting timestamp of data to be included in the report run. */
  Long intervalStart;

  /** Payout ID by which to filter the report run. */
  String payout;

  /** Category of balance transactions to be included in the report run. */
  String reportingCategory;
}
