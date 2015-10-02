package com.crowdappz.pig.api;

import com.crowdappz.pig.main.DataProvider;
import com.crowdappz.pig.model.node.Content;
import com.crowdappz.pig.model.others.Context;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import java.util.List;


@Api(name = "contentEndpoint",
        version = "v0")
public class ContentEndpoint {

    @ApiMethod(path = "getRelevantContent",
            httpMethod = ApiMethod.HttpMethod.GET)
    public List<Content> getRelevantContent(@Named("userId") String userId, Context context) {
        return DataProvider.getContents();
    }

    @ApiMethod(path = "likeContent",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public void likeContent(Content content) {

    }
}
