package designpattern.原型模式.Tom.deep;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 高凡
 * @Date 2020-05-08 7:47
 */
@Data
public class ConcretePrototype implements Cloneable,Serializable {
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
    //0.深克隆硬编码
    public  ConcretePrototype deepHobbiesClone()  {
        try {
            ConcretePrototype result = (ConcretePrototype)super.clone();
             result.hobbies = (List<String>) ((ArrayList) (result.hobbies)).clone();
             return  result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    //方式1序列化方式
    public  ConcretePrototype deepClone()  {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return  (ConcretePrototype) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }

    //方式2通过jason字符串来进行深拷贝



    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
