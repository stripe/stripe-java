package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountTosAcceptance extends StripeObject {
	Long date;
	String ip;
	String userAgent;
}
