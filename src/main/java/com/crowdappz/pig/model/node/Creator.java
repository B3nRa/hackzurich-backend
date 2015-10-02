package com.crowdappz.pig.model.node;

import com.crowdappz.pig.model.Node;
import com.googlecode.objectify.annotation.Subclass;


@Subclass(index = true)
public class Creator extends Node {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private String firstName;
    private String lastName;
    // ================ Constructors & Main ================================= //

    public Creator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
