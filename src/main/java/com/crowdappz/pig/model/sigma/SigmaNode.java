package com.crowdappz.pig.model.sigma;

public class SigmaNode {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private String id;
    private String label;

    // ================ Constructors & Main ================================= //
    public SigmaNode(Long id, String label) {
        this(String.valueOf(id), label);
    }

    public SigmaNode(String id, String label) {
        this.id = id;
        this.label = label;
    }

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
