package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class SourceOwner extends StripeObject {
	protected Address address;
	protected Address verifiedAddress;
	protected String name;
	protected String verifiedName;
	protected String phone;
	protected String verifiedPhone;
	protected String email;
	protected String verifiedEmail;
}
