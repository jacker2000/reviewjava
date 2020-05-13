package designpattern.原型模式.Tom.singleton;



import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 高凡
 * @Date 2020-05-08 7:50
 *  浅克隆单例对象
 */
public class Client {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype =ConcretePrototype.getInstance();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);


        //拷贝原型对象
        ConcretePrototype cloneType =prototype.clone();
        cloneType.getHobbies().add("技术控");
        System.out.println("克隆对象:"+cloneType);
        System.out.println("原型对象:"+prototype);//浅克隆如果克隆对象更改 会导致原型对象属性发生变化
        System.out.println(cloneType ==prototype);

        System.out.println("原型对象的爱好：" + prototype.getHobbies());
        System.out.println("克隆对象的爱好：" + cloneType.getHobbies());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());
    }
}
