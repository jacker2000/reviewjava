package designpattern.架构设计7大原则.MOOC.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> courseList =new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("课程数量"+courseList.size());
    }
}
