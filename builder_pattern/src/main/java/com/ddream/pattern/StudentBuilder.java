package com.ddream.pattern;

import com.ddream.model.Student;
import lombok.Data;

/**
 * Description 学生构建类
 *
 * @author ml_yo
 * @classname StudentBuilder
 * @date 2020/7/1 11:49
 */
@Data
public class StudentBuilder {

    //需要构建的对象
    private Student student = new Student();

    public StudentBuilder id(int id) {
        student.setId(id);
        return this;
    }

    public StudentBuilder name(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder age(Integer age) {
        student.setAge(age);
        return this;
    }

    public Student build() {
        return student;
    }
}
