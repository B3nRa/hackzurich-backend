package com.crowdappz.pig.handler;

import com.crowdappz.pig.model.Edge;
import com.crowdappz.pig.model.Graph;
import com.crowdappz.pig.model.Node;

import java.util.*;


public class GraphHandler {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //

    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //
    public static Graph createGraphWithStartNodeId(Long id) {
        Set<Edge> allEdges = new HashSet<>();
        List<Node> allNodes = new ArrayList<>();
        Set<Long> nodeIds = new HashSet<>();
        Set<Long> tempNodeIds = new HashSet<>();

        tempNodeIds.add(id);
        allEdges = createEdgesForGraph(nodeIds, tempNodeIds, allEdges);
        for (Long nodeId : nodeIds) {
            if (nodeId != null) {
                allNodes.add(getNodeById(nodeId));
            }
        }

        List<Edge> allEdgesWithoutDuplicates = new ArrayList<>();
        allEdgesWithoutDuplicates.addAll(allEdges);

        return new Graph(allNodes, allEdgesWithoutDuplicates);
    }

    // ================ Private Methods ===================================== //
    private static Node getNodeById(Long id) {
        return QueryHandler.loadById(Node.class, id);
    }

    private static List<Edge> getAllEdgesOfId(Long id) {
        List<Edge> allEdges = new ArrayList<>();

        List<Edge> edges = QueryHandler.fetchEntriesWithFilter(Edge.class, "fromNodeId", id);
        allEdges.addAll(edges);
        edges = QueryHandler.fetchEntriesWithFilter(Edge.class, "toNodeId", id);
        allEdges.addAll(edges);

        return allEdges;
    }

    private static Set<Edge> createEdgesForGraph(Set<Long> allNodeIds, Set<Long> newNodeIds, Set<Edge> allEdges) {
        Set<Edge> tempEdges = new HashSet<>();

        for (Long id : newNodeIds) {
            tempEdges.addAll(getAllEdgesOfId(id));
            allEdges.addAll(tempEdges);
        }

        newNodeIds = new HashSet<>();
        for (Edge e : tempEdges) {
            if (!allNodeIds.contains(e.getFromNodeId())) {
                newNodeIds.add(e.getFromNodeId());
                allNodeIds.add(e.getFromNodeId());
            }
            if (!allNodeIds.contains(e.getToNodeId())) {
                newNodeIds.add(e.getToNodeId());
                allNodeIds.add(e.getToNodeId());
            }
        }

        if (newNodeIds.isEmpty()) {
            return allEdges;
        }

        return createEdgesForGraph(allNodeIds, newNodeIds, allEdges);
    }
    // ================ Getter & Setter ===================================== //

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
