(function(global){
    var internal = {
        getSigmaGraphOfUser: function(userId, cb){
            var xhr = new XMLHttpRequest();
            var url = "https://1-0-dot-crowdappz-demo.appspot.com/_ah/api/contentEndpoint/v0/getSigmaGraphOfUser?userId="+userId;
            xhr.open("GET", url, true);
            xhr.onload = function(resp){
                console.log(this.responseText);
                cb(JSON.parse(JSON.parse(this.responseText).s));
            }
            xhr.send();
        }
    }


    global.communicator = {
        getSigmaGraphOfUser: function(userId, cb){
            internal.getSigmaGraphOfUser(userId, cb);
        }
    }
})(window);
