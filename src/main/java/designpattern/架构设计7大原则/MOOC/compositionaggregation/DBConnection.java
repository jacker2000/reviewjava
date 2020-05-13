package designpattern.架构设计7大原则.MOOC.compositionaggregation;

/**
 * @Author: gf
 * @Date: 2019/6/30 10:17
 * @Version 1.0
 */
public abstract  class DBConnection {
   /* public String getConnection(){
        return "mysql数据库连接";
    }*/
   public abstract String getConnection();
}
