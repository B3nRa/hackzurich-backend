(function(global){

    var internal = {
        enhanceNodes: function(sigmaGraph){
            SIGMAGRAPH = sigmaGraph;
            console.log(sigmaGraph.nodes());
            var nodes = sigmaGraph.nodes();
            for(var n in nodes){
                var node = nodes[n];
                node.x = Math.random();
                node.y = Math.random();
                node.color = '#005998';

                var inboundEdgeNum = sigmaGraph.degree(node.id, "in");
                var outboundEdgeNum = sigmaGraph.degree(node.id, "out");
                node.size = (inboundEdgeNum + outboundEdgeNum)/2;
                //TODO: set node color based on type
            }
        },
        enhanceNodes2: function(nodes){
            for(var n in nodes){
                var node = nodes[n];
                node.x = Math.random();
                node.y = Math.random();
                node.color = '#005998';

                var inboundEdgeNum = sigmaGraph.degree(node.id, "in");
                var outboundEdgeNum = sigmaGraph.degree(node.id, "out");
                node.size = (inboundEdgeNum + outboundEdgeNum)/2;
                //TODO: set node color based on type
            }
        }
    }

    global.nodemanager = {
        enhanceNodes: function(sigmaGraph){
            internal.enhanceNodes(sigmaGraph);
        },
        enhanceNodes2: function(nodes){
            internal.enhanceNodes2(nodes);
        }
    }
})(window);
