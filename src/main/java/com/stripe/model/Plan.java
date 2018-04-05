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

public class Plan extends APIResource implements MetadataStore<Plan>, HasId {
  String id;
  String object;
  Long amount;
  String billingScheme;
  Long created;
  String currency;
  String interval;
  Integer intervalCount;
  Boolean livemode;
  Map<String, String> metadata;
  String nickname;
  ExpandableField<Product> product;
  List<PlanTier> tiers;
  String tiersMode;
  PlanTransformUsage transformUsage;
  String usageType;

  @Deprecated
  String statementDescription;
  @Deprecated
  String name;
  @Deprecated
  Integer trialPeriodDays;
  @Deprecated
  String statementDescriptor;

  @Override
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getBillingScheme() {
    return billingScheme;
  }

  public void setBillingScheme(String billingScheme) {
    this.billingScheme = billingScheme;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public Integer getIntervalCount() {
    return intervalCount;
  }

  public void setIntervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
  }

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  @Override
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

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

  /**
   * Returns the {@code name} attribute.
   *
   * @return the {@code name} attribute
   * @deprecated Prefer using the {@code getProduct().getName()} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns the {@code statement_descriptor} attribute.
   *
   * @return the {@code statement_descriptor} attribute
   * @deprecated Prefer using the {@code getProduct().getStatementDescriptor()} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  public String getStatementDescriptor() {
    return statementDescriptor;
  }

  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }

  /**
   * Returns the {@code trial_period_days} attribute.
   *
   * @return the {@code trial_period_days} attribute
   * @deprecated Prefer using the {@link Subscription#create} method with the {@code trial_end}
   *     parameter instead.
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  public Integer getTrialPeriodDays() {
    return trialPeriodDays;
  }

  public void setTrialPeriodDays(Integer trialPeriodDays) {
    this.trialPeriodDays = trialPeriodDays;
  }

  /**
   * Returns the {@code statement_description} attribute.
   *
   * @return the {@code statement_description} attribute
   * @deprecated Prefer using the {@code getProduct().getStatementDescriptor()} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-17">API version 2014-12-17</a>
   * @see <a href="https://stripe.com/docs/upgrades#2018-02-05">API version 2018-02-05</a>
   */
  @Deprecated
  public String getStatementDescription() {
    return statementDescription;
  }

  @Deprecated
  public void setStatementDescription(String statementDescription) {
    this.statementDescription = statementDescription;
  }

  public List<PlanTier> getTiers() {
    return tiers;
  }

  public void setTiers(List<PlanTier> tiers) {
    this.tiers = tiers;
  }

  public String getTiersMode() {
    return tiersMode;
  }

  public void setTiersMode(String tiersMode) {
    this.tiersMode = tiersMode;
  }

  public PlanTransformUsage getTransformUsage() {
    return transformUsage;
  }

  public void setTransformUsage(PlanTransformUsage transformUsage) {
    this.transformUsage = transformUsage;
  }

  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public static Plan create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  @Deprecated
  public static Plan create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Plan create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Plan.class), params, Plan.class, options);
  }

  public static Plan retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static Plan retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Plan retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Plan.class, id), null, Plan.class, options);
  }

  @Override
  public Plan update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public Plan update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Override
  public Plan update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Plan.class, this.id), params, Plan.class,
        options);
  }

  public DeletedPlan delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete((RequestOptions) null);
  }

  @Deprecated
  public DeletedPlan delete(String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public DeletedPlan delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, instanceURL(Plan.class, this.id), null, DeletedPlan.class,
        options);
  }

  public static PlanCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static PlanCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(classURL(Plan.class), params, PlanCollection.class, options);
  }

  @Deprecated
  public static PlanCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static PlanCollection all(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static PlanCollection all(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, options);
  }
}
