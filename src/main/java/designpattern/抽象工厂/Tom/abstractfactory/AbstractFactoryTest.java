package designpattern.抽象工厂.Tom.abstractfactory;

/**
 * @Author: gf
 * @Date: 2019/6/11 12:52
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory =new JavaCourseFactory();
        courseFactory.createNote().edit();
        courseFactory.createVideo().record();
    }
}
