package designpattern.架构设计7大原则.MOOC.dependenceinversion;

public class GaoF {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /*public GaoF(ICourse iCourse) {
        this.iCourse = iCourse;
    }*/

    public void studyImoccCourse(){
       iCourse.studyCourse();
   }
}
