package networkIO.Mic.javaIO操作.基于文件的字符输入输出流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther 高凡
 * @Date 2020-05-11 7:13
 */
public class ReaderWriterDemo {
    public static void main(String[] args) {
        try ( FileReader fileReader = new FileReader("");){
           int len =0;
            char[] by = new char[1024];
            while ((len=fileReader.read())!=-1){
                System.out.println(new String(by,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
