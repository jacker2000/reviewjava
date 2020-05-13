package designpattern.简单工厂.Tom.simplefactory;


import designpattern.ICource;
import designpattern.JavaCource;
import designpattern.PythonCourse;

/**
 * @Author: gf
 * @Date: 2019/6/11 9:57
 * @Version 1.0
 * 简单工厂模式
 */
public class CourseFactory {

    /**
     * 方式一：通过类名来实现
     * @param name
     * @return
     */
    public ICource create(String name){
        if ("java".equals(name)) {
            return new JavaCource();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        }else {
            return  null;
        }
    }

    /**
     * 方法二：通过反射来实现
     * @param className
     * @return
     */
    public ICource create1(String className){
        if ( !(null==className || "".equals(className))) {
            try {
                return (ICource)Class.forName(className).newInstance();
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 方法3：通过上界通配符结合反射
     * <? extends T> :表示上界通配符，?是T的子类或实现类
     * @param clazz
     * @return
     */
    public ICource create2(Class<? extends ICource> clazz){
        if (null!=clazz) {
            try {
                return clazz.newInstance();
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
