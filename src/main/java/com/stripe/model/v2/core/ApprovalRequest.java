// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An approval request represents a pending action that requires review before execution. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ApprovalRequest extends StripeObject implements HasId {
  /**
   * The action that was requested.
   *
   * <p>One of {@code charge.create}, {@code dispute.close}, {@code
   * inbound_transfers.money_management.create}, {@code invoice.create}, {@code
   * outbound_payments.money_management.create}, {@code outbound_transfers.money_management.create},
   * {@code payment_intent.create}, {@code payment_intent.update}, {@code payout.create}, {@code
   * price.update}, {@code refund.create}, {@code setup_intent.create}, {@code subscription.create},
   * {@code subscription.update}, {@code topup.create}, or {@code transfer.create}.
   */
  @SerializedName("action")
  String action;

  /** Time this ApprovalRequest was created. */
  @SerializedName("created")
  Instant created;

  /** The URL to the dashboard for this ApprovalRequest. */
  @SerializedName("dashboard_url")
  String dashboardUrl;

  /** A description of the approval request. */
  @SerializedName("description")
  String description;

  /** The timestamp at which this ApprovalRequest will expire. */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** The unique identifier for this ApprovalRequest. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether this ApprovalRequest is livemode. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.approval_request}.
   */
  @SerializedName("object")
  String object;

  /** The requester of this ApprovalRequest. */
  @SerializedName("requested_by")
  RequestedBy requestedBy;

  /** The review of this ApprovalRequest if it has been reviewed. */
  @SerializedName("review")
  Review review;

  /** The rule associated with this ApprovalRequest. */
  @SerializedName("rule")
  Rule rule;

  /**
   * The status of this ApprovalRequest.
   *
   * <p>One of {@code approved}, {@code canceled}, {@code execution_failed}, {@code
   * execution_started}, {@code execution_succeeded}, {@code expired}, {@code failed}, {@code
   * pending}, {@code rejected}, {@code requires_execution}, {@code requires_review}, or {@code
   * succeeded}.
   */
  @SerializedName("status")
  String status;

  /** The details of the status of this ApprovalRequest. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** The transitions of the status of this ApprovalRequest. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The requester of this ApprovalRequest. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RequestedBy extends StripeObject implements HasId {
    /** Stripe-defined identifier for the requester (e.g. a restricted API key token). */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** Merchant-defined name for the requester. */
    @SerializedName("name")
    String name;
  }

  /** The review of this ApprovalRequest if it has been reviewed. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Review extends StripeObject {
    /** The reason provided by the reviewer. */
    @SerializedName("reason")
    String reason;

    /**
     * The result of the review.
     *
     * <p>One of {@code approved}, or {@code rejected}.
     */
    @SerializedName("result")
    String result;

    /** Timestamp when the review was performed. */
    @SerializedName("reviewed_at")
    Instant reviewedAt;

    /** The reviewer who performed the review. */
    @SerializedName("reviewed_by")
    ReviewedBy reviewedBy;

    /** The reviewer who performed the review. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ReviewedBy extends StripeObject implements HasId {
      /** Stripe-defined identifier for the reviewer (e.g. a restricted API key token). */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** Merchant-defined name for the reviewer. */
      @SerializedName("name")
      String name;
    }
  }

  /** The rule associated with this ApprovalRequest. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Rule extends StripeObject {
    /** The name of the rule. */
    @SerializedName("name")
    String name;
  }

  /** The details of the status of this ApprovalRequest. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Deprecated: use requires_execution status instead. */
    @SerializedName("approved")
    Approved approved;

    /** Deprecated: use canceled status instead. */
    @SerializedName("canceled")
    Canceled canceled;

    /** Deprecated: use failed status instead. */
    @SerializedName("execution_failed")
    ExecutionFailed executionFailed;

    /** Deprecated: use requires_execution status instead. */
    @SerializedName("execution_started")
    ExecutionStarted executionStarted;

    /** Deprecated: use succeeded status instead. */
    @SerializedName("execution_succeeded")
    ExecutionSucceeded executionSucceeded;

    /** Deprecated: use expired status instead. */
    @SerializedName("expired")
    Expired expired;

    /** Details when the approval request failed. */
    @SerializedName("failed")
    Failed failed;

    /** Deprecated: use requires_review status instead. */
    @SerializedName("pending")
    Pending pending;

    /** Deprecated: use rejected status instead. */
    @SerializedName("rejected")
    Rejected rejected;

    /** Details when the approval request succeeded. */
    @SerializedName("succeeded")
    Succeeded succeeded;

    /** Deprecated: use requires_execution status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Approved extends StripeObject {
      /** The reason provided when approving the request. */
      @SerializedName("reason")
      String reason;
    }

    /** Deprecated: use canceled status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {}

    /** Deprecated: use failed status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExecutionFailed extends StripeObject {
      /** The error code for the failed execution. */
      @SerializedName("code")
      String code;

      /** The error message for the failed execution. */
      @SerializedName("message")
      String message;

      /** The error type for the failed execution. */
      @SerializedName("type")
      String type;
    }

    /** Deprecated: use requires_execution status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExecutionStarted extends StripeObject {}

    /** Deprecated: use succeeded status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExecutionSucceeded extends StripeObject {
      /** The result of the successful execution. */
      @SerializedName("result")
      Result result;

      /** The result of the successful execution. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Result extends StripeObject implements HasId {
        /** The unique identifier of the executed object. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The object type of the executed resource. */
        @SerializedName("object")
        String object;
      }
    }

    /** Deprecated: use expired status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Expired extends StripeObject {}

    /** Details when the approval request failed. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /** The error code for the failed execution. */
      @SerializedName("error_code")
      String errorCode;

      /** The error message for the failed execution. */
      @SerializedName("error_message")
      String errorMessage;

      /** The error type for the failed execution. */
      @SerializedName("error_type")
      String errorType;
    }

    /** Deprecated: use requires_review status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pending extends StripeObject {}

    /** Deprecated: use rejected status instead. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rejected extends StripeObject {
      /** The reason provided when rejecting the request. */
      @SerializedName("reason")
      String reason;
    }

    /** Details when the approval request succeeded. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Succeeded extends StripeObject {
      /** The result of the successful execution. */
      @SerializedName("result")
      Result result;

      /** The result of the successful execution. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Result extends StripeObject implements HasId {
        /** The unique identifier of the executed object. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The object type of the executed resource. */
        @SerializedName("object")
        String object;
      }
    }
  }

  /** The transitions of the status of this ApprovalRequest. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp when the approval request was canceled. */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /** Timestamp when the approval request expired. */
    @SerializedName("expired_at")
    Instant expiredAt;

    /** Timestamp when the approval request failed. */
    @SerializedName("failed_at")
    Instant failedAt;

    /** Timestamp when the approval request was rejected. */
    @SerializedName("rejected_at")
    Instant rejectedAt;

    /** Timestamp when the approval request moved to requires_execution status. */
    @SerializedName("requires_execution_at")
    Instant requiresExecutionAt;

    /** Timestamp when the approval request succeeded. */
    @SerializedName("succeeded_at")
    Instant succeededAt;
  }
}
