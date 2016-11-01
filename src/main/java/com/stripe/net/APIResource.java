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
import com.stripe.model.ExpandableField;
import com.stripe.model.ExpandableFieldDeserializer;
import com.stripe.model.ExternalAccountTypeAdapterFactory;
import com.stripe.model.FeeRefundCollection;
import com.stripe.model.FeeRefundCollectionDeserializer;
import com.stripe.model.HasId;
import com.stripe.model.Source;
import com.stripe.model.SourceDeserializer;
import com.stripe.model.StripeCollectionInterface;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.StripeRawJsonObjectDeserializer;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

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
			.registerTypeAdapter(Source.class, new SourceDeserializer())
			.registerTypeAdapter(ExpandableField.class, new ExpandableFieldDeserializer())
			.registerTypeAdapterFactory(new ExternalAccountTypeAdapterFactory())
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
		} else if (className.equals("countryspec")) {
			return "country_spec";
		} else if (className.equals("orderreturn")) {
			return "order_return";
		} else if (className.equals("threedsecure")) {
			return "three_d_secure";
		} else if (className.equals("applepaydomain")) {
			return "apple_pay_domain";
		} else if (className.equals("subscriptionitem")) {
			return "subscription_item";
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
					null, null, 0, e);
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

	public static <T> T multipartRequest(APIResource.RequestMethod method,
			String url, Map<String, Object> params, Class<T> clazz,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return APIResource.stripeResponseGetter.request(method, url, params, clazz,
				APIResource.RequestType.MULTIPART, options);
	}

	public static <T> T request(APIResource.RequestMethod method,
			String url, Map<String, Object> params, Class<T> clazz,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return APIResource.stripeResponseGetter.request(method, url, params, clazz,
				APIResource.RequestType.NORMAL, options);
	}

	/**
	 * Similar to #request, but specific for use with collection types that
	 * come from the API (i.e. lists of resources).
	 *
	 * Collections need a little extra work because we need to plumb request
	 * options and params through so that we can iterate to the next page if
	 * necessary.
	 */
	public static <T extends StripeCollectionInterface> T requestCollection(
			String url, Map<String, Object> params, Class<T> clazz,
			RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		T collection = request(RequestMethod.GET, url, params, clazz, options);

		if (collection != null) {
			collection.setRequestOptions(options);
			collection.setRequestParams(params);
		}

		return collection;
	}

	/**
	 *  When setting a String ID for an ExpandableField, we need to be careful about keeping the String ID and the
	 *  expanded object in sync. If they specify a new String ID that is different from the ID within the expanded object,
	 *  we don't keep the object.
	 */
	public static <T extends HasId> ExpandableField<T> setExpandableFieldID(String newId, ExpandableField<T> currentObject) {
		if (currentObject == null || (currentObject.isExpanded() && (currentObject.getId() != newId))) {
			return new ExpandableField<T>(newId, null);
		}

		return new ExpandableField<T>(newId, currentObject.getExpanded());
	}
}
