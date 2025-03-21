// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AccountNoticeUpdateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Information about the email you sent. */
  @SerializedName("email")
  Email email;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> Date when you sent the notice. */
  @SerializedName("sent_at")
  Long sentAt;

  private AccountNoticeUpdateParams(
      Email email,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Long sentAt) {
    this.email = email;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.sentAt = sentAt;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Email email;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Long sentAt;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountNoticeUpdateParams build() {
      return new AccountNoticeUpdateParams(
          this.email, this.expand, this.extraParams, this.metadata, this.sentAt);
    }

    /** <strong>Required.</strong> Information about the email you sent. */
    public Builder setEmail(AccountNoticeUpdateParams.Email email) {
      this.email = email;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountNoticeUpdateParams#expand} for the field documentation.
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
     * AccountNoticeUpdateParams#expand} for the field documentation.
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
     * AccountNoticeUpdateParams#extraParams} for the field documentation.
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
     * See {@link AccountNoticeUpdateParams#extraParams} for the field documentation.
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
     * AccountNoticeUpdateParams#metadata} for the field documentation.
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
     * See {@link AccountNoticeUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Date when you sent the notice. */
    public Builder setSentAt(Long sentAt) {
      this.sentAt = sentAt;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Email {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> Content of the email in plain text. The copy must match exactly
     * the language that Stripe Compliance has approved for use.
     */
    @SerializedName("plain_text")
    Object plainText;

    /** <strong>Required.</strong> Email address of the recipient. */
    @SerializedName("recipient")
    Object recipient;

    /** <strong>Required.</strong> Subject of the email. */
    @SerializedName("subject")
    Object subject;

    private Email(
        Map<String, Object> extraParams, Object plainText, Object recipient, Object subject) {
      this.extraParams = extraParams;
      this.plainText = plainText;
      this.recipient = recipient;
      this.subject = subject;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object plainText;

      private Object recipient;

      private Object subject;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountNoticeUpdateParams.Email build() {
        return new AccountNoticeUpdateParams.Email(
            this.extraParams, this.plainText, this.recipient, this.subject);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountNoticeUpdateParams.Email#extraParams} for the field documentation.
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
       * See {@link AccountNoticeUpdateParams.Email#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> Content of the email in plain text. The copy must match exactly
       * the language that Stripe Compliance has approved for use.
       */
      public Builder setPlainText(String plainText) {
        this.plainText = plainText;
        return this;
      }

      /**
       * <strong>Required.</strong> Content of the email in plain text. The copy must match exactly
       * the language that Stripe Compliance has approved for use.
       */
      public Builder setPlainText(EmptyParam plainText) {
        this.plainText = plainText;
        return this;
      }

      /** <strong>Required.</strong> Email address of the recipient. */
      public Builder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
      }

      /** <strong>Required.</strong> Email address of the recipient. */
      public Builder setRecipient(EmptyParam recipient) {
        this.recipient = recipient;
        return this;
      }

      /** <strong>Required.</strong> Subject of the email. */
      public Builder setSubject(String subject) {
        this.subject = subject;
        return this;
      }

      /** <strong>Required.</strong> Subject of the email. */
      public Builder setSubject(EmptyParam subject) {
        this.subject = subject;
        return this;
      }
    }
  }
}
