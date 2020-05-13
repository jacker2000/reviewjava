package networkIO.Mic.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author: 高凡
 * @date: 2020/5/12 16:57
 * @description:
 */

public class NIOSocketServer {
    public static void main(String[] args) {
        try {
            //可以支持两种模式：阻塞、非阻塞
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            //修改步骤
            serverSocketChannel.configureBlocking(false);//默认是true
            //修改步骤
            serverSocketChannel.socket().bind(new InetSocketAddress(8080));
            while (true){
                //此处不在阻塞
                SocketChannel socketChannel = serverSocketChannel.accept();//仍然阻塞状态
                if (socketChannel!=null){
                    //如果代码进入这个位置，说明有链接过来
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    System.out.println(new String(buffer.array()));

                    //再把消息写回到客户端
                    Thread.sleep(1000);
//                    buffer.flip();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    byteBuffer.put("hello I'm Server Channel".getBytes());
                    byteBuffer.flip();
                    socketChannel.write(buffer);


                }else {
                    Thread.sleep(1000);
                    System.out.println("没有客户端过来");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
