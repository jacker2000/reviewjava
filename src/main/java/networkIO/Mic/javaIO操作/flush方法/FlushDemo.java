package networkIO.Mic.javaIO操作.flush方法;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther 高凡
 * @Date 2020-05-10 21:22
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=
                new BufferedOutputStream(new FileOutputStream(""));
            bos.write("hello".getBytes());
        bos.flush();//刷盘动作
        bos.close();//close方法也会触发刷盘操作
    }
}
