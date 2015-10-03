package com.crowdappz.pig.model.sigma;

import com.google.appengine.repackaged.com.google.gson.Gson;

import java.util.List;


public class SigmaJson {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private List<SigmaEdge> edges;
    private List<SigmaNode> nodes;

    // ================ Constructors & Main ================================= //
    public SigmaJson() {

    }

    public SigmaJson(List<SigmaEdge> edges, List<SigmaNode> nodes) {
        this.edges = edges;
        this.nodes = nodes;
    }
    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //
    public String toJson() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    public List<SigmaEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<SigmaEdge> edges) {
        this.edges = edges;
    }

    public List<SigmaNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<SigmaNode> nodes) {
        this.nodes = nodes;
    }
    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
