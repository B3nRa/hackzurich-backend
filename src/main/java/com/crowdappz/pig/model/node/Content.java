package com.crowdappz.pig.model.node;

import com.crowdappz.pig.model.others.Category;
import com.crowdappz.pig.model.Node;
import com.crowdappz.pig.model.others.SourceEnum;
import com.crowdappz.pig.model.others.SourceType;
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
    private Creator creator;
    @Index
    private SourceEnum source;
    @Index
    private SourceType sourceType;
    @Index
    private Category category;
    @Index
    protected String type = "Content";

    // ================ Constructors & Main ================================= //
    public Content() {
    }

    public Content(String title, Date date, String content, Creator creator, SourceEnum source, SourceType sourceType, Category category) {
        this.title = title;
        this.date = date;
        this.content = content;
        this.creator = creator;
        this.source = source;
        this.sourceType = sourceType;
        this.category = category;
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

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    // ================ Builder Pattern ===================================== //
    public Content withTitle(String title) {
        this.title = title;
        return this;
    }

    public Content withDate(Date date) {
        this.date = date;
        return this;
    }

    public Content withAuthor(Creator author) {
        this.creator = author;
        return this;
    }

    public Content withSource(SourceEnum source) {
        this.source = source;
        return this;
    }

    public Content withCategory(Category category) {
        this.category = category;
        return this;
    }

    public Content withSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public Content withContent(String content) {
        this.content = content;
        return this;
    }
    // ================ Inner & Anonymous Classes =========================== //
}
