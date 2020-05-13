package networkIO.Mic.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: 高凡
 * @date: 2020/5/12 17:40
 * @description:
 */

public class NIOSelectorServer {
    static Selector selector; //多路复用器

    public static void main(String[] args) {
        try {
            selector = Selector.open();//创建一个多路复用器
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);//这个必须要设置为非阻塞
            serverSocketChannel.socket().bind(new InetSocketAddress(8080));

            //监听连接事件
            SelectionKey sk = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {

                selector.select();//阻塞
                Set<SelectionKey> selectionKeys = selector.selectedKeys();

                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();//避免重复处理
                    if (selectionKey.isAcceptable()) {//连接事件
                        handleAccept(selectionKey);
                    } else if (selectionKey.isReadable()) {//读事件
                        handleRead(selectionKey);
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static  void  wakeup(){
        selector.wakeup();//唤醒处于select阻塞的线程

    }
    private static void handleAccept(SelectionKey selectionKey) {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
        try {
            //是不是一定存在客户端连接过来，这里一定不会返回空
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(false);//设置的IO的非阻塞
            socketChannel.write(ByteBuffer.wrap("hello Client,I'm NIO Server With Selector".getBytes()));
            //这里注册的是SocketChannel的读事件
            socketChannel.register(selector, SelectionKey.OP_READ);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void handleRead(SelectionKey selectionKey) throws IOException {
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = socketChannel.read(byteBuffer);
        System.out.println("server receive Msg :" + new String(byteBuffer.array()));
    }
}
