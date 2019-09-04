package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class SourceUpdateParams extends ApiRequestParams {
  /** Amount associated with the source. */
  @SerializedName("amount")
  Long amount;

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
   * Information about a mandate possibility attached to a source object (generally for bank debits)
   * as well as its acceptance status.
   */
  @SerializedName("mandate")
  Mandate mandate;

  /**
   * A set of key-value pairs that you can attach to a source object. It can be useful for storing
   * additional information about the source in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Information about the owner of the payment instrument that may be used or required by
   * particular source types.
   */
  @SerializedName("owner")
  Owner owner;

  /**
   * Information about the items and shipping associated with the source. Required for transactional
   * credit (for example Klarna) sources before you can charge it.
   */
  @SerializedName("source_order")
  SourceOrder sourceOrder;

  private SourceUpdateParams(
      Long amount,
      List<String> expand,
      Map<String, Object> extraParams,
      Mandate mandate,
      Map<String, String> metadata,
      Owner owner,
      SourceOrder sourceOrder) {
    this.amount = amount;
    this.expand = expand;
    this.extraParams = extraParams;
    this.mandate = mandate;
    this.metadata = metadata;
    this.owner = owner;
    this.sourceOrder = sourceOrder;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Mandate mandate;

    private Map<String, String> metadata;

    private Owner owner;

    private SourceOrder sourceOrder;

    /** Finalize and obtain parameter instance from this builder. */
    public SourceUpdateParams build() {
      return new SourceUpdateParams(
          this.amount,
          this.expand,
          this.extraParams,
          this.mandate,
          this.metadata,
          this.owner,
          this.sourceOrder);
    }

    /** Amount associated with the source. */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SourceUpdateParams#expand} for the field documentation.
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
     * SourceUpdateParams#expand} for the field documentation.
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
     * SourceUpdateParams#extraParams} for the field documentation.
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
     * See {@link SourceUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
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
     * SourceUpdateParams#metadata} for the field documentation.
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
     * See {@link SourceUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
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
     * Information about the items and shipping associated with the source. Required for
     * transactional credit (for example Klarna) sources before you can charge it.
     */
    public Builder setSourceOrder(SourceOrder sourceOrder) {
      this.sourceOrder = sourceOrder;
      return this;
    }
  }

  public static class Mandate {
    /**
     * The parameters required to notify Stripe of a mandate acceptance or refusal by the customer.
     */
    @SerializedName("acceptance")
    Acceptance acceptance;

    /** The amount specified by the mandate. (Leave null for a mandate covering all amounts) */
    @SerializedName("amount")
    Object amount;

    /** The currency specified by the mandate. (Must match `currency` of the source) */
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
     * The interval of debits permitted by the mandate. Either `one_time` (just permitting a single
     * debit), `scheduled` (with debits on an agreed schedule or for clearly-defined events), or
     * `variable`(for debits with any frequency)
     */
    @SerializedName("interval")
    Interval interval;

    /**
     * The method Stripe should use to notify the customer of upcoming debit instructions and/or
     * mandate confirmation as required by the underlying debit network. Either `email` (an email is
     * sent directly to the customer), `manual` (a `source.mandate_notification` event is sent to
     * your webhooks endpoint and you should handle the notification) or `none` (the underlying
     * debit network does not require any notification).
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

      /** The currency specified by the mandate. (Must match `currency` of the source) */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SourceUpdateParams.Mandate#extraParams} for the field documentation.
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
       * See {@link SourceUpdateParams.Mandate#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The interval of debits permitted by the mandate. Either `one_time` (just permitting a
       * single debit), `scheduled` (with debits on an agreed schedule or for clearly-defined
       * events), or `variable`(for debits with any frequency)
       */
      public Builder setInterval(Interval interval) {
        this.interval = interval;
        return this;
      }

      /**
       * The method Stripe should use to notify the customer of upcoming debit instructions and/or
       * mandate confirmation as required by the underlying debit network. Either `email` (an email
       * is sent directly to the customer), `manual` (a `source.mandate_notification` event is sent
       * to your webhooks endpoint and you should handle the notification) or `none` (the underlying
       * debit network does not require any notification).
       */
      public Builder setNotificationMethod(NotificationMethod notificationMethod) {
        this.notificationMethod = notificationMethod;
        return this;
      }
    }

    public static class Acceptance {
      /** The unix timestamp the mandate was accepted or refused at by the customer. */
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
       * The parameters required to store a mandate accepted offline. Should only be set if
       * `mandate[type]` is `offline`
       */
      @SerializedName("offline")
      Offline offline;

      /**
       * The parameters required to store a mandate accepted online. Should only be set if
       * `mandate[type]` is `online`
       */
      @SerializedName("online")
      Online online;

      /**
       * The status of the mandate acceptance. Either `accepted` (the mandate was accepted) or
       * `refused` (the mandate was refused).
       */
      @SerializedName("status")
      Status status;

      /**
       * The type of acceptance information included with the mandate. Either `online` or `offline`
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

        /** The unix timestamp the mandate was accepted or refused at by the customer. */
        public Builder setDate(Long date) {
          this.date = date;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceUpdateParams.Mandate.Acceptance#extraParams} for the field
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
         * map. See {@link SourceUpdateParams.Mandate.Acceptance#extraParams} for the field
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
         * The parameters required to store a mandate accepted offline. Should only be set if
         * `mandate[type]` is `offline`
         */
        public Builder setOffline(Offline offline) {
          this.offline = offline;
          return this;
        }

        /**
         * The parameters required to store a mandate accepted online. Should only be set if
         * `mandate[type]` is `online`
         */
        public Builder setOnline(Online online) {
          this.online = online;
          return this;
        }

        /**
         * The status of the mandate acceptance. Either `accepted` (the mandate was accepted) or
         * `refused` (the mandate was refused).
         */
        public Builder setStatus(Status status) {
          this.status = status;
          return this;
        }

        /**
         * The type of acceptance information included with the mandate. Either `online` or
         * `offline`
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

      public static class Offline {
        /**
         * An email to contact you with if a copy of the mandate is requested, required if `type` is
         * `offline`.
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
           * An email to contact you with if a copy of the mandate is requested, required if `type`
           * is `offline`.
           */
          public Builder setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceUpdateParams.Mandate.Acceptance.Offline#extraParams} for the
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
           * map. See {@link SourceUpdateParams.Mandate.Acceptance.Offline#extraParams} for the
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

      public static class Online {
        /** The unix timestamp the mandate was accepted or refused at by the customer. */
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

          /** The unix timestamp the mandate was accepted or refused at by the customer. */
          public Builder setDate(Long date) {
            this.date = date;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceUpdateParams.Mandate.Acceptance.Online#extraParams} for the field
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
           * map. See {@link SourceUpdateParams.Mandate.Acceptance.Online#extraParams} for the field
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
       * SourceUpdateParams.Owner#extraParams} for the field documentation.
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
       * See {@link SourceUpdateParams.Owner#extraParams} for the field documentation.
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

    public static class Address {
      @SerializedName("city")
      String city;

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

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

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

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SourceUpdateParams.Owner.Address#extraParams} for the field
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
         * map. See {@link SourceUpdateParams.Owner.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

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
     * Shipping address for the order. Required if any of the SKUs are for products that have
     * `shippable` set to true.
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
       * SourceUpdateParams.SourceOrder#extraParams} for the field documentation.
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
       * See {@link SourceUpdateParams.SourceOrder#extraParams} for the field documentation.
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
       * SourceUpdateParams.SourceOrder#items} for the field documentation.
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
       * SourceUpdateParams.SourceOrder#items} for the field documentation.
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
       * `shippable` set to true.
       */
      public Builder setShipping(Shipping shipping) {
        this.shipping = shipping;
        return this;
      }
    }

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
       * The quantity of this order item. When type is `sku`, this is the number of instances of the
       * SKU to be ordered.
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
         * map. See {@link SourceUpdateParams.SourceOrder.Item#extraParams} for the field
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
         * map. See {@link SourceUpdateParams.SourceOrder.Item#extraParams} for the field
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
         * The quantity of this order item. When type is `sku`, this is the number of instances of
         * the SKU to be ordered.
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
         * map. See {@link SourceUpdateParams.SourceOrder.Shipping#extraParams} for the field
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
         * map. See {@link SourceUpdateParams.SourceOrder.Shipping#extraParams} for the field
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

      public static class Address {
        @SerializedName("city")
        String city;

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

        @SerializedName("line1")
        String line1;

        @SerializedName("line2")
        String line2;

        @SerializedName("postal_code")
        String postalCode;

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

          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link SourceUpdateParams.SourceOrder.Shipping.Address#extraParams} for the
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
           * map. See {@link SourceUpdateParams.SourceOrder.Shipping.Address#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }
  }
}
