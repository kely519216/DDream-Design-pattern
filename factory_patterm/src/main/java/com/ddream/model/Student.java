package com.ddream.model;

/**
 * Description
 *
 * @author ml_yo
 * @classname Student
 * @date 2020/6/30 11:18
 */
public class Student {

    private Student() {
    }

    /**
     * 此处使用一个内部类来维护单例JVM,JVM在类加载的时候，是互斥的.借此保证线程安全问题
     */
    private static class singleFactory {
        private static Student student = new Student();
    }

    /**
     * 获取实例
     */
    public static Student getSingleStudent() {
        return singleFactory.student;
    }

    /**
     * run方法
     */
    public void run() {
        System.out.println("人人人");
    }
}
