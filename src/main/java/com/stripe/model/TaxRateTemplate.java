package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TaxRateTemplate extends ApiResource implements HasId {
  /** Always true for a deleted object. */
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** Creates a new tax rate template. */
  public static TaxRateTemplate create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new tax rate template. */
  public static TaxRateTemplate create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rate_templates");
    return request(ApiResource.RequestMethod.POST, url, params, TaxRateTemplate.class, options);
  }

  /**
   * Returns a list of your tax rate templates. Tax rate templates are returned sorted by creation
   * date, with the most recently created tax rate templates appearing first.
   */
  public static TaxRateTemplateCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your tax rate templates. Tax rate templates are returned sorted by creation
   * date, with the most recently created tax rate templates appearing first.
   */
  public static TaxRateTemplateCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rate_templates");
    return requestCollection(url, params, TaxRateTemplateCollection.class, options);
  }

  /** Retrieves the tax rate template with the given ID. */
  public static TaxRateTemplate retrieve(String taxRateTemplate) throws StripeException {
    return retrieve(taxRateTemplate, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the tax rate template with the given ID. */
  public static TaxRateTemplate retrieve(String taxRateTemplate, RequestOptions options)
      throws StripeException {
    return retrieve(taxRateTemplate, (Map<String, Object>) null, options);
  }

  /** Retrieves the tax rate template with the given ID. */
  public static TaxRateTemplate retrieve(
      String taxRateTemplate, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/tax_rate_templates/%s", taxRateTemplate));
    return request(ApiResource.RequestMethod.GET, url, params, TaxRateTemplate.class, options);
  }

  /** Removes a tax rate template from the dashboard. */
  public TaxRateTemplate delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Removes a tax rate template from the dashboard. */
  public TaxRateTemplate delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Removes a tax rate template from the dashboard. */
  public TaxRateTemplate delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Removes a tax rate template from the dashboard. */
  public TaxRateTemplate delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/tax_rate_templates/%s", this.getId()));
    return request(ApiResource.RequestMethod.DELETE, url, params, TaxRateTemplate.class, options);
  }

  /** Updates a new tax rate template. */
  public TaxRateTemplate update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a new tax rate template. */
  public TaxRateTemplate update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/tax_rate_templates/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, TaxRateTemplate.class, options);
  }
}
