package designpattern.架构设计7大原则.MOOC.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("在学习FE课程");
    }
}
