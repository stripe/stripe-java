// File generated from our OpenAPI spec
package com.stripe.model.v2.data;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A ranked set of public analytical resources matching a natural-language query. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SearchResultList extends StripeObject {
  /**
   * Domain-level intelligence. Present when a known domain matches; omitted when the system falls
   * back to direct semantic search.
   */
  @SerializedName("context")
  Context context;

  /** Ranked public resources. Always present, including when empty. */
  @SerializedName("data")
  List<SearchResultList.Data> data;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Token for the next page. */
  @SerializedName("next_page_url")
  String nextPageUrl;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.data.search_result_list}.
   */
  @SerializedName("object")
  String object;

  /** Token for the previous page. */
  @SerializedName("previous_page_url")
  String previousPageUrl;

  /**
   * Domain-level intelligence. Present when a known domain matches; omitted when the system falls
   * back to direct semantic search.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Context extends StripeObject {
    /**
     * Domain vocabulary relevant to the request, so that callers interpret the returned resources
     * consistently with how Stripe defines these terms.
     */
    @SerializedName("business_concepts")
    List<SearchResultList.Context.BusinessConcept> businessConcepts;

    /** The business domain the request was matched to, for example &quot;payments&quot;. */
    @SerializedName("domain")
    String domain;

    /**
     * High-level routing guidance for the agent. When {@code data} is empty, may advise how to
     * refine the request or browse canonical resources.
     */
    @SerializedName("guidance")
    String guidance;

    /**
     * For more details about BusinessConcept, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BusinessConcept extends StripeObject {
      /** What the term means in the context of this domain. */
      @SerializedName("definition")
      String definition;

      /** The name of the concept, for example &quot;decline reason&quot;. */
      @SerializedName("term")
      String term;
    }
  }

  /**
   * For more details about Data, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Data extends StripeObject implements HasId {
    @SerializedName("catalog")
    String catalog;

    /** What the canonical resource contains. */
    @SerializedName("description")
    String description;

    /** How to execute this result. */
    @SerializedName("execution_spec")
    ExecutionSpec executionSpec;

    /** Per-result additional context: constraints, interpretation rules, and gotchas. */
    @SerializedName("extended_description")
    String extendedDescription;

    /** Canonical resource identity. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** A pre-defined measure queryable through the metric query endpoint. */
    @SerializedName("metrics")
    Metrics metrics;

    /** Human-readable name of the canonical resource. */
    @SerializedName("name")
    String name;

    /**
     * The canonical resource type this result points at, e.g. &quot;v2.data.schema&quot; or
     * &quot;v2.data.report&quot;. May name a resource that is not yet publicly retrievable, in
     * which case {@code reference_url} is omitted. Distinct from {@code object}, which identifies
     * this result itself.
     */
    @SerializedName("object_type")
    String objectType;

    /**
     * Canonical API path for retrieving the complete resource, e.g.
     * &quot;/v2/data/reports/report_123&quot;.
     */
    @SerializedName("reference_url")
    String referenceUrl;

    /** Present for schemas when known; omitted for resource types without data freshness. */
    @SerializedName("refreshed_at")
    Instant refreshedAt;

    /**
     * Relative ordering signal from the search service (0-1). Not a calibrated guarantee; callers
     * must not use it as a configurable cutoff.
     */
    @SerializedName("relevance_score")
    BigDecimal relevanceScore;

    /** A Stripe-defined report exposed by {@code /v2/data/reports}. */
    @SerializedName("reports")
    Reports reports;

    /** A queryable table exposed by {@code /v2/data/schemas}. */
    @SerializedName("schemas")
    Schemas schemas;

    /** How to execute this result. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExecutionSpec extends StripeObject implements HasId {
      /**
       * The canonical run endpoint, e.g. &quot;/v2/data/report_runs&quot; or
       * &quot;/v2/data/query_runs&quot;.
       */
      @SerializedName("execution_url")
      String executionUrl;

      /**
       * The HTTP method for {@code execution_url}.
       *
       * <p>One of {@code GET}, or {@code POST}.
       */
      @SerializedName("http_method")
      String httpMethod;

      /**
       * The identifier to submit to {@code execution_url}, e.g. &quot;report_123&quot; or
       * &quot;table_123&quot;.
       */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;
    }

    /** A pre-defined measure queryable through the metric query endpoint. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Metrics extends StripeObject {
      /**
       * Whether the metric query endpoint accepts a {@code currency} parameter for this metric.
       * False for pure ratios and growth rates.
       */
      @SerializedName("accepts_currency")
      Boolean acceptsCurrency;

      /** Dimensions the metric can be filtered and grouped by. */
      @SerializedName("dimensions")
      List<SearchResultList.Data.Metrics.Dimension> dimensions;

      /**
       * How the metric's value is formatted.
       *
       * <p>One of {@code currency}, {@code number}, or {@code percent}.
       */
      @SerializedName("measure_format")
      String measureFormat;

      /**
       * The metric namespace. Metrics queried together in one metric query request must share a
       * namespace.
       */
      @SerializedName("metric_namespace")
      String metricNamespace;

      /**
       * For more details about Dimension, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Dimension extends StripeObject {
        /** A description of what the dimension represents. */
        @SerializedName("description")
        String description;

        /** The public dimension name accepted by the metric query endpoint. */
        @SerializedName("name")
        String name;
      }
    }

    /** A Stripe-defined report exposed by {@code /v2/data/reports}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Reports extends StripeObject {
      /** Shape of the report output when known. */
      @SerializedName("output_columns")
      List<SearchResultList.Data.Reports.OutputColumn> outputColumns;

      /**
       * Parameter schema, keyed by parameter name, matching the {@code /v2/data/reports} resource.
       */
      @SerializedName("parameters")
      Map<String, SearchResultList.Data.Reports.Parameter> parameters;

      /**
       * For more details about OutputColumn, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class OutputColumn extends StripeObject {
        /** What the column represents. */
        @SerializedName("description")
        String description;

        /** The name of the column in the report output. */
        @SerializedName("name")
        String name;

        /**
         * The data type of the column.
         *
         * <p>One of {@code bigint}, {@code boolean}, {@code date}, {@code datetime}, {@code
         * decimal}, {@code double}, {@code integer}, {@code timestamp}, or {@code varchar}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about Parameter, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Parameter extends StripeObject {
        /** For array parameters, details about the array elements. */
        @SerializedName("array_details")
        ArrayDetails arrayDetails;

        /** Explains the purpose and usage of the parameter. */
        @SerializedName("description")
        String description;

        /** For enum parameters, the list of allowed values. */
        @SerializedName("enum_details")
        EnumDetails enumDetails;

        /** Indicates whether the parameter must be provided. */
        @SerializedName("required")
        Boolean required;

        /**
         * The data type of the parameter.
         *
         * <p>One of {@code array}, {@code enum}, {@code string}, or {@code timestamp}.
         */
        @SerializedName("type")
        String type;

        /** For array parameters, details about the array elements. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ArrayDetails extends StripeObject {
          /**
           * The data type of the elements in the array.
           *
           * <p>One of {@code array}, {@code enum}, {@code string}, or {@code timestamp}.
           */
          @SerializedName("element_type")
          String elementType;

          /** Details about enum elements in the array. */
          @SerializedName("enum_details")
          EnumDetails enumDetails;

          /** Details about enum elements in the array. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class EnumDetails extends StripeObject {
            /** Allowed values of the enum. */
            @SerializedName("allowed_values")
            List<String> allowedValues;
          }
        }

        /** For enum parameters, the list of allowed values. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class EnumDetails extends StripeObject {
          /** Allowed values of the enum. */
          @SerializedName("allowed_values")
          List<String> allowedValues;
        }
      }
    }

    /** A queryable table exposed by {@code /v2/data/schemas}. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Schemas extends StripeObject {
      /** Compact schema projection. */
      @SerializedName("columns")
      List<SearchResultList.Data.Schemas.Column> columns;

      /**
       * The dataset used when submitting an ad-hoc query run.
       *
       * <p>Equal to {@code analytical}.
       */
      @SerializedName("dataset")
      String dataset;

      /** Stripe-defined reports that are relevant to this schema. */
      @SerializedName("relevant_reports")
      List<SearchResultList.Data.Schemas.RelevantReport> relevantReports;

      /**
       * For more details about Column, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Column extends StripeObject {
        /** A description of what the column represents. */
        @SerializedName("description")
        String description;

        /** Columns in other schemas that reference this column as a foreign key. */
        @SerializedName("foreign_keys_from")
        List<SearchResultList.Data.Schemas.Column.ForeignKeysFrom> foreignKeysFrom;

        /** Columns in other schemas that this column references as a foreign key. */
        @SerializedName("foreign_keys_to")
        List<SearchResultList.Data.Schemas.Column.ForeignKeysTo> foreignKeysTo;

        /** Whether the column forms part of the table's primary key. */
        @SerializedName("is_primary_key")
        Boolean isPrimaryKey;

        /** The name of the column. */
        @SerializedName("name")
        String name;

        /**
         * The data type of the column.
         *
         * <p>One of {@code bigint}, {@code boolean}, {@code date}, {@code datetime}, {@code
         * decimal}, {@code double}, {@code integer}, {@code timestamp}, or {@code varchar}.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about ForeignKeysFrom, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ForeignKeysFrom extends StripeObject {
          /** The name of the referenced column. */
          @SerializedName("column")
          String column;

          /** The identifier of the referenced schema. */
          @SerializedName("schema")
          String schema;

          /** The name of the referenced schema. */
          @SerializedName("schema_name")
          String schemaName;
        }

        /**
         * For more details about ForeignKeysTo, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ForeignKeysTo extends StripeObject {
          /** The name of the referenced column. */
          @SerializedName("column")
          String column;

          /** The identifier of the referenced schema. */
          @SerializedName("schema")
          String schema;

          /** The name of the referenced schema. */
          @SerializedName("schema_name")
          String schemaName;
        }
      }

      /**
       * For more details about RelevantReport, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class RelevantReport extends StripeObject implements HasId {
        /** A description of the {@code Report}. */
        @SerializedName("description")
        String description;

        /** The unique identifier of the {@code Report}. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The human-readable name of the {@code Report}. */
        @SerializedName("name")
        String name;

        /**
         * Canonical API path for the {@code Report}, e.g. &quot;/v2/data/reports/report_123&quot;.
         */
        @SerializedName("reference_url")
        String referenceUrl;
      }
    }
  }
}
