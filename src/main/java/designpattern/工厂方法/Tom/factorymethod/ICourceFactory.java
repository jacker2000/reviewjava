package designpattern.工厂方法.Tom.factorymethod;


import designpattern.ICource;

/**
 * @Author: gf
 * @Date: 2019/6/11 10:05
 * @Version 1.0
 *  课程接口
 */
public interface ICourceFactory {
    /**
     * 录制视频方法
     */
    ICource create();
}
