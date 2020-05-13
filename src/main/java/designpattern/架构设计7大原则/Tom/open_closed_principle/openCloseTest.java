package designpattern.架构设计7大原则.Tom.open_closed_principle;

public class openCloseTest {
    public static void main(String[] args) {
        ICourse iCourse =new JavaDiscountCourse(1,"小明",234.0);
        System.out.println(iCourse.getId());
    }
}
