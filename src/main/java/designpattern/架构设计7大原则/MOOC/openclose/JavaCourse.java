package designpattern.架构设计7大原则.MOOC.openclose;

/**
 * @Author: gf
 * @Date: 2019/6/27 6:53
 * @Version 1.0
 */
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public Double getDiscountPrice() {
        return this.price*0.8;
    }
}
