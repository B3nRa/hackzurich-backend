package com.crowdappz.pig.api;

import com.crowdappz.pig.handler.EdgeHandler;
import com.crowdappz.pig.handler.QueryHandler;
import com.crowdappz.pig.handler.SigmaHandler;
import com.crowdappz.pig.main.DataProvider;
import com.crowdappz.pig.model.node.Content;
import com.crowdappz.pig.model.node.User;
import com.crowdappz.pig.model.others.Context;
import com.crowdappz.pig.model.others.EdgeType;
import com.crowdappz.pig.wrapper.LongWrapper;
import com.crowdappz.pig.wrapper.StringWrapper;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import java.util.List;


@Api(name = "contentEndpoint",
        version = "v0")
public class ContentEndpoint {

    @ApiMethod(path = "saveNode",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public LongWrapper createUser(@Named("firstName") String firstName, @Named("lastName") String lastName) {
        return new LongWrapper(QueryHandler.saveNode(new User(firstName, lastName)));
    }

    @ApiMethod(path = "getAllUsers",
            httpMethod = ApiMethod.HttpMethod.GET)
    public List<User> getAllUsers() {
        return QueryHandler.getAllUsers();
    }

    @ApiMethod(path = "getRelevantContent",
            httpMethod = ApiMethod.HttpMethod.GET)
    public List<Content> getRelevantContent(@Named("userId") Long userId, Context context) {
        return DataProvider.createAndGetContents();
    }

    @ApiMethod(path = "likeContent",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public LongWrapper likeContent(@Named("userId") Long userId, @Named("contentId") Long contentId) {
        return new LongWrapper(EdgeHandler.createEdgeBetweenNodes(userId, contentId, EdgeType.IS_LIKER_OF));
    }

    @ApiMethod(path = "getSigmaGraphOfUser",
            httpMethod = ApiMethod.HttpMethod.GET)
    public StringWrapper getSigmaGraphOfUser(@Named("userId") Long userId) {
        return new StringWrapper(SigmaHandler.getSigmaGraphOfUser(userId));
    }
}
