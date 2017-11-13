package com.stripe.model;

import com.stripe.net.APIResource;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public final class Address extends StripeObject {
	protected String city;
	protected String country;
	protected String line1;
	protected String line2;
	protected String postalCode;
	protected String state;


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Address address = (Address) o;

		if (city != null ? !city.equals(address.city) : address.city != null) {
			return false;
		}
		if (country != null ? !country.equals(address.country) : address.country != null) {
			return false;
		}
		if (line1 != null ? !line1.equals(address.line1) : address.line1 != null) {
			return false;
		}
		if (line2 != null ? !line2.equals(address.line2) : address.line2 != null) {
			return false;
		}
		if (postalCode != null ? !postalCode.equals(address.postalCode) : address.postalCode != null) {
			return false;
		}
		return state != null ? state.equals(address.state) : address.state == null;
	}

	@Override
	public int hashCode() {
		int result = city != null ? city.hashCode() : 0;
		result = 31 * result + (country != null ? country.hashCode() : 0);
		result = 31 * result + (line1 != null ? line1.hashCode() : 0);
		result = 31 * result + (line2 != null ? line2.hashCode() : 0);
		result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
		result = 31 * result + (state != null ? state.hashCode() : 0);
		return result;
	}
}
