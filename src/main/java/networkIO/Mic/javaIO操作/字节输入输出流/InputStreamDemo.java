package networkIO.Mic.javaIO操作.字节输入输出流;


import java.io.*;

/**
 * @Auther 高凡
 * @Date 2020-05-10 8:32
 *  简单文件的拷贝
 */
public class InputStreamDemo {
    //1. input  从磁盘读取数据到内存
    //2. output 把内存中数据写入到磁盘

    public static void main(String[] args) throws IOException {
        String inputFilePath ="d:/readme";
        String outputFilePath="J:/TK20200421工作备份/软件/readme";
        copyFile(inputFilePath, outputFilePath);
//        copyBufferFile(inputFilePath, outputFilePath);
//        copyTryFile(inputFilePath, outputFilePath);
        return;
    }
    //jdk1.7语法方法(不用自己关闭流)
    private static void copyTryFile(String inputFilePath, String outputFilePath) throws IOException {
        File file = new File(inputFilePath);

        //自动关闭流(该类必须实现Closeable接口)
        try( FileInputStream fileInputStream = new FileInputStream(file);

             FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)){
            int len =0;

            byte[] buffer = new byte[1024];

            //一次读取1024个字节
            while ((len = fileInputStream.read(buffer)) != -1){
                //读取数据可以保持在内存中

                //也可以写到磁盘
                fileOutputStream.write(buffer,0,len);//写到磁盘(1次磁盘交互)
            }

        }catch (IOException e){
            e.getStackTrace();
        }

        System.in.read();

    }

    //缓冲区方法
    private static void copyBufferFile(String inputFilePath, String outputFilePath) throws IOException {
        File file = new File(inputFilePath);

        FileInputStream fileInputStream = new FileInputStream(file);

        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);

        int len =0;

        byte[] buffer = new byte[1024];

        //一次读取1024个字节
        while ((len = fileInputStream.read(buffer)) != -1){
            //读取数据可以保持在内存中

            //也可以写到磁盘
            fileOutputStream.write(buffer,0,len);//写到磁盘(1次磁盘交互)
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
    //一次读取1个字节
    private static void copyFile(String inputFilePath, String outputFilePath) throws IOException {
        File file = new File(inputFilePath);

        FileInputStream fileInputStream = new FileInputStream(file);

        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);

        int len =0;

        while ((len=fileInputStream.read())!=-1){
            //读取数据可以保持在内存中

            //也可以写到磁盘
            fileOutputStream.write(len);//写到磁盘(1000次磁盘交互)
        }

        //阻塞当前代码
        System.in.read();
        //为什么每次字节流读取完必须关闭，因为不关闭导致资源混乱，阻塞流程
        /**
         * 什么情况下需要关闭：
         * 1.外部链接
         * 2.数据库链接
         * 3.redis链接
         * 4.文件IO
         * 注意：JVM不用关闭
         */
        fileInputStream.close();
        fileOutputStream.close();
    }


}
