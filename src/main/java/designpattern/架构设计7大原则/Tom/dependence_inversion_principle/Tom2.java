package designpattern.架构设计7大原则.Tom.dependence_inversion_principle;

public class Tom2 {
    private ICourse course;
    public Tom2(ICourse course){
        this.course = course;
    }
    public void study(){
        course.study();
    }
    public static void main(String[] args) {
        Tom2 tom = new Tom2(new JavaCourse());
        tom.study();
    }
}
