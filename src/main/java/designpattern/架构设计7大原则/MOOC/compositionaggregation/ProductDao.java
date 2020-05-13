package designpattern.架构设计7大原则.MOOC.compositionaggregation;

/**
 * @Author: gf
 * @Date: 2019/6/30 10:19
 * @Version 1.0
 */
public class ProductDao  {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn=dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }


}
