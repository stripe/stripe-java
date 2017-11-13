package com.stripe.model;

//This class is meant to be used for expandable fields in the Stripe API.
//For example, ExpandableField<BalanceTransaction> in Charge.
//The class should always contain a String id, and may have a null or type T expanded.
//More info here: https://stripe.com/docs/api#expanding_objects

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpandableField<T extends HasId> {
	private String id;

	/**
	 * Was previously called `expandedObject`.
	 * Name change should have no effect because member is private.
	 */
	private T expanded;

	public ExpandableField(String id, T expandedObject) {
		this.id = id;
		this.expanded = expandedObject;
	}

	public boolean isExpanded() {
		return expanded != null;
	}
}