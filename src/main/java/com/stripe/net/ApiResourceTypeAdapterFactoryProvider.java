package com.stripe.net;

import com.google.gson.TypeAdapterFactory;
import com.stripe.model.BalanceTransactionSourceTypeAdapterFactory;
import com.stripe.model.CustomerSourceTypeAdapterFactory;
import com.stripe.model.ExternalAccountSourceTypeAdapterFactory;
import com.stripe.model.PaymentIntentSourceTypeAdapterFactory;
import com.stripe.model.PaymentSourceTypeAdapterFactory;
import java.util.ArrayList;
import java.util.List;

public class ApiResourceTypeAdapterFactoryProvider {
  private static final List<TypeAdapterFactory> factories = new ArrayList<>();

  static {
    factories.add(new BalanceTransactionSourceTypeAdapterFactory());
    factories.add(new PaymentIntentSourceTypeAdapterFactory());
    factories.add(new CustomerSourceTypeAdapterFactory());
    factories.add(new PaymentSourceTypeAdapterFactory());
    factories.add(new ExternalAccountSourceTypeAdapterFactory());
  }

  public static List<TypeAdapterFactory> getAll() {
    return factories;
  }
}
