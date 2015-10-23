package com.stripe.model;

public class FraudDetails extends StripeObject {
	public static final String USER_REPORT = "user_report";
	protected String userReport;

	protected String stripeReport;

	public String getUserReport() {
		return userReport;
	}

	public void setUserReport(String userReport) {
		this.userReport = userReport;
	}

	public String getStripeReport() {
		return stripeReport;
	}

	/**
	 * stripeReport is set by Stripe, the field is exposed because it may be useful within unit tests.
	 */
	public void setStripeReport(String stripeReport) {
		this.stripeReport = stripeReport;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		FraudDetails that = (FraudDetails) o;

		if (stripeReport != null ? !stripeReport.equals(that.stripeReport) : that.stripeReport != null) {
			return false;
		}
		if (userReport != null ? !userReport.equals(that.userReport) : that.userReport != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = userReport != null ? userReport.hashCode() : 0;
		result = 31 * result + (stripeReport != null ? stripeReport.hashCode() : 0);
		return result;
	}
}
