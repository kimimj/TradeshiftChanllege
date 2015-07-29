package Jersey_POST_JSON;

import org.springframework.stereotype.Service;

/**
 * Created by mengjian on 15/7/24.
 */

@Service
public class RestService {
    public String toString(String userName,int age){
        return "name:"+ userName+"age:"+ age;
    }
}
