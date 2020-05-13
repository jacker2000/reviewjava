package threadsAndConcurrency.itcast.thread;

import java.util.Date;

/**
 * @Author: gf
 * @Date: 2019/10/30 7:42
 * @Version 1.0
 *  自定义类实现Runnable接口
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"执行时间是："+new Date().getTime()+";执行次数"+i);
        }
    }
}
