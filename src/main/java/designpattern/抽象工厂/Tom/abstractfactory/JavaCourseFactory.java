package designpattern.抽象工厂.Tom.abstractfactory;

/**
 * @Author: gf
 * @Date: 2019/6/11 12:48
 * @Version 1.0
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
