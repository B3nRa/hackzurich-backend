(function(global){
    internal = {
        drawEdges: function(isEdgesDrawn){
            graphmanager.getSigmaObj().settings({
                drawEdges: isEdgesDrawn
            });

            if(isEdgesDrawn === true){
                graphmanager.getSigmaObj().refresh();
            }
        }
    };

    global.edgemanager = {
        drawEdges: function(isEdgesDrawn){
            internal.drawEdges(isEdgesDrawn);
        }
    }
})(window);
