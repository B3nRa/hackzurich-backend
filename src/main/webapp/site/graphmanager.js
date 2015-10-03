(function(global){
   var internal = {
        sigmaObj: null,
        graphData: null,
        camera: null,
        atlasRunning: false,
        initSigma: function(data){
            internal.sigmaObj = new sigma({
                        // graph: data,
                        settings: {
                            defaultNodeColor: '#ec5148',
                            font: 'arial',
                            minNodeSize: 2,
                            maxNodeSize: 8,
                            minEdgeSize: 0.5,
                            maxEdgeSize: 0.5,
                            sideMargin: 10,
                            drawEdges: false,
                            drawNodes: true,
                            edgeColor: 'default',
                            edgeType: 'curvedArrow'
                        },
                        renderer: {
                            container: document.getElementById('sigma-container'),
                            type: 'canvas'
                        }
                    });


            internal.parseGraphData(data);
            // // update existing instance
                    // internal.atlasRunning = true;
                    // internal.sigmaObj.startForceAtlas2();
                    // internal.zoomToCenter();

            global.sigmaObj = internal.sigmaObj;

        },
        parseGraphData: function(data){
            if(data == null || data == undefined){
                return;
            }
            console.log(data);
            sigma.parsers.json(data,
                internal.sigmaObj,
                function(){
                    // update existing instance
                    nodemanager.enhanceNodes(internal.sigmaObj.graph);
                    internal.layoutGraph();
                }
            );
        },
        layoutGraph: function(){
            internal.atlasRunning = true;
            internal.sigmaObj.startForceAtlas2();
            internal.zoomToCenter();
        },
        addNeighborsMethod: function () {
            sigma.classes.graph.addMethod('neighbors', function (nodeId) {
                var k;
                var neighbors = {};
                var index = this.allNeighborsIndex[nodeId] || {};

                for (k in index) {
                    neighbors[k] = this.nodesIndex[k];
                }

                return neighbors;
            });
        },
        zoomToCenter: function(){
            internal.camera = internal.sigmaObj.cameras[0];
            internal.camera.ratio = 1.15;
            internal.camera.x = 0;
            internal.camera.y = 0;
            internal.sigmaObj.refresh();
        },
        stopLayout: function () {
            if (internal.atlasRunning === true) {
                internal.sigmaObj.stopForceAtlas2();
                internal.atlasRunning = false;
                edgemanager.drawEdges(true);
            }
        },
        addNode: function(){
            internal.sigmaObj.graph.addNode({
                id: 'n4',
                size: 3,
                x: Math.random(),
                y: Math.random(),
                type: 'goo'
            });
            internal.sigmaObj.graph.addEdge({
              id: 'e40823',
              source: 'n4',
              target: '5147289865682944',
              type: 'goo'
            });
            internal.layoutGraph();
            setTimeout(function(){
                console.log("timeout over: stopLayout");
                graphmanager.stopLayout();
            }, 2000)
        }
    }

    global.graphmanager = {
        getSigmaObj: function(){
            return internal.sigmaObj;
        },
        initSigma: function(data){
            internal.initSigma(data);
        },
        stopLayout: function(){
            internal.stopLayout();
        },
        addNode: function(){
            internal.addNode();
        }
    }
})(window);
