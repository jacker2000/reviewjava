package javaSE.hashMapTest;

import java.util.HashMap;

/**
 * @Auther 高凡
 * @Date 2020-05-07 8:36
 * hashMap中的HashCode
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> initialMap = new HashMap<>();
        Integer a =10;
        Integer b=8;
        int c = a.hashCode();
        int d = b - 1;
        int i = c&d;//位运算 ,10 & 7  => 1010 & 0111 => 0010 =2
        System.out.println(i);
        System.out.println(1<<30);
        System.out.println(1<<31);
        System.out.println(1<<32);
        System.out.println(1<<33);
        System.out.println(1<<34);
    }
}
