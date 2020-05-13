package networkIO.Mic.javaIO操作.基于内存字节输入输出流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @Auther 高凡
 * @Date 2020-05-10 10:44
 */
public class MemoryDemo {
    static String str ="hello world";
    public static void main(String[] args) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int i =0;
        while ((i=inputStream.read())!=-1){
            char c = (char) i;
            outputStream.write(Character.toUpperCase(c));
        }
        System.out.println(outputStream.toString());
    }
}
