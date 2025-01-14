package com.finance.model;

import com.sun.org.apache.xerces.internal.impl.validation.EntityState;

public class Entity {

    private long id;
    private String name;
    private Contact contact;
    private Entitytype type;
    private EntityState state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Entitytype getType() {
        return type;
    }

    public void setType(Entitytype type) {
        this.type = type;
    }

    public EntityState getState() {
        return state;
    }

    public void setState(EntityState state) {
        this.state = state;
    }
}
