package com.crowdappz.pig.model.node;

import com.crowdappz.pig.model.Edge;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Subclass;

import java.util.List;


@Subclass(index = true)
public class User extends Person {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private List<Edge> edges; // maybe not here but extra table to query for fromNodeId / toNodeId
    @Index
    protected String type = "User";

    // ================ Constructors & Main ================================= //
    public User() {
    }

    public User(String firstName, String lastName) {
        super(firstName, lastName);
    }
    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
