package designpattern.架构设计7大原则.MOOC.dependenceinversion;

public class Test {
    //v1:原始实现类
//    public static void main(String[] args) {
//        GaoF gaoF =new GaoF();
//        gaoF.studyFECourse();
//        gaoF.studyJavaCourse();
//    }
    //v2:接口注入
//    public static void main(String[] args) {
//        GaoF f =new GaoF();
//        f.studyImoccCourse(new JavaCourse());
//        f.studyImoccCourse(new FECourse());
//        f.studyImoccCourse(new PythonCourse());
//    }
    //v3:接口方法注入构造
//    public static void main(String[] args) {
//        GaoF gaoF =new GaoF(new JavaCourse());
//        gaoF.studyImoccCourse();
//    }

    public static void main(String[] args) {
        GaoF gaoF =new GaoF();
        gaoF.setiCourse(new JavaCourse());
        gaoF.studyImoccCourse();

        gaoF.setiCourse(new FECourse());
        gaoF.studyImoccCourse();
    }





}
