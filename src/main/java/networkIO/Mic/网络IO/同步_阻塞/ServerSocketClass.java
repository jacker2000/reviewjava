package networkIO.Mic.网络IO.同步_阻塞;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther 高凡
 * @Date 2020-05-11 9:41
 */
public class ServerSocketClass {
    //启动一个服务端
    public static void main(String[] args) throws IOException {
        final int DEFAULT_PORT =8080;
        ServerSocket serverSocket=null;
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter =null;
        socketd(DEFAULT_PORT, serverSocket, bufferedReader, bufferedWriter);

    }
    private static void socketdSleep(int DEFAULT_PORT, ServerSocket serverSocket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        try {
            serverSocket = new ServerSocket(DEFAULT_PORT);

            //阻塞操作，等待客户端连接
            while (true){
                Socket socket =
                        serverSocket.accept();
                System.out.println("客户端："+socket.getPort()+"已连接");

                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String clientStr = bufferedReader.readLine();//获得客户端输入信息

                System.out.println("收到客户端的请求信息:"+clientStr);

                Thread.sleep(15000);
                bufferedWriter =
                        new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                bufferedWriter.write("我已经收到消息了\n");
                bufferedWriter.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
            bufferedReader.close();
            serverSocket.close();
        }
        //绑定监听端口
    }
    private static void socketd(int DEFAULT_PORT, ServerSocket serverSocket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        //绑定监听端口
        try {
             serverSocket = new ServerSocket(DEFAULT_PORT);

             //阻塞操作，等待客户端连接
            Socket socket =
                    serverSocket.accept();
            System.out.println("客户端："+socket.getPort()+"已连接");

            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String clientStr = bufferedReader.readLine();//获得客户端输入信息

            System.out.println("收到客户端的请求信息:"+clientStr);

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
