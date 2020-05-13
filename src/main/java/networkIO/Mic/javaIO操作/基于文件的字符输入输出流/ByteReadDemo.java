package networkIO.Mic.javaIO操作.基于文件的字符输入输出流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther 高凡
 * @Date 2020-05-10 21:33
 *  中文字符相当于3个字节
 */
public class ByteReadDemo {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("");) {

            int len=0;
            byte[] buffer = new byte[1024];
            while ((len=fileInputStream.read())!=-1){
//                System.out.println((char)len);
                System.out.println(new String(buffer,0,len));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
