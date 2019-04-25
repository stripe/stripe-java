// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;

public class ReaderCreateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Custom label given to the reader for easier identification. If no label is specified, the
   * registration code will be used.
   */
  @SerializedName("label")
  String label;

  /**
   * The location to assign the reader to. If no location is specified, the reader will be assigned
   * to the account's default location.
   */
  @SerializedName("location")
  String location;

  /**
   * To [group
   * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
   * on your platform account by connected account, set this parameter to the connected account ID.
   */
  @SerializedName("operator_account")
  String operatorAccount;

  /** A code generated by the reader used for registering to an account. */
  @SerializedName("registration_code")
  String registrationCode;

  private ReaderCreateParams(
      List<String> expand,
      String label,
      String location,
      String operatorAccount,
      String registrationCode) {
    this.expand = expand;
    this.label = label;
    this.location = location;
    this.operatorAccount = operatorAccount;
    this.registrationCode = registrationCode;
  }

  public static Builder builder() {
    return new com.stripe.param.terminal.ReaderCreateParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private String label;

    private String location;

    private String operatorAccount;

    private String registrationCode;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderCreateParams build() {
      return new ReaderCreateParams(
          this.expand, this.label, this.location, this.operatorAccount, this.registrationCode);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderCreateParams#expand} for the field documentation.
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
     * ReaderCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Custom label given to the reader for easier identification. If no label is specified, the
     * registration code will be used.
     */
    public Builder setLabel(String label) {
      this.label = label;
      return this;
    }

    /**
     * The location to assign the reader to. If no location is specified, the reader will be
     * assigned to the account's default location.
     */
    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    /**
     * To [group
     * objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account)
     * on your platform account by connected account, set this parameter to the connected account
     * ID.
     */
    public Builder setOperatorAccount(String operatorAccount) {
      this.operatorAccount = operatorAccount;
      return this;
    }

    /** A code generated by the reader used for registering to an account. */
    public Builder setRegistrationCode(String registrationCode) {
      this.registrationCode = registrationCode;
      return this;
    }
  }
}
