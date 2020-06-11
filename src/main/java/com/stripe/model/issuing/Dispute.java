package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.DisputeCreateParams;
import com.stripe.param.issuing.DisputeListParams;
import com.stripe.param.issuing.DisputeRetrieveParams;
import com.stripe.param.issuing.DisputeUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Dispute extends ApiResource implements HasId {
  /** List of balance transactions associated with this dispute. */
  @SerializedName("balance_transactions")
  List<BalanceTransaction> balanceTransactions;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code issuing.dispute}.
   */
  @SerializedName("object")
  String object;

  /** The transaction being disputed. */
  @SerializedName("transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transaction> transaction;

  /** Get ID of expandable {@code transaction} object. */
  public String getTransaction() {
    return (this.transaction != null) ? this.transaction.getId() : null;
  }

  public void setTransaction(String id) {
    this.transaction = ApiResource.setExpandableFieldId(id, this.transaction);
  }

  /** Get expanded {@code transaction}. */
  public Transaction getTransactionObject() {
    return (this.transaction != null) ? this.transaction.getExpanded() : null;
  }

  public void setTransactionObject(Transaction expandableObject) {
    this.transaction = new ExpandableField<Transaction>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.requestCollection(url, params, DisputeCollection.class, options);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(DisputeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static DisputeCollection list(DisputeListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.requestCollection(url, params, DisputeCollection.class, options);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(DisputeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates an Issuing <code>Dispute</code> object. */
  public static Dispute create(DisputeCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/disputes");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Dispute update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Dispute update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Dispute update(DisputeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Dispute</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Dispute update(DisputeUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Dispute.class, options);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(String dispute) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(String dispute, RequestOptions options) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(String dispute, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(dispute)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Dispute.class, options);
  }

  /** Retrieves an Issuing <code>Dispute</code> object. */
  public static Dispute retrieve(
      String dispute, DisputeRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/issuing/disputes/%s", ApiResource.urlEncodeId(dispute)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Dispute.class, options);
  }
}
