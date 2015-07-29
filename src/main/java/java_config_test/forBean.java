package java_config_test;

/**
 * Created by mengjian on 15/7/23.
 */
public class forBean {

    private String name;

    public void setName(String n){
        this.name = n;
    }

    public void printBean(){
        System.out.println("test 1:"+name);
    }
}
