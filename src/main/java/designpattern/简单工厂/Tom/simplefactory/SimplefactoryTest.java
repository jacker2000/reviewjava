package designpattern.简单工厂.Tom.simplefactory;


import designpattern.ICource;
import designpattern.JavaCource;

/**
 * @Author: gf
 * @Date: 2019/6/11 9:57
 * @Version 1.0
 */
public class SimplefactoryTest {
    public static void main(String[] args) {
       /* ICource cource =new JavaCource();
        cource.record();*/

       /* CourseFactory courseFactory =new CourseFactory();
        ICource factory= courseFactory.create1("com.gupaoedu.vip.pattern.factory.JavaCource");
        factory.record();*/

       CourseFactory factory = new CourseFactory();
        ICource factory2 = factory.create2(JavaCource.class);
        factory2.record();;

    }
}
