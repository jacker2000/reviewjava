package designpattern.架构设计7大原则.MOOC.liskovsubstitution;

public class Test {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("with:"+rectangle.getWidth()+" length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 with:"+rectangle.getWidth()+" length:"+rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle =new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }
public static void main(String[] args) {
    Square square =new Square();
//    square.setSideLength(10);
//    resize(square);

}
}
