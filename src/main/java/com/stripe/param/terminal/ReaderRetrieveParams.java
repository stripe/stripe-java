// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class ReaderRetrieveParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * To group objects on your platform account by connected account, set this parameter to the
   * connected account operating your application.
   */
  @SerializedName("operator_account")
  String operatorAccount;

  private ReaderRetrieveParams(List<String> expand, String operatorAccount) {
    this.expand = expand;
    this.operatorAccount = operatorAccount;
  }

  public static Builder builder() {
    return new com.stripe.param.terminal.ReaderRetrieveParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private String operatorAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderRetrieveParams build() {
      return new ReaderRetrieveParams(this.expand, this.operatorAccount);
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderRetrieveParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderRetrieveParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * To group objects on your platform account by connected account, set this parameter to the
     * connected account operating your application.
     */
    public Builder setOperatorAccount(String operatorAccount) {
      this.operatorAccount = operatorAccount;
      return this;
    }
  }
}
