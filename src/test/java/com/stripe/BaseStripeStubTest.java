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

	@Before
	public void setUpStripeStub() {
		Stripe.apiKey = "sk_test_myValidKey";
		this.oldApiBase = Stripe.getApiBase();
		Stripe.overrideApiBase("http://localhost:"+stubPort);
	}

	@After
	public void tearDownStripeStub() {
		Stripe.overrideApiBase(this.oldApiBase);
	}

	protected static String getDataAt(String data, String field) {
		Gson gson = new Gson();
		Type type = new TypeToken<Map<String, Object>>(){}.getType();
		Map<String, Object> map = gson.fromJson(data, type);
		Object value = map.get(field);
		return gson.toJson(value);
	}

	protected static String getFixture(String path) throws Exception, IOException, MalformedURLException, ProtocolException {
		return getFixture(path, null);
	}

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
