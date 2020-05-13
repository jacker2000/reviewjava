package networkIO.Mic.网络IO.异步优化_非阻塞;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther 高凡
 * @Date 2020-05-11 14:34
 */
public class ServerSocketThread implements Runnable{
    Socket socket;

    public ServerSocketThread(Socket socket) {
        this.socket = socket;
    }

    @SneakyThrows
    @Override
    public void run() {
        ServerSocket serverSocket=null;
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter =null;
        try {
        System.out.println("客户端："+socket.getPort()+"已连接");

        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String clientStr = bufferedReader.readLine();//获得客户端输入信息

        System.out.println("收到客户端的请求信息:"+clientStr);

        Thread.sleep(15000);
        bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        bufferedWriter.write("我已经收到消息了\n");
        bufferedWriter.flush();
    } catch (Exception e) {
        e.printStackTrace();
        }finally {
        bufferedWriter.close();
        bufferedReader.close();
        serverSocket.close();
        }
    }
}
