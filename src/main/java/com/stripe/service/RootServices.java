package com.stripe.service;

import com.stripe.net.StripeClient;
import com.stripe.util.Lazy;

public class RootServices {
  private StripeClient client = null;

  public RootServices(StripeClient client) {
    this.client = client;
  }

  private final Lazy<ChargeService> chargeService = new Lazy<>(() -> new ChargeService(this.client));

  private final Lazy<CouponService> couponService = new Lazy<>(() -> new CouponService(this.client));

  private final Lazy<CustomerService> customerService = new Lazy<>(() -> new CustomerService(this.client));

  private final Lazy<FileService> fileService = new Lazy<>(() -> new FileService(this.client));

  public ChargeService charges() {
    return this.chargeService.get();
  }

  public CouponService coupons() {
    return this.couponService.get();
  }

  public CustomerService customers() {
    return this.customerService.get();
  }

  public FileService files() {
    return this.fileService.get();
  }
}
