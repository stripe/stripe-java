/*
 * Copyright (c) 2003-2010 SPORTSVITE, LLC. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * SPORTSVITE, LLC and certain third parties ("Confidential Information").
 * You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement
 * you entered into with SPORTSVITE, LLC.
 *
 * SPORTSVITE, LLC MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE,
 * OR NON-INFRINGEMENT. SPORTSVITE, LLC SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.stripe.model;

import java.lang.reflect.Type;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

/**
 * @author kion
 */
public class BalanceTransactionDeserializer implements JsonDeserializer<BalanceTransaction> {

	@Override
	public BalanceTransaction deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
				.create();
		
		if (json.isJsonNull()) {
			return null;
		}

		if (!json.isJsonObject()) {
			throw new JsonParseException("BalanceTransaction type was not an object, which is problematic.");
		}
		
		JsonObject btAsJsonObject = json.getAsJsonObject();

		JsonElement source = btAsJsonObject.get("source");
		
		btAsJsonObject.remove("source");

		BalanceTransaction balanceTransaction = gson.fromJson(json, typeOfT);
		
		String sourceId = null;

		if (source.isJsonPrimitive()) {
			JsonPrimitive sourceJsonPrimitive = source.getAsJsonPrimitive();
			if (!sourceJsonPrimitive.isString()) {
				throw new JsonParseException("Source field on a balance transaction was a primitive non-string type.");
			}
			sourceId = sourceJsonPrimitive.getAsString();
		} else if (source.isJsonObject()) {
			JsonObject sourceJsonObject = source.getAsJsonObject();
			JsonElement sourceIdEl = sourceJsonObject.get("id");
			sourceId = sourceIdEl != null ? sourceIdEl.getAsString() : null;
			JsonElement val = sourceJsonObject.get("object");
			if (val != null) {
				if ("charge".equals(val.getAsString())) {
					Charge charge = context.deserialize(source, Charge.class);
					balanceTransaction.setSourceCharge(charge);
				} else if ("transfer".equals(val.getAsString())) {
					Transfer transfer = context.deserialize(source, Transfer.class);
					balanceTransaction.setSourceTransfer(transfer);
				} else if ("refund".equals(val.getAsString())) {
					Refund refund = context.deserialize(source, Refund.class);
					balanceTransaction.setSourceRefund(refund);
				}
				// TODO support other source types (?)
			}
		} else if (!source.isJsonNull()) {
			throw new JsonParseException("Source field on a balance transaction was a non-primitive, non-object type.");
		}
		
		balanceTransaction.setSource(sourceId);

		return balanceTransaction;
	}

}
