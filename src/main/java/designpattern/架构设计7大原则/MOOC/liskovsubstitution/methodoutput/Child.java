package designpattern.架构设计7大原则.MOOC.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * @Author: gf
 * @Date: 2019/6/30 9:40
 * @Version 1.0
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行" );
        return hashMap;
    }
}
