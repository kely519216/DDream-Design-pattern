package com.ddream.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description
 *
 * @author ml_yo
 * @classname Dog
 * @date 2020/6/30 9:29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("小狗跑-------");
    }
}
