package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
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
public class Plan extends ApiResource implements MetadataStore<Plan>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Boolean active;
  Long amount;
  String billingScheme;
  Long created;
  String currency;
  String interval;
  Long intervalCount;
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
  Long trialPeriodDays;

  // <editor-fold desc="product">
  public String getProduct() {
    return (this.product != null) ? this.product.getId() : null;
  }

  public void setProduct(String productId) {
    this.product = setExpandableFieldId(productId, this.product);
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
  public static Plan create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a plan.
   */
  public static Plan create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Plan.class), params, Plan.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a plan.
   */
  public DeletedPlan delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a plan.
   */
  public DeletedPlan delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Plan.class, this.id), null, DeletedPlan.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all plans.
   */
  public static PlanCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all plans.
   */
  public static PlanCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Plan.class), params, PlanCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a plan.
   */
  public static Plan retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a plan.
   */
  public static Plan retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Plan.class, id), null, Plan.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a plan.
   */
  @Override
  public Plan update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a plan.
   */
  @Override
  public Plan update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Plan.class, this.id), params, Plan.class,
        options);
  }
  // </editor-fold>
}
