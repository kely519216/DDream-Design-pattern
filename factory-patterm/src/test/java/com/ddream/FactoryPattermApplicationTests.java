package com.ddream;

import com.ddream.model.Animal;
import com.ddream.patterm.AnimalMethodFactory;
import com.ddream.patterm.AnimalStaticFactory;
import com.ddream.patterm.CatFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FactoryPattermApplication.class)
class FactoryPattermApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 静态工厂
     */
    @Test
    void testAnimalStaticFactory() {
        Animal animal = AnimalStaticFactory.createAnimal("dog");
        if (animal != null) {
            animal.run();
        }
    }

    /**
     * 工厂方法
     */
    @Test
    void testAnimalMethodFactory() {
        AnimalMethodFactory factory = new CatFactory();
        Animal animal = factory.createAnimal();
        animal.run();
    }

}
