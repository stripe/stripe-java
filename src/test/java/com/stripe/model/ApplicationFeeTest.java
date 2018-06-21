package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ApplicationFeeTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/application_fees/fee_123");
    final ApplicationFee fee = ApiResource.GSON.fromJson(data, ApplicationFee.class);
    assertNotNull(fee);
    assertNotNull(fee.getId());
    assertEquals("application_fee", fee.getObject());
    assertNull(fee.getAccountObject());
    assertNull(fee.getApplicationObject());
    assertNull(fee.getBalanceTransactionObject());
    assertNull(fee.getChargeObject());
    assertNull(fee.getOriginatingTransactionObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "account",
      "application",
      "balance_transaction",
      "charge",
      "originating_transaction",
    };
    final String data = getFixture("/v1/application_fees/fee_123", expansions);
    final ApplicationFee fee = ApiResource.GSON.fromJson(data, ApplicationFee.class);
    assertNotNull(fee);
    final Account account = fee.getAccountObject();
    assertNotNull(account);
    assertNotNull(account.getId());
    assertEquals(fee.getAccount(), account.getId());
    final Application application = fee.getApplicationObject();
    assertNotNull(application);
    assertNotNull(application.getId());
    assertEquals(fee.getApplication(), application.getId());
    final BalanceTransaction balanceTransaction = fee.getBalanceTransactionObject();
    assertNotNull(balanceTransaction);
    assertNotNull(balanceTransaction.getId());
    assertEquals(fee.getBalanceTransaction(), balanceTransaction.getId());
    final Charge charge = fee.getChargeObject();
    assertNotNull(charge);
    assertNotNull(charge.getId());
    assertEquals(fee.getCharge(), charge.getId());
    final Charge originatingTransaction = fee.getOriginatingTransactionObject();
    assertNotNull(originatingTransaction);
    assertNotNull(originatingTransaction.getId());
    assertEquals(fee.getOriginatingTransaction(), originatingTransaction.getId());
  }
}
