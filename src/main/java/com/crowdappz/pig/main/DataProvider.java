package com.crowdappz.pig.main;

import com.crowdappz.pig.handler.QueryHandler;
import com.crowdappz.pig.model.others.Category;
import com.crowdappz.pig.model.node.Content;
import com.crowdappz.pig.model.others.SourceEnum;
import com.crowdappz.pig.model.others.SourceType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DataProvider {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private static List<Content> contents = new ArrayList<>();
    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //
    public void generateContent() {
        contents.add(new Content()
                .withAuthor("Clark Gable")
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));

        contents.add(new Content()
                .withAuthor("Clark Gable")
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));

        contents.add(new Content()
                .withAuthor("Clark Gable")
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));

        contents.add(new Content()
                .withAuthor("Clark Gable")
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));

        contents.add(new Content()
                .withAuthor("Clark Gable")
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));
    }

    public void saveContent() {
        for (Content content : contents) {
            QueryHandler.ofy().save().entity(content).now();
        }
    }
    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //
    public static List<Content> getContents() {
        return contents;
    }
    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
