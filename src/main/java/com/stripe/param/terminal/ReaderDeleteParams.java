// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;

public class ReaderDeleteParams extends ApiRequestParams {
  /**
   * To group objects on your platform account by connected account, set this parameter to the
   * connected account operating your application.
   */
  @SerializedName("operator_account")
  String operatorAccount;

  private ReaderDeleteParams(String operatorAccount) {
    this.operatorAccount = operatorAccount;
  }

  public static Builder builder() {
    return new com.stripe.param.terminal.ReaderDeleteParams.Builder();
  }

  public static class Builder {
    private String operatorAccount;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderDeleteParams build() {
      return new ReaderDeleteParams(this.operatorAccount);
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
