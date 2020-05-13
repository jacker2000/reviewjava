package networkIO.Mic.网络IO.同步_阻塞;

import java.io.*;
import java.net.Socket;

/**
 * @Auther 高凡
 * @Date 2020-05-11 9:58
 */
public class ClientSocketClass {
    public static void main(String[] args) {
        final int DEFAULT_PORT =8080;
        Socket socket=null;
        try {
            //建立一个连接
             socket = new Socket("localhost",DEFAULT_PORT);

            BufferedWriter bufferedWriter =
                    new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("我是客户端发送的消息:clent\n");
            bufferedWriter.flush();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverStr = bufferedReader.readLine();
            System.out.println("收到服务端的消息："+serverStr);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
