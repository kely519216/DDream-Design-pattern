package com.ddream.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description
 *
 * @author ml_yo
 * @classname Cat
 * @date 2020/6/30 9:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("小猫跑-------");
    }
}
