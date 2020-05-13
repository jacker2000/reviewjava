package networkIO.Mic.NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 高凡
 * @version 1.0
 * @date 2020/5/12 6:31
 */

public class NIOReadAndWriteDemo {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("");
             FileOutputStream fout = new FileOutputStream("");) {

            FileChannel fcin = fin.getChannel();
            FileChannel fcout = fout.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while (true) {
                System.out.println("come in");
                int r = fcin.read(byteBuffer);
                if (r == -1) {
                    break;
                }
                //每读到1024个字节，写入到缓冲区
                byteBuffer.flip();
                fcout.write(byteBuffer);
                byteBuffer.clear();//清空
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
