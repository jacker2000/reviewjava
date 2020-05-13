package threadsAndConcurrency.itcast.thread;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * @Author: gf
 * @Date: 2019/10/30 8:06
 * @Version 1.0
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行时间是："+new Date().getTime()+";执行次数"+i);
        }
        return "MyCallable接口执行完成";
    }
}
