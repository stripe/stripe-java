package com.stripe.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import com.google.gson.Gson;
import com.stripe.datamodel.Charge;
import com.stripe.datamodel.Customer;
import com.stripe.datamodel.DeleteResponse;
import com.stripe.datamodel.Invoice;
import com.stripe.datamodel.InvoiceItem;
import com.stripe.datamodel.StripeErrorResponse;
import com.stripe.datamodel.Subscription;
import com.stripe.exceptions.StripeBadRequestException;
import com.stripe.exceptions.StripeException;
import com.stripe.exceptions.StripeNotFoundException;
import com.stripe.exceptions.StripeRequestFailedException;
import com.stripe.exceptions.StripeServerErrorException;
import com.stripe.exceptions.StripeUnauthorizedException;

public class StripeClient {

	protected static final String ENDPOINT = "api.stripe.com";
	protected static final String PROTOCOL = "https";
	protected static final String BASEPATH = "/v1/";
	protected static String key = "";

	protected static Gson gson = new Gson();

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
		String response = makeRequest("charges/" + id + "/refund", "POST", null,
				null);
		return gson.fromJson(response, Charge.class);
	}

	public static Charge[] getCharges() throws Exception {
		return getCharges(10, 0);
	}

	public static Charge[] getCharges(int count, int offset) throws Exception {
		return getCharges(count, offset, null);
	}

	public static Charge[] getCharges(int count, int offset, String customer)
			throws Exception {
		String[] params = { "count", "offset", "customer" };
		String[] values = { count + "", offset + "", customer };
		String response = makeRequest("charges", "GET", params, values);
		return gson.fromJson(response, Charge[].class);
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
		String[] values = { coupon, email, description, plan, trialEnd == null ? null : trialEnd + "" ,
				cardNumber, cardExpMonth, cardExpYear, cardCVC, cardName,
				cardAddressLine1, cardAddressLine2, cardAddressState,
				cardAddressZip, cardAddressCountry };
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

	public static Customer[] getCustomers() throws Exception {
		return getCustomers(10, 0);
	}

	public static Customer[] getCustomers(int count, int offset)
			throws Exception {
		String[] params = { "count", "offset" };
		String[] values = { count + "", offset + "" };
		String response = makeRequest("customers", "GET", params, values);
		return gson.fromJson(response, Customer[].class);
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

	public static InvoiceItem[] getInvoiceItems(String customer)
			throws Exception {
		return getInvoiceItems(customer, 10, 0);
	}

	public static InvoiceItem[] getInvoiceItems(int count, int offset)
			throws Exception {
		return getInvoiceItems(null, count, offset);
	}

	public static InvoiceItem[] getInvoiceItems(String customer, int count,
			int offset) throws Exception {
		String[] params = { "customer", "count", "offset" };
		String[] values = { customer, count + "", offset + "" };
		String response = makeRequest("invoiceitems", "GET", params, values);
		return gson.fromJson(response, InvoiceItem[].class);
	}

	public static Invoice getInvoice(String id) throws Exception {
		String response = makeRequest("invoices/" + id, "GET", null, null);
		return gson.fromJson(response, Invoice.class);
	}

	public static Invoice[] getInvoices(String customer) throws Exception {
		return getInvoices(customer, 10, 0);
	}

	public static Invoice[] getInvoices(int count, int offset) throws Exception {
		return getInvoices(null, count, offset);
	}

	public static Invoice[] getInvoices(String customer, int count, int offset)
			throws Exception {
		String[] params = { "customer", "count", "offset" };
		String[] values = { customer, count + "", offset + "" };
		String response = makeRequest("invoiceitems", "GET", params, values);
		return gson.fromJson(response, Invoice[].class);
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
		String response = null;
		if(params != null && values != null){
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
		String ret = null;

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();		
		
		conn.setRequestProperty("Authorization", "Basic " + key);
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
			StripeErrorResponse err = gson.fromJson(ret, StripeErrorResponse.class);
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
