package com.ddream;

import com.ddream.model.Student;
import com.ddream.pattern.StudentBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = BuilderPattermApplication.class)
class BuilderPatternApplicationTests {

    @Test
    void contextLoad() {
    }

    /**
     * 简单构建者模式
     */
    @Test
    void easyBuilderTest() {
        Student student = new StudentBuilder().age(1).name("小东").id(3).build();
        System.out.println(student.toString());
    }


}
