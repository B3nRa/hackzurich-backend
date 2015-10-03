package com.crowdappz.pig.handler;

import com.crowdappz.pig.model.Edge;
import com.crowdappz.pig.model.Graph;
import com.crowdappz.pig.model.Node;
import com.crowdappz.pig.model.sigma.SigmaEdge;
import com.crowdappz.pig.model.sigma.SigmaJson;
import com.crowdappz.pig.model.sigma.SigmaNode;

import java.util.ArrayList;
import java.util.List;


public class SigmaHandler {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //

    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //
    public static String getSigmaGraphOfUser(Long userId) {
        //        User user = QueryHandler.loadById(User.class, userId);
        Graph g = GraphHandler.createGraphWithStartNodeId(userId);
        List<SigmaEdge> sigmaEdges = transformEdgesToSigmaEdges(g.getEdges());
        List<SigmaNode> sigmaNodes = transformNodesToSigmaNodes(g.getNodes());
        //        return new SigmaJson(allEdges, null);

        return new SigmaJson(sigmaEdges, sigmaNodes).toJson();
    }

    // ================ Private Methods ===================================== //
    private static List<SigmaNode> transformNodesToSigmaNodes(List<Node> nodes) {
        List<SigmaNode> sigmaNodes = new ArrayList<>();

        for(Node node : nodes){
            sigmaNodes.add(new SigmaNode(node.getId(), node.getLabel()));
        }

        return sigmaNodes;
    }

    private static List<SigmaEdge> transformEdgesToSigmaEdges(List<Edge> edges) {
        List<SigmaEdge> sigmaEdges = new ArrayList<>();
        for (Edge e : edges) {
            sigmaEdges.add(new SigmaEdge(e.getId(), e.getFromNodeId(), e.getToNodeId()));
        }

        return sigmaEdges;
    }
    // ================ Getter & Setter ===================================== //

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
