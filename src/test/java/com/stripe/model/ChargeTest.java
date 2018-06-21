package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ChargeTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/charges/ch_123");
    final Charge charge = ApiResource.GSON.fromJson(data, Charge.class);
    assertNotNull(charge);
    assertNotNull(charge.getId());
    assertEquals("charge", charge.getObject());
    assertNull(charge.getApplicationObject());
    assertNull(charge.getApplicationFeeObject());
    assertNull(charge.getBalanceTransactionObject());
    assertNull(charge.getCustomerObject());
    assertNull(charge.getDestinationObject());
    assertNull(charge.getDisputeObject());
    assertNull(charge.getInvoiceObject());
    assertNull(charge.getOnBehalfOfObject());
    assertNull(charge.getOrderObject());
    assertNull(charge.getReviewObject());
    assertNull(charge.getSourceTransferObject());
    assertNull(charge.getTransferObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "application",
      "application_fee",
      "balance_transaction",
      "customer",
      "destination",
      "dispute",
      "invoice",
      "on_behalf_of",
      "order",
      "review",
      "source_transfer",
      "transfer",
    };
    final String data = getFixture("/v1/charges/ch_123", expansions);
    final Charge charge = ApiResource.GSON.fromJson(data, Charge.class);
    assertNotNull(charge);
    final Application application = charge.getApplicationObject();
    assertNotNull(application);
    assertNotNull(application.getId());
    assertEquals(charge.getApplication(), application.getId());
    final ApplicationFee applicationFee = charge.getApplicationFeeObject();
    assertNotNull(applicationFee);
    assertNotNull(applicationFee.getId());
    assertEquals(charge.getApplicationFee(), applicationFee.getId());
    final BalanceTransaction balanceTransaction = charge.getBalanceTransactionObject();
    assertNotNull(balanceTransaction);
    assertNotNull(balanceTransaction.getId());
    assertEquals(charge.getBalanceTransaction(), balanceTransaction.getId());
    final Customer customer = charge.getCustomerObject();
    assertNotNull(customer);
    assertNotNull(customer.getId());
    assertEquals(charge.getCustomer(), customer.getId());
    final Account destination = charge.getDestinationObject();
    assertNotNull(destination);
    assertNotNull(destination.getId());
    assertEquals(charge.getDestination(), destination.getId());
    final Dispute dispute = charge.getDisputeObject();
    assertNotNull(dispute);
    assertNotNull(dispute.getId());
    assertEquals(charge.getDispute(), dispute.getId());
    final Invoice invoice = charge.getInvoiceObject();
    assertNotNull(invoice);
    assertNotNull(invoice.getId());
    assertEquals(charge.getInvoice(), invoice.getId());
    final Account onBehalfOf = charge.getOnBehalfOfObject();
    assertNotNull(onBehalfOf);
    assertNotNull(onBehalfOf.getId());
    assertEquals(charge.getOnBehalfOf(), onBehalfOf.getId());
    final Order order = charge.getOrderObject();
    assertNotNull(order);
    assertNotNull(order.getId());
    assertEquals(charge.getOrder(), order.getId());
    final Review review = charge.getReviewObject();
    assertNotNull(review);
    assertNotNull(review.getId());
    assertEquals(charge.getReview(), review.getId());
    final Transfer sourceTransfer = charge.getSourceTransferObject();
    assertNotNull(sourceTransfer);
    assertNotNull(sourceTransfer.getId());
    assertEquals(charge.getSourceTransfer(), sourceTransfer.getId());
    final Transfer transfer = charge.getTransferObject();
    assertNotNull(transfer);
    assertNotNull(transfer.getId());
    assertEquals(charge.getTransfer(), transfer.getId());
  }
}
