package com.ddream.pattern;

import com.ddream.model.Animal;
import com.ddream.model.Cat;
import com.ddream.model.Cow;
import com.ddream.model.Dog;

/**
 * Description 静态工厂
 *
 * @author ml_yo
 * @classname AnimaFactory
 * @date 2020/6/30 9:15
 */
public class AnimalStaticFactory {

    /**
     * 静态工厂负担太重,不符合开闭远程
     */
    public static Animal createAnimal(String name) {
        if ("cat".equals(name)) {
            return new Cat();
        } else if ("dog".equals(name)) {
            return new Dog();
        } else if ("cow".equals(name)) {
            return new Cow();
        } else {
            return null;
        }
    }
}
