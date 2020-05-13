package networkIO.Mic;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther 高凡
 * @Date 2020-05-08 20:26
 * IO流的数据源:
    1. 硬盘
    2. 内存
    3. 键盘
    4. 网络

    四种流的不同应用场景的API
 */
public class FourInputStream {


    public static void main(String[] args) {
        //1.读取磁盘文件
        FileInputStream fis;

        try {
            fis = new FileInputStream("D:/jb51.net.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //2.读取内存文件
        String  s = "啦啦";
        ByteArrayInputStream bis = new ByteArrayInputStream(s.getBytes());
        int i =0;
        while ((i=bis.read())!=-1){
            System.out.println((char)i);
        }
        //3.键盘
        //Scanner
        InputStream  is =System.in;
        int j =0;
        while ((j=bis.read())!=-1){
            System.out.println((char)j);
        }
        //4.网络IO
//        Socket
        Socket socket = null;

        try {
            socket.getInputStream();
            socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
