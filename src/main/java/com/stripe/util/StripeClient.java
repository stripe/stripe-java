package com.stripe.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;
import com.stripe.exception.StripeBadRequestException;
import com.stripe.exception.StripeException;
import com.stripe.exception.StripeNotFoundException;
import com.stripe.exception.StripeRequestFailedException;
import com.stripe.exception.StripeServerErrorException;
import com.stripe.exception.StripeUnauthorizedException;
import com.stripe.model.Charge;
import com.stripe.model.ChargeResult;
import com.stripe.model.Customer;
import com.stripe.model.CustomerResult;
import com.stripe.model.DeleteResponse;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceItem;
import com.stripe.model.InvoiceItemResult;
import com.stripe.model.InvoiceResult;
import com.stripe.model.StripeErrorResponse;
import com.stripe.model.Subscription;

public class StripeClient {

	public static final String BUILD = getGitCommitId();

	protected static final String ENDPOINT = "api.stripe.com";
	protected static final String PROTOCOL = "https";
	protected static final String BASEPATH = "/v1/";

	protected static String key = "";

	protected static Gson gson = new Gson();
	
	public static String base64(String in) {
		return new String(Base64.encodeToString(in.getBytes(), false));
	}

	private static String getGitCommitId() {
		String result = "?";
		Properties gitProperties = new Properties();
		InputStream resource = StripeClient.class
				.getResourceAsStream("/git.properties");

		if (null != resource) {
			try {
				gitProperties.load(resource);
				result = gitProperties.getProperty("git.commit.id.abbrev",
						"?");
			} catch (IOException e) {
				// Fail silently.
			}
		}

		return result;
	}

	public static Charge newCharge(long amount, String currency,
			String customer, String card) throws Exception {
		String[] params = { "amount", "currency", "customer", "card" };
		String[] values = { amount + "", currency, customer, card };
		String response = makeRequest("charges", "POST", params, values);
		return gson.fromJson(response, Charge.class);
	}

	public static Charge newCharge(long amount, String currency,
			String cardNumber, String cardExpMonth, String cardExpYear,
			String cardCVC, String cardName, String cardAddressLine1,
			String cardAddressLine2, String cardAddressZip,
			String cardAddressState, String cardAddressCountry)
			throws Exception {
		String[] params = { "amount", "currency", "card[number]",
				"card[exp_month]", "card[exp_year]", "card[cvc]", "card[name]",
				"card[address_line1]", "card[address_line2]",
				"card[address_state]", "card[address_zip]",
				"card[address_country]" };
		String[] values = { amount + "", currency, cardNumber, cardExpMonth,
				cardExpYear, cardCVC, cardName, cardAddressLine1,
				cardAddressLine2, cardAddressState, cardAddressZip,
				cardAddressCountry };
		String response = makeRequest("charges", "POST", params, values);
		return gson.fromJson(response, Charge.class);
	}

	public static Charge getCharge(String id) throws Exception {
		String response = makeRequest("charges/" + id, "GET", null, null);
		return gson.fromJson(response, Charge.class);
	}

	public static Charge refundCharge(String id) throws Exception {
		String response = makeRequest("charges/" + id + "/refund", "POST",
				null, null);
		return gson.fromJson(response, Charge.class);
	}

	public static ChargeResult getCharges() throws Exception {
		return getCharges(10, 0);
	}

	public static ChargeResult getCharges(int count, int offset) throws Exception {
		return getCharges(count, offset, null);
	}

	public static ChargeResult getCharges(int count, int offset, String customer)
			throws Exception {
		String[] params = { "count", "offset", "customer" };
		String[] values = { count + "", offset + "", customer };
		String response = makeRequest("charges", "GET", params, values);
		return gson.fromJson(response, ChargeResult.class);
	}

	public static Customer newCustomer(String email, String description)
			throws Exception {
		return newCustomer(null, email, description, null, null);
	}

	public static Customer newCustomer(String coupon, String email,
			String description) throws Exception {
		return newCustomer(coupon, email, description, null, null);
	}

	public static Customer newCustomer(String coupon, String email,
			String description, String plan, Long trialEnd) throws Exception {
		return newCustomer(coupon, email, description, plan, trialEnd, null,
				null, null, null, null, null, null, null, null, null);
	}

	public static Customer newCustomer(String coupon, String email,
			String description, String plan, Long trialEnd, String cardNumber,
			String cardExpMonth, String cardExpYear, String cardCVC,
			String cardName, String cardAddressLine1, String cardAddressLine2,
			String cardAddressZip, String cardAddressState,
			String cardAddressCountry) throws Exception {
		String[] params = { "coupon", "email", "description", "plan",
				"trial_end", "card[number]", "card[exp_month]",
				"card[exp_year]", "card[cvc]", "card[name]",
				"card[address_line1]", "card[address_line2]",
				"card[address_state]", "card[address_zip]",
				"card[address_country]" };
		String[] values = { coupon, email, description, plan,
				trialEnd == null ? null : trialEnd + "", cardNumber,
				cardExpMonth, cardExpYear, cardCVC, cardName, cardAddressLine1,
				cardAddressLine2, cardAddressState, cardAddressZip,
				cardAddressCountry };
		String response = makeRequest("customers", "POST", params, values);
		return gson.fromJson(response, Customer.class);
	}

	public static Customer getCustomer(String id) throws Exception {
		String response = makeRequest("customers/" + id, "GET", null, null);
		return gson.fromJson(response, Customer.class);
	}

	public static Customer updateCustomer(String id, String[] fields,
			String[] values) throws Exception {
		String response = makeRequest("customers/" + id, "POST", fields, values);
		return gson.fromJson(response, Customer.class);
	}

	public static DeleteResponse deleteCustomer(String id) throws Exception {
		String response = makeRequest("customers/" + id, "DELETE", null, null);
		return gson.fromJson(response, DeleteResponse.class);
	}

	public static CustomerResult getCustomers() throws Exception {
		return getCustomers(10, 0);
	}

	public static CustomerResult getCustomers(int count, int offset)
			throws Exception {
		String[] params = { "count", "offset" };
		String[] values = { count + "", offset + "" };
		String response = makeRequest("customers", "GET", params, values);
		return gson.fromJson(response, CustomerResult.class);
	}

	public static Subscription updateSubscription(String customer, String plan,
			String coupon, Boolean prorate, Long trialEnd, String cardNumber,
			String cardExpMonth, String cardExpYear, String cardCVC,
			String cardName, String cardAddressLine1, String cardAddressLine2,
			String cardAddressZip, String cardAddressState,
			String cardAddressCountry) throws Exception {
		String[] params = { "plan", "coupon", "prorate", "trial_end",
				"card[exp_month]", "card[exp_year]", "card[cvc]", "card[name]",
				"card[address_line1]", "card[address_line2]",
				"card[address_state]", "card[address_zip]",
				"card[address_country]" };
		String[] values = { plan, coupon, prorate.toString(), trialEnd + "",
				cardNumber, cardExpMonth, cardExpYear, cardCVC, cardName,
				cardAddressLine1, cardAddressLine2, cardAddressState,
				cardAddressZip, cardAddressCountry };
		String response = makeRequest(
				"customers/" + customer + "/subscription", "POST", params,
				values);
		return gson.fromJson(response, Subscription.class);
	}

	public static Subscription cancelSubscription(String customer,
			Boolean atPeriodEnd) throws Exception {
		String[] params = { "at_period_end" };
		String[] values = { atPeriodEnd.toString() };
		String response = makeRequest(
				"customers/" + customer + "/subscription", "DELETE", params,
				values);
		return gson.fromJson(response, Subscription.class);
	}

	public static InvoiceItem createInvoiceItem(String customer, long amount,
			String currency, String description) throws Exception {
		String[] params = { "customer", "amount", "currency", "description" };
		String[] values = { customer, amount + "", currency, description };
		String response = makeRequest("invoiceitems", "POST", params, values);
		return gson.fromJson(response, InvoiceItem.class);
	}

	public static InvoiceItem getInvoiceItem(String id) throws Exception {
		String response = makeRequest("invoiceitems/" + id, "GET", null, null);
		return gson.fromJson(response, InvoiceItem.class);
	}

	public static InvoiceItem updateInvoiceItem(String id, long amount,
			String currency, String description) throws Exception {
		String[] params = { "amount", "currency", "description" };
		String[] values = { amount + "", currency, description };
		String response = makeRequest("invoiceitems/" + id, "POST", params,
				values);
		return gson.fromJson(response, InvoiceItem.class);
	}

	public static InvoiceItem deleteInvoiceItem(String id) throws Exception {
		String response = makeRequest("invoiceitems/" + id, "DELETE", null,
				null);
		return gson.fromJson(response, InvoiceItem.class);
	}

	public static InvoiceItemResult getInvoiceItems(String customer)
			throws Exception {
		return getInvoiceItems(customer, 10, 0);
	}

	public static InvoiceItemResult getInvoiceItems(int count, int offset)
			throws Exception {
		return getInvoiceItems(null, count, offset);
	}

	public static InvoiceItemResult getInvoiceItems(String customer, int count,
			int offset) throws Exception {
		String[] params = { "customer", "count", "offset" };
		String[] values = { customer, count + "", offset + "" };
		String response = makeRequest("invoiceitems", "GET", params, values);
		return gson.fromJson(response, InvoiceItemResult.class);
	}

	public static Invoice getInvoice(String id) throws Exception {
		String response = makeRequest("invoices/" + id, "GET", null, null);
		return gson.fromJson(response, Invoice.class);
	}

	public static InvoiceResult getInvoices(String customer) throws Exception {
		return getInvoices(customer, 10, 0);
	}

	public static InvoiceResult getInvoices(int count, int offset) throws Exception {
		return getInvoices(null, count, offset);
	}

	public static InvoiceResult getInvoices(String customer, int count, int offset)
			throws Exception {
		String[] params = { "customer", "count", "offset" };
		String[] values = { customer, count + "", offset + "" };
		String response = makeRequest("invoiceitems", "GET", params, values);
		return gson.fromJson(response, InvoiceResult.class);
	}

	public static Invoice getUpcomingInvoice(String customer) throws Exception {
		String[] params = { "customer" };
		String[] values = { customer };
		String response = makeRequest("invoices/upcoming", "GET", params,
				values);
		return gson.fromJson(response, Invoice.class);
	}

	public static void setKey(String aKey) {
		key = aKey;
	}

	public static String makeRequest(String path, String method,
			String[] params, String[] values) throws Exception {
		String query = "";
		String data = "";
		if (params != null && values != null) {
			for (int i = 0; i < params.length; i++) {
				if (values[i] != null) {
					if (method == "POST") {
						data += "&" + params[i] + "=" + values[i];
					} else {
						query += "&" + params[i] + "=" + values[i];
					}
				}
			}
		}
		URI uri = new URI(PROTOCOL, ENDPOINT, BASEPATH + path, query, null);
		URL url = uri.toURL();

		return makeTheRequest(url, method, data);
	}

	protected static String makeTheRequest(URL url, String method, String data)
			throws Exception {
		
		if(key == null || key == "") {
		      throw new Exception("No API key provided.  (HINT: set your API key using \"StripeClient.setKey(<API-KEY>)\". You can get your API keys from the Stripe web interface. See https://stripe.com/api for details or email support@stripe.com if you have any questions.");
		}
		String ret = null;

		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

		conn.setRequestProperty("Authorization", "Basic " + base64(key));
		conn.setRequestProperty("User-Agent", "Stripe/v1 Java Bindings/0.1");
		conn.setRequestMethod(method);
		conn.setUseCaches(false);

		if (method == "POST") {
			conn.setDoOutput(true);
			OutputStreamWriter osw = new OutputStreamWriter(
					conn.getOutputStream());
			osw.write(data);
			osw.close();
		} else {
			conn.connect();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));

		String line;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		ret = sb.toString();

		if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
			Gson gson = new Gson();
			StripeErrorResponse err = gson.fromJson(ret,
					StripeErrorResponse.class);
			StripeException ex = new StripeException();
			switch (conn.getResponseCode()) {
			case HttpURLConnection.HTTP_BAD_REQUEST:
				ex = new StripeBadRequestException();
				break;
			case HttpURLConnection.HTTP_UNAUTHORIZED:
				ex = new StripeUnauthorizedException();
				break;
			case HttpURLConnection.HTTP_PAYMENT_REQUIRED:
				StripeRequestFailedException rex = new StripeRequestFailedException();
				rex.setType(err.error.type);
				rex.setCode(err.error.code);
				rex.setParam(err.error.param);
				ex = rex;
				break;
			case HttpURLConnection.HTTP_NOT_FOUND:
				ex = new StripeNotFoundException();
				break;
			case 500:
			case 502:
			case 503:
			case 504:
				ex = new StripeServerErrorException();
				break;
			}
			ex.setStatusCode(conn.getResponseCode());
			ex.setMessage(err.error.message);

			throw ex;
		}

		return ret;
	}

}
