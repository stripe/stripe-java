// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SourceCreateParams extends ApiRequestParams {
  /**
   * Amount associated with the source. This is the amount for which the source will be chargeable
   * once ready. Required for {@code single_use} sources. Not supported for {@code receiver} type
   * sources, where charge amount may not be specified until funds land.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a>
   * associated with the source. This is the currency for which the source will be chargeable once
   * ready.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The {@code Customer} to whom the original source is attached to. Must be set when the original
   * source is not a {@code Source} (e.g., {@code Card}).
   */
  @SerializedName("customer")
  String customer;

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
   * The authentication {@code flow} of the source to create. {@code flow} is one of {@code
   * redirect}, {@code receiver}, {@code code_verification}, {@code none}. It is generally inferred
   * unless a type supports multiple flows.
   */
  @SerializedName("flow")
  Flow flow;

  /**
   * Information about a mandate possibility attached to a source object (generally for bank debits)
   * as well as its acceptance status.
   */
  @SerializedName("mandate")
  Mandate mandate;

  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The source to share. */
  @SerializedName("original_source")
  String originalSource;

  /**
   * Information about the owner of the payment instrument that may be used or required by
   * particular source types.
   */
  @SerializedName("owner")
  Owner owner;

  /**
   * Optional parameters for the receiver flow. Can be set only if the source is a receiver ({@code
   * flow} is {@code receiver}).
   */
  @SerializedName("receiver")
  Receiver receiver;

  /**
   * Parameters required for the redirect flow. Required if the source is authenticated by a
   * redirect ({@code flow} is {@code redirect}).
   */
  @SerializedName("redirect")
  Redirect redirect;

  /**
   * Information about the items and shipping associated with the source. Required for transactional
   * credit (for example Klarna) sources before you can charge it.
   */
  @SerializedName("source_order")
  SourceOrder sourceOrder;

  /**
   * An arbitrary string to be displayed on your customer's statement. As an example, if your
   * website is {@code RunClub} and the item you're charging for is a race ticket, you may want to
   * specify a {@code statement_descriptor} of {@code RunClub 5K race ticket.} While many payment
   * types will display this information, some may not display it at all.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * An optional token used to create the source. When passed, token properties will override source
   * parameters.
   */
  @SerializedName("token")
  String token;

  /**
   * The {@code type} of the source to create. Required unless {@code customer} and {@code
   * original_source} are specified (see the <a
   * href="https://stripe.com/docs/sources/connect#cloning-card-sources">Cloning card Sources</a>
   * guide)
   */
  @SerializedName("type")
  String type;

  @SerializedName("usage")
  Usage usage;

  private SourceCreateParams(
      Long amount,
      String currency,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      Flow flow,
      Mandate mandate,
      Map<String, String> metadata,
      String originalSource,
      Owner owner,
      Receiver receiver,
      Redirect redirect,
      SourceOrder sourceOrder,
      String statementDescriptor,
      String token,
      String type,
      Usage usage) {
    this.amount = amount;
    this.currency = currency;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.flow = flow;
    this.mandate = mandate;
    this.metadata = metadata;
    this.originalSource = originalSource;
    this.owner = owner;
    this.receiver = receiver;
    this.redirect = redirect;
    this.sourceOrder = sourceOrder;
    this.statementDescriptor = statementDescriptor;
    this.token = token;
    this.type = type;
    this.usage = usage;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private String currency;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Flow flow;

    private Mandate mandate;

    private Map<String, String> metadata;

    private String originalSource;

    private Owner owner;

    private Receiver receiver;

    private Redirect redirect;

    private SourceOrder sourceOrder;

    private String statementDescriptor;

    private String token;

    private String type;

    private Usage usage;

    /** Finalize and obtain parameter instance from this builder. */
    public SourceCreateParams build() {
      return new SourceCreateParams(
          this.amount,
          this.currency,
          this.customer,
          this.expand,
          this.extraParams,
          this.flow,
          this.mandate,
          this.metadata,
          this.originalSource,
          this.owner,
          this.receiver,
          this.redirect,
          this.sourceOrder,
          this.statementDescriptor,
          this.token,
          this.type,
          this.usage);
    }

    /**
     * Amount associated with the source. This is the amount for which the source will be chargeable
     * once ready. Required for {@code single_use} sources. Not supported for {@code receiver} type
     * sources, where charge amount may not be specified until funds land.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Three-letter <a href="https://stripe.com/docs/currencies">ISO code for the currency</a>
     * associated with the source. This is the currency for which the source will be chargeable once
     * ready.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The {@code Customer} to whom the original source is attached to. Must be set when the
     * original source is not a {@code Source} (e.g., {@code Card}).
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SourceCreateParams#expand} for the field documentation.
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
     * SourceCreateParams#expand} for the field documentation.
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
     * SourceCreateParams#extraParams} for the field documentation.
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
     * See {@link SourceCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The authentication {@code flow} of the source to create. {@code flow} is one of {@code
     * redirect}, {@code receiver}, {@code code_verification}, {@code none}. It is generally
     * inferred unless a type supports multiple flows.
     */
    public Builder setFlow(Flow flow) {
      this.flow = flow;
      return this;
    }

    /**
     * Information about a mandate possibility attached to a source object (generally for bank
     * debits) as well as its acceptance status.
     */
    public Builder setMandate(Mandate mandate) {
      this.mandate = mandate;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SourceCreateParams#metadata} for the field documentation.
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
     * See {@link SourceCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The source to share. */
    public Builder setOriginalSource(String originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    /**
     * Information about the owner of the payment instrument that may be used or required by
     * particular source types.
     */
    public Builder setOwner(Owner owner) {
      this.owner = owner;
      return this;
    }

    /**
     * Optional parameters for the receiver flow. Can be set only if the source is a receiver
     * ({@code flow} is {@code receiver}).
     */
    public Builder setReceiver(Receiver receiver) {
      this.receiver = receiver;
      return this;
    }

    /**
     * Parameters required for the redirect flow. Required if the source is authenticated by a
     * redirect ({@code flow} is {@code redirect}).
     */
    public Builder setRedirect(Redirect redirect) {
      this.redirect = redirect;
      return this;
    }

    /**
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     */
    public Builder setSourceOrder(SourceOrder sourceOrder) {
      this.sourceOrder = sourceOrder;
      return this;
    }

    /**
     * An arbitrary string to be displayed on your customer's statement. As an example, if your
     * website is {@code RunClub} and the item you're charging for is a race ticket, you may want to
     * specify a {@code statement_descriptor} of {@code RunClub 5K race ticket.} While many payment
     * types will display this information, some may not display it at all.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * An optional token used to create the source. When passed, token properties will override
     * source parameters.
     */
    public Builder setToken(String token) {
      this.token = token;
      return this;
    }

    /**
     * The {@code type} of the source to create. Required unless {@code customer} and {@code
     * original_source} are specified (see the <a
     * href="https://stripe.com/docs/sources/connect#cloning-card-sources">Cloning card Sources</a>
     * guide)
     */
    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public Builder setUsage(Usage usage) {
      this.usage = usage;
      return this;
    }
  }

  @Getter
  public static class Mandate {
    /**
     * The parameters required to notify Stripe of a mandate acceptance or refusal by the customer.
     */
    @SerializedName("acceptance")
    Acceptance acceptance;

    /** The amount specified by the mandate. (Leave null for a mandate covering all amounts) */
    @SerializedName("amount")
    Object amount;

    /** The currency specified by the mandate. (Must match {@code currency} of the source) */
    @SerializedName("currency")
    String currency;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The interval of debits permitted by the mandate. Either {@code one_time} (just permitting a
     * single debit), {@code scheduled} (with debits on an agreed schedule or for clearly-defined
     * events), or {@code variable}(for debits with any frequency)
     */
    @SerializedName("interval")
    Interval interval;

    /**
     * The method Stripe should use to notify the customer of upcoming debit instructions and/or
     * mandate confirmation as required by the underlying debit network. Either {@code email} (an
     * email is sent directly to the customer), {@code manual} (a {@code
     * source.mandate_notification} event is sent to your webhooks endpoint and you should handle
     * the notification) or {@code none} (the underlying debit network does not require any
     * notification).
     */
    @SerializedName("notification_method")
    NotificationMethod notificationMethod;

    private Mandate(
        Acceptance acceptance,
        Object amount,
        String currency,
        Map<String, Object> extraParams,
        Interval interval,
        NotificationMethod notificationMethod) {
      this.acceptance = acceptance;
      this.amount = amount;
      this.currency = currency;
      this.extraParams = extraParams;
      this.interval = interval;
      this.notificationMethod = notificationMethod;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Acceptance acceptance;

      private Object amount;

      private String currency;

      private Map<String, Object> extraParams;

      private Interval interval;

      private NotificationMethod notificationMethod;

      /** Finalize and obtain parameter instance from this builder. */
      public Mandate build() {
        return new Mandate(
            this.acceptance,
            this.amount,
            this.currency,
            this.extraParams,
            this.interval,
            this.notificationMethod);
      }

      /**
       * The parameters required to notify Stripe of a mandate acceptance or refusal by the
       * customer.
       */
      public Builder setAcceptance(Acceptance acceptance) {
        this.acceptance = acceptance;
        return this;
      }

      /** The amount specified by the mandate. (Leave null for a mandate covering all amounts) */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** The amount specified by the mandate. (Leave null for a mandate covering all amounts) */
      public Builder setAmount(EmptyParam amount) {
        this.amount = amount;
        return this;
      }

      /** The currency specified by the mandate. (Must match {@code currency} of the source) */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.Mandate#extraParams} for the field documentation.
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
       * See {@link SourceCreateParams.Mandate#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The interval of debits permitted by the mandate. Either {@code one_time} (just permitting a
       * single debit), {@code scheduled} (with debits on an agreed schedule or for clearly-defined
       * events), or {@code variable}(for debits with any frequency)
       */
      public Builder setInterval(Interval interval) {
        this.interval = interval;
        return this;
      }

      /**
       * The method Stripe should use to notify the customer of upcoming debit instructions and/or
       * mandate confirmation as required by the underlying debit network. Either {@code email} (an
       * email is sent directly to the customer), {@code manual} (a {@code
       * source.mandate_notification} event is sent to your webhooks endpoint and you should handle
       * the notification) or {@code none} (the underlying debit network does not require any
       * notification).
       */
      public Builder setNotificationMethod(NotificationMethod notificationMethod) {
        this.notificationMethod = notificationMethod;
        return this;
      }
    }

    @Getter
    public static class Acceptance {
      /**
       * The Unix timestamp (in seconds) when the mandate was accepted or refused by the customer.
       */
      @SerializedName("date")
      Long date;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The IP address from which the mandate was accepted or refused by the customer. */
      @SerializedName("ip")
      String ip;

      /**
       * The parameters required to store a mandate accepted offline. Should only be set if {@code
       * mandate[type]} is {@code offline}
       */
      @SerializedName("offline")
      Offline offline;

      /**
       * The parameters required to store a mandate accepted online. Should only be set if {@code
       * mandate[type]} is {@code online}
       */
      @SerializedName("online")
      Online online;

      /**
       * The status of the mandate acceptance. Either {@code accepted} (the mandate was accepted) or
       * {@code refused} (the mandate was refused).
       */
      @SerializedName("status")
      Status status;

      /**
       * The type of acceptance information included with the mandate. Either {@code online} or
       * {@code offline}
       */
      @SerializedName("type")
      Type type;

      /**
       * The user agent of the browser from which the mandate was accepted or refused by the
       * customer.
       */
      @SerializedName("user_agent")
      String userAgent;

      private Acceptance(
          Long date,
          Map<String, Object> extraParams,
          String ip,
          Offline offline,
          Online online,
          Status status,
          Type type,
          String userAgent) {
        this.date = date;
        this.extraParams = extraParams;
        this.ip = ip;
        this.offline = offline;
        this.online = online;
        this.status = status;
        this.type = type;
        this.userAgent = userAgent;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long date;

        private Map<String, Object> extraParams;

        private String ip;

        private Offline offline;

        private Online online;

        private Status status;

        private Type type;

        private String userAgent;

        /** Finalize and obtain parameter instance from this builder. */
        public Acceptance build() {
          return new Acceptance(
              this.date,
              this.extraParams,
              this.ip,
              this.offline,
              this.online,
              this.status,
              this.type,
              this.userAgent);
        }

        /**
         * The Unix timestamp (in seconds) when the mandate was accepted or refused by the customer.
         */
        public Builder setDate(Long date) {
          this.date = date;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.Mandate.Acceptance#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.Mandate.Acceptance#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The IP address from which the mandate was accepted or refused by the customer. */
        public Builder setIp(String ip) {
          this.ip = ip;
          return this;
        }

        /**
         * The parameters required to store a mandate accepted offline. Should only be set if {@code
         * mandate[type]} is {@code offline}
         */
        public Builder setOffline(Offline offline) {
          this.offline = offline;
          return this;
        }

        /**
         * The parameters required to store a mandate accepted online. Should only be set if {@code
         * mandate[type]} is {@code online}
         */
        public Builder setOnline(Online online) {
          this.online = online;
          return this;
        }

        /**
         * The status of the mandate acceptance. Either {@code accepted} (the mandate was accepted)
         * or {@code refused} (the mandate was refused).
         */
        public Builder setStatus(Status status) {
          this.status = status;
          return this;
        }

        /**
         * The type of acceptance information included with the mandate. Either {@code online} or
         * {@code offline}
         */
        public Builder setType(Type type) {
          this.type = type;
          return this;
        }

        /**
         * The user agent of the browser from which the mandate was accepted or refused by the
         * customer.
         */
        public Builder setUserAgent(String userAgent) {
          this.userAgent = userAgent;
          return this;
        }
      }

      @Getter
      public static class Offline {
        /**
         * An email to contact you with if a copy of the mandate is requested, required if {@code
         * type} is {@code offline}.
         */
        @SerializedName("contact_email")
        String contactEmail;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Offline(String contactEmail, Map<String, Object> extraParams) {
          this.contactEmail = contactEmail;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String contactEmail;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public Offline build() {
            return new Offline(this.contactEmail, this.extraParams);
          }

          /**
           * An email to contact you with if a copy of the mandate is requested, required if {@code
           * type} is {@code offline}.
           */
          public Builder setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceCreateParams.Mandate.Acceptance.Offline#extraParams} for the
           * field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceCreateParams.Mandate.Acceptance.Offline#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }
      }

      @Getter
      public static class Online {
        /**
         * The Unix timestamp (in seconds) when the mandate was accepted or refused by the customer.
         */
        @SerializedName("date")
        Long date;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the mandate was accepted or refused by the customer. */
        @SerializedName("ip")
        String ip;

        /**
         * The user agent of the browser from which the mandate was accepted or refused by the
         * customer.
         */
        @SerializedName("user_agent")
        String userAgent;

        private Online(Long date, Map<String, Object> extraParams, String ip, String userAgent) {
          this.date = date;
          this.extraParams = extraParams;
          this.ip = ip;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long date;

          private Map<String, Object> extraParams;

          private String ip;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public Online build() {
            return new Online(this.date, this.extraParams, this.ip, this.userAgent);
          }

          /**
           * The Unix timestamp (in seconds) when the mandate was accepted or refused by the
           * customer.
           */
          public Builder setDate(Long date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceCreateParams.Mandate.Acceptance.Online#extraParams} for the field
           * documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceCreateParams.Mandate.Acceptance.Online#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the mandate was accepted or refused by the customer. */
          public Builder setIp(String ip) {
            this.ip = ip;
            return this;
          }

          /**
           * The user agent of the browser from which the mandate was accepted or refused by the
           * customer.
           */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      public enum Status implements ApiRequestParams.EnumParam {
        @SerializedName("accepted")
        ACCEPTED("accepted"),

        @SerializedName("pending")
        PENDING("pending"),

        @SerializedName("refused")
        REFUSED("refused"),

        @SerializedName("revoked")
        REVOKED("revoked");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Status(String value) {
          this.value = value;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("offline")
        OFFLINE("offline"),

        @SerializedName("online")
        ONLINE("online");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Interval implements ApiRequestParams.EnumParam {
      @SerializedName("one_time")
      ONE_TIME("one_time"),

      @SerializedName("scheduled")
      SCHEDULED("scheduled"),

      @SerializedName("variable")
      VARIABLE("variable");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Interval(String value) {
        this.value = value;
      }
    }

    public enum NotificationMethod implements ApiRequestParams.EnumParam {
      @SerializedName("deprecated_none")
      DEPRECATED_NONE("deprecated_none"),

      @SerializedName("email")
      EMAIL("email"),

      @SerializedName("manual")
      MANUAL("manual"),

      @SerializedName("none")
      NONE("none"),

      @SerializedName("stripe_email")
      STRIPE_EMAIL("stripe_email");

      @Getter(onMethod_ = {@Override})
      private final String value;

      NotificationMethod(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Owner {
    /** Owner's address. */
    @SerializedName("address")
    Address address;

    /** Owner's email address. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Owner's full name. */
    @SerializedName("name")
    String name;

    /** Owner's phone number. */
    @SerializedName("phone")
    String phone;

    private Owner(
        Address address, String email, Map<String, Object> extraParams, String name, String phone) {
      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private String email;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public Owner build() {
        return new Owner(this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Owner's address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** Owner's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.Owner#extraParams} for the field documentation.
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
       * See {@link SourceCreateParams.Owner#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Owner's full name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Owner's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public Address build() {
          return new Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.Owner.Address#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.Owner.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  public static class Receiver {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The method Stripe should use to request information needed to process a refund or mispayment.
     * Either {@code email} (an email is sent directly to the customer) or {@code manual} (a {@code
     * source.refund_attributes_required} event is sent to your webhooks endpoint). Refer to each
     * payment method's documentation to learn which refund attributes may be required.
     */
    @SerializedName("refund_attributes_method")
    RefundAttributesMethod refundAttributesMethod;

    private Receiver(
        Map<String, Object> extraParams, RefundAttributesMethod refundAttributesMethod) {
      this.extraParams = extraParams;
      this.refundAttributesMethod = refundAttributesMethod;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private RefundAttributesMethod refundAttributesMethod;

      /** Finalize and obtain parameter instance from this builder. */
      public Receiver build() {
        return new Receiver(this.extraParams, this.refundAttributesMethod);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.Receiver#extraParams} for the field documentation.
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
       * See {@link SourceCreateParams.Receiver#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The method Stripe should use to request information needed to process a refund or
       * mispayment. Either {@code email} (an email is sent directly to the customer) or {@code
       * manual} (a {@code source.refund_attributes_required} event is sent to your webhooks
       * endpoint). Refer to each payment method's documentation to learn which refund attributes
       * may be required.
       */
      public Builder setRefundAttributesMethod(RefundAttributesMethod refundAttributesMethod) {
        this.refundAttributesMethod = refundAttributesMethod;
        return this;
      }
    }

    public enum RefundAttributesMethod implements ApiRequestParams.EnumParam {
      @SerializedName("email")
      EMAIL("email"),

      @SerializedName("manual")
      MANUAL("manual"),

      @SerializedName("none")
      NONE("none");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RefundAttributesMethod(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Redirect {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The URL you provide to redirect the customer back to you after they authenticated their
     * payment. It can use your application URI scheme in the context of a mobile application.
     */
    @SerializedName("return_url")
    String returnUrl;

    private Redirect(Map<String, Object> extraParams, String returnUrl) {
      this.extraParams = extraParams;
      this.returnUrl = returnUrl;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String returnUrl;

      /** Finalize and obtain parameter instance from this builder. */
      public Redirect build() {
        return new Redirect(this.extraParams, this.returnUrl);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.Redirect#extraParams} for the field documentation.
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
       * See {@link SourceCreateParams.Redirect#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The URL you provide to redirect the customer back to you after they authenticated their
       * payment. It can use your application URI scheme in the context of a mobile application.
       */
      public Builder setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
      }
    }
  }

  @Getter
  public static class SourceOrder {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** List of items constituting the order. */
    @SerializedName("items")
    List<Item> items;

    /**
     * Shipping address for the order. Required if any of the SKUs are for products that have {@code
     * shippable} set to true.
     */
    @SerializedName("shipping")
    Shipping shipping;

    private SourceOrder(Map<String, Object> extraParams, List<Item> items, Shipping shipping) {
      this.extraParams = extraParams;
      this.items = items;
      this.shipping = shipping;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private List<Item> items;

      private Shipping shipping;

      /** Finalize and obtain parameter instance from this builder. */
      public SourceOrder build() {
        return new SourceOrder(this.extraParams, this.items, this.shipping);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceCreateParams.SourceOrder#extraParams} for the field documentation.
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
       * See {@link SourceCreateParams.SourceOrder#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `items` list. A list is initialized for the first `add/addAll` call, and
       * subsequent calls adds additional elements to the original list. See {@link
       * SourceCreateParams.SourceOrder#items} for the field documentation.
       */
      public Builder addItem(Item element) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.add(element);
        return this;
      }

      /**
       * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * SourceCreateParams.SourceOrder#items} for the field documentation.
       */
      public Builder addAllItem(List<Item> elements) {
        if (this.items == null) {
          this.items = new ArrayList<>();
        }
        this.items.addAll(elements);
        return this;
      }

      /**
       * Shipping address for the order. Required if any of the SKUs are for products that have
       * {@code shippable} set to true.
       */
      public Builder setShipping(Shipping shipping) {
        this.shipping = shipping;
        return this;
      }
    }

    @Getter
    public static class Item {
      @SerializedName("amount")
      Long amount;

      @SerializedName("currency")
      String currency;

      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of the SKU being ordered. */
      @SerializedName("parent")
      String parent;

      /**
       * The quantity of this order item. When type is {@code sku}, this is the number of instances
       * of the SKU to be ordered.
       */
      @SerializedName("quantity")
      Long quantity;

      @SerializedName("type")
      Type type;

      private Item(
          Long amount,
          String currency,
          String description,
          Map<String, Object> extraParams,
          String parent,
          Long quantity,
          Type type) {
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.extraParams = extraParams;
        this.parent = parent;
        this.quantity = quantity;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long amount;

        private String currency;

        private String description;

        private Map<String, Object> extraParams;

        private String parent;

        private Long quantity;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public Item build() {
          return new Item(
              this.amount,
              this.currency,
              this.description,
              this.extraParams,
              this.parent,
              this.quantity,
              this.type);
        }

        public Builder setAmount(Long amount) {
          this.amount = amount;
          return this;
        }

        public Builder setCurrency(String currency) {
          this.currency = currency;
          return this;
        }

        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.SourceOrder.Item#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.SourceOrder.Item#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the SKU being ordered. */
        public Builder setParent(String parent) {
          this.parent = parent;
          return this;
        }

        /**
         * The quantity of this order item. When type is {@code sku}, this is the number of
         * instances of the SKU to be ordered.
         */
        public Builder setQuantity(Long quantity) {
          this.quantity = quantity;
          return this;
        }

        public Builder setType(Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("discount")
        DISCOUNT("discount"),

        @SerializedName("shipping")
        SHIPPING("shipping"),

        @SerializedName("sku")
        SKU("sku"),

        @SerializedName("tax")
        TAX("tax");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Shipping {
      /** Shipping address. */
      @SerializedName("address")
      Address address;

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      @SerializedName("carrier")
      String carrier;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Recipient name. */
      @SerializedName("name")
      String name;

      /** Recipient phone (including extension). */
      @SerializedName("phone")
      String phone;

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      @SerializedName("tracking_number")
      String trackingNumber;

      private Shipping(
          Address address,
          String carrier,
          Map<String, Object> extraParams,
          String name,
          String phone,
          String trackingNumber) {
        this.address = address;
        this.carrier = carrier;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
        this.trackingNumber = trackingNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private String carrier;

        private Map<String, Object> extraParams;

        private String name;

        private String phone;

        private String trackingNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public Shipping build() {
          return new Shipping(
              this.address,
              this.carrier,
              this.extraParams,
              this.name,
              this.phone,
              this.trackingNumber);
        }

        /** Shipping address. */
        public Builder setAddress(Address address) {
          this.address = address;
          return this;
        }

        /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
        public Builder setCarrier(String carrier) {
          this.carrier = carrier;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.SourceOrder.Shipping#extraParams} for the field
         * documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceCreateParams.SourceOrder.Shipping#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Recipient name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Recipient phone (including extension). */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }

        /**
         * The tracking number for a physical product, obtained from the delivery service. If
         * multiple tracking numbers were generated for this purchase, please separate them with
         * commas.
         */
        public Builder setTrackingNumber(String trackingNumber) {
          this.trackingNumber = trackingNumber;
          return this;
        }
      }

      @Getter
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;

        private Address(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            String state) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String city;

          private String country;

          private Map<String, Object> extraParams;

          private String line1;

          private String line2;

          private String postalCode;

          private String state;

          /** Finalize and obtain parameter instance from this builder. */
          public Address build() {
            return new Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceCreateParams.SourceOrder.Shipping.Address#extraParams} for the
           * field documentation.
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceCreateParams.SourceOrder.Shipping.Address#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }
  }

  public enum Flow implements ApiRequestParams.EnumParam {
    @SerializedName("code_verification")
    CODE_VERIFICATION("code_verification"),

    @SerializedName("none")
    NONE("none"),

    @SerializedName("receiver")
    RECEIVER("receiver"),

    @SerializedName("redirect")
    REDIRECT("redirect");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Flow(String value) {
      this.value = value;
    }
  }

  public enum Usage implements ApiRequestParams.EnumParam {
    @SerializedName("reusable")
    REUSABLE("reusable"),

    @SerializedName("single_use")
    SINGLE_USE("single_use");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Usage(String value) {
      this.value = value;
    }
  }
}
