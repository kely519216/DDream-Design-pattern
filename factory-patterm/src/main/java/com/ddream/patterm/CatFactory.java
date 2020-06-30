package com.ddream.patterm;

import com.ddream.model.Animal;
import com.ddream.model.Cat;

/**
 * Description 工厂方法具体实现
 *
 * @author ml_yo
 * @classname AnimaFactory
 * @date 2020/6/30 9:15
 */
public class CatFactory extends AnimalMethodFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}