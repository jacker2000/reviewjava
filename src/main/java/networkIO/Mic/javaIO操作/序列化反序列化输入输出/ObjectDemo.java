package networkIO.Mic.javaIO操作.序列化反序列化输入输出;

import java.io.*;

/**
 * @Auther 高凡
 * @Date 2020-05-11 7:51
 *  序列化和反序列化应用场景：
 *      跨JVM传输，可以保证类的生命周期大于jvm
 */
public class ObjectDemo {
    public static void main(String[] args) {
        //利用对象的序列化(输出到本地磁盘下的文本中，内容是二进制)
        User user = new User("name", 18);//存储在内存中
//        serializeIO(user);
        DeserializationIO();
    }

    //反序列化
    private static void DeserializationIO() {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream(""));){
            User deserializationUser = (User) inputStream.readObject();
            System.out.println(deserializationUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //序列化到磁盘(需要实现Serializable接口)
    private static void serializeIO(User user) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(""));){
            outputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
