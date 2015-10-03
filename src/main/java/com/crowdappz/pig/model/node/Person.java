package com.crowdappz.pig.model.node;

import com.crowdappz.pig.model.Node;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Subclass;


@Subclass(index = true)
public class Person extends Node {

    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    @Index
    private String firstName;
    @Index
    private String lastName;
    @Index
    protected String type = "Person";

    // ================ Constructors & Main ================================= //
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.label = firstName + " " + lastName;
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
