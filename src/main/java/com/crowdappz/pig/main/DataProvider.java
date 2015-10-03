package com.crowdappz.pig.main;

import com.crowdappz.pig.handler.QueryHandler;
import com.crowdappz.pig.model.node.Content;
import com.crowdappz.pig.model.node.Creator;
import com.crowdappz.pig.model.others.Category;
import com.crowdappz.pig.model.others.SourceEnum;
import com.crowdappz.pig.model.others.SourceType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DataProvider {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    private static List<Content> contents = new ArrayList<>();

    private static List<Creator> creators = new ArrayList<Creator>() {{
        add(new Creator("Clark", "Gable"));
        add(new Creator("Elon", "Musk"));
        add(new Creator("Marissa", "Meyer"));
        add(new Creator("Peter", "Diamandis"));
    }};
    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //
    public static List<Content> createAndGetContents() {
        saveCreators();
        generateContent();
        saveContent();
        return contents;
    }

    // ================ Private Methods ===================================== //
    private static void generateContent() {
        contents.add(new Content()
                .withCreator(creators.get(0).getId(), new Date())
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));

        contents.add(new Content()
                .withCreator(creators.get(1).getId(), new Date())
                .withCategory(Category.TECH)
                .withDate(new Date())
                .withTitle("Launched new space X rocket")
                .withContent(
                        "Model X Bioweapon Defense Mode definitely filters viruses btw, even the small ones. Has hospital operating room level filtering.")
                .withSource(SourceEnum.TWITTER)
                .withSourceType(SourceType.SOCIAL_MEDIA));

        contents.add(new Content()
                .withCreator(creators.get(2).getId(), new Date())
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("How to scale your startup")
                .withContent("Foobar")
                .withSource(SourceEnum.OTHERS)
                .withSourceType(SourceType.BLOG));

        contents.add(new Content()
                .withCreator(creators.get(0).getId(), new Date())
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));

        contents.add(new Content()
                .withCreator(creators.get(1).getId(), new Date())
                .withCategory(Category.BUSINESS)
                .withDate(new Date())
                .withTitle("From Zero to Hero on 1 weekend")
                .withContent("Foobar")
                .withSource(SourceEnum.BUSINESS_INSIDER)
                .withSourceType(SourceType.NEWS));
    }

    private static void saveCreators() {
        for (Creator c : creators) {
            QueryHandler.saveNode(c);
        }
    }

    private static void saveContent() {
        for (Content content : contents) {
            QueryHandler.saveNode(content);
        }
    }

    // ================ Getter & Setter ===================================== //
    public static List<Content> getContents() {
        return contents;
    }
    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
