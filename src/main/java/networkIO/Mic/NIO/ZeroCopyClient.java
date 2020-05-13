package networkIO.Mic.NIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author: 高凡
 * @date: 2020/5/12 18:56
 * @description:
 */

public class ZeroCopyClient {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost",8080));
        FileChannel fileChannel = new FileInputStream("").getChannel();
        //tf 表示总的字节数
        int position =0;
        long size = fileChannel.size();
        while (size>0){

            long tf = fileChannel.transferTo(0, size, socketChannel);
            System.out.println("总的数据传输字节数："+tf);
            if (tf>0){
                position+=tf;
                size-=tf;
            }
        }

        socketChannel.close();
        fileChannel.close();

    }
}
