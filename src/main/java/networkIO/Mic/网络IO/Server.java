package networkIO.Mic.网络IO;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther 高凡
 * @Date 2020-05-11 8:45
 *  服务端的监听
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();
            //从网络上拿到一个数据输入流
            InputStream inputStream = socket.getInputStream();

            int len =0;
            byte[] buffer = new byte[1024];

            while ((len=inputStream.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len,"UTF-8"));
            }
            inputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
