package designpattern.架构设计7大原则.Tom.dependence_inversion_principle;

public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom 在学习 Python 课程");
    }
}

