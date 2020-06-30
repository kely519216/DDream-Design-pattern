package com.ddream;

import com.ddream.model.Animal;
import com.ddream.model.Cat;
import com.ddream.model.Student;
import com.ddream.pattern.AnimalMethodFactory;
import com.ddream.pattern.AnimalStaticFactory;
import com.ddream.pattern.CatFactory;
import com.ddream.pattern.CatSinglePattern;
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
