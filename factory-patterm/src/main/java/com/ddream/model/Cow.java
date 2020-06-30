package com.ddream.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description
 *
 * @author ml_yo
 * @classname Cow
 * @date 2020/6/30 9:30
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Cow extends Animal {

    @Override
    public void run() {
        System.out.println("黄牛跑");
    }
}
