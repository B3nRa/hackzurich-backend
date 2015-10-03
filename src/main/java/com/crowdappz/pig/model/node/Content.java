package com.crowdappz.pig.model.node;

import com.crowdappz.pig.handler.QueryHandler;
import com.crowdappz.pig.model.Edge;
import com.crowdappz.pig.model.Node;
import com.crowdappz.pig.model.others.EdgeType;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Subclass;

import java.util.Date;


@Subclass(index = true)
public class Content extends Node {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    @Index
    private String title;
    @Index
    private Date date;
    private String content;
    @Index
    private String source;
    @Index
    private String sourceType;
    @Index
    private String category;
    @Index
    protected String type = "Content";

    // ================ Constructors & Main ================================= //
    public Content() {
    }

    public Content(String title, Date date, String content, String source, String sourceType, String category) {
        this.title = title;
        this.date = date;
        this.content = content;
        this.source = source;
        this.sourceType = sourceType;
        this.category = category;

        this.label = title;
    }
    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.label = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    // ================ Builder Pattern ===================================== //
    public Content withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public Content withDate(Date date) {
        this.date = date;
        return this;
    }

    public Content withCreator(Long creator, Date date) {
        // this.id is null here because node is not saved yet
        Edge e = new Edge(this.id, creator, EdgeType.IS_CREATOR_OF, date);
        QueryHandler.saveEdge(e);
        return this;
    }

    public Content withSource(String source) {
        this.source = source;
        return this;
    }

    public Content withCategory(String category) {
        this.category = category;
        return this;
    }

    public Content withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public Content withContent(String content) {
        this.content = content;
        return this;
    }
    // ================ Inner & Anonymous Classes =========================== //
}
