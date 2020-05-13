package designpattern.原型模式.Tom.singleton;

import lombok.Data;

import java.util.List;

/**
 * @Auther 高凡
 * @Date 2020-05-08 7:47
 *  单例对象防止克隆破坏单例解决办法：
 *  1.单例类不实现Cloneable接口，
 *  2.重写Clone()方法,在Clone方法中返回单例对象即可
 *  3.记住单例和克隆只能实现一种，两者不兼容
 *
 */
@Data
public class ConcretePrototype implements Cloneable {
    private int age;
    private String name;
    private List<String> hobbies;
    private static  ConcretePrototype instance = new ConcretePrototype();

    private ConcretePrototype(){}

    public static ConcretePrototype getInstance(){
        return instance;
    }

    @Override
    public ConcretePrototype clone() {
        return instance;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
