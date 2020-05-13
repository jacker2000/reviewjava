package networkIO.Mic.NIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author: 高凡
 * @date: 2020/5/12 18:53
 * @description:
 */

public class ZeroCopyServer {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(8080));
            SocketChannel socketChannel = serverSocketChannel.accept();//阻塞获得客户端连接
            ByteBuffer byteBuffer = ByteBuffer.allocate(2048);
            int r =0;
            FileChannel fileChannel = new FileOutputStream("").getChannel();

            while (r!=-1){
                r=socketChannel.read(byteBuffer);
                //TODO
                byteBuffer.flip();
                fileChannel.write(byteBuffer);
                byteBuffer.clear();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
        }
    }
}
