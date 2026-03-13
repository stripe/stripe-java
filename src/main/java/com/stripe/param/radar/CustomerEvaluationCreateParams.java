// File generated from our OpenAPI spec
package com.stripe.param.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CustomerEvaluationCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Array of context entries for the evaluation. */
  @SerializedName("evaluation_context")
  List<CustomerEvaluationCreateParams.EvaluationContext> evaluationContext;

  /** <strong>Required.</strong> The type of evaluation event. */
  @SerializedName("event_type")
  EventType eventType;

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

  private CustomerEvaluationCreateParams(
      List<CustomerEvaluationCreateParams.EvaluationContext> evaluationContext,
      EventType eventType,
      List<String> expand,
      Map<String, Object> extraParams) {
    this.evaluationContext = evaluationContext;
    this.eventType = eventType;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<CustomerEvaluationCreateParams.EvaluationContext> evaluationContext;

    private EventType eventType;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerEvaluationCreateParams build() {
      return new CustomerEvaluationCreateParams(
          this.evaluationContext, this.eventType, this.expand, this.extraParams);
    }

    /**
     * Add an element to `evaluationContext` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * CustomerEvaluationCreateParams#evaluationContext} for the field documentation.
     */
    public Builder addEvaluationContext(CustomerEvaluationCreateParams.EvaluationContext element) {
      if (this.evaluationContext == null) {
        this.evaluationContext = new ArrayList<>();
      }
      this.evaluationContext.add(element);
      return this;
    }

    /**
     * Add all elements to `evaluationContext` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link CustomerEvaluationCreateParams#evaluationContext} for the field documentation.
     */
    public Builder addAllEvaluationContext(
        List<CustomerEvaluationCreateParams.EvaluationContext> elements) {
      if (this.evaluationContext == null) {
        this.evaluationContext = new ArrayList<>();
      }
      this.evaluationContext.addAll(elements);
      return this;
    }

    /** <strong>Required.</strong> The type of evaluation event. */
    public Builder setEventType(CustomerEvaluationCreateParams.EventType eventType) {
      this.eventType = eventType;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerEvaluationCreateParams#expand} for the field documentation.
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
     * CustomerEvaluationCreateParams#expand} for the field documentation.
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
     * CustomerEvaluationCreateParams#extraParams} for the field documentation.
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
     * See {@link CustomerEvaluationCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class EvaluationContext {
    /** Client details context. */
    @SerializedName("client_details")
    ClientDetails clientDetails;

    /** Customer details context. */
    @SerializedName("customer_details")
    CustomerDetails customerDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The type of context entry. */
    @SerializedName("type")
    Type type;

    private EvaluationContext(
        ClientDetails clientDetails,
        CustomerDetails customerDetails,
        Map<String, Object> extraParams,
        Type type) {
      this.clientDetails = clientDetails;
      this.customerDetails = customerDetails;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ClientDetails clientDetails;

      private CustomerDetails customerDetails;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerEvaluationCreateParams.EvaluationContext build() {
        return new CustomerEvaluationCreateParams.EvaluationContext(
            this.clientDetails, this.customerDetails, this.extraParams, this.type);
      }

      /** Client details context. */
      public Builder setClientDetails(
          CustomerEvaluationCreateParams.EvaluationContext.ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
        return this;
      }

      /** Customer details context. */
      public Builder setCustomerDetails(
          CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerEvaluationCreateParams.EvaluationContext#extraParams} for the field documentation.
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
       * See {@link CustomerEvaluationCreateParams.EvaluationContext#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The type of context entry. */
      public Builder setType(CustomerEvaluationCreateParams.EvaluationContext.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ClientDetails {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> ID for the Radar Session associated with the customer
       * evaluation.
       */
      @SerializedName("radar_session")
      String radarSession;

      private ClientDetails(Map<String, Object> extraParams, String radarSession) {
        this.extraParams = extraParams;
        this.radarSession = radarSession;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String radarSession;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerEvaluationCreateParams.EvaluationContext.ClientDetails build() {
          return new CustomerEvaluationCreateParams.EvaluationContext.ClientDetails(
              this.extraParams, this.radarSession);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CustomerEvaluationCreateParams.EvaluationContext.ClientDetails#extraParams} for the field
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
         * map. See {@link
         * CustomerEvaluationCreateParams.EvaluationContext.ClientDetails#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> ID for the Radar Session associated with the customer
         * evaluation.
         */
        public Builder setRadarSession(String radarSession) {
          this.radarSession = radarSession;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerDetails {
      /** Stripe customer ID. */
      @SerializedName("customer")
      String customer;

      /** Customer data. */
      @SerializedName("customer_data")
      CustomerData customerData;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private CustomerDetails(
          String customer, CustomerData customerData, Map<String, Object> extraParams) {
        this.customer = customer;
        this.customerData = customerData;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String customer;

        private CustomerData customerData;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails build() {
          return new CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails(
              this.customer, this.customerData, this.extraParams);
        }

        /** Stripe customer ID. */
        public Builder setCustomer(String customer) {
          this.customer = customer;
          return this;
        }

        /** Customer data. */
        public Builder setCustomerData(
            CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails.CustomerData
                customerData) {
          this.customerData = customerData;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails#extraParams} for the
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
         * map. See {@link
         * CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails#extraParams} for the
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomerData {
        /** Customer email. */
        @SerializedName("email")
        String email;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Customer name. */
        @SerializedName("name")
        String name;

        /** Customer phone. */
        @SerializedName("phone")
        String phone;

        private CustomerData(
            String email, Map<String, Object> extraParams, String name, String phone) {
          this.email = email;
          this.extraParams = extraParams;
          this.name = name;
          this.phone = phone;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String email;

          private Map<String, Object> extraParams;

          private String name;

          private String phone;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails.CustomerData
              build() {
            return new CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails
                .CustomerData(this.email, this.extraParams, this.name, this.phone);
          }

          /** Customer email. */
          public Builder setEmail(String email) {
            this.email = email;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails.CustomerData#extraParams}
           * for the field documentation.
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
           * map. See {@link
           * CustomerEvaluationCreateParams.EvaluationContext.CustomerDetails.CustomerData#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Customer name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Customer phone. */
          public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("client_details")
      CLIENT_DETAILS("client_details"),

      @SerializedName("customer_details")
      CUSTOMER_DETAILS("customer_details");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum EventType implements ApiRequestParams.EnumParam {
    @SerializedName("login")
    LOGIN("login"),

    @SerializedName("registration")
    REGISTRATION("registration");

    @Getter(onMethod_ = {@Override})
    private final String value;

    EventType(String value) {
      this.value = value;
    }
  }
}
