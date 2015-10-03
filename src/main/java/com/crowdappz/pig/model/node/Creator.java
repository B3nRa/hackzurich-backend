package com.crowdappz.pig.model.node;

import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Subclass;


@Subclass(index = true)
public class Creator extends Person {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    @Index
    protected String type = "Creator";
    // ================ Constructors & Main ================================= //
    public Creator() {
    }

    public Creator(String firstName, String lastName) {
        super(firstName, lastName);
    }
    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
