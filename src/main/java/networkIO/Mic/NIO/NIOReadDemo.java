package networkIO.Mic.NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Auther 高凡
 * @Date 2020-05-12 5:58
 */
public class NIOReadDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("");) {

            //channel
            //针对本地磁盘文件进行操作
            FileChannel fileChannel = fis.getChannel();
            //读取数据,分配缓冲区大小
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            //等同于下面这个操作
            /*byte[] bytes = new byte[1024];
            ByteBuffer byteBuffer1 = ByteBuffer.wrap(bytes);*/
            int rs = fileChannel.read(byteBuffer);
            while (true) {
                System.out.println(new String(byteBuffer.array()));
                if (rs == -1) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
