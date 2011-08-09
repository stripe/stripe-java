package com.stripe.datamodel;

public class Discount {
	protected String code;
	protected int percent_off;

	public Discount() {
	}

	public Discount(String code, int percent_off) {
		super();
		this.code = code;
		this.percent_off = percent_off;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPercent_off() {
		return percent_off;
	}

	public void setPercent_off(int percent_off) {
		this.percent_off = percent_off;
	}

}
