package com.stripe.model;

import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountRequirements extends StripeObject {
  /**
   * A string describing the reason for this account being unable to create charges or receive
   * payouts, if that is the case. Can be `rejected.fraud`, `rejected.terms_of_service`,
   * `rejected.listed`, `rejected.other`, `fields_needed`, `listed`, `under_review`, or `other`.
   */
  String disabledReason;

  /**
   * By what time the `fields_needed` must be provided. If this date is in the past, the account is
   * already in bad standing, and providing `fields_needed` is necessary to re-enable payouts and
   * prevent other consequences. If this date is in the future, `fields_needed` must be provided to
   * ensure the account remains in good standing.
   */
  Long dueBy;

  /**
   * Field names that need to be provided for the account to remain in good standing. Nested fields
   * are separated by `.` (for example, `legal_entity.first_name`).
   */
  List<Object> fieldsNeeded;
}
