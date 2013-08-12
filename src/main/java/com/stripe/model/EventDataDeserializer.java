package com.stripe.model;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.stripe.net.APIResource;

public class EventDataDeserializer implements JsonDeserializer<EventData> {

	@SuppressWarnings("rawtypes")
	static Map<String, Class> objectMap = new HashMap<String, Class>();
    static {
        objectMap.put("account", Account.class);
        objectMap.put("charge", Charge.class);
        objectMap.put("discount", Discount.class);
        objectMap.put("customer", Customer.class);
        objectMap.put("invoice", Invoice.class);
        objectMap.put("invoiceitem", InvoiceItem.class);
        objectMap.put("plan", Plan.class);
        objectMap.put("subscription", Subscription.class);
        objectMap.put("token", Token.class);
        objectMap.put("coupon", Coupon.class);
        objectMap.put("transfer", Transfer.class);
        objectMap.put("dispute", Dispute.class);
        objectMap.put("recipient", Recipient.class);
        objectMap.put("summary", Summary.class);
        objectMap.put("fee", Fee.class);
        objectMap.put("bank_account", BankAccount.class);
        objectMap.put("balance", Balance.class);
        objectMap.put("card", Card.class);
        objectMap.put("balance_transaction", BalanceTransaction.class);
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
			populateMapFromJSONObject(valueMap, element.getAsJsonObject());
			return valueMap;
		} else if (element.isJsonPrimitive()) {
			return deserializeJsonPrimitive(element.getAsJsonPrimitive());
		} else if (element.isJsonArray()) {
			return deserializeJsonArray(element.getAsJsonArray());
		} else {
			System.err.println("Unknown JSON element type for element " + element + ". " +
					"If you're seeing this messaage, it's probably a bug in the Stripe Java " +
					"library. Please contact us by email at support@stripe.com.");
			return null;
		}
	}
    
    private void populateMapFromJSONObject(Map<String, Object> objMap, JsonObject jsonObject) {
		for(Map.Entry<String, JsonElement> entry: jsonObject.entrySet()) {
			String key = entry.getKey();
			JsonElement element = entry.getValue();
			objMap.put(key, deserializeJsonElement(element));
		}
    }

	@SuppressWarnings("unchecked")
	public EventData deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		EventData eventData = new EventData();
		JsonObject jsonObject = json.getAsJsonObject();
		for(Map.Entry<String, JsonElement> entry: jsonObject.entrySet()) {
			String key = entry.getKey();
			JsonElement element = entry.getValue();
			if("previous_attributes".equals(key)) {
				Map<String, Object> previousAttributes = new HashMap<String, Object>();
				populateMapFromJSONObject(previousAttributes, element.getAsJsonObject());
				eventData.setPreviousAttributes(previousAttributes);
			} else if ("object".equals(key)) {
				String type = element.getAsJsonObject().get("object").getAsString();
				Class<StripeObject> cl = objectMap.get(type);
				StripeObject object = APIResource.gson.fromJson(entry.getValue(), cl != null ? cl : StripeRawJsonObject.class);
				eventData.setObject(object);
			}
		}
		return eventData;
	}
}
