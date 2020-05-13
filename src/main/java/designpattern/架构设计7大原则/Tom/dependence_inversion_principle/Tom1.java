package designpattern.架构设计7大原则.Tom.dependence_inversion_principle;

public class Tom1 {
    public void study(ICourse course){
        course.study();
    }
    public static void main(String[] args) {
        Tom1 tom = new Tom1();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
    }
}
