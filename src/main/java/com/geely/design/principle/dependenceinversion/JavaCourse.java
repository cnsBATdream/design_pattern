package com.geely.design.principle.dependenceinversion;

public class JavaCourse implements ICource {

    @Override
    public void studyCourse() {
        System.out.println("我在学习Java");
    }
}
