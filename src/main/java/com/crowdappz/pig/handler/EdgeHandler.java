package com.crowdappz.pig.handler;

import com.crowdappz.pig.model.Edge;

import java.util.Date;


public class EdgeHandler {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    public static void createEdgeBetweenNodes(Long fromNode, Long toNode) {
        createEdgeBetweenNodes(fromNode, toNode, new Date());
    }

    public static void createEdgeBetweenNodes(Long fromNode, Long toNode, Date date) {
        Edge e = new Edge(fromNode, toNode, date);
    }
    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
