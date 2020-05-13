package designpattern.架构设计7大原则.MOOC.liskovsubstitution.methodinput;

import java.util.Map;

public class Child extends Base {
   /* @Override
    public void method(HashMap map) {
        System.out.println("子类HashMap入参方法被执行");
    }*/

    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行");
    }
}
