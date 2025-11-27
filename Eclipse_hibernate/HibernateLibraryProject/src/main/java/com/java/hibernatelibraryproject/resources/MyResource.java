package com.java.hibernatelibraryproject.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;   // ✅ THIS IMPORT WAS MISSING

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
