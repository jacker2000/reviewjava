package designpattern.原型模式.Tom.general;

import java.lang.reflect.Field;

/**
 * @Auther 高凡
 * @Date 2020-05-08 7:39
 */
public class CloneUtils {
    public static Object copy(Object protorype){
        Class clazz =protorype.getClass();
        Object returnValue=null;
        try {
            returnValue= clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {

                field.setAccessible(true);
                field.set(returnValue, field.get(protorype));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
