package com.ddream.model;

import lombok.Data;

/**
 * Description 抽象类
 *
 * @author ml_yo
 * @classname Anima
 * @date 2020/6/30 9:22
 */
@Data
public abstract class Animal {

    protected String name;

    /**
     * 跑
     */
    public abstract void run();
}
