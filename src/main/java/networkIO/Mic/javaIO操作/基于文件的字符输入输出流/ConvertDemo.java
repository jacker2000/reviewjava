package networkIO.Mic.javaIO操作.基于文件的字符输入输出流;

import java.io.*;

/**
 * @Auther 高凡
 * @Date 2020-05-11 7:19
 */
public class ConvertDemo {
    public static void main(String[] args) {
        //InputStreamReader
        //OutputStreamWriter

        outputStreamWriter();
    }
    private static void outputStreamBufferWriter() {
        try(
//                FileInputStream  InputStream = new FileInputStream("");
                BufferedInputStream InputStream =
                        new BufferedInputStream(new FileInputStream("")) ;
                InputStreamReader inputStreamReader =
                        new InputStreamReader(InputStream, "UTF-8");
                BufferedReader bufferedReader=
                        new BufferedReader(inputStreamReader)) {

            System.out.println(bufferedReader.readLine());//读取一行数据

            //字符转换流
            OutputStreamWriter outputStreamWriter =
                    new OutputStreamWriter(new FileOutputStream(""),"UTF-8");

            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write("你好");
            bufferedWriter.flush();
//            int len =0;
//            char[] by = new char[1024];
//            while ((len=inputStreamReader.read())!=-1){
//                System.out.println(new String(by,0,len));
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void outputStreamWriter() {
        try(FileInputStream fileInputStream = new FileInputStream("");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");) {

            int len =0;
            char[] by = new char[1024];
            while ((len=inputStreamReader.read())!=-1){
                System.out.println(new String(by,0,len));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
