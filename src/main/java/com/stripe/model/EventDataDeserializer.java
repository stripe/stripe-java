package com.stripe.model;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.stripe.net.APIResource;

public class EventDataDeserializer implements JsonDeserializer<EventData> {

	@SuppressWarnings("rawtypes")
	static Map<String, Class> objectMap = new HashMap<String, Class>();
    static {
        objectMap.put("charge", Charge.class);
        objectMap.put("discount", Discount.class);
        objectMap.put("customer", Customer.class);
        objectMap.put("invoice", Invoice.class);
        objectMap.put("invoiceitem", InvoiceItem.class);
        objectMap.put("plan", Plan.class);
        objectMap.put("subscription", Subscription.class);
        objectMap.put("token", Token.class);
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
				Type typeOfPrevAttrs = new TypeToken<Map<String, Object>>(){}.getType();
				eventData.setPreviousAttributes(
					(Map<String, Object>) APIResource.gson.fromJson(element, typeOfPrevAttrs));
			} else if ("object".equals(key)) {
				String type = element.getAsJsonObject().get("object").getAsString();
				Class<StripeObject> cl = objectMap.get(type);
				StripeObject object = APIResource.gson.fromJson(entry.getValue(), cl);
				eventData.setObject(object);
			}
		}
		return eventData;
	}
}