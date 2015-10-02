package com.crowdappz.pig.handler;

import com.crowdappz.pig.model.node.Content;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;


public class QueryHandler {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //

    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //
    public static void registerClazzez() {
        ObjectifyService.register(Content.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }
    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
