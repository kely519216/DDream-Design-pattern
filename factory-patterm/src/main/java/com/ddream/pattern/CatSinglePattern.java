package com.ddream.pattern;

import com.ddream.model.Cat;

/**
 * Description
 *
 * @author ml_yo
 * @classname CatSinglePatterm
 * @date 2020/6/30 10:27
 */
public class CatSinglePattern {

    //私有化成员变量
    private static Cat cat = new Cat();

    /**
     * 私有构造方法
     */
    private CatSinglePattern() {
    }

    /**
     * 对外提供公共请求方法
     */
    public static Cat getSingleCat() {
        return cat;
    }

}
