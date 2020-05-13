package designpattern.架构设计7大原则.MOOC.liskovsubstitution.methodoutput;




import com.alibaba.fastjson.JSONObject;

/**
 * @Author: gf
 * @Date: 2019/6/30 9:43
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Child child =new Child();
        JSONObject json = new JSONObject(child.method());
        System.out.println(json);
    }
}
