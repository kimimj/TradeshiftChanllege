package jersey;


import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Created by mengjian on 15/7/24.
 */

@Component
@Path("/user")

public class Jejs {
    @Path("/users/{username}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser(@PathParam("username") String username){




        return username;
    }
}
