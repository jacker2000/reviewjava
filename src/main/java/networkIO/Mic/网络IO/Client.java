package networkIO.Mic.网络IO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther 高凡
 * @Date 2020-05-11 8:45
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            //发送一个数据到服务端
            OutputStream outputStream = socket.getOutputStream();//输出流
            outputStream.write("hello".getBytes("UTF-8"));
            outputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
