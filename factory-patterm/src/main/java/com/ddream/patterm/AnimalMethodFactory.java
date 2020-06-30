package com.ddream.patterm;

import com.ddream.model.Animal;
import com.ddream.model.Cat;

/**
 * Description 方法工厂设计模式
 *
 * @author ml_yo
 * @classname AnimalMethodFactory
 * @date 2020/6/30 10:03
 */

public abstract class AnimalMethodFactory {
    //抽象出来的动物工厂----它只负责生产一种产品
    public abstract Animal createAnimal();
}


