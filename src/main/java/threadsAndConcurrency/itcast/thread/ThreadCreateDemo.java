package threadsAndConcurrency.itcast.thread;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: gf
 * @Date: 2019/10/30 7:35
 * @Version 1.0
 */
public class ThreadCreateDemo {
    public static void main(String[] args) {
        //*******方式一继承thread类创建线程***************************
        //1.创建自定义线程实例
//        MyThread myThread =new MyThread();
//        //2.启动线程，自动调用myThread类中的run方法
//        myThread.start();
//        //3.在main主线程打印信息
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName()+"执行时间是："+new Date().getTime()+";执行次数"+i);
//        }
        //*****方式二实现Runnable接口**********************************************
        //2.1 在main主线程打印信息
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName()+"执行时间是："+new Date().getTime()+";执行次数"+i);
//        }
//
//        //2.2通过thread类执行MyRunnable类
//
//        Thread thread =new Thread(new MyRunnable(),"myRunnable");
//        thread.start();

        //*****方式三实现Callable接口**********************************************
        //3.1创建FutureTask实例，创建MyCallable实例
//        FutureTask<String> task = new FutureTask<>(new MyCallable());
//
//        //3.2创建Thread实例，执行FutureTask
//        Thread thread = new Thread(task, "MyCallable");
//        thread.start();
//        //3.3在主线程打印信息
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "执行时间是：" + new Date().getTime() + ";执行次数" + i);
//        }
//        //3.4在主线程打印信息
//        try {
//            String result = task.get();
//            System.out.println("MyCallable执行结果是:"+result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //*****方式四使用线程池实现**********************************************
        //4.1使用Executors获取线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //4.2通过线程池对象获取线程并执行MyRunnable实例
        executorService.execute(new MyRunnable());
        //4.3主线程打印信息
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行时间是：" + new Date().getTime() + ";执行次数" + i);
        }
    }
}
