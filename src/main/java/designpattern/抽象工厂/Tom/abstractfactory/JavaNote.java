package designpattern.抽象工厂.Tom.abstractfactory;

/**
 * @Author: gf
 * @Date: 2019/6/11 12:49
 * @Version 1.0
 */
public class JavaNote implements INote {

    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
