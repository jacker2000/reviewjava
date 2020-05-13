package networkIO.Mic.javaIO操作.read方法;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther 高凡
 * @Date 2020-05-10 9:47
 */
public class ReadDemo {
    public static void main(String[] args) throws Exception {
        String fileInputPath="";
        String fileOutputPath="";
        try (FileInputStream fileInputStream = new FileInputStream(fileInputPath);
        FileOutputStream fileOutputStream=new FileOutputStream(fileOutputPath);){

            //读取指定目录的字节
            int i =0;
            byte[] buffer = new byte[1024];
            while ((i=fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(i);//如果存在1000个字节，那么write会和磁盘交互1000次
//                System.out.println((char)i);
                //在这个例子中，原本需要和磁盘进行11次IO操作，增加Buffer之后，只需要进行4次IO
                //如果把Buffer的长度等于读取的字节长度，只会进行一次IO操作
                System.out.println(new String(buffer,0,i));
            }
        }catch (IOException e){
            e.getStackTrace();
        }


    }
}
