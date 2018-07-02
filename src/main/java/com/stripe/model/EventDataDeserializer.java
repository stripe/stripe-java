package com.stripe.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.stripe.net.ApiResource;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EventDataDeserializer implements JsonDeserializer<EventData> {

  static final Map<String, Class<? extends StripeObject>> objectMap =
      new HashMap<String, Class<? extends StripeObject>>();

  static {
    objectMap.put("account", Account.class);
    objectMap.put("alipay_account", AlipayAccount.class);
    objectMap.put("apple_pay_domain", ApplePayDomain.class);
    objectMap.put("application", Application.class);
    objectMap.put("application_fee", ApplicationFee.class);
    objectMap.put("balance", Balance.class);
    objectMap.put("balance_transaction", BalanceTransaction.class);
    objectMap.put("bank_account", BankAccount.class);
    objectMap.put("bitcoin_receiver", BitcoinReceiver.class);
    objectMap.put("card", Card.class);
    objectMap.put("charge", Charge.class);
    objectMap.put("country_spec", CountrySpec.class);
    objectMap.put("coupon", Coupon.class);
    objectMap.put("customer", Customer.class);
    objectMap.put("discount", Discount.class);
    objectMap.put("dispute", Dispute.class);
    objectMap.put("event", Event.class);
    objectMap.put("exchange_rate", ExchangeRate.class);
    objectMap.put("fee", BalanceTransaction.Fee.class);
    objectMap.put("fee_refund", FeeRefund.class);
    objectMap.put("file_upload", FileUpload.class);
    objectMap.put("invoice", Invoice.class);
    objectMap.put("invoice_line_item", InvoiceLineItem.class);
    objectMap.put("invoiceitem", InvoiceItem.class);
    objectMap.put("order", Order.class);
    objectMap.put("order_item", OrderItem.class);
    objectMap.put("order_return", OrderReturn.class);
    objectMap.put("payout", Payout.class);
    objectMap.put("plan", Plan.class);
    objectMap.put("product", Product.class);
    objectMap.put("refund", Refund.class);
    objectMap.put("recipient", Recipient.class);
    objectMap.put("review", Review.class);
    objectMap.put("sku", Sku.class);
    objectMap.put("source", Source.class);
    objectMap.put("source_mandate_notification", SourceMandateNotification.class);
    objectMap.put("source_transaction", SourceTransaction.class);
    objectMap.put("subscription", Subscription.class);
    objectMap.put("subscription_item", SubscriptionItem.class);
    objectMap.put("summary", Transfer.Summary.class);
    objectMap.put("three_d_secure", ThreeDSecure.class);
    objectMap.put("token", Token.class);
    objectMap.put("transfer", Transfer.class);
    objectMap.put("transfer_reversal", Reversal.class);
  }

  private Object deserializeJsonPrimitive(JsonPrimitive element) {
    if (element.isBoolean()) {
      return element.getAsBoolean();
    } else if (element.isNumber()) {
      return element.getAsNumber();
    } else {
      return element.getAsString();
    }
  }

  private Object[] deserializeJsonArray(JsonArray arr) {
    Object[] elems = new Object[arr.size()];
    Iterator<JsonElement> elemIter = arr.iterator();
    int i = 0;
    while (elemIter.hasNext()) {
      JsonElement elem = elemIter.next();
      elems[i++] = deserializeJsonElement(elem);
    }
    return elems;
  }

  private Object deserializeJsonElement(JsonElement element) {
    if (element.isJsonNull()) {
      return null;
    } else if (element.isJsonObject()) {
      Map<String, Object> valueMap = new HashMap<String, Object>();
      populateMapFromJsonObject(valueMap, element.getAsJsonObject());
      return valueMap;
    } else if (element.isJsonPrimitive()) {
      return deserializeJsonPrimitive(element.getAsJsonPrimitive());
    } else if (element.isJsonArray()) {
      return deserializeJsonArray(element.getAsJsonArray());
    } else {
      System.err.println("Unknown JSON element type for element " + element + ". "
          + "If you're seeing this messaage, it's probably a bug in the Stripe Java "
          + "library. Please contact us by email at support@stripe.com.");
      return null;
    }
  }

  private void populateMapFromJsonObject(Map<String, Object> objMap, JsonObject jsonObject) {
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
      String key = entry.getKey();
      JsonElement element = entry.getValue();
      objMap.put(key, deserializeJsonElement(element));
    }
  }

  /**
   * Deserializes the JSON payload contained in an event's {@code data} attribute into an
   * {@link EventData} instance.
   */
  @Override
  public EventData deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    EventData eventData = new EventData();
    JsonObject jsonObject = json.getAsJsonObject();
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
      String key = entry.getKey();
      JsonElement element = entry.getValue();
      if ("previous_attributes".equals(key)) {
        if (element.isJsonNull()) {
          eventData.setPreviousAttributes(null);
        } else if (element.isJsonObject()) {
          Map<String, Object> previousAttributes = new HashMap<String, Object>();
          populateMapFromJsonObject(previousAttributes, element.getAsJsonObject());
          eventData.setPreviousAttributes(previousAttributes);
        }
      } else if ("object".equals(key)) {
        String type = element.getAsJsonObject().get("object").getAsString();
        Class<? extends StripeObject> cl = objectMap.get(type);
        StripeObject object = ApiResource.GSON.fromJson(
            entry.getValue(), cl != null ? cl : StripeRawJsonObject.class);
        eventData.setObject(object);
      }
    }
    return eventData;
  }
}
