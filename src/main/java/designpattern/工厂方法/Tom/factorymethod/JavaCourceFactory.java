package designpattern.工厂方法.Tom.factorymethod;


import designpattern.ICource;
import designpattern.JavaCource;

/**
 * @Author: gf
 * @Date: 2019/6/11 10:07
 * @Version 1.0
 */
public class JavaCourceFactory implements ICourceFactory {

    @Override
    public ICource create() {
        return new JavaCource();
    }
}
