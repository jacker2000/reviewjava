package designpattern.工厂方法.Tom.factorymethod;


import designpattern.ICource;

/**
 * @Author: gf
 * @Date: 2019/6/11 10:45
 * @Version 1.0
 * 工厂方法
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourceFactory factory =new JavaCourceFactory();
        ICource cource = factory.create();
        cource.record();
    }
}
