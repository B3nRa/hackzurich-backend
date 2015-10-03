package com.crowdappz.pig.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.Date;


@Entity
public class Edge {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    @Id
    private Long id;
    @Index
    private Long fromNodeId;
    @Index
    private Long toNodeId;
    @Index
    private Date createdAt;

    // ================ Constructors & Main ================================= //
    public Edge(Long fromNodeId, Long toNodeId, Date createdAt) {
        this.fromNodeId = fromNodeId;
        this.toNodeId = toNodeId;
        this.createdAt = createdAt;
    }
    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public Long getFromNodeId() {
        return fromNodeId;
    }

    public void setFromNodeId(Long fromNodeId) {
        this.fromNodeId = fromNodeId;
    }

    public Long getToNodeId() {
        return toNodeId;
    }

    public void setToNodeId(Long toNodeId) {
        this.toNodeId = toNodeId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
