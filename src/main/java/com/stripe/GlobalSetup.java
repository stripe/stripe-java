package com.stripe;

public class GlobalSetup {

  public static void setUpBeforeAllTests() {
    BranchCoverageUtil.writeDefault();
  }
}
