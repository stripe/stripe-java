package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stripe.model.issuing.Authorization;
import com.stripe.model.issuing.Transaction;
import java.io.IOException;

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
    final TypeAdapter<BitcoinTransaction> bitcoinTransactionAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(BitcoinTransaction.class));
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
    final TypeAdapter<RecipientTransfer> recipientTransferAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(RecipientTransfer.class));
    final TypeAdapter<Refund> refundAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(Refund.class));
    final TypeAdapter<ReserveTransaction> reserveTransactionAdapter =
        gson.getDelegateAdapter(this, TypeToken.get(ReserveTransaction.class));
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
            if (objectType.equals("application_fee")) {
              objectResult = applicationFeeAdapter.fromJsonTree(object);
            } else if (objectType.equals("bitcoin_transaction")) {
              objectResult = bitcoinTransactionAdapter.fromJsonTree(object);
            } else if (objectType.equals("charge")) {
              objectResult = chargeAdapter.fromJsonTree(object);
            } else if (objectType.equals("connect_collection_transfer")) {
              objectResult = connectCollectionTransferAdapter.fromJsonTree(object);
            } else if (objectType.equals("dispute")) {
              objectResult = disputeAdapter.fromJsonTree(object);
            } else if (objectType.equals("fee_refund")) {
              objectResult = feeRefundAdapter.fromJsonTree(object);
            } else if (objectType.equals("issuing.authorization")) {
              objectResult = authorizationAdapter.fromJsonTree(object);
            } else if (objectType.equals("issuing.transaction")) {
              objectResult = transactionAdapter.fromJsonTree(object);
            } else if (objectType.equals("payout")) {
              objectResult = payoutAdapter.fromJsonTree(object);
            } else if (objectType.equals("recipient_transfer")) {
              objectResult = recipientTransferAdapter.fromJsonTree(object);
            } else if (objectType.equals("refund")) {
              objectResult = refundAdapter.fromJsonTree(object);
            } else if (objectType.equals("reserve_transaction")) {
              objectResult = reserveTransactionAdapter.fromJsonTree(object);
            } else if (objectType.equals("topup")) {
              objectResult = topupAdapter.fromJsonTree(object);
            } else if (objectType.equals("transfer")) {
              objectResult = transferAdapter.fromJsonTree(object);
            } else if (objectType.equals("transfer_reversal")) {
              objectResult = transferReversalAdapter.fromJsonTree(object);
            } else {
              throw new JsonParseException(
                  String.format(
                      "Unexpected object type `%s` for json object %s", objectType, object));
            }
            return objectResult;
          }
        };
    return (TypeAdapter<T>) resultCustomTypeAdapter.nullSafe();
  }
}
