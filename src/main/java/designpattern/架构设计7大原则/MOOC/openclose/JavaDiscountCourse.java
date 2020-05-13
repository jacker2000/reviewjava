package designpattern.架构设计7大原则.MOOC.openclose;

/**
 * @Author: gf
 * @Date: 2019/6/27 7:13
 * @Version 1.0
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
