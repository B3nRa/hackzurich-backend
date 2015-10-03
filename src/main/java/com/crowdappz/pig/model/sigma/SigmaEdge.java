package com.crowdappz.pig.model.sigma;

public class SigmaEdge {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private String id;
    private String source;
    private String target;
    // ================ Constructors & Main ================================= //

    public SigmaEdge(Long id, Long source, Long target) {
        this(String.valueOf(id), String.valueOf(source), String.valueOf(target));
    }

    public SigmaEdge(String id, String source, String target) {
        this.id = id;
        this.source = source;
        this.target = target;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
