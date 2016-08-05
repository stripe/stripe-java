package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;

import com.google.gson.reflect.TypeToken;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class ExternalAccountTypeAdapterFactory implements TypeAdapterFactory {
	public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
		if (!ExternalAccount.class.isAssignableFrom(type.getRawType())) {
			return null; // this class only serializes 'ExternalAccount' and its subtypes
		}

		final String SOURCE_OBJECT_PROP = "object";

		final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
		final TypeAdapter<ExternalAccount> externalAccountAdapter = gson.getDelegateAdapter(this, TypeToken.get(ExternalAccount.class));

		final TypeAdapter<AlipayAccount> alipayAccountAdapter = gson.getDelegateAdapter(this, TypeToken.get(AlipayAccount.class));
		final TypeAdapter<BankAccount> bankAccountAdapter = gson.getDelegateAdapter(this, TypeToken.get(BankAccount.class));
		final TypeAdapter<BitcoinReceiver> bitcoinReceiverAdapter = gson.getDelegateAdapter(this, TypeToken.get(BitcoinReceiver.class));
		final TypeAdapter<Card> cardAdapter = gson.getDelegateAdapter(this, TypeToken.get(Card.class));
		final TypeAdapter<Source> sourceAdapter = gson.getDelegateAdapter(this, TypeToken.get(Source.class));

		TypeAdapter<ExternalAccount> result = new TypeAdapter<ExternalAccount>() {
			public void write(JsonWriter out, ExternalAccount value) throws IOException {
				// TODO: check instance of for correct writer
				externalAccountAdapter.write(out, value);
			}

			public ExternalAccount read(JsonReader in) throws IOException {
				JsonObject object = elementAdapter.read(in).getAsJsonObject();
				String sourceObject = object.getAsJsonPrimitive(SOURCE_OBJECT_PROP).getAsString();

				if (sourceObject.equals("alipay_account")) {
					return alipayAccountAdapter.fromJsonTree(object);
				} else if (sourceObject.equals("bank_account")) {
					return bankAccountAdapter.fromJsonTree(object);
				} else if (sourceObject.equals("bitcoin_receiver")) {
					return bitcoinReceiverAdapter.fromJsonTree(object);
				} else if (sourceObject.equals("card")) {
					return cardAdapter.fromJsonTree(object);
				} else if (sourceObject.equals("source")) {
					return sourceAdapter.fromJsonTree(object);
				} else {
					return externalAccountAdapter.fromJsonTree(object);
				}
			}
		}.nullSafe();

		return (TypeAdapter<T>) result;
	}
}
