package designpattern.抽象工厂.Tom.abstractfactory;

/**
 * @Author: gf
 * @Date: 2019/6/11 12:49
 * @Version 1.0
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
