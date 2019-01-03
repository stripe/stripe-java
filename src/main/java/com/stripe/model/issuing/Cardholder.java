package com.stripe.model.issuing;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Cardholder extends ApiResource implements HasId, MetadataStore<Cardholder> {
  Billing billing;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** The cardholder's email address. */
  String email;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** Whether or not this cardholder is the default cardholder. */
  Boolean isDefault;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod = @__({@Override}))
  Map<String, String> metadata;

  /** The cardholder's name. This will be printed on cards issued to them. */
  String name;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The cardholder's phone number. */
  String phoneNumber;

  /** One of `active`, `inactive`, `blocked`, or `pending`. */
  String status;

  /** One of `individual` or `business_entity`. */
  String type;

  /**
   * Returns a list of Issuing <code>Cardholder</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Cardholder</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static CardholderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cardholders");
    return requestCollection(url, params, CardholderCollection.class, options);
  }

  /** Creates a new Issuing <code>Cardholder</code> object that can be issued cards. */
  public static Cardholder create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new Issuing <code>Cardholder</code> object that can be issued cards. */
  public static Cardholder create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/cardholders");
    return request(ApiResource.RequestMethod.POST, url, params, Cardholder.class, options);
  }

  /** Retrieves an Issuing <code>Cardholder</code> object. */
  public static Cardholder retrieve(String cardholder) throws StripeException {
    return retrieve(cardholder, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Cardholder</code> object. */
  public static Cardholder retrieve(String cardholder, RequestOptions options)
      throws StripeException {
    return retrieve(cardholder, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Cardholder</code> object. */
  public static Cardholder retrieve(
      String cardholder, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/issuing/cardholders/%s", cardholder));
    return request(ApiResource.RequestMethod.GET, url, params, Cardholder.class, options);
  }

  /**
   * Updates the specified Issuing <code>Cardholder</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Cardholder</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Cardholder update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/issuing/cardholders/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Cardholder.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Billing extends StripeObject {
    Address address;

    String name;
  }
}
