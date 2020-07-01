package com.ddream.pattern;

import com.ddream.model.CarBody;
import com.ddream.model.Tire;
import com.ddream.model.WbTire;

/**
 * Description
 *
 * @author ml_yo
 * @classname WbFactory
 * @date 2020/7/1 10:20
 */
public class WbFactory extends CarMethodFactory {

    @Override
    public Tire createTire() {
        return new WbTire();
    }

    @Override
    public CarBody createCarBody() {
        return new WbCarBody();
    }
}
