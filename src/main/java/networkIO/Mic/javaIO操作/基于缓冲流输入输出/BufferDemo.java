package networkIO.Mic.javaIO操作.基于缓冲流输入输出;

import java.io.*;

/**
 * @Auther 高凡
 * @Date 2020-05-10 20:24
 */
public class BufferDemo {
    public static void main(String[] args) {
        try(
                BufferedInputStream bufferedInputStream =
                        new BufferedInputStream(new FileInputStream(""));
                BufferedOutputStream bufferedOutputStream =
                        new BufferedOutputStream(new FileOutputStream(""));) {

            int len=0;
            byte[] bys = new byte[1024];
            while ((len=bufferedInputStream.read(bys))!=-1){
                System.out.println(new String(bys,0,len));
                bufferedOutputStream.write(bys,0,len);
            }

        }catch (IOException e){
            e.getStackTrace();
        }

    }
}
