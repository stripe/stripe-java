package com.stripe.model;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.params.SyncBasicHttpParams;
import org.apache.http.util.EntityUtils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.util.Base64;

public abstract class APIResource extends StripeObject {

	private static String className(Class<?> clazz) { return clazz.getSimpleName().toLowerCase().replace("$",""); }
	protected static String classURL(Class<?> clazz) { return String.format("%s/%ss", Stripe.API_BASE, className(clazz)); }
	protected static String instanceURL(Class<?> clazz, String id) { return String.format("%s/%s", classURL(clazz), id); }
	
	protected enum Method { GET, POST, DELETE }

	private static final Gson gson = new GsonBuilder().setFieldNamingPolicy(
			FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

	private static String base64(String in) {
		return new String(Base64.encodeToString(in.getBytes(), false));
	}

	private static String urlEncodePair(String k, String v) throws UnsupportedEncodingException {
		return String.format("%s=%s", URLEncoder.encode(k, Stripe.CHARSET), URLEncoder.encode(v, Stripe.CHARSET));
	}

	private static HttpUriRequest createGetRequest(String url, Map<String, String> flatParams) throws UnsupportedEncodingException {
		StringBuffer queryStringBuffer = new StringBuffer();
		for(Map.Entry<String, String> entry: flatParams.entrySet()) {
			queryStringBuffer.append("&");
			queryStringBuffer.append(urlEncodePair(entry.getKey(), entry.getValue()));
		}
		if (queryStringBuffer.length() > 0) queryStringBuffer.deleteCharAt(0);
		return new HttpGet(String.format("%s?%s", url, queryStringBuffer.toString()));
	}

	private static HttpUriRequest createPostRequest(String url,
			Map<String, String> flatParams) throws UnsupportedEncodingException {
		HttpPost request = new HttpPost(url);
		List<NameValuePair> postParamList = new ArrayList<NameValuePair>();
		for(Map.Entry<String, String> entry: flatParams.entrySet()) {
			postParamList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		request.setEntity(new UrlEncodedFormEntity(postParamList, Stripe.CHARSET));
		return request;
	}

	private static HttpUriRequest createDeleteRequest(String url) {
		return new HttpDelete(url);
	}

	private static Map<String, String> flattenParams(Map<String, Object> params) {
		if (params == null) { return new HashMap<String, String>(); }
		Map<String, String> flatParams = new HashMap<String, String>();
		for(Map.Entry<String, Object> entry: params.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			if(value instanceof Map<?, ?>) {
				Map<String, Object> flatNestedMap = new HashMap<String, Object>();
				Map<?, ?> nestedMap = (Map<?, ?>)value;
				for(Map.Entry<?, ?> nestedEntry: nestedMap.entrySet()) {
					flatNestedMap.put(String.format("%s[%s]", key, nestedEntry.getKey()), nestedEntry.getValue());
				}
				flatParams.putAll(flattenParams(flatNestedMap));
			} else if (value != null) {
				flatParams.put(key, value.toString());
			}
		}
		return flatParams;
	}


	private static DefaultHttpClient getHttpClient() throws AuthenticationException {
		if (Stripe.apiKey == null || Stripe.apiKey.isEmpty()) {
			throw new AuthenticationException("No API key provided. (HINT: set your API key using 'Stripe.apiKey = <API-KEY>'. " +
					"You can generate API keys from the Stripe web interface. " +
					"See https://stripe.com/api for details or email support@stripe.com if you have questions.");
		}

		//debug headers
		String[] propertyNames = {"os.name", "os.version", "os.arch", "java.version", "java.vendor", "java.vm.version", "java.vm.vendor"};
		Map<String, String> propertyMap = new HashMap<String, String>();
		for(String propertyName: propertyNames) {
			propertyMap.put(propertyName, System.getProperty(propertyName));
		}
		propertyMap.put("bindings.version", Stripe.VERSION);
		propertyMap.put("lang", "Java");
		propertyMap.put("publisher", "Stripe");

		Header[] requestHeaders = {
				new BasicHeader("X-Stripe-Client-User-Agent", gson.toJson(propertyMap)),
				new BasicHeader("User-Agent", String.format("Stripe/v1 JavaBindings/%s", Stripe.VERSION)),
				new BasicHeader("Authorization", String.format("Basic %s:", base64(Stripe.apiKey)))
		};

		HttpParams httpParams = new SyncBasicHttpParams().
				setParameter(ClientPNames.DEFAULT_HEADERS, Arrays.asList(requestHeaders)).
				setParameter(CoreProtocolPNames.HTTP_CONTENT_CHARSET, Stripe.CHARSET).
				setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,30000). //30 seconds
				setParameter(CoreConnectionPNames.SO_TIMEOUT,80000); //80 seconds

		return new DefaultHttpClient(httpParams);
	}

	//represents Errors returned as JSON
	private static class ErrorContainer {
		private APIResource.Error error;
	}

	private static class Error {
		@SuppressWarnings("unused")
		String type;
		String message;
		String code;
		String param;
	}

	protected static <T> T request(APIResource.Method method, String url, Map<String, Object> params, Class<T> clazz) throws StripeException {
		DefaultHttpClient client = getHttpClient();
		Map<String, String> flatParams = flattenParams(params);
		try {
			HttpUriRequest request = null;
			switch(method) {
			case GET: request = createGetRequest(url, flatParams); break;
			case POST: request = createPostRequest(url, flatParams); break;
			case DELETE: request = createDeleteRequest(url); break;
			default: throw new APIConnectionException(String.format("Unrecognized HTTP method %s. " +
					"This may indicate a bug in the Stripe bindings. Please contact " +
					"support@stripe.com for assistance.", method));
			}

			HttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			String rBody = EntityUtils.toString(entity);
			EntityUtils.consume(entity);
			int rCode = response.getStatusLine().getStatusCode();
			if (rCode < 200 || rCode >= 300) handleAPIError(rBody, rCode);
			return gson.fromJson(rBody, clazz);
		} catch (IOException e) {
			throw new APIConnectionException(String.format("Could not connect to Stripe (%s). " +
					"Please check your internet connection and try again. If this problem persists," +
					"you should check Stripe's service status at https://twitter.com/stripestatus," +
					" or let us know at support@stripe.com.", Stripe.API_BASE), e);
		} finally {
			client.getConnectionManager().shutdown();
		}
	}

	private static void handleAPIError(String rBody, int rCode) throws StripeException {
		APIResource.Error error = gson.fromJson(rBody, APIResource.ErrorContainer.class).error;
		switch(rCode) {
		case 400: throw new InvalidRequestException(error.message, error.param, null); 
		case 404: throw new InvalidRequestException(error.message, error.param, null);
		case 401: throw new AuthenticationException(error.message);
		case 402: throw new CardException(error.message, error.code, error.param, null);
		default: throw new APIException(error.message, null);
		}
	}
}