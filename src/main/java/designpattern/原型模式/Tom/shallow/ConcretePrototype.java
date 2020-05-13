package designpattern.原型模式.Tom.shallow;

import lombok.Data;

import java.util.List;

/**
 * @Auther 高凡
 * @Date 2020-05-08 7:47
 */
@Data
public class ConcretePrototype implements Cloneable {
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public ConcretePrototype clone() {

        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
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
