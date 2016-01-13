package com.stripe.model;

public class AccountTosAcceptance extends StripeObject {
	Long date;
	String ip;
	String userAgent;

	public Long getDate(){
		return date;
	}

	public void setDate(Long date){
		this.date = date;
	}

	public String getIp(){
		return ip;
	}

	public void setIp(String ip){
		this.ip = ip;
	}

	public String getUserAgent(){
		return userAgent;
	}

	public void setUserAgent(String userAgent){
		this.userAgent = userAgent;
	}
}
