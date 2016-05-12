package com.stripe.model;

import com.google.gson.Gson;
import com.stripe.BaseStripeTest;
import com.stripe.net.APIResource;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DeserializerTest extends BaseStripeTest {

	private static Gson gson = APIResource.GSON;

	@Test
	public void deserializeEventDataPreviousAttributes() throws IOException {
		String json = resource("previous_attributes.json");
		EventData ed = gson.fromJson(json,EventData.class);

		assertThat(ed.getPreviousAttributes().get("fee"), notNullValue());
	}

	@Test
	public void deserializeEventPreviousAttributesNull() throws IOException {
		String json = resource("previous_attributes_null.json");
		EventData ed = gson.fromJson(json, EventData.class);

		assertThat(ed.getPreviousAttributes(), nullValue());
	}

	@Test
	public void deserializeDisputeObject() throws IOException {
		String json = resource("dispute.json");
		Dispute dispute = gson.fromJson(json, Dispute.class);
		EvidenceSubObject expected = new EvidenceSubObject();
		expected.setProductDescription("my productDescription");
		expected.setCustomerName("my customerName");
		expected.setCustomerEmailAddress("my customerEmailAddress");
		expected.setCustomerPurchaseIp("my customerPurchaseIp");
		expected.setCustomerSignature("my customerSignature");
		expected.setBillingAddress("my billingAddress");
		expected.setReceipt("my receipt");
		expected.setShippingAddress("my shippingAddress");
		expected.setShippingDate("my shippingDate");
		expected.setShippingTrackingNumber("my shippingTrackingNumber");
		expected.setShippingDocumentation("my shippingDocumentation");
		expected.setRefundPolicy("my refundPolicy");
		expected.setRefundPolicyDisclosure("my refundPolicyDisclosure");
		expected.setRefundRefusalExplanation("my refundRefusalExplanation");
		expected.setCancellationPolicy("my cancellationPolicy");
		expected.setCancellationPolicyDisclosure("my cancellationPolicyDisclosure");
		expected.setCancellationRebuttal("my cancellationRebuttal");
		expected.setAccessActivityLog("my accessActivityLog");
		expected.setServiceDate("my serviceDate");
		expected.setServiceDocumentation("my serviceDocumentation");
		expected.setDuplicateChargeId("my duplicateChargeId");
		expected.setDuplicateChargeExplanation("my duplicateChargeExplanation");
		expected.setDuplicateChargeDocumentation("my duplicateChargeDocumentation");
		expected.setCustomerCommunication("my customerCommunication");
		expected.setUncategorizedText("my uncategorizedText");
		expected.setUncategorizedFile("my uncategorizedFile");

		EvidenceSubObject evidenceSubObject = dispute.getEvidenceSubObject();
		assertEquals(expected, evidenceSubObject);
	}

	@Test
	public void deserializeEventDataAccountEvent() throws IOException {
		String json = resource("account_event.json");
		Event e = StripeObject.PRETTY_PRINT_GSON.fromJson(json, Event.class);

		assertEquals(e.getType(), "account.updated");
	}

	@Test
	public void deserializeRefundList() throws IOException {
		String json = resource("charge_with_refund_array.json");
		Charge ch = gson.fromJson(json, Charge.class);

		List<Refund> refunds = ch.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, ch.refunds.getHasMore());
		assertEquals((Integer) 2, ch.refunds.getTotalCount());
		assertEquals("re_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
	}

	@Test
	public void deserializeRefundSublist() throws IOException {
		String json = resource("charge_with_refund_sublist.json");
		Charge ch = gson.fromJson(json, Charge.class);

		List<Refund> refunds = ch.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, ch.refunds.getHasMore());
		assertEquals((Integer) 2, ch.refunds.getTotalCount());
		assertEquals("re_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
	}

	@Test
	public void deserializeAppFeeRefundList() throws IOException {
		String json = resource("appfee_with_refund_array.json");
		ApplicationFee fee = gson.fromJson(json, ApplicationFee.class);

		List<FeeRefund> refunds = fee.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, fee.refunds.getHasMore());
		assertEquals((Integer) 2, fee.refunds.getTotalCount());
		assertEquals("fr_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
	}

	@Test
	public void deserializeAppFee() throws IOException {
		String json = resource("appfee_with_refund_array.json");
		ApplicationFee fee = gson.fromJson(json, ApplicationFee.class);

		assertEquals("acct_104AVU4zxjIswmc2", fee.getAccount());
	}

	@Test
	public void deserializeAppFeeRefundSublist() throws IOException {
		String json = resource("appfee_with_refund_sublist.json");
		ApplicationFee fee = gson.fromJson(json, ApplicationFee.class);

		List<FeeRefund> refunds = fee.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, fee.refunds.getHasMore());
		assertEquals((Integer) 2, fee.refunds.getTotalCount());
		assertEquals("fr_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
		assertEquals("fee_4UNP26L2Vuc42P", refunds.get(0).getFee());
	}
}
