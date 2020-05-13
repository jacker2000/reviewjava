package designpattern.架构设计7大原则.MOOC.openclose;

/**
 * @Author: gf
 * @Date: 2019/6/27 6:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse =new JavaDiscountCourse(93,"java",90d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println(javaCourse.getId()+javaCourse.getName()+javaCourse.getPrice()+javaCourse.getOriginPrice());

    }
}
