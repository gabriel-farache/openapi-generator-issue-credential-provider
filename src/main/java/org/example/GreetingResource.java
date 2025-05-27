package org.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.openapi.quarkus.simple_server_yaml.api.DefaultApi;

@Path("/hello")
public class GreetingResource {

    @Inject
    @RestClient
    DefaultApi api;

    @GET
    @Path("/withSecurity")
    public void callRemoteWithSecurity() {
        api.getWithBearerTokenSecurityScheme();
    }

    @GET
    @Path("/simple")
    public void callRemoteSimple() {
        api.getWithSimpleBearerTokenSecurityScheme();
    }
}
