package com.ddream.pattern;

import com.ddream.model.CarBody;
import com.ddream.model.Tire;

/**
 * Description 抽象工厂方法
 *
 * @author ml_yo
 * @classname CarMethodFactory
 * @date 2020/7/1 10:14
 */
public abstract class CarMethodFactory {

    /**
     * 创建轮胎
     */
    public abstract Tire createTire();

    /**
     * 创建
     */
    public abstract CarBody createCarBody();
}
