package com.crowdappz.pig.api;

import com.crowdappz.pig.handler.EdgeHandler;
import com.crowdappz.pig.handler.QueryHandler;
import com.crowdappz.pig.main.DataProvider;
import com.crowdappz.pig.model.node.Content;
import com.crowdappz.pig.model.node.User;
import com.crowdappz.pig.model.others.Context;
import com.crowdappz.pig.wrapper.LongWrapper;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import java.util.List;


@Api(name = "contentEndpoint",
        version = "v0")
public class ContentEndpoint {

    @ApiMethod(path = "createUser",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public LongWrapper createUser(@Named("firstName") String firstName, @Named("lastName") String lastName) {
        return new LongWrapper(QueryHandler.createUser(firstName, lastName));
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
    public void likeContent(@Named("userId") Long userId, @Named("contentId") Long contentId) {
        EdgeHandler.createEdgeBetweenNodes(userId, contentId);
    }
}
