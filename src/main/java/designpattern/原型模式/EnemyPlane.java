package designpattern.原型模式;

/**
 * @Auther 高凡
 * @Date 2020-05-08 0:32
 */
public class EnemyPlane implements Cloneable{
    private int x;//敌机横坐标
    private int y = 0;//敌机纵坐标
    //构造器
    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //让敌机飞
    public void fly(){
        //每调用一次，敌机飞行时纵坐标＋1
        y++;
    }
    //此处开放setX，为了让克隆后的实例重新修改x坐标
    public void setX(int x) {
        this.x = x;
    }
    //为了保证飞机飞行的连贯性
    //这里我们关闭setY方法，不支持随意更改Y纵坐标
        //    public void setY(int y) {
        //        this.y = y;
        //    }

            //重写克隆方法
    @Override
    public EnemyPlane clone() throws CloneNotSupportedException {
                return (EnemyPlane)super.clone();
            }
}
