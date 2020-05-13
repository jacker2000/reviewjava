package networkIO.Mic.javaIO操作.基于缓冲流输入输出;

import java.io.*;

/**
 * @Auther 高凡
 * @Date 2020-05-10 21:05
 */
public class BufferCopy {

    private static File fileSource=new File("");
    private static File fileTarget =new File("");

    public void copyWithNormal()  {
        try (FileInputStream inputStream = new FileInputStream(fileSource);
             FileOutputStream outputStream = new FileOutputStream(fileTarget);){

            byte[] buf = new byte[1024];
            int len =0;
            while ((len=inputStream.read(buf))!=-1){
                outputStream.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void copyWithBufferd()  {
        try (FileInputStream inputStream = new FileInputStream(fileSource);
             FileOutputStream outputStream = new FileOutputStream(fileTarget);
             BufferedInputStream bis=new BufferedInputStream(inputStream);
             BufferedOutputStream bos=new BufferedOutputStream(outputStream);){

            byte[] buf = new byte[1024];
            int len =0;
            while ((len=bis.read(buf))!=-1){
                bos.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        BufferCopy bufferCopy = new BufferCopy();
        long star =System.currentTimeMillis();
        bufferCopy.copyWithNormal();
        System.out.println("普通复制耗时："+(System.currentTimeMillis()-star));
        bufferCopy.copyWithBufferd();
        System.out.println("缓冲流复制耗时："+(System.currentTimeMillis()-star));
    }
}
