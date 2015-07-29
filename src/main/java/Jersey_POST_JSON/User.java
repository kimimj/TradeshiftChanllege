package Jersey_POST_JSON;

import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mengjian on 15/7/23.
 */

@XmlRootElement
@Service
public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private  String userName;
    private  int age = 16;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "name:"+ userName+"age:"+ age;
    }
}
