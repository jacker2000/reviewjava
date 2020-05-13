package designpattern.架构设计7大原则.Tom.dependence_inversion_principle;

public class Tom {
    public void studyJavaCourse(){
        System.out.println("Tom 在学习 Java 的课程");
    }
    public void studyPythonCourse(){
        System.out.println("Tom 在学习 Python 的课程");
    }
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.studyJavaCourse();
        tom.studyPythonCourse();
    }
}
