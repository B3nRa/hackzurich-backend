package com.crowdappz.pig.model.node;

import com.crowdappz.pig.model.Edge;
import com.crowdappz.pig.model.Node;
import com.googlecode.objectify.annotation.Subclass;

import java.util.List;


@Subclass(index = true)
public class User extends Node {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private List<Edge> edges;

    // ================ Constructors & Main ================================= //

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
