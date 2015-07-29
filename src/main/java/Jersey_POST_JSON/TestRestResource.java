package Jersey_POST_JSON;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by mengjian on 15/7/23.
 */

@Controller
@Scope("prototype")
@Path("/restresource")
public class TestRestResource {


    private RestService service;
    private User user;

    @Resource
    public void setService(RestService service){
        this.service = service;
    }
    @Resource
    public void setUser(User user){
        this.user = user;
    }

    @GET
    @Path("/getUser")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(){

        return user;
    }

    @GET
    @Path("getUser/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserid(@PathParam("id") String id){
        return "get user with id is "+id;
    }

    @GET
    @Path("getid")
    @Produces(MediaType.APPLICATION_JSON)
    public String getid(@QueryParam("id") String id){
        return "ask for id is"+id;
    }

    @POST
    @Path("insertUserFromJSON")
    @Produces(MediaType.APPLICATION_JSON)//指定发送请求的 MIME 类型
    @Consumes(MediaType.APPLICATION_JSON)//指定响应所能接受的 MIME 类型
    public User insertuser(User user){

        return user;
    }

//    @PUT
//    @Path("insertUserFromBean")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public User inserthome(@BeanParam User user){
//        return user;
//    }

    @POST
    @Path("insertUserFromPath/username/{username}/age/{age}")
    @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_PLAIN)
    public String insertuser_p(@PathParam("username") String userName, @PathParam("age") int age) {

        user.setUserName(userName);
        user.setAge(age);

        return service.toString(userName,age);
    }

    @POST
    @Path("insertUserFromForm")
    @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_PLAIN)
    public String insertuser_F(@FormParam("username")String userName,@FormParam("age")int age){
        user.setUserName(userName);
        user.setAge(age);
        return service.toString();
    }

    @POST
    @Path("map")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMap(MultivaluedMap<String, String> formParams) {
        String result = "who:" + formParams.getFirst("who") + " ; what:"+formParams.getFirst("what");
        return formParams.toString();
    }

    @DELETE
    @Path("deleteUser/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteUser(@PathParam("id") String id) {
        //System.out.println(uriInfo.getAbsolutePath().toString());
        return "delete " + id;
    }
}
