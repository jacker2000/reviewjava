package designpattern.原型模式.Tom.general;

/**
 * @Auther 高凡
 * @Date 2020-05-08 7:50
 */
public class Client {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype =new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        System.out.println(prototype);

        //拷贝原型对象
        ConcretePrototype cloneType =prototype.clone();
        System.out.println(cloneType);
    }
}
