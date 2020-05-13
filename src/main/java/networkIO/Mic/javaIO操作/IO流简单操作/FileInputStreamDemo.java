package networkIO.Mic.javaIO操作.IO流简单操作;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther 高凡
 * @Date 2020-05-08 19:17
 *  读取指定文件的内容
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("D:/jb51.net.txt");
//            fis = new FileInputStream("K:\\1.txt");

            int i =0;
            while ((i = fis.read())!=-1){
                System.out.print((char)i);//ASCII码
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
