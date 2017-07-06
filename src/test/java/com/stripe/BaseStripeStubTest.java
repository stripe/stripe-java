package com.stripe;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.*;

public class BaseStripeStubTest {
	private String oldApiBase;
	private static String stubPort;

	/**
	 * Checks that STRIPE_STUB_PORT is specified in the environment and that
	 * the stub is online by making a sample request. If either isn't true, an
	 * exception is thrown and the test suite stops.
	 */
	@BeforeClass
	public static void checkStripeStubPort() throws Exception {
		stubPort = System.getenv().get("STRIPE_STUB_PORT");
		if (stubPort == null) {
			throw new RuntimeException(
				"Please specify STRIPE_STUB_PORT. See README for setup instructions."
			);
		}

		try {
			String _data = getFixture("/v1/charges/ch_123");
		} catch (IOException _e) {
			throw new RuntimeException(
				"Couldn't reach Stripe stub server at `localhost:" + stubPort + "`. Is it running? Please see README for setup instructions."
			);
		}
	}

	/**
	 * Activates stripestub by overriding the API host and putting a test key
	 * into the environment.
	 */
	@Before
	public void setUpStripeStub() {
		Stripe.apiKey = "sk_test_myValidKey";
		this.oldApiBase = Stripe.getApiBase();
		Stripe.overrideApiBase("http://localhost:"+stubPort);
	}

	/**
	 * Deactivates stripestub by returning the API host to whatever it was
	 * before stripestub was activated.
	 */
	@After
	public void tearDownStripeStub() {
		Stripe.overrideApiBase(this.oldApiBase);
	}

	/**
	 * Convenience method that extracts a subset of JSON data and returns it.
	 *
	 * <p>For example, if I know that my charge object has a customer under it,
	 * I can pass my charge JSON data and specify {@code field} as {@code
	 * customer}. This returns everything that had been under the {@code
	 * customer} key (encoded as JSON).
	 *
	 * @param data JSON encoded data.
	 * @param field Field under data which to extract.
	 * @return Extracted JSON encoded data.
	 */
	protected static String getDataAt(String data, String field) {
		Gson gson = new Gson();
		Type type = new TypeToken<Map<String, Object>>(){}.getType();
		Map<String, Object> map = gson.fromJson(data, type);
		Object value = map.get(field);
		return gson.toJson(value);
	}

	/**
	 * Gets fixture data from stripestub for a resource expected to be at the
	 * given API path. stripestub ignores whether IDs are actually valid, so
	 * it's only important to make sure that the route exists, rather than the
	 * actual resource. It's common to use a symbolic ID stand-in like {@code
	 * ch_123}.
	 *
	 * <pre>
	 * getFixture("/v1/charges/ch_123")
	 * </pre>
	 *
	 * @param path API path to use to get a fixture for stripestub.
	 * @return Fixture data encoded as JSON.
	 */
	protected static String getFixture(String path) throws Exception, IOException, MalformedURLException, ProtocolException {
		return getFixture(path, null);
	}

	/**
	 * Gets fixture data with expansions specified. Expansions are specified
	 * the same way as they are in the normal API like {@code customer} or
	 * {@code data.customer}. Use the special {@code *} character to specify
	 * that all fields should be expanded.
	 *
	 * @param path API path to use to get a fixture for stripestub.
	 * @param expansions Set of expansions that should be applied.
	 * @return Fixture data encoded as JSON.
	 */
	protected static String getFixture(String path, String[] expansions) throws Exception, IOException, MalformedURLException, ProtocolException {
		StringBuffer urlStringBuffer = new StringBuffer();
		urlStringBuffer.append("http://localhost:"+stubPort+path);

		if (expansions != null) {
			urlStringBuffer.append("?");
			for (String expansion : expansions) {
				urlStringBuffer.append("expand[]=");
				urlStringBuffer.append(expansion);
				urlStringBuffer.append("&");
			}
		}
		URL url = new URL(urlStringBuffer.toString());

		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");

		// This is the line that actually triggers the request.
		int status = conn.getResponseCode();

		if (status != 200) {
			throw new Exception("Couldn't reach stub.");
		}

		return readUntilEnd(conn.getInputStream());
	}

	private static String readUntilEnd(InputStream inputStream) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		try {
			StringBuffer buffer = new StringBuffer();
			String line;
			while ((line = reader.readLine()) != null) {
			  buffer.append(line);
			  buffer.append('\r');
			}
			return buffer.toString();
		} finally {
			reader.close();
		}
	}
}
