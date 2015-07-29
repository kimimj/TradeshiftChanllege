package Jersey_POST_JSON;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MediaType;

/**
 * Created by mengjian on 15/7/27.
 */
public class testing {

    private static WebResource getWr(String USER_URL)  {
        Client c = Client.create();  //创建一个 com.sun.jersey .api.client.Client 类的实例
        WebResource wr = c.resource(USER_URL);  // 建了一个 WebResponse 对象
        return wr;
    }

    public static void main(String[] args) {
//        User user = new User();
//        user.setUserName("hndes");
//        user.setAge(39);
//
//        String USER_URL = "http://localhost:8000/jejs/restresource/insertUserFromXML";
//        MultivaluedMapImpl params = new MultivaluedMapImpl();
//        params.add("user", user);
//        String result = getWr(USER_URL).entity(user, MediaType.APPLICATION_XML).post(String.class);
//        System.out.println(result);

    }

}
