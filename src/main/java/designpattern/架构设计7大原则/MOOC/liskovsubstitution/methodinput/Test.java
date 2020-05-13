package designpattern.架构设计7大原则.MOOC.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Base child =new Child();
        HashMap hashMap =new HashMap();
        child.method(hashMap);
    }
}
