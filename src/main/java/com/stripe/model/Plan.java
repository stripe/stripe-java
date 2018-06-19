package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Plan extends APIResource implements MetadataStore<Plan>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Boolean active;
  Long amount;
  String billingScheme;
  Long created;
  String currency;
  String interval;
  Integer intervalCount;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String nickname;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Product> product;
  List<PlanTier> tiers;
  String tiersMode;
  PlanTransformUsage transformUsage;
  String usageType;

  /**
   * The {@code name} attribute.
   *
   * @return the {@code name} attribute
   * @deprecated Prefer using the {@code getProduct().getName()} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  @Deprecated
  String name;

  /**
   * The {@code statement_description} attribute.
   *
   * @return the {@code statement_description} attribute
   * @deprecated Prefer using the {@code getProduct().getStatementDescriptor()} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-17">API version 2014-12-17</a>
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  @Deprecated
  String statementDescription;

  /**
   * The {@code statement_descriptor} attribute.
   *
   * @return the {@code statement_descriptor} attribute
   * @deprecated Prefer using the {@code getProduct().getStatementDescriptor()} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  @Deprecated
  String statementDescriptor;

  /**
   * The {@code trial_period_days} attribute.
   *
   * @return the {@code trial_period_days} attribute
   * @deprecated Prefer using the {@link Subscription#create} method with the {@code trial_end}
   *     parameter instead.
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  @Deprecated
  Integer trialPeriodDays;

  // <editor-fold desc="product">
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String productID) {
    this.product = setExpandableFieldID(productID, this.product);
  }

  public Product getProductObject() {
    return (this.product != null) ? this.product.getExpanded() : null;
  }

  public void setProductObject(Product product) {
    this.product = new ExpandableField<Product>(product.getId(), product);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a plan.
   */
  public static Plan create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a plan.
   */
  public static Plan create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Plan.class), params, Plan.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a plan.
   */
  public DeletedPlan delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a plan.
   */
  public DeletedPlan delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, instanceURL(Plan.class, this.id), null, DeletedPlan.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all plans.
   */
  public static PlanCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all plans.
   */
  public static PlanCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(Plan.class), params, PlanCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a plan.
   */
  public static Plan retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a plan.
   */
  public static Plan retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Plan.class, id), null, Plan.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a plan.
   */
  @Override
  public Plan update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a plan.
   */
  @Override
  public Plan update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Plan.class, this.id), params, Plan.class,
        options);
  }
  // </editor-fold>
}
