package com.stripe;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import org.junit.Before;
import org.junit.BeforeClass;
import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static org.mockito.Mockito.*;

public class BaseStripeTest {
	public static Map<String, Object> defaultCardParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultSourceParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultDebitCardParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultChargeParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultCustomerParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultPlanParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultCouponParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultTokenParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultDebitTokenParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultBankAccountParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultRecipientParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultBitcoinReceiverParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultAlipayTokenParams = new HashMap<String, Object>();
	public static Map<String, Object> defaultManagedAccountParams = new HashMap<String, Object>();
	public static RequestOptions supportedRequestOptions;
	public static StripeResponseGetter networkMock;


	public static String getYear() {
		Date date = new Date(); //Get current date
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR) + 1 +"";
	}

	public static <T> void verifyGet(
			Class<T> clazz,
			String url) throws StripeException {
		verifyRequest(APIResource.RequestMethod.GET, clazz, url, null,
				APIResource.RequestType.NORMAL, RequestOptions.getDefault());
	}

	public static <T> void verifyGet(
			Class<T> clazz,
			String url,
			Map<String, Object> params) throws StripeException {
		verifyRequest(APIResource.RequestMethod.GET, clazz, url, params,
				APIResource.RequestType.NORMAL, RequestOptions.getDefault());
	}

	public static <T> void verifyGet(
			Class<T> clazz,
			String url,
			RequestOptions requestOptions) throws StripeException {
		verifyRequest(APIResource.RequestMethod.GET, clazz, url, null,
				APIResource.RequestType.NORMAL, requestOptions);
	}

	public static <T> void verifyGet(
			Class<T> clazz,
			String url,
			Map<String, Object> params,
			RequestOptions requestOptions) throws StripeException {
		verifyRequest(APIResource.RequestMethod.GET, clazz, url, params,
				APIResource.RequestType.NORMAL, requestOptions);
	}

	public static <T> void verifyPost(
			Class<T> clazz,
			String url) throws StripeException {
		verifyRequest(APIResource.RequestMethod.POST, clazz, url, null,
				APIResource.RequestType.NORMAL, RequestOptions.getDefault());
	}

	public static <T> void verifyPost(
			Class<T> clazz,
			String url,
			Map<String, Object> params) throws StripeException {
		verifyRequest(APIResource.RequestMethod.POST, clazz, url, params,
				APIResource.RequestType.NORMAL, RequestOptions.getDefault());
	}

	public static <T> void verifyPost(
			Class<T> clazz,
			String url,
			RequestOptions requestOptions) throws StripeException {
		verifyRequest(APIResource.RequestMethod.POST, clazz, url, null,
				APIResource.RequestType.NORMAL, requestOptions);
	}

	public static <T> void verifyPost(
			Class<T> clazz,
			String url,
			Map<String, Object> params,
			RequestOptions requestOptions) throws StripeException {
		verifyRequest(APIResource.RequestMethod.POST, clazz, url, params,
				APIResource.RequestType.NORMAL, requestOptions);
	}

	public static <T> void verifyDelete(
			Class<T> clazz,
			String url) throws StripeException {
		verifyRequest(APIResource.RequestMethod.DELETE, clazz, url, null,
				APIResource.RequestType.NORMAL, RequestOptions.getDefault());
	}

	public static <T> void verifyRequest(
			APIResource.RequestMethod method,
			Class<T> clazz,
			String url,
			Map<String, Object> params,
			APIResource.RequestType requestType,
			RequestOptions options) throws StripeException {
		verify(networkMock).request(
				eq(method),
				eq(url),
				argThat(new ParamMapMatcher(params)),
				eq(clazz),
				eq(requestType),
				argThat(new RequestOptionsMatcher(options)));
	}

	public static <T> void stubNetwork(Class<T> clazz, String response) throws StripeException {
		when(networkMock.request(
					Mockito.any(APIResource.RequestMethod.class),
					Mockito.anyString(),
					Mockito.<Map<String, Object>>any(),
					Mockito.<Class<T>>any(),
					Mockito.any(APIResource.RequestType.class),
					Mockito.any(RequestOptions.class))).thenReturn(APIResource.GSON.fromJson(response, clazz));
	}

	public static class ParamMapMatcher extends ArgumentMatcher<Map<String, Object>> {
		private Map<String, Object> other;

		public ParamMapMatcher(Map<String, Object> other) {
			this.other = other;
		}

		/* Treat null references as equal to empty maps */
		public boolean matches(Object obj) {
			if (obj == null) {
				return this.other == null || this.other.isEmpty();
			} else if (obj instanceof Map) {
				Map<String, Object> paramMap = (Map<String, Object>) obj;
				if (this.other == null) {
					return paramMap.isEmpty();
				} else {
					return this.other.equals(paramMap);
				}
			} else {
				return false;
			}
		}
	}

	public static class RequestOptionsMatcher extends ArgumentMatcher<RequestOptions> {
		private RequestOptions other;

		public RequestOptionsMatcher(RequestOptions other) {
			this.other = other;
		}

		/* Treat null reference as RequestOptions.getDefault() */
		public boolean matches(Object obj) {
			RequestOptions defaultOptions = RequestOptions.getDefault();
			if (obj == null) {
				return this.other == null || this.other.equals(defaultOptions);
			} else if (obj instanceof RequestOptions) {
				RequestOptions requestOptions = (RequestOptions) obj;
				if (this.other == null) {
					return requestOptions.equals(defaultOptions);
				} else {
					return this.other.equals(requestOptions);
				}
			} else {
				return false;
			}
		}
	}

	@BeforeClass
	public static void setUp() {
		Stripe.apiKey = "tGN0bIwXnHdwOa85VABjPdSn8nWY7G7I"; // stripe public
		// test key

		supportedRequestOptions = RequestOptions.builder().setStripeVersion("2015-02-16").build();

		defaultCardParams.put("number", "4242424242424242");
		defaultCardParams.put("exp_month", 12);
		defaultCardParams.put("exp_year", getYear());
		defaultCardParams.put("cvc", "123");
		defaultCardParams.put("name", "J Bindings Cardholder");
		defaultCardParams.put("address_line1", "140 2nd Street");
		defaultCardParams.put("address_line2", "4th Floor");
		defaultCardParams.put("address_city", "San Francisco");
		defaultCardParams.put("address_zip", "94105");
		defaultCardParams.put("address_state", "CA");
		defaultCardParams.put("address_country", "USA");

		defaultSourceParams = new HashMap<String, Object>(defaultCardParams);
		defaultSourceParams.put("object", "card");

		defaultDebitCardParams.put("number", "4000056655665556");
		defaultDebitCardParams.put("exp_month", 12);
		defaultDebitCardParams.put("exp_year", getYear());
		defaultDebitCardParams.put("cvc", "123");
		defaultDebitCardParams.put("name", "J Bindings Debitholder");
		defaultDebitCardParams.put("address_line1", "140 2nd Street");
		defaultDebitCardParams.put("address_line2", "4th Floor");
		defaultDebitCardParams.put("address_city", "San Francisco");
		defaultDebitCardParams.put("address_zip", "94105");
		defaultDebitCardParams.put("address_state", "CA");
		defaultDebitCardParams.put("address_country", "USA");

		defaultChargeParams.put("amount", 100);
		defaultChargeParams.put("currency", "usd");
		defaultChargeParams.put("card", defaultCardParams);

		defaultTokenParams.put("card", defaultCardParams);
		defaultDebitTokenParams.put("card", defaultDebitCardParams);

		defaultCustomerParams.put("card", defaultCardParams);
		defaultCustomerParams.put("description", "J Bindings Customer");

		defaultPlanParams.put("amount", 100);
		defaultPlanParams.put("currency", "usd");
		defaultPlanParams.put("interval", "month");
		defaultPlanParams.put("interval_count", 2);
		defaultPlanParams.put("name", "J Bindings Plan");

		defaultCouponParams.put("duration", "once");
		defaultCouponParams.put("percent_off", 10);

		defaultBankAccountParams.put("country", "US");
		defaultBankAccountParams.put("routing_number", "110000000");
		defaultBankAccountParams.put("account_number", "000123456789");
		defaultBankAccountParams.put("account_holder_name", "Test Holder");
		defaultBankAccountParams.put("account_holder_type", "individual");

		defaultRecipientParams.put("name", "J Test");
		defaultRecipientParams.put("type", "individual");
		defaultRecipientParams.put("tax_id", "000000000");
		defaultRecipientParams.put("bank_account", defaultBankAccountParams);
		defaultRecipientParams.put("card", defaultDebitCardParams);

		defaultBitcoinReceiverParams.put("amount", 100);
		defaultBitcoinReceiverParams.put("currency", "usd");
		defaultBitcoinReceiverParams.put("description", "some details");
		defaultBitcoinReceiverParams.put("email", "do+fill_now@stripe.com");

		Map<String, Object> alipayParams = new HashMap<String, Object>();
		alipayParams.put("reusable", true);
		alipayParams.put("alipay_username", "stripe+alipay");
		defaultAlipayTokenParams.put("alipay_account", alipayParams);
		defaultAlipayTokenParams.put("email", "alipay+account@stripe.com");

		defaultManagedAccountParams.put("managed", true);
		defaultManagedAccountParams.put("country", "US");
		defaultManagedAccountParams.put("default_currency", "usd");
	}

	@Before
	public void setUpMock() {
		networkMock = mock(StripeResponseGetter.class);
	}

	protected String resource(String path) throws IOException {
		InputStream resource = getClass().getResourceAsStream(path);

		ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
		byte[] buf = new byte [1024];

		for( int i = resource.read(buf); i > 0; i = resource.read(buf)) {
			os.write(buf,0,i);
		}

		return os.toString("utf8");

	}
}
