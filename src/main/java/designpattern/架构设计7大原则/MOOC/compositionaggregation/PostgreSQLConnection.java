package designpattern.架构设计7大原则.MOOC.compositionaggregation;

/**
 * @Author: gf
 * @Date: 2019/6/30 10:27
 * @Version 1.0
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
