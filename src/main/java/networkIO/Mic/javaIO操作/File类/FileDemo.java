package networkIO.Mic.javaIO操作.File类;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther 高凡
 * @Date 2020-05-10 8:01
 *  递归遍历指定目录，获取文件名称
 */
public class FileDemo {
    //通过结合前面部分内容
    //根据用户输入的路径进行目录遍历
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            String path = bufferedReader.readLine();

            File file = new File(path);
            if (file.isDirectory()&&file.exists()){
                fileList(file);
            }else {
                System.out.println("文件路径输入错误");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedReader.close();
            reader.close();
        }

    }

    public static void fileList(File filePath){
        File[] files = filePath.listFiles();
        if (files!=null){
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()){
                    System.out.println(files[i].getName());
                }else {
                    //是目录
                    fileList(files[i]);//递归遍历
                }
            }
        }

    }
}
