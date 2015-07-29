package jersey;

import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by mengjian on 15/7/23.
 */

@Singleton
@Path("helloworld")
public class Hello {

    @GET
    @Path("id")
    public String say(){
        return "Hello,World!";
    }

    //@POST
    //@Path("name")
}

