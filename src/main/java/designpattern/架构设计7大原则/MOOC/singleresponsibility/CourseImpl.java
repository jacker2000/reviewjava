package designpattern.架构设计7大原则.MOOC.singleresponsibility;

public class CourseImpl implements ICourseContent,ICourseManager {


    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
