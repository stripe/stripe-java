// File generated from our OpenAPI spec
package com.stripe.model.v2.data;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Schema} resource describes the columns, types, and relationships of a table that can
 * be queried.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Schema extends StripeObject implements HasId {
  /** The columns of the table. */
  @SerializedName("columns")
  List<Schema.Column> columns;

  /**
   * The dataset the table belongs to.
   *
   * <p>Equal to {@code analytical}.
   */
  @SerializedName("dataset")
  String dataset;

  /** A description of the table. */
  @SerializedName("description")
  String description;

  /** An extended, LLM-friendly description of the table, useful for query generation. */
  @SerializedName("extended_description")
  String extendedDescription;

  /** The unique identifier of the {@code Schema}. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this {@code Schema} describes live mode data. */
  @SerializedName("livemode")
  Boolean livemode;

  /** The human-readable name of the table. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.data.schema}.
   */
  @SerializedName("object")
  String object;

  /** Time at which the table's schema was last refreshed. */
  @SerializedName("refreshed_at")
  Instant refreshedAt;

  /** Reports relevant to this table. */
  @SerializedName("relevant_reports")
  List<Schema.RelevantReport> relevantReports;

  /**
   * For more details about Column, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
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
    List<Schema.Column.ForeignKeysFrom> foreignKeysFrom;

    /** Columns in other schemas that this column references as a foreign key. */
    @SerializedName("foreign_keys_to")
    List<Schema.Column.ForeignKeysTo> foreignKeysTo;

    /** Whether the column forms part of the table's primary key. */
    @SerializedName("is_primary_key")
    Boolean isPrimaryKey;

    /** The name of the column. */
    @SerializedName("name")
    String name;

    /**
     * The data type of the column.
     *
     * <p>One of {@code bigint}, {@code boolean}, {@code date}, {@code datetime}, {@code decimal},
     * {@code double}, {@code integer}, {@code timestamp}, or {@code varchar}.
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
  }
}
