package designpattern.架构设计7大原则.Tom.dependence_inversion_principle;

/**
 * 以抽象为基准比以细节为基准搭建起来的架构要稳定得多，因此大家在拿
 到需求之后，要面向接口编程，先顶层再细节来设计代码结构
 */
public interface ICourse {
    void study();
}
