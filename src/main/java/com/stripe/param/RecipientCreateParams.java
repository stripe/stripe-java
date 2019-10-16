package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class RecipientCreateParams extends ApiRequestParams {
  /**
   * A bank account to attach to the recipient. You can provide either a token, like the ones
   * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a user's
   * bank account details, with the options described below.
   */
  @SerializedName("bank_account")
  String bankAccount;

  /**
   * A U.S. Visa or MasterCard debit card (_not_ prepaid) to attach to the recipient. If the debit
   * card is not valid, recipient creation will fail. You can provide either a token, like the ones
   * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a user's
   * debit card details, with the options described below. Although not all information is required,
   * the extra info helps prevent fraud.
   */
  @SerializedName("card")
  String card;

  /**
   * An arbitrary string which you can attach to a `Recipient` object. It is displayed alongside the
   * recipient in the web interface.
   */
  @SerializedName("description")
  String description;

  /**
   * The recipient's email address. It is displayed alongside the recipient in the web interface,
   * and can be useful for searching and tracking.
   */
  @SerializedName("email")
  String email;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format. Individual keys can be unset by
   * posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The recipient's full, legal name. For type `individual`, should be in the format `First Last`,
   * `First Middle Last`, or `First M Last` (no prefixes or suffixes). For `corporation`, the full,
   * incorporated name.
   */
  @SerializedName("name")
  String name;

  /**
   * The recipient's tax ID, as a string. For type `individual`, the full SSN; for type
   * `corporation`, the full EIN.
   */
  @SerializedName("tax_id")
  String taxId;

  /** Type of the recipient: either `individual` or `corporation`. */
  @SerializedName("type")
  String type;

  private RecipientCreateParams(
      String bankAccount,
      String card,
      String description,
      String email,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String name,
      String taxId,
      String type) {
    this.bankAccount = bankAccount;
    this.card = card;
    this.description = description;
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.name = name;
    this.taxId = taxId;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String bankAccount;

    private String card;

    private String description;

    private String email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String name;

    private String taxId;

    private String type;

    /** Finalize and obtain parameter instance from this builder. */
    public RecipientCreateParams build() {
      return new RecipientCreateParams(
          this.bankAccount,
          this.card,
          this.description,
          this.email,
          this.expand,
          this.extraParams,
          this.metadata,
          this.name,
          this.taxId,
          this.type);
    }

    /**
     * A bank account to attach to the recipient. You can provide either a token, like the ones
     * returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a
     * user's bank account details, with the options described below.
     */
    public Builder setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * A U.S. Visa or MasterCard debit card (_not_ prepaid) to attach to the recipient. If the debit
     * card is not valid, recipient creation will fail. You can provide either a token, like the
     * ones returned by [Stripe.js](https://stripe.com/docs/stripe-js), or a dictionary containing a
     * user's debit card details, with the options described below. Although not all information is
     * required, the extra info helps prevent fraud.
     */
    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a `Recipient` object. It is displayed alongside
     * the recipient in the web interface.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The recipient's email address. It is displayed alongside the recipient in the web interface,
     * and can be useful for searching and tracking.
     */
    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RecipientCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RecipientCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RecipientCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RecipientCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * RecipientCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link RecipientCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The recipient's full, legal name. For type `individual`, should be in the format `First
     * Last`, `First Middle Last`, or `First M Last` (no prefixes or suffixes). For `corporation`,
     * the full, incorporated name.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * The recipient's tax ID, as a string. For type `individual`, the full SSN; for type
     * `corporation`, the full EIN.
     */
    public Builder setTaxId(String taxId) {
      this.taxId = taxId;
      return this;
    }

    /** Type of the recipient: either `individual` or `corporation`. */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }
  }
}
