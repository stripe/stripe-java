// File generated from our OpenAPI spec
package com.stripe.model.risk;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.risk.FormRetrieveParams;
import com.stripe.param.risk.FormUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A risk Form represents a request from Stripe for information about a connected account. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Form extends ApiResource implements HasId {
  @SerializedName("appeal")
  Appeal appeal;

  @SerializedName("authorization_documents")
  AuthorizationDocuments authorizationDocuments;

  /** Time at which the Form closed, measured in seconds since the Unix epoch. */
  @SerializedName("closed_at")
  Long closedAt;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If it exists in a sandbox, the
   * value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code risk.form}.
   */
  @SerializedName("object")
  String object;

  /** Time at which the Form opened, measured in seconds since the Unix epoch. */
  @SerializedName("opened_at")
  Long openedAt;

  @SerializedName("payment_processing")
  PaymentProcessing paymentProcessing;

  @SerializedName("product_removal")
  ProductRemoval productRemoval;

  @SerializedName("reviewed_fields")
  ReviewedFields reviewedFields;

  @SerializedName("self_funding_context")
  SelfFundingContext selfFundingContext;

  /**
   * The current status of the Form.
   *
   * <p>One of {@code closed}, or {@code open}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("subject")
  Subject subject;

  @SerializedName("transaction_context")
  TransactionContext transactionContext;

  /**
   * The type of information requested by Stripe.
   *
   * <p>One of {@code appeal}, {@code authorization_documents}, {@code payment_processing}, {@code
   * product_removal}, {@code reviewed_fields}, {@code self_funding_context}, or {@code
   * transaction_context}.
   */
  @SerializedName("type")
  String type;

  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public static Form retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public static Form retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public static Form retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/risk/forms/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Form.class);
  }

  /**
   * Retrieves a risk Form by ID.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. |
   */
  public static Form retrieve(String id, FormRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/risk/forms/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Form.class);
  }

  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/risk/forms/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Form.class);
  }

  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(FormUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a risk Form with the connected account’s response.
   *
   * <p>
   *
   * <h3>Error Codes</h3>
   *
   * <p>| Code | HTTP status | Description | | — | — | — | | {@code form_not_found} | 400 | No Form
   * matches the supplied ID. | | {@code form_closed} | 400 | The Form is closed and cannot accept
   * updates. | | {@code invalid_field_for_form_type} | 400 | A submitted field is not supported by
   * this Form type. | | {@code form_field_already_submitted} | 400 | A submitted field has already
   * been submitted. | | {@code form_insufficient_fields} | 400 | Required fields are missing for
   * this Form type. | | {@code resource_missing} | 404 | A submitted file does not exist or is not
   * accessible to the requesting account. |
   */
  public Form update(FormUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/risk/forms/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Form.class);
  }

  /**
   * For more details about Appeal, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Appeal extends StripeObject {
    /** A text explanation for the appeal. */
    @SerializedName("explanation")
    String explanation;
  }

  /**
   * For more details about AuthorizationDocuments, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizationDocuments extends StripeObject {
    /** IDs of uploaded files attached as authorization documents. */
    @SerializedName("files")
    List<String> files;
  }

  /**
   * For more details about PaymentProcessing, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentProcessing extends StripeObject {
    @SerializedName("multi_processor")
    MultiProcessor multiProcessor;

    /** How the connected account uses Stripe. */
    @SerializedName("purpose")
    String purpose;

    /** Why the connected account chose Stripe. */
    @SerializedName("stripe_selection_rationale")
    String stripeSelectionRationale;

    /**
     * For more details about MultiProcessor, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MultiProcessor extends StripeObject {
      /**
       * Files evidencing payments accepted outside Stripe. Each entry includes a file ID and, when
       * supplied, a document type tag.
       */
      @SerializedName("files")
      List<Form.PaymentProcessing.MultiProcessor.File> files;

      /** Whether the connected account accepts payments outside Stripe. */
      @SerializedName("value")
      String value;

      /**
       * For more details about File, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class File extends StripeObject {
        /** ID of the uploaded file. */
        @SerializedName("file")
        String file;

        /**
         * The document type: {@code alt_financial_statements}, {@code recent_bank_statements}, or
         * {@code payment_receipt}.
         */
        @SerializedName("tag")
        String tag;
      }
    }
  }

  /**
   * For more details about ProductRemoval, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ProductRemoval extends StripeObject {
    /** Time when the prohibited items were removed, measured in seconds since the Unix epoch. */
    @SerializedName("items_removed_at")
    Long itemsRemovedAt;
  }

  /**
   * For more details about ReviewedFields, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReviewedFields extends StripeObject {
    @SerializedName("attestation")
    Attestation attestation;

    /**
     * For more details about Attestation, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Attestation extends StripeObject {
      /**
       * Time when the connected account attested to these fields, measured in seconds since the
       * Unix epoch.
       */
      @SerializedName("attested_at")
      Long attestedAt;

      /**
       * Account field paths covered by this attestation. These are currently returned in v2
       * Accounts API format, such as {@code defaults.profile.product_description}.
       */
      @SerializedName("fields")
      List<String> fields;
    }
  }

  /**
   * For more details about SelfFundingContext, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SelfFundingContext extends StripeObject {
    @SerializedName("source_of_wealth")
    SourceOfWealth sourceOfWealth;

    /**
     * For more details about SourceOfWealth, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceOfWealth extends StripeObject {
      /** A text explanation of the connected account's source of wealth. */
      @SerializedName("description")
      String description;

      /** IDs of uploaded files evidencing the source of wealth. */
      @SerializedName("files")
      List<String> files;
    }
  }

  /**
   * For more details about Subject, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Subject extends StripeObject {
    /**
     * Account field paths the connected account must review. These are currently returned in v2
     * Accounts API format, such as {@code defaults.profile.product_description}. Present for
     * reviewed fields Forms.
     */
    @SerializedName("fields_to_review")
    List<String> fieldsToReview;

    /** IDs of the transactions this Form is about. Present for transaction context Forms. */
    @SerializedName("transactions")
    List<String> transactions;
  }

  /**
   * For more details about TransactionContext, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionContext extends StripeObject {
    /**
     * How often the connected account expects transactions like this one. Can be {@code
     * one_time_payment}, {@code recurring_subscription}, {@code repeat_customer}, {@code
     * split_payment}, or {@code something_else}. A custom explanation can follow {@code
     * something_else: }.
     */
    @SerializedName("frequency")
    String frequency;

    /** The purpose of the transaction. */
    @SerializedName("purpose")
    String purpose;

    /** IDs of uploaded files evidencing the purpose of the transaction. */
    @SerializedName("purpose_files")
    List<String> purposeFiles;

    /** The connected account's relationship to the sender. */
    @SerializedName("sender_relationship")
    String senderRelationship;

    @SerializedName("source_of_funds")
    SourceOfFunds sourceOfFunds;

    /** How the funds from the transaction will be used. */
    @SerializedName("use_of_funds")
    String useOfFunds;

    /**
     * For more details about SourceOfFunds, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SourceOfFunds extends StripeObject {
      /** A text explanation of where the funds for the transaction came from. */
      @SerializedName("description")
      String description;

      /** IDs of uploaded files evidencing the source of funds. */
      @SerializedName("files")
      List<String> files;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(appeal, responseGetter);
    trySetResponseGetter(authorizationDocuments, responseGetter);
    trySetResponseGetter(paymentProcessing, responseGetter);
    trySetResponseGetter(productRemoval, responseGetter);
    trySetResponseGetter(reviewedFields, responseGetter);
    trySetResponseGetter(selfFundingContext, responseGetter);
    trySetResponseGetter(subject, responseGetter);
    trySetResponseGetter(transactionContext, responseGetter);
  }
}
