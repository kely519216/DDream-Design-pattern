package com.ddream;

import com.ddream.model.*;
import com.ddream.pattern.*;
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

    /**抽象工厂*/
    @Test
    void testAbstractMethodFactory(){
        CarMethodFactory factory = new WbFactory();
        CarBody carBody = factory.createCarBody();
        Tire tire = factory.createTire();
        carBody.build();
        tire.build();
    }

    /**
     * 单例模式 饿汉模式
     */
    @Test
    void testSinglePattern() {
        Cat cat = CatSinglePattern.getSingleCat();
        cat.run();
    }

    /**
     * 单例模式 懒汉
     */
    @Test
    void testLazySinglePattern() {
        Student student = Student.getSingleStudent();
        student.run();
    }
}
