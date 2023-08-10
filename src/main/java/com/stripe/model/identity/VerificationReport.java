// File generated from our OpenAPI spec
package com.stripe.model.identity;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.identity.VerificationReportListParams;
import com.stripe.param.identity.VerificationReportRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A VerificationReport is the result of an attempt to collect and verify data from a user. The
 * collection of verification checks performed is determined from the {@code type} and {@code
 * options} parameters used. You can find the result of each verification check performed in the
 * appropriate sub-resource: {@code document}, {@code id_number}, {@code selfie}.
 *
 * <p>Each VerificationReport contains a copy of any data collected by the user as well as reference
 * IDs which can be used to access collected images through the <a
 * href="https://stripe.com/docs/api/files">FileUpload</a> API. To configure and create
 * VerificationReports, use the <a
 * href="https://stripe.com/docs/api/identity/verification_sessions">VerificationSession</a> API.
 *
 * <p>Related guides: <a
 * href="https://stripe.com/docs/identity/verification-sessions#results">Accessing verification
 * results</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class VerificationReport extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Result from a document check. */
  @SerializedName("document")
  Document document;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Result from an id_number check. */
  @SerializedName("id_number")
  IdNumber idNumber;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code identity.verification_report}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("options")
  Options options;

  /** Result from a selfie check. */
  @SerializedName("selfie")
  Selfie selfie;

  /**
   * Type of report.
   *
   * <p>One of {@code document}, or {@code id_number}.
   */
  @SerializedName("type")
  String type;

  /** ID of the VerificationSession that created this report. */
  @SerializedName("verification_session")
  String verificationSession;

  /** List all verification reports. */
  public static VerificationReportCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all verification reports. */
  public static VerificationReportCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/verification_reports";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            VerificationReportCollection.class,
            options,
            ApiMode.V1);
  }

  /** List all verification reports. */
  public static VerificationReportCollection list(VerificationReportListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all verification reports. */
  public static VerificationReportCollection list(
      VerificationReportListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/verification_reports";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            VerificationReportCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves an existing VerificationReport. */
  public static VerificationReport retrieve(String report) throws StripeException {
    return retrieve(report, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an existing VerificationReport. */
  public static VerificationReport retrieve(String report, RequestOptions options)
      throws StripeException {
    return retrieve(report, (Map<String, Object>) null, options);
  }

  /** Retrieves an existing VerificationReport. */
  public static VerificationReport retrieve(
      String report, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path =
        String.format("/v1/identity/verification_reports/%s", ApiResource.urlEncodeId(report));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            VerificationReport.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves an existing VerificationReport. */
  public static VerificationReport retrieve(
      String report, VerificationReportRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/verification_reports/%s", ApiResource.urlEncodeId(report));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            VerificationReport.class,
            options,
            ApiMode.V1);
  }

  /** Result from a document check. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Document extends StripeObject {
    /** Address as it appears in the document. */
    @SerializedName("address")
    Address address;

    /** Date of birth as it appears in the document. */
    @SerializedName("dob")
    Dob dob;

    /** Details on the verification error. Present when status is {@code unverified}. */
    @SerializedName("error")
    Errors error;

    /** Expiration date of the document. */
    @SerializedName("expiration_date")
    ExpirationDate expirationDate;

    /**
     * Array of <a href="https://stripe.com/docs/api/files">File</a> ids containing images for this
     * document.
     */
    @SerializedName("files")
    List<String> files;

    /** First name as it appears in the document. */
    @SerializedName("first_name")
    String firstName;

    /** Issued date of the document. */
    @SerializedName("issued_date")
    IssuedDate issuedDate;

    /** Issuing country of the document. */
    @SerializedName("issuing_country")
    String issuingCountry;

    /** Last name as it appears in the document. */
    @SerializedName("last_name")
    String lastName;

    /** Document ID number. */
    @SerializedName("number")
    String number;

    /**
     * Status of this {@code document} check.
     *
     * <p>One of {@code unverified}, or {@code verified}.
     */
    @SerializedName("status")
    String status;

    /**
     * Type of the document.
     *
     * <p>One of {@code driving_license}, {@code id_card}, or {@code passport}.
     */
    @SerializedName("type")
    String type;

    /** Point in Time. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dob extends StripeObject {
      /** Numerical day between 1 and 31. */
      @SerializedName("day")
      Long day;

      /** Numerical month between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year. */
      @SerializedName("year")
      Long year;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * A short machine-readable string giving the reason for the verification failure.
       *
       * <p>One of {@code document_expired}, {@code document_type_not_supported}, or {@code
       * document_unverified_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * A human-readable message giving the reason for the failure. These messages can be shown to
       * your users.
       */
      @SerializedName("reason")
      String reason;
    }

    /** Point in Time. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExpirationDate extends StripeObject {
      /** Numerical day between 1 and 31. */
      @SerializedName("day")
      Long day;

      /** Numerical month between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year. */
      @SerializedName("year")
      Long year;
    }

    /** Point in Time. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IssuedDate extends StripeObject {
      /** Numerical day between 1 and 31. */
      @SerializedName("day")
      Long day;

      /** Numerical month between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year. */
      @SerializedName("year")
      Long year;
    }
  }

  /** Result from an id_number check. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class IdNumber extends StripeObject {
    /** Date of birth. */
    @SerializedName("dob")
    Dob dob;

    /** Details on the verification error. Present when status is {@code unverified}. */
    @SerializedName("error")
    Errors error;

    /** First name. */
    @SerializedName("first_name")
    String firstName;

    /** ID number. */
    @SerializedName("id_number")
    String idNumber;

    /**
     * Type of ID number.
     *
     * <p>One of {@code br_cpf}, {@code sg_nric}, or {@code us_ssn}.
     */
    @SerializedName("id_number_type")
    String idNumberType;

    /** Last name. */
    @SerializedName("last_name")
    String lastName;

    /**
     * Status of this {@code id_number} check.
     *
     * <p>One of {@code unverified}, or {@code verified}.
     */
    @SerializedName("status")
    String status;

    /** Point in Time. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Dob extends StripeObject {
      /** Numerical day between 1 and 31. */
      @SerializedName("day")
      Long day;

      /** Numerical month between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year. */
      @SerializedName("year")
      Long year;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * A short machine-readable string giving the reason for the verification failure.
       *
       * <p>One of {@code id_number_insufficient_document_data}, {@code id_number_mismatch}, or
       * {@code id_number_unverified_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * A human-readable message giving the reason for the failure. These messages can be shown to
       * your users.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Options extends StripeObject {
    @SerializedName("document")
    Document document;

    @SerializedName("id_number")
    IdNumber idNumber;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Document extends StripeObject {
      /**
       * Array of strings of allowed identity document types. If the provided identity document
       * isn’t one of the allowed types, the verification check will fail with a
       * document_type_not_allowed error code.
       */
      @SerializedName("allowed_types")
      List<String> allowedTypes;

      /**
       * Collect an ID number and perform an <a
       * href="https://stripe.com/docs/identity/verification-checks?type=id-number">ID number
       * check</a> with the document’s extracted name and date of birth.
       */
      @SerializedName("require_id_number")
      Boolean requireIdNumber;

      /**
       * Disable image uploads, identity document images have to be captured using the device’s
       * camera.
       */
      @SerializedName("require_live_capture")
      Boolean requireLiveCapture;

      /**
       * Capture a face image and perform a <a
       * href="https://stripe.com/docs/identity/verification-checks?type=selfie">selfie check</a>
       * comparing a photo ID and a picture of your user’s face. <a
       * href="https://stripe.com/docs/identity/selfie">Learn more</a>.
       */
      @SerializedName("require_matching_selfie")
      Boolean requireMatchingSelfie;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IdNumber extends StripeObject {}
  }

  /** Result from a selfie check. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Selfie extends StripeObject {
    /**
     * ID of the <a href="https://stripe.com/docs/api/files">File</a> holding the image of the
     * identity document used in this check.
     */
    @SerializedName("document")
    String document;

    /** Details on the verification error. Present when status is {@code unverified}. */
    @SerializedName("error")
    Errors error;

    /**
     * ID of the <a href="https://stripe.com/docs/api/files">File</a> holding the image of the
     * selfie used in this check.
     */
    @SerializedName("selfie")
    String selfie;

    /**
     * Status of this {@code selfie} check.
     *
     * <p>One of {@code unverified}, or {@code verified}.
     */
    @SerializedName("status")
    String status;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * A short machine-readable string giving the reason for the verification failure.
       *
       * <p>One of {@code selfie_document_missing_photo}, {@code selfie_face_mismatch}, {@code
       * selfie_manipulated}, or {@code selfie_unverified_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * A human-readable message giving the reason for the failure. These messages can be shown to
       * your users.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(document, responseGetter);
    trySetResponseGetter(idNumber, responseGetter);
    trySetResponseGetter(options, responseGetter);
    trySetResponseGetter(selfie, responseGetter);
  }
}
