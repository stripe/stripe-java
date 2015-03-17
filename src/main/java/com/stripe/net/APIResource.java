package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.ChargeRefundCollection;
import com.stripe.model.ChargeRefundCollectionDeserializer;
import com.stripe.model.Dispute;
import com.stripe.model.DisputeDataDeserializer;
import com.stripe.model.EventData;
import com.stripe.model.EventDataDeserializer;
import com.stripe.model.FeeRefundCollection;
import com.stripe.model.FeeRefundCollectionDeserializer;
import com.stripe.model.PaymentSource;
import com.stripe.model.PaymentSourceDeserializer;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.StripeRawJsonObjectDeserializer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class APIResource extends StripeObject {
	private static StripeResponseGetter stripeResponseGetter = new LiveStripeResponseGetter();

	public static void setStripeResponseGetter(StripeResponseGetter srg) {
		APIResource.stripeResponseGetter = srg;
	}

	public static final Gson GSON = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.registerTypeAdapter(EventData.class, new EventDataDeserializer())
			.registerTypeAdapter(ChargeRefundCollection.class, new ChargeRefundCollectionDeserializer())
			.registerTypeAdapter(FeeRefundCollection.class, new FeeRefundCollectionDeserializer())
			.registerTypeAdapter(StripeRawJsonObject.class, new StripeRawJsonObjectDeserializer())
			.registerTypeAdapter(Dispute.class, new DisputeDataDeserializer())
			.registerTypeAdapter(PaymentSource.class, new PaymentSourceDeserializer())
			.create();

	private static String className(Class<?> clazz) {
		String className = clazz.getSimpleName().toLowerCase().replace("$", " ");

		// TODO: Delurk this, with invoiceitem being a valid url, we can't get too
		// fancy yet.
		if (className.equals("applicationfee")) {
			return "application_fee";
		} else if (className.equals("fileupload")) {
			return "file";
		} else if (className.equals("bitcoinreceiver")) {
			return "bitcoin_receiver";
		} else {
			return className;
		}
	}

	protected static String singleClassURL(Class<?> clazz) {
		return singleClassURL(clazz, Stripe.getApiBase());
	}

	protected static String singleClassURL(Class<?> clazz, String apiBase) {
		return String.format("%s/v1/%s", apiBase, className(clazz));
	}

	protected static String classURL(Class<?> clazz) {
		return classURL(clazz, Stripe.getApiBase());
	}

	protected static String classURL(Class<?> clazz, String apiBase) {
		return String.format("%ss", singleClassURL(clazz, apiBase));
	}

	protected static String instanceURL(Class<?> clazz, String id)
			throws InvalidRequestException {
		return instanceURL(clazz, id, Stripe.getApiBase());
	}

	protected static String instanceURL(Class<?> clazz, String id, String apiBase)
			throws InvalidRequestException {
		try {
			return String.format("%s/%s", classURL(clazz, apiBase), urlEncode(id));
		} catch (UnsupportedEncodingException e) {
			throw new InvalidRequestException("Unable to encode parameters to "
					+ CHARSET
					+ ". Please contact support@stripe.com for assistance.",
					null, e);
		}
	}

	public static final String CHARSET = "UTF-8";

	public enum RequestMethod {
		GET, POST, DELETE
	}

	public enum RequestType {
		NORMAL, MULTIPART
	}

	public static String urlEncode(String str) throws UnsupportedEncodingException {
		// Preserve original behavior that passing null for an object id will lead
		// to us actually making a request to /v1/foo/null
		if (str == null) {
			return null;
		}
		else {
			return URLEncoder.encode(str, CHARSET);
		}
	}

	protected static <T> T multipartRequest(APIResource.RequestMethod method,
			String url, Map<String, Object> params, Class<T> clazz,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return APIResource.stripeResponseGetter.request(method, url, params, clazz,
				APIResource.RequestType.MULTIPART, options);
	}

	protected static <T> T request(APIResource.RequestMethod method,
			String url, Map<String, Object> params, Class<T> clazz,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return APIResource.stripeResponseGetter.request(method, url, params, clazz,
				APIResource.RequestType.NORMAL, options);
	}
}
