package designpattern.架构设计7大原则.Tom.dependence_inversion_principle;

public class Tom3 {
    private ICourse course;
    public void setCourse(ICourse course) {
        this.course = course;
    }
    public void study(){
        course.study();
    }
    public static void main(String[] args) {
        Tom3 tom = new Tom3();
        tom.setCourse(new JavaCourse());
        tom.study();
        tom.setCourse(new PythonCourse());
        tom.study();
    }
}
