package networkIO.Mic.NIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 高凡
 * @version 1.0
 * @date 2020/5/12 6:11
 */

public class NIOWriteDemo {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("");) {
            FileChannel fileChannel = fos.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            //往byteBuffer写数据
            byteBuffer.put("hello,I'm NIO Program".getBytes());//往缓冲区写数据
            byteBuffer.flip();//把读模式转化为写模式
            fileChannel.write(byteBuffer);//读取byteBuffer的数据

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
