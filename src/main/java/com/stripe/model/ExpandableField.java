package com.stripe.model;

public class ExpandableField<T> {
    private String id;
    private T expandedObject;

    public ExpandableField (String id, T expandedObject) {
        this.id = id;
        this.expandedObject = expandedObject;
    }

    public boolean isExpanded() {
        if (expandedObject==null) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public T getExpanded() {
        return expandedObject;
    }

    public void setExpanded(T expandedObject) {
        this.expandedObject = expandedObject;
    }
}