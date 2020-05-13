package networkIO.Mic.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author: 高凡
 * @date: 2020/5/12 17:01
 * @description:
 */

public class NIOSocketClient {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            //把客户端设置为非阻塞
            socketChannel.configureBlocking(false);//默认是true

            //在非阻塞模式下，这段代码并不一定是等到连接建立之后再往下执行

            socketChannel.connect(new InetSocketAddress("localhost", 8080));

            if (socketChannel.isConnectionPending()) {
                socketChannel.finishConnect();
            }

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            byteBuffer.put("hello,I'm SocketChannel Client".getBytes());
            byteBuffer.flip();//由读模式转化为写模式

            socketChannel.write(byteBuffer);

            //读取到服务端返回的数据
            byteBuffer.clear();
            int r = socketChannel.read(byteBuffer);//非阻塞模式，这里不阻塞
            if (r > 0) {
                System.out.println("收到服务端消息:" + new String(byteBuffer.array()));
//            System.in.read();
            }else {
                System.out.println("服务端数据未返回");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
