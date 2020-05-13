package designpattern.架构设计7大原则.MOOC.compositionaggregation;

/**
 * @Author: gf
 * @Date: 2019/6/30 10:21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao =new ProductDao();
        productDao.setDbConnection(new MysqlConnection());
        productDao.addProduct();
    }
}
