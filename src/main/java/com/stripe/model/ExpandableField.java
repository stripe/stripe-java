package com.stripe.model;

//TODO: Should this extend StripeObject?
public class ExpandableField<T> {
    private String id;
    private T expansion;

    public ExpandableField (String idString, T expandedField) {
        id = idString;
        expansion = expandedField;
    }

    public boolean isExpanded() {
        if (expansion==null) {
            return false;
        }
        return true;
    }

    public String getID() {
        return id;
    }

    public T getExpansion() {
        return expansion;
    }

    //TODO: Should we have our own equals here?
}