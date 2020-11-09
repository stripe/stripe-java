// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import lombok.Getter;

/**
 * Creates type adapter for interface {@code BalanceTransactionSource} able to deserialize raw JSON
 * to subtype implementation based on discriminator field {@code object}.
 */
public class BalanceTransactionSourceTypeAdapterFactory implements TypeAdapterFactory {
  @SuppressWarnings("unchecked")
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!BalanceTransactionSource.class.isAssignableFrom(type.getRawType())) {
      return null;
    }
    final String discriminator = "object";
    final TypeAdapter<JsonElement> jsonElementAdapter = gson.getAdapter(JsonElement.class);
    final TypeAdapter<com.stripe.model.BalanceTransactionSource> balanceTransactionSourceAdapter =
        gson.getDelegateAdapter(
            this, TypeToken.get(com.stripe.model.BalanceTransactionSource.class));
    final TypeAdapter<com.stripe.model.ApplicationFee> applicationFeeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.ApplicationFee.class));
    final TypeAdapter<com.stripe.model.Charge> chargeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Charge.class));
    final TypeAdapter<com.stripe.model.ConnectCollectionTransfer> connectCollectionTransferAdapter =
        gson.getDelegateAdapter(
            this, TypeToken.get(com.stripe.model.ConnectCollectionTransfer.class));
    final TypeAdapter<com.stripe.model.Dispute> disputeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Dispute.class));
    final TypeAdapter<com.stripe.model.FeeRefund> feeRefundAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.FeeRefund.class));
    final TypeAdapter<com.stripe.model.issuing.Authorization> issuingAuthorizationAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.issuing.Authorization.class));
    final TypeAdapter<com.stripe.model.issuing.Dispute> issuingDisputeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.issuing.Dispute.class));
    final TypeAdapter<com.stripe.model.issuing.Transaction> issuingTransactionAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.issuing.Transaction.class));
    final TypeAdapter<com.stripe.model.Payout> payoutAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Payout.class));
    final TypeAdapter<com.stripe.model.PlatformTaxFee> platformTaxFeeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.PlatformTaxFee.class));
    final TypeAdapter<com.stripe.model.Refund> refundAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Refund.class));
    final TypeAdapter<com.stripe.model.ReserveTransaction> reserveTransactionAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.ReserveTransaction.class));
    final TypeAdapter<com.stripe.model.TaxDeductedAtSource> taxDeductedAtSourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.TaxDeductedAtSource.class));
    final TypeAdapter<com.stripe.model.Topup> topupAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Topup.class));
    final TypeAdapter<com.stripe.model.Transfer> transferAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.Transfer.class));
    final TypeAdapter<com.stripe.model.TransferReversal> transferReversalAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(com.stripe.model.TransferReversal.class));

    TypeAdapter<BalanceTransactionSource> resultCustomTypeAdapter =
        new TypeAdapter<BalanceTransactionSource>() {
          @Override
          public void write(JsonWriter out, BalanceTransactionSource value) throws IOException {
            balanceTransactionSourceAdapter.write(out, value);
          }

          @Override
          public BalanceTransactionSource read(JsonReader in) throws IOException {
            JsonObject object = jsonElementAdapter.read(in).getAsJsonObject();
            BalanceTransactionSource objectResult;
            String objectType = object.getAsJsonPrimitive(discriminator).getAsString();
            if ("application_fee".equals(objectType)) {
              objectResult = applicationFeeAdapter.fromJsonTree(object);
            } else if ("charge".equals(objectType)) {
              objectResult = chargeAdapter.fromJsonTree(object);
            } else if ("connect_collection_transfer".equals(objectType)) {
              objectResult = connectCollectionTransferAdapter.fromJsonTree(object);
            } else if ("dispute".equals(objectType)) {
              objectResult = disputeAdapter.fromJsonTree(object);
            } else if ("fee_refund".equals(objectType)) {
              objectResult = feeRefundAdapter.fromJsonTree(object);
            } else if ("issuing.authorization".equals(objectType)) {
              objectResult = issuingAuthorizationAdapter.fromJsonTree(object);
            } else if ("issuing.dispute".equals(objectType)) {
              objectResult = issuingDisputeAdapter.fromJsonTree(object);
            } else if ("issuing.transaction".equals(objectType)) {
              objectResult = issuingTransactionAdapter.fromJsonTree(object);
            } else if ("payout".equals(objectType)) {
              objectResult = payoutAdapter.fromJsonTree(object);
            } else if ("platform_tax_fee".equals(objectType)) {
              objectResult = platformTaxFeeAdapter.fromJsonTree(object);
            } else if ("refund".equals(objectType)) {
              objectResult = refundAdapter.fromJsonTree(object);
            } else if ("reserve_transaction".equals(objectType)) {
              objectResult = reserveTransactionAdapter.fromJsonTree(object);
            } else if ("tax_deducted_at_source".equals(objectType)) {
              objectResult = taxDeductedAtSourceAdapter.fromJsonTree(object);
            } else if ("topup".equals(objectType)) {
              objectResult = topupAdapter.fromJsonTree(object);
            } else if ("transfer".equals(objectType)) {
              objectResult = transferAdapter.fromJsonTree(object);
            } else if ("transfer_reversal".equals(objectType)) {
              objectResult = transferReversalAdapter.fromJsonTree(object);
            } else {
              String id = object.getAsJsonPrimitive("id").getAsString();
              objectResult = new UnknownSubType(id, objectType, object.toString());
            }
            return objectResult;
          }
        };
    return (TypeAdapter<T>) resultCustomTypeAdapter.nullSafe();
  }

  /**
   * Unknown subtype of {@link com.stripe.model.BalanceTransactionSource}. If this class is the
   * outcome of deserialization, please contact support@stripe.com for assistance and provide the id
   * and object value. Do not integrate with this object, but raise an exception and log its content
   * instead.
   */
  public static class UnknownSubType extends StripeObject implements BalanceTransactionSource {
    String id;
    @Getter String object;
    @Getter String rawJson;

    private UnknownSubType(String id, String object, String rawJson) {
      this.id = id;
      this.object = object;
      this.rawJson = rawJson;
    }

    @Override
    public String getId() {
      return this.id;
    }
  }
}
