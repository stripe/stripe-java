package com.stripe.model;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DeserializerTest {

	private static Gson gson = com.stripe.net.APIResource.GSON;

	@Test
	public void deserializeEventDataPreviousAttributes() throws IOException {

		String json = resource("previous_attributes.json");
		EventData ed = gson.fromJson(json,EventData.class);

		assertThat(ed.getPreviousAttributes().get("fee"), notNullValue());
	}

	@Test
	public void deserializeEventDataAccountEvent() throws IOException {
		String json = resource("account_event.json");
		Event e = StripeObject.PRETTY_PRINT_GSON.fromJson(json, Event.class);

		assertEquals(e.getType(), "account.updated");
	}

	@Test
	public void deserializeRefundList() throws IOException {
		String json = resource("charge_refund_list.json");
		Charge ch = gson.fromJson(json, Charge.class);

		List<Refund> refunds = ch.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, ch.refunds.getHasMore());
		assertEquals((Integer) 2, ch.refunds.getTotalCount());
		assertEquals("re_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
	}

	@Test
	public void deserializeRefundSublist() throws IOException {
		String json = resource("charge_refund_sublist.json");
		Charge ch = gson.fromJson(json, Charge.class);

		List<Refund> refunds = ch.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, ch.refunds.getHasMore());
		assertEquals((Integer) 2, ch.refunds.getTotalCount());
		assertEquals("re_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
	}

	@Test
	public void deserializeAppFeeRefundList() throws IOException {
		String json = resource("appfee_refund_list.json");
		ApplicationFee fee = gson.fromJson(json, ApplicationFee.class);

		List<FeeRefund> refunds = fee.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, fee.refunds.getHasMore());
		assertEquals((Integer) 2, fee.refunds.getTotalCount());
		assertEquals("fr_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
	}

	@Test
	public void deserializeAppFeeRefundSublist() throws IOException {
		String json = resource("appfee_refund_sublist.json");
		ApplicationFee fee = gson.fromJson(json, ApplicationFee.class);

		List<FeeRefund> refunds = fee.refunds.getData();
		assertEquals(2, refunds.size());
		assertEquals(false, fee.refunds.getHasMore());
		assertEquals((Integer) 2, fee.refunds.getTotalCount());
		assertEquals("fr_104Buu4hAU1NpT8JMBAc564Q", refunds.get(0).getId());
		assertEquals("fee_4UNP26L2Vuc42P", refunds.get(0).getFee());
	}

	private String resource(String path) throws IOException {
		InputStream resource = getClass().getResourceAsStream(path);

		ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
		byte[] buf = new byte [1024];

		for( int i = resource.read(buf); i > 0; i = resource.read(buf)) {
			os.write(buf,0,i);
		}

		return os.toString("utf8");

	}
}
