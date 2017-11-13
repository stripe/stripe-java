package com.stripe.model;

import com.stripe.net.APIResource;
import lombok.Getter;
import lombok.Setter;

public class OrderItem extends APIResource {
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	String currency;
	@Getter @Setter
	String description;
	ExpandableField<HasId> parent;
	@Getter @Setter
	Integer quantity;
	@Getter @Setter
	String type;

	public String getParent() {
		if (this.parent == null) {
			return null;
		}
		return this.parent.getId();
	}

	public void setParent(String parentID) {
		this.parent = setExpandableFieldID(parentID, this.parent);
	}

	public HasId getParentObject() {
		if (this.parent == null) {
			return null;
		}
		return this.parent.getExpanded();
	}

	public void setParentObject(HasId o) {
		this.parent = new ExpandableField<HasId>(o.getId(), o);
	}

	public <O extends HasId> O getParentObjectAs() {
		if (this.parent == null) {
			return null;
		}
		return (O) this.parent.getExpanded();
	}
}
