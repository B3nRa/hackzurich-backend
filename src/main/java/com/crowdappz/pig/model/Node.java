package com.crowdappz.pig.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;


@Entity
public class Node {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    @Id
    protected Long id;
    @Index
    protected String type;
    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
