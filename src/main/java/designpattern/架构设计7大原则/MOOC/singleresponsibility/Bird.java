package designpattern.架构设计7大原则.MOOC.singleresponsibility;

public class Bird {
    public void  mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName+"用脚走");
        }else {
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
