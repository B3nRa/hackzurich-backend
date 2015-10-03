package com.crowdappz.pig.handler;

import com.crowdappz.pig.model.Edge;
import com.crowdappz.pig.model.Node;
import com.crowdappz.pig.model.node.Content;
import com.crowdappz.pig.model.node.Creator;
import com.crowdappz.pig.model.node.User;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

import java.util.List;


public class QueryHandler {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //

    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //
    public static void registerClazzez() {

        ObjectifyService.register(Node.class);
        ObjectifyService.register(User.class);
        ObjectifyService.register(Creator.class);
        ObjectifyService.register(Content.class);
        ObjectifyService.register(Edge.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static Long saveNode(Node n) {
        ofy().save().entity(n).now();
        return n.getId();
    }

    public static Long saveEdge(Edge e) {
        ofy().save().entity(e).now();
        return e.getId();
    }

    public static List<User> getAllUsers() {
        return ofy().load().type(User.class).list();
    }
    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
