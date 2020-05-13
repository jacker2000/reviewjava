package designpattern.抽象工厂.Tom.abstractfactory;

/**
 * @Author: gf
 * @Date: 2019/6/11 12:46
 * @Version 1.0
 * 课程工厂
 */
public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
