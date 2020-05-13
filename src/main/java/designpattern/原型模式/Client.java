package designpattern.原型模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Auther 高凡
 * @Date 2020-05-08 0:35
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<EnemyPlane> enemyPlanes = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
            enemyPlanes.add(ep);
        }
    }
}
