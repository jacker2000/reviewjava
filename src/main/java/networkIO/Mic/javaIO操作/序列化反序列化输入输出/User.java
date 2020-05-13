package networkIO.Mic.javaIO操作.序列化反序列化输入输出;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther 高凡
 * @Date 2020-05-11 7:51
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = -1275497323207810186L;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
