package com.geely.design.principle.dependenceinversion;

public class FECourse implements ICource {
    @Override
    public void studyCourse() {
        System.out.println("我在学习前端");
    }
}
