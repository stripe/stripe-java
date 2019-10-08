package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stripe.model.issuing.Authorization;
import com.stripe.model.issuing.Transaction;
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
    final TypeAdapter<BalanceTransactionSource> balanceTransactionSourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(BalanceTransactionSource.class));
    final TypeAdapter<ApplicationFee> applicationFeeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(ApplicationFee.class));
    final TypeAdapter<Charge> chargeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Charge.class));
    final TypeAdapter<ConnectCollectionTransfer> connectCollectionTransferAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(ConnectCollectionTransfer.class));
    final TypeAdapter<Dispute> disputeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Dispute.class));
    final TypeAdapter<FeeRefund> feeRefundAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(FeeRefund.class));
    final TypeAdapter<Authorization> authorizationAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Authorization.class));
    final TypeAdapter<Transaction> transactionAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Transaction.class));
    final TypeAdapter<Payout> payoutAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Payout.class));
    final TypeAdapter<PlatformTaxFee> platformTaxFeeAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(PlatformTaxFee.class));
    final TypeAdapter<Refund> refundAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Refund.class));
    final TypeAdapter<ReserveTransaction> reserveTransactionAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(ReserveTransaction.class));
    final TypeAdapter<TaxDeductedAtSource> taxDeductedAtSourceAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(TaxDeductedAtSource.class));
    final TypeAdapter<Topup> topupAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Topup.class));
    final TypeAdapter<Transfer> transferAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Transfer.class));
    final TypeAdapter<TransferReversal> transferReversalAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(TransferReversal.class));

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
              objectResult = authorizationAdapter.fromJsonTree(object);
            } else if ("issuing.transaction".equals(objectType)) {
              objectResult = transactionAdapter.fromJsonTree(object);
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
  public static class UnknownSubType implements BalanceTransactionSource {
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
