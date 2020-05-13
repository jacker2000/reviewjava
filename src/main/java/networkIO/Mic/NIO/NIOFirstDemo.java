package networkIO.Mic.NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Auther 高凡
 * @Date 2020-05-12 5:14
 */
public class NIOFirstDemo {
    public static void main(String[] args) {

        //实现一个文件复制
        try (FileInputStream fis = new FileInputStream(new File(""));
             FileOutputStream fos = new FileOutputStream(new File(""))) {

            //NIO channel - buffer
            FileChannel fin = fis.getChannel();
            FileChannel fout = fos.getChannel();

            //初始一个缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fin.read(buffer);//读取数据到缓冲区
            buffer.flip();//表示从读转化为写
            buffer.clear();//重置缓冲区


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
