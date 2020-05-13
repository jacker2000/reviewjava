package designpattern.工厂方法.Tom.factorymethod;


import designpattern.ICource;
import designpattern.PythonCourse;

/**
 * @Author: gf
 * @Date: 2019/6/11 10:08
 * @Version 1.0
 */
public class PythonCourseFactory implements ICourceFactory {

    @Override
    public ICource create() {
        return new PythonCourse();
    }
}
