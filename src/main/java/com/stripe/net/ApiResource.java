package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionDeserializer;
import com.stripe.model.ChargeRefundCollection;
import com.stripe.model.ChargeRefundCollectionDeserializer;
import com.stripe.model.Dispute;
import com.stripe.model.DisputeDataDeserializer;
import com.stripe.model.EphemeralKey;
import com.stripe.model.EphemeralKeyDeserializer;
import com.stripe.model.EventData;
import com.stripe.model.EventDataDeserializer;
import com.stripe.model.EventRequest;
import com.stripe.model.EventRequestDeserializer;
import com.stripe.model.ExpandableField;
import com.stripe.model.ExpandableFieldDeserializer;
import com.stripe.model.ExternalAccountTypeAdapterFactory;
import com.stripe.model.FeeRefundCollection;
import com.stripe.model.FeeRefundCollectionDeserializer;
import com.stripe.model.HasId;
import com.stripe.model.OrderItem;
import com.stripe.model.OrderItemDeserializer;
import com.stripe.model.PaymentIntentSourceAction;
import com.stripe.model.PaymentIntentSourceActionDeserializer;
import com.stripe.model.Source;
import com.stripe.model.SourceMandateNotification;
import com.stripe.model.SourceTransaction;
import com.stripe.model.SourceTypeDataDeserializer;
import com.stripe.model.StripeCollectionInterface;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.StripeRawJsonObjectDeserializer;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Objects;

public abstract class ApiResource extends StripeObject {
  private static StripeResponseGetter stripeResponseGetter = new LiveStripeResponseGetter();

  public static void setStripeResponseGetter(StripeResponseGetter srg) {
    ApiResource.stripeResponseGetter = srg;
  }

  public static final Gson GSON = new GsonBuilder()
      .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
      .registerTypeAdapter(BalanceTransaction.class, new BalanceTransactionDeserializer())
      .registerTypeAdapter(ChargeRefundCollection.class, new ChargeRefundCollectionDeserializer())
      .registerTypeAdapter(Dispute.class, new DisputeDataDeserializer())
      .registerTypeAdapter(EphemeralKey.class, new EphemeralKeyDeserializer())
      .registerTypeAdapter(EventData.class, new EventDataDeserializer())
      .registerTypeAdapter(EventRequest.class, new EventRequestDeserializer())
      .registerTypeAdapter(ExpandableField.class, new ExpandableFieldDeserializer())
      .registerTypeAdapter(FeeRefundCollection.class, new FeeRefundCollectionDeserializer())
      .registerTypeAdapter(OrderItem.class, new OrderItemDeserializer())
      .registerTypeAdapter(PaymentIntentSourceAction.class,
          new PaymentIntentSourceActionDeserializer())
      .registerTypeAdapter(Source.class, new SourceTypeDataDeserializer<Source>())
      .registerTypeAdapter(SourceMandateNotification.class,
          new SourceTypeDataDeserializer<SourceMandateNotification>())
      .registerTypeAdapter(SourceTransaction.class,
          new SourceTypeDataDeserializer<SourceTransaction>())
      .registerTypeAdapter(StripeRawJsonObject.class, new StripeRawJsonObjectDeserializer())
      .registerTypeAdapterFactory(new ExternalAccountTypeAdapterFactory())
      .create();

  private static String className(Class<?> clazz) {
    // Convert CamelCase to snake_case
    final String className = clazz.getSimpleName()
        .replaceAll("(.)([A-Z][a-z]+)", "$1_$2")
        .replaceAll("([a-z0-9])([A-Z])", "$1_$2")
        .toLowerCase();

    // Handle special cases
    switch (className) {
      case "invoice_item":
        return "invoiceitem";
      case "file_upload":
        return "file";
      default:
        return className;
    }
  }

  protected static String singleClassUrl(Class<?> clazz) {
    return singleClassUrl(clazz, Stripe.getApiBase());
  }

  protected static String singleClassUrl(Class<?> clazz, String apiBase) {
    return String.format("%s/v1/%s", apiBase, className(clazz));
  }

  protected static String classUrl(Class<?> clazz) {
    return classUrl(clazz, Stripe.getApiBase());
  }

  protected static String classUrl(Class<?> clazz, String apiBase) {
    return String.format("%ss", singleClassUrl(clazz, apiBase));
  }

  protected static String instanceUrl(Class<?> clazz, String id)
      throws InvalidRequestException {
    return instanceUrl(clazz, id, Stripe.getApiBase());
  }

  protected static String instanceUrl(Class<?> clazz, String id, String apiBase)
      throws InvalidRequestException {
    try {
      return String.format("%s/%s", classUrl(clazz, apiBase), urlEncode(id));
    } catch (UnsupportedEncodingException e) {
      throw new InvalidRequestException("Unable to encode parameters to "
          + CHARSET
          + ". Please contact support@stripe.com for assistance.",
          null, null, null, 0, e);
    }
  }

  protected static String subresourceUrl(Class<?> clazz, String id, Class<?> subClazz)
      throws InvalidRequestException {
    return subresourceUrl(clazz, id, subClazz, Stripe.getApiBase());
  }


  private static String subresourceUrl(Class<?> clazz, String id, Class<?> subClazz, String apiBase)
      throws InvalidRequestException {
    try {
      return String.format("%s/%s/%ss", classUrl(clazz, apiBase),
              urlEncode(id), className(subClazz));
    } catch (UnsupportedEncodingException e) {
      throw new InvalidRequestException("Unable to encode parameters to "
              + CHARSET
              + ". Please contact support@stripe.com for assistance.",
              null, null, null, 0, e);
    }
  }

  public static final String CHARSET = "UTF-8";

  public enum RequestMethod {
    GET, POST, DELETE
  }

  public enum RequestType {
    NORMAL, MULTIPART
  }

  /**
   * URL-encodes a string.
   */
  public static String urlEncode(String str) throws UnsupportedEncodingException {
    // Preserve original behavior that passing null for an object id will lead
    // to us actually making a request to /v1/foo/null
    if (str == null) {
      return null;
    } else {
      // Don't use strict form encoding by changing the square bracket control
      // characters back to their literals. This is fine by the server, and
      // makes these parameter strings easier to read.
      return URLEncoder.encode(str, CHARSET)
        .replaceAll("%5B", "[")
        .replaceAll("%5D", "]");
    }
  }

  public static <T> T multipartRequest(ApiResource.RequestMethod method,
                     String url, Map<String, Object> params, Class<T> clazz,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return ApiResource.stripeResponseGetter.request(method, url, params, clazz,
        ApiResource.RequestType.MULTIPART, options);
  }

  public static <T> T request(ApiResource.RequestMethod method,
                String url, Map<String, Object> params, Class<T> clazz,
                RequestOptions options) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException,
      ApiException {
    return ApiResource.stripeResponseGetter.request(method, url, params, clazz,
        ApiResource.RequestType.NORMAL, options);
  }

  /**
   * Similar to #request, but specific for use with collection types that
   * come from the API (i.e. lists of resources).
   *
   * <p>Collections need a little extra work because we need to plumb request
   * options and params through so that we can iterate to the next page if
   * necessary.
   */
  public static <T extends StripeCollectionInterface<?>> T requestCollection(
      String url, Map<String, Object> params, Class<T> clazz,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    T collection = request(RequestMethod.GET, url, params, clazz, options);

    if (collection != null) {
      collection.setRequestOptions(options);
      collection.setRequestParams(params);
    }

    return collection;
  }

  /**
   * When setting a String ID for an ExpandableField, we need to be careful about keeping the String
   * ID and the expanded object in sync. If they specify a new String ID that is different from the
   * ID within the expanded object, we don't keep the object.
   */
  public static <T extends HasId> ExpandableField<T> setExpandableFieldId(String newId,
      ExpandableField<T> currentObject) {
    if (currentObject == null
        || (currentObject.isExpanded() && (!Objects.equals(currentObject.getId(), newId)))) {
      return new ExpandableField<T>(newId, null);
    }

    return new ExpandableField<T>(newId, currentObject.getExpanded());
  }
}
